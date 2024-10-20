package deob;

@ObfuscatedName("iv")
public class class246 extends class195 {

    @ObfuscatedName("iv.e")
    public static class190 field3323 = new class190(64);

    @ObfuscatedName("iv.v")
    public static class190 field3322 = new class190(30);

    @ObfuscatedName("iv.b")
    public int field3325;

    @ObfuscatedName("iv.y")
    public int field3326;

    @ObfuscatedName("iv.h")
    public int field3327 = -1;

    @ObfuscatedName("iv.x")
    public short[] field3328;

    @ObfuscatedName("iv.f")
    public short[] field3335;

    @ObfuscatedName("iv.n")
    public short[] field3332;

    @ObfuscatedName("iv.a")
    public short[] field3331;

    @ObfuscatedName("iv.o")
    public int field3336 = 128;

    @ObfuscatedName("iv.z")
    public int field3337 = 128;

    @ObfuscatedName("iv.q")
    public int field3334 = 0;

    @ObfuscatedName("iv.j")
    public int field3333 = 0;

    @ObfuscatedName("iv.k")
    public int field3329 = 0;

    @ObfuscatedName("ce.i(II)Liv;")
    public static class246 method1412(int arg0) {
        class246 var1 = (class246) field3323.method3220((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3330.method3769(13, arg0);
        class246 var3 = new class246();
        var3.field3325 = arg0;
        if (var2 != null) {
            var3.method3988(new class174(var2));
        }
        field3323.method3222(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iv.c(Lfx;I)V")
    public void method3988(class174 arg0) {
        while (true) {
            int var2 = arg0.method2870();
            if (var2 == 0) {
                return;
            }
            this.method3987(arg0, var2);
        }
    }

    @ObfuscatedName("iv.e(Lfx;IS)V")
    public void method3987(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3326 = arg0.method2872();
        } else if (arg1 == 2) {
            this.field3327 = arg0.method2872();
        } else if (arg1 == 4) {
            this.field3336 = arg0.method2872();
        } else if (arg1 == 5) {
            this.field3337 = arg0.method2872();
        } else if (arg1 == 6) {
            this.field3334 = arg0.method2872();
        } else if (arg1 == 7) {
            this.field3333 = arg0.method2870();
        } else if (arg1 == 8) {
            this.field3329 = arg0.method2870();
        } else if (arg1 == 40) {
            int var3 = arg0.method2870();
            this.field3328 = new short[var3];
            this.field3335 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3328[var4] = (short) arg0.method2872();
                this.field3335[var4] = (short) arg0.method2872();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2870();
            this.field3332 = new short[var5];
            this.field3331 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3332[var6] = (short) arg0.method2872();
                this.field3331[var6] = (short) arg0.method2872();
            }
        }
    }

    @ObfuscatedName("iv.v(IB)Led;")
    public final class134 method3990(int arg0) {
        class134 var2 = (class134) field3322.method3220((long) this.field3325);
        if (var2 == null) {
            class128 var3 = class128.method2208(Statics.field271, this.field3326, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3328 != null) {
                for (int var4 = 0; var4 < this.field3328.length; var4++) {
                    var3.method2190(this.field3328[var4], this.field3335[var4]);
                }
            }
            if (this.field3332 != null) {
                for (int var5 = 0; var5 < this.field3332.length; var5++) {
                    var3.method2231(this.field3332[var5], this.field3331[var5]);
                }
            }
            var2 = var3.method2198(this.field3333 + 64, this.field3329 + 850, -30, -50, -30);
            field3322.method3222(var2, (long) this.field3325);
        }
        class134 var6;
        if (this.field3327 == -1 || arg0 == -1) {
            var6 = var2.method2296(true);
        } else {
            var6 = class261.method3748(this.field3327).method4343(var2, arg0);
        }
        if (this.field3336 != 128 || this.field3337 != 128) {
            var6.method2288(this.field3336, this.field3337, this.field3336);
        }
        if (this.field3334 != 0) {
            if (this.field3334 == 90) {
                var6.method2283();
            }
            if (this.field3334 == 180) {
                var6.method2283();
                var6.method2283();
            }
            if (this.field3334 == 270) {
                var6.method2283();
                var6.method2283();
                var6.method2283();
            }
        }
        return var6;
    }
}
