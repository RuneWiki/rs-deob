package deob;

@ObfuscatedName("rf")
public class class455 extends class457 {

    @ObfuscatedName("rf.af")
    public int field4800 = 0;

    @ObfuscatedName("rf.an")
    public int field4801 = 0;

    public class455(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field4800 = arg0;
        this.field4801 = arg1;
    }

    @ObfuscatedName("rf.af(I)I")
    public int method7684() {
        double var1 = this.method7695();
        return (int) Math.round((double) (this.field4801 - this.field4800) * var1 + (double) this.field4800);
    }
}
