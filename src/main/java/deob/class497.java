package deob;

@ObfuscatedName("tf")
public class class497 extends class500 {

    @ObfuscatedName("tf.az")
    public int field4994 = 0;

    @ObfuscatedName("tf.ah")
    public int field4993 = 0;

    @ObfuscatedName("tf.af")
    public double field4998 = 0.0D;

    @ObfuscatedName("tf.at")
    public double field4992 = 0.0D;

    @ObfuscatedName("tf.an")
    public double field4996 = 0.0D;

    @ObfuscatedName("tf.ao")
    public double field4995 = 0.0D;

    @ObfuscatedName("tf.ab")
    public double field4997 = 0.0D;

    public class497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field4994 = arg2;
        this.field4993 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field4998 = (double) arg3;
            this.field4992 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field4998 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4992 = (this.field4998 - var11) * var19 + var13;
            this.field4996 = Math.sqrt(Math.pow(this.field4998 - (double) arg0, 2.0D) + Math.pow(this.field4992 - (double) arg1, 2.0D));
            this.field4995 = Math.atan2((double) arg1 - this.field4992, (double) arg0 - this.field4998);
            double var23 = Math.atan2((double) arg7 - this.field4992, (double) arg6 - this.field4998);
            this.field4997 = Math.atan2((double) arg4 - this.field4992, (double) arg3 - this.field4998);
            boolean var25 = this.field4995 <= var23 && var23 <= this.field4997 || this.field4997 <= var23 && var23 <= this.field4995;
            if (!var25) {
                this.field4997 += (double) (this.field4995 - this.field4997 > 0.0D ? 2 : -2) * 3.141592653589793D;
            }
        }
    }

    @ObfuscatedName("tf.az(B)I")
    public int method7897() {
        double var1 = this.method7912();
        double var3 = (this.field4997 - this.field4995) * var1 + this.field4995;
        return (int) Math.round(this.field4998 + this.field4996 * Math.cos(var3));
    }

    @ObfuscatedName("tf.ah(B)I")
    public int method7895() {
        double var1 = this.method7912();
        double var3 = (this.field4997 - this.field4995) * var1 + this.field4995;
        return (int) Math.round(this.field4992 + this.field4996 * Math.sin(var3));
    }

    @ObfuscatedName("tf.af(I)I")
    public int method7894() {
        double var1 = this.method7912();
        return (int) Math.round((double) (this.field4993 - this.field4994) * var1 + (double) this.field4994);
    }
}
