package deob;

@ObfuscatedName("ah")
public class class40 extends class205 {

    @ObfuscatedName("ah.x")
    public static class194 field896 = new class194(64);

    @ObfuscatedName("ah.b")
    public static class194 field897 = new class194(50);

    @ObfuscatedName("ah.l")
    public int field900;

    @ObfuscatedName("ah.d")
    public String field906 = "null";

    @ObfuscatedName("ah.n")
    public int field908 = 1;

    @ObfuscatedName("ah.m")
    public int[] field901;

    @ObfuscatedName("ah.g")
    public int[] field902;

    @ObfuscatedName("ah.s")
    public int field903 = -1;

    @ObfuscatedName("ah.r")
    public int field904 = -1;

    @ObfuscatedName("ah.k")
    public int field930 = -1;

    @ObfuscatedName("ah.o")
    public int field914 = -1;

    @ObfuscatedName("ah.q")
    public int field907 = -1;

    @ObfuscatedName("ah.p")
    public int field928 = -1;

    @ObfuscatedName("ah.h")
    public int field909 = -1;

    @ObfuscatedName("ah.e")
    public short[] field910;

    @ObfuscatedName("ah.t")
    public short[] field919;

    @ObfuscatedName("ah.w")
    public short[] field912;

    @ObfuscatedName("ah.v")
    public short[] field913;

    @ObfuscatedName("ah.y")
    public String[] field895 = new String[5];

    @ObfuscatedName("ah.c")
    public boolean field898 = true;

    @ObfuscatedName("ah.i")
    public int field931 = -1;

    @ObfuscatedName("ah.a")
    public int field917 = 128;

    @ObfuscatedName("ah.z")
    public int field918 = 128;

    @ObfuscatedName("ah.j")
    public boolean field899 = false;

    @ObfuscatedName("ah.ag")
    public int field920 = 0;

    @ObfuscatedName("ah.ax")
    public int field921 = 0;

    @ObfuscatedName("ah.ao")
    public int field922 = -1;

    @ObfuscatedName("ah.ac")
    public int field923 = 32;

    @ObfuscatedName("ah.aj")
    public int[] field911;

    @ObfuscatedName("ah.an")
    public int field925 = -1;

    @ObfuscatedName("ah.al")
    public int field926 = -1;

    @ObfuscatedName("ah.as")
    public boolean field927 = true;

    @ObfuscatedName("ah.av")
    public boolean field934 = true;

    @ObfuscatedName("ah.am")
    public boolean field929 = false;

    @ObfuscatedName("ah.az")
    public int field915 = 30;

    @ObfuscatedName("dw.f(Lfl;Lfl;I)V")
    public static void method2256(class168 arg0, class168 arg1) {
        Statics.field894 = arg0;
        Statics.field905 = arg1;
    }

    @ObfuscatedName("fb.u(II)Lah;")
    public static class40 method3193(int arg0) {
        class40 var1 = (class40) field896.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field894.method3061(9, arg0);
        class40 var3 = new class40();
        var3.field900 = arg0;
        if (var2 != null) {
            var3.method781(new class120(var2));
        }
        var3.method790();
        field896.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.x(I)V")
    public void method790() {
    }

    @ObfuscatedName("ah.b(Ldj;I)V")
    public void method781(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method811(arg0, var2);
        }
    }

    @ObfuscatedName("ah.l(Ldj;II)V")
    public void method811(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2385();
            this.field901 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field901[var4] = arg0.method2387();
            }
        } else if (arg1 == 2) {
            this.field906 = arg0.method2499();
        } else if (arg1 == 12) {
            this.field908 = arg0.method2385();
        } else if (arg1 == 13) {
            this.field903 = arg0.method2387();
        } else if (arg1 == 14) {
            this.field914 = arg0.method2387();
        } else if (arg1 == 15) {
            this.field904 = arg0.method2387();
        } else if (arg1 == 16) {
            this.field930 = arg0.method2387();
        } else if (arg1 == 17) {
            this.field914 = arg0.method2387();
            this.field907 = arg0.method2387();
            this.field928 = arg0.method2387();
            this.field909 = arg0.method2387();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field895[arg1 - 30] = arg0.method2499();
            if (this.field895[arg1 - 30].equalsIgnoreCase(class158.field2398)) {
                this.field895[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method2385();
            this.field910 = new short[var5];
            this.field919 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field910[var6] = (short) arg0.method2387();
                this.field919[var6] = (short) arg0.method2387();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method2385();
            this.field912 = new short[var7];
            this.field913 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field912[var8] = (short) arg0.method2387();
                this.field913[var8] = (short) arg0.method2387();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method2385();
            this.field902 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field902[var10] = arg0.method2387();
            }
        } else if (arg1 == 93) {
            this.field898 = false;
        } else if (arg1 == 95) {
            this.field931 = arg0.method2387();
        } else if (arg1 == 97) {
            this.field917 = arg0.method2387();
        } else if (arg1 == 98) {
            this.field918 = arg0.method2387();
        } else if (arg1 == 99) {
            this.field899 = true;
        } else if (arg1 == 100) {
            this.field920 = arg0.method2369();
        } else if (arg1 == 101) {
            this.field921 = arg0.method2369() * 5;
        } else if (arg1 == 102) {
            this.field922 = arg0.method2387();
        } else if (arg1 == 103) {
            this.field923 = arg0.method2387();
        } else if (arg1 == 106) {
            this.field925 = arg0.method2387();
            if (this.field925 == 65535) {
                this.field925 = -1;
            }
            this.field926 = arg0.method2387();
            if (this.field926 == 65535) {
                this.field926 = -1;
            }
            int var11 = arg0.method2385();
            this.field911 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field911[var12] = arg0.method2387();
                if (this.field911[var12] == 65535) {
                    this.field911[var12] = -1;
                }
            }
        } else if (arg1 == 107) {
            this.field927 = false;
        } else if (arg1 == 109) {
            this.field934 = false;
        } else if (arg1 == 111) {
            this.field929 = true;
        } else if (arg1 == 112) {
            this.field915 = arg0.method2385();
        }
    }

    @ObfuscatedName("ah.d(Laa;ILaa;II)Ldr;")
    public final class106 method784(class43 arg0, int arg1, class43 arg2, int arg3) {
        if (this.field911 != null) {
            class40 var5 = this.method786();
            return var5 == null ? null : var5.method784(arg0, arg1, arg2, arg3);
        }
        class106 var6 = (class106) field897.method3530((long) this.field900);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < this.field901.length; var8++) {
                if (!Statics.field905.method3063(this.field901[var8], 0)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class101[] var9 = new class101[this.field901.length];
            for (int var10 = 0; var10 < this.field901.length; var10++) {
                var9[var10] = class101.method2118(Statics.field905, this.field901[var10], 0);
            }
            class101 var11;
            if (var9.length == 1) {
                var11 = var9[0];
            } else {
                var11 = new class101(var9, var9.length);
            }
            if (this.field910 != null) {
                for (int var12 = 0; var12 < this.field910.length; var12++) {
                    var11.method2179(this.field910[var12], this.field919[var12]);
                }
            }
            if (this.field912 != null) {
                for (int var13 = 0; var13 < this.field912.length; var13++) {
                    var11.method2138(this.field912[var13], this.field913[var13]);
                }
            }
            var6 = var11.method2128(this.field920 + 64, this.field921 + 850, -30, -50, -30);
            field897.method3521(var6, (long) this.field900);
        }
        class106 var14;
        if (arg0 != null && arg2 != null) {
            var14 = arg0.method878(var6, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var14 = arg0.method901(var6, arg1);
        } else if (arg2 == null) {
            var14 = var6.method2192(true);
        } else {
            var14 = arg2.method901(var6, arg3);
        }
        if (this.field917 != 128 || this.field918 != 128) {
            var14.method2191(this.field917, this.field918, this.field917);
        }
        return var14;
    }

    @ObfuscatedName("ah.n(B)Lct;")
    public final class101 method785() {
        if (this.field911 != null) {
            class40 var1 = this.method786();
            return var1 == null ? null : var1.method785();
        } else if (this.field902 == null) {
            return null;
        } else {
            boolean var2 = false;
            for (int var3 = 0; var3 < this.field902.length; var3++) {
                if (!Statics.field905.method3063(this.field902[var3], 0)) {
                    var2 = true;
                }
            }
            if (var2) {
                return null;
            }
            class101[] var4 = new class101[this.field902.length];
            for (int var5 = 0; var5 < this.field902.length; var5++) {
                var4[var5] = class101.method2118(Statics.field905, this.field902[var5], 0);
            }
            class101 var6;
            if (var4.length == 1) {
                var6 = var4[0];
            } else {
                var6 = new class101(var4, var4.length);
            }
            if (this.field910 != null) {
                for (int var7 = 0; var7 < this.field910.length; var7++) {
                    var6.method2179(this.field910[var7], this.field919[var7]);
                }
            }
            if (this.field912 != null) {
                for (int var8 = 0; var8 < this.field912.length; var8++) {
                    var6.method2138(this.field912[var8], this.field913[var8]);
                }
            }
            return var6;
        }
    }

    @ObfuscatedName("ah.m(I)Lah;")
    public final class40 method786() {
        int var1 = -1;
        if (this.field925 != -1) {
            var1 = class177.method2677(this.field925);
        } else if (this.field926 != -1) {
            var1 = class177.field2906[this.field926];
        }
        return var1 < 0 || var1 >= this.field911.length || this.field911[var1] == -1 ? null : method3193(this.field911[var1]);
    }

    @ObfuscatedName("ah.g(I)Z")
    public boolean method787() {
        if (this.field911 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field925 != -1) {
            var1 = class177.method2677(this.field925);
        } else if (this.field926 != -1) {
            var1 = class177.field2906[this.field926];
        }
        return var1 >= 0 && var1 < this.field911.length && this.field911[var1] != -1;
    }

    @ObfuscatedName("dy.s(I)V")
    public static void method2307() {
        field896.method3529();
        field897.method3529();
    }
}
