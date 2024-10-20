package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("tl")
public class class503 {

    @ObfuscatedName("tl.ab")
    public class379 field5027;

    @ObfuscatedName("tl.aw")
    public class379 field5024;

    @ObfuscatedName("tl.ad")
    public class379 field5025;

    @ObfuscatedName("tl.al")
    public static final class505 field5072 = class505.field5083;

    @ObfuscatedName("tl.as")
    public static final class505 field5052 = class505.field5087;

    @ObfuscatedName("tl.ag")
    public static final class505 field5023 = class505.field5088;

    @ObfuscatedName("tl.ai")
    public class414 field5029;

    @ObfuscatedName("tl.ax")
    public HashMap field5030;

    @ObfuscatedName("tl.ar")
    public class548[] field5046;

    @ObfuscatedName("tl.aj")
    public HashMap field5063;

    @ObfuscatedName("tl.au")
    public class273 field5033;

    @ObfuscatedName("tl.ay")
    public class273 field5034;

    @ObfuscatedName("tl.ap")
    public class273 field5035;

    @ObfuscatedName("tl.av")
    public class275 field5036;

    @ObfuscatedName("tl.aa")
    public class502 field5037;

    @ObfuscatedName("tl.aq")
    public int field5038;

    @ObfuscatedName("tl.am")
    public int field5039;

    @ObfuscatedName("tl.ac")
    public int field5070 = -1;

    @ObfuscatedName("tl.ae")
    public int field5041 = -1;

    @ObfuscatedName("tl.ak")
    public float field5042;

    @ObfuscatedName("tl.bp")
    public float field5043;

    @ObfuscatedName("tl.bz")
    public int field5044 = -1;

    @ObfuscatedName("tl.bc")
    public int field5045 = -1;

    @ObfuscatedName("tl.bf")
    public int field5062 = -1;

    @ObfuscatedName("tl.be")
    public int field5047 = -1;

    @ObfuscatedName("tl.bn")
    public int field5048 = 3;

    @ObfuscatedName("tl.bd")
    public int field5026 = 50;

    @ObfuscatedName("tl.bo")
    public boolean field5050 = false;

    @ObfuscatedName("tl.bx")
    public HashSet field5051 = null;

    @ObfuscatedName("tl.bl")
    public int field5018 = -1;

    @ObfuscatedName("tl.bh")
    public int field5064 = -1;

    @ObfuscatedName("tl.bs")
    public int field5054 = -1;

    @ObfuscatedName("tl.bj")
    public int field5055 = -1;

    @ObfuscatedName("tl.bu")
    public int field5056 = -1;

    @ObfuscatedName("tl.br")
    public int field5073 = -1;

    @ObfuscatedName("tl.bb")
    public long field5058;

    @ObfuscatedName("tl.by")
    public int field5059;

    @ObfuscatedName("tl.bk")
    public int field5060;

    @ObfuscatedName("tl.bt")
    public boolean field5022 = true;

    @ObfuscatedName("tl.bw")
    public HashSet field5061 = new HashSet();

    @ObfuscatedName("tl.bm")
    public HashSet field5021 = new HashSet();

    @ObfuscatedName("tl.ba")
    public HashSet field5028 = new HashSet();

    @ObfuscatedName("tl.bv")
    public HashSet field5065 = new HashSet();

    @ObfuscatedName("tl.bg")
    public boolean field5066 = false;

    @ObfuscatedName("tl.cb")
    public int field5067 = 0;

    @ObfuscatedName("tl.cr")
    public final int[] field5068 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("tl.cy")
    public List field5069;

    @ObfuscatedName("tl.cg")
    public Iterator field5031;

    @ObfuscatedName("tl.cl")
    public HashSet field5071 = new HashSet();

    @ObfuscatedName("tl.cw")
    public class339 field5053 = null;

    @ObfuscatedName("tl.ci")
    public boolean field5032 = false;

    @ObfuscatedName("tl.ct")
    public class549 field5074;

    @ObfuscatedName("tl.cm")
    public int field5075;

    @ObfuscatedName("tl.cd")
    public int field5076 = -1;

    @ObfuscatedName("tl.cc")
    public int field5077 = -1;

    @ObfuscatedName("tl.cn")
    public int field5078 = -1;

    @ObfuscatedName("tl.az(Loc;Loc;Loc;Lpx;Ljava/util/HashMap;[Lvl;B)V")
    public void method7940(class379 arg0, class379 arg1, class379 arg2, class414 arg3, HashMap arg4, class548[] arg5) {
        this.field5046 = arg5;
        this.field5027 = arg0;
        this.field5024 = arg1;
        this.field5025 = arg2;
        this.field5029 = arg3;
        this.field5030 = new HashMap();
        this.field5030.put(class270.field2965, arg4.get(field5072));
        this.field5030.put(class270.field2959, arg4.get(field5052));
        this.field5030.put(class270.field2960, arg4.get(field5023));
        this.field5037 = new class502(arg0);
        int var7 = this.field5027.method6386(class292.field3155.field3160);
        int[] var8 = this.field5027.method6350(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field5063 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class535 var11 = new class535(this.field5027.method6328(var7, var8[var10]));
            class273 var12 = new class273();
            var12.method4882(var11, var8[var10]);
            this.field5063.put(var12.method4904(), var12);
            if (var12.method4885()) {
                this.field5033 = var12;
            }
        }
        this.method7955(this.field5033);
        this.field5035 = null;
    }

    @ObfuscatedName("tl.ah(B)V")
    public void method8145() {
        class274.method3091();
    }

    @ObfuscatedName("tl.af(IIZIIIII)V")
    public void method7944(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field5037.method7929()) {
            return;
        }
        this.method7992();
        this.method7946();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field5042));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field5042));
        List var10 = this.field5036.method5081(this.field5038 - var8 / 2 - 1, this.field5039 - var9 / 2 - 1, var8 / 2 + this.field5038 + 1, var9 / 2 + this.field5039 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class291 var13 = (class291) var12.next();
            var11.add(var13);
            class89 var14 = new class89();
            class296 var15 = new class296(var13.method4842(), var13.field3154, var13.field3149);
            var14.method2211(new Object[] { var15, arg0, arg1 });
            if (this.field5071.contains(var13)) {
                var14.method2206(17);
            } else {
                var14.method2206(15);
            }
            class72.method5202(var14);
        }
        Iterator var16 = this.field5071.iterator();
        while (var16.hasNext()) {
            class291 var17 = (class291) var16.next();
            if (!var11.contains(var17)) {
                class89 var18 = new class89();
                class296 var19 = new class296(var17.method4842(), var17.field3154, var17.field3149);
                var18.method2211(new Object[] { var19, arg0, arg1 });
                var18.method2206(16);
                class72.method5202(var18);
            }
        }
        this.field5071 = var11;
    }

    @ObfuscatedName("tl.at(IIZZB)V")
    public void method8075(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class318.method3596();
            this.method8091(arg0, arg1, arg3, var5);
            if (!this.method7949() && (arg3 || arg2)) {
                boolean var7 = client.field618 != null;
                if (!var7) {
                    if (arg3) {
                        this.field5056 = arg0;
                        this.field5073 = arg1;
                        this.field5054 = this.field5038;
                        this.field5055 = this.field5039;
                    }
                    if (this.field5054 != -1) {
                        int var8 = arg0 - this.field5056;
                        int var9 = arg1 - this.field5073;
                        this.method7947(this.field5054 - (int) ((float) var8 / this.field5043), this.field5055 + (int) ((float) var9 / this.field5043), false);
                    }
                    break label33;
                }
            }
            this.method7948();
        }
        if (arg3) {
            this.field5058 = var5;
            this.field5059 = arg0;
            this.field5060 = arg1;
        }
    }

    @ObfuscatedName("tl.an(IIZJ)V")
    public void method8091(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field5034 == null) {
            this.field5053 = null;
            return;
        }
        int var6 = (int) ((float) this.field5038 + ((float) (arg0 - this.field5062) - (float) this.method7978() * this.field5042 / 2.0F) / this.field5042);
        int var7 = (int) ((float) this.field5039 - ((float) (arg1 - this.field5047) - (float) this.method7979() * this.field5042 / 2.0F) / this.field5042);
        this.field5053 = this.field5034.method4888(var6 + this.field5034.method4897() * 64, var7 + this.field5034.method4899() * 64);
        if (this.field5053 == null || !arg2) {
            return;
        }
        class229 var8 = client.method8333();
        if (client.method6041() && var8.method3974(82) && var8.method3974(81)) {
            client.method3496(this.field5053.field3638, this.field5053.field3640, this.field5053.field3637, false);
            return;
        }
        boolean var9 = true;
        if (this.field5022) {
            int var10 = arg0 - this.field5059;
            int var11 = arg1 - this.field5060;
            if (arg3 - this.field5058 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class313 var12 = class313.method7156(class311.field3217, client.field574.field1438);
            var12.field3318.method8512(this.field5053.method5662());
            client.field574.method2654(var12);
            this.field5058 = 0L;
        }
    }

    @ObfuscatedName("tl.ao(I)V")
    public void method7992() {
        if (Statics.field1622 != null) {
            this.field5042 = this.field5043;
            return;
        }
        if (this.field5042 < this.field5043) {
            this.field5042 = Math.min(this.field5043, this.field5042 / 30.0F + this.field5042);
        }
        if (this.field5042 > this.field5043) {
            this.field5042 = Math.max(this.field5043, this.field5042 - this.field5042 / 30.0F);
        }
    }

    @ObfuscatedName("tl.ab(B)V")
    public void method7946() {
        if (!this.method7949()) {
            return;
        }
        int var1 = this.field5070 - this.field5038;
        int var2 = this.field5041 - this.field5039;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7947(this.field5038 + var1, this.field5039 + var2, true);
        if (this.field5070 == this.field5038 && this.field5041 == this.field5039) {
            this.field5070 = -1;
            this.field5041 = -1;
        }
    }

    @ObfuscatedName("tl.aw(IIZI)V")
    public final void method7947(int arg0, int arg1, boolean arg2) {
        this.field5038 = arg0;
        this.field5039 = arg1;
        class318.method3596();
        if (arg2) {
            this.method7948();
        }
    }

    @ObfuscatedName("tl.ad(I)V")
    public final void method7948() {
        this.field5073 = -1;
        this.field5056 = -1;
        this.field5055 = -1;
        this.field5054 = -1;
    }

    @ObfuscatedName("tl.al(I)Z")
    public boolean method7949() {
        return this.field5070 != -1 && this.field5041 != -1;
    }

    @ObfuscatedName("tl.as(IIII)Lkf;")
    public class273 method7950(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field5063.values().iterator();
        class273 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class273) var4.next();
        } while (!var5.method4928(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("tl.ag(IIIZB)V")
    public void method7951(int arg0, int arg1, int arg2, boolean arg3) {
        class273 var5 = this.method7950(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field5033;
        }
        boolean var6 = false;
        if (this.field5035 != var5 || arg3) {
            this.field5035 = var5;
            this.method7955(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7958(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("tl.ai(IB)V")
    public void method8142(int arg0) {
        class273 var2 = this.method7970(arg0);
        if (var2 != null) {
            this.method7955(var2);
        }
    }

    @ObfuscatedName("tl.ax(B)I")
    public int method7953() {
        return this.field5034 == null ? -1 : this.field5034.method4941();
    }

    @ObfuscatedName("tl.ar(I)Lkf;")
    public class273 method7954() {
        return this.field5034;
    }

    @ObfuscatedName("tl.aj(Lkf;I)V")
    public void method7955(class273 arg0) {
        if (this.field5034 == null || this.field5034 != arg0) {
            this.method7956(arg0);
            this.method7958(-1, -1, -1);
        }
    }

    @ObfuscatedName("tl.au(Lkf;B)V")
    public void method7956(class273 arg0) {
        this.field5034 = arg0;
        this.field5036 = new class275(this.field5046, this.field5030, this.field5024, this.field5025);
        this.field5037.method7922(this.field5034 == null ? null : this.field5034.method4904());
    }

    @ObfuscatedName("tl.ay(Lkf;Lnn;Lnn;ZI)V")
    public void method7982(class273 arg0, class339 arg1, class339 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field5034 == null || this.field5034 != arg0) {
            this.method7956(arg0);
        }
        if (!arg3 && this.field5034.method4928(arg1.field3637, arg1.field3638, arg1.field3640)) {
            this.method7958(arg1.field3637, arg1.field3638, arg1.field3640);
        } else {
            this.method7958(arg2.field3637, arg2.field3638, arg2.field3640);
        }
    }

    @ObfuscatedName("tl.ap(IIII)V")
    public void method7958(int arg0, int arg1, int arg2) {
        if (this.field5034 == null) {
            return;
        }
        int[] var4 = this.field5034.method4946(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field5034.method4946(this.field5034.method4952(), this.field5034.method4889(), this.field5034.method4900());
        }
        this.method7947(var4[0] - this.field5034.method4897() * 64, var4[1] - this.field5034.method4899() * 64, true);
        this.field5070 = -1;
        this.field5041 = -1;
        this.field5042 = this.method7966(this.field5034.method4896());
        this.field5043 = this.field5042;
        this.field5069 = null;
        this.field5031 = null;
        this.field5036.method5077();
    }

    @ObfuscatedName("tl.av(IIIIID)V")
    public void method7959(int arg0, int arg1, int arg2, int arg3, int arg4, double arg5) {
        int[] var8 = new int[4];
        class545.method8790(var8);
        class545.method8801(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var9 = this.field5037.method7937();
        if (var9 < 100) {
            this.method7965(arg0, arg1, arg2, arg3, var9);
            return;
        }
        if (!this.field5036.method5114()) {
            this.field5036.method5076(this.field5027, this.field5034.method4904(), client.field512);
            if (!this.field5036.method5114()) {
                return;
            }
        }
        int var10 = class344.method3012(this.field5036.method5084(), arg5);
        class545.method8784(arg0, arg1, arg2, arg3, var10);
        if (this.field5051 != null) {
            this.field5064++;
            if (this.field5064 % this.field5026 == 0) {
                this.field5064 = 0;
                this.field5018++;
            }
            if (this.field5018 >= this.field5048 && !this.field5050) {
                this.field5051 = null;
            }
        }
        int var11 = (int) Math.ceil((double) ((float) arg2 / this.field5042));
        int var12 = (int) Math.ceil((double) ((float) arg3 / this.field5042));
        this.field5036.method5075(this.field5038 - var11 / 2, this.field5039 - var12 / 2, var11 / 2 + this.field5038, var12 / 2 + this.field5039, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field5066) {
            boolean var13 = false;
            if (arg4 - this.field5067 > 100) {
                this.field5067 = arg4;
                var13 = true;
            }
            this.field5036.method5079(this.field5038 - var11 / 2, this.field5039 - var12 / 2, var11 / 2 + this.field5038, var12 / 2 + this.field5039, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field5065, this.field5051, this.field5064, this.field5026, var13);
        }
        this.method7962(arg0, arg1, arg2, arg3, var11, var12);
        if (client.method6041() && this.field5032 && this.field5053 != null) {
            this.field5029.method7017("Coord: " + this.field5053, class545.field5309 + 10, class545.field5307 + 20, 16776960, -1);
        }
        this.field5044 = var11;
        this.field5045 = var12;
        this.field5062 = arg0;
        this.field5047 = arg1;
        class545.method8842(var8);
    }

    @ObfuscatedName("tl.aa(B)V")
    public void method7960() {
        class274.field3006.method5322();
    }

    @ObfuscatedName("tl.aq(IIIIIIB)Z")
    public boolean method8065(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field5074 == null) {
            return true;
        } else if (this.field5074.field5330 != arg0 || this.field5074.field5331 != arg1) {
            return true;
        } else if (this.field5036.field3029 != this.field5075) {
            return true;
        } else if (client.field809 != this.field5078) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("tl.am(IIIIIII)V")
    public void method7962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1622 == null) {
            return;
        }
        int var7 = 512 / (this.field5036.field3029 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method8144() - arg4 / 2 - var7;
        int var14 = this.method7976() - arg5 / 2 - var7;
        int var15 = arg0 - this.field5036.field3029 * (var7 + var13 - this.field5076);
        int var16 = arg1 - this.field5036.field3029 * (var7 - (var14 - this.field5077));
        if (this.method8065(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field5074 != null && this.field5074.field5330 == var11 && this.field5074.field5331 == var12) {
                Arrays.fill(this.field5074.field5336, 0);
            } else {
                this.field5074 = new class549(var11, var12);
            }
            this.field5076 = this.method8144() - arg4 / 2 - var7;
            this.field5077 = this.method7976() - arg5 / 2 - var7;
            this.field5075 = this.field5036.field3029;
            Statics.field1622.method6530(this.field5076, this.field5077, this.field5074, (float) this.field5075 / var10);
            this.field5078 = client.field809;
            var15 = arg0 - this.field5036.field3029 * (var7 + var13 - this.field5076);
            var16 = arg1 - this.field5036.field3029 * (var7 - (var14 - this.field5077));
        }
        class545.method8783(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field5074.method8980(var15, var16, 192);
        } else {
            this.field5074.method8886(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("tl.ac(IIIII)V")
    public void method7963(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field5037.method7929()) {
            return;
        }
        if (!this.field5036.method5114()) {
            this.field5036.method5076(this.field5027, this.field5034.method4904(), client.field512);
            if (!this.field5036.method5114()) {
                return;
            }
        }
        this.field5036.method5080(arg0, arg1, arg2, arg3, this.field5051, this.field5064, this.field5026);
    }

    @ObfuscatedName("tl.ae(II)V")
    public void method8028(int arg0) {
        this.field5043 = this.method7966(arg0);
    }

    @ObfuscatedName("tl.ak(IIIIII)V")
    public void method7965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class545.method8784(arg0, arg1, arg2, arg3, -16777216);
        class545.method8825(var7 - 152, var8, 304, 34, -65536);
        class545.method8784(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field5029.method7104(class370.field4022, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("tl.bp(II)F")
    public float method7966(int arg0) {
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

    @ObfuscatedName("tl.bz(I)I")
    public int method7967() {
        if ((double) this.field5043 == 1.0D) {
            return 25;
        } else if ((double) this.field5043 == 1.5D) {
            return 37;
        } else if ((double) this.field5043 == 2.0D) {
            return 50;
        } else if ((double) this.field5043 == 3.0D) {
            return 75;
        } else if ((double) this.field5043 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("tl.bc(B)V")
    public void method7968() {
        this.field5037.method7923();
    }

    @ObfuscatedName("tl.bf(I)Z")
    public boolean method8143() {
        return this.field5037.method7929();
    }

    @ObfuscatedName("tl.be(IB)Lkf;")
    public class273 method7970(int arg0) {
        Iterator var2 = this.field5063.values().iterator();
        class273 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class273) var2.next();
        } while (var3.method4941() != arg0);
        return var3;
    }

    @ObfuscatedName("tl.bn(III)V")
    public void method8118(int arg0, int arg1) {
        if (this.field5034 != null && this.field5034.method4886(arg0, arg1)) {
            this.field5070 = arg0 - this.field5034.method4897() * 64;
            this.field5041 = arg1 - this.field5034.method4899() * 64;
        }
    }

    @ObfuscatedName("tl.bd(III)V")
    public void method7986(int arg0, int arg1) {
        if (this.field5034 != null) {
            this.method7947(arg0 - this.field5034.method4897() * 64, arg1 - this.field5034.method4899() * 64, true);
            this.field5070 = -1;
            this.field5041 = -1;
        }
    }

    @ObfuscatedName("tl.bo(IIIB)V")
    public void method7973(int arg0, int arg1, int arg2) {
        if (this.field5034 != null) {
            int[] var4 = this.field5034.method4946(arg0, arg1, arg2);
            if (var4 != null) {
                this.method8118(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tl.bx(IIIB)V")
    public void method7974(int arg0, int arg1, int arg2) {
        if (this.field5034 != null) {
            int[] var4 = this.field5034.method4946(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7986(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tl.bl(I)I")
    public int method8144() {
        return this.field5034 == null ? -1 : this.field5038 + this.field5034.method4897() * 64;
    }

    @ObfuscatedName("tl.bh(I)I")
    public int method7976() {
        return this.field5034 == null ? -1 : this.field5039 + this.field5034.method4899() * 64;
    }

    @ObfuscatedName("tl.bs(I)Lnn;")
    public class339 method7943() {
        return this.field5034 == null ? null : this.field5034.method4888(this.method8144(), this.method7976());
    }

    @ObfuscatedName("tl.bj(B)I")
    public int method7978() {
        return this.field5044;
    }

    @ObfuscatedName("tl.bu(I)I")
    public int method7979() {
        return this.field5045;
    }

    @ObfuscatedName("tl.br(II)V")
    public void method8105(int arg0) {
        if (arg0 >= 1) {
            this.field5048 = arg0;
        }
    }

    @ObfuscatedName("tl.bb(I)V")
    public void method7981() {
        this.field5048 = 3;
    }

    @ObfuscatedName("tl.by(II)V")
    public void method8084(int arg0) {
        if (arg0 >= 1) {
            this.field5026 = arg0;
        }
    }

    @ObfuscatedName("tl.bk(I)V")
    public void method7983() {
        this.field5026 = 50;
    }

    @ObfuscatedName("tl.bt(ZI)V")
    public void method8076(boolean arg0) {
        this.field5050 = arg0;
    }

    @ObfuscatedName("tl.bq(II)V")
    public void method7985(int arg0) {
        this.field5051 = new HashSet();
        this.field5051.add(arg0);
        this.field5018 = 0;
        this.field5064 = 0;
    }

    @ObfuscatedName("tl.bi(IB)V")
    public void method8114(int arg0) {
        this.field5051 = new HashSet();
        this.field5018 = 0;
        this.field5064 = 0;
        for (int var2 = 0; var2 < Statics.field5296; var2++) {
            if (class197.method5698(var2) != null && class197.method5698(var2).field2025 == arg0) {
                this.field5051.add(class197.method5698(var2).field2006);
            }
        }
    }

    @ObfuscatedName("tl.bw(I)V")
    public void method7987() {
        this.field5051 = null;
    }

    @ObfuscatedName("tl.bm(ZI)V")
    public void method7988(boolean arg0) {
        this.field5066 = !arg0;
    }

    @ObfuscatedName("tl.ba(IZI)V")
    public void method7989(int arg0, boolean arg1) {
        if (arg1) {
            this.field5061.remove(arg0);
        } else {
            this.field5061.add(arg0);
        }
        this.method7994();
    }

    @ObfuscatedName("tl.bv(IZI)V")
    public void method7990(int arg0, boolean arg1) {
        if (arg1) {
            this.field5021.remove(arg0);
        } else {
            this.field5021.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field5296; var3++) {
            if (class197.method5698(var3) != null && class197.method5698(var3).field2025 == arg0) {
                int var4 = class197.method5698(var3).field2006;
                if (arg1) {
                    this.field5028.remove(var4);
                } else {
                    this.field5028.add(var4);
                }
            }
        }
        this.method7994();
    }

    @ObfuscatedName("tl.bg(I)Z")
    public boolean method7991() {
        return !this.field5066;
    }

    @ObfuscatedName("tl.cb(IB)Z")
    public boolean method8039(int arg0) {
        return !this.field5061.contains(arg0);
    }

    @ObfuscatedName("tl.cj(II)Z")
    public boolean method7993(int arg0) {
        return !this.field5021.contains(arg0);
    }

    @ObfuscatedName("tl.cr(I)V")
    public void method7994() {
        this.field5065.clear();
        this.field5065.addAll(this.field5061);
        this.field5065.addAll(this.field5028);
    }

    @ObfuscatedName("tl.cy(IIIIIII)V")
    public void method7995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field5037.method7929()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field5042));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field5042));
        List var9 = this.field5036.method5081(this.field5038 - var7 / 2 - 1, this.field5039 - var8 / 2 - 1, var7 / 2 + this.field5038 + 1, var8 / 2 + this.field5039 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class291 var11 = (class291) var10.next();
            class197 var12 = class197.method5698(var11.method4842());
            var13 = false;
            for (int var14 = this.field5068.length - 1; var14 >= 0; var14--) {
                if (var12.field2015[var14] != null) {
                    client.method1975(var12.field2015[var14], var12.field2017, this.field5068[var14], var11.method4842(), var11.field3154.method5662(), var11.field3149.method5662());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("tl.cg(ILnn;I)Lnn;")
    public class339 method7996(int arg0, class339 arg1) {
        if (!this.field5037.method7929()) {
            return null;
        } else if (!this.field5036.method5114()) {
            return null;
        } else if (this.field5034.method4886(arg1.field3638, arg1.field3640)) {
            HashMap var3 = this.field5036.method5085();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class291 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class291 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3149;
                    }
                    var8 = (class291) var7.next();
                    int var9 = var8.field3149.field3638 - arg1.field3638;
                    int var10 = var8.field3149.field3640 - arg1.field3640;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3149;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("tl.cl(IILnn;Lnn;I)V")
    public void method8119(int arg0, int arg1, class339 arg2, class339 arg3) {
        class89 var5 = new class89();
        class296 var6 = new class296(arg1, arg2, arg3);
        var5.method2211(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2206(10);
                break;
            case 1009:
                var5.method2206(11);
                break;
            case 1010:
                var5.method2206(12);
                break;
            case 1011:
                var5.method2206(13);
                break;
            case 1012:
                var5.method2206(14);
        }
        class72.method5202(var5);
    }

    @ObfuscatedName("tl.cw(B)Llh;")
    public class291 method8141() {
        if (!this.field5037.method7929()) {
            return null;
        } else if (this.field5036.method5114()) {
            HashMap var1 = this.field5036.method5085();
            this.field5069 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field5069.addAll(var3);
            }
            this.field5031 = this.field5069.iterator();
            return this.method7999();
        } else {
            return null;
        }
    }

    @ObfuscatedName("tl.ci(B)Llh;")
    public class291 method7999() {
        if (this.field5031 == null) {
            return null;
        }
        class291 var1;
        do {
            if (!this.field5031.hasNext()) {
                return null;
            }
            var1 = (class291) this.field5031.next();
        } while (var1.method4842() == -1);
        return var1;
    }
}
