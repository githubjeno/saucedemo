package com.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass;
import com.helper.File_Reader;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\ashin\\eclipse-workspace\\saucedemo\\src\\test\\java\\com\\feature\\orderproduct.feature",
                   dryRun=false, glue="com.stepdefinition",plugin={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class Sauce_Demo_runner {
 
	@BeforeClass
	public static void browserlaunch() throws IOException
	{
		BaseClass.browserLaunch(File_Reader.getInstance().getbrowsername());
	}
}
