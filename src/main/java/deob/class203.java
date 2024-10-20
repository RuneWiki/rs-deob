package deob;

@ObfuscatedName("hu")
public class class203 extends class439 {

    @ObfuscatedName("hu.aj")
    public static boolean field2171 = false;

    @ObfuscatedName("hu.ab")
    public static class276 field2127 = new class276(4096);

    @ObfuscatedName("hu.an")
    public static class276 field2128 = new class276(500);

    @ObfuscatedName("hu.ao")
    public static class276 field2147 = new class276(30);

    @ObfuscatedName("hu.av")
    public static class276 field2130 = new class276(30);

    @ObfuscatedName("hu.aq")
    public static class215[] field2131 = new class215[4];

    @ObfuscatedName("hu.ap")
    public int field2168;

    @ObfuscatedName("hu.ar")
    public int[] field2133;

    @ObfuscatedName("hu.ak")
    public int[] field2155;

    @ObfuscatedName("hu.ax")
    public String field2142 = class333.field3824;

    @ObfuscatedName("hu.as")
    public short[] field2134;

    @ObfuscatedName("hu.ay")
    public short[] field2137;

    @ObfuscatedName("hu.am")
    public short[] field2138;

    @ObfuscatedName("hu.az")
    public short[] field2148;

    @ObfuscatedName("hu.ae")
    public int field2174 = 1;

    @ObfuscatedName("hu.au")
    public int field2141 = 1;

    @ObfuscatedName("hu.ag")
    public int field2124 = 2;

    @ObfuscatedName("hu.at")
    public boolean field2143 = true;

    @ObfuscatedName("hu.af")
    public int field2144 = -1;

    @ObfuscatedName("hu.ai")
    public int field2145 = -1;

    @ObfuscatedName("hu.aw")
    public boolean field2146 = false;

    @ObfuscatedName("hu.aa")
    public boolean field2158 = false;

    @ObfuscatedName("hu.ah")
    public int field2160 = -1;

    @ObfuscatedName("hu.ad")
    public int field2139 = 16;

    @ObfuscatedName("hu.bm")
    public int field2150 = 0;

    @ObfuscatedName("hu.bv")
    public int field2151 = 0;

    @ObfuscatedName("hu.bo")
    public String[] field2166 = new String[5];

    @ObfuscatedName("hu.bs")
    public int field2153 = -1;

    @ObfuscatedName("hu.bg")
    public int field2154 = -1;

    @ObfuscatedName("hu.bh")
    public boolean field2136 = false;

    @ObfuscatedName("hu.bl")
    public boolean field2156 = true;

    @ObfuscatedName("hu.bk")
    public int field2157 = 128;

    @ObfuscatedName("hu.br")
    public int field2132 = 128;

    @ObfuscatedName("hu.ba")
    public int field2159 = 128;

    @ObfuscatedName("hu.bz")
    public int field2140 = 0;

    @ObfuscatedName("hu.bq")
    public int field2161 = 0;

    @ObfuscatedName("hu.bc")
    public int field2162 = 0;

    @ObfuscatedName("hu.bt")
    public boolean field2163 = false;

    @ObfuscatedName("hu.be")
    public boolean field2164 = false;

    @ObfuscatedName("hu.bu")
    public int field2165 = -1;

    @ObfuscatedName("hu.bd")
    public int[] field2129;

    @ObfuscatedName("hu.by")
    public int field2167 = -1;

    @ObfuscatedName("hu.bp")
    public int field2125 = -1;

    @ObfuscatedName("hu.bb")
    public int field2169 = -1;

    @ObfuscatedName("hu.bx")
    public int field2170 = 0;

    @ObfuscatedName("hu.bn")
    public int field2152 = 0;

    @ObfuscatedName("hu.bj")
    public int field2172 = 0;

    @ObfuscatedName("hu.bf")
    public int[] field2173;

    @ObfuscatedName("hu.bw")
    public boolean field2149 = true;

    @ObfuscatedName("hu.bi")
    public class454 field2175;

    @ObfuscatedName("hu.al(B)V")
    public void method3539() {
        if (this.field2144 == -1) {
            this.field2144 = 0;
            if (this.field2133 != null && (this.field2155 == null || this.field2155[0] == 10)) {
                this.field2144 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2166[var1] != null) {
                    this.field2144 = 1;
                }
            }
        }
        if (this.field2165 == -1) {
            this.field2165 = this.field2124 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("hu.ac(Lsy;I)V")
    public void method3540(class478 arg0) {
        while (true) {
            int var2 = arg0.method7909();
            if (var2 == 0) {
                return;
            }
            this.method3541(arg0, var2);
        }
    }

    @ObfuscatedName("hu.ab(Lsy;II)V")
    public void method3541(class478 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method7909();
            if (var3 > 0) {
                if (this.field2133 == null || field2171) {
                    this.field2155 = new int[var3];
                    this.field2133 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2133[var4] = arg0.method7905();
                        this.field2155[var4] = arg0.method7909();
                    }
                } else {
                    arg0.field4904 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2142 = arg0.method7950();
        } else if (arg1 == 5) {
            int var5 = arg0.method7909();
            if (var5 > 0) {
                if (this.field2133 == null || field2171) {
                    this.field2155 = null;
                    this.field2133 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2133[var6] = arg0.method7905();
                    }
                } else {
                    arg0.field4904 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2174 = arg0.method7909();
        } else if (arg1 == 15) {
            this.field2141 = arg0.method7909();
        } else if (arg1 == 17) {
            this.field2124 = 0;
            this.field2143 = false;
        } else if (arg1 == 18) {
            this.field2143 = false;
        } else if (arg1 == 19) {
            this.field2144 = arg0.method7909();
        } else if (arg1 == 21) {
            this.field2145 = 0;
        } else if (arg1 == 22) {
            this.field2146 = true;
        } else if (arg1 == 23) {
            this.field2158 = true;
        } else if (arg1 == 24) {
            this.field2160 = arg0.method7905();
            if (this.field2160 == 65535) {
                this.field2160 = -1;
            }
        } else if (arg1 == 27) {
            this.field2124 = 1;
        } else if (arg1 == 28) {
            this.field2139 = arg0.method7909();
        } else if (arg1 == 29) {
            this.field2150 = arg0.method8163();
        } else if (arg1 == 39) {
            this.field2151 = arg0.method8163() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2166[arg1 - 30] = arg0.method7950();
            if (this.field2166[arg1 - 30].equalsIgnoreCase(class333.field3865)) {
                this.field2166[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method7909();
            this.field2134 = new short[var7];
            this.field2137 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2134[var8] = (short) arg0.method7905();
                this.field2137[var8] = (short) arg0.method7905();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method7909();
            this.field2138 = new short[var9];
            this.field2148 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2138[var10] = (short) arg0.method7905();
                this.field2148[var10] = (short) arg0.method7905();
            }
        } else if (arg1 == 61) {
            arg0.method7905();
        } else if (arg1 == 62) {
            this.field2136 = true;
        } else if (arg1 == 64) {
            this.field2156 = false;
        } else if (arg1 == 65) {
            this.field2157 = arg0.method7905();
        } else if (arg1 == 66) {
            this.field2132 = arg0.method7905();
        } else if (arg1 == 67) {
            this.field2159 = arg0.method7905();
        } else if (arg1 == 68) {
            this.field2154 = arg0.method7905();
        } else if (arg1 == 69) {
            arg0.method7909();
        } else if (arg1 == 70) {
            this.field2140 = arg0.method7882();
        } else if (arg1 == 71) {
            this.field2161 = arg0.method7882();
        } else if (arg1 == 72) {
            this.field2162 = arg0.method7882();
        } else if (arg1 == 73) {
            this.field2163 = true;
        } else if (arg1 == 74) {
            this.field2164 = true;
        } else if (arg1 == 75) {
            this.field2165 = arg0.method7909();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2167 = arg0.method7905();
            if (this.field2167 == 65535) {
                this.field2167 = -1;
            }
            this.field2125 = arg0.method7905();
            if (this.field2125 == 65535) {
                this.field2125 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method7905();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method7909();
            this.field2129 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2129[var15] = arg0.method7905();
                if (this.field2129[var15] == 65535) {
                    this.field2129[var15] = -1;
                }
            }
            this.field2129[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2169 = arg0.method7905();
            this.field2170 = arg0.method7909();
        } else if (arg1 == 79) {
            this.field2152 = arg0.method7905();
            this.field2172 = arg0.method7905();
            this.field2170 = arg0.method7909();
            int var11 = arg0.method7909();
            this.field2173 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2173[var12] = arg0.method7905();
            }
        } else if (arg1 == 81) {
            this.field2145 = arg0.method7909() * 256;
        } else if (arg1 == 82) {
            this.field2153 = arg0.method7905();
        } else if (arg1 == 89) {
            this.field2149 = false;
        } else if (arg1 == 249) {
            this.field2175 = class189.method4194(arg0, this.field2175);
        }
    }

    @ObfuscatedName("hu.an(II)Z")
    public final boolean method3548(int arg0) {
        if (this.field2155 != null) {
            for (int var4 = 0; var4 < this.field2155.length; var4++) {
                if (this.field2155[var4] == arg0) {
                    return Statics.field2126.method5862(this.field2133[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2133 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2133.length; var3++) {
                var2 &= Statics.field2126.method5862(this.field2133[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hu.ao(I)Z")
    public final boolean method3538() {
        if (this.field2133 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2133.length; var2++) {
            var1 &= Statics.field2126.method5862(this.field2133[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("hu.av(II[[IIIII)Liq;")
    public final class225 method3544(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2155 == null) {
            var7 = (long) ((this.field2168 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2168 << 10) + (arg0 << 3) + arg1);
        }
        class225 var9 = (class225) field2147.method4921(var7);
        if (var9 == null) {
            class215 var10 = this.method3547(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2146) {
                var10.field2396 = (short) (this.field2150 + 64);
                var10.field2397 = (short) (this.field2151 + 768);
                var10.method3829();
                var9 = var10;
            } else {
                var9 = var10.method3833(this.field2150 + 64, this.field2151 + 768, -50, -10, -50);
            }
            field2147.method4923(var9, var7);
        }
        if (this.field2146) {
            var9 = ((class215) var9).method3818();
        }
        if (this.field2145 >= 0) {
            if (var9 instanceof class231) {
                var9 = ((class231) var9).method4334(arg2, arg3, arg4, arg5, true, this.field2145);
            } else if (var9 instanceof class215) {
                var9 = ((class215) var9).method3819(arg2, arg3, arg4, arg5, true, this.field2145);
            }
        }
        return var9;
    }

    @ObfuscatedName("hu.aq(II[[IIIIB)Lix;")
    public final class231 method3560(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2155 == null) {
            var7 = (long) ((this.field2168 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2168 << 10) + (arg0 << 3) + arg1);
        }
        class231 var9 = (class231) field2130.method4921(var7);
        if (var9 == null) {
            class215 var10 = this.method3547(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3833(this.field2150 + 64, this.field2151 + 768, -50, -10, -50);
            field2130.method4923(var9, var7);
        }
        if (this.field2145 >= 0) {
            var9 = var9.method4334(arg2, arg3, arg4, arg5, true, this.field2145);
        }
        return var9;
    }

    @ObfuscatedName("hu.ap(II[[IIIILhx;IB)Lix;")
    public final class231 method3546(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class206 arg6, int arg7) {
        long var9;
        if (this.field2155 == null) {
            var9 = (long) ((this.field2168 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2168 << 10) + (arg0 << 3) + arg1);
        }
        class231 var11 = (class231) field2130.method4921(var9);
        if (var11 == null) {
            class215 var12 = this.method3547(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3833(this.field2150 + 64, this.field2151 + 768, -50, -10, -50);
            field2130.method4923(var11, var9);
        }
        if (arg6 == null && this.field2145 == -1) {
            return var11;
        }
        class231 var13;
        if (arg6 == null) {
            var13 = var11.method4239(true);
        } else {
            var13 = arg6.method3689(var11, arg7, arg1);
        }
        if (this.field2145 >= 0) {
            var13 = var13.method4334(arg2, arg3, arg4, arg5, false, this.field2145);
        }
        return var13;
    }

    @ObfuscatedName("hu.ar(III)Liu;")
    public final class215 method3547(int arg0, int arg1) {
        class215 var3 = null;
        if (this.field2155 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2133 == null) {
                return null;
            }
            boolean var4 = this.field2136;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2133.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2133[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class215) field2128.method4921((long) var7);
                if (var3 == null) {
                    var3 = class215.method3812(Statics.field2126, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3868();
                    }
                    field2128.method4923(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2131[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class215(field2131, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2155.length; var9++) {
                if (this.field2155[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2133[var8];
            boolean var11 = this.field2136 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class215) field2128.method4921((long) var10);
            if (var3 == null) {
                var3 = class215.method3812(Statics.field2126, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3868();
                }
                field2128.method4923(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2157 == 128 && this.field2132 == 128 && this.field2159 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2140 == 0 && this.field2161 == 0 && this.field2162 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class215 var14 = new class215(var3, arg1 == 0 && !var12 && !var13, this.field2134 == null, this.field2138 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method3823(256);
            var14.method3885(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3824();
        } else if (var15 == 2) {
            var14.method3822();
        } else if (var15 == 3) {
            var14.method3852();
        }
        if (this.field2134 != null) {
            for (int var16 = 0; var16 < this.field2134.length; var16++) {
                var14.method3817(this.field2134[var16], this.field2137[var16]);
            }
        }
        if (this.field2138 != null) {
            for (int var17 = 0; var17 < this.field2138.length; var17++) {
                var14.method3826(this.field2138[var17], this.field2148[var17]);
            }
        }
        if (var12) {
            var14.method3828(this.field2157, this.field2132, this.field2159);
        }
        if (var13) {
            var14.method3885(this.field2140, this.field2161, this.field2162);
        }
        return var14;
    }

    @ObfuscatedName("hu.ak(B)Lhu;")
    public final class203 method3545() {
        int var1 = -1;
        if (this.field2167 != -1) {
            var1 = class303.method233(this.field2167);
        } else if (this.field2125 != -1) {
            var1 = class303.field3428[this.field2125];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2129.length - 1) {
            var2 = this.field2129[var1];
        } else {
            var2 = this.field2129[this.field2129.length - 1];
        }
        return var2 == -1 ? null : Statics.method4396(var2);
    }

    @ObfuscatedName("hu.ax(III)I")
    public int method3549(int arg0, int arg1) {
        return class189.method2941(this.field2175, arg0, arg1);
    }

    @ObfuscatedName("hu.as(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3551(int arg0, String arg1) {
        return class189.method7298(this.field2175, arg0, arg1);
    }

    @ObfuscatedName("lp.ay(I)V")
    public static void method5192() {
        field2127.method4930();
        field2128.method4930();
        field2147.method4930();
        field2130.method4930();
    }

    @ObfuscatedName("hu.am(I)Z")
    public boolean method3570() {
        if (this.field2129 == null) {
            return this.field2169 != -1 || this.field2173 != null;
        }
        for (int var1 = 0; var1 < this.field2129.length; var1++) {
            if (this.field2129[var1] != -1) {
                class203 var2 = Statics.method4396(this.field2129[var1]);
                if (var2.field2169 != -1 || var2.field2173 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
