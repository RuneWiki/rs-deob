package deob;

@ObfuscatedName("hv")
public class class206 extends class469 {

    @ObfuscatedName("hv.au")
    public static boolean field2220 = false;

    @ObfuscatedName("hv.at")
    public static class288 field2173 = new class288(4096);

    @ObfuscatedName("hv.ac")
    public static class288 field2200 = new class288(500);

    @ObfuscatedName("hv.ai")
    public static class288 field2176 = new class288(30);

    @ObfuscatedName("hv.az")
    public static class288 field2194 = new class288(30);

    @ObfuscatedName("hv.ap")
    public static class222[] field2199 = new class222[4];

    @ObfuscatedName("hv.aa")
    public int field2178;

    @ObfuscatedName("hv.af")
    public int[] field2179;

    @ObfuscatedName("hv.ad")
    public int[] field2180;

    @ObfuscatedName("hv.aq")
    public String field2181 = class352.field4223;

    @ObfuscatedName("hv.al")
    public short[] field2182;

    @ObfuscatedName("hv.an")
    public short[] field2193;

    @ObfuscatedName("hv.ar")
    public short[] field2184;

    @ObfuscatedName("hv.ab")
    public short[] field2185;

    @ObfuscatedName("hv.ag")
    public int field2186 = 1;

    @ObfuscatedName("hv.am")
    public int field2171 = 1;

    @ObfuscatedName("hv.ax")
    public int field2188 = 2;

    @ObfuscatedName("hv.ah")
    public boolean field2189 = true;

    @ObfuscatedName("hv.as")
    public int field2195 = -1;

    @ObfuscatedName("hv.ay")
    public int field2191 = -1;

    @ObfuscatedName("hv.aj")
    public boolean field2177 = false;

    @ObfuscatedName("hv.av")
    public boolean field2197 = false;

    @ObfuscatedName("hv.aw")
    public int field2198 = -1;

    @ObfuscatedName("hv.ak")
    public int field2192 = 16;

    @ObfuscatedName("hv.bh")
    public int field2196 = 0;

    @ObfuscatedName("hv.bj")
    public int field2170 = 0;

    @ObfuscatedName("hv.bk")
    public String[] field2190 = new String[5];

    @ObfuscatedName("hv.bv")
    public int field2205 = -1;

    @ObfuscatedName("hv.bt")
    public int field2204 = -1;

    @ObfuscatedName("hv.bd")
    public boolean field2201 = false;

    @ObfuscatedName("hv.by")
    public boolean field2202 = true;

    @ObfuscatedName("hv.bs")
    public int field2187 = 128;

    @ObfuscatedName("hv.bm")
    public int field2183 = 128;

    @ObfuscatedName("hv.bf")
    public int field2219 = 128;

    @ObfuscatedName("hv.bq")
    public int field2206 = 0;

    @ObfuscatedName("hv.ba")
    public int field2207 = 0;

    @ObfuscatedName("hv.bl")
    public int field2208 = 0;

    @ObfuscatedName("hv.bp")
    public boolean field2175 = false;

    @ObfuscatedName("hv.bu")
    public boolean field2210 = false;

    @ObfuscatedName("hv.bo")
    public int field2211 = -1;

    @ObfuscatedName("hv.bb")
    public int[] field2212;

    @ObfuscatedName("hv.br")
    public int field2213 = -1;

    @ObfuscatedName("hv.be")
    public int field2214 = -1;

    @ObfuscatedName("hv.bi")
    public int field2215 = -1;

    @ObfuscatedName("hv.bz")
    public int field2216 = 0;

    @ObfuscatedName("hv.bx")
    public int field2217 = 0;

    @ObfuscatedName("hv.bn")
    public int field2218 = 0;

    @ObfuscatedName("hv.bw")
    public int[] field2209;

    @ObfuscatedName("hv.bc")
    public boolean field2203 = true;

    @ObfuscatedName("hv.bg")
    public class488 field2221;

    @ObfuscatedName("hd.au(IB)Lhv;")
    public static class206 method3321(int arg0) {
        class206 var1 = (class206) field2173.method5182((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2174.method6128(6, arg0);
        class206 var3 = new class206();
        var3.field2178 = arg0;
        if (var2 != null) {
            var3.method3620(new class515(var2));
        }
        var3.method3603();
        if (var3.field2210) {
            var3.field2188 = 0;
            var3.field2189 = false;
        }
        field2173.method5177(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hv.ae(I)V")
    public void method3603() {
        if (this.field2195 == -1) {
            this.field2195 = 0;
            if (this.field2179 != null && (this.field2180 == null || this.field2180[0] == 10)) {
                this.field2195 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2190[var1] != null) {
                    this.field2195 = 1;
                }
            }
        }
        if (this.field2211 == -1) {
            this.field2211 = this.field2188 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("hv.ao(Ltm;I)V")
    public void method3620(class515 arg0) {
        while (true) {
            int var2 = arg0.method8300();
            if (var2 == 0) {
                return;
            }
            this.method3604(arg0, var2);
        }
    }

    @ObfuscatedName("hv.at(Ltm;IB)V")
    public void method3604(class515 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8300();
            if (var3 > 0) {
                if (this.field2179 == null || field2220) {
                    this.field2180 = new int[var3];
                    this.field2179 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2179[var4] = arg0.method8448();
                        this.field2180[var4] = arg0.method8300();
                    }
                } else {
                    arg0.field5111 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2181 = arg0.method8311();
        } else if (arg1 == 5) {
            int var5 = arg0.method8300();
            if (var5 > 0) {
                if (this.field2179 == null || field2220) {
                    this.field2180 = null;
                    this.field2179 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2179[var6] = arg0.method8448();
                    }
                } else {
                    arg0.field5111 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2186 = arg0.method8300();
        } else if (arg1 == 15) {
            this.field2171 = arg0.method8300();
        } else if (arg1 == 17) {
            this.field2188 = 0;
            this.field2189 = false;
        } else if (arg1 == 18) {
            this.field2189 = false;
        } else if (arg1 == 19) {
            this.field2195 = arg0.method8300();
        } else if (arg1 == 21) {
            this.field2191 = 0;
        } else if (arg1 == 22) {
            this.field2177 = true;
        } else if (arg1 == 23) {
            this.field2197 = true;
        } else if (arg1 == 24) {
            this.field2198 = arg0.method8448();
            if (this.field2198 == 65535) {
                this.field2198 = -1;
            }
        } else if (arg1 == 27) {
            this.field2188 = 1;
        } else if (arg1 == 28) {
            this.field2192 = arg0.method8300();
        } else if (arg1 == 29) {
            this.field2196 = arg0.method8301();
        } else if (arg1 == 39) {
            this.field2170 = arg0.method8301() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2190[arg1 - 30] = arg0.method8311();
            if (this.field2190[arg1 - 30].equalsIgnoreCase(class352.field4165)) {
                this.field2190[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8300();
            this.field2182 = new short[var7];
            this.field2193 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2182[var8] = (short) arg0.method8448();
                this.field2193[var8] = (short) arg0.method8448();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8300();
            this.field2184 = new short[var9];
            this.field2185 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2184[var10] = (short) arg0.method8448();
                this.field2185[var10] = (short) arg0.method8448();
            }
        } else if (arg1 == 61) {
            arg0.method8448();
        } else if (arg1 == 62) {
            this.field2201 = true;
        } else if (arg1 == 64) {
            this.field2202 = false;
        } else if (arg1 == 65) {
            this.field2187 = arg0.method8448();
        } else if (arg1 == 66) {
            this.field2183 = arg0.method8448();
        } else if (arg1 == 67) {
            this.field2219 = arg0.method8448();
        } else if (arg1 == 68) {
            this.field2204 = arg0.method8448();
        } else if (arg1 == 69) {
            arg0.method8300();
        } else if (arg1 == 70) {
            this.field2206 = arg0.method8303();
        } else if (arg1 == 71) {
            this.field2207 = arg0.method8303();
        } else if (arg1 == 72) {
            this.field2208 = arg0.method8303();
        } else if (arg1 == 73) {
            this.field2175 = true;
        } else if (arg1 == 74) {
            this.field2210 = true;
        } else if (arg1 == 75) {
            this.field2211 = arg0.method8300();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2213 = arg0.method8448();
            if (this.field2213 == 65535) {
                this.field2213 = -1;
            }
            this.field2214 = arg0.method8448();
            if (this.field2214 == 65535) {
                this.field2214 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8448();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8300();
            this.field2212 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2212[var15] = arg0.method8448();
                if (this.field2212[var15] == 65535) {
                    this.field2212[var15] = -1;
                }
            }
            this.field2212[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2215 = arg0.method8448();
            this.field2216 = arg0.method8300();
        } else if (arg1 == 79) {
            this.field2217 = arg0.method8448();
            this.field2218 = arg0.method8448();
            this.field2216 = arg0.method8300();
            int var11 = arg0.method8300();
            this.field2209 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2209[var12] = arg0.method8448();
            }
        } else if (arg1 == 81) {
            this.field2191 = arg0.method8300() * 256;
        } else if (arg1 == 82) {
            this.field2205 = arg0.method8448();
        } else if (arg1 == 89) {
            this.field2203 = false;
        } else if (arg1 == 249) {
            this.field2221 = class192.method1074(arg0, this.field2221);
        }
    }

    @ObfuscatedName("hv.ac(II)Z")
    public final boolean method3605(int arg0) {
        if (this.field2180 != null) {
            for (int var4 = 0; var4 < this.field2180.length; var4++) {
                if (this.field2180[var4] == arg0) {
                    return Statics.field2172.method6130(this.field2179[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2179 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2179.length; var3++) {
                var2 &= Statics.field2172.method6130(this.field2179[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hv.ai(I)Z")
    public final boolean method3606() {
        if (this.field2179 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2179.length; var2++) {
            var1 &= Statics.field2172.method6130(this.field2179[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("hv.az(II[[IIIII)Lik;")
    public final class233 method3607(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2180 == null) {
            var7 = (long) ((this.field2178 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2178 << 10) + (arg0 << 3) + arg1);
        }
        class233 var9 = (class233) field2176.method5182(var7);
        if (var9 == null) {
            class222 var10 = this.method3630(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2177) {
                var10.field2473 = (short) (this.field2196 + 64);
                var10.field2462 = (short) (this.field2170 + 768);
                var10.method3961();
                var9 = var10;
            } else {
                var9 = var10.method3965(this.field2196 + 64, this.field2170 + 768, -50, -10, -50);
            }
            field2176.method5177(var9, var7);
        }
        if (this.field2177) {
            var9 = ((class222) var9).method3949();
        }
        if (this.field2191 >= 0) {
            if (var9 instanceof class240) {
                var9 = ((class240) var9).method4445(arg2, arg3, arg4, arg5, true, this.field2191);
            } else if (var9 instanceof class222) {
                var9 = ((class222) var9).method3950(arg2, arg3, arg4, arg5, true, this.field2191);
            }
        }
        return var9;
    }

    @ObfuscatedName("hv.ap(II[[IIIII)Ljr;")
    public final class240 method3609(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2180 == null) {
            var7 = (long) ((this.field2178 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2178 << 10) + (arg0 << 3) + arg1);
        }
        class240 var9 = (class240) field2194.method5182(var7);
        if (var9 == null) {
            class222 var10 = this.method3630(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3965(this.field2196 + 64, this.field2170 + 768, -50, -10, -50);
            field2194.method5177(var9, var7);
        }
        if (this.field2191 >= 0) {
            var9 = var9.method4445(arg2, arg3, arg4, arg5, true, this.field2191);
        }
        return var9;
    }

    @ObfuscatedName("hv.aa(II[[IIIILib;II)Ljr;")
    public final class240 method3608(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class209 arg6, int arg7) {
        long var9;
        if (this.field2180 == null) {
            var9 = (long) ((this.field2178 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2178 << 10) + (arg0 << 3) + arg1);
        }
        class240 var11 = (class240) field2194.method5182(var9);
        if (var11 == null) {
            class222 var12 = this.method3630(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3965(this.field2196 + 64, this.field2170 + 768, -50, -10, -50);
            field2194.method5177(var11, var9);
        }
        if (arg6 == null && this.field2191 == -1) {
            return var11;
        }
        class240 var13;
        if (arg6 == null) {
            var13 = var11.method4446(true);
        } else {
            var13 = arg6.method3739(var11, arg7, arg1);
        }
        if (this.field2191 >= 0) {
            var13 = var13.method4445(arg2, arg3, arg4, arg5, false, this.field2191);
        }
        return var13;
    }

    @ObfuscatedName("hv.af(IIB)Lic;")
    public final class222 method3630(int arg0, int arg1) {
        class222 var3 = null;
        if (this.field2180 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2179 == null) {
                return null;
            }
            boolean var4 = this.field2201;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2179.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2179[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class222) field2200.method5182((long) var7);
                if (var3 == null) {
                    var3 = class222.method4002(Statics.field2172, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3957();
                    }
                    field2200.method5177(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2199[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class222(field2199, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2180.length; var9++) {
                if (this.field2180[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2179[var8];
            boolean var11 = this.field2201 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class222) field2200.method5182((long) var10);
            if (var3 == null) {
                var3 = class222.method4002(Statics.field2172, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3957();
                }
                field2200.method5177(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2187 == 128 && this.field2183 == 128 && this.field2219 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2206 == 0 && this.field2207 == 0 && this.field2208 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class222 var14 = new class222(var3, arg1 == 0 && !var12 && !var13, this.field2182 == null, this.field2184 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3955(256);
            var14.method3956(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3952();
        } else if (var15 == 2) {
            var14.method3953();
        } else if (var15 == 3) {
            var14.method3954();
        }
        if (this.field2182 != null) {
            for (int var16 = 0; var16 < this.field2182.length; var16++) {
                var14.method3996(this.field2182[var16], this.field2193[var16]);
            }
        }
        if (this.field2184 != null) {
            for (int var17 = 0; var17 < this.field2184.length; var17++) {
                var14.method3958(this.field2184[var17], this.field2185[var17]);
            }
        }
        if (var12) {
            var14.method3960(this.field2187, this.field2183, this.field2219);
        }
        if (var13) {
            var14.method3956(this.field2206, this.field2207, this.field2208);
        }
        return var14;
    }

    @ObfuscatedName("hv.ad(I)Lhv;")
    public final class206 method3610() {
        int var1 = -1;
        if (this.field2213 != -1) {
            var1 = class322.method2448(this.field2213);
        } else if (this.field2214 != -1) {
            var1 = class322.field3540[this.field2214];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2212.length - 1) {
            var2 = this.field2212[var1];
        } else {
            var2 = this.field2212[this.field2212.length - 1];
        }
        return var2 == -1 ? null : method3321(var2);
    }

    @ObfuscatedName("hv.aq(III)I")
    public int method3611(int arg0, int arg1) {
        return class192.method157(this.field2221, arg0, arg1);
    }

    @ObfuscatedName("hv.al(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3612(int arg0, String arg1) {
        class488 var3 = this.field2221;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class470 var5 = (class470) var3.method8008((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4810;
            }
        }
        return var4;
    }

    @ObfuscatedName("hv.ar(I)Z")
    public boolean method3639() {
        if (this.field2212 == null) {
            return this.field2215 != -1 || this.field2209 != null;
        }
        for (int var1 = 0; var1 < this.field2212.length; var1++) {
            if (this.field2212[var1] != -1) {
                class206 var2 = method3321(this.field2212[var1]);
                if (var2.field2215 != -1 || var2.field2209 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
