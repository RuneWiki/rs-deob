package deob;

@ObfuscatedName("iq")
public class class210 extends class500 {

    @ObfuscatedName("iq.az")
    public static class312 field2117 = new class312(64);

    @ObfuscatedName("iq.af")
    public static class312 field2118 = new class312(50);

    @ObfuscatedName("iq.aa")
    public int field2119;

    @ObfuscatedName("iq.at")
    public String field2138 = class378.field4097;

    @ObfuscatedName("iq.ab")
    public int field2121 = 1;

    @ObfuscatedName("iq.ac")
    public int[] field2158;

    @ObfuscatedName("iq.ao")
    public int[] field2123;

    @ObfuscatedName("iq.ah")
    public int field2124 = -1;

    @ObfuscatedName("iq.av")
    public int field2122 = -1;

    @ObfuscatedName("iq.aq")
    public int field2115 = -1;

    @ObfuscatedName("iq.ap")
    public int field2127 = -1;

    @ObfuscatedName("iq.ae")
    public int field2148 = -1;

    @ObfuscatedName("iq.ax")
    public int field2129 = -1;

    @ObfuscatedName("iq.ay")
    public int field2130 = -1;

    @ObfuscatedName("iq.au")
    public int field2131 = -1;

    @ObfuscatedName("iq.as")
    public int field2132 = -1;

    @ObfuscatedName("iq.aw")
    public int field2162 = -1;

    @ObfuscatedName("iq.ad")
    public int field2134 = -1;

    @ObfuscatedName("iq.ai")
    public int field2135 = -1;

    @ObfuscatedName("iq.an")
    public int field2136 = -1;

    @ObfuscatedName("iq.am")
    public int field2137 = -1;

    @ObfuscatedName("iq.ar")
    public int field2125 = -1;

    @ObfuscatedName("iq.ag")
    public short[] field2146;

    @ObfuscatedName("iq.bs")
    public short[] field2140;

    @ObfuscatedName("iq.bf")
    public short[] field2147;

    @ObfuscatedName("iq.bo")
    public short[] field2151;

    @ObfuscatedName("iq.bi")
    public String[] field2143 = new String[5];

    @ObfuscatedName("iq.bt")
    public boolean field2144 = true;

    @ObfuscatedName("iq.bn")
    public int field2120 = -1;

    @ObfuscatedName("iq.bw")
    public int field2126 = 128;

    @ObfuscatedName("iq.bl")
    public int field2128 = 128;

    @ObfuscatedName("iq.be")
    public boolean field2150 = false;

    @ObfuscatedName("iq.bg")
    public int field2149 = 0;

    @ObfuscatedName("iq.bu")
    public int field2141 = 0;

    @ObfuscatedName("iq.bh")
    public int field2133 = 32;

    @ObfuscatedName("iq.bk")
    public int[] field2152;

    @ObfuscatedName("iq.bp")
    public int field2153 = -1;

    @ObfuscatedName("iq.br")
    public int field2139 = -1;

    @ObfuscatedName("iq.bx")
    public boolean field2155 = true;

    @ObfuscatedName("iq.bd")
    public boolean field2156 = true;

    @ObfuscatedName("iq.bv")
    public boolean field2157 = false;

    @ObfuscatedName("iq.bm")
    public boolean field2145 = false;

    @ObfuscatedName("iq.bq")
    public int[] field2159 = null;

    @ObfuscatedName("iq.bj")
    public short[] field2160 = null;

    @ObfuscatedName("iq.bc")
    public class519 field2161;

    @ObfuscatedName("fr.ak(IB)Liq;")
    public static class210 method2967(int arg0) {
        class210 var1 = (class210) field2117.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2116.method6573(9, arg0);
        class210 var3 = new class210();
        var3.field2119 = arg0;
        if (var2 != null) {
            var3.method3659(new class546(var2));
        }
        var3.method3658();
        field2117.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iq.al(I)V")
    public void method3658() {
    }

    @ObfuscatedName("iq.aj(Lua;I)V")
    public void method3659(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method3660(arg0, var2);
        }
    }

    @ObfuscatedName("iq.az(Lua;II)V")
    public void method3660(class546 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8796();
            this.field2158 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2158[var4] = arg0.method8798();
            }
        } else if (arg1 == 2) {
            this.field2138 = arg0.method8806();
        } else if (arg1 == 12) {
            this.field2121 = arg0.method8796();
        } else if (arg1 == 13) {
            this.field2124 = arg0.method8798();
        } else if (arg1 == 14) {
            this.field2127 = arg0.method8798();
        } else if (arg1 == 15) {
            this.field2122 = arg0.method8798();
        } else if (arg1 == 16) {
            this.field2115 = arg0.method8798();
        } else if (arg1 == 17) {
            this.field2127 = arg0.method8798();
            this.field2148 = arg0.method8798();
            this.field2129 = arg0.method8798();
            this.field2130 = arg0.method8798();
        } else if (arg1 == 18) {
            arg0.method8798();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2143[arg1 - 30] = arg0.method8806();
            if (this.field2143[arg1 - 30].equalsIgnoreCase(class378.field4092)) {
                this.field2143[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8796();
            this.field2146 = new short[var5];
            this.field2140 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2146[var6] = (short) arg0.method8798();
                this.field2140[var6] = (short) arg0.method8798();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8796();
            this.field2147 = new short[var7];
            this.field2151 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2147[var8] = (short) arg0.method8798();
                this.field2151[var8] = (short) arg0.method8798();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8796();
            this.field2123 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2123[var10] = arg0.method8798();
            }
        } else if (arg1 == 93) {
            this.field2144 = false;
        } else if (arg1 == 95) {
            this.field2120 = arg0.method8798();
        } else if (arg1 == 97) {
            this.field2126 = arg0.method8798();
        } else if (arg1 == 98) {
            this.field2128 = arg0.method8798();
        } else if (arg1 == 99) {
            this.field2150 = true;
        } else if (arg1 == 100) {
            this.field2149 = arg0.method8797();
        } else if (arg1 == 101) {
            this.field2141 = arg0.method8797();
        } else if (arg1 == 102) {
            int var11 = arg0.method8796();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2159 = new int[var12];
            this.field2160 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2159[var14] = -1;
                    this.field2160[var14] = -1;
                } else {
                    this.field2159[var14] = arg0.method8814();
                    this.field2160[var14] = (short) arg0.method8811();
                }
            }
        } else if (arg1 == 103) {
            this.field2133 = arg0.method8798();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2153 = arg0.method8798();
            if (this.field2153 == 65535) {
                this.field2153 = -1;
            }
            this.field2139 = arg0.method8798();
            if (this.field2139 == 65535) {
                this.field2139 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8798();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8796();
            this.field2152 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2152[var17] = arg0.method8798();
                if (this.field2152[var17] == 65535) {
                    this.field2152[var17] = -1;
                }
            }
            this.field2152[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2155 = false;
        } else if (arg1 == 109) {
            this.field2156 = false;
        } else if (arg1 == 114) {
            this.field2131 = arg0.method8798();
        } else if (arg1 == 115) {
            this.field2131 = arg0.method8798();
            this.field2132 = arg0.method8798();
            this.field2162 = arg0.method8798();
            this.field2134 = arg0.method8798();
        } else if (arg1 == 116) {
            this.field2135 = arg0.method8798();
        } else if (arg1 == 117) {
            this.field2135 = arg0.method8798();
            this.field2136 = arg0.method8798();
            this.field2137 = arg0.method8798();
            this.field2125 = arg0.method8798();
        } else if (arg1 == 122) {
            this.field2157 = true;
        } else if (arg1 == 123) {
            this.field2145 = true;
        } else if (arg1 == 249) {
            this.field2161 = class203.method2113(arg0, this.field2161);
        }
    }

    @ObfuscatedName("iq.af(Lic;ILic;ILio;B)Lkb;")
    public final class264 method3661(class227 arg0, int arg1, class227 arg2, int arg3, class209 arg4) {
        if (this.field2152 != null) {
            class210 var6 = this.method3664();
            return var6 == null ? null : var6.method3661(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2119;
        if (arg4 != null) {
            var7 |= arg4.field2111 << 16;
        }
        class264 var9 = (class264) field2118.method5570(var7);
        if (var9 == null) {
            class243 var10 = this.method3715(this.field2158, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4252(this.field2149 + 64, this.field2141 * 5 + 850, -30, -50, -30);
            field2118.method5564(var9, var7);
        }
        class264 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method4015(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method4012(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4842(true);
        } else {
            var11 = arg2.method4012(var9, arg3);
        }
        if (this.field2126 != 128 || this.field2128 != 128) {
            var11.method4822(this.field2126, this.field2128, this.field2126);
        }
        return var11;
    }

    @ObfuscatedName("iq.aa(Lio;I)Ljb;")
    public final class243 method3662(class209 arg0) {
        if (this.field2152 == null) {
            return this.method3715(this.field2123, arg0);
        } else {
            class210 var2 = this.method3664();
            return var2 == null ? null : var2.method3662(arg0);
        }
    }

    @ObfuscatedName("iq.at([ILio;I)Ljb;")
    public class243 method3715(int[] arg0, class209 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2110 != null) {
            var3 = arg1.field2110;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field159.method6586(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class243[] var6 = new class243[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class243.method4274(Statics.field159, var3[var7], 0);
        }
        class243 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class243(var6, var6.length);
            }
        } else {
            var8 = new class243(var6, var6.length);
        }
        if (this.field2146 != null) {
            short[] var9 = this.field2140;
            if (arg1 != null && arg1.field2114 != null) {
                var9 = arg1.field2114;
            }
            for (int var10 = 0; var10 < this.field2146.length; var10++) {
                var8.method4253(this.field2146[var10], var9[var10]);
            }
        }
        if (this.field2147 != null) {
            short[] var11 = this.field2151;
            if (arg1 != null && arg1.field2112 != null) {
                var11 = arg1.field2112;
            }
            for (int var12 = 0; var12 < this.field2147.length; var12++) {
                var8.method4280(this.field2147[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("iq.ab(I)Liq;")
    public final class210 method3664() {
        int var1 = -1;
        if (this.field2153 != -1) {
            var1 = class346.method5576(this.field2153);
        } else if (this.field2139 != -1) {
            var1 = class346.field3710[this.field2139];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2152.length - 1) {
            var2 = this.field2152[var1];
        } else {
            var2 = this.field2152[this.field2152.length - 1];
        }
        return var2 == -1 ? null : method2967(var2);
    }

    @ObfuscatedName("iq.ac(B)I")
    public final int method3680() {
        if (this.field2152 != null) {
            class210 var1 = this.method3664();
            if (var1 != null) {
                return var1.field2119;
            }
        }
        return -1;
    }

    @ObfuscatedName("iq.ao(B)Z")
    public boolean method3666() {
        if (this.field2152 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2153 != -1) {
            var1 = class346.method5576(this.field2153);
        } else if (this.field2139 != -1) {
            var1 = class346.field3710[this.field2139];
        }
        if (var1 >= 0 && var1 < this.field2152.length) {
            return this.field2152[var1] != -1;
        } else {
            return this.field2152[this.field2152.length - 1] != -1;
        }
    }

    @ObfuscatedName("iq.ah(III)I")
    public int method3686(int arg0, int arg1) {
        class519 var3 = this.field2161;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class503 var5 = (class503) var3.method8506((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field5047;
            }
        }
        return var4;
    }

    @ObfuscatedName("iq.av(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3668(int arg0, String arg1) {
        return class203.method2600(this.field2161, arg0, arg1);
    }

    @ObfuscatedName("iq.aq(S)Z")
    public boolean method3677() {
        return this.field2159 != null && this.field2160 != null;
    }

    @ObfuscatedName("iq.ap(B)[I")
    public int[] method3657() {
        return this.field2159;
    }

    @ObfuscatedName("iq.ae(IB)I")
    public int method3671(int arg0) {
        return this.field2159 == null || arg0 >= this.field2159.length ? -1 : this.field2159[arg0];
    }

    @ObfuscatedName("iq.ax(I)[S")
    public short[] method3672() {
        return this.field2160;
    }

    @ObfuscatedName("iq.ay(II)S")
    public short method3673(int arg0) {
        return this.field2160 == null || arg0 >= this.field2160.length ? -1 : this.field2160[arg0];
    }
}
