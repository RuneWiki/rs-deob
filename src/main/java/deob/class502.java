package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ts")
public class class502 {

    @ObfuscatedName("ts.aa")
    public class378 field4994;

    @ObfuscatedName("ts.az")
    public class378 field4995;

    @ObfuscatedName("ts.ao")
    public class378 field5002;

    @ObfuscatedName("ts.au")
    public static final class504 field4997 = class504.field5056;

    @ObfuscatedName("ts.ak")
    public static final class504 field4996 = class504.field5057;

    @ObfuscatedName("ts.ah")
    public static final class504 field4999 = class504.field5059;

    @ObfuscatedName("ts.aj")
    public class413 field5000;

    @ObfuscatedName("ts.af")
    public HashMap field5008;

    @ObfuscatedName("ts.ax")
    public class547[] field5024;

    @ObfuscatedName("ts.an")
    public HashMap field5003;

    @ObfuscatedName("ts.ag")
    public class242 field5004;

    @ObfuscatedName("ts.am")
    public class242 field5005;

    @ObfuscatedName("ts.ad")
    public class242 field5049;

    @ObfuscatedName("ts.at")
    public class244 field5007;

    @ObfuscatedName("ts.ay")
    public class501 field5029;

    @ObfuscatedName("ts.ae")
    public int field5045;

    @ObfuscatedName("ts.ac")
    public int field5010;

    @ObfuscatedName("ts.ab")
    public int field5011 = -1;

    @ObfuscatedName("ts.av")
    public int field5012 = -1;

    @ObfuscatedName("ts.ap")
    public float field5001;

    @ObfuscatedName("ts.bu")
    public float field5030;

    @ObfuscatedName("ts.bo")
    public int field5040 = -1;

    @ObfuscatedName("ts.bd")
    public int field5016 = -1;

    @ObfuscatedName("ts.bi")
    public int field5017 = -1;

    @ObfuscatedName("ts.bq")
    public int field5018 = -1;

    @ObfuscatedName("ts.ba")
    public int field5015 = 3;

    @ObfuscatedName("ts.bt")
    public int field5020 = 50;

    @ObfuscatedName("ts.bk")
    public boolean field5021 = false;

    @ObfuscatedName("ts.bm")
    public HashSet field5022 = null;

    @ObfuscatedName("ts.bw")
    public int field5023 = -1;

    @ObfuscatedName("ts.bv")
    public int field4991 = -1;

    @ObfuscatedName("ts.by")
    public int field5019 = -1;

    @ObfuscatedName("ts.bb")
    public int field5026 = -1;

    @ObfuscatedName("ts.bn")
    public int field5006 = -1;

    @ObfuscatedName("ts.br")
    public int field5028 = -1;

    @ObfuscatedName("ts.bp")
    public long field5014;

    @ObfuscatedName("ts.bf")
    public int field4993;

    @ObfuscatedName("ts.bg")
    public int field5031;

    @ObfuscatedName("ts.be")
    public boolean field5032 = true;

    @ObfuscatedName("ts.bh")
    public HashSet field5033 = new HashSet();

    @ObfuscatedName("ts.bs")
    public HashSet field5034 = new HashSet();

    @ObfuscatedName("ts.bj")
    public HashSet field5043 = new HashSet();

    @ObfuscatedName("ts.bl")
    public HashSet field5036 = new HashSet();

    @ObfuscatedName("ts.bx")
    public boolean field5042 = false;

    @ObfuscatedName("ts.cs")
    public int field5038 = 0;

    @ObfuscatedName("ts.co")
    public final int[] field5039 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ts.cd")
    public List field5009;

    @ObfuscatedName("ts.cg")
    public Iterator field5041;

    @ObfuscatedName("ts.cn")
    public HashSet field5025 = new HashSet();

    @ObfuscatedName("ts.cz")
    public class339 field5013 = null;

    @ObfuscatedName("ts.ci")
    public boolean field5044 = false;

    @ObfuscatedName("ts.cl")
    public class548 field5035;

    @ObfuscatedName("ts.cm")
    public int field5046;

    @ObfuscatedName("ts.cx")
    public int field5047 = -1;

    @ObfuscatedName("ts.cw")
    public int field5048 = -1;

    @ObfuscatedName("ts.cy")
    public int field5037 = -1;

    @ObfuscatedName("ts.aq(Lof;Lof;Lof;Lpb;Ljava/util/HashMap;[Lvg;B)V")
    public void method8107(class378 arg0, class378 arg1, class378 arg2, class413 arg3, HashMap arg4, class547[] arg5) {
        this.field5024 = arg5;
        this.field4994 = arg0;
        this.field4995 = arg1;
        this.field5002 = arg2;
        this.field5000 = arg3;
        this.field5008 = new HashMap();
        this.field5008.put(class239.field2489, arg4.get(field4997));
        this.field5008.put(class239.field2490, arg4.get(field4996));
        this.field5008.put(class239.field2492, arg4.get(field4999));
        this.field5029 = new class501(arg0);
        int var7 = this.field4994.method6435(class261.field2681.field2680);
        int[] var8 = this.field4994.method6510(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field5003 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class534 var11 = new class534(this.field4994.method6489(var7, var8[var10]));
            class242 var12 = new class242();
            var12.method4257(var11, var8[var10]);
            this.field5003.put(var12.method4267(), var12);
            if (var12.method4266()) {
                this.field5004 = var12;
            }
        }
        this.method8073(this.field5004);
        this.field5049 = null;
    }

    @ObfuscatedName("ts.aw(I)V")
    public void method8059() {
        class243.method4206();
    }

    @ObfuscatedName("ts.al(IIZIIIII)V")
    public void method8143(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field5029.method8046()) {
            return;
        }
        this.method8063();
        this.method8064();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field5001));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field5001));
        List var10 = this.field5007.method4449(this.field5045 - var8 / 2 - 1, this.field5010 - var9 / 2 - 1, var8 / 2 + this.field5045 + 1, var9 / 2 + this.field5010 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class260 var13 = (class260) var12.next();
            var11.add(var13);
            class89 var14 = new class89();
            class265 var15 = new class265(var13.method4218(), var13.field2674, var13.field2677);
            var14.method2252(new Object[] { var15, arg0, arg1 });
            if (this.field5025.contains(var13)) {
                var14.method2260(17);
            } else {
                var14.method2260(15);
            }
            class72.method3238(var14);
        }
        Iterator var16 = this.field5025.iterator();
        while (var16.hasNext()) {
            class260 var17 = (class260) var16.next();
            if (!var11.contains(var17)) {
                class89 var18 = new class89();
                class265 var19 = new class265(var17.method4218(), var17.field2674, var17.field2677);
                var18.method2252(new Object[] { var19, arg0, arg1 });
                var18.method2260(16);
                class72.method3238(var18);
            }
        }
        this.field5025 = var11;
    }

    @ObfuscatedName("ts.ai(IIZZI)V")
    public void method8061(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class318.method2218();
            this.method8062(arg0, arg1, arg3, var5);
            if (!this.method8067() && (arg3 || arg2)) {
                boolean var7 = client.field570 != null;
                if (!var7) {
                    if (arg3) {
                        this.field5006 = arg0;
                        this.field5028 = arg1;
                        this.field5019 = this.field5045;
                        this.field5026 = this.field5010;
                    }
                    if (this.field5019 != -1) {
                        int var8 = arg0 - this.field5006;
                        int var9 = arg1 - this.field5028;
                        this.method8137(this.field5019 - (int) ((float) var8 / this.field5030), this.field5026 + (int) ((float) var9 / this.field5030), false);
                    }
                    break label33;
                }
            }
            this.method8211();
        }
        if (arg3) {
            this.field5014 = var5;
            this.field4993 = arg0;
            this.field5031 = arg1;
        }
    }

    @ObfuscatedName("ts.ar(IIZJ)V")
    public void method8062(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field5005 == null) {
            this.field5013 = null;
            return;
        }
        int var6 = (int) ((float) this.field5045 + ((float) (arg0 - this.field5017) - (float) this.method8096() * this.field5001 / 2.0F) / this.field5001);
        int var7 = (int) ((float) this.field5010 - ((float) (arg1 - this.field5018) - (float) this.method8097() * this.field5001 / 2.0F) / this.field5001);
        this.field5013 = this.field5005.method4263(var6 + this.field5005.method4288() * 64, var7 + this.field5005.method4283() * 64);
        if (this.field5013 == null || !arg2) {
            return;
        }
        class229 var8 = client.method5445();
        boolean var9 = client.field676 >= 2;
        if (var9 && var8.method4065(82) && var8.method4065(81)) {
            client.method2101(this.field5013.field3622, this.field5013.field3624, this.field5013.field3623, false);
            return;
        }
        boolean var10 = true;
        if (this.field5032) {
            int var11 = arg0 - this.field4993;
            int var12 = arg1 - this.field5031;
            if (arg3 - this.field5014 > 500L || var11 < -25 || var11 > 25 || var12 < -25 || var12 > 25) {
                var10 = false;
            }
        }
        if (var10) {
            class313 var13 = class313.method5301(class311.field3237, client.field590.field1435);
            var13.field3291.method8646(this.field5013.method5759());
            client.field590.method2741(var13);
            this.field5014 = 0L;
        }
    }

    @ObfuscatedName("ts.as(I)V")
    public void method8063() {
        if (Statics.field2353 != null) {
            this.field5001 = this.field5030;
            return;
        }
        if (this.field5001 < this.field5030) {
            this.field5001 = Math.min(this.field5030, this.field5001 / 30.0F + this.field5001);
        }
        if (this.field5001 > this.field5030) {
            this.field5001 = Math.max(this.field5030, this.field5001 - this.field5001 / 30.0F);
        }
    }

    @ObfuscatedName("ts.aa(B)V")
    public void method8064() {
        if (!this.method8067()) {
            return;
        }
        int var1 = this.field5011 - this.field5045;
        int var2 = this.field5012 - this.field5010;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method8137(this.field5045 + var1, this.field5010 + var2, true);
        if (this.field5045 == this.field5011 && this.field5012 == this.field5010) {
            this.field5011 = -1;
            this.field5012 = -1;
        }
    }

    @ObfuscatedName("ts.az(IIZI)V")
    public final void method8137(int arg0, int arg1, boolean arg2) {
        this.field5045 = arg0;
        this.field5010 = arg1;
        class318.method2218();
        if (arg2) {
            this.method8211();
        }
    }

    @ObfuscatedName("ts.ao(I)V")
    public final void method8211() {
        this.field5028 = -1;
        this.field5006 = -1;
        this.field5026 = -1;
        this.field5019 = -1;
    }

    @ObfuscatedName("ts.au(B)Z")
    public boolean method8067() {
        return this.field5011 != -1 && this.field5012 != -1;
    }

    @ObfuscatedName("ts.ak(IIII)Ljw;")
    public class242 method8068(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field5003.values().iterator();
        class242 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class242) var4.next();
        } while (!var5.method4260(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ts.ah(IIIZI)V")
    public void method8069(int arg0, int arg1, int arg2, boolean arg3) {
        class242 var5 = this.method8068(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field5004;
        }
        boolean var6 = false;
        if (this.field5049 != var5 || arg3) {
            this.field5049 = var5;
            this.method8073(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method8076(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ts.aj(II)V")
    public void method8070(int arg0) {
        class242 var2 = this.method8186(arg0);
        if (var2 != null) {
            this.method8073(var2);
        }
    }

    @ObfuscatedName("ts.af(I)I")
    public int method8074() {
        return this.field5005 == null ? -1 : this.field5005.method4265();
    }

    @ObfuscatedName("ts.ax(I)Ljw;")
    public class242 method8139() {
        return this.field5005;
    }

    @ObfuscatedName("ts.an(Ljw;I)V")
    public void method8073(class242 arg0) {
        if (this.field5005 == null || this.field5005 != arg0) {
            this.method8199(arg0);
            this.method8076(-1, -1, -1);
        }
    }

    @ObfuscatedName("ts.ag(Ljw;I)V")
    public void method8199(class242 arg0) {
        this.field5005 = arg0;
        this.field5007 = new class244(this.field5024, this.field5008, this.field4995, this.field5002);
        this.field5029.method8044(this.field5005 == null ? null : this.field5005.method4267());
    }

    @ObfuscatedName("ts.am(Ljw;Lns;Lns;ZI)V")
    public void method8083(class242 arg0, class339 arg1, class339 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field5005 == null || this.field5005 != arg0) {
            this.method8199(arg0);
        }
        if (!arg3 && this.field5005.method4260(arg1.field3623, arg1.field3622, arg1.field3624)) {
            this.method8076(arg1.field3623, arg1.field3622, arg1.field3624);
        } else {
            this.method8076(arg2.field3623, arg2.field3622, arg2.field3624);
        }
    }

    @ObfuscatedName("ts.ad(IIII)V")
    public void method8076(int arg0, int arg1, int arg2) {
        if (this.field5005 == null) {
            return;
        }
        int[] var4 = this.field5005.method4271(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field5005.method4271(this.field5005.method4277(), this.field5005.method4276(), this.field5005.method4272());
        }
        this.method8137(var4[0] - this.field5005.method4288() * 64, var4[1] - this.field5005.method4283() * 64, true);
        this.field5011 = -1;
        this.field5012 = -1;
        this.field5001 = this.method8084(this.field5005.method4321());
        this.field5030 = this.field5001;
        this.field5009 = null;
        this.field5041 = null;
        this.field5007.method4464();
    }

    @ObfuscatedName("ts.at(IIIIID)V")
    public void method8058(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5) {
        int[] var8 = new int[4];
        class544.method8890(var8);
        class544.method8892(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var9 = this.field5029.method8047();
        if (var9 < 100) {
            this.method8226(arg0, arg1, arg2, arg3, var9);
            return;
        }
        if (!this.field5007.method4443()) {
            this.field5007.method4486(this.field4994, this.field5005.method4267(), client.field525);
            if (!this.field5007.method4443()) {
                return;
            }
        }
        int var10 = class344.method2408(this.field5007.method4452(), arg5);
        class544.method8900(arg0, arg1, arg2, arg3, var10);
        if (this.field5022 != null) {
            this.field4991++;
            if (this.field4991 % this.field5020 == 0) {
                this.field4991 = 0;
                this.field5023++;
            }
            if (this.field5023 >= this.field5015 && !this.field5021) {
                this.field5022 = null;
            }
        }
        int var11 = (int) Math.ceil((double) ((float) arg2 / this.field5001));
        int var12 = (int) Math.ceil((double) ((float) arg3 / this.field5001));
        this.field5007.method4446(this.field5045 - var11 / 2, this.field5010 - var12 / 2, var11 / 2 + this.field5045, var12 / 2 + this.field5010, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field5042) {
            boolean var13 = false;
            if (arg4 - this.field5038 > 100) {
                this.field5038 = arg4;
                var13 = true;
            }
            this.field5007.method4458(this.field5045 - var11 / 2, this.field5010 - var12 / 2, var11 / 2 + this.field5045, var12 / 2 + this.field5010, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field5036, this.field5022, this.field4991, this.field5020, var13);
        }
        this.method8123(arg0, arg1, arg2, arg3, var11, var12);
        boolean var14 = client.field676 >= 2;
        if (var14 && this.field5044 && this.field5013 != null) {
            this.field5000.method7170("Coord: " + this.field5013, class544.field5273 + 10, class544.field5277 + 20, 16776960, -1);
        }
        this.field5040 = var11;
        this.field5016 = var12;
        this.field5017 = arg0;
        this.field5018 = arg1;
        class544.method8895(var8);
    }

    @ObfuscatedName("ts.ay(I)V")
    public void method8078() {
        Statics.method4109();
    }

    @ObfuscatedName("ts.ae(IIIIIII)Z")
    public boolean method8079(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field5035 == null) {
            return true;
        } else if (this.field5035.field5304 != arg0 || this.field5035.field5298 != arg1) {
            return true;
        } else if (this.field5007.field2559 != this.field5046) {
            return true;
        } else if (client.field826 != this.field5037) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ts.ac(IIIIIIS)V")
    public void method8123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field2353 == null) {
            return;
        }
        int var7 = 512 / (this.field5007.field2559 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method8093() - arg4 / 2 - var7;
        int var14 = this.method8094() - arg5 / 2 - var7;
        int var15 = arg0 - this.field5007.field2559 * (var7 + var13 - this.field5047);
        int var16 = arg1 - this.field5007.field2559 * (var7 - (var14 - this.field5048));
        if (this.method8079(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field5035 != null && this.field5035.field5304 == var11 && this.field5035.field5298 == var12) {
                Arrays.fill(this.field5035.field5296, 0);
            } else {
                this.field5035 = new class548(var11, var12);
            }
            this.field5047 = this.method8093() - arg4 / 2 - var7;
            this.field5048 = this.method8094() - arg5 / 2 - var7;
            this.field5046 = this.field5007.field2559;
            Statics.field2353.method6625(this.field5047, this.field5048, this.field5035, (float) this.field5046 / var10);
            this.field5037 = client.field826;
            var15 = arg0 - this.field5007.field2559 * (var7 + var13 - this.field5047);
            var16 = arg1 - this.field5007.field2559 * (var7 - (var14 - this.field5048));
        }
        class544.method8899(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field5035.method9022(var15, var16, 192);
        } else {
            this.field5035.method9072(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ts.ab(IIIIB)V")
    public void method8081(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field5029.method8046()) {
            return;
        }
        if (!this.field5007.method4443()) {
            this.field5007.method4486(this.field4994, this.field5005.method4267(), client.field525);
            if (!this.field5007.method4443()) {
                return;
            }
        }
        this.field5007.method4448(arg0, arg1, arg2, arg3, this.field5022, this.field4991, this.field5020);
    }

    @ObfuscatedName("ts.av(II)V")
    public void method8148(int arg0) {
        this.field5030 = this.method8084(arg0);
    }

    @ObfuscatedName("ts.ap(IIIIIB)V")
    public void method8226(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class544.method8900(arg0, arg1, arg2, arg3, -16777216);
        class544.method8945(var7 - 152, var8, 304, 34, -65536);
        class544.method8900(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field5000.method7130(class370.field4315, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ts.bu(IS)F")
    public float method8084(int arg0) {
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

    @ObfuscatedName("ts.bo(I)I")
    public int method8162() {
        if ((double) this.field5030 == 1.0D) {
            return 25;
        } else if ((double) this.field5030 == 1.5D) {
            return 37;
        } else if ((double) this.field5030 == 2.0D) {
            return 50;
        } else if ((double) this.field5030 == 3.0D) {
            return 75;
        } else if ((double) this.field5030 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ts.bd(I)V")
    public void method8159() {
        this.field5029.method8056();
    }

    @ObfuscatedName("ts.bi(B)Z")
    public boolean method8087() {
        return this.field5029.method8046();
    }

    @ObfuscatedName("ts.bq(IB)Ljw;")
    public class242 method8186(int arg0) {
        Iterator var2 = this.field5003.values().iterator();
        class242 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class242) var2.next();
        } while (var3.method4265() != arg0);
        return var3;
    }

    @ObfuscatedName("ts.ba(IIB)V")
    public void method8089(int arg0, int arg1) {
        if (this.field5005 != null && this.field5005.method4306(arg0, arg1)) {
            this.field5011 = arg0 - this.field5005.method4288() * 64;
            this.field5012 = arg1 - this.field5005.method4283() * 64;
        }
    }

    @ObfuscatedName("ts.bt(IIB)V")
    public void method8090(int arg0, int arg1) {
        if (this.field5005 != null) {
            this.method8137(arg0 - this.field5005.method4288() * 64, arg1 - this.field5005.method4283() * 64, true);
            this.field5011 = -1;
            this.field5012 = -1;
        }
    }

    @ObfuscatedName("ts.bk(IIII)V")
    public void method8091(int arg0, int arg1, int arg2) {
        if (this.field5005 != null) {
            int[] var4 = this.field5005.method4271(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8089(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ts.bm(IIII)V")
    public void method8092(int arg0, int arg1, int arg2) {
        if (this.field5005 != null) {
            int[] var4 = this.field5005.method4271(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8090(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ts.bw(B)I")
    public int method8093() {
        return this.field5005 == null ? -1 : this.field5045 + this.field5005.method4288() * 64;
    }

    @ObfuscatedName("ts.bv(B)I")
    public int method8094() {
        return this.field5005 == null ? -1 : this.field5010 + this.field5005.method4283() * 64;
    }

    @ObfuscatedName("ts.by(I)Lns;")
    public class339 method8095() {
        return this.field5005 == null ? null : this.field5005.method4263(this.method8093(), this.method8094());
    }

    @ObfuscatedName("ts.bb(I)I")
    public int method8096() {
        return this.field5040;
    }

    @ObfuscatedName("ts.bn(I)I")
    public int method8097() {
        return this.field5016;
    }

    @ObfuscatedName("ts.br(II)V")
    public void method8098(int arg0) {
        if (arg0 >= 1) {
            this.field5015 = arg0;
        }
    }

    @ObfuscatedName("ts.bp(I)V")
    public void method8151() {
        this.field5015 = 3;
    }

    @ObfuscatedName("ts.bf(II)V")
    public void method8100(int arg0) {
        if (arg0 >= 1) {
            this.field5020 = arg0;
        }
    }

    @ObfuscatedName("ts.bg(I)V")
    public void method8101() {
        this.field5020 = 50;
    }

    @ObfuscatedName("ts.be(ZI)V")
    public void method8102(boolean arg0) {
        this.field5021 = arg0;
    }

    @ObfuscatedName("ts.bc(II)V")
    public void method8057(int arg0) {
        this.field5022 = new HashSet();
        this.field5022.add(arg0);
        this.field5023 = 0;
        this.field4991 = 0;
    }

    @ObfuscatedName("ts.bz(II)V")
    public void method8254(int arg0) {
        this.field5022 = new HashSet();
        this.field5023 = 0;
        this.field4991 = 0;
        for (int var2 = 0; var2 < Statics.field1880; var2++) {
            if (class179.method2995(var2) != null && class179.method2995(var2).field1867 == arg0) {
                this.field5022.add(class179.method2995(var2).field1870);
            }
        }
    }

    @ObfuscatedName("ts.bh(I)V")
    public void method8105() {
        this.field5022 = null;
    }

    @ObfuscatedName("ts.bs(ZI)V")
    public void method8106(boolean arg0) {
        this.field5042 = !arg0;
    }

    @ObfuscatedName("ts.bj(IZI)V")
    public void method8210(int arg0, boolean arg1) {
        if (arg1) {
            this.field5033.remove(arg0);
        } else {
            this.field5033.add(arg0);
        }
        this.method8112();
    }

    @ObfuscatedName("ts.bl(IZB)V")
    public void method8108(int arg0, boolean arg1) {
        if (arg1) {
            this.field5034.remove(arg0);
        } else {
            this.field5034.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1880; var3++) {
            if (class179.method2995(var3) != null && class179.method2995(var3).field1867 == arg0) {
                int var4 = class179.method2995(var3).field1870;
                if (arg1) {
                    this.field5043.remove(var4);
                } else {
                    this.field5043.add(var4);
                }
            }
        }
        this.method8112();
    }

    @ObfuscatedName("ts.bx(I)Z")
    public boolean method8109() {
        return !this.field5042;
    }

    @ObfuscatedName("ts.cs(IB)Z")
    public boolean method8110(int arg0) {
        return !this.field5033.contains(arg0);
    }

    @ObfuscatedName("ts.ch(IB)Z")
    public boolean method8212(int arg0) {
        return !this.field5034.contains(arg0);
    }

    @ObfuscatedName("ts.co(B)V")
    public void method8112() {
        this.field5036.clear();
        this.field5036.addAll(this.field5033);
        this.field5036.addAll(this.field5043);
    }

    @ObfuscatedName("ts.cd(IIIIIIB)V")
    public void method8113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field5029.method8046()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field5001));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field5001));
        List var9 = this.field5007.method4449(this.field5045 - var7 / 2 - 1, this.field5010 - var8 / 2 - 1, var7 / 2 + this.field5045 + 1, var8 / 2 + this.field5010 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class260 var11 = (class260) var10.next();
            class179 var12 = class179.method2995(var11.method4218());
            var13 = false;
            for (int var14 = this.field5039.length - 1; var14 >= 0; var14--) {
                if (var12.field1878[var14] != null) {
                    client.method2788(var12.field1878[var14], var12.field1889, this.field5039[var14], var11.method4218(), var11.field2674.method5759(), var11.field2677.method5759());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ts.cg(ILns;I)Lns;")
    public class339 method8114(int arg0, class339 arg1) {
        if (!this.field5029.method8046()) {
            return null;
        } else if (!this.field5007.method4443()) {
            return null;
        } else if (this.field5005.method4306(arg1.field3622, arg1.field3624)) {
            HashMap var3 = this.field5007.method4453();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class260 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class260 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field2677;
                    }
                    var8 = (class260) var7.next();
                    int var9 = var8.field2677.field3622 - arg1.field3622;
                    int var10 = var8.field2677.field3624 - arg1.field3624;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field2677;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ts.cn(IILns;Lns;I)V")
    public void method8133(int arg0, int arg1, class339 arg2, class339 arg3) {
        class89 var5 = new class89();
        class265 var6 = new class265(arg1, arg2, arg3);
        var5.method2252(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2260(10);
                break;
            case 1009:
                var5.method2260(11);
                break;
            case 1010:
                var5.method2260(12);
                break;
            case 1011:
                var5.method2260(13);
                break;
            case 1012:
                var5.method2260(14);
        }
        class72.method3238(var5);
    }

    @ObfuscatedName("ts.cz(I)Ljd;")
    public class260 method8116() {
        if (!this.field5029.method8046()) {
            return null;
        } else if (this.field5007.method4443()) {
            HashMap var1 = this.field5007.method4453();
            this.field5009 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field5009.addAll(var3);
            }
            this.field5041 = this.field5009.iterator();
            return this.method8117();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ts.ci(B)Ljd;")
    public class260 method8117() {
        if (this.field5041 == null) {
            return null;
        }
        class260 var1;
        do {
            if (!this.field5041.hasNext()) {
                return null;
            }
            var1 = (class260) this.field5041.next();
        } while (var1.method4218() == -1);
        return var1;
    }
}
