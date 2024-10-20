package deob;

@ObfuscatedName("av")
public class class38 extends class182 {

    @ObfuscatedName("av.i")
    public static class171 field921 = new class171(64);

    @ObfuscatedName("av.t")
    public static class171 field899 = new class171(100);

    @ObfuscatedName("av.z")
    public int[] field906;

    @ObfuscatedName("av.g")
    public int[] field898;

    @ObfuscatedName("av.c")
    public int[] field902;

    @ObfuscatedName("av.o")
    public int[] field903;

    @ObfuscatedName("av.q")
    public int field904 = -1;

    @ObfuscatedName("av.w")
    public int[] field905;

    @ObfuscatedName("av.y")
    public boolean field908 = false;

    @ObfuscatedName("av.p")
    public int field907 = 5;

    @ObfuscatedName("av.m")
    public int field923 = -1;

    @ObfuscatedName("av.a")
    public int field909 = -1;

    @ObfuscatedName("av.u")
    public int field912 = 99;

    @ObfuscatedName("av.n")
    public int field911 = -1;

    @ObfuscatedName("av.x")
    public int field910 = -1;

    @ObfuscatedName("av.f")
    public int field913 = 2;

    @ObfuscatedName("aj.b(II)Lav;")
    public static class38 method595(int arg0) {
        class38 var1 = (class38) field921.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1780.method2759(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method698(new class107(var2));
        }
        var3.method723();
        field921.method3161(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("av.e(Ldi;B)V")
    public void method698(class107 arg0) {
        while (true) {
            int var2 = arg0.method2115();
            if (var2 == 0) {
                return;
            }
            this.method699(arg0, var2);
        }
    }

    @ObfuscatedName("av.i(Ldi;II)V")
    public void method699(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2117();
            this.field902 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field902[var4] = arg0.method2117();
            }
            this.field906 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field906[var5] = arg0.method2117();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field906[var6] += arg0.method2117() << 16;
            }
        } else if (arg1 == 2) {
            this.field904 = arg0.method2117();
        } else if (arg1 == 3) {
            int var7 = arg0.method2115();
            this.field905 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field905[var8] = arg0.method2115();
            }
            this.field905[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field908 = true;
        } else if (arg1 == 5) {
            this.field907 = arg0.method2115();
        } else if (arg1 == 6) {
            this.field923 = arg0.method2117();
        } else if (arg1 == 7) {
            this.field909 = arg0.method2117();
        } else if (arg1 == 8) {
            this.field912 = arg0.method2115();
        } else if (arg1 == 9) {
            this.field911 = arg0.method2115();
        } else if (arg1 == 10) {
            this.field910 = arg0.method2115();
        } else if (arg1 == 11) {
            this.field913 = arg0.method2115();
        } else if (arg1 == 12) {
            int var9 = arg0.method2115();
            this.field898 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field898[var10] = arg0.method2117();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field898[var11] += arg0.method2117() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2115();
            this.field903 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field903[var13] = arg0.method2119();
            }
        }
    }

    @ObfuscatedName("av.t(I)V")
    public void method723() {
        if (this.field911 == -1) {
            if (this.field905 == null) {
                this.field911 = 0;
            } else {
                this.field911 = 2;
            }
        }
        if (this.field910 != -1) {
            return;
        }
        if (this.field905 == null) {
            this.field910 = 0;
        } else {
            this.field910 = 2;
        }
    }

    @ObfuscatedName("av.z(Lck;IB)Lck;")
    public class98 method714(class98 arg0, int arg1) {
        int var3 = this.field906[arg1];
        class96 var4 = method677(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2001(true);
        } else {
            class98 var6 = arg0.method2001(!var4.method1965(var5));
            var6.method1982(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("av.g(Lck;III)Lck;")
    public class98 method702(class98 arg0, int arg1, int arg2) {
        int var4 = this.field906[arg1];
        class96 var5 = method677(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2001(true);
        }
        class98 var7 = arg0.method2001(!var5.method1965(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2041();
        } else if (var8 == 2) {
            var7.method2043();
        } else if (var8 == 3) {
            var7.method1984();
        }
        var7.method1982(var5, var6);
        if (var8 == 1) {
            var7.method1984();
        } else if (var8 == 2) {
            var7.method2043();
        } else if (var8 == 3) {
            var7.method2041();
        }
        return var7;
    }

    @ObfuscatedName("av.c(Lck;II)Lck;")
    public class98 method700(class98 arg0, int arg1) {
        int var3 = this.field906[arg1];
        class96 var4 = method677(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1977(true);
        } else {
            class98 var6 = arg0.method1977(!var4.method1965(var5));
            var6.method1982(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("av.o(Lck;ILav;II)Lck;")
    public class98 method734(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field906[arg1];
        class96 var6 = method677(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method714(arg0, arg3);
        }
        int var8 = arg2.field906[arg3];
        class96 var9 = method677(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method2001(!var6.method1965(var7));
            var11.method1982(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method2001(!var6.method1965(var7) & !var9.method1965(var10));
            var12.method1983(var6, var7, var9, var10, this.field905);
            return var12;
        }
    }

    @ObfuscatedName("av.q(Lck;II)Lck;")
    public class98 method705(class98 arg0, int arg1) {
        int var3 = this.field906[arg1];
        class96 var4 = method677(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2001(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field898 != null && arg1 < this.field898.length) {
            int var8 = this.field898[arg1];
            var6 = method677(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method2001(!var4.method1965(var5));
            var10.method1982(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method2001(!var4.method1965(var5) & !var6.method1965(var7));
            var9.method1982(var4, var5);
            var9.method1982(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ap.w(IB)Lcm;")
    public static class96 method677(int arg0) {
        class96 var1 = (class96) field899.method3166((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class96 var2 = class96.method2452(Statics.field919, Statics.field897, arg0, false);
        if (var2 != null) {
            field899.method3161(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("dr.y(I)V")
    public static void method2450() {
        field921.method3162();
        field899.method3162();
    }
}
