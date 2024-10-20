package org.bouncycastle.crypto.params;

public class ElGamalKeyParameters extends AsymmetricKeyParameter {

    public ElGamalParameters params;

    public boolean bo(Object arg0) {
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

    public boolean be(Object arg0) {
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

    public boolean bf(Object arg0) {
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

    public int afi() {
        return this.params == null ? 0 : this.params.hashCode();
    }

    public ElGamalKeyParameters(boolean arg0, ElGamalParameters arg1) {
        super(arg0);
        this.params = arg1;
    }
}
