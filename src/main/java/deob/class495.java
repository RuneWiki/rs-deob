package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("tn")
public class class495 {

    @ObfuscatedName("tn.aa")
    public class371 field4929;

    @ObfuscatedName("tn.ac")
    public class371 field4930;

    @ObfuscatedName("tn.al")
    public class371 field4931;

    @ObfuscatedName("tn.az")
    public static final class497 field4932 = class497.field4992;

    @ObfuscatedName("tn.ap")
    public static final class497 field4933 = class497.field4993;

    @ObfuscatedName("tn.av")
    public static final class497 field4934 = class497.field4994;

    @ObfuscatedName("tn.ax")
    public class406 field4935;

    @ObfuscatedName("tn.as")
    public HashMap field4956;

    @ObfuscatedName("tn.ay")
    public class540[] field4936;

    @ObfuscatedName("tn.ak")
    public HashMap field4938;

    @ObfuscatedName("tn.aj")
    public class237 field4939;

    @ObfuscatedName("tn.am")
    public class237 field4978;

    @ObfuscatedName("tn.aq")
    public class237 field4982;

    @ObfuscatedName("tn.ai")
    public class239 field4942;

    @ObfuscatedName("tn.aw")
    public class494 field4943;

    @ObfuscatedName("tn.ae")
    public int field4925;

    @ObfuscatedName("tn.an")
    public int field4965;

    @ObfuscatedName("tn.ag")
    public int field4946 = -1;

    @ObfuscatedName("tn.ad")
    public int field4941 = -1;

    @ObfuscatedName("tn.af")
    public float field4948;

    @ObfuscatedName("tn.be")
    public float field4949;

    @ObfuscatedName("tn.bd")
    public int field4961 = -1;

    @ObfuscatedName("tn.bl")
    public int field4951 = -1;

    @ObfuscatedName("tn.bi")
    public int field4952 = -1;

    @ObfuscatedName("tn.bv")
    public int field4947 = -1;

    @ObfuscatedName("tn.bf")
    public int field4954 = 3;

    @ObfuscatedName("tn.bg")
    public int field4955 = 50;

    @ObfuscatedName("tn.ba")
    public boolean field4926 = false;

    @ObfuscatedName("tn.bm")
    public HashSet field4957 = null;

    @ObfuscatedName("tn.bp")
    public int field4958 = -1;

    @ObfuscatedName("tn.bw")
    public int field4959 = -1;

    @ObfuscatedName("tn.bj")
    public int field4945 = -1;

    @ObfuscatedName("tn.bn")
    public int field4960 = -1;

    @ObfuscatedName("tn.bo")
    public int field4980 = -1;

    @ObfuscatedName("tn.bt")
    public int field4963 = -1;

    @ObfuscatedName("tn.bu")
    public long field4964;

    @ObfuscatedName("tn.by")
    public int field4940;

    @ObfuscatedName("tn.bh")
    public int field4966;

    @ObfuscatedName("tn.bz")
    public boolean field4969 = true;

    @ObfuscatedName("tn.bx")
    public HashSet field4968 = new HashSet();

    @ObfuscatedName("tn.bb")
    public HashSet field4967 = new HashSet();

    @ObfuscatedName("tn.bk")
    public HashSet field4970 = new HashSet();

    @ObfuscatedName("tn.br")
    public HashSet field4944 = new HashSet();

    @ObfuscatedName("tn.bq")
    public boolean field4972 = false;

    @ObfuscatedName("tn.cf")
    public int field4973 = 0;

    @ObfuscatedName("tn.cv")
    public final int[] field4974 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("tn.cx")
    public List field4975;

    @ObfuscatedName("tn.cp")
    public Iterator field4962;

    @ObfuscatedName("tn.ce")
    public HashSet field4977 = new HashSet();

    @ObfuscatedName("tn.ci")
    public class334 field4971 = null;

    @ObfuscatedName("tn.ct")
    public boolean field4979 = false;

    @ObfuscatedName("tn.cw")
    public class541 field4928;

    @ObfuscatedName("tn.cq")
    public int field4976;

    @ObfuscatedName("tn.cl")
    public int field4937 = -1;

    @ObfuscatedName("tn.cs")
    public int field4983 = -1;

    @ObfuscatedName("tn.co")
    public int field4984 = -1;

    @ObfuscatedName("tn.at(Lol;Lol;Lol;Lpf;Ljava/util/HashMap;[Lup;I)V")
    public void method7896(class371 arg0, class371 arg1, class371 arg2, class406 arg3, HashMap arg4, class540[] arg5) {
        this.field4936 = arg5;
        this.field4929 = arg0;
        this.field4930 = arg1;
        this.field4931 = arg2;
        this.field4935 = arg3;
        this.field4956 = new HashMap();
        this.field4956.put(class234.field2440, arg4.get(field4932));
        this.field4956.put(class234.field2436, arg4.get(field4933));
        this.field4956.put(class234.field2435, arg4.get(field4934));
        this.field4943 = new class494(arg0);
        int var7 = this.field4929.method6300(class256.field2634.field2628);
        int[] var8 = this.field4929.method6295(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field4938 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class527 var11 = new class527(this.field4929.method6284(var7, var8[var10]));
            class237 var12 = new class237();
            var12.method4170(var11, var8[var10], client.field493 >= 217);
            this.field4938.put(var12.method4244(), var12);
            if (var12.method4178()) {
                this.field4939 = var12;
            }
        }
        this.method7911(this.field4939);
        this.field4982 = null;
    }

    @ObfuscatedName("tn.ah(I)V")
    public void method7897() {
        class238.field2476.method5267(5);
    }

    @ObfuscatedName("tn.ar(IIZIIIII)V")
    public void method8011(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4943.method7879()) {
            return;
        }
        this.method7910();
        this.method7902();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4948));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4948));
        List var10 = this.field4942.method4387(this.field4925 - var8 / 2 - 1, this.field4965 - var9 / 2 - 1, var8 / 2 + this.field4925 + 1, var9 / 2 + this.field4965 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class255 var13 = (class255) var12.next();
            var11.add(var13);
            class88 var14 = new class88();
            class260 var15 = new class260(var13.method4123(), var13.field2624, var13.field2623);
            var14.method2239(new Object[] { var15, arg0, arg1 });
            if (this.field4977.contains(var13)) {
                var14.method2247(17);
            } else {
                var14.method2247(15);
            }
            class71.method3152(var14);
        }
        Iterator var16 = this.field4977.iterator();
        while (var16.hasNext()) {
            class255 var17 = (class255) var16.next();
            if (!var11.contains(var17)) {
                class88 var18 = new class88();
                class260 var19 = new class260(var17.method4123(), var17.field2624, var17.field2623);
                var18.method2239(new Object[] { var19, arg0, arg1 });
                var18.method2247(16);
                class71.method3152(var18);
            }
        }
        this.field4977 = var11;
    }

    @ObfuscatedName("tn.ao(IIZZS)V")
    public void method7899(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class313.method3460();
        this.method7900(arg0, arg1, arg3, var5);
        if (this.method8088() || !(arg3 || arg2) || client.method5325()) {
            this.method8018();
        } else {
            if (arg3) {
                this.field4980 = arg0;
                this.field4963 = arg1;
                this.field4945 = this.field4925;
                this.field4960 = this.field4965;
            }
            if (this.field4945 != -1) {
                int var7 = arg0 - this.field4980;
                int var8 = arg1 - this.field4963;
                this.method7903(this.field4945 - (int) ((float) var7 / this.field4949), this.field4960 + (int) ((float) var8 / this.field4949), false);
            }
        }
        if (arg3) {
            this.field4964 = var5;
            this.field4940 = arg0;
            this.field4966 = arg1;
        }
    }

    @ObfuscatedName("tn.ab(IIZJ)V")
    public void method7900(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4978 == null) {
            this.field4971 = null;
            return;
        }
        int var6 = (int) ((float) this.field4925 + ((float) (arg0 - this.field4952) - (float) this.method7933() * this.field4948 / 2.0F) / this.field4948);
        int var7 = (int) ((float) this.field4965 - ((float) (arg1 - this.field4947) - (float) this.method8034() * this.field4948 / 2.0F) / this.field4948);
        this.field4971 = this.field4978.method4175(var6 + this.field4978.method4246() * 64, var7 + this.field4978.method4185() * 64);
        if (this.field4971 == null || !arg2) {
            return;
        }
        class224 var8 = client.field725;
        boolean var10 = client.field567 >= 2;
        if (var10 && var8.method3952(82) && var8.method3952(81)) {
            int var11 = this.field4971.field3561;
            int var12 = this.field4971.field3563;
            int var13 = this.field4971.field3562;
            class308 var14 = class308.method2768(class306.field3224, client.field590.field1405);
            var14.field3243.method8396(0);
            var14.field3243.method8450(var11);
            var14.field3243.method8450(var12);
            var14.field3243.method8393(var13);
            client.field590.method2719(var14);
            return;
        }
        boolean var15 = true;
        if (this.field4969) {
            int var16 = arg0 - this.field4940;
            int var17 = arg1 - this.field4966;
            if (arg3 - this.field4964 > 500L || var16 < -25 || var16 > 25 || var17 < -25 || var17 > 25) {
                var15 = false;
            }
        }
        if (var15) {
            class308 var18 = class308.method2768(class306.field3139, client.field590.field1405);
            var18.field3243.method8461(this.field4971.method5617());
            client.field590.method2719(var18);
            this.field4964 = 0L;
        }
    }

    @ObfuscatedName("tn.au(I)V")
    public void method7910() {
        if (Statics.field3457 != null) {
            this.field4948 = this.field4949;
            return;
        }
        if (this.field4948 < this.field4949) {
            this.field4948 = Math.min(this.field4949, this.field4948 / 30.0F + this.field4948);
        }
        if (this.field4948 > this.field4949) {
            this.field4948 = Math.max(this.field4949, this.field4948 - this.field4948 / 30.0F);
        }
    }

    @ObfuscatedName("tn.aa(B)V")
    public void method7902() {
        if (!this.method8088()) {
            return;
        }
        int var1 = this.field4946 - this.field4925;
        int var2 = this.field4941 - this.field4965;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7903(this.field4925 + var1, this.field4965 + var2, true);
        if (this.field4946 == this.field4925 && this.field4965 == this.field4941) {
            this.field4946 = -1;
            this.field4941 = -1;
        }
    }

    @ObfuscatedName("tn.ac(IIZB)V")
    public final void method7903(int arg0, int arg1, boolean arg2) {
        this.field4925 = arg0;
        this.field4965 = arg1;
        class313.method3460();
        if (arg2) {
            this.method8018();
        }
    }

    @ObfuscatedName("tn.al(I)V")
    public final void method8018() {
        this.field4963 = -1;
        this.field4980 = -1;
        this.field4960 = -1;
        this.field4945 = -1;
    }

    @ObfuscatedName("tn.az(I)Z")
    public boolean method8088() {
        return this.field4946 != -1 && this.field4941 != -1;
    }

    @ObfuscatedName("tn.ap(IIII)Ljv;")
    public class237 method7906(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4938.values().iterator();
        class237 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class237) var4.next();
        } while (!var5.method4172(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("tn.av(IIIZB)V")
    public void method7907(int arg0, int arg1, int arg2, boolean arg3) {
        class237 var5 = this.method7906(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4939;
        }
        boolean var6 = false;
        if (this.field4982 != var5 || arg3) {
            this.field4982 = var5;
            this.method7911(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7914(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("tn.ax(IS)V")
    public void method7908(int arg0) {
        class237 var2 = this.method7981(arg0);
        if (var2 != null) {
            this.method7911(var2);
        }
    }

    @ObfuscatedName("tn.as(I)I")
    public int method8086() {
        return this.field4978 == null ? -1 : this.field4978.method4177();
    }

    @ObfuscatedName("tn.ay(S)Ljv;")
    public class237 method8083() {
        return this.field4978;
    }

    @ObfuscatedName("tn.ak(Ljv;I)V")
    public void method7911(class237 arg0) {
        if (this.field4978 == null || this.field4978 != arg0) {
            this.method7912(arg0);
            this.method7914(-1, -1, -1);
        }
    }

    @ObfuscatedName("tn.aj(Ljv;B)V")
    public void method7912(class237 arg0) {
        this.field4978 = arg0;
        this.field4942 = new class239(this.field4936, this.field4956, this.field4930, this.field4931);
        this.field4943.method7888(this.field4978 == null ? null : this.field4978.method4244());
    }

    @ObfuscatedName("tn.am(Ljv;Lmh;Lmh;ZB)V")
    public void method7978(class237 arg0, class334 arg1, class334 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4978 == null || this.field4978 != arg0) {
            this.method7912(arg0);
        }
        if (!arg3 && this.field4978.method4172(arg1.field3562, arg1.field3561, arg1.field3563)) {
            this.method7914(arg1.field3562, arg1.field3561, arg1.field3563);
        } else {
            this.method7914(arg2.field3562, arg2.field3561, arg2.field3563);
        }
    }

    @ObfuscatedName("tn.aq(IIIB)V")
    public void method7914(int arg0, int arg1, int arg2) {
        if (this.field4978 == null) {
            return;
        }
        int[] var4 = this.field4978.method4208(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4978.method4208(this.field4978.method4188(), this.field4978.method4187(), this.field4978.method4189());
        }
        this.method7903(var4[0] - this.field4978.method4246() * 64, var4[1] - this.field4978.method4185() * 64, true);
        this.field4946 = -1;
        this.field4941 = -1;
        this.field4948 = this.method7921(this.field4978.method4183());
        this.field4949 = this.field4948;
        this.field4975 = null;
        this.field4962 = null;
        this.field4942.method4357();
    }

    @ObfuscatedName("tn.ai(IIIIIB)V")
    public void method8007(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class537.method8757(var6);
        class537.method8755(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var7 = this.field4943.method7877();
        if (var7 < 100) {
            this.method7920(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4942.method4355()) {
            this.field4942.method4356(this.field4929, this.field4978.method4244(), client.field487, client.field493 >= 217);
            if (!this.field4942.method4355()) {
                return;
            }
        }
        class537.method8837(arg0, arg1, arg2, arg3, this.field4942.method4364());
        if (this.field4957 != null) {
            this.field4959++;
            if (this.field4959 % this.field4955 == 0) {
                this.field4959 = 0;
                this.field4958++;
            }
            if (this.field4958 >= this.field4954 && !this.field4926) {
                this.field4957 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4948));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4948));
        this.field4942.method4358(this.field4925 - var8 / 2, this.field4965 - var9 / 2, var8 / 2 + this.field4925, var9 / 2 + this.field4965, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4972) {
            boolean var10 = false;
            if (arg4 - this.field4973 > 100) {
                this.field4973 = arg4;
                var10 = true;
            }
            this.field4942.method4359(this.field4925 - var8 / 2, this.field4965 - var9 / 2, var8 / 2 + this.field4925, var9 / 2 + this.field4965, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4944, this.field4957, this.field4959, this.field4955, var10);
        }
        this.method7917(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field567 >= 2;
        if (var11 && this.field4979 && this.field4971 != null) {
            this.field4935.method6981("Coord: " + this.field4971, class537.field5214 + 10, class537.field5212 + 20, 16776960, -1);
        }
        this.field4961 = var8;
        this.field4951 = var9;
        this.field4952 = arg0;
        this.field4947 = arg1;
        class537.method8775(var6);
    }

    @ObfuscatedName("tn.aw(IIIIIII)Z")
    public boolean method7934(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4928 == null) {
            return true;
        } else if (this.field4928.field5236 != arg0 || this.field4928.field5239 != arg1) {
            return true;
        } else if (this.field4942.field2503 != this.field4976) {
            return true;
        } else if (client.field784 != this.field4984) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("tn.ae(IIIIIII)V")
    public void method7917(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field3457 == null) {
            return;
        }
        int var7 = 512 / (this.field4942.field2503 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7930() - arg4 / 2 - var7;
        int var14 = this.method7931() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4942.field2503 * (var7 + var13 - this.field4937);
        int var16 = arg1 - this.field4942.field2503 * (var7 - (var14 - this.field4983));
        if (this.method7934(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4928 != null && this.field4928.field5236 == var11 && this.field4928.field5239 == var12) {
                Arrays.fill(this.field4928.field5244, 0);
            } else {
                this.field4928 = new class541(var11, var12);
            }
            this.field4937 = this.method7930() - arg4 / 2 - var7;
            this.field4983 = this.method7931() - arg5 / 2 - var7;
            this.field4976 = this.field4942.field2503;
            Statics.field3457.method6482(this.field4937, this.field4983, this.field4928, (float) this.field4976 / var10);
            this.field4984 = client.field784;
            var15 = arg0 - this.field4942.field2503 * (var7 + var13 - this.field4937);
            var16 = arg1 - this.field4942.field2503 * (var7 - (var14 - this.field4983));
        }
        class537.method8762(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4928.method8987(var15, var16, 192);
        } else {
            this.field4928.method8898(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("tn.an(IIIIB)V")
    public void method7918(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4943.method7879()) {
            return;
        }
        if (!this.field4942.method4355()) {
            this.field4942.method4356(this.field4929, this.field4978.method4244(), client.field487, client.field493 >= 217);
            if (!this.field4942.method4355()) {
                return;
            }
        }
        this.field4942.method4379(arg0, arg1, arg2, arg3, this.field4957, this.field4959, this.field4955);
    }

    @ObfuscatedName("tn.ag(IB)V")
    public void method8054(int arg0) {
        this.field4949 = this.method7921(arg0);
    }

    @ObfuscatedName("tn.ad(IIIIII)V")
    public void method7920(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class537.method8837(arg0, arg1, arg2, arg3, -16777216);
        class537.method8767(var7 - 152, var8, 304, 34, -65536);
        class537.method8837(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4935.method6987(class364.field4232, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("tn.af(IB)F")
    public float method7921(int arg0) {
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

    @ObfuscatedName("tn.be(I)I")
    public int method7922() {
        if ((double) this.field4949 == 1.0D) {
            return 25;
        } else if ((double) this.field4949 == 1.5D) {
            return 37;
        } else if ((double) this.field4949 == 2.0D) {
            return 50;
        } else if ((double) this.field4949 == 3.0D) {
            return 75;
        } else if ((double) this.field4949 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("tn.bd(B)V")
    public void method7923() {
        this.field4943.method7887();
    }

    @ObfuscatedName("tn.bl(I)Z")
    public boolean method7924() {
        return this.field4943.method7879();
    }

    @ObfuscatedName("tn.bi(II)Ljv;")
    public class237 method7981(int arg0) {
        Iterator var2 = this.field4938.values().iterator();
        class237 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class237) var2.next();
        } while (var3.method4177() != arg0);
        return var3;
    }

    @ObfuscatedName("tn.bv(III)V")
    public void method8042(int arg0, int arg1) {
        if (this.field4978 != null && this.field4978.method4198(arg0, arg1)) {
            this.field4946 = arg0 - this.field4978.method4246() * 64;
            this.field4941 = arg1 - this.field4978.method4185() * 64;
        }
    }

    @ObfuscatedName("tn.bf(III)V")
    public void method7987(int arg0, int arg1) {
        if (this.field4978 != null) {
            this.method7903(arg0 - this.field4978.method4246() * 64, arg1 - this.field4978.method4185() * 64, true);
            this.field4946 = -1;
            this.field4941 = -1;
        }
    }

    @ObfuscatedName("tn.bg(IIII)V")
    public void method8105(int arg0, int arg1, int arg2) {
        if (this.field4978 != null) {
            int[] var4 = this.field4978.method4208(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8042(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tn.ba(IIII)V")
    public void method7929(int arg0, int arg1, int arg2) {
        if (this.field4978 != null) {
            int[] var4 = this.field4978.method4208(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7987(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tn.bm(B)I")
    public int method7930() {
        return this.field4978 == null ? -1 : this.field4925 + this.field4978.method4246() * 64;
    }

    @ObfuscatedName("tn.bp(I)I")
    public int method7931() {
        return this.field4978 == null ? -1 : this.field4965 + this.field4978.method4185() * 64;
    }

    @ObfuscatedName("tn.bw(B)Lmh;")
    public class334 method7932() {
        return this.field4978 == null ? null : this.field4978.method4175(this.method7930(), this.method7931());
    }

    @ObfuscatedName("tn.bj(I)I")
    public int method7933() {
        return this.field4961;
    }

    @ObfuscatedName("tn.bn(I)I")
    public int method8034() {
        return this.field4951;
    }

    @ObfuscatedName("tn.bo(II)V")
    public void method7944(int arg0) {
        if (arg0 >= 1) {
            this.field4954 = arg0;
        }
    }

    @ObfuscatedName("tn.bt(I)V")
    public void method7936() {
        this.field4954 = 3;
    }

    @ObfuscatedName("tn.bu(IB)V")
    public void method8085(int arg0) {
        if (arg0 >= 1) {
            this.field4955 = arg0;
        }
    }

    @ObfuscatedName("tn.by(I)V")
    public void method7938() {
        this.field4955 = 50;
    }

    @ObfuscatedName("tn.bh(ZI)V")
    public void method8098(boolean arg0) {
        this.field4926 = arg0;
    }

    @ObfuscatedName("tn.bz(IB)V")
    public void method8016(int arg0) {
        this.field4957 = new HashSet();
        this.field4957.add(arg0);
        this.field4958 = 0;
        this.field4959 = 0;
    }

    @ObfuscatedName("tn.bc(II)V")
    public void method8104(int arg0) {
        this.field4957 = new HashSet();
        this.field4958 = 0;
        this.field4959 = 0;
        for (int var2 = 0; var2 < Statics.field1591; var2++) {
            if (class178.method3048(var2) != null && class178.method3048(var2).field1847 == arg0) {
                this.field4957.add(class178.method3048(var2).field1827);
            }
        }
    }

    @ObfuscatedName("tn.bs(I)V")
    public void method7942() {
        this.field4957 = null;
    }

    @ObfuscatedName("tn.bx(ZB)V")
    public void method8061(boolean arg0) {
        this.field4972 = !arg0;
    }

    @ObfuscatedName("tn.bb(IZB)V")
    public void method8030(int arg0, boolean arg1) {
        if (arg1) {
            this.field4968.remove(arg0);
        } else {
            this.field4968.add(arg0);
        }
        this.method8084();
    }

    @ObfuscatedName("tn.bk(IZI)V")
    public void method7945(int arg0, boolean arg1) {
        if (arg1) {
            this.field4967.remove(arg0);
        } else {
            this.field4967.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1591; var3++) {
            if (class178.method3048(var3) != null && class178.method3048(var3).field1847 == arg0) {
                int var4 = class178.method3048(var3).field1827;
                if (arg1) {
                    this.field4970.remove(var4);
                } else {
                    this.field4970.add(var4);
                }
            }
        }
        this.method8084();
    }

    @ObfuscatedName("tn.br(B)Z")
    public boolean method7927() {
        return !this.field4972;
    }

    @ObfuscatedName("tn.bq(II)Z")
    public boolean method7946(int arg0) {
        return !this.field4968.contains(arg0);
    }

    @ObfuscatedName("tn.cf(II)Z")
    public boolean method7947(int arg0) {
        return !this.field4967.contains(arg0);
    }

    @ObfuscatedName("tn.cg(B)V")
    public void method8084() {
        this.field4944.clear();
        this.field4944.addAll(this.field4968);
        this.field4944.addAll(this.field4970);
    }

    @ObfuscatedName("tn.cv(IIIIIII)V")
    public void method7949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4943.method7879()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4948));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4948));
        List var9 = this.field4942.method4387(this.field4925 - var7 / 2 - 1, this.field4965 - var8 / 2 - 1, var7 / 2 + this.field4925 + 1, var8 / 2 + this.field4965 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class255 var11 = (class255) var10.next();
            class178 var12 = class178.method3048(var11.method4123());
            var13 = false;
            for (int var14 = this.field4974.length - 1; var14 >= 0; var14--) {
                if (var12.field1836[var14] != null) {
                    client.method4431(var12.field1836[var14], var12.field1837, this.field4974[var14], var11.method4123(), var11.field2624.method5617(), var11.field2623.method5617());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("tn.cx(ILmh;I)Lmh;")
    public class334 method7950(int arg0, class334 arg1) {
        if (!this.field4943.method7879()) {
            return null;
        } else if (!this.field4942.method4355()) {
            return null;
        } else if (this.field4978.method4198(arg1.field3561, arg1.field3563)) {
            HashMap var3 = this.field4942.method4365();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class255 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class255 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2623;
                    }
                    var8 = (class255) var7.next();
                    int var9 = var8.field2623.field3561 - arg1.field3561;
                    int var10 = var8.field2623.field3563 - arg1.field3563;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2623;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("tn.cp(IILmh;Lmh;B)V")
    public void method7951(int arg0, int arg1, class334 arg2, class334 arg3) {
        class88 var5 = new class88();
        class260 var6 = new class260(arg1, arg2, arg3);
        var5.method2239(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2247(10);
                break;
            case 1009:
                var5.method2247(11);
                break;
            case 1010:
                var5.method2247(12);
                break;
            case 1011:
                var5.method2247(13);
                break;
            case 1012:
                var5.method2247(14);
        }
        class71.method3152(var5);
    }

    @ObfuscatedName("tn.ce(B)Ljc;")
    public class255 method7952() {
        if (!this.field4943.method7879()) {
            return null;
        } else if (this.field4942.method4355()) {
            HashMap var1 = this.field4942.method4365();
            this.field4975 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4975.addAll(var3);
            }
            this.field4962 = this.field4975.iterator();
            return this.method8022();
        } else {
            return null;
        }
    }

    @ObfuscatedName("tn.ci(B)Ljc;")
    public class255 method8022() {
        if (this.field4962 == null) {
            return null;
        }
        class255 var1;
        do {
            if (!this.field4962.hasNext()) {
                return null;
            }
            var1 = (class255) this.field4962.next();
        } while (var1.method4123() == -1);
        return var1;
    }
}
