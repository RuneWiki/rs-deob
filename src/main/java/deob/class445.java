package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("qf")
public class class445 {

    @ObfuscatedName("qf.i")
    public class337 field4764;

    @ObfuscatedName("qf.n")
    public class337 field4785;

    @ObfuscatedName("qf.l")
    public class337 field4787;

    @ObfuscatedName("qf.k")
    public static final class447 field4815 = class447.field4826;

    @ObfuscatedName("qf.c")
    public static final class447 field4770 = class447.field4827;

    @ObfuscatedName("qf.r")
    public static final class447 field4769 = class447.field4828;

    @ObfuscatedName("qf.b")
    public class372 field4766;

    @ObfuscatedName("qf.m")
    public HashMap field4771;

    @ObfuscatedName("qf.t")
    public class487[] field4772;

    @ObfuscatedName("qf.h")
    public HashMap field4773;

    @ObfuscatedName("qf.p")
    public class242 field4774;

    @ObfuscatedName("qf.o")
    public class242 field4775;

    @ObfuscatedName("qf.u")
    public class242 field4776;

    @ObfuscatedName("qf.x")
    public class244 field4804;

    @ObfuscatedName("qf.a")
    public class444 field4778;

    @ObfuscatedName("qf.q")
    public int field4812;

    @ObfuscatedName("qf.d")
    public int field4780;

    @ObfuscatedName("qf.e")
    public int field4781 = -1;

    @ObfuscatedName("qf.g")
    public int field4782 = -1;

    @ObfuscatedName("qf.y")
    public float field4783;

    @ObfuscatedName("qf.af")
    public float field4786;

    @ObfuscatedName("qf.aa")
    public int field4767 = -1;

    @ObfuscatedName("qf.ai")
    public int field4805 = -1;

    @ObfuscatedName("qf.ag")
    public int field4808 = -1;

    @ObfuscatedName("qf.aw")
    public int field4777 = -1;

    @ObfuscatedName("qf.ar")
    public int field4789 = 3;

    @ObfuscatedName("qf.al")
    public int field4790 = 50;

    @ObfuscatedName("qf.at")
    public boolean field4791 = false;

    @ObfuscatedName("qf.aj")
    public HashSet field4792 = null;

    @ObfuscatedName("qf.ax")
    public int field4793 = -1;

    @ObfuscatedName("qf.az")
    public int field4794 = -1;

    @ObfuscatedName("qf.ap")
    public int field4795 = -1;

    @ObfuscatedName("qf.ay")
    public int field4796 = -1;

    @ObfuscatedName("qf.ac")
    public int field4797 = -1;

    @ObfuscatedName("qf.av")
    public int field4802 = -1;

    @ObfuscatedName("qf.aq")
    public long field4798;

    @ObfuscatedName("qf.ak")
    public int field4800;

    @ObfuscatedName("qf.au")
    public int field4801;

    @ObfuscatedName("qf.ae")
    public boolean field4788 = true;

    @ObfuscatedName("qf.ab")
    public HashSet field4803 = new HashSet();

    @ObfuscatedName("qf.an")
    public HashSet field4784 = new HashSet();

    @ObfuscatedName("qf.am")
    public HashSet field4779 = new HashSet();

    @ObfuscatedName("qf.as")
    public HashSet field4806 = new HashSet();

    @ObfuscatedName("qf.ao")
    public boolean field4807 = false;

    @ObfuscatedName("qf.bj")
    public int field4799 = 0;

    @ObfuscatedName("qf.bz")
    public final int[] field4809 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("qf.br")
    public List field4810;

    @ObfuscatedName("qf.bm")
    public Iterator field4761;

    @ObfuscatedName("qf.be")
    public HashSet field4819 = new HashSet();

    @ObfuscatedName("qf.bo")
    public class301 field4811 = null;

    @ObfuscatedName("qf.bl")
    public boolean field4814 = false;

    @ObfuscatedName("qf.bq")
    public class488 field4768;

    @ObfuscatedName("qf.bn")
    public int field4816;

    @ObfuscatedName("qf.bi")
    public int field4813 = -1;

    @ObfuscatedName("qf.bw")
    public int field4818 = -1;

    @ObfuscatedName("qf.bt")
    public int field4817 = -1;

    @ObfuscatedName("qf.f(Lln;Lln;Lln;Lnv;Ljava/util/HashMap;[Lrg;B)V")
    public void method7462(class337 arg0, class337 arg1, class337 arg2, class372 arg3, HashMap arg4, class487[] arg5) {
        this.field4772 = arg5;
        this.field4764 = arg0;
        this.field4785 = arg1;
        this.field4787 = arg2;
        this.field4766 = arg3;
        this.field4771 = new HashMap();
        this.field4771.put(class239.field2817, arg4.get(field4815));
        this.field4771.put(class239.field2820, arg4.get(field4770));
        this.field4771.put(class239.field2818, arg4.get(field4769));
        this.field4778 = new class444(arg0);
        int var7 = this.field4764.method5988(class261.field3014.field3016);
        int[] var8 = this.field4764.method5981(var7);
        this.field4773 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class474 var10 = new class474(this.field4764.method5990(var7, var8[var9]));
            class242 var11 = new class242();
            var11.method4562(var10, var8[var9]);
            this.field4773.put(var11.method4571(), var11);
            if (var11.method4570()) {
                this.field4774 = var11;
            }
        }
        this.method7573(this.field4774);
        this.field4776 = null;
    }

    @ObfuscatedName("qf.w(B)V")
    public void method7463() {
        class243.method1740();
    }

    @ObfuscatedName("qf.v(IIZIIIIB)V")
    public void method7521(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field4778.method7453()) {
            return;
        }
        this.method7467();
        this.method7595();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4783));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4783));
        List var10 = this.field4804.method4787(this.field4812 - var8 / 2 - 1, this.field4780 - var9 / 2 - 1, var8 / 2 + this.field4812 + 1, var9 / 2 + this.field4780 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class260 var13 = (class260) var12.next();
            var11.add(var13);
            class84 var14 = new class84();
            class265 var15 = new class265(var13.method4535(), var13.field3008, var13.field3009);
            var14.method2208(new Object[] { var15, arg0, arg1 });
            if (this.field4819.contains(var13)) {
                var14.method2210(17);
            } else {
                var14.method2210(15);
            }
            class67.method4946(var14);
        }
        Iterator var16 = this.field4819.iterator();
        while (var16.hasNext()) {
            class260 var17 = (class260) var16.next();
            if (!var11.contains(var17)) {
                class84 var18 = new class84();
                class265 var19 = new class265(var17.method4535(), var17.field3008, var17.field3009);
                var18.method2208(new Object[] { var19, arg0, arg1 });
                var18.method2210(16);
                class67.method4946(var18);
            }
        }
        this.field4819 = var11;
    }

    @ObfuscatedName("qf.s(IIZZB)V")
    public void method7465(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5;
        label33: {
            var5 = class287.method3099();
            this.method7499(arg0, arg1, arg3, var5);
            if (!this.method7552() && (arg3 || arg2)) {
                boolean var7 = client.field688 != null;
                if (!var7) {
                    if (arg3) {
                        this.field4797 = arg0;
                        this.field4802 = arg1;
                        this.field4795 = this.field4812;
                        this.field4796 = this.field4780;
                    }
                    if (this.field4795 != -1) {
                        int var8 = arg0 - this.field4797;
                        int var9 = arg1 - this.field4802;
                        this.method7469(this.field4795 - (int) ((float) var8 / this.field4786), this.field4796 + (int) ((float) var9 / this.field4786), false);
                    }
                    break label33;
                }
            }
            this.method7470();
        }
        if (arg3) {
            this.field4798 = var5;
            this.field4800 = arg0;
            this.field4801 = arg1;
        }
    }

    @ObfuscatedName("qf.z(IIZJ)V")
    public void method7499(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4775 == null) {
            this.field4811 = null;
            return;
        }
        int var6 = (int) ((float) this.field4812 + ((float) (arg0 - this.field4808) - (float) this.method7624() * this.field4783 / 2.0F) / this.field4783);
        int var7 = (int) ((float) this.field4780 - ((float) (arg1 - this.field4777) - (float) this.method7500() * this.field4783 / 2.0F) / this.field4783);
        this.field4811 = this.field4775.method4574(var6 + this.field4775.method4575() * 64, var7 + this.field4775.method4577() * 64);
        if (this.field4811 == null || !arg2) {
            return;
        }
        class206 var8 = client.field703;
        boolean var10 = client.field684 >= 2;
        if (var10 && var8.method3820(82) && var8.method3820(81)) {
            client.method3232(this.field4811.field3463, this.field4811.field3462, this.field4811.field3464, false);
            return;
        }
        boolean var11 = true;
        if (this.field4788) {
            int var12 = arg0 - this.field4800;
            int var13 = arg1 - this.field4801;
            if (arg3 - this.field4798 > 500L || var12 < -25 || var12 > 25 || var13 < -25 || var13 > 25) {
                var11 = false;
            }
        }
        if (var11) {
            class282 var14 = class282.method4287(class280.field3074, client.field689.field1390);
            var14.field3187.method8016(this.field4811.method5322());
            client.field689.method2694(var14);
            this.field4798 = 0L;
        }
    }

    @ObfuscatedName("qf.j(I)V")
    public void method7467() {
        if (Statics.field1634 != null) {
            this.field4783 = this.field4786;
            return;
        }
        if (this.field4783 < this.field4786) {
            this.field4783 = Math.min(this.field4786, this.field4783 / 30.0F + this.field4783);
        }
        if (this.field4783 > this.field4786) {
            this.field4783 = Math.max(this.field4786, this.field4783 - this.field4783 / 30.0F);
        }
    }

    @ObfuscatedName("qf.i(B)V")
    public void method7595() {
        if (!this.method7552()) {
            return;
        }
        int var1 = this.field4781 - this.field4812;
        int var2 = this.field4782 - this.field4780;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method7469(this.field4812 + var1, this.field4780 + var2, true);
        if (this.field4812 == this.field4781 && this.field4782 == this.field4780) {
            this.field4781 = -1;
            this.field4782 = -1;
        }
    }

    @ObfuscatedName("qf.n(IIZI)V")
    public final void method7469(int arg0, int arg1, boolean arg2) {
        this.field4812 = arg0;
        this.field4780 = arg1;
        class287.method3099();
        if (arg2) {
            this.method7470();
        }
    }

    @ObfuscatedName("qf.l(I)V")
    public final void method7470() {
        this.field4802 = -1;
        this.field4797 = -1;
        this.field4796 = -1;
        this.field4795 = -1;
    }

    @ObfuscatedName("qf.k(I)Z")
    public boolean method7552() {
        return this.field4781 != -1 && this.field4782 != -1;
    }

    @ObfuscatedName("qf.c(IIII)Lii;")
    public class242 method7472(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field4773.values().iterator();
        class242 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class242) var4.next();
        } while (!var5.method4564(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("qf.r(IIIZB)V")
    public void method7656(int arg0, int arg1, int arg2, boolean arg3) {
        class242 var5 = this.method7472(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field4774;
        }
        boolean var6 = false;
        if (this.field4776 != var5 || arg3) {
            this.field4776 = var5;
            this.method7573(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method7480(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("qf.b(II)V")
    public void method7570(int arg0) {
        class242 var2 = this.method7491(arg0);
        if (var2 != null) {
            this.method7573(var2);
        }
    }

    @ObfuscatedName("qf.m(I)I")
    public int method7475() {
        return this.field4775 == null ? -1 : this.field4775.method4569();
    }

    @ObfuscatedName("qf.t(I)Lii;")
    public class242 method7476() {
        return this.field4775;
    }

    @ObfuscatedName("qf.h(Lii;B)V")
    public void method7573(class242 arg0) {
        if (this.field4775 == null || this.field4775 != arg0) {
            this.method7572(arg0);
            this.method7480(-1, -1, -1);
        }
    }

    @ObfuscatedName("qf.p(Lii;I)V")
    public void method7572(class242 arg0) {
        this.field4775 = arg0;
        this.field4804 = new class244(this.field4772, this.field4771, this.field4785, this.field4787);
        this.field4778.method7452(this.field4775.method4571());
    }

    @ObfuscatedName("qf.o(Lii;Lko;Lko;ZI)V")
    public void method7648(class242 arg0, class301 arg1, class301 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4775 == null || this.field4775 != arg0) {
            this.method7572(arg0);
        }
        if (!arg3 && this.field4775.method4564(arg1.field3464, arg1.field3463, arg1.field3462)) {
            this.method7480(arg1.field3464, arg1.field3463, arg1.field3462);
        } else {
            this.method7480(arg2.field3464, arg2.field3463, arg2.field3462);
        }
    }

    @ObfuscatedName("qf.u(IIII)V")
    public void method7480(int arg0, int arg1, int arg2) {
        if (this.field4775 == null) {
            return;
        }
        int[] var4 = this.field4775.method4581(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4775.method4581(this.field4775.method4580(), this.field4775.method4579(), this.field4775.method4639());
        }
        this.method7469(var4[0] - this.field4775.method4575() * 64, var4[1] - this.field4775.method4577() * 64, true);
        this.field4781 = -1;
        this.field4782 = -1;
        this.field4783 = this.method7654(this.field4775.method4617());
        this.field4786 = this.field4783;
        this.field4810 = null;
        this.field4761 = null;
        this.field4804.method4827();
    }

    @ObfuscatedName("qf.x(IIIIIB)V")
    public void method7645(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class484.method8290(var6);
        class484.method8288(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class484.method8296(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field4778.method7451();
        if (var7 < 100) {
            this.method7574(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field4804.method4789()) {
            this.field4804.method4782(this.field4764, this.field4775.method4571(), client.field500);
            if (!this.field4804.method4789()) {
                return;
            }
        }
        if (this.field4792 != null) {
            this.field4794++;
            if (this.field4794 % this.field4790 == 0) {
                this.field4794 = 0;
                this.field4793++;
            }
            if (this.field4793 >= this.field4789 && !this.field4791) {
                this.field4792 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4783));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4783));
        class251.field2952 = client.field506 >= 209;
        this.field4804.method4792(this.field4812 - var8 / 2, this.field4780 - var9 / 2, var8 / 2 + this.field4812, var9 / 2 + this.field4780, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field4807) {
            boolean var10 = false;
            if (arg4 - this.field4799 > 100) {
                this.field4799 = arg4;
                var10 = true;
            }
            this.field4804.method4791(this.field4812 - var8 / 2, this.field4780 - var9 / 2, var8 / 2 + this.field4812, var9 / 2 + this.field4780, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field4806, this.field4792, this.field4794, this.field4790, var10);
        }
        this.method7483(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field684 >= 2;
        if (var11 && this.field4814 && this.field4811 != null) {
            this.field4766.method6634("Coord: " + this.field4811, class484.field5006 + 10, class484.field5009 + 20, 16776960, -1);
        }
        this.field4767 = var8;
        this.field4805 = var9;
        this.field4808 = arg0;
        this.field4777 = arg1;
        class484.method8291(var6);
    }

    @ObfuscatedName("qf.a(IIIIIII)Z")
    public boolean method7482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field4768 == null) {
            return true;
        } else if (this.field4768.field5034 != arg0 || this.field4768.field5032 != arg1) {
            return true;
        } else if (this.field4804.field2891 != this.field4816) {
            return true;
        } else if (client.field797 != this.field4817) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("qf.q(IIIIIII)V")
    public void method7483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1634 == null) {
            return;
        }
        int var7 = 512 / (this.field4804.field2891 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method7496() - arg4 / 2 - var7;
        int var14 = this.method7497() - arg5 / 2 - var7;
        int var15 = arg0 - this.field4804.field2891 * (var7 + var13 - this.field4813);
        int var16 = arg1 - this.field4804.field2891 * (var7 - (var14 - this.field4818));
        if (this.method7482(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field4768 != null && this.field4768.field5034 == var11 && this.field4768.field5032 == var12) {
                Arrays.fill(this.field4768.field5041, 0);
            } else {
                this.field4768 = new class488(var11, var12);
            }
            this.field4813 = this.method7496() - arg4 / 2 - var7;
            this.field4818 = this.method7497() - arg5 / 2 - var7;
            this.field4816 = this.field4804.field2891;
            Statics.field1634.method6201(this.field4813, this.field4818, this.field4768, (float) this.field4816 / var10);
            this.field4817 = client.field797;
            var15 = arg0 - this.field4804.field2891 * (var7 + var13 - this.field4813);
            var16 = arg1 - this.field4804.field2891 * (var7 - (var14 - this.field4818));
        }
        class484.method8295(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field4768.method8451(var15, var16, 192);
        } else {
            this.field4768.method8414(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("qf.d(IIIIB)V")
    public void method7484(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field4778.method7453()) {
            return;
        }
        if (!this.field4804.method4789()) {
            this.field4804.method4782(this.field4764, this.field4775.method4571(), client.field500);
            if (!this.field4804.method4789()) {
                return;
            }
        }
        this.field4804.method4786(arg0, arg1, arg2, arg3, this.field4792, this.field4794, this.field4790);
    }

    @ObfuscatedName("qf.e(IB)V")
    public void method7485(int arg0) {
        this.field4786 = this.method7654(arg0);
    }

    @ObfuscatedName("qf.g(IIIIII)V")
    public void method7574(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class484.method8296(arg0, arg1, arg2, arg3, -16777216);
        class484.method8300(var7 - 152, var8, 304, 34, -65536);
        class484.method8296(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4766.method6658(class330.field4045, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("qf.y(II)F")
    public float method7654(int arg0) {
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

    @ObfuscatedName("qf.af(I)I")
    public int method7488() {
        if ((double) this.field4786 == 1.0D) {
            return 25;
        } else if ((double) this.field4786 == 1.5D) {
            return 37;
        } else if ((double) this.field4786 == 2.0D) {
            return 50;
        } else if ((double) this.field4786 == 3.0D) {
            return 75;
        } else if ((double) this.field4786 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("qf.aa(I)V")
    public void method7489() {
        this.field4778.method7454();
    }

    @ObfuscatedName("qf.ai(B)Z")
    public boolean method7549() {
        return this.field4778.method7453();
    }

    @ObfuscatedName("qf.ag(II)Lii;")
    public class242 method7491(int arg0) {
        Iterator var2 = this.field4773.values().iterator();
        class242 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class242) var2.next();
        } while (var3.method4569() != arg0);
        return var3;
    }

    @ObfuscatedName("qf.aw(IIB)V")
    public void method7622(int arg0, int arg1) {
        if (this.field4775 != null && this.field4775.method4566(arg0, arg1)) {
            this.field4781 = arg0 - this.field4775.method4575() * 64;
            this.field4782 = arg1 - this.field4775.method4577() * 64;
        }
    }

    @ObfuscatedName("qf.ar(III)V")
    public void method7493(int arg0, int arg1) {
        if (this.field4775 != null) {
            this.method7469(arg0 - this.field4775.method4575() * 64, arg1 - this.field4775.method4577() * 64, true);
            this.field4781 = -1;
            this.field4782 = -1;
        }
    }

    @ObfuscatedName("qf.al(IIIS)V")
    public void method7494(int arg0, int arg1, int arg2) {
        if (this.field4775 != null) {
            int[] var4 = this.field4775.method4581(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7622(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("qf.at(IIII)V")
    public void method7495(int arg0, int arg1, int arg2) {
        if (this.field4775 != null) {
            int[] var4 = this.field4775.method4581(arg0, arg1, arg2);
            if (var4 != null) {
                this.method7493(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("qf.aj(I)I")
    public int method7496() {
        return this.field4775 == null ? -1 : this.field4812 + this.field4775.method4575() * 64;
    }

    @ObfuscatedName("qf.ax(B)I")
    public int method7497() {
        return this.field4775 == null ? -1 : this.field4780 + this.field4775.method4577() * 64;
    }

    @ObfuscatedName("qf.az(B)Lko;")
    public class301 method7498() {
        return this.field4775 == null ? null : this.field4775.method4574(this.method7496(), this.method7497());
    }

    @ObfuscatedName("qf.ap(I)I")
    public int method7624() {
        return this.field4767;
    }

    @ObfuscatedName("qf.ay(B)I")
    public int method7500() {
        return this.field4805;
    }

    @ObfuscatedName("qf.ac(II)V")
    public void method7501(int arg0) {
        if (arg0 >= 1) {
            this.field4789 = arg0;
        }
    }

    @ObfuscatedName("qf.av(I)V")
    public void method7502() {
        this.field4789 = 3;
    }

    @ObfuscatedName("qf.aq(II)V")
    public void method7503(int arg0) {
        if (arg0 >= 1) {
            this.field4790 = arg0;
        }
    }

    @ObfuscatedName("qf.ak(B)V")
    public void method7504() {
        this.field4790 = 50;
    }

    @ObfuscatedName("qf.au(ZI)V")
    public void method7505(boolean arg0) {
        this.field4791 = arg0;
    }

    @ObfuscatedName("qf.ae(IB)V")
    public void method7506(int arg0) {
        this.field4792 = new HashSet();
        this.field4792.add(arg0);
        this.field4793 = 0;
        this.field4794 = 0;
    }

    @ObfuscatedName("qf.ah(II)V")
    public void method7651(int arg0) {
        this.field4792 = new HashSet();
        this.field4793 = 0;
        this.field4794 = 0;
        for (int var2 = 0; var2 < Statics.field4358; var2++) {
            if (class183.method18(var2) != null && class183.method18(var2).field1956 == arg0) {
                this.field4792.add(class183.method18(var2).field1937);
            }
        }
    }

    @ObfuscatedName("qf.ad(I)V")
    public void method7508() {
        this.field4792 = null;
    }

    @ObfuscatedName("qf.ab(ZI)V")
    public void method7474(boolean arg0) {
        this.field4807 = !arg0;
    }

    @ObfuscatedName("qf.an(IZI)V")
    public void method7510(int arg0, boolean arg1) {
        if (arg1) {
            this.field4803.remove(arg0);
        } else {
            this.field4803.add(arg0);
        }
        this.method7515();
    }

    @ObfuscatedName("qf.am(IZS)V")
    public void method7511(int arg0, boolean arg1) {
        if (arg1) {
            this.field4784.remove(arg0);
        } else {
            this.field4784.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field4358; var3++) {
            if (class183.method18(var3) != null && class183.method18(var3).field1956 == arg0) {
                int var4 = class183.method18(var3).field1937;
                if (arg1) {
                    this.field4779.remove(var4);
                } else {
                    this.field4779.add(var4);
                }
            }
        }
        this.method7515();
    }

    @ObfuscatedName("qf.as(I)Z")
    public boolean method7512() {
        return !this.field4807;
    }

    @ObfuscatedName("qf.ao(II)Z")
    public boolean method7513(int arg0) {
        return !this.field4803.contains(arg0);
    }

    @ObfuscatedName("qf.bj(II)Z")
    public boolean method7514(int arg0) {
        return !this.field4784.contains(arg0);
    }

    @ObfuscatedName("qf.bf(B)V")
    public void method7515() {
        this.field4806.clear();
        this.field4806.addAll(this.field4803);
        this.field4806.addAll(this.field4779);
    }

    @ObfuscatedName("qf.bz(IIIIIII)V")
    public void method7516(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field4778.method7453()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4783));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4783));
        List var9 = this.field4804.method4787(this.field4812 - var7 / 2 - 1, this.field4780 - var8 / 2 - 1, var7 / 2 + this.field4812 + 1, var8 / 2 + this.field4780 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class183 var12 = class183.method18(var11.method4535());
            var13 = false;
            for (int var14 = this.field4809.length - 1; var14 >= 0; var14--) {
                if (var12.field1945[var14] != null) {
                    client.method4803(var12.field1945[var14], var12.field1946, this.field4809[var14], var11.method4535(), var11.field3008.method5322(), var11.field3009.method5322());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("qf.br(ILko;B)Lko;")
    public class301 method7464(int arg0, class301 arg1) {
        if (!this.field4778.method7453()) {
            return null;
        } else if (!this.field4804.method4789()) {
            return null;
        } else if (this.field4775.method4566(arg1.field3463, arg1.field3462)) {
            HashMap var3 = this.field4804.method4790();
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
                        return var5.field3009;
                    }
                    var8 = (class260) var7.next();
                    int var9 = var8.field3009.field3463 - arg1.field3463;
                    int var10 = var8.field3009.field3462 - arg1.field3462;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field3009;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("qf.bm(IILko;Lko;I)V")
    public void method7518(int arg0, int arg1, class301 arg2, class301 arg3) {
        class84 var5 = new class84();
        class265 var6 = new class265(arg1, arg2, arg3);
        var5.method2208(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method2210(10);
                break;
            case 1009:
                var5.method2210(11);
                break;
            case 1010:
                var5.method2210(12);
                break;
            case 1011:
                var5.method2210(13);
                break;
            case 1012:
                var5.method2210(14);
        }
        class67.method4946(var5);
    }

    @ObfuscatedName("qf.be(I)Lio;")
    public class260 method7519() {
        if (!this.field4778.method7453()) {
            return null;
        } else if (this.field4804.method4789()) {
            HashMap var1 = this.field4804.method4790();
            this.field4810 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field4810.addAll(var3);
            }
            this.field4761 = this.field4810.iterator();
            return this.method7520();
        } else {
            return null;
        }
    }

    @ObfuscatedName("qf.bo(I)Lio;")
    public class260 method7520() {
        if (this.field4761 == null) {
            return null;
        }
        class260 var1;
        do {
            if (!this.field4761.hasNext()) {
                return null;
            }
            var1 = (class260) this.field4761.next();
        } while (var1.method4535() == -1);
        return var1;
    }
}
