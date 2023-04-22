package org.example.repository;

import org.example.model.DataPoint;
import org.springframework.stereotype.Service;

public interface Repository{
    public DataPoint getDataPoint(int id);
}
