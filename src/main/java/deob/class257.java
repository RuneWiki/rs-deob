package deob;

@ObfuscatedName("iy")
public class class257 extends class206 {

    @ObfuscatedName("iy.y")
    public static class201 field3427 = new class201(64);

    @ObfuscatedName("iy.r")
    public static class201 field3418 = new class201(30);

    @ObfuscatedName("iy.h")
    public int field3421;

    @ObfuscatedName("iy.d")
    public int field3419;

    @ObfuscatedName("iy.s")
    public int field3420 = -1;

    @ObfuscatedName("iy.b")
    public short[] field3424;

    @ObfuscatedName("iy.e")
    public short[] field3422;

    @ObfuscatedName("iy.f")
    public short[] field3416;

    @ObfuscatedName("iy.z")
    public short[] field3423;

    @ObfuscatedName("iy.u")
    public int field3425 = 128;

    @ObfuscatedName("iy.p")
    public int field3426 = 128;

    @ObfuscatedName("iy.w")
    public int field3417 = 0;

    @ObfuscatedName("iy.t")
    public int field3414 = 0;

    @ObfuscatedName("iy.o")
    public int field3429 = 0;

    @ObfuscatedName("e.n(Lil;Lil;S)V")
    public static void method36(class247 arg0, class247 arg1) {
        Statics.field3428 = arg0;
        Statics.field3415 = arg1;
    }

    @ObfuscatedName("iy.y(Lgv;I)V")
    public void method4117(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4118(arg0, var2);
        }
    }

    @ObfuscatedName("iy.r(Lgv;II)V")
    public void method4118(class185 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3419 = arg0.method3015();
        } else if (arg1 == 2) {
            this.field3420 = arg0.method3015();
        } else if (arg1 == 4) {
            this.field3425 = arg0.method3015();
        } else if (arg1 == 5) {
            this.field3426 = arg0.method3015();
        } else if (arg1 == 6) {
            this.field3417 = arg0.method3015();
        } else if (arg1 == 7) {
            this.field3414 = arg0.method3021();
        } else if (arg1 == 8) {
            this.field3429 = arg0.method3021();
        } else if (arg1 == 40) {
            int var3 = arg0.method3021();
            this.field3424 = new short[var3];
            this.field3422 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3424[var4] = (short) arg0.method3015();
                this.field3422[var4] = (short) arg0.method3015();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3021();
            this.field3416 = new short[var5];
            this.field3423 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3416[var6] = (short) arg0.method3015();
                this.field3423[var6] = (short) arg0.method3015();
            }
        }
    }

    @ObfuscatedName("iy.h(IB)Les;")
    public final class133 method4116(int arg0) {
        class133 var2 = (class133) field3418.method3407((long) this.field3421);
        if (var2 == null) {
            class127 var3 = class127.method2257(Statics.field3415, this.field3419, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3424 != null) {
                for (int var4 = 0; var4 < this.field3424.length; var4++) {
                    var3.method2258(this.field3424[var4], this.field3422[var4]);
                }
            }
            if (this.field3416 != null) {
                for (int var5 = 0; var5 < this.field3416.length; var5++) {
                    var3.method2260(this.field3416[var5], this.field3423[var5]);
                }
            }
            var2 = var3.method2331(this.field3414 + 64, this.field3429 + 850, -30, -50, -30);
            field3418.method3408(var2, (long) this.field3421);
        }
        class133 var6;
        if (this.field3420 == -1 || arg0 == -1) {
            var6 = var2.method2348(true);
        } else {
            var6 = class272.method579(this.field3420).method4507(var2, arg0);
        }
        if (this.field3425 != 128 || this.field3426 != 128) {
            var6.method2363(this.field3425, this.field3426, this.field3425);
        }
        if (this.field3417 != 0) {
            if (this.field3417 == 90) {
                var6.method2345();
            }
            if (this.field3417 == 180) {
                var6.method2345();
                var6.method2345();
            }
            if (this.field3417 == 270) {
                var6.method2345();
                var6.method2345();
                var6.method2345();
            }
        }
        return var6;
    }

    @ObfuscatedName("h.d(I)V")
    public static void method10() {
        field3427.method3409();
        field3418.method3409();
    }
}
