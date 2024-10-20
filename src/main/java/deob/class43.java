package deob;

@ObfuscatedName("au")
public class class43 extends class205 {

    @ObfuscatedName("au.d")
    public static class194 field973 = new class194(64);

    @ObfuscatedName("au.x")
    public static class194 field962 = new class194(100);

    @ObfuscatedName("au.y")
    public int[] field966;

    @ObfuscatedName("au.r")
    public int[] field968;

    @ObfuscatedName("au.c")
    public int[] field984;

    @ObfuscatedName("au.l")
    public int[] field971;

    @ObfuscatedName("au.u")
    public int field967 = -1;

    @ObfuscatedName("au.p")
    public int[] field972;

    @ObfuscatedName("au.n")
    public boolean field965 = false;

    @ObfuscatedName("au.w")
    public int field974 = 5;

    @ObfuscatedName("au.z")
    public int field975 = -1;

    @ObfuscatedName("au.k")
    public int field976 = -1;

    @ObfuscatedName("au.o")
    public int field977 = 99;

    @ObfuscatedName("au.t")
    public int field978 = -1;

    @ObfuscatedName("au.h")
    public int field979 = -1;

    @ObfuscatedName("au.v")
    public int field980 = 2;

    @ObfuscatedName("h.b(II)Lau;")
    public static class43 method175(int arg0) {
        class43 var1 = (class43) field973.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field970.method3037(12, arg0);
        class43 var3 = new class43();
        if (var2 != null) {
            var3.method851(new class120(var2));
        }
        var3.method849();
        field973.method3490(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.g(Lds;B)V")
    public void method851(class120 arg0) {
        while (true) {
            int var2 = arg0.method2344();
            if (var2 == 0) {
                return;
            }
            this.method884(arg0, var2);
        }
    }

    @ObfuscatedName("au.j(Lds;II)V")
    public void method884(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2346();
            this.field984 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field984[var4] = arg0.method2346();
            }
            this.field966 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field966[var5] = arg0.method2346();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field966[var6] += arg0.method2346() << 16;
            }
        } else if (arg1 == 2) {
            this.field967 = arg0.method2346();
        } else if (arg1 == 3) {
            int var7 = arg0.method2344();
            this.field972 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field972[var8] = arg0.method2344();
            }
            this.field972[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field965 = true;
        } else if (arg1 == 5) {
            this.field974 = arg0.method2344();
        } else if (arg1 == 6) {
            this.field975 = arg0.method2346();
        } else if (arg1 == 7) {
            this.field976 = arg0.method2346();
        } else if (arg1 == 8) {
            this.field977 = arg0.method2344();
        } else if (arg1 == 9) {
            this.field978 = arg0.method2344();
        } else if (arg1 == 10) {
            this.field979 = arg0.method2344();
        } else if (arg1 == 11) {
            this.field980 = arg0.method2344();
        } else if (arg1 == 12) {
            int var9 = arg0.method2344();
            this.field968 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field968[var10] = arg0.method2346();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field968[var11] += arg0.method2346() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2344();
            this.field971 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field971[var13] = arg0.method2348();
            }
        }
    }

    @ObfuscatedName("au.d(I)V")
    public void method849() {
        if (this.field978 == -1) {
            if (this.field972 == null) {
                this.field978 = 0;
            } else {
                this.field978 = 2;
            }
        }
        if (this.field979 != -1) {
            return;
        }
        if (this.field972 == null) {
            this.field979 = 0;
        } else {
            this.field979 = 2;
        }
    }

    @ObfuscatedName("au.x(Ldd;IB)Ldd;")
    public class106 method875(class106 arg0, int arg1) {
        int var3 = this.field966[arg1];
        class104 var4 = method699(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2139(true);
        } else {
            class106 var6 = arg0.method2139(!var4.method2133(var5));
            var6.method2145(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("au.y(Ldd;III)Ldd;")
    public class106 method848(class106 arg0, int arg1, int arg2) {
        int var4 = this.field966[arg1];
        class104 var5 = method699(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2139(true);
        }
        class106 var7 = arg0.method2139(!var5.method2133(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2200();
        } else if (var8 == 2) {
            var7.method2149();
        } else if (var8 == 3) {
            var7.method2148();
        }
        var7.method2145(var5, var6);
        if (var8 == 1) {
            var7.method2148();
        } else if (var8 == 2) {
            var7.method2149();
        } else if (var8 == 3) {
            var7.method2200();
        }
        return var7;
    }

    @ObfuscatedName("au.r(Ldd;IB)Ldd;")
    public class106 method852(class106 arg0, int arg1) {
        int var3 = this.field966[arg1];
        class104 var4 = method699(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2140(true);
        } else {
            class106 var6 = arg0.method2140(!var4.method2133(var5));
            var6.method2145(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("au.c(Ldd;ILau;IB)Ldd;")
    public class106 method853(class106 arg0, int arg1, class43 arg2, int arg3) {
        int var5 = this.field966[arg1];
        class104 var6 = method699(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method875(arg0, arg3);
        }
        int var8 = arg2.field966[arg3];
        class104 var9 = method699(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class106 var11 = arg0.method2139(!var6.method2133(var7));
            var11.method2145(var6, var7);
            return var11;
        } else {
            class106 var12 = arg0.method2139(!var6.method2133(var7) & !var9.method2133(var10));
            var12.method2168(var6, var7, var9, var10, this.field972);
            return var12;
        }
    }

    @ObfuscatedName("au.l(Ldd;IB)Ldd;")
    public class106 method854(class106 arg0, int arg1) {
        int var3 = this.field966[arg1];
        class104 var4 = method699(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2139(true);
        }
        class104 var6 = null;
        int var7 = 0;
        if (this.field968 != null && arg1 < this.field968.length) {
            int var8 = this.field968[arg1];
            var6 = method699(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class106 var10 = arg0.method2139(!var4.method2133(var5));
            var10.method2145(var4, var5);
            return var10;
        } else {
            class106 var9 = arg0.method2139(!var4.method2133(var5) & !var6.method2133(var7));
            var9.method2145(var4, var5);
            var9.method2145(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ah.u(IB)Lco;")
    public static class104 method699(int arg0) {
        class104 var1 = (class104) field962.method3495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class168 var2 = Statics.field963;
        class168 var3 = Statics.field964;
        boolean var4 = true;
        int[] var5 = var2.method3078(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3069(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3069(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class104 var10;
        if (var4) {
            try {
                var10 = new class104(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field962.method3490(var10, (long) arg0);
        }
        return var10;
    }
}
