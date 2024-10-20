package deob;

@ObfuscatedName("qn")
public class class442 extends class446 {

    @ObfuscatedName("qn.ab")
    public long field4780;

    @ObfuscatedName("qn.ay")
    public int field4781;

    public class442(class446 arg0, int arg1) {
        super(arg0);
        this.field4781 = arg1;
        this.field4797 = "DelayFadeTask";
    }

    @ObfuscatedName("qn.ab(I)Z")
    public boolean method7665() {
        if (this.field4780 < (long) this.field4781) {
            this.field4780++;
            return false;
        } else {
            return true;
        }
    }
}
