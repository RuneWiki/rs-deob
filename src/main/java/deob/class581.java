package deob;

@ObfuscatedName("wx")
public class class581 implements Comparable {

    @ObfuscatedName("wx.ap")
    public String field5630;

    @ObfuscatedName("wx.aw")
    public String field5629;

    public class581(String arg0) {
        this.field5630 = arg0;
        this.field5629 = class536.method2489(arg0, class535.field5345);
    }

    public class581(String arg0, class535 arg1) {
        this.field5630 = arg0;
        this.field5629 = class536.method2489(arg0, arg1);
    }

    @ObfuscatedName("wx.ap(I)Ljava/lang/String;")
    public String method9989() {
        return this.field5630;
    }

    @ObfuscatedName("wx.aw(B)Ljava/lang/String;")
    public String method9976() {
        return this.field5629;
    }

    @ObfuscatedName("wx.ak(I)Z")
    public boolean method9994() {
        return this.field5629 != null;
    }

    public boolean equals(Object arg0) {
        if (!arg0 instanceof class581) {
            return false;
        }
        class581 var2 = (class581) arg0;
        if (this.field5629 == null) {
            return var2.field5629 == null;
        } else if (var2.field5629 == null) {
            return false;
        } else if (this.hashCode() == var2.hashCode()) {
            return this.field5629.equals(var2.field5629);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return this.field5629 == null ? 0 : this.field5629.hashCode();
    }

    public String toString() {
        return this.method9989();
    }

    @ObfuscatedName("wx.aj(Lwx;I)I")
    public int method9978(class581 arg0) {
        if (this.field5629 == null) {
            return arg0.field5629 == null ? 0 : 1;
        } else if (arg0.field5629 == null) {
            return -1;
        } else {
            return this.field5629.compareTo(arg0.field5629);
        }
    }

    public int compareTo(Object arg0) {
        return this.method9978((class581) arg0);
    }
}
