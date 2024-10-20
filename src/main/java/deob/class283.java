package deob;

@ObfuscatedName("jx")
public class class283 implements Comparable {

    @ObfuscatedName("jx.s")
    public String field3604;

    @ObfuscatedName("jx.j")
    public String field3603;

    public class283(String arg0, class338 arg1) {
        this.field3604 = arg0;
        this.field3603 = class339.method3062(arg0, arg1);
    }

    @ObfuscatedName("jx.s(B)Ljava/lang/String;")
    public String method4767() {
        return this.field3604;
    }

    @ObfuscatedName("jx.j(B)Z")
    public boolean method4768() {
        return this.field3603 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class283) {
            return false;
        }
        class283 var2 = (class283) arg0;
        if (this.field3603 == null) {
            return var2.field3603 == null;
        } else if (var2.field3603 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3603.equals(var2.field3603);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3603 == null ? 0 : this.field3603.hashCode();
    }

    public String toString() {
        return this.method4767();
    }

    @ObfuscatedName("jx.i(Ljx;I)I")
    public int method4770(class283 arg0) {
        if (this.field3603 == null) {
            return arg0.field3603 == null ? 0 : 1;
        } else if (arg0.field3603 == null) {
            return -1;
        } else {
            return this.field3603.compareTo(arg0.field3603);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4770((class283) arg0);
    }
}
