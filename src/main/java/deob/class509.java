package deob;

@ObfuscatedName("tl")
public class class509 extends class512 {

    @ObfuscatedName("tl.aq")
    public int field5122 = 0;

    @ObfuscatedName("tl.ad")
    public int field5128 = 0;

    @ObfuscatedName("tl.ag")
    public double field5124 = 0.0D;

    @ObfuscatedName("tl.ak")
    public double field5125 = 0.0D;

    @ObfuscatedName("tl.ap")
    public double field5126 = 0.0D;

    @ObfuscatedName("tl.an")
    public double field5127 = 0.0D;

    @ObfuscatedName("tl.aj")
    public double field5123 = 0.0D;

    public class509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field5122 = arg2;
        this.field5128 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field5124 = (double) arg3;
            this.field5125 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field5124 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field5125 = (this.field5124 - var11) * var19 + var13;
            this.field5126 = Math.sqrt(Math.pow(this.field5124 - (double) arg0, 2.0D) + Math.pow(this.field5125 - (double) arg1, 2.0D));
            this.field5127 = Math.atan2((double) arg1 - this.field5125, (double) arg0 - this.field5124);
            double var23 = Math.atan2((double) arg7 - this.field5125, (double) arg6 - this.field5124);
            this.field5123 = Math.atan2((double) arg4 - this.field5125, (double) arg3 - this.field5124);
            boolean var25 = this.field5127 <= var23 && var23 <= this.field5123 || this.field5123 <= var23 && var23 <= this.field5127;
            if (!var25) {
                this.field5123 += 3.141592653589793D * (double) (this.field5127 - this.field5123 > 0.0D ? 2 : -2);
            }
        }
    }

    @ObfuscatedName("tl.aq(I)I")
    public int method8160() {
        double var1 = this.method8171();
        double var3 = (this.field5123 - this.field5127) * var1 + this.field5127;
        return (int) Math.round(this.field5124 + this.field5126 * Math.cos(var3));
    }

    @ObfuscatedName("tl.ad(I)I")
    public int method8161() {
        double var1 = this.method8171();
        double var3 = (this.field5123 - this.field5127) * var1 + this.field5127;
        return (int) Math.round(this.field5125 + this.field5126 * Math.sin(var3));
    }

    @ObfuscatedName("tl.ag(I)I")
    public int method8159() {
        double var1 = this.method8171();
        return (int) Math.round((double) (this.field5128 - this.field5122) * var1 + (double) this.field5122);
    }
}
