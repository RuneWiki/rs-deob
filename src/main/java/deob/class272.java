package deob;

@ObfuscatedName("jj")
public class class272 extends class206 {

    @ObfuscatedName("jj.k")
    public static class201 field3672 = new class201(64);

    @ObfuscatedName("jj.u")
    public static class201 field3673 = new class201(100);

    @ObfuscatedName("jj.z")
    public int[] field3671;

    @ObfuscatedName("jj.t")
    public int[] field3675;

    @ObfuscatedName("jj.f")
    public int[] field3676;

    @ObfuscatedName("jj.g")
    public int[] field3677;

    @ObfuscatedName("jj.j")
    public int field3683 = -1;

    @ObfuscatedName("jj.x")
    public int[] field3679;

    @ObfuscatedName("jj.c")
    public boolean field3680 = false;

    @ObfuscatedName("jj.s")
    public int field3674 = 5;

    @ObfuscatedName("jj.n")
    public int field3682 = -1;

    @ObfuscatedName("jj.y")
    public int field3678 = -1;

    @ObfuscatedName("jj.o")
    public int field3684 = 99;

    @ObfuscatedName("jj.r")
    public int field3685 = -1;

    @ObfuscatedName("jj.i")
    public int field3686 = -1;

    @ObfuscatedName("jj.l")
    public int field3681 = 2;

    @ObfuscatedName("ij.a(II)Ljj;")
    public static class272 method3881(int arg0) {
        class272 var1 = (class272) field3672.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field455.method3897(12, arg0);
        class272 var3 = new class272();
        if (var2 != null) {
            var3.method4457(new class185(var2));
        }
        var3.method4459();
        field3672.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jj.w(Lgh;I)V")
    public void method4457(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4458(arg0, var2);
        }
    }

    @ObfuscatedName("jj.e(Lgh;II)V")
    public void method4458(class185 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method3194();
            this.field3676 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field3676[var4] = arg0.method3194();
            }
            this.field3671 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field3671[var5] = arg0.method3194();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field3671[var6] += arg0.method3194() << 16;
            }
        } else if (arg1 == 2) {
            this.field3683 = arg0.method3194();
        } else if (arg1 == 3) {
            int var7 = arg0.method2962();
            this.field3679 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3679[var8] = arg0.method2962();
            }
            this.field3679[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field3680 = true;
        } else if (arg1 == 5) {
            this.field3674 = arg0.method2962();
        } else if (arg1 == 6) {
            this.field3682 = arg0.method3194();
        } else if (arg1 == 7) {
            this.field3678 = arg0.method3194();
        } else if (arg1 == 8) {
            this.field3684 = arg0.method2962();
        } else if (arg1 == 9) {
            this.field3685 = arg0.method2962();
        } else if (arg1 == 10) {
            this.field3686 = arg0.method2962();
        } else if (arg1 == 11) {
            this.field3681 = arg0.method2962();
        } else if (arg1 == 12) {
            int var9 = arg0.method2962();
            this.field3675 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3675[var10] = arg0.method3194();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field3675[var11] += arg0.method3194() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2962();
            this.field3677 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field3677[var13] = arg0.method2966();
            }
        }
    }

    @ObfuscatedName("jj.k(I)V")
    public void method4459() {
        if (this.field3685 == -1) {
            if (this.field3679 == null) {
                this.field3685 = 0;
            } else {
                this.field3685 = 2;
            }
        }
        if (this.field3686 != -1) {
            return;
        }
        if (this.field3679 == null) {
            this.field3686 = 0;
        } else {
            this.field3686 = 2;
        }
    }

    @ObfuscatedName("jj.u(Lef;II)Lef;")
    public class133 method4460(class133 arg0, int arg1) {
        int var3 = this.field3671[arg1];
        class144 var4 = method1486(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2298(true);
        } else {
            class133 var6 = arg0.method2298(!var4.method2664(var5));
            var6.method2306(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jj.z(Lef;III)Lef;")
    public class133 method4461(class133 arg0, int arg1, int arg2) {
        int var4 = this.field3671[arg1];
        class144 var5 = method1486(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2298(true);
        }
        class133 var7 = arg0.method2298(!var5.method2664(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2311();
        } else if (var8 == 2) {
            var7.method2310();
        } else if (var8 == 3) {
            var7.method2309();
        }
        var7.method2306(var5, var6);
        if (var8 == 1) {
            var7.method2309();
        } else if (var8 == 2) {
            var7.method2310();
        } else if (var8 == 3) {
            var7.method2311();
        }
        return var7;
    }

    @ObfuscatedName("jj.t(Lef;II)Lef;")
    public class133 method4462(class133 arg0, int arg1) {
        int var3 = this.field3671[arg1];
        class144 var4 = method1486(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2344(true);
        } else {
            class133 var6 = arg0.method2344(!var4.method2664(var5));
            var6.method2306(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("jj.f(Lef;ILjj;II)Lef;")
    public class133 method4470(class133 arg0, int arg1, class272 arg2, int arg3) {
        int var5 = this.field3671[arg1];
        class144 var6 = method1486(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4460(arg0, arg3);
        }
        int var8 = arg2.field3671[arg3];
        class144 var9 = method1486(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class133 var11 = arg0.method2298(!var6.method2664(var7));
            var11.method2306(var6, var7);
            return var11;
        } else {
            class133 var12 = arg0.method2298(!var6.method2664(var7) & !var9.method2664(var10));
            var12.method2377(var6, var7, var9, var10, this.field3679);
            return var12;
        }
    }

    @ObfuscatedName("jj.g(Lef;II)Lef;")
    public class133 method4479(class133 arg0, int arg1) {
        int var3 = this.field3671[arg1];
        class144 var4 = method1486(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2298(true);
        }
        class144 var6 = null;
        int var7 = 0;
        if (this.field3675 != null && arg1 < this.field3675.length) {
            int var8 = this.field3675[arg1];
            var6 = method1486(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class133 var10 = arg0.method2298(!var4.method2664(var5));
            var10.method2306(var4, var5);
            return var10;
        } else {
            class133 var9 = arg0.method2298(!var4.method2664(var5) & !var6.method2664(var7));
            var9.method2306(var4, var5);
            var9.method2306(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("cj.x(IB)Lec;")
    public static class144 method1486(int arg0) {
        class144 var1 = (class144) field3673.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class144 var2 = class144.method1518(Statics.field3670, Statics.field3687, arg0, false);
        if (var2 != null) {
            field3673.method3375(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("ei.c(B)V")
    public static void method2659() {
        field3672.method3370();
        field3673.method3370();
    }
}
