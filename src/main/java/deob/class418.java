package deob;

@ObfuscatedName("qb")
public class class418 extends class422 {

    @ObfuscatedName("qb.ac")
    public long field4565;

    @ObfuscatedName("qb.al")
    public int field4566;

    public class418(class422 arg0, int arg1) {
        super(arg0);
        this.field4566 = arg1;
        this.field4573 = "DelayFadeTask";
    }

    @ObfuscatedName("qb.ac(B)Z")
    public boolean method7059() {
        if (this.field4565 < (long) this.field4566) {
            this.field4565++;
            return false;
        } else {
            return true;
        }
    }
}
