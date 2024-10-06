package com.spring.professional.exam.tutorial.module01.question29.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class SpringBeanObject {
    public SpringBeanObject() {
    }

    @Value("John")
    private String name;

    @Value("#{'Wall Street'.toUpperCase()}")
    private String streetName;

    @Value("true")
    private boolean accountExists;

    @Value("100")
    private int idNumber;

    @Value("#{5000 * 0.9}")
    private float accountBalance;

    @Value("${app.department.id}")
    private int departmentId;

    @Value("#{'${app.department.id}'.toUpperCase()}")
    private String departmentName;

    private String managerName;

    private String supportContactMail;

    private String supportPhone;

    private String supportAddress;

    @Value("${app.dependent.departments}")
    private String[] dependentDepartments;

    @Value("${app.cases.id}")
    private List<Integer> casesIds;

    @Value("${app.cases.set}")
    private Set<String> casesSet;

    @Value("#{${app.cases.map}}")
    private Map<String, Integer> casesMap;

    public SpringBeanObject(@Value("#{'${app.manager.name}'.toUpperCase()}") String managerName) {
        this.managerName = managerName;
    }

    @Value("${app.support.contact}")
    public void setSupportContactMail(String supportContactMail) {
        this.supportContactMail = supportContactMail;
    }

    @Autowired
    public void setSupportPhoneAndAddress(@Value("${app.support.phone}") String supportPhone, @Value("${app.support.address}") String supportAddress) {
        this.supportPhone = supportPhone;
        this.supportAddress = supportAddress;
    }

    public String getName() {
        return name;
    }

    public String getStreetName() {
        return streetName;
    }

    public boolean isAccountExists() {
        return accountExists;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public float getAccountBalance() {
        return accountBalance;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public String getManagerName() {
        return managerName;
    }

    public String getSupportContactMail() {
        return supportContactMail;
    }

    public String getSupportPhone() {
        return supportPhone;
    }

    public String getSupportAddress() {
        return supportAddress;
    }

    public String[] getDependentDepartments() {
        return dependentDepartments;
    }

    public List<Integer> getCasesIds() {
        return casesIds;
    }

    public Set<String> getCasesSet() {
        return casesSet;
    }

    public Map<String, Integer> getCasesMap() {
        return casesMap;
    }

    public static void main(String[] args) {
        SpringBeanObject object = new SpringBeanObject();
        System.out.println("getName = " + object.getName());
        /*System.out.println("getStreetName = " + object.getStreetName());
        System.out.println("isAccountExists = " + object.isAccountExists());
        System.out.println("getIdNumber = " + object.getIdNumber());
        System.out.println("getAccountBalance = " + object.getAccountBalance());
        System.out.println("getDepartmentId = " + object.getDepartmentId());
        System.out.println("getDepartmentName = " + object.getDepartmentName());
        System.out.println("getManagerName = " + object.getManagerName());
        System.out.println("getSupportContactMail = " + object.getSupportContactMail());
        System.out.println("getSupportPhone = " + object.getSupportPhone());
        System.out.println("getSupportAddress = " + object.getSupportAddress());
        System.out.println("getDependentDepartments = " + Arrays.toString(object.getDependentDepartments()));
        System.out.println("getCasesIds = " + object.getCasesIds());
        System.out.println("getCasesSet = " + object.getCasesSet());
        System.out.println("getCasesMap = " + object.getCasesMap());
*/

    }
}
