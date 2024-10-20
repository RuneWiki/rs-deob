package deob;

@ObfuscatedName("id")
public class class210 extends class504 {

    @ObfuscatedName("id.ac")
    public static boolean field2191 = false;

    @ObfuscatedName("id.am")
    public static class317 field2173 = new class317(4096);

    @ObfuscatedName("id.ax")
    public static class317 field2174 = new class317(500);

    @ObfuscatedName("id.aq")
    public static class317 field2175 = new class317(30);

    @ObfuscatedName("id.af")
    public static class317 field2176 = new class317(30);

    @ObfuscatedName("id.at")
    public static class235[] field2188 = new class235[4];

    @ObfuscatedName("id.au")
    public int field2178;

    @ObfuscatedName("id.ar")
    public int[] field2203;

    @ObfuscatedName("id.al")
    public int[] field2180;

    @ObfuscatedName("id.ad")
    public String field2186 = class382.field4298;

    @ObfuscatedName("id.ah")
    public short[] field2182;

    @ObfuscatedName("id.ap")
    public short[] field2183;

    @ObfuscatedName("id.ab")
    public short[] field2184;

    @ObfuscatedName("id.az")
    public short[] field2185;

    @ObfuscatedName("id.aa")
    public int field2189 = 1;

    @ObfuscatedName("id.ai")
    public int field2187 = 1;

    @ObfuscatedName("id.ao")
    public int field2179 = 2;

    @ObfuscatedName("id.as")
    public boolean field2213 = true;

    @ObfuscatedName("id.ay")
    public int field2194 = -1;

    @ObfuscatedName("id.aj")
    public int field2206 = -1;

    @ObfuscatedName("id.av")
    public boolean field2192 = false;

    @ObfuscatedName("id.aw")
    public boolean field2193 = false;

    @ObfuscatedName("id.an")
    public int field2172 = -1;

    @ObfuscatedName("id.ak")
    public int field2195 = 16;

    @ObfuscatedName("id.bn")
    public int field2196 = 0;

    @ObfuscatedName("id.bh")
    public int field2190 = 0;

    @ObfuscatedName("id.bd")
    public String[] field2198 = new String[5];

    @ObfuscatedName("id.bx")
    public int field2199 = -1;

    @ObfuscatedName("id.bf")
    public int field2200 = -1;

    @ObfuscatedName("id.bm")
    public boolean field2224 = false;

    @ObfuscatedName("id.bs")
    public boolean field2202 = true;

    @ObfuscatedName("id.bw")
    public int field2181 = 128;

    @ObfuscatedName("id.ba")
    public int field2204 = 128;

    @ObfuscatedName("id.bj")
    public int field2205 = 128;

    @ObfuscatedName("id.bp")
    public int field2197 = 0;

    @ObfuscatedName("id.by")
    public int field2207 = 0;

    @ObfuscatedName("id.bb")
    public int field2208 = 0;

    @ObfuscatedName("id.bi")
    public boolean field2209 = false;

    @ObfuscatedName("id.bg")
    public boolean field2210 = false;

    @ObfuscatedName("id.bl")
    public int field2211 = -1;

    @ObfuscatedName("id.bz")
    public int[] field2212;

    @ObfuscatedName("id.bu")
    public int field2201 = -1;

    @ObfuscatedName("id.br")
    public int field2214 = -1;

    @ObfuscatedName("id.bo")
    public int field2171 = -1;

    @ObfuscatedName("id.bv")
    public int field2216 = 0;

    @ObfuscatedName("id.bt")
    public int field2217 = 0;

    @ObfuscatedName("id.bq")
    public int field2218 = 0;

    @ObfuscatedName("id.bk")
    public int field2219 = 0;

    @ObfuscatedName("id.be")
    public int[] field2220;

    @ObfuscatedName("id.bc")
    public boolean field2221 = true;

    @ObfuscatedName("id.cn")
    public boolean field2222 = false;

    @ObfuscatedName("id.ch")
    public class523 field2223;

    @ObfuscatedName("fl.ac(Lpo;Lpo;ZS)V")
    public static void method3285(class391 arg0, class391 arg1, boolean arg2) {
        Statics.field2177 = arg0;
        Statics.field63 = arg1;
        field2191 = arg2;
    }

    @ObfuscatedName("kf.ae(IB)Lid;")
    public static class210 method5152(int arg0) {
        class210 var1 = (class210) field2173.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2177.method6782(6, arg0);
        class210 var3 = new class210();
        var3.field2178 = arg0;
        if (var2 != null) {
            var3.method3803(new class551(var2));
        }
        var3.method3790();
        if (var3.field2210) {
            var3.field2179 = 0;
            var3.field2213 = false;
        }
        field2173.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("id.ag(I)V")
    public void method3790() {
        if (this.field2194 == -1) {
            this.field2194 = 0;
            if (this.field2203 != null && (this.field2180 == null || this.field2180[0] == 10)) {
                this.field2194 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2198[var1] != null) {
                    this.field2194 = 1;
                }
            }
        }
        if (this.field2211 == -1) {
            this.field2211 = this.field2179 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("id.am(Lvf;I)V")
    public void method3803(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3793(arg0, var2);
        }
    }

    @ObfuscatedName("id.ax(Lvf;IB)V")
    public void method3793(class551 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8955();
            if (var3 > 0) {
                if (this.field2203 == null || field2191) {
                    this.field2180 = new int[var3];
                    this.field2203 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2203[var4] = arg0.method9119();
                        this.field2180[var4] = arg0.method8955();
                    }
                } else {
                    arg0.field5415 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2186 = arg0.method9166();
        } else if (arg1 == 5) {
            int var5 = arg0.method8955();
            if (var5 > 0) {
                if (this.field2203 == null || field2191) {
                    this.field2180 = null;
                    this.field2203 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2203[var6] = arg0.method9119();
                    }
                } else {
                    arg0.field5415 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2189 = arg0.method8955();
        } else if (arg1 == 15) {
            this.field2187 = arg0.method8955();
        } else if (arg1 == 17) {
            this.field2179 = 0;
            this.field2213 = false;
        } else if (arg1 == 18) {
            this.field2213 = false;
        } else if (arg1 == 19) {
            this.field2194 = arg0.method8955();
        } else if (arg1 == 21) {
            this.field2206 = 0;
        } else if (arg1 == 22) {
            this.field2192 = true;
        } else if (arg1 == 23) {
            this.field2193 = true;
        } else if (arg1 == 24) {
            this.field2172 = arg0.method9119();
            if (this.field2172 == 65535) {
                this.field2172 = -1;
            }
        } else if (arg1 == 27) {
            this.field2179 = 1;
        } else if (arg1 == 28) {
            this.field2195 = arg0.method8955();
        } else if (arg1 == 29) {
            this.field2196 = arg0.method8975();
        } else if (arg1 == 39) {
            this.field2190 = arg0.method8975() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2198[arg1 - 30] = arg0.method9166();
            if (this.field2198[arg1 - 30].equalsIgnoreCase(class382.field4140)) {
                this.field2198[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8955();
            this.field2182 = new short[var7];
            this.field2183 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2182[var8] = (short) arg0.method9119();
                this.field2183[var8] = (short) arg0.method9119();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8955();
            this.field2184 = new short[var9];
            this.field2185 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2184[var10] = (short) arg0.method9119();
                this.field2185[var10] = (short) arg0.method9119();
            }
        } else if (arg1 == 61) {
            arg0.method9119();
        } else if (arg1 == 62) {
            this.field2224 = true;
        } else if (arg1 == 64) {
            this.field2202 = false;
        } else if (arg1 == 65) {
            this.field2181 = arg0.method9119();
        } else if (arg1 == 66) {
            this.field2204 = arg0.method9119();
        } else if (arg1 == 67) {
            this.field2205 = arg0.method9119();
        } else if (arg1 == 68) {
            this.field2200 = arg0.method9119();
        } else if (arg1 == 69) {
            arg0.method8955();
        } else if (arg1 == 70) {
            this.field2197 = arg0.method8977();
        } else if (arg1 == 71) {
            this.field2207 = arg0.method8977();
        } else if (arg1 == 72) {
            this.field2208 = arg0.method8977();
        } else if (arg1 == 73) {
            this.field2209 = true;
        } else if (arg1 == 74) {
            this.field2210 = true;
        } else if (arg1 == 75) {
            this.field2211 = arg0.method8955();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2201 = arg0.method9119();
            if (this.field2201 == 65535) {
                this.field2201 = -1;
            }
            this.field2214 = arg0.method9119();
            if (this.field2214 == 65535) {
                this.field2214 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method9119();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8955();
            this.field2212 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2212[var15] = arg0.method9119();
                if (this.field2212[var15] == 65535) {
                    this.field2212[var15] = -1;
                }
            }
            this.field2212[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2171 = arg0.method9119();
            this.field2216 = arg0.method8955();
            this.field2217 = arg0.method8955();
        } else if (arg1 == 79) {
            this.field2218 = arg0.method9119();
            this.field2219 = arg0.method9119();
            this.field2216 = arg0.method8955();
            this.field2217 = arg0.method8955();
            int var11 = arg0.method8955();
            this.field2220 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2220[var12] = arg0.method9119();
            }
        } else if (arg1 == 81) {
            arg0.method8955();
        } else if (arg1 == 82) {
            this.field2199 = arg0.method9119();
        } else if (arg1 == 89) {
            this.field2221 = false;
        } else if (arg1 == 90) {
            this.field2222 = true;
        } else if (arg1 == 249) {
            this.field2223 = class188.method3374(arg0, this.field2223);
        }
    }

    @ObfuscatedName("id.aq(IB)Z")
    public final boolean method3791(int arg0) {
        if (this.field2180 != null) {
            for (int var4 = 0; var4 < this.field2180.length; var4++) {
                if (this.field2180[var4] == arg0) {
                    return Statics.field63.method6784(this.field2203[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2203 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2203.length; var3++) {
                var2 &= Statics.field63.method6784(this.field2203[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("id.af(I)Z")
    public final boolean method3837() {
        if (this.field2203 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2203.length; var2++) {
            var1 &= Statics.field63.method6784(this.field2203[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("id.at(II[[IIIIB)Lju;")
    public final class248 method3796(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2180 == null) {
            var7 = (long) ((this.field2178 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2178 << 10) + (arg0 << 3) + arg1);
        }
        class248 var9 = (class248) field2175.method5733(var7);
        if (var9 == null) {
            class235 var10 = this.method3799(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2192) {
                var10.field2515 = (short) (this.field2196 + 64);
                var10.field2516 = (short) (this.field2190 + 768);
                var10.method4258();
                var9 = var10;
            } else {
                var9 = var10.method4266(this.field2196 + 64, this.field2190 + 768, -50, -10, -50);
            }
            field2175.method5735(var9, var7);
        }
        if (this.field2192) {
            var9 = ((class235) var9).method4313();
        }
        if (this.field2206 >= 0) {
            if (var9 instanceof class256) {
                var9 = ((class256) var9).method4809(arg2, arg3, arg4, arg5, true, this.field2206);
            } else if (var9 instanceof class235) {
                var9 = ((class235) var9).method4252(arg2, arg3, arg4, arg5, true, this.field2206);
            }
        }
        return var9;
    }

    @ObfuscatedName("id.au(II[[IIIIB)Ljm;")
    public final class256 method3794(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2180 == null) {
            var7 = (long) ((this.field2178 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2178 << 10) + (arg0 << 3) + arg1);
        }
        class256 var9 = (class256) field2176.method5733(var7);
        if (var9 == null) {
            class235 var10 = this.method3799(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4266(this.field2196 + 64, this.field2190 + 768, -50, -10, -50);
            field2176.method5735(var9, var7);
        }
        if (this.field2206 >= 0) {
            var9 = var9.method4809(arg2, arg3, arg4, arg5, true, this.field2206);
        }
        return var9;
    }

    @ObfuscatedName("id.ar(II[[IIIILif;IB)Ljm;")
    public final class256 method3834(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class213 arg6, int arg7) {
        long var9;
        if (this.field2180 == null) {
            var9 = (long) ((this.field2178 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2178 << 10) + (arg0 << 3) + arg1);
        }
        class256 var11 = (class256) field2176.method5733(var9);
        if (var11 == null) {
            class235 var12 = this.method3799(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4266(this.field2196 + 64, this.field2190 + 768, -50, -10, -50);
            field2176.method5735(var11, var9);
        }
        if (arg6 == null && this.field2206 == -1) {
            return var11;
        }
        class256 var13;
        if (arg6 == null) {
            var13 = var11.method4810(true);
        } else {
            var13 = arg6.method3949(var11, arg7, arg1);
        }
        if (this.field2206 >= 0) {
            var13 = var13.method4809(arg2, arg3, arg4, arg5, false, this.field2206);
        }
        return var13;
    }

    @ObfuscatedName("id.al(III)Ljv;")
    public final class235 method3799(int arg0, int arg1) {
        class235 var3 = null;
        if (this.field2180 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2203 == null) {
                return null;
            }
            boolean var4 = this.field2224;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2203.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2203[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class235) field2174.method5733((long) var7);
                if (var3 == null) {
                    var3 = class235.method4302(Statics.field63, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4256();
                    }
                    field2174.method5735(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2188[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class235(field2188, var5);
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
            int var10 = this.field2203[var8];
            boolean var11 = this.field2224 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class235) field2174.method5733((long) var10);
            if (var3 == null) {
                var3 = class235.method4302(Statics.field63, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4256();
                }
                field2174.method5735(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2181 == 128 && this.field2204 == 128 && this.field2205 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2197 == 0 && this.field2207 == 0 && this.field2208 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class235 var14 = new class235(var3, arg1 == 0 && !var12 && !var13, this.field2182 == null, this.field2184 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4289(256);
            var14.method4246(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4250();
        } else if (var15 == 2) {
            var14.method4299();
        } else if (var15 == 3) {
            var14.method4251();
        }
        if (this.field2182 != null) {
            for (int var16 = 0; var16 < this.field2182.length; var16++) {
                var14.method4254(this.field2182[var16], this.field2183[var16]);
            }
        }
        if (this.field2184 != null) {
            for (int var17 = 0; var17 < this.field2184.length; var17++) {
                var14.method4259(this.field2184[var17], this.field2185[var17]);
            }
        }
        if (var12) {
            var14.method4257(this.field2181, this.field2204, this.field2205);
        }
        if (var13) {
            var14.method4246(this.field2197, this.field2207, this.field2208);
        }
        return var14;
    }

    @ObfuscatedName("id.ad(I)Lid;")
    public final class210 method3800() {
        int var1 = -1;
        if (this.field2201 != -1) {
            var1 = class351.method3259(this.field2201);
        } else if (this.field2214 != -1) {
            var1 = class351.field3752[this.field2214];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2212.length - 1) {
            var2 = this.field2212[var1];
        } else {
            var2 = this.field2212[this.field2212.length - 1];
        }
        return var2 == -1 ? null : method5152(var2);
    }

    @ObfuscatedName("id.ah(III)I")
    public int method3801(int arg0, int arg1) {
        return class188.method414(this.field2223, arg0, arg1);
    }

    @ObfuscatedName("id.ap(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3802(int arg0, String arg1) {
        class523 var3 = this.field2223;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class505 var5 = (class505) var3.method8666((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field5118;
            }
        }
        return var4;
    }

    @ObfuscatedName("id.ab(I)Z")
    public boolean method3797() {
        if (this.field2212 == null) {
            return this.field2171 != -1 || this.field2220 != null;
        }
        for (int var1 = 0; var1 < this.field2212.length; var1++) {
            if (this.field2212[var1] != -1) {
                class210 var2 = method5152(this.field2212[var1]);
                if (var2.field2171 != -1 || var2.field2220 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
