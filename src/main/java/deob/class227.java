package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ic")
public class class227 extends class500 {

    @ObfuscatedName("ic.ak")
    public static boolean field2412 = false;

    @ObfuscatedName("ic.ab")
    public static class312 field2411 = new class312(64);

    @ObfuscatedName("ic.ac")
    public static class312 field2430 = new class312(100);

    @ObfuscatedName("ic.ao")
    public static class312 field2414 = new class312(100);

    @ObfuscatedName("ic.ah")
    public int field2415 = -1;

    @ObfuscatedName("ic.av")
    public Map field2416;

    @ObfuscatedName("ic.aq")
    public int field2420 = 0;

    @ObfuscatedName("ic.ap")
    public int field2418 = 0;

    @ObfuscatedName("ic.ae")
    public int[] field2424;

    @ObfuscatedName("ic.ax")
    public int[] field2408;

    @ObfuscatedName("ic.ay")
    public int[] field2421;

    @ObfuscatedName("ic.au")
    public class223[] field2422;

    @ObfuscatedName("ic.as")
    public int field2425 = -1;

    @ObfuscatedName("ic.aw")
    public int[] field2433;

    @ObfuscatedName("ic.ad")
    public boolean[] field2419;

    @ObfuscatedName("ic.ai")
    public boolean field2426 = false;

    @ObfuscatedName("ic.an")
    public int field2410 = 5;

    @ObfuscatedName("ic.am")
    public int field2428 = -1;

    @ObfuscatedName("ic.ar")
    public int field2429 = -1;

    @ObfuscatedName("ic.ag")
    public int field2427 = 99;

    @ObfuscatedName("ic.bs")
    public boolean field2431 = false;

    @ObfuscatedName("ic.bf")
    public int field2432 = -1;

    @ObfuscatedName("ic.bo")
    public int field2423 = -1;

    @ObfuscatedName("ic.bi")
    public int field2434 = 2;

    @ObfuscatedName("jc.ak(IS)Lic;")
    public static class227 method4744(int arg0) {
        class227 var1 = (class227) field2411.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2409.method6573(12, arg0);
        class227 var3 = new class227();
        if (var2 != null) {
            var3.method4010(new class546(var2));
        }
        var3.method4011();
        field2411.method5564(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ic.al(Lua;B)V")
    public void method4010(class546 arg0) {
        while (true) {
            int var2 = arg0.method8796();
            if (var2 == 0) {
                return;
            }
            this.method4019(arg0, var2);
        }
    }

    @ObfuscatedName("ic.aj(Lua;IS)V")
    public void method4019(class546 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8798();
            this.field2421 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2421[var4] = arg0.method8798();
            }
            this.field2424 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2424[var5] = arg0.method8798();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2424[var6] += arg0.method8798() << 16;
            }
        } else if (arg1 == 2) {
            this.field2425 = arg0.method8798();
        } else if (arg1 == 3) {
            int var7 = arg0.method8796();
            this.field2433 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2433[var8] = arg0.method8796();
            }
            this.field2433[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2426 = true;
        } else if (arg1 == 5) {
            this.field2410 = arg0.method8796();
        } else if (arg1 == 6) {
            this.field2428 = arg0.method8798();
        } else if (arg1 == 7) {
            this.field2429 = arg0.method8798();
        } else if (arg1 == 8) {
            this.field2427 = arg0.method8796();
            this.field2431 = true;
        } else if (arg1 == 9) {
            this.field2432 = arg0.method8796();
        } else if (arg1 == 10) {
            this.field2423 = arg0.method8796();
        } else if (arg1 == 11) {
            this.field2434 = arg0.method8796();
        } else if (arg1 == 12) {
            int var9 = arg0.method8796();
            this.field2408 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2408[var10] = arg0.method8798();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2408[var11] += arg0.method8798() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8796();
            this.field2422 = new class223[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2422[var13] = method1795(arg0);
            }
        } else if (arg1 == 14) {
            this.field2415 = arg0.method8801();
        } else if (arg1 == 15) {
            int var14 = arg0.method8798();
            this.field2416 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method8798();
                class223 var17 = method1795(arg0);
                this.field2416.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2420 = arg0.method8798();
            this.field2418 = arg0.method8798();
        } else if (arg1 == 17) {
            this.field2419 = new boolean[256];
            for (int var18 = 0; var18 < this.field2419.length; var18++) {
                this.field2419[var18] = false;
            }
            int var19 = arg0.method8796();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2419[arg0.method8796()] = true;
            }
        }
    }

    @ObfuscatedName("ic.az(I)V")
    public void method4011() {
        if (this.field2432 == -1) {
            if (this.field2433 == null && this.field2419 == null) {
                this.field2432 = 0;
            } else {
                this.field2432 = 2;
            }
        }
        if (this.field2423 != -1) {
            return;
        }
        if (this.field2433 == null && this.field2419 == null) {
            this.field2423 = 0;
        } else {
            this.field2423 = 2;
        }
    }

    @ObfuscatedName("ic.af(Lkb;II)Lkb;")
    public class264 method4012(class264 arg0, int arg1) {
        if (this.method4051()) {
            class142 var7 = method2871(this.field2415);
            if (var7 == null) {
                return arg0.method4842(true);
            } else {
                class264 var8 = arg0.method4842(!var7.method3004());
                var8.method4811(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2424[arg1];
            class258 var4 = method4154(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4842(true);
            } else {
                class264 var6 = arg0.method4842(!var4.method4745(var5));
                var6.method4810(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ic.aa(Lkb;III)Lkb;")
    public class264 method4013(class264 arg0, int arg1, int arg2) {
        if (this.method4051()) {
            class142 var9 = method2871(this.field2415);
            if (var9 == null) {
                return arg0.method4842(true);
            }
            class264 var10 = arg0.method4842(!var9.method3004());
            int var11 = arg2 & 0x3;
            if (var11 == 1) {
                var10.method4850();
            } else if (var11 == 2) {
                var10.method4814();
            } else if (var11 == 3) {
                var10.method4871();
            }
            var10.method4811(var9, arg1);
            if (var11 == 1) {
                var10.method4871();
            } else if (var11 == 2) {
                var10.method4814();
            } else if (var11 == 3) {
                var10.method4850();
            }
            return var10;
        }
        int var4 = this.field2424[arg1];
        class258 var5 = method4154(var4 >> 16);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method4842(true);
        }
        class264 var7 = arg0.method4842(!var5.method4745(var6));
        int var8 = arg2 & 0x3;
        if (var8 == 1) {
            var7.method4850();
        } else if (var8 == 2) {
            var7.method4814();
        } else if (var8 == 3) {
            var7.method4871();
        }
        var7.method4810(var5, var6);
        if (var8 == 1) {
            var7.method4871();
        } else if (var8 == 2) {
            var7.method4814();
        } else if (var8 == 3) {
            var7.method4850();
        }
        return var7;
    }

    @ObfuscatedName("ic.at(Lkb;IB)Lkb;")
    public class264 method4014(class264 arg0, int arg1) {
        if (this.method4051()) {
            class142 var7 = method2871(this.field2415);
            if (var7 == null) {
                return arg0.method4803(true);
            } else {
                class264 var8 = arg0.method4803(!var7.method3004());
                var8.method4811(var7, arg1);
                return var8;
            }
        } else {
            int var3 = this.field2424[arg1];
            class258 var4 = method4154(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method4803(true);
            } else {
                class264 var6 = arg0.method4803(!var4.method4745(var5));
                var6.method4810(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("ic.ab(Lkb;ILic;IB)Lkb;")
    public class264 method4015(class264 arg0, int arg1, class227 arg2, int arg3) {
        if (field2412 && !this.method4051() && !arg2.method4051()) {
            return this.method4055(arg0, arg1, arg2, arg3);
        }
        class264 var5 = arg0.method4842(false);
        boolean var6 = false;
        class258 var7 = null;
        class252 var8 = null;
        if (this.method4051()) {
            class142 var9 = this.method4020();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method4051() && this.field2419 == null) {
                var5.method4811(var9, arg1);
                return var5;
            }
            var8 = var9.field1651;
            var5.method4895(var8, var9, arg1, this.field2419, false, !arg2.method4051());
        } else {
            int var10 = this.field2424[arg1];
            var7 = method4154(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method4012(arg0, arg3);
            }
            if (!arg2.method4051() && (this.field2433 == null || arg3 == -1)) {
                var5.method4810(var7, arg1);
                return var5;
            }
            if (this.field2433 == null || arg3 == -1) {
                var5.method4810(var7, arg1);
                return var5;
            }
            var6 = arg2.method4051();
            if (!var6) {
                var5.method4816(var7, arg1, this.field2433, false);
            }
        }
        if (arg2.method4051()) {
            class142 var11 = arg2.method4020();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1651;
            }
            var5.method4895(var8, var11, arg3, this.field2419, true, true);
        } else {
            int var12 = arg2.field2424[arg3];
            class258 var13 = method4154(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method4012(arg0, arg1);
            }
            var5.method4816(var13, var14, this.field2433, true);
        }
        if (var6 && var7 != null) {
            var5.method4816(var7, arg1, this.field2433, false);
        }
        var5.method4809();
        return var5;
    }

    @ObfuscatedName("ic.ac(Lkb;ILic;II)Lkb;")
    public class264 method4055(class264 arg0, int arg1, class227 arg2, int arg3) {
        int var5 = this.field2424[arg1];
        class258 var6 = method4154(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method4012(arg0, arg3);
        }
        int var8 = arg2.field2424[arg3];
        class258 var9 = method4154(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class264 var11 = arg0.method4842(!var6.method4745(var7));
            var11.method4810(var6, var7);
            return var11;
        } else {
            class264 var12 = arg0.method4842(!var6.method4745(var7) & !var9.method4745(var10));
            var12.method4815(var6, var7, var9, var10, this.field2433);
            return var12;
        }
    }

    @ObfuscatedName("ic.ao(Lkb;II)Lkb;")
    public class264 method4017(class264 arg0, int arg1) {
        if (this.method4051()) {
            return this.method4012(arg0, arg1);
        }
        int var3 = this.field2424[arg1];
        class258 var4 = method4154(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method4842(true);
        }
        class258 var6 = null;
        int var7 = 0;
        if (this.field2408 != null && arg1 < this.field2408.length) {
            int var8 = this.field2408[arg1];
            var6 = method4154(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class264 var10 = arg0.method4842(!var4.method4745(var5));
            var10.method4810(var4, var5);
            return var10;
        } else {
            class264 var9 = arg0.method4842(!var4.method4745(var5) & !var6.method4745(var7));
            var9.method4810(var4, var5);
            var9.method4810(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("ic.ah(B)Z")
    public boolean method4051() {
        return this.field2415 >= 0;
    }

    @ObfuscatedName("ic.av(B)I")
    public int method4018() {
        return this.field2418 - this.field2420;
    }

    @ObfuscatedName("jx.aq(II)Ljl;")
    public static class258 method4154(int arg0) {
        class258 var1 = (class258) field2430.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class387 var2 = Statics.field2405;
        class387 var3 = Statics.field2413;
        boolean var4 = true;
        int[] var5 = var2.method6581(arg0);
        for (int var6 = 0; var6 < var5.length; var6++) {
            byte[] var7 = var2.method6579(arg0, var5[var6]);
            if (var7 == null) {
                var4 = false;
            } else {
                int var8 = (var7[0] & 0xFF) << 8 | var7[1] & 0xFF;
                byte[] var9 = var3.method6579(var8, 0);
                if (var9 == null) {
                    var4 = false;
                }
            }
        }
        class258 var10;
        if (var4) {
            try {
                var10 = new class258(var2, var3, arg0, false);
            } catch (Exception var13) {
                var10 = null;
            }
        } else {
            var10 = null;
        }
        if (var10 != null) {
            field2430.method5564(var10, (long) arg0);
        }
        return var10;
    }

    @ObfuscatedName("ic.ap(B)Lfo;")
    public class142 method4020() {
        return this.method4051() ? method2871(this.field2415) : null;
    }

    @ObfuscatedName("eg.ae(II)Lfo;")
    public static class142 method2871(int arg0) {
        class142 var1 = method2533(arg0);
        int var2;
        if (var1 == null) {
            var2 = 2;
        } else {
            var2 = var1.method3002() ? 0 : 1;
        }
        return var2 == 0 ? method2533(arg0) : null;
    }

    @ObfuscatedName("dp.ax(II)Lfo;")
    public static class142 method2533(int arg0) {
        class142 var1 = (class142) field2414.method5570((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class142 var2 = class142.method5826(Statics.field2405, Statics.field2413, arg0, false);
        if (var2 != null) {
            field2414.method5564(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("cl.ay(Lua;B)Lik;")
    public static class223 method1795(class546 arg0) {
        if (arg0 != null) {
            boolean var1 = false;
            boolean var2 = false;
            boolean var3 = false;
            boolean var4 = false;
            int var5 = arg0.method8798();
            int var6 = arg0.method8796();
            int var7 = arg0.method8796();
            int var8 = arg0.method8796();
            if (var5 >= 1 && var6 >= 1 && var7 >= 0 && var8 >= 0) {
                return new class223(var5, var6, var7, var8);
            }
        }
        return null;
    }

    @ObfuscatedName("jx.au(I)V")
    public static void method4155() {
        field2411.method5572();
        field2430.method5572();
        field2414.method5572();
    }
}
