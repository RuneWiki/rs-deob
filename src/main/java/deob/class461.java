package deob;

@ObfuscatedName("qv")
public class class461 implements Comparable {

    @ObfuscatedName("qv.o")
    public String field4806;

    @ObfuscatedName("qv.q")
    public String field4805;

    public class461(String arg0) {
        this.field4806 = arg0;
        this.field4805 = class425.method5138(arg0, class424.field4609);
    }

    public class461(String arg0, class424 arg1) {
        this.field4806 = arg0;
        this.field4805 = class425.method5138(arg0, arg1);
    }

    @ObfuscatedName("qv.o(I)Ljava/lang/String;")
    public String method7492() {
        return this.field4806;
    }

    @ObfuscatedName("qv.q(B)Ljava/lang/String;")
    public String method7510() {
        return this.field4805;
    }

    @ObfuscatedName("qv.l(B)Z")
    public boolean method7490() {
        return this.field4805 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class461) {
            return false;
        }
        class461 var2 = (class461) arg0;
        if (this.field4805 == null) {
            return var2.field4805 == null;
        } else if (var2.field4805 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4805.equals(var2.field4805);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4805 == null ? 0 : this.field4805.hashCode();
    }

    public String toString() {
        return this.method7492();
    }

    @ObfuscatedName("qv.k(Lqv;I)I")
    public int method7497(class461 arg0) {
        if (this.field4805 == null) {
            return arg0.field4805 == null ? 0 : 1;
        } else if (arg0.field4805 == null) {
            return -1;
        } else {
            return this.field4805.compareTo(arg0.field4805);
        }
    }

    public int compareTo(Object arg0) {
        return this.method7497((class461) arg0);
    }
}
