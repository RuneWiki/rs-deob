package deob;

@ObfuscatedName("aa")
public class class43 extends class205 {

    @ObfuscatedName("aa.s")
    public static class194 field965 = new class194(64);

    @ObfuscatedName("aa.p")
    public static class194 field964 = new class194(100);

    @ObfuscatedName("aa.h")
    public int[] field976;

    @ObfuscatedName("aa.g")
    public int[] field968;

    @ObfuscatedName("aa.a")
    public int[] field969;

    @ObfuscatedName("aa.r")
    public int[] field970;

    @ObfuscatedName("aa.k")
    public int field966 = -1;

    @ObfuscatedName("aa.m")
    public int[] field973;

    @ObfuscatedName("aa.n")
    public boolean field980 = false;

    @ObfuscatedName("aa.y")
    public int field974 = 5;

    @ObfuscatedName("aa.i")
    public int field975 = -1;

    @ObfuscatedName("aa.j")
    public int field967 = -1;

    @ObfuscatedName("aa.l")
    public int field977 = 99;

    @ObfuscatedName("aa.o")
    public int field978 = -1;

    @ObfuscatedName("aa.c")
    public int field979 = -1;

    @ObfuscatedName("aa.x")
    public int field972 = 2;

    @ObfuscatedName("ah.e(Lft;Lft;Lft;S)V")
    public static void method684(class168 arg0, class168 arg1, class168 arg2) {
        Statics.field971 = arg0;
        Statics.field963 = arg1;
        Statics.field962 = arg2;
    }

    @ObfuscatedName("au.w(II)Laa;")
    public static class43 method949(int arg0) {
        class43 var1 = (class43) field965.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field971.method3048(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method832(new class120(var2));
        }
        var3.method834();
        field965.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.f(Ldq;I)V")
    public void method832(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method833(arg0, var2);
        }
    }

    @ObfuscatedName("aa.s(Ldq;II)V")
    public void method833(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2532();
            this.field969 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field969[var4] = arg0.method2532();
            }
            this.field976 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field976[var5] = arg0.method2532();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field976[var6] += arg0.method2532() << 16;
            }
        } else if (arg1 == 2) {
            this.field966 = arg0.method2532();
        } else if (arg1 == 3) {
            int var7 = arg0.method2355();
            this.field973 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field973[var8] = arg0.method2355();
            }
            this.field973[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field980 = true;
        } else if (arg1 == 5) {
            this.field974 = arg0.method2355();
        } else if (arg1 == 6) {
            this.field975 = arg0.method2532();
        } else if (arg1 == 7) {
            this.field967 = arg0.method2532();
        } else if (arg1 == 8) {
            this.field977 = arg0.method2355();
        } else if (arg1 == 9) {
            this.field978 = arg0.method2355();
        } else if (arg1 == 10) {
            this.field979 = arg0.method2355();
        } else if (arg1 == 11) {
            this.field972 = arg0.method2355();
        } else if (arg1 == 12) {
            int var9 = arg0.method2355();
            this.field968 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field968[var10] = arg0.method2532();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field968[var11] += arg0.method2532() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2355();
            this.field970 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field970[var13] = arg0.method2359();
            }
        }
    }

    @ObfuscatedName("aa.p(I)V")
    public void method834() {
        if (this.field978 == -1) {
            if (this.field973 == null) {
                this.field978 = 0;
            } else {
                this.field978 = 2;
            }
        }
        if (this.field979 != -1) {
            return;
        }
        if (this.field973 == null) {
            this.field979 = 0;
        } else {
            this.field979 = 2;
        }
    }

    @ObfuscatedName("aa.h(Ldy;II)Ldy;")
    public class106 method872(class106 arg0, int arg1) {
        int var3 = this.field976[arg1];
        class104 var4 = method830(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2166(true);
        } else {
            class106 var6 = arg0.method2166(!var4.method2157(var5));
            var6.method2172(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.g(Ldy;III)Ldy;")
    public class106 method836(class106 arg0, int arg1, int arg2) {
        int var4 = this.field976[arg1];
        class104 var5 = method830(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2166(true);
        }
        class106 var7 = arg0.method2166(!var5.method2157(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2177();
        } else if (var8 == 2) {
            var7.method2176();
        } else if (var8 == 3) {
            var7.method2222();
        }
        var7.method2172(var5, var6);
        if (var8 == 1) {
            var7.method2222();
        } else if (var8 == 2) {
            var7.method2176();
        } else if (var8 == 3) {
            var7.method2177();
        }
        return var7;
    }

    @ObfuscatedName("aa.a(Ldy;IB)Ldy;")
    public class106 method837(class106 arg0, int arg1) {
        int var3 = this.field976[arg1];
        class104 var4 = method830(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2207(true);
        } else {
            class106 var6 = arg0.method2207(!var4.method2157(var5));
            var6.method2172(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.r(Ldy;ILaa;II)Ldy;")
    public class106 method843(class106 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field976[arg1];
        class104 var6 = method830(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method872(arg0, arg3);
        }
        int var8 = arg2.field976[arg3];
        class104 var9 = method830(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class106 var11 = arg0.method2166(!var6.method2157(var7));
            var11.method2172(var6, var7);
            return var11;
        } else {
            class106 var12 = arg0.method2166(!var6.method2157(var7) & !var9.method2157(var10));
            var12.method2175(var6, var7, var9, var10, this.field973);
            return var12;
        }
    }

    @ObfuscatedName("aa.k(Ldy;IB)Ldy;")
    public class106 method831(class106 arg0, int arg1) {
        int var3 = this.field976[arg1];
        class104 var4 = method830(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2166(true);
        }
        class104 var6 = null;
        int var7 = 0;
        if (this.field968 != null && arg1 < this.field968.length) {
            int var8 = this.field968[arg1];
            var6 = method830(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class106 var10 = arg0.method2166(!var4.method2157(var5));
            var10.method2172(var4, var5);
            return var10;
        } else {
            class106 var9 = arg0.method2166(!var4.method2157(var5) & !var6.method2157(var7));
            var9.method2172(var4, var5);
            var9.method2172(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ad.m(II)Lcl;")
    public static class104 method830(int arg0) {
        class104 var1 = (class104) field964.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class104 var2 = class104.method1571(Statics.field963, Statics.field962, arg0, false);
        if (var2 != null) {
            field964.method3475(var2, (long) arg0);
        }
        return var2;
    }
}
