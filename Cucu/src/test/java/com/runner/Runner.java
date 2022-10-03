package com.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(features =("src/test/resources"),glue =("com.stepdefinition")

//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//		"html:target/cucumber-reports/reports1.html"}
		)



public class Runner {

}
