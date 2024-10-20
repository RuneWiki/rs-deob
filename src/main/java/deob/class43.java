package deob;

@ObfuscatedName("ae")
public class class43 extends class208 {

    @ObfuscatedName("ae.l")
    public static boolean field959 = false;

    @ObfuscatedName("ae.e")
    public static class197 field948 = new class197(64);

    @ObfuscatedName("ae.h")
    public static class197 field949 = new class197(500);

    @ObfuscatedName("ae.s")
    public static class197 field964 = new class197(30);

    @ObfuscatedName("ae.k")
    public static class197 field976 = new class197(30);

    @ObfuscatedName("ae.u")
    public static class104[] field950 = new class104[4];

    @ObfuscatedName("ae.n")
    public int field953;

    @ObfuscatedName("ae.b")
    public int[] field963;

    @ObfuscatedName("ae.m")
    public int[] field955;

    @ObfuscatedName("ae.q")
    public String field956 = "null";

    @ObfuscatedName("ae.p")
    public short[] field974;

    @ObfuscatedName("ae.w")
    public short[] field966;

    @ObfuscatedName("ae.o")
    public short[] field947;

    @ObfuscatedName("ae.d")
    public short[] field960;

    @ObfuscatedName("ae.f")
    public int field961 = 1;

    @ObfuscatedName("ae.z")
    public int field971 = 1;

    @ObfuscatedName("ae.i")
    public int field999 = 2;

    @ObfuscatedName("ae.v")
    public boolean field962 = true;

    @ObfuscatedName("ae.j")
    public int field945 = -1;

    @ObfuscatedName("ae.x")
    public int field997 = -1;

    @ObfuscatedName("ae.t")
    public boolean field967 = false;

    @ObfuscatedName("ae.y")
    public boolean field954 = false;

    @ObfuscatedName("ae.a")
    public int field969 = -1;

    @ObfuscatedName("ae.c")
    public int field970 = 16;

    @ObfuscatedName("ae.ad")
    public int field957 = 0;

    @ObfuscatedName("ae.as")
    public int field972 = 0;

    @ObfuscatedName("ae.ac")
    public String[] field973 = new String[5];

    @ObfuscatedName("ae.ah")
    public int field958 = -1;

    @ObfuscatedName("ae.am")
    public int field951 = -1;

    @ObfuscatedName("ae.aq")
    public boolean field975 = false;

    @ObfuscatedName("ae.az")
    public boolean field977 = true;

    @ObfuscatedName("ae.ak")
    public int field978 = 128;

    @ObfuscatedName("ae.ag")
    public int field979 = 128;

    @ObfuscatedName("ae.af")
    public int field980 = 128;

    @ObfuscatedName("ae.ab")
    public int field981 = 0;

    @ObfuscatedName("ae.ap")
    public int field982 = 0;

    @ObfuscatedName("ae.ao")
    public int field983 = 0;

    @ObfuscatedName("ae.ay")
    public boolean field984 = false;

    @ObfuscatedName("ae.ai")
    public boolean field985 = false;

    @ObfuscatedName("ae.aj")
    public int field986 = -1;

    @ObfuscatedName("ae.ae")
    public int[] field987;

    @ObfuscatedName("ae.ar")
    public int field988 = -1;

    @ObfuscatedName("ae.at")
    public int field989 = -1;

    @ObfuscatedName("ae.av")
    public int field990 = -1;

    @ObfuscatedName("ae.aw")
    public int field991 = 0;

    @ObfuscatedName("ae.au")
    public int field968 = 0;

    @ObfuscatedName("ae.ax")
    public int field993 = 0;

    @ObfuscatedName("ae.al")
    public int[] field994;

    @ObfuscatedName("ft.l(II)Lae;")
    public static class43 method3115(int arg0) {
        class43 var1 = (class43) field948.method3653((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field946.method3210(6, arg0);
        class43 var3 = new class43();
        var3.field953 = arg0;
        if (var2 != null) {
            var3.method855(new class123(var2));
        }
        var3.method820();
        if (var3.field985) {
            var3.field999 = 0;
            var3.field962 = false;
        }
        field948.method3655(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.g(I)V")
    public void method820() {
        if (this.field945 == -1) {
            this.field945 = 0;
            if (this.field963 != null && (this.field955 == null || this.field955[0] == 10)) {
                this.field945 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field973[var1] != null) {
                    this.field945 = 1;
                }
            }
        }
        if (this.field986 == -1) {
            this.field986 = this.field999 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ae.r(Ldc;I)V")
    public void method855(class123 arg0) {
        while (true) {
            int var2 = arg0.method2490();
            if (var2 == 0) {
                return;
            }
            this.method823(arg0, var2);
        }
    }

    @ObfuscatedName("ae.e(Ldc;IB)V")
    public void method823(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2490();
            if (var3 > 0) {
                if (this.field963 == null || field959) {
                    this.field955 = new int[var3];
                    this.field963 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field963[var4] = arg0.method2492();
                        this.field955[var4] = arg0.method2490();
                    }
                } else {
                    arg0.field2051 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field956 = arg0.method2520();
        } else if (arg1 == 5) {
            int var5 = arg0.method2490();
            if (var5 > 0) {
                if (this.field963 == null || field959) {
                    this.field955 = null;
                    this.field963 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field963[var6] = arg0.method2492();
                    }
                } else {
                    arg0.field2051 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field961 = arg0.method2490();
        } else if (arg1 == 15) {
            this.field971 = arg0.method2490();
        } else if (arg1 == 17) {
            this.field999 = 0;
            this.field962 = false;
        } else if (arg1 == 18) {
            this.field962 = false;
        } else if (arg1 == 19) {
            this.field945 = arg0.method2490();
        } else if (arg1 == 21) {
            this.field997 = 0;
        } else if (arg1 == 22) {
            this.field967 = true;
        } else if (arg1 == 23) {
            this.field954 = true;
        } else if (arg1 == 24) {
            this.field969 = arg0.method2492();
            if (this.field969 == 65535) {
                this.field969 = -1;
            }
        } else if (arg1 == 27) {
            this.field999 = 1;
        } else if (arg1 == 28) {
            this.field970 = arg0.method2490();
        } else if (arg1 == 29) {
            this.field957 = arg0.method2491();
        } else if (arg1 == 39) {
            this.field972 = arg0.method2491() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field973[arg1 - 30] = arg0.method2520();
            if (this.field973[arg1 - 30].equalsIgnoreCase(class161.field2378)) {
                this.field973[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2490();
            this.field974 = new short[var7];
            this.field966 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field974[var8] = (short) arg0.method2492();
                this.field966[var8] = (short) arg0.method2492();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2490();
            this.field947 = new short[var9];
            this.field960 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field947[var10] = (short) arg0.method2492();
                this.field960[var10] = (short) arg0.method2492();
            }
        } else if (arg1 == 60) {
            this.field958 = arg0.method2492();
        } else if (arg1 == 62) {
            this.field975 = true;
        } else if (arg1 == 64) {
            this.field977 = false;
        } else if (arg1 == 65) {
            this.field978 = arg0.method2492();
        } else if (arg1 == 66) {
            this.field979 = arg0.method2492();
        } else if (arg1 == 67) {
            this.field980 = arg0.method2492();
        } else if (arg1 == 68) {
            this.field951 = arg0.method2492();
        } else if (arg1 == 69) {
            arg0.method2490();
        } else if (arg1 == 70) {
            this.field981 = arg0.method2493();
        } else if (arg1 == 71) {
            this.field982 = arg0.method2493();
        } else if (arg1 == 72) {
            this.field983 = arg0.method2493();
        } else if (arg1 == 73) {
            this.field984 = true;
        } else if (arg1 == 74) {
            this.field985 = true;
        } else if (arg1 == 75) {
            this.field986 = arg0.method2490();
        } else if (arg1 == 77) {
            this.field988 = arg0.method2492();
            if (this.field988 == 65535) {
                this.field988 = -1;
            }
            this.field989 = arg0.method2492();
            if (this.field989 == 65535) {
                this.field989 = -1;
            }
            int var11 = arg0.method2490();
            this.field987 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field987[var12] = arg0.method2492();
                if (this.field987[var12] == 65535) {
                    this.field987[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field990 = arg0.method2492();
            this.field991 = arg0.method2490();
        } else if (arg1 == 79) {
            this.field968 = arg0.method2492();
            this.field993 = arg0.method2492();
            this.field991 = arg0.method2490();
            int var13 = arg0.method2490();
            this.field994 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field994[var14] = arg0.method2492();
            }
        } else if (arg1 == 81) {
            this.field997 = arg0.method2490() * 256;
        }
    }

    @ObfuscatedName("ae.h(II)Z")
    public final boolean method824(int arg0) {
        if (this.field955 != null) {
            for (int var4 = 0; var4 < this.field955.length; var4++) {
                if (this.field955[var4] == arg0) {
                    return Statics.field996.method3252(this.field963[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field963 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field963.length; var3++) {
                var2 &= Statics.field996.method3252(this.field963[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ae.s(B)Z")
    public final boolean method832() {
        if (this.field963 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field963.length; var2++) {
            var1 &= Statics.field996.method3252(this.field963[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ae.k(II[[IIIII)Lcz;")
    public final class89 method826(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field955 == null) {
            var7 = (long) ((this.field953 << 10) + arg1);
        } else {
            var7 = (long) ((this.field953 << 10) + (arg0 << 3) + arg1);
        }
        class89 var9 = (class89) field964.method3653(var7);
        if (var9 == null) {
            class104 var10 = this.method829(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field967) {
                var10.field1796 = (short) (this.field957 + 64);
                var10.field1778 = (short) (this.field972 + 768);
                var10.method2190();
                var9 = var10;
            } else {
                var9 = var10.method2189(this.field957 + 64, this.field972 + 768, -50, -10, -50);
            }
            field964.method3655(var9, var7);
        }
        if (this.field967) {
            var9 = ((class104) var9).method2167();
        }
        if (this.field997 >= 0) {
            if (var9 instanceof class109) {
                var9 = ((class109) var9).method2266(arg2, arg3, arg4, arg5, true, this.field997);
            } else if (var9 instanceof class104) {
                var9 = ((class104) var9).method2168(arg2, arg3, arg4, arg5, true, this.field997);
            }
        }
        return var9;
    }

    @ObfuscatedName("ae.u(II[[IIIII)Ldv;")
    public final class109 method827(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field955 == null) {
            var7 = (long) ((this.field953 << 10) + arg1);
        } else {
            var7 = (long) ((this.field953 << 10) + (arg0 << 3) + arg1);
        }
        class109 var9 = (class109) field976.method3653(var7);
        if (var9 == null) {
            class104 var10 = this.method829(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2189(this.field957 + 64, this.field972 + 768, -50, -10, -50);
            field976.method3655(var9, var7);
        }
        if (this.field997 >= 0) {
            var9 = var9.method2266(arg2, arg3, arg4, arg5, true, this.field997);
        }
        return var9;
    }

    @ObfuscatedName("ae.n(II[[IIIILat;IB)Ldv;")
    public final class109 method845(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class45 arg6, int arg7) {
        long var9;
        if (this.field955 == null) {
            var9 = (long) ((this.field953 << 10) + arg1);
        } else {
            var9 = (long) ((this.field953 << 10) + (arg0 << 3) + arg1);
        }
        class109 var11 = (class109) field976.method3653(var9);
        if (var11 == null) {
            class104 var12 = this.method829(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2189(this.field957 + 64, this.field972 + 768, -50, -10, -50);
            field976.method3655(var11, var9);
        }
        if (arg6 == null && this.field997 == -1) {
            return var11;
        }
        class109 var13;
        if (arg6 == null) {
            var13 = var11.method2267(true);
        } else {
            var13 = arg6.method887(var11, arg7, arg1);
        }
        if (this.field997 >= 0) {
            var13 = var13.method2266(arg2, arg3, arg4, arg5, false, this.field997);
        }
        return var13;
    }

    @ObfuscatedName("ae.b(III)Lcc;")
    public final class104 method829(int arg0, int arg1) {
        class104 var3 = null;
        if (this.field955 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field963 == null) {
                return null;
            }
            boolean var4 = this.field975;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field963.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field963[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class104) field949.method3653((long) var7);
                if (var3 == null) {
                    var3 = class104.method2237(Statics.field996, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2162();
                    }
                    field949.method3655(var3, (long) var7);
                }
                if (var5 > 1) {
                    field950[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class104(field950, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field955.length; var9++) {
                if (this.field955[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field963[var8];
            boolean var11 = this.field975 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class104) field949.method3653((long) var10);
            if (var3 == null) {
                var3 = class104.method2237(Statics.field996, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2162();
                }
                field949.method3655(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field978 == 128 && this.field979 == 128 && this.field980 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field981 == 0 && this.field982 == 0 && this.field983 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class104 var14 = new class104(var3, arg1 == 0 && !var12 && !var13, this.field974 == null, this.field947 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2216(256);
            var14.method2172(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2169();
        } else if (var15 == 2) {
            var14.method2170();
        } else if (var15 == 3) {
            var14.method2239();
        }
        if (this.field974 != null) {
            for (int var16 = 0; var16 < this.field974.length; var16++) {
                var14.method2173(this.field974[var16], this.field966[var16]);
            }
        }
        if (this.field947 != null) {
            for (int var17 = 0; var17 < this.field947.length; var17++) {
                var14.method2174(this.field947[var17], this.field960[var17]);
            }
        }
        if (var12) {
            var14.method2243(this.field978, this.field979, this.field980);
        }
        if (var13) {
            var14.method2172(this.field981, this.field982, this.field983);
        }
        return var14;
    }

    @ObfuscatedName("ae.m(I)Lae;")
    public final class43 method822() {
        int var1 = -1;
        if (this.field988 != -1) {
            var1 = class180.method1139(this.field988);
        } else if (this.field989 != -1) {
            var1 = class180.field2959[this.field989];
        }
        return var1 < 0 || var1 >= this.field987.length || this.field987[var1] == -1 ? null : method3115(this.field987[var1]);
    }

    @ObfuscatedName("ae.q(B)Z")
    public boolean method835() {
        if (this.field987 == null) {
            return this.field990 != -1 || this.field994 != null;
        }
        for (int var1 = 0; var1 < this.field987.length; var1++) {
            if (this.field987[var1] != -1) {
                class43 var2 = method3115(this.field987[var1]);
                if (var2.field990 != -1 || var2.field994 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
