package deob;

@ObfuscatedName("jd")
public class class268 extends class185 {

    @ObfuscatedName("jd.x")
    public static class155 field3497 = new class155(64);

    @ObfuscatedName("jd.w")
    public static class155 field3498 = new class155(50);

    @ObfuscatedName("jd.t")
    public int field3532;

    @ObfuscatedName("jd.j")
    public String field3500 = class234.field2792;

    @ObfuscatedName("jd.n")
    public int field3501 = 1;

    @ObfuscatedName("jd.p")
    public int[] field3502;

    @ObfuscatedName("jd.l")
    public int[] field3503;

    @ObfuscatedName("jd.z")
    public int field3507 = -1;

    @ObfuscatedName("jd.u")
    public int field3505 = -1;

    @ObfuscatedName("jd.e")
    public int field3506 = -1;

    @ObfuscatedName("jd.m")
    public int field3526 = -1;

    @ObfuscatedName("jd.c")
    public int field3508 = -1;

    @ObfuscatedName("jd.i")
    public int field3509 = -1;

    @ObfuscatedName("jd.f")
    public int field3504 = -1;

    @ObfuscatedName("jd.a")
    public short[] field3510;

    @ObfuscatedName("jd.b")
    public short[] field3512;

    @ObfuscatedName("jd.y")
    public short[] field3513;

    @ObfuscatedName("jd.r")
    public short[] field3515;

    @ObfuscatedName("jd.q")
    public String[] field3529 = new String[5];

    @ObfuscatedName("jd.g")
    public boolean field3516 = true;

    @ObfuscatedName("jd.s")
    public int field3517 = -1;

    @ObfuscatedName("jd.o")
    public int field3518 = 128;

    @ObfuscatedName("jd.k")
    public int field3519 = 128;

    @ObfuscatedName("jd.d")
    public boolean field3495 = false;

    @ObfuscatedName("jd.an")
    public int field3521 = 0;

    @ObfuscatedName("jd.aj")
    public int field3522 = 0;

    @ObfuscatedName("jd.ax")
    public int field3520 = -1;

    @ObfuscatedName("jd.ag")
    public int field3524 = 32;

    @ObfuscatedName("jd.au")
    public int[] field3525;

    @ObfuscatedName("jd.as")
    public int field3499 = -1;

    @ObfuscatedName("jd.ae")
    public int field3527 = -1;

    @ObfuscatedName("jd.ac")
    public boolean field3528 = true;

    @ObfuscatedName("jd.ak")
    public boolean field3514 = true;

    @ObfuscatedName("jd.av")
    public boolean field3530 = false;

    @ObfuscatedName("jd.aq")
    public class327 field3531;

    @ObfuscatedName("cj.h(Lib;Lib;I)V")
    public static void method1701(class245 arg0, class245 arg1) {
        Statics.field3523 = arg0;
        Statics.field3496 = arg1;
    }

    @ObfuscatedName("aj.v(II)Ljd;")
    public static class268 method250(int arg0) {
        class268 var1 = (class268) field3497.method3147((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3523.method3834(9, arg0);
        class268 var3 = new class268();
        var3.field3532 = arg0;
        if (var2 != null) {
            var3.method4361(new class311(var2));
        }
        var3.method4360();
        field3497.method3145(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jd.x(I)V")
    public void method4360() {
    }

    @ObfuscatedName("jd.w(Lkj;I)V")
    public void method4361(class311 arg0) {
        while (true) {
            int var2 = arg0.method5274();
            if (var2 == 0) {
                return;
            }
            this.method4394(arg0, var2);
        }
    }

    @ObfuscatedName("jd.t(Lkj;IB)V")
    public void method4394(class311 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method5274();
            this.field3502 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3502[var4] = arg0.method5342();
            }
        } else if (arg1 == 2) {
            this.field3500 = arg0.method5202();
        } else if (arg1 == 12) {
            this.field3501 = arg0.method5274();
        } else if (arg1 == 13) {
            this.field3507 = arg0.method5342();
        } else if (arg1 == 14) {
            this.field3526 = arg0.method5342();
        } else if (arg1 == 15) {
            this.field3505 = arg0.method5342();
        } else if (arg1 == 16) {
            this.field3506 = arg0.method5342();
        } else if (arg1 == 17) {
            this.field3526 = arg0.method5342();
            this.field3508 = arg0.method5342();
            this.field3509 = arg0.method5342();
            this.field3504 = arg0.method5342();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3529[arg1 - 30] = arg0.method5202();
            if (this.field3529[arg1 - 30].equalsIgnoreCase(class234.field2787)) {
                this.field3529[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method5274();
            this.field3510 = new short[var5];
            this.field3512 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3510[var6] = (short) arg0.method5342();
                this.field3512[var6] = (short) arg0.method5342();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method5274();
            this.field3513 = new short[var7];
            this.field3515 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3513[var8] = (short) arg0.method5342();
                this.field3515[var8] = (short) arg0.method5342();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method5274();
            this.field3503 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3503[var10] = arg0.method5342();
            }
        } else if (arg1 == 93) {
            this.field3516 = false;
        } else if (arg1 == 95) {
            this.field3517 = arg0.method5342();
        } else if (arg1 == 97) {
            this.field3518 = arg0.method5342();
        } else if (arg1 == 98) {
            this.field3519 = arg0.method5342();
        } else if (arg1 == 99) {
            this.field3495 = true;
        } else if (arg1 == 100) {
            this.field3521 = arg0.method5148();
        } else if (arg1 == 101) {
            this.field3522 = arg0.method5148() * 5;
        } else if (arg1 == 102) {
            this.field3520 = arg0.method5342();
        } else if (arg1 == 103) {
            this.field3524 = arg0.method5342();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3499 = arg0.method5342();
            if (this.field3499 == 65535) {
                this.field3499 = -1;
            }
            this.field3527 = arg0.method5342();
            if (this.field3527 == 65535) {
                this.field3527 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method5342();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method5274();
            this.field3525 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3525[var13] = arg0.method5342();
                if (this.field3525[var13] == 65535) {
                    this.field3525[var13] = -1;
                }
            }
            this.field3525[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3528 = false;
        } else if (arg1 == 109) {
            this.field3514 = false;
        } else if (arg1 == 111) {
            this.field3530 = true;
        } else if (arg1 == 249) {
            this.field3531 = class259.method3311(arg0, this.field3531);
        }
    }

    @ObfuscatedName("jd.j(Ljy;ILjy;IB)Leh;")
    public final class137 method4365(class270 arg0, int arg1, class270 arg2, int arg3) {
        if (this.field3525 != null) {
            class268 var5 = this.method4392();
            return var5 == null ? null : var5.method4365(arg0, arg1, arg2, arg3);
        }
        class137 var6 = (class137) field3498.method3147((long) this.field3532);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3502.length; var8++) {
                if (!Statics.field3496.method3836(this.field3502[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class131[] var9 = new class131[this.field3502.length];
            for (int var10 = 0; var10 < this.field3502.length; var10++) {
                var9[var10] = class131.method2622(Statics.field3496, this.field3502[var10], 0);
            }
            class131 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class131(var9, var9.length);
            }
            if (this.field3510 != null) {
                for (int var12 = 0; var12 < this.field3510.length; var12++) {
                    var11.method2635(this.field3510[var12], this.field3512[var12]);
                }
            }
            if (this.field3513 != null) {
                for (int var13 = 0; var13 < this.field3513.length; var13++) {
                    var11.method2631(this.field3513[var13], this.field3515[var13]);
                }
            }
            var6 = var11.method2674(this.field3521 + 64, this.field3522 + 850, -30, -50, -30);
            field3498.method3145(var6, (long) this.field3532);
        }
        class137 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4442(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4422(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2719(true);
        } else {
            var14 = arg2.method4422(var6, arg3);
        }
        if (this.field3518 != 128 || this.field3519 != 128) {
            var14.method2735(this.field3518, this.field3519, this.field3518);
        }
        return var14;
    }

    @ObfuscatedName("jd.n(I)Les;")
    public final class131 method4364() {
        if (this.field3525 != null) {
            class268 var1 = this.method4392();
            return var1 == null ? null : var1.method4364();
        } else if (this.field3503 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3503.length; var3++) {
                if (!Statics.field3496.method3836(this.field3503[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class131[] var4 = new class131[this.field3503.length];
            for (int var5 = 0; var5 < this.field3503.length; var5++) {
                var4[var5] = class131.method2622(Statics.field3496, this.field3503[var5], 0);
            }
            class131 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class131(var4, var4.length);
            }
            if (this.field3510 != null) {
                for (int var7 = 0; var7 < this.field3510.length; var7++) {
                    var6.method2635(this.field3510[var7], this.field3512[var7]);
                }
            }
            if (this.field3513 != null) {
                for (int var8 = 0; var8 < this.field3513.length; var8++) {
                    var6.method2631(this.field3513[var8], this.field3515[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("jd.p(B)Ljd;")
    public final class268 method4392() {
        int var1 = -1;
        if (this.field3499 != -1) {
            var1 = class222.method3680(this.field3499);
        } else if (this.field3527 != -1) {
            var1 = class222.field2542[this.field3527];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3525.length - 1) {
            var2 = this.field3525[var1];
        } else {
            var2 = this.field3525[this.field3525.length - 1];
        }
        return var2 == -1 ? null : method250(var2);
    }

    @ObfuscatedName("jd.l(I)Z")
    public boolean method4374() {
        if (this.field3525 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3499 != -1) {
            var1 = class222.method3680(this.field3499);
        } else if (this.field3527 != -1) {
            var1 = class222.field2542[this.field3527];
        }
        if (var1 >= 0 && var1 < this.field3525.length) {
            return this.field3525[var1] != -1;
        } else {
            return this.field3525[this.field3525.length - 1] != -1;
        }
    }

    @ObfuscatedName("jd.z(III)I")
    public int method4367(int arg0, int arg1) {
        class327 var3 = this.field3531;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class189 var5 = (class189) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2136;
            }
        }
        return var4;
    }

    @ObfuscatedName("jd.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4368(int arg0, String arg1) {
        class327 var3 = this.field3531;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class186 var5 = (class186) var3.method5494((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2132;
            }
        }
        return var4;
    }

    @ObfuscatedName("ae.e(I)V")
    public static void method308() {
        field3497.method3146();
        field3498.method3146();
    }
}
