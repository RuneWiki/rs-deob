package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("rb")
public class class459 {

    @ObfuscatedName("rb.aq")
    public class344 field4817;

    @ObfuscatedName("rb.al")
    public class344 field4818;

    @ObfuscatedName("rb.at")
    public class344 field4819;

    @ObfuscatedName("rb.aa")
    public static final class461 field4844 = class461.field4879;

    @ObfuscatedName("rb.ay")
    public static final class461 field4821 = class461.field4884;

    @ObfuscatedName("rb.ao")
    public static final class461 field4840 = class461.field4881;

    @ObfuscatedName("rb.ax")
    public class379 field4823;

    @ObfuscatedName("rb.ai")
    public HashMap field4824;

    @ObfuscatedName("rb.ag")
    public class502[] field4825;

    @ObfuscatedName("rb.ah")
    public HashMap field4865;

    @ObfuscatedName("rb.av")
    public class249 field4847;

    @ObfuscatedName("rb.ar")
    public class249 field4828;

    @ObfuscatedName("rb.am")
    public class249 field4846;

    @ObfuscatedName("rb.as")
    public class251 field4832;

    @ObfuscatedName("rb.aj")
    public class458 field4831;

    @ObfuscatedName("rb.ak")
    public int field4822;

    @ObfuscatedName("rb.az")
    public int field4833;

    @ObfuscatedName("rb.ad")
    public int field4834 = -1;

    @ObfuscatedName("rb.ae")
    public int field4827 = -1;

    @ObfuscatedName("rb.ap")
    public float field4836;

    @ObfuscatedName("rb.by")
    public float field4837;

    @ObfuscatedName("rb.bb")
    public int field4855 = -1;

    @ObfuscatedName("rb.bi")
    public int field4850 = -1;

    @ObfuscatedName("rb.be")
    public int field4815 = -1;

    @ObfuscatedName("rb.bk")
    public int field4841 = -1;

    @ObfuscatedName("rb.bx")
    public int field4842 = 3;

    @ObfuscatedName("rb.bo")
    public int field4862 = 50;

    @ObfuscatedName("rb.bz")
    public boolean field4839 = false;

    @ObfuscatedName("rb.bm")
    public HashSet field4845 = null;

    @ObfuscatedName("rb.bd")
    public int field4816 = -1;

    @ObfuscatedName("rb.bt")
    public int field4835 = -1;

    @ObfuscatedName("rb.bj")
    public int field4848 = -1;

    @ObfuscatedName("rb.bn")
    public int field4857 = -1;

    @ObfuscatedName("rb.bs")
    public int field4814 = -1;

    @ObfuscatedName("rb.br")
    public int field4851 = -1;

    @ObfuscatedName("rb.bg")
    public long field4852;

    @ObfuscatedName("rb.bu")
    public int field4853;

    @ObfuscatedName("rb.bf")
    public int field4854;

    @ObfuscatedName("rb.bq")
    public boolean field4820 = true;

    @ObfuscatedName("rb.bl")
    public HashSet field4856 = new HashSet();

    @ObfuscatedName("rb.bp")
    public HashSet field4830 = new HashSet();

    @ObfuscatedName("rb.bc")
    public HashSet field4858 = new HashSet();

    @ObfuscatedName("rb.bh")
    public HashSet field4859 = new HashSet();

    @ObfuscatedName("rb.bw")
    public boolean field4860 = false;

    @ObfuscatedName("rb.ce")
    public int field4861 = 0;

    @ObfuscatedName("rb.cs")
    public final int[] field4870 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("rb.cc")
    public List field4863;

    @ObfuscatedName("rb.cn")
    public Iterator field4864;

    @ObfuscatedName("rb.ca")
    public HashSet field4838 = new HashSet();

    @ObfuscatedName("rb.cu")
    public class308 field4866 = null;

    @ObfuscatedName("rb.ck")
    public boolean field4867 = false;

    @ObfuscatedName("rb.cq")
    public class503 field4868;

    @ObfuscatedName("rb.cm")
    public int field4869;

    @ObfuscatedName("rb.cf")
    public int field4849 = -1;

    @ObfuscatedName("rb.cl")
    public int field4871 = -1;

    @ObfuscatedName("rb.cg")
    public int field4872 = -1;

    @ObfuscatedName("rb.af(Lnm;Lnm;Lnm;Lon;Ljava/util/HashMap;[Ltc;I)V")
    public void method7718(class344 arg0, class344 arg1, class344 arg2, class379 arg3, HashMap arg4, class502[] arg5) {
        this.field4825 = arg5;
        this.field4817 = arg0;
        this.field4818 = arg1;
        this.field4819 = arg2;
        this.field4823 = arg3;
        this.field4824 = new HashMap();
        this.field4824.put(class246.field2860, arg4.get(field4844));
        this.field4824.put(class246.field2865, arg4.get(field4821));
        this.field4824.put(class246.field2861, arg4.get(field4840));
        this.field4831 = new class458(arg0);
        int var7 = this.field4817.method6086(class268.field3055.field3058);
        int[] var8 = this.field4817.method6074(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field4865 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class489 var11 = new class489(this.field4817.method6090(var7, var8[var10]));
            class249 var12 = new class249();
            var12.method4695(var11, var8[var10]);
            this.field4865.put(var12.method4744(), var12);
            if (var12.method4701()) {
                this.field4847 = var12;
            }
        }
        this.method7886(this.field4847);
        this.field4846 = null;
    }

    @ObfuscatedName("rb.an(I)V")
    public void method7719() {
        class250.field2906.method5088(5);
    }

    @ObfuscatedName("rb.aw(IIZIIIII)V")
    public void method7720(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4831.method7704()) {
            return;
        }
        this.method7723();
        this.method7904();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4836));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4836));
        List var10 = this.field4832.method4901(this.field4822 - var8 / 2 - 1, this.field4833 - var9 / 2 - 1, var8 / 2 + this.field4822 + 1, var9 / 2 + this.field4833 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class267 var13 = (class267) var12.next();
            var11.add(var13);
            class84 var14 = new class84();
            class272 var15 = new class272(var13.method4662(), var13.field3053, var13.field3050);
            var14.method2148(new Object[] { var15, arg0, arg1 });
            if (this.field4838.contains(var13)) {
                var14.method2157(17);
            } else {
                var14.method2157(15);
            }
            class67.method2285(var14);
        }
        Iterator var16 = this.field4838.iterator();
        while (var16.hasNext()) {
            class267 var17 = (class267) var16.next();
            if (!var11.contains(var17)) {
                class84 var18 = new class84();
                class272 var19 = new class272(var17.method4662(), var17.field3053, var17.field3050);
                var18.method2148(new Object[] { var19, arg0, arg1 });
                var18.method2157(16);
                class67.method2285(var18);
            }
        }
        this.field4838 = var11;
    }

    @ObfuscatedName("rb.ac(IIZZI)V")
    public void method7721(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class294.method2504();
        this.method7722(arg0, arg1, arg3, var5);
        if (this.method7727() || !(arg3 || arg2) || client.method3336()) {
            this.method7726();
        } else {
            if (arg3) {
                this.field4814 = arg0;
                this.field4851 = arg1;
                this.field4848 = this.field4822;
                this.field4857 = this.field4833;
            }
            if (this.field4848 != -1) {
                int var7 = arg0 - this.field4814;
                int var8 = arg1 - this.field4851;
                this.method7755(this.field4848 - (int) ((float) var7 / this.field4837), this.field4857 + (int) ((float) var8 / this.field4837), false);
            }
        }
        if (arg3) {
            this.field4852 = var5;
            this.field4853 = arg0;
            this.field4854 = arg1;
        }
    }

    @ObfuscatedName("rb.au(IIZJ)V")
    public void method7722(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4828 == null) {
            this.field4866 = null;
            return;
        }
        int var6 = (int) ((float) this.field4822 + ((float) (arg0 - this.field4815) - (float) this.method7788() * this.field4836 / 2.0F) / this.field4836);
        int var7 = (int) ((float) this.field4833 - ((float) (arg1 - this.field4841) - (float) this.method7804() * this.field4836 / 2.0F) / this.field4836);
        this.field4866 = this.field4828.method4698(var6 + this.field4828.method4706() * 64, var7 + this.field4828.method4747() * 64);
        if (this.field4866 == null || !arg2) {
            return;
        }
        class208 var8 = client.field722;
        boolean var10 = client.field682 >= 2;
        if (var10 && var8.method3888(82) && var8.method3888(81)) {
            int var11 = this.field4866.field3486;
            int var12 = this.field4866.field3488;
            int var13 = this.field4866.field3487;
            class289 var14 = class289.method5974(class287.field3180, client.field753.field1385);
            var14.field3212.method8235(0);
            var14.field3212.method8288(var11);
            var14.field3212.method8278(var13);
            var14.field3212.method8449(var12);
            client.field753.method2650(var14);
            return;
        }
        boolean var15 = true;
        if (this.field4820) {
            int var16 = arg0 - this.field4853;
            int var17 = arg1 - this.field4854;
            if (arg3 - this.field4852 > 500L || var16 < -25 || var16 > 25 || var17 < -25 || var17 > 25) {
                var15 = false;
            }
        }
        if (var15) {
            class289 var18 = class289.method5974(class287.field3145, client.field753.field1385);
            var18.field3212.method8301(this.field4866.method5414());
            client.field753.method2650(var18);
            this.field4852 = 0L;
        }
    }

    @ObfuscatedName("rb.ab(I)V")
    public void method7723() {
        if (Statics.field1586 != null) {
            this.field4836 = this.field4837;
            return;
        }
        if (this.field4836 < this.field4837) {
            this.field4836 = Math.min(this.field4837, this.field4836 / 30.0F + this.field4836);
        }
        if (this.field4836 > this.field4837) {
            this.field4836 = Math.max(this.field4837, this.field4836 - this.field4836 / 30.0F);
        }
    }

    @ObfuscatedName("rb.aq(I)V")
    public void method7904() {
        if (!this.method7727()) {
            return;
        }
        int var1 = this.field4834 - this.field4822;
        int var2 = this.field4827 - this.field4833;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7755(this.field4822 + var1, this.field4833 + var2, true);
        if (this.field4834 == this.field4822 && this.field4833 == this.field4827) {
            this.field4834 = -1;
            this.field4827 = -1;
        }
    }

    @ObfuscatedName("rb.al(IIZS)V")
    public final void method7755(int arg0, int arg1, boolean arg2) {
        this.field4822 = arg0;
        this.field4833 = arg1;
        class294.method2504();
        if (arg2) {
            this.method7726();
        }
    }

    @ObfuscatedName("rb.at(I)V")
    public final void method7726() {
        this.field4851 = -1;
        this.field4814 = -1;
        this.field4857 = -1;
        this.field4848 = -1;
    }

    @ObfuscatedName("rb.aa(I)Z")
    public boolean method7727() {
        return this.field4834 != -1 && this.field4827 != -1;
    }

    @ObfuscatedName("rb.ay(IIIB)Ljs;")
    public class249 method7878(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4865.values().iterator();
        class249 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class249) var4.next();
        } while (!var5.method4751(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("rb.ao(IIIZB)V")
    public void method7876(int arg0, int arg1, int arg2, boolean arg3) {
        class249 var5 = this.method7878(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4847;
        }
        boolean var6 = false;
        if (this.field4846 != var5 || arg3) {
            this.field4846 = var5;
            this.method7886(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7736(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("rb.ax(II)V")
    public void method7730(int arg0) {
        class249 var2 = this.method7747(arg0);
        if (var2 != null) {
            this.method7886(var2);
        }
    }

    @ObfuscatedName("rb.ai(I)I")
    public int method7803() {
        return this.field4828 == null ? -1 : this.field4828.method4740();
    }

    @ObfuscatedName("rb.ag(B)Ljs;")
    public class249 method7872() {
        return this.field4828;
    }

    @ObfuscatedName("rb.ah(Ljs;I)V")
    public void method7886(class249 arg0) {
        if (this.field4828 == null || this.field4828 != arg0) {
            this.method7834(arg0);
            this.method7736(-1, -1, -1);
        }
    }

    @ObfuscatedName("rb.av(Ljs;I)V")
    public void method7834(class249 arg0) {
        this.field4828 = arg0;
        this.field4832 = new class251(this.field4825, this.field4824, this.field4818, this.field4819);
        this.field4831.method7702(this.field4828 == null ? null : this.field4828.method4744());
    }

    @ObfuscatedName("rb.ar(Ljs;Llb;Llb;ZI)V")
    public void method7756(class249 arg0, class308 arg1, class308 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4828 == null || this.field4828 != arg0) {
            this.method7834(arg0);
        }
        if (!arg3 && this.field4828.method4751(arg1.field3487, arg1.field3486, arg1.field3488)) {
            this.method7736(arg1.field3487, arg1.field3486, arg1.field3488);
        } else {
            this.method7736(arg2.field3487, arg2.field3486, arg2.field3488);
        }
    }

    @ObfuscatedName("rb.am(IIII)V")
    public void method7736(int arg0, int arg1, int arg2) {
        if (this.field4828 == null) {
            return;
        }
        int[] var4 = this.field4828.method4746(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4828.method4746(this.field4828.method4708(), this.field4828.method4705(), this.field4828.method4711());
        }
        this.method7755(var4[0] - this.field4828.method4706() * 64, var4[1] - this.field4828.method4747() * 64, true);
        this.field4834 = -1;
        this.field4827 = -1;
        this.field4836 = this.method7760(this.field4828.method4702());
        this.field4837 = this.field4836;
        this.field4863 = null;
        this.field4864 = null;
        this.field4832.method4867();
    }

    @ObfuscatedName("rb.as(IIIIII)V")
    public void method7826(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class499.method8574(var6);
        class499.method8572(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class499.method8603(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4831.method7705();
        if (var7 < 100) {
            this.method7903(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4832.method4873()) {
            this.field4832.method4866(this.field4817, this.field4828.method4744(), client.field492);
            if (!this.field4832.method4873()) {
                return;
            }
        }
        if (this.field4845 != null) {
            this.field4835++;
            if (this.field4835 % this.field4862 == 0) {
                this.field4835 = 0;
                this.field4816++;
            }
            if (this.field4816 >= this.field4842 && !this.field4839) {
                this.field4845 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4836));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4836));
        this.field4832.method4868(this.field4822 - var8 / 2, this.field4833 - var9 / 2, var8 / 2 + this.field4822, var9 / 2 + this.field4833, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4860) {
            boolean var10 = false;
            if (arg4 - this.field4861 > 100) {
                this.field4861 = arg4;
                var10 = true;
            }
            this.field4832.method4869(this.field4822 - var8 / 2, this.field4833 - var9 / 2, var8 / 2 + this.field4822, var9 / 2 + this.field4833, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4859, this.field4845, this.field4835, this.field4862, var10);
        }
        this.method7739(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field682 >= 2;
        if (var11 && this.field4867 && this.field4866 != null) {
            this.field4823.method6837("Coord: " + this.field4866, class499.field5064 + 10, class499.field5065 + 20, 16776960, -1);
        }
        this.field4855 = var8;
        this.field4850 = var9;
        this.field4815 = arg0;
        this.field4841 = arg1;
        class499.method8575(var6);
    }

    @ObfuscatedName("rb.aj(IIIIIII)Z")
    public boolean method7776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4868 == null) {
            return true;
        } else if (this.field4868.field5088 != arg0 || this.field4868.field5093 != arg1) {
            return true;
        } else if (this.field4832.field2927 != this.field4869) {
            return true;
        } else if (client.field782 != this.field4872) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("rb.ak(IIIIIII)V")
    public void method7739(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1586 == null) {
            return;
        }
        int var7 = 512 / (this.field4832.field2927 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7752() - arg4 / 2 - var7;
        int var14 = this.method7753() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4832.field2927 * (var7 + var13 - this.field4849);
        int var16 = arg1 - this.field4832.field2927 * (var7 - (var14 - this.field4871));
        if (this.method7776(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4868 != null && this.field4868.field5088 == var11 && this.field4868.field5093 == var12) {
                Arrays.fill(this.field4868.field5089, 0);
            } else {
                this.field4868 = new class503(var11, var12);
            }
            this.field4849 = this.method7752() - arg4 / 2 - var7;
            this.field4871 = this.method7753() - arg5 / 2 - var7;
            this.field4869 = this.field4832.field2927;
            Statics.field1586.method6272(this.field4849, this.field4871, this.field4868, (float) this.field4869 / var10);
            this.field4872 = client.field782;
            var15 = arg0 - this.field4832.field2927 * (var7 + var13 - this.field4849);
            var16 = arg1 - this.field4832.field2927 * (var7 - (var14 - this.field4871));
        }
        class499.method8579(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4868.method8751(var15, var16, 192);
        } else {
            this.field4868.method8684(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("rb.az(IIIIB)V")
    public void method7843(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4831.method7704()) {
            return;
        }
        if (!this.field4832.method4873()) {
            this.field4832.method4866(this.field4817, this.field4828.method4744(), client.field492);
            if (!this.field4832.method4873()) {
                return;
            }
        }
        this.field4832.method4904(arg0, arg1, arg2, arg3, this.field4845, this.field4835, this.field4862);
    }

    @ObfuscatedName("rb.ad(II)V")
    public void method7729(int arg0) {
        this.field4837 = this.method7760(arg0);
    }

    @ObfuscatedName("rb.ae(IIIIII)V")
    public void method7903(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class499.method8603(arg0, arg1, arg2, arg3, -16777216);
        class499.method8632(var7 - 152, var8, 304, 34, -65536);
        class499.method8603(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4823.method6770(class337.field4158, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("rb.ap(II)F")
    public float method7760(int arg0) {
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

    @ObfuscatedName("rb.by(B)I")
    public int method7744() {
        if ((double) this.field4837 == 1.0D) {
            return 25;
        } else if ((double) this.field4837 == 1.5D) {
            return 37;
        } else if ((double) this.field4837 == 2.0D) {
            return 50;
        } else if ((double) this.field4837 == 3.0D) {
            return 75;
        } else if ((double) this.field4837 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("rb.bb(I)V")
    public void method7816() {
        this.field4831.method7703();
    }

    @ObfuscatedName("rb.bi(I)Z")
    public boolean method7746() {
        return this.field4831.method7704();
    }

    @ObfuscatedName("rb.be(II)Ljs;")
    public class249 method7747(int arg0) {
        Iterator var2 = this.field4865.values().iterator();
        class249 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class249) var2.next();
        } while (var3.method4740() != arg0);
        return var3;
    }

    @ObfuscatedName("rb.bk(IIB)V")
    public void method7774(int arg0, int arg1) {
        if (this.field4828 != null && this.field4828.method4696(arg0, arg1)) {
            this.field4834 = arg0 - this.field4828.method4706() * 64;
            this.field4827 = arg1 - this.field4828.method4747() * 64;
        }
    }

    @ObfuscatedName("rb.bx(III)V")
    public void method7749(int arg0, int arg1) {
        if (this.field4828 != null) {
            this.method7755(arg0 - this.field4828.method4706() * 64, arg1 - this.field4828.method4747() * 64, true);
            this.field4834 = -1;
            this.field4827 = -1;
        }
    }

    @ObfuscatedName("rb.bo(IIIB)V")
    public void method7750(int arg0, int arg1, int arg2) {
        if (this.field4828 != null) {
            int[] var4 = this.field4828.method4746(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7774(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("rb.bz(IIII)V")
    public void method7831(int arg0, int arg1, int arg2) {
        if (this.field4828 != null) {
            int[] var4 = this.field4828.method4746(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7749(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("rb.bm(I)I")
    public int method7752() {
        return this.field4828 == null ? -1 : this.field4822 + this.field4828.method4706() * 64;
    }

    @ObfuscatedName("rb.bd(B)I")
    public int method7753() {
        return this.field4828 == null ? -1 : this.field4833 + this.field4828.method4747() * 64;
    }

    @ObfuscatedName("rb.bt(I)Llb;")
    public class308 method7754() {
        return this.field4828 == null ? null : this.field4828.method4698(this.method7752(), this.method7753());
    }

    @ObfuscatedName("rb.bj(B)I")
    public int method7788() {
        return this.field4855;
    }

    @ObfuscatedName("rb.bn(I)I")
    public int method7804() {
        return this.field4850;
    }

    @ObfuscatedName("rb.bs(IB)V")
    public void method7757(int arg0) {
        if (arg0 >= 1) {
            this.field4842 = arg0;
        }
    }

    @ObfuscatedName("rb.br(B)V")
    public void method7758() {
        this.field4842 = 3;
    }

    @ObfuscatedName("rb.bg(IB)V")
    public void method7759(int arg0) {
        if (arg0 >= 1) {
            this.field4862 = arg0;
        }
    }

    @ObfuscatedName("rb.bu(I)V")
    public void method7790() {
        this.field4862 = 50;
    }

    @ObfuscatedName("rb.bf(ZI)V")
    public void method7761(boolean arg0) {
        this.field4839 = arg0;
    }

    @ObfuscatedName("rb.bq(II)V")
    public void method7762(int arg0) {
        this.field4845 = new HashSet();
        this.field4845.add(arg0);
        this.field4816 = 0;
        this.field4835 = 0;
    }

    @ObfuscatedName("rb.ba(II)V")
    public void method7763(int arg0) {
        this.field4845 = new HashSet();
        this.field4816 = 0;
        this.field4835 = 0;
        for (int var2 = 0; var2 < Statics.field3792; var2++) {
            if (class183.method6285(var2) != null && class183.method6285(var2).field1937 == arg0) {
                this.field4845.add(class183.method6285(var2).field1917);
            }
        }
    }

    @ObfuscatedName("rb.bv(I)V")
    public void method7854() {
        this.field4845 = null;
    }

    @ObfuscatedName("rb.bl(ZI)V")
    public void method7765(boolean arg0) {
        this.field4860 = !arg0;
    }

    @ObfuscatedName("rb.bp(IZI)V")
    public void method7766(int arg0, boolean arg1) {
        if (arg1) {
            this.field4856.remove(arg0);
        } else {
            this.field4856.add(arg0);
        }
        this.method7837();
    }

    @ObfuscatedName("rb.bc(IZI)V")
    public void method7856(int arg0, boolean arg1) {
        if (arg1) {
            this.field4830.remove(arg0);
        } else {
            this.field4830.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3792; var3++) {
            if (class183.method6285(var3) != null && class183.method6285(var3).field1937 == arg0) {
                int var4 = class183.method6285(var3).field1917;
                if (arg1) {
                    this.field4858.remove(var4);
                } else {
                    this.field4858.add(var4);
                }
            }
        }
        this.method7837();
    }

    @ObfuscatedName("rb.bh(S)Z")
    public boolean method7847() {
        return !this.field4860;
    }

    @ObfuscatedName("rb.bw(II)Z")
    public boolean method7768(int arg0) {
        return !this.field4856.contains(arg0);
    }

    @ObfuscatedName("rb.ce(IB)Z")
    public boolean method7769(int arg0) {
        return !this.field4830.contains(arg0);
    }

    @ObfuscatedName("rb.ci(B)V")
    public void method7837() {
        this.field4859.clear();
        this.field4859.addAll(this.field4856);
        this.field4859.addAll(this.field4858);
    }

    @ObfuscatedName("rb.cs(IIIIIII)V")
    public void method7771(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4831.method7704()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4836));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4836));
        List var9 = this.field4832.method4901(this.field4822 - var7 / 2 - 1, this.field4833 - var8 / 2 - 1, var7 / 2 + this.field4822 + 1, var8 / 2 + this.field4833 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class267 var11 = (class267) var10.next();
            class183 var12 = class183.method6285(var11.method4662());
            var13 = false;
            for (int var14 = this.field4870.length - 1; var14 >= 0; var14--) {
                if (var12.field1921[var14] != null) {
                    client.method1946(var12.field1921[var14], var12.field1928, this.field4870[var14], var11.method4662(), var11.field3053.method5414(), var11.field3050.method5414());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("rb.cc(ILlb;I)Llb;")
    public class308 method7908(int arg0, class308 arg1) {
        if (!this.field4831.method7704()) {
            return null;
        } else if (!this.field4832.method4873()) {
            return null;
        } else if (this.field4828.method4696(arg1.field3486, arg1.field3488)) {
            HashMap var3 = this.field4832.method4874();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class267 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class267 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3050;
                    }
                    var8 = (class267) var7.next();
                    int var9 = var8.field3050.field3486 - arg1.field3486;
                    int var10 = var8.field3050.field3488 - arg1.field3488;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3050;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("rb.cn(IILlb;Llb;I)V")
    public void method7773(int arg0, int arg1, class308 arg2, class308 arg3) {
        class84 var5 = new class84();
        class272 var6 = new class272(arg1, arg2, arg3);
        var5.method2148(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2157(10);
                break;
            case 1009:
                var5.method2157(11);
                break;
            case 1010:
                var5.method2157(12);
                break;
            case 1011:
                var5.method2157(13);
                break;
            case 1012:
                var5.method2157(14);
        }
        class67.method2285(var5);
    }

    @ObfuscatedName("rb.ca(I)Lkg;")
    public class267 method7743() {
        if (!this.field4831.method7704()) {
            return null;
        } else if (this.field4832.method4873()) {
            HashMap var1 = this.field4832.method4874();
            this.field4863 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4863.addAll(var3);
            }
            this.field4864 = this.field4863.iterator();
            return this.method7775();
        } else {
            return null;
        }
    }

    @ObfuscatedName("rb.cu(B)Lkg;")
    public class267 method7775() {
        if (this.field4864 == null) {
            return null;
        }
        class267 var1;
        do {
            if (!this.field4864.hasNext()) {
                return null;
            }
            var1 = (class267) this.field4864.next();
        } while (var1.method4662() == -1);
        return var1;
    }
}
