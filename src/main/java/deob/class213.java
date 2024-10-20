package deob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("iu")
public class class213 extends class511 {

    @ObfuscatedName("iu.ap")
    public static boolean field2317 = false;

    @ObfuscatedName("iu.ae")
    public static class316 field2307 = new class316(64);

    @ObfuscatedName("iu.am")
    public static class316 field2308 = new class316(100);

    @ObfuscatedName("iu.at")
    public static class316 field2312 = new class316(100);

    @ObfuscatedName("iu.au")
    public int field2310 = -1;

    @ObfuscatedName("iu.an")
    public Map field2311;

    @ObfuscatedName("iu.ao")
    public int field2304 = 0;

    @ObfuscatedName("iu.af")
    public int field2313 = 0;

    @ObfuscatedName("iu.ar")
    public int[] field2314;

    @ObfuscatedName("iu.ab")
    public int[] field2322;

    @ObfuscatedName("iu.az")
    public int[] field2316;

    @ObfuscatedName("iu.ag")
    public int field2309 = -1;

    @ObfuscatedName("iu.ad")
    public int[] field2318;

    @ObfuscatedName("iu.ac")
    public boolean[] field2319;

    @ObfuscatedName("iu.av")
    public boolean field2320 = false;

    @ObfuscatedName("iu.ax")
    public int field2321 = 5;

    @ObfuscatedName("iu.aq")
    public int field2327 = -1;

    @ObfuscatedName("iu.al")
    public int field2315 = -1;

    @ObfuscatedName("iu.aa")
    public int field2324 = 99;

    @ObfuscatedName("iu.ah")
    public boolean field2325 = false;

    @ObfuscatedName("iu.bh")
    public int field2326 = -1;

    @ObfuscatedName("iu.bj")
    public int field2328 = -1;

    @ObfuscatedName("iu.bv")
    public int field2323 = 2;

    @ObfuscatedName("ng.ap(IS)Liu;")
    public static class213 method6692(int arg0) {
        class213 var1 = (class213) field2307.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field5228.method7009(12, arg0);
        class213 var3 = new class213();
        if (var2 != null) {
            var3.method4091(new class558(var2));
        }
        var3.method4102();
        field2307.method5931(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("iu.aw(Lvl;B)V")
    public void method4091(class558 arg0) {
        while (true) {
            int var2 = arg0.method9258();
            if (var2 == 0) {
                return;
            }
            this.method4123(arg0, var2);
        }
    }

    @ObfuscatedName("iu.ak(Lvl;II)V")
    public void method4123(class558 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method9260();
            this.field2316 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2316[var4] = arg0.method9260();
            }
            this.field2314 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2314[var5] = arg0.method9260();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2314[var6] += arg0.method9260() << 16;
            }
        } else if (arg1 == 2) {
            this.field2309 = arg0.method9260();
        } else if (arg1 == 3) {
            int var7 = arg0.method9258();
            this.field2318 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2318[var8] = arg0.method9258();
            }
            this.field2318[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2320 = true;
        } else if (arg1 == 5) {
            this.field2321 = arg0.method9258();
        } else if (arg1 == 6) {
            this.field2327 = arg0.method9260();
        } else if (arg1 == 7) {
            this.field2315 = arg0.method9260();
        } else if (arg1 == 8) {
            this.field2324 = arg0.method9258();
            this.field2325 = true;
        } else if (arg1 == 9) {
            this.field2326 = arg0.method9258();
        } else if (arg1 == 10) {
            this.field2328 = arg0.method9258();
        } else if (arg1 == 11) {
            this.field2323 = arg0.method9258();
        } else if (arg1 == 12) {
            int var9 = arg0.method9258();
            this.field2322 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2322[var10] = arg0.method9260();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2322[var11] += arg0.method9260() << 16;
            }
        } else if (arg1 == 13) {
            if (class556.field5458 >= 226) {
                this.field2310 = arg0.method9264();
            } else {
                int var12 = arg0.method9258();
                if (this.field2311 == null) {
                    this.field2311 = new HashMap();
                }
                for (int var13 = 0; var13 < var12; var13++) {
                    class209 var14 = method4266(arg0);
                    if (var14 != null) {
                        if (!this.field2311.containsKey(var13)) {
                            this.field2311.put(var13, new ArrayList());
                        }
                        ((ArrayList) this.field2311.get(var13)).add(var14);
                    }
                }
            }
        } else if (arg1 == 14) {
            if (class556.field5458 >= 226) {
                int var15 = arg0.method9260();
                if (this.field2311 == null) {
                    this.field2311 = new HashMap();
                }
                for (int var16 = 0; var16 < var15; var16++) {
                    int var17 = arg0.method9260();
                    class209 var18 = method4266(arg0);
                    if (var18 != null) {
                        if (!this.field2311.containsKey(var17)) {
                            this.field2311.put(var17, new ArrayList());
                        }
                        ((ArrayList) this.field2311.get(var17)).add(var18);
                    }
                }
            } else {
                this.field2310 = arg0.method9264();
            }
        } else if (arg1 == 15) {
            if (class556.field5458 >= 226) {
                this.field2304 = arg0.method9260();
                this.field2313 = arg0.method9260();
            } else {
                int var19 = arg0.method9260();
                if (this.field2311 == null) {
                    this.field2311 = new HashMap();
                }
                for (int var20 = 0; var20 < var19; var20++) {
                    int var21 = arg0.method9260();
                    class209 var22 = method4266(arg0);
                    if (var22 != null) {
                        if (!this.field2311.containsKey(var21)) {
                            this.field2311.put(var21, new ArrayList());
                        }
                        ((ArrayList) this.field2311.get(var21)).add(var22);
                    }
                }
            }
        } else if (arg1 == 16) {
            if (class556.field5458 < 226) {
                this.field2304 = arg0.method9260();
                this.field2313 = arg0.method9260();
            }
        } else if (arg1 == 17) {
            this.field2319 = new boolean[256];
            for (int var23 = 0; var23 < this.field2319.length; var23++) {
                this.field2319[var23] = false;
            }
            int var24 = arg0.method9258();
            for (int var25 = 0; var25 < var24; var25++) {
                this.field2319[arg0.method9258()] = true;
            }
        }
    }

    @ObfuscatedName("iu.aj(B)V")
    public void method4102() {
        if (this.field2326 == -1) {
            if (this.field2318 == null && this.field2319 == null) {
                this.field2326 = 0;
            } else {
                this.field2326 = 2;
            }
        }
        if (this.field2328 != -1) {
            return;
        }
        if (this.field2318 == null && this.field2319 == null) {
            this.field2328 = 0;
        } else {
            this.field2328 = 2;
        }
    }

    @ObfuscatedName("iu.ai(Ljy;IB)Ljy;")
    public class256 method4139(class256 arg0, int arg1) {
        if (this.method4100()) {
            int var7 = this.field2310;
            class146 var8;
            if (method3217(var7) == 0) {
                class146 var9 = (class146) field2312.method5928((long) var7);
                class146 var10;
                if (var9 == null) {
                    class146 var11 = class146.method5823(Statics.field2384, Statics.field2383, var7, false);
                    if (var11 != null) {
                        field2312.method5931(var11, (long) var7);
                    }
                    var10 = var11;
                } else {
                    var10 = var9;
                }
                var8 = var10;
            } else {
                var8 = null;
            }
            if (var8 == null) {
                return arg0.method4997(true);
            } else {
                class256 var13 = arg0.method4997(!var8.method3395());
                var13.method5006(var8, arg1);
                return var13;
            }
        } else {
            int var3 = this.field2314[arg1];
            class250 var4 = method3719(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4997(true);
            } else {
                class256 var6 = arg0.method4997(!var4.method4944(var5));
                var6.method5005(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("iu.ay(Ljy;IIB)Ljy;")
    public class256 method4109(class256 arg0, int arg1, int arg2) {
        if (!this.method4100()) {
            int var4 = this.field2314[arg1];
            class250 var5 = method3719(var4 >> 16);
            int var6 = var4 & 0xFFFF;
            if (var5 == null) {
                return arg0.method4997(true);
            }
            class256 var7 = arg0.method4997(!var5.method4944(var6));
            int var8 = arg2 & 0x3;
            if (var8 == 1) {
                var7.method5014();
            } else if (var8 == 2) {
                var7.method5030();
            } else if (var8 == 3) {
                var7.method5073();
            }
            var7.method5005(var5, var6);
            if (var8 == 1) {
                var7.method5073();
            } else if (var8 == 2) {
                var7.method5030();
            } else if (var8 == 3) {
                var7.method5014();
            }
            return var7;
        }
        int var9 = this.field2310;
        class146 var10;
        if (method3217(var9) == 0) {
            class146 var11 = (class146) field2312.method5928((long) var9);
            class146 var12;
            if (var11 == null) {
                class146 var13 = class146.method5823(Statics.field2384, Statics.field2383, var9, false);
                if (var13 != null) {
                    field2312.method5931(var13, (long) var9);
                }
                var12 = var13;
            } else {
                var12 = var11;
            }
            var10 = var12;
        } else {
            var10 = null;
        }
        if (var10 == null) {
            return arg0.method4997(true);
        }
        class256 var15 = arg0.method4997(!var10.method3395());
        int var16 = arg2 & 0x3;
        if (var16 == 1) {
            var15.method5014();
        } else if (var16 == 2) {
            var15.method5030();
        } else if (var16 == 3) {
            var15.method5073();
        }
        var15.method5006(var10, arg1);
        if (var16 == 1) {
            var15.method5073();
        } else if (var16 == 2) {
            var15.method5030();
        } else if (var16 == 3) {
            var15.method5014();
        }
        return var15;
    }

    @ObfuscatedName("iu.as(Ljy;IB)Ljy;")
    public class256 method4096(class256 arg0, int arg1) {
        if (this.method4100()) {
            int var7 = this.field2310;
            class146 var8;
            if (method3217(var7) == 0) {
                class146 var9 = (class146) field2312.method5928((long) var7);
                class146 var10;
                if (var9 == null) {
                    class146 var11 = class146.method5823(Statics.field2384, Statics.field2383, var7, false);
                    if (var11 != null) {
                        field2312.method5931(var11, (long) var7);
                    }
                    var10 = var11;
                } else {
                    var10 = var9;
                }
                var8 = var10;
            } else {
                var8 = null;
            }
            if (var8 == null) {
                return arg0.method4998(true);
            } else {
                class256 var13 = arg0.method4998(!var8.method3395());
                var13.method5006(var8, arg1);
                return var13;
            }
        } else {
            int var3 = this.field2314[arg1];
            class250 var4 = method3719(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4998(true);
            } else {
                class256 var6 = arg0.method4998(!var4.method4944(var5));
                var6.method5005(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("iu.ae(Ljy;ILiu;II)Ljy;")
    public class256 method4097(class256 arg0, int arg1, class213 arg2, int arg3) {
        if (field2317 && !this.method4100() && !arg2.method4100()) {
            return this.method4098(arg0, arg1, arg2, arg3);
        }
        class256 var5 = arg0.method4997(false);
        boolean var6 = false;
        class250 var7 = null;
        class244 var8 = null;
        if (this.method4100()) {
            class146 var9 = this.method4094();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method4100() && this.field2319 == null) {
                var5.method5006(var9, arg1);
                return var5;
            }
            var8 = var9.field1664;
            var5.method5000(var8, var9, arg1, this.field2319, false, !arg2.method4100());
        } else {
            int var10 = this.field2314[arg1];
            var7 = method3719(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method4139(arg0, arg3);
            }
            if (!arg2.method4100() && (this.field2318 == null || arg3 == -1)) {
                var5.method5005(var7, arg1);
                return var5;
            }
            if (this.field2318 == null || arg3 == -1) {
                var5.method5005(var7, arg1);
                return var5;
            }
            var6 = arg2.method4100();
            if (!var6) {
                var5.method5060(var7, arg1, this.field2318, false);
            }
        }
        if (arg2.method4100()) {
            class146 var11 = arg2.method4094();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1664;
            }
            var5.method5000(var8, var11, arg3, this.field2319, true, true);
        } else {
            int var12 = arg2.field2314[arg3];
            class250 var13 = method3719(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method4139(arg0, arg1);
            }
            var5.method5060(var13, var14, this.field2318, true);
        }
        if (var6 && var7 != null) {
            var5.method5060(var7, arg1, this.field2318, false);
        }
        var5.method5004();
        return var5;
    }

    @ObfuscatedName("iu.am(Ljy;ILiu;II)Ljy;")
    public class256 method4098(class256 arg0, int arg1, class213 arg2, int arg3) {
        int var5 = this.field2314[arg1];
        class250 var6 = method3719(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4139(arg0, arg3);
        }
        int var8 = arg2.field2314[arg3];
        class250 var9 = method3719(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class256 var11 = arg0.method4997(!var6.method4944(var7));
            var11.method5005(var6, var7);
            return var11;
        } else {
            class256 var12 = arg0.method4997(!var6.method4944(var7) & !var9.method4944(var10));
            var12.method5008(var6, var7, var9, var10, this.field2318);
            return var12;
        }
    }

    @ObfuscatedName("iu.at(Ljy;II)Ljy;")
    public class256 method4095(class256 arg0, int arg1) {
        if (this.method4100()) {
            return this.method4139(arg0, arg1);
        }
        int var3 = this.field2314[arg1];
        class250 var4 = method3719(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4997(true);
        }
        class250 var6 = null;
        int var7 = 0;
        if (this.field2322 != null && arg1 < this.field2322.length) {
            int var8 = this.field2322[arg1];
            var6 = method3719(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class256 var10 = arg0.method4997(!var4.method4944(var5));
            var10.method5005(var4, var5);
            return var10;
        } else {
            class256 var9 = arg0.method4997(!var4.method4944(var5) & !var6.method4944(var7));
            var9.method5005(var4, var5);
            var9.method5005(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("iu.au(B)Z")
    public boolean method4100() {
        return this.field2310 >= 0;
    }

    @ObfuscatedName("iu.an(B)I")
    public int method4101() {
        return this.field2313 - this.field2304;
    }

    @ObfuscatedName("ht.ao(IB)Lja;")
    public static class250 method3719(int arg0) {
        class250 var1 = (class250) field2308.method5928((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class250 var2 = class250.method8049(Statics.field2384, Statics.field2383, arg0, false);
        if (var2 != null) {
            field2308.method5931(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("fu.af(IB)I")
    public static int method3217(int arg0) {
        class146 var1 = (class146) field2312.method5928((long) arg0);
        class146 var2;
        if (var1 == null) {
            class146 var3 = class146.method5823(Statics.field2384, Statics.field2383, arg0, false);
            if (var3 != null) {
                field2312.method5931(var3, (long) arg0);
            }
            var2 = var3;
        } else {
            var2 = var1;
        }
        if (var2 == null) {
            return 2;
        } else if (var2.method3363()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("iu.ar(I)Lfr;")
    public class146 method4094() {
        if (!this.method4100()) {
            return null;
        }
        int var1 = this.field2310;
        class146 var2;
        if (method3217(var1) == 0) {
            class146 var3 = (class146) field2312.method5928((long) var1);
            class146 var4;
            if (var3 == null) {
                class146 var5 = class146.method5823(Statics.field2384, Statics.field2383, var1, false);
                if (var5 != null) {
                    field2312.method5931(var5, (long) var1);
                }
                var4 = var5;
            } else {
                var4 = var3;
            }
            var2 = var4;
        } else {
            var2 = null;
        }
        return var2;
    }

    @ObfuscatedName("if.ab(Lvl;B)Lih;")
    public static class209 method4266(class558 arg0) {
        if (arg0 != null) {
            boolean var1 = false;
            int var2 = -1;
            boolean var3 = false;
            boolean var4 = false;
            boolean var5 = false;
            int var6 = arg0.method9260();
            if (class556.field5458 >= 226) {
                var2 = arg0.method9258();
            }
            int var7 = arg0.method9258();
            int var8 = arg0.method9258();
            int var9 = arg0.method9258();
            if (var6 >= 1 && var7 >= 1 && var8 >= 0 && var9 >= 0) {
                return new class209(var6, var2, var7, var8, var9);
            }
        }
        return null;
    }
}
