package deob;

@ObfuscatedName("pb")
public class class422 implements Comparable {

    @ObfuscatedName("pb.i")
    public String field4435;

    @ObfuscatedName("pb.w")
    public String field4434;

    public class422(String arg0) {
        this.field4435 = arg0;
        this.field4434 = class384.method577(arg0, class383.field4226);
    }

    public class422(String arg0, class383 arg1) {
        this.field4435 = arg0;
        this.field4434 = class384.method577(arg0, arg1);
    }

    @ObfuscatedName("pb.i(B)Ljava/lang/String;")
    public String method6813() {
        return this.field4435;
    }

    @ObfuscatedName("pb.w(I)Ljava/lang/String;")
    public String method6830() {
        return this.field4434;
    }

    @ObfuscatedName("pb.s(B)Z")
    public boolean method6816() {
        return this.field4434 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class422) {
            return false;
        }
        class422 var2 = (class422) arg0;
        if (this.field4434 == null) {
            return var2.field4434 == null;
        } else if (var2.field4434 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field4434.equals(var2.field4434);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field4434 == null ? 0 : this.field4434.hashCode();
    }

    public String toString() {
        return this.method6813();
    }

    @ObfuscatedName("pb.a(Lpb;B)I")
    public int method6815(class422 arg0) {
        if (this.field4434 == null) {
            return arg0.field4434 == null ? 0 : 1;
        } else if (arg0.field4434 == null) {
            return -1;
        } else {
            return this.field4434.compareTo(arg0.field4434);
        }
    }

    public int compareTo(Object arg0) {
        return this.method6815((class422) arg0);
    }
}
