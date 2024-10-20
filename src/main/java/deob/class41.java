package deob;

@ObfuscatedName("ai")
public class class41 extends class204 {

    @ObfuscatedName("ai.c")
    public static boolean field969 = false;

    @ObfuscatedName("ai.t")
    public static class193 field925 = new class193(64);

    @ObfuscatedName("ai.g")
    public static class193 field926 = new class193(500);

    @ObfuscatedName("ai.o")
    public static class193 field927 = new class193(30);

    @ObfuscatedName("ai.i")
    public static class193 field938 = new class193(30);

    @ObfuscatedName("ai.w")
    public static class100[] field948 = new class100[4];

    @ObfuscatedName("ai.m")
    public int field928;

    @ObfuscatedName("ai.r")
    public int[] field929;

    @ObfuscatedName("ai.y")
    public int[] field932;

    @ObfuscatedName("ai.q")
    public String field933 = "null";

    @ObfuscatedName("ai.f")
    public short[] field934;

    @ObfuscatedName("ai.x")
    public short[] field968;

    @ObfuscatedName("ai.d")
    public short[] field936;

    @ObfuscatedName("ai.e")
    public short[] field937;

    @ObfuscatedName("ai.l")
    public int field958 = 1;

    @ObfuscatedName("ai.u")
    public int field939 = 1;

    @ObfuscatedName("ai.a")
    public int field974 = 2;

    @ObfuscatedName("ai.b")
    public boolean field941 = true;

    @ObfuscatedName("ai.s")
    public int field942 = -1;

    @ObfuscatedName("ai.v")
    public int field943 = -1;

    @ObfuscatedName("ai.j")
    public boolean field944 = false;

    @ObfuscatedName("ai.z")
    public boolean field975 = false;

    @ObfuscatedName("ai.n")
    public int field946 = -1;

    @ObfuscatedName("ai.p")
    public int field947 = 16;

    @ObfuscatedName("ai.aj")
    public int field967 = 0;

    @ObfuscatedName("ai.aq")
    public int field949 = 0;

    @ObfuscatedName("ai.aw")
    public String[] field950 = new String[5];

    @ObfuscatedName("ai.az")
    public int field951 = -1;

    @ObfuscatedName("ai.at")
    public int field952 = -1;

    @ObfuscatedName("ai.af")
    public boolean field966 = false;

    @ObfuscatedName("ai.ax")
    public boolean field954 = true;

    @ObfuscatedName("ai.ac")
    public int field955 = 128;

    @ObfuscatedName("ai.am")
    public int field956 = 128;

    @ObfuscatedName("ai.ao")
    public int field957 = 128;

    @ObfuscatedName("ai.ad")
    public int field964 = 0;

    @ObfuscatedName("ai.ak")
    public int field959 = 0;

    @ObfuscatedName("ai.au")
    public int field960 = 0;

    @ObfuscatedName("ai.aa")
    public boolean field961 = false;

    @ObfuscatedName("ai.ai")
    public boolean field962 = false;

    @ObfuscatedName("ai.av")
    public int field963 = -1;

    @ObfuscatedName("ai.ar")
    public int[] field953;

    @ObfuscatedName("ai.as")
    public int field965 = -1;

    @ObfuscatedName("ai.ap")
    public int field930 = -1;

    @ObfuscatedName("ai.ag")
    public int field945 = -1;

    @ObfuscatedName("ai.ab")
    public int field940 = 0;

    @ObfuscatedName("ai.al")
    public int field931 = 0;

    @ObfuscatedName("ai.ae")
    public int field970 = 0;

    @ObfuscatedName("ai.ay")
    public int[] field971;

    @ObfuscatedName("e.c(Lfj;Lfj;ZI)V")
    public static void method178(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field923 = arg0;
        Statics.field924 = arg1;
        field969 = arg2;
    }

    @ObfuscatedName("er.h(II)Lai;")
    public static class41 method2760(int arg0) {
        class41 var1 = (class41) field925.method3485((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field923.method2994(6, arg0);
        class41 var3 = new class41();
        var3.field928 = arg0;
        if (var2 != null) {
            var3.method753(new class119(var2));
        }
        var3.method758();
        if (var3.field962) {
            var3.field974 = 0;
            var3.field941 = false;
        }
        field925.method3487(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ai.k(I)V")
    public void method758() {
        if (this.field942 == -1) {
            this.field942 = 0;
            if (this.field929 != null && (this.field932 == null || this.field932[0] == 10)) {
                this.field942 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field950[var1] != null) {
                    this.field942 = 1;
                }
            }
        }
        if (this.field963 == -1) {
            this.field963 = this.field974 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ai.t(Ldf;I)V")
    public void method753(class119 arg0) {
        while (true) {
            int var2 = arg0.method2291();
            if (var2 == 0) {
                return;
            }
            this.method754(arg0, var2);
        }
    }

    @ObfuscatedName("ai.g(Ldf;IB)V")
    public void method754(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2291();
            if (var3 > 0) {
                if (this.field929 == null || field969) {
                    this.field932 = new int[var3];
                    this.field929 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field929[var4] = arg0.method2293();
                        this.field932[var4] = arg0.method2291();
                    }
                } else {
                    arg0.field1955 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field933 = arg0.method2299();
        } else if (arg1 == 5) {
            int var5 = arg0.method2291();
            if (var5 > 0) {
                if (this.field929 == null || field969) {
                    this.field932 = null;
                    this.field929 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field929[var6] = arg0.method2293();
                    }
                } else {
                    arg0.field1955 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field958 = arg0.method2291();
        } else if (arg1 == 15) {
            this.field939 = arg0.method2291();
        } else if (arg1 == 17) {
            this.field974 = 0;
            this.field941 = false;
        } else if (arg1 == 18) {
            this.field941 = false;
        } else if (arg1 == 19) {
            this.field942 = arg0.method2291();
        } else if (arg1 == 21) {
            this.field943 = 0;
        } else if (arg1 == 22) {
            this.field944 = true;
        } else if (arg1 == 23) {
            this.field975 = true;
        } else if (arg1 == 24) {
            this.field946 = arg0.method2293();
            if (this.field946 == 65535) {
                this.field946 = -1;
            }
        } else if (arg1 == 27) {
            this.field974 = 1;
        } else if (arg1 == 28) {
            this.field947 = arg0.method2291();
        } else if (arg1 == 29) {
            this.field967 = arg0.method2292();
        } else if (arg1 == 39) {
            this.field949 = arg0.method2292() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field950[arg1 - 30] = arg0.method2299();
            if (this.field950[arg1 - 30].equalsIgnoreCase(class157.field2348)) {
                this.field950[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2291();
            this.field934 = new short[var7];
            this.field968 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field934[var8] = (short) arg0.method2293();
                this.field968[var8] = (short) arg0.method2293();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2291();
            this.field936 = new short[var9];
            this.field937 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field936[var10] = (short) arg0.method2293();
                this.field937[var10] = (short) arg0.method2293();
            }
        } else if (arg1 == 60) {
            this.field951 = arg0.method2293();
        } else if (arg1 == 62) {
            this.field966 = true;
        } else if (arg1 == 64) {
            this.field954 = false;
        } else if (arg1 == 65) {
            this.field955 = arg0.method2293();
        } else if (arg1 == 66) {
            this.field956 = arg0.method2293();
        } else if (arg1 == 67) {
            this.field957 = arg0.method2293();
        } else if (arg1 == 68) {
            this.field952 = arg0.method2293();
        } else if (arg1 == 69) {
            arg0.method2291();
        } else if (arg1 == 70) {
            this.field964 = arg0.method2439();
        } else if (arg1 == 71) {
            this.field959 = arg0.method2439();
        } else if (arg1 == 72) {
            this.field960 = arg0.method2439();
        } else if (arg1 == 73) {
            this.field961 = true;
        } else if (arg1 == 74) {
            this.field962 = true;
        } else if (arg1 == 75) {
            this.field963 = arg0.method2291();
        } else if (arg1 == 77) {
            this.field965 = arg0.method2293();
            if (this.field965 == 65535) {
                this.field965 = -1;
            }
            this.field930 = arg0.method2293();
            if (this.field930 == 65535) {
                this.field930 = -1;
            }
            int var11 = arg0.method2291();
            this.field953 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field953[var12] = arg0.method2293();
                if (this.field953[var12] == 65535) {
                    this.field953[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field945 = arg0.method2293();
            this.field940 = arg0.method2291();
        } else if (arg1 == 79) {
            this.field931 = arg0.method2293();
            this.field970 = arg0.method2293();
            this.field940 = arg0.method2291();
            int var13 = arg0.method2291();
            this.field971 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field971[var14] = arg0.method2293();
            }
        } else if (arg1 == 81) {
            this.field943 = arg0.method2291() * 256;
        }
    }

    @ObfuscatedName("ai.o(II)Z")
    public final boolean method752(int arg0) {
        if (this.field932 != null) {
            for (int var4 = 0; var4 < this.field932.length; var4++) {
                if (this.field932[var4] == arg0) {
                    return Statics.field924.method2996(this.field929[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field929 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field929.length; var3++) {
                var2 &= Statics.field924.method2996(this.field929[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ai.i(I)Z")
    public final boolean method756() {
        if (this.field929 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field929.length; var2++) {
            var1 &= Statics.field924.method2996(this.field929[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ai.w(II[[IIIIS)Lcj;")
    public final class85 method774(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field932 == null) {
            var7 = (long) ((this.field928 << 10) + arg1);
        } else {
            var7 = (long) ((this.field928 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field927.method3485(var7);
        if (var9 == null) {
            class100 var10 = this.method759(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field944) {
                var10.field1686 = (short) (this.field967 + 64);
                var10.field1687 = (short) (this.field949 + 768);
                var10.method2023();
                var9 = var10;
            } else {
                var9 = var10.method2027(this.field967 + 64, this.field949 + 768, -50, -10, -50);
            }
            field927.method3487(var9, var7);
        }
        if (this.field944) {
            var9 = ((class100) var9).method2040();
        }
        if (this.field943 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2091(arg2, arg3, arg4, arg5, true, this.field943);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2046(arg2, arg3, arg4, arg5, true, this.field943);
            }
        }
        return var9;
    }

    @ObfuscatedName("ai.m(II[[IIIIB)Ldt;")
    public final class105 method764(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field932 == null) {
            var7 = (long) ((this.field928 << 10) + arg1);
        } else {
            var7 = (long) ((this.field928 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field938.method3485(var7);
        if (var9 == null) {
            class100 var10 = this.method759(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2027(this.field967 + 64, this.field949 + 768, -50, -10, -50);
            field938.method3487(var9, var7);
        }
        if (this.field943 >= 0) {
            var9 = var9.method2091(arg2, arg3, arg4, arg5, true, this.field943);
        }
        return var9;
    }

    @ObfuscatedName("ai.r(II[[IIIILar;II)Ldt;")
    public final class105 method751(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field932 == null) {
            var9 = (long) ((this.field928 << 10) + arg1);
        } else {
            var9 = (long) ((this.field928 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field938.method3485(var9);
        if (var11 == null) {
            class100 var12 = this.method759(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2027(this.field967 + 64, this.field949 + 768, -50, -10, -50);
            field938.method3487(var11, var9);
        }
        if (arg6 == null && this.field943 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2113(true);
        } else {
            var13 = arg6.method827(var11, arg7, arg1);
        }
        if (this.field943 >= 0) {
            var13 = var13.method2091(arg2, arg3, arg4, arg5, false, this.field943);
        }
        return var13;
    }

    @ObfuscatedName("ai.y(III)Lch;")
    public final class100 method759(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field932 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field929 == null) {
                return null;
            }
            boolean var4 = this.field966;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field929.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field929[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field926.method3485((long) var7);
                if (var3 == null) {
                    var3 = class100.method2063(Statics.field924, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2021();
                    }
                    field926.method3487(var3, (long) var7);
                }
                if (var5 > 1) {
                    field948[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field948, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field932.length; var9++) {
                if (this.field932[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field929[var8];
            boolean var11 = this.field966 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field926.method3485((long) var10);
            if (var3 == null) {
                var3 = class100.method2063(Statics.field924, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2021();
                }
                field926.method3487(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field955 == 128 && this.field956 == 128 && this.field957 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field964 == 0 && this.field959 == 0 && this.field960 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field934 == null, this.field936 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2017(256);
            var14.method2018(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2014();
        } else if (var15 == 2) {
            var14.method2049();
        } else if (var15 == 3) {
            var14.method2016();
        }
        if (this.field934 != null) {
            for (int var16 = 0; var16 < this.field934.length; var16++) {
                var14.method2019(this.field934[var16], this.field968[var16]);
            }
        }
        if (this.field936 != null) {
            for (int var17 = 0; var17 < this.field936.length; var17++) {
                var14.method2020(this.field936[var17], this.field937[var17]);
            }
        }
        if (var12) {
            var14.method2022(this.field955, this.field956, this.field957);
        }
        if (var13) {
            var14.method2018(this.field964, this.field959, this.field960);
        }
        return var14;
    }

    @ObfuscatedName("ai.q(B)Lai;")
    public final class41 method783() {
        int var1 = -1;
        if (this.field965 != -1) {
            var1 = class176.method43(this.field965);
        } else if (this.field930 != -1) {
            var1 = class176.field2887[this.field930];
        }
        return var1 < 0 || var1 >= this.field953.length || this.field953[var1] == -1 ? null : method2760(this.field953[var1]);
    }

    @ObfuscatedName("y.f(B)V")
    public static void method132() {
        field925.method3488();
        field926.method3488();
        field927.method3488();
        field938.method3488();
    }

    @ObfuscatedName("ai.x(I)Z")
    public boolean method761() {
        if (this.field953 == null) {
            return this.field945 != -1 || this.field971 != null;
        }
        for (int var1 = 0; var1 < this.field953.length; var1++) {
            if (this.field953[var1] != -1) {
                class41 var2 = method2760(this.field953[var1]);
                if (var2.field945 != -1 || var2.field971 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
