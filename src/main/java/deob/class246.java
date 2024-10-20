package deob;

@ObfuscatedName("io")
public class class246 extends class195 {

    @ObfuscatedName("io.x")
    public static class190 field3314 = new class190(64);

    @ObfuscatedName("io.y")
    public static class190 field3308 = new class190(30);

    @ObfuscatedName("io.e")
    public int field3318;

    @ObfuscatedName("io.f")
    public int field3307;

    @ObfuscatedName("io.v")
    public int field3310 = -1;

    @ObfuscatedName("io.t")
    public short[] field3312;

    @ObfuscatedName("io.i")
    public short[] field3313;

    @ObfuscatedName("io.r")
    public short[] field3306;

    @ObfuscatedName("io.g")
    public short[] field3315;

    @ObfuscatedName("io.s")
    public int field3316 = 128;

    @ObfuscatedName("io.o")
    public int field3317 = 128;

    @ObfuscatedName("io.p")
    public int field3305 = 0;

    @ObfuscatedName("io.u")
    public int field3309 = 0;

    @ObfuscatedName("io.b")
    public int field3320 = 0;

    @ObfuscatedName("ah.d(IB)Lio;")
    public static class246 method465(int arg0) {
        class246 var1 = (class246) field3314.method3252((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3311.method3750(13, arg0);
        class246 var3 = new class246();
        var3.field3318 = arg0;
        if (var2 != null) {
            var3.method3936(new class174(var2));
        }
        field3314.method3256(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("io.q(Lfw;I)V")
    public void method3936(class174 arg0) {
        while (true) {
            int var2 = arg0.method2921();
            if (var2 == 0) {
                return;
            }
            this.method3938(arg0, var2);
        }
    }

    @ObfuscatedName("io.x(Lfw;II)V")
    public void method3938(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3307 = arg0.method2916();
        } else if (arg1 == 2) {
            this.field3310 = arg0.method2916();
        } else if (arg1 == 4) {
            this.field3316 = arg0.method2916();
        } else if (arg1 == 5) {
            this.field3317 = arg0.method2916();
        } else if (arg1 == 6) {
            this.field3305 = arg0.method2916();
        } else if (arg1 == 7) {
            this.field3309 = arg0.method2921();
        } else if (arg1 == 8) {
            this.field3320 = arg0.method2921();
        } else if (arg1 == 40) {
            int var3 = arg0.method2921();
            this.field3312 = new short[var3];
            this.field3313 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3312[var4] = (short) arg0.method2916();
                this.field3313[var4] = (short) arg0.method2916();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2921();
            this.field3306 = new short[var5];
            this.field3315 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3306[var6] = (short) arg0.method2916();
                this.field3315[var6] = (short) arg0.method2916();
            }
        }
    }

    @ObfuscatedName("io.y(II)Lev;")
    public final class134 method3935(int arg0) {
        class134 var2 = (class134) field3308.method3252((long) this.field3318);
        if (var2 == null) {
            class128 var3 = class128.method2238(Statics.field3319, this.field3307, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3312 != null) {
                for (int var4 = 0; var4 < this.field3312.length; var4++) {
                    var3.method2226(this.field3312[var4], this.field3313[var4]);
                }
            }
            if (this.field3306 != null) {
                for (int var5 = 0; var5 < this.field3306.length; var5++) {
                    var3.method2190(this.field3306[var5], this.field3315[var5]);
                }
            }
            var2 = var3.method2246(this.field3309 + 64, this.field3320 + 850, -30, -50, -30);
            field3308.method3256(var2, (long) this.field3318);
        }
        class134 var6;
        if (this.field3310 == -1 || arg0 == -1) {
            var6 = var2.method2288(true);
        } else {
            var6 = class261.method494(this.field3310).method4309(var2, arg0);
        }
        if (this.field3316 != 128 || this.field3317 != 128) {
            var6.method2282(this.field3316, this.field3317, this.field3316);
        }
        if (this.field3305 != 0) {
            if (this.field3305 == 90) {
                var6.method2277();
            }
            if (this.field3305 == 180) {
                var6.method2277();
                var6.method2277();
            }
            if (this.field3305 == 270) {
                var6.method2277();
                var6.method2277();
                var6.method2277();
            }
        }
        return var6;
    }

    @ObfuscatedName("ag.e(I)V")
    public static void method233() {
        field3314.method3250();
        field3308.method3250();
    }
}
