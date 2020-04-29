package pl.makuch.springdataresthal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.makuch.springdataresthal.model.Book;
import pl.makuch.springdataresthal.model.User;
import pl.makuch.springdataresthal.repository.UserRepo;
import javax.annotation.PostConstruct;

@Service
public class TestApp {

    private UserRepo userRepo;

    @Autowired
    public TestApp(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @PostConstruct
    public void addUsers(){

        Book book1 = new Book("Nineteen Eighty-Four,", "George Orwell");
        Book book2 = new Book ("Diary of a Nobody", "George and Weedon Grossmith");
        Book book3 = new Book ("His Dark Materials", "Philip Pullman");
        Book book4 = new Book ("Great Expectations", "Charles Dickens");
        Book book5 = new Book ("Robinson Crusoe", "Daniel Defoe");
        Book book6 = new Book ("Gulliver’s Travels", "Jonathan Swift");
        Book book7 = new Book ("Frankenstein", "Mary Shelley");
        Book book8 = new Book ("Alice’s Adventures in Wonderland", "Lewis Carrolle");
        Book book9 = new Book ("Ulysses", "James Joyce");

        User user1 = new User("John", 34);
        user1.getBookList().add(book1);
        user1.getBookList().add(book2);
        user1.getBookList().add(book3);

        User user2 = new User("Anna", 59);
        user2.getBookList().add(book4);

        User user3 = new User("Egual", 45);
        user3.getBookList().add(book5);
        user3.getBookList().add(book6);

        User user4 = new User("Fenix", 19);
        user4.getBookList().add(book7);
        user4.getBookList().add(book8);

        User user5 = new User("Alex", 21);
        user5.getBookList().add(book9);

        userRepo.save(user1);
        userRepo.save(user2);
        userRepo.save(user3);
        userRepo.save(user4);
        userRepo.save(user5);
    }


}
