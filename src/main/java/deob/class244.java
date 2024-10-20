package deob;

@ObfuscatedName("im")
public class class244 extends class176 {

    @ObfuscatedName("im.n")
    public static class146 field3233 = new class146(64);

    @ObfuscatedName("im.q")
    public static class146 field3227 = new class146(30);

    @ObfuscatedName("im.v")
    public int field3228;

    @ObfuscatedName("im.l")
    public int field3234;

    @ObfuscatedName("im.c")
    public int field3225 = -1;

    @ObfuscatedName("im.o")
    public short[] field3231;

    @ObfuscatedName("im.i")
    public short[] field3224;

    @ObfuscatedName("im.d")
    public short[] field3230;

    @ObfuscatedName("im.m")
    public short[] field3226;

    @ObfuscatedName("im.p")
    public int field3235 = 128;

    @ObfuscatedName("im.h")
    public int field3236 = 128;

    @ObfuscatedName("im.k")
    public int field3237 = 0;

    @ObfuscatedName("im.x")
    public int field3238 = 0;

    @ObfuscatedName("im.j")
    public int field3239 = 0;

    @ObfuscatedName("cp.a(Lhq;Lhq;I)V")
    public static void method2189(class234 arg0, class234 arg1) {
        Statics.field3229 = arg0;
        Statics.field3232 = arg1;
    }

    @ObfuscatedName("cd.t(II)Lim;")
    public static class244 method1992(int arg0) {
        class244 var1 = (class244) field3233.method3120((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3229.method3873(13, arg0);
        class244 var3 = new class244();
        var3.field3228 = arg0;
        if (var2 != null) {
            var3.method4117(new class300(var2));
        }
        field3233.method3122(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.n(Lkc;B)V")
    public void method4117(class300 arg0) {
        while (true) {
            int var2 = arg0.method5123();
            if (var2 == 0) {
                return;
            }
            this.method4118(arg0, var2);
        }
    }

    @ObfuscatedName("im.q(Lkc;II)V")
    public void method4118(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3234 = arg0.method5166();
        } else if (arg1 == 2) {
            this.field3225 = arg0.method5166();
        } else if (arg1 == 4) {
            this.field3235 = arg0.method5166();
        } else if (arg1 == 5) {
            this.field3236 = arg0.method5166();
        } else if (arg1 == 6) {
            this.field3237 = arg0.method5166();
        } else if (arg1 == 7) {
            this.field3238 = arg0.method5123();
        } else if (arg1 == 8) {
            this.field3239 = arg0.method5123();
        } else if (arg1 == 40) {
            int var3 = arg0.method5123();
            this.field3231 = new short[var3];
            this.field3224 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3231[var4] = (short) arg0.method5166();
                this.field3224[var4] = (short) arg0.method5166();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5123();
            this.field3230 = new short[var5];
            this.field3226 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3230[var6] = (short) arg0.method5166();
                this.field3226[var6] = (short) arg0.method5166();
            }
        }
    }

    @ObfuscatedName("im.v(II)Ldv;")
    public final class128 method4119(int arg0) {
        class128 var2 = (class128) field3227.method3120((long) this.field3228);
        if (var2 == null) {
            class122 var3 = class122.method2685(Statics.field3232, this.field3234, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3231 != null) {
                for (int var4 = 0; var4 < this.field3231.length; var4++) {
                    var3.method2640(this.field3231[var4], this.field3224[var4]);
                }
            }
            if (this.field3230 != null) {
                for (int var5 = 0; var5 < this.field3230.length; var5++) {
                    var3.method2653(this.field3230[var5], this.field3226[var5]);
                }
            }
            var2 = var3.method2660(this.field3238 + 64, this.field3239 + 850, -30, -50, -30);
            field3227.method3122(var2, (long) this.field3228);
        }
        class128 var6;
        if (this.field3225 == -1 || arg0 == -1) {
            var6 = var2.method2732(true);
        } else {
            var6 = class259.method3856(this.field3225).method4456(var2, arg0);
        }
        if (this.field3235 != 128 || this.field3236 != 128) {
            var6.method2746(this.field3235, this.field3236, this.field3235);
        }
        if (this.field3237 != 0) {
            if (this.field3237 == 90) {
                var6.method2741();
            }
            if (this.field3237 == 180) {
                var6.method2741();
                var6.method2741();
            }
            if (this.field3237 == 270) {
                var6.method2741();
                var6.method2741();
                var6.method2741();
            }
        }
        return var6;
    }

    @ObfuscatedName("cw.l(B)V")
    public static void method1990() {
        field3233.method3123();
        field3227.method3123();
    }
}
