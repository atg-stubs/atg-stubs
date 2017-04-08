package atg.repository;

import atg.beans.DynamicPropertyDescriptor;
import io.github.atg.stubs.NotImplementedException;

public class RepositoryPropertyDescriptor
    extends DynamicPropertyDescriptor
    implements Cloneable {


    //TODO: doc what happens if the default value IS null?
    //TODO: verify returning null means what the docs say...maybe 'null'
    /**
     * @return the default value of the property as a string. null if there is no default value
     */
    public String getDefaultValueString(){
        throw new NotImplementedException("getDefaultValueString", this.getClass());
    }

    /**
     * @return true if this property can be queried, false if it can not
     */
    public boolean isQueryable(){
        throw new NotImplementedException("isQueryable", this.getClass());
    }

    /**
     * @return true if this property is derived, false if it is not
     */
    public boolean isDerived(){
        throw new NotImplementedException("isDerived", this.getClass());
    }

}
