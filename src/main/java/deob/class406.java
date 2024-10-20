package deob;

@ObfuscatedName("oh")
public class class406 implements Comparable {

    @ObfuscatedName("oh.s")
    public String field4312;

    @ObfuscatedName("oh.t")
    public String field4311;

    public class406(String arg0) {
        this.field4312 = arg0;
        this.field4311 = class368.method2148(arg0, class367.field4123);
    }

    public class406(String arg0, class367 arg1) {
        this.field4312 = arg0;
        this.field4311 = class368.method2148(arg0, arg1);
    }

    @ObfuscatedName("oh.s(I)Ljava/lang/String;")
    public String method6520() {
        return this.field4312;
    }

    @ObfuscatedName("oh.t(B)Ljava/lang/String;")
    public String method6521() {
        return this.field4311;
    }

    @ObfuscatedName("oh.v(I)Z")
    public boolean method6522() {
        return this.field4311 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class406) {
            return false;
        }
        class406 var2 = (class406) arg0;
        if (this.field4311 == null) {
            return var2.field4311 == null;
        } else if (var2.field4311 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4311.equals(var2.field4311);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4311 == null ? 0 : this.field4311.hashCode();
    }

    public String toString() {
        return this.method6520();
    }

    @ObfuscatedName("oh.j(Loh;I)I")
    public int method6523(class406 arg0) {
        if (this.field4311 == null) {
            return arg0.field4311 == null ? 0 : 1;
        } else if (arg0.field4311 == null) {
            return -1;
        } else {
            return this.field4311.compareTo(arg0.field4311);
        }
    }

    public int compareTo(Object arg0) {
        return this.method6523((class406) arg0);
    }
}
