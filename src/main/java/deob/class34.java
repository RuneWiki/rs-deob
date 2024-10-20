package deob;

@ObfuscatedName("ah")
public class class34 extends class174 {

    @ObfuscatedName("ah.n")
    public static class170 field876 = new class170(64);

    @ObfuscatedName("ah.l")
    public static class170 field880 = new class170(100);

    @ObfuscatedName("ah.v")
    public int[] field881;

    @ObfuscatedName("ah.g")
    public int[] field879;

    @ObfuscatedName("ah.x")
    public int[] field882;

    @ObfuscatedName("ah.c")
    public int[] field884;

    @ObfuscatedName("ah.f")
    public int field885 = -1;

    @ObfuscatedName("ah.r")
    public int[] field886;

    @ObfuscatedName("ah.d")
    public boolean field887 = false;

    @ObfuscatedName("ah.a")
    public int field889 = 5;

    @ObfuscatedName("ah.q")
    public int field892 = -1;

    @ObfuscatedName("ah.u")
    public int field890 = -1;

    @ObfuscatedName("ah.w")
    public int field891 = 99;

    @ObfuscatedName("ah.s")
    public int field877 = -1;

    @ObfuscatedName("ah.e")
    public int field893 = -1;

    @ObfuscatedName("ah.b")
    public int field894 = 2;

    @ObfuscatedName("w.p(II)Lah;")
    public static class34 method160(int arg0) {
        class34 var1 = (class34) field876.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field883.method3049(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method735(new class127(var2));
        }
        var3.method750();
        field876.method3269(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.i(Ldt;B)V")
    public void method735(class127 arg0) {
        while (true) {
            int var2 = arg0.method2659();
            if (var2 == 0) {
                return;
            }
            this.method734(arg0, var2);
        }
    }

    @ObfuscatedName("ah.o(Ldt;II)V")
    public void method734(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2652();
            this.field882 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field882[var4] = arg0.method2652();
            }
            this.field881 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field881[var5] = arg0.method2652();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field881[var6] += arg0.method2652() << 16;
            }
        } else if (arg1 == 2) {
            this.field885 = arg0.method2652();
        } else if (arg1 == 3) {
            int var7 = arg0.method2659();
            this.field886 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field886[var8] = arg0.method2659();
            }
            this.field886[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field887 = true;
        } else if (arg1 == 5) {
            this.field889 = arg0.method2659();
        } else if (arg1 == 6) {
            this.field892 = arg0.method2652();
        } else if (arg1 == 7) {
            this.field890 = arg0.method2652();
        } else if (arg1 == 8) {
            this.field891 = arg0.method2659();
        } else if (arg1 == 9) {
            this.field877 = arg0.method2659();
        } else if (arg1 == 10) {
            this.field893 = arg0.method2659();
        } else if (arg1 == 11) {
            this.field894 = arg0.method2659();
        } else if (arg1 == 12) {
            int var9 = arg0.method2659();
            this.field879 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field879[var10] = arg0.method2652();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field879[var11] += arg0.method2652() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2659();
            this.field884 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field884[var13] = arg0.method2595();
            }
        }
    }

    @ObfuscatedName("ah.n(B)V")
    public void method750() {
        if (this.field877 == -1) {
            if (this.field886 == null) {
                this.field877 = 0;
            } else {
                this.field877 = 2;
            }
        }
        if (this.field893 != -1) {
            return;
        }
        if (this.field886 == null) {
            this.field893 = 0;
        } else {
            this.field893 = 2;
        }
    }

    @ObfuscatedName("ah.l(Ldj;II)Ldj;")
    public class112 method732(class112 arg0, int arg1) {
        int var3 = this.field881[arg1];
        class109 var4 = method159(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2268(true);
        } else {
            class112 var6 = arg0.method2268(!var4.method2247(var5));
            var6.method2312(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.v(Ldj;IIB)Ldj;")
    public class112 method737(class112 arg0, int arg1, int arg2) {
        int var4 = this.field881[arg1];
        class109 var5 = method159(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2268(true);
        }
        class112 var7 = arg0.method2268(!var5.method2247(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2279();
        } else if (var8 == 2) {
            var7.method2278();
        } else if (var8 == 3) {
            var7.method2286();
        }
        var7.method2312(var5, var6);
        if (var8 == 1) {
            var7.method2286();
        } else if (var8 == 2) {
            var7.method2278();
        } else if (var8 == 3) {
            var7.method2279();
        }
        return var7;
    }

    @ObfuscatedName("ah.g(Ldj;IB)Ldj;")
    public class112 method752(class112 arg0, int arg1) {
        int var3 = this.field881[arg1];
        class109 var4 = method159(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2269(true);
        } else {
            class112 var6 = arg0.method2269(!var4.method2247(var5));
            var6.method2312(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ah.x(Ldj;ILah;II)Ldj;")
    public class112 method739(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field881[arg1];
        class109 var6 = method159(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method732(arg0, arg3);
        }
        int var8 = arg2.field881[arg3];
        class109 var9 = method159(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2268(!var6.method2247(var7));
            var11.method2312(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2268(!var6.method2247(var7) & !var9.method2247(var10));
            var12.method2275(var6, var7, var9, var10, this.field886);
            return var12;
        }
    }

    @ObfuscatedName("ah.c(Ldj;II)Ldj;")
    public class112 method740(class112 arg0, int arg1) {
        int var3 = this.field881[arg1];
        class109 var4 = method159(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2268(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field879 != null && arg1 < this.field879.length) {
            int var8 = this.field879[arg1];
            var6 = method159(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2268(!var4.method2247(var5));
            var10.method2312(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2268(!var4.method2247(var5) & !var6.method2247(var7));
            var9.method2312(var4, var5);
            var9.method2312(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("w.f(IB)Ldi;")
    public static class109 method159(int arg0) {
        class109 var1 = (class109) field880.method3264((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class152 var2 = Statics.field900;
        class152 var3 = Statics.field878;
        boolean var4 = true;
        int[] var5 = var2.method3007(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3004(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3004(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class109 var10;
        if (var4) {
            try {
                var10 = new class109(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field880.method3269(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("cy.r(I)V")
    public static void method1915() {
        field876.method3265();
        field880.method3265();
    }
}
