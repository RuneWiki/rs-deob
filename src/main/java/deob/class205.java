package deob;

@ObfuscatedName("hx")
public class class205 extends class457 {

    @ObfuscatedName("hx.at")
    public static boolean field2194 = false;

    @ObfuscatedName("hx.as")
    public static class287 field2147 = new class287(4096);

    @ObfuscatedName("hx.ax")
    public static class287 field2154 = new class287(500);

    @ObfuscatedName("hx.ap")
    public static class287 field2149 = new class287(30);

    @ObfuscatedName("hx.ab")
    public static class287 field2150 = new class287(30);

    @ObfuscatedName("hx.ak")
    public static class221[] field2153 = new class221[4];

    @ObfuscatedName("hx.ae")
    public int field2168;

    @ObfuscatedName("hx.af")
    public int[] field2157;

    @ObfuscatedName("hx.ao")
    public int[] field2189;

    @ObfuscatedName("hx.aa")
    public String field2155 = class350.field3887;

    @ObfuscatedName("hx.aj")
    public short[] field2156;

    @ObfuscatedName("hx.ad")
    public short[] field2151;

    @ObfuscatedName("hx.ac")
    public short[] field2159;

    @ObfuscatedName("hx.ag")
    public short[] field2158;

    @ObfuscatedName("hx.ar")
    public int field2160 = 1;

    @ObfuscatedName("hx.ah")
    public int field2161 = 1;

    @ObfuscatedName("hx.az")
    public int field2162 = 2;

    @ObfuscatedName("hx.au")
    public boolean field2192 = true;

    @ObfuscatedName("hx.ai")
    public int field2164 = -1;

    @ObfuscatedName("hx.aq")
    public int field2144 = -1;

    @ObfuscatedName("hx.aw")
    public boolean field2166 = false;

    @ObfuscatedName("hx.ay")
    public boolean field2167 = false;

    @ObfuscatedName("hx.al")
    public int field2181 = -1;

    @ObfuscatedName("hx.am")
    public int field2169 = 16;

    @ObfuscatedName("hx.bs")
    public int field2170 = 0;

    @ObfuscatedName("hx.bc")
    public int field2178 = 0;

    @ObfuscatedName("hx.bj")
    public String[] field2172 = new String[5];

    @ObfuscatedName("hx.bo")
    public int field2171 = -1;

    @ObfuscatedName("hx.bq")
    public int field2174 = -1;

    @ObfuscatedName("hx.bg")
    public boolean field2175 = false;

    @ObfuscatedName("hx.bf")
    public boolean field2176 = true;

    @ObfuscatedName("hx.bd")
    public int field2177 = 128;

    @ObfuscatedName("hx.ba")
    public int field2185 = 128;

    @ObfuscatedName("hx.bn")
    public int field2179 = 128;

    @ObfuscatedName("hx.bb")
    public int field2180 = 0;

    @ObfuscatedName("hx.bx")
    public int field2163 = 0;

    @ObfuscatedName("hx.be")
    public int field2182 = 0;

    @ObfuscatedName("hx.bh")
    public boolean field2183 = false;

    @ObfuscatedName("hx.bp")
    public boolean field2184 = false;

    @ObfuscatedName("hx.bw")
    public int field2165 = -1;

    @ObfuscatedName("hx.bi")
    public int[] field2152;

    @ObfuscatedName("hx.bk")
    public int field2187 = -1;

    @ObfuscatedName("hx.bv")
    public int field2188 = -1;

    @ObfuscatedName("hx.bz")
    public int field2186 = -1;

    @ObfuscatedName("hx.bm")
    public int field2190 = 0;

    @ObfuscatedName("hx.br")
    public int field2191 = 0;

    @ObfuscatedName("hx.bu")
    public int field2148 = 0;

    @ObfuscatedName("hx.by")
    public int[] field2193;

    @ObfuscatedName("hx.bt")
    public boolean field2173 = true;

    @ObfuscatedName("hx.bl")
    public class476 field2195;

    @ObfuscatedName("cm.at(Lnq;Lnq;ZI)V")
    public static void method1080(class357 arg0, class357 arg1, boolean arg2) {
        Statics.field2145 = arg0;
        Statics.field2146 = arg1;
        field2194 = arg2;
    }

    @ObfuscatedName("gf.an(II)Lhx;")
    public static class205 method3219(int arg0) {
        class205 var1 = (class205) field2147.method5121((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2145.method6080(6, arg0);
        class205 var3 = new class205();
        var3.field2168 = arg0;
        if (var2 != null) {
            var3.method3570(new class501(var2));
        }
        var3.method3569();
        if (var3.field2184) {
            var3.field2162 = 0;
            var3.field2192 = false;
        }
        field2147.method5123(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hx.av(B)V")
    public void method3569() {
        if (this.field2164 == -1) {
            this.field2164 = 0;
            if (this.field2157 != null && (this.field2189 == null || this.field2189[0] == 10)) {
                this.field2164 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2172[var1] != null) {
                    this.field2164 = 1;
                }
            }
        }
        if (this.field2165 == -1) {
            this.field2165 = this.field2162 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("hx.as(Ltz;I)V")
    public void method3570(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3571(arg0, var2);
        }
    }

    @ObfuscatedName("hx.ax(Ltz;II)V")
    public void method3571(class501 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8129();
            if (var3 > 0) {
                if (this.field2157 == null || field2194) {
                    this.field2189 = new int[var3];
                    this.field2157 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2157[var4] = arg0.method8195();
                        this.field2189[var4] = arg0.method8129();
                    }
                } else {
                    arg0.field5017 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2155 = arg0.method8253();
        } else if (arg1 == 5) {
            int var5 = arg0.method8129();
            if (var5 > 0) {
                if (this.field2157 == null || field2194) {
                    this.field2189 = null;
                    this.field2157 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2157[var6] = arg0.method8195();
                    }
                } else {
                    arg0.field5017 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2160 = arg0.method8129();
        } else if (arg1 == 15) {
            this.field2161 = arg0.method8129();
        } else if (arg1 == 17) {
            this.field2162 = 0;
            this.field2192 = false;
        } else if (arg1 == 18) {
            this.field2192 = false;
        } else if (arg1 == 19) {
            this.field2164 = arg0.method8129();
        } else if (arg1 == 21) {
            this.field2144 = 0;
        } else if (arg1 == 22) {
            this.field2166 = true;
        } else if (arg1 == 23) {
            this.field2167 = true;
        } else if (arg1 == 24) {
            this.field2181 = arg0.method8195();
            if (this.field2181 == 65535) {
                this.field2181 = -1;
            }
        } else if (arg1 == 27) {
            this.field2162 = 1;
        } else if (arg1 == 28) {
            this.field2169 = arg0.method8129();
        } else if (arg1 == 29) {
            this.field2170 = arg0.method8130();
        } else if (arg1 == 39) {
            this.field2178 = arg0.method8130() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2172[arg1 - 30] = arg0.method8253();
            if (this.field2172[arg1 - 30].equalsIgnoreCase(class350.field4141)) {
                this.field2172[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8129();
            this.field2156 = new short[var7];
            this.field2151 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2156[var8] = (short) arg0.method8195();
                this.field2151[var8] = (short) arg0.method8195();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8129();
            this.field2159 = new short[var9];
            this.field2158 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2159[var10] = (short) arg0.method8195();
                this.field2158[var10] = (short) arg0.method8195();
            }
        } else if (arg1 == 61) {
            arg0.method8195();
        } else if (arg1 == 62) {
            this.field2175 = true;
        } else if (arg1 == 64) {
            this.field2176 = false;
        } else if (arg1 == 65) {
            this.field2177 = arg0.method8195();
        } else if (arg1 == 66) {
            this.field2185 = arg0.method8195();
        } else if (arg1 == 67) {
            this.field2179 = arg0.method8195();
        } else if (arg1 == 68) {
            this.field2174 = arg0.method8195();
        } else if (arg1 == 69) {
            arg0.method8129();
        } else if (arg1 == 70) {
            this.field2180 = arg0.method8268();
        } else if (arg1 == 71) {
            this.field2163 = arg0.method8268();
        } else if (arg1 == 72) {
            this.field2182 = arg0.method8268();
        } else if (arg1 == 73) {
            this.field2183 = true;
        } else if (arg1 == 74) {
            this.field2184 = true;
        } else if (arg1 == 75) {
            this.field2165 = arg0.method8129();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2187 = arg0.method8195();
            if (this.field2187 == 65535) {
                this.field2187 = -1;
            }
            this.field2188 = arg0.method8195();
            if (this.field2188 == 65535) {
                this.field2188 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8195();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8129();
            this.field2152 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2152[var15] = arg0.method8195();
                if (this.field2152[var15] == 65535) {
                    this.field2152[var15] = -1;
                }
            }
            this.field2152[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2186 = arg0.method8195();
            this.field2190 = arg0.method8129();
        } else if (arg1 == 79) {
            this.field2191 = arg0.method8195();
            this.field2148 = arg0.method8195();
            this.field2190 = arg0.method8129();
            int var11 = arg0.method8129();
            this.field2193 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2193[var12] = arg0.method8195();
            }
        } else if (arg1 == 81) {
            this.field2144 = arg0.method8129() * 256;
        } else if (arg1 == 82) {
            this.field2171 = arg0.method8195();
        } else if (arg1 == 89) {
            this.field2173 = false;
        } else if (arg1 == 249) {
            this.field2195 = class191.method661(arg0, this.field2195);
        }
    }

    @ObfuscatedName("hx.ap(IB)Z")
    public final boolean method3581(int arg0) {
        if (this.field2189 != null) {
            for (int var4 = 0; var4 < this.field2189.length; var4++) {
                if (this.field2189[var4] == arg0) {
                    return Statics.field2146.method6082(this.field2157[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2157 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2157.length; var3++) {
                var2 &= Statics.field2146.method6082(this.field2157[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hx.ab(B)Z")
    public final boolean method3573() {
        if (this.field2157 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2157.length; var2++) {
            var1 &= Statics.field2146.method6082(this.field2157[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("hx.ak(II[[IIIII)Lim;")
    public final class232 method3594(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2189 == null) {
            var7 = (long) ((this.field2168 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2168 << 10) + (arg0 << 3) + arg1);
        }
        class232 var9 = (class232) field2149.method5121(var7);
        if (var9 == null) {
            class221 var10 = this.method3577(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2166) {
                var10.field2447 = (short) (this.field2170 + 64);
                var10.field2448 = (short) (this.field2178 + 768);
                var10.method3977();
                var9 = var10;
            } else {
                var9 = var10.method3934(this.field2170 + 64, this.field2178 + 768, -50, -10, -50);
            }
            field2149.method5123(var9, var7);
        }
        if (this.field2166) {
            var9 = ((class221) var9).method3919();
        }
        if (this.field2144 >= 0) {
            if (var9 instanceof class239) {
                var9 = ((class239) var9).method4439(arg2, arg3, arg4, arg5, true, this.field2144);
            } else if (var9 instanceof class221) {
                var9 = ((class221) var9).method3920(arg2, arg3, arg4, arg5, true, this.field2144);
            }
        }
        return var9;
    }

    @ObfuscatedName("hx.ae(II[[IIIII)Ljd;")
    public final class239 method3575(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2189 == null) {
            var7 = (long) ((this.field2168 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2168 << 10) + (arg0 << 3) + arg1);
        }
        class239 var9 = (class239) field2150.method5121(var7);
        if (var9 == null) {
            class221 var10 = this.method3577(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3934(this.field2170 + 64, this.field2178 + 768, -50, -10, -50);
            field2150.method5123(var9, var7);
        }
        if (this.field2144 >= 0) {
            var9 = var9.method4439(arg2, arg3, arg4, arg5, true, this.field2144);
        }
        return var9;
    }

    @ObfuscatedName("hx.af(II[[IIIILhy;IB)Ljd;")
    public final class239 method3617(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class208 arg6, int arg7) {
        long var9;
        if (this.field2189 == null) {
            var9 = (long) ((this.field2168 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2168 << 10) + (arg0 << 3) + arg1);
        }
        class239 var11 = (class239) field2150.method5121(var9);
        if (var11 == null) {
            class221 var12 = this.method3577(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3934(this.field2170 + 64, this.field2178 + 768, -50, -10, -50);
            field2150.method5123(var11, var9);
        }
        if (arg6 == null && this.field2144 == -1) {
            return var11;
        }
        class239 var13;
        if (arg6 == null) {
            var13 = var11.method4411(true);
        } else {
            var13 = arg6.method3762(var11, arg7, arg1);
        }
        if (this.field2144 >= 0) {
            var13 = var13.method4439(arg2, arg3, arg4, arg5, false, this.field2144);
        }
        return var13;
    }

    @ObfuscatedName("hx.ao(III)Lit;")
    public final class221 method3577(int arg0, int arg1) {
        class221 var3 = null;
        if (this.field2189 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2157 == null) {
                return null;
            }
            boolean var4 = this.field2175;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2157.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2157[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class221) field2154.method5121((long) var7);
                if (var3 == null) {
                    var3 = class221.method3913(Statics.field2146, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3928();
                    }
                    field2154.method5123(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2153[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class221(field2153, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2189.length; var9++) {
                if (this.field2189[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2157[var8];
            boolean var11 = this.field2175 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class221) field2154.method5121((long) var10);
            if (var3 == null) {
                var3 = class221.method3913(Statics.field2146, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3928();
                }
                field2154.method5123(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2177 == 128 && this.field2185 == 128 && this.field2179 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2180 == 0 && this.field2163 == 0 && this.field2182 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class221 var14 = new class221(var3, arg1 == 0 && !var12 && !var13, this.field2156 == null, this.field2159 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3948(256);
            var14.method3925(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3922();
        } else if (var15 == 2) {
            var14.method3923();
        } else if (var15 == 3) {
            var14.method3924();
        }
        if (this.field2156 != null) {
            for (int var16 = 0; var16 < this.field2156.length; var16++) {
                var14.method3995(this.field2156[var16], this.field2151[var16]);
            }
        }
        if (this.field2159 != null) {
            for (int var17 = 0; var17 < this.field2159.length; var17++) {
                var14.method3965(this.field2159[var17], this.field2158[var17]);
            }
        }
        if (var12) {
            var14.method3929(this.field2177, this.field2185, this.field2179);
        }
        if (var13) {
            var14.method3925(this.field2180, this.field2163, this.field2182);
        }
        return var14;
    }

    @ObfuscatedName("hx.aa(I)Lhx;")
    public final class205 method3578() {
        int var1 = -1;
        if (this.field2187 != -1) {
            var1 = class320.method5997(this.field2187);
        } else if (this.field2188 != -1) {
            var1 = class320.field3514[this.field2188];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2152.length - 1) {
            var2 = this.field2152[var1];
        } else {
            var2 = this.field2152[this.field2152.length - 1];
        }
        return var2 == -1 ? null : method3219(var2);
    }

    @ObfuscatedName("hx.aj(III)I")
    public int method3585(int arg0, int arg1) {
        class476 var3 = this.field2195;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class460 var5 = (class460) var3.method7848((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4754;
            }
        }
        return var4;
    }

    @ObfuscatedName("hx.ad(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3568(int arg0, String arg1) {
        return class191.method3094(this.field2195, arg0, arg1);
    }

    @ObfuscatedName("hx.ac(I)Z")
    public boolean method3572() {
        if (this.field2152 == null) {
            return this.field2186 != -1 || this.field2193 != null;
        }
        for (int var1 = 0; var1 < this.field2152.length; var1++) {
            if (this.field2152[var1] != -1) {
                class205 var2 = method3219(this.field2152[var1]);
                if (var2.field2186 != -1 || var2.field2193 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
