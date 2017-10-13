package com.codingSchool.bookstore.Controllers;

import com.codingSchool.bookstore.Model.SearchForm;
import com.codingSchool.bookstore.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SearchController {

    private static final String SEARCH_FORM = "searchForm";
    public static final String BOOKLIST = "books";

    @Autowired
    private BookService bookService;

    //Sample search page to demonstrate functionality. Ignore for now.
    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String login(Model model) {
        model.addAttribute(SEARCH_FORM, new SearchForm());
        return "book";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String search(@ModelAttribute(SEARCH_FORM) SearchForm searchForm,
                         HttpSession session,
                         RedirectAttributes redirectAttributes) {

        List bookList = bookService.finByTitle(searchForm.getTitle());

        if (bookList.isEmpty()) {
            redirectAttributes.addFlashAttribute("errorMessage", "No books found");
        }

        redirectAttributes.addFlashAttribute(BOOKLIST, bookList);
        return "redirect:/search";
    }


    @RequestMapping(value = "/search/all", method = RequestMethod.GET)
    public String search(RedirectAttributes redirectAttributes) {
        List<Book> bookList = bookService.findAll();

        if (bookList.isEmpty()) {
            redirectAttributes.addFlashAttribute("errorMessage", "No books found");
        }

        redirectAttributes.addFlashAttribute(BOOKLIST, bookList);

        return "redirect:/search";
    }
}


