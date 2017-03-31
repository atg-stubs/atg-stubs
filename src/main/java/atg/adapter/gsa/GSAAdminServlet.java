package atg.adapter.gsa;

import atg.nucleus.Nucleus;
import atg.nucleus.logging.ApplicationLogging;
import atg.repository.content.ContentRepositoryAdminServlet;

import javax.transaction.TransactionManager;

public class GSAAdminServlet extends ContentRepositoryAdminServlet {

    public GSAAdminServlet(
        Object service,
        ApplicationLogging logger,
        Nucleus nucleus,
        TransactionManager txManager
    ) {
        super(service, logger, nucleus, txManager);
    }
}
