package deob;

@ObfuscatedName("rh")
public class class444 extends class448 {

    @ObfuscatedName("rh.ac")
    public long field4834;

    @ObfuscatedName("rh.ae")
    public int field4833;

    public class444(class448 arg0, int arg1) {
        super(arg0);
        this.field4833 = arg1;
        this.field4844 = "DelayFadeTask";
    }

    @ObfuscatedName("rh.ac(I)Z")
    public boolean method7804() {
        if (this.field4834 < (long) this.field4833) {
            this.field4834++;
            return false;
        } else {
            return true;
        }
    }
}
