package deob;

@ObfuscatedName("ao")
public class class38 extends class180 {

    @ObfuscatedName("ao.v")
    public static class170 field884 = new class170(64);

    @ObfuscatedName("ao.l")
    public static class170 field885 = new class170(100);

    @ObfuscatedName("ao.g")
    public int[] field886;

    @ObfuscatedName("ao.a")
    public int[] field898;

    @ObfuscatedName("ao.x")
    public int[] field881;

    @ObfuscatedName("ao.r")
    public int[] field888;

    @ObfuscatedName("ao.w")
    public int field890 = -1;

    @ObfuscatedName("ao.c")
    public int[] field891;

    @ObfuscatedName("ao.f")
    public boolean field883 = false;

    @ObfuscatedName("ao.o")
    public int field887 = 5;

    @ObfuscatedName("ao.p")
    public int field894 = -1;

    @ObfuscatedName("ao.n")
    public int field895 = -1;

    @ObfuscatedName("ao.m")
    public int field896 = 99;

    @ObfuscatedName("ao.s")
    public int field897 = -1;

    @ObfuscatedName("ao.t")
    public int field892 = -1;

    @ObfuscatedName("ao.j")
    public int field899 = 2;

    @ObfuscatedName("z.y(Lev;Lev;Lev;B)V")
    public static void method493(class145 arg0, class145 arg1, class145 arg2) {
        Statics.field903 = arg0;
        Statics.field900 = arg1;
        Statics.field889 = arg2;
    }

    @ObfuscatedName("cc.u(II)Lao;")
    public static class38 method1866(int arg0) {
        class38 var1 = (class38) field884.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field903.method2704(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method691(new class107(var2));
        }
        var3.method700();
        field884.method3147(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.k(Ldo;S)V")
    public void method691(class107 arg0) {
        while (true) {
            int var2 = arg0.method2109();
            if (var2 == 0) {
                return;
            }
            this.method692(arg0, var2);
        }
    }

    @ObfuscatedName("ao.v(Ldo;II)V")
    public void method692(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2111();
            this.field881 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field881[var4] = arg0.method2111();
            }
            this.field886 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field886[var5] = arg0.method2111();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field886[var6] += arg0.method2111() << 16;
            }
        } else if (arg1 == 2) {
            this.field890 = arg0.method2111();
        } else if (arg1 == 3) {
            int var7 = arg0.method2109();
            this.field891 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field891[var8] = arg0.method2109();
            }
            this.field891[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field883 = true;
        } else if (arg1 == 5) {
            this.field887 = arg0.method2109();
        } else if (arg1 == 6) {
            this.field894 = arg0.method2111();
        } else if (arg1 == 7) {
            this.field895 = arg0.method2111();
        } else if (arg1 == 8) {
            this.field896 = arg0.method2109();
        } else if (arg1 == 9) {
            this.field897 = arg0.method2109();
        } else if (arg1 == 10) {
            this.field892 = arg0.method2109();
        } else if (arg1 == 11) {
            this.field899 = arg0.method2109();
        } else if (arg1 == 12) {
            int var9 = arg0.method2109();
            this.field898 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field898[var10] = arg0.method2111();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field898[var11] += arg0.method2111() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2109();
            this.field888 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field888[var13] = arg0.method2113();
            }
        }
    }

    @ObfuscatedName("ao.l(B)V")
    public void method700() {
        if (this.field897 == -1) {
            if (this.field891 == null) {
                this.field897 = 0;
            } else {
                this.field897 = 2;
            }
        }
        if (this.field892 != -1) {
            return;
        }
        if (this.field891 == null) {
            this.field892 = 0;
        } else {
            this.field892 = 2;
        }
    }

    @ObfuscatedName("ao.g(Lcz;II)Lcz;")
    public class98 method690(class98 arg0, int arg1) {
        int var3 = this.field886[arg1];
        class96 var4 = method280(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1987(true);
        } else {
            class98 var6 = arg0.method1987(!var4.method1955(var5));
            var6.method2020(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.a(Lcz;III)Lcz;")
    public class98 method695(class98 arg0, int arg1, int arg2) {
        int var4 = this.field886[arg1];
        class96 var5 = method280(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1987(true);
        }
        class98 var7 = arg0.method1987(!var5.method1955(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1974();
        } else if (var8 == 2) {
            var7.method1977();
        } else if (var8 == 3) {
            var7.method1972();
        }
        var7.method2020(var5, var6);
        if (var8 == 1) {
            var7.method1972();
        } else if (var8 == 2) {
            var7.method1977();
        } else if (var8 == 3) {
            var7.method1974();
        }
        return var7;
    }

    @ObfuscatedName("ao.x(Lcz;II)Lcz;")
    public class98 method693(class98 arg0, int arg1) {
        int var3 = this.field886[arg1];
        class96 var4 = method280(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1964(true);
        } else {
            class98 var6 = arg0.method1964(!var4.method1955(var5));
            var6.method2020(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.r(Lcz;ILao;II)Lcz;")
    public class98 method697(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field886[arg1];
        class96 var6 = method280(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method690(arg0, arg3);
        }
        int var8 = arg2.field886[arg3];
        class96 var9 = method280(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1987(!var6.method1955(var7));
            var11.method2020(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1987(!var6.method1955(var7) & !var9.method1955(var10));
            var12.method1970(var6, var7, var9, var10, this.field891);
            return var12;
        }
    }

    @ObfuscatedName("ao.w(Lcz;II)Lcz;")
    public class98 method698(class98 arg0, int arg1) {
        int var3 = this.field886[arg1];
        class96 var4 = method280(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1987(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field898 != null && arg1 < this.field898.length) {
            int var8 = this.field898[arg1];
            var6 = method280(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1987(!var4.method1955(var5));
            var10.method2020(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1987(!var4.method1955(var5) & !var6.method1955(var7));
            var9.method2020(var4, var5);
            var9.method2020(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("client.c(IB)Lcb;")
    public static class96 method280(int arg0) {
        class96 var1 = (class96) field885.method3145((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class145 var2 = Statics.field900;
        class145 var3 = Statics.field889;
        boolean var4 = true;
        int[] var5 = var2.method2713(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2769(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2769(var8, 0);
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
            field885.method3147(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("de.f(I)V")
    public static void method2501() {
        field884.method3141();
        field885.method3141();
    }
}
