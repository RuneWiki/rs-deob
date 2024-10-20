package deob;

@ObfuscatedName("hv")
public class class203 extends class481 {

    @ObfuscatedName("hv.az")
    public static class299 field2169 = new class299(64);

    @ObfuscatedName("hv.ap")
    public static class299 field2161 = new class299(50);

    @ObfuscatedName("hv.av")
    public static class299 field2136 = new class299(200);

    @ObfuscatedName("hv.as")
    public int field2181;

    @ObfuscatedName("hv.ay")
    public int field2175;

    @ObfuscatedName("hv.ak")
    public String field2166 = class364.field4153;

    @ObfuscatedName("hv.aj")
    public short[] field2140;

    @ObfuscatedName("hv.am")
    public short[] field2134;

    @ObfuscatedName("hv.aq")
    public short[] field2142;

    @ObfuscatedName("hv.ai")
    public short[] field2143;

    @ObfuscatedName("hv.aw")
    public int field2144 = 2000;

    @ObfuscatedName("hv.ae")
    public int field2179 = 0;

    @ObfuscatedName("hv.an")
    public int field2129 = 0;

    @ObfuscatedName("hv.ag")
    public int field2147 = 0;

    @ObfuscatedName("hv.ad")
    public int field2145 = 0;

    @ObfuscatedName("hv.af")
    public int field2149 = 0;

    @ObfuscatedName("hv.bl")
    public int field2151 = 0;

    @ObfuscatedName("hv.bi")
    public int field2152 = 1;

    @ObfuscatedName("hv.bv")
    public int field2153 = -1;

    @ObfuscatedName("hv.bf")
    public int field2154 = -1;

    @ObfuscatedName("hv.bg")
    public int field2183 = -1;

    @ObfuscatedName("hv.ba")
    public boolean field2160 = false;

    @ObfuscatedName("hv.bm")
    public String[] field2157 = new String[] { null, null, class364.field3927, null, null };

    @ObfuscatedName("hv.bp")
    public String[] field2158 = new String[] { null, null, null, null, class364.field3928 };

    @ObfuscatedName("hv.bj")
    public int field2159 = -2;

    @ObfuscatedName("hv.bn")
    public int field2146 = -1;

    @ObfuscatedName("hv.bo")
    public int field2141 = -1;

    @ObfuscatedName("hv.bt")
    public int field2162 = 0;

    @ObfuscatedName("hv.bu")
    public int field2163 = -1;

    @ObfuscatedName("hv.by")
    public int field2164 = -1;

    @ObfuscatedName("hv.bh")
    public int field2165 = 0;

    @ObfuscatedName("hv.bz")
    public int field2128 = -1;

    @ObfuscatedName("hv.bc")
    public int field2167 = -1;

    @ObfuscatedName("hv.bs")
    public int field2168 = -1;

    @ObfuscatedName("hv.bx")
    public int field2148 = -1;

    @ObfuscatedName("hv.bb")
    public int field2170 = -1;

    @ObfuscatedName("hv.bk")
    public int field2171 = -1;

    @ObfuscatedName("hv.br")
    public int[] field2172;

    @ObfuscatedName("hv.bq")
    public int[] field2173;

    @ObfuscatedName("hv.cf")
    public int field2131 = -1;

    @ObfuscatedName("hv.cg")
    public int field2187 = -1;

    @ObfuscatedName("hv.cv")
    public int field2176 = 128;

    @ObfuscatedName("hv.cx")
    public int field2135 = 128;

    @ObfuscatedName("hv.cp")
    public int field2178 = 128;

    @ObfuscatedName("hv.ce")
    public int field2174 = 0;

    @ObfuscatedName("hv.ci")
    public int field2180 = 0;

    @ObfuscatedName("hv.ct")
    public int field2155 = 0;

    @ObfuscatedName("hv.cw")
    public int field2182 = 0;

    @ObfuscatedName("hv.cq")
    public class500 field2138;

    @ObfuscatedName("hv.cl")
    public boolean field2184 = false;

    @ObfuscatedName("hv.cs")
    public int field2185 = -1;

    @ObfuscatedName("hv.co")
    public int field2186 = -1;

    @ObfuscatedName("hv.cm")
    public int field2156 = -1;

    @ObfuscatedName("hv.cn")
    public int field2188 = -1;

    @ObfuscatedName("ib.at(II)Lhv;")
    public static class203 method3907(int arg0) {
        class203 var1 = (class203) field2169.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5081.method6284(10, arg0);
        class203 var3 = new class203();
        var3.field2181 = arg0;
        if (var2 != null) {
            var3.method3635(new class527(var2));
        }
        var3.method3654();
        if (var3.field2187 != -1) {
            var3.method3696(method3907(var3.field2187), method3907(var3.field2131));
        }
        if (var3.field2186 != -1) {
            var3.method3638(method3907(var3.field2186), method3907(var3.field2185));
        }
        if (var3.field2188 != -1) {
            var3.method3682(method3907(var3.field2188), method3907(var3.field2156));
        }
        if (!Statics.field1518 && var3.field2160) {
            if (var3.field2187 == -1 && var3.field2186 == -1 && var3.field2188 == -1) {
                var3.field2166 = var3.field2166 + class364.field4149;
            }
            var3.field2184 = false;
            for (int var4 = 0; var4 < var3.field2157.length; var4++) {
                var3.field2157[var4] = null;
            }
            for (int var5 = 0; var5 < var3.field2158.length; var5++) {
                if (var5 != 4) {
                    var3.field2158[var5] = null;
                }
            }
            var3.field2159 = -2;
            var3.field2155 = 0;
            if (var3.field2138 != null) {
                boolean var6 = false;
                for (class485 var7 = var3.field2138.method8137(); var7 != null; var7 = var3.field2138.method8133()) {
                    class199 var8 = class199.method4984((int) var7.field4849);
                    if (var8.field2040) {
                        var7.method7828();
                    } else {
                        var6 = true;
                    }
                }
                if (!var6) {
                    var3.field2138 = null;
                }
            }
        }
        field2169.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hv.ah(I)V")
    public void method3654() {
        if (this.field2151 == 1) {
            this.field2182 = 0;
        }
    }

    @ObfuscatedName("hv.ar(Luj;I)V")
    public void method3635(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3636(arg0, var2);
        }
    }

    @ObfuscatedName("hv.ao(Luj;IS)V")
    public void method3636(class527 arg0, int arg1) {
        if (arg1 == 1) {
            this.field2175 = arg0.method8412();
        } else if (arg1 == 2) {
            this.field2166 = arg0.method8535();
        } else if (arg1 == 4) {
            this.field2144 = arg0.method8412();
        } else if (arg1 == 5) {
            this.field2179 = arg0.method8412();
        } else if (arg1 == 6) {
            this.field2129 = arg0.method8412();
        } else if (arg1 == 7) {
            this.field2145 = arg0.method8412();
            if (this.field2145 > 32767) {
                this.field2145 -= 65536;
            }
        } else if (arg1 == 8) {
            this.field2149 = arg0.method8412();
            if (this.field2149 > 32767) {
                this.field2149 -= 65536;
            }
        } else if (arg1 == 9) {
            arg0.method8535();
        } else if (arg1 == 11) {
            this.field2151 = 1;
        } else if (arg1 == 12) {
            this.field2152 = arg0.method8416();
        } else if (arg1 == 13) {
            this.field2153 = arg0.method8410();
        } else if (arg1 == 14) {
            this.field2154 = arg0.method8410();
        } else if (arg1 == 16) {
            this.field2160 = true;
        } else if (arg1 == 23) {
            this.field2146 = arg0.method8412();
            this.field2162 = arg0.method8410();
        } else if (arg1 == 24) {
            this.field2141 = arg0.method8412();
        } else if (arg1 == 25) {
            this.field2163 = arg0.method8412();
            this.field2165 = arg0.method8410();
        } else if (arg1 == 26) {
            this.field2164 = arg0.method8412();
        } else if (arg1 == 27) {
            this.field2183 = arg0.method8410();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2157[arg1 - 30] = arg0.method8535();
            if (this.field2157[arg1 - 30].equalsIgnoreCase(class364.field4155)) {
                this.field2157[arg1 - 30] = null;
            }
        } else if (arg1 >= 35 && arg1 < 40) {
            this.field2158[arg1 - 35] = arg0.method8535();
        } else if (arg1 == 40) {
            int var3 = arg0.method8410();
            this.field2140 = new short[var3];
            this.field2134 = new short[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2140[var4] = (short) arg0.method8412();
                this.field2134[var4] = (short) arg0.method8412();
            }
        } else if (arg1 == 41) {
            int var5 = arg0.method8410();
            this.field2142 = new short[var5];
            this.field2143 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2142[var6] = (short) arg0.method8412();
                this.field2143[var6] = (short) arg0.method8412();
            }
        } else if (arg1 == 42) {
            this.field2159 = arg0.method8616();
        } else if (arg1 == 65) {
            this.field2184 = true;
        } else if (arg1 == 75) {
            this.field2182 = arg0.method8508();
        } else if (arg1 == 78) {
            this.field2128 = arg0.method8412();
        } else if (arg1 == 79) {
            this.field2167 = arg0.method8412();
        } else if (arg1 == 90) {
            this.field2168 = arg0.method8412();
        } else if (arg1 == 91) {
            this.field2170 = arg0.method8412();
        } else if (arg1 == 92) {
            this.field2148 = arg0.method8412();
        } else if (arg1 == 93) {
            this.field2171 = arg0.method8412();
        } else if (arg1 == 94) {
            arg0.method8412();
        } else if (arg1 == 95) {
            this.field2147 = arg0.method8412();
        } else if (arg1 == 97) {
            this.field2131 = arg0.method8412();
        } else if (arg1 == 98) {
            this.field2187 = arg0.method8412();
        } else if (arg1 >= 100 && arg1 < 110) {
            if (this.field2172 == null) {
                this.field2172 = new int[10];
                this.field2173 = new int[10];
            }
            this.field2172[arg1 - 100] = arg0.method8412();
            this.field2173[arg1 - 100] = arg0.method8412();
        } else if (arg1 == 110) {
            this.field2176 = arg0.method8412();
        } else if (arg1 == 111) {
            this.field2135 = arg0.method8412();
        } else if (arg1 == 112) {
            this.field2178 = arg0.method8412();
        } else if (arg1 == 113) {
            this.field2174 = arg0.method8616();
        } else if (arg1 == 114) {
            this.field2180 = arg0.method8616() * 5;
        } else if (arg1 == 115) {
            this.field2155 = arg0.method8410();
        } else if (arg1 == 139) {
            this.field2185 = arg0.method8412();
        } else if (arg1 == 140) {
            this.field2186 = arg0.method8412();
        } else if (arg1 == 148) {
            this.field2156 = arg0.method8412();
        } else if (arg1 == 149) {
            this.field2188 = arg0.method8412();
        } else if (arg1 == 249) {
            this.field2138 = class182.method3052(arg0, this.field2138);
        }
    }

    @ObfuscatedName("hv.ab(Lhv;Lhv;I)V")
    public void method3696(class203 arg0, class203 arg1) {
        this.field2175 = arg0.field2175;
        this.field2144 = arg0.field2144;
        this.field2179 = arg0.field2179;
        this.field2129 = arg0.field2129;
        this.field2147 = arg0.field2147;
        this.field2145 = arg0.field2145;
        this.field2149 = arg0.field2149;
        this.field2140 = arg0.field2140;
        this.field2134 = arg0.field2134;
        this.field2142 = arg0.field2142;
        this.field2143 = arg0.field2143;
        this.field2166 = arg1.field2166;
        this.field2160 = arg1.field2160;
        this.field2152 = arg1.field2152;
        this.field2151 = 1;
    }

    @ObfuscatedName("hv.au(Lhv;Lhv;B)V")
    public void method3638(class203 arg0, class203 arg1) {
        this.field2175 = arg0.field2175;
        this.field2144 = arg0.field2144;
        this.field2179 = arg0.field2179;
        this.field2129 = arg0.field2129;
        this.field2147 = arg0.field2147;
        this.field2145 = arg0.field2145;
        this.field2149 = arg0.field2149;
        this.field2140 = arg1.field2140;
        this.field2134 = arg1.field2134;
        this.field2142 = arg1.field2142;
        this.field2143 = arg1.field2143;
        this.field2166 = arg1.field2166;
        this.field2160 = arg1.field2160;
        this.field2151 = arg1.field2151;
        this.field2153 = arg1.field2153;
        this.field2154 = arg1.field2154;
        this.field2183 = arg1.field2183;
        this.field2146 = arg1.field2146;
        this.field2141 = arg1.field2141;
        this.field2128 = arg1.field2128;
        this.field2163 = arg1.field2163;
        this.field2164 = arg1.field2164;
        this.field2167 = arg1.field2167;
        this.field2168 = arg1.field2168;
        this.field2148 = arg1.field2148;
        this.field2170 = arg1.field2170;
        this.field2171 = arg1.field2171;
        this.field2155 = arg1.field2155;
        this.field2157 = arg1.field2157;
        this.field2182 = arg1.field2182;
        this.field2158 = new String[5];
        if (arg1.field2158 != null) {
            for (int var3 = 0; var3 < 4; var3++) {
                this.field2158[var3] = arg1.field2158[var3];
            }
        }
        this.field2158[4] = class364.field4174;
        this.field2152 = 0;
    }

    @ObfuscatedName("hv.aa(Lhv;Lhv;I)V")
    public void method3682(class203 arg0, class203 arg1) {
        this.field2175 = arg0.field2175;
        this.field2144 = arg0.field2144;
        this.field2179 = arg0.field2179;
        this.field2129 = arg0.field2129;
        this.field2147 = arg0.field2147;
        this.field2145 = arg0.field2145;
        this.field2149 = arg0.field2149;
        this.field2140 = arg0.field2140;
        this.field2134 = arg0.field2134;
        this.field2142 = arg0.field2142;
        this.field2143 = arg0.field2143;
        this.field2151 = arg0.field2151;
        this.field2166 = arg1.field2166;
        this.field2152 = 0;
        this.field2160 = false;
        this.field2184 = false;
    }

    @ObfuscatedName("hv.ac(II)Lkq;")
    public final class262 method3640(int arg0) {
        if (this.field2172 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2173[var3] && this.field2173[var3] != 0) {
                    var2 = this.field2172[var3];
                }
            }
            if (var2 != -1) {
                return method3907(var2).method3640(1);
            }
        }
        class262 var4 = class262.method4571(Statics.field2132, this.field2175, 0);
        if (var4 == null) {
            return null;
        }
        if (this.field2176 != 128 || this.field2135 != 128 || this.field2178 != 128) {
            var4.method4588(this.field2176, this.field2135, this.field2178);
        }
        if (this.field2140 != null) {
            for (int var5 = 0; var5 < this.field2140.length; var5++) {
                var4.method4585(this.field2140[var5], this.field2134[var5]);
            }
        }
        if (this.field2142 != null) {
            for (int var6 = 0; var6 < this.field2142.length; var6++) {
                var4.method4641(this.field2142[var6], this.field2143[var6]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hv.al(II)Lka;")
    public final class280 method3641(int arg0) {
        if (this.field2172 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2173[var3] && this.field2173[var3] != 0) {
                    var2 = this.field2172[var3];
                }
            }
            if (var2 != -1) {
                return method3907(var2).method3641(1);
            }
        }
        class280 var4 = (class280) field2161.method5289((long) this.field2181);
        if (var4 != null) {
            return var4;
        }
        class262 var5 = class262.method4571(Statics.field2132, this.field2175, 0);
        if (var5 == null) {
            return null;
        }
        if (this.field2176 != 128 || this.field2135 != 128 || this.field2178 != 128) {
            var5.method4588(this.field2176, this.field2135, this.field2178);
        }
        if (this.field2140 != null) {
            for (int var6 = 0; var6 < this.field2140.length; var6++) {
                var5.method4585(this.field2140[var6], this.field2134[var6]);
            }
        }
        if (this.field2142 != null) {
            for (int var7 = 0; var7 < this.field2142.length; var7++) {
                var5.method4641(this.field2142[var7], this.field2143[var7]);
            }
        }
        class280 var8 = var5.method4593(this.field2174 + 64, this.field2180 + 768, -50, -10, -50);
        var8.field2990 = true;
        field2161.method5303(var8, (long) this.field2181);
        return var8;
    }

    @ObfuscatedName("hv.az(II)Lhv;")
    public class203 method3642(int arg0) {
        if (this.field2172 != null && arg0 > 1) {
            int var2 = -1;
            for (int var3 = 0; var3 < 10; var3++) {
                if (arg0 >= this.field2173[var3] && this.field2173[var3] != 0) {
                    var2 = this.field2172[var3];
                }
            }
            if (var2 != -1) {
                return method3907(var2);
            }
        }
        return this;
    }

    @ObfuscatedName("aa.ap(IIIIIZI)Luz;")
    public static final class541 method45(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg1 == -1) {
            arg4 = 0;
        } else if (arg4 == 2 && arg1 != 1) {
            arg4 = 1;
        }
        long var6 = ((long) arg3 << 42) + ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg1 << 16) + (long) arg0;
        if (!arg5) {
            class541 var8 = (class541) field2136.method5289(var6);
            if (var8 != null) {
                return var8;
            }
        }
        class203 var9 = method3907(arg0);
        if (arg1 > 1 && var9.field2172 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg1 >= var9.field2173[var11] && var9.field2173[var11] != 0) {
                    var10 = var9.field2172[var11];
                }
            }
            if (var10 != -1) {
                var9 = method3907(var10);
            }
        }
        class280 var12 = var9.method3641(1);
        if (var12 == null) {
            return null;
        }
        class541 var13 = null;
        if (var9.field2187 != -1) {
            var13 = method45(var9.field2131, 10, 1, 0, 0, true);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2186 != -1) {
            var13 = method45(var9.field2185, arg1, arg2, arg3, 0, false);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field2188 != -1) {
            var13 = method45(var9.field2156, arg1, 0, 0, 0, false);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = Statics.field5215;
        int var15 = Statics.field5208;
        int var16 = Statics.field5207;
        float[] var17 = Statics.field5210;
        int[] var18 = new int[4];
        class537.method8757(var18);
        class541 var19 = new class541(36, 32);
        class267.method4734(var19.field5244, 36, 32, (float[]) null);
        class537.method8826();
        class267.method4674();
        class267.method4677(16, 16);
        class267.field2773.field3039 = false;
        if (var9.field2188 != -1) {
            var13.method8885(0, 0);
        }
        int var20 = var9.field2144;
        if (arg5) {
            var20 = (int) ((double) var20 * 1.5D);
        } else if (arg2 == 2) {
            var20 = (int) ((double) var20 * 1.04D);
        }
        int var21 = class267.field2771[var9.field2179] * var20 >> 16;
        int var22 = class267.field2769[var9.field2179] * var20 >> 16;
        var12.method5033();
        var12.method5024(0, var9.field2129, var9.field2147, var9.field2179, var9.field2145, var9.field2149 + var12.field2874 / 2 + var21, var9.field2149 + var22);
        if (var9.field2186 != -1) {
            var13.method8885(0, 0);
        }
        if (arg2 >= 1) {
            var19.method8881(1);
        }
        if (arg2 >= 2) {
            var19.method8881(16777215);
        }
        if (arg3 != 0) {
            var19.method8882(arg3);
        }
        class267.method4734(var19.field5244, 36, 32, (float[]) null);
        if (var9.field2187 != -1) {
            var13.method8885(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && var9.field2151 == 1) {
            class406 var23 = Statics.field2278;
            String var24;
            if (arg1 < 100000) {
                var24 = "<col=ffff00>" + arg1 + "</col>";
            } else if (arg1 < 10000000) {
                var24 = "<col=ffffff>" + arg1 / 1000 + class364.field4104 + "</col>";
            } else {
                var24 = "<col=00ff80>" + arg1 / 1000000 + class364.field4023 + "</col>";
            }
            var23.method6981(var24, 0, 9, 16776960, 1);
        }
        if (!arg5) {
            field2136.method5303(var19, var6);
        }
        class267.method4734(var14, var15, var16, var17);
        class537.method8775(var18);
        class267.method4674();
        class267.field2773.field3039 = true;
        return var19;
    }

    @ObfuscatedName("hv.av(IB)Z")
    public final boolean method3643(int arg0) {
        int var2 = this.field2146;
        int var3 = this.field2141;
        int var4 = this.field2128;
        if (arg0 == 1) {
            var2 = this.field2163;
            var3 = this.field2164;
            var4 = this.field2167;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var5 = true;
        if (!Statics.field2132.method6308(var2, 0)) {
            var5 = false;
        }
        if (var3 != -1 && !Statics.field2132.method6308(var3, 0)) {
            var5 = false;
        }
        if (var4 != -1 && !Statics.field2132.method6308(var4, 0)) {
            var5 = false;
        }
        return var5;
    }

    @ObfuscatedName("hv.ax(IB)Lkq;")
    public final class262 method3646(int arg0) {
        int var2 = this.field2146;
        int var3 = this.field2141;
        int var4 = this.field2128;
        if (arg0 == 1) {
            var2 = this.field2163;
            var3 = this.field2164;
            var4 = this.field2167;
        }
        if (var2 == -1) {
            return null;
        }
        class262 var5 = class262.method4571(Statics.field2132, var2, 0);
        if (var3 != -1) {
            class262 var6 = class262.method4571(Statics.field2132, var3, 0);
            if (var4 == -1) {
                class262[] var9 = new class262[] { var5, var6 };
                var5 = new class262(var9, 2);
            } else {
                class262 var7 = class262.method4571(Statics.field2132, var4, 0);
                class262[] var8 = new class262[] { var5, var6, var7 };
                var5 = new class262(var8, 3);
            }
        }
        if (arg0 == 0 && this.field2162 != 0) {
            var5.method4584(0, this.field2162, 0);
        }
        if (arg0 == 1 && this.field2165 != 0) {
            var5.method4584(0, this.field2165, 0);
        }
        if (this.field2140 != null) {
            for (int var10 = 0; var10 < this.field2140.length; var10++) {
                var5.method4585(this.field2140[var10], this.field2134[var10]);
            }
        }
        if (this.field2142 != null) {
            for (int var11 = 0; var11 < this.field2142.length; var11++) {
                var5.method4641(this.field2142[var11], this.field2143[var11]);
            }
        }
        return var5;
    }

    @ObfuscatedName("hv.as(II)Z")
    public final boolean method3645(int arg0) {
        int var2 = this.field2168;
        int var3 = this.field2148;
        if (arg0 == 1) {
            var2 = this.field2170;
            var3 = this.field2171;
        }
        if (var2 == -1) {
            return true;
        }
        boolean var4 = true;
        if (!Statics.field2132.method6308(var2, 0)) {
            var4 = false;
        }
        if (var3 != -1 && !Statics.field2132.method6308(var3, 0)) {
            var4 = false;
        }
        return var4;
    }

    @ObfuscatedName("hv.ay(II)Lkq;")
    public final class262 method3671(int arg0) {
        int var2 = this.field2168;
        int var3 = this.field2148;
        if (arg0 == 1) {
            var2 = this.field2170;
            var3 = this.field2171;
        }
        if (var2 == -1) {
            return null;
        }
        class262 var4 = class262.method4571(Statics.field2132, var2, 0);
        if (var3 != -1) {
            class262 var5 = class262.method4571(Statics.field2132, var3, 0);
            class262[] var6 = new class262[] { var4, var5 };
            var4 = new class262(var6, 2);
        }
        if (this.field2140 != null) {
            for (int var7 = 0; var7 < this.field2140.length; var7++) {
                var4.method4585(this.field2140[var7], this.field2134[var7]);
            }
        }
        if (this.field2142 != null) {
            for (int var8 = 0; var8 < this.field2142.length; var8++) {
                var4.method4641(this.field2142[var8], this.field2143[var8]);
            }
        }
        return var4;
    }

    @ObfuscatedName("hv.ak(IIB)I")
    public int method3647(int arg0, int arg1) {
        return class182.method2319(this.field2138, arg0, arg1);
    }

    @ObfuscatedName("hv.aj(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3648(int arg0, String arg1) {
        class500 var3 = this.field2138;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class482 var5 = (class482) var3.method8134((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4845;
            }
        }
        return var4;
    }

    @ObfuscatedName("hv.am(B)I")
    public int method3633() {
        if (this.field2159 == -1 || this.field2158 == null) {
            return -1;
        } else if (this.field2159 >= 0) {
            return this.field2158[this.field2159] == null ? -1 : this.field2159;
        } else if (class364.field3928.equalsIgnoreCase(this.field2158[4])) {
            return 4;
        } else {
            return -1;
        }
    }

    @ObfuscatedName("gu.aq(B)V")
    public static void method3198() {
        field2136.method5292();
    }

    @ObfuscatedName("hv.ai(B)Z")
    public boolean method3650() {
        return this.field2134 != null;
    }

    @ObfuscatedName("hv.aw(B)Z")
    public boolean method3637() {
        return this.field2143 != null;
    }
}
