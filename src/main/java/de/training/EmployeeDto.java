package de.training;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EmployeeDto {
    private Integer id;
    private String name;
    private Integer age;
    private String job;

 /*   public EmployeeDto(){
*//*        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.job = builder.job;*//*

    }*/

    /*public static class Builder{
        private Integer id;
        private String name;
        private Integer age;
        private String job;

        public Builder id (Integer id){
            this.id = id;
            return this;
        }

        public Builder name (String name){
            this.name = name;
            return this;
        }

        public Builder age (Integer age){
            this.age = age;
            return this;
        }

        public Builder job (String job){
            this.job = job;
            return this;
        }

        public EmployeeDto build(){
            return new EmployeeDto(this);
        }
    }*/
}
