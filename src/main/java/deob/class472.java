package deob;

@ObfuscatedName("sz")
public class class472 implements Comparable {

    @ObfuscatedName("sz.an")
    public class572 field4919;

    @ObfuscatedName("sz.au")
    public class572 field4920;

    @ObfuscatedName("sz.at(I)Lvf;")
    public class572 method7944() {
        return this.field4919;
    }

    @ObfuscatedName("sz.az(I)Ljava/lang/String;")
    public String method7934() {
        return this.field4919 == null ? "" : this.field4919.method9470();
    }

    @ObfuscatedName("sz.bg(I)Ljava/lang/String;")
    public String method7935() {
        return this.field4920 == null ? "" : this.field4920.method9470();
    }

    @ObfuscatedName("sz.bz(Lvf;Lvf;B)V")
    public void method7939(class572 arg0, class572 arg1) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        this.field4919 = arg0;
        this.field4920 = arg1;
    }

    @ObfuscatedName("sz.ay(Lsz;I)I")
    public int method7906(class472 arg0) {
        return this.field4919.method9478(arg0.field4919);
    }

    public int compareTo(Object arg0) {
        return this.method7906((class472) arg0);
    }
}
