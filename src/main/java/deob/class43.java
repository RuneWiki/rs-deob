package deob;

@ObfuscatedName("at")
public class class43 extends class204 {

    @ObfuscatedName("at.q")
    public static class193 field969 = new class193(64);

    @ObfuscatedName("at.j")
    public static class193 field970 = new class193(100);

    @ObfuscatedName("at.k")
    public int[] field973;

    @ObfuscatedName("at.i")
    public int[] field972;

    @ObfuscatedName("at.m")
    public int[] field980;

    @ObfuscatedName("at.p")
    public int[] field974;

    @ObfuscatedName("at.h")
    public int field975 = -1;

    @ObfuscatedName("at.e")
    public int[] field976;

    @ObfuscatedName("at.g")
    public boolean field977 = false;

    @ObfuscatedName("at.b")
    public int field978 = 5;

    @ObfuscatedName("at.f")
    public int field967 = -1;

    @ObfuscatedName("at.y")
    public int field985 = -1;

    @ObfuscatedName("at.z")
    public int field966 = 99;

    @ObfuscatedName("at.t")
    public int field979 = -1;

    @ObfuscatedName("at.o")
    public int field983 = -1;

    @ObfuscatedName("at.r")
    public int field984 = 2;

    @ObfuscatedName("ea.n(II)Lat;")
    public static class43 method2827(int arg0) {
        class43 var1 = (class43) field969.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field971.method3010(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method856(new class119(var2));
        }
        var3.method827();
        field969.method3481(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.d(Ldq;B)V")
    public void method856(class119 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method826(arg0, var2);
        }
    }

    @ObfuscatedName("at.s(Ldq;II)V")
    public void method826(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2377();
            this.field980 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field980[var4] = arg0.method2377();
            }
            this.field973 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field973[var5] = arg0.method2377();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field973[var6] += arg0.method2377() << 16;
            }
        } else if (arg1 == 2) {
            this.field975 = arg0.method2377();
        } else if (arg1 == 3) {
            int var7 = arg0.method2338();
            this.field976 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field976[var8] = arg0.method2338();
            }
            this.field976[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field977 = true;
        } else if (arg1 == 5) {
            this.field978 = arg0.method2338();
        } else if (arg1 == 6) {
            this.field967 = arg0.method2377();
        } else if (arg1 == 7) {
            this.field985 = arg0.method2377();
        } else if (arg1 == 8) {
            this.field966 = arg0.method2338();
        } else if (arg1 == 9) {
            this.field979 = arg0.method2338();
        } else if (arg1 == 10) {
            this.field983 = arg0.method2338();
        } else if (arg1 == 11) {
            this.field984 = arg0.method2338();
        } else if (arg1 == 12) {
            int var9 = arg0.method2338();
            this.field972 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field972[var10] = arg0.method2377();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field972[var11] += arg0.method2377() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2338();
            this.field974 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field974[var13] = arg0.method2342();
            }
        }
    }

    @ObfuscatedName("at.q(I)V")
    public void method827() {
        if (this.field979 == -1) {
            if (this.field976 == null) {
                this.field979 = 0;
            } else {
                this.field979 = 2;
            }
        }
        if (this.field983 != -1) {
            return;
        }
        if (this.field976 == null) {
            this.field983 = 0;
        } else {
            this.field983 = 2;
        }
    }

    @ObfuscatedName("at.j(Ldb;II)Ldb;")
    public class105 method840(class105 arg0, int arg1) {
        int var3 = this.field973[arg1];
        class103 var4 = method945(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2124(true);
        } else {
            class105 var6 = arg0.method2124(!var4.method2114(var5));
            var6.method2130(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("at.k(Ldb;IIS)Ldb;")
    public class105 method829(class105 arg0, int arg1, int arg2) {
        int var4 = this.field973[arg1];
        class103 var5 = method945(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2124(true);
        }
        class105 var7 = arg0.method2124(!var5.method2114(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2135();
        } else if (var8 == 2) {
            var7.method2134();
        } else if (var8 == 3) {
            var7.method2133();
        }
        var7.method2130(var5, var6);
        if (var8 == 1) {
            var7.method2133();
        } else if (var8 == 2) {
            var7.method2134();
        } else if (var8 == 3) {
            var7.method2135();
        }
        return var7;
    }

    @ObfuscatedName("at.i(Ldb;II)Ldb;")
    public class105 method850(class105 arg0, int arg1) {
        int var3 = this.field973[arg1];
        class103 var4 = method945(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2125(true);
        } else {
            class105 var6 = arg0.method2125(!var4.method2114(var5));
            var6.method2130(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("at.m(Ldb;ILat;II)Ldb;")
    public class105 method824(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field973[arg1];
        class103 var6 = method945(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method840(arg0, arg3);
        }
        int var8 = arg2.field973[arg3];
        class103 var9 = method945(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2124(!var6.method2114(var7));
            var11.method2130(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2124(!var6.method2114(var7) & !var9.method2114(var10));
            var12.method2151(var6, var7, var9, var10, this.field976);
            return var12;
        }
    }

    @ObfuscatedName("at.p(Ldb;II)Ldb;")
    public class105 method849(class105 arg0, int arg1) {
        int var3 = this.field973[arg1];
        class103 var4 = method945(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2124(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field972 != null && arg1 < this.field972.length) {
            int var8 = this.field972[arg1];
            var6 = method945(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2124(!var4.method2114(var5));
            var10.method2130(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2124(!var4.method2114(var5) & !var6.method2114(var7));
            var9.method2130(var4, var5);
            var9.method2130(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ao.h(II)Lco;")
    public static class103 method945(int arg0) {
        class103 var1 = (class103) field970.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method2933(Statics.field982, Statics.field968, arg0, false);
        if (var2 != null) {
            field970.method3481(var2, (long) arg0);
        }
        return var2;
    }
}
