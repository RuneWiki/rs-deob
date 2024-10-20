package deob;

@ObfuscatedName("jn")
public class class268 extends class185 {

    @ObfuscatedName("jn.l")
    public static class155 field3487 = new class155(64);

    @ObfuscatedName("jn.m")
    public static class155 field3492 = new class155(50);

    @ObfuscatedName("jn.z")
    public int field3489;

    @ObfuscatedName("jn.q")
    public String field3490 = class234.field2793;

    @ObfuscatedName("jn.k")
    public int field3485 = 1;

    @ObfuscatedName("jn.c")
    public int[] field3499;

    @ObfuscatedName("jn.u")
    public int[] field3493;

    @ObfuscatedName("jn.t")
    public int field3494 = -1;

    @ObfuscatedName("jn.e")
    public int field3495 = -1;

    @ObfuscatedName("jn.o")
    public int field3496 = -1;

    @ObfuscatedName("jn.n")
    public int field3497 = -1;

    @ObfuscatedName("jn.x")
    public int field3510 = -1;

    @ObfuscatedName("jn.p")
    public int field3509 = -1;

    @ObfuscatedName("jn.r")
    public int field3502 = -1;

    @ObfuscatedName("jn.y")
    public short[] field3501;

    @ObfuscatedName("jn.s")
    public short[] field3520;

    @ObfuscatedName("jn.j")
    public short[] field3503;

    @ObfuscatedName("jn.w")
    public short[] field3505;

    @ObfuscatedName("jn.v")
    public String[] field3500 = new String[5];

    @ObfuscatedName("jn.d")
    public boolean field3506 = true;

    @ObfuscatedName("jn.a")
    public int field3507 = -1;

    @ObfuscatedName("jn.g")
    public int field3508 = 128;

    @ObfuscatedName("jn.h")
    public int field3498 = 128;

    @ObfuscatedName("jn.i")
    public boolean field3518 = false;

    @ObfuscatedName("jn.ab")
    public int field3511 = 0;

    @ObfuscatedName("jn.ac")
    public int field3512 = 0;

    @ObfuscatedName("jn.ao")
    public int field3513 = -1;

    @ObfuscatedName("jn.af")
    public int field3514 = 32;

    @ObfuscatedName("jn.av")
    public int[] field3488;

    @ObfuscatedName("jn.ar")
    public int field3516 = -1;

    @ObfuscatedName("jn.ay")
    public int field3517 = -1;

    @ObfuscatedName("jn.ah")
    public boolean field3515 = true;

    @ObfuscatedName("jn.az")
    public boolean field3519 = true;

    @ObfuscatedName("jn.ak")
    public boolean field3521 = false;

    @ObfuscatedName("jn.au")
    public class327 field3491;

    @ObfuscatedName("ft.f(II)Ljn;")
    public static class268 method3332(int arg0) {
        class268 var1 = (class268) field3487.method3155((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3504.method3905(9, arg0);
        class268 var3 = new class268();
        var3.field3489 = arg0;
        if (var2 != null) {
            var3.method4484(new class311(var2));
        }
        var3.method4470();
        field3487.method3157(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jn.b(I)V")
    public void method4470() {
    }

    @ObfuscatedName("jn.l(Lkb;B)V")
    public void method4484(class311 arg0) {
        while (true) {
            int var2 = arg0.method5276();
            if (var2 == 0) {
                return;
            }
            this.method4472(arg0, var2);
        }
    }

    @ObfuscatedName("jn.m(Lkb;II)V")
    public void method4472(class311 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5276();
            this.field3499 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3499[var4] = arg0.method5163();
            }
        } else if (arg1 == 2) {
            this.field3490 = arg0.method5189();
        } else if (arg1 == 12) {
            this.field3485 = arg0.method5276();
        } else if (arg1 == 13) {
            this.field3494 = arg0.method5163();
        } else if (arg1 == 14) {
            this.field3497 = arg0.method5163();
        } else if (arg1 == 15) {
            this.field3495 = arg0.method5163();
        } else if (arg1 == 16) {
            this.field3496 = arg0.method5163();
        } else if (arg1 == 17) {
            this.field3497 = arg0.method5163();
            this.field3510 = arg0.method5163();
            this.field3509 = arg0.method5163();
            this.field3502 = arg0.method5163();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3500[arg1 - 30] = arg0.method5189();
            if (this.field3500[arg1 - 30].equalsIgnoreCase(class234.field2788)) {
                this.field3500[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5276();
            this.field3501 = new short[var5];
            this.field3520 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3501[var6] = (short) arg0.method5163();
                this.field3520[var6] = (short) arg0.method5163();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5276();
            this.field3503 = new short[var7];
            this.field3505 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3503[var8] = (short) arg0.method5163();
                this.field3505[var8] = (short) arg0.method5163();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5276();
            this.field3493 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3493[var10] = arg0.method5163();
            }
        } else if (arg1 == 93) {
            this.field3506 = false;
        } else if (arg1 == 95) {
            this.field3507 = arg0.method5163();
        } else if (arg1 == 97) {
            this.field3508 = arg0.method5163();
        } else if (arg1 == 98) {
            this.field3498 = arg0.method5163();
        } else if (arg1 == 99) {
            this.field3518 = true;
        } else if (arg1 == 100) {
            this.field3511 = arg0.method5181();
        } else if (arg1 == 101) {
            this.field3512 = arg0.method5181();
        } else if (arg1 == 102) {
            this.field3513 = arg0.method5163();
        } else if (arg1 == 103) {
            this.field3514 = arg0.method5163();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3516 = arg0.method5163();
            if (this.field3516 == 65535) {
                this.field3516 = -1;
            }
            this.field3517 = arg0.method5163();
            if (this.field3517 == 65535) {
                this.field3517 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5163();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5276();
            this.field3488 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3488[var13] = arg0.method5163();
                if (this.field3488[var13] == 65535) {
                    this.field3488[var13] = -1;
                }
            }
            this.field3488[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3515 = false;
        } else if (arg1 == 109) {
            this.field3519 = false;
        } else if (arg1 == 111) {
            this.field3521 = true;
        } else if (arg1 == 249) {
            this.field3491 = class259.method4092(arg0, this.field3491);
        }
    }

    @ObfuscatedName("jn.z(Ljg;ILjg;II)Leh;")
    public final class137 method4486(class270 arg0, int arg1, class270 arg2, int arg3) {
        if (this.field3488 != null) {
            class268 var5 = this.method4492();
            return var5 == null ? null : var5.method4486(arg0, arg1, arg2, arg3);
        }
        class137 var6 = (class137) field3492.method3155((long) this.field3489);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3499.length; var8++) {
                if (!Statics.field3486.method3902(this.field3499[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class131[] var9 = new class131[this.field3499.length];
            for (int var10 = 0; var10 < this.field3499.length; var10++) {
                var9[var10] = class131.method2647(Statics.field3486, this.field3499[var10], 0);
            }
            class131 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class131(var9, var9.length);
            }
            if (this.field3501 != null) {
                for (int var12 = 0; var12 < this.field3501.length; var12++) {
                    var11.method2660(this.field3501[var12], this.field3520[var12]);
                }
            }
            if (this.field3503 != null) {
                for (int var13 = 0; var13 < this.field3503.length; var13++) {
                    var11.method2661(this.field3503[var13], this.field3505[var13]);
                }
            }
            var6 = var11.method2668(this.field3511 + 64, this.field3512 * 5 + 850, -30, -50, -30);
            field3492.method3157(var6, (long) this.field3489);
        }
        class137 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4532(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4523(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2766(true);
        } else {
            var14 = arg2.method4523(var6, arg3);
        }
        if (this.field3508 != 128 || this.field3498 != 128) {
            var14.method2758(this.field3508, this.field3498, this.field3508);
        }
        return var14;
    }

    @ObfuscatedName("jn.q(B)Len;")
    public final class131 method4474() {
        if (this.field3488 != null) {
            class268 var1 = this.method4492();
            return var1 == null ? null : var1.method4474();
        } else if (this.field3493 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3493.length; var3++) {
                if (!Statics.field3486.method3902(this.field3493[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class131[] var4 = new class131[this.field3493.length];
            for (int var5 = 0; var5 < this.field3493.length; var5++) {
                var4[var5] = class131.method2647(Statics.field3486, this.field3493[var5], 0);
            }
            class131 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class131(var4, var4.length);
            }
            if (this.field3501 != null) {
                for (int var7 = 0; var7 < this.field3501.length; var7++) {
                    var6.method2660(this.field3501[var7], this.field3520[var7]);
                }
            }
            if (this.field3503 != null) {
                for (int var8 = 0; var8 < this.field3503.length; var8++) {
                    var6.method2661(this.field3503[var8], this.field3505[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jn.k(I)Ljn;")
    public final class268 method4492() {
        int var1 = -1;
        if (this.field3516 != -1) {
            var1 = class222.method1164(this.field3516);
        } else if (this.field3517 != -1) {
            var1 = class222.field2551[this.field3517];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3488.length - 1) {
            var2 = this.field3488[var1];
        } else {
            var2 = this.field3488[this.field3488.length - 1];
        }
        return var2 == -1 ? null : method3332(var2);
    }

    @ObfuscatedName("jn.c(I)Z")
    public boolean method4471() {
        if (this.field3488 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3516 != -1) {
            var1 = class222.method1164(this.field3516);
        } else if (this.field3517 != -1) {
            var1 = class222.field2551[this.field3517];
        }
        if (var1 >= 0 && var1 < this.field3488.length) {
            return this.field3488[var1] != -1;
        } else {
            return this.field3488[this.field3488.length - 1] != -1;
        }
    }

    @ObfuscatedName("jn.u(IIB)I")
    public int method4477(int arg0, int arg1) {
        class327 var3 = this.field3491;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5561((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2139;
            }
        }
        return var4;
    }

    @ObfuscatedName("jn.t(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4478(int arg0, String arg1) {
        return class259.method275(this.field3491, arg0, arg1);
    }

    @ObfuscatedName("cb.e(I)V")
    public static void method2035() {
        field3487.method3158();
        field3492.method3158();
    }
}
