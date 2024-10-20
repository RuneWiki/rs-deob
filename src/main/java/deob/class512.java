package deob;

@ObfuscatedName("ta")
public class class512 extends class515 {

    @ObfuscatedName("ta.ac")
    public int field5167 = 0;

    @ObfuscatedName("ta.ae")
    public int field5168 = 0;

    @ObfuscatedName("ta.ag")
    public double field5163 = 0.0D;

    @ObfuscatedName("ta.am")
    public double field5161 = 0.0D;

    @ObfuscatedName("ta.ax")
    public double field5165 = 0.0D;

    @ObfuscatedName("ta.aq")
    public double field5166 = 0.0D;

    @ObfuscatedName("ta.af")
    public double field5164 = 0.0D;

    public class512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field5167 = arg2;
        this.field5168 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field5163 = (double) arg3;
            this.field5161 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field5163 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field5161 = (this.field5163 - var11) * var19 + var13;
            this.field5165 = Math.sqrt(Math.pow(this.field5163 - (double) arg0, 2.0D) + Math.pow(this.field5161 - (double) arg1, 2.0D));
            this.field5166 = Math.atan2((double) arg1 - this.field5161, (double) arg0 - this.field5163);
            double var23 = Math.atan2((double) arg7 - this.field5161, (double) arg6 - this.field5163);
            this.field5164 = Math.atan2((double) arg4 - this.field5161, (double) arg3 - this.field5163);
            boolean var25 = this.field5166 <= var23 && var23 <= this.field5164 || this.field5164 <= var23 && var23 <= this.field5166;
            if (!var25) {
                this.field5164 += (double) (this.field5166 - this.field5164 > 0.0D ? 2 : -2) * 3.141592653589793D;
            }
        }
    }

    @ObfuscatedName("ta.ac(I)I")
    public int method8394() {
        double var1 = this.method8410();
        double var3 = (this.field5164 - this.field5166) * var1 + this.field5166;
        return (int) Math.round(this.field5163 + this.field5165 * Math.cos(var3));
    }

    @ObfuscatedName("ta.ae(B)I")
    public int method8396() {
        double var1 = this.method8410();
        double var3 = (this.field5164 - this.field5166) * var1 + this.field5166;
        return (int) Math.round(this.field5161 + this.field5165 * Math.sin(var3));
    }

    @ObfuscatedName("ta.ag(B)I")
    public int method8397() {
        double var1 = this.method8410();
        return (int) Math.round((double) (this.field5168 - this.field5167) * var1 + (double) this.field5167);
    }
}
