package com.guk;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(includeFieldNames = true)
public class User {
    private long id;
    private String email;
    private String name;
    private String occupation;
}
