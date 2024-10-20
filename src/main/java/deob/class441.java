package deob;

@ObfuscatedName("qv")
public class class441 extends class445 {

    @ObfuscatedName("qv.aq")
    public long field4804;

    @ObfuscatedName("qv.ad")
    public int field4803;

    public class441(class445 arg0, int arg1) {
        super(arg0);
        this.field4803 = arg1;
        this.field4815 = "DelayFadeTask";
    }

    @ObfuscatedName("qv.aq(S)Z")
    public boolean method7560() {
        if (this.field4804 < (long) this.field4803) {
            this.field4804++;
            return false;
        } else {
            return true;
        }
    }
}
