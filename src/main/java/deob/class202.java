package deob;

@ObfuscatedName("hg")
public class class202 extends class485 {

    @ObfuscatedName("hg.am")
    public static boolean field2140 = false;

    @ObfuscatedName("hg.aj")
    public static class302 field2094 = new class302(4096);

    @ObfuscatedName("hg.aq")
    public static class302 field2137 = new class302(500);

    @ObfuscatedName("hg.ar")
    public static class302 field2110 = new class302(30);

    @ObfuscatedName("hg.ag")
    public static class302 field2100 = new class302(30);

    @ObfuscatedName("hg.ao")
    public static class265[] field2122 = new class265[4];

    @ObfuscatedName("hg.ae")
    public int field2108;

    @ObfuscatedName("hg.aa")
    public int[] field2136;

    @ObfuscatedName("hg.au")
    public int[] field2104;

    @ObfuscatedName("hg.an")
    public String field2101 = class367.field4120;

    @ObfuscatedName("hg.ad")
    public short[] field2106;

    @ObfuscatedName("hg.ax")
    public short[] field2107;

    @ObfuscatedName("hg.aw")
    public short[] field2124;

    @ObfuscatedName("hg.az")
    public short[] field2109;

    @ObfuscatedName("hg.av")
    public int field2120 = 1;

    @ObfuscatedName("hg.ak")
    public int field2096 = 1;

    @ObfuscatedName("hg.ay")
    public int field2112 = 2;

    @ObfuscatedName("hg.as")
    public boolean field2098 = true;

    @ObfuscatedName("hg.ab")
    public int field2114 = -1;

    @ObfuscatedName("hg.ah")
    public int field2115 = -1;

    @ObfuscatedName("hg.ai")
    public boolean field2116 = false;

    @ObfuscatedName("hg.ac")
    public boolean field2117 = false;

    @ObfuscatedName("hg.al")
    public int field2118 = -1;

    @ObfuscatedName("hg.at")
    public int field2119 = 16;

    @ObfuscatedName("hg.bj")
    public int field2102 = 0;

    @ObfuscatedName("hg.bd")
    public int field2121 = 0;

    @ObfuscatedName("hg.bg")
    public String[] field2141 = new String[5];

    @ObfuscatedName("hg.bt")
    public int field2123 = -1;

    @ObfuscatedName("hg.br")
    public int field2127 = -1;

    @ObfuscatedName("hg.ba")
    public boolean field2125 = false;

    @ObfuscatedName("hg.bk")
    public boolean field2126 = true;

    @ObfuscatedName("hg.bn")
    public int field2099 = 128;

    @ObfuscatedName("hg.by")
    public int field2128 = 128;

    @ObfuscatedName("hg.bc")
    public int field2129 = 128;

    @ObfuscatedName("hg.bx")
    public int field2130 = 0;

    @ObfuscatedName("hg.bf")
    public int field2131 = 0;

    @ObfuscatedName("hg.bp")
    public int field2132 = 0;

    @ObfuscatedName("hg.bv")
    public boolean field2133 = false;

    @ObfuscatedName("hg.bm")
    public boolean field2134 = false;

    @ObfuscatedName("hg.bq")
    public int field2135 = -1;

    @ObfuscatedName("hg.bb")
    public int[] field2097;

    @ObfuscatedName("hg.bh")
    public int field2113 = -1;

    @ObfuscatedName("hg.bw")
    public int field2138 = -1;

    @ObfuscatedName("hg.bi")
    public int field2139 = -1;

    @ObfuscatedName("hg.bu")
    public int field2105 = 0;

    @ObfuscatedName("hg.be")
    public int field2111 = 0;

    @ObfuscatedName("hg.bs")
    public int field2142 = 0;

    @ObfuscatedName("hg.bl")
    public int[] field2143;

    @ObfuscatedName("hg.bz")
    public boolean field2144 = true;

    @ObfuscatedName("hg.bo")
    public class504 field2145;

    @ObfuscatedName("fh.am(II)Lhg;")
    public static class202 method3023(int arg0) {
        class202 var1 = (class202) field2094.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2095.method6396(6, arg0);
        class202 var3 = new class202();
        var3.field2108 = arg0;
        if (var2 != null) {
            var3.method3652(new class531(var2));
        }
        var3.method3620();
        if (var3.field2134) {
            var3.field2112 = 0;
            var3.field2098 = false;
        }
        field2094.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hg.ap(I)V")
    public void method3620() {
        if (this.field2114 == -1) {
            this.field2114 = 0;
            if (this.field2136 != null && (this.field2104 == null || this.field2104[0] == 10)) {
                this.field2114 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2141[var1] != null) {
                    this.field2114 = 1;
                }
            }
        }
        if (this.field2135 == -1) {
            this.field2135 = this.field2112 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("hg.af(Luk;I)V")
    public void method3652(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3609(arg0, var2);
        }
    }

    @ObfuscatedName("hg.aj(Luk;II)V")
    public void method3609(class531 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8561();
            if (var3 > 0) {
                if (this.field2136 == null || field2140) {
                    this.field2104 = new int[var3];
                    this.field2136 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2136[var4] = arg0.method8775();
                        this.field2104[var4] = arg0.method8561();
                    }
                } else {
                    arg0.field5181 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2101 = arg0.method8641();
        } else if (arg1 == 5) {
            int var5 = arg0.method8561();
            if (var5 > 0) {
                if (this.field2136 == null || field2140) {
                    this.field2104 = null;
                    this.field2136 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2136[var6] = arg0.method8775();
                    }
                } else {
                    arg0.field5181 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2120 = arg0.method8561();
        } else if (arg1 == 15) {
            this.field2096 = arg0.method8561();
        } else if (arg1 == 17) {
            this.field2112 = 0;
            this.field2098 = false;
        } else if (arg1 == 18) {
            this.field2098 = false;
        } else if (arg1 == 19) {
            this.field2114 = arg0.method8561();
        } else if (arg1 == 21) {
            this.field2115 = 0;
        } else if (arg1 == 22) {
            this.field2116 = true;
        } else if (arg1 == 23) {
            this.field2117 = true;
        } else if (arg1 == 24) {
            this.field2118 = arg0.method8775();
            if (this.field2118 == 65535) {
                this.field2118 = -1;
            }
        } else if (arg1 == 27) {
            this.field2112 = 1;
        } else if (arg1 == 28) {
            this.field2119 = arg0.method8561();
        } else if (arg1 == 29) {
            this.field2102 = arg0.method8562();
        } else if (arg1 == 39) {
            this.field2121 = arg0.method8562();
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2141[arg1 - 30] = arg0.method8641();
            if (this.field2141[arg1 - 30].equalsIgnoreCase(class367.field3979)) {
                this.field2141[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8561();
            this.field2106 = new short[var7];
            this.field2107 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2106[var8] = (short) arg0.method8775();
                this.field2107[var8] = (short) arg0.method8775();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8561();
            this.field2124 = new short[var9];
            this.field2109 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2124[var10] = (short) arg0.method8775();
                this.field2109[var10] = (short) arg0.method8775();
            }
        } else if (arg1 == 61) {
            arg0.method8775();
        } else if (arg1 == 62) {
            this.field2125 = true;
        } else if (arg1 == 64) {
            this.field2126 = false;
        } else if (arg1 == 65) {
            this.field2099 = arg0.method8775();
        } else if (arg1 == 66) {
            this.field2128 = arg0.method8775();
        } else if (arg1 == 67) {
            this.field2129 = arg0.method8775();
        } else if (arg1 == 68) {
            this.field2127 = arg0.method8775();
        } else if (arg1 == 69) {
            arg0.method8561();
        } else if (arg1 == 70) {
            this.field2130 = arg0.method8564();
        } else if (arg1 == 71) {
            this.field2131 = arg0.method8564();
        } else if (arg1 == 72) {
            this.field2132 = arg0.method8564();
        } else if (arg1 == 73) {
            this.field2133 = true;
        } else if (arg1 == 74) {
            this.field2134 = true;
        } else if (arg1 == 75) {
            this.field2135 = arg0.method8561();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2113 = arg0.method8775();
            if (this.field2113 == 65535) {
                this.field2113 = -1;
            }
            this.field2138 = arg0.method8775();
            if (this.field2138 == 65535) {
                this.field2138 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8775();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8561();
            this.field2097 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2097[var15] = arg0.method8775();
                if (this.field2097[var15] == 65535) {
                    this.field2097[var15] = -1;
                }
            }
            this.field2097[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2139 = arg0.method8775();
            this.field2105 = arg0.method8561();
        } else if (arg1 == 79) {
            this.field2111 = arg0.method8775();
            this.field2142 = arg0.method8775();
            this.field2105 = arg0.method8561();
            int var11 = arg0.method8561();
            this.field2143 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2143[var12] = arg0.method8775();
            }
        } else if (arg1 == 81) {
            this.field2115 = arg0.method8561() * 256;
        } else if (arg1 == 82) {
            this.field2123 = arg0.method8775();
        } else if (arg1 == 89) {
            this.field2144 = false;
        } else if (arg1 == 249) {
            this.field2145 = class182.method4263(arg0, this.field2145);
        }
    }

    @ObfuscatedName("hg.aq(IB)Z")
    public final boolean method3610(int arg0) {
        if (this.field2104 != null) {
            for (int var4 = 0; var4 < this.field2104.length; var4++) {
                if (this.field2104[var4] == arg0) {
                    return Statics.field2103.method6431(this.field2136[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2136 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2136.length; var3++) {
                var2 &= Statics.field2103.method6431(this.field2136[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hg.ar(B)Z")
    public final boolean method3624() {
        if (this.field2136 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2136.length; var2++) {
            var1 &= Statics.field2103.method6431(this.field2136[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("hg.ag(II[[IIIII)Lkp;")
    public final class276 method3617(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2104 == null) {
            var7 = (long) ((this.field2108 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2108 << 10) + (arg0 << 3) + arg1);
        }
        class276 var9 = (class276) field2110.method5400(var7);
        if (var9 == null) {
            class265 var10 = this.method3615(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2116) {
                var10.field2707 = (short) (this.field2102 + 64);
                var10.field2734 = (short) (this.field2121 * 25 + 768);
                var10.method4668();
                var9 = var10;
            } else {
                var9 = var10.method4672(this.field2102 + 64, this.field2121 * 25 + 768, -50, -10, -50);
            }
            field2110.method5402(var9, var7);
        }
        if (this.field2116) {
            var9 = ((class265) var9).method4700();
        }
        if (this.field2115 >= 0) {
            if (var9 instanceof class283) {
                var9 = ((class283) var9).method5131(arg2, arg3, arg4, arg5, true, this.field2115);
            } else if (var9 instanceof class265) {
                var9 = ((class265) var9).method4656(arg2, arg3, arg4, arg5, true, this.field2115);
            }
        }
        return var9;
    }

    @ObfuscatedName("hg.ao(II[[IIIII)Lko;")
    public final class283 method3613(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2104 == null) {
            var7 = (long) ((this.field2108 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2108 << 10) + (arg0 << 3) + arg1);
        }
        class283 var9 = (class283) field2100.method5400(var7);
        if (var9 == null) {
            class265 var10 = this.method3615(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4672(this.field2102 + 64, this.field2121 * 25 + 768, -50, -10, -50);
            field2100.method5402(var9, var7);
        }
        if (this.field2115 >= 0) {
            var9 = var9.method5131(arg2, arg3, arg4, arg5, true, this.field2115);
        }
        return var9;
    }

    @ObfuscatedName("hg.ae(II[[IIIILhl;II)Lko;")
    public final class283 method3614(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class205 arg6, int arg7) {
        long var9;
        if (this.field2104 == null) {
            var9 = (long) ((this.field2108 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2108 << 10) + (arg0 << 3) + arg1);
        }
        class283 var11 = (class283) field2100.method5400(var9);
        if (var11 == null) {
            class265 var12 = this.method3615(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4672(this.field2102 + 64, this.field2121 * 25 + 768, -50, -10, -50);
            field2100.method5402(var11, var9);
        }
        if (arg6 == null && this.field2115 == -1) {
            return var11;
        }
        class283 var13;
        if (arg6 == null) {
            var13 = var11.method5132(true);
        } else {
            var13 = arg6.method3746(var11, arg7, arg1);
        }
        if (this.field2115 >= 0) {
            var13 = var13.method5131(arg2, arg3, arg4, arg5, false, this.field2115);
        }
        return var13;
    }

    @ObfuscatedName("hg.aa(III)Lkm;")
    public final class265 method3615(int arg0, int arg1) {
        class265 var3 = null;
        if (this.field2104 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2136 == null) {
                return null;
            }
            boolean var4 = this.field2125;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2136.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2136[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class265) field2137.method5400((long) var7);
                if (var3 == null) {
                    var3 = class265.method4650(Statics.field2103, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4704();
                    }
                    field2137.method5402(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2122[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class265(field2122, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2104.length; var9++) {
                if (this.field2104[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2136[var8];
            boolean var11 = this.field2125 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class265) field2137.method5400((long) var10);
            if (var3 == null) {
                var3 = class265.method4650(Statics.field2103, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4704();
                }
                field2137.method5402(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2099 == 128 && this.field2128 == 128 && this.field2129 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2130 == 0 && this.field2131 == 0 && this.field2132 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class265 var14 = new class265(var3, arg1 == 0 && !var12 && !var13, this.field2106 == null, this.field2124 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4662(256);
            var14.method4730(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4659();
        } else if (var15 == 2) {
            var14.method4660();
        } else if (var15 == 3) {
            var14.method4661();
        }
        if (this.field2106 != null) {
            for (int var16 = 0; var16 < this.field2106.length; var16++) {
                var14.method4664(this.field2106[var16], this.field2107[var16]);
            }
        }
        if (this.field2124 != null) {
            for (int var17 = 0; var17 < this.field2124.length; var17++) {
                var14.method4665(this.field2124[var17], this.field2109[var17]);
            }
        }
        if (var12) {
            var14.method4667(this.field2099, this.field2128, this.field2129);
        }
        if (var13) {
            var14.method4730(this.field2130, this.field2131, this.field2132);
        }
        return var14;
    }

    @ObfuscatedName("hg.au(I)Lhg;")
    public final class202 method3608() {
        int var1 = -1;
        if (this.field2113 != -1) {
            var1 = class336.method1124(this.field2113);
        } else if (this.field2138 != -1) {
            var1 = class336.field3598[this.field2138];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2097.length - 1) {
            var2 = this.field2097[var1];
        } else {
            var2 = this.field2097[this.field2097.length - 1];
        }
        return var2 == -1 ? null : method3023(var2);
    }

    @ObfuscatedName("hg.an(IIB)I")
    public int method3616(int arg0, int arg1) {
        return class182.method5355(this.field2145, arg0, arg1);
    }

    @ObfuscatedName("hg.ad(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3618(int arg0, String arg1) {
        class504 var3 = this.field2145;
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

    @ObfuscatedName("fo.ax(I)V")
    public static void method3072() {
        field2094.method5403();
        field2137.method5403();
        field2110.method5403();
        field2100.method5403();
    }

    @ObfuscatedName("hg.aw(I)Z")
    public boolean method3649() {
        if (this.field2097 == null) {
            return this.field2139 != -1 || this.field2143 != null;
        }
        for (int var1 = 0; var1 < this.field2097.length; var1++) {
            if (this.field2097[var1] != -1) {
                class202 var2 = method3023(this.field2097[var1]);
                if (var2.field2139 != -1 || var2.field2143 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
