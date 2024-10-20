package deob;

@ObfuscatedName("hb")
public class class205 extends class488 {

    @ObfuscatedName("hb.au")
    public static class304 field2206 = new class304(64);

    @ObfuscatedName("hb.ak")
    public static class304 field2183 = new class304(50);

    @ObfuscatedName("hb.ah")
    public static class304 field2180 = new class304(200);

    @ObfuscatedName("hb.af")
    public int field2181;

    @ObfuscatedName("hb.ax")
    public int field2182;

    @ObfuscatedName("hb.an")
    public String field2210 = class370.field4015;

    @ObfuscatedName("hb.ag")
    public short[] field2184;

    @ObfuscatedName("hb.am")
    public short[] field2223;

    @ObfuscatedName("hb.ad")
    public short[] field2186;

    @ObfuscatedName("hb.at")
    public short[] field2179;

    @ObfuscatedName("hb.ay")
    public int field2188 = 2000;

    @ObfuscatedName("hb.ae")
    public int field2189 = 0;

    @ObfuscatedName("hb.ac")
    public int field2190 = 0;

    @ObfuscatedName("hb.ab")
    public int field2213 = 0;

    @ObfuscatedName("hb.av")
    public int field2201 = 0;

    @ObfuscatedName("hb.ap")
    public int field2193 = 0;

    @ObfuscatedName("hb.bd")
    public int field2194 = 0;

    @ObfuscatedName("hb.bi")
    public int field2195 = 1;

    @ObfuscatedName("hb.bq")
    public int field2197 = -1;

    @ObfuscatedName("hb.ba")
    public int field2202 = -1;

    @ObfuscatedName("hb.bt")
    public int field2219 = -1;

    @ObfuscatedName("hb.bk")
    public boolean field2199 = false;

    @ObfuscatedName("hb.bm")
    public String[] field2200 = new String[] { null, null, class370.field4008, null, null };

    @ObfuscatedName("hb.bw")
    public String[] field2204 = new String[] { null, null, null, null, class370.field4009 };

    @ObfuscatedName("hb.by")
    public int field2192 = -2;

    @ObfuscatedName("hb.bb")
    public int field2203 = -1;

    @ObfuscatedName("hb.bn")
    public int field2174 = -1;

    @ObfuscatedName("hb.br")
    public int field2205 = 0;

    @ObfuscatedName("hb.bp")
    public int field2212 = -1;

    @ObfuscatedName("hb.bf")
    public int field2207 = -1;

    @ObfuscatedName("hb.bg")
    public int field2208 = 0;

    @ObfuscatedName("hb.be")
    public int field2209 = -1;

    @ObfuscatedName("hb.bc")
    public int field2233 = -1;

    @ObfuscatedName("hb.bz")
    public int field2171 = -1;

    @ObfuscatedName("hb.bh")
    public int field2215 = -1;

    @ObfuscatedName("hb.bs")
    public int field2185 = -1;

    @ObfuscatedName("hb.bj")
    public int field2214 = -1;

    @ObfuscatedName("hb.bl")
    public int[] field2187;

    @ObfuscatedName("hb.bx")
    public int[] field2216;

    @ObfuscatedName("hb.cs")
    public int field2217 = -1;

    @ObfuscatedName("hb.ch")
    public int field2218 = -1;

    @ObfuscatedName("hb.co")
    public int field2173 = 128;

    @ObfuscatedName("hb.cd")
    public int field2220 = 128;

    @ObfuscatedName("hb.cg")
    public int field2221 = 128;

    @ObfuscatedName("hb.cn")
    public int field2222 = 0;

    @ObfuscatedName("hb.cz")
    public int field2225 = 0;

    @ObfuscatedName("hb.ci")
    public int field2224 = 0;

    @ObfuscatedName("hb.cl")
    public int field2211 = 0;

    @ObfuscatedName("hb.cm")
    public class507 field2198;

    @ObfuscatedName("hb.cx")
    public boolean field2227 = false;

    @ObfuscatedName("hb.cw")
    public int field2228 = -1;

    @ObfuscatedName("hb.cy")
    public int field2229 = -1;

    @ObfuscatedName("hb.cu")
    public int field2230 = -1;

    @ObfuscatedName("hb.ce")
    public int field2196 = -1;

    @ObfuscatedName("or.aq(IB)Lhb;")
    public static class205 method6353(int arg0) {
        class205 var1 = (class205) field2206.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2175.method6489(10, arg0);
        class205 var3 = new class205();
        var3.field2181 = arg0;
        if (var2 != null) {
            var3.method3635(new class534(var2));
        }
        var3.method3688();
        if (var3.field2218 != -1) {
            var3.method3677(method6353(var3.field2218), method6353(var3.field2217));
        }
        if (var3.field2229 != -1) {
            var3.method3638(method6353(var3.field2229), method6353(var3.field2228));
        }
        if (var3.field2196 != -1) {
            var3.method3637(method6353(var3.field2196), method6353(var3.field2230));
        }
        if (!Statics.field1288 && var3.field2199) {
            if (var3.field2218 == -1 && var3.field2229 == -1 && var3.field2196 == -1) {
                var3.field2210 = var3.field2210 + class370.field4311;
            }
            var3.field2227 = false;
            for (int var4 = 0; var4 < var3.field2200.length; var4++) {
                var3.field2200[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2204.length; var5++) {
                if (var5 != 4) {
                    var3.field2204[var5] = null;
                }
            }
            var3.field2192 = -2;
            var3.field2224 = 0;
            if (var3.field2198 != null) {
                boolean var6 = false;
                for (class492 var7 = var3.field2198.method8302(); var7 != null; var7 = var3.field2198.method8316()) {
                    class200 var8 = class200.method2797((int) var7.field4920);
                    if (var8.field2080) {
                        var7.method7996();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2198 = null;
                }
            }
        }
        field2206.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hb.aw(I)V")
    public void method3688() {
        if (this.field2194 == 1) {
            this.field2211 = 0;
        }
    }

    @ObfuscatedName("hb.al(Luq;I)V")
    public void method3635(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3684(arg0, var2);
        }
    }

    @ObfuscatedName("hb.ai(Luq;II)V")
    public void method3684(class534 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2182 = arg0.method8593();
        } else if (arg1 == 2) {
            this.field2210 = arg0.method8741();
        } else if (arg1 == 4) {
            this.field2188 = arg0.method8593();
        } else if (arg1 == 5) {
            this.field2189 = arg0.method8593();
        } else if (arg1 == 6) {
            this.field2190 = arg0.method8593();
        } else if (arg1 == 7) {
            this.field2201 = arg0.method8593();
            if (this.field2201 > 32767) {
                this.field2201 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2193 = arg0.method8593();
            if (this.field2193 > 32767) {
                this.field2193 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8741();
        } else if (arg1 == 11) {
            this.field2194 = 1;
        } else if (arg1 == 12) {
            this.field2195 = arg0.method8597();
        } else if (arg1 == 13) {
            this.field2197 = arg0.method8591();
        } else if (arg1 == 14) {
            this.field2202 = arg0.method8591();
        } else if (arg1 == 16) {
            this.field2199 = true;
        } else if (arg1 == 23) {
            this.field2203 = arg0.method8593();
            this.field2205 = arg0.method8591();
        } else if (arg1 == 24) {
            this.field2174 = arg0.method8593();
        } else if (arg1 == 25) {
            this.field2212 = arg0.method8593();
            this.field2208 = arg0.method8591();
        } else if (arg1 == 26) {
            this.field2207 = arg0.method8593();
        } else if (arg1 == 27) {
            this.field2219 = arg0.method8591();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2200[arg1 - 30] = arg0.method8741();
            if (this.field2200[arg1 - 30].equalsIgnoreCase(class370.field4010)) {
                this.field2200[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2204[arg1 - 35] = arg0.method8741();
        } else if (arg1 == 40) {
            int var3 = arg0.method8591();
            this.field2184 = new short[var3];
            this.field2223 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2184[var4] = (short) arg0.method8593();
                this.field2223[var4] = (short) arg0.method8593();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8591();
            this.field2186 = new short[var5];
            this.field2179 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2186[var6] = (short) arg0.method8593();
                this.field2179[var6] = (short) arg0.method8593();
            }
        } else if (arg1 == 42) {
            this.field2192 = arg0.method8592();
        } else if (arg1 == 65) {
            this.field2227 = true;
        } else if (arg1 == 75) {
            this.field2211 = arg0.method8594();
        } else if (arg1 == 78) {
            this.field2209 = arg0.method8593();
        } else if (arg1 == 79) {
            this.field2233 = arg0.method8593();
        } else if (arg1 == 90) {
            this.field2171 = arg0.method8593();
        } else if (arg1 == 91) {
            this.field2185 = arg0.method8593();
        } else if (arg1 == 92) {
            this.field2215 = arg0.method8593();
        } else if (arg1 == 93) {
            this.field2214 = arg0.method8593();
        } else if (arg1 == 94) {
            arg0.method8593();
        } else if (arg1 == 95) {
            this.field2213 = arg0.method8593();
        } else if (arg1 == 97) {
            this.field2217 = arg0.method8593();
        } else if (arg1 == 98) {
            this.field2218 = arg0.method8593();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2187 == null) {
                this.field2187 = new int[10];
                this.field2216 = new int[10];
            }
            this.field2187[arg1 - 100] = arg0.method8593();
            this.field2216[arg1 - 100] = arg0.method8593();
        } else if (arg1 == 110) {
            this.field2173 = arg0.method8593();
        } else if (arg1 == 111) {
            this.field2220 = arg0.method8593();
        } else if (arg1 == 112) {
            this.field2221 = arg0.method8593();
        } else if (arg1 == 113) {
            this.field2222 = arg0.method8592();
        } else if (arg1 == 114) {
            this.field2225 = arg0.method8592() * 5;
        } else if (arg1 == 115) {
            this.field2224 = arg0.method8591();
        } else if (arg1 == 139) {
            this.field2228 = arg0.method8593();
        } else if (arg1 == 140) {
            this.field2229 = arg0.method8593();
        } else if (arg1 == 148) {
            this.field2230 = arg0.method8593();
        } else if (arg1 == 149) {
            this.field2196 = arg0.method8593();
        } else if (arg1 == 249) {
            this.field2198 = class183.method5700(arg0, this.field2198);
        }
    }

    @ObfuscatedName("hb.ar(Lhb;Lhb;I)V")
    public void method3677(class205 arg0, class205 arg1) {
        this.field2182 = arg0.field2182;
        this.field2188 = arg0.field2188;
        this.field2189 = arg0.field2189;
        this.field2190 = arg0.field2190;
        this.field2213 = arg0.field2213;
        this.field2201 = arg0.field2201;
        this.field2193 = arg0.field2193;
        this.field2184 = arg0.field2184;
        this.field2223 = arg0.field2223;
        this.field2186 = arg0.field2186;
        this.field2179 = arg0.field2179;
        this.field2210 = arg1.field2210;
        this.field2199 = arg1.field2199;
        this.field2195 = arg1.field2195;
        this.field2194 = 1;
    }

    @ObfuscatedName("hb.as(Lhb;Lhb;B)V")
    public void method3638(class205 arg0, class205 arg1) {
        this.field2182 = arg0.field2182;
        this.field2188 = arg0.field2188;
        this.field2189 = arg0.field2189;
        this.field2190 = arg0.field2190;
        this.field2213 = arg0.field2213;
        this.field2201 = arg0.field2201;
        this.field2193 = arg0.field2193;
        this.field2184 = arg1.field2184;
        this.field2223 = arg1.field2223;
        this.field2186 = arg1.field2186;
        this.field2179 = arg1.field2179;
        this.field2210 = arg1.field2210;
        this.field2199 = arg1.field2199;
        this.field2194 = arg1.field2194;
        this.field2197 = arg1.field2197;
        this.field2202 = arg1.field2202;
        this.field2219 = arg1.field2219;
        this.field2203 = arg1.field2203;
        this.field2174 = arg1.field2174;
        this.field2209 = arg1.field2209;
        this.field2212 = arg1.field2212;
        this.field2207 = arg1.field2207;
        this.field2233 = arg1.field2233;
        this.field2171 = arg1.field2171;
        this.field2215 = arg1.field2215;
        this.field2185 = arg1.field2185;
        this.field2214 = arg1.field2214;
        this.field2224 = arg1.field2224;
        this.field2200 = arg1.field2200;
        this.field2211 = arg1.field2211;
        this.field2204 = new String[5];
        if (arg1.field2204 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2204[var3] = arg1.field2204[var3];
            }
        }
        this.field2204[4] = class370.field4014;
        this.field2195 = 0;
    }

    @ObfuscatedName("hb.aa(Lhb;Lhb;I)V")
    public void method3637(class205 arg0, class205 arg1) {
        this.field2182 = arg0.field2182;
        this.field2188 = arg0.field2188;
        this.field2189 = arg0.field2189;
        this.field2190 = arg0.field2190;
        this.field2213 = arg0.field2213;
        this.field2201 = arg0.field2201;
        this.field2193 = arg0.field2193;
        this.field2184 = arg0.field2184;
        this.field2223 = arg0.field2223;
        this.field2186 = arg0.field2186;
        this.field2179 = arg0.field2179;
        this.field2194 = arg0.field2194;
        this.field2210 = arg1.field2210;
        this.field2195 = 0;
        this.field2199 = false;
        this.field2227 = false;
    }

    @ObfuscatedName("hb.az(II)Lkf;")
    public final class267 method3693(int arg0) {
        if (this.field2187 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2216[var3] && this.field2216[var3] != 0) {
                    var2 = this.field2187[var3];
                }
            }
            if (var2 != -1) {
                return method6353(var2).method3693(1);
            }
        }
        class267 var4 = class267.method4644(Statics.field2231, this.field2182, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2173 != 128 || this.field2220 != 128 || this.field2221 != 128) {
            var4.method4661(this.field2173, this.field2220, this.field2221);
        }
        if (this.field2184 != null) {
            for (int var5 = 0; var5 < this.field2184.length; var5++) {
                var4.method4664(this.field2184[var5], this.field2223[var5]);
            }
        }
        if (this.field2186 != null) {
            for (int var6 = 0; var6 < this.field2186.length; var6++) {
                var4.method4666(this.field2186[var6], this.field2179[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hb.ao(II)Lkz;")
    public final class285 method3653(int arg0) {
        if (this.field2187 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2216[var3] && this.field2216[var3] != 0) {
                    var2 = this.field2187[var3];
                }
            }
            if (var2 != -1) {
                return method6353(var2).method3653(1);
            }
        }
        class285 var4 = (class285) field2183.method5414((long) this.field2181);
        if (var4 != null) {
            return var4;
        }
        class267 var5 = class267.method4644(Statics.field2231, this.field2182, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2173 != 128 || this.field2220 != 128 || this.field2221 != 128) {
            var5.method4661(this.field2173, this.field2220, this.field2221);
        }
        if (this.field2184 != null) {
            for (int var6 = 0; var6 < this.field2184.length; var6++) {
                var5.method4664(this.field2184[var6], this.field2223[var6]);
            }
        }
        if (this.field2186 != null) {
            for (int var7 = 0; var7 < this.field2186.length; var7++) {
                var5.method4666(this.field2186[var7], this.field2179[var7]);
            }
        }
        class285 var8 = var5.method4723(this.field2222 + 64, this.field2225 + 768, -50, -10, -50);
        var8.field3028 = true;
        field2183.method5421(var8, (long) this.field2181);
        return var8;
    }

    @ObfuscatedName("hb.au(II)Lhb;")
    public class205 method3642(int arg0) {
        if (this.field2187 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2216[var3] && this.field2216[var3] != 0) {
                    var2 = this.field2187[var3];
                }
            }
            if (var2 != -1) {
                return method6353(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("dn.ak(IIIIIZB)Lvd;")
    public static final class548 method2606(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class548 var8 = (class548) field2180.method5414(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class205 var9 = method6353(arg0);
        if (arg1 > 1 && var9.field2187 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2216[var11] && var9.field2216[var11] != 0) {
                    var10 = var9.field2187[var11];
                }
            }
            if (var10 != -1) {
                var9 = method6353(var10);
            }
        }
        class285 var12 = var9.method3653(1);
        if (var12 == null) {
            return null;
        }
        class548 var13 = null;
        if (var9.field2218 != -1) {
            var13 = method2606(var9.field2217, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2229 != -1) {
            var13 = method2606(var9.field2228, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2196 != -1) {
            var13 = method2606(var9.field2230, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5276;
        int var15 = Statics.field5271;
        int var16 = Statics.field5272;
        float[] var17 = Statics.field5270;
        int[] var18 = new int[4];
        class544.method8890(var18);
        class548 var19 = new class548(36, 32);
        class272.method4760(var19.field5296, 36, 32, (float[]) null);
        class544.method8956();
        class272.method4761();
        class272.method4746(16, 16);
        class272.field2821.field3086 = false;
        if (var9.field2196 != -1) {
            var13.method9027(0, 0);
        }
        int var20 = var9.field2188;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class272.field2819[var9.field2189] * var20 >> 16;
        int var22 = class272.field2820[var9.field2189] * var20 >> 16;
        var12.method5204();
        var12.method5245(0, var9.field2190, var9.field2213, var9.field2189, var9.field2201, var9.field2193 + var12.field2924 / 2 + var21, var9.field2193 + var22);
        if (var9.field2229 != -1) {
            var13.method9027(0, 0);
        }
        if (arg2 >= 1) {
            var19.method9094(1);
        }
        if (arg2 >= 2) {
            var19.method9094(16777215);
        }
        if (arg3 != 0) {
            var19.method9009(arg3);
        }
        class272.method4760(var19.field5296, 36, 32, (float[]) null);
        if (var9.field2218 != -1) {
            var13.method9027(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2194 == 1) {
            Statics.field407.method7170(method6337(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2180.method5421(var19, var6);
        }
        class272.method4760(var14, var15, var16, var17);
        class544.method8895(var18);
        class272.method4761();
        class272.field2821.field3086 = true;
        return var19;
    }

    @ObfuscatedName("on.ah(II)Ljava/lang/String;")
    public static final String method6337(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class370.field4187 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class370.field4139 + "</col>";
        }
    }

    @ObfuscatedName("hb.aj(II)Z")
    public final boolean method3643(int arg0) {
        int var2 = this.field2203;
        int var3 = this.field2174;
        int var4 = this.field2209;
        if (arg0 == 1) {
            var2 = this.field2212;
            var3 = this.field2207;
            var4 = this.field2233;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2231.method6420(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2231.method6420(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2231.method6420(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("hb.af(II)Lkf;")
    public final class267 method3644(int arg0) {
        int var2 = this.field2203;
        int var3 = this.field2174;
        int var4 = this.field2209;
        if (arg0 == 1) {
            var2 = this.field2212;
            var3 = this.field2207;
            var4 = this.field2233;
        }
        if (var2 == -1) {
            return null;
        }
        class267 var5 = class267.method4644(Statics.field2231, var2, 0);
        if (var3 != -1) {
            class267 var6 = class267.method4644(Statics.field2231, var3, 0);
            if (var4 == -1) {
                class267[] var9 = new class267[] { var5, var6 };
                var5 = new class267(var9, 2);
            } else {
                class267 var7 = class267.method4644(Statics.field2231, var4, 0);
                class267[] var8 = new class267[] { var5, var6, var7 };
                var5 = new class267(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2205 != 0) {
            var5.method4667(0, this.field2205, 0);
        }
        if (arg0 == 1 && this.field2208 != 0) {
            var5.method4667(0, this.field2208, 0);
        }
        if (this.field2184 != null) {
            for (int var10 = 0; var10 < this.field2184.length; var10++) {
                var5.method4664(this.field2184[var10], this.field2223[var10]);
            }
        }
        if (this.field2186 != null) {
            for (int var11 = 0; var11 < this.field2186.length; var11++) {
                var5.method4666(this.field2186[var11], this.field2179[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("hb.ax(II)Z")
    public final boolean method3645(int arg0) {
        int var2 = this.field2171;
        int var3 = this.field2215;
        if (arg0 == 1) {
            var2 = this.field2185;
            var3 = this.field2214;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2231.method6420(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2231.method6420(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("hb.an(II)Lkf;")
    public final class267 method3690(int arg0) {
        int var2 = this.field2171;
        int var3 = this.field2215;
        if (arg0 == 1) {
            var2 = this.field2185;
            var3 = this.field2214;
        }
        if (var2 == -1) {
            return null;
        }
        class267 var4 = class267.method4644(Statics.field2231, var2, 0);
        if (var3 != -1) {
            class267 var5 = class267.method4644(Statics.field2231, var3, 0);
            class267[] var6 = new class267[] { var4, var5 };
            var4 = new class267(var6, 2);
        }
        if (this.field2184 != null) {
            for (int var7 = 0; var7 < this.field2184.length; var7++) {
                var4.method4664(this.field2184[var7], this.field2223[var7]);
            }
        }
        if (this.field2186 != null) {
            for (int var8 = 0; var8 < this.field2186.length; var8++) {
                var4.method4666(this.field2186[var8], this.field2179[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hb.ag(III)I")
    public int method3647(int arg0, int arg1) {
        class507 var3 = this.field2198;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class491 var5 = (class491) var3.method8299((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4917;
            }
        }
        return var4;
    }

    @ObfuscatedName("hb.am(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3692(int arg0, String arg1) {
        class507 var3 = this.field2198;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class489 var5 = (class489) var3.method8299((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4915;
            }
        }
        return var4;
    }

    @ObfuscatedName("hb.ad(B)I")
    public int method3634() {
        if (this.field2192 == -1 || this.field2204 == null) {
            return -1;
        } else if (this.field2192 >= 0) {
            return this.field2204[this.field2192] == null ? -1 : this.field2192;
        } else if (class370.field4009.equalsIgnoreCase(this.field2204[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hm.at(I)V")
    public static void method3444() {
        field2206.method5418();
        field2183.method5418();
        field2180.method5418();
    }

    @ObfuscatedName("hb.ay(B)Z")
    public boolean method3650() {
        return this.field2223 != null;
    }

    @ObfuscatedName("hb.ae(I)Z")
    public boolean method3651() {
        return this.field2179 != null;
    }
}
