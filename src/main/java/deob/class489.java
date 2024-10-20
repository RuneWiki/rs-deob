package deob;

@ObfuscatedName("sp")
public class class489 extends class492 {

    @ObfuscatedName("sp.at")
    public int field4903 = 0;

    @ObfuscatedName("sp.ah")
    public int field4898 = 0;

    @ObfuscatedName("sp.ar")
    public double field4899 = 0.0D;

    @ObfuscatedName("sp.ao")
    public double field4900 = 0.0D;

    @ObfuscatedName("sp.ab")
    public double field4901 = 0.0D;

    @ObfuscatedName("sp.au")
    public double field4902 = 0.0D;

    @ObfuscatedName("sp.aa")
    public double field4897 = 0.0D;

    public class489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field4903 = arg2;
        this.field4898 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field4899 = (double) arg3;
            this.field4900 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field4899 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4900 = (this.field4899 - var11) * var19 + var13;
            this.field4901 = Math.sqrt(Math.pow(this.field4899 - (double) arg0, 2.0D) + Math.pow(this.field4900 - (double) arg1, 2.0D));
            this.field4902 = Math.atan2((double) arg1 - this.field4900, (double) arg0 - this.field4899);
            double var23 = Math.atan2((double) arg7 - this.field4900, (double) arg6 - this.field4899);
            this.field4897 = Math.atan2((double) arg4 - this.field4900, (double) arg3 - this.field4899);
            boolean var25 = this.field4902 <= var23 && var23 <= this.field4897 || this.field4897 <= var23 && var23 <= this.field4902;
            if (!var25) {
                this.field4897 += (double) (this.field4902 - this.field4897 > 0.0D ? 2 : -2) * 3.141592653589793D;
            }
        }
    }

    @ObfuscatedName("sp.at(B)I")
    public int method7851() {
        double var1 = this.method7869();
        double var3 = (this.field4897 - this.field4902) * var1 + this.field4902;
        return (int) Math.round(this.field4899 + this.field4901 * Math.cos(var3));
    }

    @ObfuscatedName("sp.ah(B)I")
    public int method7860() {
        double var1 = this.method7869();
        double var3 = (this.field4897 - this.field4902) * var1 + this.field4902;
        return (int) Math.round(this.field4900 + this.field4901 * Math.sin(var3));
    }

    @ObfuscatedName("sp.ar(I)I")
    public int method7853() {
        double var1 = this.method7869();
        return (int) Math.round((double) (this.field4898 - this.field4903) * var1 + (double) this.field4903);
    }
}
