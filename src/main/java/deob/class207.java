package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("hs")
public class class207 extends class488 {

    @ObfuscatedName("hs.aq")
    public static boolean field2268 = false;

    @ObfuscatedName("hs.az")
    public static boolean field2251 = false;

    @ObfuscatedName("hs.ao")
    public static class304 field2252 = new class304(64);

    @ObfuscatedName("hs.au")
    public static class304 field2253 = new class304(100);

    @ObfuscatedName("hs.ak")
    public static class304 field2254 = new class304(100);

    @ObfuscatedName("hs.ah")
    public int field2255 = -1;

    @ObfuscatedName("hs.aj")
    public Map field2256;

    @ObfuscatedName("hs.af")
    public int field2262 = 0;

    @ObfuscatedName("hs.ax")
    public int field2261 = 0;

    @ObfuscatedName("hs.an")
    public int[] field2259;

    @ObfuscatedName("hs.ag")
    public int[] field2260;

    @ObfuscatedName("hs.am")
    public int[] field2257;

    @ObfuscatedName("hs.ad")
    public class203[] field2258;

    @ObfuscatedName("hs.at")
    public int field2247 = -1;

    @ObfuscatedName("hs.ay")
    public int[] field2264;

    @ObfuscatedName("hs.ae")
    public boolean[] field2265;

    @ObfuscatedName("hs.ac")
    public boolean field2266 = false;

    @ObfuscatedName("hs.ab")
    public int field2267 = 5;

    @ObfuscatedName("hs.av")
    public int field2263 = -1;

    @ObfuscatedName("hs.ap")
    public int field2269 = -1;

    @ObfuscatedName("hs.bu")
    public int field2270 = 99;

    @ObfuscatedName("hs.bo")
    public boolean field2271 = false;

    @ObfuscatedName("hs.bd")
    public int field2272 = -1;

    @ObfuscatedName("hs.bi")
    public int field2274 = -1;

    @ObfuscatedName("hs.bq")
    public int field2273 = 2;

    @ObfuscatedName("io.aq(II)Lhs;")
    public static class207 method3902(int arg0) {
        class207 var1 = (class207) field2252.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1697.method6489(12, arg0);
        class207 var3 = new class207();
        if (var2 != null) {
            var3.method3722(new class534(var2));
        }
        var3.method3724();
        field2252.method5421(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hs.aw(Luq;I)V")
    public void method3722(class534 arg0) {
        while (true) {
            int var2 = arg0.method8591();
            if (var2 == 0) {
                return;
            }
            this.method3723(arg0, var2);
        }
    }

    @ObfuscatedName("hs.al(Luq;II)V")
    public void method3723(class534 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8593();
            this.field2257 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2257[var4] = arg0.method8593();
            }
            this.field2259 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2259[var5] = arg0.method8593();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2259[var6] += arg0.method8593() << 16;
            }
        } else if (arg1 == 2) {
            this.field2247 = arg0.method8593();
        } else if (arg1 == 3) {
            int var7 = arg0.method8591();
            this.field2264 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2264[var8] = arg0.method8591();
            }
            this.field2264[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2266 = true;
        } else if (arg1 == 5) {
            this.field2267 = arg0.method8591();
        } else if (arg1 == 6) {
            this.field2263 = arg0.method8593();
        } else if (arg1 == 7) {
            this.field2269 = arg0.method8593();
        } else if (arg1 == 8) {
            this.field2270 = arg0.method8591();
            this.field2271 = true;
        } else if (arg1 == 9) {
            this.field2272 = arg0.method8591();
        } else if (arg1 == 10) {
            this.field2274 = arg0.method8591();
        } else if (arg1 == 11) {
            this.field2273 = arg0.method8591();
        } else if (arg1 == 12) {
            int var9 = arg0.method8591();
            this.field2260 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2260[var10] = arg0.method8593();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2260[var11] += arg0.method8593() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8591();
            this.field2258 = new class203[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                class203[] var14;
                class203 var24;
                label128: {
                    var14 = this.field2258;
                    if (arg0 != null) {
                        boolean var16 = false;
                        boolean var17 = false;
                        boolean var18 = false;
                        int var19 = 0;
                        int var21;
                        int var22;
                        int var23;
                        if (field2251) {
                            var22 = arg0.method8593();
                            var23 = arg0.method8591();
                            var21 = arg0.method8591();
                            var19 = arg0.method8591();
                        } else {
                            int var20 = arg0.method8595();
                            var21 = var20 & 0xF;
                            var22 = var20 >> 8;
                            var23 = var20 >> 4 & 0x7;
                        }
                        if (var22 >= 1 && var23 >= 1 && var21 >= 0 && var19 >= 0) {
                            var24 = new class203(var22, var23, var21, var19);
                            break label128;
                        }
                    }
                    var24 = null;
                }
                var14[var13] = var24;
            }
        } else if (arg1 == 14) {
            this.field2255 = arg0.method8597();
        } else if (arg1 == 15) {
            int var25 = arg0.method8593();
            this.field2256 = new HashMap();
            for (int var26 = 0; var26 < var25; var26++) {
                int var27;
                class203 var36;
                label112: {
                    var27 = arg0.method8593();
                    if (arg0 != null) {
                        boolean var28 = false;
                        boolean var29 = false;
                        boolean var30 = false;
                        int var31 = 0;
                        int var33;
                        int var34;
                        int var35;
                        if (field2251) {
                            var34 = arg0.method8593();
                            var35 = arg0.method8591();
                            var33 = arg0.method8591();
                            var31 = arg0.method8591();
                        } else {
                            int var32 = arg0.method8595();
                            var33 = var32 & 0xF;
                            var34 = var32 >> 8;
                            var35 = var32 >> 4 & 0x7;
                        }
                        if (var34 >= 1 && var35 >= 1 && var33 >= 0 && var31 >= 0) {
                            var36 = new class203(var34, var35, var33, var31);
                            break label112;
                        }
                    }
                    var36 = null;
                }
                this.field2256.put(var27, var36);
            }
        } else if (arg1 == 16) {
            this.field2262 = arg0.method8593();
            this.field2261 = arg0.method8593();
        } else if (arg1 == 17) {
            this.field2265 = new boolean[256];
            for (int var38 = 0; var38 < this.field2265.length; var38++) {
                this.field2265[var38] = false;
            }
            int var39 = arg0.method8591();
            for (int var40 = 0; var40 < var39; var40++) {
                this.field2265[arg0.method8591()] = true;
            }
        }
    }

    @ObfuscatedName("hs.ai(I)V")
    public void method3724() {
        if (this.field2272 == -1) {
            if (this.field2264 == null && this.field2265 == null) {
                this.field2272 = 0;
            } else {
                this.field2272 = 2;
            }
        }
        if (this.field2274 != -1) {
            return;
        }
        if (this.field2264 == null && this.field2265 == null) {
            this.field2274 = 0;
        } else {
            this.field2274 = 2;
        }
    }

    @ObfuscatedName("hs.ar(Lkz;II)Lkz;")
    public class285 method3725(class285 arg0, int arg1) {
        if (this.method3731()) {
            int var7 = this.field2255;
            class141 var8 = (class141) field2254.method5414((long) var7);
            class141 var9;
            if (var8 == null) {
                class141 var10 = Statics.method2326(Statics.field1618, Statics.field1627, var7, false);
                if (var10 != null) {
                    field2254.method5421(var10, (long) var7);
                }
                var9 = var10;
            } else {
                var9 = var8;
            }
            int var12;
            if (var9 == null) {
                var12 = 2;
            } else {
                var12 = var9.method3004() ? 0 : 1;
            }
            class141 var13;
            if (var12 == 0) {
                class141 var14 = (class141) field2254.method5414((long) var7);
                class141 var15;
                if (var14 == null) {
                    class141 var16 = Statics.method2326(Statics.field1618, Statics.field1627, var7, false);
                    if (var16 != null) {
                        field2254.method5421(var16, (long) var7);
                    }
                    var15 = var16;
                } else {
                    var15 = var14;
                }
                var13 = var15;
            } else {
                var13 = null;
            }
            if (var13 == null) {
                return arg0.method5150(true);
            } else {
                class285 var18 = arg0.method5150(!var13.method3000());
                var18.method5159(var13, arg1);
                return var18;
            }
        } else {
            int var3 = this.field2259[arg1];
            class280 var4 = method5734(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method5150(true);
            } else {
                class285 var6 = arg0.method5150(!var4.method5092(var5));
                var6.method5181(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hs.as(Lkz;III)Lkz;")
    public class285 method3738(class285 arg0, int arg1, int arg2) {
        if (!this.method3731()) {
            int var4 = this.field2259[arg1];
            class280 var5 = method5734(var4 >> 16);
            int var6 = var4 & 0xFFFF;
            if (var5 == null) {
                return arg0.method5150(true);
            }
            class285 var7 = arg0.method5150(!var5.method5092(var6));
            int var8 = arg2 & 0x3;
            if (var8 == 1) {
                var7.method5168();
            } else if (var8 == 2) {
                var7.method5236();
            } else if (var8 == 3) {
                var7.method5251();
            }
            var7.method5181(var5, var6);
            if (var8 == 1) {
                var7.method5251();
            } else if (var8 == 2) {
                var7.method5236();
            } else if (var8 == 3) {
                var7.method5168();
            }
            return var7;
        }
        int var9 = this.field2255;
        class141 var10 = (class141) field2254.method5414((long) var9);
        class141 var11;
        if (var10 == null) {
            class141 var12 = Statics.method2326(Statics.field1618, Statics.field1627, var9, false);
            if (var12 != null) {
                field2254.method5421(var12, (long) var9);
            }
            var11 = var12;
        } else {
            var11 = var10;
        }
        int var14;
        if (var11 == null) {
            var14 = 2;
        } else {
            var14 = var11.method3004() ? 0 : 1;
        }
        class141 var15;
        if (var14 == 0) {
            class141 var16 = (class141) field2254.method5414((long) var9);
            class141 var17;
            if (var16 == null) {
                class141 var18 = Statics.method2326(Statics.field1618, Statics.field1627, var9, false);
                if (var18 != null) {
                    field2254.method5421(var18, (long) var9);
                }
                var17 = var18;
            } else {
                var17 = var16;
            }
            var15 = var17;
        } else {
            var15 = null;
        }
        if (var15 == null) {
            return arg0.method5150(true);
        }
        class285 var20 = arg0.method5150(!var15.method3000());
        int var21 = arg2 & 0x3;
        if (var21 == 1) {
            var20.method5168();
        } else if (var21 == 2) {
            var20.method5236();
        } else if (var21 == 3) {
            var20.method5251();
        }
        var20.method5159(var15, arg1);
        if (var21 == 1) {
            var20.method5251();
        } else if (var21 == 2) {
            var20.method5236();
        } else if (var21 == 3) {
            var20.method5168();
        }
        return var20;
    }

    @ObfuscatedName("hs.aa(Lkz;II)Lkz;")
    public class285 method3727(class285 arg0, int arg1) {
        if (this.method3731()) {
            int var7 = this.field2255;
            class141 var8 = (class141) field2254.method5414((long) var7);
            class141 var9;
            if (var8 == null) {
                class141 var10 = Statics.method2326(Statics.field1618, Statics.field1627, var7, false);
                if (var10 != null) {
                    field2254.method5421(var10, (long) var7);
                }
                var9 = var10;
            } else {
                var9 = var8;
            }
            int var12;
            if (var9 == null) {
                var12 = 2;
            } else {
                var12 = var9.method3004() ? 0 : 1;
            }
            class141 var13;
            if (var12 == 0) {
                class141 var14 = (class141) field2254.method5414((long) var7);
                class141 var15;
                if (var14 == null) {
                    class141 var16 = Statics.method2326(Statics.field1618, Statics.field1627, var7, false);
                    if (var16 != null) {
                        field2254.method5421(var16, (long) var7);
                    }
                    var15 = var16;
                } else {
                    var15 = var14;
                }
                var13 = var15;
            } else {
                var13 = null;
            }
            if (var13 == null) {
                return arg0.method5169(true);
            } else {
                class285 var18 = arg0.method5169(!var13.method3000());
                var18.method5159(var13, arg1);
                return var18;
            }
        } else {
            int var3 = this.field2259[arg1];
            class280 var4 = method5734(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method5169(true);
            } else {
                class285 var6 = arg0.method5169(!var4.method5092(var5));
                var6.method5181(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hs.az(Lkz;ILhs;II)Lkz;")
    public class285 method3728(class285 arg0, int arg1, class207 arg2, int arg3) {
        if (field2268 && !this.method3731() && !arg2.method3731()) {
            return this.method3729(arg0, arg1, arg2, arg3);
        }
        class285 var5 = arg0.method5150(false);
        boolean var6 = false;
        class280 var7 = null;
        class275 var8 = null;
        if (this.method3731()) {
            class141 var9 = this.method3726();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3731() && this.field2265 == null) {
                var5.method5159(var9, arg1);
                return var5;
            }
            var8 = var9.field1636;
            var5.method5163(var8, var9, arg1, this.field2265, false, !arg2.method3731());
        } else {
            int var10 = this.field2259[arg1];
            var7 = method5734(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3725(arg0, arg3);
            }
            if (!arg2.method3731() && (this.field2264 == null || arg3 == -1)) {
                var5.method5181(var7, arg1);
                return var5;
            }
            if (this.field2264 == null || arg3 == -1) {
                var5.method5181(var7, arg1);
                return var5;
            }
            var6 = arg2.method3731();
            if (!var6) {
                var5.method5164(var7, arg1, this.field2264, false);
            }
        }
        if (arg2.method3731()) {
            class141 var11 = arg2.method3726();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1636;
            }
            var5.method5163(var8, var11, arg3, this.field2265, true, true);
        } else {
            int var12 = arg2.field2259[arg3];
            class280 var13 = method5734(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3725(arg0, arg1);
            }
            var5.method5164(var13, var14, this.field2264, true);
        }
        if (var6 && var7 != null) {
            var5.method5164(var7, arg1, this.field2264, false);
        }
        var5.method5157();
        return var5;
    }

    @ObfuscatedName("hs.ao(Lkz;ILhs;IB)Lkz;")
    public class285 method3729(class285 arg0, int arg1, class207 arg2, int arg3) {
        int var5 = this.field2259[arg1];
        class280 var6 = method5734(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3725(arg0, arg3);
        }
        int var8 = arg2.field2259[arg3];
        class280 var9 = method5734(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class285 var11 = arg0.method5150(!var6.method5092(var7));
            var11.method5181(var6, var7);
            return var11;
        } else {
            class285 var12 = arg0.method5150(!var6.method5092(var7) & !var9.method5092(var10));
            var12.method5162(var6, var7, var9, var10, this.field2264);
            return var12;
        }
    }

    @ObfuscatedName("hs.au(Lkz;II)Lkz;")
    public class285 method3745(class285 arg0, int arg1) {
        if (this.method3731()) {
            return this.method3725(arg0, arg1);
        }
        int var3 = this.field2259[arg1];
        class280 var4 = method5734(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method5150(true);
        }
        class280 var6 = null;
        int var7 = 0;
        if (this.field2260 != null && arg1 < this.field2260.length) {
            int var8 = this.field2260[arg1];
            var6 = method5734(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class285 var10 = arg0.method5150(!var4.method5092(var5));
            var10.method5181(var4, var5);
            return var10;
        } else {
            class285 var9 = arg0.method5150(!var4.method5092(var5) & !var6.method5092(var7));
            var9.method5181(var4, var5);
            var9.method5181(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("hs.ak(B)Z")
    public boolean method3731() {
        return this.field2255 >= 0;
    }

    @ObfuscatedName("hs.ah(B)I")
    public int method3732() {
        return this.field2261 - this.field2262;
    }

    @ObfuscatedName("mv.aj(II)Lks;")
    public static class280 method5734(int arg0) {
        class280 var1 = (class280) field2253.method5414((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class280 var2 = class280.method3153(Statics.field1618, Statics.field1627, arg0, false);
        if (var2 != null) {
            field2253.method5421(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("hs.af(I)Lfc;")
    public class141 method3726() {
        if (!this.method3731()) {
            return null;
        }
        int var1 = this.field2255;
        class141 var2 = (class141) field2254.method5414((long) var1);
        class141 var3;
        if (var2 == null) {
            class141 var4 = Statics.method2326(Statics.field1618, Statics.field1627, var1, false);
            if (var4 != null) {
                field2254.method5421(var4, (long) var1);
            }
            var3 = var4;
        } else {
            var3 = var2;
        }
        int var6;
        if (var3 == null) {
            var6 = 2;
        } else {
            var6 = var3.method3004() ? 0 : 1;
        }
        class141 var7;
        if (var6 == 0) {
            class141 var8 = (class141) field2254.method5414((long) var1);
            class141 var9;
            if (var8 == null) {
                class141 var10 = Statics.method2326(Statics.field1618, Statics.field1627, var1, false);
                if (var10 != null) {
                    field2254.method5421(var10, (long) var1);
                }
                var9 = var10;
            } else {
                var9 = var8;
            }
            var7 = var9;
        } else {
            var7 = null;
        }
        return var7;
    }

    @ObfuscatedName("pl.ax(B)V")
    public static void method6666() {
        field2252.method5418();
        field2253.method5418();
        field2254.method5418();
    }
}
