package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lw")
public class class322 {

    @ObfuscatedName("lw.k")
    public class248 field3829;

    @ObfuscatedName("lw.i")
    public static final class296 field3833 = class296.field3674;

    @ObfuscatedName("lw.x")
    public static final class296 field3825 = class296.field3671;

    @ObfuscatedName("lw.e")
    public static final class296 field3817 = class296.field3670;

    @ObfuscatedName("lw.p")
    public class299 field3821;

    @ObfuscatedName("lw.b")
    public HashMap field3822;

    @ObfuscatedName("lw.n")
    public class318[] field3823;

    @ObfuscatedName("lw.f")
    public HashMap field3835;

    @ObfuscatedName("lw.g")
    public class21 field3839;

    @ObfuscatedName("lw.m")
    public class21 field3826;

    @ObfuscatedName("lw.r")
    public class21 field3827;

    @ObfuscatedName("lw.t")
    public class31 field3828;

    @ObfuscatedName("lw.o")
    public class321 field3851;

    @ObfuscatedName("lw.y")
    public int field3830;

    @ObfuscatedName("lw.a")
    public int field3831;

    @ObfuscatedName("lw.j")
    public int field3859 = -1;

    @ObfuscatedName("lw.d")
    public int field3819 = -1;

    @ObfuscatedName("lw.h")
    public float field3834;

    @ObfuscatedName("lw.c")
    public float field3868;

    @ObfuscatedName("lw.v")
    public int field3836 = -1;

    @ObfuscatedName("lw.af")
    public int field3837 = -1;

    @ObfuscatedName("lw.ah")
    public int field3838 = -1;

    @ObfuscatedName("lw.ab")
    public int field3832 = -1;

    @ObfuscatedName("lw.aw")
    public int field3858 = 3;

    @ObfuscatedName("lw.ak")
    public int field3841 = 50;

    @ObfuscatedName("lw.as")
    public boolean field3842 = false;

    @ObfuscatedName("lw.an")
    public HashSet field3843 = null;

    @ObfuscatedName("lw.ao")
    public int field3856 = -1;

    @ObfuscatedName("lw.at")
    public int field3820 = -1;

    @ObfuscatedName("lw.ai")
    public int field3846 = -1;

    @ObfuscatedName("lw.ac")
    public int field3847 = -1;

    @ObfuscatedName("lw.ap")
    public int field3848 = -1;

    @ObfuscatedName("lw.aa")
    public int field3818 = -1;

    @ObfuscatedName("lw.ar")
    public long field3850;

    @ObfuscatedName("lw.au")
    public int field3865;

    @ObfuscatedName("lw.av")
    public int field3852;

    @ObfuscatedName("lw.al")
    public boolean field3853 = true;

    @ObfuscatedName("lw.aq")
    public HashSet field3854 = new HashSet();

    @ObfuscatedName("lw.ad")
    public HashSet field3844 = new HashSet();

    @ObfuscatedName("lw.aj")
    public HashSet field3845 = new HashSet();

    @ObfuscatedName("lw.ax")
    public HashSet field3857 = new HashSet();

    @ObfuscatedName("lw.am")
    public boolean field3855 = false;

    @ObfuscatedName("lw.ay")
    public int field3862 = 0;

    @ObfuscatedName("lw.bk")
    public final int[] field3860 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lw.bp")
    public List field3861;

    @ObfuscatedName("lw.bi")
    public Iterator field3849;

    @ObfuscatedName("lw.bj")
    public HashSet field3863 = new HashSet();

    @ObfuscatedName("lw.bo")
    public class227 field3864 = null;

    @ObfuscatedName("lw.bq")
    public boolean field3840 = false;

    @ObfuscatedName("lw.bh")
    public class319 field3866;

    @ObfuscatedName("lw.bz")
    public int field3867;

    @ObfuscatedName("lw.bu")
    public int field3812 = -1;

    @ObfuscatedName("lw.bg")
    public int field3869 = -1;

    @ObfuscatedName("lw.bl")
    public int field3870 = -1;

    @ObfuscatedName("lw.z(Lir;Lkj;Ljava/util/HashMap;[Lly;B)V")
    public void method5560(class248 arg0, class299 arg1, HashMap arg2, class318[] arg3) {
        this.field3823 = arg3;
        this.field3829 = arg0;
        this.field3821 = arg1;
        this.field3822 = new HashMap();
        this.field3822.put(class13.field71, arg2.get(field3833));
        this.field3822.put(class13.field72, arg2.get(field3825));
        this.field3822.put(class13.field73, arg2.get(field3817));
        this.field3851 = new class321(arg0);
        int var5 = this.field3829.method4264(class30.field253.field256);
        int[] var6 = this.field3829.method4290(var5);
        this.field3835 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class183 var8 = new class183(this.field3829.method4247(var5, var6[var7]));
            class21 var9 = new class21();
            var9.method181(var8, var6[var7]);
            this.field3835.put(var9.method190(), var9);
            if (var9.method189()) {
                this.field3839 = var9;
            }
        }
        this.method5575(this.field3839);
        this.field3827 = null;
    }

    @ObfuscatedName("lw.w(B)I")
    public int method5654() {
        return this.field3829.method4268(this.field3839.method190(), class30.field263.field256) ? 100 : this.field3829.method4309(this.field3839.method190());
    }

    @ObfuscatedName("lw.s(I)V")
    public void method5573() {
        class24.method8();
    }

    @ObfuscatedName("lw.l(IIZIIIII)V")
    public void method5563(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3851.method5547()) {
            return;
        }
        this.method5566();
        this.method5661();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3834));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3834));
        List var10 = this.field3828.method448(this.field3830 - var8 / 2 - 1, this.field3831 - var9 / 2 - 1, var8 / 2 + this.field3830 + 1, var9 / 2 + this.field3831 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class29 var13 = (class29) var12.next();
            var11.add(var13);
            class57 var14 = new class57();
            class37 var15 = new class37(var13.field241, var13.field244, var13.field237);
            var14.method945(new Object[] { var15, arg0, arg1 });
            if (this.field3863.contains(var13)) {
                var14.method946(17);
            } else {
                var14.method946(15);
            }
            class70.method1589(var14);
        }
        Iterator var16 = this.field3863.iterator();
        while (var16.hasNext()) {
            class29 var17 = (class29) var16.next();
            if (!var11.contains(var17)) {
                class57 var18 = new class57();
                class37 var19 = new class37(var17.field241, var17.field244, var17.field237);
                var18.method945(new Object[] { var19, arg0, arg1 });
                var18.method946(16);
                class70.method1589(var18);
            }
        }
        this.field3863 = var11;
    }

    @ObfuscatedName("lw.u(IIZZB)V")
    public void method5734(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class185.method3250();
        this.method5596(arg0, arg1, arg3, var5);
        if (!this.method5735() && arg3 || arg2) {
            if (arg3) {
                this.field3848 = arg0;
                this.field3818 = arg1;
                this.field3846 = this.field3830;
                this.field3847 = this.field3831;
            }
            if (this.field3846 != -1) {
                int var7 = arg0 - this.field3848;
                int var8 = arg1 - this.field3818;
                this.method5695(this.field3846 - (int) ((float) var7 / this.field3868), this.field3847 + (int) ((float) var8 / this.field3868), false);
            }
        } else {
            this.method5569();
        }
        if (arg3) {
            this.field3850 = var5;
            this.field3865 = arg0;
            this.field3852 = arg1;
        }
    }

    @ObfuscatedName("lw.q(IIZJ)V")
    public void method5596(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3826 == null) {
            this.field3864 = null;
            return;
        }
        int var6 = (int) ((float) this.field3830 + ((float) (arg0 - this.field3838) - (float) this.method5702() * this.field3834 / 2.0F) / this.field3834);
        int var7 = (int) ((float) this.field3831 - ((float) (arg1 - this.field3832) - (float) this.method5598() * this.field3834 / 2.0F) / this.field3834);
        this.field3864 = this.field3826.method186(var6 + this.field3826.method239() * 64, var7 + this.field3826.method228() * 64);
        if (this.field3864 == null || !arg2) {
            return;
        }
        boolean var8 = client.field748 >= 2;
        if (var8 && class40.field342[82] && class40.field342[81]) {
            client.method178(this.field3864.field2565, this.field3864.field2566, this.field3864.field2568, false);
            return;
        }
        boolean var9 = true;
        if (this.field3853) {
            int var10 = arg0 - this.field3865;
            int var11 = arg1 - this.field3852;
            if (arg3 - this.field3850 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class173 var12 = Statics.method414(class170.field2191, client.field627.field1219);
            var12.field2258.method3376(this.field3864.method4071());
            client.field627.method1847(var12);
            this.field3850 = 0L;
        }
    }

    @ObfuscatedName("lw.i(I)V")
    public void method5566() {
        if (Statics.field176 != null) {
            this.field3834 = this.field3868;
            return;
        }
        if (this.field3834 < this.field3868) {
            this.field3834 = Math.min(this.field3868, this.field3834 / 30.0F + this.field3834);
        }
        if (this.field3834 > this.field3868) {
            this.field3834 = Math.max(this.field3868, this.field3834 - this.field3834 / 30.0F);
        }
    }

    @ObfuscatedName("lw.x(I)V")
    public void method5661() {
        if (!this.method5735()) {
            return;
        }
        int var1 = this.field3859 - this.field3830;
        int var2 = this.field3819 - this.field3831;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5695(this.field3830 + var1, this.field3831 + var2, true);
        if (this.field3859 == this.field3830 && this.field3831 == this.field3819) {
            this.field3859 = -1;
            this.field3819 = -1;
        }
    }

    @ObfuscatedName("lw.e(IIZI)V")
    public final void method5695(int arg0, int arg1, boolean arg2) {
        this.field3830 = arg0;
        this.field3831 = arg1;
        class185.method3250();
        if (arg2) {
            this.method5569();
        }
    }

    @ObfuscatedName("lw.p(I)V")
    public final void method5569() {
        this.field3818 = -1;
        this.field3848 = -1;
        this.field3847 = -1;
        this.field3846 = -1;
    }

    @ObfuscatedName("lw.b(I)Z")
    public boolean method5735() {
        return this.field3859 != -1 && this.field3819 != -1;
    }

    @ObfuscatedName("lw.n(IIIS)La;")
    public class21 method5676(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3835.values().iterator();
        class21 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class21) var4.next();
        } while (!var5.method183(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lw.f(IIIZI)V")
    public void method5571(int arg0, int arg1, int arg2, boolean arg3) {
        class21 var5 = this.method5676(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3839;
        }
        boolean var6 = false;
        if (this.field3827 != var5 || arg3) {
            this.field3827 = var5;
            this.method5575(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5618(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lw.g(II)V")
    public void method5572(int arg0) {
        class21 var2 = this.method5589(arg0);
        if (var2 != null) {
            this.method5575(var2);
        }
    }

    @ObfuscatedName("lw.m(I)I")
    public int method5713() {
        return this.field3826 == null ? -1 : this.field3826.method188();
    }

    @ObfuscatedName("lw.r(B)La;")
    public class21 method5574() {
        return this.field3826;
    }

    @ObfuscatedName("lw.t(La;B)V")
    public void method5575(class21 arg0) {
        if (this.field3826 == null || this.field3826 != arg0) {
            this.method5576(arg0);
            this.method5618(-1, -1, -1);
        }
    }

    @ObfuscatedName("lw.o(La;I)V")
    public void method5576(class21 arg0) {
        this.field3826 = arg0;
        this.field3828 = new class31(this.field3823, this.field3822);
        this.field3851.method5555(this.field3826.method190());
    }

    @ObfuscatedName("lw.y(La;Lha;Lha;ZB)V")
    public void method5633(class21 arg0, class227 arg1, class227 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3826 == null || this.field3826 != arg0) {
            this.method5576(arg0);
        }
        if (!arg3 && this.field3826.method183(arg1.field2568, arg1.field2565, arg1.field2566)) {
            this.method5618(arg1.field2568, arg1.field2565, arg1.field2566);
        } else {
            this.method5618(arg2.field2568, arg2.field2565, arg2.field2566);
        }
    }

    @ObfuscatedName("lw.a(IIIB)V")
    public void method5618(int arg0, int arg1, int arg2) {
        if (this.field3826 == null) {
            return;
        }
        int[] var4 = this.field3826.method194(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3826.method194(this.field3826.method199(), this.field3826.method198(), this.field3826.method200());
        }
        this.method5695(var4[0] - this.field3826.method239() * 64, var4[1] - this.field3826.method228() * 64, true);
        this.field3859 = -1;
        this.field3819 = -1;
        this.field3834 = this.method5585(this.field3826.method193());
        this.field3868 = this.field3834;
        this.field3861 = null;
        this.field3849 = null;
        this.field3828.method443();
    }

    @ObfuscatedName("lw.c(IIIIII)V")
    public void method5578(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class315.method5290(var6);
        class315.method5288(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class315.method5331(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3851.method5548();
        if (var7 < 100) {
            this.method5584(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3828.method474()) {
            this.field3828.method451(this.field3829, this.field3826.method190(), client.field669);
            if (!this.field3828.method474()) {
                return;
            }
        }
        if (this.field3843 != null) {
            this.field3820++;
            if (this.field3820 % this.field3841 == 0) {
                this.field3820 = 0;
                this.field3856++;
            }
            if (this.field3856 >= this.field3858 && !this.field3842) {
                this.field3843 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3834));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3834));
        this.field3828.method444(this.field3830 - var8 / 2, this.field3831 - var9 / 2, var8 / 2 + this.field3830, var9 / 2 + this.field3831, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3855) {
            boolean var10 = false;
            if (arg4 - this.field3862 > 100) {
                this.field3862 = arg4;
                var10 = true;
            }
            this.field3828.method452(this.field3830 - var8 / 2, this.field3831 - var9 / 2, var8 / 2 + this.field3830, var9 / 2 + this.field3831, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3857, this.field3843, this.field3820, this.field3841, var10);
        }
        this.method5742(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field748 >= 2;
        if (var11 && this.field3840 && this.field3864 != null) {
            this.field3821.method5097("Coord: " + this.field3864, class315.field3766 + 10, class315.field3764 + 20, 16776960, -1);
        }
        this.field3836 = var8;
        this.field3837 = var9;
        this.field3838 = arg0;
        this.field3832 = arg1;
        class315.method5291(var6);
    }

    @ObfuscatedName("lw.v(IIIIIII)Z")
    public boolean method5580(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3866 == null) {
            return true;
        } else if (this.field3866.field3788 != arg0 || this.field3866.field3789 != arg1) {
            return true;
        } else if (this.field3828.field277 != this.field3867) {
            return true;
        } else if (client.field651 != this.field3870) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lw.af(IIIIIIB)V")
    public void method5742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field176 == null) {
            return;
        }
        int var7 = 512 / (this.field3828.field277 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5562() - arg4 / 2 - var7;
        int var14 = this.method5595() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3828.field277 * (var7 + var13 - this.field3812);
        int var16 = arg1 - this.field3828.field277 * (var7 - (var14 - this.field3869));
        if (this.method5580(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3866 != null && this.field3866.field3788 == var11 && this.field3866.field3789 == var12) {
                Arrays.fill(this.field3866.field3792, 0);
            } else {
                this.field3866 = new class319(var11, var12);
            }
            this.field3812 = this.method5562() - arg4 / 2 - var7;
            this.field3869 = this.method5595() - arg5 / 2 - var7;
            this.field3867 = this.field3828.field277;
            Statics.field176.method4388(this.field3812, this.field3869, this.field3866, (float) this.field3867 / var10);
            this.field3870 = client.field651;
            var15 = arg0 - this.field3828.field277 * (var7 + var13 - this.field3812);
            var16 = arg1 - this.field3828.field277 * (var7 - (var14 - this.field3869));
        }
        class315.method5295(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3866.method5421(var15, var16, 192);
        } else {
            this.field3866.method5464(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lw.ah(IIIIB)V")
    public void method5582(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3851.method5547()) {
            return;
        }
        if (!this.field3828.method474()) {
            this.field3828.method451(this.field3829, this.field3826.method190(), client.field669);
            if (!this.field3828.method474()) {
                return;
            }
        }
        this.field3828.method447(arg0, arg1, arg2, arg3, this.field3843, this.field3820, this.field3841);
    }

    @ObfuscatedName("lw.ab(IS)V")
    public void method5583(int arg0) {
        this.field3868 = this.method5585(arg0);
    }

    @ObfuscatedName("lw.aw(IIIIIB)V")
    public void method5584(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class315.method5331(arg0, arg1, arg2, arg3, -16777216);
        class315.method5302(var7 - 152, var8, 304, 34, -65536);
        class315.method5331(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3821.method5100(class238.field3081, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lw.ak(II)F")
    public float method5585(int arg0) {
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

    @ObfuscatedName("lw.as(I)I")
    public int method5586() {
        if ((double) this.field3868 == 1.0D) {
            return 25;
        } else if ((double) this.field3868 == 1.5D) {
            return 37;
        } else if ((double) this.field3868 == 2.0D) {
            return 50;
        } else if ((double) this.field3868 == 3.0D) {
            return 75;
        } else if ((double) this.field3868 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lw.an(I)V")
    public void method5587() {
        this.field3851.method5545();
    }

    @ObfuscatedName("lw.ao(I)Z")
    public boolean method5656() {
        return this.field3851.method5547();
    }

    @ObfuscatedName("lw.at(II)La;")
    public class21 method5589(int arg0) {
        Iterator var2 = this.field3835.values().iterator();
        class21 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class21) var2.next();
        } while (var3.method188() != arg0);
        return var3;
    }

    @ObfuscatedName("lw.ai(IIB)V")
    public void method5614(int arg0, int arg1) {
        if (this.field3826 != null && this.field3826.method184(arg0, arg1)) {
            this.field3859 = arg0 - this.field3826.method239() * 64;
            this.field3819 = arg1 - this.field3826.method228() * 64;
        }
    }

    @ObfuscatedName("lw.ac(IIB)V")
    public void method5591(int arg0, int arg1) {
        if (this.field3826 != null) {
            this.method5695(arg0 - this.field3826.method239() * 64, arg1 - this.field3826.method228() * 64, true);
            this.field3859 = -1;
            this.field3819 = -1;
        }
    }

    @ObfuscatedName("lw.ap(IIII)V")
    public void method5606(int arg0, int arg1, int arg2) {
        if (this.field3826 != null) {
            int[] var4 = this.field3826.method194(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5614(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lw.aa(IIIB)V")
    public void method5593(int arg0, int arg1, int arg2) {
        if (this.field3826 != null) {
            int[] var4 = this.field3826.method194(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5591(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lw.ar(I)I")
    public int method5562() {
        return this.field3826 == null ? -1 : this.field3830 + this.field3826.method239() * 64;
    }

    @ObfuscatedName("lw.au(I)I")
    public int method5595() {
        return this.field3826 == null ? -1 : this.field3831 + this.field3826.method228() * 64;
    }

    @ObfuscatedName("lw.av(I)Lha;")
    public class227 method5561() {
        return this.field3826 == null ? null : this.field3826.method186(this.method5562(), this.method5595());
    }

    @ObfuscatedName("lw.al(B)I")
    public int method5702() {
        return this.field3836;
    }

    @ObfuscatedName("lw.ae(I)I")
    public int method5598() {
        return this.field3837;
    }

    @ObfuscatedName("lw.az(IB)V")
    public void method5649(int arg0) {
        if (arg0 >= 1) {
            this.field3858 = arg0;
        }
    }

    @ObfuscatedName("lw.aq(B)V")
    public void method5600() {
        this.field3858 = 3;
    }

    @ObfuscatedName("lw.ad(IB)V")
    public void method5601(int arg0) {
        if (arg0 >= 1) {
            this.field3841 = arg0;
        }
    }

    @ObfuscatedName("lw.aj(B)V")
    public void method5602() {
        this.field3841 = 50;
    }

    @ObfuscatedName("lw.ax(ZI)V")
    public void method5594(boolean arg0) {
        this.field3842 = arg0;
    }

    @ObfuscatedName("lw.am(II)V")
    public void method5666(int arg0) {
        this.field3843 = new HashSet();
        this.field3843.add(arg0);
        this.field3856 = 0;
        this.field3820 = 0;
    }

    @ObfuscatedName("lw.ay(II)V")
    public void method5712(int arg0) {
        this.field3843 = new HashSet();
        this.field3856 = 0;
        this.field3820 = 0;
        for (int var2 = 0; var2 < Statics.field3247.length; var2++) {
            if (Statics.field3247[var2] != null && Statics.field3247[var2].field3241 == arg0) {
                this.field3843.add(Statics.field3247[var2].field3239);
            }
        }
    }

    @ObfuscatedName("lw.ag(B)V")
    public void method5674() {
        this.field3843 = null;
    }

    @ObfuscatedName("lw.bk(ZI)V")
    public void method5607(boolean arg0) {
        this.field3855 = !arg0;
    }

    @ObfuscatedName("lw.bp(IZB)V")
    public void method5608(int arg0, boolean arg1) {
        if (arg1) {
            this.field3854.remove(arg0);
        } else {
            this.field3854.add(arg0);
        }
        this.method5613();
    }

    @ObfuscatedName("lw.bi(IZI)V")
    public void method5609(int arg0, boolean arg1) {
        if (arg1) {
            this.field3844.remove(arg0);
        } else {
            this.field3844.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3247.length; var3++) {
            if (Statics.field3247[var3] != null && Statics.field3247[var3].field3241 == arg0) {
                int var4 = Statics.field3247[var3].field3239;
                if (arg1) {
                    this.field3845.remove(var4);
                } else {
                    this.field3845.add(var4);
                }
            }
        }
        this.method5613();
    }

    @ObfuscatedName("lw.bj(I)Z")
    public boolean method5610() {
        return !this.field3855;
    }

    @ObfuscatedName("lw.bo(IB)Z")
    public boolean method5611(int arg0) {
        return !this.field3854.contains(arg0);
    }

    @ObfuscatedName("lw.bq(II)Z")
    public boolean method5612(int arg0) {
        return !this.field3844.contains(arg0);
    }

    @ObfuscatedName("lw.bh(I)V")
    public void method5613() {
        this.field3857.clear();
        this.field3857.addAll(this.field3854);
        this.field3857.addAll(this.field3845);
    }

    @ObfuscatedName("lw.bz(IIIIIII)V")
    public void method5718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3851.method5547()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3834));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3834));
        List var9 = this.field3828.method448(this.field3830 - var7 / 2 - 1, this.field3831 - var8 / 2 - 1, var7 / 2 + this.field3830 + 1, var8 / 2 + this.field3831 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class29 var11 = (class29) var10.next();
            class256 var12 = Statics.field3247[var11.field241];
            var13 = false;
            for (int var14 = this.field3860.length - 1; var14 >= 0; var14--) {
                if (var12.field3245[var14] != null) {
                    client.method914(var12.field3245[var14], var12.field3256, this.field3860[var14], var11.field241, var11.field244.method4071(), var11.field237.method4071());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lw.bu(ILha;I)Lha;")
    public class227 method5660(int arg0, class227 arg1) {
        if (!this.field3851.method5547()) {
            return null;
        } else if (!this.field3828.method474()) {
            return null;
        } else if (this.field3826.method184(arg1.field2565, arg1.field2566)) {
            HashMap var3 = this.field3828.method450();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class29 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class29 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field237;
                    }
                    var8 = (class29) var7.next();
                    int var9 = var8.field237.field2565 - arg1.field2565;
                    int var10 = var8.field237.field2566 - arg1.field2566;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field237;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lw.bg(IILha;Lha;B)V")
    public void method5568(int arg0, int arg1, class227 arg2, class227 arg3) {
        class57 var5 = new class57();
        class37 var6 = new class37(arg1, arg2, arg3);
        var5.method945(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method946(10);
                break;
            case 1009:
                var5.method946(11);
                break;
            case 1010:
                var5.method946(12);
                break;
            case 1011:
                var5.method946(13);
                break;
            case 1012:
                var5.method946(14);
        }
        class70.method1589(var5);
    }

    @ObfuscatedName("lw.bl(S)Lab;")
    public class29 method5706() {
        if (!this.field3851.method5547()) {
            return null;
        } else if (this.field3828.method474()) {
            HashMap var1 = this.field3828.method450();
            this.field3861 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3861.addAll(var3);
            }
            this.field3849 = this.field3861.iterator();
            return this.method5746();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lw.ba(B)Lab;")
    public class29 method5746() {
        if (this.field3849 == null) {
            return null;
        } else if (this.field3849.hasNext()) {
            return (class29) this.field3849.next();
        } else {
            return null;
        }
    }
}
