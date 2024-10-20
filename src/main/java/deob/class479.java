package deob;

@ObfuscatedName("sy")
public class class479 extends class481 {

    @ObfuscatedName("sy.au")
    public int field4871 = 0;

    @ObfuscatedName("sy.ae")
    public int field4872 = 0;

    public class479(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field4871 = arg0;
        this.field4872 = arg1;
    }

    @ObfuscatedName("sy.au(I)I")
    public int method7748() {
        double var1 = this.method7751();
        return (int) Math.round((double) (this.field4872 - this.field4871) * var1 + (double) this.field4871);
    }
}
