package deob;

@ObfuscatedName("ty")
public class class510 extends class512 {

    @ObfuscatedName("ty.ak")
    public int field5104 = 0;

    @ObfuscatedName("ty.al")
    public int field5105 = 0;

    public class510(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field5104 = arg0;
        this.field5105 = arg1;
    }

    @ObfuscatedName("ty.ak(I)I")
    public int method8224() {
        double var1 = this.method8231();
        return (int) Math.round((double) (this.field5105 - this.field5104) * var1 + (double) this.field5104);
    }
}
