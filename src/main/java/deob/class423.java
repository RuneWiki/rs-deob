package deob;

@ObfuscatedName("qo")
public class class423 extends class427 {

    @ObfuscatedName("qo.az")
    public long field4640;

    @ObfuscatedName("qo.ah")
    public int field4641;

    public class423(class427 arg0, int arg1) {
        super(arg0);
        this.field4641 = arg1;
        this.field4652 = "DelayFadeTask";
    }

    @ObfuscatedName("qo.az(I)Z")
    public boolean method7146() {
        if (this.field4640 < (long) this.field4641) {
            this.field4640++;
            return false;
        } else {
            return true;
        }
    }
}
