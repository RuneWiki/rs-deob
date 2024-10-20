package deob;

@ObfuscatedName("hb")
public class class207 extends class470 {

    @ObfuscatedName("hb.aw")
    public static boolean field2151 = false;

    @ObfuscatedName("hb.am")
    public static class289 field2137 = new class289(4096);

    @ObfuscatedName("hb.as")
    public static class289 field2144 = new class289(500);

    @ObfuscatedName("hb.aj")
    public static class289 field2139 = new class289(30);

    @ObfuscatedName("hb.ag")
    public static class289 field2140 = new class289(30);

    @ObfuscatedName("hb.az")
    public static class223[] field2181 = new class223[4];

    @ObfuscatedName("hb.av")
    public int field2142;

    @ObfuscatedName("hb.ap")
    public int[] field2143;

    @ObfuscatedName("hb.aq")
    public int[] field2168;

    @ObfuscatedName("hb.at")
    public String field2134 = class353.field3906;

    @ObfuscatedName("hb.ah")
    public short[] field2146;

    @ObfuscatedName("hb.ax")
    public short[] field2145;

    @ObfuscatedName("hb.aa")
    public short[] field2153;

    @ObfuscatedName("hb.au")
    public short[] field2149;

    @ObfuscatedName("hb.ae")
    public int field2170 = 1;

    @ObfuscatedName("hb.ab")
    public int field2174 = 1;

    @ObfuscatedName("hb.ad")
    public int field2152 = 2;

    @ObfuscatedName("hb.ao")
    public boolean field2135 = true;

    @ObfuscatedName("hb.ac")
    public int field2154 = -1;

    @ObfuscatedName("hb.ak")
    public int field2155 = -1;

    @ObfuscatedName("hb.an")
    public boolean field2156 = false;

    @ObfuscatedName("hb.af")
    public boolean field2148 = false;

    @ObfuscatedName("hb.ai")
    public int field2160 = -1;

    @ObfuscatedName("hb.al")
    public int field2159 = 16;

    @ObfuscatedName("hb.bd")
    public int field2150 = 0;

    @ObfuscatedName("hb.bb")
    public int field2178 = 0;

    @ObfuscatedName("hb.bn")
    public String[] field2162 = new String[5];

    @ObfuscatedName("hb.ba")
    public int field2163 = -1;

    @ObfuscatedName("hb.bf")
    public int field2164 = -1;

    @ObfuscatedName("hb.bs")
    public boolean field2165 = false;

    @ObfuscatedName("hb.bp")
    public boolean field2166 = true;

    @ObfuscatedName("hb.bv")
    public int field2167 = 128;

    @ObfuscatedName("hb.bq")
    public int field2157 = 128;

    @ObfuscatedName("hb.bo")
    public int field2169 = 128;

    @ObfuscatedName("hb.br")
    public int field2158 = 0;

    @ObfuscatedName("hb.bw")
    public int field2171 = 0;

    @ObfuscatedName("hb.be")
    public int field2172 = 0;

    @ObfuscatedName("hb.bc")
    public boolean field2173 = false;

    @ObfuscatedName("hb.bi")
    public boolean field2141 = false;

    @ObfuscatedName("hb.bu")
    public int field2175 = -1;

    @ObfuscatedName("hb.bk")
    public int[] field2176;

    @ObfuscatedName("hb.bz")
    public int field2177 = -1;

    @ObfuscatedName("hb.bx")
    public int field2147 = -1;

    @ObfuscatedName("hb.bh")
    public int field2179 = -1;

    @ObfuscatedName("hb.bm")
    public int field2180 = 0;

    @ObfuscatedName("hb.bl")
    public int field2161 = 0;

    @ObfuscatedName("hb.bt")
    public int field2182 = 0;

    @ObfuscatedName("hb.by")
    public int[] field2183;

    @ObfuscatedName("hb.bg")
    public boolean field2184 = true;

    @ObfuscatedName("hb.bj")
    public class489 field2185;

    @ObfuscatedName("hb.ay(B)V")
    public void method3606() {
        if (this.field2154 == -1) {
            this.field2154 = 0;
            if (this.field2143 != null && (this.field2168 == null || this.field2168[0] == 10)) {
                this.field2154 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2162[var1] != null) {
                    this.field2154 = 1;
                }
            }
        }
        if (this.field2175 == -1) {
            this.field2175 = this.field2152 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("hb.ar(Lty;I)V")
    public void method3596(class514 arg0) {
        while (true) {
            int var2 = arg0.method8244();
            if (var2 == 0) {
                return;
            }
            this.method3586(arg0, var2);
        }
    }

    @ObfuscatedName("hb.am(Lty;II)V")
    public void method3586(class514 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8244();
            if (var3 > 0) {
                if (this.field2143 == null || field2151) {
                    this.field2168 = new int[var3];
                    this.field2143 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2143[var4] = arg0.method8246();
                        this.field2168[var4] = arg0.method8244();
                    }
                } else {
                    arg0.field5072 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2134 = arg0.method8369();
        } else if (arg1 == 5) {
            int var5 = arg0.method8244();
            if (var5 > 0) {
                if (this.field2143 == null || field2151) {
                    this.field2168 = null;
                    this.field2143 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2143[var6] = arg0.method8246();
                    }
                } else {
                    arg0.field5072 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2170 = arg0.method8244();
        } else if (arg1 == 15) {
            this.field2174 = arg0.method8244();
        } else if (arg1 == 17) {
            this.field2152 = 0;
            this.field2135 = false;
        } else if (arg1 == 18) {
            this.field2135 = false;
        } else if (arg1 == 19) {
            this.field2154 = arg0.method8244();
        } else if (arg1 == 21) {
            this.field2155 = 0;
        } else if (arg1 == 22) {
            this.field2156 = true;
        } else if (arg1 == 23) {
            this.field2148 = true;
        } else if (arg1 == 24) {
            this.field2160 = arg0.method8246();
            if (this.field2160 == 65535) {
                this.field2160 = -1;
            }
        } else if (arg1 == 27) {
            this.field2152 = 1;
        } else if (arg1 == 28) {
            this.field2159 = arg0.method8244();
        } else if (arg1 == 29) {
            this.field2150 = arg0.method8264();
        } else if (arg1 == 39) {
            this.field2178 = arg0.method8264() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2162[arg1 - 30] = arg0.method8369();
            if (this.field2162[arg1 - 30].equalsIgnoreCase(class353.field4029)) {
                this.field2162[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8244();
            this.field2146 = new short[var7];
            this.field2145 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2146[var8] = (short) arg0.method8246();
                this.field2145[var8] = (short) arg0.method8246();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8244();
            this.field2153 = new short[var9];
            this.field2149 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2153[var10] = (short) arg0.method8246();
                this.field2149[var10] = (short) arg0.method8246();
            }
        } else if (arg1 == 61) {
            arg0.method8246();
        } else if (arg1 == 62) {
            this.field2165 = true;
        } else if (arg1 == 64) {
            this.field2166 = false;
        } else if (arg1 == 65) {
            this.field2167 = arg0.method8246();
        } else if (arg1 == 66) {
            this.field2157 = arg0.method8246();
        } else if (arg1 == 67) {
            this.field2169 = arg0.method8246();
        } else if (arg1 == 68) {
            this.field2164 = arg0.method8246();
        } else if (arg1 == 69) {
            arg0.method8244();
        } else if (arg1 == 70) {
            this.field2158 = arg0.method8497();
        } else if (arg1 == 71) {
            this.field2171 = arg0.method8497();
        } else if (arg1 == 72) {
            this.field2172 = arg0.method8497();
        } else if (arg1 == 73) {
            this.field2173 = true;
        } else if (arg1 == 74) {
            this.field2141 = true;
        } else if (arg1 == 75) {
            this.field2175 = arg0.method8244();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2177 = arg0.method8246();
            if (this.field2177 == 65535) {
                this.field2177 = -1;
            }
            this.field2147 = arg0.method8246();
            if (this.field2147 == 65535) {
                this.field2147 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8246();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8244();
            this.field2176 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2176[var15] = arg0.method8246();
                if (this.field2176[var15] == 65535) {
                    this.field2176[var15] = -1;
                }
            }
            this.field2176[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2179 = arg0.method8246();
            this.field2180 = arg0.method8244();
        } else if (arg1 == 79) {
            this.field2161 = arg0.method8246();
            this.field2182 = arg0.method8246();
            this.field2180 = arg0.method8244();
            int var11 = arg0.method8244();
            this.field2183 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2183[var12] = arg0.method8246();
            }
        } else if (arg1 == 81) {
            this.field2155 = arg0.method8244() * 256;
        } else if (arg1 == 82) {
            this.field2163 = arg0.method8246();
        } else if (arg1 == 89) {
            this.field2184 = false;
        } else if (arg1 == 249) {
            this.field2185 = class192.method2956(arg0, this.field2185);
        }
    }

    @ObfuscatedName("hb.as(II)Z")
    public final boolean method3615(int arg0) {
        if (this.field2168 != null) {
            for (int var4 = 0; var4 < this.field2168.length; var4++) {
                if (this.field2168[var4] == arg0) {
                    return Statics.field2136.method6190(this.field2143[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2143 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2143.length; var3++) {
                var2 &= Statics.field2136.method6190(this.field2143[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hb.aj(B)Z")
    public final boolean method3594() {
        if (this.field2143 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2143.length; var2++) {
            var1 &= Statics.field2136.method6190(this.field2143[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("hb.ag(II[[IIIIB)Lit;")
    public final class234 method3601(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2168 == null) {
            var7 = (long) ((this.field2142 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2142 << 10) + (arg0 << 3) + arg1);
        }
        class234 var9 = (class234) field2139.method5152(var7);
        if (var9 == null) {
            class223 var10 = this.method3591(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2156) {
                var10.field2434 = (short) (this.field2150 + 64);
                var10.field2446 = (short) (this.field2178 + 768);
                var10.method3955();
                var9 = var10;
            } else {
                var9 = var10.method3950(this.field2150 + 64, this.field2178 + 768, -50, -10, -50);
            }
            field2139.method5149(var9, var7);
        }
        if (this.field2156) {
            var9 = ((class223) var9).method3934();
        }
        if (this.field2155 >= 0) {
            if (var9 instanceof class241) {
                var9 = ((class241) var9).method4422(arg2, arg3, arg4, arg5, true, this.field2155);
            } else if (var9 instanceof class223) {
                var9 = ((class223) var9).method3997(arg2, arg3, arg4, arg5, true, this.field2155);
            }
        }
        return var9;
    }

    @ObfuscatedName("hb.az(II[[IIIII)Ljo;")
    public final class241 method3585(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2168 == null) {
            var7 = (long) ((this.field2142 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2142 << 10) + (arg0 << 3) + arg1);
        }
        class241 var9 = (class241) field2140.method5152(var7);
        if (var9 == null) {
            class223 var10 = this.method3591(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3950(this.field2150 + 64, this.field2178 + 768, -50, -10, -50);
            field2140.method5149(var9, var7);
        }
        if (this.field2155 >= 0) {
            var9 = var9.method4422(arg2, arg3, arg4, arg5, true, this.field2155);
        }
        return var9;
    }

    @ObfuscatedName("hb.av(II[[IIIILig;II)Ljo;")
    public final class241 method3590(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class210 arg6, int arg7) {
        long var9;
        if (this.field2168 == null) {
            var9 = (long) ((this.field2142 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2142 << 10) + (arg0 << 3) + arg1);
        }
        class241 var11 = (class241) field2140.method5152(var9);
        if (var11 == null) {
            class223 var12 = this.method3591(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3950(this.field2150 + 64, this.field2178 + 768, -50, -10, -50);
            field2140.method5149(var11, var9);
        }
        if (arg6 == null && this.field2155 == -1) {
            return var11;
        }
        class241 var13;
        if (arg6 == null) {
            var13 = var11.method4423(true);
        } else {
            var13 = arg6.method3733(var11, arg7, arg1);
        }
        if (this.field2155 >= 0) {
            var13 = var13.method4422(arg2, arg3, arg4, arg5, false, this.field2155);
        }
        return var13;
    }

    @ObfuscatedName("hb.ap(III)Lie;")
    public final class223 method3591(int arg0, int arg1) {
        class223 var3 = null;
        if (this.field2168 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2143 == null) {
                return null;
            }
            boolean var4 = this.field2165;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2143.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2143[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class223) field2144.method5152((long) var7);
                if (var3 == null) {
                    var3 = class223.method3926(Statics.field2136, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3957();
                    }
                    field2144.method5149(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2181[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class223(field2181, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2168.length; var9++) {
                if (this.field2168[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2143[var8];
            boolean var11 = this.field2165 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class223) field2144.method5152((long) var10);
            if (var3 == null) {
                var3 = class223.method3926(Statics.field2136, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3957();
                }
                field2144.method5149(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2167 == 128 && this.field2157 == 128 && this.field2169 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2158 == 0 && this.field2171 == 0 && this.field2172 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class223 var14 = new class223(var3, arg1 == 0 && !var12 && !var13, this.field2146 == null, this.field2153 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3940(256);
            var14.method3978(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3937();
        } else if (var15 == 2) {
            var14.method3938();
        } else if (var15 == 3) {
            var14.method3939();
        }
        if (this.field2146 != null) {
            for (int var16 = 0; var16 < this.field2146.length; var16++) {
                var14.method3942(this.field2146[var16], this.field2145[var16]);
            }
        }
        if (this.field2153 != null) {
            for (int var17 = 0; var17 < this.field2153.length; var17++) {
                var14.method3943(this.field2153[var17], this.field2149[var17]);
            }
        }
        if (var12) {
            var14.method3945(this.field2167, this.field2157, this.field2169);
        }
        if (var13) {
            var14.method3978(this.field2158, this.field2171, this.field2172);
        }
        return var14;
    }

    @ObfuscatedName("hb.aq(I)Lhb;")
    public final class207 method3592() {
        int var1 = -1;
        if (this.field2177 != -1) {
            var1 = class323.method4655(this.field2177);
        } else if (this.field2147 != -1) {
            var1 = class323.field3532[this.field2147];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2176.length - 1) {
            var2 = this.field2176[var1];
        } else {
            var2 = this.field2176[this.field2176.length - 1];
        }
        return var2 == -1 ? null : Statics.method2211(var2);
    }

    @ObfuscatedName("hb.at(IIB)I")
    public int method3593(int arg0, int arg1) {
        return class192.method3237(this.field2185, arg0, arg1);
    }

    @ObfuscatedName("hb.ah(ILjava/lang/String;S)Ljava/lang/String;")
    public String method3616(int arg0, String arg1) {
        class489 var3 = this.field2185;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class471 var5 = (class471) var3.method7961((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field4815;
            }
        }
        return var4;
    }

    @ObfuscatedName("hb.ax(B)Z")
    public boolean method3595() {
        if (this.field2176 == null) {
            return this.field2179 != -1 || this.field2183 != null;
        }
        for (int var1 = 0; var1 < this.field2176.length; var1++) {
            if (this.field2176[var1] != -1) {
                class207 var2 = Statics.method2211(this.field2176[var1]);
                if (var2.field2179 != -1 || var2.field2183 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
