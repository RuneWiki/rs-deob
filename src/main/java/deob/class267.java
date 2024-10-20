package deob;

@ObfuscatedName("jj")
public class class267 extends class185 {

    @ObfuscatedName("jj.k")
    public static class155 field3477 = new class155(64);

    @ObfuscatedName("jj.d")
    public static class155 field3464 = new class155(50);

    @ObfuscatedName("jj.w")
    public int field3465;

    @ObfuscatedName("jj.v")
    public String field3466 = class234.field2765;

    @ObfuscatedName("jj.q")
    public int field3471 = 1;

    @ObfuscatedName("jj.z")
    public int[] field3468;

    @ObfuscatedName("jj.t")
    public int[] field3484;

    @ObfuscatedName("jj.e")
    public int field3470 = -1;

    @ObfuscatedName("jj.s")
    public int field3492 = -1;

    @ObfuscatedName("jj.p")
    public int field3472 = -1;

    @ObfuscatedName("jj.n")
    public int field3473 = -1;

    @ObfuscatedName("jj.u")
    public int field3474 = -1;

    @ObfuscatedName("jj.h")
    public int field3475 = -1;

    @ObfuscatedName("jj.g")
    public int field3476 = -1;

    @ObfuscatedName("jj.i")
    public short[] field3480;

    @ObfuscatedName("jj.a")
    public short[] field3478;

    @ObfuscatedName("jj.b")
    public short[] field3485;

    @ObfuscatedName("jj.l")
    public short[] field3496;

    @ObfuscatedName("jj.r")
    public String[] field3481 = new String[5];

    @ObfuscatedName("jj.o")
    public boolean field3482 = true;

    @ObfuscatedName("jj.c")
    public int field3483 = -1;

    @ObfuscatedName("jj.j")
    public int field3462 = 128;

    @ObfuscatedName("jj.y")
    public int field3479 = 128;

    @ObfuscatedName("jj.f")
    public boolean field3486 = false;

    @ObfuscatedName("jj.ae")
    public int field3487 = 0;

    @ObfuscatedName("jj.an")
    public int field3488 = 0;

    @ObfuscatedName("jj.ai")
    public int field3489 = -1;

    @ObfuscatedName("jj.ap")
    public int field3490 = 32;

    @ObfuscatedName("jj.ab")
    public int[] field3491;

    @ObfuscatedName("jj.ar")
    public int field3461 = -1;

    @ObfuscatedName("jj.af")
    public int field3493 = -1;

    @ObfuscatedName("jj.at")
    public boolean field3494 = true;

    @ObfuscatedName("jj.al")
    public boolean field3495 = true;

    @ObfuscatedName("jj.as")
    public boolean field3463 = false;

    @ObfuscatedName("jj.am")
    public class326 field3497;

    @ObfuscatedName("ic.x(II)Ljj;")
    public static class267 method3854(int arg0) {
        class267 var1 = (class267) field3477.method3146((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3469.method3869(9, arg0);
        class267 var3 = new class267();
        var3.field3465 = arg0;
        if (var2 != null) {
            var3.method4390(new class310(var2));
        }
        var3.method4393();
        field3477.method3152(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.m(B)V")
    public void method4393() {
    }

    @ObfuscatedName("jj.k(Lkb;B)V")
    public void method4390(class310 arg0) {
        while (true) {
            int var2 = arg0.method5137();
            if (var2 == 0) {
                return;
            }
            this.method4391(arg0, var2);
        }
    }

    @ObfuscatedName("jj.d(Lkb;II)V")
    public void method4391(class310 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5137();
            this.field3468 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3468[var4] = arg0.method5139();
            }
        } else if (arg1 == 2) {
            this.field3466 = arg0.method5257();
        } else if (arg1 == 12) {
            this.field3471 = arg0.method5137();
        } else if (arg1 == 13) {
            this.field3470 = arg0.method5139();
        } else if (arg1 == 14) {
            this.field3473 = arg0.method5139();
        } else if (arg1 == 15) {
            this.field3492 = arg0.method5139();
        } else if (arg1 == 16) {
            this.field3472 = arg0.method5139();
        } else if (arg1 == 17) {
            this.field3473 = arg0.method5139();
            this.field3474 = arg0.method5139();
            this.field3475 = arg0.method5139();
            this.field3476 = arg0.method5139();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3481[arg1 - 30] = arg0.method5257();
            if (this.field3481[arg1 - 30].equalsIgnoreCase(class234.field2908)) {
                this.field3481[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5137();
            this.field3480 = new short[var5];
            this.field3478 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3480[var6] = (short) arg0.method5139();
                this.field3478[var6] = (short) arg0.method5139();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5137();
            this.field3485 = new short[var7];
            this.field3496 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3485[var8] = (short) arg0.method5139();
                this.field3496[var8] = (short) arg0.method5139();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5137();
            this.field3484 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3484[var10] = arg0.method5139();
            }
        } else if (arg1 == 93) {
            this.field3482 = false;
        } else if (arg1 == 95) {
            this.field3483 = arg0.method5139();
        } else if (arg1 == 97) {
            this.field3462 = arg0.method5139();
        } else if (arg1 == 98) {
            this.field3479 = arg0.method5139();
        } else if (arg1 == 99) {
            this.field3486 = true;
        } else if (arg1 == 100) {
            this.field3487 = arg0.method5138();
        } else if (arg1 == 101) {
            this.field3488 = arg0.method5138();
        } else if (arg1 == 102) {
            this.field3489 = arg0.method5139();
        } else if (arg1 == 103) {
            this.field3490 = arg0.method5139();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3461 = arg0.method5139();
            if (this.field3461 == 65535) {
                this.field3461 = -1;
            }
            this.field3493 = arg0.method5139();
            if (this.field3493 == 65535) {
                this.field3493 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5139();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5137();
            this.field3491 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3491[var13] = arg0.method5139();
                if (this.field3491[var13] == 65535) {
                    this.field3491[var13] = -1;
                }
            }
            this.field3491[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3494 = false;
        } else if (arg1 == 109) {
            this.field3495 = false;
        } else if (arg1 == 111) {
            this.field3463 = true;
        } else if (arg1 == 249) {
            this.field3497 = Statics.method4011(arg0, this.field3497);
        }
    }

    @ObfuscatedName("jj.w(Ljc;ILjc;II)Lel;")
    public final class137 method4392(class269 arg0, int arg1, class269 arg2, int arg3) {
        if (this.field3491 != null) {
            class267 var5 = this.method4394();
            return var5 == null ? null : var5.method4392(arg0, arg1, arg2, arg3);
        }
        class137 var6 = (class137) field3464.method3146((long) this.field3465);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3468.length; var8++) {
                if (!Statics.field3467.method3883(this.field3468[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class131[] var9 = new class131[this.field3468.length];
            for (int var10 = 0; var10 < this.field3468.length; var10++) {
                var9[var10] = class131.method2615(Statics.field3467, this.field3468[var10], 0);
            }
            class131 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class131(var9, var9.length);
            }
            if (this.field3480 != null) {
                for (int var12 = 0; var12 < this.field3480.length; var12++) {
                    var11.method2629(this.field3480[var12], this.field3478[var12]);
                }
            }
            if (this.field3485 != null) {
                for (int var13 = 0; var13 < this.field3485.length; var13++) {
                    var11.method2681(this.field3485[var13], this.field3496[var13]);
                }
            }
            var6 = var11.method2636(this.field3487 + 64, this.field3488 * 5 + 850, -30, -50, -30);
            field3464.method3152(var6, (long) this.field3465);
        }
        class137 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4451(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4448(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2721(true);
        } else {
            var14 = arg2.method4448(var6, arg3);
        }
        if (this.field3462 != 128 || this.field3479 != 128) {
            var14.method2717(this.field3462, this.field3479, this.field3462);
        }
        return var14;
    }

    @ObfuscatedName("jj.v(B)Lea;")
    public final class131 method4388() {
        if (this.field3491 != null) {
            class267 var1 = this.method4394();
            return var1 == null ? null : var1.method4388();
        } else if (this.field3484 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3484.length; var3++) {
                if (!Statics.field3467.method3883(this.field3484[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class131[] var4 = new class131[this.field3484.length];
            for (int var5 = 0; var5 < this.field3484.length; var5++) {
                var4[var5] = class131.method2615(Statics.field3467, this.field3484[var5], 0);
            }
            class131 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class131(var4, var4.length);
            }
            if (this.field3480 != null) {
                for (int var7 = 0; var7 < this.field3480.length; var7++) {
                    var6.method2629(this.field3480[var7], this.field3478[var7]);
                }
            }
            if (this.field3485 != null) {
                for (int var8 = 0; var8 < this.field3485.length; var8++) {
                    var6.method2681(this.field3485[var8], this.field3496[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jj.q(I)Ljj;")
    public final class267 method4394() {
        int var1 = -1;
        if (this.field3461 != -1) {
            var1 = class222.method2013(this.field3461);
        } else if (this.field3493 != -1) {
            var1 = class222.field2527[this.field3493];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3491.length - 1) {
            var2 = this.field3491[var1];
        } else {
            var2 = this.field3491[this.field3491.length - 1];
        }
        return var2 == -1 ? null : method3854(var2);
    }

    @ObfuscatedName("jj.z(I)Z")
    public boolean method4395() {
        if (this.field3491 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3461 != -1) {
            var1 = class222.method2013(this.field3461);
        } else if (this.field3493 != -1) {
            var1 = class222.field2527[this.field3493];
        }
        if (var1 >= 0 && var1 < this.field3491.length) {
            return this.field3491[var1] != -1;
        } else {
            return this.field3491[this.field3491.length - 1] != -1;
        }
    }

    @ObfuscatedName("jj.t(IIS)I")
    public int method4399(int arg0, int arg1) {
        class326 var3 = this.field3497;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5519((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2115;
            }
        }
        return var4;
    }

    @ObfuscatedName("jj.e(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4397(int arg0, String arg1) {
        return Statics.method95(this.field3497, arg0, arg1);
    }

    @ObfuscatedName("ja.s(I)V")
    public static void method4642() {
        field3477.method3141();
        field3464.method3141();
    }
}
