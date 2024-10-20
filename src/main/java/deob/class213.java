package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("if")
public class class213 extends class504 {

    @ObfuscatedName("if.ac")
    public static boolean field2304 = false;

    @ObfuscatedName("if.at")
    public static class317 field2307 = new class317(64);

    @ObfuscatedName("if.au")
    public static class317 field2308 = new class317(100);

    @ObfuscatedName("if.ar")
    public static class317 field2315 = new class317(100);

    @ObfuscatedName("if.al")
    public int field2331 = -1;

    @ObfuscatedName("if.ad")
    public Map field2311;

    @ObfuscatedName("if.ah")
    public int field2306 = 0;

    @ObfuscatedName("if.ap")
    public int field2305 = 0;

    @ObfuscatedName("if.ab")
    public int[] field2314;

    @ObfuscatedName("if.az")
    public int[] field2310;

    @ObfuscatedName("if.aa")
    public int[] field2316;

    @ObfuscatedName("if.ai")
    public class209[] field2317;

    @ObfuscatedName("if.ao")
    public int field2318 = -1;

    @ObfuscatedName("if.as")
    public int[] field2319;

    @ObfuscatedName("if.ay")
    public boolean[] field2312;

    @ObfuscatedName("if.aj")
    public boolean field2321 = false;

    @ObfuscatedName("if.av")
    public int field2322 = 5;

    @ObfuscatedName("if.aw")
    public int field2323 = -1;

    @ObfuscatedName("if.an")
    public int field2332 = -1;

    @ObfuscatedName("if.ak")
    public int field2325 = 99;

    @ObfuscatedName("if.bn")
    public boolean field2326 = false;

    @ObfuscatedName("if.bh")
    public int field2303 = -1;

    @ObfuscatedName("if.bd")
    public int field2328 = -1;

    @ObfuscatedName("if.bx")
    public int field2329 = 2;

    @ObfuscatedName("kl.ac(Lpo;Lpo;Lpo;B)V")
    public static void method5222(class391 arg0, class391 arg1, class391 arg2) {
        Statics.field2327 = arg0;
        Statics.field1751 = arg1;
        Statics.field1960 = arg2;
    }

    @ObfuscatedName("ds.ae(II)Lif;")
    public static class213 method2555(int arg0) {
        class213 var1 = (class213) field2307.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2327.method6782(12, arg0);
        class213 var3 = new class213();
        if (var2 != null) {
            var3.method3945(new class551(var2));
        }
        var3.method4001();
        field2307.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("if.ag(Lvf;I)V")
    public void method3945(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3946(arg0, var2);
        }
    }

    @ObfuscatedName("if.am(Lvf;IB)V")
    public void method3946(class551 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method9119();
            this.field2316 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2316[var4] = arg0.method9119();
            }
            this.field2314 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2314[var5] = arg0.method9119();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2314[var6] += arg0.method9119() << 16;
            }
        } else if (arg1 == 2) {
            this.field2318 = arg0.method9119();
        } else if (arg1 == 3) {
            int var7 = arg0.method8955();
            this.field2319 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2319[var8] = arg0.method8955();
            }
            this.field2319[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2321 = true;
        } else if (arg1 == 5) {
            this.field2322 = arg0.method8955();
        } else if (arg1 == 6) {
            this.field2323 = arg0.method9119();
        } else if (arg1 == 7) {
            this.field2332 = arg0.method9119();
        } else if (arg1 == 8) {
            this.field2325 = arg0.method8955();
            this.field2326 = true;
        } else if (arg1 == 9) {
            this.field2303 = arg0.method8955();
        } else if (arg1 == 10) {
            this.field2328 = arg0.method8955();
        } else if (arg1 == 11) {
            this.field2329 = arg0.method8955();
        } else if (arg1 == 12) {
            int var9 = arg0.method8955();
            this.field2310 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2310[var10] = arg0.method9119();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2310[var11] += arg0.method9119() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8955();
            this.field2317 = new class209[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                class209[] var14;
                class209 var24;
                label118: {
                    var14 = this.field2317;
                    if (arg0 != null) {
                        boolean var16 = false;
                        boolean var17 = false;
                        boolean var18 = false;
                        boolean var19 = false;
                        int var20 = arg0.method9119();
                        int var21 = arg0.method8955();
                        int var22 = arg0.method8955();
                        int var23 = arg0.method8955();
                        if (var20 >= 1 && var21 >= 1 && var22 >= 0 && var23 >= 0) {
                            var24 = new class209(var20, var21, var22, var23);
                            break label118;
                        }
                    }
                    var24 = null;
                }
                var14[var13] = var24;
            }
        } else if (arg1 == 14) {
            this.field2331 = arg0.method9110();
        } else if (arg1 == 15) {
            int var25 = arg0.method9119();
            this.field2311 = new HashMap();
            for (int var26 = 0; var26 < var25; var26++) {
                int var27;
                class209 var36;
                label103: {
                    var27 = arg0.method9119();
                    if (arg0 != null) {
                        boolean var28 = false;
                        boolean var29 = false;
                        boolean var30 = false;
                        boolean var31 = false;
                        int var32 = arg0.method9119();
                        int var33 = arg0.method8955();
                        int var34 = arg0.method8955();
                        int var35 = arg0.method8955();
                        if (var32 >= 1 && var33 >= 1 && var34 >= 0 && var35 >= 0) {
                            var36 = new class209(var32, var33, var34, var35);
                            break label103;
                        }
                    }
                    var36 = null;
                }
                this.field2311.put(var27, var36);
            }
        } else if (arg1 == 16) {
            this.field2306 = arg0.method9119();
            this.field2305 = arg0.method9119();
        } else if (arg1 == 17) {
            this.field2312 = new boolean[256];
            for (int var38 = 0; var38 < this.field2312.length; var38++) {
                this.field2312[var38] = false;
            }
            int var39 = arg0.method8955();
            for (int var40 = 0; var40 < var39; var40++) {
                this.field2312[arg0.method8955()] = true;
            }
        }
    }

    @ObfuscatedName("if.ax(I)V")
    public void method4001() {
        if (this.field2303 == -1) {
            if (this.field2319 == null && this.field2312 == null) {
                this.field2303 = 0;
            } else {
                this.field2303 = 2;
            }
        }
        if (this.field2328 != -1) {
            return;
        }
        if (this.field2319 == null && this.field2312 == null) {
            this.field2328 = 0;
        } else {
            this.field2328 = 2;
        }
    }

    @ObfuscatedName("if.aq(Ljm;II)Ljm;")
    public class256 method3948(class256 arg0, int arg1) {
        if (this.method3954()) {
            class146 var7 = method2830(this.field2331);
            if (var7 == null) {
                return arg0.method4810(true);
            } else {
                class256 var8 = arg0.method4810(!var7.method3213());
                var8.method4879(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2314[arg1];
            class250 var4 = method3298(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4810(true);
            } else {
                class256 var6 = arg0.method4810(!var4.method4745(var5));
                var6.method4935(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("if.af(Ljm;III)Ljm;")
    public class256 method3949(class256 arg0, int arg1, int arg2) {
        if (this.method3954()) {
            class146 var9 = method2830(this.field2331);
            if (var9 == null) {
                return arg0.method4810(true);
            }
            class256 var10 = arg0.method4810(!var9.method3213());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4843();
            } else if (var11 == 2) {
                var10.method4806();
            } else if (var11 == 3) {
                var10.method4805();
            }
            var10.method4879(var9, arg1);
            if (var11 == 1) {
                var10.method4805();
            } else if (var11 == 2) {
                var10.method4806();
            } else if (var11 == 3) {
                var10.method4843();
            }
            return var10;
        }
        int var4 = this.field2314[arg1];
        class250 var5 = method3298(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4810(true);
        }
        class256 var7 = arg0.method4810(!var5.method4745(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4843();
        } else if (var8 == 2) {
            var7.method4806();
        } else if (var8 == 3) {
            var7.method4805();
        }
        var7.method4935(var5, var6);
        if (var8 == 1) {
            var7.method4805();
        } else if (var8 == 2) {
            var7.method4806();
        } else if (var8 == 3) {
            var7.method4843();
        }
        return var7;
    }

    @ObfuscatedName("if.at(Ljm;II)Ljm;")
    public class256 method3950(class256 arg0, int arg1) {
        if (this.method3954()) {
            class146 var7 = method2830(this.field2331);
            if (var7 == null) {
                return arg0.method4811(true);
            } else {
                class256 var8 = arg0.method4811(!var7.method3213());
                var8.method4879(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2314[arg1];
            class250 var4 = method3298(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4811(true);
            } else {
                class256 var6 = arg0.method4811(!var4.method4745(var5));
                var6.method4935(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("if.au(Ljm;ILif;II)Ljm;")
    public class256 method3951(class256 arg0, int arg1, class213 arg2, int arg3) {
        if (field2304 && !this.method3954() && !arg2.method3954()) {
            return this.method3952(arg0, arg1, arg2, arg3);
        }
        class256 var5 = arg0.method4810(false);
        boolean var6 = false;
        class250 var7 = null;
        class244 var8 = null;
        if (this.method3954()) {
            class146 var9 = this.method3956();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3954() && this.field2312 == null) {
                var5.method4879(var9, arg1);
                return var5;
            }
            var8 = var9.field1674;
            var5.method4822(var8, var9, arg1, this.field2312, false, !arg2.method3954());
        } else {
            int var10 = this.field2314[arg1];
            var7 = method3298(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3948(arg0, arg3);
            }
            if (!arg2.method3954() && (this.field2319 == null || arg3 == -1)) {
                var5.method4935(var7, arg1);
                return var5;
            }
            if (this.field2319 == null || arg3 == -1) {
                var5.method4935(var7, arg1);
                return var5;
            }
            var6 = arg2.method3954();
            if (!var6) {
                var5.method4868(var7, arg1, this.field2319, false);
            }
        }
        if (arg2.method3954()) {
            class146 var11 = arg2.method3956();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1674;
            }
            var5.method4822(var8, var11, arg3, this.field2312, true, true);
        } else {
            int var12 = arg2.field2314[arg3];
            class250 var13 = method3298(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3948(arg0, arg1);
            }
            var5.method4868(var13, var14, this.field2319, true);
        }
        if (var6 && var7 != null) {
            var5.method4868(var7, arg1, this.field2319, false);
        }
        var5.method4817();
        return var5;
    }

    @ObfuscatedName("if.ar(Ljm;ILif;IB)Ljm;")
    public class256 method3952(class256 arg0, int arg1, class213 arg2, int arg3) {
        int var5 = this.field2314[arg1];
        class250 var6 = method3298(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3948(arg0, arg3);
        }
        int var8 = arg2.field2314[arg3];
        class250 var9 = method3298(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class256 var11 = arg0.method4810(!var6.method4745(var7));
            var11.method4935(var6, var7);
            return var11;
        } else {
            class256 var12 = arg0.method4810(!var6.method4745(var7) & !var9.method4745(var10));
            var12.method4910(var6, var7, var9, var10, this.field2319);
            return var12;
        }
    }

    @ObfuscatedName("if.al(Ljm;II)Ljm;")
    public class256 method3953(class256 arg0, int arg1) {
        if (this.method3954()) {
            return this.method3948(arg0, arg1);
        }
        int var3 = this.field2314[arg1];
        class250 var4 = method3298(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4810(true);
        }
        class250 var6 = null;
        int var7 = 0;
        if (this.field2310 != null && arg1 < this.field2310.length) {
            int var8 = this.field2310[arg1];
            var6 = method3298(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class256 var10 = arg0.method4810(!var4.method4745(var5));
            var10.method4935(var4, var5);
            return var10;
        } else {
            class256 var9 = arg0.method4810(!var4.method4745(var5) & !var6.method4745(var7));
            var9.method4935(var4, var5);
            var9.method4935(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("if.ad(I)Z")
    public boolean method3954() {
        return this.field2331 >= 0;
    }

    @ObfuscatedName("if.ah(I)I")
    public int method3999() {
        return this.field2305 - this.field2306;
    }

    @ObfuscatedName("gb.ap(II)Ljk;")
    public static class250 method3298(int arg0) {
        class250 var1 = (class250) field2308.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class391 var2 = Statics.field1751;
        class391 var3 = Statics.field1960;
        boolean var4 = true;
        int[] var5 = var2.method6808(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method6789(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method6789(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class250 var10;
        if (var4) {
            try {
                var10 = new class250(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2308.method5735(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("et.ab(IB)I")
    public static int method3077(int arg0) {
        class146 var1 = method651(arg0);
        if (var1 == null) {
            return 2;
        } else if (var1.method3214()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("if.az(I)Lfo;")
    public class146 method3956() {
        return this.method3954() ? method2830(this.field2331) : null;
    }

    @ObfuscatedName("ex.aa(II)Lfo;")
    public static class146 method2830(int arg0) {
        return method3077(arg0) == 0 ? method651(arg0) : null;
    }

    @ObfuscatedName("ba.ai(II)Lfo;")
    public static class146 method651(int arg0) {
        class146 var1 = (class146) field2315.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class146 var2 = class146.method2817(Statics.field1751, Statics.field1960, arg0, false);
        if (var2 != null) {
            field2315.method5735(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("hl.ao(I)V")
    public static void method3704() {
        field2307.method5736();
        field2308.method5736();
        field2315.method5736();
    }
}
