package deob;

@ObfuscatedName("ah")
public class class43 extends class208 {

    @ObfuscatedName("ah.a")
    public static boolean field994 = false;

    @ObfuscatedName("ah.r")
    public static class197 field951 = new class197(64);

    @ObfuscatedName("ah.z")
    public static class197 field981 = new class197(500);

    @ObfuscatedName("ah.t")
    public static class197 field953 = new class197(30);

    @ObfuscatedName("ah.n")
    public static class197 field960 = new class197(30);

    @ObfuscatedName("ah.i")
    public static class104[] field979 = new class104[4];

    @ObfuscatedName("ah.g")
    public int field956;

    @ObfuscatedName("ah.m")
    public int[] field957;

    @ObfuscatedName("ah.k")
    public int[] field958;

    @ObfuscatedName("ah.x")
    public String field959 = "null";

    @ObfuscatedName("ah.u")
    public short[] field955;

    @ObfuscatedName("ah.j")
    public short[] field995;

    @ObfuscatedName("ah.q")
    public short[] field962;

    @ObfuscatedName("ah.w")
    public short[] field971;

    @ObfuscatedName("ah.b")
    public int field964 = 1;

    @ObfuscatedName("ah.p")
    public int field965 = 1;

    @ObfuscatedName("ah.o")
    public int field966 = 2;

    @ObfuscatedName("ah.y")
    public boolean field967 = true;

    @ObfuscatedName("ah.s")
    public int field968 = -1;

    @ObfuscatedName("ah.e")
    public int field988 = -1;

    @ObfuscatedName("ah.h")
    public boolean field970 = false;

    @ObfuscatedName("ah.l")
    public boolean field963 = false;

    @ObfuscatedName("ah.c")
    public int field990 = -1;

    @ObfuscatedName("ah.f")
    public int field973 = 16;

    @ObfuscatedName("ah.ac")
    public int field974 = 0;

    @ObfuscatedName("ah.as")
    public int field975 = 0;

    @ObfuscatedName("ah.af")
    public String[] field976 = new String[5];

    @ObfuscatedName("ah.am")
    public int field972 = -1;

    @ObfuscatedName("ah.ap")
    public int field978 = -1;

    @ObfuscatedName("ah.aa")
    public boolean field986 = false;

    @ObfuscatedName("ah.ar")
    public boolean field980 = true;

    @ObfuscatedName("ah.av")
    public int field954 = 128;

    @ObfuscatedName("ah.ao")
    public int field982 = 128;

    @ObfuscatedName("ah.aq")
    public int field983 = 128;

    @ObfuscatedName("ah.ax")
    public int field984 = 0;

    @ObfuscatedName("ah.at")
    public int field985 = 0;

    @ObfuscatedName("ah.aw")
    public int field996 = 0;

    @ObfuscatedName("ah.ab")
    public boolean field987 = false;

    @ObfuscatedName("ah.al")
    public boolean field997 = false;

    @ObfuscatedName("ah.ad")
    public int field989 = -1;

    @ObfuscatedName("ah.ah")
    public int[] field952;

    @ObfuscatedName("ah.ak")
    public int field991 = -1;

    @ObfuscatedName("ah.ai")
    public int field992 = -1;

    @ObfuscatedName("ah.az")
    public int field961 = -1;

    @ObfuscatedName("ah.au")
    public int field969 = 0;

    @ObfuscatedName("ah.ay")
    public int field993 = 0;

    @ObfuscatedName("ah.ag")
    public int field948 = 0;

    @ObfuscatedName("ah.ae")
    public int[] field977;

    @ObfuscatedName("ac.a(Lfu;Lfu;ZI)V")
    public static void method612(class171 arg0, class171 arg1, boolean arg2) {
        Statics.field949 = arg0;
        Statics.field950 = arg1;
        field994 = arg2;
    }

    @ObfuscatedName("fy.d(IB)Lah;")
    public static class43 method3046(int arg0) {
        class43 var1 = (class43) field951.method3544((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field949.method3117(6, arg0);
        class43 var3 = new class43();
        var3.field956 = arg0;
        if (var2 != null) {
            var3.method816(new class123(var2));
        }
        var3.method815();
        if (var3.field997) {
            var3.field966 = 0;
            var3.field967 = false;
        }
        field951.method3546(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ah.v(I)V")
    public void method815() {
        if (this.field968 == -1) {
            this.field968 = 0;
            if (this.field957 != null && (this.field958 == null || this.field958[0] == 10)) {
                this.field968 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field976[var1] != null) {
                    this.field968 = 1;
                }
            }
        }
        if (this.field989 == -1) {
            this.field989 = this.field966 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ah.r(Ldb;I)V")
    public void method816(class123 arg0) {
        while (true) {
            int var2 = arg0.method2395();
            if (var2 == 0) {
                return;
            }
            this.method817(arg0, var2);
        }
    }

    @ObfuscatedName("ah.z(Ldb;II)V")
    public void method817(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2395();
            if (var3 > 0) {
                if (this.field957 == null || field994) {
                    this.field958 = new int[var3];
                    this.field957 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field957[var4] = arg0.method2584();
                        this.field958[var4] = arg0.method2395();
                    }
                } else {
                    arg0.field2071 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field959 = arg0.method2397();
        } else if (arg1 == 5) {
            int var5 = arg0.method2395();
            if (var5 > 0) {
                if (this.field957 == null || field994) {
                    this.field958 = null;
                    this.field957 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field957[var6] = arg0.method2584();
                    }
                } else {
                    arg0.field2071 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field964 = arg0.method2395();
        } else if (arg1 == 15) {
            this.field965 = arg0.method2395();
        } else if (arg1 == 17) {
            this.field966 = 0;
            this.field967 = false;
        } else if (arg1 == 18) {
            this.field967 = false;
        } else if (arg1 == 19) {
            this.field968 = arg0.method2395();
        } else if (arg1 == 21) {
            this.field988 = 0;
        } else if (arg1 == 22) {
            this.field970 = true;
        } else if (arg1 == 23) {
            this.field963 = true;
        } else if (arg1 == 24) {
            this.field990 = arg0.method2584();
            if (this.field990 == 65535) {
                this.field990 = -1;
            }
        } else if (arg1 == 27) {
            this.field966 = 1;
        } else if (arg1 == 28) {
            this.field973 = arg0.method2395();
        } else if (arg1 == 29) {
            this.field974 = arg0.method2396();
        } else if (arg1 == 39) {
            this.field975 = arg0.method2396() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field976[arg1 - 30] = arg0.method2397();
            if (this.field976[arg1 - 30].equalsIgnoreCase(class161.field2422)) {
                this.field976[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2395();
            this.field955 = new short[var7];
            this.field995 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field955[var8] = (short) arg0.method2584();
                this.field995[var8] = (short) arg0.method2584();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2395();
            this.field962 = new short[var9];
            this.field971 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field962[var10] = (short) arg0.method2584();
                this.field971[var10] = (short) arg0.method2584();
            }
        } else if (arg1 == 60) {
            this.field972 = arg0.method2584();
        } else if (arg1 == 62) {
            this.field986 = true;
        } else if (arg1 == 64) {
            this.field980 = false;
        } else if (arg1 == 65) {
            this.field954 = arg0.method2584();
        } else if (arg1 == 66) {
            this.field982 = arg0.method2584();
        } else if (arg1 == 67) {
            this.field983 = arg0.method2584();
        } else if (arg1 == 68) {
            this.field978 = arg0.method2584();
        } else if (arg1 == 69) {
            arg0.method2395();
        } else if (arg1 == 70) {
            this.field984 = arg0.method2485();
        } else if (arg1 == 71) {
            this.field985 = arg0.method2485();
        } else if (arg1 == 72) {
            this.field996 = arg0.method2485();
        } else if (arg1 == 73) {
            this.field987 = true;
        } else if (arg1 == 74) {
            this.field997 = true;
        } else if (arg1 == 75) {
            this.field989 = arg0.method2395();
        } else if (arg1 == 77) {
            this.field991 = arg0.method2584();
            if (this.field991 == 65535) {
                this.field991 = -1;
            }
            this.field992 = arg0.method2584();
            if (this.field992 == 65535) {
                this.field992 = -1;
            }
            int var11 = arg0.method2395();
            this.field952 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field952[var12] = arg0.method2584();
                if (this.field952[var12] == 65535) {
                    this.field952[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field961 = arg0.method2584();
            this.field969 = arg0.method2395();
        } else if (arg1 == 79) {
            this.field993 = arg0.method2584();
            this.field948 = arg0.method2584();
            this.field969 = arg0.method2395();
            int var13 = arg0.method2395();
            this.field977 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field977[var14] = arg0.method2584();
            }
        } else if (arg1 == 81) {
            this.field988 = arg0.method2395() * 256;
        }
    }

    @ObfuscatedName("ah.t(II)Z")
    public final boolean method818(int arg0) {
        if (this.field958 != null) {
            for (int var4 = 0; var4 < this.field958.length; var4++) {
                if (this.field958[var4] == arg0) {
                    return Statics.field950.method3159(this.field957[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field957 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field957.length; var3++) {
                var2 &= Statics.field950.method3159(this.field957[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ah.n(I)Z")
    public final boolean method862() {
        if (this.field957 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field957.length; var2++) {
            var1 &= Statics.field950.method3159(this.field957[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ah.i(II[[IIIII)Lcj;")
    public final class89 method820(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field958 == null) {
            var7 = (long) ((this.field956 << 10) + arg1);
        } else {
            var7 = (long) ((this.field956 << 10) + (arg0 << 3) + arg1);
        }
        class89 var9 = (class89) field953.method3544(var7);
        if (var9 == null) {
            class104 var10 = this.method835(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field970) {
                var10.field1807 = (short) (this.field974 + 64);
                var10.field1789 = (short) (this.field975 + 768);
                var10.method2118();
                var9 = var10;
            } else {
                var9 = var10.method2122(this.field974 + 64, this.field975 + 768, -50, -10, -50);
            }
            field953.method3546(var9, var7);
        }
        if (this.field970) {
            var9 = ((class104) var9).method2176();
        }
        if (this.field988 >= 0) {
            if (var9 instanceof class109) {
                var9 = ((class109) var9).method2196(arg2, arg3, arg4, arg5, true, this.field988);
            } else if (var9 instanceof class104) {
                var9 = ((class104) var9).method2107(arg2, arg3, arg4, arg5, true, this.field988);
            }
        }
        return var9;
    }

    @ObfuscatedName("ah.g(II[[IIIIB)Ldp;")
    public final class109 method821(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field958 == null) {
            var7 = (long) ((this.field956 << 10) + arg1);
        } else {
            var7 = (long) ((this.field956 << 10) + (arg0 << 3) + arg1);
        }
        class109 var9 = (class109) field960.method3544(var7);
        if (var9 == null) {
            class104 var10 = this.method835(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2122(this.field974 + 64, this.field975 + 768, -50, -10, -50);
            field960.method3546(var9, var7);
        }
        if (this.field988 >= 0) {
            var9 = var9.method2196(arg2, arg3, arg4, arg5, true, this.field988);
        }
        return var9;
    }

    @ObfuscatedName("ah.m(II[[IIIILai;II)Ldp;")
    public final class109 method822(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class45 arg6, int arg7) {
        long var9;
        if (this.field958 == null) {
            var9 = (long) ((this.field956 << 10) + arg1);
        } else {
            var9 = (long) ((this.field956 << 10) + (arg0 << 3) + arg1);
        }
        class109 var11 = (class109) field960.method3544(var9);
        if (var11 == null) {
            class104 var12 = this.method835(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2122(this.field974 + 64, this.field975 + 768, -50, -10, -50);
            field960.method3546(var11, var9);
        }
        if (arg6 == null && this.field988 == -1) {
            return var11;
        }
        class109 var13;
        if (arg6 == null) {
            var13 = var11.method2231(true);
        } else {
            var13 = arg6.method882(var11, arg7, arg1);
        }
        if (this.field988 >= 0) {
            var13 = var13.method2196(arg2, arg3, arg4, arg5, false, this.field988);
        }
        return var13;
    }

    @ObfuscatedName("ah.k(III)Lcd;")
    public final class104 method835(int arg0, int arg1) {
        class104 var3 = null;
        if (this.field958 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field957 == null) {
                return null;
            }
            boolean var4 = this.field986;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field957.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field957[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class104) field981.method3544((long) var7);
                if (var3 == null) {
                    var3 = class104.method2159(Statics.field950, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2116();
                    }
                    field981.method3546(var3, (long) var7);
                }
                if (var5 > 1) {
                    field979[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class104(field979, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field958.length; var9++) {
                if (this.field958[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field957[var8];
            boolean var11 = this.field986 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class104) field981.method3544((long) var10);
            if (var3 == null) {
                var3 = class104.method2159(Statics.field950, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2116();
                }
                field981.method3546(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field954 == 128 && this.field982 == 128 && this.field983 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field984 == 0 && this.field985 == 0 && this.field996 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class104 var14 = new class104(var3, arg1 == 0 && !var12 && !var13, this.field955 == null, this.field962 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2112(256);
            var14.method2105(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2109();
        } else if (var15 == 2) {
            var14.method2151();
        } else if (var15 == 3) {
            var14.method2111();
        }
        if (this.field955 != null) {
            for (int var16 = 0; var16 < this.field955.length; var16++) {
                var14.method2114(this.field955[var16], this.field995[var16]);
            }
        }
        if (this.field962 != null) {
            for (int var17 = 0; var17 < this.field962.length; var17++) {
                var14.method2115(this.field962[var17], this.field971[var17]);
            }
        }
        if (var12) {
            var14.method2145(this.field954, this.field982, this.field983);
        }
        if (var13) {
            var14.method2105(this.field984, this.field985, this.field996);
        }
        return var14;
    }

    @ObfuscatedName("ah.x(I)Lah;")
    public final class43 method851() {
        int var1 = -1;
        if (this.field991 != -1) {
            var1 = class180.method3001(this.field991);
        } else if (this.field992 != -1) {
            var1 = class180.field2969[this.field992];
        }
        return var1 < 0 || var1 >= this.field952.length || this.field952[var1] == -1 ? null : method3046(this.field952[var1]);
    }

    @ObfuscatedName("ah.u(B)Z")
    public boolean method825() {
        if (this.field952 == null) {
            return this.field961 != -1 || this.field977 != null;
        }
        for (int var1 = 0; var1 < this.field952.length; var1++) {
            if (this.field952[var1] != -1) {
                class43 var2 = method3046(this.field952[var1]);
                if (var2.field961 != -1 || var2.field977 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
