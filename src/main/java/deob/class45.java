package deob;

@ObfuscatedName("ai")
public class class45 extends class208 {

    @ObfuscatedName("ai.r")
    public static class197 field1012 = new class197(64);

    @ObfuscatedName("ai.z")
    public static class197 field1013 = new class197(100);

    @ObfuscatedName("ai.t")
    public int[] field1010;

    @ObfuscatedName("ai.n")
    public int[] field1029;

    @ObfuscatedName("ai.i")
    public int[] field1016;

    @ObfuscatedName("ai.g")
    public int[] field1017;

    @ObfuscatedName("ai.m")
    public int field1015 = -1;

    @ObfuscatedName("ai.k")
    public int[] field1011;

    @ObfuscatedName("ai.x")
    public boolean field1020 = false;

    @ObfuscatedName("ai.u")
    public int field1021 = 5;

    @ObfuscatedName("ai.j")
    public int field1022 = -1;

    @ObfuscatedName("ai.q")
    public int field1023 = -1;

    @ObfuscatedName("ai.w")
    public int field1019 = 99;

    @ObfuscatedName("ai.b")
    public int field1025 = -1;

    @ObfuscatedName("ai.p")
    public int field1018 = -1;

    @ObfuscatedName("ai.o")
    public int field1027 = 2;

    @ObfuscatedName("p.a(II)Lai;")
    public static class45 method185(int arg0) {
        class45 var1 = (class45) field1012.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3175.method3117(12, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method878(new class123(var2));
        }
        var3.method880();
        field1012.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.d(Ldb;B)V")
    public void method878(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method889(arg0, var2);
        }
    }

    @ObfuscatedName("ai.v(Ldb;II)V")
    public void method889(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2584();
            this.field1016 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1016[var4] = arg0.method2584();
            }
            this.field1010 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1010[var5] = arg0.method2584();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1010[var6] += arg0.method2584() << 16;
            }
        } else if (arg1 == 2) {
            this.field1015 = arg0.method2584();
        } else if (arg1 == 3) {
            int var7 = arg0.method2395();
            this.field1011 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1011[var8] = arg0.method2395();
            }
            this.field1011[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1020 = true;
        } else if (arg1 == 5) {
            this.field1021 = arg0.method2395();
        } else if (arg1 == 6) {
            this.field1022 = arg0.method2584();
        } else if (arg1 == 7) {
            this.field1023 = arg0.method2584();
        } else if (arg1 == 8) {
            this.field1019 = arg0.method2395();
        } else if (arg1 == 9) {
            this.field1025 = arg0.method2395();
        } else if (arg1 == 10) {
            this.field1018 = arg0.method2395();
        } else if (arg1 == 11) {
            this.field1027 = arg0.method2395();
        } else if (arg1 == 12) {
            int var9 = arg0.method2395();
            this.field1029 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1029[var10] = arg0.method2584();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1029[var11] += arg0.method2584() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2395();
            this.field1017 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1017[var13] = arg0.method2399();
            }
        }
    }

    @ObfuscatedName("ai.r(B)V")
    public void method880() {
        if (this.field1025 == -1) {
            if (this.field1011 == null) {
                this.field1025 = 0;
            } else {
                this.field1025 = 2;
            }
        }
        if (this.field1018 != -1) {
            return;
        }
        if (this.field1011 == null) {
            this.field1018 = 0;
        } else {
            this.field1018 = 2;
        }
    }

    @ObfuscatedName("ai.z(Ldp;II)Ldp;")
    public class109 method881(class109 arg0, int arg1) {
        int var3 = this.field1010[arg1];
        class107 var4 = method675(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2231(true);
        } else {
            class109 var6 = arg0.method2231(!var4.method2181(var5));
            var6.method2200(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ai.t(Ldp;III)Ldp;")
    public class109 method882(class109 arg0, int arg1, int arg2) {
        int var4 = this.field1010[arg1];
        class107 var5 = method675(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2231(true);
        }
        class109 var7 = arg0.method2231(!var5.method2181(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2207();
        } else if (var8 == 2) {
            var7.method2206();
        } else if (var8 == 3) {
            var7.method2205();
        }
        var7.method2200(var5, var6);
        if (var8 == 1) {
            var7.method2205();
        } else if (var8 == 2) {
            var7.method2206();
        } else if (var8 == 3) {
            var7.method2207();
        }
        return var7;
    }

    @ObfuscatedName("ai.n(Ldp;IB)Ldp;")
    public class109 method891(class109 arg0, int arg1) {
        int var3 = this.field1010[arg1];
        class107 var4 = method675(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2226(true);
        } else {
            class109 var6 = arg0.method2226(!var4.method2181(var5));
            var6.method2200(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ai.i(Ldp;ILai;II)Ldp;")
    public class109 method884(class109 arg0, int arg1, class45 arg2, int arg3) {
        int var5 = this.field1010[arg1];
        class107 var6 = method675(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method881(arg0, arg3);
        }
        int var8 = arg2.field1010[arg3];
        class107 var9 = method675(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class109 var11 = arg0.method2231(!var6.method2181(var7));
            var11.method2200(var6, var7);
            return var11;
        } else {
            class109 var12 = arg0.method2231(!var6.method2181(var7) & !var9.method2181(var10));
            var12.method2203(var6, var7, var9, var10, this.field1011);
            return var12;
        }
    }

    @ObfuscatedName("ai.g(Ldp;IB)Ldp;")
    public class109 method888(class109 arg0, int arg1) {
        int var3 = this.field1010[arg1];
        class107 var4 = method675(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2231(true);
        }
        class107 var6 = null;
        int var7 = 0;
        if (this.field1029 != null && arg1 < this.field1029.length) {
            int var8 = this.field1029[arg1];
            var6 = method675(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class109 var10 = arg0.method2231(!var4.method2181(var5));
            var10.method2200(var4, var5);
            return var10;
        } else {
            class109 var9 = arg0.method2231(!var4.method2181(var5) & !var6.method2181(var7));
            var9.method2200(var4, var5);
            var9.method2200(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ap.m(II)Ldm;")
    public static class107 method675(int arg0) {
        class107 var1 = (class107) field1013.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class107 var2 = class107.method702(Statics.field1024, Statics.field1026, arg0, false);
        if (var2 != null) {
            field1013.method3546(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("d.k(I)V")
    public static void method12() {
        field1012.method3552();
        field1013.method3552();
    }
}
