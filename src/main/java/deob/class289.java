package deob;

@ObfuscatedName("kb")
public class class289 extends class346 {

    @ObfuscatedName("kb.u")
    public static class199 field3524 = new class199(64);

    @ObfuscatedName("kb.p")
    public static class199 field3529 = new class199(30);

    @ObfuscatedName("kb.b")
    public int field3526;

    @ObfuscatedName("kb.e")
    public int field3527;

    @ObfuscatedName("kb.k")
    public int field3528 = -1;

    @ObfuscatedName("kb.g")
    public short[] field3522;

    @ObfuscatedName("kb.h")
    public short[] field3530;

    @ObfuscatedName("kb.n")
    public short[] field3531;

    @ObfuscatedName("kb.l")
    public short[] field3532;

    @ObfuscatedName("kb.m")
    public int field3533 = 128;

    @ObfuscatedName("kb.d")
    public int field3534 = 128;

    @ObfuscatedName("kb.c")
    public int field3525 = 0;

    @ObfuscatedName("kb.j")
    public int field3537 = 0;

    @ObfuscatedName("kb.r")
    public int field3535 = 0;

    @ObfuscatedName("hw.f(II)Lkb;")
    public static class289 method3663(int arg0) {
        class289 var1 = (class289) field3524.method3398((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3536.method3933(13, arg0);
        class289 var3 = new class289();
        var3.field3526 = arg0;
        if (var2 != null) {
            var3.method4482(new class382(var2));
        }
        field3524.method3400(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("kb.o(Lnu;B)V")
    public void method4482(class382 arg0) {
        while (true) {
            int var2 = arg0.method5856();
            if (var2 == 0) {
                return;
            }
            this.method4472(arg0, var2);
        }
    }

    @ObfuscatedName("kb.u(Lnu;II)V")
    public void method4472(class382 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3527 = arg0.method5858();
        } else if (arg1 == 2) {
            this.field3528 = arg0.method5858();
        } else if (arg1 == 4) {
            this.field3533 = arg0.method5858();
        } else if (arg1 == 5) {
            this.field3534 = arg0.method5858();
        } else if (arg1 == 6) {
            this.field3525 = arg0.method5858();
        } else if (arg1 == 7) {
            this.field3537 = arg0.method5856();
        } else if (arg1 == 8) {
            this.field3535 = arg0.method5856();
        } else if (arg1 == 40) {
            int var3 = arg0.method5856();
            this.field3522 = new short[var3];
            this.field3530 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3522[var4] = (short) arg0.method5858();
                this.field3530[var4] = (short) arg0.method5858();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5856();
            this.field3531 = new short[var5];
            this.field3532 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3531[var6] = (short) arg0.method5858();
                this.field3532[var6] = (short) arg0.method5858();
            }
        }
    }

    @ObfuscatedName("kb.p(II)Lgv;")
    public final class183 method4473(int arg0) {
        class183 var2 = (class183) field3529.method3398((long) this.field3526);
        if (var2 == null) {
            class169 var3 = class169.method2839(Statics.field3523, this.field3527, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3522 != null) {
                for (int var4 = 0; var4 < this.field3522.length; var4++) {
                    var3.method2852(this.field3522[var4], this.field3530[var4]);
                }
            }
            if (this.field3531 != null) {
                for (int var5 = 0; var5 < this.field3531.length; var5++) {
                    var3.method2842(this.field3531[var5], this.field3532[var5]);
                }
            }
            var2 = var3.method2860(this.field3537 + 64, this.field3535 + 850, -30, -50, -30);
            field3529.method3400(var2, (long) this.field3526);
        }
        class183 var6;
        if (this.field3528 == -1 || arg0 == -1) {
            var6 = var2.method3301(true);
        } else {
            var6 = class298.method3795(this.field3528).method4744(var2, arg0);
        }
        if (this.field3533 != 128 || this.field3534 != 128) {
            var6.method3252(this.field3533, this.field3534, this.field3533);
        }
        if (this.field3525 != 0) {
            if (this.field3525 == 90) {
                var6.method3247();
            }
            if (this.field3525 == 180) {
                var6.method3247();
                var6.method3247();
            }
            if (this.field3525 == 270) {
                var6.method3247();
                var6.method3247();
                var6.method3247();
            }
        }
        return var6;
    }
}
