package deob;

@ObfuscatedName("km")
public class class294 implements Comparable {

    @ObfuscatedName("km.f")
    public String field3655;

    @ObfuscatedName("km.b")
    public String field3658;

    public class294(String arg0, class349 arg1) {
        this.field3655 = arg0;
        this.field3658 = class350.method5540(arg0, arg1);
    }

    @ObfuscatedName("km.f(I)Ljava/lang/String;")
    public String method4912() {
        return this.field3655;
    }

    @ObfuscatedName("km.b(I)Z")
    public boolean method4902() {
        return this.field3658 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class294) {
            return false;
        }
        class294 var2 = (class294) arg0;
        if (this.field3658 == null) {
            return var2.field3658 == null;
        } else if (var2.field3658 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3658.equals(var2.field3658);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3658 == null ? 0 : this.field3658.hashCode();
    }

    public String toString() {
        return this.method4912();
    }

    @ObfuscatedName("km.l(Lkm;I)I")
    public int method4904(class294 arg0) {
        if (this.field3658 == null) {
            return arg0.field3658 == null ? 0 : 1;
        } else if (arg0.field3658 == null) {
            return -1;
        } else {
            return this.field3658.compareTo(arg0.field3658);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4904((class294) arg0);
    }
}
