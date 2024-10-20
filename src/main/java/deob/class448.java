package deob;

@ObfuscatedName("rp")
public class class448 implements Comparable {

    @ObfuscatedName("rp.ak")
    public class553 field4696;

    @ObfuscatedName("rp.ax")
    public class553 field4697;

    @ObfuscatedName("rp.az(B)Lvf;")
    public class553 method7329() {
        return this.field4696;
    }

    @ObfuscatedName("rp.at(S)Ljava/lang/String;")
    public String method7336() {
        return this.field4696 == null ? "" : this.field4696.method8985();
    }

    @ObfuscatedName("rp.af(I)Ljava/lang/String;")
    public String method7330() {
        return this.field4697 == null ? "" : this.field4697.method8985();
    }

    @ObfuscatedName("rp.ad(Lvf;Lvf;I)V")
    public void method7333(class553 arg0, class553 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4696 = arg0;
        this.field4697 = arg1;
    }

    @ObfuscatedName("rp.al(Lrp;I)I")
    public int method7303(class448 arg0) {
        return this.field4696.method8989(arg0.field4696);
    }

    public int compareTo(Object arg0) {
        return this.method7303((class448) arg0);
    }
}
