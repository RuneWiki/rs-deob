package deob;

@ObfuscatedName("af")
public class class41 extends class204 {

    @ObfuscatedName("af.i")
    public static boolean field967 = false;

    @ObfuscatedName("af.h")
    public static class193 field951 = new class193(64);

    @ObfuscatedName("af.a")
    public static class193 field939 = new class193(500);

    @ObfuscatedName("af.s")
    public static class193 field963 = new class193(30);

    @ObfuscatedName("af.p")
    public static class193 field975 = new class193(30);

    @ObfuscatedName("af.r")
    public static class100[] field942 = new class100[4];

    @ObfuscatedName("af.k")
    public int field970;

    @ObfuscatedName("af.d")
    public int[] field968;

    @ObfuscatedName("af.n")
    public int[] field945;

    @ObfuscatedName("af.z")
    public String field969 = "null";

    @ObfuscatedName("af.c")
    public short[] field935;

    @ObfuscatedName("af.b")
    public short[] field948;

    @ObfuscatedName("af.w")
    public short[] field949;

    @ObfuscatedName("af.g")
    public short[] field940;

    @ObfuscatedName("af.x")
    public int field944 = 1;

    @ObfuscatedName("af.o")
    public int field952 = 1;

    @ObfuscatedName("af.l")
    public int field953 = 2;

    @ObfuscatedName("af.j")
    public boolean field954 = true;

    @ObfuscatedName("af.m")
    public int field955 = -1;

    @ObfuscatedName("af.e")
    public int field956 = -1;

    @ObfuscatedName("af.u")
    public boolean field957 = false;

    @ObfuscatedName("af.y")
    public boolean field958 = false;

    @ObfuscatedName("af.t")
    public int field959 = -1;

    @ObfuscatedName("af.q")
    public int field960 = 16;

    @ObfuscatedName("af.ak")
    public int field961 = 0;

    @ObfuscatedName("af.ap")
    public int field962 = 0;

    @ObfuscatedName("af.al")
    public String[] field943 = new String[5];

    @ObfuscatedName("af.ab")
    public int field974 = -1;

    @ObfuscatedName("af.at")
    public int field965 = -1;

    @ObfuscatedName("af.au")
    public boolean field938 = false;

    @ObfuscatedName("af.ae")
    public boolean field976 = true;

    @ObfuscatedName("af.ax")
    public int field947 = 128;

    @ObfuscatedName("af.aq")
    public int field946 = 128;

    @ObfuscatedName("af.az")
    public int field981 = 128;

    @ObfuscatedName("af.ac")
    public int field971 = 0;

    @ObfuscatedName("af.ai")
    public int field972 = 0;

    @ObfuscatedName("af.ay")
    public int field966 = 0;

    @ObfuscatedName("af.aj")
    public boolean field936 = false;

    @ObfuscatedName("af.af")
    public boolean field950 = false;

    @ObfuscatedName("af.ar")
    public int field941 = -1;

    @ObfuscatedName("af.ag")
    public int[] field977;

    @ObfuscatedName("af.ah")
    public int field978 = -1;

    @ObfuscatedName("af.am")
    public int field979 = -1;

    @ObfuscatedName("af.aa")
    public int field980 = -1;

    @ObfuscatedName("af.aw")
    public int field964 = 0;

    @ObfuscatedName("af.an")
    public int field982 = 0;

    @ObfuscatedName("af.as")
    public int field983 = 0;

    @ObfuscatedName("af.av")
    public int[] field984;

    @ObfuscatedName("bo.i(II)Laf;")
    public static class41 method1443(int arg0) {
        class41 var1 = (class41) field951.method3467((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field985.method3080(6, arg0);
        class41 var3 = new class41();
        var3.field970 = arg0;
        if (var2 != null) {
            var3.method749(new class119(var2));
        }
        var3.method771();
        if (var3.field950) {
            var3.field953 = 0;
            var3.field954 = false;
        }
        field951.method3466(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("af.v(I)V")
    public void method771() {
        if (this.field955 == -1) {
            this.field955 = 0;
            if (this.field968 != null && (this.field945 == null || this.field945[0] == 10)) {
                this.field955 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field943[var1] != null) {
                    this.field955 = 1;
                }
            }
        }
        if (this.field941 == -1) {
            this.field941 = this.field953 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("af.f(Ldj;I)V")
    public void method749(class119 arg0) {
        while (true) {
            int var2 = arg0.method2310();
            if (var2 == 0) {
                return;
            }
            this.method750(arg0, var2);
        }
    }

    @ObfuscatedName("af.h(Ldj;II)V")
    public void method750(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2310();
            if (var3 > 0) {
                if (this.field968 == null || field967) {
                    this.field945 = new int[var3];
                    this.field968 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field968[var4] = arg0.method2312();
                        this.field945[var4] = arg0.method2310();
                    }
                } else {
                    arg0.field1984 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field969 = arg0.method2318();
        } else if (arg1 == 5) {
            int var5 = arg0.method2310();
            if (var5 > 0) {
                if (this.field968 == null || field967) {
                    this.field945 = null;
                    this.field968 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field968[var6] = arg0.method2312();
                    }
                } else {
                    arg0.field1984 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field944 = arg0.method2310();
        } else if (arg1 == 15) {
            this.field952 = arg0.method2310();
        } else if (arg1 == 17) {
            this.field953 = 0;
            this.field954 = false;
        } else if (arg1 == 18) {
            this.field954 = false;
        } else if (arg1 == 19) {
            this.field955 = arg0.method2310();
        } else if (arg1 == 21) {
            this.field956 = 0;
        } else if (arg1 == 22) {
            this.field957 = true;
        } else if (arg1 == 23) {
            this.field958 = true;
        } else if (arg1 == 24) {
            this.field959 = arg0.method2312();
            if (this.field959 == 65535) {
                this.field959 = -1;
            }
        } else if (arg1 == 27) {
            this.field953 = 1;
        } else if (arg1 == 28) {
            this.field960 = arg0.method2310();
        } else if (arg1 == 29) {
            this.field961 = arg0.method2311();
        } else if (arg1 == 39) {
            this.field962 = arg0.method2311();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field943[arg1 - 30] = arg0.method2318();
            if (this.field943[arg1 - 30].equalsIgnoreCase(class157.field2548)) {
                this.field943[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2310();
            this.field935 = new short[var7];
            this.field948 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field935[var8] = (short) arg0.method2312();
                this.field948[var8] = (short) arg0.method2312();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2310();
            this.field949 = new short[var9];
            this.field940 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field949[var10] = (short) arg0.method2312();
                this.field940[var10] = (short) arg0.method2312();
            }
        } else if (arg1 == 60) {
            this.field974 = arg0.method2312();
        } else if (arg1 == 62) {
            this.field938 = true;
        } else if (arg1 == 64) {
            this.field976 = false;
        } else if (arg1 == 65) {
            this.field947 = arg0.method2312();
        } else if (arg1 == 66) {
            this.field946 = arg0.method2312();
        } else if (arg1 == 67) {
            this.field981 = arg0.method2312();
        } else if (arg1 == 68) {
            this.field965 = arg0.method2312();
        } else if (arg1 == 69) {
            arg0.method2310();
        } else if (arg1 == 70) {
            this.field971 = arg0.method2313();
        } else if (arg1 == 71) {
            this.field972 = arg0.method2313();
        } else if (arg1 == 72) {
            this.field966 = arg0.method2313();
        } else if (arg1 == 73) {
            this.field936 = true;
        } else if (arg1 == 74) {
            this.field950 = true;
        } else if (arg1 == 75) {
            this.field941 = arg0.method2310();
        } else if (arg1 == 77) {
            this.field978 = arg0.method2312();
            if (this.field978 == 65535) {
                this.field978 = -1;
            }
            this.field979 = arg0.method2312();
            if (this.field979 == 65535) {
                this.field979 = -1;
            }
            int var11 = arg0.method2310();
            this.field977 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field977[var12] = arg0.method2312();
                if (this.field977[var12] == 65535) {
                    this.field977[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field980 = arg0.method2312();
            this.field964 = arg0.method2310();
        } else if (arg1 == 79) {
            this.field982 = arg0.method2312();
            this.field983 = arg0.method2312();
            this.field964 = arg0.method2310();
            int var13 = arg0.method2310();
            this.field984 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field984[var14] = arg0.method2312();
            }
        } else if (arg1 == 81) {
            this.field956 = arg0.method2310() * 256;
        }
    }

    @ObfuscatedName("af.a(II)Z")
    public final boolean method751(int arg0) {
        if (this.field945 != null) {
            for (int var4 = 0; var4 < this.field945.length; var4++) {
                if (this.field945[var4] == arg0) {
                    return Statics.field937.method3057(this.field968[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field968 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field968.length; var3++) {
                var2 &= Statics.field937.method3057(this.field968[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("af.s(I)Z")
    public final boolean method752() {
        if (this.field968 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field968.length; var2++) {
            var1 &= Statics.field937.method3057(this.field968[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("af.p(II[[IIIIB)Lck;")
    public final class85 method753(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field945 == null) {
            var7 = (long) ((this.field970 << 10) + arg1);
        } else {
            var7 = (long) ((this.field970 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field963.method3467(var7);
        if (var9 == null) {
            class100 var10 = this.method756(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field957) {
                var10.field1719 = (short) (this.field961 + 64);
                var10.field1693 = (short) (this.field962 * 25 + 768);
                var10.method2032();
                var9 = var10;
            } else {
                var9 = var10.method2036(this.field961 + 64, this.field962 * 25 + 768, -50, -10, -50);
            }
            field963.method3466(var9, var7);
        }
        if (this.field957) {
            var9 = ((class100) var9).method2020();
        }
        if (this.field956 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2148(arg2, arg3, arg4, arg5, true, this.field956);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2049(arg2, arg3, arg4, arg5, true, this.field956);
            }
        }
        return var9;
    }

    @ObfuscatedName("af.r(II[[IIIII)Ldo;")
    public final class105 method754(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field945 == null) {
            var7 = (long) ((this.field970 << 10) + arg1);
        } else {
            var7 = (long) ((this.field970 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field975.method3467(var7);
        if (var9 == null) {
            class100 var10 = this.method756(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2036(this.field961 + 64, this.field962 * 25 + 768, -50, -10, -50);
            field975.method3466(var9, var7);
        }
        if (this.field956 >= 0) {
            var9 = var9.method2148(arg2, arg3, arg4, arg5, true, this.field956);
        }
        return var9;
    }

    @ObfuscatedName("af.k(II[[IIIILag;II)Ldo;")
    public final class105 method755(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field945 == null) {
            var9 = (long) ((this.field970 << 10) + arg1);
        } else {
            var9 = (long) ((this.field970 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field975.method3467(var9);
        if (var11 == null) {
            class100 var12 = this.method756(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2036(this.field961 + 64, this.field962 * 25 + 768, -50, -10, -50);
            field975.method3466(var11, var9);
        }
        if (arg6 == null && this.field956 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2103(true);
        } else {
            var13 = arg6.method806(var11, arg7, arg1);
        }
        if (this.field956 >= 0) {
            var13 = var13.method2148(arg2, arg3, arg4, arg5, false, this.field956);
        }
        return var13;
    }

    @ObfuscatedName("af.d(III)Lcg;")
    public final class100 method756(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field945 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field968 == null) {
                return null;
            }
            boolean var4 = this.field938;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field968.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field968[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field939.method3467((long) var7);
                if (var3 == null) {
                    var3 = class100.method2014(Statics.field937, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2013();
                    }
                    field939.method3466(var3, (long) var7);
                }
                if (var5 > 1) {
                    field942[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field942, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field945.length; var9++) {
                if (this.field945[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field968[var8];
            boolean var11 = this.field938 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field939.method3467((long) var10);
            if (var3 == null) {
                var3 = class100.method2014(Statics.field937, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2013();
                }
                field939.method3466(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field947 == 128 && this.field946 == 128 && this.field981 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field971 == 0 && this.field972 == 0 && this.field966 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field935 == null, this.field949 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2026(256);
            var14.method2027(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2023();
        } else if (var15 == 2) {
            var14.method2059();
        } else if (var15 == 3) {
            var14.method2025();
        }
        if (this.field935 != null) {
            for (int var16 = 0; var16 < this.field935.length; var16++) {
                var14.method2019(this.field935[var16], this.field948[var16]);
            }
        }
        if (this.field949 != null) {
            for (int var17 = 0; var17 < this.field949.length; var17++) {
                var14.method2029(this.field949[var17], this.field940[var17]);
            }
        }
        if (var12) {
            var14.method2031(this.field947, this.field946, this.field981);
        }
        if (var13) {
            var14.method2027(this.field971, this.field972, this.field966);
        }
        return var14;
    }

    @ObfuscatedName("af.n(I)Laf;")
    public final class41 method757() {
        int var1 = -1;
        if (this.field978 != -1) {
            var1 = Statics.method3146(this.field978);
        } else if (this.field979 != -1) {
            var1 = class176.field2895[this.field979];
        }
        return var1 < 0 || var1 >= this.field977.length || this.field977[var1] == -1 ? null : method1443(this.field977[var1]);
    }

    @ObfuscatedName("af.z(I)Z")
    public boolean method758() {
        if (this.field977 == null) {
            return this.field980 != -1 || this.field984 != null;
        }
        for (int var1 = 0; var1 < this.field977.length; var1++) {
            if (this.field977[var1] != -1) {
                class41 var2 = method1443(this.field977[var1]);
                if (var2.field980 != -1 || var2.field984 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
