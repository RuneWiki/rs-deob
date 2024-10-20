package deob;

@ObfuscatedName("jx")
public class class267 extends class185 {

    @ObfuscatedName("jx.s")
    public static class155 field3487 = new class155(64);

    @ObfuscatedName("jx.t")
    public static class155 field3488 = new class155(50);

    @ObfuscatedName("jx.i")
    public int field3489;

    @ObfuscatedName("jx.o")
    public String field3490 = class234.field2806;

    @ObfuscatedName("jx.x")
    public int field3513 = 1;

    @ObfuscatedName("jx.w")
    public int[] field3492;

    @ObfuscatedName("jx.g")
    public int[] field3493;

    @ObfuscatedName("jx.m")
    public int field3486 = -1;

    @ObfuscatedName("jx.n")
    public int field3495 = -1;

    @ObfuscatedName("jx.d")
    public int field3496 = -1;

    @ObfuscatedName("jx.h")
    public int field3497 = -1;

    @ObfuscatedName("jx.a")
    public int field3494 = -1;

    @ObfuscatedName("jx.q")
    public int field3499 = -1;

    @ObfuscatedName("jx.c")
    public int field3516 = -1;

    @ObfuscatedName("jx.f")
    public short[] field3501;

    @ObfuscatedName("jx.y")
    public short[] field3491;

    @ObfuscatedName("jx.v")
    public short[] field3498;

    @ObfuscatedName("jx.j")
    public short[] field3504;

    @ObfuscatedName("jx.r")
    public String[] field3506 = new String[5];

    @ObfuscatedName("jx.u")
    public boolean field3502 = true;

    @ObfuscatedName("jx.p")
    public int field3507 = -1;

    @ObfuscatedName("jx.b")
    public int field3508 = 128;

    @ObfuscatedName("jx.l")
    public int field3509 = 128;

    @ObfuscatedName("jx.e")
    public boolean field3510 = false;

    @ObfuscatedName("jx.ab")
    public int field3511 = 0;

    @ObfuscatedName("jx.ag")
    public int field3512 = 0;

    @ObfuscatedName("jx.ao")
    public int field3500 = -1;

    @ObfuscatedName("jx.ae")
    public int field3505 = 32;

    @ObfuscatedName("jx.an")
    public int[] field3515;

    @ObfuscatedName("jx.am")
    public int field3503 = -1;

    @ObfuscatedName("jx.ap")
    public int field3517 = -1;

    @ObfuscatedName("jx.au")
    public boolean field3518 = true;

    @ObfuscatedName("jx.aa")
    public boolean field3519 = true;

    @ObfuscatedName("jx.ar")
    public boolean field3520 = false;

    @ObfuscatedName("jx.at")
    public class326 field3521;

    @ObfuscatedName("eh.z(IB)Ljx;")
    public static class267 method2944(int arg0) {
        class267 var1 = (class267) field3487.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3514.method3873(9, arg0);
        class267 var3 = new class267();
        var3.field3489 = arg0;
        if (var2 != null) {
            var3.method4447(new class310(var2));
        }
        var3.method4464();
        field3487.method3169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jx.k(I)V")
    public void method4464() {
    }

    @ObfuscatedName("jx.s(Lkf;I)V")
    public void method4447(class310 arg0) {
        while (true) {
            int var2 = arg0.method5193();
            if (var2 == 0) {
                return;
            }
            this.method4448(arg0, var2);
        }
    }

    @ObfuscatedName("jx.t(Lkf;II)V")
    public void method4448(class310 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5193();
            this.field3492 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3492[var4] = arg0.method5195();
            }
        } else if (arg1 == 2) {
            this.field3490 = arg0.method5202();
        } else if (arg1 == 12) {
            this.field3513 = arg0.method5193();
        } else if (arg1 == 13) {
            this.field3486 = arg0.method5195();
        } else if (arg1 == 14) {
            this.field3497 = arg0.method5195();
        } else if (arg1 == 15) {
            this.field3495 = arg0.method5195();
        } else if (arg1 == 16) {
            this.field3496 = arg0.method5195();
        } else if (arg1 == 17) {
            this.field3497 = arg0.method5195();
            this.field3494 = arg0.method5195();
            this.field3499 = arg0.method5195();
            this.field3516 = arg0.method5195();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3506[arg1 - 30] = arg0.method5202();
            if (this.field3506[arg1 - 30].equalsIgnoreCase(class234.field2966)) {
                this.field3506[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5193();
            this.field3501 = new short[var5];
            this.field3491 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3501[var6] = (short) arg0.method5195();
                this.field3491[var6] = (short) arg0.method5195();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5193();
            this.field3498 = new short[var7];
            this.field3504 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3498[var8] = (short) arg0.method5195();
                this.field3504[var8] = (short) arg0.method5195();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5193();
            this.field3493 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3493[var10] = arg0.method5195();
            }
        } else if (arg1 == 93) {
            this.field3502 = false;
        } else if (arg1 == 95) {
            this.field3507 = arg0.method5195();
        } else if (arg1 == 97) {
            this.field3508 = arg0.method5195();
        } else if (arg1 == 98) {
            this.field3509 = arg0.method5195();
        } else if (arg1 == 99) {
            this.field3510 = true;
        } else if (arg1 == 100) {
            this.field3511 = arg0.method5194();
        } else if (arg1 == 101) {
            this.field3512 = arg0.method5194() * 5;
        } else if (arg1 == 102) {
            this.field3500 = arg0.method5195();
        } else if (arg1 == 103) {
            this.field3505 = arg0.method5195();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3503 = arg0.method5195();
            if (this.field3503 == 65535) {
                this.field3503 = -1;
            }
            this.field3517 = arg0.method5195();
            if (this.field3517 == 65535) {
                this.field3517 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5195();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5193();
            this.field3515 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3515[var13] = arg0.method5195();
                if (this.field3515[var13] == 65535) {
                    this.field3515[var13] = -1;
                }
            }
            this.field3515[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3518 = false;
        } else if (arg1 == 109) {
            this.field3519 = false;
        } else if (arg1 == 111) {
            this.field3520 = true;
        } else if (arg1 == 249) {
            this.field3521 = class258.method2185(arg0, this.field3521);
        }
    }

    @ObfuscatedName("jx.i(Ljm;ILjm;IB)Ler;")
    public final class137 method4449(class269 arg0, int arg1, class269 arg2, int arg3) {
        if (this.field3515 != null) {
            class267 var5 = this.method4451();
            return var5 == null ? null : var5.method4449(arg0, arg1, arg2, arg3);
        }
        class137 var6 = (class137) field3488.method3170((long) this.field3489);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3492.length; var8++) {
                if (!Statics.field3485.method3883(this.field3492[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class131[] var9 = new class131[this.field3492.length];
            for (int var10 = 0; var10 < this.field3492.length; var10++) {
                var9[var10] = class131.method2636(Statics.field3485, this.field3492[var10], 0);
            }
            class131 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class131(var9, var9.length);
            }
            if (this.field3501 != null) {
                for (int var12 = 0; var12 < this.field3501.length; var12++) {
                    var11.method2691(this.field3501[var12], this.field3491[var12]);
                }
            }
            if (this.field3498 != null) {
                for (int var13 = 0; var13 < this.field3498.length; var13++) {
                    var11.method2652(this.field3498[var13], this.field3504[var13]);
                }
            }
            var6 = var11.method2656(this.field3511 + 64, this.field3512 + 850, -30, -50, -30);
            field3488.method3169(var6, (long) this.field3489);
        }
        class137 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4505(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4502(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2745(true);
        } else {
            var14 = arg2.method4502(var6, arg3);
        }
        if (this.field3508 != 128 || this.field3509 != 128) {
            var14.method2804(this.field3508, this.field3509, this.field3508);
        }
        return var14;
    }

    @ObfuscatedName("jx.o(I)Lee;")
    public final class131 method4450() {
        if (this.field3515 != null) {
            class267 var1 = this.method4451();
            return var1 == null ? null : var1.method4450();
        } else if (this.field3493 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3493.length; var3++) {
                if (!Statics.field3485.method3883(this.field3493[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class131[] var4 = new class131[this.field3493.length];
            for (int var5 = 0; var5 < this.field3493.length; var5++) {
                var4[var5] = class131.method2636(Statics.field3485, this.field3493[var5], 0);
            }
            class131 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class131(var4, var4.length);
            }
            if (this.field3501 != null) {
                for (int var7 = 0; var7 < this.field3501.length; var7++) {
                    var6.method2691(this.field3501[var7], this.field3491[var7]);
                }
            }
            if (this.field3498 != null) {
                for (int var8 = 0; var8 < this.field3498.length; var8++) {
                    var6.method2652(this.field3498[var8], this.field3504[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jx.x(I)Ljx;")
    public final class267 method4451() {
        int var1 = -1;
        if (this.field3503 != -1) {
            var1 = class222.method552(this.field3503);
        } else if (this.field3517 != -1) {
            var1 = class222.field2558[this.field3517];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3515.length - 1) {
            var2 = this.field3515[var1];
        } else {
            var2 = this.field3515[this.field3515.length - 1];
        }
        return var2 == -1 ? null : method2944(var2);
    }

    @ObfuscatedName("jx.w(I)Z")
    public boolean method4452() {
        if (this.field3515 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3503 != -1) {
            var1 = class222.method552(this.field3503);
        } else if (this.field3517 != -1) {
            var1 = class222.field2558[this.field3517];
        }
        if (var1 >= 0 && var1 < this.field3515.length) {
            return this.field3515[var1] != -1;
        } else {
            return this.field3515[this.field3515.length - 1] != -1;
        }
    }

    @ObfuscatedName("jx.g(III)I")
    public int method4453(int arg0, int arg1) {
        return class258.method4902(this.field3521, arg0, arg1);
    }

    @ObfuscatedName("jx.m(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4454(int arg0, String arg1) {
        class326 var3 = this.field3521;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class186 var5 = (class186) var3.method5582((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2150;
            }
        }
        return var4;
    }
}
