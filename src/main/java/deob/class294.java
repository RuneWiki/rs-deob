package deob;

@ObfuscatedName("ka")
public class class294 implements Comparable {

    @ObfuscatedName("ka.f")
    public String field3714;

    @ObfuscatedName("ka.l")
    public String field3712;

    public class294(String arg0, class331 arg1) {
        this.field3714 = arg0;
        this.field3712 = class305.method283(arg0, arg1);
    }

    @ObfuscatedName("ka.f(I)Ljava/lang/String;")
    public String method5130() {
        return this.field3714;
    }

    @ObfuscatedName("ka.l(S)Z")
    public boolean method5131() {
        return this.field3712 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class294) {
            return false;
        }
        class294 var2 = (class294) arg0;
        if (this.field3712 == null) {
            return var2.field3712 == null;
        } else if (var2.field3712 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3712.equals(var2.field3712);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3712 == null ? 0 : this.field3712.hashCode();
    }

    public String toString() {
        return this.method5130();
    }

    @ObfuscatedName("ka.w(Lka;I)I")
    public int method5149(class294 arg0) {
        if (this.field3712 == null) {
            return arg0.field3712 == null ? 0 : 1;
        } else if (arg0.field3712 == null) {
            return -1;
        } else {
            return this.field3712.compareTo(arg0.field3712);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5149((class294) arg0);
    }
}
