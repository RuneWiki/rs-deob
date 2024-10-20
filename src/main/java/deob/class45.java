package deob;

@ObfuscatedName("aa")
public class class45 extends class208 {

    @ObfuscatedName("aa.g")
    public static class197 field1016 = new class197(64);

    @ObfuscatedName("aa.n")
    public static class197 field1014 = new class197(100);

    @ObfuscatedName("aa.u")
    public int[] field1012;

    @ObfuscatedName("aa.d")
    public int[] field1019;

    @ObfuscatedName("aa.l")
    public int[] field1020;

    @ObfuscatedName("aa.m")
    public int[] field1025;

    @ObfuscatedName("aa.j")
    public int field1013 = -1;

    @ObfuscatedName("aa.y")
    public int[] field1010;

    @ObfuscatedName("aa.s")
    public boolean field1018 = false;

    @ObfuscatedName("aa.p")
    public int field1015 = 5;

    @ObfuscatedName("aa.v")
    public int field1023 = -1;

    @ObfuscatedName("aa.r")
    public int field1021 = -1;

    @ObfuscatedName("aa.c")
    public int field1022 = 99;

    @ObfuscatedName("aa.w")
    public int field1017 = -1;

    @ObfuscatedName("aa.x")
    public int field1024 = -1;

    @ObfuscatedName("aa.k")
    public int field1007 = 2;

    @ObfuscatedName("gd.i(II)Laa;")
    public static class45 method3523(int arg0) {
        class45 var1 = (class45) field1016.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1011.method3086(12, arg0);
        class45 var3 = new class45();
        if (var2 != null) {
            var3.method896(new class123(var2));
        }
        var3.method865();
        field1016.method3532(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.h(Ldn;B)V")
    public void method896(class123 arg0) {
        while (true) {
            int var2 = arg0.method2404();
            if (var2 == 0) {
                return;
            }
            this.method897(arg0, var2);
        }
    }

    @ObfuscatedName("aa.e(Ldn;II)V")
    public void method897(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2406();
            this.field1020 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1020[var4] = arg0.method2406();
            }
            this.field1012 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1012[var5] = arg0.method2406();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1012[var6] += arg0.method2406() << 16;
            }
        } else if (arg1 == 2) {
            this.field1013 = arg0.method2406();
        } else if (arg1 == 3) {
            int var7 = arg0.method2404();
            this.field1010 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1010[var8] = arg0.method2404();
            }
            this.field1010[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1018 = true;
        } else if (arg1 == 5) {
            this.field1015 = arg0.method2404();
        } else if (arg1 == 6) {
            this.field1023 = arg0.method2406();
        } else if (arg1 == 7) {
            this.field1021 = arg0.method2406();
        } else if (arg1 == 8) {
            this.field1022 = arg0.method2404();
        } else if (arg1 == 9) {
            this.field1017 = arg0.method2404();
        } else if (arg1 == 10) {
            this.field1024 = arg0.method2404();
        } else if (arg1 == 11) {
            this.field1007 = arg0.method2404();
        } else if (arg1 == 12) {
            int var9 = arg0.method2404();
            this.field1019 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1019[var10] = arg0.method2406();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1019[var11] += arg0.method2406() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2404();
            this.field1025 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1025[var13] = arg0.method2408();
            }
        }
    }

    @ObfuscatedName("aa.g(B)V")
    public void method865() {
        if (this.field1017 == -1) {
            if (this.field1010 == null) {
                this.field1017 = 0;
            } else {
                this.field1017 = 2;
            }
        }
        if (this.field1024 != -1) {
            return;
        }
        if (this.field1010 == null) {
            this.field1024 = 0;
        } else {
            this.field1024 = 2;
        }
    }

    @ObfuscatedName("aa.n(Ldo;II)Ldo;")
    public class109 method866(class109 arg0, int arg1) {
        int var3 = this.field1012[arg1];
        class107 var4 = method101(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2227(true);
        } else {
            class109 var6 = arg0.method2227(!var4.method2193(var5));
            var6.method2207(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.u(Ldo;III)Ldo;")
    public class109 method867(class109 arg0, int arg1, int arg2) {
        int var4 = this.field1012[arg1];
        class107 var5 = method101(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2227(true);
        }
        class109 var7 = arg0.method2227(!var5.method2193(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2212();
        } else if (var8 == 2) {
            var7.method2230();
        } else if (var8 == 3) {
            var7.method2210();
        }
        var7.method2207(var5, var6);
        if (var8 == 1) {
            var7.method2210();
        } else if (var8 == 2) {
            var7.method2230();
        } else if (var8 == 3) {
            var7.method2212();
        }
        return var7;
    }

    @ObfuscatedName("aa.d(Ldo;II)Ldo;")
    public class109 method882(class109 arg0, int arg1) {
        int var3 = this.field1012[arg1];
        class107 var4 = method101(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2252(true);
        } else {
            class109 var6 = arg0.method2252(!var4.method2193(var5));
            var6.method2207(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aa.l(Ldo;ILaa;II)Ldo;")
    public class109 method887(class109 arg0, int arg1, class45 arg2, int arg3) {
        int var5 = this.field1012[arg1];
        class107 var6 = method101(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method866(arg0, arg3);
        }
        int var8 = arg2.field1012[arg3];
        class107 var9 = method101(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class109 var11 = arg0.method2227(!var6.method2193(var7));
            var11.method2207(var6, var7);
            return var11;
        } else {
            class109 var12 = arg0.method2227(!var6.method2193(var7) & !var9.method2193(var10));
            var12.method2208(var6, var7, var9, var10, this.field1010);
            return var12;
        }
    }

    @ObfuscatedName("aa.m(Ldo;II)Ldo;")
    public class109 method870(class109 arg0, int arg1) {
        int var3 = this.field1012[arg1];
        class107 var4 = method101(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2227(true);
        }
        class107 var6 = null;
        int var7 = 0;
        if (this.field1019 != null && arg1 < this.field1019.length) {
            int var8 = this.field1019[arg1];
            var6 = method101(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class109 var10 = arg0.method2227(!var4.method2193(var5));
            var10.method2207(var4, var5);
            return var10;
        } else {
            class109 var9 = arg0.method2227(!var4.method2193(var5) & !var6.method2193(var7));
            var9.method2207(var4, var5);
            var9.method2207(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("m.j(II)Ldd;")
    public static class107 method101(int arg0) {
        class107 var1 = (class107) field1014.method3541((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class171 var2 = Statics.field1008;
        class171 var3 = Statics.field1009;
        boolean var4 = true;
        int[] var5 = var2.method3092(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3089(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3089(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class107 var10;
        if (var4) {
            try {
                var10 = new class107(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field1014.method3532(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("an.y(I)V")
    public static void method658() {
        field1016.method3533();
        field1014.method3533();
    }
}
