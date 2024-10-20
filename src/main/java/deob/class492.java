package deob;

@ObfuscatedName("so")
public class class492 extends class495 {

    @ObfuscatedName("so.ac")
    public int field4903 = 0;

    @ObfuscatedName("so.al")
    public int field4902 = 0;

    @ObfuscatedName("so.ak")
    public double field4901 = 0.0D;

    @ObfuscatedName("so.ax")
    public double field4907 = 0.0D;

    @ObfuscatedName("so.ao")
    public double field4905 = 0.0D;

    @ObfuscatedName("so.ah")
    public double field4904 = 0.0D;

    @ObfuscatedName("so.ar")
    public double field4906 = 0.0D;

    public class492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field4903 = arg2;
        this.field4902 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field4901 = (double) arg3;
            this.field4907 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field4901 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4907 = (this.field4901 - var11) * var19 + var13;
            this.field4905 = Math.sqrt(Math.pow(this.field4901 - (double) arg0, 2.0D) + Math.pow(this.field4907 - (double) arg1, 2.0D));
            this.field4904 = Math.atan2((double) arg1 - this.field4907, (double) arg0 - this.field4901);
            double var23 = Math.atan2((double) arg7 - this.field4907, (double) arg6 - this.field4901);
            this.field4906 = Math.atan2((double) arg4 - this.field4907, (double) arg3 - this.field4901);
            boolean var25 = this.field4904 <= var23 && var23 <= this.field4906 || this.field4906 <= var23 && var23 <= this.field4904;
            if (!var25) {
                this.field4906 += 3.141592653589793D * (double) (this.field4904 - this.field4906 > 0.0D ? 2 : -2);
            }
        }
    }

    @ObfuscatedName("so.ac(I)I")
    public int method7810() {
        double var1 = this.method7824();
        double var3 = (this.field4906 - this.field4904) * var1 + this.field4904;
        return (int) Math.round(this.field4901 + this.field4905 * Math.cos(var3));
    }

    @ObfuscatedName("so.al(I)I")
    public int method7812() {
        double var1 = this.method7824();
        double var3 = (this.field4906 - this.field4904) * var1 + this.field4904;
        return (int) Math.round(this.field4907 + this.field4905 * Math.sin(var3));
    }

    @ObfuscatedName("so.ak(B)I")
    public int method7808() {
        double var1 = this.method7824();
        return (int) Math.round((double) (this.field4902 - this.field4903) * var1 + (double) this.field4903);
    }
}
