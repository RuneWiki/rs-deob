package deob;

@ObfuscatedName("hh")
public class class204 extends class439 {

    @ObfuscatedName("hh.ar")
    public static class276 field2210 = new class276(64);

    @ObfuscatedName("hh.ak")
    public static class276 field2180 = new class276(50);

    @ObfuscatedName("hh.ax")
    public static class276 field2230 = new class276(200);

    @ObfuscatedName("hh.ay")
    public int field2199;

    @ObfuscatedName("hh.am")
    public int field2218;

    @ObfuscatedName("hh.az")
    public String field2185 = class333.field3824;

    @ObfuscatedName("hh.ae")
    public short[] field2192;

    @ObfuscatedName("hh.au")
    public short[] field2187;

    @ObfuscatedName("hh.ag")
    public short[] field2188;

    @ObfuscatedName("hh.at")
    public short[] field2184;

    @ObfuscatedName("hh.af")
    public int field2220 = 2000;

    @ObfuscatedName("hh.ai")
    public int field2222 = 0;

    @ObfuscatedName("hh.aw")
    public int field2204 = 0;

    @ObfuscatedName("hh.aa")
    public int field2193 = 0;

    @ObfuscatedName("hh.ah")
    public int field2200 = 0;

    @ObfuscatedName("hh.ad")
    public int field2195 = 0;

    @ObfuscatedName("hh.bm")
    public int field2196 = 0;

    @ObfuscatedName("hh.bv")
    public int field2197 = 1;

    @ObfuscatedName("hh.bo")
    public int field2198 = -1;

    @ObfuscatedName("hh.bs")
    public int field2178 = -1;

    @ObfuscatedName("hh.bg")
    public int field2214 = -1;

    @ObfuscatedName("hh.bh")
    public boolean field2201 = false;

    @ObfuscatedName("hh.bl")
    public String[] field2202 = new String[] { null, null, class333.field3802, null, null };

    @ObfuscatedName("hh.bk")
    public String[] field2203 = new String[] { null, null, null, null, class333.field3803 };

    @ObfuscatedName("hh.ba")
    public int field2205 = -2;

    @ObfuscatedName("hh.bz")
    public int field2206 = -1;

    @ObfuscatedName("hh.bq")
    public int field2207 = -1;

    @ObfuscatedName("hh.bc")
    public int field2208 = 0;

    @ObfuscatedName("hh.bt")
    public int field2190 = -1;

    @ObfuscatedName("hh.be")
    public int field2176 = -1;

    @ObfuscatedName("hh.bu")
    public int field2189 = 0;

    @ObfuscatedName("hh.bd")
    public int field2212 = -1;

    @ObfuscatedName("hh.by")
    public int field2213 = -1;

    @ObfuscatedName("hh.bp")
    public int field2211 = -1;

    @ObfuscatedName("hh.bb")
    public int field2215 = -1;

    @ObfuscatedName("hh.bx")
    public int field2216 = -1;

    @ObfuscatedName("hh.bn")
    public int field2217 = -1;

    @ObfuscatedName("hh.bj")
    public int[] field2181;

    @ObfuscatedName("hh.bf")
    public int[] field2219;

    @ObfuscatedName("hh.bw")
    public int field2183 = -1;

    @ObfuscatedName("hh.bi")
    public int field2221 = -1;

    @ObfuscatedName("hh.cl")
    public int field2209 = 128;

    @ObfuscatedName("hh.ca")
    public int field2223 = 128;

    @ObfuscatedName("hh.cb")
    public int field2224 = 128;

    @ObfuscatedName("hh.co")
    public int field2225 = 0;

    @ObfuscatedName("hh.cj")
    public int field2226 = 0;

    @ObfuscatedName("hh.cn")
    public int field2227 = 0;

    @ObfuscatedName("hh.ce")
    public int field2228 = 0;

    @ObfuscatedName("hh.cd")
    public class454 field2229;

    @ObfuscatedName("hh.cc")
    public boolean field2191 = false;

    @ObfuscatedName("hh.ct")
    public int field2231 = -1;

    @ObfuscatedName("hh.cy")
    public int field2232 = -1;

    @ObfuscatedName("hh.ck")
    public int field2233 = -1;

    @ObfuscatedName("hh.cz")
    public int field2234 = -1;

    @ObfuscatedName("hp.aj(IS)Lhh;")
    public static class204 method3453(int arg0) {
        class204 var1 = (class204) field2210.method4921((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3311.method5860(10, arg0);
        class204 var3 = new class204();
        var3.field2199 = arg0;
        if (var2 != null) {
            var3.method3645(new class478(var2));
        }
        var3.method3589();
        if (var3.field2221 != -1) {
            var3.method3637(method3453(var3.field2221), method3453(var3.field2183));
        }
        if (var3.field2232 != -1) {
            var3.method3593(method3453(var3.field2232), method3453(var3.field2231));
        }
        if (var3.field2234 != -1) {
            var3.method3594(method3453(var3.field2234), method3453(var3.field2233));
        }
        if (!Statics.field1927 && var3.field2201) {
            var3.field2185 = class333.field4006;
            var3.field2191 = false;
            for (int var4 = 0; var4 < var3.field2202.length; var4++) {
                var3.field2202[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2203.length; var5++) {
                if (var5 != 4) {
                    var3.field2203[var5] = null;
                }
            }
            var3.field2205 = -2;
            var3.field2227 = 0;
            if (var3.field2229 != null) {
                boolean var6 = false;
                for (class444 var7 = var3.field2229.method7597(); var7 != null; var7 = var3.field2229.method7598()) {
                    class199 var8 = class199.method3048((int) var7.field4673);
                    if (var8.field2085) {
                        var7.method7335();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2229 = null;
                }
            }
        }
        field2210.method4923(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hh.al(B)V")
    public void method3589() {
        if (this.field2196 == 1) {
            this.field2228 = 0;
        }
    }

    @ObfuscatedName("hh.ac(Lsy;S)V")
    public void method3645(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3591(arg0, var2);
        }
    }

    @ObfuscatedName("hh.ab(Lsy;II)V")
    public void method3591(class478 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2218 = arg0.method7905();
        } else if (arg1 == 2) {
            this.field2185 = arg0.method7950();
        } else if (arg1 == 4) {
            this.field2220 = arg0.method7905();
        } else if (arg1 == 5) {
            this.field2222 = arg0.method7905();
        } else if (arg1 == 6) {
            this.field2204 = arg0.method7905();
        } else if (arg1 == 7) {
            this.field2200 = arg0.method7905();
            if (this.field2200 > 32767) {
                this.field2200 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2195 = arg0.method7905();
            if (this.field2195 > 32767) {
                this.field2195 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method7950();
        } else if (arg1 == 11) {
            this.field2196 = 1;
        } else if (arg1 == 12) {
            this.field2197 = arg0.method7908();
        } else if (arg1 == 13) {
            this.field2198 = arg0.method7909();
        } else if (arg1 == 14) {
            this.field2178 = arg0.method7909();
        } else if (arg1 == 16) {
            this.field2201 = true;
        } else if (arg1 == 23) {
            this.field2206 = arg0.method7905();
            this.field2208 = arg0.method7909();
        } else if (arg1 == 24) {
            this.field2207 = arg0.method7905();
        } else if (arg1 == 25) {
            this.field2190 = arg0.method7905();
            this.field2189 = arg0.method7909();
        } else if (arg1 == 26) {
            this.field2176 = arg0.method7905();
        } else if (arg1 == 27) {
            this.field2214 = arg0.method7909();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2202[arg1 - 30] = arg0.method7950();
            if (this.field2202[arg1 - 30].equalsIgnoreCase(class333.field3865)) {
                this.field2202[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2203[arg1 - 35] = arg0.method7950();
        } else if (arg1 == 40) {
            int var3 = arg0.method7909();
            this.field2192 = new short[var3];
            this.field2187 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2192[var4] = (short) arg0.method7905();
                this.field2187[var4] = (short) arg0.method7905();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method7909();
            this.field2188 = new short[var5];
            this.field2184 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2188[var6] = (short) arg0.method7905();
                this.field2184[var6] = (short) arg0.method7905();
            }
        } else if (arg1 == 42) {
            this.field2205 = arg0.method8163();
        } else if (arg1 == 65) {
            this.field2191 = true;
        } else if (arg1 == 75) {
            this.field2228 = arg0.method7882();
        } else if (arg1 == 78) {
            this.field2212 = arg0.method7905();
        } else if (arg1 == 79) {
            this.field2213 = arg0.method7905();
        } else if (arg1 == 90) {
            this.field2211 = arg0.method7905();
        } else if (arg1 == 91) {
            this.field2216 = arg0.method7905();
        } else if (arg1 == 92) {
            this.field2215 = arg0.method7905();
        } else if (arg1 == 93) {
            this.field2217 = arg0.method7905();
        } else if (arg1 == 94) {
            arg0.method7905();
        } else if (arg1 == 95) {
            this.field2193 = arg0.method7905();
        } else if (arg1 == 97) {
            this.field2183 = arg0.method7905();
        } else if (arg1 == 98) {
            this.field2221 = arg0.method7905();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2181 == null) {
                this.field2181 = new int[10];
                this.field2219 = new int[10];
            }
            this.field2181[arg1 - 100] = arg0.method7905();
            this.field2219[arg1 - 100] = arg0.method7905();
        } else if (arg1 == 110) {
            this.field2209 = arg0.method7905();
        } else if (arg1 == 111) {
            this.field2223 = arg0.method7905();
        } else if (arg1 == 112) {
            this.field2224 = arg0.method7905();
        } else if (arg1 == 113) {
            this.field2225 = arg0.method8163();
        } else if (arg1 == 114) {
            this.field2226 = arg0.method8163() * 5;
        } else if (arg1 == 115) {
            this.field2227 = arg0.method7909();
        } else if (arg1 == 139) {
            this.field2231 = arg0.method7905();
        } else if (arg1 == 140) {
            this.field2232 = arg0.method7905();
        } else if (arg1 == 148) {
            this.field2233 = arg0.method7905();
        } else if (arg1 == 149) {
            this.field2234 = arg0.method7905();
        } else if (arg1 == 249) {
            this.field2229 = class189.method4194(arg0, this.field2229);
        }
    }

    @ObfuscatedName("hh.an(Lhh;Lhh;I)V")
    public void method3637(class204 arg0, class204 arg1) {
        this.field2218 = arg0.field2218;
        this.field2220 = arg0.field2220;
        this.field2222 = arg0.field2222;
        this.field2204 = arg0.field2204;
        this.field2193 = arg0.field2193;
        this.field2200 = arg0.field2200;
        this.field2195 = arg0.field2195;
        this.field2192 = arg0.field2192;
        this.field2187 = arg0.field2187;
        this.field2188 = arg0.field2188;
        this.field2184 = arg0.field2184;
        this.field2185 = arg1.field2185;
        this.field2201 = arg1.field2201;
        this.field2197 = arg1.field2197;
        this.field2196 = 1;
    }

    @ObfuscatedName("hh.ao(Lhh;Lhh;B)V")
    public void method3593(class204 arg0, class204 arg1) {
        this.field2218 = arg0.field2218;
        this.field2220 = arg0.field2220;
        this.field2222 = arg0.field2222;
        this.field2204 = arg0.field2204;
        this.field2193 = arg0.field2193;
        this.field2200 = arg0.field2200;
        this.field2195 = arg0.field2195;
        this.field2192 = arg1.field2192;
        this.field2187 = arg1.field2187;
        this.field2188 = arg1.field2188;
        this.field2184 = arg1.field2184;
        this.field2185 = arg1.field2185;
        this.field2201 = arg1.field2201;
        this.field2196 = arg1.field2196;
        this.field2198 = arg1.field2198;
        this.field2178 = arg1.field2178;
        this.field2214 = arg1.field2214;
        this.field2206 = arg1.field2206;
        this.field2207 = arg1.field2207;
        this.field2212 = arg1.field2212;
        this.field2190 = arg1.field2190;
        this.field2176 = arg1.field2176;
        this.field2213 = arg1.field2213;
        this.field2211 = arg1.field2211;
        this.field2215 = arg1.field2215;
        this.field2216 = arg1.field2216;
        this.field2217 = arg1.field2217;
        this.field2227 = arg1.field2227;
        this.field2202 = arg1.field2202;
        this.field2228 = arg1.field2228;
        this.field2203 = new String[5];
        if (arg1.field2203 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2203[var3] = arg1.field2203[var3];
            }
        }
        this.field2203[4] = class333.field3840;
        this.field2197 = 0;
    }

    @ObfuscatedName("hh.av(Lhh;Lhh;I)V")
    public void method3594(class204 arg0, class204 arg1) {
        this.field2218 = arg0.field2218;
        this.field2220 = arg0.field2220;
        this.field2222 = arg0.field2222;
        this.field2204 = arg0.field2204;
        this.field2193 = arg0.field2193;
        this.field2200 = arg0.field2200;
        this.field2195 = arg0.field2195;
        this.field2192 = arg0.field2192;
        this.field2187 = arg0.field2187;
        this.field2188 = arg0.field2188;
        this.field2184 = arg0.field2184;
        this.field2196 = arg0.field2196;
        this.field2185 = arg1.field2185;
        this.field2197 = 0;
        this.field2201 = false;
        this.field2191 = false;
    }

    @ObfuscatedName("hh.aq(IB)Liu;")
    public final class215 method3620(int arg0) {
        if (this.field2181 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2219[var3] && this.field2219[var3] != 0) {
                    var2 = this.field2181[var3];
                }
            }
            if (var2 != -1) {
                return method3453(var2).method3620(1);
            }
        }
        class215 var4 = class215.method3812(Statics.field2186, this.field2218, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2209 != 128 || this.field2223 != 128 || this.field2224 != 128) {
            var4.method3828(this.field2209, this.field2223, this.field2224);
        }
        if (this.field2192 != null) {
            for (int var5 = 0; var5 < this.field2192.length; var5++) {
                var4.method3817(this.field2192[var5], this.field2187[var5]);
            }
        }
        if (this.field2188 != null) {
            for (int var6 = 0; var6 < this.field2188.length; var6++) {
                var4.method3826(this.field2188[var6], this.field2184[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hh.ap(II)Lix;")
    public final class231 method3596(int arg0) {
        if (this.field2181 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2219[var3] && this.field2219[var3] != 0) {
                    var2 = this.field2181[var3];
                }
            }
            if (var2 != -1) {
                return method3453(var2).method3596(1);
            }
        }
        class231 var4 = (class231) field2180.method4921((long) this.field2199);
        if (var4 != null) {
            return var4;
        }
        class215 var5 = class215.method3812(Statics.field2186, this.field2218, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2209 != 128 || this.field2223 != 128 || this.field2224 != 128) {
            var5.method3828(this.field2209, this.field2223, this.field2224);
        }
        if (this.field2192 != null) {
            for (int var6 = 0; var6 < this.field2192.length; var6++) {
                var5.method3817(this.field2192[var6], this.field2187[var6]);
            }
        }
        if (this.field2188 != null) {
            for (int var7 = 0; var7 < this.field2188.length; var7++) {
                var5.method3826(this.field2188[var7], this.field2184[var7]);
            }
        }
        class231 var8 = var5.method3833(this.field2225 + 64, this.field2226 + 768, -50, -10, -50);
        var8.field2683 = true;
        field2180.method4923(var8, (long) this.field2199);
        return var8;
    }

    @ObfuscatedName("hh.ar(II)Lhh;")
    public class204 method3626(int arg0) {
        if (this.field2181 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2219[var3] && this.field2219[var3] != 0) {
                    var2 = this.field2181[var3];
                }
            }
            if (var2 != -1) {
                return method3453(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("lf.ak(IIIIIZI)Lsn;")
    public static final class492 method5007(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class492 var8 = (class492) field2230.method4921(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class204 var9 = method3453(arg0);
        if (arg1 > 1 && var9.field2181 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2219[var11] && var9.field2219[var11] != 0) {
                    var10 = var9.field2181[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3453(var10);
            }
        }
        class231 var12 = var9.method3596(1);
        if (var12 == null) {
            return null;
        }
        class492 var13 = null;
        if (var9.field2221 != -1) {
            var13 = method5007(var9.field2183, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2232 != -1) {
            var13 = method5007(var9.field2231, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2234 != -1) {
            var13 = method5007(var9.field2233, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field4975;
        int var15 = Statics.field4970;
        int var16 = Statics.field4973;
        int[] var17 = new int[4];
        class488.method8235(var17);
        class492 var18 = new class492(36, 32);
        class488.method8231(var18.field4997, 36, 32);
        class488.method8283();
        class220.method3908();
        class220.method3952(16, 16);
        class220.field2493 = false;
        if (var9.field2234 != -1) {
            var13.method8403(0, 0);
        }
        int var19 = var9.field2220;
        if (arg5) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg2 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class220.field2482[var9.field2222] * var19 >> 16;
        int var21 = class220.field2470[var9.field2222] * var19 >> 16;
        var12.method4242();
        var12.method4293(0, var9.field2204, var9.field2193, var9.field2222, var9.field2200, var9.field2195 + var12.field2587 / 2 + var20, var9.field2195 + var21);
        if (var9.field2232 != -1) {
            var13.method8403(0, 0);
        }
        if (arg2 >= 1) {
            var18.method8359(1);
        }
        if (arg2 >= 2) {
            var18.method8359(16777215);
        }
        if (arg3 != 0) {
            var18.method8374(arg3);
        }
        class488.method8231(var18.field4997, 36, 32);
        if (var9.field2221 != -1) {
            var13.method8403(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2196 == 1) {
            Statics.field2182.method6578(method4975(arg1), 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2230.method4923(var18, var6);
        }
        class488.method8231(var14, var15, var16);
        class488.method8236(var17);
        class220.method3908();
        class220.field2493 = true;
        return var18;
    }

    @ObfuscatedName("lr.ax(IB)Ljava/lang/String;")
    public static final String method4975(int arg0) {
        if (arg0 < 100000) {
            return "<col=ffff00>" + arg0 + "</col>";
        } else if (arg0 < 10000000) {
            return "<col=ffffff>" + arg0 / 1000 + class333.field4011 + "</col>";
        } else {
            return "<col=00ff80>" + arg0 / 1000000 + class333.field3977 + "</col>";
        }
    }

    @ObfuscatedName("hh.as(IB)Z")
    public final boolean method3598(int arg0) {
        int var2 = this.field2206;
        int var3 = this.field2207;
        int var4 = this.field2212;
        if (arg0 == 1) {
            var2 = this.field2190;
            var3 = this.field2176;
            var4 = this.field2213;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2186.method5862(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2186.method5862(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2186.method5862(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("hh.ay(II)Liu;")
    public final class215 method3599(int arg0) {
        int var2 = this.field2206;
        int var3 = this.field2207;
        int var4 = this.field2212;
        if (arg0 == 1) {
            var2 = this.field2190;
            var3 = this.field2176;
            var4 = this.field2213;
        }
        if (var2 == -1) {
            return null;
        }
        class215 var5 = class215.method3812(Statics.field2186, var2, 0);
        if (var3 != -1) {
            class215 var6 = class215.method3812(Statics.field2186, var3, 0);
            if (var4 == -1) {
                class215[] var9 = new class215[] { var5, var6 };
                var5 = new class215(var9, 2);
            } else {
                class215 var7 = class215.method3812(Statics.field2186, var4, 0);
                class215[] var8 = new class215[] { var5, var6, var7 };
                var5 = new class215(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2208 != 0) {
            var5.method3885(0, this.field2208, 0);
        }
        if (arg0 == 1 && this.field2189 != 0) {
            var5.method3885(0, this.field2189, 0);
        }
        if (this.field2192 != null) {
            for (int var10 = 0; var10 < this.field2192.length; var10++) {
                var5.method3817(this.field2192[var10], this.field2187[var10]);
            }
        }
        if (this.field2188 != null) {
            for (int var11 = 0; var11 < this.field2188.length; var11++) {
                var5.method3826(this.field2188[var11], this.field2184[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("hh.am(II)Z")
    public final boolean method3600(int arg0) {
        int var2 = this.field2211;
        int var3 = this.field2215;
        if (arg0 == 1) {
            var2 = this.field2216;
            var3 = this.field2217;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2186.method5862(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2186.method5862(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("hh.az(IB)Liu;")
    public final class215 method3601(int arg0) {
        int var2 = this.field2211;
        int var3 = this.field2215;
        if (arg0 == 1) {
            var2 = this.field2216;
            var3 = this.field2217;
        }
        if (var2 == -1) {
            return null;
        }
        class215 var4 = class215.method3812(Statics.field2186, var2, 0);
        if (var3 != -1) {
            class215 var5 = class215.method3812(Statics.field2186, var3, 0);
            class215[] var6 = new class215[] { var4, var5 };
            var4 = new class215(var6, 2);
        }
        if (this.field2192 != null) {
            for (int var7 = 0; var7 < this.field2192.length; var7++) {
                var4.method3817(this.field2192[var7], this.field2187[var7]);
            }
        }
        if (this.field2188 != null) {
            for (int var8 = 0; var8 < this.field2188.length; var8++) {
                var4.method3826(this.field2188[var8], this.field2184[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hh.ae(IIB)I")
    public int method3616(int arg0, int arg1) {
        return class189.method2941(this.field2229, arg0, arg1);
    }

    @ObfuscatedName("hh.au(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3603(int arg0, String arg1) {
        return class189.method7298(this.field2229, arg0, arg1);
    }

    @ObfuscatedName("hh.ag(B)I")
    public int method3619() {
        if (this.field2205 == -1 || this.field2203 == null) {
            return -1;
        } else if (this.field2205 >= 0) {
            return this.field2203[this.field2205] == null ? -1 : this.field2205;
        } else if (class333.field3803.equalsIgnoreCase(this.field2203[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ge.at(I)V")
    public static void method3167() {
        field2230.method4930();
    }

    @ObfuscatedName("hh.af(I)Z")
    public boolean method3663() {
        return this.field2187 != null;
    }

    @ObfuscatedName("hh.ai(B)Z")
    public boolean method3606() {
        return this.field2184 != null;
    }
}
