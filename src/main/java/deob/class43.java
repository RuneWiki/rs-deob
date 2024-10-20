package deob;

@ObfuscatedName("am")
public class class43 extends class204 {

    @ObfuscatedName("am.w")
    public static class193 field981 = new class193(64);

    @ObfuscatedName("am.e")
    public static class193 field982 = new class193(100);

    @ObfuscatedName("am.c")
    public int[] field986;

    @ObfuscatedName("am.a")
    public int[] field987;

    @ObfuscatedName("am.q")
    public int[] field985;

    @ObfuscatedName("am.m")
    public int[] field990;

    @ObfuscatedName("am.n")
    public int field994 = -1;

    @ObfuscatedName("am.k")
    public int[] field991;

    @ObfuscatedName("am.o")
    public boolean field989 = false;

    @ObfuscatedName("am.f")
    public int field979 = 5;

    @ObfuscatedName("am.s")
    public int field993 = -1;

    @ObfuscatedName("am.z")
    public int field992 = -1;

    @ObfuscatedName("am.b")
    public int field984 = 99;

    @ObfuscatedName("am.p")
    public int field983 = -1;

    @ObfuscatedName("am.r")
    public int field995 = -1;

    @ObfuscatedName("am.x")
    public int field996 = 2;

    @ObfuscatedName("az.y(II)Lam;")
    public static class43 method750(int arg0) {
        class43 var1 = (class43) field981.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field988.method3045(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method866(new class119(var2));
        }
        var3.method832();
        field981.method3427(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.d(Ldd;I)V")
    public void method866(class119 arg0) {
        while (true) {
            int var2 = arg0.method2326();
            if (var2 == 0) {
                return;
            }
            this.method831(arg0, var2);
        }
    }

    @ObfuscatedName("am.g(Ldd;II)V")
    public void method831(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2525();
            this.field985 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field985[var4] = arg0.method2525();
            }
            this.field986 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field986[var5] = arg0.method2525();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field986[var6] += arg0.method2525() << 16;
            }
        } else if (arg1 == 2) {
            this.field994 = arg0.method2525();
        } else if (arg1 == 3) {
            int var7 = arg0.method2326();
            this.field991 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field991[var8] = arg0.method2326();
            }
            this.field991[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field989 = true;
        } else if (arg1 == 5) {
            this.field979 = arg0.method2326();
        } else if (arg1 == 6) {
            this.field993 = arg0.method2525();
        } else if (arg1 == 7) {
            this.field992 = arg0.method2525();
        } else if (arg1 == 8) {
            this.field984 = arg0.method2326();
        } else if (arg1 == 9) {
            this.field983 = arg0.method2326();
        } else if (arg1 == 10) {
            this.field995 = arg0.method2326();
        } else if (arg1 == 11) {
            this.field996 = arg0.method2326();
        } else if (arg1 == 12) {
            int var9 = arg0.method2326();
            this.field987 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field987[var10] = arg0.method2525();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field987[var11] += arg0.method2525() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2326();
            this.field990 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field990[var13] = arg0.method2476();
            }
        }
    }

    @ObfuscatedName("am.w(I)V")
    public void method832() {
        if (this.field983 == -1) {
            if (this.field991 == null) {
                this.field983 = 0;
            } else {
                this.field983 = 2;
            }
        }
        if (this.field995 != -1) {
            return;
        }
        if (this.field991 == null) {
            this.field995 = 0;
        } else {
            this.field995 = 2;
        }
    }

    @ObfuscatedName("am.e(Ldg;II)Ldg;")
    public class105 method833(class105 arg0, int arg1) {
        int var3 = this.field986[arg1];
        class103 var4 = method125(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2181(true);
        } else {
            class105 var6 = arg0.method2181(!var4.method2117(var5));
            var6.method2132(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("am.c(Ldg;III)Ldg;")
    public class105 method834(class105 arg0, int arg1, int arg2) {
        int var4 = this.field986[arg1];
        class103 var5 = method125(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2181(true);
        }
        class105 var7 = arg0.method2181(!var5.method2117(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2137();
        } else if (var8 == 2) {
            var7.method2136();
        } else if (var8 == 3) {
            var7.method2135();
        }
        var7.method2132(var5, var6);
        if (var8 == 1) {
            var7.method2135();
        } else if (var8 == 2) {
            var7.method2136();
        } else if (var8 == 3) {
            var7.method2137();
        }
        return var7;
    }

    @ObfuscatedName("am.a(Ldg;IB)Ldg;")
    public class105 method835(class105 arg0, int arg1) {
        int var3 = this.field986[arg1];
        class103 var4 = method125(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2127(true);
        } else {
            class105 var6 = arg0.method2127(!var4.method2117(var5));
            var6.method2132(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("am.q(Ldg;ILam;IB)Ldg;")
    public class105 method836(class105 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field986[arg1];
        class103 var6 = method125(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method833(arg0, arg3);
        }
        int var8 = arg2.field986[arg3];
        class103 var9 = method125(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class105 var11 = arg0.method2181(!var6.method2117(var7));
            var11.method2132(var6, var7);
            return var11;
        } else {
            class105 var12 = arg0.method2181(!var6.method2117(var7) & !var9.method2117(var10));
            var12.method2133(var6, var7, var9, var10, this.field991);
            return var12;
        }
    }

    @ObfuscatedName("am.m(Ldg;II)Ldg;")
    public class105 method837(class105 arg0, int arg1) {
        int var3 = this.field986[arg1];
        class103 var4 = method125(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2181(true);
        }
        class103 var6 = null;
        int var7 = 0;
        if (this.field987 != null && arg1 < this.field987.length) {
            int var8 = this.field987[arg1];
            var6 = method125(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class105 var10 = arg0.method2181(!var4.method2117(var5));
            var10.method2132(var4, var5);
            return var10;
        } else {
            class105 var9 = arg0.method2181(!var4.method2117(var5) & !var6.method2117(var7));
            var9.method2132(var4, var5);
            var9.method2132(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("m.n(II)Lcz;")
    public static class103 method125(int arg0) {
        class103 var1 = (class103) field982.method3425((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class103 var2 = class103.method2618(Statics.field980, Statics.field585, arg0, false);
        if (var2 != null) {
            field982.method3427(var2, (long) arg0);
        }
        return var2;
    }
}
