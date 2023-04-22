package org.example.repository;

import org.example.model.DataPoint;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Scanner;

@Service
public class DataRepository implements Repository{

    @Value("${db.loc}")
    private String dbPath;

    private static DataPoint getObject(String [] row){
        return new DataPoint(row[1],Float.parseFloat(row[2]),Float.parseFloat(row[3]),Float.parseFloat(row[4]));
    }
    @Override
    public DataPoint getDataPoint(int id) {
        DataPoint dataPoint = null;
        File file = null;
        Scanner sc = null;
        try {
            file = new File(dbPath);
            sc = new Scanner(file);
            // to skip row definition
            sc.nextLine();
            while (sc.hasNextLine()) {
                String []row = sc.nextLine().split(",");
                if(id == Integer.parseInt(row[0])){
                    dataPoint = getObject(row);
                    break;
                }
            }
        } catch (Exception ex){}
        return dataPoint;
    }
}
