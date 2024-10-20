package deob;

@ObfuscatedName("as")
public class class33 extends class172 {

    @ObfuscatedName("as.p")
    public static class168 field891 = new class168(64);

    @ObfuscatedName("as.i")
    public static class168 field890 = new class168(100);

    @ObfuscatedName("as.v")
    public int[] field884;

    @ObfuscatedName("as.l")
    public int[] field885;

    @ObfuscatedName("as.m")
    public int[] field894;

    @ObfuscatedName("as.g")
    public int[] field887;

    @ObfuscatedName("as.t")
    public int field888 = -1;

    @ObfuscatedName("as.o")
    public int[] field889;

    @ObfuscatedName("as.b")
    public boolean field886 = false;

    @ObfuscatedName("as.d")
    public int field892 = 5;

    @ObfuscatedName("as.k")
    public int field879 = -1;

    @ObfuscatedName("as.f")
    public int field893 = -1;

    @ObfuscatedName("as.e")
    public int field883 = 99;

    @ObfuscatedName("as.u")
    public int field895 = -1;

    @ObfuscatedName("as.n")
    public int field896 = -1;

    @ObfuscatedName("as.q")
    public int field897 = 2;

    @ObfuscatedName("a.z(Len;Len;Len;I)V")
    public static void method210(class150 arg0, class150 arg1, class150 arg2) {
        Statics.field880 = arg0;
        Statics.field882 = arg1;
        Statics.field881 = arg2;
    }

    @ObfuscatedName("et.h(IS)Las;")
    public static class33 method2674(int arg0) {
        class33 var1 = (class33) field891.method3240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field880.method2951(12, arg0);
        class33 var3 = new class33();
        if (var2 != null) {
            var3.method707(new class126(var2));
        }
        var3.method721();
        field891.method3237(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.c(Ldq;I)V")
    public void method707(class126 arg0) {
        while (true) {
            int var2 = arg0.method2450();
            if (var2 == 0) {
                return;
            }
            this.method708(arg0, var2);
        }
    }

    @ObfuscatedName("as.p(Ldq;IB)V")
    public void method708(class126 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2627();
            this.field894 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field894[var4] = arg0.method2627();
            }
            this.field884 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field884[var5] = arg0.method2627();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field884[var6] += arg0.method2627() << 16;
            }
        } else if (arg1 == 2) {
            this.field888 = arg0.method2627();
        } else if (arg1 == 3) {
            int var7 = arg0.method2450();
            this.field889 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field889[var8] = arg0.method2450();
            }
            this.field889[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field886 = true;
        } else if (arg1 == 5) {
            this.field892 = arg0.method2450();
        } else if (arg1 == 6) {
            this.field879 = arg0.method2627();
        } else if (arg1 == 7) {
            this.field893 = arg0.method2627();
        } else if (arg1 == 8) {
            this.field883 = arg0.method2450();
        } else if (arg1 == 9) {
            this.field895 = arg0.method2450();
        } else if (arg1 == 10) {
            this.field896 = arg0.method2450();
        } else if (arg1 == 11) {
            this.field897 = arg0.method2450();
        } else if (arg1 == 12) {
            int var9 = arg0.method2450();
            this.field885 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field885[var10] = arg0.method2627();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field885[var11] += arg0.method2627() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2450();
            this.field887 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field887[var13] = arg0.method2454();
            }
        }
    }

    @ObfuscatedName("as.i(I)V")
    public void method721() {
        if (this.field895 == -1) {
            if (this.field889 == null) {
                this.field895 = 0;
            } else {
                this.field895 = 2;
            }
        }
        if (this.field896 != -1) {
            return;
        }
        if (this.field889 == null) {
            this.field896 = 0;
        } else {
            this.field896 = 2;
        }
    }

    @ObfuscatedName("as.v(Ldh;II)Ldh;")
    public class111 method710(class111 arg0, int arg1) {
        int var3 = this.field884[arg1];
        class108 var4 = method204(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2216(true);
        } else {
            class111 var6 = arg0.method2216(!var4.method2191(var5));
            var6.method2252(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("as.l(Ldh;III)Ldh;")
    public class111 method711(class111 arg0, int arg1, int arg2) {
        int var4 = this.field884[arg1];
        class108 var5 = method204(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2216(true);
        }
        class111 var7 = arg0.method2216(!var5.method2191(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2241();
        } else if (var8 == 2) {
            var7.method2214();
        } else if (var8 == 3) {
            var7.method2225();
        }
        var7.method2252(var5, var6);
        if (var8 == 1) {
            var7.method2225();
        } else if (var8 == 2) {
            var7.method2214();
        } else if (var8 == 3) {
            var7.method2241();
        }
        return var7;
    }

    @ObfuscatedName("as.m(Ldh;IB)Ldh;")
    public class111 method712(class111 arg0, int arg1) {
        int var3 = this.field884[arg1];
        class108 var4 = method204(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2217(true);
        } else {
            class111 var6 = arg0.method2217(!var4.method2191(var5));
            var6.method2252(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("as.g(Ldh;ILas;IB)Ldh;")
    public class111 method738(class111 arg0, int arg1, class33 arg2, int arg3) {
        int var5 = this.field884[arg1];
        class108 var6 = method204(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method710(arg0, arg3);
        }
        int var8 = arg2.field884[arg3];
        class108 var9 = method204(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class111 var11 = arg0.method2216(!var6.method2191(var7));
            var11.method2252(var6, var7);
            return var11;
        } else {
            class111 var12 = arg0.method2216(!var6.method2191(var7) & !var9.method2191(var10));
            var12.method2276(var6, var7, var9, var10, this.field889);
            return var12;
        }
    }

    @ObfuscatedName("as.t(Ldh;IB)Ldh;")
    public class111 method709(class111 arg0, int arg1) {
        int var3 = this.field884[arg1];
        class108 var4 = method204(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2216(true);
        }
        class108 var6 = null;
        int var7 = 0;
        if (this.field885 != null && arg1 < this.field885.length) {
            int var8 = this.field885[arg1];
            var6 = method204(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class111 var10 = arg0.method2216(!var4.method2191(var5));
            var10.method2252(var4, var5);
            return var10;
        } else {
            class111 var9 = arg0.method2216(!var4.method2191(var5) & !var6.method2191(var7));
            var9.method2252(var4, var5);
            var9.method2252(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("y.o(II)Ldx;")
    public static class108 method204(int arg0) {
        class108 var1 = (class108) field890.method3240((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class108 var2 = class108.method562(Statics.field882, Statics.field881, arg0, false);
        if (var2 != null) {
            field890.method3237(var2, (long) arg0);
        }
        return var2;
    }
}
