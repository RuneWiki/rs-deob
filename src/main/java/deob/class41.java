package deob;

@ObfuscatedName("am")
public class class41 extends class204 {

    @ObfuscatedName("am.f")
    public static boolean field970 = false;

    @ObfuscatedName("am.g")
    public static class193 field927 = new class193(64);

    @ObfuscatedName("am.m")
    public static class193 field928 = new class193(500);

    @ObfuscatedName("am.t")
    public static class193 field929 = new class193(30);

    @ObfuscatedName("am.j")
    public static class193 field930 = new class193(30);

    @ObfuscatedName("am.n")
    public static class100[] field931 = new class100[4];

    @ObfuscatedName("am.l")
    public int field932;

    @ObfuscatedName("am.i")
    public int[] field933;

    @ObfuscatedName("am.w")
    public int[] field943;

    @ObfuscatedName("am.v")
    public String field935 = "null";

    @ObfuscatedName("am.o")
    public short[] field936;

    @ObfuscatedName("am.p")
    public short[] field951;

    @ObfuscatedName("am.b")
    public short[] field938;

    @ObfuscatedName("am.z")
    public short[] field939;

    @ObfuscatedName("am.k")
    public int field968 = 1;

    @ObfuscatedName("am.r")
    public int field926 = 1;

    @ObfuscatedName("am.d")
    public int field973 = 2;

    @ObfuscatedName("am.u")
    public boolean field959 = true;

    @ObfuscatedName("am.a")
    public int field944 = -1;

    @ObfuscatedName("am.x")
    public int field945 = -1;

    @ObfuscatedName("am.y")
    public boolean field946 = false;

    @ObfuscatedName("am.c")
    public boolean field947 = false;

    @ObfuscatedName("am.h")
    public int field960 = -1;

    @ObfuscatedName("am.e")
    public int field949 = 16;

    @ObfuscatedName("am.ab")
    public int field950 = 0;

    @ObfuscatedName("am.af")
    public int field958 = 0;

    @ObfuscatedName("am.au")
    public String[] field942 = new String[5];

    @ObfuscatedName("am.ae")
    public int field953 = -1;

    @ObfuscatedName("am.ax")
    public int field954 = -1;

    @ObfuscatedName("am.az")
    public boolean field965 = false;

    @ObfuscatedName("am.aa")
    public boolean field956 = true;

    @ObfuscatedName("am.ak")
    public int field955 = 128;

    @ObfuscatedName("am.ac")
    public int field964 = 128;

    @ObfuscatedName("am.ar")
    public int field952 = 128;

    @ObfuscatedName("am.ah")
    public int field937 = 0;

    @ObfuscatedName("am.an")
    public int field934 = 0;

    @ObfuscatedName("am.aq")
    public int field962 = 0;

    @ObfuscatedName("am.at")
    public boolean field963 = false;

    @ObfuscatedName("am.am")
    public boolean field957 = false;

    @ObfuscatedName("am.av")
    public int field924 = -1;

    @ObfuscatedName("am.ai")
    public int[] field966;

    @ObfuscatedName("am.ay")
    public int field967 = -1;

    @ObfuscatedName("am.aw")
    public int field961 = -1;

    @ObfuscatedName("am.ap")
    public int field969 = -1;

    @ObfuscatedName("am.aj")
    public int field940 = 0;

    @ObfuscatedName("am.ao")
    public int field971 = 0;

    @ObfuscatedName("am.ad")
    public int field972 = 0;

    @ObfuscatedName("am.ag")
    public int[] field941;

    @ObfuscatedName("al.f(II)Lam;")
    public static class41 method1009(int arg0) {
        class41 var1 = (class41) field927.method3497((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field925.method3038(6, arg0);
        class41 var3 = new class41();
        var3.field932 = arg0;
        if (var2 != null) {
            var3.method772(new class119(var2));
        }
        var3.method774();
        if (var3.field957) {
            var3.field973 = 0;
            var3.field959 = false;
        }
        field927.method3508(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("am.s(B)V")
    public void method774() {
        if (this.field944 == -1) {
            this.field944 = 0;
            if (this.field933 != null && (this.field943 == null || this.field943[0] == 10)) {
                this.field944 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field942[var1] != null) {
                    this.field944 = 1;
                }
            }
        }
        if (this.field924 == -1) {
            this.field924 = this.field973 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("am.q(Ldn;I)V")
    public void method772(class119 arg0) {
        while (true) {
            int var2 = arg0.method2363();
            if (var2 == 0) {
                return;
            }
            this.method799(arg0, var2);
        }
    }

    @ObfuscatedName("am.g(Ldn;II)V")
    public void method799(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2363();
            if (var3 > 0) {
                if (this.field933 == null || field970) {
                    this.field943 = new int[var3];
                    this.field933 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field933[var4] = arg0.method2353();
                        this.field943[var4] = arg0.method2363();
                    }
                } else {
                    arg0.field1994 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field935 = arg0.method2365();
        } else if (arg1 == 5) {
            int var5 = arg0.method2363();
            if (var5 > 0) {
                if (this.field933 == null || field970) {
                    this.field943 = null;
                    this.field933 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field933[var6] = arg0.method2353();
                    }
                } else {
                    arg0.field1994 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field968 = arg0.method2363();
        } else if (arg1 == 15) {
            this.field926 = arg0.method2363();
        } else if (arg1 == 17) {
            this.field973 = 0;
            this.field959 = false;
        } else if (arg1 == 18) {
            this.field959 = false;
        } else if (arg1 == 19) {
            this.field944 = arg0.method2363();
        } else if (arg1 == 21) {
            this.field945 = 0;
        } else if (arg1 == 22) {
            this.field946 = true;
        } else if (arg1 == 23) {
            this.field947 = true;
        } else if (arg1 == 24) {
            this.field960 = arg0.method2353();
            if (this.field960 == 65535) {
                this.field960 = -1;
            }
        } else if (arg1 == 27) {
            this.field973 = 1;
        } else if (arg1 == 28) {
            this.field949 = arg0.method2363();
        } else if (arg1 == 29) {
            this.field950 = arg0.method2364();
        } else if (arg1 == 39) {
            this.field958 = arg0.method2364() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field942[arg1 - 30] = arg0.method2365();
            if (this.field942[arg1 - 30].equalsIgnoreCase(class157.field2503)) {
                this.field942[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2363();
            this.field936 = new short[var7];
            this.field951 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field936[var8] = (short) arg0.method2353();
                this.field951[var8] = (short) arg0.method2353();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2363();
            this.field938 = new short[var9];
            this.field939 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field938[var10] = (short) arg0.method2353();
                this.field939[var10] = (short) arg0.method2353();
            }
        } else if (arg1 == 60) {
            this.field953 = arg0.method2353();
        } else if (arg1 == 62) {
            this.field965 = true;
        } else if (arg1 == 64) {
            this.field956 = false;
        } else if (arg1 == 65) {
            this.field955 = arg0.method2353();
        } else if (arg1 == 66) {
            this.field964 = arg0.method2353();
        } else if (arg1 == 67) {
            this.field952 = arg0.method2353();
        } else if (arg1 == 68) {
            this.field954 = arg0.method2353();
        } else if (arg1 == 69) {
            arg0.method2363();
        } else if (arg1 == 70) {
            this.field937 = arg0.method2507();
        } else if (arg1 == 71) {
            this.field934 = arg0.method2507();
        } else if (arg1 == 72) {
            this.field962 = arg0.method2507();
        } else if (arg1 == 73) {
            this.field963 = true;
        } else if (arg1 == 74) {
            this.field957 = true;
        } else if (arg1 == 75) {
            this.field924 = arg0.method2363();
        } else if (arg1 == 77) {
            this.field967 = arg0.method2353();
            if (this.field967 == 65535) {
                this.field967 = -1;
            }
            this.field961 = arg0.method2353();
            if (this.field961 == 65535) {
                this.field961 = -1;
            }
            int var11 = arg0.method2363();
            this.field966 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field966[var12] = arg0.method2353();
                if (this.field966[var12] == 65535) {
                    this.field966[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field969 = arg0.method2353();
            this.field940 = arg0.method2363();
        } else if (arg1 == 79) {
            this.field971 = arg0.method2353();
            this.field972 = arg0.method2353();
            this.field940 = arg0.method2363();
            int var13 = arg0.method2363();
            this.field941 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field941[var14] = arg0.method2353();
            }
        } else if (arg1 == 81) {
            this.field945 = arg0.method2363() * 256;
        }
    }

    @ObfuscatedName("am.m(II)Z")
    public final boolean method773(int arg0) {
        if (this.field943 != null) {
            for (int var4 = 0; var4 < this.field943.length; var4++) {
                if (this.field943[var4] == arg0) {
                    return Statics.field948.method3061(this.field933[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field933 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field933.length; var3++) {
                var2 &= Statics.field948.method3061(this.field933[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("am.t(I)Z")
    public final boolean method775() {
        if (this.field933 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field933.length; var2++) {
            var1 &= Statics.field948.method3061(this.field933[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("am.j(II[[IIIII)Lcs;")
    public final class85 method776(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field943 == null) {
            var7 = (long) ((this.field932 << 10) + arg1);
        } else {
            var7 = (long) ((this.field932 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field929.method3497(var7);
        if (var9 == null) {
            class100 var10 = this.method782(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field946) {
                var10.field1714 = (short) (this.field950 + 64);
                var10.field1699 = (short) (this.field958 + 768);
                var10.method2086();
                var9 = var10;
            } else {
                var9 = var10.method2090(this.field950 + 64, this.field958 + 768, -50, -10, -50);
            }
            field929.method3508(var9, var7);
        }
        if (this.field946) {
            var9 = ((class100) var9).method2104();
        }
        if (this.field945 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2163(arg2, arg3, arg4, arg5, true, this.field945);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2114(arg2, arg3, arg4, arg5, true, this.field945);
            }
        }
        return var9;
    }

    @ObfuscatedName("am.n(II[[IIIII)Ldu;")
    public final class105 method777(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field943 == null) {
            var7 = (long) ((this.field932 << 10) + arg1);
        } else {
            var7 = (long) ((this.field932 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field930.method3497(var7);
        if (var9 == null) {
            class100 var10 = this.method782(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2090(this.field950 + 64, this.field958 + 768, -50, -10, -50);
            field930.method3508(var9, var7);
        }
        if (this.field945 >= 0) {
            var9 = var9.method2163(arg2, arg3, arg4, arg5, true, this.field945);
        }
        return var9;
    }

    @ObfuscatedName("am.l(II[[IIIILai;II)Ldu;")
    public final class105 method778(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field943 == null) {
            var9 = (long) ((this.field932 << 10) + arg1);
        } else {
            var9 = (long) ((this.field932 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field930.method3497(var9);
        if (var11 == null) {
            class100 var12 = this.method782(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2090(this.field950 + 64, this.field958 + 768, -50, -10, -50);
            field930.method3508(var11, var9);
        }
        if (arg6 == null && this.field945 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2166(true);
        } else {
            var13 = arg6.method850(var11, arg7, arg1);
        }
        if (this.field945 >= 0) {
            var13 = var13.method2163(arg2, arg3, arg4, arg5, false, this.field945);
        }
        return var13;
    }

    @ObfuscatedName("am.i(III)Lcx;")
    public final class100 method782(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field943 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field933 == null) {
                return null;
            }
            boolean var4 = this.field965;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field933.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field933[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field928.method3497((long) var7);
                if (var3 == null) {
                    var3 = class100.method2068(Statics.field948, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2084();
                    }
                    field928.method3508(var3, (long) var7);
                }
                if (var5 > 1) {
                    field931[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field931, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field943.length; var9++) {
                if (this.field943[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field933[var8];
            boolean var11 = this.field965 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field928.method3497((long) var10);
            if (var3 == null) {
                var3 = class100.method2068(Statics.field948, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2084();
                }
                field928.method3508(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field955 == 128 && this.field964 == 128 && this.field952 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field937 == 0 && this.field934 == 0 && this.field962 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field936 == null, this.field938 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2081(256);
            var14.method2093(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2078();
        } else if (var15 == 2) {
            var14.method2079();
        } else if (var15 == 3) {
            var14.method2080();
        }
        if (this.field936 != null) {
            for (int var16 = 0; var16 < this.field936.length; var16++) {
                var14.method2082(this.field936[var16], this.field951[var16]);
            }
        }
        if (this.field938 != null) {
            for (int var17 = 0; var17 < this.field938.length; var17++) {
                var14.method2083(this.field938[var17], this.field939[var17]);
            }
        }
        if (var12) {
            var14.method2085(this.field955, this.field964, this.field952);
        }
        if (var13) {
            var14.method2093(this.field937, this.field934, this.field962);
        }
        return var14;
    }

    @ObfuscatedName("am.w(I)Lam;")
    public final class41 method798() {
        int var1 = -1;
        if (this.field967 != -1) {
            var1 = class176.method1774(this.field967);
        } else if (this.field961 != -1) {
            var1 = class176.field2900[this.field961];
        }
        return var1 < 0 || var1 >= this.field966.length || this.field966[var1] == -1 ? null : method1009(this.field966[var1]);
    }

    @ObfuscatedName("aq.v(I)V")
    public static void method740() {
        field927.method3499();
        field928.method3499();
        field929.method3499();
        field930.method3499();
    }

    @ObfuscatedName("am.o(I)Z")
    public boolean method792() {
        if (this.field966 == null) {
            return this.field969 != -1 || this.field941 != null;
        }
        for (int var1 = 0; var1 < this.field966.length; var1++) {
            if (this.field966[var1] != -1) {
                class41 var2 = method1009(this.field966[var1]);
                if (var2.field969 != -1 || var2.field941 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
