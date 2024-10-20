package deob;

@ObfuscatedName("jz")
public class class240 {

    @ObfuscatedName("jz.at")
    public static boolean field2769 = false;

    @ObfuscatedName("jz.an")
    public static int field2764 = 0;

    @ObfuscatedName("jz.av")
    public static int field2765 = 0;

    @ObfuscatedName("jz.as")
    public static boolean field2766 = false;

    @ObfuscatedName("jz.ad")
    public static int field2770 = 0;

    @ObfuscatedName("jz.ac")
    public static long[] field2773 = new long[1000];

    public class240() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ba.at(J)Z")
    public static boolean method556(long arg0) {
        boolean var2 = arg0 != 0L;
        if (var2) {
            boolean var3 = (int) (arg0 >>> 16 & 0x1L) == 1;
            var2 = !var3;
        }
        return var2;
    }

    @ObfuscatedName("ac.an(IB)I")
    public static int method178(int arg0) {
        long var1 = field2773[arg0];
        return (int) (var1 >>> 0 & 0x7FL);
    }

    @ObfuscatedName("gz.av(J)I")
    public static int method3097(long arg0) {
        return (int) (arg0 >>> 7 & 0x7FL);
    }

    @ObfuscatedName("fl.as(IB)I")
    public static int method2878(int arg0) {
        long var1 = field2773[arg0];
        return (int) (var1 >>> 14 & 0x3L);
    }

    @ObfuscatedName("qc.ax(II)I")
    public static int method7324(int arg0) {
        return method3900(field2773[arg0]);
    }

    @ObfuscatedName("is.ap(J)I")
    public static int method3900(long arg0) {
        return (int) (arg0 >>> 17 & 0xFFFFFFFFL);
    }

    @ObfuscatedName("pb.ab(IIIZIB)J")
    public static long method6770(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        long var5 = (long) ((arg0 & 0x7F) << 0 | (arg1 & 0x7F) << 7 | (arg2 & 0x3) << 14) | ((long) arg4 & 0xFFFFFFFFL) << 17;
        if (arg3) {
            var5 |= 0x10000L;
        }
        return var5;
    }

    @ObfuscatedName("aj.ak(J)V")
    public static final void method156(long arg0) {
        field2773[++field2770 - 1] = arg0;
    }

    @ObfuscatedName("jx.ae(I)I")
    public static final int method4553() {
        return field2764;
    }

    @ObfuscatedName("ew.af(I)V")
    public static final void method2733() {
        if (field2766) {
            return;
        }
        int var0 = Statics.field2572;
        int var1 = Statics.field2573;
        int var2 = Statics.field2574;
        int var3 = Statics.field2575;
        byte var4 = 50;
        short var5 = 3500;
        int var6 = (field2764 - class226.method4015()) * var4 / class226.method4014();
        int var7 = (field2765 - class226.method4016()) * var4 / class226.method4014();
        int var8 = (field2764 - class226.method4015()) * var5 / class226.method4014();
        int var9 = (field2765 - class226.method4016()) * var5 / class226.method4014();
        int var10 = Statics.method3209(var7, var4, var1, var0);
        int var11 = var1 * var4 - var0 * var7 >> 16;
        int var14 = Statics.method3209(var9, var5, var1, var0);
        int var15 = var1 * var5 - var0 * var9 >> 16;
        int var18 = class238.method3092(var6, var11, var3, var2);
        int var19 = class238.method2317(var6, var11, var3, var2);
        int var21 = class238.method3092(var8, var15, var3, var2);
        int var22 = class238.method2317(var8, var15, var3, var2);
        Statics.field1854 = (var18 + var21) / 2;
        Statics.field2767 = (var10 + var14) / 2;
        Statics.field2768 = (var19 + var22) / 2;
        Statics.field2763 = (var21 - var18) / 2;
        Statics.field5 = (var14 - var10) / 2;
        Statics.field1906 = (var22 - var19) / 2;
        Statics.field4437 = Math.abs(Statics.field2763);
        Statics.field3783 = Math.abs(Statics.field5);
        Statics.field1586 = Math.abs(Statics.field1906);
    }

    @ObfuscatedName("li.ao(IIIIIIIS)Z")
    public static final boolean method5132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = field2765 + arg6;
        if (var7 < arg0 && var7 < arg1 && var7 < arg2) {
            return false;
        }
        int var8 = field2765 - arg6;
        if (var8 > arg0 && var8 > arg1 && var8 > arg2) {
            return false;
        }
        int var9 = field2764 + arg6;
        if (var9 < arg3 && var9 < arg4 && var9 < arg5) {
            return false;
        } else {
            int var10 = field2764 - arg6;
            return var10 <= arg3 || var10 <= arg4 || var10 <= arg5;
        }
    }
}
