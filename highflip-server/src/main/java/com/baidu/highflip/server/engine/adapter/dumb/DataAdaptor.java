package com.baidu.highflip.server.engine.adapter.dumb;

import com.baidu.highflip.core.entity.runtime.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Iterator;
import java.util.List;

@Slf4j
@Component
public class DataAdaptor implements com.baidu.highflip.core.engine.adaptor.DataAdaptor {

    public Data getData(String dataid) {

        return null;
    }

    public Iterator<List> readData(String dataid, long offset, long size) {
        return null;
    }

    public void createData(String name) {

    }

    public void writeData(String dataid, Iterator<List> data) {

    }
}
