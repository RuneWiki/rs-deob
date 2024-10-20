package deob;

@ObfuscatedName("am")
public class class34 extends class174 {

    @ObfuscatedName("am.h")
    public static class170 field891 = new class170(64);

    @ObfuscatedName("am.u")
    public static class170 field878 = new class170(100);

    @ObfuscatedName("am.a")
    public int[] field879;

    @ObfuscatedName("am.q")
    public int[] field880;

    @ObfuscatedName("am.t")
    public int[] field881;

    @ObfuscatedName("am.n")
    public int[] field874;

    @ObfuscatedName("am.i")
    public int field884 = -1;

    @ObfuscatedName("am.c")
    public int[] field889;

    @ObfuscatedName("am.b")
    public boolean field885 = false;

    @ObfuscatedName("am.m")
    public int field886 = 5;

    @ObfuscatedName("am.g")
    public int field887 = -1;

    @ObfuscatedName("am.x")
    public int field888 = -1;

    @ObfuscatedName("am.r")
    public int field890 = 99;

    @ObfuscatedName("am.s")
    public int field877 = -1;

    @ObfuscatedName("am.l")
    public int field883 = -1;

    @ObfuscatedName("am.k")
    public int field892 = 2;

    @ObfuscatedName("bl.j(Lew;Lew;Lew;B)V")
    public static void method1289(class153 arg0, class153 arg1, class153 arg2) {
        Statics.field894 = arg0;
        Statics.field875 = arg1;
        Statics.field876 = arg2;
    }

    @ObfuscatedName("ad.f(IB)Lam;")
    public static class34 method612(int arg0) {
        class34 var1 = (class34) field891.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field894.method3027(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method714(new class127(var2));
        }
        var3.method729();
        field891.method3257(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.o(Ldq;I)V")
    public void method714(class127 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method722(arg0, var2);
        }
    }

    @ObfuscatedName("am.h(Ldq;IB)V")
    public void method722(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2582();
            this.field881 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field881[var4] = arg0.method2582();
            }
            this.field879 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field879[var5] = arg0.method2582();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field879[var6] += arg0.method2582() << 16;
            }
        } else if (arg1 == 2) {
            this.field884 = arg0.method2582();
        } else if (arg1 == 3) {
            int var7 = arg0.method2464();
            this.field889 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field889[var8] = arg0.method2464();
            }
            this.field889[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field885 = true;
        } else if (arg1 == 5) {
            this.field886 = arg0.method2464();
        } else if (arg1 == 6) {
            this.field887 = arg0.method2582();
        } else if (arg1 == 7) {
            this.field888 = arg0.method2582();
        } else if (arg1 == 8) {
            this.field890 = arg0.method2464();
        } else if (arg1 == 9) {
            this.field877 = arg0.method2464();
        } else if (arg1 == 10) {
            this.field883 = arg0.method2464();
        } else if (arg1 == 11) {
            this.field892 = arg0.method2464();
        } else if (arg1 == 12) {
            int var9 = arg0.method2464();
            this.field880 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field880[var10] = arg0.method2582();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field880[var11] += arg0.method2582() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2464();
            this.field874 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field874[var13] = arg0.method2643();
            }
        }
    }

    @ObfuscatedName("am.u(I)V")
    public void method729() {
        if (this.field877 == -1) {
            if (this.field889 == null) {
                this.field877 = 0;
            } else {
                this.field877 = 2;
            }
        }
        if (this.field883 != -1) {
            return;
        }
        if (this.field889 == null) {
            this.field883 = 0;
        } else {
            this.field883 = 2;
        }
    }

    @ObfuscatedName("am.a(Ldo;II)Ldo;")
    public class112 method747(class112 arg0, int arg1) {
        int var3 = this.field879[arg1];
        class109 var4 = method1548(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2248(true);
        } else {
            class112 var6 = arg0.method2248(!var4.method2214(var5));
            var6.method2243(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("am.q(Ldo;IIB)Ldo;")
    public class112 method746(class112 arg0, int arg1, int arg2) {
        int var4 = this.field879[arg1];
        class109 var5 = method1548(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2248(true);
        }
        class112 var7 = arg0.method2248(!var5.method2214(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2310();
        } else if (var8 == 2) {
            var7.method2247();
        } else if (var8 == 3) {
            var7.method2246();
        }
        var7.method2243(var5, var6);
        if (var8 == 1) {
            var7.method2246();
        } else if (var8 == 2) {
            var7.method2247();
        } else if (var8 == 3) {
            var7.method2310();
        }
        return var7;
    }

    @ObfuscatedName("am.t(Ldo;IB)Ldo;")
    public class112 method719(class112 arg0, int arg1) {
        int var3 = this.field879[arg1];
        class109 var4 = method1548(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2237(true);
        } else {
            class112 var6 = arg0.method2237(!var4.method2214(var5));
            var6.method2243(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("am.n(Ldo;ILam;II)Ldo;")
    public class112 method720(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field879[arg1];
        class109 var6 = method1548(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method747(arg0, arg3);
        }
        int var8 = arg2.field879[arg3];
        class109 var9 = method1548(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2248(!var6.method2214(var7));
            var11.method2243(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2248(!var6.method2214(var7) & !var9.method2214(var10));
            var12.method2309(var6, var7, var9, var10, this.field889);
            return var12;
        }
    }

    @ObfuscatedName("am.i(Ldo;IB)Ldo;")
    public class112 method721(class112 arg0, int arg1) {
        int var3 = this.field879[arg1];
        class109 var4 = method1548(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2248(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field880 != null && arg1 < this.field880.length) {
            int var8 = this.field880[arg1];
            var6 = method1548(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2248(!var4.method2214(var5));
            var10.method2243(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2248(!var4.method2214(var5) & !var6.method2214(var7));
            var9.method2243(var4, var5);
            var9.method2243(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bf.c(IB)Ldj;")
    public static class109 method1548(int arg0) {
        class109 var1 = (class109) field878.method3256((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class153 var2 = Statics.field875;
        class153 var3 = Statics.field876;
        boolean var4 = true;
        int[] var5 = var2.method3036(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3084(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3084(var8, 0);
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
            field878.method3257(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("aj.b(I)V")
    public static void method877() {
        field891.method3265();
        field878.method3265();
    }
}
