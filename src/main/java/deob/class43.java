package deob;

@ObfuscatedName("af")
public class class43 extends class204 {

    @ObfuscatedName("af.l")
    public static class193 field994 = new class193(64);

    @ObfuscatedName("af.r")
    public static class193 field982 = new class193(100);

    @ObfuscatedName("af.u")
    public int[] field983;

    @ObfuscatedName("af.j")
    public int[] field984;

    @ObfuscatedName("af.w")
    public int[] field985;

    @ObfuscatedName("af.y")
    public int[] field981;

    @ObfuscatedName("af.o")
    public int field979 = -1;

    @ObfuscatedName("af.h")
    public int[] field988;

    @ObfuscatedName("af.e")
    public boolean field980 = false;

    @ObfuscatedName("af.v")
    public int field1001 = 5;

    @ObfuscatedName("af.p")
    public int field991 = -1;

    @ObfuscatedName("af.m")
    public int field992 = -1;

    @ObfuscatedName("af.b")
    public int field993 = 99;

    @ObfuscatedName("af.s")
    public int field995 = -1;

    @ObfuscatedName("af.x")
    public int field987 = -1;

    @ObfuscatedName("af.z")
    public int field996 = 2;

    @ObfuscatedName("ao.q(II)Laf;")
    public static class43 method788(int arg0) {
        class43 var1 = (class43) field994.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field990.method3094(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method860(new class119(var2));
        }
        var3.method866();
        field994.method3488(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.c(Ldc;I)V")
    public void method860(class119 arg0) {
        while (true) {
            int var2 = arg0.method2360();
            if (var2 == 0) {
                return;
            }
            this.method858(arg0, var2);
        }
    }

    @ObfuscatedName("af.l(Ldc;II)V")
    public void method858(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2430();
            this.field985 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field985[var4] = arg0.method2430();
            }
            this.field983 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field983[var5] = arg0.method2430();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field983[var6] += arg0.method2430() << 16;
            }
        } else if (arg1 == 2) {
            this.field979 = arg0.method2430();
        } else if (arg1 == 3) {
            int var7 = arg0.method2360();
            this.field988 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field988[var8] = arg0.method2360();
            }
            this.field988[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field980 = true;
        } else if (arg1 == 5) {
            this.field1001 = arg0.method2360();
        } else if (arg1 == 6) {
            this.field991 = arg0.method2430();
        } else if (arg1 == 7) {
            this.field992 = arg0.method2430();
        } else if (arg1 == 8) {
            this.field993 = arg0.method2360();
        } else if (arg1 == 9) {
            this.field995 = arg0.method2360();
        } else if (arg1 == 10) {
            this.field987 = arg0.method2360();
        } else if (arg1 == 11) {
            this.field996 = arg0.method2360();
        } else if (arg1 == 12) {
            int var9 = arg0.method2360();
            this.field984 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field984[var10] = arg0.method2430();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field984[var11] += arg0.method2430() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2360();
            this.field981 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field981[var13] = arg0.method2364();
            }
        }
    }

    @ObfuscatedName("af.r(I)V")
    public void method866() {
        if (this.field995 == -1) {
            if (this.field988 == null) {
                this.field995 = 0;
            } else {
                this.field995 = 2;
            }
        }
        if (this.field987 != -1) {
            return;
        }
        if (this.field988 == null) {
            this.field987 = 0;
        } else {
            this.field987 = 2;
        }
    }

    @ObfuscatedName("af.u(Ldt;IS)Ldt;")
    public class105 method869(class105 arg0, int arg1) {
        int var3 = this.field983[arg1];
        class103 var4 = method654(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2173(true);
        } else {
            class105 var6 = arg0.method2173(!var4.method2156(var5));
            var6.method2177(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.j(Ldt;III)Ldt;")
    public class105 method859(class105 arg0, int arg1, int arg2) {
        int var4 = this.field983[arg1];
        class103 var5 = method654(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2173(true);
        }
        class105 var7 = arg0.method2173(!var5.method2156(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2171();
        } else if (var8 == 2) {
            var7.method2170();
        } else if (var8 == 3) {
            var7.method2169();
        }
        var7.method2177(var5, var6);
        if (var8 == 1) {
            var7.method2169();
        } else if (var8 == 2) {
            var7.method2170();
        } else if (var8 == 3) {
            var7.method2171();
        }
        return var7;
    }

    @ObfuscatedName("af.w(Ldt;II)Ldt;")
    public class105 method862(class105 arg0, int arg1) {
        int var3 = this.field983[arg1];
        class103 var4 = method654(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2162(true);
        } else {
            class105 var6 = arg0.method2162(!var4.method2156(var5));
            var6.method2177(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("af.y(Ldt;ILaf;IB)Ldt;")
    public class105 method863(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field983[arg1];
        class103 var6 = method654(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method869(arg0, arg3);
        }
        int var8 = arg2.field983[arg3];
        class103 var9 = method654(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2173(!var6.method2156(var7));
            var11.method2177(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2173(!var6.method2156(var7) & !var9.method2156(var10));
            var12.method2183(var6, var7, var9, var10, this.field988);
            return var12;
        }
    }

    @ObfuscatedName("af.o(Ldt;IB)Ldt;")
    public class105 method864(class105 arg0, int arg1) {
        int var3 = this.field983[arg1];
        class103 var4 = method654(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2173(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field984 != null && arg1 < this.field984.length) {
            int var8 = this.field984[arg1];
            var6 = method654(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2173(!var4.method2156(var5));
            var10.method2177(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2173(!var4.method2156(var5) & !var6.method2156(var7));
            var9.method2177(var4, var5);
            var9.method2177(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ac.h(IB)Lcv;")
    public static class103 method654(int arg0) {
        class103 var1 = (class103) field982.method3475((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class167 var2 = Statics.field989;
        class167 var3 = Statics.field3216;
        boolean var4 = true;
        int[] var5 = var2.method3085(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3026(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3026(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class103 var10;
        if (var4) {
            try {
                var10 = new class103(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field982.method3488(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("cm.e(B)V")
    public static void method1965() {
        field994.method3479();
        field982.method3479();
    }
}
