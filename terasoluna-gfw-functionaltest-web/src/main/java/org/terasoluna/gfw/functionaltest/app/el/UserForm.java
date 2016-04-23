/*
 * Copyright (C) 2013-2016 NTT DATA Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.terasoluna.gfw.functionaltest.app.el;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class UserForm implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Integer age;

    private UserFormItem item;

    public UserForm(String name, Integer age, UserFormItem item) {
        this.name = name;
        this.age = age;
        this.item = item;
    }

    public UserForm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public UserFormItem getItem() {
        return item;
    }

    public void setItem(UserFormItem item) {
        this.item = item;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
