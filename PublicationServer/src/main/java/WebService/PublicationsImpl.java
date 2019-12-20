package WebService;

import model.BooksEntity;
import model.MagazineEntity;
import model.PrintPublications;
import model.SchoolbookEntity;
import database.PublicationsDB;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "WebService.IPublication")
public class PublicationsImpl implements IPublication {
    final int VERSION = 1;
    private PublicationsDB publications;

    public PublicationsImpl(PublicationsDB db) {
        publications = db;
    }

    @Override
    public PrintPublications getAllEntity() {
        return publications.getAllEntity();
    }

    @Override
    public List<BooksEntity> getAllBooks() {
        return publications.getAllBooks();
    }

    @Override
    public List<MagazineEntity> getAllMagazine() {
        return publications.getAllMagazine();
    }

    @Override
    public List<SchoolbookEntity> getAllSchoolbook() {
        return publications.getAllSchoolbook();
    }

    @Override
    public List<BooksEntity> findBookEntity(String nameBook) {
        return publications.findBookEntity(nameBook);
    }

    @Override
    public List<MagazineEntity> findMagazinEntity(String nameMagazine) {
        return publications.findMagazinEntity(nameMagazine);
    }

    @Override
    public List<SchoolbookEntity> findSchoolBookEntity(String nameSchoolBook) {
        return publications.findSchoolBookEntity(nameSchoolBook);
    }

    @Override
    public void addBookEntity(BooksEntity booksEntity) {
        publications.addBookEntity(booksEntity);
    }

    @Override
    public void addMagazinEntity(MagazineEntity magazineEntity) {
        publications.addMagazinEntity(magazineEntity);
    }

    @Override
    public void addSchoolBookEntity(SchoolbookEntity schoolbookEntity) {
        publications.addSchoolBookEntity(schoolbookEntity);
    }

    @Override
    public void editBookEntity(BooksEntity booksEntity) {
        publications.editBookEntity(booksEntity);
    }

    @Override
    public void editMagazinEntity(MagazineEntity magazineEntity) {
        publications.editMagazinEntity(magazineEntity);
    }

    @Override
    public void editSchoolBookEntity(SchoolbookEntity schoolbookEntity) {
        publications.editSchoolBookEntity(schoolbookEntity);
    }

    @Override
    public void deletedBookEntity(BooksEntity booksEntity) {
        publications.deletedBookEntity(booksEntity);
    }

    @Override
    public void deletedMagazinEntity(MagazineEntity magazineEntity) {
        publications.deletedMagazinEntity(magazineEntity);
    }

    @Override
    public void deletedSchoolBookEntity(SchoolbookEntity schoolbookEntity) {
        publications.deletedSchoolBookEntity(schoolbookEntity);
    }

    @Override
    public int versionInfo(){
        return VERSION;
    }
}
