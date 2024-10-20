package deob;

@ObfuscatedName("iz")
public class class246 extends class195 {

    @ObfuscatedName("iz.q")
    public static class190 field3322 = new class190(64);

    @ObfuscatedName("iz.o")
    public static class190 field3324 = new class190(30);

    @ObfuscatedName("iz.g")
    public int field3321;

    @ObfuscatedName("iz.v")
    public int field3333;

    @ObfuscatedName("iz.p")
    public int field3326 = -1;

    @ObfuscatedName("iz.e")
    public short[] field3327;

    @ObfuscatedName("iz.d")
    public short[] field3328;

    @ObfuscatedName("iz.x")
    public short[] field3329;

    @ObfuscatedName("iz.z")
    public short[] field3323;

    @ObfuscatedName("iz.n")
    public int field3331 = 128;

    @ObfuscatedName("iz.u")
    public int field3332 = 128;

    @ObfuscatedName("iz.t")
    public int field3330 = 0;

    @ObfuscatedName("iz.a")
    public int field3325 = 0;

    @ObfuscatedName("iz.i")
    public int field3335 = 0;

    @ObfuscatedName("iw.w(IS)Liz;")
    public static class246 method4062(int arg0) {
        class246 var1 = (class246) field3322.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field22.method3876(13, arg0);
        class246 var3 = new class246();
        var3.field3321 = arg0;
        if (var2 != null) {
            var3.method4083(new class174(var2));
        }
        field3322.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.s(Lfz;I)V")
    public void method4083(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4073(arg0, var2);
        }
    }

    @ObfuscatedName("iz.q(Lfz;II)V")
    public void method4073(class174 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3333 = arg0.method3178();
        } else if (arg1 == 2) {
            this.field3326 = arg0.method3178();
        } else if (arg1 == 4) {
            this.field3331 = arg0.method3178();
        } else if (arg1 == 5) {
            this.field3332 = arg0.method3178();
        } else if (arg1 == 6) {
            this.field3330 = arg0.method3178();
        } else if (arg1 == 7) {
            this.field3325 = arg0.method2971();
        } else if (arg1 == 8) {
            this.field3335 = arg0.method2971();
        } else if (arg1 == 40) {
            int var3 = arg0.method2971();
            this.field3327 = new short[var3];
            this.field3328 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3327[var4] = (short) arg0.method3178();
                this.field3328[var4] = (short) arg0.method3178();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2971();
            this.field3329 = new short[var5];
            this.field3323 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3329[var6] = (short) arg0.method3178();
                this.field3323[var6] = (short) arg0.method3178();
            }
        }
    }

    @ObfuscatedName("iz.o(IB)Leh;")
    public final class132 method4074(int arg0) {
        class132 var2 = (class132) field3324.method3357((long) this.field3321);
        if (var2 == null) {
            class126 var3 = class126.method2334(Statics.field3334, this.field3333, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3327 != null) {
                for (int var4 = 0; var4 < this.field3327.length; var4++) {
                    var3.method2267(this.field3327[var4], this.field3328[var4]);
                }
            }
            if (this.field3329 != null) {
                for (int var5 = 0; var5 < this.field3329.length; var5++) {
                    var3.method2295(this.field3329[var5], this.field3323[var5]);
                }
            }
            var2 = var3.method2275(this.field3325 + 64, this.field3335 + 850, -30, -50, -30);
            field3324.method3371(var2, (long) this.field3321);
        }
        class132 var6;
        if (this.field3326 == -1 || arg0 == -1) {
            var6 = var2.method2429(true);
        } else {
            var6 = class261.method4424(this.field3326).method4449(var2, arg0);
        }
        if (this.field3331 != 128 || this.field3332 != 128) {
            var6.method2424(this.field3331, this.field3332, this.field3331);
        }
        if (this.field3330 != 0) {
            if (this.field3330 == 90) {
                var6.method2365();
            }
            if (this.field3330 == 180) {
                var6.method2365();
                var6.method2365();
            }
            if (this.field3330 == 270) {
                var6.method2365();
                var6.method2365();
                var6.method2365();
            }
        }
        return var6;
    }

    @ObfuscatedName("cd.g(I)V")
    public static void method1658() {
        field3322.method3361();
        field3324.method3361();
    }
}
