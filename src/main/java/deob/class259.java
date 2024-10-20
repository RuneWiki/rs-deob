package deob;

@ObfuscatedName("iv")
public class class259 extends class195 {

    @ObfuscatedName("iv.u")
    public static class190 field3545 = new class190(64);

    @ObfuscatedName("iv.q")
    public static class190 field3548 = new class190(50);

    @ObfuscatedName("iv.g")
    public int field3547;

    @ObfuscatedName("iv.v")
    public String field3573 = "null";

    @ObfuscatedName("iv.t")
    public int field3549 = 1;

    @ObfuscatedName("iv.p")
    public int[] field3562;

    @ObfuscatedName("iv.l")
    public int[] field3551;

    @ObfuscatedName("iv.a")
    public int field3561 = -1;

    @ObfuscatedName("iv.k")
    public int field3574 = -1;

    @ObfuscatedName("iv.r")
    public int field3554 = -1;

    @ObfuscatedName("iv.b")
    public int field3555 = -1;

    @ObfuscatedName("iv.x")
    public int field3556 = -1;

    @ObfuscatedName("iv.o")
    public int field3557 = -1;

    @ObfuscatedName("iv.j")
    public int field3546 = -1;

    @ObfuscatedName("iv.m")
    public short[] field3575;

    @ObfuscatedName("iv.d")
    public short[] field3560;

    @ObfuscatedName("iv.e")
    public short[] field3567;

    @ObfuscatedName("iv.s")
    public short[] field3544;

    @ObfuscatedName("iv.n")
    public String[] field3563 = new String[5];

    @ObfuscatedName("iv.y")
    public boolean field3564 = true;

    @ObfuscatedName("iv.w")
    public int field3553 = -1;

    @ObfuscatedName("iv.f")
    public int field3566 = 128;

    @ObfuscatedName("iv.c")
    public int field3565 = 128;

    @ObfuscatedName("iv.z")
    public boolean field3571 = false;

    @ObfuscatedName("iv.ay")
    public int field3569 = 0;

    @ObfuscatedName("iv.ah")
    public int field3570 = 0;

    @ObfuscatedName("iv.az")
    public int field3558 = -1;

    @ObfuscatedName("iv.ac")
    public int field3572 = 32;

    @ObfuscatedName("iv.aq")
    public int[] field3550;

    @ObfuscatedName("iv.af")
    public int field3559 = -1;

    @ObfuscatedName("iv.aj")
    public int field3568 = -1;

    @ObfuscatedName("iv.ax")
    public boolean field3576 = true;

    @ObfuscatedName("iv.ad")
    public boolean field3577 = true;

    @ObfuscatedName("iv.av")
    public boolean field3578 = false;

    @ObfuscatedName("iv.ae")
    public class187 field3579;

    @ObfuscatedName("iv.h(I)V")
    public void method4340() {
    }

    @ObfuscatedName("iv.u(Lfv;I)V")
    public void method4341(class174 arg0) {
        while (true) {
            int var2 = arg0.method2930();
            if (var2 == 0) {
                return;
            }
            this.method4361(arg0, var2);
        }
    }

    @ObfuscatedName("iv.q(Lfv;II)V")
    public void method4361(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2930();
            this.field3562 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3562[var4] = arg0.method2932();
            }
        } else if (arg1 == 2) {
            this.field3573 = arg0.method2938();
        } else if (arg1 == 12) {
            this.field3549 = arg0.method2930();
        } else if (arg1 == 13) {
            this.field3561 = arg0.method2932();
        } else if (arg1 == 14) {
            this.field3555 = arg0.method2932();
        } else if (arg1 == 15) {
            this.field3574 = arg0.method2932();
        } else if (arg1 == 16) {
            this.field3554 = arg0.method2932();
        } else if (arg1 == 17) {
            this.field3555 = arg0.method2932();
            this.field3556 = arg0.method2932();
            this.field3557 = arg0.method2932();
            this.field3546 = arg0.method2932();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3563[arg1 - 30] = arg0.method2938();
            if (this.field3563[arg1 - 30].equalsIgnoreCase(class226.field2845)) {
                this.field3563[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2930();
            this.field3575 = new short[var5];
            this.field3560 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3575[var6] = (short) arg0.method2932();
                this.field3560[var6] = (short) arg0.method2932();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2930();
            this.field3567 = new short[var7];
            this.field3544 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3567[var8] = (short) arg0.method2932();
                this.field3544[var8] = (short) arg0.method2932();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2930();
            this.field3551 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3551[var10] = arg0.method2932();
            }
        } else if (arg1 == 93) {
            this.field3564 = false;
        } else if (arg1 == 95) {
            this.field3553 = arg0.method2932();
        } else if (arg1 == 97) {
            this.field3566 = arg0.method2932();
        } else if (arg1 == 98) {
            this.field3565 = arg0.method2932();
        } else if (arg1 == 99) {
            this.field3571 = true;
        } else if (arg1 == 100) {
            this.field3569 = arg0.method2931();
        } else if (arg1 == 101) {
            this.field3570 = arg0.method2931() * 5;
        } else if (arg1 == 102) {
            this.field3558 = arg0.method2932();
        } else if (arg1 == 103) {
            this.field3572 = arg0.method2932();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3559 = arg0.method2932();
            if (this.field3559 == 65535) {
                this.field3559 = -1;
            }
            this.field3568 = arg0.method2932();
            if (this.field3568 == 65535) {
                this.field3568 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2932();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2930();
            this.field3550 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3550[var13] = arg0.method2932();
                if (this.field3550[var13] == 65535) {
                    this.field3550[var13] = -1;
                }
            }
            this.field3550[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3576 = false;
        } else if (arg1 == 109) {
            this.field3577 = false;
        } else if (arg1 == 111) {
            this.field3578 = true;
        } else if (arg1 == 249) {
            this.field3579 = class250.method2688(arg0, this.field3579);
        }
    }

    @ObfuscatedName("iv.g(Lje;ILje;II)Lew;")
    public final class134 method4343(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3550 != null) {
            class259 var5 = this.method4345();
            return var5 == null ? null : var5.method4343(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3548.method3308((long) this.field3547);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3562.length; var8++) {
                if (!Statics.field3552.method3838(this.field3562[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3562.length];
            for (int var10 = 0; var10 < this.field3562.length; var10++) {
                var9[var10] = class128.method2227(Statics.field3552, this.field3562[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3575 != null) {
                for (int var12 = 0; var12 < this.field3575.length; var12++) {
                    var11.method2289(this.field3575[var12], this.field3560[var12]);
                }
            }
            if (this.field3567 != null) {
                for (int var13 = 0; var13 < this.field3567.length; var13++) {
                    var11.method2295(this.field3567[var13], this.field3544[var13]);
                }
            }
            var6 = var11.method2271(this.field3569 + 64, this.field3570 + 850, -30, -50, -30);
            field3548.method3316(var6, (long) this.field3547);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4398(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4395(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2319(true);
        } else {
            var14 = arg2.method4395(var6, arg3);
        }
        if (this.field3566 != 128 || this.field3565 != 128) {
            var14.method2317(this.field3566, this.field3565, this.field3566);
        }
        return var14;
    }

    @ObfuscatedName("iv.v(I)Ldf;")
    public final class128 method4344() {
        if (this.field3550 != null) {
            class259 var1 = this.method4345();
            return var1 == null ? null : var1.method4344();
        } else if (this.field3551 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3551.length; var3++) {
                if (!Statics.field3552.method3838(this.field3551[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3551.length];
            for (int var5 = 0; var5 < this.field3551.length; var5++) {
                var4[var5] = class128.method2227(Statics.field3552, this.field3551[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3575 != null) {
                for (int var7 = 0; var7 < this.field3575.length; var7++) {
                    var6.method2289(this.field3575[var7], this.field3560[var7]);
                }
            }
            if (this.field3567 != null) {
                for (int var8 = 0; var8 < this.field3567.length; var8++) {
                    var6.method2295(this.field3567[var8], this.field3544[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("iv.t(I)Liv;")
    public final class259 method4345() {
        int var1 = -1;
        if (this.field3559 != -1) {
            var1 = class212.method1417(this.field3559);
        } else if (this.field3568 != -1) {
            var1 = class212.field2597[this.field3568];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3550.length - 1) {
            var2 = this.field3550[var1];
        } else {
            var2 = this.field3550[this.field3550.length - 1];
        }
        return var2 == -1 ? null : Statics.method3810(var2);
    }

    @ObfuscatedName("iv.p(I)Z")
    public boolean method4346() {
        if (this.field3550 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3559 != -1) {
            var1 = class212.method1417(this.field3559);
        } else if (this.field3568 != -1) {
            var1 = class212.field2597[this.field3568];
        }
        if (var1 >= 0 && var1 < this.field3550.length) {
            return this.field3550[var1] != -1;
        } else {
            return this.field3550[this.field3550.length - 1] != -1;
        }
    }

    @ObfuscatedName("iv.l(III)I")
    public int method4366(int arg0, int arg1) {
        return class250.method2899(this.field3579, arg0, arg1);
    }

    @ObfuscatedName("iv.a(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4348(int arg0, String arg1) {
        return Statics.method4095(this.field3579, arg0, arg1);
    }

    @ObfuscatedName("ce.k(S)V")
    public static void method1641() {
        field3545.method3311();
        field3548.method3311();
    }
}
