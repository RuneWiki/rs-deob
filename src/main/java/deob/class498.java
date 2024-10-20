package deob;

@ObfuscatedName("tk")
public class class498 extends class500 {

    @ObfuscatedName("tk.aq")
    public int field4978 = 0;

    @ObfuscatedName("tk.aw")
    public int field4979 = 0;

    public class498(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field4978 = arg0;
        this.field4979 = arg1;
    }

    @ObfuscatedName("tk.aq(I)I")
    public int method8030() {
        double var1 = this.method8034();
        return (int) Math.round((double) (this.field4979 - this.field4978) * var1 + (double) this.field4978);
    }
}
