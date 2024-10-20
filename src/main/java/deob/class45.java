package deob;

@ObfuscatedName("at")
public class class45 extends class208 {

    @ObfuscatedName("at.e")
    public static class197 field1015 = new class197(64);

    @ObfuscatedName("at.h")
    public static class197 field1016 = new class197(100);

    @ObfuscatedName("at.s")
    public int[] field1031;

    @ObfuscatedName("at.k")
    public int[] field1018;

    @ObfuscatedName("at.u")
    public int[] field1019;

    @ObfuscatedName("at.n")
    public int[] field1017;

    @ObfuscatedName("at.b")
    public int field1021 = -1;

    @ObfuscatedName("at.m")
    public int[] field1022;

    @ObfuscatedName("at.q")
    public boolean field1033 = false;

    @ObfuscatedName("at.p")
    public int field1024 = 5;

    @ObfuscatedName("at.w")
    public int field1025 = -1;

    @ObfuscatedName("at.o")
    public int field1026 = -1;

    @ObfuscatedName("at.d")
    public int field1012 = 99;

    @ObfuscatedName("at.f")
    public int field1028 = -1;

    @ObfuscatedName("at.z")
    public int field1029 = -1;

    @ObfuscatedName("at.i")
    public int field1032 = 2;

    @ObfuscatedName("t.l(IB)Lat;")
    public static class45 method578(int arg0) {
        class45 var1 = (class45) field1015.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1014.method3210(12, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method883(new class123(var2));
        }
        var3.method885();
        field1015.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("at.g(Ldc;I)V")
    public void method883(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method919(arg0, var2);
        }
    }

    @ObfuscatedName("at.r(Ldc;IB)V")
    public void method919(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2492();
            this.field1019 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1019[var4] = arg0.method2492();
            }
            this.field1031 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1031[var5] = arg0.method2492();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1031[var6] += arg0.method2492() << 16;
            }
        } else if (arg1 == 2) {
            this.field1021 = arg0.method2492();
        } else if (arg1 == 3) {
            int var7 = arg0.method2490();
            this.field1022 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1022[var8] = arg0.method2490();
            }
            this.field1022[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1033 = true;
        } else if (arg1 == 5) {
            this.field1024 = arg0.method2490();
        } else if (arg1 == 6) {
            this.field1025 = arg0.method2492();
        } else if (arg1 == 7) {
            this.field1026 = arg0.method2492();
        } else if (arg1 == 8) {
            this.field1012 = arg0.method2490();
        } else if (arg1 == 9) {
            this.field1028 = arg0.method2490();
        } else if (arg1 == 10) {
            this.field1029 = arg0.method2490();
        } else if (arg1 == 11) {
            this.field1032 = arg0.method2490();
        } else if (arg1 == 12) {
            int var9 = arg0.method2490();
            this.field1018 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1018[var10] = arg0.method2492();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1018[var11] += arg0.method2492() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2490();
            this.field1017 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1017[var13] = arg0.method2494();
            }
        }
    }

    @ObfuscatedName("at.e(I)V")
    public void method885() {
        if (this.field1028 == -1) {
            if (this.field1022 == null) {
                this.field1028 = 0;
            } else {
                this.field1028 = 2;
            }
        }
        if (this.field1029 != -1) {
            return;
        }
        if (this.field1022 == null) {
            this.field1029 = 0;
        } else {
            this.field1029 = 2;
        }
    }

    @ObfuscatedName("at.h(Ldv;II)Ldv;")
    public class109 method918(class109 arg0, int arg1) {
        int var3 = this.field1031[arg1];
        class107 var4 = method3424(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2267(true);
        } else {
            class109 var6 = arg0.method2267(!var4.method2254(var5));
            var6.method2273(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("at.s(Ldv;IIB)Ldv;")
    public class109 method887(class109 arg0, int arg1, int arg2) {
        int var4 = this.field1031[arg1];
        class107 var5 = method3424(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2267(true);
        }
        class109 var7 = arg0.method2267(!var5.method2254(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2278();
        } else if (var8 == 2) {
            var7.method2288();
        } else if (var8 == 3) {
            var7.method2320();
        }
        var7.method2273(var5, var6);
        if (var8 == 1) {
            var7.method2320();
        } else if (var8 == 2) {
            var7.method2288();
        } else if (var8 == 3) {
            var7.method2278();
        }
        return var7;
    }

    @ObfuscatedName("at.k(Ldv;II)Ldv;")
    public class109 method882(class109 arg0, int arg1) {
        int var3 = this.field1031[arg1];
        class107 var4 = method3424(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2268(true);
        } else {
            class109 var6 = arg0.method2268(!var4.method2254(var5));
            var6.method2273(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("at.u(Ldv;ILat;II)Ldv;")
    public class109 method889(class109 arg0, int arg1, class45 arg2, int arg3) {
        int var5 = this.field1031[arg1];
        class107 var6 = method3424(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method918(arg0, arg3);
        }
        int var8 = arg2.field1031[arg3];
        class107 var9 = method3424(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class109 var11 = arg0.method2267(!var6.method2254(var7));
            var11.method2273(var6, var7);
            return var11;
        } else {
            class109 var12 = arg0.method2267(!var6.method2254(var7) & !var9.method2254(var10));
            var12.method2276(var6, var7, var9, var10, this.field1022);
            return var12;
        }
    }

    @ObfuscatedName("at.n(Ldv;II)Ldv;")
    public class109 method890(class109 arg0, int arg1) {
        int var3 = this.field1031[arg1];
        class107 var4 = method3424(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2267(true);
        }
        class107 var6 = null;
        int var7 = 0;
        if (this.field1018 != null && arg1 < this.field1018.length) {
            int var8 = this.field1018[arg1];
            var6 = method3424(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class109 var10 = arg0.method2267(!var4.method2254(var5));
            var10.method2273(var4, var5);
            return var10;
        } else {
            class109 var9 = arg0.method2267(!var4.method2254(var5) & !var6.method2254(var7));
            var9.method2273(var4, var5);
            var9.method2273(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fj.b(II)Ldl;")
    public static class107 method3424(int arg0) {
        class107 var1 = (class107) field1016.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class107 var2 = class107.method2142(Statics.field1013, Statics.field1020, arg0, false);
        if (var2 != null) {
            field1016.method3655(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("z.m(B)V")
    public static void method202() {
        field1015.method3658();
        field1016.method3658();
    }
}
