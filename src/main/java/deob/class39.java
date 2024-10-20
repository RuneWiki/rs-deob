package deob;

@ObfuscatedName("at")
public class class39 extends class187 {

    @ObfuscatedName("at.c")
    public static class176 field882 = new class176(64);

    @ObfuscatedName("at.r")
    public static class176 field898 = new class176(100);

    @ObfuscatedName("at.f")
    public int[] field892;

    @ObfuscatedName("at.z")
    public int[] field884;

    @ObfuscatedName("at.o")
    public int[] field886;

    @ObfuscatedName("at.k")
    public int[] field887;

    @ObfuscatedName("at.s")
    public int field888 = -1;

    @ObfuscatedName("at.h")
    public int[] field889;

    @ObfuscatedName("at.m")
    public boolean field890 = false;

    @ObfuscatedName("at.w")
    public int field894 = 5;

    @ObfuscatedName("at.q")
    public int field891 = -1;

    @ObfuscatedName("at.u")
    public int field893 = -1;

    @ObfuscatedName("at.e")
    public int field879 = 99;

    @ObfuscatedName("at.b")
    public int field895 = -1;

    @ObfuscatedName("at.g")
    public int field896 = -1;

    @ObfuscatedName("at.j")
    public int field897 = 2;

    @ObfuscatedName("fy.p(II)Lat;")
    public static class39 method2920(int arg0) {
        class39 var1 = (class39) field882.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field885.method2811(12, arg0);
        class39 var3 = new class39();
        if (var2 != null) {
            var3.method752(new class110(var2));
        }
        var3.method729();
        field882.method3193(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.y(Ldg;I)V")
    public void method752(class110 arg0) {
        while (true) {
            int var2 = arg0.method2309();
            if (var2 == 0) {
                return;
            }
            this.method760(arg0, var2);
        }
    }

    @ObfuscatedName("at.d(Ldg;IB)V")
    public void method760(class110 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2243();
            this.field886 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field886[var4] = arg0.method2243();
            }
            this.field892 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field892[var5] = arg0.method2243();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field892[var6] += arg0.method2243() << 16;
            }
        } else if (arg1 == 2) {
            this.field888 = arg0.method2243();
        } else if (arg1 == 3) {
            int var7 = arg0.method2309();
            this.field889 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field889[var8] = arg0.method2309();
            }
            this.field889[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field890 = true;
        } else if (arg1 == 5) {
            this.field894 = arg0.method2309();
        } else if (arg1 == 6) {
            this.field891 = arg0.method2243();
        } else if (arg1 == 7) {
            this.field893 = arg0.method2243();
        } else if (arg1 == 8) {
            this.field879 = arg0.method2309();
        } else if (arg1 == 9) {
            this.field895 = arg0.method2309();
        } else if (arg1 == 10) {
            this.field896 = arg0.method2309();
        } else if (arg1 == 11) {
            this.field897 = arg0.method2309();
        } else if (arg1 == 12) {
            int var9 = arg0.method2309();
            this.field884 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field884[var10] = arg0.method2243();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field884[var11] += arg0.method2243() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2309();
            this.field887 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field887[var13] = arg0.method2128();
            }
        }
    }

    @ObfuscatedName("at.c(I)V")
    public void method729() {
        if (this.field895 == -1) {
            if (this.field889 == null) {
                this.field895 = 0;
            } else {
                this.field895 = 2;
            }
        }
        if (this.field896 != -1) {
            return;
        }
        if (this.field889 == null) {
            this.field896 = 0;
        } else {
            this.field896 = 2;
        }
    }

    @ObfuscatedName("at.r(Lcy;IB)Lcy;")
    public class99 method730(class99 arg0, int arg1) {
        int var3 = this.field892[arg1];
        class97 var4 = method2722(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2042(true);
        } else {
            class99 var6 = arg0.method2042(!var4.method1983(var5));
            var6.method1999(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("at.f(Lcy;III)Lcy;")
    public class99 method731(class99 arg0, int arg1, int arg2) {
        int var4 = this.field892[arg1];
        class97 var5 = method2722(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2042(true);
        }
        class99 var7 = arg0.method2042(!var5.method1983(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2004();
        } else if (var8 == 2) {
            var7.method2003();
        } else if (var8 == 3) {
            var7.method2002();
        }
        var7.method1999(var5, var6);
        if (var8 == 1) {
            var7.method2002();
        } else if (var8 == 2) {
            var7.method2003();
        } else if (var8 == 3) {
            var7.method2004();
        }
        return var7;
    }

    @ObfuscatedName("at.z(Lcy;II)Lcy;")
    public class99 method745(class99 arg0, int arg1) {
        int var3 = this.field892[arg1];
        class97 var4 = method2722(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1994(true);
        } else {
            class99 var6 = arg0.method1994(!var4.method1983(var5));
            var6.method1999(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("at.o(Lcy;ILat;II)Lcy;")
    public class99 method733(class99 arg0, int arg1, class39 arg2, int arg3) {
        int var5 = this.field892[arg1];
        class97 var6 = method2722(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method730(arg0, arg3);
        }
        int var8 = arg2.field892[arg3];
        class97 var9 = method2722(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class99 var11 = arg0.method2042(!var6.method1983(var7));
            var11.method1999(var6, var7);
            return var11;
        } else {
            class99 var12 = arg0.method2042(!var6.method1983(var7) & !var9.method1983(var10));
            var12.method2000(var6, var7, var9, var10, this.field889);
            return var12;
        }
    }

    @ObfuscatedName("at.k(Lcy;II)Lcy;")
    public class99 method743(class99 arg0, int arg1) {
        int var3 = this.field892[arg1];
        class97 var4 = method2722(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2042(true);
        }
        class97 var6 = null;
        int var7 = 0;
        if (this.field884 != null && arg1 < this.field884.length) {
            int var8 = this.field884[arg1];
            var6 = method2722(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class99 var10 = arg0.method2042(!var4.method1983(var5));
            var10.method1999(var4, var5);
            return var10;
        } else {
            class99 var9 = arg0.method2042(!var4.method1983(var5) & !var6.method1983(var7));
            var9.method1999(var4, var5);
            var9.method1999(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ey.s(IB)Lcz;")
    public static class97 method2722(int arg0) {
        class97 var1 = (class97) field898.method3198((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class151 var2 = Statics.field901;
        class151 var3 = Statics.field883;
        boolean var4 = true;
        int[] var5 = var2.method2756(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2753(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2753(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class97 var10;
        if (var4) {
            try {
                var10 = new class97(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field898.method3193(var10, (long) arg0);
        }
        return var10;
    }
}
