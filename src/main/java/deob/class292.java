package deob;

@ObfuscatedName("km")
public class class292 implements Comparable {

    @ObfuscatedName("km.w")
    public String field3662;

    @ObfuscatedName("km.m")
    public String field3661;

    public class292(String arg0, class323 arg1) {
        this.field3662 = arg0;
        this.field3661 = class303.method2685(arg0, arg1);
    }

    @ObfuscatedName("km.w(B)Ljava/lang/String;")
    public String method5048() {
        return this.field3662;
    }

    @ObfuscatedName("km.m(I)Z")
    public boolean method5049() {
        return this.field3661 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class292) {
            return false;
        }
        class292 var2 = (class292) arg0;
        if (this.field3661 == null) {
            return var2.field3661 == null;
        } else if (var2.field3661 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3661.equals(var2.field3661);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3661 == null ? 0 : this.field3661.hashCode();
    }

    public String toString() {
        return this.method5048();
    }

    @ObfuscatedName("km.q(Lkm;I)I")
    public int method5050(class292 arg0) {
        if (this.field3661 == null) {
            return arg0.field3661 == null ? 0 : 1;
        } else if (arg0.field3661 == null) {
            return -1;
        } else {
            return this.field3661.compareTo(arg0.field3661);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5050((class292) arg0);
    }
}
