package deob;

@ObfuscatedName("ab")
public class class38 extends class182 {

    @ObfuscatedName("ab.p")
    public static class171 field898 = new class171(64);

    @ObfuscatedName("ab.c")
    public static class171 field895 = new class171(100);

    @ObfuscatedName("ab.y")
    public int[] field896;

    @ObfuscatedName("ab.g")
    public int[] field908;

    @ObfuscatedName("ab.l")
    public int[] field905;

    @ObfuscatedName("ab.h")
    public int[] field899;

    @ObfuscatedName("ab.n")
    public int field900 = -1;

    @ObfuscatedName("ab.w")
    public int[] field901;

    @ObfuscatedName("ab.m")
    public boolean field911 = false;

    @ObfuscatedName("ab.x")
    public int field903 = 5;

    @ObfuscatedName("ab.b")
    public int field904 = -1;

    @ObfuscatedName("ab.u")
    public int field906 = -1;

    @ObfuscatedName("ab.r")
    public int field897 = 99;

    @ObfuscatedName("ab.z")
    public int field891 = -1;

    @ObfuscatedName("ab.v")
    public int field907 = -1;

    @ObfuscatedName("ab.k")
    public int field909 = 2;

    @ObfuscatedName("cz.t(Ley;Ley;Ley;I)V")
    public static void method2052(class146 arg0, class146 arg1, class146 arg2) {
        Statics.field902 = arg0;
        Statics.field892 = arg1;
        Statics.field893 = arg2;
    }

    @ObfuscatedName("bs.o(II)Lab;")
    public static class38 method1579(int arg0) {
        class38 var1 = (class38) field898.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field902.method2668(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method721(new class107(var2));
        }
        var3.method741();
        field898.method3101(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ab.i(Ldg;I)V")
    public void method721(class107 arg0) {
        while (true) {
            int var2 = arg0.method2118();
            if (var2 == 0) {
                return;
            }
            this.method709(arg0, var2);
        }
    }

    @ObfuscatedName("ab.p(Ldg;II)V")
    public void method709(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2120();
            this.field905 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field905[var4] = arg0.method2120();
            }
            this.field896 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field896[var5] = arg0.method2120();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field896[var6] += arg0.method2120() << 16;
            }
        } else if (arg1 == 2) {
            this.field900 = arg0.method2120();
        } else if (arg1 == 3) {
            int var7 = arg0.method2118();
            this.field901 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field901[var8] = arg0.method2118();
            }
            this.field901[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field911 = true;
        } else if (arg1 == 5) {
            this.field903 = arg0.method2118();
        } else if (arg1 == 6) {
            this.field904 = arg0.method2120();
        } else if (arg1 == 7) {
            this.field906 = arg0.method2120();
        } else if (arg1 == 8) {
            this.field897 = arg0.method2118();
        } else if (arg1 == 9) {
            this.field891 = arg0.method2118();
        } else if (arg1 == 10) {
            this.field907 = arg0.method2118();
        } else if (arg1 == 11) {
            this.field909 = arg0.method2118();
        } else if (arg1 == 12) {
            int var9 = arg0.method2118();
            this.field908 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field908[var10] = arg0.method2120();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field908[var11] += arg0.method2120() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2118();
            this.field899 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field899[var13] = arg0.method2122();
            }
        }
    }

    @ObfuscatedName("ab.c(B)V")
    public void method741() {
        if (this.field891 == -1) {
            if (this.field901 == null) {
                this.field891 = 0;
            } else {
                this.field891 = 2;
            }
        }
        if (this.field907 != -1) {
            return;
        }
        if (this.field901 == null) {
            this.field907 = 0;
        } else {
            this.field907 = 2;
        }
    }

    @ObfuscatedName("ab.y(Lcx;II)Lcx;")
    public class98 method710(class98 arg0, int arg1) {
        int var3 = this.field896[arg1];
        class96 var4 = method603(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1971(true);
        } else {
            class98 var6 = arg0.method1971(!var4.method1963(var5));
            var6.method1987(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ab.g(Lcx;IIB)Lcx;")
    public class98 method736(class98 arg0, int arg1, int arg2) {
        int var4 = this.field896[arg1];
        class96 var5 = method603(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1971(true);
        }
        class98 var7 = arg0.method1971(!var5.method1963(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1981();
        } else if (var8 == 2) {
            var7.method2011();
        } else if (var8 == 3) {
            var7.method1980();
        }
        var7.method1987(var5, var6);
        if (var8 == 1) {
            var7.method1980();
        } else if (var8 == 2) {
            var7.method2011();
        } else if (var8 == 3) {
            var7.method1981();
        }
        return var7;
    }

    @ObfuscatedName("ab.l(Lcx;II)Lcx;")
    public class98 method712(class98 arg0, int arg1) {
        int var3 = this.field896[arg1];
        class96 var4 = method603(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1990(true);
        } else {
            class98 var6 = arg0.method1990(!var4.method1963(var5));
            var6.method1987(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ab.h(Lcx;ILab;II)Lcx;")
    public class98 method713(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field896[arg1];
        class96 var6 = method603(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method710(arg0, arg3);
        }
        int var8 = arg2.field896[arg3];
        class96 var9 = method603(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1971(!var6.method1963(var7));
            var11.method1987(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1971(!var6.method1963(var7) & !var9.method1963(var10));
            var12.method1978(var6, var7, var9, var10, this.field901);
            return var12;
        }
    }

    @ObfuscatedName("ab.n(Lcx;II)Lcx;")
    public class98 method714(class98 arg0, int arg1) {
        int var3 = this.field896[arg1];
        class96 var4 = method603(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1971(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field908 != null && arg1 < this.field908.length) {
            int var8 = this.field908[arg1];
            var6 = method603(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1971(!var4.method1963(var5));
            var10.method1987(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1971(!var4.method1963(var5) & !var6.method1963(var7));
            var9.method1987(var4, var5);
            var9.method1987(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("aw.w(IB)Lcb;")
    public static class96 method603(int arg0) {
        class96 var1 = (class96) field895.method3099((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class146 var2 = Statics.field892;
        class146 var3 = Statics.field893;
        boolean var4 = true;
        int[] var5 = var2.method2677(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2674(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2674(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class96 var10;
        if (var4) {
            try {
                var10 = new class96(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field895.method3101(var10, (long) arg0);
        }
        return var10;
    }
}
