package deob;

@ObfuscatedName("jg")
public class class276 extends class209 {

    @ObfuscatedName("jg.q")
    public static class203 field3619 = new class203(64);

    @ObfuscatedName("jg.c")
    public static class203 field3620 = new class203(100);

    @ObfuscatedName("jg.l")
    public int[] field3624;

    @ObfuscatedName("jg.b")
    public int[] field3622;

    @ObfuscatedName("jg.w")
    public int[] field3631;

    @ObfuscatedName("jg.n")
    public int[] field3621;

    @ObfuscatedName("jg.i")
    public int field3625 = -1;

    @ObfuscatedName("jg.p")
    public int[] field3626;

    @ObfuscatedName("jg.m")
    public boolean field3627 = false;

    @ObfuscatedName("jg.d")
    public int field3628 = 5;

    @ObfuscatedName("jg.j")
    public int field3629 = -1;

    @ObfuscatedName("jg.x")
    public int field3630 = -1;

    @ObfuscatedName("jg.v")
    public int field3634 = 99;

    @ObfuscatedName("jg.h")
    public int field3623 = -1;

    @ObfuscatedName("jg.f")
    public int field3633 = -1;

    @ObfuscatedName("jg.a")
    public int field3616 = 2;

    @ObfuscatedName("bq.g(Liu;Liu;Liu;I)V")
    public static void method1052(class250 arg0, class250 arg1, class250 arg2) {
        Statics.field3632 = arg0;
        Statics.field3617 = arg1;
        Statics.field3618 = arg2;
    }

    @ObfuscatedName("aw.r(II)Ljg;")
    public static class276 method493(int arg0) {
        class276 var1 = (class276) field3619.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3632.method4438(12, arg0);
        class276 var3 = new class276();
        if (var2 != null) {
            var3.method5050(new class185(var2));
        }
        var3.method5042();
        field3619.method3885(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jg.e(Lgl;I)V")
    public void method5050(class185 arg0) {
        while (true) {
            int var2 = arg0.method3679();
            if (var2 == 0) {
                return;
            }
            this.method5041(arg0, var2);
        }
    }

    @ObfuscatedName("jg.q(Lgl;II)V")
    public void method5041(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3467();
            this.field3631 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3631[var4] = arg0.method3467();
            }
            this.field3624 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3624[var5] = arg0.method3467();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3624[var6] += arg0.method3467() << 16;
            }
        } else if (arg1 == 2) {
            this.field3625 = arg0.method3467();
        } else if (arg1 == 3) {
            int var7 = arg0.method3679();
            this.field3626 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3626[var8] = arg0.method3679();
            }
            this.field3626[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3627 = true;
        } else if (arg1 == 5) {
            this.field3628 = arg0.method3679();
        } else if (arg1 == 6) {
            this.field3629 = arg0.method3467();
        } else if (arg1 == 7) {
            this.field3630 = arg0.method3467();
        } else if (arg1 == 8) {
            this.field3634 = arg0.method3679();
        } else if (arg1 == 9) {
            this.field3623 = arg0.method3679();
        } else if (arg1 == 10) {
            this.field3633 = arg0.method3679();
        } else if (arg1 == 11) {
            this.field3616 = arg0.method3679();
        } else if (arg1 == 12) {
            int var9 = arg0.method3679();
            this.field3622 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3622[var10] = arg0.method3467();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3622[var11] += arg0.method3467() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method3679();
            this.field3621 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3621[var13] = arg0.method3469();
            }
        }
    }

    @ObfuscatedName("jg.c(I)V")
    public void method5042() {
        if (this.field3623 == -1) {
            if (this.field3626 == null) {
                this.field3623 = 0;
            } else {
                this.field3623 = 2;
            }
        }
        if (this.field3633 != -1) {
            return;
        }
        if (this.field3626 == null) {
            this.field3633 = 0;
        } else {
            this.field3633 = 2;
        }
    }

    @ObfuscatedName("jg.i(Ldl;II)Ldl;")
    public class122 method5043(class122 arg0, int arg1) {
        int var3 = this.field3624[arg1];
        class133 var4 = method456(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2667(true);
        } else {
            class122 var6 = arg0.method2667(!var4.method3036(var5));
            var6.method2668(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jg.p(Ldl;III)Ldl;")
    public class122 method5044(class122 arg0, int arg1, int arg2) {
        int var4 = this.field3624[arg1];
        class133 var5 = method456(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2667(true);
        }
        class122 var7 = arg0.method2667(!var5.method3036(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2694();
        } else if (var8 == 2) {
            var7.method2682();
        } else if (var8 == 3) {
            var7.method2678();
        }
        var7.method2668(var5, var6);
        if (var8 == 1) {
            var7.method2678();
        } else if (var8 == 2) {
            var7.method2682();
        } else if (var8 == 3) {
            var7.method2694();
        }
        return var7;
    }

    @ObfuscatedName("jg.m(Ldl;II)Ldl;")
    public class122 method5072(class122 arg0, int arg1) {
        int var3 = this.field3624[arg1];
        class133 var4 = method456(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2679(true);
        } else {
            class122 var6 = arg0.method2679(!var4.method3036(var5));
            var6.method2668(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jg.d(Ldl;ILjg;II)Ldl;")
    public class122 method5045(class122 arg0, int arg1, class276 arg2, int arg3) {
        int var5 = this.field3624[arg1];
        class133 var6 = method456(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method5043(arg0, arg3);
        }
        int var8 = arg2.field3624[arg3];
        class133 var9 = method456(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class122 var11 = arg0.method2667(!var6.method3036(var7));
            var11.method2668(var6, var7);
            return var11;
        } else {
            class122 var12 = arg0.method2667(!var6.method3036(var7) & !var9.method3036(var10));
            var12.method2684(var6, var7, var9, var10, this.field3626);
            return var12;
        }
    }

    @ObfuscatedName("jg.j(Ldl;II)Ldl;")
    public class122 method5039(class122 arg0, int arg1) {
        int var3 = this.field3624[arg1];
        class133 var4 = method456(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2667(true);
        }
        class133 var6 = null;
        int var7 = 0;
        if (this.field3622 != null && arg1 < this.field3622.length) {
            int var8 = this.field3622[arg1];
            var6 = method456(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class122 var10 = arg0.method2667(!var4.method3036(var5));
            var10.method2668(var4, var5);
            return var10;
        } else {
            class122 var9 = arg0.method2667(!var4.method3036(var5) & !var6.method3036(var7));
            var9.method2668(var4, var5);
            var9.method2668(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("u.x(IB)Lel;")
    public static class133 method456(int arg0) {
        class133 var1 = (class133) field3620.method3879((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class250 var2 = Statics.field3617;
        class250 var3 = Statics.field3618;
        boolean var4 = true;
        int[] var5 = var2.method4446(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method4443(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method4443(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class133 var10;
        if (var4) {
            try {
                var10 = new class133(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field3620.method3885(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("aq.v(I)V")
    public static void method983() {
        field3619.method3880();
        field3620.method3880();
    }
}
