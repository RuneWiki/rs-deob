package deob;

@ObfuscatedName("ae")
public class class41 extends class204 {

    @ObfuscatedName("ae.h")
    public static boolean field975 = false;

    @ObfuscatedName("ae.q")
    public static class193 field932 = new class193(64);

    @ObfuscatedName("ae.p")
    public static class193 field944 = new class193(500);

    @ObfuscatedName("ae.c")
    public static class193 field933 = new class193(30);

    @ObfuscatedName("ae.f")
    public static class193 field934 = new class193(30);

    @ObfuscatedName("ae.y")
    public static class100[] field935 = new class100[4];

    @ObfuscatedName("ae.w")
    public int field936;

    @ObfuscatedName("ae.l")
    public int[] field928;

    @ObfuscatedName("ae.v")
    public int[] field958;

    @ObfuscatedName("ae.k")
    public String field978 = "null";

    @ObfuscatedName("ae.o")
    public short[] field940;

    @ObfuscatedName("ae.u")
    public short[] field974;

    @ObfuscatedName("ae.s")
    public short[] field942;

    @ObfuscatedName("ae.g")
    public short[] field943;

    @ObfuscatedName("ae.x")
    public int field962 = 1;

    @ObfuscatedName("ae.a")
    public int field945 = 1;

    @ObfuscatedName("ae.t")
    public int field946 = 2;

    @ObfuscatedName("ae.z")
    public boolean field947 = true;

    @ObfuscatedName("ae.r")
    public int field948 = -1;

    @ObfuscatedName("ae.d")
    public int field949 = -1;

    @ObfuscatedName("ae.n")
    public boolean field950 = false;

    @ObfuscatedName("ae.j")
    public boolean field951 = false;

    @ObfuscatedName("ae.b")
    public int field976 = -1;

    @ObfuscatedName("ae.e")
    public int field969 = 16;

    @ObfuscatedName("ae.ai")
    public int field954 = 0;

    @ObfuscatedName("ae.ao")
    public int field955 = 0;

    @ObfuscatedName("ae.af")
    public String[] field956 = new String[5];

    @ObfuscatedName("ae.ab")
    public int field957 = -1;

    @ObfuscatedName("ae.ax")
    public int field964 = -1;

    @ObfuscatedName("ae.ap")
    public boolean field959 = false;

    @ObfuscatedName("ae.as")
    public boolean field960 = true;

    @ObfuscatedName("ae.av")
    public int field961 = 128;

    @ObfuscatedName("ae.am")
    public int field938 = 128;

    @ObfuscatedName("ae.aa")
    public int field963 = 128;

    @ObfuscatedName("ae.aq")
    public int field931 = 0;

    @ObfuscatedName("ae.ad")
    public int field965 = 0;

    @ObfuscatedName("ae.ar")
    public int field966 = 0;

    @ObfuscatedName("ae.ag")
    public boolean field939 = false;

    @ObfuscatedName("ae.ae")
    public boolean field968 = false;

    @ObfuscatedName("ae.ak")
    public int field967 = -1;

    @ObfuscatedName("ae.az")
    public int[] field970;

    @ObfuscatedName("ae.ac")
    public int field971 = -1;

    @ObfuscatedName("ae.ay")
    public int field972 = -1;

    @ObfuscatedName("ae.al")
    public int field973 = -1;

    @ObfuscatedName("ae.at")
    public int field941 = 0;

    @ObfuscatedName("ae.aj")
    public int field953 = 0;

    @ObfuscatedName("ae.aw")
    public int field937 = 0;

    @ObfuscatedName("ae.au")
    public int[] field977;

    @ObfuscatedName("ft.h(Lfv;Lfv;ZI)V")
    public static void method3129(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field929 = arg0;
        Statics.field930 = arg1;
        field975 = arg2;
    }

    @ObfuscatedName("au.m(II)Lae;")
    public static class41 method961(int arg0) {
        class41 var1 = (class41) field932.method3472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field929.method3051(6, arg0);
        class41 var3 = new class41();
        var3.field936 = arg0;
        if (var2 != null) {
            var3.method759(new class119(var2));
        }
        var3.method757();
        if (var3.field968) {
            var3.field946 = 0;
            var3.field947 = false;
        }
        field932.method3474(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ae.i(S)V")
    public void method757() {
        if (this.field948 == -1) {
            this.field948 = 0;
            if (this.field928 != null && (this.field958 == null || this.field958[0] == 10)) {
                this.field948 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field956[var1] != null) {
                    this.field948 = 1;
                }
            }
        }
        if (this.field967 == -1) {
            this.field967 = this.field946 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ae.q(Ldp;B)V")
    public void method759(class119 arg0) {
        while (true) {
            int var2 = arg0.method2320();
            if (var2 == 0) {
                return;
            }
            this.method760(arg0, var2);
        }
    }

    @ObfuscatedName("ae.p(Ldp;II)V")
    public void method760(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2320();
            if (var3 > 0) {
                if (this.field928 == null || field975) {
                    this.field958 = new int[var3];
                    this.field928 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field928[var4] = arg0.method2322();
                        this.field958[var4] = arg0.method2320();
                    }
                } else {
                    arg0.field1988 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field978 = arg0.method2350();
        } else if (arg1 == 5) {
            int var5 = arg0.method2320();
            if (var5 > 0) {
                if (this.field928 == null || field975) {
                    this.field958 = null;
                    this.field928 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field928[var6] = arg0.method2322();
                    }
                } else {
                    arg0.field1988 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field962 = arg0.method2320();
        } else if (arg1 == 15) {
            this.field945 = arg0.method2320();
        } else if (arg1 == 17) {
            this.field946 = 0;
            this.field947 = false;
        } else if (arg1 == 18) {
            this.field947 = false;
        } else if (arg1 == 19) {
            this.field948 = arg0.method2320();
        } else if (arg1 == 21) {
            this.field949 = 0;
        } else if (arg1 == 22) {
            this.field950 = true;
        } else if (arg1 == 23) {
            this.field951 = true;
        } else if (arg1 == 24) {
            this.field976 = arg0.method2322();
            if (this.field976 == 65535) {
                this.field976 = -1;
            }
        } else if (arg1 == 27) {
            this.field946 = 1;
        } else if (arg1 == 28) {
            this.field969 = arg0.method2320();
        } else if (arg1 == 29) {
            this.field954 = arg0.method2425();
        } else if (arg1 == 39) {
            this.field955 = arg0.method2425() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field956[arg1 - 30] = arg0.method2350();
            if (this.field956[arg1 - 30].equalsIgnoreCase(class157.field2298)) {
                this.field956[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2320();
            this.field940 = new short[var7];
            this.field974 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field940[var8] = (short) arg0.method2322();
                this.field974[var8] = (short) arg0.method2322();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2320();
            this.field942 = new short[var9];
            this.field943 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field942[var10] = (short) arg0.method2322();
                this.field943[var10] = (short) arg0.method2322();
            }
        } else if (arg1 == 60) {
            this.field957 = arg0.method2322();
        } else if (arg1 == 62) {
            this.field959 = true;
        } else if (arg1 == 64) {
            this.field960 = false;
        } else if (arg1 == 65) {
            this.field961 = arg0.method2322();
        } else if (arg1 == 66) {
            this.field938 = arg0.method2322();
        } else if (arg1 == 67) {
            this.field963 = arg0.method2322();
        } else if (arg1 == 68) {
            this.field964 = arg0.method2322();
        } else if (arg1 == 69) {
            arg0.method2320();
        } else if (arg1 == 70) {
            this.field931 = arg0.method2323();
        } else if (arg1 == 71) {
            this.field965 = arg0.method2323();
        } else if (arg1 == 72) {
            this.field966 = arg0.method2323();
        } else if (arg1 == 73) {
            this.field939 = true;
        } else if (arg1 == 74) {
            this.field968 = true;
        } else if (arg1 == 75) {
            this.field967 = arg0.method2320();
        } else if (arg1 == 77) {
            this.field971 = arg0.method2322();
            if (this.field971 == 65535) {
                this.field971 = -1;
            }
            this.field972 = arg0.method2322();
            if (this.field972 == 65535) {
                this.field972 = -1;
            }
            int var11 = arg0.method2320();
            this.field970 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field970[var12] = arg0.method2322();
                if (this.field970[var12] == 65535) {
                    this.field970[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field973 = arg0.method2322();
            this.field941 = arg0.method2320();
        } else if (arg1 == 79) {
            this.field953 = arg0.method2322();
            this.field937 = arg0.method2322();
            this.field941 = arg0.method2320();
            int var13 = arg0.method2320();
            this.field977 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field977[var14] = arg0.method2322();
            }
        } else if (arg1 == 81) {
            this.field949 = arg0.method2320() * 256;
        }
    }

    @ObfuscatedName("ae.c(II)Z")
    public final boolean method798(int arg0) {
        if (this.field958 != null) {
            for (int var4 = 0; var4 < this.field958.length; var4++) {
                if (this.field958[var4] == arg0) {
                    return Statics.field930.method3080(this.field928[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field928 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field928.length; var3++) {
                var2 &= Statics.field930.method3080(this.field928[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ae.f(I)Z")
    public final boolean method762() {
        if (this.field928 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field928.length; var2++) {
            var1 &= Statics.field930.method3080(this.field928[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ae.y(II[[IIIII)Lcz;")
    public final class85 method763(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field958 == null) {
            var7 = (long) ((this.field936 << 10) + arg1);
        } else {
            var7 = (long) ((this.field936 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field933.method3472(var7);
        if (var9 == null) {
            class100 var10 = this.method765(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field950) {
                var10.field1687 = (short) (this.field954 + 64);
                var10.field1712 = (short) (this.field955 + 768);
                var10.method2041();
                var9 = var10;
            } else {
                var9 = var10.method2067(this.field954 + 64, this.field955 + 768, -50, -10, -50);
            }
            field933.method3474(var9, var7);
        }
        if (this.field950) {
            var9 = ((class100) var9).method2029();
        }
        if (this.field949 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2145(arg2, arg3, arg4, arg5, true, this.field949);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2030(arg2, arg3, arg4, arg5, true, this.field949);
            }
        }
        return var9;
    }

    @ObfuscatedName("ae.w(II[[IIIII)Ldb;")
    public final class105 method764(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field958 == null) {
            var7 = (long) ((this.field936 << 10) + arg1);
        } else {
            var7 = (long) ((this.field936 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field934.method3472(var7);
        if (var9 == null) {
            class100 var10 = this.method765(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2067(this.field954 + 64, this.field955 + 768, -50, -10, -50);
            field934.method3474(var9, var7);
        }
        if (this.field949 >= 0) {
            var9 = var9.method2145(arg2, arg3, arg4, arg5, true, this.field949);
        }
        return var9;
    }

    @ObfuscatedName("ae.l(II[[IIIILaz;II)Ldb;")
    public final class105 method758(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field958 == null) {
            var9 = (long) ((this.field936 << 10) + arg1);
        } else {
            var9 = (long) ((this.field936 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field934.method3472(var9);
        if (var11 == null) {
            class100 var12 = this.method765(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2067(this.field954 + 64, this.field955 + 768, -50, -10, -50);
            field934.method3474(var11, var9);
        }
        if (arg6 == null && this.field949 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2118(true);
        } else {
            var13 = arg6.method827(var11, arg7, arg1);
        }
        if (this.field949 >= 0) {
            var13 = var13.method2145(arg2, arg3, arg4, arg5, false, this.field949);
        }
        return var13;
    }

    @ObfuscatedName("ae.v(III)Lcl;")
    public final class100 method765(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field958 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field928 == null) {
                return null;
            }
            boolean var4 = this.field959;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field928.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field928[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field944.method3472((long) var7);
                if (var3 == null) {
                    var3 = class100.method2081(Statics.field930, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2039();
                    }
                    field944.method3474(var3, (long) var7);
                }
                if (var5 > 1) {
                    field935[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field935, var5);
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
            int var10 = this.field928[var8];
            boolean var11 = this.field959 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field944.method3472((long) var10);
            if (var3 == null) {
                var3 = class100.method2081(Statics.field930, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2039();
                }
                field944.method3474(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field961 == 128 && this.field938 == 128 && this.field963 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field931 == 0 && this.field965 == 0 && this.field966 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field940 == null, this.field942 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2089(256);
            var14.method2037(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2043();
        } else if (var15 == 2) {
            var14.method2050();
        } else if (var15 == 3) {
            var14.method2066();
        }
        if (this.field940 != null) {
            for (int var16 = 0; var16 < this.field940.length; var16++) {
                var14.method2098(this.field940[var16], this.field974[var16]);
            }
        }
        if (this.field942 != null) {
            for (int var17 = 0; var17 < this.field942.length; var17++) {
                var14.method2038(this.field942[var17], this.field943[var17]);
            }
        }
        if (var12) {
            var14.method2071(this.field961, this.field938, this.field963);
        }
        if (var13) {
            var14.method2037(this.field931, this.field965, this.field966);
        }
        return var14;
    }

    @ObfuscatedName("ae.k(I)Lae;")
    public final class41 method766() {
        int var1 = -1;
        if (this.field971 != -1) {
            var1 = class176.method624(this.field971);
        } else if (this.field972 != -1) {
            var1 = class176.field2896[this.field972];
        }
        return var1 < 0 || var1 >= this.field970.length || this.field970[var1] == -1 ? null : method961(this.field970[var1]);
    }

    @ObfuscatedName("ae.o(I)Z")
    public boolean method767() {
        if (this.field970 == null) {
            return this.field973 != -1 || this.field977 != null;
        }
        for (int var1 = 0; var1 < this.field970.length; var1++) {
            if (this.field970[var1] != -1) {
                class41 var2 = method961(this.field970[var1]);
                if (var2.field973 != -1 || var2.field977 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
