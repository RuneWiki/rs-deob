package deob;

@ObfuscatedName("gp")
public class class200 extends class435 {

    @ObfuscatedName("gp.f")
    public static boolean field2166 = false;

    @ObfuscatedName("gp.s")
    public static class273 field2156 = new class273(4096);

    @ObfuscatedName("gp.z")
    public static class273 field2157 = new class273(500);

    @ObfuscatedName("gp.j")
    public static class273 field2158 = new class273(30);

    @ObfuscatedName("gp.i")
    public static class273 field2159 = new class273(30);

    @ObfuscatedName("gp.n")
    public static class212[] field2153 = new class212[4];

    @ObfuscatedName("gp.l")
    public int field2195;

    @ObfuscatedName("gp.k")
    public int[] field2171;

    @ObfuscatedName("gp.c")
    public int[] field2198;

    @ObfuscatedName("gp.r")
    public String field2154 = class330.field3846;

    @ObfuscatedName("gp.b")
    public short[] field2165;

    @ObfuscatedName("gp.m")
    public short[] field2201;

    @ObfuscatedName("gp.t")
    public short[] field2167;

    @ObfuscatedName("gp.h")
    public short[] field2168;

    @ObfuscatedName("gp.p")
    public int field2181 = 1;

    @ObfuscatedName("gp.o")
    public int field2182 = 1;

    @ObfuscatedName("gp.u")
    public int field2204 = 2;

    @ObfuscatedName("gp.x")
    public boolean field2172 = true;

    @ObfuscatedName("gp.a")
    public int field2173 = -1;

    @ObfuscatedName("gp.q")
    public int field2174 = -1;

    @ObfuscatedName("gp.d")
    public boolean field2175 = false;

    @ObfuscatedName("gp.e")
    public boolean field2176 = false;

    @ObfuscatedName("gp.g")
    public int field2177 = -1;

    @ObfuscatedName("gp.y")
    public int field2178 = 16;

    @ObfuscatedName("gp.af")
    public int field2179 = 0;

    @ObfuscatedName("gp.aa")
    public int field2187 = 0;

    @ObfuscatedName("gp.ai")
    public String[] field2183 = new String[5];

    @ObfuscatedName("gp.ag")
    public int field2170 = -1;

    @ObfuscatedName("gp.aw")
    public int field2184 = -1;

    @ObfuscatedName("gp.ar")
    public boolean field2169 = false;

    @ObfuscatedName("gp.al")
    public boolean field2162 = true;

    @ObfuscatedName("gp.at")
    public int field2186 = 128;

    @ObfuscatedName("gp.aj")
    public int field2185 = 128;

    @ObfuscatedName("gp.ax")
    public int field2188 = 128;

    @ObfuscatedName("gp.az")
    public int field2189 = 0;

    @ObfuscatedName("gp.ap")
    public int field2190 = 0;

    @ObfuscatedName("gp.ay")
    public int field2191 = 0;

    @ObfuscatedName("gp.ac")
    public boolean field2192 = false;

    @ObfuscatedName("gp.av")
    public boolean field2193 = false;

    @ObfuscatedName("gp.aq")
    public int field2194 = -1;

    @ObfuscatedName("gp.ak")
    public int[] field2180;

    @ObfuscatedName("gp.au")
    public int field2196 = -1;

    @ObfuscatedName("gp.ae")
    public int field2163 = -1;

    @ObfuscatedName("gp.ah")
    public int field2164 = -1;

    @ObfuscatedName("gp.ad")
    public int field2199 = 0;

    @ObfuscatedName("gp.ab")
    public int field2200 = 0;

    @ObfuscatedName("gp.an")
    public int field2161 = 0;

    @ObfuscatedName("gp.am")
    public int[] field2202;

    @ObfuscatedName("gp.as")
    public boolean field2203 = true;

    @ObfuscatedName("gp.ao")
    public class450 field2160;

    @ObfuscatedName("qn.f(IS)Lgp;")
    public static class200 method7839(int arg0) {
        class200 var1 = (class200) field2156.method5028((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2197.method5990(6, arg0);
        class200 var3 = new class200();
        var3.field2195 = arg0;
        if (var2 != null) {
            var3.method3631(new class474(var2));
        }
        var3.method3603();
        if (var3.field2193) {
            var3.field2204 = 0;
            var3.field2172 = false;
        }
        field2156.method5027(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gp.w(I)V")
    public void method3603() {
        if (this.field2173 == -1) {
            this.field2173 = 0;
            if (this.field2171 != null && (this.field2198 == null || this.field2198[0] == 10)) {
                this.field2173 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2183[var1] != null) {
                    this.field2173 = 1;
                }
            }
        }
        if (this.field2194 == -1) {
            this.field2194 = this.field2204 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("gp.v(Lrd;B)V")
    public void method3631(class474 arg0) {
        while (true) {
            int var2 = arg0.method7964();
            if (var2 == 0) {
                return;
            }
            this.method3605(arg0, var2);
        }
    }

    @ObfuscatedName("gp.s(Lrd;II)V")
    public void method3605(class474 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7964();
            if (var3 > 0) {
                if (this.field2171 == null || field2166) {
                    this.field2198 = new int[var3];
                    this.field2171 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2171[var4] = arg0.method8032();
                        this.field2198[var4] = arg0.method7964();
                    }
                } else {
                    arg0.field4939 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2154 = arg0.method7983();
        } else if (arg1 == 5) {
            int var5 = arg0.method7964();
            if (var5 > 0) {
                if (this.field2171 == null || field2166) {
                    this.field2198 = null;
                    this.field2171 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2171[var6] = arg0.method8032();
                    }
                } else {
                    arg0.field4939 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2181 = arg0.method7964();
        } else if (arg1 == 15) {
            this.field2182 = arg0.method7964();
        } else if (arg1 == 17) {
            this.field2204 = 0;
            this.field2172 = false;
        } else if (arg1 == 18) {
            this.field2172 = false;
        } else if (arg1 == 19) {
            this.field2173 = arg0.method7964();
        } else if (arg1 == 21) {
            this.field2174 = 0;
        } else if (arg1 == 22) {
            this.field2175 = true;
        } else if (arg1 == 23) {
            this.field2176 = true;
        } else if (arg1 == 24) {
            this.field2177 = arg0.method8032();
            if (this.field2177 == 65535) {
                this.field2177 = -1;
            }
        } else if (arg1 == 27) {
            this.field2204 = 1;
        } else if (arg1 == 28) {
            this.field2178 = arg0.method7964();
        } else if (arg1 == 29) {
            this.field2179 = arg0.method7965();
        } else if (arg1 == 39) {
            this.field2187 = arg0.method7965() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2183[arg1 - 30] = arg0.method7983();
            if (this.field2183[arg1 - 30].equalsIgnoreCase(class330.field3841)) {
                this.field2183[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method7964();
            this.field2165 = new short[var7];
            this.field2201 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2165[var8] = (short) arg0.method8032();
                this.field2201[var8] = (short) arg0.method8032();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method7964();
            this.field2167 = new short[var9];
            this.field2168 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2167[var10] = (short) arg0.method8032();
                this.field2168[var10] = (short) arg0.method8032();
            }
        } else if (arg1 == 61) {
            arg0.method8032();
        } else if (arg1 == 62) {
            this.field2169 = true;
        } else if (arg1 == 64) {
            this.field2162 = false;
        } else if (arg1 == 65) {
            this.field2186 = arg0.method8032();
        } else if (arg1 == 66) {
            this.field2185 = arg0.method8032();
        } else if (arg1 == 67) {
            this.field2188 = arg0.method8032();
        } else if (arg1 == 68) {
            this.field2184 = arg0.method8032();
        } else if (arg1 == 69) {
            arg0.method7964();
        } else if (arg1 == 70) {
            this.field2189 = arg0.method7967();
        } else if (arg1 == 71) {
            this.field2190 = arg0.method7967();
        } else if (arg1 == 72) {
            this.field2191 = arg0.method7967();
        } else if (arg1 == 73) {
            this.field2192 = true;
        } else if (arg1 == 74) {
            this.field2193 = true;
        } else if (arg1 == 75) {
            this.field2194 = arg0.method7964();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2196 = arg0.method8032();
            if (this.field2196 == 65535) {
                this.field2196 = -1;
            }
            this.field2163 = arg0.method8032();
            if (this.field2163 == 65535) {
                this.field2163 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8032();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method7964();
            this.field2180 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2180[var15] = arg0.method8032();
                if (this.field2180[var15] == 65535) {
                    this.field2180[var15] = -1;
                }
            }
            this.field2180[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2164 = arg0.method8032();
            this.field2199 = arg0.method7964();
        } else if (arg1 == 79) {
            this.field2200 = arg0.method8032();
            this.field2161 = arg0.method8032();
            this.field2199 = arg0.method7964();
            int var11 = arg0.method7964();
            this.field2202 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2202[var12] = arg0.method8032();
            }
        } else if (arg1 == 81) {
            this.field2174 = arg0.method7964() * 256;
        } else if (arg1 == 82) {
            this.field2170 = arg0.method8032();
        } else if (arg1 == 89) {
            this.field2203 = false;
        } else if (arg1 == 249) {
            this.field2160 = class187.method2938(arg0, this.field2160);
        }
    }

    @ObfuscatedName("gp.z(II)Z")
    public final boolean method3606(int arg0) {
        if (this.field2198 != null) {
            for (int var4 = 0; var4 < this.field2198.length; var4++) {
                if (this.field2198[var4] == arg0) {
                    return Statics.field2155.method5983(this.field2171[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2171 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2171.length; var3++) {
                var2 &= Statics.field2155.method5983(this.field2171[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("gp.j(I)Z")
    public final boolean method3624() {
        if (this.field2171 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2171.length; var2++) {
            var1 &= Statics.field2155.method5983(this.field2171[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("gp.i(II[[IIIII)Lhd;")
    public final class222 method3608(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2198 == null) {
            var7 = (long) ((this.field2195 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2195 << 10) + (arg0 << 3) + arg1);
        }
        class222 var9 = (class222) field2158.method5028(var7);
        if (var9 == null) {
            class212 var10 = this.method3611(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2175) {
                var10.field2394 = (short) (this.field2179 + 64);
                var10.field2408 = (short) (this.field2187 + 768);
                var10.method3965();
                var9 = var10;
            } else {
                var9 = var10.method3888(this.field2179 + 64, this.field2187 + 768, -50, -10, -50);
            }
            field2158.method5027(var9, var7);
        }
        if (this.field2175) {
            var9 = ((class212) var9).method3941();
        }
        if (this.field2174 >= 0) {
            if (var9 instanceof class228) {
                var9 = ((class228) var9).method4333(arg2, arg3, arg4, arg5, true, this.field2174);
            } else if (var9 instanceof class212) {
                var9 = ((class212) var9).method3895(arg2, arg3, arg4, arg5, true, this.field2174);
            }
        }
        return var9;
    }

    @ObfuscatedName("gp.n(II[[IIIII)Lhs;")
    public final class228 method3609(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2198 == null) {
            var7 = (long) ((this.field2195 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2195 << 10) + (arg0 << 3) + arg1);
        }
        class228 var9 = (class228) field2159.method5028(var7);
        if (var9 == null) {
            class212 var10 = this.method3611(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3888(this.field2179 + 64, this.field2187 + 768, -50, -10, -50);
            field2159.method5027(var9, var7);
        }
        if (this.field2174 >= 0) {
            var9 = var9.method4333(arg2, arg3, arg4, arg5, true, this.field2174);
        }
        return var9;
    }

    @ObfuscatedName("gp.l(II[[IIIILge;II)Lhs;")
    public final class228 method3610(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class203 arg6, int arg7) {
        long var9;
        if (this.field2198 == null) {
            var9 = (long) ((this.field2195 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2195 << 10) + (arg0 << 3) + arg1);
        }
        class228 var11 = (class228) field2159.method5028(var9);
        if (var11 == null) {
            class212 var12 = this.method3611(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3888(this.field2179 + 64, this.field2187 + 768, -50, -10, -50);
            field2159.method5027(var11, var9);
        }
        if (arg6 == null && this.field2174 == -1) {
            return var11;
        }
        class228 var13;
        if (arg6 == null) {
            var13 = var11.method4404(true);
        } else {
            var13 = arg6.method3748(var11, arg7, arg1);
        }
        if (this.field2174 >= 0) {
            var13 = var13.method4333(arg2, arg3, arg4, arg5, false, this.field2174);
        }
        return var13;
    }

    @ObfuscatedName("gp.k(IIB)Lhe;")
    public final class212 method3611(int arg0, int arg1) {
        class212 var3 = null;
        if (this.field2198 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2171 == null) {
                return null;
            }
            boolean var4 = this.field2169;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2171.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2171[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class212) field2157.method5028((long) var7);
                if (var3 == null) {
                    var3 = class212.method3915(Statics.field2155, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3962();
                    }
                    field2157.method5027(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2153[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class212(field2153, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2198.length; var9++) {
                if (this.field2198[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2171[var8];
            boolean var11 = this.field2169 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class212) field2157.method5028((long) var10);
            if (var3 == null) {
                var3 = class212.method3915(Statics.field2155, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3962();
                }
                field2157.method5027(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2186 == 128 && this.field2185 == 128 && this.field2188 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2189 == 0 && this.field2190 == 0 && this.field2191 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class212 var14 = new class212(var3, arg1 == 0 && !var12 && !var13, this.field2165 == null, this.field2167 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3900(256);
            var14.method3901(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3937();
        } else if (var15 == 2) {
            var14.method3898();
        } else if (var15 == 3) {
            var14.method3899();
        }
        if (this.field2165 != null) {
            for (int var16 = 0; var16 < this.field2165.length; var16++) {
                var14.method3902(this.field2165[var16], this.field2201[var16]);
            }
        }
        if (this.field2167 != null) {
            for (int var17 = 0; var17 < this.field2167.length; var17++) {
                var14.method3943(this.field2167[var17], this.field2168[var17]);
            }
        }
        if (var12) {
            var14.method3905(this.field2186, this.field2185, this.field2188);
        }
        if (var13) {
            var14.method3901(this.field2189, this.field2190, this.field2191);
        }
        return var14;
    }

    @ObfuscatedName("gp.c(I)Lgp;")
    public final class200 method3612() {
        int var1 = -1;
        if (this.field2196 != -1) {
            var1 = class300.method2093(this.field2196);
        } else if (this.field2163 != -1) {
            var1 = class300.field3459[this.field2163];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2180.length - 1) {
            var2 = this.field2180[var1];
        } else {
            var2 = this.field2180[this.field2180.length - 1];
        }
        return var2 == -1 ? null : method7839(var2);
    }

    @ObfuscatedName("gp.r(IIS)I")
    public int method3613(int arg0, int arg1) {
        class450 var3 = this.field2160;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class439 var5 = (class439) var3.method7691((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4708;
            }
        }
        return var4;
    }

    @ObfuscatedName("gp.b(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3614(int arg0, String arg1) {
        return class187.method3012(this.field2160, arg0, arg1);
    }

    @ObfuscatedName("gp.m(I)Z")
    public boolean method3615() {
        if (this.field2180 == null) {
            return this.field2164 != -1 || this.field2202 != null;
        }
        for (int var1 = 0; var1 < this.field2180.length; var1++) {
            if (this.field2180[var1] != -1) {
                class200 var2 = method7839(this.field2180[var1]);
                if (var2.field2164 != -1 || var2.field2202 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
