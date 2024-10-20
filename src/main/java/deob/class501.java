package deob;

@ObfuscatedName("tj")
public class class501 implements Comparable {

    @ObfuscatedName("tj.aj")
    public String field5051;

    @ObfuscatedName("tj.al")
    public String field5050;

    public class501(String arg0) {
        this.field5051 = arg0;
        this.field5050 = class459.method4821(arg0, class458.field4828);
    }

    public class501(String arg0, class458 arg1) {
        this.field5051 = arg0;
        this.field5050 = class459.method4821(arg0, arg1);
    }

    @ObfuscatedName("tj.aj(B)Ljava/lang/String;")
    public String method8490() {
        return this.field5051;
    }

    @ObfuscatedName("tj.al(I)Ljava/lang/String;")
    public String method8488() {
        return this.field5050;
    }

    @ObfuscatedName("tj.ac(B)Z")
    public boolean method8489() {
        return this.field5050 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class501) {
            return false;
        }
        class501 var2 = (class501) arg0;
        if (this.field5050 == null) {
            return var2.field5050 == null;
        } else if (var2.field5050 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5050.equals(var2.field5050);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5050 == null ? 0 : this.field5050.hashCode();
    }

    public String toString() {
        return this.method8490();
    }

    @ObfuscatedName("tj.ab(Ltj;B)I")
    public int method8502(class501 arg0) {
        if (this.field5050 == null) {
            return arg0.field5050 == null ? 0 : 1;
        } else if (arg0.field5050 == null) {
            return -1;
        } else {
            return this.field5050.compareTo(arg0.field5050);
        }
    }

    public int compareTo(Object arg0) {
        return this.method8502((class501) arg0);
    }
}
