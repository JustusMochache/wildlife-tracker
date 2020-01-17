package models;

import org.sql2o.Sql2o;

public class Database {

//    public static Sql2o sql2otest = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "moringaschool", "Access");
//
//    public static Sql2o sql2o = new Sql2o("jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:databases/wildlife.sql'","","");
//
//    public static Sql2o sql2otest2 = new Sql2o("jdbc:postgresql://localhost:5432/wildlife_tracker_test", "moringaschool", "Access");

    public static Sql2o sql2otest2 = new Sql2o("jdbc:postgresql://ec2-34-197-171-33.compute-1.amazonaws.com:5432/d7hf1l3lukbt70", "xucdbcqkqjogbx", "535b5fde0f4a65755b88c5b20305945f6b80f5d6dc23752577b6fab058604412");
}
