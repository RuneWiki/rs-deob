package deob;

@ObfuscatedName("aw")
public class class40 extends class195 {

    @ObfuscatedName("aw.u")
    public static class184 field923 = new class184(64);

    @ObfuscatedName("aw.q")
    public static class184 field928 = new class184(100);

    @ObfuscatedName("aw.r")
    public int[] field927;

    @ObfuscatedName("aw.v")
    public int[] field941;

    @ObfuscatedName("aw.y")
    public int[] field929;

    @ObfuscatedName("aw.k")
    public int[] field930;

    @ObfuscatedName("aw.c")
    public int field924 = -1;

    @ObfuscatedName("aw.j")
    public int[] field932;

    @ObfuscatedName("aw.m")
    public boolean field933 = false;

    @ObfuscatedName("aw.a")
    public int field934 = 5;

    @ObfuscatedName("aw.f")
    public int field935 = -1;

    @ObfuscatedName("aw.i")
    public int field925 = -1;

    @ObfuscatedName("aw.n")
    public int field937 = 99;

    @ObfuscatedName("aw.x")
    public int field938 = -1;

    @ObfuscatedName("aw.h")
    public int field939 = -1;

    @ObfuscatedName("aw.t")
    public int field940 = 2;

    @ObfuscatedName("m.o(Lfg;Lfg;Lfg;I)V")
    public static void method137(class158 arg0, class158 arg1, class158 arg2) {
        Statics.field931 = arg0;
        Statics.field1926 = arg1;
        Statics.field926 = arg2;
    }

    @ObfuscatedName("d.l(IB)Law;")
    public static class40 method567(int arg0) {
        class40 var1 = (class40) field923.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field931.method2940(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method776(new class111(var2));
        }
        var3.method775();
        field923.method3403(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.g(Ldk;I)V")
    public void method776(class111 arg0) {
        while (true) {
            int var2 = arg0.method2219();
            if (var2 == 0) {
                return;
            }
            this.method777(arg0, var2);
        }
    }

    @ObfuscatedName("aw.u(Ldk;IB)V")
    public void method777(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2397();
            this.field929 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field929[var4] = arg0.method2397();
            }
            this.field927 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field927[var5] = arg0.method2397();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field927[var6] += arg0.method2397() << 16;
            }
        } else if (arg1 == 2) {
            this.field924 = arg0.method2397();
        } else if (arg1 == 3) {
            int var7 = arg0.method2219();
            this.field932 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field932[var8] = arg0.method2219();
            }
            this.field932[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field933 = true;
        } else if (arg1 == 5) {
            this.field934 = arg0.method2219();
        } else if (arg1 == 6) {
            this.field935 = arg0.method2397();
        } else if (arg1 == 7) {
            this.field925 = arg0.method2397();
        } else if (arg1 == 8) {
            this.field937 = arg0.method2219();
        } else if (arg1 == 9) {
            this.field938 = arg0.method2219();
        } else if (arg1 == 10) {
            this.field939 = arg0.method2219();
        } else if (arg1 == 11) {
            this.field940 = arg0.method2219();
        } else if (arg1 == 12) {
            int var9 = arg0.method2219();
            this.field941 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field941[var10] = arg0.method2397();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field941[var11] += arg0.method2397() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2219();
            this.field930 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field930[var13] = arg0.method2258();
            }
        }
    }

    @ObfuscatedName("aw.q(I)V")
    public void method775() {
        if (this.field938 == -1) {
            if (this.field932 == null) {
                this.field938 = 0;
            } else {
                this.field938 = 2;
            }
        }
        if (this.field939 != -1) {
            return;
        }
        if (this.field932 == null) {
            this.field939 = 0;
        } else {
            this.field939 = 2;
        }
    }

    @ObfuscatedName("aw.r(Lcq;II)Lcq;")
    public class100 method816(class100 arg0, int arg1) {
        int var3 = this.field927[arg1];
        class98 var4 = method3197(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2099(true);
        } else {
            class100 var6 = arg0.method2099(!var4.method2036(var5));
            var6.method2053(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.v(Lcq;IIB)Lcq;")
    public class100 method780(class100 arg0, int arg1, int arg2) {
        int var4 = this.field927[arg1];
        class98 var5 = method3197(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2099(true);
        }
        class100 var7 = arg0.method2099(!var5.method2036(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2071();
        } else if (var8 == 2) {
            var7.method2057();
        } else if (var8 == 3) {
            var7.method2116();
        }
        var7.method2053(var5, var6);
        if (var8 == 1) {
            var7.method2116();
        } else if (var8 == 2) {
            var7.method2057();
        } else if (var8 == 3) {
            var7.method2071();
        }
        return var7;
    }

    @ObfuscatedName("aw.y(Lcq;II)Lcq;")
    public class100 method781(class100 arg0, int arg1) {
        int var3 = this.field927[arg1];
        class98 var4 = method3197(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2048(true);
        } else {
            class100 var6 = arg0.method2048(!var4.method2036(var5));
            var6.method2053(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.k(Lcq;ILaw;II)Lcq;")
    public class100 method783(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field927[arg1];
        class98 var6 = method3197(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method816(arg0, arg3);
        }
        int var8 = arg2.field927[arg3];
        class98 var9 = method3197(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method2099(!var6.method2036(var7));
            var11.method2053(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method2099(!var6.method2036(var7) & !var9.method2036(var10));
            var12.method2054(var6, var7, var9, var10, this.field932);
            return var12;
        }
    }

    @ObfuscatedName("aw.c(Lcq;II)Lcq;")
    public class100 method803(class100 arg0, int arg1) {
        int var3 = this.field927[arg1];
        class98 var4 = method3197(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2099(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field941 != null && arg1 < this.field941.length) {
            int var8 = this.field941[arg1];
            var6 = method3197(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method2099(!var4.method2036(var5));
            var10.method2053(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method2099(!var4.method2036(var5) & !var6.method2036(var7));
            var9.method2053(var4, var5);
            var9.method2053(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("fi.j(II)Lcg;")
    public static class98 method3197(int arg0) {
        class98 var1 = (class98) field928.method3401((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class98 var2 = class98.method134(Statics.field1926, Statics.field926, arg0, false);
        if (var2 != null) {
            field928.method3403(var2, (long) arg0);
        }
        return var2;
    }
}
