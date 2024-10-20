package deob;

@ObfuscatedName("gy")
public class class188 extends class406 {

    @ObfuscatedName("gy.o")
    public static boolean field2090 = false;

    @ObfuscatedName("gy.k")
    public static class257 field2116 = new class257(4096);

    @ObfuscatedName("gy.a")
    public static class257 field2127 = new class257(500);

    @ObfuscatedName("gy.m")
    public static class257 field2084 = new class257(30);

    @ObfuscatedName("gy.p")
    public static class257 field2121 = new class257(30);

    @ObfuscatedName("gy.s")
    public static class197[] field2086 = new class197[4];

    @ObfuscatedName("gy.r")
    public int field2087;

    @ObfuscatedName("gy.v")
    public int[] field2115;

    @ObfuscatedName("gy.y")
    public int[] field2089;

    @ObfuscatedName("gy.c")
    public String field2085 = class309.field3681;

    @ObfuscatedName("gy.w")
    public short[] field2091;

    @ObfuscatedName("gy.b")
    public short[] field2088;

    @ObfuscatedName("gy.t")
    public short[] field2093;

    @ObfuscatedName("gy.g")
    public short[] field2094;

    @ObfuscatedName("gy.x")
    public int field2095 = 1;

    @ObfuscatedName("gy.n")
    public int field2096 = 1;

    @ObfuscatedName("gy.e")
    public int field2097 = 2;

    @ObfuscatedName("gy.h")
    public boolean field2098 = true;

    @ObfuscatedName("gy.f")
    public int field2099 = -1;

    @ObfuscatedName("gy.d")
    public int field2100 = -1;

    @ObfuscatedName("gy.j")
    public boolean field2120 = false;

    @ObfuscatedName("gy.z")
    public boolean field2102 = false;

    @ObfuscatedName("gy.i")
    public int field2103 = -1;

    @ObfuscatedName("gy.u")
    public int field2104 = 16;

    @ObfuscatedName("gy.ag")
    public int field2117 = 0;

    @ObfuscatedName("gy.ar")
    public int field2106 = 0;

    @ObfuscatedName("gy.am")
    public String[] field2107 = new String[5];

    @ObfuscatedName("gy.ac")
    public int field2108 = -1;

    @ObfuscatedName("gy.ab")
    public int field2082 = -1;

    @ObfuscatedName("gy.aj")
    public boolean field2110 = false;

    @ObfuscatedName("gy.ae")
    public boolean field2111 = true;

    @ObfuscatedName("gy.az")
    public int field2112 = 128;

    @ObfuscatedName("gy.ap")
    public int field2113 = 128;

    @ObfuscatedName("gy.as")
    public int field2109 = 128;

    @ObfuscatedName("gy.au")
    public int field2083 = 0;

    @ObfuscatedName("gy.ak")
    public int field2079 = 0;

    @ObfuscatedName("gy.af")
    public int field2119 = 0;

    @ObfuscatedName("gy.al")
    public boolean field2118 = false;

    @ObfuscatedName("gy.aq")
    public boolean field2129 = false;

    @ObfuscatedName("gy.ad")
    public int field2101 = -1;

    @ObfuscatedName("gy.an")
    public int[] field2092;

    @ObfuscatedName("gy.aw")
    public int field2122 = -1;

    @ObfuscatedName("gy.ah")
    public int field2123 = -1;

    @ObfuscatedName("gy.ao")
    public int field2124 = -1;

    @ObfuscatedName("gy.av")
    public int field2125 = 0;

    @ObfuscatedName("gy.ai")
    public int field2126 = 0;

    @ObfuscatedName("gy.ay")
    public int field2105 = 0;

    @ObfuscatedName("gy.aa")
    public int[] field2128;

    @ObfuscatedName("gy.ax")
    public boolean field2114 = true;

    @ObfuscatedName("gy.at")
    public class420 field2130;

    @ObfuscatedName("cf.o(Llp;Llp;ZI)V")
    public static void method2265(class316 arg0, class316 arg1, boolean arg2) {
        Statics.field2080 = arg0;
        Statics.field2081 = arg1;
        field2090 = arg2;
    }

    @ObfuscatedName("cs.q(IB)Lgy;")
    public static class188 method1989(int arg0) {
        class188 var1 = (class188) field2116.method4566((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2080.method5249(6, arg0);
        class188 var3 = new class188();
        var3.field2087 = arg0;
        if (var2 != null) {
            var3.method3289(new class440(var2));
        }
        var3.method3266();
        if (var3.field2129) {
            var3.field2097 = 0;
            var3.field2098 = false;
        }
        field2116.method4571(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.l(B)V")
    public void method3266() {
        if (this.field2099 == -1) {
            this.field2099 = 0;
            if (this.field2115 != null && (this.field2089 == null || this.field2089[0] == 10)) {
                this.field2099 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2107[var1] != null) {
                    this.field2099 = 1;
                }
            }
        }
        if (this.field2101 == -1) {
            this.field2101 = this.field2097 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gy.k(Lpx;I)V")
    public void method3289(class440 arg0) {
        while (true) {
            int var2 = arg0.method7071();
            if (var2 == 0) {
                return;
            }
            this.method3268(arg0, var2);
        }
    }

    @ObfuscatedName("gy.a(Lpx;II)V")
    public void method3268(class440 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7071();
            if (var3 > 0) {
                if (this.field2115 == null || field2090) {
                    this.field2089 = new int[var3];
                    this.field2115 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2115[var4] = arg0.method7082();
                        this.field2089[var4] = arg0.method7071();
                    }
                } else {
                    arg0.field4678 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2085 = arg0.method7044();
        } else if (arg1 == 5) {
            int var5 = arg0.method7071();
            if (var5 > 0) {
                if (this.field2115 == null || field2090) {
                    this.field2089 = null;
                    this.field2115 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2115[var6] = arg0.method7082();
                    }
                } else {
                    arg0.field4678 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2095 = arg0.method7071();
        } else if (arg1 == 15) {
            this.field2096 = arg0.method7071();
        } else if (arg1 == 17) {
            this.field2097 = 0;
            this.field2098 = false;
        } else if (arg1 == 18) {
            this.field2098 = false;
        } else if (arg1 == 19) {
            this.field2099 = arg0.method7071();
        } else if (arg1 == 21) {
            this.field2100 = 0;
        } else if (arg1 == 22) {
            this.field2120 = true;
        } else if (arg1 == 23) {
            this.field2102 = true;
        } else if (arg1 == 24) {
            this.field2103 = arg0.method7082();
            if (this.field2103 == 65535) {
                this.field2103 = -1;
            }
        } else if (arg1 == 27) {
            this.field2097 = 1;
        } else if (arg1 == 28) {
            this.field2104 = arg0.method7071();
        } else if (arg1 == 29) {
            this.field2117 = arg0.method7034();
        } else if (arg1 == 39) {
            this.field2106 = arg0.method7034() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2107[arg1 - 30] = arg0.method7044();
            if (this.field2107[arg1 - 30].equalsIgnoreCase(class309.field3689)) {
                this.field2107[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method7071();
            this.field2091 = new short[var7];
            this.field2088 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2091[var8] = (short) arg0.method7082();
                this.field2088[var8] = (short) arg0.method7082();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method7071();
            this.field2093 = new short[var9];
            this.field2094 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2093[var10] = (short) arg0.method7082();
                this.field2094[var10] = (short) arg0.method7082();
            }
        } else if (arg1 == 61) {
            arg0.method7082();
        } else if (arg1 == 62) {
            this.field2110 = true;
        } else if (arg1 == 64) {
            this.field2111 = false;
        } else if (arg1 == 65) {
            this.field2112 = arg0.method7082();
        } else if (arg1 == 66) {
            this.field2113 = arg0.method7082();
        } else if (arg1 == 67) {
            this.field2109 = arg0.method7082();
        } else if (arg1 == 68) {
            this.field2082 = arg0.method7082();
        } else if (arg1 == 69) {
            arg0.method7071();
        } else if (arg1 == 70) {
            this.field2083 = arg0.method6896();
        } else if (arg1 == 71) {
            this.field2079 = arg0.method6896();
        } else if (arg1 == 72) {
            this.field2119 = arg0.method6896();
        } else if (arg1 == 73) {
            this.field2118 = true;
        } else if (arg1 == 74) {
            this.field2129 = true;
        } else if (arg1 == 75) {
            this.field2101 = arg0.method7071();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2122 = arg0.method7082();
            if (this.field2122 == 65535) {
                this.field2122 = -1;
            }
            this.field2123 = arg0.method7082();
            if (this.field2123 == 65535) {
                this.field2123 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method7082();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method7071();
            this.field2092 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2092[var15] = arg0.method7082();
                if (this.field2092[var15] == 65535) {
                    this.field2092[var15] = -1;
                }
            }
            this.field2092[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2124 = arg0.method7082();
            this.field2125 = arg0.method7071();
        } else if (arg1 == 79) {
            this.field2126 = arg0.method7082();
            this.field2105 = arg0.method7082();
            this.field2125 = arg0.method7071();
            int var11 = arg0.method7071();
            this.field2128 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2128[var12] = arg0.method7082();
            }
        } else if (arg1 == 81) {
            this.field2100 = arg0.method7071() * 256;
        } else if (arg1 == 82) {
            this.field2108 = arg0.method7082();
        } else if (arg1 == 89) {
            this.field2114 = false;
        } else if (arg1 == 249) {
            this.field2130 = class176.method2892(arg0, this.field2130);
        }
    }

    @ObfuscatedName("gy.m(IB)Z")
    public final boolean method3294(int arg0) {
        if (this.field2089 != null) {
            for (int var4 = 0; var4 < this.field2089.length; var4++) {
                if (this.field2089[var4] == arg0) {
                    return Statics.field2081.method5237(this.field2115[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2115 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2115.length; var3++) {
                var2 &= Statics.field2081.method5237(this.field2115[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gy.p(B)Z")
    public final boolean method3270() {
        if (this.field2115 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2115.length; var2++) {
            var1 &= Statics.field2081.method5237(this.field2115[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gy.s(II[[IIIII)Lgx;")
    public final class206 method3271(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2089 == null) {
            var7 = (long) ((this.field2087 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2087 << 10) + (arg0 << 3) + arg1);
        }
        class206 var9 = (class206) field2084.method4566(var7);
        if (var9 == null) {
            class197 var10 = this.method3274(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2120) {
                var10.field2307 = (short) (this.field2117 + 64);
                var10.field2290 = (short) (this.field2106 + 768);
                var10.method3526();
                var9 = var10;
            } else {
                var9 = var10.method3530(this.field2117 + 64, this.field2106 + 768, -50, -10, -50);
            }
            field2084.method4571(var9, var7);
        }
        if (this.field2120) {
            var9 = ((class197) var9).method3541();
        }
        if (this.field2100 >= 0) {
            if (var9 instanceof class212) {
                var9 = ((class212) var9).method4016(arg2, arg3, arg4, arg5, true, this.field2100);
            } else if (var9 instanceof class197) {
                var9 = ((class197) var9).method3544(arg2, arg3, arg4, arg5, true, this.field2100);
            }
        }
        return var9;
    }

    @ObfuscatedName("gy.r(II[[IIIII)Lhv;")
    public final class212 method3272(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2089 == null) {
            var7 = (long) ((this.field2087 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2087 << 10) + (arg0 << 3) + arg1);
        }
        class212 var9 = (class212) field2121.method4566(var7);
        if (var9 == null) {
            class197 var10 = this.method3274(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3530(this.field2117 + 64, this.field2106 + 768, -50, -10, -50);
            field2121.method4571(var9, var7);
        }
        if (this.field2100 >= 0) {
            var9 = var9.method4016(arg2, arg3, arg4, arg5, true, this.field2100);
        }
        return var9;
    }

    @ObfuscatedName("gy.v(II[[IIIILgq;IB)Lhv;")
    public final class212 method3267(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class191 arg6, int arg7) {
        long var9;
        if (this.field2089 == null) {
            var9 = (long) ((this.field2087 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2087 << 10) + (arg0 << 3) + arg1);
        }
        class212 var11 = (class212) field2121.method4566(var9);
        if (var11 == null) {
            class197 var12 = this.method3274(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3530(this.field2117 + 64, this.field2106 + 768, -50, -10, -50);
            field2121.method4571(var11, var9);
        }
        if (arg6 == null && this.field2100 == -1) {
            return var11;
        }
        class212 var13;
        if (arg6 == null) {
            var13 = var11.method3942(true);
        } else {
            var13 = arg6.method3412(var11, arg7, arg1);
        }
        if (this.field2100 >= 0) {
            var13 = var13.method4016(arg2, arg3, arg4, arg5, false, this.field2100);
        }
        return var13;
    }

    @ObfuscatedName("gy.y(III)Lgs;")
    public final class197 method3274(int arg0, int arg1) {
        class197 var3 = null;
        if (this.field2089 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2115 == null) {
                return null;
            }
            boolean var4 = this.field2110;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2115.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2115[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class197) field2127.method4566((long) var7);
                if (var3 == null) {
                    var3 = class197.method3507(Statics.field2081, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3538();
                    }
                    field2127.method4571(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2086[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class197(field2086, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2089.length; var9++) {
                if (this.field2089[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2115[var8];
            boolean var11 = this.field2110 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class197) field2127.method4566((long) var10);
            if (var3 == null) {
                var3 = class197.method3507(Statics.field2081, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3538();
                }
                field2127.method4571(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2112 == 128 && this.field2113 == 128 && this.field2109 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2083 == 0 && this.field2079 == 0 && this.field2119 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class197 var14 = new class197(var3, arg1 == 0 && !var12 && !var13, this.field2091 == null, this.field2093 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3520(256);
            var14.method3521(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3517();
        } else if (var15 == 2) {
            var14.method3551();
        } else if (var15 == 3) {
            var14.method3519();
        }
        if (this.field2091 != null) {
            for (int var16 = 0; var16 < this.field2091.length; var16++) {
                var14.method3574(this.field2091[var16], this.field2088[var16]);
            }
        }
        if (this.field2093 != null) {
            for (int var17 = 0; var17 < this.field2093.length; var17++) {
                var14.method3523(this.field2093[var17], this.field2094[var17]);
            }
        }
        if (var12) {
            var14.method3525(this.field2112, this.field2113, this.field2109);
        }
        if (var13) {
            var14.method3521(this.field2083, this.field2079, this.field2119);
        }
        return var14;
    }

    @ObfuscatedName("gy.c(B)Lgy;")
    public final class188 method3299() {
        int var1 = -1;
        if (this.field2122 != -1) {
            var1 = class289.method241(this.field2122);
        } else if (this.field2123 != -1) {
            var1 = class289.field3348[this.field2123];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2092.length - 1) {
            var2 = this.field2092[var1];
        } else {
            var2 = this.field2092[this.field2092.length - 1];
        }
        return var2 == -1 ? null : method1989(var2);
    }

    @ObfuscatedName("gy.w(III)I")
    public int method3276(int arg0, int arg1) {
        return class176.method2802(this.field2130, arg0, arg1);
    }

    @ObfuscatedName("gy.b(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3315(int arg0, String arg1) {
        return class176.method2266(this.field2130, arg0, arg1);
    }

    @ObfuscatedName("gy.t(I)Z")
    public boolean method3322() {
        if (this.field2092 == null) {
            return this.field2124 != -1 || this.field2128 != null;
        }
        for (int var1 = 0; var1 < this.field2092.length; var1++) {
            if (this.field2092[var1] != -1) {
                class188 var2 = method1989(this.field2092[var1]);
                if (var2.field2124 != -1 || var2.field2128 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
