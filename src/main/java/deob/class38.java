package deob;

@ObfuscatedName("aq")
public class class38 extends class182 {

    @ObfuscatedName("aq.g")
    public static class171 field895 = new class171(64);

    @ObfuscatedName("aq.x")
    public static class171 field904 = new class171(100);

    @ObfuscatedName("aq.b")
    public int[] field897;

    @ObfuscatedName("aq.q")
    public int[] field898;

    @ObfuscatedName("aq.l")
    public int[] field899;

    @ObfuscatedName("aq.m")
    public int[] field906;

    @ObfuscatedName("aq.u")
    public int field902 = -1;

    @ObfuscatedName("aq.s")
    public int[] field908;

    @ObfuscatedName("aq.f")
    public boolean field903 = false;

    @ObfuscatedName("aq.p")
    public int field912 = 5;

    @ObfuscatedName("aq.w")
    public int field893 = -1;

    @ObfuscatedName("aq.y")
    public int field901 = -1;

    @ObfuscatedName("aq.h")
    public int field907 = 99;

    @ObfuscatedName("aq.j")
    public int field913 = -1;

    @ObfuscatedName("aq.c")
    public int field909 = -1;

    @ObfuscatedName("aq.d")
    public int field910 = 2;

    @ObfuscatedName("eb.e(Les;Les;Les;I)V")
    public static void method2674(class146 arg0, class146 arg1, class146 arg2) {
        Statics.field2660 = arg0;
        Statics.field900 = arg1;
        Statics.field894 = arg2;
    }

    @ObfuscatedName("aq.v(IB)Laq;")
    public static class38 method730(int arg0) {
        class38 var1 = (class38) field895.method3136((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2660.method2695(12, arg0);
        class38 var3 = new class38();
        if (var2 != null) {
            var3.method694(new class107(var2));
        }
        var3.method696();
        field895.method3127(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aq.i(Ldk;B)V")
    public void method694(class107 arg0) {
        while (true) {
            int var2 = arg0.method2226();
            if (var2 == 0) {
                return;
            }
            this.method693(arg0, var2);
        }
    }

    @ObfuscatedName("aq.g(Ldk;II)V")
    public void method693(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2152();
            this.field899 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field899[var4] = arg0.method2152();
            }
            this.field897 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field897[var5] = arg0.method2152();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field897[var6] += arg0.method2152() << 16;
            }
        } else if (arg1 == 2) {
            this.field902 = arg0.method2152();
        } else if (arg1 == 3) {
            int var7 = arg0.method2226();
            this.field908 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field908[var8] = arg0.method2226();
            }
            this.field908[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field903 = true;
        } else if (arg1 == 5) {
            this.field912 = arg0.method2226();
        } else if (arg1 == 6) {
            this.field893 = arg0.method2152();
        } else if (arg1 == 7) {
            this.field901 = arg0.method2152();
        } else if (arg1 == 8) {
            this.field907 = arg0.method2226();
        } else if (arg1 == 9) {
            this.field913 = arg0.method2226();
        } else if (arg1 == 10) {
            this.field909 = arg0.method2226();
        } else if (arg1 == 11) {
            this.field910 = arg0.method2226();
        } else if (arg1 == 12) {
            int var9 = arg0.method2226();
            this.field898 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field898[var10] = arg0.method2152();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field898[var11] += arg0.method2152() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2226();
            this.field906 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field906[var13] = arg0.method2112();
            }
        }
    }

    @ObfuscatedName("aq.x(I)V")
    public void method696() {
        if (this.field913 == -1) {
            if (this.field908 == null) {
                this.field913 = 0;
            } else {
                this.field913 = 2;
            }
        }
        if (this.field909 != -1) {
            return;
        }
        if (this.field908 == null) {
            this.field909 = 0;
        } else {
            this.field909 = 2;
        }
    }

    @ObfuscatedName("aq.b(Lcz;IB)Lcz;")
    public class98 method697(class98 arg0, int arg1) {
        int var3 = this.field897[arg1];
        class96 var4 = method31(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1966(true);
        } else {
            class98 var6 = arg0.method1966(!var4.method1960(var5));
            var6.method2012(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.q(Lcz;III)Lcz;")
    public class98 method728(class98 arg0, int arg1, int arg2) {
        int var4 = this.field897[arg1];
        class96 var5 = method31(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1966(true);
        }
        class98 var7 = arg0.method1966(!var5.method1960(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2021();
        } else if (var8 == 2) {
            var7.method1987();
        } else if (var8 == 3) {
            var7.method2017();
        }
        var7.method2012(var5, var6);
        if (var8 == 1) {
            var7.method2017();
        } else if (var8 == 2) {
            var7.method1987();
        } else if (var8 == 3) {
            var7.method2021();
        }
        return var7;
    }

    @ObfuscatedName("aq.l(Lcz;II)Lcz;")
    public class98 method699(class98 arg0, int arg1) {
        int var3 = this.field897[arg1];
        class96 var4 = method31(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1967(true);
        } else {
            class98 var6 = arg0.method1967(!var4.method1960(var5));
            var6.method2012(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aq.m(Lcz;ILaq;II)Lcz;")
    public class98 method700(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field897[arg1];
        class96 var6 = method31(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method697(arg0, arg3);
        }
        int var8 = arg2.field897[arg3];
        class96 var9 = method31(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1966(!var6.method1960(var7));
            var11.method2012(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1966(!var6.method1960(var7) & !var9.method1960(var10));
            var12.method2029(var6, var7, var9, var10, this.field908);
            return var12;
        }
    }

    @ObfuscatedName("aq.u(Lcz;IS)Lcz;")
    public class98 method723(class98 arg0, int arg1) {
        int var3 = this.field897[arg1];
        class96 var4 = method31(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1966(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field898 != null && arg1 < this.field898.length) {
            int var8 = this.field898[arg1];
            var6 = method31(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1966(!var4.method1960(var5));
            var10.method2012(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1966(!var4.method1960(var5) & !var6.method1960(var7));
            var9.method2012(var4, var5);
            var9.method2012(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("g.s(II)Lcd;")
    public static class96 method31(int arg0) {
        class96 var1 = (class96) field904.method3136((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class146 var2 = Statics.field900;
        class146 var3 = Statics.field894;
        boolean var4 = true;
        int[] var5 = var2.method2704(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2763(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2763(var8, 0);
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
            field904.method3127(var10, (long) arg0);
        }
        return var10;
    }
}
