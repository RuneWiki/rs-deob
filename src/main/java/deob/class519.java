package deob;

@ObfuscatedName("tr")
public class class519 extends class522 {

    @ObfuscatedName("tr.ap")
    public int field5213 = 0;

    @ObfuscatedName("tr.aw")
    public int field5212 = 0;

    @ObfuscatedName("tr.ak")
    public double field5214 = 0.0D;

    @ObfuscatedName("tr.aj")
    public double field5215 = 0.0D;

    @ObfuscatedName("tr.ai")
    public double field5216 = 0.0D;

    @ObfuscatedName("tr.ay")
    public double field5217 = 0.0D;

    @ObfuscatedName("tr.as")
    public double field5218 = 0.0D;

    public class519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field5213 = arg2;
        this.field5212 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field5214 = (double) arg3;
            this.field5215 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field5214 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field5215 = (this.field5214 - var11) * var19 + var13;
            this.field5216 = Math.sqrt(Math.pow(this.field5214 - (double) arg0, 2.0D) + Math.pow(this.field5215 - (double) arg1, 2.0D));
            this.field5217 = Math.atan2((double) arg1 - this.field5215, (double) arg0 - this.field5214);
            double var23 = Math.atan2((double) arg7 - this.field5215, (double) arg6 - this.field5214);
            this.field5218 = Math.atan2((double) arg4 - this.field5215, (double) arg3 - this.field5214);
            boolean var25 = this.field5217 <= var23 && var23 <= this.field5218 || this.field5218 <= var23 && var23 <= this.field5217;
            if (!var25) {
                this.field5218 += 3.141592653589793D * (double) (this.field5217 - this.field5218 > 0.0D ? 2 : -2);
            }
        }
    }

    @ObfuscatedName("tr.ap(I)I")
    public int method8695() {
        double var1 = this.method8708();
        double var3 = (this.field5218 - this.field5217) * var1 + this.field5217;
        return (int) Math.round(this.field5214 + this.field5216 * Math.cos(var3));
    }

    @ObfuscatedName("tr.aw(B)I")
    public int method8699() {
        double var1 = this.method8708();
        double var3 = (this.field5218 - this.field5217) * var1 + this.field5217;
        return (int) Math.round(this.field5215 + this.field5216 * Math.sin(var3));
    }

    @ObfuscatedName("tr.ak(I)I")
    public int method8697() {
        double var1 = this.method8708();
        return (int) Math.round((double) (this.field5212 - this.field5213) * var1 + (double) this.field5213);
    }
}
