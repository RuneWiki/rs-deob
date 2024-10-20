package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("uc")
public class class525 {

    @ObfuscatedName("uc.as")
    public class392 field5248;

    @ObfuscatedName("uc.ae")
    public class392 field5273;

    @ObfuscatedName("uc.am")
    public class392 field5250;

    @ObfuscatedName("uc.at")
    public static final class527 field5251 = class527.field5310;

    @ObfuscatedName("uc.au")
    public static final class527 field5244 = class527.field5311;

    @ObfuscatedName("uc.an")
    public static final class527 field5253 = class527.field5312;

    @ObfuscatedName("uc.ao")
    public class436 field5254;

    @ObfuscatedName("uc.af")
    public HashMap field5262;

    @ObfuscatedName("uc.ar")
    public class571[] field5272;

    @ObfuscatedName("uc.ab")
    public HashMap field5257;

    @ObfuscatedName("uc.az")
    public class285 field5258;

    @ObfuscatedName("uc.ag")
    public class285 field5259;

    @ObfuscatedName("uc.ad")
    public class285 field5260;

    @ObfuscatedName("uc.ac")
    public class287 field5247;

    @ObfuscatedName("uc.av")
    public class524 field5298;

    @ObfuscatedName("uc.ax")
    public int field5296;

    @ObfuscatedName("uc.aq")
    public int field5264;

    @ObfuscatedName("uc.al")
    public int field5265 = -1;

    @ObfuscatedName("uc.aa")
    public int field5270 = -1;

    @ObfuscatedName("uc.ah")
    public float field5267;

    @ObfuscatedName("uc.bh")
    public float field5268;

    @ObfuscatedName("uc.bj")
    public int field5269 = -1;

    @ObfuscatedName("uc.bv")
    public int field5284 = -1;

    @ObfuscatedName("uc.bx")
    public int field5271 = -1;

    @ObfuscatedName("uc.bk")
    public int field5281 = -1;

    @ObfuscatedName("uc.bb")
    public int field5263 = 3;

    @ObfuscatedName("uc.bq")
    public int field5274 = 50;

    @ObfuscatedName("uc.bp")
    public boolean field5275 = false;

    @ObfuscatedName("uc.bz")
    public HashSet field5285 = null;

    @ObfuscatedName("uc.bc")
    public int field5252 = -1;

    @ObfuscatedName("uc.by")
    public int field5277 = -1;

    @ObfuscatedName("uc.br")
    public int field5279 = -1;

    @ObfuscatedName("uc.bn")
    public int field5280 = -1;

    @ObfuscatedName("uc.bu")
    public int field5249 = -1;

    @ObfuscatedName("uc.bt")
    public int field5282 = -1;

    @ObfuscatedName("uc.bs")
    public long field5283;

    @ObfuscatedName("uc.bm")
    public int field5276;

    @ObfuscatedName("uc.bo")
    public int field5287;

    @ObfuscatedName("uc.bd")
    public boolean field5266 = true;

    @ObfuscatedName("uc.bi")
    public HashSet field5278 = new HashSet();

    @ObfuscatedName("uc.bf")
    public HashSet field5288 = new HashSet();

    @ObfuscatedName("uc.bg")
    public HashSet field5289 = new HashSet();

    @ObfuscatedName("uc.bl")
    public HashSet field5290 = new HashSet();

    @ObfuscatedName("uc.be")
    public boolean field5245 = false;

    @ObfuscatedName("uc.cq")
    public int field5292 = 0;

    @ObfuscatedName("uc.cd")
    public final int[] field5293 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("uc.ci")
    public List field5294;

    @ObfuscatedName("uc.cn")
    public Iterator field5295;

    @ObfuscatedName("uc.co")
    public HashSet field5256 = new HashSet();

    @ObfuscatedName("uc.cf")
    public class351 field5297 = null;

    @ObfuscatedName("uc.cl")
    public boolean field5255 = false;

    @ObfuscatedName("uc.cp")
    public class572 field5299;

    @ObfuscatedName("uc.cv")
    public int field5300;

    @ObfuscatedName("uc.cy")
    public int field5261 = -1;

    @ObfuscatedName("uc.cu")
    public int field5302 = -1;

    @ObfuscatedName("uc.ce")
    public int field5303 = -1;

    @ObfuscatedName("uc.ap(Lpe;Lpe;Lpe;Lqi;Ljava/util/HashMap;[Lvc;I)V")
    public void method8731(class392 arg0, class392 arg1, class392 arg2, class436 arg3, HashMap arg4, class571[] arg5) {
        this.field5272 = arg5;
        this.field5248 = arg0;
        this.field5273 = arg1;
        this.field5250 = arg2;
        this.field5254 = arg3;
        this.field5262 = new HashMap();
        this.field5262.put(class282.field3087, arg4.get(field5251));
        this.field5262.put(class282.field3086, arg4.get(field5244));
        this.field5262.put(class282.field3082, arg4.get(field5253));
        this.field5298 = new class524(arg0);
        int var7 = this.field5248.method7010(class304.field3264.field3270);
        int[] var8 = this.field5248.method7003(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field5257 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class558 var11 = new class558(this.field5248.method7009(var7, var8[var10]));
            class285 var12 = new class285();
            var12.method5502(var11, var8[var10]);
            this.field5257.put(var12.method5538(), var12);
            if (var12.method5510()) {
                this.field5258 = var12;
            }
        }
        this.method8836(this.field5258);
        this.field5260 = null;
    }

    @ObfuscatedName("uc.aw(I)V")
    public void method8732() {
        class286.method3154();
    }

    @ObfuscatedName("uc.ak(IIZIIIII)V")
    public void method8733(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field5298.method8716()) {
            return;
        }
        this.method8766();
        this.method8745();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field5267));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field5267));
        List var10 = this.field5247.method5694(this.field5296 - var8 / 2 - 1, this.field5264 - var9 / 2 - 1, var8 / 2 + this.field5296 + 1, var9 / 2 + this.field5264 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class303 var13 = (class303) var12.next();
            var11.add(var13);
            class91 var14 = new class91();
            class308 var15 = new class308(var13.method5469(), var13.field3259, var13.field3260);
            var14.method2476(new Object[] { var15, arg0, arg1 });
            if (this.field5256.contains(var13)) {
                var14.method2477(17);
            } else {
                var14.method2477(15);
            }
            class73.method8429(var14);
        }
        Iterator var16 = this.field5256.iterator();
        while (var16.hasNext()) {
            class303 var17 = (class303) var16.next();
            if (!var11.contains(var17)) {
                class91 var18 = new class91();
                class308 var19 = new class308(var17.method5469(), var17.field3259, var17.field3260);
                var18.method2476(new Object[] { var19, arg0, arg1 });
                var18.method2477(16);
                class73.method8429(var18);
            }
        }
        this.field5256 = var11;
    }

    @ObfuscatedName("uc.aj(IIZZI)V")
    public void method8734(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class330.method2257();
            this.method8735(arg0, arg1, arg3, var5);
            if (!this.method8740() && (arg3 || arg2)) {
                boolean var7 = client.field678 != null;
                if (!var7) {
                    if (arg3) {
                        this.field5249 = arg0;
                        this.field5282 = arg1;
                        this.field5279 = this.field5296;
                        this.field5280 = this.field5264;
                    }
                    if (this.field5279 != -1) {
                        int var8 = arg0 - this.field5249;
                        int var9 = arg1 - this.field5282;
                        this.method8738(this.field5279 - (int) ((float) var8 / this.field5268), this.field5280 + (int) ((float) var9 / this.field5268), false);
                    }
                    break label33;
                }
            }
            this.method8739();
        }
        if (arg3) {
            this.field5283 = var5;
            this.field5276 = arg0;
            this.field5287 = arg1;
        }
    }

    @ObfuscatedName("uc.ai(IIZJ)V")
    public void method8735(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field5259 == null) {
            this.field5297 = null;
            return;
        }
        int var6 = (int) ((float) this.field5296 + ((float) (arg0 - this.field5271) - (float) this.method8769() * this.field5267 / 2.0F) / this.field5267);
        int var7 = (int) ((float) this.field5264 - ((float) (arg1 - this.field5281) - (float) this.method8924() * this.field5267 / 2.0F) / this.field5267);
        this.field5297 = this.field5259.method5561(var6 + this.field5259.method5516() * 64, var7 + this.field5259.method5512() * 64);
        if (this.field5297 == null || !arg2) {
            return;
        }
        class270 var8 = client.field734;
        if (client.method3291() && var8.method5249(82) && var8.method5249(81)) {
            int var10 = this.field5297.field3777;
            int var11 = this.field5297.field3778;
            int var12 = this.field5297.field3779;
            class325 var13 = class325.method2983(class323.field3403, client.field784.field1485);
            var13.field3433.method9253(var12);
            var13.field3433.method9313(0);
            var13.field3433.method9297(var11);
            var13.field3433.method9297(var10);
            client.field784.method3070(var13);
            return;
        }
        boolean var14 = true;
        if (this.field5266) {
            int var15 = arg0 - this.field5276;
            int var16 = arg1 - this.field5287;
            if (arg3 - this.field5283 > 500L || var15 < -25 || var15 > 25 || var16 < -25 || var16 > 25) {
                var14 = false;
            }
        }
        if (var14) {
            class325 var17 = class325.method2983(class323.field3360, client.field784.field1485);
            var17.field3433.method9314(this.field5297.method6250());
            client.field784.method3070(var17);
            this.field5283 = 0L;
        }
    }

    @ObfuscatedName("uc.ay(I)V")
    public void method8766() {
        if (Statics.field923 != null) {
            this.field5267 = this.field5268;
            return;
        }
        if (this.field5267 < this.field5268) {
            this.field5267 = Math.min(this.field5268, this.field5267 / 30.0F + this.field5267);
        }
        if (this.field5267 > this.field5268) {
            this.field5267 = Math.max(this.field5268, this.field5267 - this.field5267 / 30.0F);
        }
    }

    @ObfuscatedName("uc.as(B)V")
    public void method8745() {
        if (!this.method8740()) {
            return;
        }
        int var1 = this.field5265 - this.field5296;
        int var2 = this.field5270 - this.field5264;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method8738(this.field5296 + var1, this.field5264 + var2, true);
        if (this.field5296 == this.field5265 && this.field5270 == this.field5264) {
            this.field5265 = -1;
            this.field5270 = -1;
        }
    }

    @ObfuscatedName("uc.ae(IIZI)V")
    public final void method8738(int arg0, int arg1, boolean arg2) {
        this.field5296 = arg0;
        this.field5264 = arg1;
        class330.method2257();
        if (arg2) {
            this.method8739();
        }
    }

    @ObfuscatedName("uc.am(I)V")
    public final void method8739() {
        this.field5282 = -1;
        this.field5249 = -1;
        this.field5280 = -1;
        this.field5279 = -1;
    }

    @ObfuscatedName("uc.at(I)Z")
    public boolean method8740() {
        return this.field5265 != -1 && this.field5270 != -1;
    }

    @ObfuscatedName("uc.au(IIIB)Lkp;")
    public class285 method8741(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field5257.values().iterator();
        class285 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class285) var4.next();
        } while (!var5.method5504(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("uc.an(IIIZI)V")
    public void method8925(int arg0, int arg1, int arg2, boolean arg3) {
        class285 var5 = this.method8741(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field5258;
        }
        boolean var6 = false;
        if (this.field5260 != var5 || arg3) {
            this.field5260 = var5;
            this.method8836(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method8829(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("uc.ao(II)V")
    public void method8744(int arg0) {
        class285 var2 = this.method8761(arg0);
        if (var2 != null) {
            this.method8836(var2);
        }
    }

    @ObfuscatedName("uc.af(I)I")
    public int method8793() {
        return this.field5259 == null ? -1 : this.field5259.method5509();
    }

    @ObfuscatedName("uc.ar(I)Lkp;")
    public class285 method8879() {
        return this.field5259;
    }

    @ObfuscatedName("uc.ab(Lkp;B)V")
    public void method8836(class285 arg0) {
        if (this.field5259 == null || this.field5259 != arg0) {
            this.method8747(arg0);
            this.method8829(-1, -1, -1);
        }
    }

    @ObfuscatedName("uc.az(Lkp;B)V")
    public void method8747(class285 arg0) {
        this.field5259 = arg0;
        this.field5247 = new class287(this.field5272, this.field5262, this.field5273, this.field5250);
        this.field5298.method8714(this.field5259 == null ? null : this.field5259.method5538());
    }

    @ObfuscatedName("uc.ag(Lkp;Lnn;Lnn;ZB)V")
    public void method8748(class285 arg0, class351 arg1, class351 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field5259 == null || this.field5259 != arg0) {
            this.method8747(arg0);
        }
        if (!arg3 && this.field5259.method5504(arg1.field3779, arg1.field3777, arg1.field3778)) {
            this.method8829(arg1.field3779, arg1.field3777, arg1.field3778);
        } else {
            this.method8829(arg2.field3779, arg2.field3777, arg2.field3778);
        }
    }

    @ObfuscatedName("uc.ad(IIII)V")
    public void method8829(int arg0, int arg1, int arg2) {
        if (this.field5259 == null) {
            return;
        }
        int[] var4 = this.field5259.method5506(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field5259.method5506(this.field5259.method5521(), this.field5259.method5564(), this.field5259.method5522());
        }
        this.method8738(var4[0] - this.field5259.method5516() * 64, var4[1] - this.field5259.method5512() * 64, true);
        this.field5265 = -1;
        this.field5270 = -1;
        this.field5267 = this.method8757(this.field5259.method5515());
        this.field5268 = this.field5267;
        this.field5294 = null;
        this.field5295 = null;
        this.field5247.method5691();
    }

    @ObfuscatedName("uc.ac(IIIIID)V")
    public void method8750(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5) {
        int[] var8 = new int[4];
        class568.method9665(var8);
        class568.method9608(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var9 = this.field5298.method8717();
        if (var9 < 100) {
            this.method8756(arg0, arg1, arg2, arg3, var9);
            return;
        }
        if (!this.field5247.method5696()) {
            this.field5247.method5689(this.field5248, this.field5259.method5538(), client.field794);
            if (!this.field5247.method5696()) {
                return;
            }
        }
        int var10 = class356.method3722(this.field5247.method5697(), arg5);
        class568.method9616(arg0, arg1, arg2, arg3, var10);
        if (this.field5285 != null) {
            this.field5277++;
            if (this.field5277 % this.field5274 == 0) {
                this.field5277 = 0;
                this.field5252++;
            }
            if (this.field5252 >= this.field5263 && !this.field5275) {
                this.field5285 = null;
            }
        }
        int var11 = (int) Math.ceil((double) ((float) arg2 / this.field5267));
        int var12 = (int) Math.ceil((double) ((float) arg3 / this.field5267));
        double var13 = class240.method4497();
        this.field5247.method5706(this.field5296 - var11 / 2, this.field5264 - var12 / 2, var11 / 2 + this.field5296, var12 / 2 + this.field5264, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field5245) {
            boolean var15 = false;
            if (arg4 - this.field5292 > 100) {
                this.field5292 = arg4;
                var15 = true;
            }
            this.field5247.method5719(this.field5296 - var11 / 2, this.field5264 - var12 / 2, var11 / 2 + this.field5296, var12 / 2 + this.field5264, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field5290, this.field5285, this.field5277, this.field5274, var15);
        }
        this.method8753(arg0, arg1, arg2, arg3, var11, var12);
        if (client.method3291() && this.field5255 && this.field5297 != null) {
            this.field5254.method7932("Coord: " + this.field5297, class568.field5538 + 10, class568.field5536 + 20, 16776960, -1);
        }
        this.field5269 = var11;
        this.field5284 = var12;
        this.field5271 = arg0;
        this.field5281 = arg1;
        class568.method9611(var8);
        if (var13 != class240.method4497()) {
            class240.method4494(var13);
        }
    }

    @ObfuscatedName("uc.av(B)V")
    public void method8915() {
        class286.field3125.method5907();
    }

    @ObfuscatedName("uc.ax(IIIIIIB)Z")
    public boolean method8752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field5299 == null) {
            return true;
        } else if (this.field5299.field5558 != arg0 || this.field5299.field5559 != arg1) {
            return true;
        } else if (this.field5247.field3151 != this.field5300) {
            return true;
        } else if (client.field801 != this.field5303) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("uc.aq(IIIIIII)V")
    public void method8753(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field923 == null) {
            return;
        }
        int var7 = 512 / (this.field5247.field3151 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method8900() - arg4 / 2 - var7;
        int var14 = this.method8767() - arg5 / 2 - var7;
        int var15 = arg0 - this.field5247.field3151 * (var7 + var13 - this.field5261);
        int var16 = arg1 - this.field5247.field3151 * (var7 - (var14 - this.field5302));
        if (this.method8752(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field5299 != null && this.field5299.field5558 == var11 && this.field5299.field5559 == var12) {
                Arrays.fill(this.field5299.field5567, 0);
            } else {
                this.field5299 = new class572(var11, var12);
            }
            this.field5261 = this.method8900() - arg4 / 2 - var7;
            this.field5302 = this.method8767() - arg5 / 2 - var7;
            this.field5300 = this.field5247.field3151;
            Statics.field923.method7191(this.field5261, this.field5302, this.field5299, (float) this.field5300 / var10);
            this.field5303 = client.field801;
            var15 = arg0 - this.field5247.field3151 * (var7 + var13 - this.field5261);
            var16 = arg1 - this.field5247.field3151 * (var7 - (var14 - this.field5302));
        }
        class568.method9615(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field5299.method9752(var15, var16, 192);
        } else {
            this.field5299.method9755(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("uc.al(IIIII)V")
    public void method8754(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field5298.method8716()) {
            return;
        }
        if (!this.field5247.method5696()) {
            this.field5247.method5689(this.field5248, this.field5259.method5538(), client.field794);
            if (!this.field5247.method5696()) {
                return;
            }
        }
        this.field5247.method5715(arg0, arg1, arg2, arg3, this.field5285, this.field5277, this.field5274);
    }

    @ObfuscatedName("uc.aa(IB)V")
    public void method8755(int arg0) {
        this.field5268 = this.method8757(arg0);
    }

    @ObfuscatedName("uc.ah(IIIIIB)V")
    public void method8756(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class568.method9616(arg0, arg1, arg2, arg3, -16777216);
        class568.method9620(var7 - 152, var8, 304, 34, -65536);
        class568.method9616(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field5254.method7935(class383.field4178, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("uc.bh(II)F")
    public float method8757(int arg0) {
        if (arg0 == 25) {
            return 1.0F;
        } else if (arg0 == 37) {
            return 1.5F;
        } else if (arg0 == 50) {
            return 2.0F;
        } else if (arg0 == 75) {
            return 3.0F;
        } else if (arg0 == 100) {
            return 4.0F;
        } else {
            return 8.0F;
        }
    }

    @ObfuscatedName("uc.bj(S)I")
    public int method8758() {
        if ((double) this.field5268 == 1.0D) {
            return 25;
        } else if ((double) this.field5268 == 1.5D) {
            return 37;
        } else if ((double) this.field5268 == 2.0D) {
            return 50;
        } else if ((double) this.field5268 == 3.0D) {
            return 75;
        } else if ((double) this.field5268 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("uc.bv(I)V")
    public void method8759() {
        this.field5298.method8715();
    }

    @ObfuscatedName("uc.bx(I)Z")
    public boolean method8760() {
        return this.field5298.method8716();
    }

    @ObfuscatedName("uc.bk(II)Lkp;")
    public class285 method8761(int arg0) {
        Iterator var2 = this.field5257.values().iterator();
        class285 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class285) var2.next();
        } while (var3.method5509() != arg0);
        return var3;
    }

    @ObfuscatedName("uc.bb(III)V")
    public void method8762(int arg0, int arg1) {
        if (this.field5259 != null && this.field5259.method5553(arg0, arg1)) {
            this.field5265 = arg0 - this.field5259.method5516() * 64;
            this.field5270 = arg1 - this.field5259.method5512() * 64;
        }
    }

    @ObfuscatedName("uc.bq(IIB)V")
    public void method8763(int arg0, int arg1) {
        if (this.field5259 != null) {
            this.method8738(arg0 - this.field5259.method5516() * 64, arg1 - this.field5259.method5512() * 64, true);
            this.field5265 = -1;
            this.field5270 = -1;
        }
    }

    @ObfuscatedName("uc.bp(IIIB)V")
    public void method8856(int arg0, int arg1, int arg2) {
        if (this.field5259 != null) {
            int[] var4 = this.field5259.method5506(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8762(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("uc.bz(IIII)V")
    public void method8765(int arg0, int arg1, int arg2) {
        if (this.field5259 != null) {
            int[] var4 = this.field5259.method5506(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8763(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("uc.bc(I)I")
    public int method8900() {
        return this.field5259 == null ? -1 : this.field5296 + this.field5259.method5516() * 64;
    }

    @ObfuscatedName("uc.by(I)I")
    public int method8767() {
        return this.field5259 == null ? -1 : this.field5264 + this.field5259.method5512() * 64;
    }

    @ObfuscatedName("uc.br(I)Lnn;")
    public class351 method8808() {
        return this.field5259 == null ? null : this.field5259.method5561(this.method8900(), this.method8767());
    }

    @ObfuscatedName("uc.bn(I)I")
    public int method8769() {
        return this.field5269;
    }

    @ObfuscatedName("uc.bu(I)I")
    public int method8924() {
        return this.field5284;
    }

    @ObfuscatedName("uc.bt(II)V")
    public void method8771(int arg0) {
        if (arg0 >= 1) {
            this.field5263 = arg0;
        }
    }

    @ObfuscatedName("uc.bs(B)V")
    public void method8772() {
        this.field5263 = 3;
    }

    @ObfuscatedName("uc.bm(II)V")
    public void method8874(int arg0) {
        if (arg0 >= 1) {
            this.field5274 = arg0;
        }
    }

    @ObfuscatedName("uc.bo(I)V")
    public void method8861() {
        this.field5274 = 50;
    }

    @ObfuscatedName("uc.bd(ZI)V")
    public void method8779(boolean arg0) {
        this.field5275 = arg0;
    }

    @ObfuscatedName("uc.ba(IB)V")
    public void method8776(int arg0) {
        this.field5285 = new HashSet();
        this.field5285.add(arg0);
        this.field5252 = 0;
        this.field5277 = 0;
    }

    @ObfuscatedName("uc.bw(II)V")
    public void method8777(int arg0) {
        this.field5285 = new HashSet();
        this.field5252 = 0;
        this.field5277 = 0;
        for (int var2 = 0; var2 < Statics.field3763; var2++) {
            if (class184.method174(var2) != null && class184.method174(var2).field1930 == arg0) {
                this.field5285.add(class184.method174(var2).field1911);
            }
        }
    }

    @ObfuscatedName("uc.bi(I)V")
    public void method8778() {
        this.field5285 = null;
    }

    @ObfuscatedName("uc.bf(ZB)V")
    public void method8837(boolean arg0) {
        this.field5245 = !arg0;
    }

    @ObfuscatedName("uc.bg(IZI)V")
    public void method8780(int arg0, boolean arg1) {
        if (arg1) {
            this.field5278.remove(arg0);
        } else {
            this.field5278.add(arg0);
        }
        this.method8785();
    }

    @ObfuscatedName("uc.bl(IZI)V")
    public void method8781(int arg0, boolean arg1) {
        if (arg1) {
            this.field5288.remove(arg0);
        } else {
            this.field5288.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3763; var3++) {
            if (class184.method174(var3) != null && class184.method174(var3).field1930 == arg0) {
                int var4 = class184.method174(var3).field1911;
                if (arg1) {
                    this.field5289.remove(var4);
                } else {
                    this.field5289.add(var4);
                }
            }
        }
        this.method8785();
    }

    @ObfuscatedName("uc.be(I)Z")
    public boolean method8782() {
        return !this.field5245;
    }

    @ObfuscatedName("uc.cq(II)Z")
    public boolean method8746(int arg0) {
        return !this.field5278.contains(arg0);
    }

    @ObfuscatedName("uc.cb(II)Z")
    public boolean method8901(int arg0) {
        return !this.field5288.contains(arg0);
    }

    @ObfuscatedName("uc.cd(I)V")
    public void method8785() {
        this.field5290.clear();
        this.field5290.addAll(this.field5278);
        this.field5290.addAll(this.field5289);
    }

    @ObfuscatedName("uc.ci(IIIIIII)V")
    public void method8786(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field5298.method8716()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field5267));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field5267));
        List var9 = this.field5247.method5694(this.field5296 - var7 / 2 - 1, this.field5264 - var8 / 2 - 1, var7 / 2 + this.field5296 + 1, var8 / 2 + this.field5264 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class303 var11 = (class303) var10.next();
            class184 var12 = class184.method174(var11.method5469());
            var13 = false;
            for (int var14 = this.field5293.length - 1; var14 >= 0; var14--) {
                if (var12.field1919[var14] != null) {
                    client.method6901(var12.field1919[var14], var12.field1918, this.field5293[var14], var11.method5469(), var11.field3259.method6250(), var11.field3260.method6250());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("uc.cn(ILnn;I)Lnn;")
    public class351 method8888(int arg0, class351 arg1) {
        if (!this.field5298.method8716()) {
            return null;
        } else if (!this.field5247.method5696()) {
            return null;
        } else if (this.field5259.method5553(arg1.field3777, arg1.field3778)) {
            HashMap var3 = this.field5247.method5698();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class303 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class303 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3260;
                    }
                    var8 = (class303) var7.next();
                    int var9 = var8.field3260.field3777 - arg1.field3777;
                    int var10 = var8.field3260.field3778 - arg1.field3778;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3260;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("uc.co(IILnn;Lnn;I)V")
    public void method8788(int arg0, int arg1, class351 arg2, class351 arg3) {
        class91 var5 = new class91();
        class308 var6 = new class308(arg1, arg2, arg3);
        var5.method2476(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2477(10);
                break;
            case 1009:
                var5.method2477(11);
                break;
            case 1010:
                var5.method2477(12);
                break;
            case 1011:
                var5.method2477(13);
                break;
            case 1012:
                var5.method2477(14);
        }
        class73.method8429(var5);
    }

    @ObfuscatedName("uc.cf(I)Llx;")
    public class303 method8864() {
        if (!this.field5298.method8716()) {
            return null;
        } else if (this.field5247.method5696()) {
            HashMap var1 = this.field5247.method5698();
            this.field5294 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field5294.addAll(var3);
            }
            this.field5295 = this.field5294.iterator();
            return this.method8790();
        } else {
            return null;
        }
    }

    @ObfuscatedName("uc.cl(I)Llx;")
    public class303 method8790() {
        if (this.field5295 == null) {
            return null;
        }
        class303 var1;
        do {
            if (!this.field5295.hasNext()) {
                return null;
            }
            var1 = (class303) this.field5295.next();
        } while (var1.method5469() == -1);
        return var1;
    }
}
