package deob;

@ObfuscatedName("se")
public class class477 extends class480 {

    @ObfuscatedName("se.au")
    public int field4857 = 0;

    @ObfuscatedName("se.ae")
    public int field4858 = 0;

    @ObfuscatedName("se.ao")
    public double field4859 = 0.0D;

    @ObfuscatedName("se.at")
    public double field4860 = 0.0D;

    @ObfuscatedName("se.ac")
    public double field4861 = 0.0D;

    @ObfuscatedName("se.ai")
    public double field4863 = 0.0D;

    @ObfuscatedName("se.az")
    public double field4862 = 0.0D;

    public class477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field4857 = arg2;
        this.field4858 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field4859 = (double) arg3;
            this.field4860 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field4859 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4860 = (this.field4859 - var11) * var19 + var13;
            this.field4861 = Math.sqrt(Math.pow(this.field4859 - (double) arg0, 2.0D) + Math.pow(this.field4860 - (double) arg1, 2.0D));
            this.field4863 = Math.atan2((double) arg1 - this.field4860, (double) arg0 - this.field4859);
            double var23 = Math.atan2((double) arg7 - this.field4860, (double) arg6 - this.field4859);
            this.field4862 = Math.atan2((double) arg4 - this.field4860, (double) arg3 - this.field4859);
            boolean var25 = this.field4863 <= var23 && var23 <= this.field4862 || this.field4862 <= var23 && var23 <= this.field4863;
            if (!var25) {
                this.field4862 += (double) (this.field4863 - this.field4862 > 0.0D ? 2 : -2) * 3.141592653589793D;
            }
        }
    }

    @ObfuscatedName("se.au(I)I")
    public int method7730() {
        double var1 = this.method7751();
        double var3 = (this.field4862 - this.field4863) * var1 + this.field4863;
        return (int) Math.round(this.field4859 + this.field4861 * Math.cos(var3));
    }

    @ObfuscatedName("se.ae(I)I")
    public int method7742() {
        double var1 = this.method7751();
        double var3 = (this.field4862 - this.field4863) * var1 + this.field4863;
        return (int) Math.round(this.field4860 + this.field4861 * Math.sin(var3));
    }

    @ObfuscatedName("se.ao(I)I")
    public int method7732() {
        double var1 = this.method7751();
        return (int) Math.round((double) (this.field4858 - this.field4857) * var1 + (double) this.field4857);
    }
}
