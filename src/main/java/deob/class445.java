package deob;

@ObfuscatedName("ry")
public class class445 extends class449 {

    @ObfuscatedName("ry.ap")
    public long field4875;

    @ObfuscatedName("ry.aw")
    public int field4876;

    public class445(class449 arg0, int arg1) {
        super(arg0);
        this.field4876 = arg1;
        this.field4882 = "DelayFadeTask";
    }

    @ObfuscatedName("ry.ap(I)Z")
    public boolean method8051() {
        if (this.field4875 < (long) this.field4876) {
            this.field4875++;
            return false;
        } else {
            return true;
        }
    }
}
