package com.kwazartArt.patterns.behavioral.iterator;

public class Employee implements Team {
    private int id;
    private String[] departments;

    public Employee(int id, String[] departments) {
        this.id = id;
        this.departments = departments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getDepartments() {
        return departments;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    @Override
    public Iterator getIterator() {
        return new DepartmentIterator();
    }

    private class DepartmentIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            if (index < departments.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return departments[index++];
        }
    }
}
