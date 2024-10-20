package deob;

@ObfuscatedName("iv")
public class class247 extends class196 {

    @ObfuscatedName("iv.f")
    public static class191 field3311 = new class191(64);

    @ObfuscatedName("iv.p")
    public static class191 field3324 = new class191(30);

    @ObfuscatedName("iv.x")
    public int field3315;

    @ObfuscatedName("iv.g")
    public int field3316;

    @ObfuscatedName("iv.c")
    public int field3317 = -1;

    @ObfuscatedName("iv.l")
    public short[] field3318;

    @ObfuscatedName("iv.w")
    public short[] field3323;

    @ObfuscatedName("iv.b")
    public short[] field3320;

    @ObfuscatedName("iv.o")
    public short[] field3321;

    @ObfuscatedName("iv.m")
    public int field3322 = 128;

    @ObfuscatedName("iv.i")
    public int field3326 = 128;

    @ObfuscatedName("iv.s")
    public int field3314 = 0;

    @ObfuscatedName("iv.r")
    public int field3325 = 0;

    @ObfuscatedName("iv.e")
    public int field3319 = 0;

    @ObfuscatedName("as.j(II)Liv;")
    public static class247 method473(int arg0) {
        class247 var1 = (class247) field3311.method3271((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3313.method3773(13, arg0);
        class247 var3 = new class247();
        var3.field3315 = arg0;
        if (var2 != null) {
            var3.method4011(new class175(var2));
        }
        field3311.method3270(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.h(Lfb;I)V")
    public void method4011(class175 arg0) {
        while (true) {
            int var2 = arg0.method2903();
            if (var2 == 0) {
                return;
            }
            this.method4008(arg0, var2);
        }
    }

    @ObfuscatedName("iv.f(Lfb;II)V")
    public void method4008(class175 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3316 = arg0.method3023();
        } else if (arg1 == 2) {
            this.field3317 = arg0.method3023();
        } else if (arg1 == 4) {
            this.field3322 = arg0.method3023();
        } else if (arg1 == 5) {
            this.field3326 = arg0.method3023();
        } else if (arg1 == 6) {
            this.field3314 = arg0.method3023();
        } else if (arg1 == 7) {
            this.field3325 = arg0.method2903();
        } else if (arg1 == 8) {
            this.field3319 = arg0.method2903();
        } else if (arg1 == 40) {
            int var3 = arg0.method2903();
            this.field3318 = new short[var3];
            this.field3323 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3318[var4] = (short) arg0.method3023();
                this.field3323[var4] = (short) arg0.method3023();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2903();
            this.field3320 = new short[var5];
            this.field3321 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3320[var6] = (short) arg0.method3023();
                this.field3321[var6] = (short) arg0.method3023();
            }
        }
    }

    @ObfuscatedName("iv.p(II)Leo;")
    public final class135 method4012(int arg0) {
        class135 var2 = (class135) field3324.method3271((long) this.field3315);
        if (var2 == null) {
            class129 var3 = class129.method2208(Statics.field3312, this.field3316, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3318 != null) {
                for (int var4 = 0; var4 < this.field3318.length; var4++) {
                    var3.method2241(this.field3318[var4], this.field3323[var4]);
                }
            }
            if (this.field3320 != null) {
                for (int var5 = 0; var5 < this.field3320.length; var5++) {
                    var3.method2223(this.field3320[var5], this.field3321[var5]);
                }
            }
            var2 = var3.method2229(this.field3325 + 64, this.field3319 + 850, -30, -50, -30);
            field3324.method3270(var2, (long) this.field3315);
        }
        class135 var6;
        if (this.field3317 == -1 || arg0 == -1) {
            var6 = var2.method2303(true);
        } else {
            var6 = class262.method1389(this.field3317).method4359(var2, arg0);
        }
        if (this.field3322 != 128 || this.field3326 != 128) {
            var6.method2316(this.field3322, this.field3326, this.field3322);
        }
        if (this.field3314 != 0) {
            if (this.field3314 == 90) {
                var6.method2312();
            }
            if (this.field3314 == 180) {
                var6.method2312();
                var6.method2312();
            }
            if (this.field3314 == 270) {
                var6.method2312();
                var6.method2312();
                var6.method2312();
            }
        }
        return var6;
    }
}
