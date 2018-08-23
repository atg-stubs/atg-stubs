package atg.beans;

import io.github.atg.stubs.NotImplementedException;

public class DynamicPropertyDescriptor extends SerializableFeatureDescriptor {

    public void setPropertyType(Class t) {
        throw new NotImplementedException(
            "setPropertyType",
            this.getClass()
        );
    }

    public Class getPropertyType() {
        throw new NotImplementedException(
            "getPropertyType",
            this.getClass()
        );
    }


    public void setComponentPropertyType(Class t) {
        throw new NotImplementedException(
            "setComponentPropertyType",
            this.getClass()
        );
    }

    public Class getComponentPropertyType() {
        throw new NotImplementedException(
            "getComponentPropertyType",
            this.getClass()
        );
    }

}
