package deob;

@ObfuscatedName("ak")
public class class34 extends class174 {

    @ObfuscatedName("ak.z")
    public static class170 field892 = new class170(64);

    @ObfuscatedName("ak.m")
    public static class170 field880 = new class170(100);

    @ObfuscatedName("ak.k")
    public int[] field881;

    @ObfuscatedName("ak.v")
    public int[] field876;

    @ObfuscatedName("ak.y")
    public int[] field889;

    @ObfuscatedName("ak.d")
    public int[] field884;

    @ObfuscatedName("ak.l")
    public int field885 = -1;

    @ObfuscatedName("ak.h")
    public int[] field886;

    @ObfuscatedName("ak.b")
    public boolean field887 = false;

    @ObfuscatedName("ak.r")
    public int field888 = 5;

    @ObfuscatedName("ak.t")
    public int field890 = -1;

    @ObfuscatedName("ak.u")
    public int field879 = -1;

    @ObfuscatedName("ak.g")
    public int field891 = 99;

    @ObfuscatedName("ak.e")
    public int field877 = -1;

    @ObfuscatedName("ak.n")
    public int field893 = -1;

    @ObfuscatedName("ak.o")
    public int field894 = 2;

    @ObfuscatedName("ds.q(IB)Lak;")
    public static class34 method2178(int arg0) {
        class34 var1 = (class34) field892.method3215((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field898.method2952(12, arg0);
        class34 var3 = new class34();
        if (var2 != null) {
            var3.method707(new class127(var2));
        }
        var3.method722();
        field892.method3225(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ak.c(Ldo;I)V")
    public void method707(class127 arg0) {
        while (true) {
            int var2 = arg0.method2534();
            if (var2 == 0) {
                return;
            }
            this.method706(arg0, var2);
        }
    }

    @ObfuscatedName("ak.p(Ldo;II)V")
    public void method706(class127 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2427();
            this.field889 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field889[var4] = arg0.method2427();
            }
            this.field881 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field881[var5] = arg0.method2427();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field881[var6] += arg0.method2427() << 16;
            }
        } else if (arg1 == 2) {
            this.field885 = arg0.method2427();
        } else if (arg1 == 3) {
            int var7 = arg0.method2534();
            this.field886 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field886[var8] = arg0.method2534();
            }
            this.field886[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field887 = true;
        } else if (arg1 == 5) {
            this.field888 = arg0.method2534();
        } else if (arg1 == 6) {
            this.field890 = arg0.method2427();
        } else if (arg1 == 7) {
            this.field879 = arg0.method2427();
        } else if (arg1 == 8) {
            this.field891 = arg0.method2534();
        } else if (arg1 == 9) {
            this.field877 = arg0.method2534();
        } else if (arg1 == 10) {
            this.field893 = arg0.method2534();
        } else if (arg1 == 11) {
            this.field894 = arg0.method2534();
        } else if (arg1 == 12) {
            int var9 = arg0.method2534();
            this.field876 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field876[var10] = arg0.method2427();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field876[var11] += arg0.method2427() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2534();
            this.field884 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field884[var13] = arg0.method2429();
            }
        }
    }

    @ObfuscatedName("ak.z(B)V")
    public void method722() {
        if (this.field877 == -1) {
            if (this.field886 == null) {
                this.field877 = 0;
            } else {
                this.field877 = 2;
            }
        }
        if (this.field893 != -1) {
            return;
        }
        if (this.field886 == null) {
            this.field893 = 0;
        } else {
            this.field893 = 2;
        }
    }

    @ObfuscatedName("ak.m(Ldn;II)Ldn;")
    public class112 method710(class112 arg0, int arg1) {
        int var3 = this.field881[arg1];
        class109 var4 = method101(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2210(true);
        } else {
            class112 var6 = arg0.method2210(!var4.method2184(var5));
            var6.method2278(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.k(Ldn;III)Ldn;")
    public class112 method732(class112 arg0, int arg1, int arg2) {
        int var4 = this.field881[arg1];
        class109 var5 = method101(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2210(true);
        }
        class112 var7 = arg0.method2210(!var5.method2184(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2221();
        } else if (var8 == 2) {
            var7.method2220();
        } else if (var8 == 3) {
            var7.method2256();
        }
        var7.method2278(var5, var6);
        if (var8 == 1) {
            var7.method2256();
        } else if (var8 == 2) {
            var7.method2220();
        } else if (var8 == 3) {
            var7.method2221();
        }
        return var7;
    }

    @ObfuscatedName("ak.v(Ldn;II)Ldn;")
    public class112 method712(class112 arg0, int arg1) {
        int var3 = this.field881[arg1];
        class109 var4 = method101(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2211(true);
        } else {
            class112 var6 = arg0.method2211(!var4.method2184(var5));
            var6.method2278(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ak.y(Ldn;ILak;II)Ldn;")
    public class112 method713(class112 arg0, int arg1, class34 arg2, int arg3) {
        int var5 = this.field881[arg1];
        class109 var6 = method101(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method710(arg0, arg3);
        }
        int var8 = arg2.field881[arg3];
        class109 var9 = method101(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class112 var11 = arg0.method2210(!var6.method2184(var7));
            var11.method2278(var6, var7);
            return var11;
        } else {
            class112 var12 = arg0.method2210(!var6.method2184(var7) & !var9.method2184(var10));
            var12.method2217(var6, var7, var9, var10, this.field886);
            return var12;
        }
    }

    @ObfuscatedName("ak.d(Ldn;II)Ldn;")
    public class112 method714(class112 arg0, int arg1) {
        int var3 = this.field881[arg1];
        class109 var4 = method101(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2210(true);
        }
        class109 var6 = null;
        int var7 = 0;
        if (this.field876 != null && arg1 < this.field876.length) {
            int var8 = this.field876[arg1];
            var6 = method101(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class112 var10 = arg0.method2210(!var4.method2184(var5));
            var10.method2278(var4, var5);
            return var10;
        } else {
            class112 var9 = arg0.method2210(!var4.method2184(var5) & !var6.method2184(var7));
            var9.method2278(var4, var5);
            var9.method2278(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("h.l(II)Ldj;")
    public static class109 method101(int arg0) {
        class109 var1 = (class109) field880.method3215((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class109 var2 = class109.method146(Statics.field899, Statics.field883, arg0, false);
        if (var2 != null) {
            field880.method3225(var2, (long) arg0);
        }
        return var2;
    }
}
