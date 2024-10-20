package deob;

@ObfuscatedName("qx")
public class class422 extends class426 {

    @ObfuscatedName("qx.aq")
    public long field4616;

    @ObfuscatedName("qx.aw")
    public int field4617;

    public class422(class426 arg0, int arg1) {
        super(arg0);
        this.field4617 = arg1;
        this.field4628 = "DelayFadeTask";
    }

    @ObfuscatedName("qx.aq(I)Z")
    public boolean method7266() {
        if (this.field4616 < (long) this.field4617) {
            this.field4616++;
            return false;
        } else {
            return true;
        }
    }
}
