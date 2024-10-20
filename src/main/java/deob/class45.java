package deob;

@ObfuscatedName("ay")
public class class45 extends class208 {

    @ObfuscatedName("ay.y")
    public static class197 field973 = new class197(64);

    @ObfuscatedName("ay.p")
    public static class197 field969 = new class197(100);

    @ObfuscatedName("ay.g")
    public int[] field970;

    @ObfuscatedName("ay.m")
    public int[] field975;

    @ObfuscatedName("ay.f")
    public int[] field982;

    @ObfuscatedName("ay.k")
    public int[] field977;

    @ObfuscatedName("ay.h")
    public int field974 = -1;

    @ObfuscatedName("ay.r")
    public int[] field972;

    @ObfuscatedName("ay.w")
    public boolean field976 = false;

    @ObfuscatedName("ay.u")
    public int field971 = 5;

    @ObfuscatedName("ay.n")
    public int field978 = -1;

    @ObfuscatedName("ay.d")
    public int field979 = -1;

    @ObfuscatedName("ay.a")
    public int field980 = 99;

    @ObfuscatedName("ay.b")
    public int field968 = -1;

    @ObfuscatedName("ay.q")
    public int field981 = -1;

    @ObfuscatedName("ay.o")
    public int field983 = 2;

    @ObfuscatedName("gf.s(Lfu;Lfu;Lfu;I)V")
    public static void method3508(class171 arg0, class171 arg1, class171 arg2) {
        Statics.field966 = arg0;
        Statics.field1608 = arg1;
        Statics.field967 = arg2;
    }

    @ObfuscatedName("p.z(II)Lay;")
    public static class45 method44(int arg0) {
        class45 var1 = (class45) field973.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field966.method3091(12, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method863(new class123(var2));
        }
        var3.method865();
        field973.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.t(Ldy;B)V")
    public void method863(class123 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method862(arg0, var2);
        }
    }

    @ObfuscatedName("ay.y(Ldy;IB)V")
    public void method862(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2550();
            this.field982 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field982[var4] = arg0.method2550();
            }
            this.field970 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field970[var5] = arg0.method2550();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field970[var6] += arg0.method2550() << 16;
            }
        } else if (arg1 == 2) {
            this.field974 = arg0.method2550();
        } else if (arg1 == 3) {
            int var7 = arg0.method2363();
            this.field972 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field972[var8] = arg0.method2363();
            }
            this.field972[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field976 = true;
        } else if (arg1 == 5) {
            this.field971 = arg0.method2363();
        } else if (arg1 == 6) {
            this.field978 = arg0.method2550();
        } else if (arg1 == 7) {
            this.field979 = arg0.method2550();
        } else if (arg1 == 8) {
            this.field980 = arg0.method2363();
        } else if (arg1 == 9) {
            this.field968 = arg0.method2363();
        } else if (arg1 == 10) {
            this.field981 = arg0.method2363();
        } else if (arg1 == 11) {
            this.field983 = arg0.method2363();
        } else if (arg1 == 12) {
            int var9 = arg0.method2363();
            this.field975 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field975[var10] = arg0.method2550();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field975[var11] += arg0.method2550() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2363();
            this.field977 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field977[var13] = arg0.method2367();
            }
        }
    }

    @ObfuscatedName("ay.p(I)V")
    public void method865() {
        if (this.field968 == -1) {
            if (this.field972 == null) {
                this.field968 = 0;
            } else {
                this.field968 = 2;
            }
        }
        if (this.field981 != -1) {
            return;
        }
        if (this.field972 == null) {
            this.field981 = 0;
        } else {
            this.field981 = 2;
        }
    }

    @ObfuscatedName("ay.g(Lde;IB)Lde;")
    public class109 method893(class109 arg0, int arg1) {
        int var3 = this.field970[arg1];
        class107 var4 = method164(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2166(true);
        } else {
            class109 var6 = arg0.method2166(!var4.method2155(var5));
            var6.method2182(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ay.m(Lde;III)Lde;")
    public class109 method867(class109 arg0, int arg1, int arg2) {
        int var4 = this.field970[arg1];
        class107 var5 = method164(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2166(true);
        }
        class109 var7 = arg0.method2166(!var5.method2155(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2177();
        } else if (var8 == 2) {
            var7.method2176();
        } else if (var8 == 3) {
            var7.method2217();
        }
        var7.method2182(var5, var6);
        if (var8 == 1) {
            var7.method2217();
        } else if (var8 == 2) {
            var7.method2176();
        } else if (var8 == 3) {
            var7.method2177();
        }
        return var7;
    }

    @ObfuscatedName("ay.f(Lde;IB)Lde;")
    public class109 method868(class109 arg0, int arg1) {
        int var3 = this.field970[arg1];
        class107 var4 = method164(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2187(true);
        } else {
            class109 var6 = arg0.method2187(!var4.method2155(var5));
            var6.method2182(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ay.k(Lde;ILay;II)Lde;")
    public class109 method869(class109 arg0, int arg1, class45 arg2, int arg3) {
        int var5 = this.field970[arg1];
        class107 var6 = method164(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method893(arg0, arg3);
        }
        int var8 = arg2.field970[arg3];
        class107 var9 = method164(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class109 var11 = arg0.method2166(!var6.method2155(var7));
            var11.method2182(var6, var7);
            return var11;
        } else {
            class109 var12 = arg0.method2166(!var6.method2155(var7) & !var9.method2155(var10));
            var12.method2211(var6, var7, var9, var10, this.field972);
            return var12;
        }
    }

    @ObfuscatedName("ay.h(Lde;II)Lde;")
    public class109 method864(class109 arg0, int arg1) {
        int var3 = this.field970[arg1];
        class107 var4 = method164(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2166(true);
        }
        class107 var6 = null;
        int var7 = 0;
        if (this.field975 != null && arg1 < this.field975.length) {
            int var8 = this.field975[arg1];
            var6 = method164(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class109 var10 = arg0.method2166(!var4.method2155(var5));
            var10.method2182(var4, var5);
            return var10;
        } else {
            class109 var9 = arg0.method2166(!var4.method2155(var5) & !var6.method2155(var7));
            var9.method2182(var4, var5);
            var9.method2182(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("n.r(II)Ldo;")
    public static class107 method164(int arg0) {
        class107 var1 = (class107) field969.method3523((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class107 var2 = class107.method2054(Statics.field1608, Statics.field967, arg0, false);
        if (var2 != null) {
            field969.method3521(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("ay.w(I)V")
    public static void method895() {
        field973.method3522();
        field969.method3522();
    }
}
