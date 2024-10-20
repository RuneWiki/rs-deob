package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("sq")
public class class484 {

    @ObfuscatedName("sq.ag")
    public class360 field4890;

    @ObfuscatedName("sq.az")
    public class360 field4891;

    @ObfuscatedName("sq.av")
    public class360 field4922;

    @ObfuscatedName("sq.ap")
    public static final class486 field4927 = class486.field4952;

    @ObfuscatedName("sq.aq")
    public static final class486 field4893 = class486.field4953;

    @ObfuscatedName("sq.at")
    public static final class486 field4895 = class486.field4956;

    @ObfuscatedName("sq.ah")
    public class395 field4896;

    @ObfuscatedName("sq.ax")
    public HashMap field4897;

    @ObfuscatedName("sq.aa")
    public class527[] field4898;

    @ObfuscatedName("sq.au")
    public HashMap field4899;

    @ObfuscatedName("sq.ae")
    public class258 field4894;

    @ObfuscatedName("sq.ab")
    public class258 field4901;

    @ObfuscatedName("sq.ad")
    public class258 field4888;

    @ObfuscatedName("sq.ao")
    public class260 field4903;

    @ObfuscatedName("sq.ac")
    public class483 field4904;

    @ObfuscatedName("sq.ak")
    public int field4905;

    @ObfuscatedName("sq.an")
    public int field4919;

    @ObfuscatedName("sq.af")
    public int field4907 = -1;

    @ObfuscatedName("sq.ai")
    public int field4887 = -1;

    @ObfuscatedName("sq.al")
    public float field4909;

    @ObfuscatedName("sq.bd")
    public float field4935;

    @ObfuscatedName("sq.bb")
    public int field4928 = -1;

    @ObfuscatedName("sq.bn")
    public int field4911 = -1;

    @ObfuscatedName("sq.ba")
    public int field4912 = -1;

    @ObfuscatedName("sq.bf")
    public int field4914 = -1;

    @ObfuscatedName("sq.bs")
    public int field4892 = 3;

    @ObfuscatedName("sq.bp")
    public int field4886 = 50;

    @ObfuscatedName("sq.bv")
    public boolean field4917 = false;

    @ObfuscatedName("sq.bq")
    public HashSet field4940 = null;

    @ObfuscatedName("sq.bo")
    public int field4921 = -1;

    @ObfuscatedName("sq.br")
    public int field4920 = -1;

    @ObfuscatedName("sq.bw")
    public int field4900 = -1;

    @ObfuscatedName("sq.be")
    public int field4902 = -1;

    @ObfuscatedName("sq.bc")
    public int field4923 = -1;

    @ObfuscatedName("sq.bi")
    public int field4924 = -1;

    @ObfuscatedName("sq.bu")
    public long field4925;

    @ObfuscatedName("sq.bk")
    public int field4926;

    @ObfuscatedName("sq.bz")
    public int field4916;

    @ObfuscatedName("sq.bx")
    public boolean field4938 = true;

    @ObfuscatedName("sq.bl")
    public HashSet field4929 = new HashSet();

    @ObfuscatedName("sq.bt")
    public HashSet field4930 = new HashSet();

    @ObfuscatedName("sq.by")
    public HashSet field4931 = new HashSet();

    @ObfuscatedName("sq.bg")
    public HashSet field4932 = new HashSet();

    @ObfuscatedName("sq.bj")
    public boolean field4933 = false;

    @ObfuscatedName("sq.ct")
    public int field4934 = 0;

    @ObfuscatedName("sq.cz")
    public final int[] field4910 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("sq.cb")
    public List field4936;

    @ObfuscatedName("sq.cs")
    public Iterator field4937;

    @ObfuscatedName("sq.cj")
    public HashSet field4908 = new HashSet();

    @ObfuscatedName("sq.cn")
    public class324 field4939 = null;

    @ObfuscatedName("sq.cw")
    public boolean field4906 = false;

    @ObfuscatedName("sq.ce")
    public class528 field4941;

    @ObfuscatedName("sq.cq")
    public int field4942;

    @ObfuscatedName("sq.cm")
    public int field4943 = -1;

    @ObfuscatedName("sq.ca")
    public int field4944 = -1;

    @ObfuscatedName("sq.cx")
    public int field4945 = -1;

    @ObfuscatedName("sq.aw(Lnd;Lnd;Lnd;Lpc;Ljava/util/HashMap;[Luu;I)V")
    public void method7911(class360 arg0, class360 arg1, class360 arg2, class395 arg3, HashMap arg4, class527[] arg5) {
        this.field4898 = arg5;
        this.field4890 = arg0;
        this.field4891 = arg1;
        this.field4922 = arg2;
        this.field4896 = arg3;
        this.field4897 = new HashMap();
        this.field4897.put(class255.field2856, arg4.get(field4927));
        this.field4897.put(class255.field2857, arg4.get(field4893));
        this.field4897.put(class255.field2858, arg4.get(field4895));
        this.field4904 = new class483(arg0);
        int var7 = this.field4890.method6129(class277.field3051.field3048);
        int[] var8 = this.field4890.method6126(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field4899 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class514 var11 = new class514(this.field4890.method6117(var7, var8[var10]));
            class258 var12 = new class258();
            var12.method4747(var11, var8[var10]);
            this.field4899.put(var12.method4729(), var12);
            if (var12.method4728()) {
                this.field4894 = var12;
            }
        }
        this.method7743(this.field4894);
        this.field4888 = null;
    }

    @ObfuscatedName("sq.ay(B)V")
    public void method7729() {
        class259.field2912.method5110(5);
    }

    @ObfuscatedName("sq.ar(IIZIIIII)V")
    public void method7730(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4904.method7711()) {
            return;
        }
        this.method7814();
        this.method7734();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4909));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4909));
        List var10 = this.field4903.method4953(this.field4905 - var8 / 2 - 1, this.field4919 - var9 / 2 - 1, var8 / 2 + this.field4905 + 1, var9 / 2 + this.field4919 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class276 var13 = (class276) var12.next();
            var11.add(var13);
            class88 var14 = new class88();
            class281 var15 = new class281(var13.method4675(), var13.field3040, var13.field3043);
            var14.method2184(new Object[] { var15, arg0, arg1 });
            if (this.field4908.contains(var13)) {
                var14.method2185(17);
            } else {
                var14.method2185(15);
            }
            class71.method1189(var14);
        }
        Iterator var16 = this.field4908.iterator();
        while (var16.hasNext()) {
            class276 var17 = (class276) var16.next();
            if (!var11.contains(var17)) {
                class88 var18 = new class88();
                class281 var19 = new class281(var17.method4675(), var17.field3040, var17.field3043);
                var18.method2184(new Object[] { var19, arg0, arg1 });
                var18.method2185(16);
                class71.method1189(var18);
            }
        }
        this.field4908 = var11;
    }

    @ObfuscatedName("sq.am(IIZZS)V")
    public void method7731(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class303.method2705();
            this.method7732(arg0, arg1, arg3, var5);
            if (!this.method7853() && (arg3 || arg2)) {
                boolean var7 = client.field597 != null;
                if (!var7) {
                    if (arg3) {
                        this.field4923 = arg0;
                        this.field4924 = arg1;
                        this.field4900 = this.field4905;
                        this.field4902 = this.field4919;
                    }
                    if (this.field4900 != -1) {
                        int var8 = arg0 - this.field4923;
                        int var9 = arg1 - this.field4924;
                        this.method7735(this.field4900 - (int) ((float) var8 / this.field4935), this.field4902 + (int) ((float) var9 / this.field4935), false);
                    }
                    break label33;
                }
            }
            this.method7736();
        }
        if (arg3) {
            this.field4925 = var5;
            this.field4926 = arg0;
            this.field4916 = arg1;
        }
    }

    @ObfuscatedName("sq.as(IIZJ)V")
    public void method7732(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4901 == null) {
            this.field4939 = null;
            return;
        }
        int var6 = (int) ((float) this.field4905 + ((float) (arg0 - this.field4912) - (float) this.method7765() * this.field4909 / 2.0F) / this.field4909);
        int var7 = (int) ((float) this.field4919 - ((float) (arg1 - this.field4914) - (float) this.method7803() * this.field4909 / 2.0F) / this.field4909);
        this.field4939 = this.field4901.method4725(var6 + this.field4901.method4766() * 64, var7 + this.field4901.method4735() * 64);
        if (this.field4939 == null || !arg2) {
            return;
        }
        class214 var8 = client.method4579();
        if (client.method3068() && var8.method3796(82) && var8.method3796(81)) {
            int var9 = this.field4939.field3536;
            int var10 = this.field4939.field3538;
            int var11 = this.field4939.field3537;
            class298 var12 = class298.method8119(class296.field3166, client.field521.field1414);
            var12.field3205.method8296(0);
            var12.field3205.method8430(var9);
            var12.field3205.method8346(var11);
            var12.field3205.method8284(var10);
            client.field521.method2669(var12);
            return;
        }
        boolean var13 = true;
        if (this.field4938) {
            int var14 = arg0 - this.field4926;
            int var15 = arg1 - this.field4916;
            if (arg3 - this.field4925 > 500L || var14 < -25 || var14 > 25 || var15 < -25 || var15 > 25) {
                var13 = false;
            }
        }
        if (var13) {
            class298 var16 = class298.method8119(class296.field3143, client.field521.field1414);
            var16.field3205.method8297(this.field4939.method5487());
            client.field521.method2669(var16);
            this.field4925 = 0L;
        }
    }

    @ObfuscatedName("sq.aj(I)V")
    public void method7814() {
        if (Statics.field1456 != null) {
            this.field4909 = this.field4935;
            return;
        }
        if (this.field4909 < this.field4935) {
            this.field4909 = Math.min(this.field4935, this.field4909 / 30.0F + this.field4909);
        }
        if (this.field4909 > this.field4935) {
            this.field4909 = Math.max(this.field4935, this.field4909 - this.field4909 / 30.0F);
        }
    }

    @ObfuscatedName("sq.ag(S)V")
    public void method7734() {
        if (!this.method7853()) {
            return;
        }
        int var1 = this.field4907 - this.field4905;
        int var2 = this.field4887 - this.field4919;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7735(this.field4905 + var1, this.field4919 + var2, true);
        if (this.field4907 == this.field4905 && this.field4919 == this.field4887) {
            this.field4907 = -1;
            this.field4887 = -1;
        }
    }

    @ObfuscatedName("sq.az(IIZI)V")
    public final void method7735(int arg0, int arg1, boolean arg2) {
        this.field4905 = arg0;
        this.field4919 = arg1;
        class303.method2705();
        if (arg2) {
            this.method7736();
        }
    }

    @ObfuscatedName("sq.av(B)V")
    public final void method7736() {
        this.field4924 = -1;
        this.field4923 = -1;
        this.field4902 = -1;
        this.field4900 = -1;
    }

    @ObfuscatedName("sq.ap(B)Z")
    public boolean method7853() {
        return this.field4907 != -1 && this.field4887 != -1;
    }

    @ObfuscatedName("sq.aq(IIIB)Ljs;")
    public class258 method7738(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4899.values().iterator();
        class258 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class258) var4.next();
        } while (!var5.method4790(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("sq.at(IIIZI)V")
    public void method7739(int arg0, int arg1, int arg2, boolean arg3) {
        class258 var5 = this.method7738(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4894;
        }
        boolean var6 = false;
        if (this.field4888 != var5 || arg3) {
            this.field4888 = var5;
            this.method7743(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7746(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("sq.ah(II)V")
    public void method7919(int arg0) {
        class258 var2 = this.method7899(arg0);
        if (var2 != null) {
            this.method7743(var2);
        }
    }

    @ObfuscatedName("sq.ax(I)I")
    public int method7838() {
        return this.field4901 == null ? -1 : this.field4901.method4727();
    }

    @ObfuscatedName("sq.aa(I)Ljs;")
    public class258 method7742() {
        return this.field4901;
    }

    @ObfuscatedName("sq.au(Ljs;I)V")
    public void method7743(class258 arg0) {
        if (this.field4901 == null || this.field4901 != arg0) {
            this.method7876(arg0);
            this.method7746(-1, -1, -1);
        }
    }

    @ObfuscatedName("sq.ae(Ljs;I)V")
    public void method7876(class258 arg0) {
        this.field4901 = arg0;
        this.field4903 = new class260(this.field4898, this.field4897, this.field4891, this.field4922);
        this.field4904.method7709(this.field4901 == null ? null : this.field4901.method4729());
    }

    @ObfuscatedName("sq.ab(Ljs;Lmr;Lmr;ZB)V")
    public void method7856(class258 arg0, class324 arg1, class324 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4901 == null || this.field4901 != arg0) {
            this.method7876(arg0);
        }
        if (!arg3 && this.field4901.method4790(arg1.field3537, arg1.field3536, arg1.field3538)) {
            this.method7746(arg1.field3537, arg1.field3536, arg1.field3538);
        } else {
            this.method7746(arg2.field3537, arg2.field3536, arg2.field3538);
        }
    }

    @ObfuscatedName("sq.ad(IIII)V")
    public void method7746(int arg0, int arg1, int arg2) {
        if (this.field4901 == null) {
            return;
        }
        int[] var4 = this.field4901.method4724(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4901.method4724(this.field4901.method4738(), this.field4901.method4719(), this.field4901.method4739());
        }
        this.method7735(var4[0] - this.field4901.method4766() * 64, var4[1] - this.field4901.method4735() * 64, true);
        this.field4907 = -1;
        this.field4887 = -1;
        this.field4909 = this.method7753(this.field4901.method4732());
        this.field4935 = this.field4909;
        this.field4936 = null;
        this.field4937 = null;
        this.field4903.method4930();
    }

    @ObfuscatedName("sq.ao(IIIIII)V")
    public void method7921(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class524.method8591(var6);
        class524.method8655(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class524.method8582(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4904.method7712();
        if (var7 < 100) {
            this.method7752(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4903.method4927()) {
            this.field4903.method4920(this.field4890, this.field4901.method4729(), client.field520);
            if (!this.field4903.method4927()) {
                return;
            }
        }
        if (this.field4940 != null) {
            this.field4920++;
            if (this.field4920 % this.field4886 == 0) {
                this.field4920 = 0;
                this.field4921++;
            }
            if (this.field4921 >= this.field4892 && !this.field4917) {
                this.field4940 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4909));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4909));
        this.field4903.method4922(this.field4905 - var8 / 2, this.field4919 - var9 / 2, var8 / 2 + this.field4905, var9 / 2 + this.field4919, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4933) {
            boolean var10 = false;
            if (arg4 - this.field4934 > 100) {
                this.field4934 = arg4;
                var10 = true;
            }
            this.field4903.method4923(this.field4905 - var8 / 2, this.field4919 - var9 / 2, var8 / 2 + this.field4905, var9 / 2 + this.field4919, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4932, this.field4940, this.field4920, this.field4886, var10);
        }
        this.method7804(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method3068() && this.field4906 && this.field4939 != null) {
            this.field4896.method6810("Coord: " + this.field4939, class524.field5144 + 10, class524.field5142 + 20, 16776960, -1);
        }
        this.field4928 = var8;
        this.field4911 = var9;
        this.field4912 = arg0;
        this.field4914 = arg1;
        class524.method8577(var6);
    }

    @ObfuscatedName("sq.ac(IIIIIII)Z")
    public boolean method7748(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4941 == null) {
            return true;
        } else if (this.field4941.field5169 != arg0 || this.field4941.field5174 != arg1) {
            return true;
        } else if (this.field4903.field2924 != this.field4942) {
            return true;
        } else if (client.field793 != this.field4945) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("sq.ak(IIIIIII)V")
    public void method7804(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1456 == null) {
            return;
        }
        int var7 = 512 / (this.field4903.field2924 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7788() - arg4 / 2 - var7;
        int var14 = this.method7763() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4903.field2924 * (var7 + var13 - this.field4943);
        int var16 = arg1 - this.field4903.field2924 * (var7 - (var14 - this.field4944));
        if (this.method7748(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4941 != null && this.field4941.field5169 == var11 && this.field4941.field5174 == var12) {
                Arrays.fill(this.field4941.field5168, 0);
            } else {
                this.field4941 = new class528(var11, var12);
            }
            this.field4943 = this.method7788() - arg4 / 2 - var7;
            this.field4944 = this.method7763() - arg5 / 2 - var7;
            this.field4942 = this.field4903.field2924;
            Statics.field1456.method6322(this.field4943, this.field4944, this.field4941, (float) this.field4942 / var10);
            this.field4945 = client.field793;
            var15 = arg0 - this.field4903.field2924 * (var7 + var13 - this.field4943);
            var16 = arg1 - this.field4903.field2924 * (var7 - (var14 - this.field4944));
        }
        class524.method8581(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4941.method8694(var15, var16, 192);
        } else {
            this.field4941.method8813(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("sq.an(IIIII)V")
    public void method7817(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4904.method7711()) {
            return;
        }
        if (!this.field4903.method4927()) {
            this.field4903.method4920(this.field4890, this.field4901.method4729(), client.field520);
            if (!this.field4903.method4927()) {
                return;
            }
        }
        this.field4903.method4924(arg0, arg1, arg2, arg3, this.field4940, this.field4920, this.field4886);
    }

    @ObfuscatedName("sq.af(II)V")
    public void method7751(int arg0) {
        this.field4935 = this.method7753(arg0);
    }

    @ObfuscatedName("sq.ai(IIIIIB)V")
    public void method7752(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class524.method8582(arg0, arg1, arg2, arg3, -16777216);
        class524.method8574(var7 - 152, var8, 304, 34, -65536);
        class524.method8582(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4896.method6813(class353.field3912, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("sq.al(II)F")
    public float method7753(int arg0) {
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

    @ObfuscatedName("sq.bd(I)I")
    public int method7754() {
        if ((double) this.field4935 == 1.0D) {
            return 25;
        } else if ((double) this.field4935 == 1.5D) {
            return 37;
        } else if ((double) this.field4935 == 2.0D) {
            return 50;
        } else if ((double) this.field4935 == 3.0D) {
            return 75;
        } else if ((double) this.field4935 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("sq.bb(S)V")
    public void method7819() {
        this.field4904.method7710();
    }

    @ObfuscatedName("sq.bn(B)Z")
    public boolean method7756() {
        return this.field4904.method7711();
    }

    @ObfuscatedName("sq.ba(II)Ljs;")
    public class258 method7899(int arg0) {
        Iterator var2 = this.field4899.values().iterator();
        class258 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class258) var2.next();
        } while (var3.method4727() != arg0);
        return var3;
    }

    @ObfuscatedName("sq.bf(IIB)V")
    public void method7758(int arg0, int arg1) {
        if (this.field4901 != null && this.field4901.method4723(arg0, arg1)) {
            this.field4907 = arg0 - this.field4901.method4766() * 64;
            this.field4887 = arg1 - this.field4901.method4735() * 64;
        }
    }

    @ObfuscatedName("sq.bs(III)V")
    public void method7759(int arg0, int arg1) {
        if (this.field4901 != null) {
            this.method7735(arg0 - this.field4901.method4766() * 64, arg1 - this.field4901.method4735() * 64, true);
            this.field4907 = -1;
            this.field4887 = -1;
        }
    }

    @ObfuscatedName("sq.bp(IIIB)V")
    public void method7760(int arg0, int arg1, int arg2) {
        if (this.field4901 != null) {
            int[] var4 = this.field4901.method4724(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7758(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("sq.bv(IIII)V")
    public void method7761(int arg0, int arg1, int arg2) {
        if (this.field4901 != null) {
            int[] var4 = this.field4901.method4724(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7759(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("sq.bq(I)I")
    public int method7788() {
        return this.field4901 == null ? -1 : this.field4905 + this.field4901.method4766() * 64;
    }

    @ObfuscatedName("sq.bo(I)I")
    public int method7763() {
        return this.field4901 == null ? -1 : this.field4919 + this.field4901.method4735() * 64;
    }

    @ObfuscatedName("sq.br(I)Lmr;")
    public class324 method7764() {
        return this.field4901 == null ? null : this.field4901.method4725(this.method7788(), this.method7763());
    }

    @ObfuscatedName("sq.bw(I)I")
    public int method7765() {
        return this.field4928;
    }

    @ObfuscatedName("sq.be(I)I")
    public int method7803() {
        return this.field4911;
    }

    @ObfuscatedName("sq.bc(IB)V")
    public void method7835(int arg0) {
        if (arg0 >= 1) {
            this.field4892 = arg0;
        }
    }

    @ObfuscatedName("sq.bi(I)V")
    public void method7755() {
        this.field4892 = 3;
    }

    @ObfuscatedName("sq.bu(II)V")
    public void method7769(int arg0) {
        if (arg0 >= 1) {
            this.field4886 = arg0;
        }
    }

    @ObfuscatedName("sq.bk(B)V")
    public void method7770() {
        this.field4886 = 50;
    }

    @ObfuscatedName("sq.bz(ZB)V")
    public void method7771(boolean arg0) {
        this.field4917 = arg0;
    }

    @ObfuscatedName("sq.bx(II)V")
    public void method7772(int arg0) {
        this.field4940 = new HashSet();
        this.field4940.add(arg0);
        this.field4921 = 0;
        this.field4920 = 0;
    }

    @ObfuscatedName("sq.bh(IB)V")
    public void method7773(int arg0) {
        this.field4940 = new HashSet();
        this.field4921 = 0;
        this.field4920 = 0;
        for (int var2 = 0; var2 < Statics.field436; var2++) {
            if (class188.method3780(var2) != null && class188.method3780(var2).field1933 == arg0) {
                this.field4940.add(class188.method3780(var2).field1921);
            }
        }
    }

    @ObfuscatedName("sq.bm(I)V")
    public void method7774() {
        this.field4940 = null;
    }

    @ObfuscatedName("sq.bl(ZI)V")
    public void method7775(boolean arg0) {
        this.field4933 = !arg0;
    }

    @ObfuscatedName("sq.bt(IZB)V")
    public void method7776(int arg0, boolean arg1) {
        if (arg1) {
            this.field4929.remove(arg0);
        } else {
            this.field4929.add(arg0);
        }
        this.method7781();
    }

    @ObfuscatedName("sq.by(IZB)V")
    public void method7777(int arg0, boolean arg1) {
        if (arg1) {
            this.field4930.remove(arg0);
        } else {
            this.field4930.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field436; var3++) {
            if (class188.method3780(var3) != null && class188.method3780(var3).field1933 == arg0) {
                int var4 = class188.method3780(var3).field1921;
                if (arg1) {
                    this.field4931.remove(var4);
                } else {
                    this.field4931.add(var4);
                }
            }
        }
        this.method7781();
    }

    @ObfuscatedName("sq.bg(I)Z")
    public boolean method7861() {
        return !this.field4933;
    }

    @ObfuscatedName("sq.bj(II)Z")
    public boolean method7779(int arg0) {
        return !this.field4929.contains(arg0);
    }

    @ObfuscatedName("sq.ct(II)Z")
    public boolean method7780(int arg0) {
        return !this.field4930.contains(arg0);
    }

    @ObfuscatedName("sq.cf(B)V")
    public void method7781() {
        this.field4932.clear();
        this.field4932.addAll(this.field4929);
        this.field4932.addAll(this.field4931);
    }

    @ObfuscatedName("sq.cz(IIIIIII)V")
    public void method7782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4904.method7711()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4909));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4909));
        List var9 = this.field4903.method4953(this.field4905 - var7 / 2 - 1, this.field4919 - var8 / 2 - 1, var7 / 2 + this.field4905 + 1, var8 / 2 + this.field4919 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class276 var11 = (class276) var10.next();
            class188 var12 = class188.method3780(var11.method4675());
            var13 = false;
            for (int var14 = this.field4910.length - 1; var14 >= 0; var14--) {
                if (var12.field1912[var14] != null) {
                    client.method3229(var12.field1912[var14], var12.field1922, this.field4910[var14], var11.method4675(), var11.field3040.method5487(), var11.field3043.method5487());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("sq.cb(ILmr;B)Lmr;")
    public class324 method7783(int arg0, class324 arg1) {
        if (!this.field4904.method7711()) {
            return null;
        } else if (!this.field4903.method4927()) {
            return null;
        } else if (this.field4901.method4723(arg1.field3536, arg1.field3538)) {
            HashMap var3 = this.field4903.method4928();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class276 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class276 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3043;
                    }
                    var8 = (class276) var7.next();
                    int var9 = var8.field3043.field3536 - arg1.field3536;
                    int var10 = var8.field3043.field3538 - arg1.field3538;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3043;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("sq.cs(IILmr;Lmr;B)V")
    public void method7784(int arg0, int arg1, class324 arg2, class324 arg3) {
        class88 var5 = new class88();
        class281 var6 = new class281(arg1, arg2, arg3);
        var5.method2184(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2185(10);
                break;
            case 1009:
                var5.method2185(11);
                break;
            case 1010:
                var5.method2185(12);
                break;
            case 1011:
                var5.method2185(13);
                break;
            case 1012:
                var5.method2185(14);
        }
        class71.method1189(var5);
    }

    @ObfuscatedName("sq.cj(S)Lkv;")
    public class276 method7785() {
        if (!this.field4904.method7711()) {
            return null;
        } else if (this.field4903.method4927()) {
            HashMap var1 = this.field4903.method4928();
            this.field4936 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4936.addAll(var3);
            }
            this.field4937 = this.field4936.iterator();
            return this.method7786();
        } else {
            return null;
        }
    }

    @ObfuscatedName("sq.cn(I)Lkv;")
    public class276 method7786() {
        if (this.field4937 == null) {
            return null;
        }
        class276 var1;
        do {
            if (!this.field4937.hasNext()) {
                return null;
            }
            var1 = (class276) this.field4937.next();
        } while (var1.method4675() == -1);
        return var1;
    }
}
