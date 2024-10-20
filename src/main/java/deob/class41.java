package deob;

@ObfuscatedName("ac")
public class class41 extends class204 {

    @ObfuscatedName("ac.l")
    public static boolean field955 = false;

    @ObfuscatedName("ac.o")
    public static class193 field922 = new class193(64);

    @ObfuscatedName("ac.g")
    public static class193 field923 = new class193(500);

    @ObfuscatedName("ac.m")
    public static class193 field924 = new class193(30);

    @ObfuscatedName("ac.b")
    public static class193 field965 = new class193(30);

    @ObfuscatedName("ac.p")
    public static class100[] field926 = new class100[4];

    @ObfuscatedName("ac.t")
    public int field927;

    @ObfuscatedName("ac.w")
    public int[] field930;

    @ObfuscatedName("ac.x")
    public int[] field920;

    @ObfuscatedName("ac.k")
    public String field936 = "null";

    @ObfuscatedName("ac.z")
    public short[] field931;

    @ObfuscatedName("ac.v")
    public short[] field932;

    @ObfuscatedName("ac.j")
    public short[] field933;

    @ObfuscatedName("ac.f")
    public short[] field960;

    @ObfuscatedName("ac.c")
    public int field969 = 1;

    @ObfuscatedName("ac.s")
    public int field952 = 1;

    @ObfuscatedName("ac.r")
    public int field937 = 2;

    @ObfuscatedName("ac.u")
    public boolean field938 = true;

    @ObfuscatedName("ac.a")
    public int field939 = -1;

    @ObfuscatedName("ac.h")
    public int field940 = -1;

    @ObfuscatedName("ac.y")
    public boolean field941 = false;

    @ObfuscatedName("ac.d")
    public boolean field942 = false;

    @ObfuscatedName("ac.n")
    public int field943 = -1;

    @ObfuscatedName("ac.i")
    public int field944 = 16;

    @ObfuscatedName("ac.ad")
    public int field945 = 0;

    @ObfuscatedName("ac.aq")
    public int field946 = 0;

    @ObfuscatedName("ac.ak")
    public String[] field947 = new String[5];

    @ObfuscatedName("ac.au")
    public int field948 = -1;

    @ObfuscatedName("ac.ao")
    public int field949 = -1;

    @ObfuscatedName("ac.am")
    public boolean field950 = false;

    @ObfuscatedName("ac.ah")
    public boolean field928 = true;

    @ObfuscatedName("ac.aj")
    public int field951 = 128;

    @ObfuscatedName("ac.ar")
    public int field953 = 128;

    @ObfuscatedName("ac.ae")
    public int field954 = 128;

    @ObfuscatedName("ac.al")
    public int field925 = 0;

    @ObfuscatedName("ac.ay")
    public int field956 = 0;

    @ObfuscatedName("ac.ag")
    public int field957 = 0;

    @ObfuscatedName("ac.ab")
    public boolean field935 = false;

    @ObfuscatedName("ac.ac")
    public boolean field959 = false;

    @ObfuscatedName("ac.az")
    public int field929 = -1;

    @ObfuscatedName("ac.as")
    public int[] field961;

    @ObfuscatedName("ac.ai")
    public int field962 = -1;

    @ObfuscatedName("ac.an")
    public int field963 = -1;

    @ObfuscatedName("ac.ap")
    public int field964 = -1;

    @ObfuscatedName("ac.aa")
    public int field958 = 0;

    @ObfuscatedName("ac.ax")
    public int field966 = 0;

    @ObfuscatedName("ac.av")
    public int field967 = 0;

    @ObfuscatedName("ac.at")
    public int[] field968;

    @ObfuscatedName("ec.l(II)Lac;")
    public static class41 method2705(int arg0) {
        class41 var1 = (class41) field922.method3478((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field921.method3050(6, arg0);
        class41 var3 = new class41();
        var3.field927 = arg0;
        if (var2 != null) {
            var3.method797(new class119(var2));
        }
        var3.method796();
        if (var3.field959) {
            var3.field937 = 0;
            var3.field938 = false;
        }
        field922.method3479(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.e(I)V")
    public void method796() {
        if (this.field939 == -1) {
            this.field939 = 0;
            if (this.field930 != null && (this.field920 == null || this.field920[0] == 10)) {
                this.field939 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field947[var1] != null) {
                    this.field939 = 1;
                }
            }
        }
        if (this.field929 == -1) {
            this.field929 = this.field937 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ac.q(Ldl;I)V")
    public void method797(class119 arg0) {
        while (true) {
            int var2 = arg0.method2388();
            if (var2 == 0) {
                return;
            }
            this.method798(arg0, var2);
        }
    }

    @ObfuscatedName("ac.o(Ldl;IB)V")
    public void method798(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2388();
            if (var3 > 0) {
                if (this.field930 == null || field955) {
                    this.field920 = new int[var3];
                    this.field930 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field930[var4] = arg0.method2440();
                        this.field920[var4] = arg0.method2388();
                    }
                } else {
                    arg0.field1988 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field936 = arg0.method2396();
        } else if (arg1 == 5) {
            int var5 = arg0.method2388();
            if (var5 > 0) {
                if (this.field930 == null || field955) {
                    this.field920 = null;
                    this.field930 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field930[var6] = arg0.method2440();
                    }
                } else {
                    arg0.field1988 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field969 = arg0.method2388();
        } else if (arg1 == 15) {
            this.field952 = arg0.method2388();
        } else if (arg1 == 17) {
            this.field937 = 0;
            this.field938 = false;
        } else if (arg1 == 18) {
            this.field938 = false;
        } else if (arg1 == 19) {
            this.field939 = arg0.method2388();
        } else if (arg1 == 21) {
            this.field940 = 0;
        } else if (arg1 == 22) {
            this.field941 = true;
        } else if (arg1 == 23) {
            this.field942 = true;
        } else if (arg1 == 24) {
            this.field943 = arg0.method2440();
            if (this.field943 == 65535) {
                this.field943 = -1;
            }
        } else if (arg1 == 27) {
            this.field937 = 1;
        } else if (arg1 == 28) {
            this.field944 = arg0.method2388();
        } else if (arg1 == 29) {
            this.field945 = arg0.method2389();
        } else if (arg1 == 39) {
            this.field946 = arg0.method2389() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field947[arg1 - 30] = arg0.method2396();
            if (this.field947[arg1 - 30].equalsIgnoreCase(class157.field2300)) {
                this.field947[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2388();
            this.field931 = new short[var7];
            this.field932 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field931[var8] = (short) arg0.method2440();
                this.field932[var8] = (short) arg0.method2440();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2388();
            this.field933 = new short[var9];
            this.field960 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field933[var10] = (short) arg0.method2440();
                this.field960[var10] = (short) arg0.method2440();
            }
        } else if (arg1 == 60) {
            this.field948 = arg0.method2440();
        } else if (arg1 == 62) {
            this.field950 = true;
        } else if (arg1 == 64) {
            this.field928 = false;
        } else if (arg1 == 65) {
            this.field951 = arg0.method2440();
        } else if (arg1 == 66) {
            this.field953 = arg0.method2440();
        } else if (arg1 == 67) {
            this.field954 = arg0.method2440();
        } else if (arg1 == 68) {
            this.field949 = arg0.method2440();
        } else if (arg1 == 69) {
            arg0.method2388();
        } else if (arg1 == 70) {
            this.field925 = arg0.method2391();
        } else if (arg1 == 71) {
            this.field956 = arg0.method2391();
        } else if (arg1 == 72) {
            this.field957 = arg0.method2391();
        } else if (arg1 == 73) {
            this.field935 = true;
        } else if (arg1 == 74) {
            this.field959 = true;
        } else if (arg1 == 75) {
            this.field929 = arg0.method2388();
        } else if (arg1 == 77) {
            this.field962 = arg0.method2440();
            if (this.field962 == 65535) {
                this.field962 = -1;
            }
            this.field963 = arg0.method2440();
            if (this.field963 == 65535) {
                this.field963 = -1;
            }
            int var11 = arg0.method2388();
            this.field961 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field961[var12] = arg0.method2440();
                if (this.field961[var12] == 65535) {
                    this.field961[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field964 = arg0.method2440();
            this.field958 = arg0.method2388();
        } else if (arg1 == 79) {
            this.field966 = arg0.method2440();
            this.field967 = arg0.method2440();
            this.field958 = arg0.method2388();
            int var13 = arg0.method2388();
            this.field968 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field968[var14] = arg0.method2440();
            }
        } else if (arg1 == 81) {
            this.field940 = arg0.method2388() * 256;
        }
    }

    @ObfuscatedName("ac.g(II)Z")
    public final boolean method799(int arg0) {
        if (this.field920 != null) {
            for (int var4 = 0; var4 < this.field920.length; var4++) {
                if (this.field920[var4] == arg0) {
                    return Statics.field3036.method3088(this.field930[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field930 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field930.length; var3++) {
                var2 &= Statics.field3036.method3088(this.field930[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ac.m(I)Z")
    public final boolean method809() {
        if (this.field930 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field930.length; var2++) {
            var1 &= Statics.field3036.method3088(this.field930[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ac.b(II[[IIIIB)Lcd;")
    public final class85 method813(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field920 == null) {
            var7 = (long) ((this.field927 << 10) + arg1);
        } else {
            var7 = (long) ((this.field927 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field924.method3478(var7);
        if (var9 == null) {
            class100 var10 = this.method833(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field941) {
                var10.field1684 = (short) (this.field945 + 64);
                var10.field1705 = (short) (this.field946 + 768);
                var10.method2128();
                var9 = var10;
            } else {
                var9 = var10.method2085(this.field945 + 64, this.field946 + 768, -50, -10, -50);
            }
            field924.method3479(var9, var7);
        }
        if (this.field941) {
            var9 = ((class100) var9).method2082();
        }
        if (this.field940 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2204(arg2, arg3, arg4, arg5, true, this.field940);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2109(arg2, arg3, arg4, arg5, true, this.field940);
            }
        }
        return var9;
    }

    @ObfuscatedName("ac.p(II[[IIIII)Ldt;")
    public final class105 method803(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field920 == null) {
            var7 = (long) ((this.field927 << 10) + arg1);
        } else {
            var7 = (long) ((this.field927 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field965.method3478(var7);
        if (var9 == null) {
            class100 var10 = this.method833(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2085(this.field945 + 64, this.field946 + 768, -50, -10, -50);
            field965.method3479(var9, var7);
        }
        if (this.field940 >= 0) {
            var9 = var9.method2204(arg2, arg3, arg4, arg5, true, this.field940);
        }
        return var9;
    }

    @ObfuscatedName("ac.t(II[[IIIILas;II)Ldt;")
    public final class105 method811(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field920 == null) {
            var9 = (long) ((this.field927 << 10) + arg1);
        } else {
            var9 = (long) ((this.field927 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field965.method3478(var9);
        if (var11 == null) {
            class100 var12 = this.method833(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2085(this.field945 + 64, this.field946 + 768, -50, -10, -50);
            field965.method3479(var11, var9);
        }
        if (arg6 == null && this.field940 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2243(true);
        } else {
            var13 = arg6.method865(var11, arg7, arg1);
        }
        if (this.field940 >= 0) {
            var13 = var13.method2204(arg2, arg3, arg4, arg5, false, this.field940);
        }
        return var13;
    }

    @ObfuscatedName("ac.w(III)Lcm;")
    public final class100 method833(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field920 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field930 == null) {
                return null;
            }
            boolean var4 = this.field950;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field930.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field930[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field923.method3478((long) var7);
                if (var3 == null) {
                    var3 = class100.method2077(Statics.field3036, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2092();
                    }
                    field923.method3479(var3, (long) var7);
                }
                if (var5 > 1) {
                    field926[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field926, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field920.length; var9++) {
                if (this.field920[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field930[var8];
            boolean var11 = this.field950 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field923.method3478((long) var10);
            if (var3 == null) {
                var3 = class100.method2077(Statics.field3036, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2092();
                }
                field923.method3479(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field951 == 128 && this.field953 == 128 && this.field954 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field925 == 0 && this.field956 == 0 && this.field957 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field931 == null, this.field933 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2106(256);
            var14.method2089(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2100();
        } else if (var15 == 2) {
            var14.method2086();
        } else if (var15 == 3) {
            var14.method2108();
        }
        if (this.field931 != null) {
            for (int var16 = 0; var16 < this.field931.length; var16++) {
                var14.method2090(this.field931[var16], this.field932[var16]);
            }
        }
        if (this.field933 != null) {
            for (int var17 = 0; var17 < this.field933.length; var17++) {
                var14.method2091(this.field933[var17], this.field960[var17]);
            }
        }
        if (var12) {
            var14.method2093(this.field951, this.field953, this.field954);
        }
        if (var13) {
            var14.method2089(this.field925, this.field956, this.field957);
        }
        return var14;
    }

    @ObfuscatedName("ac.x(I)Lac;")
    public final class41 method819() {
        int var1 = -1;
        if (this.field962 != -1) {
            var1 = Statics.method1245(this.field962);
        } else if (this.field963 != -1) {
            var1 = class176.field2889[this.field963];
        }
        return var1 < 0 || var1 >= this.field961.length || this.field961[var1] == -1 ? null : method2705(this.field961[var1]);
    }

    @ObfuscatedName("cf.k(I)V")
    public static void method2071() {
        field922.method3481();
        field923.method3481();
        field924.method3481();
        field965.method3481();
    }

    @ObfuscatedName("ac.z(B)Z")
    public boolean method805() {
        if (this.field961 == null) {
            return this.field964 != -1 || this.field968 != null;
        }
        for (int var1 = 0; var1 < this.field961.length; var1++) {
            if (this.field961[var1] != -1) {
                class41 var2 = method2705(this.field961[var1]);
                if (var2.field964 != -1 || var2.field968 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
