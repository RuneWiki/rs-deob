package deob;

@ObfuscatedName("ia")
public class class259 extends class195 {

    @ObfuscatedName("ia.q")
    public static class190 field3552 = new class190(64);

    @ObfuscatedName("ia.o")
    public static class190 field3553 = new class190(50);

    @ObfuscatedName("ia.g")
    public int field3554;

    @ObfuscatedName("ia.v")
    public String field3559 = "null";

    @ObfuscatedName("ia.p")
    public int field3556 = 1;

    @ObfuscatedName("ia.e")
    public int[] field3557;

    @ObfuscatedName("ia.d")
    public int[] field3558;

    @ObfuscatedName("ia.x")
    public int field3550 = -1;

    @ObfuscatedName("ia.z")
    public int field3586 = -1;

    @ObfuscatedName("ia.n")
    public int field3561 = -1;

    @ObfuscatedName("ia.u")
    public int field3574 = -1;

    @ObfuscatedName("ia.t")
    public int field3579 = -1;

    @ObfuscatedName("ia.a")
    public int field3564 = -1;

    @ObfuscatedName("ia.i")
    public int field3565 = -1;

    @ObfuscatedName("ia.h")
    public short[] field3562;

    @ObfuscatedName("ia.b")
    public short[] field3567;

    @ObfuscatedName("ia.j")
    public short[] field3568;

    @ObfuscatedName("ia.y")
    public short[] field3569;

    @ObfuscatedName("ia.k")
    public String[] field3570 = new String[5];

    @ObfuscatedName("ia.c")
    public boolean field3566 = true;

    @ObfuscatedName("ia.r")
    public int field3572 = -1;

    @ObfuscatedName("ia.m")
    public int field3573 = 128;

    @ObfuscatedName("ia.l")
    public int field3555 = 128;

    @ObfuscatedName("ia.f")
    public boolean field3575 = false;

    @ObfuscatedName("ia.ap")
    public int field3576 = 0;

    @ObfuscatedName("ia.af")
    public int field3577 = 0;

    @ObfuscatedName("ia.aa")
    public int field3578 = -1;

    @ObfuscatedName("ia.ay")
    public int field3563 = 32;

    @ObfuscatedName("ia.aw")
    public int[] field3580;

    @ObfuscatedName("ia.az")
    public int field3581 = -1;

    @ObfuscatedName("ia.at")
    public int field3582 = -1;

    @ObfuscatedName("ia.ao")
    public boolean field3583 = true;

    @ObfuscatedName("ia.aq")
    public boolean field3584 = true;

    @ObfuscatedName("ia.ax")
    public boolean field3585 = false;

    @ObfuscatedName("ia.av")
    public class187 field3571;

    @ObfuscatedName("at.w(Lip;Lip;B)V")
    public static void method305(class236 arg0, class236 arg1) {
        Statics.field3560 = arg0;
        Statics.field3551 = arg1;
    }

    @ObfuscatedName("b.s(II)Lia;")
    public static class259 method116(int arg0) {
        class259 var1 = (class259) field3552.method3357((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3560.method3876(9, arg0);
        class259 var3 = new class259();
        var3.field3554 = arg0;
        if (var2 != null) {
            var3.method4392(new class174(var2));
        }
        var3.method4402();
        field3552.method3371(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ia.q(I)V")
    public void method4402() {
    }

    @ObfuscatedName("ia.o(Lfz;I)V")
    public void method4392(class174 arg0) {
        while (true) {
            int var2 = arg0.method2971();
            if (var2 == 0) {
                return;
            }
            this.method4393(arg0, var2);
        }
    }

    @ObfuscatedName("ia.g(Lfz;II)V")
    public void method4393(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2971();
            this.field3557 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3557[var4] = arg0.method3178();
            }
        } else if (arg1 == 2) {
            this.field3559 = arg0.method3111();
        } else if (arg1 == 12) {
            this.field3556 = arg0.method2971();
        } else if (arg1 == 13) {
            this.field3550 = arg0.method3178();
        } else if (arg1 == 14) {
            this.field3574 = arg0.method3178();
        } else if (arg1 == 15) {
            this.field3586 = arg0.method3178();
        } else if (arg1 == 16) {
            this.field3561 = arg0.method3178();
        } else if (arg1 == 17) {
            this.field3574 = arg0.method3178();
            this.field3579 = arg0.method3178();
            this.field3564 = arg0.method3178();
            this.field3565 = arg0.method3178();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3570[arg1 - 30] = arg0.method3111();
            if (this.field3570[arg1 - 30].equalsIgnoreCase(class226.field2857)) {
                this.field3570[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2971();
            this.field3562 = new short[var5];
            this.field3567 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3562[var6] = (short) arg0.method3178();
                this.field3567[var6] = (short) arg0.method3178();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2971();
            this.field3568 = new short[var7];
            this.field3569 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3568[var8] = (short) arg0.method3178();
                this.field3569[var8] = (short) arg0.method3178();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2971();
            this.field3558 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3558[var10] = arg0.method3178();
            }
        } else if (arg1 == 93) {
            this.field3566 = false;
        } else if (arg1 == 95) {
            this.field3572 = arg0.method3178();
        } else if (arg1 == 97) {
            this.field3573 = arg0.method3178();
        } else if (arg1 == 98) {
            this.field3555 = arg0.method3178();
        } else if (arg1 == 99) {
            this.field3575 = true;
        } else if (arg1 == 100) {
            this.field3576 = arg0.method2972();
        } else if (arg1 == 101) {
            this.field3577 = arg0.method2972();
        } else if (arg1 == 102) {
            this.field3578 = arg0.method3178();
        } else if (arg1 == 103) {
            this.field3563 = arg0.method3178();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3581 = arg0.method3178();
            if (this.field3581 == 65535) {
                this.field3581 = -1;
            }
            this.field3582 = arg0.method3178();
            if (this.field3582 == 65535) {
                this.field3582 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method3178();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2971();
            this.field3580 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3580[var13] = arg0.method3178();
                if (this.field3580[var13] == 65535) {
                    this.field3580[var13] = -1;
                }
            }
            this.field3580[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3583 = false;
        } else if (arg1 == 109) {
            this.field3584 = false;
        } else if (arg1 == 111) {
            this.field3585 = true;
        } else if (arg1 == 249) {
            this.field3571 = class250.method2227(arg0, this.field3571);
        }
    }

    @ObfuscatedName("ia.v(Ljt;ILjt;IB)Leh;")
    public final class132 method4394(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3580 != null) {
            class259 var5 = this.method4396();
            return var5 == null ? null : var5.method4394(arg0, arg1, arg2, arg3);
        }
        class132 var6 = (class132) field3553.method3357((long) this.field3554);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3557.length; var8++) {
                if (!Statics.field3551.method3878(this.field3557[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class126[] var9 = new class126[this.field3557.length];
            for (int var10 = 0; var10 < this.field3557.length; var10++) {
                var9[var10] = class126.method2334(Statics.field3551, this.field3557[var10], 0);
            }
            class126 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class126(var9, var9.length);
            }
            if (this.field3562 != null) {
                for (int var12 = 0; var12 < this.field3562.length; var12++) {
                    var11.method2267(this.field3562[var12], this.field3567[var12]);
                }
            }
            if (this.field3568 != null) {
                for (int var13 = 0; var13 < this.field3568.length; var13++) {
                    var11.method2295(this.field3568[var13], this.field3569[var13]);
                }
            }
            var6 = var11.method2275(this.field3576 + 64, this.field3577 * 5 + 850, -30, -50, -30);
            field3553.method3371(var6, (long) this.field3554);
        }
        class132 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4450(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4445(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2428(true);
        } else {
            var14 = arg2.method4445(var6, arg3);
        }
        if (this.field3573 != 128 || this.field3555 != 128) {
            var14.method2424(this.field3573, this.field3555, this.field3573);
        }
        return var14;
    }

    @ObfuscatedName("ia.p(I)Ldo;")
    public final class126 method4418() {
        if (this.field3580 != null) {
            class259 var1 = this.method4396();
            return var1 == null ? null : var1.method4418();
        } else if (this.field3558 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3558.length; var3++) {
                if (!Statics.field3551.method3878(this.field3558[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class126[] var4 = new class126[this.field3558.length];
            for (int var5 = 0; var5 < this.field3558.length; var5++) {
                var4[var5] = class126.method2334(Statics.field3551, this.field3558[var5], 0);
            }
            class126 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class126(var4, var4.length);
            }
            if (this.field3562 != null) {
                for (int var7 = 0; var7 < this.field3562.length; var7++) {
                    var6.method2267(this.field3562[var7], this.field3567[var7]);
                }
            }
            if (this.field3568 != null) {
                for (int var8 = 0; var8 < this.field3568.length; var8++) {
                    var6.method2295(this.field3568[var8], this.field3569[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ia.e(B)Lia;")
    public final class259 method4396() {
        int var1 = -1;
        if (this.field3581 != -1) {
            var1 = Statics.method1604(this.field3581);
        } else if (this.field3582 != -1) {
            var1 = class212.field2599[this.field3582];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3580.length - 1) {
            var2 = this.field3580[var1];
        } else {
            var2 = this.field3580[this.field3580.length - 1];
        }
        return var2 == -1 ? null : method116(var2);
    }

    @ObfuscatedName("ia.d(I)Z")
    public boolean method4397() {
        if (this.field3580 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3581 != -1) {
            var1 = Statics.method1604(this.field3581);
        } else if (this.field3582 != -1) {
            var1 = class212.field2599[this.field3582];
        }
        if (var1 >= 0 && var1 < this.field3580.length) {
            return this.field3580[var1] != -1;
        } else {
            return this.field3580[this.field3580.length - 1] != -1;
        }
    }

    @ObfuscatedName("ia.x(III)I")
    public int method4398(int arg0, int arg1) {
        return class250.method3857(this.field3571, arg0, arg1);
    }

    @ObfuscatedName("ia.u(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4417(int arg0, String arg1) {
        return class250.method3625(this.field3571, arg0, arg1);
    }
}
