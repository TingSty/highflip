package com.baidu.highflip.core.entity.dag.common;

import java.util.Map;
import java.util.TreeMap;

public class AttributeObject {

    AttributeObject parent = null;

    Map<String, Object> attributes = new TreeMap<String, Object>();

    public void setParent(AttributeObject parent){
        this.parent = parent;
    }

    public AttributeObject getParent(){
        return parent;
    }

    public Object getAttribute(String name, Object defaultValue){
        return attributes.getOrDefault(name, defaultValue);
    }

    public void setAttribute(String name, Object attr){
        attributes.put(name, attr);
    }

    public void setAttributes(Map<String, Object> attrs){
        attributes.putAll(attrs);
    }

    public Object getForward(String name, Object defaultValue){

        Object current = getAttribute(name, null);
        if (current != null){
            return current;
        }

        AttributeObject parent = getParent();
        if (parent != null){
            return parent.getForward(name, defaultValue);
        }

        return defaultValue;
    }
}
