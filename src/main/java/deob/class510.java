package deob;

@ObfuscatedName("tk")
public class class510 extends class513 {

    @ObfuscatedName("tk.ab")
    public int field5122 = 0;

    @ObfuscatedName("tk.ay")
    public int field5120 = 0;

    @ObfuscatedName("tk.an")
    public double field5121 = 0.0D;

    @ObfuscatedName("tk.au")
    public double field5119 = 0.0D;

    @ObfuscatedName("tk.ax")
    public double field5123 = 0.0D;

    @ObfuscatedName("tk.ao")
    public double field5124 = 0.0D;

    @ObfuscatedName("tk.am")
    public double field5125 = 0.0D;

    public class510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field5122 = arg2;
        this.field5120 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field5121 = (double) arg3;
            this.field5119 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field5121 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field5119 = (this.field5121 - var11) * var19 + var13;
            this.field5123 = Math.sqrt(Math.pow(this.field5121 - (double) arg0, 2.0D) + Math.pow(this.field5119 - (double) arg1, 2.0D));
            this.field5124 = Math.atan2((double) arg1 - this.field5119, (double) arg0 - this.field5121);
            double var23 = Math.atan2((double) arg7 - this.field5119, (double) arg6 - this.field5121);
            this.field5125 = Math.atan2((double) arg4 - this.field5119, (double) arg3 - this.field5121);
            boolean var25 = this.field5124 <= var23 && var23 <= this.field5125 || this.field5125 <= var23 && var23 <= this.field5124;
            if (!var25) {
                this.field5125 += 3.141592653589793D * (double) (this.field5124 - this.field5125 > 0.0D ? 2 : -2);
            }
        }
    }

    @ObfuscatedName("tk.ab(I)I")
    public int method8253() {
        double var1 = this.method8272();
        double var3 = (this.field5125 - this.field5124) * var1 + this.field5124;
        return (int) Math.round(this.field5121 + this.field5123 * Math.cos(var3));
    }

    @ObfuscatedName("tk.ay(B)I")
    public int method8252() {
        double var1 = this.method8272();
        double var3 = (this.field5125 - this.field5124) * var1 + this.field5124;
        return (int) Math.round(this.field5119 + this.field5123 * Math.sin(var3));
    }

    @ObfuscatedName("tk.an(I)I")
    public int method8259() {
        double var1 = this.method8272();
        return (int) Math.round((double) (this.field5120 - this.field5122) * var1 + (double) this.field5122);
    }
}
