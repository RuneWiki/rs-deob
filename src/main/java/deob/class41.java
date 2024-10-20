package deob;

@ObfuscatedName("ao")
public class class41 extends class205 {

    @ObfuscatedName("ao.t")
    public static boolean field934 = false;

    @ObfuscatedName("ao.h")
    public static class194 field933 = new class194(64);

    @ObfuscatedName("ao.z")
    public static class194 field918 = new class194(500);

    @ObfuscatedName("ao.r")
    public static class194 field919 = new class194(30);

    @ObfuscatedName("ao.f")
    public static class194 field920 = new class194(30);

    @ObfuscatedName("ao.s")
    public static class101[] field921 = new class101[4];

    @ObfuscatedName("ao.d")
    public int field922;

    @ObfuscatedName("ao.l")
    public int[] field923;

    @ObfuscatedName("ao.y")
    public int[] field941;

    @ObfuscatedName("ao.p")
    public String field964 = "null";

    @ObfuscatedName("ao.k")
    public short[] field926;

    @ObfuscatedName("ao.o")
    public short[] field930;

    @ObfuscatedName("ao.b")
    public short[] field944;

    @ObfuscatedName("ao.j")
    public short[] field929;

    @ObfuscatedName("ao.a")
    public int field955 = 1;

    @ObfuscatedName("ao.u")
    public int field924 = 1;

    @ObfuscatedName("ao.c")
    public int field932 = 2;

    @ObfuscatedName("ao.n")
    public boolean field938 = true;

    @ObfuscatedName("ao.q")
    public int field925 = -1;

    @ObfuscatedName("ao.x")
    public int field916 = -1;

    @ObfuscatedName("ao.v")
    public boolean field936 = false;

    @ObfuscatedName("ao.m")
    public boolean field937 = false;

    @ObfuscatedName("ao.w")
    public int field928 = -1;

    @ObfuscatedName("ao.e")
    public int field939 = 16;

    @ObfuscatedName("ao.ad")
    public int field927 = 0;

    @ObfuscatedName("ao.as")
    public int field915 = 0;

    @ObfuscatedName("ao.ag")
    public String[] field942 = new String[5];

    @ObfuscatedName("ao.al")
    public int field943 = -1;

    @ObfuscatedName("ao.av")
    public int field940 = -1;

    @ObfuscatedName("ao.ar")
    public boolean field951 = false;

    @ObfuscatedName("ao.ay")
    public boolean field946 = true;

    @ObfuscatedName("ao.aq")
    public int field931 = 128;

    @ObfuscatedName("ao.ai")
    public int field948 = 128;

    @ObfuscatedName("ao.an")
    public int field949 = 128;

    @ObfuscatedName("ao.aw")
    public int field950 = 0;

    @ObfuscatedName("ao.ap")
    public int field917 = 0;

    @ObfuscatedName("ao.ak")
    public int field952 = 0;

    @ObfuscatedName("ao.ac")
    public boolean field953 = false;

    @ObfuscatedName("ao.ao")
    public boolean field954 = false;

    @ObfuscatedName("ao.aj")
    public int field945 = -1;

    @ObfuscatedName("ao.ah")
    public int[] field956;

    @ObfuscatedName("ao.ae")
    public int field957 = -1;

    @ObfuscatedName("ao.aa")
    public int field958 = -1;

    @ObfuscatedName("ao.au")
    public int field959 = -1;

    @ObfuscatedName("ao.ab")
    public int field960 = 0;

    @ObfuscatedName("ao.am")
    public int field961 = 0;

    @ObfuscatedName("ao.at")
    public int field962 = 0;

    @ObfuscatedName("ao.az")
    public int[] field963;

    @ObfuscatedName("ez.t(Lfp;Lfp;ZB)V")
    public static void method2729(class168 arg0, class168 arg1, boolean arg2) {
        Statics.field3141 = arg0;
        Statics.field935 = arg1;
        field934 = arg2;
    }

    @ObfuscatedName("az.i(II)Lao;")
    public static class41 method948(int arg0) {
        class41 var1 = (class41) field933.method3453((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3141.method3002(6, arg0);
        class41 var3 = new class41();
        var3.field922 = arg0;
        if (var2 != null) {
            var3.method758(new class120(var2));
        }
        var3.method757();
        if (var3.field954) {
            var3.field932 = 0;
            var3.field938 = false;
        }
        field933.method3461(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ao.g(B)V")
    public void method757() {
        if (this.field925 == -1) {
            this.field925 = 0;
            if (this.field923 != null && (this.field941 == null || this.field941[0] == 10)) {
                this.field925 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field942[var1] != null) {
                    this.field925 = 1;
                }
            }
        }
        if (this.field945 == -1) {
            this.field945 = this.field932 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ao.h(Ldr;B)V")
    public void method758(class120 arg0) {
        while (true) {
            int var2 = arg0.method2334();
            if (var2 == 0) {
                return;
            }
            this.method765(arg0, var2);
        }
    }

    @ObfuscatedName("ao.z(Ldr;II)V")
    public void method765(class120 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2334();
            if (var3 > 0) {
                if (this.field923 == null || field934) {
                    this.field941 = new int[var3];
                    this.field923 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field923[var4] = arg0.method2310();
                        this.field941[var4] = arg0.method2334();
                    }
                } else {
                    arg0.field2001 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field964 = arg0.method2316();
        } else if (arg1 == 5) {
            int var5 = arg0.method2334();
            if (var5 > 0) {
                if (this.field923 == null || field934) {
                    this.field941 = null;
                    this.field923 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field923[var6] = arg0.method2310();
                    }
                } else {
                    arg0.field2001 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field955 = arg0.method2334();
        } else if (arg1 == 15) {
            this.field924 = arg0.method2334();
        } else if (arg1 == 17) {
            this.field932 = 0;
            this.field938 = false;
        } else if (arg1 == 18) {
            this.field938 = false;
        } else if (arg1 == 19) {
            this.field925 = arg0.method2334();
        } else if (arg1 == 21) {
            this.field916 = 0;
        } else if (arg1 == 22) {
            this.field936 = true;
        } else if (arg1 == 23) {
            this.field937 = true;
        } else if (arg1 == 24) {
            this.field928 = arg0.method2310();
            if (this.field928 == 65535) {
                this.field928 = -1;
            }
        } else if (arg1 == 27) {
            this.field932 = 1;
        } else if (arg1 == 28) {
            this.field939 = arg0.method2334();
        } else if (arg1 == 29) {
            this.field927 = arg0.method2309();
        } else if (arg1 == 39) {
            this.field915 = arg0.method2309();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field942[arg1 - 30] = arg0.method2316();
            if (this.field942[arg1 - 30].equalsIgnoreCase(class158.field2339)) {
                this.field942[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2334();
            this.field926 = new short[var7];
            this.field930 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field926[var8] = (short) arg0.method2310();
                this.field930[var8] = (short) arg0.method2310();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2334();
            this.field944 = new short[var9];
            this.field929 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field944[var10] = (short) arg0.method2310();
                this.field929[var10] = (short) arg0.method2310();
            }
        } else if (arg1 == 60) {
            this.field943 = arg0.method2310();
        } else if (arg1 == 62) {
            this.field951 = true;
        } else if (arg1 == 64) {
            this.field946 = false;
        } else if (arg1 == 65) {
            this.field931 = arg0.method2310();
        } else if (arg1 == 66) {
            this.field948 = arg0.method2310();
        } else if (arg1 == 67) {
            this.field949 = arg0.method2310();
        } else if (arg1 == 68) {
            this.field940 = arg0.method2310();
        } else if (arg1 == 69) {
            arg0.method2334();
        } else if (arg1 == 70) {
            this.field950 = arg0.method2478();
        } else if (arg1 == 71) {
            this.field917 = arg0.method2478();
        } else if (arg1 == 72) {
            this.field952 = arg0.method2478();
        } else if (arg1 == 73) {
            this.field953 = true;
        } else if (arg1 == 74) {
            this.field954 = true;
        } else if (arg1 == 75) {
            this.field945 = arg0.method2334();
        } else if (arg1 == 77) {
            this.field957 = arg0.method2310();
            if (this.field957 == 65535) {
                this.field957 = -1;
            }
            this.field958 = arg0.method2310();
            if (this.field958 == 65535) {
                this.field958 = -1;
            }
            int var11 = arg0.method2334();
            this.field956 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field956[var12] = arg0.method2310();
                if (this.field956[var12] == 65535) {
                    this.field956[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field959 = arg0.method2310();
            this.field960 = arg0.method2334();
        } else if (arg1 == 79) {
            this.field961 = arg0.method2310();
            this.field962 = arg0.method2310();
            this.field960 = arg0.method2334();
            int var13 = arg0.method2334();
            this.field963 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field963[var14] = arg0.method2310();
            }
        } else if (arg1 == 81) {
            this.field916 = arg0.method2334() * 256;
        }
    }

    @ObfuscatedName("ao.r(II)Z")
    public final boolean method760(int arg0) {
        if (this.field941 != null) {
            for (int var4 = 0; var4 < this.field941.length; var4++) {
                if (this.field941[var4] == arg0) {
                    return Statics.field935.method3040(this.field923[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field923 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field923.length; var3++) {
                var2 &= Statics.field935.method3040(this.field923[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ao.f(I)Z")
    public final boolean method761() {
        if (this.field923 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field923.length; var2++) {
            var1 &= Statics.field935.method3040(this.field923[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ao.s(II[[IIIIB)Lcg;")
    public final class86 method756(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field941 == null) {
            var7 = (long) ((this.field922 << 10) + arg1);
        } else {
            var7 = (long) ((this.field922 << 10) + (arg0 << 3) + arg1);
        }
        class86 var9 = (class86) field919.method3453(var7);
        if (var9 == null) {
            class101 var10 = this.method772(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field936) {
                var10.field1725 = (short) (this.field927 + 64);
                var10.field1720 = (short) (this.field915 * 25 + 768);
                var10.method2027();
                var9 = var10;
            } else {
                var9 = var10.method2030(this.field927 + 64, this.field915 * 25 + 768, -50, -10, -50);
            }
            field919.method3461(var9, var7);
        }
        if (this.field936) {
            var9 = ((class101) var9).method2015();
        }
        if (this.field916 >= 0) {
            if (var9 instanceof class106) {
                var9 = ((class106) var9).method2103(arg2, arg3, arg4, arg5, true, this.field916);
            } else if (var9 instanceof class101) {
                var9 = ((class101) var9).method2010(arg2, arg3, arg4, arg5, true, this.field916);
            }
        }
        return var9;
    }

    @ObfuscatedName("ao.d(II[[IIIII)Ldk;")
    public final class106 method763(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field941 == null) {
            var7 = (long) ((this.field922 << 10) + arg1);
        } else {
            var7 = (long) ((this.field922 << 10) + (arg0 << 3) + arg1);
        }
        class106 var9 = (class106) field920.method3453(var7);
        if (var9 == null) {
            class101 var10 = this.method772(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2030(this.field927 + 64, this.field915 * 25 + 768, -50, -10, -50);
            field920.method3461(var9, var7);
        }
        if (this.field916 >= 0) {
            var9 = var9.method2103(arg2, arg3, arg4, arg5, true, this.field916);
        }
        return var9;
    }

    @ObfuscatedName("ao.l(II[[IIIILah;II)Ldk;")
    public final class106 method764(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field941 == null) {
            var9 = (long) ((this.field922 << 10) + arg1);
        } else {
            var9 = (long) ((this.field922 << 10) + (arg0 << 3) + arg1);
        }
        class106 var11 = (class106) field920.method3453(var9);
        if (var11 == null) {
            class101 var12 = this.method772(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2030(this.field927 + 64, this.field915 * 25 + 768, -50, -10, -50);
            field920.method3461(var11, var9);
        }
        if (arg6 == null && this.field916 == -1) {
            return var11;
        }
        class106 var13;
        if (arg6 == null) {
            var13 = var11.method2104(true);
        } else {
            var13 = arg6.method827(var11, arg7, arg1);
        }
        if (this.field916 >= 0) {
            var13 = var13.method2103(arg2, arg3, arg4, arg5, false, this.field916);
        }
        return var13;
    }

    @ObfuscatedName("ao.y(IIB)Lca;")
    public final class101 method772(int arg0, int arg1) {
        class101 var3 = null;
        if (this.field941 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field923 == null) {
                return null;
            }
            boolean var4 = this.field951;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field923.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field923[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class101) field918.method3453((long) var7);
                if (var3 == null) {
                    var3 = class101.method2021(Statics.field935, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2025();
                    }
                    field918.method3461(var3, (long) var7);
                }
                if (var5 > 1) {
                    field921[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class101(field921, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field941.length; var9++) {
                if (this.field941[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field923[var8];
            boolean var11 = this.field951 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class101) field918.method3453((long) var10);
            if (var3 == null) {
                var3 = class101.method2021(Statics.field935, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2025();
                }
                field918.method3461(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field931 == 128 && this.field948 == 128 && this.field949 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field950 == 0 && this.field917 == 0 && this.field952 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class101 var14 = new class101(var3, arg1 == 0 && !var12 && !var13, this.field926 == null, this.field944 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2016(256);
            var14.method2022(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2045();
        } else if (var15 == 2) {
            var14.method2019();
        } else if (var15 == 3) {
            var14.method2020();
        }
        if (this.field926 != null) {
            for (int var16 = 0; var16 < this.field926.length; var16++) {
                var14.method2050(this.field926[var16], this.field930[var16]);
            }
        }
        if (this.field944 != null) {
            for (int var17 = 0; var17 < this.field944.length; var17++) {
                var14.method2038(this.field944[var17], this.field929[var17]);
            }
        }
        if (var12) {
            var14.method2026(this.field931, this.field948, this.field949);
        }
        if (var13) {
            var14.method2022(this.field950, this.field917, this.field952);
        }
        return var14;
    }

    @ObfuscatedName("ao.p(I)Lao;")
    public final class41 method766() {
        int var1 = -1;
        if (this.field957 != -1) {
            var1 = class177.method135(this.field957);
        } else if (this.field958 != -1) {
            var1 = class177.field2924[this.field958];
        }
        return var1 < 0 || var1 >= this.field956.length || this.field956[var1] == -1 ? null : method948(this.field956[var1]);
    }

    @ObfuscatedName("ao.k(I)Z")
    public boolean method759() {
        if (this.field956 == null) {
            return this.field959 != -1 || this.field963 != null;
        }
        for (int var1 = 0; var1 < this.field956.length; var1++) {
            if (this.field956[var1] != -1) {
                class41 var2 = method948(this.field956[var1]);
                if (var2.field959 != -1 || var2.field963 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
