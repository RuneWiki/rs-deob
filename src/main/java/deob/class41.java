package deob;

@ObfuscatedName("ac")
public class class41 extends class204 {

    @ObfuscatedName("ac.d")
    public static boolean field949 = false;

    @ObfuscatedName("ac.l")
    public static class193 field932 = new class193(64);

    @ObfuscatedName("ac.y")
    public static class193 field931 = new class193(500);

    @ObfuscatedName("ac.w")
    public static class193 field943 = new class193(30);

    @ObfuscatedName("ac.u")
    public static class193 field933 = new class193(30);

    @ObfuscatedName("ac.a")
    public static class100[] field967 = new class100[4];

    @ObfuscatedName("ac.e")
    public int field978;

    @ObfuscatedName("ac.b")
    public int[] field936;

    @ObfuscatedName("ac.o")
    public int[] field937;

    @ObfuscatedName("ac.m")
    public String field935 = "null";

    @ObfuscatedName("ac.x")
    public short[] field939;

    @ObfuscatedName("ac.k")
    public short[] field940;

    @ObfuscatedName("ac.n")
    public short[] field941;

    @ObfuscatedName("ac.j")
    public short[] field946;

    @ObfuscatedName("ac.t")
    public int field927 = 1;

    @ObfuscatedName("ac.z")
    public int field944 = 1;

    @ObfuscatedName("ac.h")
    public int field938 = 2;

    @ObfuscatedName("ac.i")
    public boolean field969 = true;

    @ObfuscatedName("ac.q")
    public int field942 = -1;

    @ObfuscatedName("ac.r")
    public int field948 = -1;

    @ObfuscatedName("ac.s")
    public boolean field956 = false;

    @ObfuscatedName("ac.g")
    public boolean field930 = false;

    @ObfuscatedName("ac.f")
    public int field951 = -1;

    @ObfuscatedName("ac.c")
    public int field952 = 16;

    @ObfuscatedName("ac.ae")
    public int field953 = 0;

    @ObfuscatedName("ac.ao")
    public int field954 = 0;

    @ObfuscatedName("ac.ak")
    public String[] field955 = new String[5];

    @ObfuscatedName("ac.ah")
    public int field974 = -1;

    @ObfuscatedName("ac.al")
    public int field957 = -1;

    @ObfuscatedName("ac.ax")
    public boolean field958 = false;

    @ObfuscatedName("ac.az")
    public boolean field959 = true;

    @ObfuscatedName("ac.ad")
    public int field960 = 128;

    @ObfuscatedName("ac.aw")
    public int field961 = 128;

    @ObfuscatedName("ac.as")
    public int field962 = 128;

    @ObfuscatedName("ac.ai")
    public int field963 = 0;

    @ObfuscatedName("ac.aj")
    public int field964 = 0;

    @ObfuscatedName("ac.ap")
    public int field965 = 0;

    @ObfuscatedName("ac.ar")
    public boolean field966 = false;

    @ObfuscatedName("ac.ac")
    public boolean field980 = false;

    @ObfuscatedName("ac.aq")
    public int field968 = -1;

    @ObfuscatedName("ac.af")
    public int[] field945;

    @ObfuscatedName("ac.aa")
    public int field970 = -1;

    @ObfuscatedName("ac.ab")
    public int field971 = -1;

    @ObfuscatedName("ac.av")
    public int field972 = -1;

    @ObfuscatedName("ac.au")
    public int field973 = 0;

    @ObfuscatedName("ac.ay")
    public int field934 = 0;

    @ObfuscatedName("ac.ag")
    public int field975 = 0;

    @ObfuscatedName("ac.an")
    public int[] field950;

    @ObfuscatedName("ap.d(Lfn;Lfn;ZI)V")
    public static void method722(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field928 = arg0;
        Statics.field929 = arg1;
        field949 = arg2;
    }

    @ObfuscatedName("r.p(II)Lac;")
    public static class41 method551(int arg0) {
        class41 var1 = (class41) field932.method3553((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field928.method3134(6, arg0);
        class41 var3 = new class41();
        var3.field978 = arg0;
        if (var2 != null) {
            var3.method769(new class119(var2));
        }
        var3.method768();
        if (var3.field980) {
            var3.field938 = 0;
            var3.field969 = false;
        }
        field932.method3554(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ac.v(B)V")
    public void method768() {
        if (this.field942 == -1) {
            this.field942 = 0;
            if (this.field936 != null && (this.field937 == null || this.field937[0] == 10)) {
                this.field942 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field955[var1] != null) {
                    this.field942 = 1;
                }
            }
        }
        if (this.field968 == -1) {
            this.field968 = this.field938 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ac.l(Ldf;B)V")
    public void method769(class119 arg0) {
        while (true) {
            int var2 = arg0.method2357();
            if (var2 == 0) {
                return;
            }
            this.method770(arg0, var2);
        }
    }

    @ObfuscatedName("ac.y(Ldf;IB)V")
    public void method770(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2357();
            if (var3 > 0) {
                if (this.field936 == null || field949) {
                    this.field937 = new int[var3];
                    this.field936 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field936[var4] = arg0.method2359();
                        this.field937[var4] = arg0.method2357();
                    }
                } else {
                    arg0.field1966 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field935 = arg0.method2365();
        } else if (arg1 == 5) {
            int var5 = arg0.method2357();
            if (var5 > 0) {
                if (this.field936 == null || field949) {
                    this.field937 = null;
                    this.field936 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field936[var6] = arg0.method2359();
                    }
                } else {
                    arg0.field1966 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field927 = arg0.method2357();
        } else if (arg1 == 15) {
            this.field944 = arg0.method2357();
        } else if (arg1 == 17) {
            this.field938 = 0;
            this.field969 = false;
        } else if (arg1 == 18) {
            this.field969 = false;
        } else if (arg1 == 19) {
            this.field942 = arg0.method2357();
        } else if (arg1 == 21) {
            this.field948 = 0;
        } else if (arg1 == 22) {
            this.field956 = true;
        } else if (arg1 == 23) {
            this.field930 = true;
        } else if (arg1 == 24) {
            this.field951 = arg0.method2359();
            if (this.field951 == 65535) {
                this.field951 = -1;
            }
        } else if (arg1 == 27) {
            this.field938 = 1;
        } else if (arg1 == 28) {
            this.field952 = arg0.method2357();
        } else if (arg1 == 29) {
            this.field953 = arg0.method2477();
        } else if (arg1 == 39) {
            this.field954 = arg0.method2477() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field955[arg1 - 30] = arg0.method2365();
            if (this.field955[arg1 - 30].equalsIgnoreCase(class157.field2282)) {
                this.field955[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2357();
            this.field939 = new short[var7];
            this.field940 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field939[var8] = (short) arg0.method2359();
                this.field940[var8] = (short) arg0.method2359();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2357();
            this.field941 = new short[var9];
            this.field946 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field941[var10] = (short) arg0.method2359();
                this.field946[var10] = (short) arg0.method2359();
            }
        } else if (arg1 == 60) {
            this.field974 = arg0.method2359();
        } else if (arg1 == 62) {
            this.field958 = true;
        } else if (arg1 == 64) {
            this.field959 = false;
        } else if (arg1 == 65) {
            this.field960 = arg0.method2359();
        } else if (arg1 == 66) {
            this.field961 = arg0.method2359();
        } else if (arg1 == 67) {
            this.field962 = arg0.method2359();
        } else if (arg1 == 68) {
            this.field957 = arg0.method2359();
        } else if (arg1 == 69) {
            arg0.method2357();
        } else if (arg1 == 70) {
            this.field963 = arg0.method2360();
        } else if (arg1 == 71) {
            this.field964 = arg0.method2360();
        } else if (arg1 == 72) {
            this.field965 = arg0.method2360();
        } else if (arg1 == 73) {
            this.field966 = true;
        } else if (arg1 == 74) {
            this.field980 = true;
        } else if (arg1 == 75) {
            this.field968 = arg0.method2357();
        } else if (arg1 == 77) {
            this.field970 = arg0.method2359();
            if (this.field970 == 65535) {
                this.field970 = -1;
            }
            this.field971 = arg0.method2359();
            if (this.field971 == 65535) {
                this.field971 = -1;
            }
            int var11 = arg0.method2357();
            this.field945 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field945[var12] = arg0.method2359();
                if (this.field945[var12] == 65535) {
                    this.field945[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field972 = arg0.method2359();
            this.field973 = arg0.method2357();
        } else if (arg1 == 79) {
            this.field934 = arg0.method2359();
            this.field975 = arg0.method2359();
            this.field973 = arg0.method2357();
            int var13 = arg0.method2357();
            this.field950 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field950[var14] = arg0.method2359();
            }
        } else if (arg1 == 81) {
            this.field948 = arg0.method2357() * 256;
        }
    }

    @ObfuscatedName("ac.w(IB)Z")
    public final boolean method779(int arg0) {
        if (this.field937 != null) {
            for (int var4 = 0; var4 < this.field937.length; var4++) {
                if (this.field937[var4] == arg0) {
                    return Statics.field929.method3113(this.field936[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field936 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field936.length; var3++) {
                var2 &= Statics.field929.method3113(this.field936[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ac.u(B)Z")
    public final boolean method787() {
        if (this.field936 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field936.length; var2++) {
            var1 &= Statics.field929.method3113(this.field936[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ac.a(II[[IIIII)Lch;")
    public final class85 method772(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field937 == null) {
            var7 = (long) ((this.field978 << 10) + arg1);
        } else {
            var7 = (long) ((this.field978 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field943.method3553(var7);
        if (var9 == null) {
            class100 var10 = this.method776(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field956) {
                var10.field1708 = (short) (this.field953 + 64);
                var10.field1710 = (short) (this.field954 + 768);
                var10.method2097();
                var9 = var10;
            } else {
                var9 = var10.method2083(this.field953 + 64, this.field954 + 768, -50, -10, -50);
            }
            field943.method3554(var9, var7);
        }
        if (this.field956) {
            var9 = ((class100) var9).method2068();
        }
        if (this.field948 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2153(arg2, arg3, arg4, arg5, true, this.field948);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2069(arg2, arg3, arg4, arg5, true, this.field948);
            }
        }
        return var9;
    }

    @ObfuscatedName("ac.e(II[[IIIII)Ldn;")
    public final class105 method774(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field937 == null) {
            var7 = (long) ((this.field978 << 10) + arg1);
        } else {
            var7 = (long) ((this.field978 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field933.method3553(var7);
        if (var9 == null) {
            class100 var10 = this.method776(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2083(this.field953 + 64, this.field954 + 768, -50, -10, -50);
            field933.method3554(var9, var7);
        }
        if (this.field948 >= 0) {
            var9 = var9.method2153(arg2, arg3, arg4, arg5, true, this.field948);
        }
        return var9;
    }

    @ObfuscatedName("ac.b(II[[IIIILaf;II)Ldn;")
    public final class105 method775(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field937 == null) {
            var9 = (long) ((this.field978 << 10) + arg1);
        } else {
            var9 = (long) ((this.field978 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field933.method3553(var9);
        if (var11 == null) {
            class100 var12 = this.method776(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2083(this.field953 + 64, this.field954 + 768, -50, -10, -50);
            field933.method3554(var11, var9);
        }
        if (arg6 == null && this.field948 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2154(true);
        } else {
            var13 = arg6.method844(var11, arg7, arg1);
        }
        if (this.field948 >= 0) {
            var13 = var13.method2153(arg2, arg3, arg4, arg5, false, this.field948);
        }
        return var13;
    }

    @ObfuscatedName("ac.o(III)Lca;")
    public final class100 method776(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field937 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field936 == null) {
                return null;
            }
            boolean var4 = this.field958;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field936.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field936[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field931.method3553((long) var7);
                if (var3 == null) {
                    var3 = class100.method2064(Statics.field929, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2077();
                    }
                    field931.method3554(var3, (long) var7);
                }
                if (var5 > 1) {
                    field967[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field967, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field937.length; var9++) {
                if (this.field937[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field936[var8];
            boolean var11 = this.field958 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field931.method3553((long) var10);
            if (var3 == null) {
                var3 = class100.method2064(Statics.field929, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2077();
                }
                field931.method3554(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field960 == 128 && this.field961 == 128 && this.field962 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field963 == 0 && this.field964 == 0 && this.field965 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field939 == null, this.field941 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2087(256);
            var14.method2074(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2071();
        } else if (var15 == 2) {
            var14.method2130();
        } else if (var15 == 3) {
            var14.method2063();
        }
        if (this.field939 != null) {
            for (int var16 = 0; var16 < this.field939.length; var16++) {
                var14.method2075(this.field939[var16], this.field940[var16]);
            }
        }
        if (this.field941 != null) {
            for (int var17 = 0; var17 < this.field941.length; var17++) {
                var14.method2076(this.field941[var17], this.field946[var17]);
            }
        }
        if (var12) {
            var14.method2078(this.field960, this.field961, this.field962);
        }
        if (var13) {
            var14.method2074(this.field963, this.field964, this.field965);
        }
        return var14;
    }

    @ObfuscatedName("ac.m(I)Lac;")
    public final class41 method795() {
        int var1 = -1;
        if (this.field970 != -1) {
            var1 = class176.method3020(this.field970);
        } else if (this.field971 != -1) {
            var1 = class176.field2893[this.field971];
        }
        return var1 < 0 || var1 >= this.field945.length || this.field945[var1] == -1 ? null : method551(this.field945[var1]);
    }

    @ObfuscatedName("ac.x(I)Z")
    public boolean method778() {
        if (this.field945 == null) {
            return this.field972 != -1 || this.field950 != null;
        }
        for (int var1 = 0; var1 < this.field945.length; var1++) {
            if (this.field945[var1] != -1) {
                class41 var2 = method551(this.field945[var1]);
                if (var2.field972 != -1 || var2.field950 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
