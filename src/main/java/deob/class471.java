package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("se")
public class class471 {

    @ObfuscatedName("se.ab")
    public class357 field4833;

    @ObfuscatedName("se.ak")
    public class357 field4834;

    @ObfuscatedName("se.ae")
    public class357 field4848;

    @ObfuscatedName("se.af")
    public static final class473 field4835 = class473.field4900;

    @ObfuscatedName("se.ao")
    public static final class473 field4837 = class473.field4892;

    @ObfuscatedName("se.aa")
    public static final class473 field4844 = class473.field4897;

    @ObfuscatedName("se.aj")
    public class392 field4831;

    @ObfuscatedName("se.ad")
    public HashMap field4840;

    @ObfuscatedName("se.ac")
    public class514[] field4841;

    @ObfuscatedName("se.ag")
    public HashMap field4862;

    @ObfuscatedName("se.ar")
    public class256 field4843;

    @ObfuscatedName("se.ah")
    public class256 field4846;

    @ObfuscatedName("se.az")
    public class256 field4845;

    @ObfuscatedName("se.au")
    public class258 field4866;

    @ObfuscatedName("se.ai")
    public class470 field4847;

    @ObfuscatedName("se.aq")
    public int field4842;

    @ObfuscatedName("se.aw")
    public int field4849;

    @ObfuscatedName("se.ay")
    public int field4850 = -1;

    @ObfuscatedName("se.al")
    public int field4856 = -1;

    @ObfuscatedName("se.am")
    public float field4852;

    @ObfuscatedName("se.bs")
    public float field4854;

    @ObfuscatedName("se.bc")
    public int field4873 = -1;

    @ObfuscatedName("se.bj")
    public int field4855 = -1;

    @ObfuscatedName("se.bo")
    public int field4864 = -1;

    @ObfuscatedName("se.bq")
    public int field4857 = -1;

    @ObfuscatedName("se.bg")
    public int field4851 = 3;

    @ObfuscatedName("se.bf")
    public int field4859 = 50;

    @ObfuscatedName("se.bd")
    public boolean field4839 = false;

    @ObfuscatedName("se.ba")
    public HashSet field4861 = null;

    @ObfuscatedName("se.bn")
    public int field4885 = -1;

    @ObfuscatedName("se.bb")
    public int field4863 = -1;

    @ObfuscatedName("se.bx")
    public int field4838 = -1;

    @ObfuscatedName("se.be")
    public int field4865 = -1;

    @ObfuscatedName("se.bh")
    public int field4872 = -1;

    @ObfuscatedName("se.bp")
    public int field4867 = -1;

    @ObfuscatedName("se.bw")
    public long field4868;

    @ObfuscatedName("se.bi")
    public int field4869;

    @ObfuscatedName("se.bk")
    public int field4870;

    @ObfuscatedName("se.bv")
    public boolean field4871 = true;

    @ObfuscatedName("se.br")
    public HashSet field4829 = new HashSet();

    @ObfuscatedName("se.bu")
    public HashSet field4836 = new HashSet();

    @ObfuscatedName("se.by")
    public HashSet field4874 = new HashSet();

    @ObfuscatedName("se.bt")
    public HashSet field4875 = new HashSet();

    @ObfuscatedName("se.bl")
    public boolean field4876 = false;

    @ObfuscatedName("se.cs")
    public int field4877 = 0;

    @ObfuscatedName("se.ca")
    public final int[] field4878 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("se.cf")
    public List field4879;

    @ObfuscatedName("se.cw")
    public Iterator field4887;

    @ObfuscatedName("se.ch")
    public HashSet field4881 = new HashSet();

    @ObfuscatedName("se.cp")
    public class321 field4882 = null;

    @ObfuscatedName("se.cy")
    public boolean field4883 = false;

    @ObfuscatedName("se.cd")
    public class515 field4860;

    @ObfuscatedName("se.cv")
    public int field4853;

    @ObfuscatedName("se.cr")
    public int field4886 = -1;

    @ObfuscatedName("se.cm")
    public int field4884 = -1;

    @ObfuscatedName("se.cg")
    public int field4888 = -1;

    @ObfuscatedName("se.at(Lnq;Lnq;Lnq;Lph;Ljava/util/HashMap;[Ltj;S)V")
    public void method7646(class357 arg0, class357 arg1, class357 arg2, class392 arg3, HashMap arg4, class514[] arg5) {
        this.field4841 = arg5;
        this.field4833 = arg0;
        this.field4834 = arg1;
        this.field4848 = arg2;
        this.field4831 = arg3;
        this.field4840 = new HashMap();
        this.field4840.put(class253.field2864, arg4.get(field4835));
        this.field4840.put(class253.field2861, arg4.get(field4837));
        this.field4840.put(class253.field2863, arg4.get(field4844));
        this.field4847 = new class470(arg0);
        int var7 = this.field4833.method6097(class275.field3050.field3044);
        int[] var8 = this.field4833.method6090(var7);
        int var9 = var8 == null ? 0 : var8.length;
        this.field4862 = new HashMap(var9);
        for (int var10 = 0; var10 < var9; var10++) {
            class501 var11 = new class501(this.field4833.method6080(var7, var8[var10]));
            class256 var12 = new class256();
            var12.method4718(var11, var8[var10]);
            this.field4862.put(var12.method4703(), var12);
            if (var12.method4712()) {
                this.field4843 = var12;
            }
        }
        this.method7801(this.field4843);
        this.field4845 = null;
    }

    @ObfuscatedName("se.an(S)V")
    public void method7638() {
        class257.field2903.method5096(5);
    }

    @ObfuscatedName("se.av(IIZIIIIS)V")
    public void method7639(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4847.method7633()) {
            return;
        }
        this.method7642();
        this.method7643();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4852));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4852));
        List var10 = this.field4866.method4907(this.field4842 - var8 / 2 - 1, this.field4849 - var9 / 2 - 1, var8 / 2 + this.field4842 + 1, var9 / 2 + this.field4849 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class274 var13 = (class274) var12.next();
            var11.add(var13);
            class88 var14 = new class88();
            class279 var15 = new class279(var13.method4663(), var13.field3040, var13.field3039);
            var14.method2149(new Object[] { var15, arg0, arg1 });
            if (this.field4881.contains(var13)) {
                var14.method2151(17);
            } else {
                var14.method2151(15);
            }
            class71.method3233(var14);
        }
        Iterator var16 = this.field4881.iterator();
        while (var16.hasNext()) {
            class274 var17 = (class274) var16.next();
            if (!var11.contains(var17)) {
                class88 var18 = new class88();
                class279 var19 = new class279(var17.method4663(), var17.field3040, var17.field3039);
                var18.method2149(new Object[] { var19, arg0, arg1 });
                var18.method2151(16);
                class71.method3233(var18);
            }
        }
        this.field4881 = var11;
    }

    @ObfuscatedName("se.as(IIZZI)V")
    public void method7640(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class301.method4630();
            this.method7685(arg0, arg1, arg3, var5);
            if (!this.method7651() && (arg3 || arg2)) {
                boolean var7 = client.field771 != null;
                if (!var7) {
                    if (arg3) {
                        this.field4872 = arg0;
                        this.field4867 = arg1;
                        this.field4838 = this.field4842;
                        this.field4865 = this.field4849;
                    }
                    if (this.field4838 != -1) {
                        int var8 = arg0 - this.field4872;
                        int var9 = arg1 - this.field4867;
                        this.method7644(this.field4838 - (int) ((float) var8 / this.field4854), this.field4865 + (int) ((float) var9 / this.field4854), false);
                    }
                    break label33;
                }
            }
            this.method7645();
        }
        if (arg3) {
            this.field4868 = var5;
            this.field4869 = arg0;
            this.field4870 = arg1;
        }
    }

    @ObfuscatedName("se.ax(IIZJ)V")
    public void method7685(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4846 == null) {
            this.field4882 = null;
            return;
        }
        int var6 = (int) ((float) this.field4842 + ((float) (arg0 - this.field4864) - (float) this.method7699() * this.field4852 / 2.0F) / this.field4852);
        int var7 = (int) ((float) this.field4849 - ((float) (arg1 - this.field4857) - (float) this.method7674() * this.field4852 / 2.0F) / this.field4852);
        this.field4882 = this.field4846.method4699(var6 + this.field4846.method4707() * 64, var7 + this.field4846.method4706() * 64);
        if (this.field4882 == null || !arg2) {
            return;
        }
        class212 var8 = client.method6015();
        if (client.method3865() && var8.method3791(82) && var8.method3791(81)) {
            int var9 = this.field4882.field3517;
            int var10 = this.field4882.field3515;
            int var11 = this.field4882.field3516;
            class296 var12 = class296.method3619(class294.field3183, client.field568.field1380);
            var12.field3211.method8220(var10);
            var12.field3211.method8113(var11);
            var12.field3211.method8169(var9);
            var12.field3211.method8181(0);
            client.field568.method2642(var12);
            return;
        }
        boolean var13 = true;
        if (this.field4871) {
            int var14 = arg0 - this.field4869;
            int var15 = arg1 - this.field4870;
            if (arg3 - this.field4868 > 500L || var14 < -25 || var14 > 25 || var15 < -25 || var15 > 25) {
                var13 = false;
            }
        }
        if (var13) {
            class296 var16 = class296.method3619(class294.field3107, client.field568.field1380);
            var16.field3211.method8139(this.field4882.method5394());
            client.field568.method2642(var16);
            this.field4868 = 0L;
        }
    }

    @ObfuscatedName("se.ap(I)V")
    public void method7642() {
        if (Statics.field153 != null) {
            this.field4852 = this.field4854;
            return;
        }
        if (this.field4852 < this.field4854) {
            this.field4852 = Math.min(this.field4854, this.field4852 / 30.0F + this.field4852);
        }
        if (this.field4852 > this.field4854) {
            this.field4852 = Math.max(this.field4854, this.field4852 - this.field4852 / 30.0F);
        }
    }

    @ObfuscatedName("se.ab(I)V")
    public void method7643() {
        if (!this.method7651()) {
            return;
        }
        int var1 = this.field4850 - this.field4842;
        int var2 = this.field4856 - this.field4849;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7644(this.field4842 + var1, this.field4849 + var2, true);
        if (this.field4850 == this.field4842 && this.field4856 == this.field4849) {
            this.field4850 = -1;
            this.field4856 = -1;
        }
    }

    @ObfuscatedName("se.ak(IIZI)V")
    public final void method7644(int arg0, int arg1, boolean arg2) {
        this.field4842 = arg0;
        this.field4849 = arg1;
        class301.method4630();
        if (arg2) {
            this.method7645();
        }
    }

    @ObfuscatedName("se.ae(B)V")
    public final void method7645() {
        this.field4867 = -1;
        this.field4872 = -1;
        this.field4865 = -1;
        this.field4838 = -1;
    }

    @ObfuscatedName("se.af(I)Z")
    public boolean method7651() {
        return this.field4850 != -1 && this.field4856 != -1;
    }

    @ObfuscatedName("se.ao(IIII)Lji;")
    public class256 method7647(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4862.values().iterator();
        class256 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class256) var4.next();
        } while (!var5.method4724(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("se.aa(IIIZB)V")
    public void method7652(int arg0, int arg1, int arg2, boolean arg3) {
        class256 var5 = this.method7647(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4843;
        }
        boolean var6 = false;
        if (this.field4845 != var5 || arg3) {
            this.field4845 = var5;
            this.method7801(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7654(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("se.aj(IS)V")
    public void method7734(int arg0) {
        class256 var2 = this.method7665(arg0);
        if (var2 != null) {
            this.method7801(var2);
        }
    }

    @ObfuscatedName("se.ad(I)I")
    public int method7649() {
        return this.field4846 == null ? -1 : this.field4846.method4709();
    }

    @ObfuscatedName("se.ac(I)Lji;")
    public class256 method7650() {
        return this.field4846;
    }

    @ObfuscatedName("se.ag(Lji;B)V")
    public void method7801(class256 arg0) {
        if (this.field4846 == null || this.field4846 != arg0) {
            this.method7705(arg0);
            this.method7654(-1, -1, -1);
        }
    }

    @ObfuscatedName("se.ar(Lji;B)V")
    public void method7705(class256 arg0) {
        this.field4846 = arg0;
        this.field4866 = new class258(this.field4841, this.field4840, this.field4834, this.field4848);
        this.field4847.method7634(this.field4846 == null ? null : this.field4846.method4703());
    }

    @ObfuscatedName("se.ah(Lji;Lmg;Lmg;ZI)V")
    public void method7653(class256 arg0, class321 arg1, class321 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4846 == null || this.field4846 != arg0) {
            this.method7705(arg0);
        }
        if (!arg3 && this.field4846.method4724(arg1.field3516, arg1.field3517, arg1.field3515)) {
            this.method7654(arg1.field3516, arg1.field3517, arg1.field3515);
        } else {
            this.method7654(arg2.field3516, arg2.field3517, arg2.field3515);
        }
    }

    @ObfuscatedName("se.az(IIII)V")
    public void method7654(int arg0, int arg1, int arg2) {
        if (this.field4846 == null) {
            return;
        }
        int[] var4 = this.field4846.method4698(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4846.method4698(this.field4846.method4739(), this.field4846.method4757(), this.field4846.method4716());
        }
        this.method7644(var4[0] - this.field4846.method4707() * 64, var4[1] - this.field4846.method4706() * 64, true);
        this.field4850 = -1;
        this.field4856 = -1;
        this.field4852 = this.method7661(this.field4846.method4748());
        this.field4854 = this.field4852;
        this.field4879 = null;
        this.field4887 = null;
        this.field4866.method4880();
    }

    @ObfuscatedName("se.au(IIIIIB)V")
    public void method7655(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class511.method8462(var6);
        class511.method8523(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class511.method8468(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4847.method7625();
        if (var7 < 100) {
            this.method7660(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4866.method4886()) {
            this.field4866.method4879(this.field4833, this.field4846.method4703(), client.field507);
            if (!this.field4866.method4886()) {
                return;
            }
        }
        if (this.field4861 != null) {
            this.field4863++;
            if (this.field4863 % this.field4859 == 0) {
                this.field4863 = 0;
                this.field4885++;
            }
            if (this.field4885 >= this.field4851 && !this.field4839) {
                this.field4861 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4852));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4852));
        this.field4866.method4881(this.field4842 - var8 / 2, this.field4849 - var9 / 2, var8 / 2 + this.field4842, var9 / 2 + this.field4849, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4876) {
            boolean var10 = false;
            if (arg4 - this.field4877 > 100) {
                this.field4877 = arg4;
                var10 = true;
            }
            this.field4866.method4912(this.field4842 - var8 / 2, this.field4849 - var9 / 2, var8 / 2 + this.field4842, var9 / 2 + this.field4849, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4875, this.field4861, this.field4863, this.field4859, var10);
        }
        this.method7657(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method3865() && this.field4883 && this.field4882 != null) {
            this.field4831.method6828("Coord: " + this.field4882, class511.field5093 + 10, class511.field5087 + 20, 16776960, -1);
        }
        this.field4873 = var8;
        this.field4855 = var9;
        this.field4864 = arg0;
        this.field4857 = arg1;
        class511.method8463(var6);
    }

    @ObfuscatedName("se.ai(IIIIIII)Z")
    public boolean method7751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4860 == null) {
            return true;
        } else if (this.field4860.field5115 != arg0 || this.field4860.field5120 != arg1) {
            return true;
        } else if (this.field4866.field2928 != this.field4853) {
            return true;
        } else if (client.field699 != this.field4888) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("se.aq(IIIIIII)V")
    public void method7657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field153 == null) {
            return;
        }
        int var7 = 512 / (this.field4866.field2928 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7670() - arg4 / 2 - var7;
        int var14 = this.method7704() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4866.field2928 * (var7 + var13 - this.field4886);
        int var16 = arg1 - this.field4866.field2928 * (var7 - (var14 - this.field4884));
        if (this.method7751(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4860 != null && this.field4860.field5115 == var11 && this.field4860.field5120 == var12) {
                Arrays.fill(this.field4860.field5123, 0);
            } else {
                this.field4860 = new class515(var11, var12);
            }
            this.field4886 = this.method7670() - arg4 / 2 - var7;
            this.field4884 = this.method7704() - arg5 / 2 - var7;
            this.field4853 = this.field4866.field2928;
            Statics.field153.method6252(this.field4886, this.field4884, this.field4860, (float) this.field4853 / var10);
            this.field4888 = client.field699;
            var15 = arg0 - this.field4866.field2928 * (var7 + var13 - this.field4886);
            var16 = arg1 - this.field4866.field2928 * (var7 - (var14 - this.field4884));
        }
        class511.method8524(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4860.method8616(var15, var16, 192);
        } else {
            this.field4860.method8597(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("se.aw(IIIII)V")
    public void method7658(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4847.method7633()) {
            return;
        }
        if (!this.field4866.method4886()) {
            this.field4866.method4879(this.field4833, this.field4846.method4703(), client.field507);
            if (!this.field4866.method4886()) {
                return;
            }
        }
        this.field4866.method4883(arg0, arg1, arg2, arg3, this.field4861, this.field4863, this.field4859);
    }

    @ObfuscatedName("se.ay(II)V")
    public void method7671(int arg0) {
        this.field4854 = this.method7661(arg0);
    }

    @ObfuscatedName("se.al(IIIIII)V")
    public void method7660(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class511.method8468(arg0, arg1, arg2, arg3, -16777216);
        class511.method8472(var7 - 152, var8, 304, 34, -65536);
        class511.method8468(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4831.method6784(class350.field3879, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("se.am(II)F")
    public float method7661(int arg0) {
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

    @ObfuscatedName("se.bs(I)I")
    public int method7669() {
        if ((double) this.field4854 == 1.0D) {
            return 25;
        } else if ((double) this.field4854 == 1.5D) {
            return 37;
        } else if ((double) this.field4854 == 2.0D) {
            return 50;
        } else if ((double) this.field4854 == 3.0D) {
            return 75;
        } else if ((double) this.field4854 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("se.bc(B)V")
    public void method7763() {
        this.field4847.method7624();
    }

    @ObfuscatedName("se.bj(I)Z")
    public boolean method7664() {
        return this.field4847.method7633();
    }

    @ObfuscatedName("se.bo(II)Lji;")
    public class256 method7665(int arg0) {
        Iterator var2 = this.field4862.values().iterator();
        class256 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class256) var2.next();
        } while (var3.method4709() != arg0);
        return var3;
    }

    @ObfuscatedName("se.bq(III)V")
    public void method7666(int arg0, int arg1) {
        if (this.field4846 != null && this.field4846.method4697(arg0, arg1)) {
            this.field4850 = arg0 - this.field4846.method4707() * 64;
            this.field4856 = arg1 - this.field4846.method4706() * 64;
        }
    }

    @ObfuscatedName("se.bg(IIS)V")
    public void method7667(int arg0, int arg1) {
        if (this.field4846 != null) {
            this.method7644(arg0 - this.field4846.method4707() * 64, arg1 - this.field4846.method4706() * 64, true);
            this.field4850 = -1;
            this.field4856 = -1;
        }
    }

    @ObfuscatedName("se.bf(IIII)V")
    public void method7768(int arg0, int arg1, int arg2) {
        if (this.field4846 != null) {
            int[] var4 = this.field4846.method4698(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7666(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("se.bd(IIII)V")
    public void method7797(int arg0, int arg1, int arg2) {
        if (this.field4846 != null) {
            int[] var4 = this.field4846.method4698(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7667(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("se.ba(I)I")
    public int method7670() {
        return this.field4846 == null ? -1 : this.field4842 + this.field4846.method4707() * 64;
    }

    @ObfuscatedName("se.bn(I)I")
    public int method7704() {
        return this.field4846 == null ? -1 : this.field4849 + this.field4846.method4706() * 64;
    }

    @ObfuscatedName("se.bb(I)Lmg;")
    public class321 method7672() {
        return this.field4846 == null ? null : this.field4846.method4699(this.method7670(), this.method7704());
    }

    @ObfuscatedName("se.bx(I)I")
    public int method7699() {
        return this.field4873;
    }

    @ObfuscatedName("se.be(I)I")
    public int method7674() {
        return this.field4855;
    }

    @ObfuscatedName("se.bh(IB)V")
    public void method7675(int arg0) {
        if (arg0 >= 1) {
            this.field4851 = arg0;
        }
    }

    @ObfuscatedName("se.bp(B)V")
    public void method7676() {
        this.field4851 = 3;
    }

    @ObfuscatedName("se.bw(II)V")
    public void method7677(int arg0) {
        if (arg0 >= 1) {
            this.field4859 = arg0;
        }
    }

    @ObfuscatedName("se.bi(I)V")
    public void method7815() {
        this.field4859 = 50;
    }

    @ObfuscatedName("se.bk(ZB)V")
    public void method7711(boolean arg0) {
        this.field4839 = arg0;
    }

    @ObfuscatedName("se.bv(IB)V")
    public void method7771(int arg0) {
        this.field4861 = new HashSet();
        this.field4861.add(arg0);
        this.field4885 = 0;
        this.field4863 = 0;
    }

    @ObfuscatedName("se.bz(IB)V")
    public void method7681(int arg0) {
        this.field4861 = new HashSet();
        this.field4885 = 0;
        this.field4863 = 0;
        for (int var2 = 0; var2 < Statics.field56; var2++) {
            if (class187.method2956(var2) != null && class187.method2956(var2).field1918 == arg0) {
                this.field4861.add(class187.method2956(var2).field1911);
            }
        }
    }

    @ObfuscatedName("se.bm(I)V")
    public void method7682() {
        this.field4861 = null;
    }

    @ObfuscatedName("se.br(ZI)V")
    public void method7683(boolean arg0) {
        this.field4876 = !arg0;
    }

    @ObfuscatedName("se.bu(IZI)V")
    public void method7684(int arg0, boolean arg1) {
        if (arg1) {
            this.field4829.remove(arg0);
        } else {
            this.field4829.add(arg0);
        }
        this.method7689();
    }

    @ObfuscatedName("se.by(IZI)V")
    public void method7668(int arg0, boolean arg1) {
        if (arg1) {
            this.field4836.remove(arg0);
        } else {
            this.field4836.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field56; var3++) {
            if (class187.method2956(var3) != null && class187.method2956(var3).field1918 == arg0) {
                int var4 = class187.method2956(var3).field1911;
                if (arg1) {
                    this.field4874.remove(var4);
                } else {
                    this.field4874.add(var4);
                }
            }
        }
        this.method7689();
    }

    @ObfuscatedName("se.bt(B)Z")
    public boolean method7663() {
        return !this.field4876;
    }

    @ObfuscatedName("se.bl(II)Z")
    public boolean method7687(int arg0) {
        return !this.field4829.contains(arg0);
    }

    @ObfuscatedName("se.cs(II)Z")
    public boolean method7688(int arg0) {
        return !this.field4836.contains(arg0);
    }

    @ObfuscatedName("se.cu(I)V")
    public void method7689() {
        this.field4875.clear();
        this.field4875.addAll(this.field4829);
        this.field4875.addAll(this.field4874);
    }

    @ObfuscatedName("se.ca(IIIIIIB)V")
    public void method7802(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4847.method7633()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4852));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4852));
        List var9 = this.field4866.method4907(this.field4842 - var7 / 2 - 1, this.field4849 - var8 / 2 - 1, var7 / 2 + this.field4842 + 1, var8 / 2 + this.field4849 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class274 var11 = (class274) var10.next();
            class187 var12 = class187.method2956(var11.method4663());
            var13 = false;
            for (int var14 = this.field4878.length - 1; var14 >= 0; var14--) {
                if (var12.field1920[var14] != null) {
                    client.method2926(var12.field1920[var14], var12.field1930, this.field4878[var14], var11.method4663(), var11.field3040.method5394(), var11.field3039.method5394());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("se.cf(ILmg;B)Lmg;")
    public class321 method7691(int arg0, class321 arg1) {
        if (!this.field4847.method7633()) {
            return null;
        } else if (!this.field4866.method4886()) {
            return null;
        } else if (this.field4846.method4697(arg1.field3517, arg1.field3515)) {
            HashMap var3 = this.field4866.method4887();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class274 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class274 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3039;
                    }
                    var8 = (class274) var7.next();
                    int var9 = var8.field3039.field3517 - arg1.field3517;
                    int var10 = var8.field3039.field3515 - arg1.field3515;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3039;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("se.cw(IILmg;Lmg;B)V")
    public void method7738(int arg0, int arg1, class321 arg2, class321 arg3) {
        class88 var5 = new class88();
        class279 var6 = new class279(arg1, arg2, arg3);
        var5.method2149(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2151(10);
                break;
            case 1009:
                var5.method2151(11);
                break;
            case 1010:
                var5.method2151(12);
                break;
            case 1011:
                var5.method2151(13);
                break;
            case 1012:
                var5.method2151(14);
        }
        class71.method3233(var5);
    }

    @ObfuscatedName("se.ch(B)Lkb;")
    public class274 method7693() {
        if (!this.field4847.method7633()) {
            return null;
        } else if (this.field4866.method4886()) {
            HashMap var1 = this.field4866.method4887();
            this.field4879 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4879.addAll(var3);
            }
            this.field4887 = this.field4879.iterator();
            return this.method7694();
        } else {
            return null;
        }
    }

    @ObfuscatedName("se.cp(I)Lkb;")
    public class274 method7694() {
        if (this.field4887 == null) {
            return null;
        }
        class274 var1;
        do {
            if (!this.field4887.hasNext()) {
                return null;
            }
            var1 = (class274) this.field4887.next();
        } while (var1.method4663() == -1);
        return var1;
    }
}
