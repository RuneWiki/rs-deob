package deob;

@ObfuscatedName("rr")
public class class453 extends class456 {

    @ObfuscatedName("rr.af")
    public int field4792 = 0;

    @ObfuscatedName("rr.an")
    public int field4787 = 0;

    @ObfuscatedName("rr.aw")
    public double field4791 = 0.0D;

    @ObfuscatedName("rr.ac")
    public double field4789 = 0.0D;

    @ObfuscatedName("rr.au")
    public double field4790 = 0.0D;

    @ObfuscatedName("rr.ab")
    public double field4793 = 0.0D;

    @ObfuscatedName("rr.aq")
    public double field4786 = 0.0D;

    public class453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field4792 = arg2;
        this.field4787 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field4791 = (double) arg3;
            this.field4789 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field4791 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4789 = (this.field4791 - var11) * var19 + var13;
            this.field4790 = Math.sqrt(Math.pow(this.field4791 - (double) arg0, 2.0D) + Math.pow(this.field4789 - (double) arg1, 2.0D));
            this.field4793 = Math.atan2((double) arg1 - this.field4789, (double) arg0 - this.field4791);
            double var23 = Math.atan2((double) arg7 - this.field4789, (double) arg6 - this.field4791);
            this.field4786 = Math.atan2((double) arg4 - this.field4789, (double) arg3 - this.field4791);
            boolean var25 = this.field4793 <= var23 && var23 <= this.field4786 || this.field4786 <= var23 && var23 <= this.field4793;
            if (!var25) {
                this.field4786 += (double) (this.field4793 - this.field4786 > 0.0D ? 2 : -2) * 3.141592653589793D;
            }
        }
    }

    @ObfuscatedName("rr.af(I)I")
    public int method7678() {
        double var1 = this.method7695();
        double var3 = (this.field4786 - this.field4793) * var1 + this.field4793;
        return (int) Math.round(this.field4791 + this.field4790 * Math.cos(var3));
    }

    @ObfuscatedName("rr.an(I)I")
    public int method7683() {
        double var1 = this.method7695();
        double var3 = (this.field4786 - this.field4793) * var1 + this.field4793;
        return (int) Math.round(this.field4789 + this.field4790 * Math.sin(var3));
    }

    @ObfuscatedName("rr.aw(B)I")
    public int method7676() {
        double var1 = this.method7695();
        return (int) Math.round((double) (this.field4787 - this.field4792) * var1 + (double) this.field4792);
    }
}
