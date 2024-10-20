package deob;

@ObfuscatedName("aw")
public class class41 extends class205 {

    @ObfuscatedName("aw.e")
    public static boolean field940 = false;

    @ObfuscatedName("aw.s")
    public static class194 field929 = new class194(64);

    @ObfuscatedName("aw.p")
    public static class194 field903 = new class194(500);

    @ObfuscatedName("aw.h")
    public static class194 field904 = new class194(30);

    @ObfuscatedName("aw.g")
    public static class194 field905 = new class194(30);

    @ObfuscatedName("aw.a")
    public static class101[] field906 = new class101[4];

    @ObfuscatedName("aw.r")
    public int field907;

    @ObfuscatedName("aw.k")
    public int[] field927;

    @ObfuscatedName("aw.m")
    public int[] field901;

    @ObfuscatedName("aw.n")
    public String field910 = "null";

    @ObfuscatedName("aw.y")
    public short[] field911;

    @ObfuscatedName("aw.i")
    public short[] field912;

    @ObfuscatedName("aw.j")
    public short[] field913;

    @ObfuscatedName("aw.l")
    public short[] field914;

    @ObfuscatedName("aw.o")
    public int field909 = 1;

    @ObfuscatedName("aw.c")
    public int field916 = 1;

    @ObfuscatedName("aw.x")
    public int field925 = 2;

    @ObfuscatedName("aw.b")
    public boolean field918 = true;

    @ObfuscatedName("aw.q")
    public int field923 = -1;

    @ObfuscatedName("aw.u")
    public int field920 = -1;

    @ObfuscatedName("aw.t")
    public boolean field921 = false;

    @ObfuscatedName("aw.d")
    public boolean field922 = false;

    @ObfuscatedName("aw.z")
    public int field939 = -1;

    @ObfuscatedName("aw.v")
    public int field946 = 16;

    @ObfuscatedName("aw.aq")
    public int field908 = 0;

    @ObfuscatedName("aw.ap")
    public int field926 = 0;

    @ObfuscatedName("aw.ai")
    public String[] field899 = new String[5];

    @ObfuscatedName("aw.ae")
    public int field928 = -1;

    @ObfuscatedName("aw.az")
    public int field917 = -1;

    @ObfuscatedName("aw.ah")
    public boolean field945 = false;

    @ObfuscatedName("aw.ar")
    public boolean field931 = true;

    @ObfuscatedName("aw.ab")
    public int field932 = 128;

    @ObfuscatedName("aw.aj")
    public int field933 = 128;

    @ObfuscatedName("aw.ay")
    public int field934 = 128;

    @ObfuscatedName("aw.ag")
    public int field935 = 0;

    @ObfuscatedName("aw.av")
    public int field919 = 0;

    @ObfuscatedName("aw.af")
    public int field937 = 0;

    @ObfuscatedName("aw.am")
    public boolean field941 = false;

    @ObfuscatedName("aw.aw")
    public boolean field915 = false;

    @ObfuscatedName("aw.ad")
    public int field949 = -1;

    @ObfuscatedName("aw.aa")
    public int[] field924;

    @ObfuscatedName("aw.ac")
    public int field942 = -1;

    @ObfuscatedName("aw.an")
    public int field943 = -1;

    @ObfuscatedName("aw.ax")
    public int field944 = -1;

    @ObfuscatedName("aw.au")
    public int field936 = 0;

    @ObfuscatedName("aw.at")
    public int field938 = 0;

    @ObfuscatedName("aw.ao")
    public int field947 = 0;

    @ObfuscatedName("aw.al")
    public int[] field948;

    @ObfuscatedName("k.e(Lft;Lft;ZI)V")
    public static void method126(class168 arg0, class168 arg1, boolean arg2) {
        Statics.field900 = arg0;
        Statics.field902 = arg1;
        field940 = arg2;
    }

    @ObfuscatedName("aq.w(II)Law;")
    public static class41 method626(int arg0) {
        class41 var1 = (class41) field929.method3473((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field900.method3048(6, arg0);
        class41 var3 = new class41();
        var3.field907 = arg0;
        if (var2 != null) {
            var3.method764(new class120(var2));
        }
        var3.method763();
        if (var3.field915) {
            var3.field925 = 0;
            var3.field918 = false;
        }
        field929.method3475(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aw.f(B)V")
    public void method763() {
        if (this.field923 == -1) {
            this.field923 = 0;
            if (this.field927 != null && (this.field901 == null || this.field901[0] == 10)) {
                this.field923 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field899[var1] != null) {
                    this.field923 = 1;
                }
            }
        }
        if (this.field949 == -1) {
            this.field949 = this.field925 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aw.s(Ldq;I)V")
    public void method764(class120 arg0) {
        while (true) {
            int var2 = arg0.method2355();
            if (var2 == 0) {
                return;
            }
            this.method810(arg0, var2);
        }
    }

    @ObfuscatedName("aw.p(Ldq;II)V")
    public void method810(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2355();
            if (var3 > 0) {
                if (this.field927 == null || field940) {
                    this.field901 = new int[var3];
                    this.field927 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field927[var4] = arg0.method2532();
                        this.field901[var4] = arg0.method2355();
                    }
                } else {
                    arg0.field1977 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field910 = arg0.method2363();
        } else if (arg1 == 5) {
            int var5 = arg0.method2355();
            if (var5 > 0) {
                if (this.field927 == null || field940) {
                    this.field901 = null;
                    this.field927 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field927[var6] = arg0.method2532();
                    }
                } else {
                    arg0.field1977 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field909 = arg0.method2355();
        } else if (arg1 == 15) {
            this.field916 = arg0.method2355();
        } else if (arg1 == 17) {
            this.field925 = 0;
            this.field918 = false;
        } else if (arg1 == 18) {
            this.field918 = false;
        } else if (arg1 == 19) {
            this.field923 = arg0.method2355();
        } else if (arg1 == 21) {
            this.field920 = 0;
        } else if (arg1 == 22) {
            this.field921 = true;
        } else if (arg1 == 23) {
            this.field922 = true;
        } else if (arg1 == 24) {
            this.field939 = arg0.method2532();
            if (this.field939 == 65535) {
                this.field939 = -1;
            }
        } else if (arg1 == 27) {
            this.field925 = 1;
        } else if (arg1 == 28) {
            this.field946 = arg0.method2355();
        } else if (arg1 == 29) {
            this.field908 = arg0.method2465();
        } else if (arg1 == 39) {
            this.field926 = arg0.method2465() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field899[arg1 - 30] = arg0.method2363();
            if (this.field899[arg1 - 30].equalsIgnoreCase(class158.field2310)) {
                this.field899[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2355();
            this.field911 = new short[var7];
            this.field912 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field911[var8] = (short) arg0.method2532();
                this.field912[var8] = (short) arg0.method2532();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2355();
            this.field913 = new short[var9];
            this.field914 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field913[var10] = (short) arg0.method2532();
                this.field914[var10] = (short) arg0.method2532();
            }
        } else if (arg1 == 60) {
            this.field928 = arg0.method2532();
        } else if (arg1 == 62) {
            this.field945 = true;
        } else if (arg1 == 64) {
            this.field931 = false;
        } else if (arg1 == 65) {
            this.field932 = arg0.method2532();
        } else if (arg1 == 66) {
            this.field933 = arg0.method2532();
        } else if (arg1 == 67) {
            this.field934 = arg0.method2532();
        } else if (arg1 == 68) {
            this.field917 = arg0.method2532();
        } else if (arg1 == 69) {
            arg0.method2355();
        } else if (arg1 == 70) {
            this.field935 = arg0.method2358();
        } else if (arg1 == 71) {
            this.field919 = arg0.method2358();
        } else if (arg1 == 72) {
            this.field937 = arg0.method2358();
        } else if (arg1 == 73) {
            this.field941 = true;
        } else if (arg1 == 74) {
            this.field915 = true;
        } else if (arg1 == 75) {
            this.field949 = arg0.method2355();
        } else if (arg1 == 77) {
            this.field942 = arg0.method2532();
            if (this.field942 == 65535) {
                this.field942 = -1;
            }
            this.field943 = arg0.method2532();
            if (this.field943 == 65535) {
                this.field943 = -1;
            }
            int var11 = arg0.method2355();
            this.field924 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field924[var12] = arg0.method2532();
                if (this.field924[var12] == 65535) {
                    this.field924[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field944 = arg0.method2532();
            this.field936 = arg0.method2355();
        } else if (arg1 == 79) {
            this.field938 = arg0.method2532();
            this.field947 = arg0.method2532();
            this.field936 = arg0.method2355();
            int var13 = arg0.method2355();
            this.field948 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field948[var14] = arg0.method2532();
            }
        } else if (arg1 == 81) {
            this.field920 = arg0.method2355() * 256;
        }
    }

    @ObfuscatedName("aw.h(IS)Z")
    public final boolean method766(int arg0) {
        if (this.field901 != null) {
            for (int var4 = 0; var4 < this.field901.length; var4++) {
                if (this.field901[var4] == arg0) {
                    return Statics.field902.method3032(this.field927[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field927 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field927.length; var3++) {
                var2 &= Statics.field902.method3032(this.field927[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aw.g(I)Z")
    public final boolean method767() {
        if (this.field927 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field927.length; var2++) {
            var1 &= Statics.field902.method3032(this.field927[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("aw.a(II[[IIIII)Lch;")
    public final class86 method768(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field901 == null) {
            var7 = (long) ((this.field907 << 10) + arg1);
        } else {
            var7 = (long) ((this.field907 << 10) + (arg0 << 3) + arg1);
        }
        class86 var9 = (class86) field904.method3473(var7);
        if (var9 == null) {
            class101 var10 = this.method785(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field921) {
                var10.field1699 = (short) (this.field908 + 64);
                var10.field1700 = (short) (this.field926 + 768);
                var10.method2080();
                var9 = var10;
            } else {
                var9 = var10.method2078(this.field908 + 64, this.field926 + 768, -50, -10, -50);
            }
            field904.method3475(var9, var7);
        }
        if (this.field921) {
            var9 = ((class101) var9).method2138();
        }
        if (this.field920 >= 0) {
            if (var9 instanceof class106) {
                var9 = ((class106) var9).method2208(arg2, arg3, arg4, arg5, true, this.field920);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2086(arg2, arg3, arg4, arg5, true, this.field920);
            }
        }
        return var9;
    }

    @ObfuscatedName("aw.r(II[[IIIII)Ldy;")
    public final class106 method774(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field901 == null) {
            var7 = (long) ((this.field907 << 10) + arg1);
        } else {
            var7 = (long) ((this.field907 << 10) + (arg0 << 3) + arg1);
        }
        class106 var9 = (class106) field905.method3473(var7);
        if (var9 == null) {
            class101 var10 = this.method785(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2078(this.field908 + 64, this.field926 + 768, -50, -10, -50);
            field905.method3475(var9, var7);
        }
        if (this.field920 >= 0) {
            var9 = var9.method2208(arg2, arg3, arg4, arg5, true, this.field920);
        }
        return var9;
    }

    @ObfuscatedName("aw.k(II[[IIIILaa;II)Ldy;")
    public final class106 method770(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field901 == null) {
            var9 = (long) ((this.field907 << 10) + arg1);
        } else {
            var9 = (long) ((this.field907 << 10) + (arg0 << 3) + arg1);
        }
        class106 var11 = (class106) field905.method3473(var9);
        if (var11 == null) {
            class101 var12 = this.method785(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2078(this.field908 + 64, this.field926 + 768, -50, -10, -50);
            field905.method3475(var11, var9);
        }
        if (arg6 == null && this.field920 == -1) {
            return var11;
        }
        class106 var13;
        if (arg6 == null) {
            var13 = var11.method2166(true);
        } else {
            var13 = arg6.method836(var11, arg7, arg1);
        }
        if (this.field920 >= 0) {
            var13 = var13.method2208(arg2, arg3, arg4, arg5, false, this.field920);
        }
        return var13;
    }

    @ObfuscatedName("aw.m(III)Lcp;")
    public final class101 method785(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field901 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field927 == null) {
                return null;
            }
            boolean var4 = this.field945;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field927.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field927[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field903.method3473((long) var7);
                if (var3 == null) {
                    var3 = class101.method2063(Statics.field902, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2124();
                    }
                    field903.method3475(var3, (long) var7);
                }
                if (var5 > 1) {
                    field906[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field906, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field901.length; var9++) {
                if (this.field901[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field927[var8];
            boolean var11 = this.field945 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field903.method3473((long) var10);
            if (var3 == null) {
                var3 = class101.method2063(Statics.field902, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2124();
                }
                field903.method3475(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field932 == 128 && this.field933 == 128 && this.field934 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field935 == 0 && this.field919 == 0 && this.field937 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field911 == null, this.field913 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2074(256);
            var14.method2075(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2114();
        } else if (var15 == 2) {
            var14.method2072();
        } else if (var15 == 3) {
            var14.method2073();
        }
        if (this.field911 != null) {
            for (int var16 = 0; var16 < this.field911.length; var16++) {
                var14.method2076(this.field911[var16], this.field912[var16]);
            }
        }
        if (this.field913 != null) {
            for (int var17 = 0; var17 < this.field913.length; var17++) {
                var14.method2077(this.field913[var17], this.field914[var17]);
            }
        }
        if (var12) {
            var14.method2091(this.field932, this.field933, this.field934);
        }
        if (var13) {
            var14.method2075(this.field935, this.field919, this.field937);
        }
        return var14;
    }

    @ObfuscatedName("aw.n(I)Law;")
    public final class41 method772() {
        int var1 = -1;
        if (this.field942 != -1) {
            var1 = class177.method2798(this.field942);
        } else if (this.field943 != -1) {
            var1 = class177.field2904[this.field943];
        }
        return var1 < 0 || var1 >= this.field924.length || this.field924[var1] == -1 ? null : method626(this.field924[var1]);
    }

    @ObfuscatedName("aw.y(I)Z")
    public boolean method798() {
        if (this.field924 == null) {
            return this.field944 != -1 || this.field948 != null;
        }
        for (int var1 = 0; var1 < this.field924.length; var1++) {
            if (this.field924[var1] != -1) {
                class41 var2 = method626(this.field924[var1]);
                if (var2.field944 != -1 || var2.field948 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
