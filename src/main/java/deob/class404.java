package deob;

@ObfuscatedName("pn")
public class class404 extends class408 {

    @ObfuscatedName("pn.aw")
    public long field4519;

    @ObfuscatedName("pn.ay")
    public int field4518;

    @ObfuscatedName("pn.ar")
    public boolean field4517 = false;

    public class404(class408 arg0, int arg1) {
        super(arg0);
        this.field4518 = arg1;
        this.field4529 = "DelayFadeTask";
    }

    @ObfuscatedName("pn.aw(II)Z")
    public boolean method6944(int arg0) {
        if (!this.field4517) {
            this.field4519 = (long) arg0;
            this.field4517 = true;
        }
        return (long) arg0 >= this.field4519 + (long) this.field4518;
    }
}
