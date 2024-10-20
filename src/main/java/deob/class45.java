package deob;

@ObfuscatedName("ar")
public class class45 extends class208 {

    @ObfuscatedName("ar.h")
    public static class197 field1022 = new class197(64);

    @ObfuscatedName("ar.r")
    public static class197 field1023 = new class197(100);

    @ObfuscatedName("ar.a")
    public int[] field1024;

    @ObfuscatedName("ar.b")
    public int[] field1031;

    @ObfuscatedName("ar.u")
    public int[] field1026;

    @ObfuscatedName("ar.o")
    public int[] field1025;

    @ObfuscatedName("ar.p")
    public int field1028 = -1;

    @ObfuscatedName("ar.i")
    public int[] field1029;

    @ObfuscatedName("ar.q")
    public boolean field1030 = false;

    @ObfuscatedName("ar.g")
    public int field1039 = 5;

    @ObfuscatedName("ar.j")
    public int field1020 = -1;

    @ObfuscatedName("ar.w")
    public int field1033 = -1;

    @ObfuscatedName("ar.x")
    public int field1034 = 99;

    @ObfuscatedName("ar.f")
    public int field1035 = -1;

    @ObfuscatedName("ar.t")
    public int field1036 = -1;

    @ObfuscatedName("ar.z")
    public int field1037 = 2;

    @ObfuscatedName("ce.e(Lfe;Lfe;Lfe;I)V")
    public static void method2138(class171 arg0, class171 arg1, class171 arg2) {
        Statics.field1032 = arg0;
        Statics.field1021 = arg1;
        Statics.field1027 = arg2;
    }

    @ObfuscatedName("ar.c(Ldd;B)V")
    public void method920(class123 arg0) {
        while (true) {
            int var2 = arg0.method2464();
            if (var2 == 0) {
                return;
            }
            this.method885(arg0, var2);
        }
    }

    @ObfuscatedName("ar.h(Ldd;IB)V")
    public void method885(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2466();
            this.field1026 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field1026[var4] = arg0.method2466();
            }
            this.field1024 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field1024[var5] = arg0.method2466();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field1024[var6] += arg0.method2466() << 16;
            }
        } else if (arg1 == 2) {
            this.field1028 = arg0.method2466();
        } else if (arg1 == 3) {
            int var7 = arg0.method2464();
            this.field1029 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1029[var8] = arg0.method2464();
            }
            this.field1029[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field1030 = true;
        } else if (arg1 == 5) {
            this.field1039 = arg0.method2464();
        } else if (arg1 == 6) {
            this.field1020 = arg0.method2466();
        } else if (arg1 == 7) {
            this.field1033 = arg0.method2466();
        } else if (arg1 == 8) {
            this.field1034 = arg0.method2464();
        } else if (arg1 == 9) {
            this.field1035 = arg0.method2464();
        } else if (arg1 == 10) {
            this.field1036 = arg0.method2464();
        } else if (arg1 == 11) {
            this.field1037 = arg0.method2464();
        } else if (arg1 == 12) {
            int var9 = arg0.method2464();
            this.field1031 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1031[var10] = arg0.method2466();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field1031[var11] += arg0.method2466() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2464();
            this.field1025 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field1025[var13] = arg0.method2557();
            }
        }
    }

    @ObfuscatedName("ar.r(I)V")
    public void method886() {
        if (this.field1035 == -1) {
            if (this.field1029 == null) {
                this.field1035 = 0;
            } else {
                this.field1035 = 2;
            }
        }
        if (this.field1036 != -1) {
            return;
        }
        if (this.field1029 == null) {
            this.field1036 = 0;
        } else {
            this.field1036 = 2;
        }
    }

    @ObfuscatedName("ar.a(Lds;IS)Lds;")
    public class109 method887(class109 arg0, int arg1) {
        int var3 = this.field1024[arg1];
        class107 var4 = method1335(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2315(true);
        } else {
            class109 var6 = arg0.method2315(!var4.method2239(var5));
            var6.method2251(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.b(Lds;IIB)Lds;")
    public class109 method908(class109 arg0, int arg1, int arg2) {
        int var4 = this.field1024[arg1];
        class107 var5 = method1335(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2315(true);
        }
        class109 var7 = arg0.method2315(!var5.method2239(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2256();
        } else if (var8 == 2) {
            var7.method2255();
        } else if (var8 == 3) {
            var7.method2254();
        }
        var7.method2251(var5, var6);
        if (var8 == 1) {
            var7.method2254();
        } else if (var8 == 2) {
            var7.method2255();
        } else if (var8 == 3) {
            var7.method2256();
        }
        return var7;
    }

    @ObfuscatedName("ar.u(Lds;II)Lds;")
    public class109 method889(class109 arg0, int arg1) {
        int var3 = this.field1024[arg1];
        class107 var4 = method1335(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2310(true);
        } else {
            class109 var6 = arg0.method2310(!var4.method2239(var5));
            var6.method2251(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ar.o(Lds;ILar;II)Lds;")
    public class109 method900(class109 arg0, int arg1, class45 arg2, int arg3) {
        int var5 = this.field1024[arg1];
        class107 var6 = method1335(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method887(arg0, arg3);
        }
        int var8 = arg2.field1024[arg3];
        class107 var9 = method1335(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class109 var11 = arg0.method2315(!var6.method2239(var7));
            var11.method2251(var6, var7);
            return var11;
        } else {
            class109 var12 = arg0.method2315(!var6.method2239(var7) & !var9.method2239(var10));
            var12.method2252(var6, var7, var9, var10, this.field1029);
            return var12;
        }
    }

    @ObfuscatedName("ar.p(Lds;II)Lds;")
    public class109 method891(class109 arg0, int arg1) {
        int var3 = this.field1024[arg1];
        class107 var4 = method1335(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2315(true);
        }
        class107 var6 = null;
        int var7 = 0;
        if (this.field1031 != null && arg1 < this.field1031.length) {
            int var8 = this.field1031[arg1];
            var6 = method1335(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class109 var10 = arg0.method2315(!var4.method2239(var5));
            var10.method2251(var4, var5);
            return var10;
        } else {
            class109 var9 = arg0.method2315(!var4.method2239(var5) & !var6.method2239(var7));
            var9.method2251(var4, var5);
            var9.method2251(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bc.i(IB)Ldn;")
    public static class107 method1335(int arg0) {
        class107 var1 = (class107) field1023.method3589((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class171 var2 = Statics.field1021;
        class171 var3 = Statics.field1027;
        boolean var4 = true;
        int[] var5 = var2.method3136(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3188(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3188(var8, 0);
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
            field1023.method3591(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("es.q(B)V")
    public static void method2917() {
        field1022.method3590();
        field1023.method3590();
    }
}
