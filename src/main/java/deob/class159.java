package deob;

@ObfuscatedName("fz")
public class class159 extends class349 {

    @ObfuscatedName("fz.j")
    public static class223 field1861 = new class223(64);

    @ObfuscatedName("fz.l")
    public static class223 field1858 = new class223(100);

    @ObfuscatedName("fz.n")
    public int[] field1863;

    @ObfuscatedName("fz.w")
    public int[] field1874;

    @ObfuscatedName("fz.f")
    public int[] field1865;

    @ObfuscatedName("fz.o")
    public int[] field1866;

    @ObfuscatedName("fz.x")
    public int field1862 = -1;

    @ObfuscatedName("fz.r")
    public int[] field1870;

    @ObfuscatedName("fz.p")
    public boolean field1869 = false;

    @ObfuscatedName("fz.h")
    public int field1864 = 5;

    @ObfuscatedName("fz.k")
    public int field1867 = -1;

    @ObfuscatedName("fz.a")
    public int field1872 = -1;

    @ObfuscatedName("fz.q")
    public int field1873 = 99;

    @ObfuscatedName("fz.u")
    public int field1868 = -1;

    @ObfuscatedName("fz.e")
    public int field1860 = -1;

    @ObfuscatedName("fz.c")
    public int field1876 = 2;

    @ObfuscatedName("ag.s(II)Lfz;")
    public static class159 method1334(int arg0) {
        class159 var1 = (class159) field1861.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1875.method4459(12, arg0);
        class159 var3 = new class159();
        if (var2 != null) {
            var3.method2849(new class385(var2));
        }
        var3.method2819();
        field1861.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fz.t(Lnv;B)V")
    public void method2849(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2818(arg0, var2);
        }
    }

    @ObfuscatedName("fz.v(Lnv;IB)V")
    public void method2818(class385 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method6053();
            this.field1865 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1865[var4] = arg0.method6053();
            }
            this.field1863 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1863[var5] = arg0.method6053();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1863[var6] += arg0.method6053() << 16;
            }
        } else if (arg1 == 2) {
            this.field1862 = arg0.method6053();
        } else if (arg1 == 3) {
            int var7 = arg0.method5958();
            this.field1870 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1870[var8] = arg0.method5958();
            }
            this.field1870[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1869 = true;
        } else if (arg1 == 5) {
            this.field1864 = arg0.method5958();
        } else if (arg1 == 6) {
            this.field1867 = arg0.method6053();
        } else if (arg1 == 7) {
            this.field1872 = arg0.method6053();
        } else if (arg1 == 8) {
            this.field1873 = arg0.method5958();
        } else if (arg1 == 9) {
            this.field1868 = arg0.method5958();
        } else if (arg1 == 10) {
            this.field1860 = arg0.method5958();
        } else if (arg1 == 11) {
            this.field1876 = arg0.method5958();
        } else if (arg1 == 12) {
            int var9 = arg0.method5958();
            this.field1874 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1874[var10] = arg0.method6053();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1874[var11] += arg0.method6053() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method5958();
            this.field1866 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1866[var13] = arg0.method5962();
            }
        }
    }

    @ObfuscatedName("fz.j(I)V")
    public void method2819() {
        if (this.field1868 == -1) {
            if (this.field1870 == null) {
                this.field1868 = 0;
            } else {
                this.field1868 = 2;
            }
        }
        if (this.field1860 != -1) {
            return;
        }
        if (this.field1870 == null) {
            this.field1860 = 0;
        } else {
            this.field1860 = 2;
        }
    }

    @ObfuscatedName("fz.l(Lgl;II)Lgl;")
    public class207 method2834(class207 arg0, int arg1) {
        int var3 = this.field1863[arg1];
        class203 var4 = method2222(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3768(true);
        } else {
            class207 var6 = arg0.method3768(!var4.method3735(var5));
            var6.method3776(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fz.n(Lgl;III)Lgl;")
    public class207 method2820(class207 arg0, int arg1, int arg2) {
        int var4 = this.field1863[arg1];
        class203 var5 = method2222(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method3768(true);
        }
        class207 var7 = arg0.method3768(!var5.method3735(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method3815();
        } else if (var8 == 2) {
            var7.method3779();
        } else if (var8 == 3) {
            var7.method3795();
        }
        var7.method3776(var5, var6);
        if (var8 == 1) {
            var7.method3795();
        } else if (var8 == 2) {
            var7.method3779();
        } else if (var8 == 3) {
            var7.method3815();
        }
        return var7;
    }

    @ObfuscatedName("fz.w(Lgl;II)Lgl;")
    public class207 method2821(class207 arg0, int arg1) {
        int var3 = this.field1863[arg1];
        class203 var4 = method2222(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3769(true);
        } else {
            class207 var6 = arg0.method3769(!var4.method3735(var5));
            var6.method3776(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("fz.f(Lgl;ILfz;IB)Lgl;")
    public class207 method2822(class207 arg0, int arg1, class159 arg2, int arg3) {
        int var5 = this.field1863[arg1];
        class203 var6 = method2222(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method2834(arg0, arg3);
        }
        int var8 = arg2.field1863[arg3];
        class203 var9 = method2222(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class207 var11 = arg0.method3768(!var6.method3735(var7));
            var11.method3776(var6, var7);
            return var11;
        } else {
            class207 var12 = arg0.method3768(!var6.method3735(var7) & !var9.method3735(var10));
            var12.method3807(var6, var7, var9, var10, this.field1870);
            return var12;
        }
    }

    @ObfuscatedName("fz.o(Lgl;II)Lgl;")
    public class207 method2838(class207 arg0, int arg1) {
        int var3 = this.field1863[arg1];
        class203 var4 = method2222(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method3768(true);
        }
        class203 var6 = null;
        int var7 = 0;
        if (this.field1874 != null && arg1 < this.field1874.length) {
            int var8 = this.field1874[arg1];
            var6 = method2222(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class207 var10 = arg0.method3768(!var4.method3735(var5));
            var10.method3776(var4, var5);
            return var10;
        } else {
            class207 var9 = arg0.method3768(!var4.method3735(var5) & !var6.method3735(var7));
            var9.method3776(var4, var5);
            var9.method3776(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("dh.x(II)Lga;")
    public static class203 method2222(int arg0) {
        class203 var1 = (class203) field1858.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class203 var2 = class203.method55(Statics.field1859, Statics.field1871, arg0, false);
        if (var2 != null) {
            field1858.method3929(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("bt.r(B)V")
    public static void method1562() {
        field1861.method3930();
        field1858.method3930();
    }
}
