package deob;

@ObfuscatedName("vn")
public class class557 implements Comparable {

    @ObfuscatedName("vn.aq")
    public String field5356;

    @ObfuscatedName("vn.aw")
    public String field5357;

    public class557(String arg0) {
        this.field5356 = arg0;
        this.field5357 = class513.method3320(arg0, class512.field5086);
    }

    public class557(String arg0, class512 arg1) {
        this.field5356 = arg0;
        this.field5357 = class513.method3320(arg0, arg1);
    }

    @ObfuscatedName("vn.aq(B)Ljava/lang/String;")
    public String method9185() {
        return this.field5356;
    }

    @ObfuscatedName("vn.aw(I)Ljava/lang/String;")
    public String method9180() {
        return this.field5357;
    }

    @ObfuscatedName("vn.al(I)Z")
    public boolean method9181() {
        return this.field5357 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class557) {
            return false;
        }
        class557 var2 = (class557) arg0;
        if (this.field5357 == null) {
            return var2.field5357 == null;
        } else if (var2.field5357 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5357.equals(var2.field5357);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5357 == null ? 0 : this.field5357.hashCode();
    }

    public String toString() {
        return this.method9185();
    }

    @ObfuscatedName("vn.ai(Lvn;I)I")
    public int method9190(class557 arg0) {
        if (this.field5357 == null) {
            return arg0.field5357 == null ? 0 : 1;
        } else if (arg0.field5357 == null) {
            return -1;
        } else {
            return this.field5357.compareTo(arg0.field5357);
        }
    }

    public int compareTo(Object arg0) {
        return this.method9190((class557) arg0);
    }
}
