package deob;

@ObfuscatedName("sc")
public class class478 extends class481 {

    @ObfuscatedName("sc.aw")
    public int field4860 = 0;

    @ObfuscatedName("sc.ay")
    public int field4859 = 0;

    @ObfuscatedName("sc.ar")
    public double field4864 = 0.0D;

    @ObfuscatedName("sc.am")
    public double field4861 = 0.0D;

    @ObfuscatedName("sc.as")
    public double field4862 = 0.0D;

    @ObfuscatedName("sc.aj")
    public double field4863 = 0.0D;

    @ObfuscatedName("sc.ag")
    public double field4858 = 0.0D;

    public class478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field4860 = arg2;
        this.field4859 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field4864 = (double) arg3;
            this.field4861 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field4864 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4861 = (this.field4864 - var11) * var19 + var13;
            this.field4862 = Math.sqrt(Math.pow(this.field4864 - (double) arg0, 2.0D) + Math.pow(this.field4861 - (double) arg1, 2.0D));
            this.field4863 = Math.atan2((double) arg1 - this.field4861, (double) arg0 - this.field4864);
            double var23 = Math.atan2((double) arg7 - this.field4861, (double) arg6 - this.field4864);
            this.field4858 = Math.atan2((double) arg4 - this.field4861, (double) arg3 - this.field4864);
            boolean var25 = this.field4863 <= var23 && var23 <= this.field4858 || this.field4858 <= var23 && var23 <= this.field4863;
            if (!var25) {
                this.field4858 += 3.141592653589793D * (double) (this.field4863 - this.field4858 > 0.0D ? 2 : -2);
            }
        }
    }

    @ObfuscatedName("sc.aw(S)I")
    public int method7690() {
        double var1 = this.method7702();
        double var3 = (this.field4858 - this.field4863) * var1 + this.field4863;
        return (int) Math.round(this.field4864 + this.field4862 * Math.cos(var3));
    }

    @ObfuscatedName("sc.ay(I)I")
    public int method7691() {
        double var1 = this.method7702();
        double var3 = (this.field4858 - this.field4863) * var1 + this.field4863;
        return (int) Math.round(this.field4861 + this.field4862 * Math.sin(var3));
    }

    @ObfuscatedName("sc.ar(S)I")
    public int method7693() {
        double var1 = this.method7702();
        return (int) Math.round((double) (this.field4859 - this.field4860) * var1 + (double) this.field4860);
    }
}
