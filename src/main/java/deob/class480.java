package deob;

@ObfuscatedName("ss")
public class class480 extends class482 {

    @ObfuscatedName("ss.aw")
    public int field4871 = 0;

    @ObfuscatedName("ss.ay")
    public int field4872 = 0;

    public class480(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field4871 = arg0;
        this.field4872 = arg1;
    }

    @ObfuscatedName("ss.aw(B)I")
    public int method7700() {
        double var1 = this.method7702();
        return (int) Math.round((double) (this.field4872 - this.field4871) * var1 + (double) this.field4871);
    }
}
