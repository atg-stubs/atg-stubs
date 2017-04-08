package atg.repository.content;

import atg.nucleus.Nucleus;
import atg.nucleus.ServiceAdminServlet;
import atg.nucleus.logging.ApplicationLogging;
import atg.repository.RepositoryItemImpl;
import io.github.atg.stubs.NotImplementedException;

import javax.transaction.TransactionManager;

public class ContentRepositoryAdminServlet
    extends ServiceAdminServlet
    implements RepositoryItemImpl.LinkGenerator {

    public ContentRepositoryAdminServlet(
        Object service,
        ApplicationLogging logger,
        Nucleus nucleus
    ) {
        super(service, nucleus);
    }

    public ContentRepositoryAdminServlet(
        Object service,
        ApplicationLogging logger,
        Nucleus nucleus,
        TransactionManager txManager
    ) {
        super(service, nucleus);
    }
}
