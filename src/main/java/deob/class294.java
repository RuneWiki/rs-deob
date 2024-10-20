package deob;

@ObfuscatedName("ki")
public class class294 implements Comparable {

    @ObfuscatedName("ki.h")
    public String field3665;

    @ObfuscatedName("ki.v")
    public String field3663;

    public class294(String arg0, class349 arg1) {
        this.field3665 = arg0;
        this.field3663 = class350.method4156(arg0, arg1);
    }

    @ObfuscatedName("ki.h(I)Ljava/lang/String;")
    public String method4821() {
        return this.field3665;
    }

    @ObfuscatedName("ki.v(B)Z")
    public boolean method4822() {
        return this.field3663 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class294) {
            return false;
        }
        class294 var2 = (class294) arg0;
        if (this.field3663 == null) {
            return var2.field3663 == null;
        } else if (var2.field3663 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3663.equals(var2.field3663);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3663 == null ? 0 : this.field3663.hashCode();
    }

    public String toString() {
        return this.method4821();
    }

    @ObfuscatedName("ki.x(Lki;I)I")
    public int method4830(class294 arg0) {
        if (this.field3663 == null) {
            return arg0.field3663 == null ? 0 : 1;
        } else if (arg0.field3663 == null) {
            return -1;
        } else {
            return this.field3663.compareTo(arg0.field3663);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4830((class294) arg0);
    }
}
