package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("tu")
public class class498 {

    @ObfuscatedName("tu.ar")
    public class374 field4979;

    @ObfuscatedName("tu.ab")
    public class374 field4959;

    @ObfuscatedName("tu.am")
    public class374 field4936;

    @ObfuscatedName("tu.av")
    public static final class500 field4955 = class500.field5001;

    @ObfuscatedName("tu.ag")
    public static final class500 field4938 = class500.field4998;

    @ObfuscatedName("tu.aa")
    public static final class500 field4939 = class500.field5000;

    @ObfuscatedName("tu.ap")
    public class409 field4976;

    @ObfuscatedName("tu.ay")
    public HashMap field4941;

    @ObfuscatedName("tu.as")
    public class543[] field4942;

    @ObfuscatedName("tu.aj")
    public HashMap field4978;

    @ObfuscatedName("tu.an")
    public class271 field4934;

    @ObfuscatedName("tu.au")
    public class271 field4945;

    @ObfuscatedName("tu.ai")
    public class271 field4946;

    @ObfuscatedName("tu.ae")
    public class273 field4947;

    @ObfuscatedName("tu.aw")
    public class497 field4968;

    @ObfuscatedName("tu.aq")
    public int field4940;

    @ObfuscatedName("tu.az")
    public int field4957;

    @ObfuscatedName("tu.at")
    public int field4951 = -1;

    @ObfuscatedName("tu.af")
    public int field4952 = -1;

    @ObfuscatedName("tu.ad")
    public float field4953;

    @ObfuscatedName("tu.bn")
    public float field4954;

    @ObfuscatedName("tu.bk")
    public int field4943 = -1;

    @ObfuscatedName("tu.by")
    public int field4956 = -1;

    @ObfuscatedName("tu.bd")
    public int field4987 = -1;

    @ObfuscatedName("tu.be")
    public int field4958 = -1;

    @ObfuscatedName("tu.bv")
    public int field4989 = 3;

    @ObfuscatedName("tu.ba")
    public int field4960 = 50;

    @ObfuscatedName("tu.bz")
    public boolean field4967 = false;

    @ObfuscatedName("tu.bb")
    public HashSet field4962 = null;

    @ObfuscatedName("tu.bo")
    public int field4963 = -1;

    @ObfuscatedName("tu.bp")
    public int field4964 = -1;

    @ObfuscatedName("tu.bt")
    public int field4965 = -1;

    @ObfuscatedName("tu.bm")
    public int field4935 = -1;

    @ObfuscatedName("tu.br")
    public int field4937 = -1;

    @ObfuscatedName("tu.bs")
    public int field4930 = -1;

    @ObfuscatedName("tu.bc")
    public long field4950;

    @ObfuscatedName("tu.bu")
    public int field4970;

    @ObfuscatedName("tu.bf")
    public int field4971;

    @ObfuscatedName("tu.bh")
    public boolean field4972 = true;

    @ObfuscatedName("tu.bj")
    public HashSet field4973 = new HashSet();

    @ObfuscatedName("tu.bx")
    public HashSet field4974 = new HashSet();

    @ObfuscatedName("tu.bi")
    public HashSet field4966 = new HashSet();

    @ObfuscatedName("tu.bq")
    public HashSet field4985 = new HashSet();

    @ObfuscatedName("tu.bw")
    public boolean field4977 = false;

    @ObfuscatedName("tu.ce")
    public int field4961 = 0;

    @ObfuscatedName("tu.cw")
    public final int[] field4988 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("tu.co")
    public List field4980;

    @ObfuscatedName("tu.cc")
    public Iterator field4981;

    @ObfuscatedName("tu.cg")
    public HashSet field4982 = new HashSet();

    @ObfuscatedName("tu.cq")
    public class337 field4983 = null;

    @ObfuscatedName("tu.cy")
    public boolean field4984 = false;

    @ObfuscatedName("tu.cz")
    public class544 field4944;

    @ObfuscatedName("tu.cp")
    public int field4986;

    @ObfuscatedName("tu.cb")
    public int field4948 = -1;

    @ObfuscatedName("tu.cn")
    public int field4969 = -1;

    @ObfuscatedName("tu.ck")
    public int field4975 = -1;

    @ObfuscatedName("tu.ac(Lom;Lom;Lom;Lpu;Ljava/util/HashMap;[Lun;B)V")
    public void method7849(class374 arg0, class374 arg1, class374 arg2, class409 arg3, HashMap arg4, class543[] arg5) {
        this.field4942 = arg5;
        this.field4979 = arg0;
        this.field4959 = arg1;
        this.field4936 = arg2;
        this.field4976 = arg3;
        this.field4941 = new HashMap();
        this.field4941.put(class268.field2908, arg4.get(field4955));
        this.field4941.put(class268.field2901, arg4.get(field4938));
        this.field4941.put(class268.field2902, arg4.get(field4939));
        this.field4968 = new class497(arg0);
        int var7 = this.field4979.method6279(class290.field3096.field3093);
        int[] var8 = this.field4979.method6272(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field4978 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class530 var11 = new class530(this.field4979.method6342(var7, var8[var10]));
            class271 var12 = new class271();
            var12.method4851(var11, var8[var10], client.field528 >= 217);
            this.field4978.put(var12.method4859(), var12);
            if (var12.method4858()) {
                this.field4934 = var12;
            }
        }
        this.method7864(this.field4934);
        this.field4946 = null;
    }

    @ObfuscatedName("tu.al(I)V")
    public void method7914() {
        class272.field2947.method5268(5);
    }

    @ObfuscatedName("tu.ak(IIZIIIII)V")
    public void method7851(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4968.method7845()) {
            return;
        }
        this.method7854();
        this.method7855();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4953));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4953));
        List var10 = this.field4947.method5058(this.field4940 - var8 / 2 - 1, this.field4957 - var9 / 2 - 1, var8 / 2 + this.field4940 + 1, var9 / 2 + this.field4957 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class289 var13 = (class289) var12.next();
            var11.add(var13);
            class90 var14 = new class90();
            class294 var15 = new class294(var13.method4809(), var13.field3085, var13.field3086);
            var14.method2219(new Object[] { var15, arg0, arg1 });
            if (this.field4982.contains(var13)) {
                var14.method2230(17);
            } else {
                var14.method2230(15);
            }
            class72.method2004(var14);
        }
        Iterator var16 = this.field4982.iterator();
        while (var16.hasNext()) {
            class289 var17 = (class289) var16.next();
            if (!var11.contains(var17)) {
                class90 var18 = new class90();
                class294 var19 = new class294(var17.method4809(), var17.field3085, var17.field3086);
                var18.method2219(new Object[] { var19, arg0, arg1 });
                var18.method2230(16);
                class72.method2004(var18);
            }
        }
        this.field4982 = var11;
    }

    @ObfuscatedName("tu.ax(IIZZI)V")
    public void method7852(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class316.method6401();
            this.method7853(arg0, arg1, arg3, var5);
            if (!this.method7973() && (arg3 || arg2)) {
                boolean var7 = client.field702 != null;
                if (!var7) {
                    if (arg3) {
                        this.field4937 = arg0;
                        this.field4930 = arg1;
                        this.field4965 = this.field4940;
                        this.field4935 = this.field4957;
                    }
                    if (this.field4965 != -1) {
                        int var8 = arg0 - this.field4937;
                        int var9 = arg1 - this.field4930;
                        this.method7856(this.field4965 - (int) ((float) var8 / this.field4954), this.field4935 + (int) ((float) var9 / this.field4954), false);
                    }
                    break label33;
                }
            }
            this.method7948();
        }
        if (arg3) {
            this.field4950 = var5;
            this.field4970 = arg0;
            this.field4971 = arg1;
        }
    }

    @ObfuscatedName("tu.ao(IIZJ)V")
    public void method7853(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4945 == null) {
            this.field4983 = null;
            return;
        }
        int var6 = (int) ((float) this.field4940 + ((float) (arg0 - this.field4987) - (float) this.method7857() * this.field4953 / 2.0F) / this.field4953);
        int var7 = (int) ((float) this.field4957 - ((float) (arg1 - this.field4958) - (float) this.method8028() * this.field4953 / 2.0F) / this.field4953);
        this.field4983 = this.field4945.method4894(var6 + this.field4945.method4864() * 64, var7 + this.field4945.method4866() * 64);
        if (this.field4983 == null || !arg2) {
            return;
        }
        class227 var8 = client.method5171();
        boolean var9 = client.field776 >= 2;
        if (var9 && var8.method3924(82) && var8.method3924(81)) {
            int var10 = this.field4983.field3578;
            int var11 = this.field4983.field3574;
            int var12 = this.field4983.field3575;
            class311 var13 = class311.method2978(class309.field3155, client.field579.field1425);
            var13.field3250.method8405(var10);
            var13.field3250.method8506(var11);
            var13.field3250.method8351(0);
            var13.field3250.method8485(var12);
            client.field579.method2682(var13);
            return;
        }
        boolean var14 = true;
        if (this.field4972) {
            int var15 = arg0 - this.field4970;
            int var16 = arg1 - this.field4971;
            if (arg3 - this.field4950 > 500L || var15 < -25 || var15 > 25 || var16 < -25 || var16 > 25) {
                var14 = false;
            }
        }
        if (var14) {
            class311 var17 = class311.method2978(class309.field3177, client.field579.field1425);
            var17.field3250.method8351(this.field4983.method5621());
            client.field579.method2682(var17);
            this.field4950 = 0L;
        }
    }

    @ObfuscatedName("tu.ah(I)V")
    public void method7854() {
        if (Statics.field2872 != null) {
            this.field4953 = this.field4954;
            return;
        }
        if (this.field4953 < this.field4954) {
            this.field4953 = Math.min(this.field4954, this.field4953 / 30.0F + this.field4953);
        }
        if (this.field4953 > this.field4954) {
            this.field4953 = Math.max(this.field4954, this.field4953 - this.field4953 / 30.0F);
        }
    }

    @ObfuscatedName("tu.ar(B)V")
    public void method7855() {
        if (!this.method7973()) {
            return;
        }
        int var1 = this.field4951 - this.field4940;
        int var2 = this.field4952 - this.field4957;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7856(this.field4940 + var1, this.field4957 + var2, true);
        if (this.field4951 == this.field4940 && this.field4957 == this.field4952) {
            this.field4951 = -1;
            this.field4952 = -1;
        }
    }

    @ObfuscatedName("tu.ab(IIZI)V")
    public final void method7856(int arg0, int arg1, boolean arg2) {
        this.field4940 = arg0;
        this.field4957 = arg1;
        class316.method6401();
        if (arg2) {
            this.method7948();
        }
    }

    @ObfuscatedName("tu.am(B)V")
    public final void method7948() {
        this.field4930 = -1;
        this.field4937 = -1;
        this.field4935 = -1;
        this.field4965 = -1;
    }

    @ObfuscatedName("tu.av(I)Z")
    public boolean method7973() {
        return this.field4951 != -1 && this.field4952 != -1;
    }

    @ObfuscatedName("tu.ag(IIIB)Lkz;")
    public class271 method7859(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4978.values().iterator();
        class271 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class271) var4.next();
        } while (!var5.method4893(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("tu.aa(IIIZB)V")
    public void method7860(int arg0, int arg1, int arg2, boolean arg3) {
        class271 var5 = this.method7859(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4934;
        }
        boolean var6 = false;
        if (this.field4946 != var5 || arg3) {
            this.field4946 = var5;
            this.method7864(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7989(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("tu.ap(IB)V")
    public void method7861(int arg0) {
        class271 var2 = this.method7878(arg0);
        if (var2 != null) {
            this.method7864(var2);
        }
    }

    @ObfuscatedName("tu.ay(B)I")
    public int method7862() {
        return this.field4945 == null ? -1 : this.field4945.method4857();
    }

    @ObfuscatedName("tu.as(I)Lkz;")
    public class271 method7863() {
        return this.field4945;
    }

    @ObfuscatedName("tu.aj(Lkz;B)V")
    public void method7864(class271 arg0) {
        if (this.field4945 == null || this.field4945 != arg0) {
            this.method7886(arg0);
            this.method7989(-1, -1, -1);
        }
    }

    @ObfuscatedName("tu.an(Lkz;B)V")
    public void method7886(class271 arg0) {
        this.field4945 = arg0;
        this.field4947 = new class273(this.field4942, this.field4941, this.field4959, this.field4936);
        this.field4968.method7846(this.field4945 == null ? null : this.field4945.method4859());
    }

    @ObfuscatedName("tu.au(Lkz;Lmo;Lmo;ZI)V")
    public void method7866(class271 arg0, class337 arg1, class337 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4945 == null || this.field4945 != arg0) {
            this.method7886(arg0);
        }
        if (!arg3 && this.field4945.method4893(arg1.field3575, arg1.field3578, arg1.field3574)) {
            this.method7989(arg1.field3575, arg1.field3578, arg1.field3574);
        } else {
            this.method7989(arg2.field3575, arg2.field3578, arg2.field3574);
        }
    }

    @ObfuscatedName("tu.ai(IIII)V")
    public void method7989(int arg0, int arg1, int arg2) {
        if (this.field4945 == null) {
            return;
        }
        int[] var4 = this.field4945.method4854(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4945.method4854(this.field4945.method4869(), this.field4945.method4868(), this.field4945.method4870());
        }
        this.method7856(var4[0] - this.field4945.method4864() * 64, var4[1] - this.field4945.method4866() * 64, true);
        this.field4951 = -1;
        this.field4952 = -1;
        this.field4953 = this.method7874(this.field4945.method4863());
        this.field4954 = this.field4953;
        this.field4980 = null;
        this.field4981 = null;
        this.field4947.method5068();
    }

    @ObfuscatedName("tu.ae(IIIIII)V")
    public void method7868(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class540.method8696(var6);
        class540.method8694(arg0, arg1, arg0 + arg2, arg1 + arg3);
        int var7 = this.field4968.method7835();
        if (var7 < 100) {
            this.method7873(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4947.method5060()) {
            this.field4947.method5053(this.field4979, this.field4945.method4859(), client.field522, client.field528 >= 217);
            if (!this.field4947.method5060()) {
                return;
            }
        }
        class540.method8758(arg0, arg1, arg2, arg3, this.field4947.method5061());
        if (this.field4962 != null) {
            this.field4964++;
            if (this.field4964 % this.field4960 == 0) {
                this.field4964 = 0;
                this.field4963++;
            }
            if (this.field4963 >= this.field4989 && !this.field4967) {
                this.field4962 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4953));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4953));
        this.field4947.method5054(this.field4940 - var8 / 2, this.field4957 - var9 / 2, var8 / 2 + this.field4940, var9 / 2 + this.field4957, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4977) {
            boolean var10 = false;
            if (arg4 - this.field4961 > 100) {
                this.field4961 = arg4;
                var10 = true;
            }
            this.field4947.method5056(this.field4940 - var8 / 2, this.field4957 - var9 / 2, var8 / 2 + this.field4940, var9 / 2 + this.field4957, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4985, this.field4962, this.field4964, this.field4960, var10);
        }
        this.method7927(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method2247() && this.field4984 && this.field4983 != null) {
            this.field4976.method6954("Coord: " + this.field4983, class540.field5214 + 10, class540.field5213 + 20, 16776960, -1);
        }
        this.field4943 = var8;
        this.field4956 = var9;
        this.field4987 = arg0;
        this.field4958 = arg1;
        class540.method8697(var6);
    }

    @ObfuscatedName("tu.aw(IIIIIIB)Z")
    public boolean method8017(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4944 == null) {
            return true;
        } else if (this.field4944.field5237 != arg0 || this.field4944.field5239 != arg1) {
            return true;
        } else if (this.field4947.field2969 != this.field4986) {
            return true;
        } else if (client.field815 != this.field4975) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("tu.aq(IIIIIII)V")
    public void method7927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field2872 == null) {
            return;
        }
        int var7 = 512 / (this.field4947.field2969 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7883() - arg4 / 2 - var7;
        int var14 = this.method7877() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4947.field2969 * (var7 + var13 - this.field4948);
        int var16 = arg1 - this.field4947.field2969 * (var7 - (var14 - this.field4969));
        if (this.method8017(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4944 != null && this.field4944.field5237 == var11 && this.field4944.field5239 == var12) {
                Arrays.fill(this.field4944.field5235, 0);
            } else {
                this.field4944 = new class544(var11, var12);
            }
            this.field4948 = this.method7883() - arg4 / 2 - var7;
            this.field4969 = this.method7877() - arg5 / 2 - var7;
            this.field4986 = this.field4947.field2969;
            Statics.field2872.method6473(this.field4948, this.field4969, this.field4944, (float) this.field4986 / var10);
            this.field4975 = client.field815;
            var15 = arg0 - this.field4947.field2969 * (var7 + var13 - this.field4948);
            var16 = arg1 - this.field4947.field2969 * (var7 - (var14 - this.field4969));
        }
        class540.method8701(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4944.method8833(var15, var16, 192);
        } else {
            this.field4944.method8858(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("tu.az(IIIII)V")
    public void method7871(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4968.method7845()) {
            return;
        }
        if (!this.field4947.method5060()) {
            this.field4947.method5053(this.field4979, this.field4945.method4859(), client.field522, client.field528 >= 217);
            if (!this.field4947.method5060()) {
                return;
            }
        }
        this.field4947.method5072(arg0, arg1, arg2, arg3, this.field4962, this.field4964, this.field4960);
    }

    @ObfuscatedName("tu.at(II)V")
    public void method7872(int arg0) {
        this.field4954 = this.method7874(arg0);
    }

    @ObfuscatedName("tu.af(IIIIII)V")
    public void method7873(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class540.method8758(arg0, arg1, arg2, arg3, -16777216);
        class540.method8763(var7 - 152, var8, 304, 34, -65536);
        class540.method8758(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4976.method6963(class367.field3989, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("tu.ad(IB)F")
    public float method7874(int arg0) {
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

    @ObfuscatedName("tu.bn(B)I")
    public int method8019() {
        if ((double) this.field4954 == 1.0D) {
            return 25;
        } else if ((double) this.field4954 == 1.5D) {
            return 37;
        } else if ((double) this.field4954 == 2.0D) {
            return 50;
        } else if ((double) this.field4954 == 3.0D) {
            return 75;
        } else if ((double) this.field4954 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("tu.bk(I)V")
    public void method7876() {
        this.field4968.method7833();
    }

    @ObfuscatedName("tu.by(S)Z")
    public boolean method7952() {
        return this.field4968.method7845();
    }

    @ObfuscatedName("tu.bd(IB)Lkz;")
    public class271 method7878(int arg0) {
        Iterator var2 = this.field4978.values().iterator();
        class271 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class271) var2.next();
        } while (var3.method4857() != arg0);
        return var3;
    }

    @ObfuscatedName("tu.be(III)V")
    public void method7879(int arg0, int arg1) {
        if (this.field4945 != null && this.field4945.method4874(arg0, arg1)) {
            this.field4951 = arg0 - this.field4945.method4864() * 64;
            this.field4952 = arg1 - this.field4945.method4866() * 64;
        }
    }

    @ObfuscatedName("tu.bv(IIB)V")
    public void method7880(int arg0, int arg1) {
        if (this.field4945 != null) {
            this.method7856(arg0 - this.field4945.method4864() * 64, arg1 - this.field4945.method4866() * 64, true);
            this.field4951 = -1;
            this.field4952 = -1;
        }
    }

    @ObfuscatedName("tu.ba(IIIB)V")
    public void method7881(int arg0, int arg1, int arg2) {
        if (this.field4945 != null) {
            int[] var4 = this.field4945.method4854(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7879(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tu.bz(IIIB)V")
    public void method7882(int arg0, int arg1, int arg2) {
        if (this.field4945 != null) {
            int[] var4 = this.field4945.method4854(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7880(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("tu.bb(I)I")
    public int method7883() {
        return this.field4945 == null ? -1 : this.field4940 + this.field4945.method4864() * 64;
    }

    @ObfuscatedName("tu.bo(B)I")
    public int method7877() {
        return this.field4945 == null ? -1 : this.field4957 + this.field4945.method4866() * 64;
    }

    @ObfuscatedName("tu.bp(I)Lmo;")
    public class337 method7885() {
        return this.field4945 == null ? null : this.field4945.method4894(this.method7883(), this.method7877());
    }

    @ObfuscatedName("tu.bt(I)I")
    public int method7857() {
        return this.field4943;
    }

    @ObfuscatedName("tu.bm(I)I")
    public int method8028() {
        return this.field4956;
    }

    @ObfuscatedName("tu.br(IS)V")
    public void method7984(int arg0) {
        if (arg0 >= 1) {
            this.field4989 = arg0;
        }
    }

    @ObfuscatedName("tu.bs(I)V")
    public void method7915() {
        this.field4989 = 3;
    }

    @ObfuscatedName("tu.bc(II)V")
    public void method7869(int arg0) {
        if (arg0 >= 1) {
            this.field4960 = arg0;
        }
    }

    @ObfuscatedName("tu.bu(I)V")
    public void method7921() {
        this.field4960 = 50;
    }

    @ObfuscatedName("tu.bf(ZI)V")
    public void method7892(boolean arg0) {
        this.field4967 = arg0;
    }

    @ObfuscatedName("tu.bh(II)V")
    public void method7893(int arg0) {
        this.field4962 = new HashSet();
        this.field4962.add(arg0);
        this.field4963 = 0;
        this.field4964 = 0;
    }

    @ObfuscatedName("tu.bl(II)V")
    public void method7894(int arg0) {
        this.field4962 = new HashSet();
        this.field4963 = 0;
        this.field4964 = 0;
        for (int var2 = 0; var2 < Statics.field115; var2++) {
            if (class195.method2991(var2) != null && class195.method2991(var2).field1935 == arg0) {
                this.field4962.add(class195.method2991(var2).field1956);
            }
        }
    }

    @ObfuscatedName("tu.bg(B)V")
    public void method7895() {
        this.field4962 = null;
    }

    @ObfuscatedName("tu.bj(ZB)V")
    public void method7896(boolean arg0) {
        this.field4977 = !arg0;
    }

    @ObfuscatedName("tu.bx(IZI)V")
    public void method8025(int arg0, boolean arg1) {
        if (arg1) {
            this.field4973.remove(arg0);
        } else {
            this.field4973.add(arg0);
        }
        this.method7925();
    }

    @ObfuscatedName("tu.bi(IZB)V")
    public void method7898(int arg0, boolean arg1) {
        if (arg1) {
            this.field4974.remove(arg0);
        } else {
            this.field4974.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field115; var3++) {
            if (class195.method2991(var3) != null && class195.method2991(var3).field1935 == arg0) {
                int var4 = class195.method2991(var3).field1956;
                if (arg1) {
                    this.field4966.remove(var4);
                } else {
                    this.field4966.add(var4);
                }
            }
        }
        this.method7925();
    }

    @ObfuscatedName("tu.bq(I)Z")
    public boolean method7899() {
        return !this.field4977;
    }

    @ObfuscatedName("tu.bw(IB)Z")
    public boolean method7900(int arg0) {
        return !this.field4973.contains(arg0);
    }

    @ObfuscatedName("tu.ce(II)Z")
    public boolean method7901(int arg0) {
        return !this.field4974.contains(arg0);
    }

    @ObfuscatedName("tu.cu(I)V")
    public void method7925() {
        this.field4985.clear();
        this.field4985.addAll(this.field4973);
        this.field4985.addAll(this.field4966);
    }

    @ObfuscatedName("tu.cw(IIIIIII)V")
    public void method7858(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4968.method7845()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4953));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4953));
        List var9 = this.field4947.method5058(this.field4940 - var7 / 2 - 1, this.field4957 - var8 / 2 - 1, var7 / 2 + this.field4940 + 1, var8 / 2 + this.field4957 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class289 var11 = (class289) var10.next();
            class195 var12 = class195.method2991(var11.method4809());
            var13 = false;
            for (int var14 = this.field4988.length - 1; var14 >= 0; var14--) {
                if (var12.field1943[var14] != null) {
                    client.method3011(var12.field1943[var14], var12.field1944, this.field4988[var14], var11.method4809(), var11.field3085.method5621(), var11.field3086.method5621());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("tu.co(ILmo;I)Lmo;")
    public class337 method7904(int arg0, class337 arg1) {
        if (!this.field4968.method7845()) {
            return null;
        } else if (!this.field4947.method5060()) {
            return null;
        } else if (this.field4945.method4874(arg1.field3578, arg1.field3574)) {
            HashMap var3 = this.field4947.method5083();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class289 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class289 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3086;
                    }
                    var8 = (class289) var7.next();
                    int var9 = var8.field3086.field3578 - arg1.field3578;
                    int var10 = var8.field3086.field3574 - arg1.field3574;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3086;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("tu.cc(IILmo;Lmo;I)V")
    public void method7905(int arg0, int arg1, class337 arg2, class337 arg3) {
        class90 var5 = new class90();
        class294 var6 = new class294(arg1, arg2, arg3);
        var5.method2219(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2230(10);
                break;
            case 1009:
                var5.method2230(11);
                break;
            case 1010:
                var5.method2230(12);
                break;
            case 1011:
                var5.method2230(13);
                break;
            case 1012:
                var5.method2230(14);
        }
        class72.method2004(var5);
    }

    @ObfuscatedName("tu.cg(I)Lll;")
    public class289 method7850() {
        if (!this.field4968.method7845()) {
            return null;
        } else if (this.field4947.method5060()) {
            HashMap var1 = this.field4947.method5083();
            this.field4980 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4980.addAll(var3);
            }
            this.field4981 = this.field4980.iterator();
            return this.method8033();
        } else {
            return null;
        }
    }

    @ObfuscatedName("tu.cq(S)Lll;")
    public class289 method8033() {
        if (this.field4981 == null) {
            return null;
        }
        class289 var1;
        do {
            if (!this.field4981.hasNext()) {
                return null;
            }
            var1 = (class289) this.field4981.next();
        } while (var1.method4809() == -1);
        return var1;
    }
}
