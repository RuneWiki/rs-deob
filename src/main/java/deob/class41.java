package deob;

@ObfuscatedName("ay")
public class class41 extends class205 {

    @ObfuscatedName("ay.s")
    public static boolean field952 = false;

    @ObfuscatedName("ay.x")
    public static class194 field927 = new class194(64);

    @ObfuscatedName("ay.d")
    public static class194 field928 = new class194(500);

    @ObfuscatedName("ay.u")
    public static class194 field929 = new class194(30);

    @ObfuscatedName("ay.o")
    public static class194 field957 = new class194(30);

    @ObfuscatedName("ay.b")
    public static class101[] field931 = new class101[4];

    @ObfuscatedName("ay.k")
    public int field932;

    @ObfuscatedName("ay.c")
    public int[] field933;

    @ObfuscatedName("ay.l")
    public int[] field934;

    @ObfuscatedName("ay.t")
    public String field935 = "null";

    @ObfuscatedName("ay.i")
    public short[] field936;

    @ObfuscatedName("ay.r")
    public short[] field926;

    @ObfuscatedName("ay.m")
    public short[] field938;

    @ObfuscatedName("ay.e")
    public short[] field939;

    @ObfuscatedName("ay.h")
    public int field940 = 1;

    @ObfuscatedName("ay.z")
    public int field967 = 1;

    @ObfuscatedName("ay.a")
    public int field942 = 2;

    @ObfuscatedName("ay.w")
    public boolean field964 = true;

    @ObfuscatedName("ay.g")
    public int field944 = -1;

    @ObfuscatedName("ay.y")
    public int field949 = -1;

    @ObfuscatedName("ay.f")
    public boolean field946 = false;

    @ObfuscatedName("ay.q")
    public boolean field971 = false;

    @ObfuscatedName("ay.n")
    public int field956 = -1;

    @ObfuscatedName("ay.v")
    public int field947 = 16;

    @ObfuscatedName("ay.ab")
    public int field943 = 0;

    @ObfuscatedName("ay.ad")
    public int field951 = 0;

    @ObfuscatedName("ay.an")
    public String[] field963 = new String[5];

    @ObfuscatedName("ay.au")
    public int field953 = -1;

    @ObfuscatedName("ay.ap")
    public int field954 = -1;

    @ObfuscatedName("ay.am")
    public boolean field955 = false;

    @ObfuscatedName("ay.ae")
    public boolean field972 = true;

    @ObfuscatedName("ay.ao")
    public int field950 = 128;

    @ObfuscatedName("ay.as")
    public int field958 = 128;

    @ObfuscatedName("ay.ai")
    public int field959 = 128;

    @ObfuscatedName("ay.ah")
    public int field960 = 0;

    @ObfuscatedName("ay.ax")
    public int field961 = 0;

    @ObfuscatedName("ay.aa")
    public int field962 = 0;

    @ObfuscatedName("ay.aq")
    public boolean field945 = false;

    @ObfuscatedName("ay.ay")
    public boolean field930 = false;

    @ObfuscatedName("ay.aj")
    public int field965 = -1;

    @ObfuscatedName("ay.ar")
    public int[] field966;

    @ObfuscatedName("ay.aw")
    public int field948 = -1;

    @ObfuscatedName("ay.at")
    public int field968 = -1;

    @ObfuscatedName("ay.af")
    public int field937 = -1;

    @ObfuscatedName("ay.al")
    public int field970 = 0;

    @ObfuscatedName("ay.ag")
    public int field941 = 0;

    @ObfuscatedName("ay.ac")
    public int field969 = 0;

    @ObfuscatedName("ay.ak")
    public int[] field973;

    @ObfuscatedName("c.s(II)Lay;")
    public static class41 method118(int arg0) {
        class41 var1 = (class41) field927.method3484((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1783.method3014(6, arg0);
        class41 var3 = new class41();
        var3.field932 = arg0;
        if (var2 != null) {
            var3.method755(new class120(var2));
        }
        var3.method777();
        if (var3.field930) {
            var3.field942 = 0;
            var3.field964 = false;
        }
        field927.method3486(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.j(I)V")
    public void method777() {
        if (this.field944 == -1) {
            this.field944 = 0;
            if (this.field933 != null && (this.field934 == null || this.field934[0] == 10)) {
                this.field944 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field963[var1] != null) {
                    this.field944 = 1;
                }
            }
        }
        if (this.field965 == -1) {
            this.field965 = this.field942 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ay.p(Lds;I)V")
    public void method755(class120 arg0) {
        while (true) {
            int var2 = arg0.method2338();
            if (var2 == 0) {
                return;
            }
            this.method753(arg0, var2);
        }
    }

    @ObfuscatedName("ay.x(Lds;II)V")
    public void method753(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2338();
            if (var3 > 0) {
                if (this.field933 == null || field952) {
                    this.field934 = new int[var3];
                    this.field933 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field933[var4] = arg0.method2430();
                        this.field934[var4] = arg0.method2338();
                    }
                } else {
                    arg0.field2006 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field935 = arg0.method2346();
        } else if (arg1 == 5) {
            int var5 = arg0.method2338();
            if (var5 > 0) {
                if (this.field933 == null || field952) {
                    this.field934 = null;
                    this.field933 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field933[var6] = arg0.method2430();
                    }
                } else {
                    arg0.field2006 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field940 = arg0.method2338();
        } else if (arg1 == 15) {
            this.field967 = arg0.method2338();
        } else if (arg1 == 17) {
            this.field942 = 0;
            this.field964 = false;
        } else if (arg1 == 18) {
            this.field964 = false;
        } else if (arg1 == 19) {
            this.field944 = arg0.method2338();
        } else if (arg1 == 21) {
            this.field949 = 0;
        } else if (arg1 == 22) {
            this.field946 = true;
        } else if (arg1 == 23) {
            this.field971 = true;
        } else if (arg1 == 24) {
            this.field956 = arg0.method2430();
            if (this.field956 == 65535) {
                this.field956 = -1;
            }
        } else if (arg1 == 27) {
            this.field942 = 1;
        } else if (arg1 == 28) {
            this.field947 = arg0.method2338();
        } else if (arg1 == 29) {
            this.field943 = arg0.method2339();
        } else if (arg1 == 39) {
            this.field951 = arg0.method2339() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field963[arg1 - 30] = arg0.method2346();
            if (this.field963[arg1 - 30].equalsIgnoreCase(class158.field2346)) {
                this.field963[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2338();
            this.field936 = new short[var7];
            this.field926 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field936[var8] = (short) arg0.method2430();
                this.field926[var8] = (short) arg0.method2430();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2338();
            this.field938 = new short[var9];
            this.field939 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field938[var10] = (short) arg0.method2430();
                this.field939[var10] = (short) arg0.method2430();
            }
        } else if (arg1 == 60) {
            this.field953 = arg0.method2430();
        } else if (arg1 == 62) {
            this.field955 = true;
        } else if (arg1 == 64) {
            this.field972 = false;
        } else if (arg1 == 65) {
            this.field950 = arg0.method2430();
        } else if (arg1 == 66) {
            this.field958 = arg0.method2430();
        } else if (arg1 == 67) {
            this.field959 = arg0.method2430();
        } else if (arg1 == 68) {
            this.field954 = arg0.method2430();
        } else if (arg1 == 69) {
            arg0.method2338();
        } else if (arg1 == 70) {
            this.field960 = arg0.method2341();
        } else if (arg1 == 71) {
            this.field961 = arg0.method2341();
        } else if (arg1 == 72) {
            this.field962 = arg0.method2341();
        } else if (arg1 == 73) {
            this.field945 = true;
        } else if (arg1 == 74) {
            this.field930 = true;
        } else if (arg1 == 75) {
            this.field965 = arg0.method2338();
        } else if (arg1 == 77) {
            this.field948 = arg0.method2430();
            if (this.field948 == 65535) {
                this.field948 = -1;
            }
            this.field968 = arg0.method2430();
            if (this.field968 == 65535) {
                this.field968 = -1;
            }
            int var11 = arg0.method2338();
            this.field966 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field966[var12] = arg0.method2430();
                if (this.field966[var12] == 65535) {
                    this.field966[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field937 = arg0.method2430();
            this.field970 = arg0.method2338();
        } else if (arg1 == 79) {
            this.field941 = arg0.method2430();
            this.field969 = arg0.method2430();
            this.field970 = arg0.method2338();
            int var13 = arg0.method2338();
            this.field973 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field973[var14] = arg0.method2430();
            }
        } else if (arg1 == 81) {
            this.field949 = arg0.method2338() * 256;
        }
    }

    @ObfuscatedName("ay.d(II)Z")
    public final boolean method787(int arg0) {
        if (this.field934 != null) {
            for (int var4 = 0; var4 < this.field934.length; var4++) {
                if (this.field934[var4] == arg0) {
                    return Statics.field575.method3047(this.field933[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field933 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field933.length; var3++) {
                var2 &= Statics.field575.method3047(this.field933[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ay.u(I)Z")
    public final boolean method788() {
        if (this.field933 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field933.length; var2++) {
            var1 &= Statics.field575.method3047(this.field933[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ay.o(II[[IIIII)Lca;")
    public final class86 method759(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field934 == null) {
            var7 = (long) ((this.field932 << 10) + arg1);
        } else {
            var7 = (long) ((this.field932 << 10) + (arg0 << 3) + arg1);
        }
        class86 var9 = (class86) field929.method3484(var7);
        if (var9 == null) {
            class101 var10 = this.method762(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field946) {
                var10.field1718 = (short) (this.field943 + 64);
                var10.field1733 = (short) (this.field951 + 768);
                var10.method2057();
                var9 = var10;
            } else {
                var9 = var10.method2061(this.field943 + 64, this.field951 + 768, -50, -10, -50);
            }
            field929.method3486(var9, var7);
        }
        if (this.field946) {
            var9 = ((class101) var9).method2045();
        }
        if (this.field949 >= 0) {
            if (var9 instanceof class106) {
                var9 = ((class106) var9).method2141(arg2, arg3, arg4, arg5, true, this.field949);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2046(arg2, arg3, arg4, arg5, true, this.field949);
            }
        }
        return var9;
    }

    @ObfuscatedName("ay.b(II[[IIIIB)Ldh;")
    public final class106 method760(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field934 == null) {
            var7 = (long) ((this.field932 << 10) + arg1);
        } else {
            var7 = (long) ((this.field932 << 10) + (arg0 << 3) + arg1);
        }
        class106 var9 = (class106) field957.method3484(var7);
        if (var9 == null) {
            class101 var10 = this.method762(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2061(this.field943 + 64, this.field951 + 768, -50, -10, -50);
            field957.method3486(var9, var7);
        }
        if (this.field949 >= 0) {
            var9 = var9.method2141(arg2, arg3, arg4, arg5, true, this.field949);
        }
        return var9;
    }

    @ObfuscatedName("ay.k(II[[IIIILar;II)Ldh;")
    public final class106 method776(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field934 == null) {
            var9 = (long) ((this.field932 << 10) + arg1);
        } else {
            var9 = (long) ((this.field932 << 10) + (arg0 << 3) + arg1);
        }
        class106 var11 = (class106) field957.method3484(var9);
        if (var11 == null) {
            class101 var12 = this.method762(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2061(this.field943 + 64, this.field951 + 768, -50, -10, -50);
            field957.method3486(var11, var9);
        }
        if (arg6 == null && this.field949 == -1) {
            return var11;
        }
        class106 var13;
        if (arg6 == null) {
            var13 = var11.method2142(true);
        } else {
            var13 = arg6.method825(var11, arg7, arg1);
        }
        if (this.field949 >= 0) {
            var13 = var13.method2141(arg2, arg3, arg4, arg5, false, this.field949);
        }
        return var13;
    }

    @ObfuscatedName("ay.c(III)Lcq;")
    public final class101 method762(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field934 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field933 == null) {
                return null;
            }
            boolean var4 = this.field955;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field933.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field933[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field928.method3484((long) var7);
                if (var3 == null) {
                    var3 = class101.method2040(Statics.field575, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2087();
                    }
                    field928.method3486(var3, (long) var7);
                }
                if (var5 > 1) {
                    field931[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field931, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field934.length; var9++) {
                if (this.field934[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field933[var8];
            boolean var11 = this.field955 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field928.method3484((long) var10);
            if (var3 == null) {
                var3 = class101.method2040(Statics.field575, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2087();
                }
                field928.method3486(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field950 == 128 && this.field958 == 128 && this.field959 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field960 == 0 && this.field961 == 0 && this.field962 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field936 == null, this.field938 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2051(256);
            var14.method2052(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2048();
        } else if (var15 == 2) {
            var14.method2049();
        } else if (var15 == 3) {
            var14.method2050();
        }
        if (this.field936 != null) {
            for (int var16 = 0; var16 < this.field936.length; var16++) {
                var14.method2053(this.field936[var16], this.field926[var16]);
            }
        }
        if (this.field938 != null) {
            for (int var17 = 0; var17 < this.field938.length; var17++) {
                var14.method2054(this.field938[var17], this.field939[var17]);
            }
        }
        if (var12) {
            var14.method2056(this.field950, this.field958, this.field959);
        }
        if (var13) {
            var14.method2052(this.field960, this.field961, this.field962);
        }
        return var14;
    }

    @ObfuscatedName("ay.l(I)Lay;")
    public final class41 method763() {
        int var1 = -1;
        if (this.field948 != -1) {
            var1 = class177.method680(this.field948);
        } else if (this.field968 != -1) {
            var1 = class177.field2921[this.field968];
        }
        return var1 < 0 || var1 >= this.field966.length || this.field966[var1] == -1 ? null : method118(this.field966[var1]);
    }

    @ObfuscatedName("fr.t(I)V")
    public static void method3113() {
        field927.method3491();
        field928.method3491();
        field929.method3491();
        field957.method3491();
    }

    @ObfuscatedName("ay.i(I)Z")
    public boolean method764() {
        if (this.field966 == null) {
            return this.field937 != -1 || this.field973 != null;
        }
        for (int var1 = 0; var1 < this.field966.length; var1++) {
            if (this.field966[var1] != -1) {
                class41 var2 = method118(this.field966[var1]);
                if (var2.field937 != -1 || var2.field973 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
