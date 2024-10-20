package deob;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@ObfuscatedName("hl")
public class class205 extends class485 {

    @ObfuscatedName("hl.am")
    public static boolean field2232 = false;

    @ObfuscatedName("hl.ao")
    public static class302 field2225 = new class302(64);

    @ObfuscatedName("hl.ae")
    public static class302 field2226 = new class302(100);

    @ObfuscatedName("hl.aa")
    public static class302 field2235 = new class302(100);

    @ObfuscatedName("hl.au")
    public int field2228 = -1;

    @ObfuscatedName("hl.an")
    public Map field2229;

    @ObfuscatedName("hl.ad")
    public int field2230 = 0;

    @ObfuscatedName("hl.ax")
    public int field2242 = 0;

    @ObfuscatedName("hl.aw")
    public int[] field2222;

    @ObfuscatedName("hl.az")
    public int[] field2246;

    @ObfuscatedName("hl.av")
    public int[] field2234;

    @ObfuscatedName("hl.ak")
    public int[] field2240;

    @ObfuscatedName("hl.ay")
    public int field2238 = -1;

    @ObfuscatedName("hl.as")
    public int[] field2237;

    @ObfuscatedName("hl.ab")
    public boolean[] field2224;

    @ObfuscatedName("hl.ah")
    public boolean field2239 = false;

    @ObfuscatedName("hl.ai")
    public int field2221 = 5;

    @ObfuscatedName("hl.ac")
    public int field2241 = -1;

    @ObfuscatedName("hl.al")
    public int field2219 = -1;

    @ObfuscatedName("hl.at")
    public int field2243 = 99;

    @ObfuscatedName("hl.bj")
    public boolean field2236 = false;

    @ObfuscatedName("hl.bd")
    public int field2245 = -1;

    @ObfuscatedName("hl.bg")
    public int field2227 = -1;

    @ObfuscatedName("hl.bt")
    public int field2247 = 2;

    @ObfuscatedName("hb.am(Low;Low;Low;I)V")
    public static void method3396(class375 arg0, class375 arg1, class375 arg2) {
        Statics.field2223 = arg0;
        Statics.field2233 = arg1;
        Statics.field3589 = arg2;
    }

    @ObfuscatedName("aa.ap(IB)Lhl;")
    public static class205 method73(int arg0) {
        class205 var1 = (class205) field2225.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field2223.method6396(12, arg0);
        class205 var3 = new class205();
        if (var2 != null) {
            var3.method3753(new class531(var2));
        }
        var3.method3749();
        field2225.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hl.af(Luk;I)V")
    public void method3753(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3748(arg0, var2);
        }
    }

    @ObfuscatedName("hl.aj(Luk;II)V")
    public void method3748(class531 arg0, int arg1) {
        if (arg1 == 1) {
            int var3 = arg0.method8775();
            this.field2234 = new int[var3];
            for (int var4 = 0; var4 < var3; var4++) {
                this.field2234[var4] = arg0.method8775();
            }
            this.field2222 = new int[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                this.field2222[var5] = arg0.method8775();
            }
            for (int var6 = 0; var6 < var3; var6++) {
                this.field2222[var6] += arg0.method8775() << 16;
            }
        } else if (arg1 == 2) {
            this.field2238 = arg0.method8775();
        } else if (arg1 == 3) {
            int var7 = arg0.method8561();
            this.field2237 = new int[var7 + 1];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field2237[var8] = arg0.method8561();
            }
            this.field2237[var7] = 9999999;
        } else if (arg1 == 4) {
            this.field2239 = true;
        } else if (arg1 == 5) {
            this.field2221 = arg0.method8561();
        } else if (arg1 == 6) {
            this.field2241 = arg0.method8775();
        } else if (arg1 == 7) {
            this.field2219 = arg0.method8775();
        } else if (arg1 == 8) {
            this.field2243 = arg0.method8561();
            this.field2236 = true;
        } else if (arg1 == 9) {
            this.field2245 = arg0.method8561();
        } else if (arg1 == 10) {
            this.field2227 = arg0.method8561();
        } else if (arg1 == 11) {
            this.field2247 = arg0.method8561();
        } else if (arg1 == 12) {
            int var9 = arg0.method8561();
            this.field2246 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field2246[var10] = arg0.method8775();
            }
            for (int var11 = 0; var11 < var9; var11++) {
                this.field2246[var11] += arg0.method8775() << 16;
            }
        } else if (arg1 == 13) {
            int var12 = arg0.method8561();
            this.field2240 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field2240[var13] = arg0.method8688();
            }
        } else if (arg1 == 14) {
            this.field2228 = arg0.method8566();
        } else if (arg1 == 15) {
            int var14 = arg0.method8775();
            this.field2229 = new HashMap();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = arg0.method8775();
                int var17 = arg0.method8688();
                this.field2229.put(var16, var17);
            }
        } else if (arg1 == 16) {
            this.field2230 = arg0.method8775();
            this.field2242 = arg0.method8775();
        } else if (arg1 == 17) {
            this.field2224 = new boolean[256];
            for (int var18 = 0; var18 < this.field2224.length; var18++) {
                this.field2224[var18] = false;
            }
            int var19 = arg0.method8561();
            for (int var20 = 0; var20 < var19; var20++) {
                this.field2224[arg0.method8561()] = true;
            }
        }
    }

    @ObfuscatedName("hl.aq(I)V")
    public void method3749() {
        if (this.field2245 == -1) {
            if (this.field2237 == null && this.field2224 == null) {
                this.field2245 = 0;
            } else {
                this.field2245 = 2;
            }
        }
        if (this.field2227 != -1) {
            return;
        }
        if (this.field2237 == null && this.field2224 == null) {
            this.field2227 = 0;
        } else {
            this.field2227 = 2;
        }
    }

    @ObfuscatedName("hl.ar(Lko;II)Lko;")
    public class283 method3789(class283 arg0, int arg1) {
        if (this.method3760()) {
            int var7 = this.field2228;
            class139 var8;
            if (method4124(var7) == 0) {
                var8 = method7367(var7);
            } else {
                var8 = null;
            }
            if (var8 == null) {
                return arg0.method5132(true);
            } else {
                class283 var10 = arg0.method5132(!var8.method3028());
                var10.method5240(var8, arg1);
                return var10;
            }
        } else {
            int var3 = this.field2222[arg1];
            class278 var4 = method3215(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method5132(true);
            } else {
                class283 var6 = arg0.method5132(!var4.method5077(var5));
                var6.method5140(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hl.ag(Lko;III)Lko;")
    public class283 method3746(class283 arg0, int arg1, int arg2) {
        if (!this.method3760()) {
            int var4 = this.field2222[arg1];
            class278 var5 = method3215(var4 >> 16);
            int var6 = var4 & 0xFFFF;
            if (var5 == null) {
                return arg0.method5132(true);
            }
            class283 var7 = arg0.method5132(!var5.method5077(var6));
            int var8 = arg2 & 0x3;
            if (var8 == 1) {
                var7.method5181();
            } else if (var8 == 2) {
                var7.method5163();
            } else if (var8 == 3) {
                var7.method5148();
            }
            var7.method5140(var5, var6);
            if (var8 == 1) {
                var7.method5148();
            } else if (var8 == 2) {
                var7.method5163();
            } else if (var8 == 3) {
                var7.method5181();
            }
            return var7;
        }
        int var9 = this.field2228;
        class139 var10;
        if (method4124(var9) == 0) {
            var10 = method7367(var9);
        } else {
            var10 = null;
        }
        if (var10 == null) {
            return arg0.method5132(true);
        }
        class283 var12 = arg0.method5132(!var10.method3028());
        int var13 = arg2 & 0x3;
        if (var13 == 1) {
            var12.method5181();
        } else if (var13 == 2) {
            var12.method5163();
        } else if (var13 == 3) {
            var12.method5148();
        }
        var12.method5240(var10, arg1);
        if (var13 == 1) {
            var12.method5148();
        } else if (var13 == 2) {
            var12.method5163();
        } else if (var13 == 3) {
            var12.method5181();
        }
        return var12;
    }

    @ObfuscatedName("hl.ao(Lko;II)Lko;")
    public class283 method3770(class283 arg0, int arg1) {
        if (this.method3760()) {
            int var7 = this.field2228;
            class139 var8;
            if (method4124(var7) == 0) {
                var8 = method7367(var7);
            } else {
                var8 = null;
            }
            if (var8 == null) {
                return arg0.method5133(true);
            } else {
                class283 var10 = arg0.method5133(!var8.method3028());
                var10.method5240(var8, arg1);
                return var10;
            }
        } else {
            int var3 = this.field2222[arg1];
            class278 var4 = method3215(var3 >> 16);
            int var5 = var3 & 0xFFFF;
            if (var4 == null) {
                return arg0.method5133(true);
            } else {
                class283 var6 = arg0.method5133(!var4.method5077(var5));
                var6.method5140(var4, var5);
                return var6;
            }
        }
    }

    @ObfuscatedName("hl.ae(Lko;ILhl;II)Lko;")
    public class283 method3776(class283 arg0, int arg1, class205 arg2, int arg3) {
        if (field2232 && !this.method3760() && !arg2.method3760()) {
            return this.method3754(arg0, arg1, arg2, arg3);
        }
        class283 var5 = arg0.method5132(false);
        boolean var6 = false;
        class278 var7 = null;
        class273 var8 = null;
        if (this.method3760()) {
            class139 var9 = this.method3796();
            if (var9 == null) {
                return var5;
            }
            if (arg2.method3760() && this.field2224 == null) {
                var5.method5240(var9, arg1);
                return var5;
            }
            var8 = var9.field1602;
            var5.method5144(var8, var9, arg1, this.field2224, false, !arg2.method3760());
        } else {
            int var10 = this.field2222[arg1];
            var7 = method3215(var10 >> 16);
            arg1 = var10 & 0xFFFF;
            if (var7 == null) {
                return arg2.method3789(arg0, arg3);
            }
            if (!arg2.method3760() && (this.field2237 == null || arg3 == -1)) {
                var5.method5140(var7, arg1);
                return var5;
            }
            if (this.field2237 == null || arg3 == -1) {
                var5.method5140(var7, arg1);
                return var5;
            }
            var6 = arg2.method3760();
            if (!var6) {
                var5.method5146(var7, arg1, this.field2237, false);
            }
        }
        if (arg2.method3760()) {
            class139 var11 = arg2.method3796();
            if (var11 == null) {
                return var5;
            }
            if (var8 == null) {
                var8 = var11.field1602;
            }
            var5.method5144(var8, var11, arg3, this.field2224, true, true);
        } else {
            int var12 = arg2.field2222[arg3];
            class278 var13 = method3215(var12 >> 16);
            int var14 = var12 & 0xFFFF;
            if (var13 == null) {
                return this.method3789(arg0, arg1);
            }
            var5.method5146(var13, var14, this.field2237, true);
        }
        if (var6 && var7 != null) {
            var5.method5146(var7, arg1, this.field2237, false);
        }
        var5.method5196();
        return var5;
    }

    @ObfuscatedName("hl.aa(Lko;ILhl;II)Lko;")
    public class283 method3754(class283 arg0, int arg1, class205 arg2, int arg3) {
        int var5 = this.field2222[arg1];
        class278 var6 = method3215(var5 >> 16);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method3789(arg0, arg3);
        }
        int var8 = arg2.field2222[arg3];
        class278 var9 = method3215(var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            class283 var11 = arg0.method5132(!var6.method5077(var7));
            var11.method5140(var6, var7);
            return var11;
        } else {
            class283 var12 = arg0.method5132(!var6.method5077(var7) & !var9.method5077(var10));
            var12.method5231(var6, var7, var9, var10, this.field2237);
            return var12;
        }
    }

    @ObfuscatedName("hl.au(Lko;II)Lko;")
    public class283 method3795(class283 arg0, int arg1) {
        if (this.method3760()) {
            return this.method3789(arg0, arg1);
        }
        int var3 = this.field2222[arg1];
        class278 var4 = method3215(var3 >> 16);
        int var5 = var3 & 0xFFFF;
        if (var4 == null) {
            return arg0.method5132(true);
        }
        class278 var6 = null;
        int var7 = 0;
        if (this.field2246 != null && arg1 < this.field2246.length) {
            int var8 = this.field2246[arg1];
            var6 = method3215(var8 >> 16);
            var7 = var8 & 0xFFFF;
        }
        if (var6 == null || var7 == 65535) {
            class283 var10 = arg0.method5132(!var4.method5077(var5));
            var10.method5140(var4, var5);
            return var10;
        } else {
            class283 var9 = arg0.method5132(!var4.method5077(var5) & !var6.method5077(var7));
            var9.method5140(var4, var5);
            var9.method5140(var6, var7);
            return var9;
        }
    }

    @ObfuscatedName("hl.an(B)Z")
    public boolean method3760() {
        return this.field2228 >= 0;
    }

    @ObfuscatedName("hl.ad(I)I")
    public int method3784() {
        return this.field2242 - this.field2230;
    }

    @ObfuscatedName("gv.ax(II)Lky;")
    public static class278 method3215(int arg0) {
        class278 var1 = (class278) field2226.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class278 var2 = class278.method4081(Statics.field2233, Statics.field3589, arg0, false);
        if (var2 != null) {
            field2226.method5402(var2, (long) arg0);
        }
        return var2;
    }

    @ObfuscatedName("ig.aw(II)I")
    public static int method4124(int arg0) {
        class139 var1 = method7367(arg0);
        if (var1 == null) {
            return 2;
        } else if (var1.method3026()) {
            return 0;
        } else {
            return 1;
        }
    }

    @ObfuscatedName("hl.az(I)Lfu;")
    public class139 method3796() {
        if (!this.method3760()) {
            return null;
        }
        int var1 = this.field2228;
        class139 var2;
        if (method4124(var1) == 0) {
            var2 = method7367(var1);
        } else {
            var2 = null;
        }
        return var2;
    }

    @ObfuscatedName("qc.av(IB)Lfu;")
    public static class139 method7367(int arg0) {
        class139 var1 = (class139) field2235.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        class375 var2 = Statics.field2233;
        class375 var3 = Statics.field3589;
        boolean var4 = true;
        byte[] var5 = var2.method6423(arg0 >> 16 & 0xFFFF, arg0 & 0xFFFF);
        class139 var7;
        if (var5 == null) {
            boolean var6 = false;
            var7 = null;
        } else {
            int var8 = (var5[1] & 0xFF) << 8 | var5[2] & 0xFF;
            byte[] var9 = var3.method6423(var8, 0);
            if (var9 == null) {
                var4 = false;
            }
            if (var4) {
                if (Statics.field86 == null) {
                    Statics.field898 = Runtime.getRuntime().availableProcessors();
                    Statics.field86 = new ThreadPoolExecutor(0, Statics.field898, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(Statics.field898 * 100 + 100), new class170());
                }
                try {
                    var7 = new class139(var2, var3, arg0, false);
                } catch (Exception var12) {
                    var7 = null;
                }
            } else {
                var7 = null;
            }
        }
        if (var7 != null) {
            field2235.method5402(var7, (long) arg0);
        }
        return var7;
    }

    @ObfuscatedName("nz.ak(I)V")
    public static void method5808() {
        field2225.method5403();
        field2226.method5403();
        field2235.method5403();
    }
}
