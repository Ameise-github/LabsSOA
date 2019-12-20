package WebService;

import model.BooksEntity;
import model.MagazineEntity;
import model.PrintPublications;
import model.SchoolbookEntity;

import javax.jws.WebMethod;
import javax.jws.WebService;

import java.util.List;

@WebService
public interface IPublication {
    @WebMethod
    PrintPublications getAllEntity();

    @WebMethod
    List<BooksEntity> getAllBooks();
    @WebMethod
    List<MagazineEntity> getAllMagazine();
    @WebMethod
    List<SchoolbookEntity> getAllSchoolbook();

    //region FindEntity
    @WebMethod
    List<BooksEntity> findBookEntity(String nameBook);
    @WebMethod
    List<MagazineEntity> findMagazinEntity(String nameMagazine);
    @WebMethod
    List<SchoolbookEntity> findSchoolBookEntity(String nameSchoolBook);
//endregion

//region addEntity
    @WebMethod
    void addBookEntity(BooksEntity booksEntity);
    @WebMethod
    void addMagazinEntity(MagazineEntity magazineEntity);
    @WebMethod
    void addSchoolBookEntity(SchoolbookEntity schoolbookEntity);
//endregion

//region editEntity
    @WebMethod
    void editBookEntity(BooksEntity booksEntity);
    @WebMethod
    void editMagazinEntity(MagazineEntity magazineEntity);
    @WebMethod
    void editSchoolBookEntity(SchoolbookEntity schoolbookEntity);
//endregion

//region deletedEntity
    @WebMethod
    void deletedBookEntity(BooksEntity booksEntity);
    @WebMethod
    void deletedMagazinEntity(MagazineEntity magazineEntity);
    @WebMethod
    void deletedSchoolBookEntity(SchoolbookEntity schoolbookEntity);
//endregion

    @WebMethod
    int versionInfo();
}
