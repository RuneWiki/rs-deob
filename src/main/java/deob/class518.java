package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("tu")
public class class518 {

    @ObfuscatedName("tu.af")
    public class391 field5226;

    @ObfuscatedName("tu.at")
    public class391 field5193;

    @ObfuscatedName("tu.au")
    public class391 field5238;

    @ObfuscatedName("tu.ar")
    public static final class520 field5190 = class520.field5257;

    @ObfuscatedName("tu.al")
    public static final class520 field5196 = class520.field5258;

    @ObfuscatedName("tu.ad")
    public static final class520 field5197 = class520.field5259;

    @ObfuscatedName("tu.ah")
    public class435 field5198;

    @ObfuscatedName("tu.ap")
    public HashMap field5199;

    @ObfuscatedName("tu.ab")
    public class564[] field5200;

    @ObfuscatedName("tu.az")
    public HashMap field5201;

    @ObfuscatedName("tu.aa")
    public class286 field5202;

    @ObfuscatedName("tu.ai")
    public class286 field5203;

    @ObfuscatedName("tu.ao")
    public class286 field5204;

    @ObfuscatedName("tu.as")
    public class288 field5195;

    @ObfuscatedName("tu.ay")
    public class517 field5219;

    @ObfuscatedName("tu.aj")
    public int field5207;

    @ObfuscatedName("tu.av")
    public int field5212;

    @ObfuscatedName("tu.aw")
    public int field5209 = -1;

    @ObfuscatedName("tu.an")
    public int field5242 = -1;

    @ObfuscatedName("tu.ak")
    public float field5192;

    @ObfuscatedName("tu.bn")
    public float field5218;

    @ObfuscatedName("tu.bh")
    public int field5213 = -1;

    @ObfuscatedName("tu.bd")
    public int field5214 = -1;

    @ObfuscatedName("tu.bx")
    public int field5205 = -1;

    @ObfuscatedName("tu.bf")
    public int field5216 = -1;

    @ObfuscatedName("tu.bm")
    public int field5210 = 3;

    @ObfuscatedName("tu.bs")
    public int field5230 = 50;

    @ObfuscatedName("tu.bw")
    public boolean field5246 = false;

    @ObfuscatedName("tu.ba")
    public HashSet field5220 = null;

    @ObfuscatedName("tu.bj")
    public int field5221 = -1;

    @ObfuscatedName("tu.bp")
    public int field5222 = -1;

    @ObfuscatedName("tu.by")
    public int field5223 = -1;

    @ObfuscatedName("tu.bb")
    public int field5224 = -1;

    @ObfuscatedName("tu.bi")
    public int field5194 = -1;

    @ObfuscatedName("tu.bg")
    public int field5236 = -1;

    @ObfuscatedName("tu.bl")
    public long field5227;

    @ObfuscatedName("tu.bz")
    public int field5228;

    @ObfuscatedName("tu.bu")
    public int field5229;

    @ObfuscatedName("tu.br")
    public boolean field5243 = true;

    @ObfuscatedName("tu.bt")
    public HashSet field5231 = new HashSet();

    @ObfuscatedName("tu.bq")
    public HashSet field5232 = new HashSet();

    @ObfuscatedName("tu.bk")
    public HashSet field5233 = new HashSet();

    @ObfuscatedName("tu.be")
    public HashSet field5234 = new HashSet();

    @ObfuscatedName("tu.bc")
    public boolean field5235 = false;

    @ObfuscatedName("tu.cn")
    public int field5225 = 0;

    @ObfuscatedName("tu.cf")
    public final int[] field5191 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("tu.cu")
    public List field5239;

    @ObfuscatedName("tu.cm")
    public Iterator field5240;

    @ObfuscatedName("tu.cj")
    public HashSet field5241 = new HashSet();

    @ObfuscatedName("tu.cx")
    public class352 field5189 = null;

    @ObfuscatedName("tu.ci")
    public boolean field5211 = false;

    @ObfuscatedName("tu.cy")
    public class565 field5244;

    @ObfuscatedName("tu.co")
    public int field5245;

    @ObfuscatedName("tu.cv")
    public int field5215 = -1;

    @ObfuscatedName("tu.cg")
    public int field5247 = -1;

    @ObfuscatedName("tu.ct")
    public int field5248 = -1;

    @ObfuscatedName("tu.ac(Lpo;Lpo;Lpo;Lqu;Ljava/util/HashMap;[Lvt;B)V")
    public void method8472(class391 arg0, class391 arg1, class391 arg2, class435 arg3, HashMap arg4, class564[] arg5) {
        this.field5200 = arg5;
        this.field5226 = arg0;
        this.field5193 = arg1;
        this.field5238 = arg2;
        this.field5198 = arg3;
        this.field5199 = new HashMap();
        this.field5199.put(class283.field3078, arg4.get(field5190));
        this.field5199.put(class283.field3074, arg4.get(field5196));
        this.field5199.put(class283.field3075, arg4.get(field5197));
        this.field5219 = new class517(arg0);
        int var7 = this.field5226.method6797(class305.field3262.field3261);
        int[] var8 = this.field5226.method6808(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field5201 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class551 var11 = new class551(this.field5226.method6782(var7, var8[var10]));
            class286 var12 = new class286();
            var12.method5291(var11, var8[var10]);
            this.field5201.put(var12.method5304(), var12);
            if (var12.method5299()) {
                this.field5202 = var12;
            }
        }
        this.method8604(this.field5202);
        this.field5204 = null;
    }

    @ObfuscatedName("tu.ae(I)V")
    public void method8431() {
        class287.method10();
    }

    @ObfuscatedName("tu.ag(IIZIIIII)V")
    public void method8432(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field5219.method8420()) {
            return;
        }
        this.method8435();
        this.method8454();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field5192));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field5192));
        List var10 = this.field5195.method5522(this.field5207 - var8 / 2 - 1, this.field5212 - var9 / 2 - 1, var8 / 2 + this.field5207 + 1, var9 / 2 + this.field5212 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class304 var13 = (class304) var12.next();
            var11.add(var13);
            class91 var14 = new class91();
            class309 var15 = new class309(var13.method5246(), var13.field3254, var13.field3256);
            var14.method2403(new Object[] { var15, arg0, arg1 });
            if (this.field5241.contains(var13)) {
                var14.method2402(17);
            } else {
                var14.method2402(15);
            }
            Statics.method4025(var14);
        }
        Iterator var16 = this.field5241.iterator();
        while (var16.hasNext()) {
            class304 var17 = (class304) var16.next();
            if (!var11.contains(var17)) {
                class91 var18 = new class91();
                class309 var19 = new class309(var17.method5246(), var17.field3254, var17.field3256);
                var18.method2403(new Object[] { var19, arg0, arg1 });
                var18.method2402(16);
                Statics.method4025(var18);
            }
        }
        this.field5241 = var11;
    }

    @ObfuscatedName("tu.am(IIZZI)V")
    public void method8433(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class331.method3482();
        this.method8490(arg0, arg1, arg3, var5);
        if (this.method8439() || !(arg3 || arg2) || client.method2511()) {
            this.method8438();
        } else {
            if (arg3) {
                this.field5194 = arg0;
                this.field5236 = arg1;
                this.field5223 = this.field5207;
                this.field5224 = this.field5212;
            }
            if (this.field5223 != -1) {
                int var7 = arg0 - this.field5194;
                int var8 = arg1 - this.field5236;
                this.method8509(this.field5223 - (int) ((float) var7 / this.field5218), this.field5224 + (int) ((float) var8 / this.field5218), false);
            }
        }
        if (arg3) {
            this.field5227 = var5;
            this.field5228 = arg0;
            this.field5229 = arg1;
        }
    }

    @ObfuscatedName("tu.ax(IIZJ)V")
    public void method8490(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field5203 == null) {
            this.field5189 = null;
            return;
        }
        int var6 = (int) ((float) this.field5207 + ((float) (arg0 - this.field5205) - (float) this.method8489() * this.field5192 / 2.0F) / this.field5192);
        int var7 = (int) ((float) this.field5212 - ((float) (arg1 - this.field5216) - (float) this.method8469() * this.field5192 / 2.0F) / this.field5192);
        this.field5189 = this.field5203.method5296(var6 + this.field5203.method5305() * 64, var7 + this.field5203.method5309() * 64);
        if (this.field5189 == null || !arg2) {
            return;
        }
        class270 var8 = client.field664;
        if (client.method2399() && var8.method5077(82) && var8.method5077(81)) {
            client.method8836(this.field5189.field3754, this.field5189.field3756, this.field5189.field3755, false);
            return;
        }
        boolean var10 = true;
        if (this.field5243) {
            int var11 = arg0 - this.field5228;
            int var12 = arg1 - this.field5229;
            if (arg3 - this.field5227 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                var10 = false;
            }
        }
        if (var10) {
            class326 var13 = class326.method3199(class324.field3402, client.field582.field1486);
            var13.field3426.method8960(this.field5189.method6079());
            client.field582.method2943(var13);
            this.field5227 = 0L;
        }
    }

    @ObfuscatedName("tu.aq(B)V")
    public void method8435() {
        if (Statics.field4543 != null) {
            this.field5192 = this.field5218;
            return;
        }
        if (this.field5192 < this.field5218) {
            this.field5192 = Math.min(this.field5218, this.field5192 / 30.0F + this.field5192);
        }
        if (this.field5192 > this.field5218) {
            this.field5192 = Math.max(this.field5218, this.field5192 - this.field5192 / 30.0F);
        }
    }

    @ObfuscatedName("tu.af(I)V")
    public void method8454() {
        if (!this.method8439()) {
            return;
        }
        int var1 = this.field5209 - this.field5207;
        int var2 = this.field5242 - this.field5212;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method8509(this.field5207 + var1, this.field5212 + var2, true);
        if (this.field5209 == this.field5207 && this.field5242 == this.field5212) {
            this.field5209 = -1;
            this.field5242 = -1;
        }
    }

    @ObfuscatedName("tu.at(IIZB)V")
    public final void method8509(int arg0, int arg1, boolean arg2) {
        this.field5207 = arg0;
        this.field5212 = arg1;
        class331.method3482();
        if (arg2) {
            this.method8438();
        }
    }

    @ObfuscatedName("tu.au(B)V")
    public final void method8438() {
        this.field5236 = -1;
        this.field5194 = -1;
        this.field5224 = -1;
        this.field5223 = -1;
    }

    @ObfuscatedName("tu.ar(I)Z")
    public boolean method8439() {
        return this.field5209 != -1 && this.field5242 != -1;
    }

    @ObfuscatedName("tu.al(IIII)Lky;")
    public class286 method8440(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field5201.values().iterator();
        class286 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class286) var4.next();
        } while (!var5.method5293(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("tu.ad(IIIZI)V")
    public void method8429(int arg0, int arg1, int arg2, boolean arg3) {
        class286 var5 = this.method8440(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field5202;
        }
        boolean var6 = false;
        if (this.field5204 != var5 || arg3) {
            this.field5204 = var5;
            this.method8604(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method8548(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("tu.ah(II)V")
    public void method8537(int arg0) {
        class286 var2 = this.method8460(arg0);
        if (var2 != null) {
            this.method8604(var2);
        }
    }

    @ObfuscatedName("tu.ap(I)I")
    public int method8443() {
        return this.field5203 == null ? -1 : this.field5203.method5298();
    }

    @ObfuscatedName("tu.ab(I)Lky;")
    public class286 method8444() {
        return this.field5203;
    }

    @ObfuscatedName("tu.az(Lky;I)V")
    public void method8604(class286 arg0) {
        if (this.field5203 == null || this.field5203 != arg0) {
            this.method8446(arg0);
            this.method8548(-1, -1, -1);
        }
    }

    @ObfuscatedName("tu.aa(Lky;I)V")
    public void method8446(class286 arg0) {
        this.field5203 = arg0;
        this.field5195 = new class288(this.field5200, this.field5199, this.field5193, this.field5238);
        this.field5219.method8425(this.field5203 == null ? null : this.field5203.method5304());
    }

    @ObfuscatedName("tu.ai(Lky;Lnm;Lnm;ZB)V")
    public void method8487(class286 arg0, class352 arg1, class352 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field5203 == null || this.field5203 != arg0) {
            this.method8446(arg0);
        }
        if (!arg3 && this.field5203.method5293(arg1.field3755, arg1.field3754, arg1.field3756)) {
            this.method8548(arg1.field3755, arg1.field3754, arg1.field3756);
        } else {
            this.method8548(arg2.field3755, arg2.field3754, arg2.field3756);
        }
    }

    @ObfuscatedName("tu.ao(IIII)V")
    public void method8548(int arg0, int arg1, int arg2) {
        if (this.field5203 == null) {
            return;
        }
        int[] var4 = this.field5203.method5301(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field5203.method5301(this.field5203.method5310(), this.field5203.method5320(), this.field5203.method5322());
        }
        this.method8509(var4[0] - this.field5203.method5305() * 64, var4[1] - this.field5203.method5309() * 64, true);
        this.field5209 = -1;
        this.field5242 = -1;
        this.field5192 = this.method8513(this.field5203.method5348());
        this.field5218 = this.field5192;
        this.field5239 = null;
        this.field5240 = null;
        this.field5195.method5485();
    }

    @ObfuscatedName("tu.as(IIIIID)V")
    public void method8609(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5) {
        int[] var8 = new int[4];
        class561.method9296(var8);
        class561.method9294(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var9 = this.field5219.method8422();
        if (var9 < 100) {
            this.method8455(arg0, arg1, arg2, arg3, var9);
            return;
        }
        if (!this.field5195.method5490()) {
            this.field5195.method5484(this.field5226, this.field5203.method5304(), client.field640);
            if (!this.field5195.method5490()) {
                return;
            }
        }
        int var10 = this.field5195.method5491();
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
        class561.method9302(arg0, arg1, arg2, arg3, var26);
        if (this.field5220 != null) {
            this.field5222++;
            if (this.field5222 % this.field5230 == 0) {
                this.field5222 = 0;
                this.field5221++;
            }
            if (this.field5221 >= this.field5210 && !this.field5246) {
                this.field5220 = null;
            }
        }
        int var28 = (int) Math.ceil((double) ((float) arg2 / this.field5192));
        int var29 = (int) Math.ceil((double) ((float) arg3 / this.field5192));
        double var30 = class240.method4332();
        this.field5195.method5486(this.field5207 - var28 / 2, this.field5212 - var29 / 2, var28 / 2 + this.field5207, var29 / 2 + this.field5212, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field5235) {
            boolean var32 = false;
            if (arg4 - this.field5225 > 100) {
                this.field5225 = arg4;
                var32 = true;
            }
            this.field5195.method5487(this.field5207 - var28 / 2, this.field5212 - var29 / 2, var28 / 2 + this.field5207, var29 / 2 + this.field5212, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field5234, this.field5220, this.field5222, this.field5230, var32);
        }
        this.method8551(arg0, arg1, arg2, arg3, var28, var29);
        if (client.method2399() && this.field5211 && this.field5189 != null) {
            this.field5198.method7662("Coord: " + this.field5189, class561.field5486 + 10, class561.field5482 + 20, 16776960, -1);
        }
        this.field5213 = var28;
        this.field5214 = var29;
        this.field5205 = arg0;
        this.field5216 = arg1;
        class561.method9293(var8);
        if (var30 != class240.method4332()) {
            class240.method4329(var30);
        }
    }

    @ObfuscatedName("tu.ay(I)V")
    public void method8450() {
        class287.method280();
    }

    @ObfuscatedName("tu.aj(IIIIIIB)Z")
    public boolean method8451(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field5244 == null) {
            return true;
        } else if (this.field5244.field5518 != arg0 || this.field5244.field5511 != arg1) {
            return true;
        } else if (this.field5195.field3141 != this.field5245) {
            return true;
        } else if (client.field809 != this.field5248) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("tu.av(IIIIIIB)V")
    public void method8551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field4543 == null) {
            return;
        }
        int var7 = 512 / (this.field5195.field3141 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method8465() - arg4 / 2 - var7;
        int var14 = this.method8448() - arg5 / 2 - var7;
        int var15 = arg0 - this.field5195.field3141 * (var7 + var13 - this.field5215);
        int var16 = arg1 - this.field5195.field3141 * (var7 - (var14 - this.field5247));
        if (this.method8451(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field5244 != null && this.field5244.field5518 == var11 && this.field5244.field5511 == var12) {
                Arrays.fill(this.field5244.field5513, 0);
            } else {
                this.field5244 = new class565(var11, var12);
            }
            this.field5215 = this.method8465() - arg4 / 2 - var7;
            this.field5247 = this.method8448() - arg5 / 2 - var7;
            this.field5245 = this.field5195.field3141;
            Statics.field4543.method6983(this.field5215, this.field5247, this.field5244, (float) this.field5245 / var10);
            this.field5248 = client.field809;
            var15 = arg0 - this.field5195.field3141 * (var7 + var13 - this.field5215);
            var16 = arg1 - this.field5195.field3141 * (var7 - (var14 - this.field5247));
        }
        class561.method9301(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field5244.method9408(var15, var16, 192);
        } else {
            this.field5244.method9435(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("tu.aw(IIIII)V")
    public void method8531(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field5219.method8420()) {
            return;
        }
        if (!this.field5195.method5490()) {
            this.field5195.method5484(this.field5226, this.field5203.method5304(), client.field640);
            if (!this.field5195.method5490()) {
                return;
            }
        }
        this.field5195.method5511(arg0, arg1, arg2, arg3, this.field5220, this.field5222, this.field5230);
    }

    @ObfuscatedName("tu.an(IB)V")
    public void method8625(int arg0) {
        this.field5218 = this.method8513(arg0);
    }

    @ObfuscatedName("tu.ak(IIIIII)V")
    public void method8455(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class561.method9302(arg0, arg1, arg2, arg3, -16777216);
        class561.method9306(var7 - 152, var8, 304, 34, -65536);
        class561.method9302(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field5198.method7758(class382.field4410, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("tu.bn(IB)F")
    public float method8513(int arg0) {
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

    @ObfuscatedName("tu.bh(I)I")
    public int method8457() {
        if ((double) this.field5218 == 1.0D) {
            return 25;
        } else if ((double) this.field5218 == 1.5D) {
            return 37;
        } else if ((double) this.field5218 == 2.0D) {
            return 50;
        } else if ((double) this.field5218 == 3.0D) {
            return 75;
        } else if ((double) this.field5218 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("tu.bd(I)V")
    public void method8458() {
        this.field5219.method8419();
    }

    @ObfuscatedName("tu.bx(I)Z")
    public boolean method8459() {
        return this.field5219.method8420();
    }

    @ObfuscatedName("tu.bf(II)Lky;")
    public class286 method8460(int arg0) {
        Iterator var2 = this.field5201.values().iterator();
        class286 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class286) var2.next();
        } while (var3.method5298() != arg0);
        return var3;
    }

    @ObfuscatedName("tu.bm(III)V")
    public void method8620(int arg0, int arg1) {
        if (this.field5203 != null && this.field5203.method5294(arg0, arg1)) {
            this.field5209 = arg0 - this.field5203.method5305() * 64;
            this.field5242 = arg1 - this.field5203.method5309() * 64;
        }
    }

    @ObfuscatedName("tu.bs(III)V")
    public void method8462(int arg0, int arg1) {
        if (this.field5203 != null) {
            this.method8509(arg0 - this.field5203.method5305() * 64, arg1 - this.field5203.method5309() * 64, true);
            this.field5209 = -1;
            this.field5242 = -1;
        }
    }

    @ObfuscatedName("tu.bw(IIIB)V")
    public void method8463(int arg0, int arg1, int arg2) {
        if (this.field5203 != null) {
            int[] var4 = this.field5203.method5301(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8620(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tu.ba(IIIB)V")
    public void method8464(int arg0, int arg1, int arg2) {
        if (this.field5203 != null) {
            int[] var4 = this.field5203.method5301(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8462(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tu.bj(I)I")
    public int method8465() {
        return this.field5203 == null ? -1 : this.field5207 + this.field5203.method5305() * 64;
    }

    @ObfuscatedName("tu.bp(I)I")
    public int method8448() {
        return this.field5203 == null ? -1 : this.field5212 + this.field5203.method5309() * 64;
    }

    @ObfuscatedName("tu.by(I)Lnm;")
    public class352 method8467() {
        return this.field5203 == null ? null : this.field5203.method5296(this.method8465(), this.method8448());
    }

    @ObfuscatedName("tu.bb(B)I")
    public int method8489() {
        return this.field5213;
    }

    @ObfuscatedName("tu.bi(S)I")
    public int method8469() {
        return this.field5214;
    }

    @ObfuscatedName("tu.bg(II)V")
    public void method8532(int arg0) {
        if (arg0 >= 1) {
            this.field5210 = arg0;
        }
    }

    @ObfuscatedName("tu.bl(S)V")
    public void method8471() {
        this.field5210 = 3;
    }

    @ObfuscatedName("tu.bz(II)V")
    public void method8570(int arg0) {
        if (arg0 >= 1) {
            this.field5230 = arg0;
        }
    }

    @ObfuscatedName("tu.bu(B)V")
    public void method8473() {
        this.field5230 = 50;
    }

    @ObfuscatedName("tu.br(ZI)V")
    public void method8474(boolean arg0) {
        this.field5246 = arg0;
    }

    @ObfuscatedName("tu.bo(IS)V")
    public void method8475(int arg0) {
        this.field5220 = new HashSet();
        this.field5220.add(arg0);
        this.field5221 = 0;
        this.field5222 = 0;
    }

    @ObfuscatedName("tu.bv(IS)V")
    public void method8494(int arg0) {
        this.field5220 = new HashSet();
        this.field5221 = 0;
        this.field5222 = 0;
        for (int var2 = 0; var2 < Statics.field4937; var2++) {
            if (class184.method3200(var2) != null && class184.method3200(var2).field1908 == arg0) {
                this.field5220.add(class184.method3200(var2).field1901);
            }
        }
    }

    @ObfuscatedName("tu.bt(I)V")
    public void method8477() {
        this.field5220 = null;
    }

    @ObfuscatedName("tu.bq(ZB)V")
    public void method8478(boolean arg0) {
        this.field5235 = !arg0;
    }

    @ObfuscatedName("tu.bk(IZI)V")
    public void method8479(int arg0, boolean arg1) {
        if (arg1) {
            this.field5231.remove(arg0);
        } else {
            this.field5231.add(arg0);
        }
        this.method8484();
    }

    @ObfuscatedName("tu.be(IZB)V")
    public void method8480(int arg0, boolean arg1) {
        if (arg1) {
            this.field5232.remove(arg0);
        } else {
            this.field5232.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field4937; var3++) {
            if (class184.method3200(var3) != null && class184.method3200(var3).field1908 == arg0) {
                int var4 = class184.method3200(var3).field1901;
                if (arg1) {
                    this.field5233.remove(var4);
                } else {
                    this.field5233.add(var4);
                }
            }
        }
        this.method8484();
    }

    @ObfuscatedName("tu.bc(I)Z")
    public boolean method8452() {
        return !this.field5235;
    }

    @ObfuscatedName("tu.cn(II)Z")
    public boolean method8581(int arg0) {
        return !this.field5231.contains(arg0);
    }

    @ObfuscatedName("tu.ch(II)Z")
    public boolean method8483(int arg0) {
        return !this.field5232.contains(arg0);
    }

    @ObfuscatedName("tu.cf(I)V")
    public void method8484() {
        this.field5234.clear();
        this.field5234.addAll(this.field5231);
        this.field5234.addAll(this.field5233);
    }

    @ObfuscatedName("tu.cu(IIIIIIB)V")
    public void method8485(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field5219.method8420()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field5192));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field5192));
        List var9 = this.field5195.method5522(this.field5207 - var7 / 2 - 1, this.field5212 - var8 / 2 - 1, var7 / 2 + this.field5207 + 1, var8 / 2 + this.field5212 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class304 var11 = (class304) var10.next();
            class184 var12 = class184.method3200(var11.method5246());
            var13 = false;
            for (int var14 = this.field5191.length - 1; var14 >= 0; var14--) {
                if (var12.field1909[var14] != null) {
                    client.method4789(var12.field1909[var14], var12.field1912, this.field5191[var14], var11.method5246(), var11.field3254.method6079(), var11.field3256.method6079());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("tu.cm(ILnm;I)Lnm;")
    public class352 method8482(int arg0, class352 arg1) {
        if (!this.field5219.method8420()) {
            return null;
        } else if (!this.field5195.method5490()) {
            return null;
        } else if (this.field5203.method5294(arg1.field3754, arg1.field3756)) {
            HashMap var3 = this.field5195.method5492();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class304 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class304 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3256;
                    }
                    var8 = (class304) var7.next();
                    int var9 = var8.field3256.field3754 - arg1.field3754;
                    int var10 = var8.field3256.field3756 - arg1.field3756;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3256;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("tu.cj(IILnm;Lnm;I)V")
    public void method8436(int arg0, int arg1, class352 arg2, class352 arg3) {
        class91 var5 = new class91();
        class309 var6 = new class309(arg1, arg2, arg3);
        var5.method2403(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2402(10);
                break;
            case 1009:
                var5.method2402(11);
                break;
            case 1010:
                var5.method2402(12);
                break;
            case 1011:
                var5.method2402(13);
                break;
            case 1012:
                var5.method2402(14);
        }
        Statics.method4025(var5);
    }

    @ObfuscatedName("tu.cx(B)Lly;")
    public class304 method8556() {
        if (!this.field5219.method8420()) {
            return null;
        } else if (this.field5195.method5490()) {
            HashMap var1 = this.field5195.method5492();
            this.field5239 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field5239.addAll(var3);
            }
            this.field5240 = this.field5239.iterator();
            return this.method8528();
        } else {
            return null;
        }
    }

    @ObfuscatedName("tu.ci(I)Lly;")
    public class304 method8528() {
        if (this.field5240 == null) {
            return null;
        }
        class304 var1;
        do {
            if (!this.field5240.hasNext()) {
                return null;
            }
            var1 = (class304) this.field5240.next();
        } while (var1.method5246() == -1);
        return var1;
    }
}
