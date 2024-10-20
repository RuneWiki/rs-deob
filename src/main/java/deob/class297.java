package deob;

@ObfuscatedName("ku")
public class class297 implements Comparable {

    @ObfuscatedName("ku.n")
    public String field3713;

    @ObfuscatedName("ku.h")
    public String field3715;

    public class297(String arg0, class334 arg1) {
        this.field3713 = arg0;
        this.field3715 = class308.method1091(arg0, arg1);
    }

    @ObfuscatedName("ku.n(B)Ljava/lang/String;")
    public String method5261() {
        return this.field3713;
    }

    @ObfuscatedName("ku.h(B)Z")
    public boolean method5264() {
        return this.field3715 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class297) {
            return false;
        }
        class297 var2 = (class297) arg0;
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
        return this.method5261();
    }

    @ObfuscatedName("ku.l(Lku;I)I")
    public int method5263(class297 arg0) {
        if (this.field3715 == null) {
            return arg0.field3715 == null ? 0 : 1;
        } else if (arg0.field3715 == null) {
            return -1;
        } else {
            return this.field3715.compareTo(arg0.field3715);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5263((class297) arg0);
    }
}
