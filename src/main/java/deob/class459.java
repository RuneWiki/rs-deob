package deob;

@ObfuscatedName("qb")
public class class459 implements Comparable {

    @ObfuscatedName("qb.v")
    public String field4749;

    @ObfuscatedName("qb.c")
    public String field4750;

    public class459(String arg0) {
        this.field4749 = arg0;
        this.field4750 = class423.method3555(arg0, class422.field4550);
    }

    public class459(String arg0, class422 arg1) {
        this.field4749 = arg0;
        this.field4750 = class423.method3555(arg0, arg1);
    }

    @ObfuscatedName("qb.v(I)Ljava/lang/String;")
    public String method7528() {
        return this.field4749;
    }

    @ObfuscatedName("qb.c(B)Ljava/lang/String;")
    public String method7525() {
        return this.field4750;
    }

    @ObfuscatedName("qb.i(B)Z")
    public boolean method7524() {
        return this.field4750 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class459) {
            return false;
        }
        class459 var2 = (class459) arg0;
        if (this.field4750 == null) {
            return var2.field4750 == null;
        } else if (var2.field4750 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4750.equals(var2.field4750);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4750 == null ? 0 : this.field4750.hashCode();
    }

    public String toString() {
        return this.method7528();
    }

    @ObfuscatedName("qb.f(Lqb;I)I")
    public int method7527(class459 arg0) {
        if (this.field4750 == null) {
            return arg0.field4750 == null ? 0 : 1;
        } else if (arg0.field4750 == null) {
            return -1;
        } else {
            return this.field4750.compareTo(arg0.field4750);
        }
    }

    public int compareTo(Object arg0) {
        return this.method7527((class459) arg0);
    }
}
