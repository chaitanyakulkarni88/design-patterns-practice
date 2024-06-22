package com.solid.interfacesegregation;

public class BadDBDaoConnection implements BadDAOInterface {
    @Override
    public void openConnection() {

    }

    @Override
    public void createRecord() {

    }

    @Override
    public void openFile() {

        throw new UnsupportedOperationException("Open file Not supported");
    }

    @Override
    public void deleteRecord() {

    }
}
