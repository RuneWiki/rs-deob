package org.bouncycastle.crypto.params;

public class DHKeyParameters extends AsymmetricKeyParameter {

    public DHParameters params;

    public DHParameters getParameters() {
        return this.params;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof DHKeyParameters)) {
            return false;
        }
        DHKeyParameters var2 = (DHKeyParameters) arg0;
        if (this.params == null) {
            return var2.getParameters() == null;
        } else {
            return this.params.equals(var2.getParameters());
        }
    }

    public int ake() {
        int var1 = this.isPrivate() ? 0 : 1;
        if (this.params != null) {
            var1 ^= this.params.hashCode();
        }
        return var1;
    }

    public int hashCode() {
        int var1 = this.isPrivate() ? 0 : 1;
        if (this.params != null) {
            var1 ^= this.params.hashCode();
        }
        return var1;
    }

    public boolean hd(Object arg0) {
        if (!(arg0 instanceof DHKeyParameters)) {
            return false;
        }
        DHKeyParameters var2 = (DHKeyParameters) arg0;
        if (this.params == null) {
            return var2.getParameters() == null;
        } else {
            return this.params.equals(var2.getParameters());
        }
    }

    public boolean hr(Object arg0) {
        if (!(arg0 instanceof DHKeyParameters)) {
            return false;
        }
        DHKeyParameters var2 = (DHKeyParameters) arg0;
        if (this.params == null) {
            return var2.getParameters() == null;
        } else {
            return this.params.equals(var2.getParameters());
        }
    }

    public boolean hn(Object arg0) {
        if (!(arg0 instanceof DHKeyParameters)) {
            return false;
        }
        DHKeyParameters var2 = (DHKeyParameters) arg0;
        if (this.params == null) {
            return var2.getParameters() == null;
        } else {
            return this.params.equals(var2.getParameters());
        }
    }

    public boolean hb(Object arg0) {
        if (!(arg0 instanceof DHKeyParameters)) {
            return false;
        }
        DHKeyParameters var2 = (DHKeyParameters) arg0;
        if (this.params == null) {
            return var2.getParameters() == null;
        } else {
            return this.params.equals(var2.getParameters());
        }
    }

    public int akk() {
        int var1 = this.isPrivate() ? 0 : 1;
        if (this.params != null) {
            var1 ^= this.params.hashCode();
        }
        return var1;
    }

    public DHKeyParameters(boolean arg0, DHParameters arg1) {
        super(arg0);
        this.params = arg1;
    }
}
