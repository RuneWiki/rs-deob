package deob;

@ObfuscatedName("jk")
public class class266 extends class215 {

    @ObfuscatedName("jk.o")
    public static class210 field3433 = new class210(64);

    @ObfuscatedName("jk.p")
    public static class210 field3420 = new class210(30);

    @ObfuscatedName("jk.a")
    public int field3424;

    @ObfuscatedName("jk.h")
    public int field3425;

    @ObfuscatedName("jk.l")
    public int field3426 = -1;

    @ObfuscatedName("jk.y")
    public short[] field3423;

    @ObfuscatedName("jk.g")
    public short[] field3428;

    @ObfuscatedName("jk.c")
    public short[] field3429;

    @ObfuscatedName("jk.u")
    public short[] field3430;

    @ObfuscatedName("jk.r")
    public int field3422 = 128;

    @ObfuscatedName("jk.d")
    public int field3432 = 128;

    @ObfuscatedName("jk.v")
    public int field3427 = 0;

    @ObfuscatedName("jk.s")
    public int field3434 = 0;

    @ObfuscatedName("jk.t")
    public int field3435 = 0;

    @ObfuscatedName("co.b(Lie;Lie;I)V")
    public static void method1777(class256 arg0, class256 arg1) {
        Statics.field3431 = arg0;
        Statics.field3421 = arg1;
    }

    @ObfuscatedName("fn.q(II)Ljk;")
    public static class266 method3059(int arg0) {
        class266 var1 = (class266) field3433.method3658((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3431.method4158(13, arg0);
        class266 var3 = new class266();
        var3.field3424 = arg0;
        if (var2 != null) {
            var3.method4385(new class194(var2));
        }
        field3433.method3659(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.o(Lgn;B)V")
    public void method4385(class194 arg0) {
        while (true) {
            int var2 = arg0.method3247();
            if (var2 == 0) {
                return;
            }
            this.method4386(arg0, var2);
        }
    }

    @ObfuscatedName("jk.p(Lgn;II)V")
    public void method4386(class194 arg0, int arg1) {
        if (arg1 == 1) {
            this.field3425 = arg0.method3249();
        } else if (arg1 == 2) {
            this.field3426 = arg0.method3249();
        } else if (arg1 == 4) {
            this.field3422 = arg0.method3249();
        } else if (arg1 == 5) {
            this.field3432 = arg0.method3249();
        } else if (arg1 == 6) {
            this.field3427 = arg0.method3249();
        } else if (arg1 == 7) {
            this.field3434 = arg0.method3247();
        } else if (arg1 == 8) {
            this.field3435 = arg0.method3247();
        } else if (arg1 == 40) {
            int var3 = arg0.method3247();
            this.field3423 = new short[var3];
            this.field3428 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3423[var4] = (short) arg0.method3249();
                this.field3428[var4] = (short) arg0.method3249();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method3247();
            this.field3429 = new short[var5];
            this.field3430 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3429[var6] = (short) arg0.method3249();
                this.field3430[var6] = (short) arg0.method3249();
            }
        }
    }

    @ObfuscatedName("jk.a(IB)Lee;")
    public final class131 method4392(int arg0) {
        class131 var2 = (class131) field3420.method3658((long) this.field3424);
        if (var2 == null) {
            class125 var3 = class125.method2389(Statics.field3421, this.field3425, 0);
            if (var3 == null) {
                return null;
            }
            if (this.field3423 != null) {
                for (int var4 = 0; var4 < this.field3423.length; var4++) {
                    var3.method2401(this.field3423[var4], this.field3428[var4]);
                }
            }
            if (this.field3429 != null) {
                for (int var5 = 0; var5 < this.field3429.length; var5++) {
                    var3.method2402(this.field3429[var5], this.field3430[var5]);
                }
            }
            var2 = var3.method2409(this.field3434 + 64, this.field3435 + 850, -30, -50, -30);
            field3420.method3659(var2, (long) this.field3424);
        }
        class131 var6;
        if (this.field3426 == -1 || arg0 == -1) {
            var6 = var2.method2492(true);
        } else {
            var6 = class281.method2838(this.field3426).method4730(var2, arg0);
        }
        if (this.field3422 != 128 || this.field3432 != 128) {
            var6.method2499(this.field3422, this.field3432, this.field3422);
        }
        if (this.field3427 != 0) {
            if (this.field3427 == 90) {
                var6.method2502();
            }
            if (this.field3427 == 180) {
                var6.method2502();
                var6.method2502();
            }
            if (this.field3427 == 270) {
                var6.method2502();
                var6.method2502();
                var6.method2502();
            }
        }
        return var6;
    }
}
