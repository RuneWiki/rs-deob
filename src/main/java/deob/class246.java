package deob;

@ObfuscatedName("ir")
public class class246 extends class195 {

    @ObfuscatedName("ir.a")
    public static class190 field3331 = new class190(64);

    @ObfuscatedName("ir.t")
    public static class190 field3334 = new class190(30);

    @ObfuscatedName("ir.s")
    public int field3335;

    @ObfuscatedName("ir.r")
    public int field3346;

    @ObfuscatedName("ir.v")
    public int field3333 = -1;

    @ObfuscatedName("ir.y")
    public short[] field3338;

    @ObfuscatedName("ir.j")
    public short[] field3336;

    @ObfuscatedName("ir.k")
    public short[] field3337;

    @ObfuscatedName("ir.e")
    public short[] field3341;

    @ObfuscatedName("ir.o")
    public int field3342 = 128;

    @ObfuscatedName("ir.z")
    public int field3343 = 128;

    @ObfuscatedName("ir.l")
    public int field3344 = 0;

    @ObfuscatedName("ir.c")
    public int field3345 = 0;

    @ObfuscatedName("ir.m")
    public int field3340 = 0;

    @ObfuscatedName("eb.i(IB)Lir;")
    public static class246 method2634(int arg0) {
        class246 var1 = (class246) field3331.method3235((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3348.method3768(13, arg0);
        class246 var3 = new class246();
        var3.field3335 = arg0;
        if (var2 != null) {
            var3.method3982(new class174(var2));
        }
        field3331.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.w(Lfp;I)V")
    public void method3982(class174 arg0) {
        while (true) {
            int var2 = arg0.method3061();
            if (var2 == 0) {
                return;
            }
            this.method3978(arg0, var2);
        }
    }

    @ObfuscatedName("ir.a(Lfp;II)V")
    public void method3978(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3346 = arg0.method2882();
        } else if (arg1 == 2) {
            this.field3333 = arg0.method2882();
        } else if (arg1 == 4) {
            this.field3342 = arg0.method2882();
        } else if (arg1 == 5) {
            this.field3343 = arg0.method2882();
        } else if (arg1 == 6) {
            this.field3344 = arg0.method2882();
        } else if (arg1 == 7) {
            this.field3345 = arg0.method3061();
        } else if (arg1 == 8) {
            this.field3340 = arg0.method3061();
        } else if (arg1 == 40) {
            int var3 = arg0.method3061();
            this.field3338 = new short[var3];
            this.field3336 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3338[var4] = (short) arg0.method2882();
                this.field3336[var4] = (short) arg0.method2882();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3061();
            this.field3337 = new short[var5];
            this.field3341 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3337[var6] = (short) arg0.method2882();
                this.field3341[var6] = (short) arg0.method2882();
            }
        }
    }

    @ObfuscatedName("ir.t(IB)Let;")
    public final class134 method3979(int arg0) {
        class134 var2 = (class134) field3334.method3235((long) this.field3335);
        if (var2 == null) {
            class128 var3 = class128.method2190(Statics.field3339, this.field3346, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3338 != null) {
                for (int var4 = 0; var4 < this.field3338.length; var4++) {
                    var3.method2198(this.field3338[var4], this.field3336[var4]);
                }
            }
            if (this.field3337 != null) {
                for (int var5 = 0; var5 < this.field3337.length; var5++) {
                    var3.method2226(this.field3337[var5], this.field3341[var5]);
                }
            }
            var2 = var3.method2221(this.field3345 + 64, this.field3340 + 850, -30, -50, -30);
            field3334.method3234(var2, (long) this.field3335);
        }
        class134 var6;
        if (this.field3333 == -1 || arg0 == -1) {
            var6 = var2.method2276(true);
        } else {
            var6 = class261.method3746(this.field3333).method4329(var2, arg0);
        }
        if (this.field3342 != 128 || this.field3343 != 128) {
            var6.method2342(this.field3342, this.field3343, this.field3342);
        }
        if (this.field3344 != 0) {
            if (this.field3344 == 90) {
                var6.method2263();
            }
            if (this.field3344 == 180) {
                var6.method2263();
                var6.method2263();
            }
            if (this.field3344 == 270) {
                var6.method2263();
                var6.method2263();
                var6.method2263();
            }
        }
        return var6;
    }

    @ObfuscatedName("hw.s(I)V")
    public static void method3757() {
        field3331.method3232();
        field3334.method3232();
    }
}
