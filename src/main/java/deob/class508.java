package deob;

@ObfuscatedName("tg")
public class class508 extends class511 {

    @ObfuscatedName("tg.ak")
    public int field5095 = 0;

    @ObfuscatedName("tg.al")
    public int field5091 = 0;

    @ObfuscatedName("tg.aj")
    public double field5092 = 0.0D;

    @ObfuscatedName("tg.az")
    public double field5090 = 0.0D;

    @ObfuscatedName("tg.af")
    public double field5094 = 0.0D;

    @ObfuscatedName("tg.aa")
    public double field5096 = 0.0D;

    @ObfuscatedName("tg.at")
    public double field5093 = 0.0D;

    public class508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field5095 = arg2;
        this.field5091 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field5092 = (double) arg3;
            this.field5090 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field5092 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field5090 = (this.field5092 - var11) * var19 + var13;
            this.field5094 = Math.sqrt(Math.pow(this.field5092 - (double) arg0, 2.0D) + Math.pow(this.field5090 - (double) arg1, 2.0D));
            this.field5096 = Math.atan2((double) arg1 - this.field5090, (double) arg0 - this.field5092);
            double var23 = Math.atan2((double) arg7 - this.field5090, (double) arg6 - this.field5092);
            this.field5093 = Math.atan2((double) arg4 - this.field5090, (double) arg3 - this.field5092);
            boolean var25 = this.field5096 <= var23 && var23 <= this.field5093 || this.field5093 <= var23 && var23 <= this.field5096;
            if (!var25) {
                this.field5093 += (double) (this.field5096 - this.field5093 > 0.0D ? 2 : -2) * 3.141592653589793D;
            }
        }
    }

    @ObfuscatedName("tg.ak(B)I")
    public int method8215() {
        double var1 = this.method8231();
        double var3 = (this.field5093 - this.field5096) * var1 + this.field5096;
        return (int) Math.round(this.field5092 + this.field5094 * Math.cos(var3));
    }

    @ObfuscatedName("tg.al(I)I")
    public int method8216() {
        double var1 = this.method8231();
        double var3 = (this.field5093 - this.field5096) * var1 + this.field5096;
        return (int) Math.round(this.field5090 + this.field5094 * Math.sin(var3));
    }

    @ObfuscatedName("tg.aj(I)I")
    public int method8217() {
        double var1 = this.method8231();
        return (int) Math.round((double) (this.field5091 - this.field5095) * var1 + (double) this.field5095);
    }
}
