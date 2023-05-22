package luuthuyvi.demo.services;
import luuthuyvi.demo.entity.Book;
import luuthuyvi.demo.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;

    public void saveBook(Book book) {
        // Gọi phương thức save của BookRepository để lưu đầu sách vào cơ sở dữ liệu
        bookRepository.save(book);
    }
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }
    public Book getBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }
    public void addBook(Book book){
        bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
    public void updateBook(Book book){
        bookRepository.save(book);
    }
}