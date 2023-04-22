package org.example.repository;

import org.example.model.DataPoint;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DataRepository implements Repository{

    static List<DataPoint> list = new ArrayList<DataPoint>();
    public DataRepository() {
        list.add(new DataPoint("LocA", (float)12, (float)123, (float)430));
        list.add(new DataPoint("LocB", (float)62, (float)133, (float)240));
        list.add(new DataPoint("LocC", (float)75, (float)143, (float)340));
        list.add(new DataPoint("LocD", (float)34, (float)553, (float)574));
    }
    @Override
    public DataPoint getDataPoint(int id) {
        return list.get(id);
    }
}
