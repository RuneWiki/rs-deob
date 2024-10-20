package deob;

@ObfuscatedName("lw")
public class class327 implements Comparable {

    @ObfuscatedName("lw.f")
    public String field3862;

    @ObfuscatedName("lw.o")
    public String field3861;

    public class327(String arg0, class364 arg1) {
        this.field3862 = arg0;
        this.field3861 = class365.method5311(arg0, arg1);
    }

    @ObfuscatedName("lw.f(I)Ljava/lang/String;")
    public String method5200() {
        return this.field3862;
    }

    @ObfuscatedName("lw.o(I)Z")
    public boolean method5212() {
        return this.field3861 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class327) {
            return false;
        }
        class327 var2 = (class327) arg0;
        if (this.field3861 == null) {
            return var2.field3861 == null;
        } else if (var2.field3861 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3861.equals(var2.field3861);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3861 == null ? 0 : this.field3861.hashCode();
    }

    public String toString() {
        return this.method5200();
    }

    @ObfuscatedName("lw.u(Llw;I)I")
    public int method5203(class327 arg0) {
        if (this.field3861 == null) {
            return arg0.field3861 == null ? 0 : 1;
        } else if (arg0.field3861 == null) {
            return -1;
        } else {
            return this.field3861.compareTo(arg0.field3861);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5203((class327) arg0);
    }
}
