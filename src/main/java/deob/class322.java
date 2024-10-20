package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lz")
public class class322 {

    @ObfuscatedName("lz.h")
    public class248 field3863;

    @ObfuscatedName("lz.x")
    public static final class296 field3852 = class296.field3683;

    @ObfuscatedName("lz.j")
    public static final class296 field3836 = class296.field3684;

    @ObfuscatedName("lz.a")
    public static final class296 field3825 = class296.field3685;

    @ObfuscatedName("lz.l")
    public class299 field3826;

    @ObfuscatedName("lz.d")
    public HashMap field3827;

    @ObfuscatedName("lz.s")
    public class318[] field3854;

    @ObfuscatedName("lz.p")
    public HashMap field3867;

    @ObfuscatedName("lz.g")
    public class21 field3830;

    @ObfuscatedName("lz.y")
    public class21 field3842;

    @ObfuscatedName("lz.c")
    public class21 field3832;

    @ObfuscatedName("lz.e")
    public class31 field3833;

    @ObfuscatedName("lz.t")
    public class321 field3834;

    @ObfuscatedName("lz.u")
    public int field3835;

    @ObfuscatedName("lz.i")
    public int field3831;

    @ObfuscatedName("lz.z")
    public int field3837 = -1;

    @ObfuscatedName("lz.k")
    public int field3838 = -1;

    @ObfuscatedName("lz.r")
    public float field3839;

    @ObfuscatedName("lz.v")
    public float field3840;

    @ObfuscatedName("lz.o")
    public int field3855 = -1;

    @ObfuscatedName("lz.ai")
    public int field3819 = -1;

    @ObfuscatedName("lz.at")
    public int field3829 = -1;

    @ObfuscatedName("lz.ad")
    public int field3844 = -1;

    @ObfuscatedName("lz.ac")
    public int field3845 = 3;

    @ObfuscatedName("lz.ay")
    public int field3846 = 50;

    @ObfuscatedName("lz.an")
    public boolean field3822 = false;

    @ObfuscatedName("lz.as")
    public HashSet field3848 = null;

    @ObfuscatedName("lz.aw")
    public int field3849 = -1;

    @ObfuscatedName("lz.ag")
    public int field3850 = -1;

    @ObfuscatedName("lz.ah")
    public int field3851 = -1;

    @ObfuscatedName("lz.az")
    public int field3875 = -1;

    @ObfuscatedName("lz.ao")
    public int field3853 = -1;

    @ObfuscatedName("lz.ap")
    public int field3858 = -1;

    @ObfuscatedName("lz.af")
    public long field3856;

    @ObfuscatedName("lz.am")
    public int field3824;

    @ObfuscatedName("lz.aq")
    public int field3857;

    @ObfuscatedName("lz.aj")
    public boolean field3859 = true;

    @ObfuscatedName("lz.av")
    public HashSet field3864 = new HashSet();

    @ObfuscatedName("lz.ab")
    public HashSet field3860 = new HashSet();

    @ObfuscatedName("lz.aa")
    public HashSet field3861 = new HashSet();

    @ObfuscatedName("lz.ar")
    public HashSet field3862 = new HashSet();

    @ObfuscatedName("lz.ax")
    public boolean field3820 = false;

    @ObfuscatedName("lz.al")
    public int field3866 = 0;

    @ObfuscatedName("lz.bc")
    public final int[] field3865 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lz.bo")
    public List field3868;

    @ObfuscatedName("lz.bx")
    public Iterator field3823;

    @ObfuscatedName("lz.be")
    public HashSet field3870 = new HashSet();

    @ObfuscatedName("lz.br")
    public class227 field3869 = null;

    @ObfuscatedName("lz.bk")
    public boolean field3847 = false;

    @ObfuscatedName("lz.bn")
    public class319 field3871;

    @ObfuscatedName("lz.bp")
    public int field3872;

    @ObfuscatedName("lz.bu")
    public int field3873 = -1;

    @ObfuscatedName("lz.by")
    public int field3874 = -1;

    @ObfuscatedName("lz.bl")
    public int field3843 = -1;

    @ObfuscatedName("lz.w(Liv;Lkr;Ljava/util/HashMap;[Llh;I)V")
    public void method5604(class248 arg0, class299 arg1, HashMap arg2, class318[] arg3) {
        this.field3854 = arg3;
        this.field3863 = arg0;
        this.field3826 = arg1;
        this.field3827 = new HashMap();
        this.field3827.put(class13.field94, arg2.get(field3852));
        this.field3827.put(class13.field88, arg2.get(field3836));
        this.field3827.put(class13.field90, arg2.get(field3825));
        this.field3834 = new class321(arg0);
        int var5 = this.field3863.method4268(class30.field258.field263);
        int[] var6 = this.field3863.method4272(var5);
        this.field3867 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class183 var8 = new class183(this.field3863.method4250(var5, var6[var7]));
            class21 var9 = new class21();
            var9.method202(var8, var6[var7]);
            this.field3867.put(var9.method211(), var9);
            if (var9.method243()) {
                this.field3830 = var9;
            }
        }
        this.method5619(this.field3830);
        this.field3832 = null;
    }

    @ObfuscatedName("lz.m(I)I")
    public int method5605() {
        return this.field3863.method4312(this.field3830.method211(), class30.field261.field263) ? 100 : this.field3863.method4275(this.field3830.method211());
    }

    @ObfuscatedName("lz.q(S)V")
    public void method5606() {
        class24.method1626();
    }

    @ObfuscatedName("lz.x(IIZIIIII)V")
    public void method5719(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3834.method5592()) {
            return;
        }
        this.method5675();
        this.method5611();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3839));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3839));
        List var10 = this.field3833.method515(this.field3835 - var8 / 2 - 1, this.field3831 - var9 / 2 - 1, var8 / 2 + this.field3835 + 1, var9 / 2 + this.field3831 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class29 var13 = (class29) var12.next();
            var11.add(var13);
            class57 var14 = new class57();
            class37 var15 = new class37(var13.field252, var13.field254, var13.field248);
            var14.method987(new Object[] { var15, arg0, arg1 });
            if (this.field3870.contains(var13)) {
                var14.method988(17);
            } else {
                var14.method988(15);
            }
            class70.method1612(var14);
        }
        Iterator var16 = this.field3870.iterator();
        while (var16.hasNext()) {
            class29 var17 = (class29) var16.next();
            if (!var11.contains(var17)) {
                class57 var18 = new class57();
                class37 var19 = new class37(var17.field252, var17.field254, var17.field248);
                var18.method987(new Object[] { var19, arg0, arg1 });
                var18.method988(16);
                class70.method1612(var18);
            }
        }
        this.field3870 = var11;
    }

    @ObfuscatedName("lz.j(IIZZI)V")
    public void method5608(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class185.method3151();
        this.method5778(arg0, arg1, arg3, var5);
        if (!this.method5614() && arg3 || arg2) {
            if (arg3) {
                this.field3853 = arg0;
                this.field3858 = arg1;
                this.field3851 = this.field3835;
                this.field3875 = this.field3831;
            }
            if (this.field3851 != -1) {
                int var7 = arg0 - this.field3853;
                int var8 = arg1 - this.field3858;
                this.method5612(this.field3851 - (int) ((float) var7 / this.field3840), this.field3875 + (int) ((float) var8 / this.field3840), false);
            }
        } else {
            this.method5754();
        }
        if (arg3) {
            this.field3856 = var5;
            this.field3824 = arg0;
            this.field3857 = arg1;
        }
    }

    @ObfuscatedName("lz.a(IIZJ)V")
    public void method5778(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3842 == null) {
            this.field3869 = null;
            return;
        }
        int var6 = (int) ((float) this.field3835 + ((float) (arg0 - this.field3829) - (float) this.method5641() * this.field3839 / 2.0F) / this.field3839);
        int var7 = (int) ((float) this.field3831 - ((float) (arg1 - this.field3844) - (float) this.method5642() * this.field3839 / 2.0F) / this.field3839);
        this.field3869 = this.field3842.method207(var6 + this.field3842.method201() * 64, var7 + this.field3842.method270() * 64);
        if (this.field3869 == null || !arg2) {
            return;
        }
        if (client.method2928() && class40.field341[82] && class40.field341[81]) {
            client.method2961(this.field3869.field2582, this.field3869.field2584, this.field3869.field2588, false);
            return;
        }
        boolean var8 = true;
        if (this.field3859) {
            int var9 = arg0 - this.field3824;
            int var10 = arg1 - this.field3857;
            if (arg3 - this.field3856 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class173 var11 = class173.method2882(class170.field2168, client.field740.field1251);
            var11.field2280.method3364(this.field3869.method4099());
            client.field740.method1873(var11);
            this.field3856 = 0L;
        }
    }

    @ObfuscatedName("lz.l(I)V")
    public void method5675() {
        if (Statics.field54 != null) {
            this.field3839 = this.field3840;
            return;
        }
        if (this.field3839 < this.field3840) {
            this.field3839 = Math.min(this.field3840, this.field3839 / 30.0F + this.field3839);
        }
        if (this.field3839 > this.field3840) {
            this.field3839 = Math.max(this.field3840, this.field3839 - this.field3839 / 30.0F);
        }
    }

    @ObfuscatedName("lz.d(I)V")
    public void method5611() {
        if (!this.method5614()) {
            return;
        }
        int var1 = this.field3837 - this.field3835;
        int var2 = this.field3838 - this.field3831;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5612(this.field3835 + var1, this.field3831 + var2, true);
        if (this.field3837 == this.field3835 && this.field3838 == this.field3831) {
            this.field3837 = -1;
            this.field3838 = -1;
        }
    }

    @ObfuscatedName("lz.s(IIZI)V")
    public final void method5612(int arg0, int arg1, boolean arg2) {
        this.field3835 = arg0;
        this.field3831 = arg1;
        class185.method3151();
        if (arg2) {
            this.method5754();
        }
    }

    @ObfuscatedName("lz.p(I)V")
    public final void method5754() {
        this.field3858 = -1;
        this.field3853 = -1;
        this.field3875 = -1;
        this.field3851 = -1;
    }

    @ObfuscatedName("lz.g(I)Z")
    public boolean method5614() {
        return this.field3837 != -1 && this.field3838 != -1;
    }

    @ObfuscatedName("lz.y(IIII)Li;")
    public class21 method5782(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3867.values().iterator();
        class21 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class21) var4.next();
        } while (!var5.method204(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lz.c(IIIZI)V")
    public void method5779(int arg0, int arg1, int arg2, boolean arg3) {
        class21 var5 = this.method5782(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3830;
        }
        boolean var6 = false;
        if (this.field3832 != var5 || arg3) {
            this.field3832 = var5;
            this.method5619(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5622(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lz.e(IB)V")
    public void method5801(int arg0) {
        class21 var2 = this.method5603(arg0);
        if (var2 != null) {
            this.method5619(var2);
        }
    }

    @ObfuscatedName("lz.t(B)I")
    public int method5617() {
        return this.field3842 == null ? -1 : this.field3842.method209();
    }

    @ObfuscatedName("lz.u(I)Li;")
    public class21 method5618() {
        return this.field3842;
    }

    @ObfuscatedName("lz.i(Li;B)V")
    public void method5619(class21 arg0) {
        if (this.field3842 == null || this.field3842 != arg0) {
            this.method5658(arg0);
            this.method5622(-1, -1, -1);
        }
    }

    @ObfuscatedName("lz.r(Li;I)V")
    public void method5658(class21 arg0) {
        this.field3842 = arg0;
        this.field3833 = new class31(this.field3854, this.field3827);
        this.field3834.method5599(this.field3842.method211());
    }

    @ObfuscatedName("lz.v(Li;Lhh;Lhh;ZI)V")
    public void method5669(class21 arg0, class227 arg1, class227 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3842 == null || this.field3842 != arg0) {
            this.method5658(arg0);
        }
        if (!arg3 && this.field3842.method204(arg1.field2588, arg1.field2582, arg1.field2584)) {
            this.method5622(arg1.field2588, arg1.field2582, arg1.field2584);
        } else {
            this.method5622(arg2.field2588, arg2.field2582, arg2.field2584);
        }
    }

    @ObfuscatedName("lz.o(IIII)V")
    public void method5622(int arg0, int arg1, int arg2) {
        if (this.field3842 == null) {
            return;
        }
        int[] var4 = this.field3842.method259(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3842.method259(this.field3842.method220(), this.field3842.method219(), this.field3842.method221());
        }
        this.method5612(var4[0] - this.field3842.method201() * 64, var4[1] - this.field3842.method270() * 64, true);
        this.field3837 = -1;
        this.field3838 = -1;
        this.field3839 = this.method5629(this.field3842.method225());
        this.field3840 = this.field3839;
        this.field3868 = null;
        this.field3823 = null;
        this.field3833.method516();
    }

    @ObfuscatedName("lz.ai(IIIIIB)V")
    public void method5623(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class315.method5341(var6);
        class315.method5328(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class315.method5400(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3834.method5593();
        if (var7 < 100) {
            this.method5628(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3833.method509()) {
            this.field3833.method475(this.field3863, this.field3842.method211(), client.field629);
            if (!this.field3833.method509()) {
                return;
            }
        }
        if (this.field3848 != null) {
            this.field3850++;
            if (this.field3850 % this.field3846 == 0) {
                this.field3850 = 0;
                this.field3849++;
            }
            if (this.field3849 >= this.field3845 && !this.field3822) {
                this.field3848 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3839));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3839));
        this.field3833.method503(this.field3835 - var8 / 2, this.field3831 - var9 / 2, var8 / 2 + this.field3835, var9 / 2 + this.field3831, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3820) {
            boolean var10 = false;
            if (arg4 - this.field3866 > 100) {
                this.field3866 = arg4;
                var10 = true;
            }
            this.field3833.method478(this.field3835 - var8 / 2, this.field3831 - var9 / 2, var8 / 2 + this.field3835, var9 / 2 + this.field3831, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3862, this.field3848, this.field3850, this.field3846, var10);
        }
        this.method5625(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method2928() && this.field3847 && this.field3869 != null) {
            this.field3826.method5114("Coord: " + this.field3869, class315.field3772 + 10, class315.field3770 + 20, 16776960, -1);
        }
        this.field3855 = var8;
        this.field3819 = var9;
        this.field3829 = arg0;
        this.field3844 = arg1;
        class315.method5331(var6);
    }

    @ObfuscatedName("lz.at(IIIIIII)Z")
    public boolean method5636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3871 == null) {
            return true;
        } else if (this.field3871.field3795 != arg0 || this.field3871.field3802 != arg1) {
            return true;
        } else if (this.field3833.field270 != this.field3872) {
            return true;
        } else if (client.field860 != this.field3843) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lz.ad(IIIIIIS)V")
    public void method5625(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field54 == null) {
            return;
        }
        int var7 = 512 / (this.field3833.field270 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5638() - arg4 / 2 - var7;
        int var14 = this.method5775() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3833.field270 * (var7 + var13 - this.field3873);
        int var16 = arg1 - this.field3833.field270 * (var7 - (var14 - this.field3874));
        if (this.method5636(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3871 != null && this.field3871.field3795 == var11 && this.field3871.field3802 == var12) {
                Arrays.fill(this.field3871.field3799, 0);
            } else {
                this.field3871 = new class319(var11, var12);
            }
            this.field3873 = this.method5638() - arg4 / 2 - var7;
            this.field3874 = this.method5775() - arg5 / 2 - var7;
            this.field3872 = this.field3833.field270;
            Statics.field54.method4404(this.field3873, this.field3874, this.field3871, (float) this.field3872 / var10);
            this.field3843 = client.field860;
            var15 = arg0 - this.field3833.field270 * (var7 + var13 - this.field3873);
            var16 = arg1 - this.field3833.field270 * (var7 - (var14 - this.field3874));
        }
        class315.method5399(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3871.method5464(var15, var16, 192);
        } else {
            this.field3871.method5456(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lz.ac(IIIII)V")
    public void method5691(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3834.method5592()) {
            return;
        }
        if (!this.field3833.method509()) {
            this.field3833.method475(this.field3863, this.field3842.method211(), client.field629);
            if (!this.field3833.method509()) {
                return;
            }
        }
        this.field3833.method480(arg0, arg1, arg2, arg3, this.field3848, this.field3850, this.field3846);
    }

    @ObfuscatedName("lz.ay(II)V")
    public void method5748(int arg0) {
        this.field3840 = this.method5629(arg0);
    }

    @ObfuscatedName("lz.an(IIIIII)V")
    public void method5628(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class315.method5400(arg0, arg1, arg2, arg3, -16777216);
        class315.method5343(var7 - 152, var8, 304, 34, -65536);
        class315.method5400(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3826.method5134(class238.field2912, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lz.as(II)F")
    public float method5629(int arg0) {
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

    @ObfuscatedName("lz.aw(B)I")
    public int method5630() {
        if ((double) this.field3840 == 1.0D) {
            return 25;
        } else if ((double) this.field3840 == 1.5D) {
            return 37;
        } else if ((double) this.field3840 == 2.0D) {
            return 50;
        } else if ((double) this.field3840 == 3.0D) {
            return 75;
        } else if ((double) this.field3840 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lz.ag(I)V")
    public void method5631() {
        this.field3834.method5591();
    }

    @ObfuscatedName("lz.ah(I)Z")
    public boolean method5632() {
        return this.field3834.method5592();
    }

    @ObfuscatedName("lz.az(II)Li;")
    public class21 method5603(int arg0) {
        Iterator var2 = this.field3867.values().iterator();
        class21 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class21) var2.next();
        } while (var3.method209() != arg0);
        return var3;
    }

    @ObfuscatedName("lz.ao(III)V")
    public void method5634(int arg0, int arg1) {
        if (this.field3842 != null && this.field3842.method205(arg0, arg1)) {
            this.field3837 = arg0 - this.field3842.method201() * 64;
            this.field3838 = arg1 - this.field3842.method270() * 64;
        }
    }

    @ObfuscatedName("lz.ap(III)V")
    public void method5627(int arg0, int arg1) {
        if (this.field3842 != null) {
            this.method5612(arg0 - this.field3842.method201() * 64, arg1 - this.field3842.method270() * 64, true);
            this.field3837 = -1;
            this.field3838 = -1;
        }
    }

    @ObfuscatedName("lz.af(IIII)V")
    public void method5781(int arg0, int arg1, int arg2) {
        if (this.field3842 != null) {
            int[] var4 = this.field3842.method259(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5634(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lz.am(IIII)V")
    public void method5637(int arg0, int arg1, int arg2) {
        if (this.field3842 != null) {
            int[] var4 = this.field3842.method259(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5627(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lz.aq(I)I")
    public int method5638() {
        return this.field3842 == null ? -1 : this.field3835 + this.field3842.method201() * 64;
    }

    @ObfuscatedName("lz.aj(I)I")
    public int method5775() {
        return this.field3842 == null ? -1 : this.field3831 + this.field3842.method270() * 64;
    }

    @ObfuscatedName("lz.ae(B)Lhh;")
    public class227 method5640() {
        return this.field3842 == null ? null : this.field3842.method207(this.method5638(), this.method5775());
    }

    @ObfuscatedName("lz.au(B)I")
    public int method5641() {
        return this.field3855;
    }

    @ObfuscatedName("lz.av(I)I")
    public int method5642() {
        return this.field3819;
    }

    @ObfuscatedName("lz.ab(II)V")
    public void method5643(int arg0) {
        if (arg0 >= 1) {
            this.field3845 = arg0;
        }
    }

    @ObfuscatedName("lz.aa(B)V")
    public void method5644() {
        this.field3845 = 3;
    }

    @ObfuscatedName("lz.ar(IB)V")
    public void method5645(int arg0) {
        if (arg0 >= 1) {
            this.field3846 = arg0;
        }
    }

    @ObfuscatedName("lz.ax(I)V")
    public void method5760() {
        this.field3846 = 50;
    }

    @ObfuscatedName("lz.al(ZI)V")
    public void method5615(boolean arg0) {
        this.field3822 = arg0;
    }

    @ObfuscatedName("lz.ak(II)V")
    public void method5648(int arg0) {
        this.field3848 = new HashSet();
        this.field3848.add(arg0);
        this.field3849 = 0;
        this.field3850 = 0;
    }

    @ObfuscatedName("lz.bc(II)V")
    public void method5647(int arg0) {
        this.field3848 = new HashSet();
        this.field3849 = 0;
        this.field3850 = 0;
        for (int var2 = 0; var2 < Statics.field3275.length; var2++) {
            if (Statics.field3275[var2] != null && Statics.field3275[var2].field3278 == arg0) {
                this.field3848.add(Statics.field3275[var2].field3262);
            }
        }
    }

    @ObfuscatedName("lz.bo(B)V")
    public void method5650() {
        this.field3848 = null;
    }

    @ObfuscatedName("lz.bx(ZI)V")
    public void method5651(boolean arg0) {
        this.field3820 = !arg0;
    }

    @ObfuscatedName("lz.be(IZI)V")
    public void method5652(int arg0, boolean arg1) {
        if (arg1) {
            this.field3864.remove(arg0);
        } else {
            this.field3864.add(arg0);
        }
        this.method5626();
    }

    @ObfuscatedName("lz.br(IZI)V")
    public void method5639(int arg0, boolean arg1) {
        if (arg1) {
            this.field3860.remove(arg0);
        } else {
            this.field3860.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3275.length; var3++) {
            if (Statics.field3275[var3] != null && Statics.field3275[var3].field3278 == arg0) {
                int var4 = Statics.field3275[var3].field3262;
                if (arg1) {
                    this.field3861.remove(var4);
                } else {
                    this.field3861.add(var4);
                }
            }
        }
        this.method5626();
    }

    @ObfuscatedName("lz.bk(I)Z")
    public boolean method5654() {
        return !this.field3820;
    }

    @ObfuscatedName("lz.bn(II)Z")
    public boolean method5655(int arg0) {
        return !this.field3864.contains(arg0);
    }

    @ObfuscatedName("lz.bp(IB)Z")
    public boolean method5616(int arg0) {
        return !this.field3860.contains(arg0);
    }

    @ObfuscatedName("lz.bu(I)V")
    public void method5626() {
        this.field3862.clear();
        this.field3862.addAll(this.field3864);
        this.field3862.addAll(this.field3861);
    }

    @ObfuscatedName("lz.by(IIIIIII)V")
    public void method5773(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3834.method5592()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3839));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3839));
        List var9 = this.field3833.method515(this.field3835 - var7 / 2 - 1, this.field3831 - var8 / 2 - 1, var7 / 2 + this.field3835 + 1, var8 / 2 + this.field3831 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class256 var12 = Statics.field3275[var11.field252];
            var13 = false;
            for (int var14 = this.field3865.length - 1; var14 >= 0; var14--) {
                if (var12.field3267[var14] != null) {
                    client.method2603(var12.field3267[var14], var12.field3271, this.field3865[var14], var11.field252, var11.field254.method4099(), var11.field248.method4099());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lz.bl(ILhh;I)Lhh;")
    public class227 method5662(int arg0, class227 arg1) {
        if (!this.field3834.method5592()) {
            return null;
        } else if (!this.field3833.method509()) {
            return null;
        } else if (this.field3842.method205(arg1.field2582, arg1.field2584)) {
            HashMap var3 = this.field3833.method501();
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
                        return var5.field248;
                    }
                    var8 = (class29) var7.next();
                    int var9 = var8.field248.field2582 - arg1.field2582;
                    int var10 = var8.field248.field2584 - arg1.field2584;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field248;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lz.bs(IILhh;Lhh;I)V")
    public void method5660(int arg0, int arg1, class227 arg2, class227 arg3) {
        class57 var5 = new class57();
        class37 var6 = new class37(arg1, arg2, arg3);
        var5.method987(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method988(10);
                break;
            case 1009:
                var5.method988(11);
                break;
            case 1010:
                var5.method988(12);
                break;
            case 1011:
                var5.method988(13);
                break;
            case 1012:
                var5.method988(14);
        }
        class70.method1612(var5);
    }

    @ObfuscatedName("lz.bi(S)Lad;")
    public class29 method5624() {
        if (!this.field3834.method5592()) {
            return null;
        } else if (this.field3833.method509()) {
            HashMap var1 = this.field3833.method501();
            this.field3868 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3868.addAll(var3);
            }
            this.field3823 = this.field3868.iterator();
            return this.method5802();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lz.bb(I)Lad;")
    public class29 method5802() {
        if (this.field3823 == null) {
            return null;
        } else if (this.field3823.hasNext()) {
            return (class29) this.field3823.next();
        } else {
            return null;
        }
    }
}
