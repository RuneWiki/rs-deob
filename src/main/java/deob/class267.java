package deob;

@ObfuscatedName("jz")
public class class267 extends class185 {

    @ObfuscatedName("jz.q")
    public static class155 field3530 = new class155(64);

    @ObfuscatedName("jz.j")
    public static class155 field3511 = new class155(50);

    @ObfuscatedName("jz.p")
    public int field3505;

    @ObfuscatedName("jz.g")
    public String field3499 = class234.field2799;

    @ObfuscatedName("jz.n")
    public int field3500 = 1;

    @ObfuscatedName("jz.u")
    public int[] field3501;

    @ObfuscatedName("jz.a")
    public int[] field3498;

    @ObfuscatedName("jz.z")
    public int field3503 = -1;

    @ObfuscatedName("jz.w")
    public int field3504 = -1;

    @ObfuscatedName("jz.y")
    public int field3496 = -1;

    @ObfuscatedName("jz.c")
    public int field3506 = -1;

    @ObfuscatedName("jz.h")
    public int field3494 = -1;

    @ObfuscatedName("jz.k")
    public int field3502 = -1;

    @ObfuscatedName("jz.r")
    public int field3509 = -1;

    @ObfuscatedName("jz.s")
    public short[] field3510;

    @ObfuscatedName("jz.v")
    public short[] field3524;

    @ObfuscatedName("jz.d")
    public short[] field3512;

    @ObfuscatedName("jz.e")
    public short[] field3513;

    @ObfuscatedName("jz.l")
    public String[] field3514 = new String[5];

    @ObfuscatedName("jz.t")
    public boolean field3515 = true;

    @ObfuscatedName("jz.x")
    public int field3516 = -1;

    @ObfuscatedName("jz.b")
    public int field3517 = 128;

    @ObfuscatedName("jz.i")
    public int field3518 = 128;

    @ObfuscatedName("jz.f")
    public boolean field3519 = false;

    @ObfuscatedName("jz.ah")
    public int field3520 = 0;

    @ObfuscatedName("jz.ai")
    public int field3521 = 0;

    @ObfuscatedName("jz.ao")
    public int field3522 = -1;

    @ObfuscatedName("jz.ae")
    public int field3523 = 32;

    @ObfuscatedName("jz.ax")
    public int[] field3508;

    @ObfuscatedName("jz.ag")
    public int field3497 = -1;

    @ObfuscatedName("jz.ab")
    public int field3526 = -1;

    @ObfuscatedName("jz.am")
    public boolean field3527 = true;

    @ObfuscatedName("jz.ak")
    public boolean field3528 = true;

    @ObfuscatedName("jz.ad")
    public boolean field3529 = false;

    @ObfuscatedName("jz.as")
    public class326 field3507;

    @ObfuscatedName("ib.m(II)Ljz;")
    public static class267 method3880(int arg0) {
        class267 var1 = (class267) field3530.method3127((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3525.method3891(9, arg0);
        class267 var3 = new class267();
        var3.field3505 = arg0;
        if (var2 != null) {
            var3.method4468(new class310(var2));
        }
        var3.method4475();
        field3530.method3137(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jz.o(I)V")
    public void method4475() {
    }

    @ObfuscatedName("jz.q(Lkn;I)V")
    public void method4468(class310 arg0) {
        while (true) {
            int var2 = arg0.method5227();
            if (var2 == 0) {
                return;
            }
            this.method4469(arg0, var2);
        }
    }

    @ObfuscatedName("jz.j(Lkn;II)V")
    public void method4469(class310 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5227();
            this.field3501 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3501[var4] = arg0.method5283();
            }
        } else if (arg1 == 2) {
            this.field3499 = arg0.method5236();
        } else if (arg1 == 12) {
            this.field3500 = arg0.method5227();
        } else if (arg1 == 13) {
            this.field3503 = arg0.method5283();
        } else if (arg1 == 14) {
            this.field3506 = arg0.method5283();
        } else if (arg1 == 15) {
            this.field3504 = arg0.method5283();
        } else if (arg1 == 16) {
            this.field3496 = arg0.method5283();
        } else if (arg1 == 17) {
            this.field3506 = arg0.method5283();
            this.field3494 = arg0.method5283();
            this.field3502 = arg0.method5283();
            this.field3509 = arg0.method5283();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3514[arg1 - 30] = arg0.method5236();
            if (this.field3514[arg1 - 30].equalsIgnoreCase(class234.field2871)) {
                this.field3514[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5227();
            this.field3510 = new short[var5];
            this.field3524 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3510[var6] = (short) arg0.method5283();
                this.field3524[var6] = (short) arg0.method5283();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5227();
            this.field3512 = new short[var7];
            this.field3513 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3512[var8] = (short) arg0.method5283();
                this.field3513[var8] = (short) arg0.method5283();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5227();
            this.field3498 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3498[var10] = arg0.method5283();
            }
        } else if (arg1 == 93) {
            this.field3515 = false;
        } else if (arg1 == 95) {
            this.field3516 = arg0.method5283();
        } else if (arg1 == 97) {
            this.field3517 = arg0.method5283();
        } else if (arg1 == 98) {
            this.field3518 = arg0.method5283();
        } else if (arg1 == 99) {
            this.field3519 = true;
        } else if (arg1 == 100) {
            this.field3520 = arg0.method5228();
        } else if (arg1 == 101) {
            this.field3521 = arg0.method5228();
        } else if (arg1 == 102) {
            this.field3522 = arg0.method5283();
        } else if (arg1 == 103) {
            this.field3523 = arg0.method5283();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3497 = arg0.method5283();
            if (this.field3497 == 65535) {
                this.field3497 = -1;
            }
            this.field3526 = arg0.method5283();
            if (this.field3526 == 65535) {
                this.field3526 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5283();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5227();
            this.field3508 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3508[var13] = arg0.method5283();
                if (this.field3508[var13] == 65535) {
                    this.field3508[var13] = -1;
                }
            }
            this.field3508[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3527 = false;
        } else if (arg1 == 109) {
            this.field3528 = false;
        } else if (arg1 == 111) {
            this.field3529 = true;
        } else if (arg1 == 249) {
            this.field3507 = class258.method4134(arg0, this.field3507);
        }
    }

    @ObfuscatedName("jz.p(Ljm;ILjm;II)Lef;")
    public final class137 method4470(class269 arg0, int arg1, class269 arg2, int arg3) {
        if (this.field3508 != null) {
            class267 var5 = this.method4472();
            return var5 == null ? null : var5.method4470(arg0, arg1, arg2, arg3);
        }
        class137 var6 = (class137) field3511.method3127((long) this.field3505);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3501.length; var8++) {
                if (!Statics.field3495.method3893(this.field3501[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class131[] var9 = new class131[this.field3501.length];
            for (int var10 = 0; var10 < this.field3501.length; var10++) {
                var9[var10] = class131.method2632(Statics.field3495, this.field3501[var10], 0);
            }
            class131 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class131(var9, var9.length);
            }
            if (this.field3510 != null) {
                for (int var12 = 0; var12 < this.field3510.length; var12++) {
                    var11.method2639(this.field3510[var12], this.field3524[var12]);
                }
            }
            if (this.field3512 != null) {
                for (int var13 = 0; var13 < this.field3512.length; var13++) {
                    var11.method2690(this.field3512[var13], this.field3513[var13]);
                }
            }
            var6 = var11.method2619(this.field3520 + 64, this.field3521 * 5 + 850, -30, -50, -30);
            field3511.method3137(var6, (long) this.field3505);
        }
        class137 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4536(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4521(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2770(true);
        } else {
            var14 = arg2.method4521(var6, arg3);
        }
        if (this.field3517 != 128 || this.field3518 != 128) {
            var14.method2723(this.field3517, this.field3518, this.field3517);
        }
        return var14;
    }

    @ObfuscatedName("jz.g(I)Lek;")
    public final class131 method4471() {
        if (this.field3508 != null) {
            class267 var1 = this.method4472();
            return var1 == null ? null : var1.method4471();
        } else if (this.field3498 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3498.length; var3++) {
                if (!Statics.field3495.method3893(this.field3498[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class131[] var4 = new class131[this.field3498.length];
            for (int var5 = 0; var5 < this.field3498.length; var5++) {
                var4[var5] = class131.method2632(Statics.field3495, this.field3498[var5], 0);
            }
            class131 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class131(var4, var4.length);
            }
            if (this.field3510 != null) {
                for (int var7 = 0; var7 < this.field3510.length; var7++) {
                    var6.method2639(this.field3510[var7], this.field3524[var7]);
                }
            }
            if (this.field3512 != null) {
                for (int var8 = 0; var8 < this.field3512.length; var8++) {
                    var6.method2690(this.field3512[var8], this.field3513[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jz.n(I)Ljz;")
    public final class267 method4472() {
        int var1 = -1;
        if (this.field3497 != -1) {
            var1 = class222.method3842(this.field3497);
        } else if (this.field3526 != -1) {
            var1 = class222.field2562[this.field3526];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3508.length - 1) {
            var2 = this.field3508[var1];
        } else {
            var2 = this.field3508[this.field3508.length - 1];
        }
        return var2 == -1 ? null : method3880(var2);
    }

    @ObfuscatedName("jz.u(B)Z")
    public boolean method4473() {
        if (this.field3508 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3497 != -1) {
            var1 = class222.method3842(this.field3497);
        } else if (this.field3526 != -1) {
            var1 = class222.field2562[this.field3526];
        }
        if (var1 >= 0 && var1 < this.field3508.length) {
            return this.field3508[var1] != -1;
        } else {
            return this.field3508[this.field3508.length - 1] != -1;
        }
    }

    @ObfuscatedName("jz.a(IIB)I")
    public int method4474(int arg0, int arg1) {
        return class258.method3448(this.field3507, arg0, arg1);
    }

    @ObfuscatedName("jz.z(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4496(int arg0, String arg1) {
        return class258.method4181(this.field3507, arg0, arg1);
    }
}
