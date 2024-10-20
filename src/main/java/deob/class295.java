package deob;

@ObfuscatedName("kp")
public class class295 implements Comparable {

    @ObfuscatedName("kp.m")
    public String field3716;

    @ObfuscatedName("kp.f")
    public String field3715;

    public class295(String arg0, class335 arg1) {
        this.field3716 = arg0;
        this.field3715 = class306.method1091(arg0, arg1);
    }

    @ObfuscatedName("kp.m(I)Ljava/lang/String;")
    public String method5136() {
        return this.field3716;
    }

    @ObfuscatedName("kp.f(I)Z")
    public boolean method5133() {
        return this.field3715 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class295) {
            return false;
        }
        class295 var2 = (class295) arg0;
        if (this.field3715 == null) {
            return var2.field3715 == null;
        } else if (var2.field3715 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3715.equals(var2.field3715);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3715 == null ? 0 : this.field3715.hashCode();
    }

    public String toString() {
        return this.method5136();
    }

    @ObfuscatedName("kp.q(Lkp;B)I")
    public int method5134(class295 arg0) {
        if (this.field3715 == null) {
            return arg0.field3715 == null ? 0 : 1;
        } else if (arg0.field3715 == null) {
            return -1;
        } else {
            return this.field3715.compareTo(arg0.field3715);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5134((class295) arg0);
    }
}
