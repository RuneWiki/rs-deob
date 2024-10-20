package deob;

@ObfuscatedName("sp")
public class class494 extends class496 {

    @ObfuscatedName("sp.ac")
    public int field4917 = 0;

    @ObfuscatedName("sp.al")
    public int field4915 = 0;

    public class494(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field4917 = arg0;
        this.field4915 = arg1;
    }

    @ObfuscatedName("sp.ac(I)I")
    public int method7819() {
        double var1 = this.method7824();
        return (int) Math.round((double) (this.field4915 - this.field4917) * var1 + (double) this.field4917);
    }
}
