package deob;

@ObfuscatedName("ay")
public class class41 extends class204 {

    @ObfuscatedName("ay.h")
    public static boolean field935 = false;

    @ObfuscatedName("ay.n")
    public static class193 field960 = new class193(64);

    @ObfuscatedName("ay.f")
    public static class193 field931 = new class193(500);

    @ObfuscatedName("ay.g")
    public static class193 field932 = new class193(30);

    @ObfuscatedName("ay.o")
    public static class193 field933 = new class193(30);

    @ObfuscatedName("ay.s")
    public static class100[] field953 = new class100[4];

    @ObfuscatedName("ay.k")
    public int field962;

    @ObfuscatedName("ay.b")
    public int[] field936;

    @ObfuscatedName("ay.c")
    public int[] field941;

    @ObfuscatedName("ay.l")
    public String field938 = "null";

    @ObfuscatedName("ay.p")
    public short[] field951;

    @ObfuscatedName("ay.d")
    public short[] field940;

    @ObfuscatedName("ay.i")
    public short[] field947;

    @ObfuscatedName("ay.x")
    public short[] field942;

    @ObfuscatedName("ay.j")
    public int field928 = 1;

    @ObfuscatedName("ay.w")
    public int field978 = 1;

    @ObfuscatedName("ay.r")
    public int field937 = 2;

    @ObfuscatedName("ay.u")
    public boolean field946 = true;

    @ObfuscatedName("ay.m")
    public int field943 = -1;

    @ObfuscatedName("ay.t")
    public int field972 = -1;

    @ObfuscatedName("ay.z")
    public boolean field934 = false;

    @ObfuscatedName("ay.e")
    public boolean field950 = false;

    @ObfuscatedName("ay.y")
    public int field949 = -1;

    @ObfuscatedName("ay.a")
    public int field952 = 16;

    @ObfuscatedName("ay.at")
    public int field945 = 0;

    @ObfuscatedName("ay.aa")
    public int field954 = 0;

    @ObfuscatedName("ay.ad")
    public String[] field955 = new String[5];

    @ObfuscatedName("ay.af")
    public int field956 = -1;

    @ObfuscatedName("ay.ag")
    public int field958 = -1;

    @ObfuscatedName("ay.as")
    public boolean field944 = false;

    @ObfuscatedName("ay.al")
    public boolean field959 = true;

    @ObfuscatedName("ay.am")
    public int field948 = 128;

    @ObfuscatedName("ay.ar")
    public int field961 = 128;

    @ObfuscatedName("ay.ap")
    public int field974 = 128;

    @ObfuscatedName("ay.ac")
    public int field963 = 0;

    @ObfuscatedName("ay.ab")
    public int field964 = 0;

    @ObfuscatedName("ay.an")
    public int field965 = 0;

    @ObfuscatedName("ay.ak")
    public boolean field966 = false;

    @ObfuscatedName("ay.ay")
    public boolean field967 = false;

    @ObfuscatedName("ay.au")
    public int field968 = -1;

    @ObfuscatedName("ay.az")
    public int[] field969;

    @ObfuscatedName("ay.aw")
    public int field930 = -1;

    @ObfuscatedName("ay.av")
    public int field971 = -1;

    @ObfuscatedName("ay.aq")
    public int field939 = -1;

    @ObfuscatedName("ay.ax")
    public int field973 = 0;

    @ObfuscatedName("ay.ai")
    public int field957 = 0;

    @ObfuscatedName("ay.ae")
    public int field975 = 0;

    @ObfuscatedName("ay.aj")
    public int[] field976;

    @ObfuscatedName("ds.h(II)Lay;")
    public static class41 method2325(int arg0) {
        class41 var1 = (class41) field960.method3538((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3139.method3073(6, arg0);
        class41 var3 = new class41();
        var3.field962 = arg0;
        if (var2 != null) {
            var3.method767(new class119(var2));
        }
        var3.method787();
        if (var3.field967) {
            var3.field937 = 0;
            var3.field946 = false;
        }
        field960.method3540(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ay.q(I)V")
    public void method787() {
        if (this.field943 == -1) {
            this.field943 = 0;
            if (this.field936 != null && (this.field941 == null || this.field941[0] == 10)) {
                this.field943 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field955[var1] != null) {
                    this.field943 = 1;
                }
            }
        }
        if (this.field968 == -1) {
            this.field968 = this.field937 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ay.v(Ldm;S)V")
    public void method767(class119 arg0) {
        while (true) {
            int var2 = arg0.method2383();
            if (var2 == 0) {
                return;
            }
            this.method768(arg0, var2);
        }
    }

    @ObfuscatedName("ay.n(Ldm;IB)V")
    public void method768(class119 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method2383();
            if (var3 > 0) {
                if (this.field936 == null || field935) {
                    this.field941 = new int[var3];
                    this.field936 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field936[var4] = arg0.method2385();
                        this.field941[var4] = arg0.method2383();
                    }
                } else {
                    arg0.field1973 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field938 = arg0.method2391();
        } else if (arg1 == 5) {
            int var5 = arg0.method2383();
            if (var5 > 0) {
                if (this.field936 == null || field935) {
                    this.field941 = null;
                    this.field936 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field936[var6] = arg0.method2385();
                    }
                } else {
                    arg0.field1973 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field928 = arg0.method2383();
        } else if (arg1 == 15) {
            this.field978 = arg0.method2383();
        } else if (arg1 == 17) {
            this.field937 = 0;
            this.field946 = false;
        } else if (arg1 == 18) {
            this.field946 = false;
        } else if (arg1 == 19) {
            this.field943 = arg0.method2383();
        } else if (arg1 == 21) {
            this.field972 = 0;
        } else if (arg1 == 22) {
            this.field934 = true;
        } else if (arg1 == 23) {
            this.field950 = true;
        } else if (arg1 == 24) {
            this.field949 = arg0.method2385();
            if (this.field949 == 65535) {
                this.field949 = -1;
            }
        } else if (arg1 == 27) {
            this.field937 = 1;
        } else if (arg1 == 28) {
            this.field952 = arg0.method2383();
        } else if (arg1 == 29) {
            this.field945 = arg0.method2370();
        } else if (arg1 == 39) {
            this.field954 = arg0.method2370() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field955[arg1 - 30] = arg0.method2391();
            if (this.field955[arg1 - 30].equalsIgnoreCase(class157.field2496)) {
                this.field955[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method2383();
            this.field951 = new short[var7];
            this.field940 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field951[var8] = (short) arg0.method2385();
                this.field940[var8] = (short) arg0.method2385();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method2383();
            this.field947 = new short[var9];
            this.field942 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field947[var10] = (short) arg0.method2385();
                this.field942[var10] = (short) arg0.method2385();
            }
        } else if (arg1 == 60) {
            this.field956 = arg0.method2385();
        } else if (arg1 == 62) {
            this.field944 = true;
        } else if (arg1 == 64) {
            this.field959 = false;
        } else if (arg1 == 65) {
            this.field948 = arg0.method2385();
        } else if (arg1 == 66) {
            this.field961 = arg0.method2385();
        } else if (arg1 == 67) {
            this.field974 = arg0.method2385();
        } else if (arg1 == 68) {
            this.field958 = arg0.method2385();
        } else if (arg1 == 69) {
            arg0.method2383();
        } else if (arg1 == 70) {
            this.field963 = arg0.method2386();
        } else if (arg1 == 71) {
            this.field964 = arg0.method2386();
        } else if (arg1 == 72) {
            this.field965 = arg0.method2386();
        } else if (arg1 == 73) {
            this.field966 = true;
        } else if (arg1 == 74) {
            this.field967 = true;
        } else if (arg1 == 75) {
            this.field968 = arg0.method2383();
        } else if (arg1 == 77) {
            this.field930 = arg0.method2385();
            if (this.field930 == 65535) {
                this.field930 = -1;
            }
            this.field971 = arg0.method2385();
            if (this.field971 == 65535) {
                this.field971 = -1;
            }
            int var11 = arg0.method2383();
            this.field969 = new int[var11 + 1];
            for (int var12 = 0; var12 <= var11; var12++) {
                this.field969[var12] = arg0.method2385();
                if (this.field969[var12] == 65535) {
                    this.field969[var12] = -1;
                }
            }
        } else if (arg1 == 78) {
            this.field939 = arg0.method2385();
            this.field973 = arg0.method2383();
        } else if (arg1 == 79) {
            this.field957 = arg0.method2385();
            this.field975 = arg0.method2385();
            this.field973 = arg0.method2383();
            int var13 = arg0.method2383();
            this.field976 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field976[var14] = arg0.method2385();
            }
        } else if (arg1 == 81) {
            this.field972 = arg0.method2383() * 256;
        }
    }

    @ObfuscatedName("ay.f(II)Z")
    public final boolean method776(int arg0) {
        if (this.field941 != null) {
            for (int var4 = 0; var4 < this.field941.length; var4++) {
                if (this.field941[var4] == arg0) {
                    return Statics.field929.method3075(this.field936[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field936 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field936.length; var3++) {
                var2 &= Statics.field929.method3075(this.field936[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ay.g(I)Z")
    public final boolean method770() {
        if (this.field936 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field936.length; var2++) {
            var1 &= Statics.field929.method3075(this.field936[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ay.o(II[[IIIII)Lco;")
    public final class85 method771(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field941 == null) {
            var7 = (long) ((this.field962 << 10) + arg1);
        } else {
            var7 = (long) ((this.field962 << 10) + (arg0 << 3) + arg1);
        }
        class85 var9 = (class85) field932.method3538(var7);
        if (var9 == null) {
            class100 var10 = this.method774(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field934) {
                var10.field1717 = (short) (this.field945 + 64);
                var10.field1709 = (short) (this.field954 + 768);
                var10.method2117();
                var9 = var10;
            } else {
                var9 = var10.method2112(this.field945 + 64, this.field954 + 768, -50, -10, -50);
            }
            field932.method3540(var9, var7);
        }
        if (this.field934) {
            var9 = ((class100) var9).method2089();
        }
        if (this.field972 >= 0) {
            if (var9 instanceof class105) {
                var9 = ((class105) var9).method2173(arg2, arg3, arg4, arg5, true, this.field972);
            } else if (var9 instanceof class100) {
                var9 = ((class100) var9).method2090(arg2, arg3, arg4, arg5, true, this.field972);
            }
        }
        return var9;
    }

    @ObfuscatedName("ay.s(II[[IIIII)Ldg;")
    public final class105 method793(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field941 == null) {
            var7 = (long) ((this.field962 << 10) + arg1);
        } else {
            var7 = (long) ((this.field962 << 10) + (arg0 << 3) + arg1);
        }
        class105 var9 = (class105) field933.method3538(var7);
        if (var9 == null) {
            class100 var10 = this.method774(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method2112(this.field945 + 64, this.field954 + 768, -50, -10, -50);
            field933.method3540(var9, var7);
        }
        if (this.field972 >= 0) {
            var9 = var9.method2173(arg2, arg3, arg4, arg5, true, this.field972);
        }
        return var9;
    }

    @ObfuscatedName("ay.k(II[[IIIILaz;II)Ldg;")
    public final class105 method801(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class43 arg6, int arg7) {
        long var9;
        if (this.field941 == null) {
            var9 = (long) ((this.field962 << 10) + arg1);
        } else {
            var9 = (long) ((this.field962 << 10) + (arg0 << 3) + arg1);
        }
        class105 var11 = (class105) field933.method3538(var9);
        if (var11 == null) {
            class100 var12 = this.method774(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method2112(this.field945 + 64, this.field954 + 768, -50, -10, -50);
            field933.method3540(var11, var9);
        }
        if (arg6 == null && this.field972 == -1) {
            return var11;
        }
        class105 var13;
        if (arg6 == null) {
            var13 = var11.method2216(true);
        } else {
            var13 = arg6.method838(var11, arg7, arg1);
        }
        if (this.field972 >= 0) {
            var13 = var13.method2173(arg2, arg3, arg4, arg5, false, this.field972);
        }
        return var13;
    }

    @ObfuscatedName("ay.b(III)Lch;")
    public final class100 method774(int arg0, int arg1) {
        class100 var3 = null;
        if (this.field941 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field936 == null) {
                return null;
            }
            boolean var4 = this.field944;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field936.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field936[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class100) field931.method3538((long) var7);
                if (var3 == null) {
                    var3 = class100.method2084(Statics.field929, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method2099();
                    }
                    field931.method3540(var3, (long) var7);
                }
                if (var5 > 1) {
                    field953[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class100(field953, var5);
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
            int var10 = this.field936[var8];
            boolean var11 = this.field944 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class100) field931.method3538((long) var10);
            if (var3 == null) {
                var3 = class100.method2084(Statics.field929, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method2099();
                }
                field931.method3540(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field948 == 128 && this.field961 == 128 && this.field974 == 128) {
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
        class100 var14 = new class100(var3, arg1 == 0 && !var12 && !var13, this.field951 == null, this.field947 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method2095(256);
            var14.method2096(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method2092();
        } else if (var15 == 2) {
            var14.method2125();
        } else if (var15 == 3) {
            var14.method2094();
        }
        if (this.field951 != null) {
            for (int var16 = 0; var16 < this.field951.length; var16++) {
                var14.method2097(this.field951[var16], this.field940[var16]);
            }
        }
        if (this.field947 != null) {
            for (int var17 = 0; var17 < this.field947.length; var17++) {
                var14.method2149(this.field947[var17], this.field942[var17]);
            }
        }
        if (var12) {
            var14.method2157(this.field948, this.field961, this.field974);
        }
        if (var13) {
            var14.method2096(this.field963, this.field964, this.field965);
        }
        return var14;
    }

    @ObfuscatedName("ay.c(I)Lay;")
    public final class41 method775() {
        int var1 = -1;
        if (this.field930 != -1) {
            var1 = class176.method156(this.field930);
        } else if (this.field971 != -1) {
            var1 = class176.field2879[this.field971];
        }
        return var1 < 0 || var1 >= this.field969.length || this.field969[var1] == -1 ? null : method2325(this.field969[var1]);
    }

    @ObfuscatedName("ay.l(I)Z")
    public boolean method798() {
        if (this.field969 == null) {
            return this.field939 != -1 || this.field976 != null;
        }
        for (int var1 = 0; var1 < this.field969.length; var1++) {
            if (this.field969[var1] != -1) {
                class41 var2 = method2325(this.field969[var1]);
                if (var2.field939 != -1 || var2.field976 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
