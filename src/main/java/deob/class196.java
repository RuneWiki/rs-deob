package deob;

@ObfuscatedName("gn")
public class class196 extends class428 {

    @ObfuscatedName("gn.h")
    public static boolean field2166 = false;

    @ObfuscatedName("gn.x")
    public static class269 field2155 = new class269(4096);

    @ObfuscatedName("gn.m")
    public static class269 field2184 = new class269(500);

    @ObfuscatedName("gn.q")
    public static class269 field2157 = new class269(30);

    @ObfuscatedName("gn.f")
    public static class269 field2158 = new class269(30);

    @ObfuscatedName("gn.r")
    public static class208[] field2159 = new class208[4];

    @ObfuscatedName("gn.u")
    public int field2160;

    @ObfuscatedName("gn.b")
    public int[] field2203;

    @ObfuscatedName("gn.j")
    public int[] field2162;

    @ObfuscatedName("gn.g")
    public String field2163 = class326.field3819;

    @ObfuscatedName("gn.i")
    public short[] field2164;

    @ObfuscatedName("gn.o")
    public short[] field2175;

    @ObfuscatedName("gn.n")
    public short[] field2197;

    @ObfuscatedName("gn.k")
    public short[] field2167;

    @ObfuscatedName("gn.a")
    public int field2168 = 1;

    @ObfuscatedName("gn.s")
    public int field2169 = 1;

    @ObfuscatedName("gn.l")
    public int field2165 = 2;

    @ObfuscatedName("gn.t")
    public boolean field2178 = true;

    @ObfuscatedName("gn.c")
    public int field2172 = -1;

    @ObfuscatedName("gn.p")
    public int field2153 = -1;

    @ObfuscatedName("gn.d")
    public boolean field2174 = false;

    @ObfuscatedName("gn.y")
    public boolean field2189 = false;

    @ObfuscatedName("gn.z")
    public int field2176 = -1;

    @ObfuscatedName("gn.w")
    public int field2177 = 16;

    @ObfuscatedName("gn.as")
    public int field2171 = 0;

    @ObfuscatedName("gn.ad")
    public int field2202 = 0;

    @ObfuscatedName("gn.ao")
    public String[] field2180 = new String[5];

    @ObfuscatedName("gn.am")
    public int field2181 = -1;

    @ObfuscatedName("gn.av")
    public int field2173 = -1;

    @ObfuscatedName("gn.au")
    public boolean field2183 = false;

    @ObfuscatedName("gn.ar")
    public boolean field2198 = true;

    @ObfuscatedName("gn.at")
    public int field2204 = 128;

    @ObfuscatedName("gn.ay")
    public int field2186 = 128;

    @ObfuscatedName("gn.an")
    public int field2187 = 128;

    @ObfuscatedName("gn.ab")
    public int field2170 = 0;

    @ObfuscatedName("gn.al")
    public int field2156 = 0;

    @ObfuscatedName("gn.ag")
    public int field2190 = 0;

    @ObfuscatedName("gn.az")
    public boolean field2191 = false;

    @ObfuscatedName("gn.ak")
    public boolean field2188 = false;

    @ObfuscatedName("gn.af")
    public int field2193 = -1;

    @ObfuscatedName("gn.ai")
    public int[] field2194;

    @ObfuscatedName("gn.ax")
    public int field2195 = -1;

    @ObfuscatedName("gn.ah")
    public int field2196 = -1;

    @ObfuscatedName("gn.aw")
    public int field2201 = -1;

    @ObfuscatedName("gn.aj")
    public int field2182 = 0;

    @ObfuscatedName("gn.aq")
    public int field2199 = 0;

    @ObfuscatedName("gn.ap")
    public int field2200 = 0;

    @ObfuscatedName("gn.aa")
    public int[] field2161;

    @ObfuscatedName("gn.ae")
    public boolean field2185 = true;

    @ObfuscatedName("gn.ac")
    public class443 field2179;

    @ObfuscatedName("dl.h(Lly;Lly;ZI)V")
    public static void method2629(class333 arg0, class333 arg1, boolean arg2) {
        Statics.field2154 = arg0;
        Statics.field348 = arg1;
        field2166 = arg2;
    }

    @ObfuscatedName("fi.e(II)Lgn;")
    public static class196 method3208(int arg0) {
        class196 var1 = (class196) field2155.method4917((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2154.method5909(6, arg0);
        class196 var3 = new class196();
        var3.field2160 = arg0;
        if (var2 != null) {
            var3.method3516(new class467(var2));
        }
        var3.method3519();
        if (var3.field2188) {
            var3.field2165 = 0;
            var3.field2178 = false;
        }
        field2155.method4925(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gn.v(I)V")
    public void method3519() {
        if (this.field2172 == -1) {
            this.field2172 = 0;
            if (this.field2203 != null && (this.field2162 == null || this.field2162[0] == 10)) {
                this.field2172 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2180[var1] != null) {
                    this.field2172 = 1;
                }
            }
        }
        if (this.field2193 == -1) {
            this.field2193 = this.field2165 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gn.x(Lqy;I)V")
    public void method3516(class467 arg0) {
        while (true) {
            int var2 = arg0.method7792();
            if (var2 == 0) {
                return;
            }
            this.method3517(arg0, var2);
        }
    }

    @ObfuscatedName("gn.m(Lqy;IB)V")
    public void method3517(class467 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7792();
            if (var3 > 0) {
                if (this.field2203 == null || field2166) {
                    this.field2162 = new int[var3];
                    this.field2203 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2203[var4] = arg0.method7794();
                        this.field2162[var4] = arg0.method7792();
                    }
                } else {
                    arg0.field4915 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2163 = arg0.method7801();
        } else if (arg1 == 5) {
            int var5 = arg0.method7792();
            if (var5 > 0) {
                if (this.field2203 == null || field2166) {
                    this.field2162 = null;
                    this.field2203 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2203[var6] = arg0.method7794();
                    }
                } else {
                    arg0.field4915 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2168 = arg0.method7792();
        } else if (arg1 == 15) {
            this.field2169 = arg0.method7792();
        } else if (arg1 == 17) {
            this.field2165 = 0;
            this.field2178 = false;
        } else if (arg1 == 18) {
            this.field2178 = false;
        } else if (arg1 == 19) {
            this.field2172 = arg0.method7792();
        } else if (arg1 == 21) {
            this.field2153 = 0;
        } else if (arg1 == 22) {
            this.field2174 = true;
        } else if (arg1 == 23) {
            this.field2189 = true;
        } else if (arg1 == 24) {
            this.field2176 = arg0.method7794();
            if (this.field2176 == 65535) {
                this.field2176 = -1;
            }
        } else if (arg1 == 27) {
            this.field2165 = 1;
        } else if (arg1 == 28) {
            this.field2177 = arg0.method7792();
        } else if (arg1 == 29) {
            this.field2171 = arg0.method7793();
        } else if (arg1 == 39) {
            this.field2202 = arg0.method7793() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2180[arg1 - 30] = arg0.method7801();
            if (this.field2180[arg1 - 30].equalsIgnoreCase(class326.field3820)) {
                this.field2180[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method7792();
            this.field2164 = new short[var7];
            this.field2175 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2164[var8] = (short) arg0.method7794();
                this.field2175[var8] = (short) arg0.method7794();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method7792();
            this.field2197 = new short[var9];
            this.field2167 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2197[var10] = (short) arg0.method7794();
                this.field2167[var10] = (short) arg0.method7794();
            }
        } else if (arg1 == 61) {
            arg0.method7794();
        } else if (arg1 == 62) {
            this.field2183 = true;
        } else if (arg1 == 64) {
            this.field2198 = false;
        } else if (arg1 == 65) {
            this.field2204 = arg0.method7794();
        } else if (arg1 == 66) {
            this.field2186 = arg0.method7794();
        } else if (arg1 == 67) {
            this.field2187 = arg0.method7794();
        } else if (arg1 == 68) {
            this.field2173 = arg0.method7794();
        } else if (arg1 == 69) {
            arg0.method7792();
        } else if (arg1 == 70) {
            this.field2170 = arg0.method7795();
        } else if (arg1 == 71) {
            this.field2156 = arg0.method7795();
        } else if (arg1 == 72) {
            this.field2190 = arg0.method7795();
        } else if (arg1 == 73) {
            this.field2191 = true;
        } else if (arg1 == 74) {
            this.field2188 = true;
        } else if (arg1 == 75) {
            this.field2193 = arg0.method7792();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2195 = arg0.method7794();
            if (this.field2195 == 65535) {
                this.field2195 = -1;
            }
            this.field2196 = arg0.method7794();
            if (this.field2196 == 65535) {
                this.field2196 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method7794();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method7792();
            this.field2194 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2194[var15] = arg0.method7794();
                if (this.field2194[var15] == 65535) {
                    this.field2194[var15] = -1;
                }
            }
            this.field2194[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2201 = arg0.method7794();
            this.field2182 = arg0.method7792();
        } else if (arg1 == 79) {
            this.field2199 = arg0.method7794();
            this.field2200 = arg0.method7794();
            this.field2182 = arg0.method7792();
            int var11 = arg0.method7792();
            this.field2161 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2161[var12] = arg0.method7794();
            }
        } else if (arg1 == 81) {
            this.field2153 = arg0.method7792() * 256;
        } else if (arg1 == 82) {
            this.field2181 = arg0.method7794();
        } else if (arg1 == 89) {
            this.field2185 = false;
        } else if (arg1 == 249) {
            this.field2179 = class183.method2026(arg0, this.field2179);
        }
    }

    @ObfuscatedName("gn.q(II)Z")
    public final boolean method3518(int arg0) {
        if (this.field2162 != null) {
            for (int var4 = 0; var4 < this.field2162.length; var4++) {
                if (this.field2162[var4] == arg0) {
                    return Statics.field348.method5901(this.field2203[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2203 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2203.length; var3++) {
                var2 &= Statics.field348.method5901(this.field2203[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gn.f(I)Z")
    public final boolean method3566() {
        if (this.field2203 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2203.length; var2++) {
            var1 &= Statics.field348.method5901(this.field2203[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gn.r(II[[IIIIS)Lhr;")
    public final class218 method3520(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2162 == null) {
            var7 = (long) ((this.field2160 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2160 << 10) + (arg0 << 3) + arg1);
        }
        class218 var9 = (class218) field2157.method4917(var7);
        if (var9 == null) {
            class208 var10 = this.method3523(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2174) {
                var10.field2411 = (short) (this.field2171 + 64);
                var10.field2419 = (short) (this.field2202 + 768);
                var10.method3832();
                var9 = var10;
            } else {
                var9 = var10.method3836(this.field2171 + 64, this.field2202 + 768, -50, -10, -50);
            }
            field2157.method4925(var9, var7);
        }
        if (this.field2174) {
            var9 = ((class208) var9).method3818();
        }
        if (this.field2153 >= 0) {
            if (var9 instanceof class224) {
                var9 = ((class224) var9).method4270(arg2, arg3, arg4, arg5, true, this.field2153);
            } else if (var9 instanceof class208) {
                var9 = ((class208) var9).method3821(arg2, arg3, arg4, arg5, true, this.field2153);
            }
        }
        return var9;
    }

    @ObfuscatedName("gn.u(II[[IIIII)Lhh;")
    public final class224 method3521(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2162 == null) {
            var7 = (long) ((this.field2160 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2160 << 10) + (arg0 << 3) + arg1);
        }
        class224 var9 = (class224) field2158.method4917(var7);
        if (var9 == null) {
            class208 var10 = this.method3523(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3836(this.field2171 + 64, this.field2202 + 768, -50, -10, -50);
            field2158.method4925(var9, var7);
        }
        if (this.field2153 >= 0) {
            var9 = var9.method4270(arg2, arg3, arg4, arg5, true, this.field2153);
        }
        return var9;
    }

    @ObfuscatedName("gn.b(II[[IIIILga;II)Lhh;")
    public final class224 method3515(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class199 arg6, int arg7) {
        long var9;
        if (this.field2162 == null) {
            var9 = (long) ((this.field2160 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2160 << 10) + (arg0 << 3) + arg1);
        }
        class224 var11 = (class224) field2158.method4917(var9);
        if (var11 == null) {
            class208 var12 = this.method3523(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3836(this.field2171 + 64, this.field2202 + 768, -50, -10, -50);
            field2158.method4925(var11, var9);
        }
        if (arg6 == null && this.field2153 == -1) {
            return var11;
        }
        class224 var13;
        if (arg6 == null) {
            var13 = var11.method4271(true);
        } else {
            var13 = arg6.method3669(var11, arg7, arg1);
        }
        if (this.field2153 >= 0) {
            var13 = var13.method4270(arg2, arg3, arg4, arg5, false, this.field2153);
        }
        return var13;
    }

    @ObfuscatedName("gn.j(III)Lgi;")
    public final class208 method3523(int arg0, int arg1) {
        class208 var3 = null;
        if (this.field2162 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2203 == null) {
                return null;
            }
            boolean var4 = this.field2183;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2203.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2203[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class208) field2184.method4917((long) var7);
                if (var3 == null) {
                    var3 = class208.method3813(Statics.field348, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3830();
                    }
                    field2184.method4925(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2159[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class208(field2159, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2162.length; var9++) {
                if (this.field2162[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2203[var8];
            boolean var11 = this.field2183 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class208) field2184.method4917((long) var10);
            if (var3 == null) {
                var3 = class208.method3813(Statics.field348, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3830();
                }
                field2184.method4925(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2204 == 128 && this.field2186 == 128 && this.field2187 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2170 == 0 && this.field2156 == 0 && this.field2190 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class208 var14 = new class208(var3, arg1 == 0 && !var12 && !var13, this.field2164 == null, this.field2197 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3826(256);
            var14.method3827(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3823();
        } else if (var15 == 2) {
            var14.method3862();
        } else if (var15 == 3) {
            var14.method3825();
        }
        if (this.field2164 != null) {
            for (int var16 = 0; var16 < this.field2164.length; var16++) {
                var14.method3828(this.field2164[var16], this.field2175[var16]);
            }
        }
        if (this.field2197 != null) {
            for (int var17 = 0; var17 < this.field2197.length; var17++) {
                var14.method3829(this.field2197[var17], this.field2167[var17]);
            }
        }
        if (var12) {
            var14.method3831(this.field2204, this.field2186, this.field2187);
        }
        if (var13) {
            var14.method3827(this.field2170, this.field2156, this.field2190);
        }
        return var14;
    }

    @ObfuscatedName("gn.g(B)Lgn;")
    public final class196 method3560() {
        int var1 = -1;
        if (this.field2195 != -1) {
            var1 = class296.method3182(this.field2195);
        } else if (this.field2196 != -1) {
            var1 = class296.field3445[this.field2196];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2194.length - 1) {
            var2 = this.field2194[var1];
        } else {
            var2 = this.field2194[this.field2194.length - 1];
        }
        return var2 == -1 ? null : method3208(var2);
    }

    @ObfuscatedName("gn.i(III)I")
    public int method3525(int arg0, int arg1) {
        return class183.method2676(this.field2179, arg0, arg1);
    }

    @ObfuscatedName("gn.o(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3526(int arg0, String arg1) {
        class443 var3 = this.field2179;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class429 var5 = (class429) var3.method7525((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4680;
            }
        }
        return var4;
    }

    @ObfuscatedName("gn.n(B)Z")
    public boolean method3527() {
        if (this.field2194 == null) {
            return this.field2201 != -1 || this.field2161 != null;
        }
        for (int var1 = 0; var1 < this.field2194.length; var1++) {
            if (this.field2194[var1] != -1) {
                class196 var2 = method3208(this.field2194[var1]);
                if (var2.field2201 != -1 || var2.field2161 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
