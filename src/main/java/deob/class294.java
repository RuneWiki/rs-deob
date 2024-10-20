package deob;

@ObfuscatedName("kg")
public class class294 implements Comparable {

    @ObfuscatedName("kg.g")
    public String field3722;

    @ObfuscatedName("kg.r")
    public String field3721;

    public class294(String arg0, class331 arg1) {
        this.field3722 = arg0;
        this.field3721 = class305.method4374(arg0, arg1);
    }

    @ObfuscatedName("kg.g(I)Ljava/lang/String;")
    public String method5269() {
        return this.field3722;
    }

    @ObfuscatedName("kg.r(I)Z")
    public boolean method5270() {
        return this.field3721 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class294) {
            return false;
        }
        class294 var2 = (class294) arg0;
        if (this.field3721 == null) {
            return var2.field3721 == null;
        } else if (var2.field3721 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3721.equals(var2.field3721);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3721 == null ? 0 : this.field3721.hashCode();
    }

    public String toString() {
        return this.method5269();
    }

    @ObfuscatedName("kg.e(Lkg;I)I")
    public int method5273(class294 arg0) {
        if (this.field3721 == null) {
            return arg0.field3721 == null ? 0 : 1;
        } else if (arg0.field3721 == null) {
            return -1;
        } else {
            return this.field3721.compareTo(arg0.field3721);
        }
    }

    public int compareTo(Object arg0) {
        return this.method5273((class294) arg0);
    }
}
