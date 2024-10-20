package deob;

@ObfuscatedName("az")
public class class45 extends class208 {

    @ObfuscatedName("az.t")
    public static class197 field991 = new class197(64);

    @ObfuscatedName("az.v")
    public static class197 field992 = new class197(100);

    @ObfuscatedName("az.b")
    public int[] field993;

    @ObfuscatedName("az.m")
    public int[] field994;

    @ObfuscatedName("az.k")
    public int[] field995;

    @ObfuscatedName("az.c")
    public int[] field996;

    @ObfuscatedName("az.w")
    public int field997 = -1;

    @ObfuscatedName("az.l")
    public int[] field988;

    @ObfuscatedName("az.h")
    public boolean field999 = false;

    @ObfuscatedName("az.i")
    public int field1006 = 5;

    @ObfuscatedName("az.u")
    public int field1001 = -1;

    @ObfuscatedName("az.x")
    public int field1002 = -1;

    @ObfuscatedName("az.d")
    public int field1003 = 99;

    @ObfuscatedName("az.o")
    public int field1013 = -1;

    @ObfuscatedName("az.j")
    public int field998 = -1;

    @ObfuscatedName("az.q")
    public int field1007 = 2;

    @ObfuscatedName("f.f(Lfj;Lfj;Lfj;I)V")
    public static void method1(class171 arg0, class171 arg1, class171 arg2) {
        Statics.field1004 = arg0;
        Statics.field989 = arg1;
        Statics.field990 = arg2;
    }

    @ObfuscatedName("bi.e(II)Laz;")
    public static class45 method1289(int arg0) {
        class45 var1 = (class45) field991.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1004.method3107(12, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method859(new class123(var2));
        }
        var3.method861();
        field991.method3571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("az.n(Ldx;I)V")
    public void method859(class123 arg0) {
        while (true) {
            int var2 = arg0.method2522();
            if (var2 == 0) {
                return;
            }
            this.method860(arg0, var2);
        }
    }

    @ObfuscatedName("az.t(Ldx;II)V")
    public void method860(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2401();
            this.field995 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field995[var4] = arg0.method2401();
            }
            this.field993 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field993[var5] = arg0.method2401();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field993[var6] += arg0.method2401() << 16;
            }
        } else if (arg1 == 2) {
            this.field997 = arg0.method2401();
        } else if (arg1 == 3) {
            int var7 = arg0.method2522();
            this.field988 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field988[var8] = arg0.method2522();
            }
            this.field988[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field999 = true;
        } else if (arg1 == 5) {
            this.field1006 = arg0.method2522();
        } else if (arg1 == 6) {
            this.field1001 = arg0.method2401();
        } else if (arg1 == 7) {
            this.field1002 = arg0.method2401();
        } else if (arg1 == 8) {
            this.field1003 = arg0.method2522();
        } else if (arg1 == 9) {
            this.field1013 = arg0.method2522();
        } else if (arg1 == 10) {
            this.field998 = arg0.method2522();
        } else if (arg1 == 11) {
            this.field1007 = arg0.method2522();
        } else if (arg1 == 12) {
            int var9 = arg0.method2522();
            this.field994 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field994[var10] = arg0.method2401();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field994[var11] += arg0.method2401() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2522();
            this.field996 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field996[var13] = arg0.method2403();
            }
        }
    }

    @ObfuscatedName("az.v(B)V")
    public void method861() {
        if (this.field1013 == -1) {
            if (this.field988 == null) {
                this.field1013 = 0;
            } else {
                this.field1013 = 2;
            }
        }
        if (this.field998 != -1) {
            return;
        }
        if (this.field988 == null) {
            this.field998 = 0;
        } else {
            this.field998 = 2;
        }
    }

    @ObfuscatedName("az.b(Ldg;II)Ldg;")
    public class109 method862(class109 arg0, int arg1) {
        int var3 = this.field993[arg1];
        class107 var4 = method1081(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2228(true);
        } else {
            class109 var6 = arg0.method2228(!var4.method2191(var5));
            var6.method2203(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.m(Ldg;IIB)Ldg;")
    public class109 method863(class109 arg0, int arg1, int arg2) {
        int var4 = this.field993[arg1];
        class107 var5 = method1081(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2228(true);
        }
        class109 var7 = arg0.method2228(!var5.method2191(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2208();
        } else if (var8 == 2) {
            var7.method2209();
        } else if (var8 == 3) {
            var7.method2206();
        }
        var7.method2203(var5, var6);
        if (var8 == 1) {
            var7.method2206();
        } else if (var8 == 2) {
            var7.method2209();
        } else if (var8 == 3) {
            var7.method2208();
        }
        return var7;
    }

    @ObfuscatedName("az.k(Ldg;II)Ldg;")
    public class109 method864(class109 arg0, int arg1) {
        int var3 = this.field993[arg1];
        class107 var4 = method1081(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2195(true);
        } else {
            class109 var6 = arg0.method2195(!var4.method2191(var5));
            var6.method2203(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.c(Ldg;ILaz;IB)Ldg;")
    public class109 method865(class109 arg0, int arg1, class45 arg2, int arg3) {
        int var5 = this.field993[arg1];
        class107 var6 = method1081(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method862(arg0, arg3);
        }
        int var8 = arg2.field993[arg3];
        class107 var9 = method1081(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class109 var11 = arg0.method2228(!var6.method2191(var7));
            var11.method2203(var6, var7);
            return var11;
        } else {
            class109 var12 = arg0.method2228(!var6.method2191(var7) & !var9.method2191(var10));
            var12.method2204(var6, var7, var9, var10, this.field988);
            return var12;
        }
    }

    @ObfuscatedName("az.w(Ldg;IB)Ldg;")
    public class109 method869(class109 arg0, int arg1) {
        int var3 = this.field993[arg1];
        class107 var4 = method1081(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2228(true);
        }
        class107 var6 = null;
        int var7 = 0;
        if (this.field994 != null && arg1 < this.field994.length) {
            int var8 = this.field994[arg1];
            var6 = method1081(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class109 var10 = arg0.method2228(!var4.method2191(var5));
            var10.method2203(var4, var5);
            return var10;
        } else {
            class109 var9 = arg0.method2228(!var4.method2191(var5) & !var6.method2191(var7));
            var9.method2203(var4, var5);
            var9.method2203(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bs.l(IB)Ldr;")
    public static class107 method1081(int arg0) {
        class107 var1 = (class107) field992.method3569((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class107 var2 = Statics.method693(Statics.field989, Statics.field990, arg0, false);
        if (var2 != null) {
            field992.method3571(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("d.h(I)V")
    public static void method175() {
        field991.method3572();
        field992.method3572();
    }
}
