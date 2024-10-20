package deob;

@ObfuscatedName("as")
public class class40 extends class194 {

    @ObfuscatedName("as.e")
    public static class183 field913 = new class183(64);

    @ObfuscatedName("as.n")
    public static class183 field914 = new class183(100);

    @ObfuscatedName("as.t")
    public int[] field915;

    @ObfuscatedName("as.l")
    public int[] field910;

    @ObfuscatedName("as.m")
    public int[] field917;

    @ObfuscatedName("as.o")
    public int[] field918;

    @ObfuscatedName("as.k")
    public int field919 = -1;

    @ObfuscatedName("as.p")
    public int[] field920;

    @ObfuscatedName("as.u")
    public boolean field911 = false;

    @ObfuscatedName("as.g")
    public int field922 = 5;

    @ObfuscatedName("as.a")
    public int field923 = -1;

    @ObfuscatedName("as.y")
    public int field927 = -1;

    @ObfuscatedName("as.d")
    public int field926 = 99;

    @ObfuscatedName("as.b")
    public int field916 = -1;

    @ObfuscatedName("as.j")
    public int field932 = -1;

    @ObfuscatedName("as.f")
    public int field928 = 2;

    @ObfuscatedName("ae.q(II)Las;")
    public static class40 method575(int arg0) {
        class40 var1 = (class40) field913.method3243((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field924.method2811(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method726(new class111(var2));
        }
        var3.method734();
        field913.method3253(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("as.s(Ldx;I)V")
    public void method726(class111 arg0) {
        while (true) {
            int var2 = arg0.method2231();
            if (var2 == 0) {
                return;
            }
            this.method747(arg0, var2);
        }
    }

    @ObfuscatedName("as.h(Ldx;IB)V")
    public void method747(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2307();
            this.field917 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field917[var4] = arg0.method2307();
            }
            this.field915 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field915[var5] = arg0.method2307();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field915[var6] += arg0.method2307() << 16;
            }
        } else if (arg1 == 2) {
            this.field919 = arg0.method2307();
        } else if (arg1 == 3) {
            int var7 = arg0.method2231();
            this.field920 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field920[var8] = arg0.method2231();
            }
            this.field920[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field911 = true;
        } else if (arg1 == 5) {
            this.field922 = arg0.method2231();
        } else if (arg1 == 6) {
            this.field923 = arg0.method2307();
        } else if (arg1 == 7) {
            this.field927 = arg0.method2307();
        } else if (arg1 == 8) {
            this.field926 = arg0.method2231();
        } else if (arg1 == 9) {
            this.field916 = arg0.method2231();
        } else if (arg1 == 10) {
            this.field932 = arg0.method2231();
        } else if (arg1 == 11) {
            this.field928 = arg0.method2231();
        } else if (arg1 == 12) {
            int var9 = arg0.method2231();
            this.field910 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field910[var10] = arg0.method2307();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field910[var11] += arg0.method2307() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2231();
            this.field918 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field918[var13] = arg0.method2150();
            }
        }
    }

    @ObfuscatedName("as.e(I)V")
    public void method734() {
        if (this.field916 == -1) {
            if (this.field920 == null) {
                this.field916 = 0;
            } else {
                this.field916 = 2;
            }
        }
        if (this.field932 != -1) {
            return;
        }
        if (this.field920 == null) {
            this.field932 = 0;
        } else {
            this.field932 = 2;
        }
    }

    @ObfuscatedName("as.n(Lch;II)Lch;")
    public class100 method725(class100 arg0, int arg1) {
        int var3 = this.field915[arg1];
        class98 var4 = Statics.method2435(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1992(true);
        } else {
            class100 var6 = arg0.method1992(!var4.method1985(var5));
            var6.method1998(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("as.t(Lch;III)Lch;")
    public class100 method749(class100 arg0, int arg1, int arg2) {
        int var4 = this.field915[arg1];
        class98 var5 = Statics.method2435(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1992(true);
        }
        class100 var7 = arg0.method1992(!var5.method1985(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2003();
        } else if (var8 == 2) {
            var7.method2007();
        } else if (var8 == 3) {
            var7.method2011();
        }
        var7.method1998(var5, var6);
        if (var8 == 1) {
            var7.method2011();
        } else if (var8 == 2) {
            var7.method2007();
        } else if (var8 == 3) {
            var7.method2003();
        }
        return var7;
    }

    @ObfuscatedName("as.l(Lch;IB)Lch;")
    public class100 method727(class100 arg0, int arg1) {
        int var3 = this.field915[arg1];
        class98 var4 = Statics.method2435(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2059(true);
        } else {
            class100 var6 = arg0.method2059(!var4.method1985(var5));
            var6.method1998(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("as.m(Lch;ILas;IB)Lch;")
    public class100 method728(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field915[arg1];
        class98 var6 = Statics.method2435(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method725(arg0, arg3);
        }
        int var8 = arg2.field915[arg3];
        class98 var9 = Statics.method2435(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method1992(!var6.method1985(var7));
            var11.method1998(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method1992(!var6.method1985(var7) & !var9.method1985(var10));
            var12.method1999(var6, var7, var9, var10, this.field920);
            return var12;
        }
    }

    @ObfuscatedName("as.o(Lch;IS)Lch;")
    public class100 method739(class100 arg0, int arg1) {
        int var3 = this.field915[arg1];
        class98 var4 = Statics.method2435(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method1992(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field910 != null && arg1 < this.field910.length) {
            int var8 = this.field910[arg1];
            var6 = Statics.method2435(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method1992(!var4.method1985(var5));
            var10.method1998(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method1992(!var4.method1985(var5) & !var6.method1985(var7));
            var9.method1998(var4, var5);
            var9.method1998(var6, var7);
            return var9;
        }
    }
}
