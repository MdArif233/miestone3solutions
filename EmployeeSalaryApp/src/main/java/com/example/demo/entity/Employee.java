package com.example.demo.entity;



public class Employee {

	private double basicSalary;
	private double hra;
	private double dra;
	private double pf;
	private double grossSalary;
	private double netSalary;
	private double annualPackage;
	
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDra() {
		return dra;
	}
	public void setDra(double dra) {
		this.dra = dra;
	}
	public double getPf() {
		return pf;
	}
	public void setPf(double pf) {
		this.pf = pf;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getNetSalary() {
		return netSalary;
	}
	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}
	
	
	
	
	public double getAnnualPackage() {
		return annualPackage;
	}
	public void setAnnualPackage(double annualPackage) {
		this.annualPackage = annualPackage;
	}
	
	
	public double getGross() {
		
		hra = (basicSalary*10)/100;
		dra = (basicSalary*10)/100;
		
		grossSalary = basicSalary+ hra + dra;
		
		return grossSalary;
		
	}
	
	public double getNetSal() {
		
	     pf = (basicSalary*10)/100;
	     
	     netSalary = grossSalary- pf;
	     
	     return netSalary;
	}
	
	
	public double getAnnualPack() {
		
		annualPackage = netSalary*12;
		
		return annualPackage;
	}
	
	
	
	
	
}
