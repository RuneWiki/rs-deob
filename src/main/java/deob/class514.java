package deob;

@ObfuscatedName("ty")
public class class514 extends class516 {

    @ObfuscatedName("ty.ac")
    public int field5176 = 0;

    @ObfuscatedName("ty.ae")
    public int field5177 = 0;

    public class514(int arg0, int arg1, int arg2, int arg3) {
        super(arg2, arg3);
        this.field5176 = arg0;
        this.field5177 = arg1;
    }

    @ObfuscatedName("ty.ac(S)I")
    public int method8404() {
        double var1 = this.method8410();
        return (int) Math.round((double) (this.field5177 - this.field5176) * var1 + (double) this.field5176);
    }
}
