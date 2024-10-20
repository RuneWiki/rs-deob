package deob;

@ObfuscatedName("jq")
public class class283 implements Comparable {

    @ObfuscatedName("jq.z")
    public String field3613;

    @ObfuscatedName("jq.n")
    public String field3611;

    public class283(String arg0, class338 arg1) {
        this.field3613 = arg0;
        this.field3611 = class339.method1042(arg0, arg1);
    }

    @ObfuscatedName("jq.z(I)Ljava/lang/String;")
    public String method4712() {
        return this.field3613;
    }

    @ObfuscatedName("jq.n(I)Z")
    public boolean method4699() {
        return this.field3611 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class283) {
            return false;
        }
        class283 var2 = (class283) arg0;
        if (this.field3611 == null) {
            return var2.field3611 == null;
        } else if (var2.field3611 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3611.equals(var2.field3611);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3611 == null ? 0 : this.field3611.hashCode();
    }

    public String toString() {
        return this.method4712();
    }

    @ObfuscatedName("jq.v(Ljq;I)I")
    public int method4700(class283 arg0) {
        if (this.field3611 == null) {
            return arg0.field3611 == null ? 0 : 1;
        } else if (arg0.field3611 == null) {
            return -1;
        } else {
            return this.field3611.compareTo(arg0.field3611);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4700((class283) arg0);
    }
}
