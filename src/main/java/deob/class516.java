package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("tb")
public class class516 {

    @ObfuscatedName("tb.am")
    public class389 field5158;

    @ObfuscatedName("tb.ac")
    public class389 field5159;

    @ObfuscatedName("tb.ae")
    public class389 field5160;

    @ObfuscatedName("tb.ad")
    public static final class518 field5192 = class518.field5226;

    @ObfuscatedName("tb.aq")
    public static final class518 field5162 = class518.field5219;

    @ObfuscatedName("tb.al")
    public static final class518 field5199 = class518.field5223;

    @ObfuscatedName("tb.aj")
    public class433 field5170;

    @ObfuscatedName("tb.as")
    public HashMap field5165;

    @ObfuscatedName("tb.aw")
    public class562[] field5166;

    @ObfuscatedName("tb.af")
    public HashMap field5174;

    @ObfuscatedName("tb.aa")
    public class284 field5168;

    @ObfuscatedName("tb.ah")
    public class284 field5169;

    @ObfuscatedName("tb.ag")
    public class284 field5161;

    @ObfuscatedName("tb.av")
    public class286 field5205;

    @ObfuscatedName("tb.ar")
    public class515 field5206;

    @ObfuscatedName("tb.ap")
    public int field5173;

    @ObfuscatedName("tb.ak")
    public int field5210;

    @ObfuscatedName("tb.ai")
    public int field5175 = -1;

    @ObfuscatedName("tb.at")
    public int field5176 = -1;

    @ObfuscatedName("tb.az")
    public float field5177;

    @ObfuscatedName("tb.bg")
    public float field5178;

    @ObfuscatedName("tb.bz")
    public int field5179 = -1;

    @ObfuscatedName("tb.bj")
    public int field5180 = -1;

    @ObfuscatedName("tb.bc")
    public int field5164 = -1;

    @ObfuscatedName("tb.bo")
    public int field5182 = -1;

    @ObfuscatedName("tb.bm")
    public int field5183 = 3;

    @ObfuscatedName("tb.bd")
    public int field5203 = 50;

    @ObfuscatedName("tb.bh")
    public boolean field5185 = false;

    @ObfuscatedName("tb.bx")
    public HashSet field5186 = null;

    @ObfuscatedName("tb.bv")
    public int field5156 = -1;

    @ObfuscatedName("tb.bu")
    public int field5188 = -1;

    @ObfuscatedName("tb.bp")
    public int field5189 = -1;

    @ObfuscatedName("tb.br")
    public int field5155 = -1;

    @ObfuscatedName("tb.bf")
    public int field5191 = -1;

    @ObfuscatedName("tb.bq")
    public int field5157 = -1;

    @ObfuscatedName("tb.bt")
    public long field5193;

    @ObfuscatedName("tb.bi")
    public int field5184;

    @ObfuscatedName("tb.be")
    public int field5195;

    @ObfuscatedName("tb.ba")
    public boolean field5196 = true;

    @ObfuscatedName("tb.bk")
    public HashSet field5197 = new HashSet();

    @ObfuscatedName("tb.bs")
    public HashSet field5198 = new HashSet();

    @ObfuscatedName("tb.bb")
    public HashSet field5163 = new HashSet();

    @ObfuscatedName("tb.by")
    public HashSet field5200 = new HashSet();

    @ObfuscatedName("tb.bl")
    public boolean field5201 = false;

    @ObfuscatedName("tb.cx")
    public int field5202 = 0;

    @ObfuscatedName("tb.cz")
    public final int[] field5187 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("tb.cm")
    public List field5204;

    @ObfuscatedName("tb.ct")
    public Iterator field5167;

    @ObfuscatedName("tb.cl")
    public HashSet field5172 = new HashSet();

    @ObfuscatedName("tb.cb")
    public class350 field5207 = null;

    @ObfuscatedName("tb.cr")
    public boolean field5208 = false;

    @ObfuscatedName("tb.cj")
    public class563 field5194;

    @ObfuscatedName("tb.cg")
    public int field5154;

    @ObfuscatedName("tb.cp")
    public int field5190 = -1;

    @ObfuscatedName("tb.cq")
    public int field5212 = -1;

    @ObfuscatedName("tb.ci")
    public int field5213 = -1;

    @ObfuscatedName("tb.ab(Lob;Lob;Lob;Lqe;Ljava/util/HashMap;[Lvb;S)V")
    public void method8293(class389 arg0, class389 arg1, class389 arg2, class433 arg3, HashMap arg4, class562[] arg5) {
        this.field5166 = arg5;
        this.field5158 = arg0;
        this.field5159 = arg1;
        this.field5160 = arg2;
        this.field5170 = arg3;
        this.field5165 = new HashMap();
        this.field5165.put(class281.field3029, arg4.get(field5192));
        this.field5165.put(class281.field3028, arg4.get(field5162));
        this.field5165.put(class281.field3030, arg4.get(field5199));
        this.field5206 = new class515(arg0);
        int var7 = this.field5158.method6654(class303.field3215.field3217);
        int[] var8 = this.field5158.method6647(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field5174 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class549 var11 = new class549(this.field5158.method6670(var7, var8[var10]));
            class284 var12 = new class284();
            var12.method5172(var11, var8[var10]);
            this.field5174.put(var12.method5195(), var12);
            if (var12.method5136()) {
                this.field5168 = var12;
            }
        }
        this.method8341(this.field5168);
        this.field5161 = null;
    }

    @ObfuscatedName("tb.ay(I)V")
    public void method8425() {
        class285.field3073.method5567(5);
    }

    @ObfuscatedName("tb.an(IIZIIIII)V")
    public void method8295(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field5206.method8288()) {
            return;
        }
        this.method8458();
        this.method8299();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field5177));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field5177));
        List var10 = this.field5205.method5345(this.field5173 - var8 / 2 - 1, this.field5210 - var9 / 2 - 1, var8 / 2 + this.field5173 + 1, var9 / 2 + this.field5210 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class302 var13 = (class302) var12.next();
            var11.add(var13);
            class90 var14 = new class90();
            class307 var15 = new class307(var13.method5108(), var13.field3209, var13.field3211);
            var14.method2325(new Object[] { var15, arg0, arg1 });
            if (this.field5172.contains(var13)) {
                var14.method2326(17);
            } else {
                var14.method2326(15);
            }
            class73.method7183(var14);
        }
        Iterator var16 = this.field5172.iterator();
        while (var16.hasNext()) {
            class302 var17 = (class302) var16.next();
            if (!var11.contains(var17)) {
                class90 var18 = new class90();
                class307 var19 = new class307(var17.method5108(), var17.field3209, var17.field3211);
                var18.method2325(new Object[] { var19, arg0, arg1 });
                var18.method2326(16);
                class73.method7183(var18);
            }
        }
        this.field5172 = var11;
    }

    @ObfuscatedName("tb.au(IIZZI)V")
    public void method8481(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class329.method5009();
            this.method8355(arg0, arg1, arg3, var5);
            if (!this.method8368() && (arg3 || arg2)) {
                boolean var7 = client.field679 != null;
                if (!var7) {
                    if (arg3) {
                        this.field5191 = arg0;
                        this.field5157 = arg1;
                        this.field5189 = this.field5173;
                        this.field5155 = this.field5210;
                    }
                    if (this.field5189 != -1) {
                        int var8 = arg0 - this.field5191;
                        int var9 = arg1 - this.field5157;
                        this.method8442(this.field5189 - (int) ((float) var8 / this.field5178), this.field5155 + (int) ((float) var9 / this.field5178), false);
                    }
                    break label33;
                }
            }
            this.method8301();
        }
        if (arg3) {
            this.field5193 = var5;
            this.field5184 = arg0;
            this.field5195 = arg1;
        }
    }

    @ObfuscatedName("tb.ax(IIZJ)V")
    public void method8355(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field5169 == null) {
            this.field5207 = null;
            return;
        }
        int var6 = (int) ((float) this.field5173 + ((float) (arg0 - this.field5164) - (float) this.method8457() * this.field5177 / 2.0F) / this.field5177);
        int var7 = (int) ((float) this.field5210 - ((float) (arg1 - this.field5182) - (float) this.method8435() * this.field5177 / 2.0F) / this.field5177);
        this.field5207 = this.field5169.method5141(var6 + this.field5169.method5150() * 64, var7 + this.field5169.method5184() * 64);
        if (this.field5207 == null || !arg2) {
            return;
        }
        class268 var8 = client.method4380();
        if (client.method5070() && var8.method4940(82) && var8.method4940(81)) {
            client.method3427(this.field5207.field3705, this.field5207.field3704, this.field5207.field3706, false);
            return;
        }
        boolean var9 = true;
        if (this.field5196) {
            int var10 = arg0 - this.field5184;
            int var11 = arg1 - this.field5195;
            if (arg3 - this.field5193 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class324 var12 = class324.method4244(class322.field3266, client.field569.field1458);
            var12.field3379.method8852(this.field5207.method5935());
            client.field569.method2829(var12);
            this.field5193 = 0L;
        }
    }

    @ObfuscatedName("tb.ao(B)V")
    public void method8458() {
        if (Statics.field1623 != null) {
            this.field5177 = this.field5178;
            return;
        }
        if (this.field5177 < this.field5178) {
            this.field5177 = Math.min(this.field5178, this.field5177 / 30.0F + this.field5177);
        }
        if (this.field5177 > this.field5178) {
            this.field5177 = Math.max(this.field5178, this.field5177 - this.field5177 / 30.0F);
        }
    }

    @ObfuscatedName("tb.am(I)V")
    public void method8299() {
        if (!this.method8368()) {
            return;
        }
        int var1 = this.field5175 - this.field5173;
        int var2 = this.field5176 - this.field5210;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method8442(this.field5173 + var1, this.field5210 + var2, true);
        if (this.field5175 == this.field5173 && this.field5210 == this.field5176) {
            this.field5175 = -1;
            this.field5176 = -1;
        }
    }

    @ObfuscatedName("tb.ac(IIZI)V")
    public final void method8442(int arg0, int arg1, boolean arg2) {
        this.field5173 = arg0;
        this.field5210 = arg1;
        class329.method5009();
        if (arg2) {
            this.method8301();
        }
    }

    @ObfuscatedName("tb.ae(I)V")
    public final void method8301() {
        this.field5157 = -1;
        this.field5191 = -1;
        this.field5155 = -1;
        this.field5189 = -1;
    }

    @ObfuscatedName("tb.ad(B)Z")
    public boolean method8368() {
        return this.field5175 != -1 && this.field5176 != -1;
    }

    @ObfuscatedName("tb.aq(IIIB)Lku;")
    public class284 method8303(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field5174.values().iterator();
        class284 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class284) var4.next();
        } while (!var5.method5166(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("tb.al(IIIZI)V")
    public void method8304(int arg0, int arg1, int arg2, boolean arg3) {
        class284 var5 = this.method8303(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field5168;
        }
        boolean var6 = false;
        if (this.field5161 != var5 || arg3) {
            this.field5161 = var5;
            this.method8341(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method8311(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("tb.aj(II)V")
    public void method8305(int arg0) {
        class284 var2 = this.method8323(arg0);
        if (var2 != null) {
            this.method8341(var2);
        }
    }

    @ObfuscatedName("tb.as(I)I")
    public int method8383() {
        return this.field5169 == null ? -1 : this.field5169.method5143();
    }

    @ObfuscatedName("tb.aw(B)Lku;")
    public class284 method8354() {
        return this.field5169;
    }

    @ObfuscatedName("tb.af(Lku;B)V")
    public void method8341(class284 arg0) {
        if (this.field5169 == null || this.field5169 != arg0) {
            this.method8309(arg0);
            this.method8311(-1, -1, -1);
        }
    }

    @ObfuscatedName("tb.aa(Lku;S)V")
    public void method8309(class284 arg0) {
        this.field5169 = arg0;
        this.field5205 = new class286(this.field5166, this.field5165, this.field5159, this.field5160);
        this.field5206.method8282(this.field5169 == null ? null : this.field5169.method5195());
    }

    @ObfuscatedName("tb.ah(Lku;Lnv;Lnv;ZB)V")
    public void method8310(class284 arg0, class350 arg1, class350 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field5169 == null || this.field5169 != arg0) {
            this.method8309(arg0);
        }
        if (!arg3 && this.field5169.method5166(arg1.field3706, arg1.field3705, arg1.field3704)) {
            this.method8311(arg1.field3706, arg1.field3705, arg1.field3704);
        } else {
            this.method8311(arg2.field3706, arg2.field3705, arg2.field3704);
        }
    }

    @ObfuscatedName("tb.ag(IIII)V")
    public void method8311(int arg0, int arg1, int arg2) {
        if (this.field5169 == null) {
            return;
        }
        int[] var4 = this.field5169.method5140(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field5169.method5140(this.field5169.method5178(), this.field5169.method5154(), this.field5169.method5156());
        }
        this.method8442(var4[0] - this.field5169.method5150() * 64, var4[1] - this.field5169.method5184() * 64, true);
        this.field5175 = -1;
        this.field5176 = -1;
        this.field5177 = this.method8454(this.field5169.method5149());
        this.field5178 = this.field5177;
        this.field5204 = null;
        this.field5167 = null;
        this.field5205.method5341();
    }

    @ObfuscatedName("tb.av(IIIIID)V")
    public void method8312(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5) {
        int[] var8 = new int[4];
        class559.method9143(var8);
        class559.method9119(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var9 = this.field5206.method8289();
        if (var9 < 100) {
            this.method8318(arg0, arg1, arg2, arg3, var9);
            return;
        }
        if (!this.field5205.method5347()) {
            this.field5205.method5340(this.field5158, this.field5169.method5195(), client.field601);
            if (!this.field5205.method5347()) {
                return;
            }
        }
        int var10 = this.field5205.method5348();
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
        class559.method9145(arg0, arg1, arg2, arg3, var26);
        if (this.field5186 != null) {
            this.field5188++;
            if (this.field5188 % this.field5203 == 0) {
                this.field5188 = 0;
                this.field5156++;
            }
            if (this.field5156 >= this.field5183 && !this.field5185) {
                this.field5186 = null;
            }
        }
        int var28 = (int) Math.ceil((double) ((float) arg2 / this.field5177));
        int var29 = (int) Math.ceil((double) ((float) arg3 / this.field5177));
        this.field5205.method5342(this.field5173 - var28 / 2, this.field5210 - var29 / 2, var28 / 2 + this.field5173, var29 / 2 + this.field5210, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field5201) {
            boolean var30 = false;
            if (arg4 - this.field5202 > 100) {
                this.field5202 = arg4;
                var30 = true;
            }
            this.field5205.method5352(this.field5173 - var28 / 2, this.field5210 - var29 / 2, var28 / 2 + this.field5173, var29 / 2 + this.field5210, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field5200, this.field5186, this.field5188, this.field5203, var30);
        }
        this.method8315(arg0, arg1, arg2, arg3, var28, var29);
        if (client.method5070() && this.field5208 && this.field5207 != null) {
            this.field5170.method7565("Coord: " + this.field5207, class559.field5447 + 10, class559.field5449 + 20, 16776960, -1);
        }
        this.field5179 = var28;
        this.field5180 = var29;
        this.field5164 = arg0;
        this.field5182 = arg1;
        class559.method9178(var8);
    }

    @ObfuscatedName("tb.ar(I)V")
    public void method8346() {
        class285.method4613();
    }

    @ObfuscatedName("tb.ap(IIIIIII)Z")
    public boolean method8330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field5194 == null) {
            return true;
        } else if (this.field5194.field5478 != arg0 || this.field5194.field5479 != arg1) {
            return true;
        } else if (this.field5205.field3092 != this.field5154) {
            return true;
        } else if (client.field795 != this.field5213) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("tb.ak(IIIIIIB)V")
    public void method8315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1623 == null) {
            return;
        }
        int var7 = 512 / (this.field5205.field3092 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method8328() - arg4 / 2 - var7;
        int var14 = this.method8329() - arg5 / 2 - var7;
        int var15 = arg0 - this.field5205.field3092 * (var7 + var13 - this.field5190);
        int var16 = arg1 - this.field5205.field3092 * (var7 - (var14 - this.field5212));
        if (this.method8330(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field5194 != null && this.field5194.field5478 == var11 && this.field5194.field5479 == var12) {
                Arrays.fill(this.field5194.field5481, 0);
            } else {
                this.field5194 = new class563(var11, var12);
            }
            this.field5190 = this.method8328() - arg4 / 2 - var7;
            this.field5212 = this.method8329() - arg5 / 2 - var7;
            this.field5154 = this.field5205.field3092;
            Statics.field1623.method6853(this.field5190, this.field5212, this.field5194, (float) this.field5154 / var10);
            this.field5213 = client.field795;
            var15 = arg0 - this.field5205.field3092 * (var7 + var13 - this.field5190);
            var16 = arg1 - this.field5205.field3092 * (var7 - (var14 - this.field5212));
        }
        class559.method9122(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field5194.method9264(var15, var16, 192);
        } else {
            this.field5194.method9267(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("tb.ai(IIIII)V")
    public void method8406(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field5206.method8288()) {
            return;
        }
        if (!this.field5205.method5347()) {
            this.field5205.method5340(this.field5158, this.field5169.method5195(), client.field601);
            if (!this.field5205.method5347()) {
                return;
            }
        }
        this.field5205.method5344(arg0, arg1, arg2, arg3, this.field5186, this.field5188, this.field5203);
    }

    @ObfuscatedName("tb.at(II)V")
    public void method8317(int arg0) {
        this.field5178 = this.method8454(arg0);
    }

    @ObfuscatedName("tb.az(IIIIIB)V")
    public void method8318(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class559.method9145(arg0, arg1, arg2, arg3, -16777216);
        class559.method9127(var7 - 152, var8, 304, 34, -65536);
        class559.method9145(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field5170.method7592(class380.field4202, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("tb.bg(IB)F")
    public float method8454(int arg0) {
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

    @ObfuscatedName("tb.bz(I)I")
    public int method8320() {
        if ((double) this.field5178 == 1.0D) {
            return 25;
        } else if ((double) this.field5178 == 1.5D) {
            return 37;
        } else if ((double) this.field5178 == 2.0D) {
            return 50;
        } else if ((double) this.field5178 == 3.0D) {
            return 75;
        } else if ((double) this.field5178 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("tb.bj(I)V")
    public void method8381() {
        this.field5206.method8281();
    }

    @ObfuscatedName("tb.bc(I)Z")
    public boolean method8377() {
        return this.field5206.method8288();
    }

    @ObfuscatedName("tb.bo(IB)Lku;")
    public class284 method8323(int arg0) {
        Iterator var2 = this.field5174.values().iterator();
        class284 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class284) var2.next();
        } while (var3.method5143() != arg0);
        return var3;
    }

    @ObfuscatedName("tb.bm(IIB)V")
    public void method8324(int arg0, int arg1) {
        if (this.field5169 != null && this.field5169.method5138(arg0, arg1)) {
            this.field5175 = arg0 - this.field5169.method5150() * 64;
            this.field5176 = arg1 - this.field5169.method5184() * 64;
        }
    }

    @ObfuscatedName("tb.bd(IIB)V")
    public void method8325(int arg0, int arg1) {
        if (this.field5169 != null) {
            this.method8442(arg0 - this.field5169.method5150() * 64, arg1 - this.field5169.method5184() * 64, true);
            this.field5175 = -1;
            this.field5176 = -1;
        }
    }

    @ObfuscatedName("tb.bh(IIII)V")
    public void method8438(int arg0, int arg1, int arg2) {
        if (this.field5169 != null) {
            int[] var4 = this.field5169.method5140(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8324(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tb.bx(IIII)V")
    public void method8327(int arg0, int arg1, int arg2) {
        if (this.field5169 != null) {
            int[] var4 = this.field5169.method5140(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8325(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tb.bv(I)I")
    public int method8328() {
        return this.field5169 == null ? -1 : this.field5173 + this.field5169.method5150() * 64;
    }

    @ObfuscatedName("tb.bu(I)I")
    public int method8329() {
        return this.field5169 == null ? -1 : this.field5210 + this.field5169.method5184() * 64;
    }

    @ObfuscatedName("tb.bp(I)Lnv;")
    public class350 method8343() {
        return this.field5169 == null ? null : this.field5169.method5141(this.method8328(), this.method8329());
    }

    @ObfuscatedName("tb.br(I)I")
    public int method8457() {
        return this.field5179;
    }

    @ObfuscatedName("tb.bf(I)I")
    public int method8435() {
        return this.field5180;
    }

    @ObfuscatedName("tb.bq(IB)V")
    public void method8314(int arg0) {
        if (arg0 >= 1) {
            this.field5183 = arg0;
        }
    }

    @ObfuscatedName("tb.bt(B)V")
    public void method8334() {
        this.field5183 = 3;
    }

    @ObfuscatedName("tb.bi(II)V")
    public void method8319(int arg0) {
        if (arg0 >= 1) {
            this.field5203 = arg0;
        }
    }

    @ObfuscatedName("tb.be(B)V")
    public void method8336() {
        this.field5203 = 50;
    }

    @ObfuscatedName("tb.ba(ZB)V")
    public void method8337(boolean arg0) {
        this.field5185 = arg0;
    }

    @ObfuscatedName("tb.bn(II)V")
    public void method8338(int arg0) {
        this.field5186 = new HashSet();
        this.field5186.add(arg0);
        this.field5156 = 0;
        this.field5188 = 0;
    }

    @ObfuscatedName("tb.bw(II)V")
    public void method8345(int arg0) {
        this.field5186 = new HashSet();
        this.field5156 = 0;
        this.field5188 = 0;
        for (int var2 = 0; var2 < Statics.field2466; var2++) {
            if (class235.method2700(var2) != null && class235.method2700(var2).field2487 == arg0) {
                this.field5186.add(class235.method2700(var2).field2468);
            }
        }
    }

    @ObfuscatedName("tb.bk(I)V")
    public void method8340() {
        this.field5186 = null;
    }

    @ObfuscatedName("tb.bs(ZI)V")
    public void method8440(boolean arg0) {
        this.field5201 = !arg0;
    }

    @ObfuscatedName("tb.bb(IZI)V")
    public void method8342(int arg0, boolean arg1) {
        if (arg1) {
            this.field5197.remove(arg0);
        } else {
            this.field5197.add(arg0);
        }
        this.method8443();
    }

    @ObfuscatedName("tb.by(IZI)V")
    public void method8307(int arg0, boolean arg1) {
        if (arg1) {
            this.field5198.remove(arg0);
        } else {
            this.field5198.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field2466; var3++) {
            if (class235.method2700(var3) != null && class235.method2700(var3).field2487 == arg0) {
                int var4 = class235.method2700(var3).field2468;
                if (arg1) {
                    this.field5163.remove(var4);
                } else {
                    this.field5163.add(var4);
                }
            }
        }
        this.method8443();
    }

    @ObfuscatedName("tb.bl(I)Z")
    public boolean method8344() {
        return !this.field5201;
    }

    @ObfuscatedName("tb.cx(IB)Z")
    public boolean method8313(int arg0) {
        return !this.field5197.contains(arg0);
    }

    @ObfuscatedName("tb.cu(II)Z")
    public boolean method8326(int arg0) {
        return !this.field5198.contains(arg0);
    }

    @ObfuscatedName("tb.cz(I)V")
    public void method8443() {
        this.field5200.clear();
        this.field5200.addAll(this.field5197);
        this.field5200.addAll(this.field5163);
    }

    @ObfuscatedName("tb.cm(IIIIIIB)V")
    public void method8348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field5206.method8288()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field5177));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field5177));
        List var9 = this.field5205.method5345(this.field5173 - var7 / 2 - 1, this.field5210 - var8 / 2 - 1, var7 / 2 + this.field5173 + 1, var8 / 2 + this.field5210 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class302 var11 = (class302) var10.next();
            class235 var12 = class235.method2700(var11.method5108());
            var13 = false;
            for (int var14 = this.field5187.length - 1; var14 >= 0; var14--) {
                if (var12.field2485[var14] != null) {
                    client.method2879(var12.field2485[var14], var12.field2482, this.field5187[var14], var11.method5108(), var11.field3209.method5935(), var11.field3211.method5935());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("tb.ct(ILnv;B)Lnv;")
    public class350 method8424(int arg0, class350 arg1) {
        if (!this.field5206.method8288()) {
            return null;
        } else if (!this.field5205.method5347()) {
            return null;
        } else if (this.field5169.method5138(arg1.field3705, arg1.field3704)) {
            HashMap var3 = this.field5205.method5349();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class302 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class302 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3211;
                    }
                    var8 = (class302) var7.next();
                    int var9 = var8.field3211.field3705 - arg1.field3705;
                    int var10 = var8.field3211.field3704 - arg1.field3704;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3211;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("tb.cl(IILnv;Lnv;I)V")
    public void method8350(int arg0, int arg1, class350 arg2, class350 arg3) {
        class90 var5 = new class90();
        class307 var6 = new class307(arg1, arg2, arg3);
        var5.method2325(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2326(10);
                break;
            case 1009:
                var5.method2326(11);
                break;
            case 1010:
                var5.method2326(12);
                break;
            case 1011:
                var5.method2326(13);
                break;
            case 1012:
                var5.method2326(14);
        }
        class73.method7183(var5);
    }

    @ObfuscatedName("tb.cb(B)Lla;")
    public class302 method8351() {
        if (!this.field5206.method8288()) {
            return null;
        } else if (this.field5205.method5347()) {
            HashMap var1 = this.field5205.method5349();
            this.field5204 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field5204.addAll(var3);
            }
            this.field5167 = this.field5204.iterator();
            return this.method8352();
        } else {
            return null;
        }
    }

    @ObfuscatedName("tb.cr(I)Lla;")
    public class302 method8352() {
        if (this.field5167 == null) {
            return null;
        }
        class302 var1;
        do {
            if (!this.field5167.hasNext()) {
                return null;
            }
            var1 = (class302) this.field5167.next();
        } while (var1.method5108() == -1);
        return var1;
    }
}
