package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("rc")
public class class449 {

    @ObfuscatedName("rc.av")
    public class340 field4744;

    @ObfuscatedName("rc.aq")
    public class340 field4730;

    @ObfuscatedName("rc.ap")
    public class340 field4731;

    @ObfuscatedName("rc.ar")
    public static final class451 field4734 = class451.field4794;

    @ObfuscatedName("rc.ak")
    public static final class451 field4732 = class451.field4796;

    @ObfuscatedName("rc.ax")
    public static final class451 field4736 = class451.field4798;

    @ObfuscatedName("rc.as")
    public class375 field4762;

    @ObfuscatedName("rc.ay")
    public HashMap field4733;

    @ObfuscatedName("rc.am")
    public class491[] field4737;

    @ObfuscatedName("rc.az")
    public HashMap field4780;

    @ObfuscatedName("rc.ae")
    public class245 field4739;

    @ObfuscatedName("rc.au")
    public class245 field4729;

    @ObfuscatedName("rc.ag")
    public class245 field4753;

    @ObfuscatedName("rc.at")
    public class247 field4742;

    @ObfuscatedName("rc.af")
    public class448 field4758;

    @ObfuscatedName("rc.ai")
    public int field4748;

    @ObfuscatedName("rc.aw")
    public int field4745;

    @ObfuscatedName("rc.aa")
    public int field4746 = -1;

    @ObfuscatedName("rc.ah")
    public int field4747 = -1;

    @ObfuscatedName("rc.ad")
    public float field4740;

    @ObfuscatedName("rc.bm")
    public float field4749;

    @ObfuscatedName("rc.bv")
    public int field4750 = -1;

    @ObfuscatedName("rc.bo")
    public int field4751 = -1;

    @ObfuscatedName("rc.bs")
    public int field4752 = -1;

    @ObfuscatedName("rc.bg")
    public int field4741 = -1;

    @ObfuscatedName("rc.bh")
    public int field4754 = 3;

    @ObfuscatedName("rc.bl")
    public int field4755 = 50;

    @ObfuscatedName("rc.bk")
    public boolean field4756 = false;

    @ObfuscatedName("rc.br")
    public HashSet field4757 = null;

    @ObfuscatedName("rc.ba")
    public int field4770 = -1;

    @ObfuscatedName("rc.bz")
    public int field4759 = -1;

    @ObfuscatedName("rc.bq")
    public int field4760 = -1;

    @ObfuscatedName("rc.bc")
    public int field4761 = -1;

    @ObfuscatedName("rc.bt")
    public int field4738 = -1;

    @ObfuscatedName("rc.be")
    public int field4763 = -1;

    @ObfuscatedName("rc.bu")
    public long field4764;

    @ObfuscatedName("rc.bd")
    public int field4765;

    @ObfuscatedName("rc.by")
    public int field4766;

    @ObfuscatedName("rc.bp")
    public boolean field4767 = true;

    @ObfuscatedName("rc.bn")
    public HashSet field4769 = new HashSet();

    @ObfuscatedName("rc.bj")
    public HashSet field4743 = new HashSet();

    @ObfuscatedName("rc.bf")
    public HashSet field4771 = new HashSet();

    @ObfuscatedName("rc.bw")
    public HashSet field4786 = new HashSet();

    @ObfuscatedName("rc.bi")
    public boolean field4783 = false;

    @ObfuscatedName("rc.cl")
    public int field4774 = 0;

    @ObfuscatedName("rc.cb")
    public final int[] field4773 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("rc.co")
    public List field4776;

    @ObfuscatedName("rc.cj")
    public Iterator field4778;

    @ObfuscatedName("rc.cn")
    public HashSet field4779 = new HashSet();

    @ObfuscatedName("rc.ce")
    public class304 field4725 = null;

    @ObfuscatedName("rc.cd")
    public boolean field4781 = false;

    @ObfuscatedName("rc.cc")
    public class492 field4772;

    @ObfuscatedName("rc.ct")
    public int field4777;

    @ObfuscatedName("rc.cy")
    public int field4784 = -1;

    @ObfuscatedName("rc.ck")
    public int field4785 = -1;

    @ObfuscatedName("rc.cz")
    public int field4782 = -1;

    @ObfuscatedName("rc.aj(Lne;Lne;Lne;Loe;Ljava/util/HashMap;[Lsp;B)V")
    public void method7380(class340 arg0, class340 arg1, class340 arg2, class375 arg3, HashMap arg4, class491[] arg5) {
        this.field4737 = arg5;
        this.field4744 = arg0;
        this.field4730 = arg1;
        this.field4731 = arg2;
        this.field4762 = arg3;
        this.field4733 = new HashMap();
        this.field4733.put(class242.field2820, arg4.get(field4734));
        this.field4733.put(class242.field2815, arg4.get(field4732));
        this.field4733.put(class242.field2816, arg4.get(field4736));
        this.field4758 = new class448(arg0);
        int var7 = this.field4744.method5875(class264.field3020.field3019);
        int[] var8 = this.field4744.method5890(var7);
        this.field4780 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class478 var10 = new class478(this.field4744.method5860(var7, var8[var9]));
            class245 var11 = new class245();
            var11.method4493(var10, var8[var9]);
            this.field4780.put(var11.method4479(), var11);
            if (var11.method4507()) {
                this.field4739 = var11;
            }
        }
        this.method7410(this.field4739);
        this.field4753 = null;
    }

    @ObfuscatedName("rc.al(B)V")
    public void method7381() {
        class246.method3086();
    }

    @ObfuscatedName("rc.ac(IIZIIIII)V")
    public void method7382(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4758.method7369()) {
            return;
        }
        this.method7553();
        this.method7386();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4740));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4740));
        List var10 = this.field4742.method4681(this.field4748 - var8 / 2 - 1, this.field4745 - var9 / 2 - 1, var8 / 2 + this.field4748 + 1, var9 / 2 + this.field4745 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class263 var13 = (class263) var12.next();
            var11.add(var13);
            class86 var14 = new class86();
            class268 var15 = new class268(var13.method4426(), var13.field3008, var13.field3013);
            var14.method2158(new Object[] { var15, arg0, arg1 });
            if (this.field4779.contains(var13)) {
                var14.method2165(17);
            } else {
                var14.method2165(15);
            }
            class68.method69(var14);
        }
        Iterator var16 = this.field4779.iterator();
        while (var16.hasNext()) {
            class263 var17 = (class263) var16.next();
            if (!var11.contains(var17)) {
                class86 var18 = new class86();
                class268 var19 = new class268(var17.method4426(), var17.field3008, var17.field3013);
                var18.method2158(new Object[] { var19, arg0, arg1 });
                var18.method2165(16);
                class68.method69(var18);
            }
        }
        this.field4779 = var11;
    }

    @ObfuscatedName("rc.ab(IIZZB)V")
    public void method7383(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class290.method4466();
        this.method7536(arg0, arg1, arg3, var5);
        if (this.method7389() || !(arg3 || arg2) || client.method2154()) {
            this.method7560();
        } else {
            if (arg3) {
                this.field4738 = arg0;
                this.field4763 = arg1;
                this.field4760 = this.field4748;
                this.field4761 = this.field4745;
            }
            if (this.field4760 != -1) {
                int var7 = arg0 - this.field4738;
                int var8 = arg1 - this.field4763;
                this.method7446(this.field4760 - (int) ((float) var7 / this.field4749), this.field4761 + (int) ((float) var8 / this.field4749), false);
            }
        }
        if (arg3) {
            this.field4764 = var5;
            this.field4765 = arg0;
            this.field4766 = arg1;
        }
    }

    @ObfuscatedName("rc.an(IIZJ)V")
    public void method7536(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4729 == null) {
            this.field4725 = null;
            return;
        }
        int var6 = (int) ((float) this.field4748 + ((float) (arg0 - this.field4752) - (float) this.method7416() * this.field4740 / 2.0F) / this.field4740);
        int var7 = (int) ((float) this.field4745 - ((float) (arg1 - this.field4741) - (float) this.method7417() * this.field4740 / 2.0F) / this.field4740);
        this.field4725 = this.field4729.method4510(var6 + this.field4729.method4533() * 64, var7 + this.field4729.method4500() * 64);
        if (this.field4725 == null || !arg2) {
            return;
        }
        class209 var8 = client.method5740();
        if (client.method1961() && var8.method3741(82) && var8.method3741(81)) {
            client.method3087(this.field4725.field3429, this.field4725.field3431, this.field4725.field3434, false);
            return;
        }
        boolean var9 = true;
        if (this.field4767) {
            int var10 = arg0 - this.field4765;
            int var11 = arg1 - this.field4766;
            if (arg3 - this.field4764 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class285 var12 = class285.method2741(class283.field3116, client.field734.field1380);
            var12.field3169.method8003(this.field4725.method5208());
            client.field734.method2635(var12);
            this.field4764 = 0L;
        }
    }

    @ObfuscatedName("rc.ao(I)V")
    public void method7553() {
        if (Statics.field4295 != null) {
            this.field4740 = this.field4749;
            return;
        }
        if (this.field4740 < this.field4749) {
            this.field4740 = Math.min(this.field4749, this.field4740 / 30.0F + this.field4740);
        }
        if (this.field4740 > this.field4749) {
            this.field4740 = Math.max(this.field4749, this.field4740 - this.field4740 / 30.0F);
        }
    }

    @ObfuscatedName("rc.av(I)V")
    public void method7386() {
        if (!this.method7389()) {
            return;
        }
        int var1 = this.field4746 - this.field4748;
        int var2 = this.field4747 - this.field4745;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7446(this.field4748 + var1, this.field4745 + var2, true);
        if (this.field4748 == this.field4746 && this.field4747 == this.field4745) {
            this.field4746 = -1;
            this.field4747 = -1;
        }
    }

    @ObfuscatedName("rc.aq(IIZI)V")
    public final void method7446(int arg0, int arg1, boolean arg2) {
        this.field4748 = arg0;
        this.field4745 = arg1;
        class290.method4466();
        if (arg2) {
            this.method7560();
        }
    }

    @ObfuscatedName("rc.ap(B)V")
    public final void method7560() {
        this.field4763 = -1;
        this.field4738 = -1;
        this.field4761 = -1;
        this.field4760 = -1;
    }

    @ObfuscatedName("rc.ar(B)Z")
    public boolean method7389() {
        return this.field4746 != -1 && this.field4747 != -1;
    }

    @ObfuscatedName("rc.ak(IIII)Ljw;")
    public class245 method7493(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4780.values().iterator();
        class245 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class245) var4.next();
        } while (!var5.method4517(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("rc.ax(IIIZB)V")
    public void method7391(int arg0, int arg1, int arg2, boolean arg3) {
        class245 var5 = this.method7493(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4739;
        }
        boolean var6 = false;
        if (this.field4753 != var5 || arg3) {
            this.field4753 = var5;
            this.method7410(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7398(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("rc.as(II)V")
    public void method7392(int arg0) {
        class245 var2 = this.method7421(arg0);
        if (var2 != null) {
            this.method7410(var2);
        }
    }

    @ObfuscatedName("rc.ay(I)I")
    public int method7393() {
        return this.field4729 == null ? -1 : this.field4729.method4477();
    }

    @ObfuscatedName("rc.am(I)Ljw;")
    public class245 method7394() {
        return this.field4729;
    }

    @ObfuscatedName("rc.az(Ljw;I)V")
    public void method7410(class245 arg0) {
        if (this.field4729 == null || this.field4729 != arg0) {
            this.method7396(arg0);
            this.method7398(-1, -1, -1);
        }
    }

    @ObfuscatedName("rc.ae(Ljw;I)V")
    public void method7396(class245 arg0) {
        this.field4729 = arg0;
        this.field4742 = new class247(this.field4737, this.field4733, this.field4730, this.field4731);
        this.field4758.method7370(this.field4729.method4479());
    }

    @ObfuscatedName("rc.au(Ljw;Llt;Llt;ZI)V")
    public void method7468(class245 arg0, class304 arg1, class304 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4729 == null || this.field4729 != arg0) {
            this.method7396(arg0);
        }
        if (!arg3 && this.field4729.method4517(arg1.field3434, arg1.field3429, arg1.field3431)) {
            this.method7398(arg1.field3434, arg1.field3429, arg1.field3431);
        } else {
            this.method7398(arg2.field3434, arg2.field3429, arg2.field3431);
        }
    }

    @ObfuscatedName("rc.ag(IIIB)V")
    public void method7398(int arg0, int arg1, int arg2) {
        if (this.field4729 == null) {
            return;
        }
        int[] var4 = this.field4729.method4474(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4729.method4474(this.field4729.method4488(), this.field4729.method4487(), this.field4729.method4489());
        }
        this.method7446(var4[0] - this.field4729.method4533() * 64, var4[1] - this.field4729.method4500() * 64, true);
        this.field4746 = -1;
        this.field4747 = -1;
        this.field4740 = this.method7405(this.field4729.method4482());
        this.field4749 = this.field4740;
        this.field4776 = null;
        this.field4778 = null;
        this.field4742.method4697();
    }

    @ObfuscatedName("rc.at(IIIIIB)V")
    public void method7399(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class488.method8235(var6);
        class488.method8233(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class488.method8241(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4758.method7376();
        if (var7 < 100) {
            this.method7431(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4742.method4683()) {
            this.field4742.method4676(this.field4744, this.field4729.method4479(), client.field485);
            if (!this.field4742.method4683()) {
                return;
            }
        }
        if (this.field4757 != null) {
            this.field4759++;
            if (this.field4759 % this.field4755 == 0) {
                this.field4759 = 0;
                this.field4770++;
            }
            if (this.field4770 >= this.field4754 && !this.field4756) {
                this.field4757 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4740));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4740));
        this.field4742.method4698(this.field4748 - var8 / 2, this.field4745 - var9 / 2, var8 / 2 + this.field4748, var9 / 2 + this.field4745, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4783) {
            boolean var10 = false;
            if (arg4 - this.field4774 > 100) {
                this.field4774 = arg4;
                var10 = true;
            }
            this.field4742.method4678(this.field4748 - var8 / 2, this.field4745 - var9 / 2, var8 / 2 + this.field4748, var9 / 2 + this.field4745, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4786, this.field4757, this.field4759, this.field4755, var10);
        }
        this.method7492(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method1961() && this.field4781 && this.field4725 != null) {
            this.field4762.method6578("Coord: " + this.field4725, class488.field4974 + 10, class488.field4972 + 20, 16776960, -1);
        }
        this.field4750 = var8;
        this.field4751 = var9;
        this.field4752 = arg0;
        this.field4741 = arg1;
        class488.method8236(var6);
    }

    @ObfuscatedName("rc.af(IIIIIIB)Z")
    public boolean method7542(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4772 == null) {
            return true;
        } else if (this.field4772.field5006 != arg0 || this.field4772.field4996 != arg1) {
            return true;
        } else if (this.field4742.field2868 != this.field4777) {
            return true;
        } else if (client.field575 != this.field4782) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("rc.ai(IIIIIIB)V")
    public void method7492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field4295 == null) {
            return;
        }
        int var7 = 512 / (this.field4742.field2868 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7413() - arg4 / 2 - var7;
        int var14 = this.method7458() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4742.field2868 * (var7 + var13 - this.field4784);
        int var16 = arg1 - this.field4742.field2868 * (var7 - (var14 - this.field4785));
        if (this.method7542(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4772 != null && this.field4772.field5006 == var11 && this.field4772.field4996 == var12) {
                Arrays.fill(this.field4772.field4997, 0);
            } else {
                this.field4772 = new class492(var11, var12);
            }
            this.field4784 = this.method7413() - arg4 / 2 - var7;
            this.field4785 = this.method7458() - arg5 / 2 - var7;
            this.field4777 = this.field4742.field2868;
            Statics.field4295.method6033(this.field4784, this.field4785, this.field4772, (float) this.field4777 / var10);
            this.field4782 = client.field575;
            var15 = arg0 - this.field4742.field2868 * (var7 + var13 - this.field4784);
            var16 = arg1 - this.field4742.field2868 * (var7 - (var14 - this.field4785));
        }
        class488.method8247(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4772.method8335(var15, var16, 192);
        } else {
            this.field4772.method8338(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("rc.aw(IIIIB)V")
    public void method7402(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4758.method7369()) {
            return;
        }
        if (!this.field4742.method4683()) {
            this.field4742.method4676(this.field4744, this.field4729.method4479(), client.field485);
            if (!this.field4742.method4683()) {
                return;
            }
        }
        this.field4742.method4680(arg0, arg1, arg2, arg3, this.field4757, this.field4759, this.field4755);
    }

    @ObfuscatedName("rc.aa(IS)V")
    public void method7403(int arg0) {
        this.field4749 = this.method7405(arg0);
    }

    @ObfuscatedName("rc.ah(IIIIII)V")
    public void method7431(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class488.method8241(arg0, arg1, arg2, arg3, -16777216);
        class488.method8271(var7 - 152, var8, 304, 34, -65536);
        class488.method8241(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4762.method6560(class333.field4123, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("rc.ad(IB)F")
    public float method7405(int arg0) {
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

    @ObfuscatedName("rc.bm(I)I")
    public int method7406() {
        if ((double) this.field4749 == 1.0D) {
            return 25;
        } else if ((double) this.field4749 == 1.5D) {
            return 37;
        } else if ((double) this.field4749 == 2.0D) {
            return 50;
        } else if ((double) this.field4749 == 3.0D) {
            return 75;
        } else if ((double) this.field4749 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("rc.bv(B)V")
    public void method7407() {
        this.field4758.method7374();
    }

    @ObfuscatedName("rc.bo(I)Z")
    public boolean method7408() {
        return this.field4758.method7369();
    }

    @ObfuscatedName("rc.bs(II)Ljw;")
    public class245 method7421(int arg0) {
        Iterator var2 = this.field4780.values().iterator();
        class245 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class245) var2.next();
        } while (var3.method4477() != arg0);
        return var3;
    }

    @ObfuscatedName("rc.bg(III)V")
    public void method7409(int arg0, int arg1) {
        if (this.field4729 != null && this.field4729.method4527(arg0, arg1)) {
            this.field4746 = arg0 - this.field4729.method4533() * 64;
            this.field4747 = arg1 - this.field4729.method4500() * 64;
        }
    }

    @ObfuscatedName("rc.bh(III)V")
    public void method7504(int arg0, int arg1) {
        if (this.field4729 != null) {
            this.method7446(arg0 - this.field4729.method4533() * 64, arg1 - this.field4729.method4500() * 64, true);
            this.field4746 = -1;
            this.field4747 = -1;
        }
    }

    @ObfuscatedName("rc.bl(IIII)V")
    public void method7411(int arg0, int arg1, int arg2) {
        if (this.field4729 != null) {
            int[] var4 = this.field4729.method4474(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7409(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("rc.bk(IIII)V")
    public void method7412(int arg0, int arg1, int arg2) {
        if (this.field4729 != null) {
            int[] var4 = this.field4729.method4474(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7504(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("rc.br(I)I")
    public int method7413() {
        return this.field4729 == null ? -1 : this.field4748 + this.field4729.method4533() * 64;
    }

    @ObfuscatedName("rc.ba(I)I")
    public int method7458() {
        return this.field4729 == null ? -1 : this.field4745 + this.field4729.method4500() * 64;
    }

    @ObfuscatedName("rc.bz(I)Llt;")
    public class304 method7543() {
        return this.field4729 == null ? null : this.field4729.method4510(this.method7413(), this.method7458());
    }

    @ObfuscatedName("rc.bq(I)I")
    public int method7416() {
        return this.field4750;
    }

    @ObfuscatedName("rc.bc(I)I")
    public int method7417() {
        return this.field4751;
    }

    @ObfuscatedName("rc.bt(II)V")
    public void method7418(int arg0) {
        if (arg0 >= 1) {
            this.field4754 = arg0;
        }
    }

    @ObfuscatedName("rc.be(I)V")
    public void method7535() {
        this.field4754 = 3;
    }

    @ObfuscatedName("rc.bu(II)V")
    public void method7529(int arg0) {
        if (arg0 >= 1) {
            this.field4755 = arg0;
        }
    }

    @ObfuscatedName("rc.bd(B)V")
    public void method7501() {
        this.field4755 = 50;
    }

    @ObfuscatedName("rc.by(ZI)V")
    public void method7422(boolean arg0) {
        this.field4756 = arg0;
    }

    @ObfuscatedName("rc.bp(II)V")
    public void method7496(int arg0) {
        this.field4757 = new HashSet();
        this.field4757.add(arg0);
        this.field4770 = 0;
        this.field4759 = 0;
    }

    @ObfuscatedName("rc.bb(II)V")
    public void method7484(int arg0) {
        this.field4757 = new HashSet();
        this.field4770 = 0;
        this.field4759 = 0;
        for (int var2 = 0; var2 < Statics.field1901; var2++) {
            if (class185.method2778(var2) != null && class185.method2778(var2).field1923 == arg0) {
                this.field4757.add(class185.method2778(var2).field1903);
            }
        }
    }

    @ObfuscatedName("rc.bx(I)V")
    public void method7425() {
        this.field4757 = null;
    }

    @ObfuscatedName("rc.bn(ZI)V")
    public void method7426(boolean arg0) {
        this.field4783 = !arg0;
    }

    @ObfuscatedName("rc.bj(IZI)V")
    public void method7427(int arg0, boolean arg1) {
        if (arg1) {
            this.field4769.remove(arg0);
        } else {
            this.field4769.add(arg0);
        }
        this.method7432();
    }

    @ObfuscatedName("rc.bf(IZI)V")
    public void method7490(int arg0, boolean arg1) {
        if (arg1) {
            this.field4743.remove(arg0);
        } else {
            this.field4743.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field1901; var3++) {
            if (class185.method2778(var3) != null && class185.method2778(var3).field1923 == arg0) {
                int var4 = class185.method2778(var3).field1903;
                if (arg1) {
                    this.field4771.remove(var4);
                } else {
                    this.field4771.add(var4);
                }
            }
        }
        this.method7432();
    }

    @ObfuscatedName("rc.bw(I)Z")
    public boolean method7429() {
        return !this.field4783;
    }

    @ObfuscatedName("rc.bi(II)Z")
    public boolean method7464(int arg0) {
        return !this.field4769.contains(arg0);
    }

    @ObfuscatedName("rc.cl(II)Z")
    public boolean method7466(int arg0) {
        return !this.field4743.contains(arg0);
    }

    @ObfuscatedName("rc.ca(B)V")
    public void method7432() {
        this.field4786.clear();
        this.field4786.addAll(this.field4769);
        this.field4786.addAll(this.field4771);
    }

    @ObfuscatedName("rc.cb(IIIIIIB)V")
    public void method7433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4758.method7369()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4740));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4740));
        List var9 = this.field4742.method4681(this.field4748 - var7 / 2 - 1, this.field4745 - var8 / 2 - 1, var7 / 2 + this.field4748 + 1, var8 / 2 + this.field4745 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class263 var11 = (class263) var10.next();
            class185 var12 = class185.method2778(var11.method4426());
            var13 = false;
            for (int var14 = this.field4773.length - 1; var14 >= 0; var14--) {
                if (var12.field1905[var14] != null) {
                    client.method2684(var12.field1905[var14], var12.field1913, this.field4773[var14], var11.method4426(), var11.field3008.method5208(), var11.field3013.method5208());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("rc.co(ILlt;B)Llt;")
    public class304 method7434(int arg0, class304 arg1) {
        if (!this.field4758.method7369()) {
            return null;
        } else if (!this.field4742.method4683()) {
            return null;
        } else if (this.field4729.method4527(arg1.field3429, arg1.field3431)) {
            HashMap var3 = this.field4742.method4684();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class263 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class263 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field3013;
                    }
                    var8 = (class263) var7.next();
                    int var9 = var8.field3013.field3429 - arg1.field3429;
                    int var10 = var8.field3013.field3431 - arg1.field3431;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3013;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("rc.cj(IILlt;Llt;I)V")
    public void method7435(int arg0, int arg1, class304 arg2, class304 arg3) {
        class86 var5 = new class86();
        class268 var6 = new class268(arg1, arg2, arg3);
        var5.method2158(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2165(10);
                break;
            case 1009:
                var5.method2165(11);
                break;
            case 1010:
                var5.method2165(12);
                break;
            case 1011:
                var5.method2165(13);
                break;
            case 1012:
                var5.method2165(14);
        }
        class68.method69(var5);
    }

    @ObfuscatedName("rc.cn(I)Lku;")
    public class263 method7437() {
        if (!this.field4758.method7369()) {
            return null;
        } else if (this.field4742.method4683()) {
            HashMap var1 = this.field4742.method4684();
            this.field4776 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4776.addAll(var3);
            }
            this.field4778 = this.field4776.iterator();
            return this.method7530();
        } else {
            return null;
        }
    }

    @ObfuscatedName("rc.ce(B)Lku;")
    public class263 method7530() {
        if (this.field4778 == null) {
            return null;
        }
        class263 var1;
        do {
            if (!this.field4778.hasNext()) {
                return null;
            }
            var1 = (class263) this.field4778.next();
        } while (var1.method4426() == -1);
        return var1;
    }
}
