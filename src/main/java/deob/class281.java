package deob;

@ObfuscatedName("jr")
public class class281 implements Comparable {

    @ObfuscatedName("jr.p")
    public String field3700;

    @ObfuscatedName("jr.i")
    public String field3701;

    public class281(String arg0, class314 arg1) {
        this.field3700 = arg0;
        this.field3701 = class291.method2910(arg0, arg1);
    }

    @ObfuscatedName("jr.p(I)Ljava/lang/String;")
    public String method4758() {
        return this.field3700;
    }

    @ObfuscatedName("jr.i(I)Z")
    public boolean method4753() {
        return this.field3701 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class281) {
            return false;
        }
        class281 var2 = (class281) arg0;
        if (this.field3701 == null) {
            return var2.field3701 == null;
        } else if (var2.field3701 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3701.equals(var2.field3701);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3701 == null ? 0 : this.field3701.hashCode();
    }

    public String toString() {
        return this.method4758();
    }

    @ObfuscatedName("jr.w(Ljr;I)I")
    public int method4756(class281 arg0) {
        if (this.field3701 == null) {
            return arg0.field3701 == null ? 0 : 1;
        } else if (arg0.field3701 == null) {
            return -1;
        } else {
            return this.field3701.compareTo(arg0.field3701);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4756((class281) arg0);
    }
}
