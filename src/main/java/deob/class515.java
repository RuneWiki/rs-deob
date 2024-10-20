package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("tw")
public class class515 {

    @ObfuscatedName("tw.aj")
    public class388 field5153;

    @ObfuscatedName("tw.av")
    public class388 field5186;

    @ObfuscatedName("tw.ab")
    public class388 field5155;

    @ObfuscatedName("tw.ai")
    public static final class517 field5156 = class517.field5218;

    @ObfuscatedName("tw.ae")
    public static final class517 field5197 = class517.field5219;

    @ObfuscatedName("tw.au")
    public static final class517 field5158 = class517.field5220;

    @ObfuscatedName("tw.ah")
    public class432 field5192;

    @ObfuscatedName("tw.az")
    public HashMap field5180;

    @ObfuscatedName("tw.ax")
    public class560[] field5151;

    @ObfuscatedName("tw.ac")
    public HashMap field5160;

    @ObfuscatedName("tw.al")
    public class248 field5162;

    @ObfuscatedName("tw.ay")
    public class248 field5164;

    @ObfuscatedName("tw.ao")
    public class248 field5165;

    @ObfuscatedName("tw.aa")
    public class250 field5185;

    @ObfuscatedName("tw.as")
    public class514 field5167;

    @ObfuscatedName("tw.aw")
    public int field5168;

    @ObfuscatedName("tw.at")
    public int field5169;

    @ObfuscatedName("tw.af")
    public int field5170 = -1;

    @ObfuscatedName("tw.am")
    public int field5171 = -1;

    @ObfuscatedName("tw.ar")
    public float field5172;

    @ObfuscatedName("tw.bt")
    public float field5173;

    @ObfuscatedName("tw.bj")
    public int field5174 = -1;

    @ObfuscatedName("tw.be")
    public int field5175 = -1;

    @ObfuscatedName("tw.bm")
    public int field5176 = -1;

    @ObfuscatedName("tw.bo")
    public int field5177 = -1;

    @ObfuscatedName("tw.bi")
    public int field5154 = 3;

    @ObfuscatedName("tw.ba")
    public int field5179 = 50;

    @ObfuscatedName("tw.bg")
    public boolean field5163 = false;

    @ObfuscatedName("tw.bs")
    public HashSet field5181 = null;

    @ObfuscatedName("tw.bp")
    public int field5182 = -1;

    @ObfuscatedName("tw.bx")
    public int field5178 = -1;

    @ObfuscatedName("tw.bu")
    public int field5184 = -1;

    @ObfuscatedName("tw.by")
    public int field5205 = -1;

    @ObfuscatedName("tw.bw")
    public int field5208 = -1;

    @ObfuscatedName("tw.bl")
    public int field5187 = -1;

    @ObfuscatedName("tw.bc")
    public long field5159;

    @ObfuscatedName("tw.bv")
    public int field5189;

    @ObfuscatedName("tw.bb")
    public int field5190;

    @ObfuscatedName("tw.bn")
    public boolean field5166 = true;

    @ObfuscatedName("tw.bd")
    public HashSet field5201 = new HashSet();

    @ObfuscatedName("tw.bz")
    public HashSet field5193 = new HashSet();

    @ObfuscatedName("tw.bk")
    public HashSet field5194 = new HashSet();

    @ObfuscatedName("tw.br")
    public HashSet field5195 = new HashSet();

    @ObfuscatedName("tw.bf")
    public boolean field5196 = false;

    @ObfuscatedName("tw.cf")
    public int field5157 = 0;

    @ObfuscatedName("tw.cl")
    public final int[] field5198 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("tw.cm")
    public List field5199;

    @ObfuscatedName("tw.cg")
    public Iterator field5200;

    @ObfuscatedName("tw.cu")
    public HashSet field5206 = new HashSet();

    @ObfuscatedName("tw.cn")
    public class348 field5202 = null;

    @ObfuscatedName("tw.ce")
    public boolean field5188 = false;

    @ObfuscatedName("tw.co")
    public class561 field5204;

    @ObfuscatedName("tw.ch")
    public int field5161;

    @ObfuscatedName("tw.ct")
    public int field5203 = -1;

    @ObfuscatedName("tw.cd")
    public int field5207 = -1;

    @ObfuscatedName("tw.ck")
    public int field5191 = -1;

    @ObfuscatedName("tw.aq(Lok;Lok;Lok;Lqh;Ljava/util/HashMap;[Lvv;I)V")
    public void method8250(class388 arg0, class388 arg1, class388 arg2, class432 arg3, HashMap arg4, class560[] arg5) {
        this.field5151 = arg5;
        this.field5153 = arg0;
        this.field5186 = arg1;
        this.field5155 = arg2;
        this.field5192 = arg3;
        this.field5180 = new HashMap();
        this.field5180.put(class245.field2550, arg4.get(field5156));
        this.field5180.put(class245.field2551, arg4.get(field5197));
        this.field5180.put(class245.field2544, arg4.get(field5158));
        this.field5167 = new class514(arg0);
        int var7 = this.field5153.method6555(class267.field2741.field2738);
        int[] var8 = this.field5153.method6548(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field5160 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class547 var11 = new class547(this.field5153.method6539(var7, var8[var10]));
            class248 var12 = new class248();
            var12.method4289(var11, var8[var10]);
            this.field5160.put(var12.method4271(), var12);
            if (var12.method4270()) {
                this.field5162 = var12;
            }
        }
        this.method8215(this.field5162);
        this.field5165 = null;
    }

    @ObfuscatedName("tw.ad(I)V")
    public void method8201() {
        class249.field2593.method5467(5);
    }

    @ObfuscatedName("tw.ag(IIZIIIII)V")
    public void method8202(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field5167.method8191()) {
            return;
        }
        this.method8205();
        this.method8206();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field5172));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field5172));
        List var10 = this.field5185.method4490(this.field5168 - var8 / 2 - 1, this.field5169 - var9 / 2 - 1, var8 / 2 + this.field5168 + 1, var9 / 2 + this.field5169 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class266 var13 = (class266) var12.next();
            var11.add(var13);
            class90 var14 = new class90();
            class271 var15 = new class271(var13.method4215(), var13.field2733, var13.field2732);
            var14.method2271(new Object[] { var15, arg0, arg1 });
            if (this.field5206.contains(var13)) {
                var14.method2272(17);
            } else {
                var14.method2272(15);
            }
            class73.method2137(var14);
        }
        Iterator var16 = this.field5206.iterator();
        while (var16.hasNext()) {
            class266 var17 = (class266) var16.next();
            if (!var11.contains(var17)) {
                class90 var18 = new class90();
                class271 var19 = new class271(var17.method4215(), var17.field2733, var17.field2732);
                var18.method2271(new Object[] { var19, arg0, arg1 });
                var18.method2272(16);
                class73.method2137(var18);
            }
        }
        this.field5206 = var11;
    }

    @ObfuscatedName("tw.ak(IIZZI)V")
    public void method8203(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class327.method4500();
            this.method8399(arg0, arg1, arg3, var5);
            if (!this.method8209() && (arg3 || arg2)) {
                boolean var7 = client.field736 != null;
                if (!var7) {
                    if (arg3) {
                        this.field5208 = arg0;
                        this.field5187 = arg1;
                        this.field5184 = this.field5168;
                        this.field5205 = this.field5169;
                    }
                    if (this.field5184 != -1) {
                        int var8 = arg0 - this.field5208;
                        int var9 = arg1 - this.field5187;
                        this.method8219(this.field5184 - (int) ((float) var8 / this.field5173), this.field5205 + (int) ((float) var9 / this.field5173), false);
                    }
                    break label33;
                }
            }
            this.method8208();
        }
        if (arg3) {
            this.field5159 = var5;
            this.field5189 = arg0;
            this.field5190 = arg1;
        }
    }

    @ObfuscatedName("tw.ap(IIZJ)V")
    public void method8399(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field5164 == null) {
            this.field5202 = null;
            return;
        }
        int var6 = (int) ((float) this.field5168 + ((float) (arg0 - this.field5176) - (float) this.method8304() * this.field5172 / 2.0F) / this.field5172);
        int var7 = (int) ((float) this.field5169 - ((float) (arg1 - this.field5177) - (float) this.method8204() * this.field5172 / 2.0F) / this.field5172);
        this.field5202 = this.field5164.method4267(var6 + this.field5164.method4281() * 64, var7 + this.field5164.method4278() * 64);
        if (this.field5202 == null || !arg2) {
            return;
        }
        class232 var8 = client.field729;
        if (client.method2885() && var8.method4036(82) && var8.method4036(81)) {
            client.method2582(this.field5202.field3733, this.field5202.field3735, this.field5202.field3734, false);
            return;
        }
        boolean var10 = true;
        if (this.field5166) {
            int var11 = arg0 - this.field5189;
            int var12 = arg1 - this.field5190;
            if (arg3 - this.field5159 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                var10 = false;
            }
        }
        if (var10) {
            class322 var13 = class322.method3236(class320.field3340, client.field653.field1456);
            var13.field3394.method8709(this.field5202.method5852());
            client.field653.method2773(var13);
            this.field5159 = 0L;
        }
    }

    @ObfuscatedName("tw.an(I)V")
    public void method8205() {
        if (Statics.field5031 != null) {
            this.field5172 = this.field5173;
            return;
        }
        if (this.field5172 < this.field5173) {
            this.field5172 = Math.min(this.field5173, this.field5172 / 30.0F + this.field5172);
        }
        if (this.field5172 > this.field5173) {
            this.field5172 = Math.max(this.field5173, this.field5172 - this.field5172 / 30.0F);
        }
    }

    @ObfuscatedName("tw.aj(I)V")
    public void method8206() {
        if (!this.method8209()) {
            return;
        }
        int var1 = this.field5170 - this.field5168;
        int var2 = this.field5171 - this.field5169;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method8219(this.field5168 + var1, this.field5169 + var2, true);
        if (this.field5170 == this.field5168 && this.field5171 == this.field5169) {
            this.field5170 = -1;
            this.field5171 = -1;
        }
    }

    @ObfuscatedName("tw.av(IIZI)V")
    public final void method8219(int arg0, int arg1, boolean arg2) {
        this.field5168 = arg0;
        this.field5169 = arg1;
        class327.method4500();
        if (arg2) {
            this.method8208();
        }
    }

    @ObfuscatedName("tw.ab(I)V")
    public final void method8208() {
        this.field5187 = -1;
        this.field5208 = -1;
        this.field5205 = -1;
        this.field5184 = -1;
    }

    @ObfuscatedName("tw.ai(I)Z")
    public boolean method8209() {
        return this.field5170 != -1 && this.field5171 != -1;
    }

    @ObfuscatedName("tw.ae(IIII)Ljm;")
    public class248 method8372(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field5160.values().iterator();
        class248 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class248) var4.next();
        } while (!var5.method4269(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("tw.au(IIIZI)V")
    public void method8211(int arg0, int arg1, int arg2, boolean arg3) {
        class248 var5 = this.method8372(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field5162;
        }
        boolean var6 = false;
        if (this.field5165 != var5 || arg3) {
            this.field5165 = var5;
            this.method8215(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method8218(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("tw.ah(II)V")
    public void method8300(int arg0) {
        class248 var2 = this.method8303(arg0);
        if (var2 != null) {
            this.method8215(var2);
        }
    }

    @ObfuscatedName("tw.az(I)I")
    public int method8371() {
        return this.field5164 == null ? -1 : this.field5164.method4282();
    }

    @ObfuscatedName("tw.ax(I)Ljm;")
    public class248 method8214() {
        return this.field5164;
    }

    @ObfuscatedName("tw.ac(Ljm;B)V")
    public void method8215(class248 arg0) {
        if (this.field5164 == null || this.field5164 != arg0) {
            this.method8334(arg0);
            this.method8218(-1, -1, -1);
        }
    }

    @ObfuscatedName("tw.al(Ljm;I)V")
    public void method8334(class248 arg0) {
        this.field5164 = arg0;
        this.field5185 = new class250(this.field5151, this.field5180, this.field5186, this.field5155);
        this.field5167.method8187(this.field5164 == null ? null : this.field5164.method4271());
    }

    @ObfuscatedName("tw.ay(Ljm;Lnl;Lnl;ZI)V")
    public void method8217(class248 arg0, class348 arg1, class348 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field5164 == null || this.field5164 != arg0) {
            this.method8334(arg0);
        }
        if (!arg3 && this.field5164.method4269(arg1.field3734, arg1.field3733, arg1.field3735)) {
            this.method8218(arg1.field3734, arg1.field3733, arg1.field3735);
        } else {
            this.method8218(arg2.field3734, arg2.field3733, arg2.field3735);
        }
    }

    @ObfuscatedName("tw.ao(IIII)V")
    public void method8218(int arg0, int arg1, int arg2) {
        if (this.field5164 == null) {
            return;
        }
        int[] var4 = this.field5164.method4266(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field5164.method4266(this.field5164.method4303(), this.field5164.method4280(), this.field5164.method4268());
        }
        this.method8219(var4[0] - this.field5164.method4281() * 64, var4[1] - this.field5164.method4278() * 64, true);
        this.field5170 = -1;
        this.field5171 = -1;
        this.field5172 = this.method8226(this.field5164.method4275());
        this.field5173 = this.field5172;
        this.field5199 = null;
        this.field5200 = null;
        this.field5185.method4452();
    }

    @ObfuscatedName("tw.aa(IIIIID)V")
    public void method8316(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5) {
        int[] var8 = new int[4];
        class557.method9054(var8);
        class557.method9105(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var9 = this.field5167.method8196();
        if (var9 < 100) {
            this.method8225(arg0, arg1, arg2, arg3, var9);
            return;
        }
        if (!this.field5185.method4458()) {
            this.field5185.method4451(this.field5153, this.field5164.method4271(), client.field503);
            if (!this.field5185.method4458()) {
                return;
            }
        }
        int var10 = this.field5185.method4459();
        double var11 = (double) (var10 >> 16 & 0xFF) / 256.0D;
        double var13 = (double) (var10 >> 8 & 0xFF) / 256.0D;
        double var15 = (double) (var10 & 0xFF) / 256.0D;
        double var17 = Math.pow(var11, arg5);
        double var19 = Math.pow(var13, arg5);
        double var21 = Math.pow(var15, arg5);
        int var23 = (int) (var17 * 256.0D);
        int var24 = (int) (var19 * 256.0D);
        int var25 = (int) (var21 * 256.0D);
        int var26 = (var24 << 8) + (var23 << 16) + -16777216 + var25;
        class557.method9060(arg0, arg1, arg2, arg3, var26);
        if (this.field5181 != null) {
            this.field5178++;
            if (this.field5178 % this.field5179 == 0) {
                this.field5178 = 0;
                this.field5182++;
            }
            if (this.field5182 >= this.field5154 && !this.field5163) {
                this.field5181 = null;
            }
        }
        int var28 = (int) Math.ceil((double) ((float) arg2 / this.field5172));
        int var29 = (int) Math.ceil((double) ((float) arg3 / this.field5172));
        this.field5185.method4453(this.field5168 - var28 / 2, this.field5169 - var29 / 2, var28 / 2 + this.field5168, var29 / 2 + this.field5169, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field5196) {
            boolean var30 = false;
            if (arg4 - this.field5157 > 100) {
                this.field5157 = arg4;
                var30 = true;
            }
            this.field5185.method4454(this.field5168 - var28 / 2, this.field5169 - var29 / 2, var28 / 2 + this.field5168, var29 / 2 + this.field5169, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field5195, this.field5181, this.field5178, this.field5179, var30);
        }
        this.method8213(arg0, arg1, arg2, arg3, var28, var29);
        if (client.method2885() && this.field5188 && this.field5202 != null) {
            this.field5192.method7528("Coord: " + this.field5202, class557.field5438 + 10, class557.field5435 + 20, 16776960, -1);
        }
        this.field5174 = var28;
        this.field5175 = var29;
        this.field5176 = arg0;
        this.field5177 = arg1;
        class557.method9055(var8);
    }

    @ObfuscatedName("tw.as(I)V")
    public void method8266() {
        class249.field2593.method5468();
    }

    @ObfuscatedName("tw.aw(IIIIIIB)Z")
    public boolean method8283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field5204 == null) {
            return true;
        } else if (this.field5204.field5458 != arg0 || this.field5204.field5461 != arg1) {
            return true;
        } else if (this.field5185.field2616 != this.field5161) {
            return true;
        } else if (client.field800 != this.field5191) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("tw.at(IIIIIII)V")
    public void method8213(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field5031 == null) {
            return;
        }
        int var7 = 512 / (this.field5185.field2616 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method8235() - arg4 / 2 - var7;
        int var14 = this.method8236() - arg5 / 2 - var7;
        int var15 = arg0 - this.field5185.field2616 * (var7 + var13 - this.field5203);
        int var16 = arg1 - this.field5185.field2616 * (var7 - (var14 - this.field5207));
        if (this.method8283(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field5204 != null && this.field5204.field5458 == var11 && this.field5204.field5461 == var12) {
                Arrays.fill(this.field5204.field5466, 0);
            } else {
                this.field5204 = new class561(var11, var12);
            }
            this.field5203 = this.method8235() - arg4 / 2 - var7;
            this.field5207 = this.method8236() - arg5 / 2 - var7;
            this.field5161 = this.field5185.field2616;
            Statics.field5031.method6739(this.field5203, this.field5207, this.field5204, (float) this.field5161 / var10);
            this.field5191 = client.field800;
            var15 = arg0 - this.field5185.field2616 * (var7 + var13 - this.field5203);
            var16 = arg1 - this.field5185.field2616 * (var7 - (var14 - this.field5207));
        }
        class557.method9079(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field5204.method9178(var15, var16, 192);
        } else {
            this.field5204.method9180(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("tw.af(IIIII)V")
    public void method8223(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field5167.method8191()) {
            return;
        }
        if (!this.field5185.method4458()) {
            this.field5185.method4451(this.field5153, this.field5164.method4271(), client.field503);
            if (!this.field5185.method4458()) {
                return;
            }
        }
        this.field5185.method4455(arg0, arg1, arg2, arg3, this.field5181, this.field5178, this.field5179);
    }

    @ObfuscatedName("tw.am(II)V")
    public void method8224(int arg0) {
        this.field5173 = this.method8226(arg0);
    }

    @ObfuscatedName("tw.ar(IIIIII)V")
    public void method8225(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class557.method9060(arg0, arg1, arg2, arg3, -16777216);
        class557.method9064(var7 - 152, var8, 304, 34, -65536);
        class557.method9060(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field5192.method7435(class379.field4167, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("tw.bt(IB)F")
    public float method8226(int arg0) {
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

    @ObfuscatedName("tw.bj(I)I")
    public int method8227() {
        if ((double) this.field5173 == 1.0D) {
            return 25;
        } else if ((double) this.field5173 == 1.5D) {
            return 37;
        } else if ((double) this.field5173 == 2.0D) {
            return 50;
        } else if ((double) this.field5173 == 3.0D) {
            return 75;
        } else if ((double) this.field5173 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("tw.be(B)V")
    public void method8228() {
        this.field5167.method8182();
    }

    @ObfuscatedName("tw.bm(I)Z")
    public boolean method8229() {
        return this.field5167.method8191();
    }

    @ObfuscatedName("tw.bo(II)Ljm;")
    public class248 method8303(int arg0) {
        Iterator var2 = this.field5160.values().iterator();
        class248 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class248) var2.next();
        } while (var3.method4282() != arg0);
        return var3;
    }

    @ObfuscatedName("tw.bi(III)V")
    public void method8231(int arg0, int arg1) {
        if (this.field5164 != null && this.field5164.method4265(arg0, arg1)) {
            this.field5170 = arg0 - this.field5164.method4281() * 64;
            this.field5171 = arg1 - this.field5164.method4278() * 64;
        }
    }

    @ObfuscatedName("tw.ba(III)V")
    public void method8322(int arg0, int arg1) {
        if (this.field5164 != null) {
            this.method8219(arg0 - this.field5164.method4281() * 64, arg1 - this.field5164.method4278() * 64, true);
            this.field5170 = -1;
            this.field5171 = -1;
        }
    }

    @ObfuscatedName("tw.bg(IIII)V")
    public void method8313(int arg0, int arg1, int arg2) {
        if (this.field5164 != null) {
            int[] var4 = this.field5164.method4266(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8231(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tw.bs(IIII)V")
    public void method8234(int arg0, int arg1, int arg2) {
        if (this.field5164 != null) {
            int[] var4 = this.field5164.method4266(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8322(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tw.bp(B)I")
    public int method8235() {
        return this.field5164 == null ? -1 : this.field5168 + this.field5164.method4281() * 64;
    }

    @ObfuscatedName("tw.bx(I)I")
    public int method8236() {
        return this.field5164 == null ? -1 : this.field5169 + this.field5164.method4278() * 64;
    }

    @ObfuscatedName("tw.bu(I)Lnl;")
    public class348 method8237() {
        return this.field5164 == null ? null : this.field5164.method4267(this.method8235(), this.method8236());
    }

    @ObfuscatedName("tw.by(I)I")
    public int method8304() {
        return this.field5174;
    }

    @ObfuscatedName("tw.bw(I)I")
    public int method8204() {
        return this.field5175;
    }

    @ObfuscatedName("tw.bl(IB)V")
    public void method8240(int arg0) {
        if (arg0 >= 1) {
            this.field5154 = arg0;
        }
    }

    @ObfuscatedName("tw.bc(B)V")
    public void method8241() {
        this.field5154 = 3;
    }

    @ObfuscatedName("tw.bv(II)V")
    public void method8253(int arg0) {
        if (arg0 >= 1) {
            this.field5179 = arg0;
        }
    }

    @ObfuscatedName("tw.bb(I)V")
    public void method8243() {
        this.field5179 = 50;
    }

    @ObfuscatedName("tw.bn(ZI)V")
    public void method8244(boolean arg0) {
        this.field5163 = arg0;
    }

    @ObfuscatedName("tw.bh(IB)V")
    public void method8245(int arg0) {
        this.field5181 = new HashSet();
        this.field5181.add(arg0);
        this.field5182 = 0;
        this.field5178 = 0;
    }

    @ObfuscatedName("tw.bq(IB)V")
    public void method8246(int arg0) {
        this.field5181 = new HashSet();
        this.field5182 = 0;
        this.field5178 = 0;
        for (int var2 = 0; var2 < Statics.field1887; var2++) {
            if (class182.method3196(var2) != null && class182.method3196(var2).field1893 == arg0) {
                this.field5181.add(class182.method3196(var2).field1890);
            }
        }
    }

    @ObfuscatedName("tw.bd(I)V")
    public void method8200() {
        this.field5181 = null;
    }

    @ObfuscatedName("tw.bz(ZB)V")
    public void method8248(boolean arg0) {
        this.field5196 = !arg0;
    }

    @ObfuscatedName("tw.bk(IZI)V")
    public void method8249(int arg0, boolean arg1) {
        if (arg1) {
            this.field5201.remove(arg0);
        } else {
            this.field5201.add(arg0);
        }
        this.method8328();
    }

    @ObfuscatedName("tw.br(IZB)V")
    public void method8341(int arg0, boolean arg1) {
        if (arg1) {
            this.field5193.remove(arg0);
        } else {
            this.field5193.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1887; var3++) {
            if (class182.method3196(var3) != null && class182.method3196(var3).field1893 == arg0) {
                int var4 = class182.method3196(var3).field1890;
                if (arg1) {
                    this.field5194.remove(var4);
                } else {
                    this.field5194.add(var4);
                }
            }
        }
        this.method8328();
    }

    @ObfuscatedName("tw.bf(I)Z")
    public boolean method8251() {
        return !this.field5196;
    }

    @ObfuscatedName("tw.cf(II)Z")
    public boolean method8252(int arg0) {
        return !this.field5201.contains(arg0);
    }

    @ObfuscatedName("tw.cv(IB)Z")
    public boolean method8267(int arg0) {
        return !this.field5193.contains(arg0);
    }

    @ObfuscatedName("tw.cl(I)V")
    public void method8328() {
        this.field5195.clear();
        this.field5195.addAll(this.field5201);
        this.field5195.addAll(this.field5194);
    }

    @ObfuscatedName("tw.cm(IIIIIIB)V")
    public void method8247(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field5167.method8191()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field5172));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field5172));
        List var9 = this.field5185.method4490(this.field5168 - var7 / 2 - 1, this.field5169 - var8 / 2 - 1, var7 / 2 + this.field5168 + 1, var8 / 2 + this.field5169 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class266 var11 = (class266) var10.next();
            class182 var12 = class182.method3196(var11.method4215());
            var13 = false;
            for (int var14 = this.field5198.length - 1; var14 >= 0; var14--) {
                if (var12.field1899[var14] != null) {
                    client.method2796(var12.field1899[var14], var12.field1900, this.field5198[var14], var11.method4215(), var11.field2733.method5852(), var11.field2732.method5852());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("tw.cg(ILnl;B)Lnl;")
    public class348 method8256(int arg0, class348 arg1) {
        if (!this.field5167.method8191()) {
            return null;
        } else if (!this.field5185.method4458()) {
            return null;
        } else if (this.field5164.method4265(arg1.field3733, arg1.field3735)) {
            HashMap var3 = this.field5185.method4463();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class266 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class266 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2732;
                    }
                    var8 = (class266) var7.next();
                    int var9 = var8.field2732.field3733 - arg1.field3733;
                    int var10 = var8.field2732.field3735 - arg1.field3735;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2732;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("tw.cu(IILnl;Lnl;B)V")
    public void method8367(int arg0, int arg1, class348 arg2, class348 arg3) {
        class90 var5 = new class90();
        class271 var6 = new class271(arg1, arg2, arg3);
        var5.method2271(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2272(10);
                break;
            case 1009:
                var5.method2272(11);
                break;
            case 1010:
                var5.method2272(12);
                break;
            case 1011:
                var5.method2272(13);
                break;
            case 1012:
                var5.method2272(14);
        }
        class73.method2137(var5);
    }

    @ObfuscatedName("tw.cn(I)Lkh;")
    public class266 method8258() {
        if (!this.field5167.method8191()) {
            return null;
        } else if (this.field5185.method4458()) {
            HashMap var1 = this.field5185.method4463();
            this.field5199 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field5199.addAll(var3);
            }
            this.field5200 = this.field5199.iterator();
            return this.method8259();
        } else {
            return null;
        }
    }

    @ObfuscatedName("tw.ce(I)Lkh;")
    public class266 method8259() {
        if (this.field5200 == null) {
            return null;
        }
        class266 var1;
        do {
            if (!this.field5200.hasNext()) {
                return null;
            }
            var1 = (class266) this.field5200.next();
        } while (var1.method4215() == -1);
        return var1;
    }
}
