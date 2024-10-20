package deob;

@ObfuscatedName("iz")
public class class257 extends class206 {

    @ObfuscatedName("iz.e")
    public static class201 field3410 = new class201(64);

    @ObfuscatedName("iz.k")
    public static class201 field3411 = new class201(30);

    @ObfuscatedName("iz.u")
    public int field3419;

    @ObfuscatedName("iz.z")
    public int field3413;

    @ObfuscatedName("iz.t")
    public int field3414 = -1;

    @ObfuscatedName("iz.f")
    public short[] field3423;

    @ObfuscatedName("iz.g")
    public short[] field3416;

    @ObfuscatedName("iz.j")
    public short[] field3412;

    @ObfuscatedName("iz.x")
    public short[] field3415;

    @ObfuscatedName("iz.c")
    public int field3418 = 128;

    @ObfuscatedName("iz.s")
    public int field3420 = 128;

    @ObfuscatedName("iz.n")
    public int field3408 = 0;

    @ObfuscatedName("iz.y")
    public int field3422 = 0;

    @ObfuscatedName("iz.o")
    public int field3421 = 0;

    @ObfuscatedName("br.a(Lib;Lib;I)V")
    public static void method1343(class247 arg0, class247 arg1) {
        Statics.field3417 = arg0;
        Statics.field3409 = arg1;
    }

    @ObfuscatedName("ik.w(II)Liz;")
    public static class257 method4035(int arg0) {
        class257 var1 = (class257) field3410.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3417.method3897(13, arg0);
        class257 var3 = new class257();
        var3.field3419 = arg0;
        if (var2 != null) {
            var3.method4122(new class185(var2));
        }
        field3410.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iz.e(Lgh;B)V")
    public void method4122(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4108(arg0, var2);
        }
    }

    @ObfuscatedName("iz.k(Lgh;IB)V")
    public void method4108(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3413 = arg0.method3194();
        } else if (arg1 == 2) {
            this.field3414 = arg0.method3194();
        } else if (arg1 == 4) {
            this.field3418 = arg0.method3194();
        } else if (arg1 == 5) {
            this.field3420 = arg0.method3194();
        } else if (arg1 == 6) {
            this.field3408 = arg0.method3194();
        } else if (arg1 == 7) {
            this.field3422 = arg0.method2962();
        } else if (arg1 == 8) {
            this.field3421 = arg0.method2962();
        } else if (arg1 == 40) {
            int var3 = arg0.method2962();
            this.field3423 = new short[var3];
            this.field3416 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3423[var4] = (short) arg0.method3194();
                this.field3416[var4] = (short) arg0.method3194();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method2962();
            this.field3412 = new short[var5];
            this.field3415 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3412[var6] = (short) arg0.method3194();
                this.field3415[var6] = (short) arg0.method3194();
            }
        }
    }

    @ObfuscatedName("iz.u(IB)Lef;")
    public final class133 method4109(int arg0) {
        class133 var2 = (class133) field3411.method3373((long) this.field3419);
        if (var2 == null) {
            class127 var3 = class127.method2217(Statics.field3409, this.field3413, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3423 != null) {
                for (int var4 = 0; var4 < this.field3423.length; var4++) {
                    var3.method2216(this.field3423[var4], this.field3416[var4]);
                }
            }
            if (this.field3412 != null) {
                for (int var5 = 0; var5 < this.field3412.length; var5++) {
                    var3.method2226(this.field3412[var5], this.field3415[var5]);
                }
            }
            var2 = var3.method2224(this.field3422 + 64, this.field3421 + 850, -30, -50, -30);
            field3411.method3375(var2, (long) this.field3419);
        }
        class133 var6;
        if (this.field3414 == -1 || arg0 == -1) {
            var6 = var2.method2344(true);
        } else {
            var6 = class272.method3881(this.field3414).method4462(var2, arg0);
        }
        if (this.field3418 != 128 || this.field3420 != 128) {
            var6.method2314(this.field3418, this.field3420, this.field3418);
        }
        if (this.field3408 != 0) {
            if (this.field3408 == 90) {
                var6.method2309();
            }
            if (this.field3408 == 180) {
                var6.method2309();
                var6.method2309();
            }
            if (this.field3408 == 270) {
                var6.method2309();
                var6.method2309();
                var6.method2309();
            }
        }
        return var6;
    }

    @ObfuscatedName("b.z(I)V")
    public static void method144() {
        field3410.method3370();
        field3411.method3370();
    }
}
