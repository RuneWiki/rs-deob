package deob;

@ObfuscatedName("hq")
public class class201 extends class444 {

    @ObfuscatedName("hq.af")
    public static boolean field2191 = false;

    @ObfuscatedName("hq.ac")
    public static class280 field2159 = new class280(4096);

    @ObfuscatedName("hq.au")
    public static class280 field2160 = new class280(500);

    @ObfuscatedName("hq.ab")
    public static class280 field2161 = new class280(30);

    @ObfuscatedName("hq.aq")
    public static class280 field2185 = new class280(30);

    @ObfuscatedName("hq.al")
    public static class214[] field2163 = new class214[4];

    @ObfuscatedName("hq.at")
    public int field2186;

    @ObfuscatedName("hq.aa")
    public int[] field2165;

    @ObfuscatedName("hq.ay")
    public int[] field2166;

    @ObfuscatedName("hq.ao")
    public String field2184 = class337.field3889;

    @ObfuscatedName("hq.ax")
    public short[] field2171;

    @ObfuscatedName("hq.ai")
    public short[] field2169;

    @ObfuscatedName("hq.ag")
    public short[] field2170;

    @ObfuscatedName("hq.ah")
    public short[] field2157;

    @ObfuscatedName("hq.av")
    public int field2172 = 1;

    @ObfuscatedName("hq.ar")
    public int field2173 = 1;

    @ObfuscatedName("hq.am")
    public int field2178 = 2;

    @ObfuscatedName("hq.as")
    public boolean field2175 = true;

    @ObfuscatedName("hq.aj")
    public int field2176 = -1;

    @ObfuscatedName("hq.ak")
    public int field2177 = -1;

    @ObfuscatedName("hq.az")
    public boolean field2180 = false;

    @ObfuscatedName("hq.ad")
    public boolean field2179 = false;

    @ObfuscatedName("hq.ae")
    public int field2167 = -1;

    @ObfuscatedName("hq.ap")
    public int field2181 = 16;

    @ObfuscatedName("hq.by")
    public int field2164 = 0;

    @ObfuscatedName("hq.bb")
    public int field2183 = 0;

    @ObfuscatedName("hq.bi")
    public String[] field2174 = new String[5];

    @ObfuscatedName("hq.be")
    public int field2182 = -1;

    @ObfuscatedName("hq.bk")
    public int field2197 = -1;

    @ObfuscatedName("hq.bx")
    public boolean field2187 = false;

    @ObfuscatedName("hq.bo")
    public boolean field2188 = true;

    @ObfuscatedName("hq.bz")
    public int field2189 = 128;

    @ObfuscatedName("hq.bm")
    public int field2190 = 128;

    @ObfuscatedName("hq.bd")
    public int field2162 = 128;

    @ObfuscatedName("hq.bt")
    public int field2192 = 0;

    @ObfuscatedName("hq.bj")
    public int field2193 = 0;

    @ObfuscatedName("hq.bn")
    public int field2194 = 0;

    @ObfuscatedName("hq.bs")
    public boolean field2195 = false;

    @ObfuscatedName("hq.br")
    public boolean field2196 = false;

    @ObfuscatedName("hq.bg")
    public int field2207 = -1;

    @ObfuscatedName("hq.bu")
    public int[] field2198;

    @ObfuscatedName("hq.bf")
    public int field2199 = -1;

    @ObfuscatedName("hq.bq")
    public int field2200 = -1;

    @ObfuscatedName("hq.ba")
    public int field2201 = -1;

    @ObfuscatedName("hq.bv")
    public int field2202 = 0;

    @ObfuscatedName("hq.bl")
    public int field2205 = 0;

    @ObfuscatedName("hq.bp")
    public int field2204 = 0;

    @ObfuscatedName("hq.bc")
    public int[] field2168;

    @ObfuscatedName("hq.bh")
    public boolean field2206 = true;

    @ObfuscatedName("hq.bw")
    public class464 field2203;

    @ObfuscatedName("cy.af(Lnm;Lnm;ZB)V")
    public static void method1891(class344 arg0, class344 arg1, boolean arg2) {
        Statics.field2158 = arg0;
        Statics.field1762 = arg1;
        field2191 = arg2;
    }

    @ObfuscatedName("hq.aw(B)V")
    public void method3661() {
        if (this.field2176 == -1) {
            this.field2176 = 0;
            if (this.field2165 != null && (this.field2166 == null || this.field2166[0] == 10)) {
                this.field2176 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2174[var1] != null) {
                    this.field2176 = 1;
                }
            }
        }
        if (this.field2207 == -1) {
            this.field2207 = this.field2178 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("hq.ac(Lsg;I)V")
    public void method3662(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3663(arg0, var2);
        }
    }

    @ObfuscatedName("hq.au(Lsg;IB)V")
    public void method3663(class489 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8248();
            if (var3 > 0) {
                if (this.field2165 == null || field2191) {
                    this.field2166 = new int[var3];
                    this.field2165 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2165[var4] = arg0.method8250();
                        this.field2166[var4] = arg0.method8248();
                    }
                } else {
                    arg0.field4989 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2184 = arg0.method8259();
        } else if (arg1 == 5) {
            int var5 = arg0.method8248();
            if (var5 > 0) {
                if (this.field2165 == null || field2191) {
                    this.field2166 = null;
                    this.field2165 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2165[var6] = arg0.method8250();
                    }
                } else {
                    arg0.field4989 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2172 = arg0.method8248();
        } else if (arg1 == 15) {
            this.field2173 = arg0.method8248();
        } else if (arg1 == 17) {
            this.field2178 = 0;
            this.field2175 = false;
        } else if (arg1 == 18) {
            this.field2175 = false;
        } else if (arg1 == 19) {
            this.field2176 = arg0.method8248();
        } else if (arg1 == 21) {
            this.field2177 = 0;
        } else if (arg1 == 22) {
            this.field2180 = true;
        } else if (arg1 == 23) {
            this.field2179 = true;
        } else if (arg1 == 24) {
            this.field2167 = arg0.method8250();
            if (this.field2167 == 65535) {
                this.field2167 = -1;
            }
        } else if (arg1 == 27) {
            this.field2178 = 1;
        } else if (arg1 == 28) {
            this.field2181 = arg0.method8248();
        } else if (arg1 == 29) {
            this.field2164 = arg0.method8249();
        } else if (arg1 == 39) {
            this.field2183 = arg0.method8249() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2174[arg1 - 30] = arg0.method8259();
            if (this.field2174[arg1 - 30].equalsIgnoreCase(class337.field4129)) {
                this.field2174[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8248();
            this.field2171 = new short[var7];
            this.field2169 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2171[var8] = (short) arg0.method8250();
                this.field2169[var8] = (short) arg0.method8250();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8248();
            this.field2170 = new short[var9];
            this.field2157 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2170[var10] = (short) arg0.method8250();
                this.field2157[var10] = (short) arg0.method8250();
            }
        } else if (arg1 == 61) {
            arg0.method8250();
        } else if (arg1 == 62) {
            this.field2187 = true;
        } else if (arg1 == 64) {
            this.field2188 = false;
        } else if (arg1 == 65) {
            this.field2189 = arg0.method8250();
        } else if (arg1 == 66) {
            this.field2190 = arg0.method8250();
        } else if (arg1 == 67) {
            this.field2162 = arg0.method8250();
        } else if (arg1 == 68) {
            this.field2197 = arg0.method8250();
        } else if (arg1 == 69) {
            arg0.method8248();
        } else if (arg1 == 70) {
            this.field2192 = arg0.method8445();
        } else if (arg1 == 71) {
            this.field2193 = arg0.method8445();
        } else if (arg1 == 72) {
            this.field2194 = arg0.method8445();
        } else if (arg1 == 73) {
            this.field2195 = true;
        } else if (arg1 == 74) {
            this.field2196 = true;
        } else if (arg1 == 75) {
            this.field2207 = arg0.method8248();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2199 = arg0.method8250();
            if (this.field2199 == 65535) {
                this.field2199 = -1;
            }
            this.field2200 = arg0.method8250();
            if (this.field2200 == 65535) {
                this.field2200 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8250();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8248();
            this.field2198 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2198[var15] = arg0.method8250();
                if (this.field2198[var15] == 65535) {
                    this.field2198[var15] = -1;
                }
            }
            this.field2198[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2201 = arg0.method8250();
            this.field2202 = arg0.method8248();
        } else if (arg1 == 79) {
            this.field2205 = arg0.method8250();
            this.field2204 = arg0.method8250();
            this.field2202 = arg0.method8248();
            int var11 = arg0.method8248();
            this.field2168 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2168[var12] = arg0.method8250();
            }
        } else if (arg1 == 81) {
            this.field2177 = arg0.method8248() * 256;
        } else if (arg1 == 82) {
            this.field2182 = arg0.method8250();
        } else if (arg1 == 89) {
            this.field2206 = false;
        } else if (arg1 == 249) {
            this.field2203 = class187.method2057(arg0, this.field2203);
        }
    }

    @ObfuscatedName("hq.ab(II)Z")
    public final boolean method3664(int arg0) {
        if (this.field2166 != null) {
            for (int var4 = 0; var4 < this.field2166.length; var4++) {
                if (this.field2166[var4] == arg0) {
                    return Statics.field1762.method6073(this.field2165[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2165 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2165.length; var3++) {
                var2 &= Statics.field1762.method6073(this.field2165[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("hq.aq(I)Z")
    public final boolean method3676() {
        if (this.field2165 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2165.length; var2++) {
            var1 &= Statics.field1762.method6073(this.field2165[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("hq.al(II[[IIIIB)Liv;")
    public final class225 method3665(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2166 == null) {
            var7 = (long) ((this.field2186 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2186 << 10) + (arg0 << 3) + arg1);
        }
        class225 var9 = (class225) field2161.method5119(var7);
        if (var9 == null) {
            class214 var10 = this.method3668(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2180) {
                var10.field2433 = (short) (this.field2164 + 64);
                var10.field2425 = (short) (this.field2183 + 768);
                var10.method4039();
                var9 = var10;
            } else {
                var9 = var10.method3979(this.field2164 + 64, this.field2183 + 768, -50, -10, -50);
            }
            field2161.method5121(var9, var7);
        }
        if (this.field2180) {
            var9 = ((class214) var9).method3987();
        }
        if (this.field2177 >= 0) {
            if (var9 instanceof class232) {
                var9 = ((class232) var9).method4394(arg2, arg3, arg4, arg5, true, this.field2177);
            } else if (var9 instanceof class214) {
                var9 = ((class214) var9).method3964(arg2, arg3, arg4, arg5, true, this.field2177);
            }
        }
        return var9;
    }

    @ObfuscatedName("hq.at(II[[IIIIB)Lit;")
    public final class232 method3670(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2166 == null) {
            var7 = (long) ((this.field2186 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2186 << 10) + (arg0 << 3) + arg1);
        }
        class232 var9 = (class232) field2185.method5119(var7);
        if (var9 == null) {
            class214 var10 = this.method3668(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method3979(this.field2164 + 64, this.field2183 + 768, -50, -10, -50);
            field2185.method5121(var9, var7);
        }
        if (this.field2177 >= 0) {
            var9 = var9.method4394(arg2, arg3, arg4, arg5, true, this.field2177);
        }
        return var9;
    }

    @ObfuscatedName("hq.aa(II[[IIIILha;II)Lit;")
    public final class232 method3667(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class204 arg6, int arg7) {
        long var9;
        if (this.field2166 == null) {
            var9 = (long) ((this.field2186 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2186 << 10) + (arg0 << 3) + arg1);
        }
        class232 var11 = (class232) field2185.method5119(var9);
        if (var11 == null) {
            class214 var12 = this.method3668(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method3979(this.field2164 + 64, this.field2183 + 768, -50, -10, -50);
            field2185.method5121(var11, var9);
        }
        if (arg6 == null && this.field2177 == -1) {
            return var11;
        }
        class232 var13;
        if (arg6 == null) {
            var13 = var11.method4390(true);
        } else {
            var13 = arg6.method3840(var11, arg7, arg1);
        }
        if (this.field2177 >= 0) {
            var13 = var13.method4394(arg2, arg3, arg4, arg5, false, this.field2177);
        }
        return var13;
    }

    @ObfuscatedName("hq.ay(III)Liz;")
    public final class214 method3668(int arg0, int arg1) {
        class214 var3 = null;
        if (this.field2166 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2165 == null) {
                return null;
            }
            boolean var4 = this.field2187;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2165.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2165[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class214) field2160.method5119((long) var7);
                if (var3 == null) {
                    var3 = class214.method4017(Statics.field1762, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method3973();
                    }
                    field2160.method5121(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2163[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class214(field2163, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2166.length; var9++) {
                if (this.field2166[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2165[var8];
            boolean var11 = this.field2187 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class214) field2160.method5119((long) var10);
            if (var3 == null) {
                var3 = class214.method4017(Statics.field1762, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method3973();
                }
                field2160.method5121(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2189 == 128 && this.field2190 == 128 && this.field2162 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2192 == 0 && this.field2193 == 0 && this.field2194 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class214 var14 = new class214(var3, arg1 == 0 && !var12 && !var13, this.field2171 == null, this.field2170 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4035(256);
            var14.method3970(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method3966();
        } else if (var15 == 2) {
            var14.method3969();
        } else if (var15 == 3) {
            var14.method3968();
        }
        if (this.field2171 != null) {
            for (int var16 = 0; var16 < this.field2171.length; var16++) {
                var14.method3971(this.field2171[var16], this.field2169[var16]);
            }
        }
        if (this.field2170 != null) {
            for (int var17 = 0; var17 < this.field2170.length; var17++) {
                var14.method4022(this.field2170[var17], this.field2157[var17]);
            }
        }
        if (var12) {
            var14.method3974(this.field2189, this.field2190, this.field2162);
        }
        if (var13) {
            var14.method3970(this.field2192, this.field2193, this.field2194);
        }
        return var14;
    }

    @ObfuscatedName("hq.ao(B)Lhq;")
    public final class201 method3669() {
        int var1 = -1;
        if (this.field2199 != -1) {
            var1 = class307.method4941(this.field2199);
        } else if (this.field2200 != -1) {
            var1 = class307.field3482[this.field2200];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2198.length - 1) {
            var2 = this.field2198[var1];
        } else {
            var2 = this.field2198[this.field2198.length - 1];
        }
        return var2 == -1 ? null : Statics.method3057(var2);
    }

    @ObfuscatedName("hq.ax(III)I")
    public int method3675(int arg0, int arg1) {
        class464 var3 = this.field2203;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class448 var5 = (class448) var3.method7945((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4744;
            }
        }
        return var4;
    }

    @ObfuscatedName("hq.ai(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3697(int arg0, String arg1) {
        return class187.method3440(this.field2203, arg0, arg1);
    }

    @ObfuscatedName("ag.ag(I)V")
    public static void method181() {
        field2159.method5125();
        field2160.method5125();
        field2161.method5125();
        field2185.method5125();
    }

    @ObfuscatedName("hq.ah(I)Z")
    public boolean method3672() {
        if (this.field2198 == null) {
            return this.field2201 != -1 || this.field2168 != null;
        }
        for (int var1 = 0; var1 < this.field2198.length; var1++) {
            if (this.field2198[var1] != -1) {
                class201 var2 = Statics.method3057(this.field2198[var1]);
                if (var2.field2201 != -1 || var2.field2168 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
