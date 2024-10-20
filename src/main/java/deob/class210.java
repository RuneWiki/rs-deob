package deob;

@ObfuscatedName("ir")
public class class210 extends class511 {

    @ObfuscatedName("ir.ap")
    public static boolean field2211 = false;

    @ObfuscatedName("ir.aj")
    public static class316 field2174 = new class316(4096);

    @ObfuscatedName("ir.ai")
    public static class316 field2175 = new class316(500);

    @ObfuscatedName("ir.ay")
    public static class316 field2176 = new class316(30);

    @ObfuscatedName("ir.as")
    public static class316 field2191 = new class316(30);

    @ObfuscatedName("ir.ae")
    public static class235[] field2183 = new class235[4];

    @ObfuscatedName("ir.am")
    public int field2179;

    @ObfuscatedName("ir.at")
    public int[] field2180;

    @ObfuscatedName("ir.au")
    public int[] field2212;

    @ObfuscatedName("ir.an")
    public String field2182 = class383.field4405;

    @ObfuscatedName("ir.ao")
    public short[] field2214;

    @ObfuscatedName("ir.af")
    public short[] field2184;

    @ObfuscatedName("ir.ar")
    public short[] field2220;

    @ObfuscatedName("ir.ab")
    public short[] field2186;

    @ObfuscatedName("ir.az")
    public int field2187 = 1;

    @ObfuscatedName("ir.ag")
    public int field2216 = 1;

    @ObfuscatedName("ir.ad")
    public int field2189 = 2;

    @ObfuscatedName("ir.ac")
    public boolean field2190 = true;

    @ObfuscatedName("ir.av")
    public int field2194 = -1;

    @ObfuscatedName("ir.ax")
    public int field2192 = -1;

    @ObfuscatedName("ir.aq")
    public boolean field2193 = false;

    @ObfuscatedName("ir.al")
    public boolean field2207 = false;

    @ObfuscatedName("ir.aa")
    public int field2204 = -1;

    @ObfuscatedName("ir.ah")
    public int field2196 = 16;

    @ObfuscatedName("ir.bh")
    public int field2197 = 0;

    @ObfuscatedName("ir.bj")
    public int field2198 = 0;

    @ObfuscatedName("ir.bv")
    public String[] field2199 = new String[5];

    @ObfuscatedName("ir.bx")
    public int field2200 = -1;

    @ObfuscatedName("ir.bk")
    public int field2201 = -1;

    @ObfuscatedName("ir.bb")
    public boolean field2202 = false;

    @ObfuscatedName("ir.bq")
    public boolean field2203 = true;

    @ObfuscatedName("ir.bp")
    public int field2173 = 128;

    @ObfuscatedName("ir.bz")
    public int field2205 = 128;

    @ObfuscatedName("ir.bc")
    public int field2188 = 128;

    @ObfuscatedName("ir.by")
    public int field2219 = 0;

    @ObfuscatedName("ir.br")
    public int field2208 = 0;

    @ObfuscatedName("ir.bn")
    public int field2209 = 0;

    @ObfuscatedName("ir.bu")
    public boolean field2210 = false;

    @ObfuscatedName("ir.bt")
    public boolean field2185 = false;

    @ObfuscatedName("ir.bs")
    public int field2195 = -1;

    @ObfuscatedName("ir.bm")
    public int[] field2178;

    @ObfuscatedName("ir.bo")
    public int field2206 = -1;

    @ObfuscatedName("ir.bd")
    public int field2215 = -1;

    @ObfuscatedName("ir.ba")
    public int field2177 = -1;

    @ObfuscatedName("ir.bw")
    public int field2217 = 0;

    @ObfuscatedName("ir.bi")
    public int field2218 = 0;

    @ObfuscatedName("ir.bf")
    public int field2213 = 0;

    @ObfuscatedName("ir.bg")
    public int field2181 = 0;

    @ObfuscatedName("ir.bl")
    public int[] field2221;

    @ObfuscatedName("ir.be")
    public boolean field2222 = true;

    @ObfuscatedName("ir.cq")
    public boolean field2223 = false;

    @ObfuscatedName("ir.cb")
    public class530 field2224;

    @ObfuscatedName("mw.ap(Lpe;Lpe;ZI)V")
    public static void method5969(class392 arg0, class392 arg1, boolean arg2) {
        Statics.field1804 = arg0;
        Statics.field1339 = arg1;
        field2211 = arg2;
    }

    @ObfuscatedName("ei.aw(II)Lir;")
    public static class210 method3109(int arg0) {
        class210 var1 = (class210) field2174.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1804.method7009(6, arg0);
        class210 var3 = new class210();
        var3.field2179 = arg0;
        if (var2 != null) {
            var3.method3949(new class558(var2));
        }
        var3.method3997();
        if (var3.field2185) {
            var3.field2189 = 0;
            var3.field2190 = false;
        }
        field2174.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ir.ak(I)V")
    public void method3997() {
        if (this.field2194 == -1) {
            this.field2194 = 0;
            if (this.field2180 != null && (this.field2212 == null || this.field2212[0] == 10)) {
                this.field2194 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2199[var1] != null) {
                    this.field2194 = 1;
                }
            }
        }
        if (this.field2195 == -1) {
            this.field2195 = this.field2189 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ir.aj(Lvl;S)V")
    public void method3949(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method3966(arg0, var2);
        }
    }

    @ObfuscatedName("ir.ai(Lvl;IB)V")
    public void method3966(class558 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method9258();
            if (var3 > 0) {
                if (this.field2180 == null || field2211) {
                    this.field2212 = new int[var3];
                    this.field2180 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2180[var4] = arg0.method9260();
                        this.field2212[var4] = arg0.method9258();
                    }
                } else {
                    arg0.field5462 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2182 = arg0.method9269();
        } else if (arg1 == 5) {
            int var5 = arg0.method9258();
            if (var5 > 0) {
                if (this.field2180 == null || field2211) {
                    this.field2212 = null;
                    this.field2180 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2180[var6] = arg0.method9260();
                    }
                } else {
                    arg0.field5462 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2187 = arg0.method9258();
        } else if (arg1 == 15) {
            this.field2216 = arg0.method9258();
        } else if (arg1 == 17) {
            this.field2189 = 0;
            this.field2190 = false;
        } else if (arg1 == 18) {
            this.field2190 = false;
        } else if (arg1 == 19) {
            this.field2194 = arg0.method9258();
        } else if (arg1 == 21) {
            this.field2192 = 0;
        } else if (arg1 == 22) {
            this.field2193 = true;
        } else if (arg1 == 23) {
            this.field2207 = true;
        } else if (arg1 == 24) {
            this.field2204 = arg0.method9260();
            if (this.field2204 == 65535) {
                this.field2204 = -1;
            }
        } else if (arg1 == 27) {
            this.field2189 = 1;
        } else if (arg1 == 28) {
            this.field2196 = arg0.method9258();
        } else if (arg1 == 29) {
            this.field2197 = arg0.method9259();
        } else if (arg1 == 39) {
            this.field2198 = arg0.method9259() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2199[arg1 - 30] = arg0.method9269();
            if (this.field2199[arg1 - 30].equalsIgnoreCase(class383.field4183)) {
                this.field2199[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method9258();
            this.field2214 = new short[var7];
            this.field2184 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2214[var8] = (short) arg0.method9260();
                this.field2184[var8] = (short) arg0.method9260();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method9258();
            this.field2220 = new short[var9];
            this.field2186 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2220[var10] = (short) arg0.method9260();
                this.field2186[var10] = (short) arg0.method9260();
            }
        } else if (arg1 == 61) {
            arg0.method9260();
        } else if (arg1 == 62) {
            this.field2202 = true;
        } else if (arg1 == 64) {
            this.field2203 = false;
        } else if (arg1 == 65) {
            this.field2173 = arg0.method9260();
        } else if (arg1 == 66) {
            this.field2205 = arg0.method9260();
        } else if (arg1 == 67) {
            this.field2188 = arg0.method9260();
        } else if (arg1 == 68) {
            this.field2201 = arg0.method9260();
        } else if (arg1 == 69) {
            arg0.method9258();
        } else if (arg1 == 70) {
            this.field2219 = arg0.method9261();
        } else if (arg1 == 71) {
            this.field2208 = arg0.method9261();
        } else if (arg1 == 72) {
            this.field2209 = arg0.method9261();
        } else if (arg1 == 73) {
            this.field2210 = true;
        } else if (arg1 == 74) {
            this.field2185 = true;
        } else if (arg1 == 75) {
            this.field2195 = arg0.method9258();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2206 = arg0.method9260();
            if (this.field2206 == 65535) {
                this.field2206 = -1;
            }
            this.field2215 = arg0.method9260();
            if (this.field2215 == 65535) {
                this.field2215 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method9260();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method9258();
            this.field2178 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2178[var15] = arg0.method9260();
                if (this.field2178[var15] == 65535) {
                    this.field2178[var15] = -1;
                }
            }
            this.field2178[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2177 = arg0.method9260();
            this.field2217 = arg0.method9258();
            this.field2218 = arg0.method9258();
        } else if (arg1 == 79) {
            this.field2213 = arg0.method9260();
            this.field2181 = arg0.method9260();
            this.field2217 = arg0.method9258();
            this.field2218 = arg0.method9258();
            int var11 = arg0.method9258();
            this.field2221 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2221[var12] = arg0.method9260();
            }
        } else if (arg1 == 81) {
            arg0.method9258();
        } else if (arg1 == 82) {
            this.field2200 = arg0.method9260();
        } else if (arg1 == 89) {
            this.field2222 = false;
        } else if (arg1 == 90) {
            this.field2223 = true;
        } else if (arg1 == 249) {
            this.field2224 = class188.method2372(arg0, this.field2224);
        }
    }

    @ObfuscatedName("ir.ay(II)Z")
    public final boolean method3956(int arg0) {
        if (this.field2212 != null) {
            for (int var4 = 0; var4 < this.field2212.length; var4++) {
                if (this.field2212[var4] == arg0) {
                    return Statics.field1339.method7023(this.field2180[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2180 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2180.length; var3++) {
                var2 &= Statics.field1339.method7023(this.field2180[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ir.as(B)Z")
    public final boolean method3961() {
        if (this.field2180 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2180.length; var2++) {
            var1 &= Statics.field1339.method7023(this.field2180[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ir.ae(II[[IIIII)Ljv;")
    public final class248 method3952(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2212 == null) {
            var7 = (long) ((this.field2179 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2179 << 10) + (arg0 << 3) + arg1);
        }
        class248 var9 = (class248) field2176.method5928(var7);
        if (var9 == null) {
            class235 var10 = this.method3955(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2193) {
                var10.field2502 = (short) (this.field2197 + 64);
                var10.field2518 = (short) (this.field2198 + 768);
                var10.method4397();
                var9 = var10;
            } else {
                var9 = var10.method4460(this.field2197 + 64, this.field2198 + 768, -50, -10, -50);
            }
            field2176.method5931(var9, var7);
        }
        if (this.field2193) {
            var9 = ((class235) var9).method4383();
        }
        if (this.field2192 >= 0) {
            if (var9 instanceof class256) {
                var9 = ((class256) var9).method4996(arg2, arg3, arg4, arg5, true, this.field2192);
            } else if (var9 instanceof class235) {
                var9 = ((class235) var9).method4384(arg2, arg3, arg4, arg5, true, this.field2192);
            }
        }
        return var9;
    }

    @ObfuscatedName("ir.am(II[[IIIIB)Ljy;")
    public final class256 method3953(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2212 == null) {
            var7 = (long) ((this.field2179 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2179 << 10) + (arg0 << 3) + arg1);
        }
        class256 var9 = (class256) field2191.method5928(var7);
        if (var9 == null) {
            class235 var10 = this.method3955(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4460(this.field2197 + 64, this.field2198 + 768, -50, -10, -50);
            field2191.method5931(var9, var7);
        }
        if (this.field2192 >= 0) {
            var9 = var9.method4996(arg2, arg3, arg4, arg5, true, this.field2192);
        }
        return var9;
    }

    @ObfuscatedName("ir.at(II[[IIIILiu;II)Ljy;")
    public final class256 method3986(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class213 arg6, int arg7) {
        long var9;
        if (this.field2212 == null) {
            var9 = (long) ((this.field2179 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2179 << 10) + (arg0 << 3) + arg1);
        }
        class256 var11 = (class256) field2191.method5928(var9);
        if (var11 == null) {
            class235 var12 = this.method3955(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4460(this.field2197 + 64, this.field2198 + 768, -50, -10, -50);
            field2191.method5931(var11, var9);
        }
        if (arg6 == null && this.field2192 == -1) {
            return var11;
        }
        class256 var13;
        if (arg6 == null) {
            var13 = var11.method4997(true);
        } else {
            var13 = arg6.method4109(var11, arg7, arg1);
        }
        if (this.field2192 >= 0) {
            var13 = var13.method4996(arg2, arg3, arg4, arg5, false, this.field2192);
        }
        return var13;
    }

    @ObfuscatedName("ir.au(IIB)Ljj;")
    public final class235 method3955(int arg0, int arg1) {
        class235 var3 = null;
        if (this.field2212 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2180 == null) {
                return null;
            }
            boolean var4 = this.field2202;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2180.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2180[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class235) field2175.method5928((long) var7);
                if (var3 == null) {
                    var3 = class235.method4408(Statics.field1339, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4419();
                    }
                    field2175.method5931(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2183[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class235(field2183, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2212.length; var9++) {
                if (this.field2212[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2180[var8];
            boolean var11 = this.field2202 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class235) field2175.method5928((long) var10);
            if (var3 == null) {
                var3 = class235.method4408(Statics.field1339, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4419();
                }
                field2175.method5931(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2173 == 128 && this.field2205 == 128 && this.field2188 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2219 == 0 && this.field2208 == 0 && this.field2209 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class235 var14 = new class235(var3, arg1 == 0 && !var12 && !var13, this.field2214 == null, this.field2220 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4391(256);
            var14.method4392(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4406();
        } else if (var15 == 2) {
            var14.method4453();
        } else if (var15 == 3) {
            var14.method4390();
        }
        if (this.field2214 != null) {
            for (int var16 = 0; var16 < this.field2214.length; var16++) {
                var14.method4393(this.field2214[var16], this.field2184[var16]);
            }
        }
        if (this.field2220 != null) {
            for (int var17 = 0; var17 < this.field2220.length; var17++) {
                var14.method4394(this.field2220[var17], this.field2186[var17]);
            }
        }
        if (var12) {
            var14.method4476(this.field2173, this.field2205, this.field2188);
        }
        if (var13) {
            var14.method4392(this.field2219, this.field2208, this.field2209);
        }
        return var14;
    }

    @ObfuscatedName("ir.an(B)Lir;")
    public final class210 method3968() {
        int var1 = -1;
        if (this.field2206 != -1) {
            var1 = class350.method2339(this.field2206);
        } else if (this.field2215 != -1) {
            var1 = class350.field3773[this.field2215];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2178.length - 1) {
            var2 = this.field2178[var1];
        } else {
            var2 = this.field2178[this.field2178.length - 1];
        }
        return var2 == -1 ? null : method3109(var2);
    }

    @ObfuscatedName("ir.ao(III)I")
    public int method3957(int arg0, int arg1) {
        return class188.method3588(this.field2224, arg0, arg1);
    }

    @ObfuscatedName("ir.af(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3958(int arg0, String arg1) {
        return class188.method5808(this.field2224, arg0, arg1);
    }

    @ObfuscatedName("dh.ar(I)V")
    public static void method2381() {
        field2174.method5930();
        field2175.method5930();
        field2176.method5930();
        field2191.method5930();
    }

    @ObfuscatedName("ir.ab(I)Z")
    public boolean method3959() {
        if (this.field2178 == null) {
            return this.field2177 != -1 || this.field2221 != null;
        }
        for (int var1 = 0; var1 < this.field2178.length; var1++) {
            if (this.field2178[var1] != -1) {
                class210 var2 = method3109(this.field2178[var1]);
                if (var2.field2177 != -1 || var2.field2221 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
