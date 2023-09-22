package com.example.demo.classes;

import java.util.Date;

public record Car(Long id,
                  String Brand_name,
                  Integer year,
                  Boolean is_Mech,
                  Date date_rent) {}
