package deob;

@ObfuscatedName("pt")
public class class415 extends class419 {

    @ObfuscatedName("pt.at")
    public long field4545;

    @ObfuscatedName("pt.ah")
    public int field4544;

    public class415(class419 arg0, int arg1) {
        super(arg0);
        this.field4544 = arg1;
        this.field4553 = "DelayFadeTask";
    }

    @ObfuscatedName("pt.at(I)Z")
    public boolean method7116() {
        if (this.field4545 < (long) this.field4544) {
            this.field4545++;
            return false;
        } else {
            return true;
        }
    }
}
