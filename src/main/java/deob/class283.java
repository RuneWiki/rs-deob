package deob;

@ObfuscatedName("jb")
public class class283 implements Comparable {

    @ObfuscatedName("jb.u")
    public String field3627;

    @ObfuscatedName("jb.f")
    public String field3625;

    public class283(String arg0, class338 arg1) {
        this.field3627 = arg0;
        this.field3625 = class339.method3837(arg0, arg1);
    }

    @ObfuscatedName("jb.u(B)Ljava/lang/String;")
    public String method4837() {
        return this.field3627;
    }

    @ObfuscatedName("jb.f(B)Z")
    public boolean method4835() {
        return this.field3625 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class283) {
            return false;
        }
        class283 var2 = (class283) arg0;
        if (this.field3625 == null) {
            return var2.field3625 == null;
        } else if (var2.field3625 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3625.equals(var2.field3625);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3625 == null ? 0 : this.field3625.hashCode();
    }

    public String toString() {
        return this.method4837();
    }

    @ObfuscatedName("jb.b(Ljb;I)I")
    public int method4848(class283 arg0) {
        if (this.field3625 == null) {
            return arg0.field3625 == null ? 0 : 1;
        } else if (arg0.field3625 == null) {
            return -1;
        } else {
            return this.field3625.compareTo(arg0.field3625);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4848((class283) arg0);
    }
}
