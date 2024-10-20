package deob;

@ObfuscatedName("ac")
public class class43 extends class208 {

    @ObfuscatedName("ac.x")
    public static boolean field955 = false;

    @ObfuscatedName("ac.z")
    public static class197 field926 = new class197(64);

    @ObfuscatedName("ac.i")
    public static class197 field927 = new class197(500);

    @ObfuscatedName("ac.b")
    public static class197 field928 = new class197(30);

    @ObfuscatedName("ac.l")
    public static class197 field929 = new class197(30);

    @ObfuscatedName("ac.m")
    public static class104[] field960 = new class104[4];

    @ObfuscatedName("ac.p")
    public int field948;

    @ObfuscatedName("ac.f")
    public int[] field932;

    @ObfuscatedName("ac.d")
    public int[] field968;

    @ObfuscatedName("ac.v")
    public String field934 = "null";

    @ObfuscatedName("ac.q")
    public short[] field935;

    @ObfuscatedName("ac.t")
    public short[] field970;

    @ObfuscatedName("ac.g")
    public short[] field972;

    @ObfuscatedName("ac.s")
    public short[] field938;

    @ObfuscatedName("ac.h")
    public int field939 = 1;

    @ObfuscatedName("ac.u")
    public int field940 = 1;

    @ObfuscatedName("ac.a")
    public int field941 = 2;

    @ObfuscatedName("ac.e")
    public boolean field974 = true;

    @ObfuscatedName("ac.c")
    public int field967 = -1;

    @ObfuscatedName("ac.n")
    public int field944 = -1;

    @ObfuscatedName("ac.y")
    public boolean field945 = false;

    @ObfuscatedName("ac.k")
    public boolean field946 = false;

    @ObfuscatedName("ac.w")
    public int field947 = -1;

    @ObfuscatedName("ac.o")
    public int field977 = 16;

    @ObfuscatedName("ac.ah")
    public int field973 = 0;

    @ObfuscatedName("ac.an")
    public int field950 = 0;

    @ObfuscatedName("ac.ag")
    public String[] field951 = new String[5];

    @ObfuscatedName("ac.as")
    public int field952 = -1;

    @ObfuscatedName("ac.aq")
    public int field953 = -1;

    @ObfuscatedName("ac.ax")
    public boolean field924 = false;

    @ObfuscatedName("ac.az")
    public boolean field933 = true;

    @ObfuscatedName("ac.ap")
    public int field956 = 128;

    @ObfuscatedName("ac.ao")
    public int field957 = 128;

    @ObfuscatedName("ac.af")
    public int field958 = 128;

    @ObfuscatedName("ac.au")
    public int field959 = 0;

    @ObfuscatedName("ac.ab")
    public int field976 = 0;

    @ObfuscatedName("ac.at")
    public int field961 = 0;

    @ObfuscatedName("ac.ay")
    public boolean field962 = false;

    @ObfuscatedName("ac.ad")
    public boolean field963 = false;

    @ObfuscatedName("ac.am")
    public int field964 = -1;

    @ObfuscatedName("ac.ac")
    public int[] field971;

    @ObfuscatedName("ac.aw")
    public int field966 = -1;

    @ObfuscatedName("ac.ak")
    public int field931 = -1;

    @ObfuscatedName("ac.ar")
    public int field949 = -1;

    @ObfuscatedName("ac.aa")
    public int field969 = 0;

    @ObfuscatedName("ac.av")
    public int field930 = 0;

    @ObfuscatedName("ac.aj")
    public int field975 = 0;

    @ObfuscatedName("ac.al")
    public int[] field965;

    @ObfuscatedName("bx.x(Lfp;Lfp;ZI)V")
    public static void method1042(class171 arg0, class171 arg1, boolean arg2) {
        Statics.field925 = arg0;
        Statics.field2963 = arg1;
        field955 = arg2;
    }

    @ObfuscatedName("r.r(II)Lac;")
    public static class43 method12(int arg0) {
        class43 var1 = (class43) field926.method3533((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field925.method3079(6, arg0);
        class43 var3 = new class43();
        var3.field948 = arg0;
        if (var2 != null) {
            var3.method768(new class123(var2));
        }
        var3.method767();
        if (var3.field963) {
            var3.field941 = 0;
            var3.field974 = false;
        }
        field926.method3535(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.j(I)V")
    public void method767() {
        if (this.field967 == -1) {
            this.field967 = 0;
            if (this.field932 != null && (this.field968 == null || this.field968[0] == 10)) {
                this.field967 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field951[var1] != null) {
                    this.field967 = 1;
                }
            }
        }
        if (this.field964 == -1) {
            this.field964 = this.field941 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ac.z(Ldp;I)V")
    public void method768(class123 arg0) {
        while (true) {
            int var2 = arg0.method2408();
            if (var2 == 0) {
                return;
            }
            this.method769(arg0, var2);
        }
    }

    @ObfuscatedName("ac.i(Ldp;II)V")
    public void method769(class123 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2408();
            if (var3 > 0) {
                if (this.field932 == null || field955) {
                    this.field968 = new int[var3];
                    this.field932 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field932[var4] = arg0.method2403();
                        this.field968[var4] = arg0.method2408();
                    }
                } else {
                    arg0.field2057 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field934 = arg0.method2626();
        } else if (arg1 == 5) {
            int var5 = arg0.method2408();
            if (var5 > 0) {
                if (this.field932 == null || field955) {
                    this.field968 = null;
                    this.field932 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field932[var6] = arg0.method2403();
                    }
                } else {
                    arg0.field2057 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field939 = arg0.method2408();
        } else if (arg1 == 15) {
            this.field940 = arg0.method2408();
        } else if (arg1 == 17) {
            this.field941 = 0;
            this.field974 = false;
        } else if (arg1 == 18) {
            this.field974 = false;
        } else if (arg1 == 19) {
            this.field967 = arg0.method2408();
        } else if (arg1 == 21) {
            this.field944 = 0;
        } else if (arg1 == 22) {
            this.field945 = true;
        } else if (arg1 == 23) {
            this.field946 = true;
        } else if (arg1 == 24) {
            this.field947 = arg0.method2403();
            if (this.field947 == 65535) {
                this.field947 = -1;
            }
        } else if (arg1 == 27) {
            this.field941 = 1;
        } else if (arg1 == 28) {
            this.field977 = arg0.method2408();
        } else if (arg1 == 29) {
            this.field973 = arg0.method2409();
        } else if (arg1 == 39) {
            this.field950 = arg0.method2409() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field951[arg1 - 30] = arg0.method2626();
            if (this.field951[arg1 - 30].equalsIgnoreCase(class161.field2399)) {
                this.field951[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2408();
            this.field935 = new short[var7];
            this.field970 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field935[var8] = (short) arg0.method2403();
                this.field970[var8] = (short) arg0.method2403();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2408();
            this.field972 = new short[var9];
            this.field938 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field972[var10] = (short) arg0.method2403();
                this.field938[var10] = (short) arg0.method2403();
            }
        } else if (arg1 == 60) {
            this.field952 = arg0.method2403();
        } else if (arg1 == 62) {
            this.field924 = true;
        } else if (arg1 == 64) {
            this.field933 = false;
        } else if (arg1 == 65) {
            this.field956 = arg0.method2403();
        } else if (arg1 == 66) {
            this.field957 = arg0.method2403();
        } else if (arg1 == 67) {
            this.field958 = arg0.method2403();
        } else if (arg1 == 68) {
            this.field953 = arg0.method2403();
        } else if (arg1 == 69) {
            arg0.method2408();
        } else if (arg1 == 70) {
            this.field959 = arg0.method2611();
        } else if (arg1 == 71) {
            this.field976 = arg0.method2611();
        } else if (arg1 == 72) {
            this.field961 = arg0.method2611();
        } else if (arg1 == 73) {
            this.field962 = true;
        } else if (arg1 == 74) {
            this.field963 = true;
        } else if (arg1 == 75) {
            this.field964 = arg0.method2408();
        } else if (arg1 == 77) {
            this.field966 = arg0.method2403();
            if (this.field966 == 65535) {
                this.field966 = -1;
            }
            this.field931 = arg0.method2403();
            if (this.field931 == 65535) {
                this.field931 = -1;
            }
            int var11 = arg0.method2408();
            this.field971 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field971[var12] = arg0.method2403();
                if (this.field971[var12] == 65535) {
                    this.field971[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field949 = arg0.method2403();
            this.field969 = arg0.method2408();
        } else if (arg1 == 79) {
            this.field930 = arg0.method2403();
            this.field975 = arg0.method2403();
            this.field969 = arg0.method2408();
            int var13 = arg0.method2408();
            this.field965 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field965[var14] = arg0.method2403();
            }
        } else if (arg1 == 81) {
            this.field944 = arg0.method2408() * 256;
        }
    }

    @ObfuscatedName("ac.b(II)Z")
    public final boolean method770(int arg0) {
        if (this.field968 != null) {
            for (int var4 = 0; var4 < this.field968.length; var4++) {
                if (this.field968[var4] == arg0) {
                    return Statics.field2963.method3081(this.field932[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field932 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field932.length; var3++) {
                var2 &= Statics.field2963.method3081(this.field932[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ac.l(B)Z")
    public final boolean method771() {
        if (this.field932 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field932.length; var2++) {
            var1 &= Statics.field2963.method3081(this.field932[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ac.m(II[[IIIII)Lcl;")
    public final class89 method772(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field968 == null) {
            var7 = (long) ((this.field948 << 10) + arg1);
        } else {
            var7 = (long) ((this.field948 << 10) + (arg0 << 3) + arg1);
        }
        class89 var9 = (class89) field928.method3533(var7);
        if (var9 == null) {
            class104 var10 = this.method777(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field945) {
                var10.field1785 = (short) (this.field973 + 64);
                var10.field1742 = (short) (this.field950 + 768);
                var10.method2174();
                var9 = var10;
            } else {
                var9 = var10.method2150(this.field973 + 64, this.field950 + 768, -50, -10, -50);
            }
            field928.method3535(var9, var7);
        }
        if (this.field945) {
            var9 = ((class104) var9).method2127();
        }
        if (this.field944 >= 0) {
            if (var9 instanceof class109) {
                var9 = ((class109) var9).method2219(arg2, arg3, arg4, arg5, true, this.field944);
            } else if (var9 instanceof class104) {
                var9 = ((class104) var9).method2128(arg2, arg3, arg4, arg5, true, this.field944);
            }
        }
        return var9;
    }

    @ObfuscatedName("ac.p(II[[IIIIS)Ldj;")
    public final class109 method781(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field968 == null) {
            var7 = (long) ((this.field948 << 10) + arg1);
        } else {
            var7 = (long) ((this.field948 << 10) + (arg0 << 3) + arg1);
        }
        class109 var9 = (class109) field929.method3533(var7);
        if (var9 == null) {
            class104 var10 = this.method777(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2150(this.field973 + 64, this.field950 + 768, -50, -10, -50);
            field929.method3535(var9, var7);
        }
        if (this.field944 >= 0) {
            var9 = var9.method2219(arg2, arg3, arg4, arg5, true, this.field944);
        }
        return var9;
    }

    @ObfuscatedName("ac.f(II[[IIIILak;II)Ldj;")
    public final class109 method774(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class45 arg6, int arg7) {
        long var9;
        if (this.field968 == null) {
            var9 = (long) ((this.field948 << 10) + arg1);
        } else {
            var9 = (long) ((this.field948 << 10) + (arg0 << 3) + arg1);
        }
        class109 var11 = (class109) field929.method3533(var9);
        if (var11 == null) {
            class104 var12 = this.method777(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2150(this.field973 + 64, this.field950 + 768, -50, -10, -50);
            field929.method3535(var11, var9);
        }
        if (arg6 == null && this.field944 == -1) {
            return var11;
        }
        class109 var13;
        if (arg6 == null) {
            var13 = var11.method2220(true);
        } else {
            var13 = arg6.method834(var11, arg7, arg1);
        }
        if (this.field944 >= 0) {
            var13 = var13.method2219(arg2, arg3, arg4, arg5, false, this.field944);
        }
        return var13;
    }

    @ObfuscatedName("ac.d(III)Lcy;")
    public final class104 method777(int arg0, int arg1) {
        class104 var3 = null;
        if (this.field968 == null) {
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
                var3 = (class104) field927.method3533((long) var7);
                if (var3 == null) {
                    var3 = class104.method2122(Statics.field2963, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2137();
                    }
                    field927.method3535(var3, (long) var7);
                }
                if (var5 > 1) {
                    field960[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class104(field960, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field968.length; var9++) {
                if (this.field968[var9] == arg0) {
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
            var3 = (class104) field927.method3533((long) var10);
            if (var3 == null) {
                var3 = class104.method2122(Statics.field2963, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2137();
                }
                field927.method3535(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field956 == 128 && this.field957 == 128 && this.field958 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field959 == 0 && this.field976 == 0 && this.field961 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class104 var14 = new class104(var3, arg1 == 0 && !var12 && !var13, this.field935 == null, this.field972 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2133(256);
            var14.method2144(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2124();
        } else if (var15 == 2) {
            var14.method2121();
        } else if (var15 == 3) {
            var14.method2176();
        }
        if (this.field935 != null) {
            for (int var16 = 0; var16 < this.field935.length; var16++) {
                var14.method2197(this.field935[var16], this.field970[var16]);
            }
        }
        if (this.field972 != null) {
            for (int var17 = 0; var17 < this.field972.length; var17++) {
                var14.method2136(this.field972[var17], this.field938[var17]);
            }
        }
        if (var12) {
            var14.method2146(this.field956, this.field957, this.field958);
        }
        if (var13) {
            var14.method2144(this.field959, this.field976, this.field961);
        }
        return var14;
    }

    @ObfuscatedName("ac.v(I)Lac;")
    public final class43 method776() {
        int var1 = -1;
        if (this.field966 != -1) {
            var1 = class180.method870(this.field966);
        } else if (this.field931 != -1) {
            var1 = class180.field2960[this.field931];
        }
        return var1 < 0 || var1 >= this.field971.length || this.field971[var1] == -1 ? null : method12(this.field971[var1]);
    }

    @ObfuscatedName("n.q(B)V")
    public static void method546() {
        field926.method3534();
        field927.method3534();
        field928.method3534();
        field929.method3534();
    }

    @ObfuscatedName("ac.t(I)Z")
    public boolean method766() {
        if (this.field971 == null) {
            return this.field949 != -1 || this.field965 != null;
        }
        for (int var1 = 0; var1 < this.field971.length; var1++) {
            if (this.field971[var1] != -1) {
                class43 var2 = method12(this.field971[var1]);
                if (var2.field949 != -1 || var2.field965 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
