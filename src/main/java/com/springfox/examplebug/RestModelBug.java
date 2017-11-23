package com.springfox.examplebug;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestModelBug
{
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestBody @ModelAttribute Person person)
    {
        return "ok";
    }

    public class Person{
        String name;
        String surname;
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public String getSurname()
        {
            return surname;
        }
        public void setSurname(String surname)
        {
            this.surname = surname;
        }


    }
}
