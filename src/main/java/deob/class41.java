package deob;

@ObfuscatedName("ae")
public class class41 extends class205 {

    @ObfuscatedName("ae.a")
    public static boolean field935 = false;

    @ObfuscatedName("ae.c")
    public static class194 field959 = new class194(64);

    @ObfuscatedName("ae.y")
    public static class194 field927 = new class194(500);

    @ObfuscatedName("ae.k")
    public static class194 field928 = new class194(30);

    @ObfuscatedName("ae.r")
    public static class194 field925 = new class194(30);

    @ObfuscatedName("ae.p")
    public static class101[] field930 = new class101[4];

    @ObfuscatedName("ae.q")
    public int field931;

    @ObfuscatedName("ae.m")
    public int[] field944;

    @ObfuscatedName("ae.e")
    public int[] field933;

    @ObfuscatedName("ae.x")
    public String field934 = "null";

    @ObfuscatedName("ae.z")
    public short[] field929;

    @ObfuscatedName("ae.i")
    public short[] field973;

    @ObfuscatedName("ae.t")
    public short[] field937;

    @ObfuscatedName("ae.n")
    public short[] field947;

    @ObfuscatedName("ae.u")
    public int field939 = 1;

    @ObfuscatedName("ae.g")
    public int field940 = 1;

    @ObfuscatedName("ae.j")
    public int field941 = 2;

    @ObfuscatedName("ae.h")
    public boolean field942 = true;

    @ObfuscatedName("ae.s")
    public int field943 = -1;

    @ObfuscatedName("ae.f")
    public int field936 = -1;

    @ObfuscatedName("ae.b")
    public boolean field945 = false;

    @ObfuscatedName("ae.l")
    public boolean field946 = false;

    @ObfuscatedName("ae.o")
    public int field960 = -1;

    @ObfuscatedName("ae.v")
    public int field948 = 16;

    @ObfuscatedName("ae.ad")
    public int field965 = 0;

    @ObfuscatedName("ae.ar")
    public int field950 = 0;

    @ObfuscatedName("ae.ah")
    public String[] field951 = new String[5];

    @ObfuscatedName("ae.ay")
    public int field952 = -1;

    @ObfuscatedName("ae.af")
    public int field953 = -1;

    @ObfuscatedName("ae.al")
    public boolean field954 = false;

    @ObfuscatedName("ae.ai")
    public boolean field955 = true;

    @ObfuscatedName("ae.an")
    public int field977 = 128;

    @ObfuscatedName("ae.az")
    public int field957 = 128;

    @ObfuscatedName("ae.ac")
    public int field958 = 128;

    @ObfuscatedName("ae.ao")
    public int field967 = 0;

    @ObfuscatedName("ae.ax")
    public int field966 = 0;

    @ObfuscatedName("ae.at")
    public int field961 = 0;

    @ObfuscatedName("ae.ab")
    public boolean field962 = false;

    @ObfuscatedName("ae.ae")
    public boolean field938 = false;

    @ObfuscatedName("ae.au")
    public int field964 = -1;

    @ObfuscatedName("ae.am")
    public int[] field926;

    @ObfuscatedName("ae.aj")
    public int field975 = -1;

    @ObfuscatedName("ae.aq")
    public int field971 = -1;

    @ObfuscatedName("ae.ag")
    public int field968 = -1;

    @ObfuscatedName("ae.ap")
    public int field969 = 0;

    @ObfuscatedName("ae.ak")
    public int field963 = 0;

    @ObfuscatedName("ae.as")
    public int field949 = 0;

    @ObfuscatedName("ae.aa")
    public int[] field972;

    @ObfuscatedName("fc.a(Lft;Lft;ZB)V")
    public static void method3246(class168 arg0, class168 arg1, boolean arg2) {
        Statics.field3215 = arg0;
        Statics.field3183 = arg1;
        field935 = arg2;
    }

    @ObfuscatedName("ei.w(II)Lae;")
    public static class41 method2809(int arg0) {
        class41 var1 = (class41) field959.method3579((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3215.method3188(6, arg0);
        class41 var3 = new class41();
        var3.field931 = arg0;
        if (var2 != null) {
            var3.method869(new class120(var2));
        }
        var3.method868();
        if (var3.field938) {
            var3.field941 = 0;
            var3.field942 = false;
        }
        field959.method3581(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.d(B)V")
    public void method868() {
        if (this.field943 == -1) {
            this.field943 = 0;
            if (this.field944 != null && (this.field933 == null || this.field933[0] == 10)) {
                this.field943 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field951[var1] != null) {
                    this.field943 = 1;
                }
            }
        }
        if (this.field964 == -1) {
            this.field964 = this.field941 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ae.c(Ldx;I)V")
    public void method869(class120 arg0) {
        while (true) {
            int var2 = arg0.method2462();
            if (var2 == 0) {
                return;
            }
            this.method870(arg0, var2);
        }
    }

    @ObfuscatedName("ae.y(Ldx;II)V")
    public void method870(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2462();
            if (var3 > 0) {
                if (this.field944 == null || field935) {
                    this.field933 = new int[var3];
                    this.field944 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field944[var4] = arg0.method2464();
                        this.field933[var4] = arg0.method2462();
                    }
                } else {
                    arg0.field1993 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field934 = arg0.method2470();
        } else if (arg1 == 5) {
            int var5 = arg0.method2462();
            if (var5 > 0) {
                if (this.field944 == null || field935) {
                    this.field933 = null;
                    this.field944 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field944[var6] = arg0.method2464();
                    }
                } else {
                    arg0.field1993 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field939 = arg0.method2462();
        } else if (arg1 == 15) {
            this.field940 = arg0.method2462();
        } else if (arg1 == 17) {
            this.field941 = 0;
            this.field942 = false;
        } else if (arg1 == 18) {
            this.field942 = false;
        } else if (arg1 == 19) {
            this.field943 = arg0.method2462();
        } else if (arg1 == 21) {
            this.field936 = 0;
        } else if (arg1 == 22) {
            this.field945 = true;
        } else if (arg1 == 23) {
            this.field946 = true;
        } else if (arg1 == 24) {
            this.field960 = arg0.method2464();
            if (this.field960 == 65535) {
                this.field960 = -1;
            }
        } else if (arg1 == 27) {
            this.field941 = 1;
        } else if (arg1 == 28) {
            this.field948 = arg0.method2462();
        } else if (arg1 == 29) {
            this.field965 = arg0.method2548();
        } else if (arg1 == 39) {
            this.field950 = arg0.method2548() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field951[arg1 - 30] = arg0.method2470();
            if (this.field951[arg1 - 30].equalsIgnoreCase(class158.field2304)) {
                this.field951[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2462();
            this.field929 = new short[var7];
            this.field973 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field929[var8] = (short) arg0.method2464();
                this.field973[var8] = (short) arg0.method2464();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2462();
            this.field937 = new short[var9];
            this.field947 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field937[var10] = (short) arg0.method2464();
                this.field947[var10] = (short) arg0.method2464();
            }
        } else if (arg1 == 60) {
            this.field952 = arg0.method2464();
        } else if (arg1 == 62) {
            this.field954 = true;
        } else if (arg1 == 64) {
            this.field955 = false;
        } else if (arg1 == 65) {
            this.field977 = arg0.method2464();
        } else if (arg1 == 66) {
            this.field957 = arg0.method2464();
        } else if (arg1 == 67) {
            this.field958 = arg0.method2464();
        } else if (arg1 == 68) {
            this.field953 = arg0.method2464();
        } else if (arg1 == 69) {
            arg0.method2462();
        } else if (arg1 == 70) {
            this.field967 = arg0.method2513();
        } else if (arg1 == 71) {
            this.field966 = arg0.method2513();
        } else if (arg1 == 72) {
            this.field961 = arg0.method2513();
        } else if (arg1 == 73) {
            this.field962 = true;
        } else if (arg1 == 74) {
            this.field938 = true;
        } else if (arg1 == 75) {
            this.field964 = arg0.method2462();
        } else if (arg1 == 77) {
            this.field975 = arg0.method2464();
            if (this.field975 == 65535) {
                this.field975 = -1;
            }
            this.field971 = arg0.method2464();
            if (this.field971 == 65535) {
                this.field971 = -1;
            }
            int var11 = arg0.method2462();
            this.field926 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field926[var12] = arg0.method2464();
                if (this.field926[var12] == 65535) {
                    this.field926[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field968 = arg0.method2464();
            this.field969 = arg0.method2462();
        } else if (arg1 == 79) {
            this.field963 = arg0.method2464();
            this.field949 = arg0.method2464();
            this.field969 = arg0.method2462();
            int var13 = arg0.method2462();
            this.field972 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field972[var14] = arg0.method2464();
            }
        } else if (arg1 == 81) {
            this.field936 = arg0.method2462() * 256;
        }
    }

    @ObfuscatedName("ae.k(II)Z")
    public final boolean method871(int arg0) {
        if (this.field933 != null) {
            for (int var4 = 0; var4 < this.field933.length; var4++) {
                if (this.field933[var4] == arg0) {
                    return Statics.field3183.method3214(this.field944[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field944 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field944.length; var3++) {
                var2 &= Statics.field3183.method3214(this.field944[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ae.r(I)Z")
    public final boolean method891() {
        if (this.field944 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field944.length; var2++) {
            var1 &= Statics.field3183.method3214(this.field944[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ae.p(II[[IIIII)Lcz;")
    public final class86 method873(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field933 == null) {
            var7 = (long) ((this.field931 << 10) + arg1);
        } else {
            var7 = (long) ((this.field931 << 10) + (arg0 << 3) + arg1);
        }
        class86 var9 = (class86) field928.method3579(var7);
        if (var9 == null) {
            class101 var10 = this.method876(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field945) {
                var10.field1722 = (short) (this.field965 + 64);
                var10.field1723 = (short) (this.field950 + 768);
                var10.method2169();
                var9 = var10;
            } else {
                var9 = var10.method2226(this.field965 + 64, this.field950 + 768, -50, -10, -50);
            }
            field928.method3581(var9, var7);
        }
        if (this.field945) {
            var9 = ((class101) var9).method2153();
        }
        if (this.field936 >= 0) {
            if (var9 instanceof class106) {
                var9 = ((class106) var9).method2309(arg2, arg3, arg4, arg5, true, this.field936);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2154(arg2, arg3, arg4, arg5, true, this.field936);
            }
        }
        return var9;
    }

    @ObfuscatedName("ae.q(II[[IIIIB)Ldr;")
    public final class106 method874(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field933 == null) {
            var7 = (long) ((this.field931 << 10) + arg1);
        } else {
            var7 = (long) ((this.field931 << 10) + (arg0 << 3) + arg1);
        }
        class106 var9 = (class106) field925.method3579(var7);
        if (var9 == null) {
            class101 var10 = this.method876(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2226(this.field965 + 64, this.field950 + 768, -50, -10, -50);
            field925.method3581(var9, var7);
        }
        if (this.field936 >= 0) {
            var9 = var9.method2309(arg2, arg3, arg4, arg5, true, this.field936);
        }
        return var9;
    }

    @ObfuscatedName("ae.m(II[[IIIILam;IB)Ldr;")
    public final class106 method911(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field933 == null) {
            var9 = (long) ((this.field931 << 10) + arg1);
        } else {
            var9 = (long) ((this.field931 << 10) + (arg0 << 3) + arg1);
        }
        class106 var11 = (class106) field925.method3579(var9);
        if (var11 == null) {
            class101 var12 = this.method876(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2226(this.field965 + 64, this.field950 + 768, -50, -10, -50);
            field925.method3581(var11, var9);
        }
        if (arg6 == null && this.field936 == -1) {
            return var11;
        }
        class106 var13;
        if (arg6 == null) {
            var13 = var11.method2326(true);
        } else {
            var13 = arg6.method933(var11, arg7, arg1);
        }
        if (this.field936 >= 0) {
            var13 = var13.method2309(arg2, arg3, arg4, arg5, false, this.field936);
        }
        return var13;
    }

    @ObfuscatedName("ae.e(III)Lcx;")
    public final class101 method876(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field933 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field944 == null) {
                return null;
            }
            boolean var4 = this.field954;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field944.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field944[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field927.method3579((long) var7);
                if (var3 == null) {
                    var3 = class101.method2165(Statics.field3183, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2148();
                    }
                    field927.method3581(var3, (long) var7);
                }
                if (var5 > 1) {
                    field930[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field930, var5);
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
            int var10 = this.field944[var8];
            boolean var11 = this.field954 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field927.method3579((long) var10);
            if (var3 == null) {
                var3 = class101.method2165(Statics.field3183, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2148();
                }
                field927.method3581(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field977 == 128 && this.field957 == 128 && this.field958 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field967 == 0 && this.field966 == 0 && this.field961 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field929 == null, this.field937 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2198(256);
            var14.method2187(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2156();
        } else if (var15 == 2) {
            var14.method2157();
        } else if (var15 == 3) {
            var14.method2158();
        }
        if (this.field929 != null) {
            for (int var16 = 0; var16 < this.field929.length; var16++) {
                var14.method2161(this.field929[var16], this.field973[var16]);
            }
        }
        if (this.field937 != null) {
            for (int var17 = 0; var17 < this.field937.length; var17++) {
                var14.method2162(this.field937[var17], this.field947[var17]);
            }
        }
        if (var12) {
            var14.method2164(this.field977, this.field957, this.field958);
        }
        if (var13) {
            var14.method2187(this.field967, this.field966, this.field961);
        }
        return var14;
    }

    @ObfuscatedName("ae.x(I)Lae;")
    public final class41 method872() {
        int var1 = -1;
        if (this.field975 != -1) {
            var1 = class177.method2119(this.field975);
        } else if (this.field971 != -1) {
            var1 = class177.field2906[this.field971];
        }
        return var1 < 0 || var1 >= this.field926.length || this.field926[var1] == -1 ? null : method2809(this.field926[var1]);
    }

    @ObfuscatedName("p.z(I)V")
    public static void method139() {
        field959.method3582();
        field927.method3582();
        field928.method3582();
        field925.method3582();
    }

    @ObfuscatedName("ae.i(B)Z")
    public boolean method878() {
        if (this.field926 == null) {
            return this.field968 != -1 || this.field972 != null;
        }
        for (int var1 = 0; var1 < this.field926.length; var1++) {
            if (this.field926[var1] != -1) {
                class41 var2 = method2809(this.field926[var1]);
                if (var2.field968 != -1 || var2.field972 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
