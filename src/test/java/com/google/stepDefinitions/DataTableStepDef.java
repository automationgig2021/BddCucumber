package com.google.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;

public class DataTableStepDef {
    @Given("my credentials")
    public void my_credentials(DataTable dataTable) {
        List<String> dataTablevalues = dataTable.row(0);
        System.out.println("DataTable value 1 is::" + dataTablevalues.get(0));
        System.out.println("DataTable value 2 is::" + dataTablevalues.get(1));
    }
}
