package deob;

@ObfuscatedName("az")
public class class38 extends class182 {

    @ObfuscatedName("az.e")
    public static class171 field905 = new class171(64);

    @ObfuscatedName("az.d")
    public static class171 field893 = new class171(100);

    @ObfuscatedName("az.n")
    public int[] field894;

    @ObfuscatedName("az.v")
    public int[] field907;

    @ObfuscatedName("az.z")
    public int[] field896;

    @ObfuscatedName("az.j")
    public int[] field897;

    @ObfuscatedName("az.u")
    public int field898 = -1;

    @ObfuscatedName("az.g")
    public int[] field899;

    @ObfuscatedName("az.a")
    public boolean field900 = false;

    @ObfuscatedName("az.c")
    public int field901 = 5;

    @ObfuscatedName("az.w")
    public int field902 = -1;

    @ObfuscatedName("az.l")
    public int field903 = -1;

    @ObfuscatedName("az.q")
    public int field891 = 99;

    @ObfuscatedName("az.x")
    public int field890 = -1;

    @ObfuscatedName("az.p")
    public int field906 = -1;

    @ObfuscatedName("az.y")
    public int field889 = 2;

    @ObfuscatedName("a.t(Leg;Leg;Leg;B)V")
    public static void method136(class146 arg0, class146 arg1, class146 arg2) {
        Statics.field892 = arg0;
        Statics.field904 = arg1;
        Statics.field895 = arg2;
    }

    @ObfuscatedName("az.f(Ldb;I)V")
    public void method689(class107 arg0) {
        while (true) {
            int var2 = arg0.method2101();
            if (var2 == 0) {
                return;
            }
            this.method690(arg0, var2);
        }
    }

    @ObfuscatedName("az.e(Ldb;IB)V")
    public void method690(class107 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2103();
            this.field896 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field896[var4] = arg0.method2103();
            }
            this.field894 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field894[var5] = arg0.method2103();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field894[var6] += arg0.method2103() << 16;
            }
        } else if (arg1 == 2) {
            this.field898 = arg0.method2103();
        } else if (arg1 == 3) {
            int var7 = arg0.method2101();
            this.field899 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field899[var8] = arg0.method2101();
            }
            this.field899[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field900 = true;
        } else if (arg1 == 5) {
            this.field901 = arg0.method2101();
        } else if (arg1 == 6) {
            this.field902 = arg0.method2103();
        } else if (arg1 == 7) {
            this.field903 = arg0.method2103();
        } else if (arg1 == 8) {
            this.field891 = arg0.method2101();
        } else if (arg1 == 9) {
            this.field890 = arg0.method2101();
        } else if (arg1 == 10) {
            this.field906 = arg0.method2101();
        } else if (arg1 == 11) {
            this.field889 = arg0.method2101();
        } else if (arg1 == 12) {
            int var9 = arg0.method2101();
            this.field907 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field907[var10] = arg0.method2103();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field907[var11] += arg0.method2103() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2101();
            this.field897 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field897[var13] = arg0.method2304();
            }
        }
    }

    @ObfuscatedName("az.d(B)V")
    public void method692() {
        if (this.field890 == -1) {
            if (this.field899 == null) {
                this.field890 = 0;
            } else {
                this.field890 = 2;
            }
        }
        if (this.field906 != -1) {
            return;
        }
        if (this.field899 == null) {
            this.field906 = 0;
        } else {
            this.field906 = 2;
        }
    }

    @ObfuscatedName("az.n(Lcc;II)Lcc;")
    public class98 method703(class98 arg0, int arg1) {
        int var3 = this.field894[arg1];
        class96 var4 = method446(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1975(true);
        } else {
            class98 var6 = arg0.method1975(!var4.method1939(var5));
            var6.method2003(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.v(Lcc;III)Lcc;")
    public class98 method693(class98 arg0, int arg1, int arg2) {
        int var4 = this.field894[arg1];
        class96 var5 = method446(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1975(true);
        }
        class98 var7 = arg0.method1975(!var5.method1939(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method1954();
        } else if (var8 == 2) {
            var7.method1953();
        } else if (var8 == 3) {
            var7.method1967();
        }
        var7.method2003(var5, var6);
        if (var8 == 1) {
            var7.method1967();
        } else if (var8 == 2) {
            var7.method1953();
        } else if (var8 == 3) {
            var7.method1954();
        }
        return var7;
    }

    @ObfuscatedName("az.z(Lcc;IB)Lcc;")
    public class98 method708(class98 arg0, int arg1) {
        int var3 = this.field894[arg1];
        class96 var4 = method446(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1955(true);
        } else {
            class98 var6 = arg0.method1955(!var4.method1939(var5));
            var6.method2003(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("az.j(Lcc;ILaz;II)Lcc;")
    public class98 method695(class98 arg0, int arg1, class38 arg2, int arg3) {
        int var5 = this.field894[arg1];
        class96 var6 = method446(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method703(arg0, arg3);
        }
        int var8 = arg2.field894[arg3];
        class96 var9 = method446(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class98 var11 = arg0.method1975(!var6.method1939(var7));
            var11.method2003(var6, var7);
            return var11;
        } else {
            class98 var12 = arg0.method1975(!var6.method1939(var7) & !var9.method1939(var10));
            var12.method1950(var6, var7, var9, var10, this.field899);
            return var12;
        }
    }

    @ObfuscatedName("az.u(Lcc;II)Lcc;")
    public class98 method696(class98 arg0, int arg1) {
        int var3 = this.field894[arg1];
        class96 var4 = method446(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1975(true);
        }
        class96 var6 = null;
        int var7 = 0;
        if (this.field907 != null && arg1 < this.field907.length) {
            int var8 = this.field907[arg1];
            var6 = method446(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class98 var10 = arg0.method1975(!var4.method1939(var5));
            var10.method2003(var4, var5);
            return var10;
        } else {
            class98 var9 = arg0.method1975(!var4.method1939(var5) & !var6.method1939(var7));
            var9.method2003(var4, var5);
            var9.method2003(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("client.g(IB)Lcf;")
    public static class96 method446(int arg0) {
        class96 var1 = (class96) field893.method3170((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class146 var2 = Statics.field904;
        class146 var3 = Statics.field895;
        boolean var4 = true;
        int[] var5 = var2.method2786(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method2715(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method2715(var8, 0);
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
            field893.method3168(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ab.a(I)V")
    public static void method552() {
        field905.method3171();
        field893.method3171();
    }
}
