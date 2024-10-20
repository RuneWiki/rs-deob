package deob;

@ObfuscatedName("pn")
public class class403 extends class407 {

    @ObfuscatedName("pn.au")
    public long field4513;

    @ObfuscatedName("pn.ae")
    public int field4514;

    public class403(class407 arg0, int arg1) {
        super(arg0);
        this.field4514 = arg1;
        this.field4524 = "DelayFadeTask";
    }

    @ObfuscatedName("pn.au(I)Z")
    public boolean method6976() {
        if (this.field4513 < (long) this.field4514) {
            this.field4513++;
            return false;
        } else {
            return true;
        }
    }
}
