package deob;

@ObfuscatedName("vv")
public class class568 implements Comparable {

    @ObfuscatedName("vv.ak")
    public String field5491;

    @ObfuscatedName("vv.al")
    public String field5490;

    public class568(String arg0) {
        this.field5491 = arg0;
        this.field5490 = class525.method3404(arg0, class524.field5222);
    }

    public class568(String arg0, class524 arg1) {
        this.field5491 = arg0;
        this.field5490 = class525.method3404(arg0, arg1);
    }

    @ObfuscatedName("vv.ak(I)Ljava/lang/String;")
    public String method9385() {
        return this.field5491;
    }

    @ObfuscatedName("vv.al(B)Ljava/lang/String;")
    public String method9386() {
        return this.field5490;
    }

    @ObfuscatedName("vv.aa(I)Z")
    public boolean method9387() {
        return this.field5490 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class568) {
            return false;
        }
        class568 var2 = (class568) arg0;
        if (this.field5490 == null) {
            return var2.field5490 == null;
        } else if (var2.field5490 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5490.equals(var2.field5490);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5490 == null ? 0 : this.field5490.hashCode();
    }

    public String toString() {
        return this.method9385();
    }

    @ObfuscatedName("vv.at(Lvv;I)I")
    public int method9400(class568 arg0) {
        if (this.field5490 == null) {
            return arg0.field5490 == null ? 0 : 1;
        } else if (arg0.field5490 == null) {
            return -1;
        } else {
            return this.field5490.compareTo(arg0.field5490);
        }
    }

    public int compareTo(Object arg0) {
        return this.method9400((class568) arg0);
    }
}
