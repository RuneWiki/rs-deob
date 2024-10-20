package deob;

@ObfuscatedName("ri")
public class class465 extends class468 {

    @ObfuscatedName("ri.at")
    public int field4800 = 0;

    @ObfuscatedName("ri.an")
    public int field4798 = 0;

    @ObfuscatedName("ri.av")
    public double field4797 = 0.0D;

    @ObfuscatedName("ri.as")
    public double field4799 = 0.0D;

    @ObfuscatedName("ri.ax")
    public double field4801 = 0.0D;

    @ObfuscatedName("ri.ap")
    public double field4802 = 0.0D;

    @ObfuscatedName("ri.ab")
    public double field4803 = 0.0D;

    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(arg8, arg9);
        this.field4800 = arg2;
        this.field4798 = arg5;
        if ((arg6 - arg0) * (arg4 - arg7) == (arg7 - arg1) * (arg3 - arg6)) {
            this.field4797 = (double) arg3;
            this.field4799 = (double) arg4;
        } else {
            double var11 = (double) ((float) (arg0 + arg6)) / 2.0D;
            double var13 = (double) ((float) (arg1 + arg7)) / 2.0D;
            double var15 = (double) ((float) (arg3 + arg6)) / 2.0D;
            double var17 = (double) ((float) (arg4 + arg7)) / 2.0D;
            double var19 = (double) (arg6 - arg0) * -1.0D / (double) (arg7 - arg1);
            double var21 = (double) (arg3 - arg6) * -1.0D / (double) (arg4 - arg7);
            this.field4797 = (var11 * var19 - var15 * var21 + var17 - var13) / (var19 - var21);
            this.field4799 = (this.field4797 - var11) * var19 + var13;
            this.field4801 = Math.sqrt(Math.pow(this.field4797 - (double) arg0, 2.0D) + Math.pow(this.field4799 - (double) arg1, 2.0D));
            this.field4802 = Math.atan2((double) arg1 - this.field4799, (double) arg0 - this.field4797);
            double var23 = Math.atan2((double) arg7 - this.field4799, (double) arg6 - this.field4797);
            this.field4803 = Math.atan2((double) arg4 - this.field4799, (double) arg3 - this.field4797);
            boolean var25 = this.field4802 <= var23 && var23 <= this.field4803 || this.field4803 <= var23 && var23 <= this.field4802;
            if (!var25) {
                this.field4803 += (double) (this.field4802 - this.field4803 > 0.0D ? 2 : -2) * 3.141592653589793D;
            }
        }
    }

    @ObfuscatedName("ri.at(I)I")
    public int method7593() {
        double var1 = this.method7612();
        double var3 = (this.field4803 - this.field4802) * var1 + this.field4802;
        return (int) Math.round(this.field4797 + this.field4801 * Math.cos(var3));
    }

    @ObfuscatedName("ri.an(I)I")
    public int method7595() {
        double var1 = this.method7612();
        double var3 = (this.field4803 - this.field4802) * var1 + this.field4802;
        return (int) Math.round(this.field4799 + this.field4801 * Math.sin(var3));
    }

    @ObfuscatedName("ri.av(I)I")
    public int method7597() {
        double var1 = this.method7612();
        return (int) Math.round((double) (this.field4798 - this.field4800) * var1 + (double) this.field4800);
    }
}
