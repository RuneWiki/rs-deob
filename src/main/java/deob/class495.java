package deob;

@ObfuscatedName("tn")
public class class495 extends class497 {

    @ObfuscatedName("tn.am")
    public int field4947 = 0;

    @ObfuscatedName("tn.ap")
    public int field4946 = 0;

    public class495(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field4947 = arg0;
        this.field4946 = arg1;
    }

    @ObfuscatedName("tn.am(B)I")
    public int method8034() {
        double var1 = this.method8037();
        return (int) Math.round((double) (this.field4946 - this.field4947) * var1 + (double) this.field4947);
    }
}
