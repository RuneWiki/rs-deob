package deob;

@ObfuscatedName("he")
public class class204 extends class488 {

    @ObfuscatedName("he.aq")
    public static boolean field2117 = false;

    @ObfuscatedName("he.ai")
    public static boolean field2119 = false;

    @ObfuscatedName("he.ar")
    public static class304 field2120 = new class304(4096);

    @ObfuscatedName("he.as")
    public static class304 field2121 = new class304(500);

    @ObfuscatedName("he.aa")
    public static class304 field2122 = new class304(30);

    @ObfuscatedName("he.az")
    public static class304 field2143 = new class304(30);

    @ObfuscatedName("he.ao")
    public static class267[] field2164 = new class267[4];

    @ObfuscatedName("he.au")
    public int field2128;

    @ObfuscatedName("he.ak")
    public int[] field2126;

    @ObfuscatedName("he.ah")
    public int[] field2127;

    @ObfuscatedName("he.aj")
    public String field2139 = class370.field4015;

    @ObfuscatedName("he.af")
    public short[] field2129;

    @ObfuscatedName("he.ax")
    public short[] field2130;

    @ObfuscatedName("he.an")
    public short[] field2142;

    @ObfuscatedName("he.ag")
    public short[] field2132;

    @ObfuscatedName("he.am")
    public int field2133 = 1;

    @ObfuscatedName("he.ad")
    public int field2134 = 1;

    @ObfuscatedName("he.at")
    public int field2135 = 2;

    @ObfuscatedName("he.ay")
    public boolean field2136 = true;

    @ObfuscatedName("he.ae")
    public int field2145 = -1;

    @ObfuscatedName("he.ac")
    public int field2138 = -1;

    @ObfuscatedName("he.ab")
    public boolean field2158 = false;

    @ObfuscatedName("he.av")
    public boolean field2169 = false;

    @ObfuscatedName("he.ap")
    public int field2141 = -1;

    @ObfuscatedName("he.bu")
    public int field2165 = 16;

    @ObfuscatedName("he.bo")
    public int field2160 = 0;

    @ObfuscatedName("he.bd")
    public int field2144 = 0;

    @ObfuscatedName("he.bi")
    public String[] field2116 = new String[5];

    @ObfuscatedName("he.bq")
    public int field2146 = -1;

    @ObfuscatedName("he.ba")
    public int field2147 = -1;

    @ObfuscatedName("he.bt")
    public boolean field2148 = false;

    @ObfuscatedName("he.bk")
    public boolean field2149 = true;

    @ObfuscatedName("he.bm")
    public int field2150 = 128;

    @ObfuscatedName("he.bw")
    public int field2151 = 128;

    @ObfuscatedName("he.bv")
    public int field2152 = 128;

    @ObfuscatedName("he.by")
    public int field2153 = 0;

    @ObfuscatedName("he.bb")
    public int field2154 = 0;

    @ObfuscatedName("he.bn")
    public int field2155 = 0;

    @ObfuscatedName("he.br")
    public boolean field2140 = false;

    @ObfuscatedName("he.bp")
    public boolean field2157 = false;

    @ObfuscatedName("he.bf")
    public int field2166 = -1;

    @ObfuscatedName("he.bg")
    public int[] field2159;

    @ObfuscatedName("he.be")
    public int field2123 = -1;

    @ObfuscatedName("he.bc")
    public int field2125 = -1;

    @ObfuscatedName("he.bz")
    public int field2162 = -1;

    @ObfuscatedName("he.bh")
    public int field2163 = 0;

    @ObfuscatedName("he.bs")
    public int field2131 = 0;

    @ObfuscatedName("he.bj")
    public int field2124 = 0;

    @ObfuscatedName("he.bl")
    public int field2156 = 0;

    @ObfuscatedName("he.bx")
    public int[] field2167;

    @ObfuscatedName("he.cs")
    public boolean field2168 = true;

    @ObfuscatedName("he.ch")
    public class507 field2137;

    @ObfuscatedName("eo.aq(II)Lhe;")
    public static class204 method2849(int arg0) {
        class204 var1 = (class204) field2120.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2161.method6489(6, arg0);
        class204 var3 = new class204();
        var3.field2128 = arg0;
        if (var2 != null) {
            var3.method3590(new class534(var2));
        }
        var3.method3589();
        if (var3.field2157) {
            var3.field2135 = 0;
            var3.field2136 = false;
        }
        field2120.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("he.aw(B)V")
    public void method3589() {
        if (this.field2145 == -1) {
            this.field2145 = 0;
            if (this.field2126 != null && (this.field2127 == null || this.field2127[0] == 10)) {
                this.field2145 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2116[var1] != null) {
                    this.field2145 = 1;
                }
            }
        }
        if (this.field2166 == -1) {
            this.field2166 = this.field2135 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("he.al(Luq;B)V")
    public void method3590(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3591(arg0, var2);
        }
    }

    @ObfuscatedName("he.ai(Luq;II)V")
    public void method3591(class534 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8591();
            if (var3 > 0) {
                if (this.field2126 == null || field2117) {
                    this.field2127 = new int[var3];
                    this.field2126 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2126[var4] = arg0.method8593();
                        this.field2127[var4] = arg0.method8591();
                    }
                } else {
                    arg0.field5200 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2139 = arg0.method8741();
        } else if (arg1 == 5) {
            int var5 = arg0.method8591();
            if (var5 > 0) {
                if (this.field2126 == null || field2117) {
                    this.field2127 = null;
                    this.field2126 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2126[var6] = arg0.method8593();
                    }
                } else {
                    arg0.field5200 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2133 = arg0.method8591();
        } else if (arg1 == 15) {
            this.field2134 = arg0.method8591();
        } else if (arg1 == 17) {
            this.field2135 = 0;
            this.field2136 = false;
        } else if (arg1 == 18) {
            this.field2136 = false;
        } else if (arg1 == 19) {
            this.field2145 = arg0.method8591();
        } else if (arg1 == 21) {
            this.field2138 = 0;
        } else if (arg1 == 22) {
            this.field2158 = true;
        } else if (arg1 == 23) {
            this.field2169 = true;
        } else if (arg1 == 24) {
            this.field2141 = arg0.method8593();
            if (this.field2141 == 65535) {
                this.field2141 = -1;
            }
        } else if (arg1 == 27) {
            this.field2135 = 1;
        } else if (arg1 == 28) {
            this.field2165 = arg0.method8591();
        } else if (arg1 == 29) {
            this.field2160 = arg0.method8592();
        } else if (arg1 == 39) {
            this.field2144 = arg0.method8592() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2116[arg1 - 30] = arg0.method8741();
            if (this.field2116[arg1 - 30].equalsIgnoreCase(class370.field4010)) {
                this.field2116[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8591();
            this.field2129 = new short[var7];
            this.field2130 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2129[var8] = (short) arg0.method8593();
                this.field2130[var8] = (short) arg0.method8593();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8591();
            this.field2142 = new short[var9];
            this.field2132 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2142[var10] = (short) arg0.method8593();
                this.field2132[var10] = (short) arg0.method8593();
            }
        } else if (arg1 == 61) {
            arg0.method8593();
        } else if (arg1 == 62) {
            this.field2148 = true;
        } else if (arg1 == 64) {
            this.field2149 = false;
        } else if (arg1 == 65) {
            this.field2150 = arg0.method8593();
        } else if (arg1 == 66) {
            this.field2151 = arg0.method8593();
        } else if (arg1 == 67) {
            this.field2152 = arg0.method8593();
        } else if (arg1 == 68) {
            this.field2147 = arg0.method8593();
        } else if (arg1 == 69) {
            arg0.method8591();
        } else if (arg1 == 70) {
            this.field2153 = arg0.method8594();
        } else if (arg1 == 71) {
            this.field2154 = arg0.method8594();
        } else if (arg1 == 72) {
            this.field2155 = arg0.method8594();
        } else if (arg1 == 73) {
            this.field2140 = true;
        } else if (arg1 == 74) {
            this.field2157 = true;
        } else if (arg1 == 75) {
            this.field2166 = arg0.method8591();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2123 = arg0.method8593();
            if (this.field2123 == 65535) {
                this.field2123 = -1;
            }
            this.field2125 = arg0.method8593();
            if (this.field2125 == 65535) {
                this.field2125 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8593();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8591();
            this.field2159 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2159[var15] = arg0.method8593();
                if (this.field2159[var15] == 65535) {
                    this.field2159[var15] = -1;
                }
            }
            this.field2159[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2162 = arg0.method8593();
            this.field2163 = arg0.method8591();
            this.field2131 = field2119 ? arg0.method8591() : 0;
        } else if (arg1 == 79) {
            this.field2124 = arg0.method8593();
            this.field2156 = arg0.method8593();
            this.field2163 = arg0.method8591();
            this.field2131 = field2119 ? arg0.method8591() : 0;
            int var11 = arg0.method8591();
            this.field2167 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2167[var12] = arg0.method8593();
            }
        } else if (arg1 == 81) {
            this.field2138 = arg0.method8591() * 256;
        } else if (arg1 == 82) {
            this.field2146 = arg0.method8593();
        } else if (arg1 == 89) {
            this.field2168 = false;
        } else if (arg1 == 249) {
            this.field2137 = class183.method5700(arg0, this.field2137);
        }
    }

    @ObfuscatedName("he.ar(II)Z")
    public final boolean method3592(int arg0) {
        if (this.field2127 != null) {
            for (int var4 = 0; var4 < this.field2127.length; var4++) {
                if (this.field2127[var4] == arg0) {
                    return Statics.field2118.method6420(this.field2126[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2126 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2126.length; var3++) {
                var2 &= Statics.field2118.method6420(this.field2126[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("he.as(B)Z")
    public final boolean method3593() {
        if (this.field2126 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2126.length; var2++) {
            var1 &= Statics.field2118.method6420(this.field2126[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("he.aa(II[[IIIII)Lky;")
    public final class278 method3594(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2127 == null) {
            var7 = (long) ((this.field2128 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2128 << 10) + (arg0 << 3) + arg1);
        }
        class278 var9 = (class278) field2122.method5414(var7);
        if (var9 == null) {
            class267 var10 = this.method3627(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2158) {
                var10.field2746 = (short) (this.field2160 + 64);
                var10.field2721 = (short) (this.field2144 + 768);
                var10.method4662();
                var9 = var10;
            } else {
                var9 = var10.method4723(this.field2160 + 64, this.field2144 + 768, -50, -10, -50);
            }
            field2122.method5421(var9, var7);
        }
        if (this.field2158) {
            var9 = ((class267) var9).method4650();
        }
        if (this.field2138 >= 0) {
            if (var9 instanceof class285) {
                var9 = ((class285) var9).method5182(arg2, arg3, arg4, arg5, true, this.field2138);
            } else if (var9 instanceof class267) {
                var9 = ((class267) var9).method4651(arg2, arg3, arg4, arg5, true, this.field2138);
            }
        }
        return var9;
    }

    @ObfuscatedName("he.az(II[[IIIII)Lkz;")
    public final class285 method3595(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2127 == null) {
            var7 = (long) ((this.field2128 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2128 << 10) + (arg0 << 3) + arg1);
        }
        class285 var9 = (class285) field2143.method5414(var7);
        if (var9 == null) {
            class267 var10 = this.method3627(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4723(this.field2160 + 64, this.field2144 + 768, -50, -10, -50);
            field2143.method5421(var9, var7);
        }
        if (this.field2138 >= 0) {
            var9 = var9.method5182(arg2, arg3, arg4, arg5, true, this.field2138);
        }
        return var9;
    }

    @ObfuscatedName("he.ao(II[[IIIILhs;IB)Lkz;")
    public final class285 method3596(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class207 arg6, int arg7) {
        long var9;
        if (this.field2127 == null) {
            var9 = (long) ((this.field2128 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2128 << 10) + (arg0 << 3) + arg1);
        }
        class285 var11 = (class285) field2143.method5414(var9);
        if (var11 == null) {
            class267 var12 = this.method3627(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4723(this.field2160 + 64, this.field2144 + 768, -50, -10, -50);
            field2143.method5421(var11, var9);
        }
        if (arg6 == null && this.field2138 == -1) {
            return var11;
        }
        class285 var13;
        if (arg6 == null) {
            var13 = var11.method5150(true);
        } else {
            var13 = arg6.method3738(var11, arg7, arg1);
        }
        if (this.field2138 >= 0) {
            var13 = var13.method5182(arg2, arg3, arg4, arg5, false, this.field2138);
        }
        return var13;
    }

    @ObfuscatedName("he.au(III)Lkf;")
    public final class267 method3627(int arg0, int arg1) {
        class267 var3 = null;
        if (this.field2127 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2126 == null) {
                return null;
            }
            boolean var4 = this.field2148;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2126.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2126[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class267) field2121.method5414((long) var7);
                if (var3 == null) {
                    var3 = class267.method4644(Statics.field2118, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4725();
                    }
                    field2121.method5421(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2164[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class267(field2164, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2127.length; var9++) {
                if (this.field2127[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2126[var8];
            boolean var11 = this.field2148 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class267) field2121.method5414((long) var10);
            if (var3 == null) {
                var3 = class267.method4644(Statics.field2118, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4725();
                }
                field2121.method5421(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2150 == 128 && this.field2151 == 128 && this.field2152 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2153 == 0 && this.field2154 == 0 && this.field2155 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class267 var14 = new class267(var3, arg1 == 0 && !var12 && !var13, this.field2129 == null, this.field2142 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4656(256);
            var14.method4667(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4653();
        } else if (var15 == 2) {
            var14.method4646();
        } else if (var15 == 3) {
            var14.method4655();
        }
        if (this.field2129 != null) {
            for (int var16 = 0; var16 < this.field2129.length; var16++) {
                var14.method4664(this.field2129[var16], this.field2130[var16]);
            }
        }
        if (this.field2142 != null) {
            for (int var17 = 0; var17 < this.field2142.length; var17++) {
                var14.method4666(this.field2142[var17], this.field2132[var17]);
            }
        }
        if (var12) {
            var14.method4661(this.field2150, this.field2151, this.field2152);
        }
        if (var13) {
            var14.method4667(this.field2153, this.field2154, this.field2155);
        }
        return var14;
    }

    @ObfuscatedName("he.ak(I)Lhe;")
    public final class204 method3597() {
        int var1 = -1;
        if (this.field2123 != -1) {
            var1 = class338.method5735(this.field2123);
        } else if (this.field2125 != -1) {
            var1 = class338.field3620[this.field2125];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2159.length - 1) {
            var2 = this.field2159[var1];
        } else {
            var2 = this.field2159[this.field2159.length - 1];
        }
        return var2 == -1 ? null : method2849(var2);
    }

    @ObfuscatedName("he.ah(III)I")
    public int method3616(int arg0, int arg1) {
        class507 var3 = this.field2137;
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

    @ObfuscatedName("he.aj(ILjava/lang/String;B)Ljava/lang/String;")
    public String method3624(int arg0, String arg1) {
        class507 var3 = this.field2137;
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

    @ObfuscatedName("fb.af(I)V")
    public static void method3065() {
        field2120.method5418();
        field2121.method5418();
        field2122.method5418();
        field2143.method5418();
    }

    @ObfuscatedName("he.ax(I)Z")
    public boolean method3588() {
        if (this.field2159 == null) {
            return this.field2162 != -1 || this.field2167 != null;
        }
        for (int var1 = 0; var1 < this.field2159.length; var1++) {
            if (this.field2159[var1] != -1) {
                class204 var2 = method2849(this.field2159[var1]);
                if (var2.field2162 != -1 || var2.field2167 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
