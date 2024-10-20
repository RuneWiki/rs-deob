package deob;

@ObfuscatedName("qa")
public class class464 implements Comparable {

    @ObfuscatedName("qa.c")
    public String field4832;

    @ObfuscatedName("qa.v")
    public String field4831;

    public class464(String arg0) {
        this.field4832 = arg0;
        this.field4831 = class424.method2455(arg0, class423.field4617);
    }

    public class464(String arg0, class423 arg1) {
        this.field4832 = arg0;
        this.field4831 = class424.method2455(arg0, arg1);
    }

    @ObfuscatedName("qa.c(I)Ljava/lang/String;")
    public String method7617() {
        return this.field4832;
    }

    @ObfuscatedName("qa.v(I)Ljava/lang/String;")
    public String method7618() {
        return this.field4831;
    }

    @ObfuscatedName("qa.q(B)Z")
    public boolean method7619() {
        return this.field4831 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class464) {
            return false;
        }
        class464 var2 = (class464) arg0;
        if (this.field4831 == null) {
            return var2.field4831 == null;
        } else if (var2.field4831 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4831.equals(var2.field4831);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4831 == null ? 0 : this.field4831.hashCode();
    }

    public String toString() {
        return this.method7617();
    }

    @ObfuscatedName("qa.f(Lqa;I)I")
    public int method7621(class464 arg0) {
        if (this.field4831 == null) {
            return arg0.field4831 == null ? 0 : 1;
        } else if (arg0.field4831 == null) {
            return -1;
        } else {
            return this.field4831.compareTo(arg0.field4831);
        }
    }

    public int compareTo(Object arg0) {
        return this.method7621((class464) arg0);
    }
}
