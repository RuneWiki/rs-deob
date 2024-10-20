package org.bouncycastle.crypto.params;

public class ElGamalKeyParameters extends AsymmetricKeyParameter {

    public ElGamalParameters params;

    public ElGamalParameters getParameters() {
        return this.params;
    }

    public int aja() {
        return this.params == null ? 0 : this.params.hashCode();
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

    public boolean gi(Object arg0) {
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

    public int ajj() {
        return this.params == null ? 0 : this.params.hashCode();
    }

    public int ajd() {
        return this.params == null ? 0 : this.params.hashCode();
    }

    public ElGamalKeyParameters(boolean arg0, ElGamalParameters arg1) {
        super(arg0);
        this.params = arg1;
    }
}
