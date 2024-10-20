package org.bouncycastle.crypto.params;

public class ElGamalKeyParameters extends AsymmetricKeyParameter {

    public ElGamalParameters params;

    public int ams() {
        return this.params == null ? 0 : this.params.hashCode();
    }

    public ElGamalParameters getParameters() {
        return this.params;
    }

    public int hashCode() {
        return this.params == null ? 0 : this.params.hashCode();
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof ElGamalKeyParameters)) {
            return false;
        }
        ElGamalKeyParameters var2 = (ElGamalKeyParameters) arg0;
        if (this.params == null) {
            return var2.getParameters() == null;
        } else {
            return this.params.equals(var2.getParameters());
        }
    }

    public ElGamalKeyParameters(boolean arg0, ElGamalParameters arg1) {
        super(arg0);
        this.params = arg1;
    }

    public boolean gj(Object arg0) {
        if (!(arg0 instanceof ElGamalKeyParameters)) {
            return false;
        }
        ElGamalKeyParameters var2 = (ElGamalKeyParameters) arg0;
        if (this.params == null) {
            return var2.getParameters() == null;
        } else {
            return this.params.equals(var2.getParameters());
        }
    }

    public int amf() {
        return this.params == null ? 0 : this.params.hashCode();
    }

    public int amb() {
        return this.params == null ? 0 : this.params.hashCode();
    }

    public int amg() {
        return this.params == null ? 0 : this.params.hashCode();
    }

    public int aml() {
        return this.params == null ? 0 : this.params.hashCode();
    }
}
