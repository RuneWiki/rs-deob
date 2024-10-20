package deob;

@ObfuscatedName("ae")
public class class38 extends class183 {

    @ObfuscatedName("ae.c")
    public static class172 field916 = new class172(64);

    @ObfuscatedName("ae.n")
    public static class172 field914 = new class172(100);

    @ObfuscatedName("ae.s")
    public int[] field905;

    @ObfuscatedName("ae.r")
    public int[] field918;

    @ObfuscatedName("ae.w")
    public int[] field907;

    @ObfuscatedName("ae.u")
    public int[] field908;

    @ObfuscatedName("ae.d")
    public int field909 = -1;

    @ObfuscatedName("ae.h")
    public int[] field910;

    @ObfuscatedName("ae.a")
    public boolean field906 = false;

    @ObfuscatedName("ae.y")
    public int field912 = 5;

    @ObfuscatedName("ae.v")
    public int field913 = -1;

    @ObfuscatedName("ae.e")
    public int field903 = -1;

    @ObfuscatedName("ae.b")
    public int field920 = 99;

    @ObfuscatedName("ae.z")
    public int field901 = -1;

    @ObfuscatedName("ae.l")
    public int field917 = -1;

    @ObfuscatedName("ae.t")
    public int field900 = 2;

    @ObfuscatedName("q.p(IB)Lae;")
    public static class38 method507(int arg0) {
        class38 var1 = (class38) field916.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field904.method2855(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method749(new class107(var2));
        }
        var3.method748();
        field916.method3234(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.g(Ldp;I)V")
    public void method749(class107 arg0) {
        while (true) {
            int var2 = arg0.method2173();
            if (var2 == 0) {
                return;
            }
            this.method739(arg0, var2);
        }
    }

    @ObfuscatedName("ae.x(Ldp;IB)V")
    public void method739(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2175();
            this.field907 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field907[var4] = arg0.method2175();
            }
            this.field905 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field905[var5] = arg0.method2175();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field905[var6] += arg0.method2175() << 16;
            }
        } else if (arg1 == 2) {
            this.field909 = arg0.method2175();
        } else if (arg1 == 3) {
            int var7 = arg0.method2173();
            this.field910 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field910[var8] = arg0.method2173();
            }
            this.field910[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field906 = true;
        } else if (arg1 == 5) {
            this.field912 = arg0.method2173();
        } else if (arg1 == 6) {
            this.field913 = arg0.method2175();
        } else if (arg1 == 7) {
            this.field903 = arg0.method2175();
        } else if (arg1 == 8) {
            this.field920 = arg0.method2173();
        } else if (arg1 == 9) {
            this.field901 = arg0.method2173();
        } else if (arg1 == 10) {
            this.field917 = arg0.method2173();
        } else if (arg1 == 11) {
            this.field900 = arg0.method2173();
        } else if (arg1 == 12) {
            int var9 = arg0.method2173();
            this.field918 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field918[var10] = arg0.method2175();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field918[var11] += arg0.method2175() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2173();
            this.field908 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field908[var13] = arg0.method2329();
            }
        }
    }

    @ObfuscatedName("ae.c(S)V")
    public void method748() {
        if (this.field901 == -1) {
            if (this.field910 == null) {
                this.field901 = 0;
            } else {
                this.field901 = 2;
            }
        }
        if (this.field917 != -1) {
            return;
        }
        if (this.field910 == null) {
            this.field917 = 0;
        } else {
            this.field917 = 2;
        }
    }

    @ObfuscatedName("ae.n(Lcn;II)Lcn;")
    public class98 method741(class98 arg0, int arg1) {
        int var3 = this.field905[arg1];
        class96 var4 = method1367(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2046(true);
        } else {
            class98 var6 = arg0.method2046(!var4.method2019(var5));
            var6.method2059(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ae.s(Lcn;III)Lcn;")
    public class98 method740(class98 arg0, int arg1, int arg2) {
        int var4 = this.field905[arg1];
        class96 var5 = method1367(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2046(true);
        }
        class98 var7 = arg0.method2046(!var5.method2019(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2042();
        } else if (var8 == 2) {
            var7.method2041();
        } else if (var8 == 3) {
            var7.method2082();
        }
        var7.method2059(var5, var6);
        if (var8 == 1) {
            var7.method2082();
        } else if (var8 == 2) {
            var7.method2041();
        } else if (var8 == 3) {
            var7.method2042();
        }
        return var7;
    }

    @ObfuscatedName("ae.r(Lcn;II)Lcn;")
    public class98 method743(class98 arg0, int arg1) {
        int var3 = this.field905[arg1];
        class96 var4 = method1367(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2032(true);
        } else {
            class98 var6 = arg0.method2032(!var4.method2019(var5));
            var6.method2059(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ae.w(Lcn;ILae;IB)Lcn;")
    public class98 method742(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field905[arg1];
        class96 var6 = method1367(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method741(arg0, arg3);
        }
        int var8 = arg2.field905[arg3];
        class96 var9 = method1367(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method2046(!var6.method2019(var7));
            var11.method2059(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method2046(!var6.method2019(var7) & !var9.method2019(var10));
            var12.method2057(var6, var7, var9, var10, this.field910);
            return var12;
        }
    }

    @ObfuscatedName("ae.u(Lcn;IB)Lcn;")
    public class98 method745(class98 arg0, int arg1) {
        int var3 = this.field905[arg1];
        class96 var4 = method1367(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2046(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field918 != null && arg1 < this.field918.length) {
            int var8 = this.field918[arg1];
            var6 = method1367(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method2046(!var4.method2019(var5));
            var10.method2059(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method2046(!var4.method2019(var5) & !var6.method2019(var7));
            var9.method2059(var4, var5);
            var9.method2059(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bi.d(II)Lcz;")
    public static class96 method1367(int arg0) {
        class96 var1 = (class96) field914.method3225((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class96 var2 = class96.method591(Statics.field915, Statics.field902, arg0, false);
        if (var2 != null) {
            field914.method3234(var2, (long) arg0);
        }
        return var2;
    }
}
