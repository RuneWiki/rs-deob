package deob;

@ObfuscatedName("qe")
public class class419 extends class423 {

    @ObfuscatedName("qe.am")
    public long field4584;

    @ObfuscatedName("qe.ap")
    public int field4583;

    public class419(class423 arg0, int arg1) {
        super(arg0);
        this.field4583 = arg1;
        this.field4598 = "DelayFadeTask";
    }

    @ObfuscatedName("qe.am(I)Z")
    public boolean method7259() {
        if (this.field4584 < (long) this.field4583) {
            this.field4584++;
            return false;
        } else {
            return true;
        }
    }
}
