package com.example.domain;

import java.util.Objects;

public class KeyValue {

    private String key;
    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyValue that = (KeyValue) o;
        return Objects.equals(key, that.key) &&
            Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "KeyValue{" +
            "key='" + key + '\'' +
            ", value='" + value + '\'' +
            '}';
    }
}
