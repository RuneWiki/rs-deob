package deob;

@ObfuscatedName("im")
public class class244 extends class176 {

    @ObfuscatedName("im.t")
    public static class146 field3216 = new class146(64);

    @ObfuscatedName("im.g")
    public static class146 field3217 = new class146(30);

    @ObfuscatedName("im.l")
    public int field3229;

    @ObfuscatedName("im.u")
    public int field3226;

    @ObfuscatedName("im.j")
    public int field3220 = -1;

    @ObfuscatedName("im.v")
    public short[] field3221;

    @ObfuscatedName("im.d")
    public short[] field3222;

    @ObfuscatedName("im.z")
    public short[] field3223;

    @ObfuscatedName("im.n")
    public short[] field3224;

    @ObfuscatedName("im.h")
    public int field3225 = 128;

    @ObfuscatedName("im.f")
    public int field3214 = 128;

    @ObfuscatedName("im.s")
    public int field3227 = 0;

    @ObfuscatedName("im.p")
    public int field3228 = 0;

    @ObfuscatedName("im.e")
    public int field3219 = 0;

    @ObfuscatedName("in.c(II)Lim;")
    public static class244 method3966(int arg0) {
        class244 var1 = (class244) field3216.method3061((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3215.method3825(13, arg0);
        class244 var3 = new class244();
        var3.field3229 = arg0;
        if (var2 != null) {
            var3.method4080(new class300(var2));
        }
        field3216.method3062(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("im.x(Lkz;I)V")
    public void method4080(class300 arg0) {
        while (true) {
            int var2 = arg0.method5103();
            if (var2 == 0) {
                return;
            }
            this.method4087(arg0, var2);
        }
    }

    @ObfuscatedName("im.t(Lkz;IB)V")
    public void method4087(class300 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3226 = arg0.method5304();
        } else if (arg1 == 2) {
            this.field3220 = arg0.method5304();
        } else if (arg1 == 4) {
            this.field3225 = arg0.method5304();
        } else if (arg1 == 5) {
            this.field3214 = arg0.method5304();
        } else if (arg1 == 6) {
            this.field3227 = arg0.method5304();
        } else if (arg1 == 7) {
            this.field3228 = arg0.method5103();
        } else if (arg1 == 8) {
            this.field3219 = arg0.method5103();
        } else if (arg1 == 40) {
            int var3 = arg0.method5103();
            this.field3221 = new short[var3];
            this.field3222 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3221[var4] = (short) arg0.method5304();
                this.field3222[var4] = (short) arg0.method5304();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method5103();
            this.field3223 = new short[var5];
            this.field3224 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3223[var6] = (short) arg0.method5304();
                this.field3224[var6] = (short) arg0.method5304();
            }
        }
    }

    @ObfuscatedName("im.g(II)Ldr;")
    public final class128 method4082(int arg0) {
        class128 var2 = (class128) field3217.method3061((long) this.field3229);
        if (var2 == null) {
            class122 var3 = class122.method2525(Statics.field3218, this.field3226, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3221 != null) {
                for (int var4 = 0; var4 < this.field3221.length; var4++) {
                    var3.method2537(this.field3221[var4], this.field3222[var4]);
                }
            }
            if (this.field3223 != null) {
                for (int var5 = 0; var5 < this.field3223.length; var5++) {
                    var3.method2538(this.field3223[var5], this.field3224[var5]);
                }
            }
            var2 = var3.method2545(this.field3228 + 64, this.field3219 + 850, -30, -50, -30);
            field3217.method3062(var2, (long) this.field3229);
        }
        class128 var6;
        if (this.field3220 == -1 || arg0 == -1) {
            var6 = var2.method2667(true);
        } else {
            var6 = class259.method1897(this.field3220).method4452(var2, arg0);
        }
        if (this.field3225 != 128 || this.field3214 != 128) {
            var6.method2647(this.field3225, this.field3214, this.field3225);
        }
        if (this.field3227 != 0) {
            if (this.field3227 == 90) {
                var6.method2642();
            }
            if (this.field3227 == 180) {
                var6.method2642();
                var6.method2642();
            }
            if (this.field3227 == 270) {
                var6.method2642();
                var6.method2642();
                var6.method2642();
            }
        }
        return var6;
    }
}
