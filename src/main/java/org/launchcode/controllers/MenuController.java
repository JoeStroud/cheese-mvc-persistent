package org.launchcode.controllers;

import org.launchcode.models.Cheese;
import org.launchcode.models.Menu;
import org.launchcode.models.data.CheeseDao;
import org.launchcode.models.data.MenuDao;
import org.launchcode.models.forms.AddMenuItemForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;


//add new MenuController Class
@Controller
@RequestMapping("menu")
public class MenuController {

<<<<<<< HEAD
    //Declare instances of dao
=======
//Declare instances of dao
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
    @Autowired
    private MenuDao menuDao;

    @Autowired
    private CheeseDao cheeseDao;

<<<<<<< HEAD
    //write index handler
=======
//write index handler
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
    @RequestMapping(value="")
    public String index(Model model) {

        model.addAttribute("title", "Menus");
        model.addAttribute("menus", menuDao.findAll());

        return "menu/index";
    }

<<<<<<< HEAD
    //Displays Add Menu
=======
//Displays Add Menu
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
    @RequestMapping(value="add", method= RequestMethod.GET)
    public String AddAMenu(Model model) {

        model.addAttribute(new Menu());
        model.addAttribute("title", "Add Menu");
        model.addAttribute("menus", menuDao.findAll());

        return "menu/add";

    }

    //Process Add Menu
    @RequestMapping(value="add", method=RequestMethod.POST)
    public String processAddMenu(Model model, @ModelAttribute @Valid Menu menu, Errors errors) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add Menu");
            return "menu/add";
        }

        menuDao.save(menu);
        return "redirect:view/" + menu.getId();
    }

    //the view menu
    @RequestMapping(value="view/{id}", method=RequestMethod.GET)
    public String viewMenu(Model model, @PathVariable int id) {
        Menu menu = menuDao.findOne(id);
        model.addAttribute("title", menu.getName());
        model.addAttribute("menu", menu);

        return "menu/view";
    }

<<<<<<< HEAD
    //add and render menu items
=======
//add and render menu items
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
    @RequestMapping(value="add-item/{id}", method=RequestMethod.GET)
    public String addItem(Model model, @PathVariable int id) {
        Menu menu = menuDao.findOne(id);
        model.addAttribute("title", "Add Item to Menu: " + menu.getName());
        AddMenuItemForm form = new AddMenuItemForm(menu, cheeseDao.findAll());
        model.addAttribute("form", form);
        return "menu/add-item";
    }

<<<<<<< HEAD
    //Process the form
=======
//Process the form
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
    @RequestMapping(value="add-item/{id}", method=RequestMethod.POST)
    public String addItem(Model model, @Valid AddMenuItemForm form, @PathVariable int id,
                          @RequestParam int cheeseId, Errors errors) {

        if (errors.hasErrors()) {
            return "menu/add-item";
        }

        Menu menu = menuDao.findOne(id);
        Cheese cheese = cheeseDao.findOne(cheeseId);

        menu.addItem(cheese);
        menuDao.save(menu);
        return "redirect:../view/" + menu.getId();
    }


<<<<<<< HEAD
}
=======
}
>>>>>>> 823740f1614c7c229110c6d1ce4873d84fbec13b
