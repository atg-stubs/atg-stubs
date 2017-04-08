package atg.adapter.gsa;

import atg.repository.RepositoryPropertyDescriptor;
import io.github.atg.stubs.NotImplementedException;

import java.io.Serializable;

public class GSAPropertyDescriptor
    extends RepositoryPropertyDescriptor
    implements Serializable,
        Constants,
        Cloneable,
        Comparable {


    public int compareTo(Object that) {
        throw new NotImplementedException("compareTo", this.getClass());
    }
}
