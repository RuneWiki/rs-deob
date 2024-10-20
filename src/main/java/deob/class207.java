package deob;

@ObfuscatedName("ho")
public class class207 extends class501 {

    @ObfuscatedName("ho.aq")
    public static boolean field2185 = false;

    @ObfuscatedName("ho.ak")
    public static class313 field2170 = new class313(4096);

    @ObfuscatedName("ho.ap")
    public static class313 field2156 = new class313(500);

    @ObfuscatedName("ho.an")
    public static class313 field2157 = new class313(30);

    @ObfuscatedName("ho.aj")
    public static class313 field2191 = new class313(30);

    @ObfuscatedName("ho.av")
    public static class273[] field2159 = new class273[4];

    @ObfuscatedName("ho.ab")
    public int field2160;

    @ObfuscatedName("ho.ai")
    public int[] field2155;

    @ObfuscatedName("ho.ae")
    public int[] field2195;

    @ObfuscatedName("ho.au")
    public String field2203 = class379.field4390;

    @ObfuscatedName("ho.ah")
    public short[] field2164;

    @ObfuscatedName("ho.az")
    public short[] field2165;

    @ObfuscatedName("ho.ax")
    public short[] field2163;

    @ObfuscatedName("ho.ac")
    public short[] field2179;

    @ObfuscatedName("ho.al")
    public int field2168 = 1;

    @ObfuscatedName("ho.ay")
    public int field2169 = 1;

    @ObfuscatedName("ho.ao")
    public int field2154 = 2;

    @ObfuscatedName("ho.aa")
    public boolean field2171 = true;

    @ObfuscatedName("ho.as")
    public int field2172 = -1;

    @ObfuscatedName("ho.aw")
    public int field2173 = -1;

    @ObfuscatedName("ho.at")
    public boolean field2174 = false;

    @ObfuscatedName("ho.af")
    public boolean field2161 = false;

    @ObfuscatedName("ho.am")
    public int field2176 = -1;

    @ObfuscatedName("ho.ar")
    public int field2177 = 16;

    @ObfuscatedName("ho.bt")
    public int field2175 = 0;

    @ObfuscatedName("ho.bj")
    public int field2152 = 0;

    @ObfuscatedName("ho.be")
    public String[] field2196 = new String[5];

    @ObfuscatedName("ho.bm")
    public int field2181 = -1;

    @ObfuscatedName("ho.bo")
    public int field2158 = -1;

    @ObfuscatedName("ho.bi")
    public boolean field2180 = false;

    @ObfuscatedName("ho.ba")
    public boolean field2184 = true;

    @ObfuscatedName("ho.bg")
    public int field2205 = 128;

    @ObfuscatedName("ho.bs")
    public int field2186 = 128;

    @ObfuscatedName("ho.bp")
    public int field2187 = 128;

    @ObfuscatedName("ho.bx")
    public int field2183 = 0;

    @ObfuscatedName("ho.bu")
    public int field2166 = 0;

    @ObfuscatedName("ho.by")
    public int field2190 = 0;

    @ObfuscatedName("ho.bw")
    public boolean field2162 = false;

    @ObfuscatedName("ho.bl")
    public boolean field2192 = false;

    @ObfuscatedName("ho.bc")
    public int field2193 = -1;

    @ObfuscatedName("ho.bv")
    public int[] field2194;

    @ObfuscatedName("ho.bb")
    public int field2189 = -1;

    @ObfuscatedName("ho.bn")
    public int field2182 = -1;

    @ObfuscatedName("ho.bh")
    public int field2197 = -1;

    @ObfuscatedName("ho.bq")
    public int field2198 = 0;

    @ObfuscatedName("ho.bd")
    public int field2199 = 0;

    @ObfuscatedName("ho.bz")
    public int field2200 = 0;

    @ObfuscatedName("ho.bk")
    public int field2201 = 0;

    @ObfuscatedName("ho.br")
    public int[] field2202;

    @ObfuscatedName("ho.bf")
    public boolean field2188 = true;

    @ObfuscatedName("ho.cf")
    public boolean field2204 = false;

    @ObfuscatedName("ho.cv")
    public class520 field2178;

    @ObfuscatedName("ae.aq(II)Lho;")
    public static class207 method95(int arg0) {
        class207 var1 = (class207) field2170.method5495((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2153.method6539(6, arg0);
        class207 var3 = new class207();
        var3.field2160 = arg0;
        if (var2 != null) {
            var3.method3609(new class547(var2));
        }
        var3.method3637();
        if (var3.field2192) {
            var3.field2154 = 0;
            var3.field2171 = false;
        }
        field2170.method5498(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ho.ad(I)V")
    public void method3637() {
        if (this.field2172 == -1) {
            this.field2172 = 0;
            if (this.field2155 != null && (this.field2195 == null || this.field2195[0] == 10)) {
                this.field2172 = 1;
            }
            for (int var1 = 0; var1 < 5; var1++) {
                if (this.field2196[var1] != null) {
                    this.field2172 = 1;
                }
            }
        }
        if (this.field2193 == -1) {
            this.field2193 = this.field2154 == 0 ? 0 : 1;
        }
    }

    @ObfuscatedName("ho.ag(Lvp;I)V")
    public void method3609(class547 arg0) {
        while (true) {
            int var2 = arg0.method8804();
            if (var2 == 0) {
                return;
            }
            this.method3639(arg0, var2);
        }
    }

    @ObfuscatedName("ho.ak(Lvp;II)V")
    public void method3639(class547 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8804();
            if (var3 > 0) {
                if (this.field2155 == null || field2185) {
                    this.field2195 = new int[var3];
                    this.field2155 = new int[var3];
                    for (int var4 = 0; var4 < var3; var4++) {
                        this.field2155[var4] = arg0.method8899();
                        this.field2195[var4] = arg0.method8804();
                    }
                } else {
                    arg0.field5363 += var3 * 3;
                }
            }
        } else if (arg1 == 2) {
            this.field2203 = arg0.method8739();
        } else if (arg1 == 5) {
            int var5 = arg0.method8804();
            if (var5 > 0) {
                if (this.field2155 == null || field2185) {
                    this.field2195 = null;
                    this.field2155 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field2155[var6] = arg0.method8899();
                    }
                } else {
                    arg0.field5363 += var5 * 2;
                }
            }
        } else if (arg1 == 14) {
            this.field2168 = arg0.method8804();
        } else if (arg1 == 15) {
            this.field2169 = arg0.method8804();
        } else if (arg1 == 17) {
            this.field2154 = 0;
            this.field2171 = false;
        } else if (arg1 == 18) {
            this.field2171 = false;
        } else if (arg1 == 19) {
            this.field2172 = arg0.method8804();
        } else if (arg1 == 21) {
            this.field2173 = 0;
        } else if (arg1 == 22) {
            this.field2174 = true;
        } else if (arg1 == 23) {
            this.field2161 = true;
        } else if (arg1 == 24) {
            this.field2176 = arg0.method8899();
            if (this.field2176 == 65535) {
                this.field2176 = -1;
            }
        } else if (arg1 == 27) {
            this.field2154 = 1;
        } else if (arg1 == 28) {
            this.field2177 = arg0.method8804();
        } else if (arg1 == 29) {
            this.field2175 = arg0.method8857();
        } else if (arg1 == 39) {
            this.field2152 = arg0.method8857() * 25;
        } else if (arg1 >= 30 && arg1 < 35) {
            this.field2196[arg1 - 30] = arg0.method8739();
            if (this.field2196[arg1 - 30].equalsIgnoreCase(class379.field4384)) {
                this.field2196[arg1 - 30] = null;
            }
        } else if (arg1 == 40) {
            int var7 = arg0.method8804();
            this.field2164 = new short[var7];
            this.field2165 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2164[var8] = (short) arg0.method8899();
                this.field2165[var8] = (short) arg0.method8899();
            }
        } else if (arg1 == 41) {
            int var9 = arg0.method8804();
            this.field2163 = new short[var9];
            this.field2179 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2163[var10] = (short) arg0.method8899();
                this.field2179[var10] = (short) arg0.method8899();
            }
        } else if (arg1 == 61) {
            arg0.method8899();
        } else if (arg1 == 62) {
            this.field2180 = true;
        } else if (arg1 == 64) {
            this.field2184 = false;
        } else if (arg1 == 65) {
            this.field2205 = arg0.method8899();
        } else if (arg1 == 66) {
            this.field2186 = arg0.method8899();
        } else if (arg1 == 67) {
            this.field2187 = arg0.method8899();
        } else if (arg1 == 68) {
            this.field2158 = arg0.method8899();
        } else if (arg1 == 69) {
            arg0.method8804();
        } else if (arg1 == 70) {
            this.field2183 = arg0.method8731();
        } else if (arg1 == 71) {
            this.field2166 = arg0.method8731();
        } else if (arg1 == 72) {
            this.field2190 = arg0.method8731();
        } else if (arg1 == 73) {
            this.field2162 = true;
        } else if (arg1 == 74) {
            this.field2192 = true;
        } else if (arg1 == 75) {
            this.field2193 = arg0.method8804();
        } else if (arg1 == 77 || arg1 == 92) {
            this.field2189 = arg0.method8899();
            if (this.field2189 == 65535) {
                this.field2189 = -1;
            }
            this.field2182 = arg0.method8899();
            if (this.field2182 == 65535) {
                this.field2182 = -1;
            }
            int var13 = -1;
            if (arg1 == 92) {
                var13 = arg0.method8899();
                if (var13 == 65535) {
                    var13 = -1;
                }
            }
            int var14 = arg0.method8804();
            this.field2194 = new int[var14 + 2];
            for (int var15 = 0; var15 <= var14; var15++) {
                this.field2194[var15] = arg0.method8899();
                if (this.field2194[var15] == 65535) {
                    this.field2194[var15] = -1;
                }
            }
            this.field2194[var14 + 1] = var13;
        } else if (arg1 == 78) {
            this.field2197 = arg0.method8899();
            this.field2198 = arg0.method8804();
            this.field2199 = arg0.method8804();
        } else if (arg1 == 79) {
            this.field2200 = arg0.method8899();
            this.field2201 = arg0.method8899();
            this.field2198 = arg0.method8804();
            this.field2199 = arg0.method8804();
            int var11 = arg0.method8804();
            this.field2202 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2202[var12] = arg0.method8899();
            }
        } else if (arg1 == 81) {
            arg0.method8804();
        } else if (arg1 == 82) {
            this.field2181 = arg0.method8899();
        } else if (arg1 == 89) {
            this.field2188 = false;
        } else if (arg1 == 90) {
            this.field2204 = true;
        } else if (arg1 == 249) {
            this.field2178 = class186.method2650(arg0, this.field2178);
        }
    }

    @ObfuscatedName("ho.ap(II)Z")
    public final boolean method3611(int arg0) {
        if (this.field2195 != null) {
            for (int var4 = 0; var4 < this.field2195.length; var4++) {
                if (this.field2195[var4] == arg0) {
                    return Statics.field2167.method6541(this.field2155[var4] & 0xFFFF, 0);
                }
            }
            return true;
        } else if (this.field2155 == null) {
            return true;
        } else if (arg0 == 10) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field2155.length; var3++) {
                var2 &= Statics.field2167.method6541(this.field2155[var3] & 0xFFFF, 0);
            }
            return var2;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ho.an(B)Z")
    public final boolean method3612() {
        if (this.field2155 == null) {
            return true;
        }
        boolean var1 = true;
        for (int var2 = 0; var2 < this.field2155.length; var2++) {
            var1 &= Statics.field2167.method6541(this.field2155[var2] & 0xFFFF, 0);
        }
        return var1;
    }

    @ObfuscatedName("ho.aj(II[[IIIIB)Lkt;")
    public final class286 method3613(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2195 == null) {
            var7 = (long) ((this.field2160 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2160 << 10) + (arg0 << 3) + arg1);
        }
        class286 var9 = (class286) field2157.method5495(var7);
        if (var9 == null) {
            class273 var10 = this.method3649(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            if (this.field2174) {
                var10.field2800 = (short) (this.field2175 + 64);
                var10.field2801 = (short) (this.field2152 + 768);
                var10.method4686();
                var9 = var10;
            } else {
                var9 = var10.method4682(this.field2175 + 64, this.field2152 + 768, -50, -10, -50);
            }
            field2157.method5498(var9, var7);
        }
        if (this.field2174) {
            var9 = ((class273) var9).method4674();
        }
        if (this.field2173 >= 0) {
            if (var9 instanceof class294) {
                var9 = ((class294) var9).method5244(arg2, arg3, arg4, arg5, true, this.field2173);
            } else if (var9 instanceof class273) {
                var9 = ((class273) var9).method4675(arg2, arg3, arg4, arg5, true, this.field2173);
            }
        }
        return var9;
    }

    @ObfuscatedName("ho.av(II[[IIIII)Llv;")
    public final class294 method3656(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        long var7;
        if (this.field2195 == null) {
            var7 = (long) ((this.field2160 << 10) + arg1);
        } else {
            var7 = (long) ((this.field2160 << 10) + (arg0 << 3) + arg1);
        }
        class294 var9 = (class294) field2191.method5495(var7);
        if (var9 == null) {
            class273 var10 = this.method3649(arg0, arg1);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method4682(this.field2175 + 64, this.field2152 + 768, -50, -10, -50);
            field2191.method5498(var9, var7);
        }
        if (this.field2173 >= 0) {
            var9 = var9.method5244(arg2, arg3, arg4, arg5, true, this.field2173);
        }
        return var9;
    }

    @ObfuscatedName("ho.ab(II[[IIIILii;IB)Llv;")
    public final class294 method3615(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, class210 arg6, int arg7) {
        long var9;
        if (this.field2195 == null) {
            var9 = (long) ((this.field2160 << 10) + arg1);
        } else {
            var9 = (long) ((this.field2160 << 10) + (arg0 << 3) + arg1);
        }
        class294 var11 = (class294) field2191.method5495(var9);
        if (var11 == null) {
            class273 var12 = this.method3649(arg0, arg1);
            if (var12 == null) {
                return null;
            }
            var11 = var12.method4682(this.field2175 + 64, this.field2152 + 768, -50, -10, -50);
            field2191.method5498(var11, var9);
        }
        if (arg6 == null && this.field2173 == -1) {
            return var11;
        }
        class294 var13;
        if (arg6 == null) {
            var13 = var11.method5311(true);
        } else {
            var13 = arg6.method3752(var11, arg7, arg1);
        }
        if (this.field2173 >= 0) {
            var13 = var13.method5244(arg2, arg3, arg4, arg5, false, this.field2173);
        }
        return var13;
    }

    @ObfuscatedName("ho.ai(III)Lkr;")
    public final class273 method3649(int arg0, int arg1) {
        class273 var3 = null;
        if (this.field2195 == null) {
            if (arg0 != 10) {
                return null;
            }
            if (this.field2155 == null) {
                return null;
            }
            boolean var4 = this.field2180;
            if (arg0 == 2 && arg1 > 3) {
                var4 = !var4;
            }
            int var5 = this.field2155.length;
            for (int var6 = 0; var6 < var5; var6++) {
                int var7 = this.field2155[var6];
                if (var4) {
                    var7 += 65536;
                }
                var3 = (class273) field2156.method5495((long) var7);
                if (var3 == null) {
                    var3 = class273.method4687(Statics.field2167, var7 & 0xFFFF, 0);
                    if (var3 == null) {
                        return null;
                    }
                    if (var4) {
                        var3.method4684();
                    }
                    field2156.method5498(var3, (long) var7);
                }
                if (var5 > 1) {
                    field2159[var6] = var3;
                }
            }
            if (var5 > 1) {
                var3 = new class273(field2159, var5);
            }
        } else {
            int var8 = -1;
            for (int var9 = 0; var9 < this.field2195.length; var9++) {
                if (this.field2195[var9] == arg0) {
                    var8 = var9;
                    break;
                }
            }
            if (var8 == -1) {
                return null;
            }
            int var10 = this.field2155[var8];
            boolean var11 = this.field2180 ^ arg1 > 3;
            if (var11) {
                var10 += 65536;
            }
            var3 = (class273) field2156.method5495((long) var10);
            if (var3 == null) {
                var3 = class273.method4687(Statics.field2167, var10 & 0xFFFF, 0);
                if (var3 == null) {
                    return null;
                }
                if (var11) {
                    var3.method4684();
                }
                field2156.method5498(var3, (long) var10);
            }
        }
        boolean var12;
        if (this.field2205 == 128 && this.field2186 == 128 && this.field2187 == 128) {
            var12 = false;
        } else {
            var12 = true;
        }
        boolean var13;
        if (this.field2183 == 0 && this.field2166 == 0 && this.field2190 == 0) {
            var13 = false;
        } else {
            var13 = true;
        }
        class273 var14 = new class273(var3, arg1 == 0 && !var12 && !var13, this.field2164 == null, this.field2163 == null, true);
        if (arg0 == 4 && arg1 > 3) {
            var14.method4680(256);
            var14.method4709(45, 0, -45);
        }
        int var15 = arg1 & 0x3;
        if (var15 == 1) {
            var14.method4677();
        } else if (var15 == 2) {
            var14.method4672();
        } else if (var15 == 3) {
            var14.method4679();
        }
        if (this.field2164 != null) {
            for (int var16 = 0; var16 < this.field2164.length; var16++) {
                var14.method4732(this.field2164[var16], this.field2165[var16]);
            }
        }
        if (this.field2163 != null) {
            for (int var17 = 0; var17 < this.field2163.length; var17++) {
                var14.method4741(this.field2163[var17], this.field2179[var17]);
            }
        }
        if (var12) {
            var14.method4678(this.field2205, this.field2186, this.field2187);
        }
        if (var13) {
            var14.method4709(this.field2183, this.field2166, this.field2190);
        }
        return var14;
    }

    @ObfuscatedName("ho.ae(I)Lho;")
    public final class207 method3616() {
        int var1 = -1;
        if (this.field2189 != -1) {
            var1 = class347.method3186(this.field2189);
        } else if (this.field2182 != -1) {
            var1 = class347.field3731[this.field2182];
        }
        int var2;
        if (var1 >= 0 && var1 < this.field2194.length - 1) {
            var2 = this.field2194[var1];
        } else {
            var2 = this.field2194[this.field2194.length - 1];
        }
        return var2 == -1 ? null : method95(var2);
    }

    @ObfuscatedName("ho.au(III)I")
    public int method3652(int arg0, int arg1) {
        return class186.method4567(this.field2178, arg0, arg1);
    }

    @ObfuscatedName("ho.ah(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3618(int arg0, String arg1) {
        return class186.method2668(this.field2178, arg0, arg1);
    }

    @ObfuscatedName("si.az(I)V")
    public static void method8058() {
        field2170.method5500();
        field2156.method5500();
        field2157.method5500();
        field2191.method5500();
    }

    @ObfuscatedName("ho.ax(I)Z")
    public boolean method3619() {
        if (this.field2194 == null) {
            return this.field2197 != -1 || this.field2202 != null;
        }
        for (int var1 = 0; var1 < this.field2194.length; var1++) {
            if (this.field2194[var1] != -1) {
                class207 var2 = method95(this.field2194[var1]);
                if (var2.field2197 != -1 || var2.field2202 != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
