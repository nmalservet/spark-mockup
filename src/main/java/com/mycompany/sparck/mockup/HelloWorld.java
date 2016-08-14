/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sparck.mockup;

import static spark.Spark.*;

/**
 *
 * @author nicolas
 */


public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Yes, it's works");
    }
}
