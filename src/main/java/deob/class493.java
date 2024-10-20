package deob;

@ObfuscatedName("sl")
public class class493 extends class496 {

    @ObfuscatedName("sl.am")
    public int field4932 = 0;

    @ObfuscatedName("sl.ap")
    public int field4936 = 0;

    @ObfuscatedName("sl.af")
    public double field4934 = 0.0D;

    @ObfuscatedName("sl.aj")
    public double field4935 = 0.0D;

    @ObfuscatedName("sl.aq")
    public double field4933 = 0.0D;

    @ObfuscatedName("sl.ar")
    public double field4937 = 0.0D;

    @ObfuscatedName("sl.ag")
    public double field4938 = 0.0D;

    public class493(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field4932 = arg2;
        this.field4936 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field4934 = (double) arg3;
            this.field4935 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field4934 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4935 = (this.field4934 - var11) * var19 + var13;
            this.field4933 = Math.sqrt(Math.pow(this.field4934 - (double) arg0, 2.0D) + Math.pow(this.field4935 - (double) arg1, 2.0D));
            this.field4937 = Math.atan2((double) arg1 - this.field4935, (double) arg0 - this.field4934);
            double var23 = Math.atan2((double) arg7 - this.field4935, (double) arg6 - this.field4934);
            this.field4938 = Math.atan2((double) arg4 - this.field4935, (double) arg3 - this.field4934);
            boolean var25 = this.field4937 <= var23 && var23 <= this.field4938 || this.field4938 <= var23 && var23 <= this.field4937;
            if (!var25) {
                this.field4938 += 3.141592653589793D * (double) (this.field4937 - this.field4938 > 0.0D ? 2 : -2);
            }
        }
    }

    @ObfuscatedName("sl.am(I)I")
    public int method8022() {
        double var1 = this.method8037();
        double var3 = (this.field4938 - this.field4937) * var1 + this.field4937;
        return (int) Math.round(this.field4934 + this.field4933 * Math.cos(var3));
    }

    @ObfuscatedName("sl.ap(B)I")
    public int method8021() {
        double var1 = this.method8037();
        double var3 = (this.field4938 - this.field4937) * var1 + this.field4937;
        return (int) Math.round(this.field4935 + this.field4933 * Math.sin(var3));
    }

    @ObfuscatedName("sl.af(B)I")
    public int method8023() {
        double var1 = this.method8037();
        return (int) Math.round((double) (this.field4936 - this.field4932) * var1 + (double) this.field4932);
    }
}
