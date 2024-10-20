package deob;

@ObfuscatedName("qj")
public class class440 extends class444 {

    @ObfuscatedName("qj.ak")
    public long field4786;

    @ObfuscatedName("qj.al")
    public int field4785;

    public class440(class444 arg0, int arg1) {
        super(arg0);
        this.field4785 = arg1;
        this.field4794 = "DelayFadeTask";
    }

    @ObfuscatedName("qj.ak(I)Z")
    public boolean method7581() {
        if (this.field4786 < (long) this.field4785) {
            this.field4786++;
            return false;
        } else {
            return true;
        }
    }
}
