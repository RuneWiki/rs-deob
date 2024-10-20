package deob;

@ObfuscatedName("an")
public class class40 extends class195 {

    @ObfuscatedName("an.y")
    public static class184 field930 = new class184(64);

    @ObfuscatedName("an.e")
    public static class184 field931 = new class184(100);

    @ObfuscatedName("an.g")
    public int[] field939;

    @ObfuscatedName("an.f")
    public int[] field946;

    @ObfuscatedName("an.m")
    public int[] field934;

    @ObfuscatedName("an.a")
    public int[] field935;

    @ObfuscatedName("an.h")
    public int field933 = -1;

    @ObfuscatedName("an.l")
    public int[] field937;

    @ObfuscatedName("an.u")
    public boolean field938 = false;

    @ObfuscatedName("an.q")
    public int field928 = 5;

    @ObfuscatedName("an.k")
    public int field940 = -1;

    @ObfuscatedName("an.x")
    public int field941 = -1;

    @ObfuscatedName("an.r")
    public int field943 = 99;

    @ObfuscatedName("an.j")
    public int field936 = -1;

    @ObfuscatedName("an.s")
    public int field944 = -1;

    @ObfuscatedName("an.v")
    public int field942 = 2;

    @ObfuscatedName("ff.n(II)Lan;")
    public static class40 method3092(int arg0) {
        class40 var1 = (class40) field930.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field932.method2948(12, arg0);
        class40 var3 = new class40();
        if (var2 != null) {
            var3.method776(new class111(var2));
        }
        var3.method778();
        field930.method3420(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("an.d(Ldl;B)V")
    public void method776(class111 arg0) {
        while (true) {
            int var2 = arg0.method2228();
            if (var2 == 0) {
                return;
            }
            this.method777(arg0, var2);
        }
    }

    @ObfuscatedName("an.z(Ldl;IB)V")
    public void method777(class111 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2231();
            this.field934 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field934[var4] = arg0.method2231();
            }
            this.field939 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field939[var5] = arg0.method2231();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field939[var6] += arg0.method2231() << 16;
            }
        } else if (arg1 == 2) {
            this.field933 = arg0.method2231();
        } else if (arg1 == 3) {
            int var7 = arg0.method2228();
            this.field937 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field937[var8] = arg0.method2228();
            }
            this.field937[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field938 = true;
        } else if (arg1 == 5) {
            this.field928 = arg0.method2228();
        } else if (arg1 == 6) {
            this.field940 = arg0.method2231();
        } else if (arg1 == 7) {
            this.field941 = arg0.method2231();
        } else if (arg1 == 8) {
            this.field943 = arg0.method2228();
        } else if (arg1 == 9) {
            this.field936 = arg0.method2228();
        } else if (arg1 == 10) {
            this.field944 = arg0.method2228();
        } else if (arg1 == 11) {
            this.field942 = arg0.method2228();
        } else if (arg1 == 12) {
            int var9 = arg0.method2228();
            this.field946 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field946[var10] = arg0.method2231();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field946[var11] += arg0.method2231() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method2228();
            this.field935 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field935[var13] = arg0.method2232();
            }
        }
    }

    @ObfuscatedName("an.y(I)V")
    public void method778() {
        if (this.field936 == -1) {
            if (this.field937 == null) {
                this.field936 = 0;
            } else {
                this.field936 = 2;
            }
        }
        if (this.field944 != -1) {
            return;
        }
        if (this.field937 == null) {
            this.field944 = 0;
        } else {
            this.field944 = 2;
        }
    }

    @ObfuscatedName("an.e(Lcg;II)Lcg;")
    public class100 method779(class100 arg0, int arg1) {
        int var3 = this.field939[arg1];
        class98 var4 = method163(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2090(true);
        } else {
            class100 var6 = arg0.method2090(!var4.method2061(var5));
            var6.method2106(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("an.g(Lcg;III)Lcg;")
    public class100 method780(class100 arg0, int arg1, int arg2) {
        int var4 = this.field939[arg1];
        class98 var5 = method163(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method2090(true);
        }
        class100 var7 = arg0.method2090(!var5.method2061(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method2082();
        } else if (var8 == 2) {
            var7.method2079();
        } else if (var8 == 3) {
            var7.method2078();
        }
        var7.method2106(var5, var6);
        if (var8 == 1) {
            var7.method2078();
        } else if (var8 == 2) {
            var7.method2079();
        } else if (var8 == 3) {
            var7.method2082();
        }
        return var7;
    }

    @ObfuscatedName("an.f(Lcg;IB)Lcg;")
    public class100 method786(class100 arg0, int arg1) {
        int var3 = this.field939[arg1];
        class98 var4 = method163(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2124(true);
        } else {
            class100 var6 = arg0.method2124(!var4.method2061(var5));
            var6.method2106(var4, var5);
            return var6;
        }
    }

    @ObfuscatedName("an.m(Lcg;ILan;IB)Lcg;")
    public class100 method782(class100 arg0, int arg1, class40 arg2, int arg3) {
        int var5 = this.field939[arg1];
        class98 var6 = method163(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method779(arg0, arg3);
        }
        int var8 = arg2.field939[arg3];
        class98 var9 = method163(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class100 var11 = arg0.method2090(!var6.method2061(var7));
            var11.method2106(var6, var7);
            return var11;
        } else {
            class100 var12 = arg0.method2090(!var6.method2061(var7) & !var9.method2061(var10));
            var12.method2076(var6, var7, var9, var10, this.field937);
            return var12;
        }
    }

    @ObfuscatedName("an.a(Lcg;IS)Lcg;")
    public class100 method783(class100 arg0, int arg1) {
        int var3 = this.field939[arg1];
        class98 var4 = method163(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method2090(true);
        }
        class98 var6 = null;
        int var7 = 0;
        if (this.field946 != null && arg1 < this.field946.length) {
            int var8 = this.field946[arg1];
            var6 = method163(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class100 var10 = arg0.method2090(!var4.method2061(var5));
            var10.method2106(var4, var5);
            return var10;
        } else {
            class100 var9 = arg0.method2090(!var4.method2061(var5) & !var6.method2061(var7));
            var9.method2106(var4, var5);
            var9.method2106(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("j.h(II)Lci;")
    public static class98 method163(int arg0) {
        class98 var1 = (class98) field931.method3411((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class158 var2 = Statics.field929;
        class158 var3 = Statics.field1869;
        boolean var4 = true;
        int[] var5 = var2.method2959(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method3013(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method3013(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class98 var10;
        if (var4) {
            try {
                var10 = new class98(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field931.method3420(var10, (long) arg0);
        }
        return var10;
    }
}
