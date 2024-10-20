package deob;

@ObfuscatedName("hk")
public class class208 extends class489 {

    @ObfuscatedName("hk.at")
    public static class304 field2104 = new class304(64);

    @ObfuscatedName("hk.an")
    public static class304 field2105 = new class304(50);

    @ObfuscatedName("hk.ao")
    public int field2111;

    @ObfuscatedName("hk.ab")
    public String field2119 = class370.field4272;

    @ObfuscatedName("hk.aw")
    public int field2144 = 1;

    @ObfuscatedName("hk.ad")
    public int[] field2109;

    @ObfuscatedName("hk.al")
    public int[] field2110;

    @ObfuscatedName("hk.as")
    public int field2116 = -1;

    @ObfuscatedName("hk.ag")
    public int field2146 = -1;

    @ObfuscatedName("hk.ai")
    public int field2113 = -1;

    @ObfuscatedName("hk.ax")
    public int field2137 = -1;

    @ObfuscatedName("hk.ar")
    public int field2115 = -1;

    @ObfuscatedName("hk.aj")
    public int field2128 = -1;

    @ObfuscatedName("hk.au")
    public int field2145 = -1;

    @ObfuscatedName("hk.ay")
    public int field2118 = -1;

    @ObfuscatedName("hk.ap")
    public int field2106 = -1;

    @ObfuscatedName("hk.av")
    public int field2120 = -1;

    @ObfuscatedName("hk.aa")
    public int field2112 = -1;

    @ObfuscatedName("hk.aq")
    public int field2122 = -1;

    @ObfuscatedName("hk.am")
    public int field2123 = -1;

    @ObfuscatedName("hk.ac")
    public int field2124 = -1;

    @ObfuscatedName("hk.ae")
    public int field2125 = -1;

    @ObfuscatedName("hk.ak")
    public short[] field2126;

    @ObfuscatedName("hk.bp")
    public short[] field2127;

    @ObfuscatedName("hk.bz")
    public short[] field2117;

    @ObfuscatedName("hk.bc")
    public short[] field2129;

    @ObfuscatedName("hk.bf")
    public String[] field2121 = new String[5];

    @ObfuscatedName("hk.be")
    public boolean field2131 = true;

    @ObfuscatedName("hk.bn")
    public int field2132 = -1;

    @ObfuscatedName("hk.bd")
    public int field2133 = 128;

    @ObfuscatedName("hk.bo")
    public int field2103 = 128;

    @ObfuscatedName("hk.bx")
    public boolean field2134 = false;

    @ObfuscatedName("hk.bl")
    public int field2136 = 0;

    @ObfuscatedName("hk.bh")
    public int field2130 = 0;

    @ObfuscatedName("hk.bs")
    public int field2138 = 32;

    @ObfuscatedName("hk.bj")
    public int[] field2139;

    @ObfuscatedName("hk.bu")
    public int field2140 = -1;

    @ObfuscatedName("hk.br")
    public int field2141 = -1;

    @ObfuscatedName("hk.bb")
    public boolean field2142 = true;

    @ObfuscatedName("hk.by")
    public boolean field2143 = true;

    @ObfuscatedName("hk.bk")
    public boolean field2135 = false;

    @ObfuscatedName("hk.bt")
    public boolean field2107 = false;

    @ObfuscatedName("hk.bq")
    public int[] field2108 = null;

    @ObfuscatedName("hk.bi")
    public short[] field2147 = null;

    @ObfuscatedName("hk.bw")
    public class508 field2148;

    @ObfuscatedName("eq.az(II)Lhk;")
    public static class208 method2790(int arg0) {
        class208 var1 = (class208) field2104.method5336((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1979.method6328(9, arg0);
        class208 var3 = new class208();
        var3.field2111 = arg0;
        if (var2 != null) {
            var3.method3536(new class535(var2));
        }
        var3.method3535();
        field2104.method5346(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hk.ah(I)V")
    public void method3535() {
    }

    @ObfuscatedName("hk.af(Lur;I)V")
    public void method3536(class535 arg0) {
        while (true) {
            int var2 = arg0.method8462();
            if (var2 == 0) {
                return;
            }
            this.method3567(arg0, var2);
        }
    }

    @ObfuscatedName("hk.at(Lur;II)V")
    public void method3567(class535 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8462();
            this.field2109 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2109[var4] = arg0.method8670();
            }
        } else if (arg1 == 2) {
            this.field2119 = arg0.method8473();
        } else if (arg1 == 12) {
            this.field2144 = arg0.method8462();
        } else if (arg1 == 13) {
            this.field2116 = arg0.method8670();
        } else if (arg1 == 14) {
            this.field2137 = arg0.method8670();
        } else if (arg1 == 15) {
            this.field2146 = arg0.method8670();
        } else if (arg1 == 16) {
            this.field2113 = arg0.method8670();
        } else if (arg1 == 17) {
            this.field2137 = arg0.method8670();
            this.field2115 = arg0.method8670();
            this.field2128 = arg0.method8670();
            this.field2145 = arg0.method8670();
        } else if (arg1 == 18) {
            arg0.method8670();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2121[arg1 - 30] = arg0.method8473();
            if (this.field2121[arg1 - 30].equalsIgnoreCase(class370.field4010)) {
                this.field2121[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var5 = arg0.method8462();
            this.field2126 = new short[var5];
            this.field2127 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field2126[var6] = (short) arg0.method8670();
                this.field2127[var6] = (short) arg0.method8670();
            }
        } else if (arg1 == 41) {
            int var7 = arg0.method8462();
            this.field2117 = new short[var7];
            this.field2129 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2117[var8] = (short) arg0.method8670();
                this.field2129[var8] = (short) arg0.method8670();
            }
        } else if (arg1 == 60) {
            int var9 = arg0.method8462();
            this.field2110 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2110[var10] = arg0.method8670();
            }
        } else if (arg1 == 93) {
            this.field2131 = false;
        } else if (arg1 == 95) {
            this.field2132 = arg0.method8670();
        } else if (arg1 == 97) {
            this.field2133 = arg0.method8670();
        } else if (arg1 == 98) {
            this.field2103 = arg0.method8670();
        } else if (arg1 == 99) {
            this.field2134 = true;
        } else if (arg1 == 100) {
            this.field2136 = arg0.method8463();
        } else if (arg1 == 101) {
            this.field2130 = arg0.method8463() * 5;
        } else if (arg1 == 102) {
            int var11 = arg0.method8462();
            int var12 = 0;
            for (int var13 = var11; var13 != 0; var13 >>= 0x1) {
                var12++;
            }
            this.field2108 = new int[var12];
            this.field2147 = new short[var12];
            for (int var14 = 0; var14 < var12; var14++) {
                if ((var11 & 0x1 << var14) == 0) {
                    this.field2108[var14] = -1;
                    this.field2147[var14] = -1;
                } else {
                    this.field2108[var14] = arg0.method8633();
                    this.field2147[var14] = (short) arg0.method8479();
                }
            }
        } else if (arg1 == 103) {
            this.field2138 = arg0.method8670();
        } else if (arg1 == 106 || arg1 == 118) {
            this.field2140 = arg0.method8670();
            if (this.field2140 == 65535) {
                this.field2140 = -1;
            }
            this.field2141 = arg0.method8670();
            if (this.field2141 == 65535) {
                this.field2141 = -1;
            }
            int var15 = -1;
            if (arg1 == 118) {
                var15 = arg0.method8670();
                if (var15 == 65535) {
                    var15 = -1;
                }
            }
            int var16 = arg0.method8462();
            this.field2139 = new int[var16 + 2];
            for (int var17 = 0; var17 <= var16; var17++) {
                this.field2139[var17] = arg0.method8670();
                if (this.field2139[var17] == 65535) {
                    this.field2139[var17] = -1;
                }
            }
            this.field2139[var16 + 1] = var15;
        } else if (arg1 == 107) {
            this.field2142 = false;
        } else if (arg1 == 109) {
            this.field2143 = false;
        } else if (arg1 == 114) {
            this.field2118 = arg0.method8670();
        } else if (arg1 == 115) {
            this.field2118 = arg0.method8670();
            this.field2106 = arg0.method8670();
            this.field2120 = arg0.method8670();
            this.field2112 = arg0.method8670();
        } else if (arg1 == 116) {
            this.field2122 = arg0.method8670();
        } else if (arg1 == 117) {
            this.field2122 = arg0.method8670();
            this.field2123 = arg0.method8670();
            this.field2124 = arg0.method8670();
            this.field2125 = arg0.method8670();
        } else if (arg1 == 122) {
            this.field2135 = true;
        } else if (arg1 == 123) {
            this.field2107 = true;
        } else if (arg1 == 249) {
            this.field2148 = class201.method2084(arg0, this.field2148);
        }
    }

    @ObfuscatedName("hk.an(Lig;ILig;ILhg;I)Ljn;")
    public final class256 method3541(class225 arg0, int arg1, class225 arg2, int arg3, class207 arg4) {
        if (this.field2139 != null) {
            class208 var6 = this.method3534();
            return var6 == null ? null : var6.method3541(arg0, arg1, arg2, arg3, arg4);
        }
        long var7 = (long) this.field2111;
        if (arg4 != null) {
            var7 |= arg4.field2102 << 16;
        }
        class256 var9 = (class256) field2105.method5336(var7);
        if (var9 == null) {
            class238 var10 = this.method3540(this.field2109, arg4);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4138(this.field2136 + 64, this.field2130 + 850, -30, -50, -30);
            field2105.method5346(var9, var7);
        }
        class256 var11;
        if (arg0 != null && arg2 != null) {
            var11 = arg0.method3900(var9, arg1, arg2, arg3);
        } else if (arg0 != null) {
            var11 = arg0.method3897(var9, arg1);
        } else if (arg2 == null) {
            var11 = var9.method4586(true);
        } else {
            var11 = arg2.method3897(var9, arg3);
        }
        if (this.field2133 != 128 || this.field2103 != 128) {
            var11.method4709(this.field2133, this.field2103, this.field2133);
        }
        return var11;
    }

    @ObfuscatedName("hk.ao(Lhg;I)Ljj;")
    public final class238 method3539(class207 arg0) {
        if (this.field2139 == null) {
            return this.method3540(this.field2110, arg0);
        } else {
            class208 var2 = this.method3534();
            return var2 == null ? null : var2.method3539(arg0);
        }
    }

    @ObfuscatedName("hk.ab([ILhg;B)Ljj;")
    public class238 method3540(int[] arg0, class207 arg1) {
        int[] var3 = arg0;
        if (arg1 != null && arg1.field2094 != null) {
            var3 = arg1.field2094;
        }
        if (var3 == null) {
            return null;
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < var3.length; var5++) {
            if (var3[var5] != -1 && !Statics.field396.method6330(var3[var5], 0)) {
                var4 = true;
            }
        }
        if (var4) {
            return null;
        }
        class238[] var6 = new class238[var3.length];
        for (int var7 = 0; var7 < var3.length; var7++) {
            var6[var7] = class238.method4116(Statics.field396, var3[var7], 0);
        }
        class238 var8;
        if (var6.length == 1) {
            var8 = var6[0];
            if (var8 == null) {
                var8 = new class238(var6, var6.length);
            }
        } else {
            var8 = new class238(var6, var6.length);
        }
        if (this.field2126 != null) {
            short[] var9 = this.field2127;
            if (arg1 != null && arg1.field2093 != null) {
                var9 = arg1.field2093;
            }
            for (int var10 = 0; var10 < this.field2126.length; var10++) {
                var8.method4131(this.field2126[var10], var9[var10]);
            }
        }
        if (this.field2117 != null) {
            short[] var11 = this.field2129;
            if (arg1 != null && arg1.field2099 != null) {
                var11 = arg1.field2099;
            }
            for (int var12 = 0; var12 < this.field2117.length; var12++) {
                var8.method4135(this.field2117[var12], var11[var12]);
            }
        }
        return var8;
    }

    @ObfuscatedName("hk.aw(I)Lhk;")
    public final class208 method3534() {
        int var1 = -1;
        if (this.field2140 != -1) {
            var1 = class338.method3618(this.field2140);
        } else if (this.field2141 != -1) {
            var1 = class338.field3634[this.field2141];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2139.length - 1) {
            var2 = this.field2139[var1];
        } else {
            var2 = this.field2139[this.field2139.length - 1];
        }
        return var2 == -1 ? null : method2790(var2);
    }

    @ObfuscatedName("hk.ad(I)I")
    public final int method3542() {
        if (this.field2139 != null) {
            class208 var1 = this.method3534();
            if (var1 != null) {
                return var1.field2111;
            }
        }
        return -1;
    }

    @ObfuscatedName("hk.al(B)Z")
    public boolean method3548() {
        if (this.field2139 == null) {
            return true;
        }
        int var1 = -1;
        if (this.field2140 != -1) {
            var1 = class338.method3618(this.field2140);
        } else if (this.field2141 != -1) {
            var1 = class338.field3634[this.field2141];
        }
        if (var1 >= 0 && var1 < this.field2139.length) {
            return this.field2139[var1] != -1;
        } else {
            return this.field2139[this.field2139.length - 1] != -1;
        }
    }

    @ObfuscatedName("hk.as(IIS)I")
    public int method3544(int arg0, int arg1) {
        return Statics.method3746(this.field2148, arg0, arg1);
    }

    @ObfuscatedName("hk.ag(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3545(int arg0, String arg1) {
        return class201.method396(this.field2148, arg0, arg1);
    }

    @ObfuscatedName("hk.ai(B)Z")
    public boolean method3546() {
        return this.field2108 != null && this.field2147 != null;
    }

    @ObfuscatedName("hk.ax(B)[I")
    public int[] method3547() {
        return this.field2108;
    }

    @ObfuscatedName("hk.ar(II)I")
    public int method3552(int arg0) {
        return this.field2108 == null || arg0 >= this.field2108.length ? -1 : this.field2108[arg0];
    }

    @ObfuscatedName("hk.aj(I)[S")
    public short[] method3549() {
        return this.field2147;
    }

    @ObfuscatedName("hk.au(II)S")
    public short method3565(int arg0) {
        return this.field2147 == null || arg0 >= this.field2147.length ? -1 : this.field2147[arg0];
    }
}
