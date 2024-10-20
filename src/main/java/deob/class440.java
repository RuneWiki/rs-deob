package deob;

@ObfuscatedName("po")
public class class440 implements Comparable {

    @ObfuscatedName("po.c")
    public String field4610;

    @ObfuscatedName("po.b")
    public String field4611;

    public class440(String arg0) {
        this.field4610 = arg0;
        this.field4611 = class401.method3086(arg0, class400.field4399);
    }

    public class440(String arg0, class400 arg1) {
        this.field4610 = arg0;
        this.field4611 = class401.method3086(arg0, arg1);
    }

    @ObfuscatedName("po.c(I)Ljava/lang/String;")
    public String method7187() {
        return this.field4610;
    }

    @ObfuscatedName("po.b(B)Ljava/lang/String;")
    public String method7202() {
        return this.field4611;
    }

    @ObfuscatedName("po.p(I)Z")
    public boolean method7189() {
        return this.field4611 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class440) {
            return false;
        }
        class440 var2 = (class440) arg0;
        if (this.field4611 == null) {
            return var2.field4611 == null;
        } else if (var2.field4611 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4611.equals(var2.field4611);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4611 == null ? 0 : this.field4611.hashCode();
    }

    public String toString() {
        return this.method7187();
    }

    @ObfuscatedName("po.m(Lpo;B)I")
    public int method7190(class440 arg0) {
        if (this.field4611 == null) {
            return arg0.field4611 == null ? 0 : 1;
        } else if (arg0.field4611 == null) {
            return -1;
        } else {
            return this.field4611.compareTo(arg0.field4611);
        }
    }

    public int compareTo(Object arg0) {
        return this.method7190((class440) arg0);
    }
}
