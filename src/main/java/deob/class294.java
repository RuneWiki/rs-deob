package deob;

@ObfuscatedName("kh")
public class class294 implements Comparable {

    @ObfuscatedName("kh.f")
    public String field3708;

    @ObfuscatedName("kh.h")
    public String field3709;

    public class294(String arg0, class331 arg1) {
        this.field3708 = arg0;
        this.field3709 = class305.method3005(arg0, arg1);
    }

    @ObfuscatedName("kh.f(I)Ljava/lang/String;")
    public String method5059() {
        return this.field3708;
    }

    @ObfuscatedName("kh.h(I)Z")
    public boolean method5060() {
        return this.field3709 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class294) {
            return false;
        }
        class294 var2 = (class294) arg0;
        if (this.field3709 == null) {
            return var2.field3709 == null;
        } else if (var2.field3709 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3709.equals(var2.field3709);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3709 == null ? 0 : this.field3709.hashCode();
    }

    public String toString() {
        return this.method5059();
    }

    @ObfuscatedName("kh.e(Lkh;I)I")
    public int method5063(class294 arg0) {
        if (this.field3709 == null) {
            return arg0.field3709 == null ? 0 : 1;
        } else if (arg0.field3709 == null) {
            return -1;
        } else {
            return this.field3709.compareTo(arg0.field3709);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5063((class294) arg0);
    }
}
