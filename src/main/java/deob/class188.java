package deob;

@ObfuscatedName("gz")
public class class188 extends class407 {

    @ObfuscatedName("gz.c")
    public static boolean field2100 = false;

    @ObfuscatedName("gz.n")
    public static class257 field2072 = new class257(4096);

    @ObfuscatedName("gz.k")
    public static class257 field2075 = new class257(500);

    @ObfuscatedName("gz.w")
    public static class257 field2115 = new class257(30);

    @ObfuscatedName("gz.s")
    public static class257 field2093 = new class257(30);

    @ObfuscatedName("gz.q")
    public static class197[] field2081 = new class197[4];

    @ObfuscatedName("gz.m")
    public int field2077;

    @ObfuscatedName("gz.x")
    public int[] field2119;

    @ObfuscatedName("gz.j")
    public int[] field2079;

    @ObfuscatedName("gz.v")
    public String field2074 = class310.field3924;

    @ObfuscatedName("gz.h")
    public short[] field2117;

    @ObfuscatedName("gz.t")
    public short[] field2082;

    @ObfuscatedName("gz.u")
    public short[] field2099;

    @ObfuscatedName("gz.d")
    public short[] field2084;

    @ObfuscatedName("gz.b")
    public int field2073 = 1;

    @ObfuscatedName("gz.a")
    public int field2086 = 1;

    @ObfuscatedName("gz.l")
    public int field2087 = 2;

    @ObfuscatedName("gz.e")
    public boolean field2088 = true;

    @ObfuscatedName("gz.g")
    public int field2089 = -1;

    @ObfuscatedName("gz.y")
    public int field2076 = -1;

    @ObfuscatedName("gz.i")
    public boolean field2091 = false;

    @ObfuscatedName("gz.r")
    public boolean field2109 = false;

    @ObfuscatedName("gz.z")
    public int field2110 = -1;

    @ObfuscatedName("gz.o")
    public int field2094 = 16;

    @ObfuscatedName("gz.as")
    public int field2095 = 0;

    @ObfuscatedName("gz.ac")
    public int field2096 = 0;

    @ObfuscatedName("gz.ao")
    public String[] field2097 = new String[5];

    @ObfuscatedName("gz.ar")
    public int field2105 = -1;

    @ObfuscatedName("gz.aq")
    public int field2114 = -1;

    @ObfuscatedName("gz.ai")
    public boolean field2078 = false;

    @ObfuscatedName("gz.an")
    public boolean field2101 = true;

    @ObfuscatedName("gz.aa")
    public int field2102 = 128;

    @ObfuscatedName("gz.ak")
    public int field2103 = 128;

    @ObfuscatedName("gz.am")
    public int field2085 = 128;

    @ObfuscatedName("gz.ap")
    public int field2069 = 0;

    @ObfuscatedName("gz.ab")
    public int field2106 = 0;

    @ObfuscatedName("gz.az")
    public int field2107 = 0;

    @ObfuscatedName("gz.ad")
    public boolean field2108 = false;

    @ObfuscatedName("gz.af")
    public boolean field2098 = false;

    @ObfuscatedName("gz.aj")
    public int field2104 = -1;

    @ObfuscatedName("gz.ax")
    public int[] field2111;

    @ObfuscatedName("gz.av")
    public int field2112 = -1;

    @ObfuscatedName("gz.ae")
    public int field2113 = -1;

    @ObfuscatedName("gz.ay")
    public int field2090 = -1;

    @ObfuscatedName("gz.ag")
    public int field2083 = 0;

    @ObfuscatedName("gz.aw")
    public int field2116 = 0;

    @ObfuscatedName("gz.ah")
    public int field2080 = 0;

    @ObfuscatedName("gz.at")
    public int[] field2118;

    @ObfuscatedName("gz.al")
    public boolean field2092 = true;

    @ObfuscatedName("gz.au")
    public class421 field2120;

    @ObfuscatedName("fr.c(Llv;Llv;ZI)V")
    public static void method3105(class317 arg0, class317 arg1, boolean arg2) {
        Statics.field2070 = arg0;
        Statics.field2071 = arg1;
        field2100 = arg2;
    }

    @ObfuscatedName("gz.f(I)V")
    public void method3417() {
        if (this.field2089 == -1) {
            this.field2089 = 0;
            if (this.field2119 != null && (this.field2079 == null || this.field2079[0] == 10)) {
                this.field2089 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2097[var1] != null) {
                    this.field2089 = 1;
                }
            }
        }
        if (this.field2104 == -1) {
            this.field2104 = this.field2087 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gz.n(Lqq;I)V")
    public void method3457(class445 arg0) {
        while (true) {
            int var2 = arg0.method7196();
            if (var2 == 0) {
                return;
            }
            this.method3419(arg0, var2);
        }
    }

    @ObfuscatedName("gz.k(Lqq;IS)V")
    public void method3419(class445 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7196();
            if (var3 > 0) {
                if (this.field2119 == null || field2100) {
                    this.field2079 = new int[var3];
                    this.field2119 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2119[var4] = arg0.method7198();
                        this.field2079[var4] = arg0.method7196();
                    }
                } else {
                    arg0.field4735 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2074 = arg0.method7206();
        } else if (arg1 == 5) {
            int var5 = arg0.method7196();
            if (var5 > 0) {
                if (this.field2119 == null || field2100) {
                    this.field2079 = null;
                    this.field2119 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2119[var6] = arg0.method7198();
                    }
                } else {
                    arg0.field4735 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2073 = arg0.method7196();
        } else if (arg1 == 15) {
            this.field2086 = arg0.method7196();
        } else if (arg1 == 17) {
            this.field2087 = 0;
            this.field2088 = false;
        } else if (arg1 == 18) {
            this.field2088 = false;
        } else if (arg1 == 19) {
            this.field2089 = arg0.method7196();
        } else if (arg1 == 21) {
            this.field2076 = 0;
        } else if (arg1 == 22) {
            this.field2091 = true;
        } else if (arg1 == 23) {
            this.field2109 = true;
        } else if (arg1 == 24) {
            this.field2110 = arg0.method7198();
            if (this.field2110 == 65535) {
                this.field2110 = -1;
            }
        } else if (arg1 == 27) {
            this.field2087 = 1;
        } else if (arg1 == 28) {
            this.field2094 = arg0.method7196();
        } else if (arg1 == 29) {
            this.field2095 = arg0.method7197();
        } else if (arg1 == 39) {
            this.field2096 = arg0.method7197() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2097[arg1 - 30] = arg0.method7206();
            if (this.field2097[arg1 - 30].equalsIgnoreCase(class310.field3658)) {
                this.field2097[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method7196();
            this.field2117 = new short[var7];
            this.field2082 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2117[var8] = (short) arg0.method7198();
                this.field2082[var8] = (short) arg0.method7198();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method7196();
            this.field2099 = new short[var9];
            this.field2084 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2099[var10] = (short) arg0.method7198();
                this.field2084[var10] = (short) arg0.method7198();
            }
        } else if (arg1 == 61) {
            arg0.method7198();
        } else if (arg1 == 62) {
            this.field2078 = true;
        } else if (arg1 == 64) {
            this.field2101 = false;
        } else if (arg1 == 65) {
            this.field2102 = arg0.method7198();
        } else if (arg1 == 66) {
            this.field2103 = arg0.method7198();
        } else if (arg1 == 67) {
            this.field2085 = arg0.method7198();
        } else if (arg1 == 68) {
            this.field2114 = arg0.method7198();
        } else if (arg1 == 69) {
            arg0.method7196();
        } else if (arg1 == 70) {
            this.field2069 = arg0.method7199();
        } else if (arg1 == 71) {
            this.field2106 = arg0.method7199();
        } else if (arg1 == 72) {
            this.field2107 = arg0.method7199();
        } else if (arg1 == 73) {
            this.field2108 = true;
        } else if (arg1 == 74) {
            this.field2098 = true;
        } else if (arg1 == 75) {
            this.field2104 = arg0.method7196();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2112 = arg0.method7198();
            if (this.field2112 == 65535) {
                this.field2112 = -1;
            }
            this.field2113 = arg0.method7198();
            if (this.field2113 == 65535) {
                this.field2113 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method7198();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method7196();
            this.field2111 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2111[var15] = arg0.method7198();
                if (this.field2111[var15] == 65535) {
                    this.field2111[var15] = -1;
                }
            }
            this.field2111[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2090 = arg0.method7198();
            this.field2083 = arg0.method7196();
        } else if (arg1 == 79) {
            this.field2116 = arg0.method7198();
            this.field2080 = arg0.method7198();
            this.field2083 = arg0.method7196();
            int var11 = arg0.method7196();
            this.field2118 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2118[var12] = arg0.method7198();
            }
        } else if (arg1 == 81) {
            this.field2076 = arg0.method7196() * 256;
        } else if (arg1 == 82) {
            this.field2105 = arg0.method7198();
        } else if (arg1 == 89) {
            this.field2092 = false;
        } else if (arg1 == 249) {
            this.field2120 = class176.method643(arg0, this.field2120);
        }
    }

    @ObfuscatedName("gz.w(II)Z")
    public final boolean method3420(int arg0) {
        if (this.field2079 != null) {
            for (int var4 = 0; var4 < this.field2079.length; var4++) {
                if (this.field2079[var4] == arg0) {
                    return Statics.field2071.method5490(this.field2119[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2119 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2119.length; var3++) {
                var2 &= Statics.field2071.method5490(this.field2119[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gz.s(I)Z")
    public final boolean method3460() {
        if (this.field2119 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2119.length; var2++) {
            var1 &= Statics.field2071.method5490(this.field2119[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gz.q(II[[IIIIS)Lgg;")
    public final class206 method3439(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2079 == null) {
            var7 = (long) ((this.field2077 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2077 << 10) + (arg0 << 3) + arg1);
        }
        class206 var9 = (class206) field2115.method4789(var7);
        if (var9 == null) {
            class197 var10 = this.method3459(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2091) {
                var10.field2291 = (short) (this.field2095 + 64);
                var10.field2300 = (short) (this.field2096 + 768);
                var10.method3687();
                var9 = var10;
            } else {
                var9 = var10.method3690(this.field2095 + 64, this.field2096 + 768, -50, -10, -50);
            }
            field2115.method4781(var9, var7);
        }
        if (this.field2091) {
            var9 = ((class197) var9).method3736();
        }
        if (this.field2076 >= 0) {
            if (var9 instanceof class212) {
                var9 = ((class212) var9).method4131(arg2, arg3, arg4, arg5, true, this.field2076);
            } else if (var9 instanceof class197) {
                var9 = ((class197) var9).method3689(arg2, arg3, arg4, arg5, true, this.field2076);
            }
        }
        return var9;
    }

    @ObfuscatedName("gz.m(II[[IIIII)Lha;")
    public final class212 method3422(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2079 == null) {
            var7 = (long) ((this.field2077 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2077 << 10) + (arg0 << 3) + arg1);
        }
        class212 var9 = (class212) field2093.method4789(var7);
        if (var9 == null) {
            class197 var10 = this.method3459(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3690(this.field2095 + 64, this.field2096 + 768, -50, -10, -50);
            field2093.method4781(var9, var7);
        }
        if (this.field2076 >= 0) {
            var9 = var9.method4131(arg2, arg3, arg4, arg5, true, this.field2076);
        }
        return var9;
    }

    @ObfuscatedName("gz.x(II[[IIIILgd;II)Lha;")
    public final class212 method3423(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class191 arg6, int arg7) {
        long var9;
        if (this.field2079 == null) {
            var9 = (long) ((this.field2077 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2077 << 10) + (arg0 << 3) + arg1);
        }
        class212 var11 = (class212) field2093.method4789(var9);
        if (var11 == null) {
            class197 var12 = this.method3459(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3690(this.field2095 + 64, this.field2096 + 768, -50, -10, -50);
            field2093.method4781(var11, var9);
        }
        if (arg6 == null && this.field2076 == -1) {
            return var11;
        }
        class212 var13;
        if (arg6 == null) {
            var13 = var11.method4135(true);
        } else {
            var13 = arg6.method3574(var11, arg7, arg1);
        }
        if (this.field2076 >= 0) {
            var13 = var13.method4131(arg2, arg3, arg4, arg5, false, this.field2076);
        }
        return var13;
    }

    @ObfuscatedName("gz.j(III)Lgu;")
    public final class197 method3459(int arg0, int arg1) {
        class197 var3 = null;
        if (this.field2079 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2119 == null) {
                return null;
            }
            boolean var4 = this.field2078;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2119.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2119[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class197) field2075.method4789((long) var7);
                if (var3 == null) {
                    var3 = class197.method3742(Statics.field2071, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3747();
                    }
                    field2075.method4781(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2081[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class197(field2081, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2079.length; var9++) {
                if (this.field2079[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2119[var8];
            boolean var11 = this.field2078 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class197) field2075.method4789((long) var10);
            if (var3 == null) {
                var3 = class197.method3742(Statics.field2071, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3747();
                }
                field2075.method4781(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2102 == 128 && this.field2103 == 128 && this.field2085 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2069 == 0 && this.field2106 == 0 && this.field2107 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class197 var14 = new class197(var3, arg1 == 0 && !var12 && !var13, this.field2117 == null, this.field2099 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3681(256);
            var14.method3682(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3684();
        } else if (var15 == 2) {
            var14.method3679();
        } else if (var15 == 3) {
            var14.method3680();
        }
        if (this.field2117 != null) {
            for (int var16 = 0; var16 < this.field2117.length; var16++) {
                var14.method3683(this.field2117[var16], this.field2082[var16]);
            }
        }
        if (this.field2099 != null) {
            for (int var17 = 0; var17 < this.field2099.length; var17++) {
                var14.method3722(this.field2099[var17], this.field2084[var17]);
            }
        }
        if (var12) {
            var14.method3686(this.field2102, this.field2103, this.field2085);
        }
        if (var13) {
            var14.method3682(this.field2069, this.field2106, this.field2107);
        }
        return var14;
    }

    @ObfuscatedName("gz.v(B)Lgz;")
    public final class188 method3424() {
        int var1 = -1;
        if (this.field2112 != -1) {
            var1 = class290.method2609(this.field2112);
        } else if (this.field2113 != -1) {
            var1 = class290.field3346[this.field2113];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2111.length - 1) {
            var2 = this.field2111[var1];
        } else {
            var2 = this.field2111[this.field2111.length - 1];
        }
        return var2 == -1 ? null : Statics.method5147(var2);
    }

    @ObfuscatedName("gz.h(III)I")
    public int method3453(int arg0, int arg1) {
        return class176.method3147(this.field2120, arg0, arg1);
    }

    @ObfuscatedName("gz.t(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3426(int arg0, String arg1) {
        class421 var3 = this.field2120;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class408 var5 = (class408) var3.method6917((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4500;
            }
        }
        return var4;
    }

    @ObfuscatedName("jx.u(I)V")
    public static void method5051() {
        field2072.method4782();
        field2075.method4782();
        field2115.method4782();
        field2093.method4782();
    }

    @ObfuscatedName("gz.d(I)Z")
    public boolean method3427() {
        if (this.field2111 == null) {
            return this.field2090 != -1 || this.field2118 != null;
        }
        for (int var1 = 0; var1 < this.field2111.length; var1++) {
            if (this.field2111[var1] != -1) {
                class188 var2 = Statics.method5147(this.field2111[var1]);
                if (var2.field2090 != -1 || var2.field2118 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
