package sk.upjs.ics.novotnyr.bookr;

import java.util.List;


public interface PublisherDao {

    List<Publisher> list();

    public void saveOrUpdate(Publisher publisher);

    public void delete(Publisher publisher);

}
