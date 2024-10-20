package deob;

@ObfuscatedName("au")
public class class41 extends class204 {

    @ObfuscatedName("au.g")
    public static boolean field964 = false;

    @ObfuscatedName("au.d")
    public static class193 field929 = new class193(64);

    @ObfuscatedName("au.z")
    public static class193 field930 = new class193(500);

    @ObfuscatedName("au.l")
    public static class193 field966 = new class193(30);

    @ObfuscatedName("au.m")
    public static class193 field932 = new class193(30);

    @ObfuscatedName("au.p")
    public static class100[] field933 = new class100[4];

    @ObfuscatedName("au.u")
    public int field952;

    @ObfuscatedName("au.c")
    public int[] field936;

    @ObfuscatedName("au.v")
    public int[] field939;

    @ObfuscatedName("au.o")
    public String field940 = "null";

    @ObfuscatedName("au.n")
    public short[] field938;

    @ObfuscatedName("au.k")
    public short[] field935;

    @ObfuscatedName("au.f")
    public short[] field950;

    @ObfuscatedName("au.x")
    public short[] field941;

    @ObfuscatedName("au.j")
    public int field942 = 1;

    @ObfuscatedName("au.r")
    public int field943 = 1;

    @ObfuscatedName("au.y")
    public int field937 = 2;

    @ObfuscatedName("au.t")
    public boolean field945 = true;

    @ObfuscatedName("au.a")
    public int field953 = -1;

    @ObfuscatedName("au.s")
    public int field927 = -1;

    @ObfuscatedName("au.e")
    public boolean field946 = false;

    @ObfuscatedName("au.q")
    public boolean field970 = false;

    @ObfuscatedName("au.i")
    public int field949 = -1;

    @ObfuscatedName("au.h")
    public int field951 = 16;

    @ObfuscatedName("au.ay")
    public int field975 = 0;

    @ObfuscatedName("au.ak")
    public int field967 = 0;

    @ObfuscatedName("au.ai")
    public String[] field954 = new String[5];

    @ObfuscatedName("au.ag")
    public int field955 = -1;

    @ObfuscatedName("au.ab")
    public int field956 = -1;

    @ObfuscatedName("au.aa")
    public boolean field957 = false;

    @ObfuscatedName("au.af")
    public boolean field958 = true;

    @ObfuscatedName("au.al")
    public int field959 = 128;

    @ObfuscatedName("au.ad")
    public int field931 = 128;

    @ObfuscatedName("au.aw")
    public int field961 = 128;

    @ObfuscatedName("au.an")
    public int field962 = 0;

    @ObfuscatedName("au.ax")
    public int field934 = 0;

    @ObfuscatedName("au.aq")
    public int field948 = 0;

    @ObfuscatedName("au.ae")
    public boolean field965 = false;

    @ObfuscatedName("au.au")
    public boolean field947 = false;

    @ObfuscatedName("au.ao")
    public int field963 = -1;

    @ObfuscatedName("au.aj")
    public int[] field968;

    @ObfuscatedName("au.am")
    public int field969 = -1;

    @ObfuscatedName("au.av")
    public int field944 = -1;

    @ObfuscatedName("au.ap")
    public int field971 = -1;

    @ObfuscatedName("au.ah")
    public int field972 = 0;

    @ObfuscatedName("au.ar")
    public int field973 = 0;

    @ObfuscatedName("au.az")
    public int field974 = 0;

    @ObfuscatedName("au.ac")
    public int[] field960;

    @ObfuscatedName("o.g(Lfc;Lfc;ZS)V")
    public static void method146(class167 arg0, class167 arg1, boolean arg2) {
        Statics.field928 = arg0;
        Statics.field2036 = arg1;
        field964 = arg2;
    }

    @ObfuscatedName("fy.b(II)Lau;")
    public static class41 method3251(int arg0) {
        class41 var1 = (class41) field929.method3529((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field928.method3112(6, arg0);
        class41 var3 = new class41();
        var3.field952 = arg0;
        if (var2 != null) {
            var3.method801(new class119(var2));
        }
        var3.method800();
        if (var3.field947) {
            var3.field937 = 0;
            var3.field945 = false;
        }
        field929.method3528(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("au.w(B)V")
    public void method800() {
        if (this.field953 == -1) {
            this.field953 = 0;
            if (this.field936 != null && (this.field939 == null || this.field939[0] == 10)) {
                this.field953 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field954[var1] != null) {
                    this.field953 = 1;
                }
            }
        }
        if (this.field963 == -1) {
            this.field963 = this.field937 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("au.d(Ldm;B)V")
    public void method801(class119 arg0) {
        while (true) {
            int var2 = arg0.method2362();
            if (var2 == 0) {
                return;
            }
            this.method802(arg0, var2);
        }
    }

    @ObfuscatedName("au.z(Ldm;II)V")
    public void method802(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2362();
            if (var3 > 0) {
                if (this.field936 == null || field964) {
                    this.field939 = new int[var3];
                    this.field936 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field936[var4] = arg0.method2376();
                        this.field939[var4] = arg0.method2362();
                    }
                } else {
                    arg0.field1977 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field940 = arg0.method2370();
        } else if (arg1 == 5) {
            int var5 = arg0.method2362();
            if (var5 > 0) {
                if (this.field936 == null || field964) {
                    this.field939 = null;
                    this.field936 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field936[var6] = arg0.method2376();
                    }
                } else {
                    arg0.field1977 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field942 = arg0.method2362();
        } else if (arg1 == 15) {
            this.field943 = arg0.method2362();
        } else if (arg1 == 17) {
            this.field937 = 0;
            this.field945 = false;
        } else if (arg1 == 18) {
            this.field945 = false;
        } else if (arg1 == 19) {
            this.field953 = arg0.method2362();
        } else if (arg1 == 21) {
            this.field927 = 0;
        } else if (arg1 == 22) {
            this.field946 = true;
        } else if (arg1 == 23) {
            this.field970 = true;
        } else if (arg1 == 24) {
            this.field949 = arg0.method2376();
            if (this.field949 == 65535) {
                this.field949 = -1;
            }
        } else if (arg1 == 27) {
            this.field937 = 1;
        } else if (arg1 == 28) {
            this.field951 = arg0.method2362();
        } else if (arg1 == 29) {
            this.field975 = arg0.method2391();
        } else if (arg1 == 39) {
            this.field967 = arg0.method2391() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field954[arg1 - 30] = arg0.method2370();
            if (this.field954[arg1 - 30].equalsIgnoreCase(class157.field2300)) {
                this.field954[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2362();
            this.field938 = new short[var7];
            this.field935 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field938[var8] = (short) arg0.method2376();
                this.field935[var8] = (short) arg0.method2376();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2362();
            this.field950 = new short[var9];
            this.field941 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field950[var10] = (short) arg0.method2376();
                this.field941[var10] = (short) arg0.method2376();
            }
        } else if (arg1 == 60) {
            this.field955 = arg0.method2376();
        } else if (arg1 == 62) {
            this.field957 = true;
        } else if (arg1 == 64) {
            this.field958 = false;
        } else if (arg1 == 65) {
            this.field959 = arg0.method2376();
        } else if (arg1 == 66) {
            this.field931 = arg0.method2376();
        } else if (arg1 == 67) {
            this.field961 = arg0.method2376();
        } else if (arg1 == 68) {
            this.field956 = arg0.method2376();
        } else if (arg1 == 69) {
            arg0.method2362();
        } else if (arg1 == 70) {
            this.field962 = arg0.method2365();
        } else if (arg1 == 71) {
            this.field934 = arg0.method2365();
        } else if (arg1 == 72) {
            this.field948 = arg0.method2365();
        } else if (arg1 == 73) {
            this.field965 = true;
        } else if (arg1 == 74) {
            this.field947 = true;
        } else if (arg1 == 75) {
            this.field963 = arg0.method2362();
        } else if (arg1 == 77) {
            this.field969 = arg0.method2376();
            if (this.field969 == 65535) {
                this.field969 = -1;
            }
            this.field944 = arg0.method2376();
            if (this.field944 == 65535) {
                this.field944 = -1;
            }
            int var11 = arg0.method2362();
            this.field968 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field968[var12] = arg0.method2376();
                if (this.field968[var12] == 65535) {
                    this.field968[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field971 = arg0.method2376();
            this.field972 = arg0.method2362();
        } else if (arg1 == 79) {
            this.field973 = arg0.method2376();
            this.field974 = arg0.method2376();
            this.field972 = arg0.method2362();
            int var13 = arg0.method2362();
            this.field960 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field960[var14] = arg0.method2376();
            }
        } else if (arg1 == 81) {
            this.field927 = arg0.method2362() * 256;
        }
    }

    @ObfuscatedName("au.l(II)Z")
    public final boolean method810(int arg0) {
        if (this.field939 != null) {
            for (int var4 = 0; var4 < this.field939.length; var4++) {
                if (this.field939[var4] == arg0) {
                    return Statics.field2036.method3082(this.field936[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field936 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field936.length; var3++) {
                var2 &= Statics.field2036.method3082(this.field936[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("au.m(I)Z")
    public final boolean method804() {
        if (this.field936 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field936.length; var2++) {
            var1 &= Statics.field2036.method3082(this.field936[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("au.p(II[[IIIII)Lch;")
    public final class85 method805(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field939 == null) {
            var7 = (long) ((this.field952 << 10) + arg1);
        } else {
            var7 = (long) ((this.field952 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field966.method3529(var7);
        if (var9 == null) {
            class100 var10 = this.method808(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field946) {
                var10.field1689 = (short) (this.field975 + 64);
                var10.field1701 = (short) (this.field967 + 768);
                var10.method2097();
                var9 = var10;
            } else {
                var9 = var10.method2079(this.field975 + 64, this.field967 + 768, -50, -10, -50);
            }
            field966.method3528(var9, var7);
        }
        if (this.field946) {
            var9 = ((class100) var9).method2085();
        }
        if (this.field927 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2175(arg2, arg3, arg4, arg5, true, this.field927);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2096(arg2, arg3, arg4, arg5, true, this.field927);
            }
        }
        return var9;
    }

    @ObfuscatedName("au.u(II[[IIIII)Ldd;")
    public final class105 method806(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field939 == null) {
            var7 = (long) ((this.field952 << 10) + arg1);
        } else {
            var7 = (long) ((this.field952 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field932.method3529(var7);
        if (var9 == null) {
            class100 var10 = this.method808(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2079(this.field975 + 64, this.field967 + 768, -50, -10, -50);
            field932.method3528(var9, var7);
        }
        if (this.field927 >= 0) {
            var9 = var9.method2175(arg2, arg3, arg4, arg5, true, this.field927);
        }
        return var9;
    }

    @ObfuscatedName("au.c(II[[IIIILaj;II)Ldd;")
    public final class105 method807(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field939 == null) {
            var9 = (long) ((this.field952 << 10) + arg1);
        } else {
            var9 = (long) ((this.field952 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field932.method3529(var9);
        if (var11 == null) {
            class100 var12 = this.method808(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2079(this.field975 + 64, this.field967 + 768, -50, -10, -50);
            field932.method3528(var11, var9);
        }
        if (arg6 == null && this.field927 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2176(true);
        } else {
            var13 = arg6.method870(var11, arg7, arg1);
        }
        if (this.field927 >= 0) {
            var13 = var13.method2175(arg2, arg3, arg4, arg5, false, this.field927);
        }
        return var13;
    }

    @ObfuscatedName("au.v(III)Lcd;")
    public final class100 method808(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field939 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field936 == null) {
                return null;
            }
            boolean var4 = this.field957;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field936.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field936[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field930.method3529((long) var7);
                if (var3 == null) {
                    var3 = class100.method2080(Statics.field2036, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2146();
                    }
                    field930.method3528(var3, (long) var7);
                }
                if (var5 > 1) {
                    field933[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field933, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field939.length; var9++) {
                if (this.field939[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field936[var8];
            boolean var11 = this.field957 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field930.method3529((long) var10);
            if (var3 == null) {
                var3 = class100.method2080(Statics.field2036, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2146();
                }
                field930.method3528(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field959 == 128 && this.field931 == 128 && this.field961 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field962 == 0 && this.field934 == 0 && this.field948 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field938 == null, this.field950 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2091(256);
            var14.method2092(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2119();
        } else if (var15 == 2) {
            var14.method2089();
        } else if (var15 == 3) {
            var14.method2149();
        }
        if (this.field938 != null) {
            for (int var16 = 0; var16 < this.field938.length; var16++) {
                var14.method2093(this.field938[var16], this.field935[var16]);
            }
        }
        if (this.field950 != null) {
            for (int var17 = 0; var17 < this.field950.length; var17++) {
                var14.method2094(this.field950[var17], this.field941[var17]);
            }
        }
        if (var12) {
            var14.method2121(this.field959, this.field931, this.field961);
        }
        if (var13) {
            var14.method2092(this.field962, this.field934, this.field948);
        }
        return var14;
    }

    @ObfuscatedName("au.o(I)Lau;")
    public final class41 method809() {
        int var1 = -1;
        if (this.field969 != -1) {
            var1 = class176.method98(this.field969);
        } else if (this.field944 != -1) {
            var1 = class176.field2885[this.field944];
        }
        return var1 < 0 || var1 >= this.field968.length || this.field968[var1] == -1 ? null : method3251(this.field968[var1]);
    }

    @ObfuscatedName("au.n(I)Z")
    public boolean method803() {
        if (this.field968 == null) {
            return this.field971 != -1 || this.field960 != null;
        }
        for (int var1 = 0; var1 < this.field968.length; var1++) {
            if (this.field968[var1] != -1) {
                class41 var2 = method3251(this.field968[var1]);
                if (var2.field971 != -1 || var2.field960 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
