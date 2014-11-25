package sk.upjs.ics.novotnyr.bookr;

import javax.sql.DataSource;
import org.hsqldb.jdbc.JDBCDataSource;
import org.springframework.jdbc.core.JdbcTemplate;


public enum BeanFactory {
    INSTANCE;
    
    private BookDao bookDao;
    
    private PublisherDao publisherDao;
    
    private JdbcTemplate jdbcTemplate;
    
    private ImageCoverService imageCoverService;
    
    public JdbcTemplate jdbcTemplate() {
        if(this.jdbcTemplate == null) {
            this.jdbcTemplate = new JdbcTemplate(dataSource());                
        }
        return this.jdbcTemplate;
    }   
    
    public BookDao bookDao() {
        if(this.bookDao == null) {
            this.bookDao = new HsqlBookDao(jdbcTemplate());
        }
        return this.bookDao;
    }

    public PublisherDao publisherDao() {
        if(this.publisherDao == null) {
            this.publisherDao = new HsqlPublisherDao(jdbcTemplate());
        }
        return this.publisherDao;
    }
    
    public ImageCoverService imageCoverService() {
        if(this.imageCoverService == null) {
            this.imageCoverService = new HsqlImageCoverService(jdbcTemplate());
        }
        return this.imageCoverService;
    }
    

    private DataSource dataSource() {
        JDBCDataSource dataSource = new JDBCDataSource();
        dataSource.setUrl("jdbc:hsqldb:hsql://localhost/bookr");
        dataSource.setUser("sa");
        dataSource.setPassword("");
        
        return dataSource;
    }
}
