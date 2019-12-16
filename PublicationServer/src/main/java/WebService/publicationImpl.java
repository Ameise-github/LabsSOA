package WebService;

import model.BooksEntity;
import model.MagazineEntity;
import model.PrintPublications;
import model.SchoolbookEntity;
import settingDB.databaseQueries;
import java.util.List;

import javax.jws.WebService;

@WebService(endpointInterface = "WebService.IPublication")
public class publicationImpl implements IPublication {

    final int VERSION = 1;
    private databaseQueries dbq = new databaseQueries();

    @Override
    public PrintPublications getAllEntity() {
        return dbq.getAllEntity();
    }

    @Override
    public List<BooksEntity> getAllBooks() {
        return dbq.getAllBooks();
    }

    @Override
    public List<MagazineEntity> getAllMagazine() {
        return dbq.getAllMagazine();
    }

    @Override
    public List<SchoolbookEntity> getAllSchoolbook() {
        return dbq.getAllSchoolbook();
    }

    @Override
    public List<BooksEntity> findBookEntity(String nameBook) {
        return dbq.findBookEntity(nameBook);
    }

    @Override
    public List<MagazineEntity> findMagazinEntity(String nameMagazine) {
        return dbq.findMagazinEntity(nameMagazine);
    }

    @Override
    public List<SchoolbookEntity> findSchoolBookEntity(String nameSchoolBook) {
        return dbq.findSchoolBookEntity(nameSchoolBook);
    }

    @Override
    public void addBookEntity(BooksEntity booksEntity) {
        dbq.addBookEntity(booksEntity);
    }

    @Override
    public void addMagazinEntity(MagazineEntity magazineEntity) {
        dbq.addMagazinEntity(magazineEntity);
    }

    @Override
    public void addSchoolBookEntity(SchoolbookEntity schoolbookEntity) {
        dbq.addSchoolBookEntity(schoolbookEntity);
    }

    @Override
    public void editBookEntity(BooksEntity booksEntity) {
        dbq.editBookEntity(booksEntity);
    }

    @Override
    public void editMagazinEntity(MagazineEntity magazineEntity) {
        dbq.editMagazinEntity(magazineEntity);
    }

    @Override
    public void editSchoolBookEntity(SchoolbookEntity schoolbookEntity) {
        dbq.editSchoolBookEntity(schoolbookEntity);
    }

    @Override
    public void deletedBookEntity(BooksEntity booksEntity) {
        dbq.deletedBookEntity(booksEntity);
    }

    @Override
    public void deletedMagazinEntity(MagazineEntity magazineEntity) {
        dbq.deletedMagazinEntity(magazineEntity);
    }

    @Override
    public void deletedSchoolBookEntity(SchoolbookEntity schoolbookEntity) {
        dbq.deletedSchoolBookEntity(schoolbookEntity);
    }

    @Override
    public int versionInfo(){
        return VERSION;
    }


    @Override
    public void sesionClose(){
        dbq.sesionClose();
    }
}
