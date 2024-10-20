package deob;

@ObfuscatedName("rw")
public abstract class class457 {

    @ObfuscatedName("rw.al")
    public int field4804 = 0;

    @ObfuscatedName("rw.at")
    public int field4802 = 0;

    @ObfuscatedName("rw.aa")
    public double field4805 = 0.0D;

    @ObfuscatedName("rw.ay")
    public int field4803 = 0;

    public class457(int arg0, int arg1) {
        this.field4804 = arg0;
        this.field4802 = 0;
        this.field4803 = arg1 >= 0 && arg1 <= 27 ? arg1 : 0;
        this.field4805 = method1949(this.field4802, this.field4804, this.field4803);
    }

    @ObfuscatedName("rw.aa(I)V")
    public void method7689() {
        if (this.field4802 < this.field4804) {
            this.field4802++;
            this.field4805 = method1949(this.field4802, this.field4804, this.field4803);
        }
    }

    @ObfuscatedName("rw.ay(I)D")
    public double method7695() {
        return this.field4805;
    }

    @ObfuscatedName("co.ao(IIII)D")
    public static double method1949(int arg0, int arg1, int arg2) {
        double var3 = arg1 > 0 ? (double) Math.max(0.0F, Math.min(1.0F, (float) arg0 / (float) arg1)) : 1.0D;
        if ((var3 <= 0.0D) || (var3 >= 1.0D)) {
            return var3 <= 0.0D ? 0.0D : 1.0D;
        }
        switch(arg2) {
            case 0:
                return var3;
            case 1:
                return 1.0D - Math.cos(var3 * 3.141592653589793D / 2.0D);
            case 2:
                return Math.sin(var3 * 3.141592653589793D / 2.0D);
            case 3:
                return -(Math.cos(var3 * 3.141592653589793D) - 1.0D) / 2.0D;
            case 4:
                return var3 * var3;
            case 5:
                return 1.0D - (1.0D - var3) * (1.0D - var3);
            case 6:
                return var3 < 0.5D ? var3 * 2.0D * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 2.0D) / 2.0D;
            case 7:
                return var3 * var3 * var3;
            case 8:
                return 1.0D - Math.pow(1.0D - var3, 3.0D);
            case 9:
                return var3 < 0.5D ? var3 * 4.0D * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 3.0D) / 2.0D;
            case 10:
                return var3 * var3 * var3 * var3;
            case 11:
                return 1.0D - Math.pow(1.0D - var3, 4.0D);
            case 12:
                return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 4.0D) / 2.0D;
            case 13:
                return var3 * var3 * var3 * var3 * var3;
            case 14:
                return 1.0D - Math.pow(1.0D - var3, 5.0D);
            case 15:
                return var3 < 0.5D ? var3 * 8.0D * var3 * var3 * var3 * var3 : 1.0D - Math.pow(var3 * -2.0D + 2.0D, 5.0D) / 2.0D;
            case 16:
                return Math.pow(2.0D, var3 * 10.0D - 10.0D);
            case 17:
                return 1.0D - Math.pow(2.0D, var3 * -10.0D);
            case 18:
                return var3 < 0.5D ? Math.pow(2.0D, var3 * 20.0D + 10.0D) / 2.0D : (2.0D - Math.pow(2.0D, var3 * -20.0D + 10.0D)) / 2.0D;
            case 19:
                return 1.0D - Math.sqrt(1.0D - Math.pow(var3, 2.0D));
            case 20:
                return Math.sqrt(1.0D - Math.pow(var3 - 1.0D, 2.0D));
            case 21:
                return var3 < 0.5D ? (1.0D - Math.sqrt(1.0D - Math.pow(var3 * 2.0D, 2.0D))) / 2.0D : (Math.sqrt(1.0D - Math.pow(var3 * -2.0D + 2.0D, 2.0D)) + 1.0D) / 2.0D;
            case 22:
                double var21 = 1.70158D;
                double var23 = 2.70158D;
                return var3 * 2.70158D * var3 * var3 - var3 * 1.70158D * var3;
            case 23:
                double var17 = 1.70158D;
                double var19 = 2.70158D;
                return 1.0D + 2.70158D * Math.pow(var3 - 1.0D, 3.0D) + 1.70158D * Math.pow(var3 - 1.0D, 2.0D);
            case 24:
                double var13 = 1.70158D;
                double var15 = 2.5949095D;
                return var3 < 0.5D ? Math.pow(var3 * 2.0D, 2.0D) * (var3 * 7.189819D - 2.5949095D) / 2.0D : (Math.pow(var3 * 2.0D - 2.0D, 2.0D) * ((var3 * 2.0D - 2.0D) * 3.5949095D + 2.5949095D) + 2.0D) / 2.0D;
            case 25:
                double var11 = 2.0943951023931953D;
                return -Math.pow(2.0D, var3 * 10.0D - 10.0D) * Math.sin((var3 * 10.0D - 10.75D) * 2.0943951023931953D);
            case 26:
                double var9 = 2.0943951023931953D;
                return Math.pow(2.0D, var3 * -10.0D) * Math.sin((var3 * 10.0D - 0.75D) * 2.0943951023931953D) + 1.0D;
            case 27:
                double var5 = 1.3962634015954636D;
                double var7 = Math.sin((var3 * 20.0D - 11.125D) * 1.3962634015954636D);
                return var3 < 0.5D ? -(Math.pow(2.0D, var3 * 20.0D - 10.0D) * var7) / 2.0D : Math.pow(2.0D, var3 * -20.0D + 10.0D) * var7 / 2.0D + 1.0D;
            default:
                return var3;
        }
    }
}