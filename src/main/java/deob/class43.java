package deob;

@ObfuscatedName("ag")
public class class43 extends class204 {

    @ObfuscatedName("ag.h")
    public static class193 field1002 = new class193(64);

    @ObfuscatedName("ag.a")
    public static class193 field996 = new class193(100);

    @ObfuscatedName("ag.s")
    public int[] field1000;

    @ObfuscatedName("ag.p")
    public int[] field999;

    @ObfuscatedName("ag.r")
    public int[] field1010;

    @ObfuscatedName("ag.k")
    public int[] field1003;

    @ObfuscatedName("ag.d")
    public int field1015 = -1;

    @ObfuscatedName("ag.n")
    public int[] field1005;

    @ObfuscatedName("ag.z")
    public boolean field1006 = false;

    @ObfuscatedName("ag.c")
    public int field1007 = 5;

    @ObfuscatedName("ag.b")
    public int field1008 = -1;

    @ObfuscatedName("ag.w")
    public int field1009 = -1;

    @ObfuscatedName("ag.g")
    public int field1012 = 99;

    @ObfuscatedName("ag.x")
    public int field1011 = -1;

    @ObfuscatedName("ag.o")
    public int field1013 = -1;

    @ObfuscatedName("ag.l")
    public int field1004 = 2;

    @ObfuscatedName("ed.i(Lfn;Lfn;Lfn;I)V")
    public static void method2633(class167 arg0, class167 arg1, class167 arg2) {
        Statics.field1018 = arg0;
        Statics.field1014 = arg1;
        Statics.field997 = arg2;
    }

    @ObfuscatedName("ho.v(II)Lag;")
    public static class43 method3831(int arg0) {
        class43 var1 = (class43) field1002.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1018.method3080(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method813(new class119(var2));
        }
        var3.method802();
        field1002.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ag.f(Ldj;I)V")
    public void method813(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method803(arg0, var2);
        }
    }

    @ObfuscatedName("ag.h(Ldj;IB)V")
    public void method803(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2312();
            this.field1010 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1010[var4] = arg0.method2312();
            }
            this.field1000 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1000[var5] = arg0.method2312();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1000[var6] += arg0.method2312() << 16;
            }
        } else if (arg1 == 2) {
            this.field1015 = arg0.method2312();
        } else if (arg1 == 3) {
            int var7 = arg0.method2310();
            this.field1005 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1005[var8] = arg0.method2310();
            }
            this.field1005[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1006 = true;
        } else if (arg1 == 5) {
            this.field1007 = arg0.method2310();
        } else if (arg1 == 6) {
            this.field1008 = arg0.method2312();
        } else if (arg1 == 7) {
            this.field1009 = arg0.method2312();
        } else if (arg1 == 8) {
            this.field1012 = arg0.method2310();
        } else if (arg1 == 9) {
            this.field1011 = arg0.method2310();
        } else if (arg1 == 10) {
            this.field1013 = arg0.method2310();
        } else if (arg1 == 11) {
            this.field1004 = arg0.method2310();
        } else if (arg1 == 12) {
            int var9 = arg0.method2310();
            this.field999 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field999[var10] = arg0.method2312();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field999[var11] += arg0.method2312() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2310();
            this.field1003 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1003[var13] = arg0.method2314();
            }
        }
    }

    @ObfuscatedName("ag.a(I)V")
    public void method802() {
        if (this.field1011 == -1) {
            if (this.field1005 == null) {
                this.field1011 = 0;
            } else {
                this.field1011 = 2;
            }
        }
        if (this.field1013 != -1) {
            return;
        }
        if (this.field1005 == null) {
            this.field1013 = 0;
        } else {
            this.field1013 = 2;
        }
    }

    @ObfuscatedName("ag.s(Ldo;IS)Ldo;")
    public class105 method805(class105 arg0, int arg1) {
        int var3 = this.field1000[arg1];
        class103 var4 = method2738(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2103(true);
        } else {
            class105 var6 = arg0.method2103(!var4.method2092(var5));
            var6.method2109(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ag.p(Ldo;III)Ldo;")
    public class105 method806(class105 arg0, int arg1, int arg2) {
        int var4 = this.field1000[arg1];
        class103 var5 = method2738(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2103(true);
        }
        class105 var7 = arg0.method2103(!var5.method2092(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2113();
        } else if (var8 == 2) {
            var7.method2111();
        } else if (var8 == 3) {
            var7.method2107();
        }
        var7.method2109(var5, var6);
        if (var8 == 1) {
            var7.method2107();
        } else if (var8 == 2) {
            var7.method2111();
        } else if (var8 == 3) {
            var7.method2113();
        }
        return var7;
    }

    @ObfuscatedName("ag.r(Ldo;II)Ldo;")
    public class105 method818(class105 arg0, int arg1) {
        int var3 = this.field1000[arg1];
        class103 var4 = method2738(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2175(true);
        } else {
            class105 var6 = arg0.method2175(!var4.method2092(var5));
            var6.method2109(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ag.k(Ldo;ILag;IB)Ldo;")
    public class105 method809(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field1000[arg1];
        class103 var6 = method2738(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method805(arg0, arg3);
        }
        int var8 = arg2.field1000[arg3];
        class103 var9 = method2738(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2103(!var6.method2092(var7));
            var11.method2109(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2103(!var6.method2092(var7) & !var9.method2092(var10));
            var12.method2110(var6, var7, var9, var10, this.field1005);
            return var12;
        }
    }

    @ObfuscatedName("ag.d(Ldo;II)Ldo;")
    public class105 method835(class105 arg0, int arg1) {
        int var3 = this.field1000[arg1];
        class103 var4 = method2738(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2103(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field999 != null && arg1 < this.field999.length) {
            int var8 = this.field999[arg1];
            var6 = method2738(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2103(!var4.method2092(var5));
            var10.method2109(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2103(!var4.method2092(var5) & !var6.method2092(var7));
            var9.method2109(var4, var5);
            var9.method2109(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("eh.n(II)Lcu;")
    public static class103 method2738(int arg0) {
        class103 var1 = (class103) field996.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method2621(Statics.field1014, Statics.field997, arg0, false);
        if (var2 != null) {
            field996.method3466(var2, (long) arg0);
        }
        return var2;
    }
}
