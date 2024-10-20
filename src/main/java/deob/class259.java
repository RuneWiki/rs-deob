package deob;

@ObfuscatedName("ie")
public class class259 extends class195 {

    @ObfuscatedName("ie.e")
    public static class190 field3586 = new class190(64);

    @ObfuscatedName("ie.t")
    public static class190 field3589 = new class190(50);

    @ObfuscatedName("ie.w")
    public int field3558;

    @ObfuscatedName("ie.z")
    public String field3563 = "null";

    @ObfuscatedName("ie.j")
    public int field3560 = 1;

    @ObfuscatedName("ie.i")
    public int[] field3567;

    @ObfuscatedName("ie.f")
    public int[] field3571;

    @ObfuscatedName("ie.c")
    public int field3559 = -1;

    @ObfuscatedName("ie.o")
    public int field3564 = -1;

    @ObfuscatedName("ie.q")
    public int field3565 = -1;

    @ObfuscatedName("ie.n")
    public int field3566 = -1;

    @ObfuscatedName("ie.a")
    public int field3561 = -1;

    @ObfuscatedName("ie.g")
    public int field3568 = -1;

    @ObfuscatedName("ie.v")
    public int field3569 = -1;

    @ObfuscatedName("ie.s")
    public short[] field3570;

    @ObfuscatedName("ie.k")
    public short[] field3575;

    @ObfuscatedName("ie.r")
    public short[] field3557;

    @ObfuscatedName("ie.l")
    public short[] field3555;

    @ObfuscatedName("ie.h")
    public String[] field3574 = new String[5];

    @ObfuscatedName("ie.d")
    public boolean field3554 = true;

    @ObfuscatedName("ie.x")
    public int field3576 = -1;

    @ObfuscatedName("ie.b")
    public int field3577 = 128;

    @ObfuscatedName("ie.y")
    public int field3578 = 128;

    @ObfuscatedName("ie.u")
    public boolean field3579 = false;

    @ObfuscatedName("ie.av")
    public int field3580 = 0;

    @ObfuscatedName("ie.ax")
    public int field3581 = 0;

    @ObfuscatedName("ie.af")
    public int field3582 = -1;

    @ObfuscatedName("ie.ae")
    public int field3583 = 32;

    @ObfuscatedName("ie.ap")
    public int[] field3584;

    @ObfuscatedName("ie.ak")
    public int field3572 = -1;

    @ObfuscatedName("ie.al")
    public int field3562 = -1;

    @ObfuscatedName("ie.ab")
    public boolean field3587 = true;

    @ObfuscatedName("ie.am")
    public boolean field3588 = true;

    @ObfuscatedName("ie.ar")
    public boolean field3573 = false;

    @ObfuscatedName("ie.ao")
    public class187 field3590;

    @ObfuscatedName("ih.p(Lil;Lil;I)V")
    public static void method4034(class236 arg0, class236 arg1) {
        Statics.field3585 = arg0;
        Statics.field3556 = arg1;
    }

    @ObfuscatedName("fp.m(II)Lie;")
    public static class259 method2658(int arg0) {
        class259 var1 = (class259) field3586.method3182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3585.method3720(9, arg0);
        class259 var3 = new class259();
        var3.field3558 = arg0;
        if (var2 != null) {
            var3.method4227(new class174(var2));
        }
        var3.method4204();
        field3586.method3179(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ie.e(I)V")
    public void method4204() {
    }

    @ObfuscatedName("ie.t(Lfr;I)V")
    public void method4227(class174 arg0) {
        while (true) {
            int var2 = arg0.method2810();
            if (var2 == 0) {
                return;
            }
            this.method4206(arg0, var2);
        }
    }

    @ObfuscatedName("ie.w(Lfr;II)V")
    public void method4206(class174 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2810();
            this.field3567 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3567[var4] = arg0.method2824();
            }
        } else if (arg1 == 2) {
            this.field3563 = arg0.method2818();
        } else if (arg1 == 12) {
            this.field3560 = arg0.method2810();
        } else if (arg1 == 13) {
            this.field3559 = arg0.method2824();
        } else if (arg1 == 14) {
            this.field3566 = arg0.method2824();
        } else if (arg1 == 15) {
            this.field3564 = arg0.method2824();
        } else if (arg1 == 16) {
            this.field3565 = arg0.method2824();
        } else if (arg1 == 17) {
            this.field3566 = arg0.method2824();
            this.field3561 = arg0.method2824();
            this.field3568 = arg0.method2824();
            this.field3569 = arg0.method2824();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field3574[arg1 - 30] = arg0.method2818();
            if (this.field3574[arg1 - 30].equalsIgnoreCase(class226.field2866)) {
                this.field3574[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2810();
            this.field3570 = new short[var5];
            this.field3575 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3570[var6] = (short) arg0.method2824();
                this.field3575[var6] = (short) arg0.method2824();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2810();
            this.field3557 = new short[var7];
            this.field3555 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3557[var8] = (short) arg0.method2824();
                this.field3555[var8] = (short) arg0.method2824();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2810();
            this.field3571 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3571[var10] = arg0.method2824();
            }
        } else if (arg1 == 93) {
            this.field3554 = false;
        } else if (arg1 == 95) {
            this.field3576 = arg0.method2824();
        } else if (arg1 == 97) {
            this.field3577 = arg0.method2824();
        } else if (arg1 == 98) {
            this.field3578 = arg0.method2824();
        } else if (arg1 == 99) {
            this.field3579 = true;
        } else if (arg1 == 100) {
            this.field3580 = arg0.method2811();
        } else if (arg1 == 101) {
            this.field3581 = arg0.method2811() * 5;
        } else if (arg1 == 102) {
            this.field3582 = arg0.method2824();
        } else if (arg1 == 103) {
            this.field3583 = arg0.method2824();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field3572 = arg0.method2824();
            if (this.field3572 == 65535) {
                this.field3572 = -1;
            }
            this.field3562 = arg0.method2824();
            if (this.field3562 == 65535) {
                this.field3562 = -1;
            }
            int var11 = -1;
            if (arg1 == 118) {
                var11 = arg0.method2824();
                if (var11 == 65535) {
                    var11 = -1;
                }
            }
            int var12 = arg0.method2810();
            this.field3584 = new int[var12 + 2];
            for (int var13 = 0; var13 <= var12; var13++) {
                this.field3584[var13] = arg0.method2824();
                if (this.field3584[var13] == 65535) {
                    this.field3584[var13] = -1;
                }
            }
            this.field3584[var12 + 1] = var11;
        } else if (arg1 == 107) {
            this.field3587 = false;
        } else if (arg1 == 109) {
            this.field3588 = false;
        } else if (arg1 == 111) {
            this.field3573 = true;
        } else if (arg1 == 249) {
            this.field3590 = class250.method2793(arg0, this.field3590);
        }
    }

    @ObfuscatedName("ie.z(Ljo;ILjo;II)Les;")
    public final class134 method4207(class261 arg0, int arg1, class261 arg2, int arg3) {
        if (this.field3584 != null) {
            class259 var5 = this.method4218();
            return var5 == null ? null : var5.method4207(arg0, arg1, arg2, arg3);
        }
        class134 var6 = (class134) field3589.method3182((long) this.field3558);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field3567.length; var8++) {
                if (!Statics.field3556.method3706(this.field3567[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class128[] var9 = new class128[this.field3567.length];
            for (int var10 = 0; var10 < this.field3567.length; var10++) {
                var9[var10] = class128.method2137(Statics.field3556, this.field3567[var10], 0);
            }
            class128 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class128(var9, var9.length);
            }
            if (this.field3570 != null) {
                for (int var12 = 0; var12 < this.field3570.length; var12++) {
                    var11.method2149(this.field3570[var12], this.field3575[var12]);
                }
            }
            if (this.field3557 != null) {
                for (int var13 = 0; var13 < this.field3557.length; var13++) {
                    var11.method2147(this.field3557[var13], this.field3555[var13]);
                }
            }
            var6 = var11.method2148(this.field3580 + 64, this.field3581 + 850, -30, -50, -30);
            field3589.method3179(var6, (long) this.field3558);
        }
        class134 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method4278(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method4271(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2220(true);
        } else {
            var14 = arg2.method4271(var6, arg3);
        }
        if (this.field3577 != 128 || this.field3578 != 128) {
            var14.method2236(this.field3577, this.field3578, this.field3577);
        }
        return var14;
    }

    @ObfuscatedName("ie.j(I)Ldo;")
    public final class128 method4213() {
        if (this.field3584 != null) {
            class259 var1 = this.method4218();
            return var1 == null ? null : var1.method4213();
        } else if (this.field3571 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field3571.length; var3++) {
                if (!Statics.field3556.method3706(this.field3571[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class128[] var4 = new class128[this.field3571.length];
            for (int var5 = 0; var5 < this.field3571.length; var5++) {
                var4[var5] = class128.method2137(Statics.field3556, this.field3571[var5], 0);
            }
            class128 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class128(var4, var4.length);
            }
            if (this.field3570 != null) {
                for (int var7 = 0; var7 < this.field3570.length; var7++) {
                    var6.method2149(this.field3570[var7], this.field3575[var7]);
                }
            }
            if (this.field3557 != null) {
                for (int var8 = 0; var8 < this.field3557.length; var8++) {
                    var6.method2147(this.field3557[var8], this.field3555[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ie.c(I)Lie;")
    public final class259 method4218() {
        int var1 = -1;
        if (this.field3572 != -1) {
            var1 = class212.method659(this.field3572);
        } else if (this.field3562 != -1) {
            var1 = class212.field2616[this.field3562];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field3584.length - 1) {
            var2 = this.field3584[var1];
        } else {
            var2 = this.field3584[this.field3584.length - 1];
        }
        return var2 == -1 ? null : method2658(var2);
    }

    @ObfuscatedName("ie.o(I)Z")
    public boolean method4210() {
        if (this.field3584 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field3572 != -1) {
            var1 = class212.method659(this.field3572);
        } else if (this.field3562 != -1) {
            var1 = class212.field2616[this.field3562];
        }
        if (var1 >= 0 && var1 < this.field3584.length) {
            return this.field3584[var1] != -1;
        } else {
            return this.field3584[this.field3584.length - 1] != -1;
        }
    }

    @ObfuscatedName("ie.q(IIB)I")
    public int method4211(int arg0, int arg1) {
        return class250.method1645(this.field3590, arg0, arg1);
    }

    @ObfuscatedName("ie.n(ILjava/lang/String;B)Ljava/lang/String;")
    public String method4212(int arg0, String arg1) {
        return class250.method2742(this.field3590, arg0, arg1);
    }

    @ObfuscatedName("eg.a(B)V")
    public static void method2585() {
        field3586.method3180();
        field3589.method3180();
    }
}
