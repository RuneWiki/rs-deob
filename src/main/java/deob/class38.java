package deob;

@ObfuscatedName("ac")
public class class38 extends class183 {

    @ObfuscatedName("ac.g")
    public static class172 field888 = new class172(64);

    @ObfuscatedName("ac.h")
    public static class172 field889 = new class172(100);

    @ObfuscatedName("ac.l")
    public int[] field890;

    @ObfuscatedName("ac.e")
    public int[] field898;

    @ObfuscatedName("ac.u")
    public int[] field892;

    @ObfuscatedName("ac.j")
    public int[] field893;

    @ObfuscatedName("ac.c")
    public int field894 = -1;

    @ObfuscatedName("ac.d")
    public int[] field895;

    @ObfuscatedName("ac.v")
    public boolean field896 = false;

    @ObfuscatedName("ac.n")
    public int field897 = 5;

    @ObfuscatedName("ac.z")
    public int field906 = -1;

    @ObfuscatedName("ac.a")
    public int field886 = -1;

    @ObfuscatedName("ac.t")
    public int field900 = 99;

    @ObfuscatedName("ac.p")
    public int field901 = -1;

    @ObfuscatedName("ac.i")
    public int field899 = -1;

    @ObfuscatedName("ac.r")
    public int field903 = 2;

    @ObfuscatedName("s.k(II)Lac;")
    public static class38 method29(int arg0) {
        class38 var1 = (class38) field888.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field891.method2729(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method709(new class107(var2));
        }
        var3.method681();
        field888.method3204(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.y(Ldy;I)V")
    public void method709(class107 arg0) {
        while (true) {
            int var2 = arg0.method2138();
            if (var2 == 0) {
                return;
            }
            this.method699(arg0, var2);
        }
    }

    @ObfuscatedName("ac.s(Ldy;II)V")
    public void method699(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2239();
            this.field892 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field892[var4] = arg0.method2239();
            }
            this.field890 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field890[var5] = arg0.method2239();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field890[var6] += arg0.method2239() << 16;
            }
        } else if (arg1 == 2) {
            this.field894 = arg0.method2239();
        } else if (arg1 == 3) {
            int var7 = arg0.method2138();
            this.field895 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field895[var8] = arg0.method2138();
            }
            this.field895[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field896 = true;
        } else if (arg1 == 5) {
            this.field897 = arg0.method2138();
        } else if (arg1 == 6) {
            this.field906 = arg0.method2239();
        } else if (arg1 == 7) {
            this.field886 = arg0.method2239();
        } else if (arg1 == 8) {
            this.field900 = arg0.method2138();
        } else if (arg1 == 9) {
            this.field901 = arg0.method2138();
        } else if (arg1 == 10) {
            this.field899 = arg0.method2138();
        } else if (arg1 == 11) {
            this.field903 = arg0.method2138();
        } else if (arg1 == 12) {
            int var9 = arg0.method2138();
            this.field898 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field898[var10] = arg0.method2239();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field898[var11] += arg0.method2239() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2138();
            this.field893 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field893[var13] = arg0.method2142();
            }
        }
    }

    @ObfuscatedName("ac.g(I)V")
    public void method681() {
        if (this.field901 == -1) {
            if (this.field895 == null) {
                this.field901 = 0;
            } else {
                this.field901 = 2;
            }
        }
        if (this.field899 != -1) {
            return;
        }
        if (this.field895 == null) {
            this.field899 = 0;
        } else {
            this.field899 = 2;
        }
    }

    @ObfuscatedName("ac.h(Lck;IB)Lck;")
    public class98 method682(class98 arg0, int arg1) {
        int var3 = this.field890[arg1];
        class96 var4 = method145(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1988(true);
        } else {
            class98 var6 = arg0.method1988(!var4.method1977(var5));
            var6.method2015(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.l(Lck;III)Lck;")
    public class98 method712(class98 arg0, int arg1, int arg2) {
        int var4 = this.field890[arg1];
        class96 var5 = method145(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1988(true);
        }
        class98 var7 = arg0.method1988(!var5.method1977(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2023();
        } else if (var8 == 2) {
            var7.method1998();
        } else if (var8 == 3) {
            var7.method1997();
        }
        var7.method2015(var5, var6);
        if (var8 == 1) {
            var7.method1997();
        } else if (var8 == 2) {
            var7.method1998();
        } else if (var8 == 3) {
            var7.method2023();
        }
        return var7;
    }

    @ObfuscatedName("ac.e(Lck;II)Lck;")
    public class98 method684(class98 arg0, int arg1) {
        int var3 = this.field890[arg1];
        class96 var4 = method145(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1989(true);
        } else {
            class98 var6 = arg0.method1989(!var4.method1977(var5));
            var6.method2015(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ac.u(Lck;ILac;II)Lck;")
    public class98 method685(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field890[arg1];
        class96 var6 = method145(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method682(arg0, arg3);
        }
        int var8 = arg2.field890[arg3];
        class96 var9 = method145(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1988(!var6.method1977(var7));
            var11.method2015(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1988(!var6.method1977(var7) & !var9.method1977(var10));
            var12.method1995(var6, var7, var9, var10, this.field895);
            return var12;
        }
    }

    @ObfuscatedName("ac.j(Lck;II)Lck;")
    public class98 method694(class98 arg0, int arg1) {
        int var3 = this.field890[arg1];
        class96 var4 = method145(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1988(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field898 != null && arg1 < this.field898.length) {
            int var8 = this.field898[arg1];
            var6 = method145(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1988(!var4.method1977(var5));
            var10.method2015(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1988(!var4.method1977(var5) & !var6.method1977(var7));
            var9.method2015(var4, var5);
            var9.method2015(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("t.c(II)Lct;")
    public static class96 method145(int arg0) {
        class96 var1 = (class96) field889.method3202((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class96 var2 = class96.method1022(Statics.field2964, Statics.field887, arg0, false);
        if (var2 != null) {
            field889.method3204(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("k.d(B)V")
    public static void method6() {
        field888.method3210();
        field889.method3210();
    }
}
