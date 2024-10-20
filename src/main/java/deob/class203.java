package deob;

@ObfuscatedName("hp")
public class class203 extends class485 {

    @ObfuscatedName("hp.aa")
    public static class302 field2149 = new class302(64);

    @ObfuscatedName("hp.au")
    public static class302 field2205 = new class302(50);

    @ObfuscatedName("hp.an")
    public static class302 field2151 = new class302(200);

    @ObfuscatedName("hp.ax")
    public int field2153;

    @ObfuscatedName("hp.aw")
    public int field2182;

    @ObfuscatedName("hp.az")
    public String field2155 = class367.field4120;

    @ObfuscatedName("hp.av")
    public short[] field2177;

    @ObfuscatedName("hp.ak")
    public short[] field2157;

    @ObfuscatedName("hp.ay")
    public short[] field2146;

    @ObfuscatedName("hp.as")
    public short[] field2196;

    @ObfuscatedName("hp.ab")
    public int field2160 = 2000;

    @ObfuscatedName("hp.ah")
    public int field2161 = 0;

    @ObfuscatedName("hp.ai")
    public int field2162 = 0;

    @ObfuscatedName("hp.ac")
    public int field2163 = 0;

    @ObfuscatedName("hp.al")
    public int field2164 = 0;

    @ObfuscatedName("hp.at")
    public int field2165 = 0;

    @ObfuscatedName("hp.bg")
    public int field2166 = 0;

    @ObfuscatedName("hp.bt")
    public int field2167 = 1;

    @ObfuscatedName("hp.br")
    public int field2168 = -1;

    @ObfuscatedName("hp.ba")
    public int field2169 = -1;

    @ObfuscatedName("hp.bk")
    public int field2150 = -1;

    @ObfuscatedName("hp.bn")
    public boolean field2203 = false;

    @ObfuscatedName("hp.by")
    public String[] field2172 = new String[] { null, null, class367.field3977, null, null };

    @ObfuscatedName("hp.bc")
    public String[] field2193 = new String[] { null, null, null, null, class367.field4253 };

    @ObfuscatedName("hp.bf")
    public int field2174 = -2;

    @ObfuscatedName("hp.bp")
    public int field2175 = -1;

    @ObfuscatedName("hp.bv")
    public int field2186 = -1;

    @ObfuscatedName("hp.bm")
    public int field2199 = 0;

    @ObfuscatedName("hp.bq")
    public int field2178 = -1;

    @ObfuscatedName("hp.bb")
    public int field2176 = -1;

    @ObfuscatedName("hp.bh")
    public int field2148 = 0;

    @ObfuscatedName("hp.bw")
    public int field2181 = -1;

    @ObfuscatedName("hp.bi")
    public int field2152 = -1;

    @ObfuscatedName("hp.bu")
    public int field2183 = -1;

    @ObfuscatedName("hp.be")
    public int field2184 = -1;

    @ObfuscatedName("hp.bs")
    public int field2185 = -1;

    @ObfuscatedName("hp.bl")
    public int field2190 = -1;

    @ObfuscatedName("hp.bz")
    public int[] field2187;

    @ObfuscatedName("hp.bo")
    public int[] field2188;

    @ObfuscatedName("hp.cg")
    public int field2189 = -1;

    @ObfuscatedName("hp.cb")
    public int field2170 = -1;

    @ObfuscatedName("hp.ci")
    public int field2191 = 128;

    @ObfuscatedName("hp.cv")
    public int field2180 = 128;

    @ObfuscatedName("hp.ct")
    public int field2179 = 128;

    @ObfuscatedName("hp.cp")
    public int field2194 = 0;

    @ObfuscatedName("hp.cq")
    public int field2195 = 0;

    @ObfuscatedName("hp.cl")
    public int field2158 = 0;

    @ObfuscatedName("hp.cs")
    public int field2197 = 0;

    @ObfuscatedName("hp.cc")
    public class504 field2198;

    @ObfuscatedName("hp.cd")
    public boolean field2192 = false;

    @ObfuscatedName("hp.cu")
    public int field2200 = -1;

    @ObfuscatedName("hp.co")
    public int field2201 = -1;

    @ObfuscatedName("hp.cy")
    public int field2202 = -1;

    @ObfuscatedName("hp.cn")
    public int field2171 = -1;

    @ObfuscatedName("ns.am(II)Lhp;")
    public static class203 method5762(int arg0) {
        class203 var1 = (class203) field2149.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2156.method6396(10, arg0);
        class203 var3 = new class203();
        var3.field2153 = arg0;
        if (var2 != null) {
            var3.method3674(new class531(var2));
        }
        var3.method3663();
        if (var3.field2170 != -1) {
            var3.method3666(method5762(var3.field2170), method5762(var3.field2189));
        }
        if (var3.field2201 != -1) {
            var3.method3711(method5762(var3.field2201), method5762(var3.field2200));
        }
        if (var3.field2171 != -1) {
            var3.method3673(method5762(var3.field2171), method5762(var3.field2202));
        }
        if (!Statics.field5062 && var3.field2203) {
            if (var3.field2170 == -1 && var3.field2201 == -1 && var3.field2171 == -1) {
                var3.field2155 = var3.field2155 + class367.field4118;
            }
            var3.field2192 = false;
            for (int var4 = 0; var4 < var3.field2172.length; var4++) {
                var3.field2172[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2193.length; var5++) {
                if (var5 != 4) {
                    var3.field2193[var5] = null;
                }
            }
            var3.field2174 = -2;
            var3.field2158 = 0;
            if (var3.field2198 != null) {
                boolean var6 = false;
                for (class489 var7 = var3.field2198.method8285(); var7 != null; var7 = var3.field2198.method8288()) {
                    class199 var8 = class199.method37((int) var7.field4889);
                    if (var8.field2060) {
                        var7.method7988();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2198 = null;
                }
            }
        }
        field2149.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hp.ap(I)V")
    public void method3663() {
        if (this.field2166 == 1) {
            this.field2197 = 0;
        }
    }

    @ObfuscatedName("hp.af(Luk;I)V")
    public void method3674(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3665(arg0, var2);
        }
    }

    @ObfuscatedName("hp.aj(Luk;II)V")
    public void method3665(class531 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2182 = arg0.method8775();
        } else if (arg1 == 2) {
            this.field2155 = arg0.method8641();
        } else if (arg1 == 4) {
            this.field2160 = arg0.method8775();
        } else if (arg1 == 5) {
            this.field2161 = arg0.method8775();
        } else if (arg1 == 6) {
            this.field2162 = arg0.method8775();
        } else if (arg1 == 7) {
            this.field2164 = arg0.method8775();
            if (this.field2164 > 32767) {
                this.field2164 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2165 = arg0.method8775();
            if (this.field2165 > 32767) {
                this.field2165 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8641();
        } else if (arg1 == 11) {
            this.field2166 = 1;
        } else if (arg1 == 12) {
            this.field2167 = arg0.method8566();
        } else if (arg1 == 13) {
            this.field2168 = arg0.method8561();
        } else if (arg1 == 14) {
            this.field2169 = arg0.method8561();
        } else if (arg1 == 16) {
            this.field2203 = true;
        } else if (arg1 == 23) {
            this.field2175 = arg0.method8775();
            this.field2199 = arg0.method8561();
        } else if (arg1 == 24) {
            this.field2186 = arg0.method8775();
        } else if (arg1 == 25) {
            this.field2178 = arg0.method8775();
            this.field2148 = arg0.method8561();
        } else if (arg1 == 26) {
            this.field2176 = arg0.method8775();
        } else if (arg1 == 27) {
            this.field2150 = arg0.method8561();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2172[arg1 - 30] = arg0.method8641();
            if (this.field2172[arg1 - 30].equalsIgnoreCase(class367.field3979)) {
                this.field2172[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2193[arg1 - 35] = arg0.method8641();
        } else if (arg1 == 40) {
            int var3 = arg0.method8561();
            this.field2177 = new short[var3];
            this.field2157 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2177[var4] = (short) arg0.method8775();
                this.field2157[var4] = (short) arg0.method8775();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8561();
            this.field2146 = new short[var5];
            this.field2196 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2146[var6] = (short) arg0.method8775();
                this.field2196[var6] = (short) arg0.method8775();
            }
        } else if (arg1 == 42) {
            this.field2174 = arg0.method8562();
        } else if (arg1 == 65) {
            this.field2192 = true;
        } else if (arg1 == 75) {
            this.field2197 = arg0.method8564();
        } else if (arg1 == 78) {
            this.field2181 = arg0.method8775();
        } else if (arg1 == 79) {
            this.field2152 = arg0.method8775();
        } else if (arg1 == 90) {
            this.field2183 = arg0.method8775();
        } else if (arg1 == 91) {
            this.field2185 = arg0.method8775();
        } else if (arg1 == 92) {
            this.field2184 = arg0.method8775();
        } else if (arg1 == 93) {
            this.field2190 = arg0.method8775();
        } else if (arg1 == 94) {
            arg0.method8775();
        } else if (arg1 == 95) {
            this.field2163 = arg0.method8775();
        } else if (arg1 == 97) {
            this.field2189 = arg0.method8775();
        } else if (arg1 == 98) {
            this.field2170 = arg0.method8775();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2187 == null) {
                this.field2187 = new int[10];
                this.field2188 = new int[10];
            }
            this.field2187[arg1 - 100] = arg0.method8775();
            this.field2188[arg1 - 100] = arg0.method8775();
        } else if (arg1 == 110) {
            this.field2191 = arg0.method8775();
        } else if (arg1 == 111) {
            this.field2180 = arg0.method8775();
        } else if (arg1 == 112) {
            this.field2179 = arg0.method8775();
        } else if (arg1 == 113) {
            this.field2194 = arg0.method8562();
        } else if (arg1 == 114) {
            this.field2195 = arg0.method8562() * 5;
        } else if (arg1 == 115) {
            this.field2158 = arg0.method8561();
        } else if (arg1 == 139) {
            this.field2200 = arg0.method8775();
        } else if (arg1 == 140) {
            this.field2201 = arg0.method8775();
        } else if (arg1 == 148) {
            this.field2202 = arg0.method8775();
        } else if (arg1 == 149) {
            this.field2171 = arg0.method8775();
        } else if (arg1 == 249) {
            this.field2198 = class182.method4263(arg0, this.field2198);
        }
    }

    @ObfuscatedName("hp.aq(Lhp;Lhp;I)V")
    public void method3666(class203 arg0, class203 arg1) {
        this.field2182 = arg0.field2182;
        this.field2160 = arg0.field2160;
        this.field2161 = arg0.field2161;
        this.field2162 = arg0.field2162;
        this.field2163 = arg0.field2163;
        this.field2164 = arg0.field2164;
        this.field2165 = arg0.field2165;
        this.field2177 = arg0.field2177;
        this.field2157 = arg0.field2157;
        this.field2146 = arg0.field2146;
        this.field2196 = arg0.field2196;
        this.field2155 = arg1.field2155;
        this.field2203 = arg1.field2203;
        this.field2167 = arg1.field2167;
        this.field2166 = 1;
    }

    @ObfuscatedName("hp.ar(Lhp;Lhp;I)V")
    public void method3711(class203 arg0, class203 arg1) {
        this.field2182 = arg0.field2182;
        this.field2160 = arg0.field2160;
        this.field2161 = arg0.field2161;
        this.field2162 = arg0.field2162;
        this.field2163 = arg0.field2163;
        this.field2164 = arg0.field2164;
        this.field2165 = arg0.field2165;
        this.field2177 = arg1.field2177;
        this.field2157 = arg1.field2157;
        this.field2146 = arg1.field2146;
        this.field2196 = arg1.field2196;
        this.field2155 = arg1.field2155;
        this.field2203 = arg1.field2203;
        this.field2166 = arg1.field2166;
        this.field2168 = arg1.field2168;
        this.field2169 = arg1.field2169;
        this.field2150 = arg1.field2150;
        this.field2175 = arg1.field2175;
        this.field2186 = arg1.field2186;
        this.field2181 = arg1.field2181;
        this.field2178 = arg1.field2178;
        this.field2176 = arg1.field2176;
        this.field2152 = arg1.field2152;
        this.field2183 = arg1.field2183;
        this.field2184 = arg1.field2184;
        this.field2185 = arg1.field2185;
        this.field2190 = arg1.field2190;
        this.field2158 = arg1.field2158;
        this.field2172 = arg1.field2172;
        this.field2197 = arg1.field2197;
        this.field2193 = new String[5];
        if (arg1.field2193 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2193[var3] = arg1.field2193[var3];
            }
        }
        this.field2193[4] = class367.field3983;
        this.field2167 = 0;
    }

    @ObfuscatedName("hp.ag(Lhp;Lhp;B)V")
    public void method3673(class203 arg0, class203 arg1) {
        this.field2182 = arg0.field2182;
        this.field2160 = arg0.field2160;
        this.field2161 = arg0.field2161;
        this.field2162 = arg0.field2162;
        this.field2163 = arg0.field2163;
        this.field2164 = arg0.field2164;
        this.field2165 = arg0.field2165;
        this.field2177 = arg0.field2177;
        this.field2157 = arg0.field2157;
        this.field2146 = arg0.field2146;
        this.field2196 = arg0.field2196;
        this.field2166 = arg0.field2166;
        this.field2155 = arg1.field2155;
        this.field2167 = 0;
        this.field2203 = false;
        this.field2192 = false;
    }

    @ObfuscatedName("hp.ao(IB)Lkm;")
    public final class265 method3680(int arg0) {
        if (this.field2187 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2188[var3] && this.field2188[var3] != 0) {
                    var2 = this.field2187[var3];
                }
            }
            if (var2 != -1) {
                return method5762(var2).method3680(1);
            }
        }
        class265 var4 = class265.method4650(Statics.field1782, this.field2182, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2191 != 128 || this.field2180 != 128 || this.field2179 != 128) {
            var4.method4667(this.field2191, this.field2180, this.field2179);
        }
        if (this.field2177 != null) {
            for (int var5 = 0; var5 < this.field2177.length; var5++) {
                var4.method4664(this.field2177[var5], this.field2157[var5]);
            }
        }
        if (this.field2146 != null) {
            for (int var6 = 0; var6 < this.field2146.length; var6++) {
                var4.method4665(this.field2146[var6], this.field2196[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hp.ae(II)Lko;")
    public final class283 method3670(int arg0) {
        if (this.field2187 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2188[var3] && this.field2188[var3] != 0) {
                    var2 = this.field2187[var3];
                }
            }
            if (var2 != -1) {
                return method5762(var2).method3670(1);
            }
        }
        class283 var4 = (class283) field2205.method5400((long) this.field2153);
        if (var4 != null) {
            return var4;
        }
        class265 var5 = class265.method4650(Statics.field1782, this.field2182, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2191 != 128 || this.field2180 != 128 || this.field2179 != 128) {
            var5.method4667(this.field2191, this.field2180, this.field2179);
        }
        if (this.field2177 != null) {
            for (int var6 = 0; var6 < this.field2177.length; var6++) {
                var5.method4664(this.field2177[var6], this.field2157[var6]);
            }
        }
        if (this.field2146 != null) {
            for (int var7 = 0; var7 < this.field2146.length; var7++) {
                var5.method4665(this.field2146[var7], this.field2196[var7]);
            }
        }
        class283 var8 = var5.method4672(this.field2194 + 64, this.field2195 + 768, -50, -10, -50);
        var8.field3003 = true;
        field2205.method5402(var8, (long) this.field2153);
        return var8;
    }

    @ObfuscatedName("hp.aa(II)Lhp;")
    public class203 method3671(int arg0) {
        if (this.field2187 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2188[var3] && this.field2188[var3] != 0) {
                    var2 = this.field2187[var3];
                }
            }
            if (var2 != -1) {
                return method5762(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("ey.au(IIIIIZB)Luc;")
    public static final class545 method2830(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class545 var8 = (class545) field2151.method5400(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class203 var9 = method5762(arg0);
        if (arg1 > 1 && var9.field2187 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2188[var11] && var9.field2188[var11] != 0) {
                    var10 = var9.field2187[var11];
                }
            }
            if (var10 != -1) {
                var9 = method5762(var10);
            }
        }
        class283 var12 = var9.method3670(1);
        if (var12 == null) {
            return null;
        }
        class545 var13 = null;
        if (var9.field2170 != -1) {
            var13 = method2830(var9.field2189, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2201 != -1) {
            var13 = method2830(var9.field2200, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2171 != -1) {
            var13 = method2830(var9.field2202, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5250;
        int var15 = Statics.field5249;
        int var16 = Statics.field5252;
        float[] var17 = Statics.field5254;
        int[] var18 = new int[4];
        class541.method8937(var18);
        class545 var19 = new class545(36, 32);
        class270.method4806(var19.field5281, 36, 32, (float[]) null);
        class541.method8880();
        class270.method4798();
        class270.method4762(16, 16);
        class270.field2810.field3081 = false;
        if (var9.field2171 != -1) {
            var13.method8995(0, 0);
        }
        int var20 = var9.field2160;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class270.field2803[var9.field2161] * var20 >> 16;
        int var22 = class270.field2808[var9.field2161] * var20 >> 16;
        var12.method5136();
        var12.method5154(0, var9.field2162, var9.field2163, var9.field2161, var9.field2164, var9.field2165 + var12.field2910 / 2 + var21, var9.field2165 + var22);
        if (var9.field2201 != -1) {
            var13.method8995(0, 0);
        }
        if (arg2 >= 1) {
            var19.method9051(1);
        }
        if (arg2 >= 2) {
            var19.method9051(16777215);
        }
        if (arg3 != 0) {
            var19.method8992(arg3);
        }
        class270.method4806(var19.field5281, 36, 32, (float[]) null);
        if (var9.field2170 != -1) {
            var13.method8995(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2166 == 1) {
            class410 var23 = Statics.field2159;
            String var24;
            if (arg1 < 100000) {
                var24 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var24 = "<col=ffffff>" + arg1 / 1000 + class367.field4221 + "</col>";
            } else {
                var24 = "<col=00ff80>" + arg1 / 1000000 + class367.field4152 + "</col>";
            }
            var23.method7109(var24, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2151.method5402(var19, var6);
        }
        class270.method4806(var14, var15, var16, var17);
        class541.method8879(var18);
        class270.method4798();
        class270.field2810.field3081 = true;
        return var19;
    }

    @ObfuscatedName("hp.an(IB)Z")
    public final boolean method3672(int arg0) {
        int var2 = this.field2175;
        int var3 = this.field2186;
        int var4 = this.field2181;
        if (arg0 == 1) {
            var2 = this.field2178;
            var3 = this.field2176;
            var4 = this.field2152;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field1782.method6431(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field1782.method6431(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field1782.method6431(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("hp.ad(II)Lkm;")
    public final class265 method3667(int arg0) {
        int var2 = this.field2175;
        int var3 = this.field2186;
        int var4 = this.field2181;
        if (arg0 == 1) {
            var2 = this.field2178;
            var3 = this.field2176;
            var4 = this.field2152;
        }
        if (var2 == -1) {
            return null;
        }
        class265 var5 = class265.method4650(Statics.field1782, var2, 0);
        if (var3 != -1) {
            class265 var6 = class265.method4650(Statics.field1782, var3, 0);
            if (var4 == -1) {
                class265[] var9 = new class265[] { var5, var6 };
                var5 = new class265(var9, 2);
            } else {
                class265 var7 = class265.method4650(Statics.field1782, var4, 0);
                class265[] var8 = new class265[] { var5, var6, var7 };
                var5 = new class265(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2199 != 0) {
            var5.method4730(0, this.field2199, 0);
        }
        if (arg0 == 1 && this.field2148 != 0) {
            var5.method4730(0, this.field2148, 0);
        }
        if (this.field2177 != null) {
            for (int var10 = 0; var10 < this.field2177.length; var10++) {
                var5.method4664(this.field2177[var10], this.field2157[var10]);
            }
        }
        if (this.field2146 != null) {
            for (int var11 = 0; var11 < this.field2146.length; var11++) {
                var5.method4665(this.field2146[var11], this.field2196[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("hp.ax(IB)Z")
    public final boolean method3696(int arg0) {
        int var2 = this.field2183;
        int var3 = this.field2184;
        if (arg0 == 1) {
            var2 = this.field2185;
            var3 = this.field2190;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field1782.method6431(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field1782.method6431(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("hp.aw(IB)Lkm;")
    public final class265 method3675(int arg0) {
        int var2 = this.field2183;
        int var3 = this.field2184;
        if (arg0 == 1) {
            var2 = this.field2185;
            var3 = this.field2190;
        }
        if (var2 == -1) {
            return null;
        }
        class265 var4 = class265.method4650(Statics.field1782, var2, 0);
        if (var3 != -1) {
            class265 var5 = class265.method4650(Statics.field1782, var3, 0);
            class265[] var6 = new class265[] { var4, var5 };
            var4 = new class265(var6, 2);
        }
        if (this.field2177 != null) {
            for (int var7 = 0; var7 < this.field2177.length; var7++) {
                var4.method4664(this.field2177[var7], this.field2157[var7]);
            }
        }
        if (this.field2146 != null) {
            for (int var8 = 0; var8 < this.field2146.length; var8++) {
                var4.method4665(this.field2146[var8], this.field2196[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hp.az(III)I")
    public int method3676(int arg0, int arg1) {
        class504 var3 = this.field2198;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class488 var5 = (class488) var3.method8286((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4887;
            }
        }
        return var4;
    }

    @ObfuscatedName("hp.av(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3677(int arg0, String arg1) {
        class504 var3 = this.field2198;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class486 var5 = (class486) var3.method8286((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4885;
            }
        }
        return var4;
    }

    @ObfuscatedName("hp.ak(I)I")
    public int method3678() {
        if (this.field2174 == -1 || this.field2193 == null) {
            return -1;
        } else if (this.field2174 >= 0) {
            return this.field2193[this.field2174] == null ? -1 : this.field2174;
        } else if (class367.field4253.equalsIgnoreCase(this.field2193[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("hp.ay(I)Z")
    public boolean method3679() {
        return this.field2157 != null;
    }

    @ObfuscatedName("hp.as(I)Z")
    public boolean method3668() {
        return this.field2196 != null;
    }
}
