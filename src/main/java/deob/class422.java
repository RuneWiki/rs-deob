package deob;

@ObfuscatedName("pm")
public class class422 implements Comparable {

    @ObfuscatedName("pm.l")
    public String field4426;

    @ObfuscatedName("pm.q")
    public String field4425;

    public class422(String arg0) {
        this.field4426 = arg0;
        this.field4425 = class384.method2215(arg0, class383.field4220);
    }

    public class422(String arg0, class383 arg1) {
        this.field4426 = arg0;
        this.field4425 = class384.method2215(arg0, arg1);
    }

    @ObfuscatedName("pm.l(B)Ljava/lang/String;")
    public String method6815() {
        return this.field4426;
    }

    @ObfuscatedName("pm.q(I)Ljava/lang/String;")
    public String method6816() {
        return this.field4425;
    }

    @ObfuscatedName("pm.f(I)Z")
    public boolean method6817() {
        return this.field4425 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class422) {
            return false;
        }
        class422 var2 = (class422) arg0;
        if (this.field4425 == null) {
            return var2.field4425 == null;
        } else if (var2.field4425 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4425.equals(var2.field4425);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4425 == null ? 0 : this.field4425.hashCode();
    }

    public String toString() {
        return this.method6815();
    }

    @ObfuscatedName("pm.j(Lpm;I)I")
    public int method6829(class422 arg0) {
        if (this.field4425 == null) {
            return arg0.field4425 == null ? 0 : 1;
        } else if (arg0.field4425 == null) {
            return -1;
        } else {
            return this.field4425.compareTo(arg0.field4425);
        }
    }

    public int compareTo(Object arg0) {
        return this.method6829((class422) arg0);
    }
}
