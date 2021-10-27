package org.oleg.bryl.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.oleg.bryl.model.Book;
import org.oleg.bryl.model.People;
import org.oleg.bryl.services.BookService;
import org.oleg.bryl.services.PeopleService;

import java.util.List;


@Controller
@RequestMapping("/admin")
public class AdminHomeController {

    @Autowired
    private BookService bookService;

    @Autowired
    private PeopleService peopleService;



    @RequestMapping
    public String adminHomePage() {
        return "admin";
    }

    @RequestMapping("/inventory")
    public String inventory(Model model) {
        List<Book> list_books = bookService.getBookList();
        model.addAttribute("list_books", list_books);

                return "InventoryBook";
    }

    @RequestMapping("/people")
    public String peopleManagement(Model model) {
        List<People> peopleList = peopleService.getAllPeoples();
        model.addAttribute("peopleList", peopleList);
        return "adminUsersList";
    }


}
