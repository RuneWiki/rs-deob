package deob;

@ObfuscatedName("ap")
public class class41 extends class205 {

    @ObfuscatedName("ap.f")
    public static boolean field975 = false;

    @ObfuscatedName("ap.b")
    public static class194 field939 = new class194(64);

    @ObfuscatedName("ap.l")
    public static class194 field967 = new class194(500);

    @ObfuscatedName("ap.d")
    public static class194 field941 = new class194(30);

    @ObfuscatedName("ap.n")
    public static class194 field951 = new class194(30);

    @ObfuscatedName("ap.m")
    public static class101[] field943 = new class101[4];

    @ObfuscatedName("ap.g")
    public int field944;

    @ObfuscatedName("ap.s")
    public int[] field942;

    @ObfuscatedName("ap.r")
    public int[] field940;

    @ObfuscatedName("ap.k")
    public String field963 = "null";

    @ObfuscatedName("ap.o")
    public short[] field976;

    @ObfuscatedName("ap.q")
    public short[] field949;

    @ObfuscatedName("ap.p")
    public short[] field950;

    @ObfuscatedName("ap.h")
    public short[] field947;

    @ObfuscatedName("ap.e")
    public int field946 = 1;

    @ObfuscatedName("ap.t")
    public int field938 = 1;

    @ObfuscatedName("ap.w")
    public int field954 = 2;

    @ObfuscatedName("ap.v")
    public boolean field955 = true;

    @ObfuscatedName("ap.y")
    public int field956 = -1;

    @ObfuscatedName("ap.c")
    public int field957 = -1;

    @ObfuscatedName("ap.i")
    public boolean field958 = false;

    @ObfuscatedName("ap.a")
    public boolean field959 = false;

    @ObfuscatedName("ap.z")
    public int field960 = -1;

    @ObfuscatedName("ap.j")
    public int field961 = 16;

    @ObfuscatedName("ap.ag")
    public int field962 = 0;

    @ObfuscatedName("ap.ax")
    public int field945 = 0;

    @ObfuscatedName("ap.ao")
    public String[] field964 = new String[5];

    @ObfuscatedName("ap.ac")
    public int field965 = -1;

    @ObfuscatedName("ap.aj")
    public int field966 = -1;

    @ObfuscatedName("ap.an")
    public boolean field953 = false;

    @ObfuscatedName("ap.al")
    public boolean field968 = true;

    @ObfuscatedName("ap.as")
    public int field969 = 128;

    @ObfuscatedName("ap.av")
    public int field981 = 128;

    @ObfuscatedName("ap.am")
    public int field971 = 128;

    @ObfuscatedName("ap.az")
    public int field937 = 0;

    @ObfuscatedName("ap.ai")
    public int field973 = 0;

    @ObfuscatedName("ap.aq")
    public int field974 = 0;

    @ObfuscatedName("ap.ah")
    public boolean field978 = false;

    @ObfuscatedName("ap.ap")
    public boolean field972 = false;

    @ObfuscatedName("ap.af")
    public int field977 = -1;

    @ObfuscatedName("ap.aa")
    public int[] field948;

    @ObfuscatedName("ap.ay")
    public int field979 = -1;

    @ObfuscatedName("ap.aw")
    public int field980 = -1;

    @ObfuscatedName("ap.ak")
    public int field982 = -1;

    @ObfuscatedName("ap.ae")
    public int field936 = 0;

    @ObfuscatedName("ap.ad")
    public int field983 = 0;

    @ObfuscatedName("ap.au")
    public int field984 = 0;

    @ObfuscatedName("ap.ar")
    public int[] field985;

    @ObfuscatedName("ds.f(Lfl;Lfl;ZI)V")
    public static void method2309(class168 arg0, class168 arg1, boolean arg2) {
        Statics.field970 = arg0;
        Statics.field952 = arg1;
        field975 = arg2;
    }

    @ObfuscatedName("er.u(IB)Lap;")
    public static class41 method2950(int arg0) {
        class41 var1 = (class41) field939.method3530((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field970.method3061(6, arg0);
        class41 var3 = new class41();
        var3.field944 = arg0;
        if (var2 != null) {
            var3.method837(new class120(var2));
        }
        var3.method843();
        if (var3.field972) {
            var3.field954 = 0;
            var3.field955 = false;
        }
        field939.method3521(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ap.x(B)V")
    public void method843() {
        if (this.field956 == -1) {
            this.field956 = 0;
            if (this.field942 != null && (this.field940 == null || this.field940[0] == 10)) {
                this.field956 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field964[var1] != null) {
                    this.field956 = 1;
                }
            }
        }
        if (this.field977 == -1) {
            this.field977 = this.field954 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ap.b(Ldj;I)V")
    public void method837(class120 arg0) {
        while (true) {
            int var2 = arg0.method2385();
            if (var2 == 0) {
                return;
            }
            this.method816(arg0, var2);
        }
    }

    @ObfuscatedName("ap.l(Ldj;IB)V")
    public void method816(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2385();
            if (var3 > 0) {
                if (this.field942 == null || field975) {
                    this.field940 = new int[var3];
                    this.field942 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field942[var4] = arg0.method2387();
                        this.field940[var4] = arg0.method2385();
                    }
                } else {
                    arg0.field1999 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field963 = arg0.method2499();
        } else if (arg1 == 5) {
            int var5 = arg0.method2385();
            if (var5 > 0) {
                if (this.field942 == null || field975) {
                    this.field940 = null;
                    this.field942 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field942[var6] = arg0.method2387();
                    }
                } else {
                    arg0.field1999 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field946 = arg0.method2385();
        } else if (arg1 == 15) {
            this.field938 = arg0.method2385();
        } else if (arg1 == 17) {
            this.field954 = 0;
            this.field955 = false;
        } else if (arg1 == 18) {
            this.field955 = false;
        } else if (arg1 == 19) {
            this.field956 = arg0.method2385();
        } else if (arg1 == 21) {
            this.field957 = 0;
        } else if (arg1 == 22) {
            this.field958 = true;
        } else if (arg1 == 23) {
            this.field959 = true;
        } else if (arg1 == 24) {
            this.field960 = arg0.method2387();
            if (this.field960 == 65535) {
                this.field960 = -1;
            }
        } else if (arg1 == 27) {
            this.field954 = 1;
        } else if (arg1 == 28) {
            this.field961 = arg0.method2385();
        } else if (arg1 == 29) {
            this.field962 = arg0.method2369();
        } else if (arg1 == 39) {
            this.field945 = arg0.method2369() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field964[arg1 - 30] = arg0.method2499();
            if (this.field964[arg1 - 30].equalsIgnoreCase(class158.field2398)) {
                this.field964[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2385();
            this.field976 = new short[var7];
            this.field949 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field976[var8] = (short) arg0.method2387();
                this.field949[var8] = (short) arg0.method2387();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2385();
            this.field950 = new short[var9];
            this.field947 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field950[var10] = (short) arg0.method2387();
                this.field947[var10] = (short) arg0.method2387();
            }
        } else if (arg1 == 60) {
            this.field965 = arg0.method2387();
        } else if (arg1 == 62) {
            this.field953 = true;
        } else if (arg1 == 64) {
            this.field968 = false;
        } else if (arg1 == 65) {
            this.field969 = arg0.method2387();
        } else if (arg1 == 66) {
            this.field981 = arg0.method2387();
        } else if (arg1 == 67) {
            this.field971 = arg0.method2387();
        } else if (arg1 == 68) {
            this.field966 = arg0.method2387();
        } else if (arg1 == 69) {
            arg0.method2385();
        } else if (arg1 == 70) {
            this.field937 = arg0.method2388();
        } else if (arg1 == 71) {
            this.field973 = arg0.method2388();
        } else if (arg1 == 72) {
            this.field974 = arg0.method2388();
        } else if (arg1 == 73) {
            this.field978 = true;
        } else if (arg1 == 74) {
            this.field972 = true;
        } else if (arg1 == 75) {
            this.field977 = arg0.method2385();
        } else if (arg1 == 77) {
            this.field979 = arg0.method2387();
            if (this.field979 == 65535) {
                this.field979 = -1;
            }
            this.field980 = arg0.method2387();
            if (this.field980 == 65535) {
                this.field980 = -1;
            }
            int var11 = arg0.method2385();
            this.field948 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field948[var12] = arg0.method2387();
                if (this.field948[var12] == 65535) {
                    this.field948[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field982 = arg0.method2387();
            this.field936 = arg0.method2385();
        } else if (arg1 == 79) {
            this.field983 = arg0.method2387();
            this.field984 = arg0.method2387();
            this.field936 = arg0.method2385();
            int var13 = arg0.method2385();
            this.field985 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field985[var14] = arg0.method2387();
            }
        } else if (arg1 == 81) {
            this.field957 = arg0.method2385() * 256;
        }
    }

    @ObfuscatedName("ap.d(II)Z")
    public final boolean method847(int arg0) {
        if (this.field940 != null) {
            for (int var4 = 0; var4 < this.field940.length; var4++) {
                if (this.field940[var4] == arg0) {
                    return Statics.field952.method3063(this.field942[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field942 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field942.length; var3++) {
                var2 &= Statics.field952.method3063(this.field942[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ap.n(I)Z")
    public final boolean method818() {
        if (this.field942 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field942.length; var2++) {
            var1 &= Statics.field952.method3063(this.field942[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ap.m(II[[IIIIB)Lcm;")
    public final class86 method842(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field940 == null) {
            var7 = (long) ((this.field944 << 10) + arg1);
        } else {
            var7 = (long) ((this.field944 << 10) + (arg0 << 3) + arg1);
        }
        class86 var9 = (class86) field941.method3530(var7);
        if (var9 == null) {
            class101 var10 = this.method831(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field958) {
                var10.field1710 = (short) (this.field962 + 64);
                var10.field1689 = (short) (this.field945 + 768);
                var10.method2124();
                var9 = var10;
            } else {
                var9 = var10.method2128(this.field962 + 64, this.field945 + 768, -50, -10, -50);
            }
            field941.method3521(var9, var7);
        }
        if (this.field958) {
            var9 = ((class101) var9).method2141();
        }
        if (this.field957 >= 0) {
            if (var9 instanceof class106) {
                var9 = ((class106) var9).method2209(arg2, arg3, arg4, arg5, true, this.field957);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2120(arg2, arg3, arg4, arg5, true, this.field957);
            }
        }
        return var9;
    }

    @ObfuscatedName("ap.g(II[[IIIIS)Ldr;")
    public final class106 method820(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field940 == null) {
            var7 = (long) ((this.field944 << 10) + arg1);
        } else {
            var7 = (long) ((this.field944 << 10) + (arg0 << 3) + arg1);
        }
        class106 var9 = (class106) field951.method3530(var7);
        if (var9 == null) {
            class101 var10 = this.method831(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2128(this.field962 + 64, this.field945 + 768, -50, -10, -50);
            field951.method3521(var9, var7);
        }
        if (this.field957 >= 0) {
            var9 = var9.method2209(arg2, arg3, arg4, arg5, true, this.field957);
        }
        return var9;
    }

    @ObfuscatedName("ap.s(II[[IIIILaa;IS)Ldr;")
    public final class106 method821(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field940 == null) {
            var9 = (long) ((this.field944 << 10) + arg1);
        } else {
            var9 = (long) ((this.field944 << 10) + (arg0 << 3) + arg1);
        }
        class106 var11 = (class106) field951.method3530(var9);
        if (var11 == null) {
            class101 var12 = this.method831(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2128(this.field962 + 64, this.field945 + 768, -50, -10, -50);
            field951.method3521(var11, var9);
        }
        if (arg6 == null && this.field957 == -1) {
            return var11;
        }
        class106 var13;
        if (arg6 == null) {
            var13 = var11.method2192(true);
        } else {
            var13 = arg6.method876(var11, arg7, arg1);
        }
        if (this.field957 >= 0) {
            var13 = var13.method2209(arg2, arg3, arg4, arg5, false, this.field957);
        }
        return var13;
    }

    @ObfuscatedName("ap.r(III)Lct;")
    public final class101 method831(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field940 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field942 == null) {
                return null;
            }
            boolean var4 = this.field953;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field942.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field942[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field967.method3530((long) var7);
                if (var3 == null) {
                    var3 = class101.method2118(Statics.field952, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2122();
                    }
                    field967.method3521(var3, (long) var7);
                }
                if (var5 > 1) {
                    field943[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field943, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field940.length; var9++) {
                if (this.field940[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field942[var8];
            boolean var11 = this.field953 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field967.method3530((long) var10);
            if (var3 == null) {
                var3 = class101.method2118(Statics.field952, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2122();
                }
                field967.method3521(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field969 == 128 && this.field981 == 128 && this.field971 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field937 == 0 && this.field973 == 0 && this.field974 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field976 == null, this.field950 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2149(256);
            var14.method2174(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2116();
        } else if (var15 == 2) {
            var14.method2143();
        } else if (var15 == 3) {
            var14.method2117();
        }
        if (this.field976 != null) {
            for (int var16 = 0; var16 < this.field976.length; var16++) {
                var14.method2179(this.field976[var16], this.field949[var16]);
            }
        }
        if (this.field950 != null) {
            for (int var17 = 0; var17 < this.field950.length; var17++) {
                var14.method2138(this.field950[var17], this.field947[var17]);
            }
        }
        if (var12) {
            var14.method2123(this.field969, this.field981, this.field971);
        }
        if (var13) {
            var14.method2174(this.field937, this.field973, this.field974);
        }
        return var14;
    }

    @ObfuscatedName("ap.k(I)Lap;")
    public final class41 method823() {
        int var1 = -1;
        if (this.field979 != -1) {
            var1 = class177.method2677(this.field979);
        } else if (this.field980 != -1) {
            var1 = class177.field2906[this.field980];
        }
        return var1 < 0 || var1 >= this.field948.length || this.field948[var1] == -1 ? null : method2950(this.field948[var1]);
    }

    @ObfuscatedName("ap.o(I)Z")
    public boolean method824() {
        if (this.field948 == null) {
            return this.field982 != -1 || this.field985 != null;
        }
        for (int var1 = 0; var1 < this.field948.length; var1++) {
            if (this.field948[var1] != -1) {
                class41 var2 = method2950(this.field948[var1]);
                if (var2.field982 != -1 || var2.field985 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
