package deob;

@ObfuscatedName("aw")
public class class40 extends class195 {

    @ObfuscatedName("aw.m")
    public static class184 field957 = new class184(64);

    @ObfuscatedName("aw.s")
    public static class184 field958 = new class184(100);

    @ObfuscatedName("aw.j")
    public int[] field955;

    @ObfuscatedName("aw.f")
    public int[] field962;

    @ObfuscatedName("aw.b")
    public int[] field961;

    @ObfuscatedName("aw.t")
    public int[] field970;

    @ObfuscatedName("aw.i")
    public int field968 = -1;

    @ObfuscatedName("aw.c")
    public int[] field964;

    @ObfuscatedName("aw.k")
    public boolean field965 = false;

    @ObfuscatedName("aw.x")
    public int field966 = 5;

    @ObfuscatedName("aw.e")
    public int field969 = -1;

    @ObfuscatedName("aw.q")
    public int field967 = -1;

    @ObfuscatedName("aw.o")
    public int field959 = 99;

    @ObfuscatedName("aw.r")
    public int field960 = -1;

    @ObfuscatedName("aw.v")
    public int field971 = -1;

    @ObfuscatedName("aw.h")
    public int field972 = 2;

    @ObfuscatedName("dx.n(II)Law;")
    public static class40 method2146(int arg0) {
        class40 var1 = (class40) field957.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field975.method2929(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method743(new class111(var2));
        }
        var3.method745();
        field957.method3396(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.g(Ldp;I)V")
    public void method743(class111 arg0) {
        while (true) {
            int var2 = arg0.method2211();
            if (var2 == 0) {
                return;
            }
            this.method744(arg0, var2);
        }
    }

    @ObfuscatedName("aw.a(Ldp;II)V")
    public void method744(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2395();
            this.field961 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field961[var4] = arg0.method2395();
            }
            this.field955 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field955[var5] = arg0.method2395();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field955[var6] += arg0.method2395() << 16;
            }
        } else if (arg1 == 2) {
            this.field968 = arg0.method2395();
        } else if (arg1 == 3) {
            int var7 = arg0.method2211();
            this.field964 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field964[var8] = arg0.method2211();
            }
            this.field964[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field965 = true;
        } else if (arg1 == 5) {
            this.field966 = arg0.method2211();
        } else if (arg1 == 6) {
            this.field969 = arg0.method2395();
        } else if (arg1 == 7) {
            this.field967 = arg0.method2395();
        } else if (arg1 == 8) {
            this.field959 = arg0.method2211();
        } else if (arg1 == 9) {
            this.field960 = arg0.method2211();
        } else if (arg1 == 10) {
            this.field971 = arg0.method2211();
        } else if (arg1 == 11) {
            this.field972 = arg0.method2211();
        } else if (arg1 == 12) {
            int var9 = arg0.method2211();
            this.field962 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field962[var10] = arg0.method2395();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field962[var11] += arg0.method2395() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2211();
            this.field970 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field970[var13] = arg0.method2228();
            }
        }
    }

    @ObfuscatedName("aw.m(I)V")
    public void method745() {
        if (this.field960 == -1) {
            if (this.field964 == null) {
                this.field960 = 0;
            } else {
                this.field960 = 2;
            }
        }
        if (this.field971 != -1) {
            return;
        }
        if (this.field964 == null) {
            this.field971 = 0;
        } else {
            this.field971 = 2;
        }
    }

    @ObfuscatedName("aw.s(Lcs;IB)Lcs;")
    public class100 method746(class100 arg0, int arg1) {
        int var3 = this.field955[arg1];
        class98 var4 = method2830(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2058(true);
        } else {
            class100 var6 = arg0.method2058(!var4.method2044(var5));
            var6.method2064(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.j(Lcs;III)Lcs;")
    public class100 method747(class100 arg0, int arg1, int arg2) {
        int var4 = this.field955[arg1];
        class98 var5 = method2830(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2058(true);
        }
        class100 var7 = arg0.method2058(!var5.method2044(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2069();
        } else if (var8 == 2) {
            var7.method2068();
        } else if (var8 == 3) {
            var7.method2067();
        }
        var7.method2064(var5, var6);
        if (var8 == 1) {
            var7.method2067();
        } else if (var8 == 2) {
            var7.method2068();
        } else if (var8 == 3) {
            var7.method2069();
        }
        return var7;
    }

    @ObfuscatedName("aw.f(Lcs;IB)Lcs;")
    public class100 method751(class100 arg0, int arg1) {
        int var3 = this.field955[arg1];
        class98 var4 = method2830(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2070(true);
        } else {
            class100 var6 = arg0.method2070(!var4.method2044(var5));
            var6.method2064(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("aw.b(Lcs;ILaw;II)Lcs;")
    public class100 method749(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field955[arg1];
        class98 var6 = method2830(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method746(arg0, arg3);
        }
        int var8 = arg2.field955[arg3];
        class98 var9 = method2830(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method2058(!var6.method2044(var7));
            var11.method2064(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method2058(!var6.method2044(var7) & !var9.method2044(var10));
            var12.method2122(var6, var7, var9, var10, this.field964);
            return var12;
        }
    }

    @ObfuscatedName("aw.t(Lcs;II)Lcs;")
    public class100 method750(class100 arg0, int arg1) {
        int var3 = this.field955[arg1];
        class98 var4 = method2830(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2058(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field962 != null && arg1 < this.field962.length) {
            int var8 = this.field962[arg1];
            var6 = method2830(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method2058(!var4.method2044(var5));
            var10.method2064(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method2058(!var4.method2044(var5) & !var6.method2044(var7));
            var9.method2064(var4, var5);
            var9.method2064(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ex.i(II)Lcw;")
    public static class98 method2830(int arg0) {
        class98 var1 = (class98) field958.method3388((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class98 var2 = class98.method2356(Statics.field887, Statics.field956, arg0, false);
        if (var2 != null) {
            field958.method3396(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("h.c(I)V")
    public static void method493() {
        field957.method3398();
        field958.method3398();
    }
}
