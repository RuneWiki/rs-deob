package deob;

@ObfuscatedName("jv")
public class class284 implements Comparable {

    @ObfuscatedName("jv.q")
    public String field3648;

    @ObfuscatedName("jv.w")
    public String field3647;

    public class284(String arg0, class339 arg1) {
        this.field3648 = arg0;
        this.field3647 = class340.method4896(arg0, arg1);
    }

    @ObfuscatedName("jv.q(B)Ljava/lang/String;")
    public String method4790() {
        return this.field3648;
    }

    @ObfuscatedName("jv.w(B)Z")
    public boolean method4798() {
        return this.field3647 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class284) {
            return false;
        }
        class284 var2 = (class284) arg0;
        if (this.field3647 == null) {
            return var2.field3647 == null;
        } else if (var2.field3647 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field3647.equals(var2.field3647);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field3647 == null ? 0 : this.field3647.hashCode();
    }

    public String toString() {
        return this.method4790();
    }

    @ObfuscatedName("jv.e(Ljv;B)I")
    public int method4791(class284 arg0) {
        if (this.field3647 == null) {
            return arg0.field3647 == null ? 0 : 1;
        } else if (arg0.field3647 == null) {
            return -1;
        } else {
            return this.field3647.compareTo(arg0.field3647);
        }
    }

    public int compareTo(Object arg0) {
        return this.method4791((class284) arg0);
    }
}
