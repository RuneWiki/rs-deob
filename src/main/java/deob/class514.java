package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("tb")
public class class514 {

    @ObfuscatedName("tb.at")
    public class387 field5125;

    @ObfuscatedName("tb.ab")
    public class387 field5166;

    @ObfuscatedName("tb.ac")
    public class387 field5123;

    @ObfuscatedName("tb.ao")
    public static final class516 field5128 = class516.field5189;

    @ObfuscatedName("tb.ah")
    public static final class516 field5129 = class516.field5190;

    @ObfuscatedName("tb.av")
    public static final class516 field5130 = class516.field5191;

    @ObfuscatedName("tb.aq")
    public class431 field5131;

    @ObfuscatedName("tb.ap")
    public HashMap field5163;

    @ObfuscatedName("tb.ae")
    public class559[] field5133;

    @ObfuscatedName("tb.ax")
    public HashMap field5134;

    @ObfuscatedName("tb.ay")
    public class281 field5135;

    @ObfuscatedName("tb.au")
    public class281 field5126;

    @ObfuscatedName("tb.as")
    public class281 field5150;

    @ObfuscatedName("tb.aw")
    public class283 field5138;

    @ObfuscatedName("tb.ad")
    public class513 field5139;

    @ObfuscatedName("tb.ai")
    public int field5140;

    @ObfuscatedName("tb.an")
    public int field5141;

    @ObfuscatedName("tb.am")
    public int field5142 = -1;

    @ObfuscatedName("tb.ar")
    public int field5143 = -1;

    @ObfuscatedName("tb.ag")
    public float field5159;

    @ObfuscatedName("tb.bs")
    public float field5145;

    @ObfuscatedName("tb.bf")
    public int field5144 = -1;

    @ObfuscatedName("tb.bo")
    public int field5147 = -1;

    @ObfuscatedName("tb.bi")
    public int field5173 = -1;

    @ObfuscatedName("tb.bt")
    public int field5120 = -1;

    @ObfuscatedName("tb.bn")
    public int field5149 = 3;

    @ObfuscatedName("tb.bw")
    public int field5127 = 50;

    @ObfuscatedName("tb.bl")
    public boolean field5132 = false;

    @ObfuscatedName("tb.be")
    public HashSet field5153 = null;

    @ObfuscatedName("tb.bg")
    public int field5154 = -1;

    @ObfuscatedName("tb.bu")
    public int field5155 = -1;

    @ObfuscatedName("tb.bh")
    public int field5156 = -1;

    @ObfuscatedName("tb.bk")
    public int field5157 = -1;

    @ObfuscatedName("tb.bp")
    public int field5158 = -1;

    @ObfuscatedName("tb.br")
    public int field5176 = -1;

    @ObfuscatedName("tb.bx")
    public long field5160;

    @ObfuscatedName("tb.bd")
    public int field5161;

    @ObfuscatedName("tb.bv")
    public int field5162;

    @ObfuscatedName("tb.bm")
    public boolean field5148 = true;

    @ObfuscatedName("tb.bc")
    public HashSet field5164 = new HashSet();

    @ObfuscatedName("tb.bz")
    public HashSet field5165 = new HashSet();

    @ObfuscatedName("tb.ba")
    public HashSet field5152 = new HashSet();

    @ObfuscatedName("tb.bb")
    public HashSet field5137 = new HashSet();

    @ObfuscatedName("tb.by")
    public boolean field5168 = false;

    @ObfuscatedName("tb.cw")
    public int field5169 = 0;

    @ObfuscatedName("tb.cn")
    public final int[] field5170 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("tb.ch")
    public List field5179;

    @ObfuscatedName("tb.cp")
    public Iterator field5172;

    @ObfuscatedName("tb.cd")
    public HashSet field5171 = new HashSet();

    @ObfuscatedName("tb.cs")
    public class347 field5174 = null;

    @ObfuscatedName("tb.cm")
    public boolean field5175 = false;

    @ObfuscatedName("tb.ci")
    public class560 field5151;

    @ObfuscatedName("tb.cc")
    public int field5177;

    @ObfuscatedName("tb.cb")
    public int field5178 = -1;

    @ObfuscatedName("tb.cr")
    public int field5167 = -1;

    @ObfuscatedName("tb.co")
    public int field5180 = -1;

    @ObfuscatedName("tb.ak(Lor;Lor;Lor;Lqb;Ljava/util/HashMap;[Lvl;I)V")
    public void method8257(class387 arg0, class387 arg1, class387 arg2, class431 arg3, HashMap arg4, class559[] arg5) {
        this.field5133 = arg5;
        this.field5125 = arg0;
        this.field5166 = arg1;
        this.field5123 = arg2;
        this.field5131 = arg3;
        this.field5163 = new HashMap();
        this.field5163.put(class278.field3042, arg4.get(field5128));
        this.field5163.put(class278.field3044, arg4.get(field5129));
        this.field5163.put(class278.field3043, arg4.get(field5130));
        this.field5139 = new class513(arg0);
        int var7 = this.field5125.method6587(class300.field3237.field3239);
        int[] var8 = this.field5125.method6581(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field5134 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class546 var11 = new class546(this.field5125.method6573(var7, var8[var10]));
            class281 var12 = new class281();
            var12.method5165(var11, var8[var10]);
            this.field5134.put(var12.method5124(), var12);
            if (var12.method5123()) {
                this.field5135 = var12;
            }
        }
        this.method8356(this.field5135);
        this.field5150 = null;
    }

    @ObfuscatedName("tb.al(B)V")
    public void method8440() {
        class282.method5446();
    }

    @ObfuscatedName("tb.aj(IIZIIIIS)V")
    public void method8416(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field5139.method8242()) {
            return;
        }
        this.method8381();
        this.method8426();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field5159));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field5159));
        List var10 = this.field5138.method5316(this.field5140 - var8 / 2 - 1, this.field5141 - var9 / 2 - 1, var8 / 2 + this.field5140 + 1, var9 / 2 + this.field5141 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class299 var13 = (class299) var12.next();
            var11.add(var13);
            class90 var14 = new class90();
            class304 var15 = new class304(var13.method5061(), var13.field3226, var13.field3231);
            var14.method2228(new Object[] { var15, arg0, arg1 });
            if (this.field5171.contains(var13)) {
                var14.method2226(17);
            } else {
                var14.method2226(15);
            }
            class73.method6486(var14);
        }
        Iterator var16 = this.field5171.iterator();
        while (var16.hasNext()) {
            class299 var17 = (class299) var16.next();
            if (!var11.contains(var17)) {
                class90 var18 = new class90();
                class304 var19 = new class304(var17.method5061(), var17.field3226, var17.field3231);
                var18.method2228(new Object[] { var19, arg0, arg1 });
                var18.method2226(16);
                class73.method6486(var18);
            }
        }
        this.field5171 = var11;
    }

    @ObfuscatedName("tb.az(IIZZB)V")
    public void method8260(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class326.method2895();
            this.method8261(arg0, arg1, arg3, var5);
            if (!this.method8266() && (arg3 || arg2)) {
                boolean var7 = client.field708 != null;
                if (!var7) {
                    if (arg3) {
                        this.field5158 = arg0;
                        this.field5176 = arg1;
                        this.field5156 = this.field5140;
                        this.field5157 = this.field5141;
                    }
                    if (this.field5156 != -1) {
                        int var8 = arg0 - this.field5158;
                        int var9 = arg1 - this.field5176;
                        this.method8264(this.field5156 - (int) ((float) var8 / this.field5145), this.field5157 + (int) ((float) var9 / this.field5145), false);
                    }
                    break label33;
                }
            }
            this.method8265();
        }
        if (arg3) {
            this.field5160 = var5;
            this.field5161 = arg0;
            this.field5162 = arg1;
        }
    }

    @ObfuscatedName("tb.af(IIZJ)V")
    public void method8261(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field5126 == null) {
            this.field5174 = null;
            return;
        }
        int var6 = (int) ((float) this.field5140 + ((float) (arg0 - this.field5173) - (float) this.method8294() * this.field5159 / 2.0F) / this.field5159);
        int var7 = (int) ((float) this.field5141 - ((float) (arg1 - this.field5120) - (float) this.method8295() * this.field5159 / 2.0F) / this.field5159);
        this.field5174 = this.field5126.method5172(var6 + this.field5126.method5129() * 64, var7 + this.field5126.method5131() * 64);
        if (this.field5174 == null || !arg2) {
            return;
        }
        class231 var8 = client.field764;
        if (Statics.method4147() && var8.method4087(82) && var8.method4087(81)) {
            int var10 = this.field5174.field3714;
            int var11 = this.field5174.field3713;
            int var12 = this.field5174.field3715;
            class321 var13 = class321.method3542(class319.field3337, client.field591.field1467);
            var13.field3393.method8887(var12);
            var13.field3393.method8834(var11);
            var13.field3393.method8850(0);
            var13.field3393.method8780(var10);
            client.field591.method2745(var13);
            return;
        }
        boolean var14 = true;
        if (this.field5148) {
            int var15 = arg0 - this.field5161;
            int var16 = arg1 - this.field5162;
            if (arg3 - this.field5160 > 500L || var15 < -25 || var15 > 25 || var16 < -25 || var16 > 25) {
                var14 = false;
            }
        }
        if (var14) {
            class321 var17 = class321.method3542(class319.field3334, client.field591.field1467);
            var17.field3393.method8981(this.field5174.method5886());
            client.field591.method2745(var17);
            this.field5160 = 0L;
        }
    }

    @ObfuscatedName("tb.aa(I)V")
    public void method8381() {
        if (Statics.field414 != null) {
            this.field5159 = this.field5145;
            return;
        }
        if (this.field5159 < this.field5145) {
            this.field5159 = Math.min(this.field5145, this.field5159 / 30.0F + this.field5159);
        }
        if (this.field5159 > this.field5145) {
            this.field5159 = Math.max(this.field5145, this.field5159 - this.field5159 / 30.0F);
        }
    }

    @ObfuscatedName("tb.at(I)V")
    public void method8426() {
        if (!this.method8266()) {
            return;
        }
        int var1 = this.field5142 - this.field5140;
        int var2 = this.field5143 - this.field5141;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method8264(this.field5140 + var1, this.field5141 + var2, true);
        if (this.field5142 == this.field5140 && this.field5143 == this.field5141) {
            this.field5142 = -1;
            this.field5143 = -1;
        }
    }

    @ObfuscatedName("tb.ab(IIZI)V")
    public final void method8264(int arg0, int arg1, boolean arg2) {
        this.field5140 = arg0;
        this.field5141 = arg1;
        class326.method2895();
        if (arg2) {
            this.method8265();
        }
    }

    @ObfuscatedName("tb.ac(I)V")
    public final void method8265() {
        this.field5176 = -1;
        this.field5158 = -1;
        this.field5157 = -1;
        this.field5156 = -1;
    }

    @ObfuscatedName("tb.ao(B)Z")
    public boolean method8266() {
        return this.field5142 != -1 && this.field5143 != -1;
    }

    @ObfuscatedName("tb.ah(IIII)Lkz;")
    public class281 method8414(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field5134.values().iterator();
        class281 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class281) var4.next();
        } while (!var5.method5173(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("tb.av(IIIZB)V")
    public void method8268(int arg0, int arg1, int arg2, boolean arg3) {
        class281 var5 = this.method8414(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field5135;
        }
        boolean var6 = false;
        if (this.field5150 != var5 || arg3) {
            this.field5150 = var5;
            this.method8356(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method8274(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("tb.aq(II)V")
    public void method8269(int arg0) {
        class281 var2 = this.method8286(arg0);
        if (var2 != null) {
            this.method8356(var2);
        }
    }

    @ObfuscatedName("tb.ap(I)I")
    public int method8336() {
        return this.field5126 == null ? -1 : this.field5126.method5122();
    }

    @ObfuscatedName("tb.ae(I)Lkz;")
    public class281 method8271() {
        return this.field5126;
    }

    @ObfuscatedName("tb.ax(Lkz;I)V")
    public void method8356(class281 arg0) {
        if (this.field5126 == null || this.field5126 != arg0) {
            this.method8413(arg0);
            this.method8274(-1, -1, -1);
        }
    }

    @ObfuscatedName("tb.ay(Lkz;I)V")
    public void method8413(class281 arg0) {
        this.field5126 = arg0;
        this.field5138 = new class283(this.field5133, this.field5163, this.field5166, this.field5123);
        this.field5139.method8239(this.field5126 == null ? null : this.field5126.method5124());
    }

    @ObfuscatedName("tb.au(Lkz;Lnj;Lnj;ZS)V")
    public void method8304(class281 arg0, class347 arg1, class347 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field5126 == null || this.field5126 != arg0) {
            this.method8413(arg0);
        }
        if (!arg3 && this.field5126.method5173(arg1.field3715, arg1.field3714, arg1.field3713)) {
            this.method8274(arg1.field3715, arg1.field3714, arg1.field3713);
        } else {
            this.method8274(arg2.field3715, arg2.field3714, arg2.field3713);
        }
    }

    @ObfuscatedName("tb.as(IIIB)V")
    public void method8274(int arg0, int arg1, int arg2) {
        if (this.field5126 == null) {
            return;
        }
        int[] var4 = this.field5126.method5119(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field5126.method5119(this.field5126.method5134(), this.field5126.method5145(), this.field5126.method5135());
        }
        this.method8264(var4[0] - this.field5126.method5129() * 64, var4[1] - this.field5126.method5131() * 64, true);
        this.field5142 = -1;
        this.field5143 = -1;
        this.field5159 = this.method8300(this.field5126.method5128());
        this.field5145 = this.field5159;
        this.field5179 = null;
        this.field5172 = null;
        this.field5138.method5317();
    }

    @ObfuscatedName("tb.aw(IIIIID)V")
    public void method8275(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5) {
        int[] var8 = new int[4];
        class556.method9155(var8);
        class556.method9104(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var9 = this.field5139.method8243();
        if (var9 < 100) {
            this.method8281(arg0, arg1, arg2, arg3, var9);
            return;
        }
        if (!this.field5138.method5323()) {
            this.field5138.method5320(this.field5125, this.field5126.method5124(), client.field571);
            if (!this.field5138.method5323()) {
                return;
            }
        }
        int var10 = this.field5138.method5324();
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
        class556.method9112(arg0, arg1, arg2, arg3, var26);
        if (this.field5153 != null) {
            this.field5155++;
            if (this.field5155 % this.field5127 == 0) {
                this.field5155 = 0;
                this.field5154++;
            }
            if (this.field5154 >= this.field5149 && !this.field5132) {
                this.field5153 = null;
            }
        }
        int var28 = (int) Math.ceil((double) ((float) arg2 / this.field5159));
        int var29 = (int) Math.ceil((double) ((float) arg3 / this.field5159));
        this.field5138.method5318(this.field5140 - var28 / 2, this.field5141 - var29 / 2, var28 / 2 + this.field5140, var29 / 2 + this.field5141, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field5168) {
            boolean var30 = false;
            if (arg4 - this.field5169 > 100) {
                this.field5169 = arg4;
                var30 = true;
            }
            this.field5138.method5351(this.field5140 - var28 / 2, this.field5141 - var29 / 2, var28 / 2 + this.field5140, var29 / 2 + this.field5141, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field5137, this.field5153, this.field5155, this.field5127, var30);
        }
        this.method8352(arg0, arg1, arg2, arg3, var28, var29);
        if (Statics.method4147() && this.field5175 && this.field5174 != null) {
            this.field5131.method7488("Coord: " + this.field5174, class556.field5419 + 10, class556.field5417 + 20, 16776960, -1);
        }
        this.field5144 = var28;
        this.field5147 = var29;
        this.field5173 = arg0;
        this.field5120 = arg1;
        class556.method9107(var8);
    }

    @ObfuscatedName("tb.ad(I)V")
    public void method8401() {
        class282.field3097.method5535();
    }

    @ObfuscatedName("tb.ai(IIIIIII)Z")
    public boolean method8277(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field5151 == null) {
            return true;
        } else if (this.field5151.field5441 != arg0 || this.field5151.field5442 != arg1) {
            return true;
        } else if (this.field5138.field3117 != this.field5177) {
            return true;
        } else if (client.field824 != this.field5180) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("tb.an(IIIIIIB)V")
    public void method8352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field414 == null) {
            return;
        }
        int var7 = 512 / (this.field5138.field3117 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method8291() - arg4 / 2 - var7;
        int var14 = this.method8425() - arg5 / 2 - var7;
        int var15 = arg0 - this.field5138.field3117 * (var7 + var13 - this.field5178);
        int var16 = arg1 - this.field5138.field3117 * (var7 - (var14 - this.field5167));
        if (this.method8277(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field5151 != null && this.field5151.field5441 == var11 && this.field5151.field5442 == var12) {
                Arrays.fill(this.field5151.field5445, 0);
            } else {
                this.field5151 = new class560(var11, var12);
            }
            this.field5178 = this.method8291() - arg4 / 2 - var7;
            this.field5167 = this.method8425() - arg5 / 2 - var7;
            this.field5177 = this.field5138.field3117;
            Statics.field414.method6788(this.field5178, this.field5167, this.field5151, (float) this.field5177 / var10);
            this.field5180 = client.field824;
            var15 = arg0 - this.field5138.field3117 * (var7 + var13 - this.field5178);
            var16 = arg1 - this.field5138.field3117 * (var7 - (var14 - this.field5167));
        }
        class556.method9111(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field5151.method9237(var15, var16, 192);
        } else {
            this.field5151.method9240(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("tb.am(IIIII)V")
    public void method8365(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field5139.method8242()) {
            return;
        }
        if (!this.field5138.method5323()) {
            this.field5138.method5320(this.field5125, this.field5126.method5124(), client.field571);
            if (!this.field5138.method5323()) {
                return;
            }
        }
        this.field5138.method5319(arg0, arg1, arg2, arg3, this.field5153, this.field5155, this.field5127);
    }

    @ObfuscatedName("tb.ar(II)V")
    public void method8357(int arg0) {
        this.field5145 = this.method8300(arg0);
    }

    @ObfuscatedName("tb.ag(IIIIIB)V")
    public void method8281(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class556.method9112(arg0, arg1, arg2, arg3, -16777216);
        class556.method9116(var7 - 152, var8, 304, 34, -65536);
        class556.method9112(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field5131.method7468(class378.field4397, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("tb.bs(II)F")
    public float method8300(int arg0) {
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

    @ObfuscatedName("tb.bf(I)I")
    public int method8290() {
        if ((double) this.field5145 == 1.0D) {
            return 25;
        } else if ((double) this.field5145 == 1.5D) {
            return 37;
        } else if ((double) this.field5145 == 2.0D) {
            return 50;
        } else if ((double) this.field5145 == 3.0D) {
            return 75;
        } else if ((double) this.field5145 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("tb.bo(S)V")
    public void method8272() {
        this.field5139.method8240();
    }

    @ObfuscatedName("tb.bi(S)Z")
    public boolean method8285() {
        return this.field5139.method8242();
    }

    @ObfuscatedName("tb.bt(IB)Lkz;")
    public class281 method8286(int arg0) {
        Iterator var2 = this.field5134.values().iterator();
        class281 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class281) var2.next();
        } while (var3.method5122() != arg0);
        return var3;
    }

    @ObfuscatedName("tb.bn(IIB)V")
    public void method8334(int arg0, int arg1) {
        if (this.field5126 != null && this.field5126.method5127(arg0, arg1)) {
            this.field5142 = arg0 - this.field5126.method5129() * 64;
            this.field5143 = arg1 - this.field5126.method5131() * 64;
        }
    }

    @ObfuscatedName("tb.bw(IIB)V")
    public void method8288(int arg0, int arg1) {
        if (this.field5126 != null) {
            this.method8264(arg0 - this.field5126.method5129() * 64, arg1 - this.field5126.method5131() * 64, true);
            this.field5142 = -1;
            this.field5143 = -1;
        }
    }

    @ObfuscatedName("tb.bl(IIII)V")
    public void method8289(int arg0, int arg1, int arg2) {
        if (this.field5126 != null) {
            int[] var4 = this.field5126.method5119(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8334(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tb.be(IIIB)V")
    public void method8302(int arg0, int arg1, int arg2) {
        if (this.field5126 != null) {
            int[] var4 = this.field5126.method5119(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8288(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tb.bg(I)I")
    public int method8291() {
        return this.field5126 == null ? -1 : this.field5140 + this.field5126.method5129() * 64;
    }

    @ObfuscatedName("tb.bu(I)I")
    public int method8425() {
        return this.field5126 == null ? -1 : this.field5141 + this.field5126.method5131() * 64;
    }

    @ObfuscatedName("tb.bh(I)Lnj;")
    public class347 method8293() {
        return this.field5126 == null ? null : this.field5126.method5172(this.method8291(), this.method8425());
    }

    @ObfuscatedName("tb.bk(I)I")
    public int method8294() {
        return this.field5144;
    }

    @ObfuscatedName("tb.bp(I)I")
    public int method8295() {
        return this.field5147;
    }

    @ObfuscatedName("tb.br(II)V")
    public void method8296(int arg0) {
        if (arg0 >= 1) {
            this.field5149 = arg0;
        }
    }

    @ObfuscatedName("tb.bx(I)V")
    public void method8297() {
        this.field5149 = 3;
    }

    @ObfuscatedName("tb.bd(II)V")
    public void method8298(int arg0) {
        if (arg0 >= 1) {
            this.field5127 = arg0;
        }
    }

    @ObfuscatedName("tb.bv(I)V")
    public void method8299() {
        this.field5127 = 50;
    }

    @ObfuscatedName("tb.bm(ZI)V")
    public void method8333(boolean arg0) {
        this.field5132 = arg0;
    }

    @ObfuscatedName("tb.bq(II)V")
    public void method8301(int arg0) {
        this.field5153 = new HashSet();
        this.field5153.add(arg0);
        this.field5154 = 0;
        this.field5155 = 0;
    }

    @ObfuscatedName("tb.bj(IB)V")
    public void method8317(int arg0) {
        this.field5153 = new HashSet();
        this.field5154 = 0;
        this.field5155 = 0;
        for (int var2 = 0; var2 < Statics.field1993; var2++) {
            if (class199.method3551(var2) != null && class199.method3551(var2).field2038 == arg0) {
                this.field5153.add(class199.method3551(var2).field2018);
            }
        }
    }

    @ObfuscatedName("tb.bc(B)V")
    public void method8323() {
        this.field5153 = null;
    }

    @ObfuscatedName("tb.bz(ZI)V")
    public void method8280(boolean arg0) {
        this.field5168 = !arg0;
    }

    @ObfuscatedName("tb.ba(IZB)V")
    public void method8305(int arg0, boolean arg1) {
        if (arg1) {
            this.field5164.remove(arg0);
        } else {
            this.field5164.add(arg0);
        }
        this.method8310();
    }

    @ObfuscatedName("tb.bb(IZI)V")
    public void method8306(int arg0, boolean arg1) {
        if (arg1) {
            this.field5165.remove(arg0);
        } else {
            this.field5165.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1993; var3++) {
            if (class199.method3551(var3) != null && class199.method3551(var3).field2038 == arg0) {
                int var4 = class199.method3551(var3).field2018;
                if (arg1) {
                    this.field5152.remove(var4);
                } else {
                    this.field5152.add(var4);
                }
            }
        }
        this.method8310();
    }

    @ObfuscatedName("tb.by(I)Z")
    public boolean method8307() {
        return !this.field5168;
    }

    @ObfuscatedName("tb.cw(II)Z")
    public boolean method8308(int arg0) {
        return !this.field5164.contains(arg0);
    }

    @ObfuscatedName("tb.ck(II)Z")
    public boolean method8309(int arg0) {
        return !this.field5165.contains(arg0);
    }

    @ObfuscatedName("tb.cn(I)V")
    public void method8310() {
        this.field5137.clear();
        this.field5137.addAll(this.field5164);
        this.field5137.addAll(this.field5152);
    }

    @ObfuscatedName("tb.ch(IIIIIIB)V")
    public void method8311(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field5139.method8242()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field5159));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field5159));
        List var9 = this.field5138.method5316(this.field5140 - var7 / 2 - 1, this.field5141 - var8 / 2 - 1, var7 / 2 + this.field5140 + 1, var8 / 2 + this.field5141 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class299 var11 = (class299) var10.next();
            class199 var12 = class199.method3551(var11.method5061());
            var13 = false;
            for (int var14 = this.field5170.length - 1; var14 >= 0; var14--) {
                if (var12.field2027[var14] != null) {
                    Statics.method353(var12.field2027[var14], var12.field2028, this.field5170[var14], var11.method5061(), var11.field3226.method5886(), var11.field3231.method5886());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("tb.cp(ILnj;B)Lnj;")
    public class347 method8256(int arg0, class347 arg1) {
        if (!this.field5139.method8242()) {
            return null;
        } else if (!this.field5138.method5323()) {
            return null;
        } else if (this.field5126.method5127(arg1.field3714, arg1.field3713)) {
            HashMap var3 = this.field5138.method5321();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class299 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class299 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3231;
                    }
                    var8 = (class299) var7.next();
                    int var9 = var8.field3231.field3714 - arg1.field3714;
                    int var10 = var8.field3231.field3713 - arg1.field3713;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3231;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("tb.cd(IILnj;Lnj;B)V")
    public void method8313(int arg0, int arg1, class347 arg2, class347 arg3) {
        class90 var5 = new class90();
        class304 var6 = new class304(arg1, arg2, arg3);
        var5.method2228(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2226(10);
                break;
            case 1009:
                var5.method2226(11);
                break;
            case 1010:
                var5.method2226(12);
                break;
            case 1011:
                var5.method2226(13);
                break;
            case 1012:
                var5.method2226(14);
        }
        class73.method6486(var5);
    }

    @ObfuscatedName("tb.cs(B)Lls;")
    public class299 method8314() {
        if (!this.field5139.method8242()) {
            return null;
        } else if (this.field5138.method5323()) {
            HashMap var1 = this.field5138.method5321();
            this.field5179 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field5179.addAll(var3);
            }
            this.field5172 = this.field5179.iterator();
            return this.method8325();
        } else {
            return null;
        }
    }

    @ObfuscatedName("tb.cm(I)Lls;")
    public class299 method8325() {
        if (this.field5172 == null) {
            return null;
        }
        class299 var1;
        do {
            if (!this.field5172.hasNext()) {
                return null;
            }
            var1 = (class299) this.field5172.next();
        } while (var1.method5061() == -1);
        return var1;
    }
}
