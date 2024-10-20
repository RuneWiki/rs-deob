package deob;

@ObfuscatedName("ts")
public class class499 extends class501 {

    @ObfuscatedName("ts.az")
    public int field5005 = 0;

    @ObfuscatedName("ts.ah")
    public int field5006 = 0;

    public class499(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field5005 = arg0;
        this.field5006 = arg1;
    }

    @ObfuscatedName("ts.az(B)I")
    public int method7907() {
        double var1 = this.method7912();
        return (int) Math.round((double) (this.field5006 - this.field5005) * var1 + (double) this.field5005);
    }
}
