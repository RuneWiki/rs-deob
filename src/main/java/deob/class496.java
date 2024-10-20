package deob;

@ObfuscatedName("tc")
public class class496 extends class499 {

    @ObfuscatedName("tc.aq")
    public int field4968 = 0;

    @ObfuscatedName("tc.aw")
    public int field4963 = 0;

    @ObfuscatedName("tc.al")
    public double field4964 = 0.0D;

    @ObfuscatedName("tc.ai")
    public double field4965 = 0.0D;

    @ObfuscatedName("tc.ar")
    public double field4966 = 0.0D;

    @ObfuscatedName("tc.as")
    public double field4967 = 0.0D;

    @ObfuscatedName("tc.aa")
    public double field4970 = 0.0D;

    public class496(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field4968 = arg2;
        this.field4963 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field4964 = (double) arg3;
            this.field4965 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field4964 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4965 = (this.field4964 - var11) * var19 + var13;
            this.field4966 = Math.sqrt(Math.pow(this.field4964 - (double) arg0, 2.0D) + Math.pow(this.field4965 - (double) arg1, 2.0D));
            this.field4967 = Math.atan2((double) arg1 - this.field4965, (double) arg0 - this.field4964);
            double var23 = Math.atan2((double) arg7 - this.field4965, (double) arg6 - this.field4964);
            this.field4970 = Math.atan2((double) arg4 - this.field4965, (double) arg3 - this.field4964);
            boolean var25 = this.field4967 <= var23 && var23 <= this.field4970 || this.field4970 <= var23 && var23 <= this.field4967;
            if (!var25) {
                this.field4970 += (double) (this.field4967 - this.field4970 > 0.0D ? 2 : -2) * 3.141592653589793D;
            }
        }
    }

    @ObfuscatedName("tc.aq(I)I")
    public int method8021() {
        double var1 = this.method8034();
        double var3 = (this.field4970 - this.field4967) * var1 + this.field4967;
        return (int) Math.round(this.field4964 + this.field4966 * Math.cos(var3));
    }

    @ObfuscatedName("tc.aw(I)I")
    public int method8022() {
        double var1 = this.method8034();
        double var3 = (this.field4970 - this.field4967) * var1 + this.field4967;
        return (int) Math.round(this.field4965 + this.field4966 * Math.sin(var3));
    }

    @ObfuscatedName("tc.al(B)I")
    public int method8024() {
        double var1 = this.method8034();
        return (int) Math.round((double) (this.field4963 - this.field4968) * var1 + (double) this.field4968);
    }
}
