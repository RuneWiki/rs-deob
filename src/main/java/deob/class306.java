package deob;

@ObfuscatedName("kz")
public class class306 implements Comparable {

    @ObfuscatedName("kz.o")
    public String field3861;

    @ObfuscatedName("kz.k")
    public String field3860;

    public class306(String arg0, class336 arg1) {
        this.field3861 = arg0;
        this.field3860 = class316.method748(arg0, arg1);
    }

    @ObfuscatedName("kz.o(I)Ljava/lang/String;")
    public String method5015() {
        return this.field3861;
    }

    @ObfuscatedName("kz.k(B)Z")
    public boolean method5017() {
        return this.field3860 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class306) {
            return false;
        }
        class306 var2 = (class306) arg0;
        if (this.field3860 == null) {
            return var2.field3860 == null;
        } else if (var2.field3860 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3860.equals(var2.field3860);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3860 == null ? 0 : this.field3860.hashCode();
    }

    public String toString() {
        return this.method5015();
    }

    @ObfuscatedName("kz.t(Lkz;I)I")
    public int method5020(class306 arg0) {
        if (this.field3860 == null) {
            return arg0.field3860 == null ? 0 : 1;
        } else if (arg0.field3860 == null) {
            return -1;
        } else {
            return this.field3860.compareTo(arg0.field3860);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5020((class306) arg0);
    }
}
