package deob;

@ObfuscatedName("aa")
public class class41 extends class204 {

    @ObfuscatedName("aa.a")
    public static boolean field941 = false;

    @ObfuscatedName("aa.s")
    public static class193 field946 = new class193(64);

    @ObfuscatedName("aa.y")
    public static class193 field934 = new class193(500);

    @ObfuscatedName("aa.e")
    public static class193 field928 = new class193(30);

    @ObfuscatedName("aa.g")
    public static class193 field935 = new class193(30);

    @ObfuscatedName("aa.m")
    public static class100[] field927 = new class100[4];

    @ObfuscatedName("aa.j")
    public int field931;

    @ObfuscatedName("aa.n")
    public int[] field932;

    @ObfuscatedName("aa.l")
    public int[] field933;

    @ObfuscatedName("aa.h")
    public String field955 = "null";

    @ObfuscatedName("aa.i")
    public short[] field958;

    @ObfuscatedName("aa.v")
    public short[] field936;

    @ObfuscatedName("aa.z")
    public short[] field937;

    @ObfuscatedName("aa.u")
    public short[] field938;

    @ObfuscatedName("aa.t")
    public int field939 = 1;

    @ObfuscatedName("aa.b")
    public int field940 = 1;

    @ObfuscatedName("aa.c")
    public int field926 = 2;

    @ObfuscatedName("aa.x")
    public boolean field942 = true;

    @ObfuscatedName("aa.d")
    public int field943 = -1;

    @ObfuscatedName("aa.p")
    public int field965 = -1;

    @ObfuscatedName("aa.q")
    public boolean field945 = false;

    @ObfuscatedName("aa.w")
    public boolean field930 = false;

    @ObfuscatedName("aa.k")
    public int field947 = -1;

    @ObfuscatedName("aa.o")
    public int field952 = 16;

    @ObfuscatedName("aa.ad")
    public int field949 = 0;

    @ObfuscatedName("aa.at")
    public int field950 = 0;

    @ObfuscatedName("aa.aw")
    public String[] field951 = new String[5];

    @ObfuscatedName("aa.ax")
    public int field944 = -1;

    @ObfuscatedName("aa.ak")
    public int field953 = -1;

    @ObfuscatedName("aa.ah")
    public boolean field924 = false;

    @ObfuscatedName("aa.ac")
    public boolean field972 = true;

    @ObfuscatedName("aa.as")
    public int field948 = 128;

    @ObfuscatedName("aa.ao")
    public int field957 = 128;

    @ObfuscatedName("aa.am")
    public int field954 = 128;

    @ObfuscatedName("aa.ai")
    public int field959 = 0;

    @ObfuscatedName("aa.ab")
    public int field960 = 0;

    @ObfuscatedName("aa.al")
    public int field961 = 0;

    @ObfuscatedName("aa.ar")
    public boolean field962 = false;

    @ObfuscatedName("aa.aa")
    public boolean field963 = false;

    @ObfuscatedName("aa.ag")
    public int field964 = -1;

    @ObfuscatedName("aa.an")
    public int[] field956;

    @ObfuscatedName("aa.av")
    public int field923 = -1;

    @ObfuscatedName("aa.aj")
    public int field967 = -1;

    @ObfuscatedName("aa.ap")
    public int field968 = -1;

    @ObfuscatedName("aa.aq")
    public int field969 = 0;

    @ObfuscatedName("aa.af")
    public int field970 = 0;

    @ObfuscatedName("aa.ay")
    public int field971 = 0;

    @ObfuscatedName("aa.au")
    public int[] field929;

    @ObfuscatedName("fg.a(IB)Laa;")
    public static class41 method2944(int arg0) {
        class41 var1 = (class41) field946.method3507((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field966.method3025(6, arg0);
        class41 var3 = new class41();
        var3.field931 = arg0;
        if (var2 != null) {
            var3.method783(new class119(var2));
        }
        var3.method804();
        if (var3.field963) {
            var3.field926 = 0;
            var3.field942 = false;
        }
        field946.method3509(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("aa.r(I)V")
    public void method804() {
        if (this.field943 == -1) {
            this.field943 = 0;
            if (this.field932 != null && (this.field933 == null || this.field933[0] == 10)) {
                this.field943 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field951[var1] != null) {
                    this.field943 = 1;
                }
            }
        }
        if (this.field964 == -1) {
            this.field964 = this.field926 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("aa.f(Lds;B)V")
    public void method783(class119 arg0) {
        while (true) {
            int var2 = arg0.method2412();
            if (var2 == 0) {
                return;
            }
            this.method795(arg0, var2);
        }
    }

    @ObfuscatedName("aa.s(Lds;IB)V")
    public void method795(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2412();
            if (var3 > 0) {
                if (this.field932 == null || field941) {
                    this.field933 = new int[var3];
                    this.field932 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field932[var4] = arg0.method2347();
                        this.field933[var4] = arg0.method2412();
                    }
                } else {
                    arg0.field1980 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field955 = arg0.method2353();
        } else if (arg1 == 5) {
            int var5 = arg0.method2412();
            if (var5 > 0) {
                if (this.field932 == null || field941) {
                    this.field933 = null;
                    this.field932 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field932[var6] = arg0.method2347();
                    }
                } else {
                    arg0.field1980 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field939 = arg0.method2412();
        } else if (arg1 == 15) {
            this.field940 = arg0.method2412();
        } else if (arg1 == 17) {
            this.field926 = 0;
            this.field942 = false;
        } else if (arg1 == 18) {
            this.field942 = false;
        } else if (arg1 == 19) {
            this.field943 = arg0.method2412();
        } else if (arg1 == 21) {
            this.field965 = 0;
        } else if (arg1 == 22) {
            this.field945 = true;
        } else if (arg1 == 23) {
            this.field930 = true;
        } else if (arg1 == 24) {
            this.field947 = arg0.method2347();
            if (this.field947 == 65535) {
                this.field947 = -1;
            }
        } else if (arg1 == 27) {
            this.field926 = 1;
        } else if (arg1 == 28) {
            this.field952 = arg0.method2412();
        } else if (arg1 == 29) {
            this.field949 = arg0.method2540();
        } else if (arg1 == 39) {
            this.field950 = arg0.method2540() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field951[arg1 - 30] = arg0.method2353();
            if (this.field951[arg1 - 30].equalsIgnoreCase(class157.field2296)) {
                this.field951[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2412();
            this.field958 = new short[var7];
            this.field936 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field958[var8] = (short) arg0.method2347();
                this.field936[var8] = (short) arg0.method2347();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2412();
            this.field937 = new short[var9];
            this.field938 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field937[var10] = (short) arg0.method2347();
                this.field938[var10] = (short) arg0.method2347();
            }
        } else if (arg1 == 60) {
            this.field944 = arg0.method2347();
        } else if (arg1 == 62) {
            this.field924 = true;
        } else if (arg1 == 64) {
            this.field972 = false;
        } else if (arg1 == 65) {
            this.field948 = arg0.method2347();
        } else if (arg1 == 66) {
            this.field957 = arg0.method2347();
        } else if (arg1 == 67) {
            this.field954 = arg0.method2347();
        } else if (arg1 == 68) {
            this.field953 = arg0.method2347();
        } else if (arg1 == 69) {
            arg0.method2412();
        } else if (arg1 == 70) {
            this.field959 = arg0.method2348();
        } else if (arg1 == 71) {
            this.field960 = arg0.method2348();
        } else if (arg1 == 72) {
            this.field961 = arg0.method2348();
        } else if (arg1 == 73) {
            this.field962 = true;
        } else if (arg1 == 74) {
            this.field963 = true;
        } else if (arg1 == 75) {
            this.field964 = arg0.method2412();
        } else if (arg1 == 77) {
            this.field923 = arg0.method2347();
            if (this.field923 == 65535) {
                this.field923 = -1;
            }
            this.field967 = arg0.method2347();
            if (this.field967 == 65535) {
                this.field967 = -1;
            }
            int var11 = arg0.method2412();
            this.field956 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field956[var12] = arg0.method2347();
                if (this.field956[var12] == 65535) {
                    this.field956[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field968 = arg0.method2347();
            this.field969 = arg0.method2412();
        } else if (arg1 == 79) {
            this.field970 = arg0.method2347();
            this.field971 = arg0.method2347();
            this.field969 = arg0.method2412();
            int var13 = arg0.method2412();
            this.field929 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field929[var14] = arg0.method2347();
            }
        } else if (arg1 == 81) {
            this.field965 = arg0.method2412() * 256;
        }
    }

    @ObfuscatedName("aa.y(II)Z")
    public final boolean method806(int arg0) {
        if (this.field933 != null) {
            for (int var4 = 0; var4 < this.field933.length; var4++) {
                if (this.field933[var4] == arg0) {
                    return Statics.field925.method3027(this.field932[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field932 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field932.length; var3++) {
                var2 &= Statics.field925.method3027(this.field932[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("aa.e(I)Z")
    public final boolean method785() {
        if (this.field932 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field932.length; var2++) {
            var1 &= Statics.field925.method3027(this.field932[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("aa.g(II[[IIIII)Lcr;")
    public final class85 method786(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field933 == null) {
            var7 = (long) ((this.field931 << 10) + arg1);
        } else {
            var7 = (long) ((this.field931 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field928.method3507(var7);
        if (var9 == null) {
            class100 var10 = this.method792(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field945) {
                var10.field1712 = (short) (this.field949 + 64);
                var10.field1713 = (short) (this.field950 + 768);
                var10.method2082();
                var9 = var10;
            } else {
                var9 = var10.method2086(this.field949 + 64, this.field950 + 768, -50, -10, -50);
            }
            field928.method3509(var9, var7);
        }
        if (this.field945) {
            var9 = ((class100) var9).method2070();
        }
        if (this.field965 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2154(arg2, arg3, arg4, arg5, true, this.field965);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2071(arg2, arg3, arg4, arg5, true, this.field965);
            }
        }
        return var9;
    }

    @ObfuscatedName("aa.m(II[[IIIII)Ldn;")
    public final class105 method787(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field933 == null) {
            var7 = (long) ((this.field931 << 10) + arg1);
        } else {
            var7 = (long) ((this.field931 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field935.method3507(var7);
        if (var9 == null) {
            class100 var10 = this.method792(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2086(this.field949 + 64, this.field950 + 768, -50, -10, -50);
            field935.method3509(var9, var7);
        }
        if (this.field965 >= 0) {
            var9 = var9.method2154(arg2, arg3, arg4, arg5, true, this.field965);
        }
        return var9;
    }

    @ObfuscatedName("aa.j(II[[IIIILan;II)Ldn;")
    public final class105 method788(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field933 == null) {
            var9 = (long) ((this.field931 << 10) + arg1);
        } else {
            var9 = (long) ((this.field931 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field935.method3507(var9);
        if (var11 == null) {
            class100 var12 = this.method792(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2086(this.field949 + 64, this.field950 + 768, -50, -10, -50);
            field935.method3509(var11, var9);
        }
        if (arg6 == null && this.field965 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2194(true);
        } else {
            var13 = arg6.method857(var11, arg7, arg1);
        }
        if (this.field965 >= 0) {
            var13 = var13.method2154(arg2, arg3, arg4, arg5, false, this.field965);
        }
        return var13;
    }

    @ObfuscatedName("aa.n(III)Lch;")
    public final class100 method792(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field933 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field932 == null) {
                return null;
            }
            boolean var4 = this.field924;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field932.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field932[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field934.method3507((long) var7);
                if (var3 == null) {
                    var3 = class100.method2066(Statics.field925, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2114();
                    }
                    field934.method3509(var3, (long) var7);
                }
                if (var5 > 1) {
                    field927[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field927, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field933.length; var9++) {
                if (this.field933[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field932[var8];
            boolean var11 = this.field924 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field934.method3507((long) var10);
            if (var3 == null) {
                var3 = class100.method2066(Statics.field925, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2114();
                }
                field934.method3509(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field948 == 128 && this.field957 == 128 && this.field954 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field959 == 0 && this.field960 == 0 && this.field961 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field958 == null, this.field937 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2076(256);
            var14.method2133(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2097();
        } else if (var15 == 2) {
            var14.method2080();
        } else if (var15 == 3) {
            var14.method2131();
        }
        if (this.field958 != null) {
            for (int var16 = 0; var16 < this.field958.length; var16++) {
                var14.method2101(this.field958[var16], this.field936[var16]);
            }
        }
        if (this.field937 != null) {
            for (int var17 = 0; var17 < this.field937.length; var17++) {
                var14.method2121(this.field937[var17], this.field938[var17]);
            }
        }
        if (var12) {
            var14.method2081(this.field948, this.field957, this.field954);
        }
        if (var13) {
            var14.method2133(this.field959, this.field960, this.field961);
        }
        return var14;
    }

    @ObfuscatedName("aa.l(I)Laa;")
    public final class41 method823() {
        int var1 = -1;
        if (this.field923 != -1) {
            var1 = class176.method2646(this.field923);
        } else if (this.field967 != -1) {
            var1 = class176.field2891[this.field967];
        }
        return var1 < 0 || var1 >= this.field956.length || this.field956[var1] == -1 ? null : method2944(this.field956[var1]);
    }

    @ObfuscatedName("aa.h(I)Z")
    public boolean method791() {
        if (this.field956 == null) {
            return this.field968 != -1 || this.field929 != null;
        }
        for (int var1 = 0; var1 < this.field956.length; var1++) {
            if (this.field956[var1] != -1) {
                class41 var2 = method2944(this.field956[var1]);
                if (var2.field968 != -1 || var2.field929 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
