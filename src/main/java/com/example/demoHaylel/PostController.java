package com.example.demoHaylel;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

      @RestController
    public class PostController {

    public String Daddy;
    public String Mommy;
        List<String> strings= new ArrayList<String>();
        List<Mommy> mom = new ArrayList<Mommy>();
         List<Daddy> dad = new ArrayList<Daddy>();
        /*  public static void main(String[] args) {


        System.out.println("Hello pretty");

       // Daddy daddyName = new Daddy();   //class 1
        //Mommy mommyName = new Mommy();  // class 2
          //System.out.println(daddyName);
         // System.out.println(mommyName);

            // Calling those methods below
        //    Daddy2("alemuu", "mohabaw","demelashe");

         //   new Daddy("amera", "abere", "alebel" );
       List<String> strings = new ArrayList<String>();


        }
*/
       // default method

          @RequestMapping(value = "/", method = RequestMethod.POST)
        public String test() {
        return "I got a software job";

     }
       // first page
        @GetMapping(value = "/strings")
        public List<String> getStrings(){
        return strings;
        }
        //first page

        @PostMapping(value="/strings")
        public String addStrings (@RequestBody String string){
           // String string= "test";
         strings.add(string);
            return string;
        }
       // Mommy, mommies, mommy
        @GetMapping(value = "/ mom")
        @ResponseStatus(HttpStatus.OK)
        public List<Daddy> getDad(){
            return dad;
        }

        @PostMapping(value="/ mom")
        @ResponseStatus(HttpStatus.CREATED)
        public Mommy addDad (@RequestBody Mommy mommy){
            // String string= "test";
           mom.add(mommy);

            return mommy;

        }

        @GetMapping(value = "/ dad")
        @ResponseStatus(HttpStatus.OK)
        public List<Daddy> getDaddy(){
            return dad;
        }



        @PostMapping(value="/ dad")
        @ResponseStatus(HttpStatus.CREATED)
        public com.example.demoHaylel.Daddy addDaddis (@RequestBody Daddy daddy){
            // String string= "test";
            dad.add(daddy);

            return daddy;

        }

    }



















