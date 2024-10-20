package deob;

@ObfuscatedName("se")
public class class475 implements Comparable {

    @ObfuscatedName("se.ak")
    public class581 field5009;

    @ObfuscatedName("se.aj")
    public class581 field5008;

    @ObfuscatedName("se.aa(I)Lwx;")
    public class581 method8345() {
        return this.field5009;
    }

    @ObfuscatedName("se.ah(I)Ljava/lang/String;")
    public String method8342() {
        return this.field5009 == null ? "" : this.field5009.method9989();
    }

    @ObfuscatedName("se.bh(I)Ljava/lang/String;")
    public String method8335() {
        return this.field5008 == null ? "" : this.field5008.method9989();
    }

    @ObfuscatedName("se.bj(Lwx;Lwx;I)V")
    public void method8339(class581 arg0, class581 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field5009 = arg0;
        this.field5008 = arg1;
    }

    @ObfuscatedName("se.aw(Lse;S)I")
    public int method8303(class475 arg0) {
        return this.field5009.method9978(arg0.field5009);
    }

    public int compareTo(Object arg0) {
        return this.method8303((class475) arg0);
    }
}
