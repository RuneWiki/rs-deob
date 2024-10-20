package deob;

@ObfuscatedName("sm")
public class class491 extends class493 {

    @ObfuscatedName("sm.at")
    public int field4912 = 0;

    @ObfuscatedName("sm.ah")
    public int field4913 = 0;

    public class491(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field4912 = arg0;
        this.field4913 = arg1;
    }

    @ObfuscatedName("sm.at(I)I")
    public int method7863() {
        double var1 = this.method7869();
        return (int) Math.round((double) (this.field4913 - this.field4912) * var1 + (double) this.field4912);
    }
}
