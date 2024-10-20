package deob;

@ObfuscatedName("jn")
public class class273 extends class219 {

    @ObfuscatedName("jn.b")
    public static class213 field3484 = new class213(64);

    @ObfuscatedName("jn.z")
    public static class213 field3485 = new class213(30);

    @ObfuscatedName("jn.n")
    public int field3486;

    @ObfuscatedName("jn.l")
    public int field3487;

    @ObfuscatedName("jn.s")
    public int field3496 = -1;

    @ObfuscatedName("jn.y")
    public short[] field3494;

    @ObfuscatedName("jn.c")
    public short[] field3490;

    @ObfuscatedName("jn.h")
    public short[] field3488;

    @ObfuscatedName("jn.i")
    public short[] field3491;

    @ObfuscatedName("jn.o")
    public int field3493 = 128;

    @ObfuscatedName("jn.d")
    public int field3483 = 128;

    @ObfuscatedName("jn.r")
    public int field3489 = 0;

    @ObfuscatedName("jn.p")
    public int field3495 = 0;

    @ObfuscatedName("jn.q")
    public int field3497 = 0;

    @ObfuscatedName("at.g(Ljr;Ljr;I)V")
    public static void method604(class262 arg0, class262 arg1) {
        Statics.field3492 = arg0;
        Statics.field299 = arg1;
    }

    @ObfuscatedName("bt.e(IB)Ljn;")
    public static class273 method1058(int arg0) {
        class273 var1 = (class273) field3484.method3706((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3492.method4294(13, arg0);
        class273 var3 = new class273();
        var3.field3486 = arg0;
        if (var2 != null) {
            var3.method4506(new class195(var2));
        }
        field3484.method3712(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.b(Lgg;I)V")
    public void method4506(class195 arg0) {
        while (true) {
            int var2 = arg0.method3332();
            if (var2 == 0) {
                return;
            }
            this.method4507(arg0, var2);
        }
    }

    @ObfuscatedName("jn.z(Lgg;IB)V")
    public void method4507(class195 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3487 = arg0.method3310();
        } else if (arg1 == 2) {
            this.field3496 = arg0.method3310();
        } else if (arg1 == 4) {
            this.field3493 = arg0.method3310();
        } else if (arg1 == 5) {
            this.field3483 = arg0.method3310();
        } else if (arg1 == 6) {
            this.field3489 = arg0.method3310();
        } else if (arg1 == 7) {
            this.field3495 = arg0.method3332();
        } else if (arg1 == 8) {
            this.field3497 = arg0.method3332();
        } else if (arg1 == 40) {
            int var3 = arg0.method3332();
            this.field3494 = new short[var3];
            this.field3490 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3494[var4] = (short) arg0.method3310();
                this.field3490[var4] = (short) arg0.method3310();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3332();
            this.field3488 = new short[var5];
            this.field3491 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3488[var6] = (short) arg0.method3310();
                this.field3491[var6] = (short) arg0.method3310();
            }
        }
    }

    @ObfuscatedName("jn.n(IS)Lee;")
    public final class132 method4518(int arg0) {
        class132 var2 = (class132) field3485.method3706((long) this.field3486);
        if (var2 == null) {
            class126 var3 = class126.method2485(Statics.field299, this.field3487, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3494 != null) {
                for (int var4 = 0; var4 < this.field3494.length; var4++) {
                    var3.method2534(this.field3494[var4], this.field3490[var4]);
                }
            }
            if (this.field3488 != null) {
                for (int var5 = 0; var5 < this.field3488.length; var5++) {
                    var3.method2498(this.field3488[var5], this.field3491[var5]);
                }
            }
            var2 = var3.method2505(this.field3495 + 64, this.field3497 + 850, -30, -50, -30);
            field3485.method3712(var2, (long) this.field3486);
        }
        class132 var6;
        if (this.field3496 == -1 || arg0 == -1) {
            var6 = var2.method2578(true);
        } else {
            var6 = class288.method1825(this.field3496).method4846(var2, arg0);
        }
        if (this.field3493 != 128 || this.field3483 != 128) {
            var6.method2592(this.field3493, this.field3483, this.field3493);
        }
        if (this.field3489 != 0) {
            if (this.field3489 == 90) {
                var6.method2588();
            }
            if (this.field3489 == 180) {
                var6.method2588();
                var6.method2588();
            }
            if (this.field3489 == 270) {
                var6.method2588();
                var6.method2588();
                var6.method2588();
            }
        }
        return var6;
    }

    @ObfuscatedName("eo.l(I)V")
    public static void method2979() {
        field3484.method3709();
        field3485.method3709();
    }
}
