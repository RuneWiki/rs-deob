package deob;

@ObfuscatedName("ao")
public class class33 extends class173 {

    @ObfuscatedName("ao.h")
    public static class169 field879 = new class169(64);

    @ObfuscatedName("ao.v")
    public static class169 field893 = new class169(100);

    @ObfuscatedName("ao.k")
    public int[] field876;

    @ObfuscatedName("ao.g")
    public int[] field880;

    @ObfuscatedName("ao.n")
    public int[] field883;

    @ObfuscatedName("ao.c")
    public int[] field892;

    @ObfuscatedName("ao.o")
    public int field885 = -1;

    @ObfuscatedName("ao.u")
    public int[] field884;

    @ObfuscatedName("ao.z")
    public boolean field887 = false;

    @ObfuscatedName("ao.e")
    public int field881 = 5;

    @ObfuscatedName("ao.l")
    public int field889 = -1;

    @ObfuscatedName("ao.m")
    public int field890 = -1;

    @ObfuscatedName("ao.s")
    public int field896 = 99;

    @ObfuscatedName("ao.i")
    public int field888 = -1;

    @ObfuscatedName("ao.y")
    public int field886 = -1;

    @ObfuscatedName("ao.d")
    public int field894 = 2;

    @ObfuscatedName("ad.p(II)Lao;")
    public static class33 method751(int arg0) {
        class33 var1 = (class33) field879.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field877.method2973(12, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method671(new class126(var2));
        }
        var3.method673();
        field879.method3223(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.j(Ldv;I)V")
    public void method671(class126 arg0) {
        while (true) {
            int var2 = arg0.method2544();
            if (var2 == 0) {
                return;
            }
            this.method672(arg0, var2);
        }
    }

    @ObfuscatedName("ao.w(Ldv;IB)V")
    public void method672(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2489();
            this.field883 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field883[var4] = arg0.method2489();
            }
            this.field876 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field876[var5] = arg0.method2489();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field876[var6] += arg0.method2489() << 16;
            }
        } else if (arg1 == 2) {
            this.field885 = arg0.method2489();
        } else if (arg1 == 3) {
            int var7 = arg0.method2544();
            this.field884 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field884[var8] = arg0.method2544();
            }
            this.field884[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field887 = true;
        } else if (arg1 == 5) {
            this.field881 = arg0.method2544();
        } else if (arg1 == 6) {
            this.field889 = arg0.method2489();
        } else if (arg1 == 7) {
            this.field890 = arg0.method2489();
        } else if (arg1 == 8) {
            this.field896 = arg0.method2544();
        } else if (arg1 == 9) {
            this.field888 = arg0.method2544();
        } else if (arg1 == 10) {
            this.field886 = arg0.method2544();
        } else if (arg1 == 11) {
            this.field894 = arg0.method2544();
        } else if (arg1 == 12) {
            int var9 = arg0.method2544();
            this.field880 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field880[var10] = arg0.method2489();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field880[var11] += arg0.method2489() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2544();
            this.field892 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field892[var13] = arg0.method2530();
            }
        }
    }

    @ObfuscatedName("ao.h(S)V")
    public void method673() {
        if (this.field888 == -1) {
            if (this.field884 == null) {
                this.field888 = 0;
            } else {
                this.field888 = 2;
            }
        }
        if (this.field886 != -1) {
            return;
        }
        if (this.field884 == null) {
            this.field886 = 0;
        } else {
            this.field886 = 2;
        }
    }

    @ObfuscatedName("ao.v(Ldm;II)Ldm;")
    public class111 method674(class111 arg0, int arg1) {
        int var3 = this.field876[arg1];
        class108 var4 = method1305(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2181(true);
        } else {
            class111 var6 = arg0.method2181(!var4.method2158(var5));
            var6.method2194(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.k(Ldm;IIB)Ldm;")
    public class111 method675(class111 arg0, int arg1, int arg2) {
        int var4 = this.field876[arg1];
        class108 var5 = method1305(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2181(true);
        }
        class111 var7 = arg0.method2181(!var5.method2158(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2191();
        } else if (var8 == 2) {
            var7.method2193();
        } else if (var8 == 3) {
            var7.method2189();
        }
        var7.method2194(var5, var6);
        if (var8 == 1) {
            var7.method2189();
        } else if (var8 == 2) {
            var7.method2193();
        } else if (var8 == 3) {
            var7.method2191();
        }
        return var7;
    }

    @ObfuscatedName("ao.g(Ldm;IB)Ldm;")
    public class111 method676(class111 arg0, int arg1) {
        int var3 = this.field876[arg1];
        class108 var4 = method1305(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2182(true);
        } else {
            class111 var6 = arg0.method2182(!var4.method2158(var5));
            var6.method2194(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("ao.n(Ldm;ILao;II)Ldm;")
    public class111 method677(class111 arg0, int arg1, class33 arg2, int arg3) {
        int var5 = this.field876[arg1];
        class108 var6 = method1305(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method674(arg0, arg3);
        }
        int var8 = arg2.field876[arg3];
        class108 var9 = method1305(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class111 var11 = arg0.method2181(!var6.method2158(var7));
            var11.method2194(var6, var7);
            return var11;
        } else {
            class111 var12 = arg0.method2181(!var6.method2158(var7) & !var9.method2158(var10));
            var12.method2187(var6, var7, var9, var10, this.field884);
            return var12;
        }
    }

    @ObfuscatedName("ao.c(Ldm;II)Ldm;")
    public class111 method678(class111 arg0, int arg1) {
        int var3 = this.field876[arg1];
        class108 var4 = method1305(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2181(true);
        }
        class108 var6 = null;
        int var7 = 0;
        if (this.field880 != null && arg1 < this.field880.length) {
            int var8 = this.field880[arg1];
            var6 = method1305(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class111 var10 = arg0.method2181(!var4.method2158(var5));
            var10.method2194(var4, var5);
            return var10;
        } else {
            class111 var9 = arg0.method2181(!var4.method2158(var5) & !var6.method2158(var7));
            var9.method2194(var4, var5);
            var9.method2194(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("bg.o(IB)Ldf;")
    public static class108 method1305(int arg0) {
        class108 var1 = (class108) field893.method3214((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class108 var2 = class108.method644(Statics.field882, Statics.field878, arg0, false);
        if (var2 != null) {
            field893.method3223(var2, (long) arg0);
        }
        return var2;
    }
}
