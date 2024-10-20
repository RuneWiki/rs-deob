package deob;

@ObfuscatedName("ar")
public class class41 extends class204 {

    @ObfuscatedName("ar.j")
    public static boolean field925 = false;

    @ObfuscatedName("ar.l")
    public static class193 field953 = new class193(64);

    @ObfuscatedName("ar.u")
    public static class193 field908 = new class193(500);

    @ObfuscatedName("ar.a")
    public static class193 field909 = new class193(30);

    @ObfuscatedName("ar.h")
    public static class193 field910 = new class193(30);

    @ObfuscatedName("ar.i")
    public static class100[] field928 = new class100[4];

    @ObfuscatedName("ar.t")
    public int field936;

    @ObfuscatedName("ar.k")
    public int[] field913;

    @ObfuscatedName("ar.s")
    public int[] field914;

    @ObfuscatedName("ar.w")
    public String field915 = "null";

    @ObfuscatedName("ar.e")
    public short[] field916;

    @ObfuscatedName("ar.z")
    public short[] field917;

    @ObfuscatedName("ar.p")
    public short[] field949;

    @ObfuscatedName("ar.r")
    public short[] field924;

    @ObfuscatedName("ar.g")
    public int field920 = 1;

    @ObfuscatedName("ar.n")
    public int field921 = 1;

    @ObfuscatedName("ar.y")
    public int field922 = 2;

    @ObfuscatedName("ar.v")
    public boolean field923 = true;

    @ObfuscatedName("ar.q")
    public int field938 = -1;

    @ObfuscatedName("ar.x")
    public int field943 = -1;

    @ObfuscatedName("ar.d")
    public boolean field918 = false;

    @ObfuscatedName("ar.o")
    public boolean field927 = false;

    @ObfuscatedName("ar.c")
    public int field926 = -1;

    @ObfuscatedName("ar.b")
    public int field929 = 16;

    @ObfuscatedName("ar.aa")
    public int field930 = 0;

    @ObfuscatedName("ar.ao")
    public int field931 = 0;

    @ObfuscatedName("ar.as")
    public String[] field932 = new String[5];

    @ObfuscatedName("ar.ae")
    public int field911 = -1;

    @ObfuscatedName("ar.ai")
    public int field935 = -1;

    @ObfuscatedName("ar.am")
    public boolean field934 = false;

    @ObfuscatedName("ar.ax")
    public boolean field912 = true;

    @ObfuscatedName("ar.ay")
    public int field937 = 128;

    @ObfuscatedName("ar.az")
    public int field942 = 128;

    @ObfuscatedName("ar.av")
    public int field939 = 128;

    @ObfuscatedName("ar.ap")
    public int field940 = 0;

    @ObfuscatedName("ar.at")
    public int field941 = 0;

    @ObfuscatedName("ar.al")
    public int field919 = 0;

    @ObfuscatedName("ar.ac")
    public boolean field906 = false;

    @ObfuscatedName("ar.ar")
    public boolean field944 = false;

    @ObfuscatedName("ar.ah")
    public int field945 = -1;

    @ObfuscatedName("ar.ak")
    public int[] field946;

    @ObfuscatedName("ar.ag")
    public int field947 = -1;

    @ObfuscatedName("ar.aq")
    public int field948 = -1;

    @ObfuscatedName("ar.au")
    public int field907 = -1;

    @ObfuscatedName("ar.aw")
    public int field950 = 0;

    @ObfuscatedName("ar.ad")
    public int field951 = 0;

    @ObfuscatedName("ar.af")
    public int field952 = 0;

    @ObfuscatedName("ar.aj")
    public int[] field956;

    @ObfuscatedName("ay.j(IB)Lar;")
    public static class41 method736(int arg0) {
        class41 var1 = (class41) field953.method3543((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field991.method3124(6, arg0);
        class41 var3 = new class41();
        var3.field936 = arg0;
        if (var2 != null) {
            var3.method812(new class119(var2));
        }
        var3.method811();
        if (var3.field944) {
            var3.field922 = 0;
            var3.field923 = false;
        }
        field953.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ar.m(I)V")
    public void method811() {
        if (this.field938 == -1) {
            this.field938 = 0;
            if (this.field913 != null && (this.field914 == null || this.field914[0] == 10)) {
                this.field938 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field932[var1] != null) {
                    this.field938 = 1;
                }
            }
        }
        if (this.field945 == -1) {
            this.field945 = this.field922 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ar.f(Ldc;I)V")
    public void method812(class119 arg0) {
        while (true) {
            int var2 = arg0.method2372();
            if (var2 == 0) {
                return;
            }
            this.method842(arg0, var2);
        }
    }

    @ObfuscatedName("ar.l(Ldc;II)V")
    public void method842(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2372();
            if (var3 > 0) {
                if (this.field913 == null || field925) {
                    this.field914 = new int[var3];
                    this.field913 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field913[var4] = arg0.method2374();
                        this.field914[var4] = arg0.method2372();
                    }
                } else {
                    arg0.field1982 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field915 = arg0.method2380();
        } else if (arg1 == 5) {
            int var5 = arg0.method2372();
            if (var5 > 0) {
                if (this.field913 == null || field925) {
                    this.field914 = null;
                    this.field913 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field913[var6] = arg0.method2374();
                    }
                } else {
                    arg0.field1982 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field920 = arg0.method2372();
        } else if (arg1 == 15) {
            this.field921 = arg0.method2372();
        } else if (arg1 == 17) {
            this.field922 = 0;
            this.field923 = false;
        } else if (arg1 == 18) {
            this.field923 = false;
        } else if (arg1 == 19) {
            this.field938 = arg0.method2372();
        } else if (arg1 == 21) {
            this.field943 = 0;
        } else if (arg1 == 22) {
            this.field918 = true;
        } else if (arg1 == 23) {
            this.field927 = true;
        } else if (arg1 == 24) {
            this.field926 = arg0.method2374();
            if (this.field926 == 65535) {
                this.field926 = -1;
            }
        } else if (arg1 == 27) {
            this.field922 = 1;
        } else if (arg1 == 28) {
            this.field929 = arg0.method2372();
        } else if (arg1 == 29) {
            this.field930 = arg0.method2373();
        } else if (arg1 == 39) {
            this.field931 = arg0.method2373();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field932[arg1 - 30] = arg0.method2380();
            if (this.field932[arg1 - 30].equalsIgnoreCase(class157.field2300)) {
                this.field932[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2372();
            this.field916 = new short[var7];
            this.field917 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field916[var8] = (short) arg0.method2374();
                this.field917[var8] = (short) arg0.method2374();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2372();
            this.field949 = new short[var9];
            this.field924 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field949[var10] = (short) arg0.method2374();
                this.field924[var10] = (short) arg0.method2374();
            }
        } else if (arg1 == 60) {
            this.field911 = arg0.method2374();
        } else if (arg1 == 62) {
            this.field934 = true;
        } else if (arg1 == 64) {
            this.field912 = false;
        } else if (arg1 == 65) {
            this.field937 = arg0.method2374();
        } else if (arg1 == 66) {
            this.field942 = arg0.method2374();
        } else if (arg1 == 67) {
            this.field939 = arg0.method2374();
        } else if (arg1 == 68) {
            this.field935 = arg0.method2374();
        } else if (arg1 == 69) {
            arg0.method2372();
        } else if (arg1 == 70) {
            this.field940 = arg0.method2375();
        } else if (arg1 == 71) {
            this.field941 = arg0.method2375();
        } else if (arg1 == 72) {
            this.field919 = arg0.method2375();
        } else if (arg1 == 73) {
            this.field906 = true;
        } else if (arg1 == 74) {
            this.field944 = true;
        } else if (arg1 == 75) {
            this.field945 = arg0.method2372();
        } else if (arg1 == 77) {
            this.field947 = arg0.method2374();
            if (this.field947 == 65535) {
                this.field947 = -1;
            }
            this.field948 = arg0.method2374();
            if (this.field948 == 65535) {
                this.field948 = -1;
            }
            int var11 = arg0.method2372();
            this.field946 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field946[var12] = arg0.method2374();
                if (this.field946[var12] == 65535) {
                    this.field946[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field907 = arg0.method2374();
            this.field950 = arg0.method2372();
        } else if (arg1 == 79) {
            this.field951 = arg0.method2374();
            this.field952 = arg0.method2374();
            this.field950 = arg0.method2372();
            int var13 = arg0.method2372();
            this.field956 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field956[var14] = arg0.method2374();
            }
        } else if (arg1 == 81) {
            this.field943 = arg0.method2372() * 256;
        }
    }

    @ObfuscatedName("ar.u(II)Z")
    public final boolean method814(int arg0) {
        if (this.field914 != null) {
            for (int var4 = 0; var4 < this.field914.length; var4++) {
                if (this.field914[var4] == arg0) {
                    return Statics.field3214.method3086(this.field913[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field913 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field913.length; var3++) {
                var2 &= Statics.field3214.method3086(this.field913[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ar.a(I)Z")
    public final boolean method810() {
        if (this.field913 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field913.length; var2++) {
            var1 &= Statics.field3214.method3086(this.field913[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ar.h(II[[IIIII)Lcm;")
    public final class85 method816(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field914 == null) {
            var7 = (long) ((this.field936 << 10) + arg1);
        } else {
            var7 = (long) ((this.field936 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field909.method3543(var7);
        if (var9 == null) {
            class100 var10 = this.method819(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field918) {
                var10.field1673 = (short) (this.field930 + 64);
                var10.field1696 = (short) (this.field931 * 25 + 768);
                var10.method2081();
                var9 = var10;
            } else {
                var9 = var10.method2092(this.field930 + 64, this.field931 * 25 + 768, -50, -10, -50);
            }
            field909.method3540(var9, var7);
        }
        if (this.field918) {
            var9 = ((class100) var9).method2149();
        }
        if (this.field943 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2187(arg2, arg3, arg4, arg5, true, this.field943);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2070(arg2, arg3, arg4, arg5, true, this.field943);
            }
        }
        return var9;
    }

    @ObfuscatedName("ar.i(II[[IIIIB)Lda;")
    public final class105 method817(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field914 == null) {
            var7 = (long) ((this.field936 << 10) + arg1);
        } else {
            var7 = (long) ((this.field936 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field910.method3543(var7);
        if (var9 == null) {
            class100 var10 = this.method819(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2092(this.field930 + 64, this.field931 * 25 + 768, -50, -10, -50);
            field910.method3540(var9, var7);
        }
        if (this.field943 >= 0) {
            var9 = var9.method2187(arg2, arg3, arg4, arg5, true, this.field943);
        }
        return var9;
    }

    @ObfuscatedName("ar.t(II[[IIIILak;IB)Lda;")
    public final class105 method833(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field914 == null) {
            var9 = (long) ((this.field936 << 10) + arg1);
        } else {
            var9 = (long) ((this.field936 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field910.method3543(var9);
        if (var11 == null) {
            class100 var12 = this.method819(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2092(this.field930 + 64, this.field931 * 25 + 768, -50, -10, -50);
            field910.method3540(var11, var9);
        }
        if (arg6 == null && this.field943 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2209(true);
        } else {
            var13 = arg6.method897(var11, arg7, arg1);
        }
        if (this.field943 >= 0) {
            var13 = var13.method2187(arg2, arg3, arg4, arg5, false, this.field943);
        }
        return var13;
    }

    @ObfuscatedName("ar.k(III)Lcy;")
    public final class100 method819(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field914 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field913 == null) {
                return null;
            }
            boolean var4 = this.field934;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field913.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field913[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field908.method3543((long) var7);
                if (var3 == null) {
                    var3 = class100.method2063(Statics.field3214, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2079();
                    }
                    field908.method3540(var3, (long) var7);
                }
                if (var5 > 1) {
                    field928[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field928, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field914.length; var9++) {
                if (this.field914[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field913[var8];
            boolean var11 = this.field934 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field908.method3543((long) var10);
            if (var3 == null) {
                var3 = class100.method2063(Statics.field3214, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2079();
                }
                field908.method3540(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field937 == 128 && this.field942 == 128 && this.field939 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field940 == 0 && this.field941 == 0 && this.field919 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field916 == null, this.field949 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2075(256);
            var14.method2084(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2072();
        } else if (var15 == 2) {
            var14.method2073();
        } else if (var15 == 3) {
            var14.method2148();
        }
        if (this.field916 != null) {
            for (int var16 = 0; var16 < this.field916.length; var16++) {
                var14.method2143(this.field916[var16], this.field917[var16]);
            }
        }
        if (this.field949 != null) {
            for (int var17 = 0; var17 < this.field949.length; var17++) {
                var14.method2078(this.field949[var17], this.field924[var17]);
            }
        }
        if (var12) {
            var14.method2080(this.field937, this.field942, this.field939);
        }
        if (var13) {
            var14.method2084(this.field940, this.field941, this.field919);
        }
        return var14;
    }

    @ObfuscatedName("ar.s(B)Lar;")
    public final class41 method813() {
        int var1 = -1;
        if (this.field947 != -1) {
            var1 = class176.method2999(this.field947);
        } else if (this.field948 != -1) {
            var1 = class176.field2885[this.field948];
        }
        return var1 < 0 || var1 >= this.field946.length || this.field946[var1] == -1 ? null : method736(this.field946[var1]);
    }

    @ObfuscatedName("d.w(I)V")
    public static void method605() {
        field953.method3541();
        field908.method3541();
        field909.method3541();
        field910.method3541();
    }

    @ObfuscatedName("ar.e(B)Z")
    public boolean method821() {
        if (this.field946 == null) {
            return this.field907 != -1 || this.field956 != null;
        }
        for (int var1 = 0; var1 < this.field946.length; var1++) {
            if (this.field946[var1] != -1) {
                class41 var2 = method736(this.field946[var1]);
                if (var2.field907 != -1 || var2.field956 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
