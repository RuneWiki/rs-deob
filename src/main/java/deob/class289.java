package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kl")
public class class289 {

    @ObfuscatedName("kl.v")
    public class236 field3816;

    @ObfuscatedName("kl.t")
    public static final class262 field3798 = class262.field3603;

    @ObfuscatedName("kl.i")
    public static final class262 field3796 = class262.field3610;

    @ObfuscatedName("kl.r")
    public static final class262 field3800 = class262.field3605;

    @ObfuscatedName("kl.g")
    public class264 field3831;

    @ObfuscatedName("kl.s")
    public HashMap field3802;

    @ObfuscatedName("kl.o")
    public class285[] field3803;

    @ObfuscatedName("kl.p")
    public HashMap field3804;

    @ObfuscatedName("kl.u")
    public class33 field3805;

    @ObfuscatedName("kl.b")
    public class33 field3806;

    @ObfuscatedName("kl.w")
    public class33 field3807;

    @ObfuscatedName("kl.k")
    public class42 field3823;

    @ObfuscatedName("kl.n")
    public class288 field3793;

    @ObfuscatedName("kl.c")
    public int field3792;

    @ObfuscatedName("kl.l")
    public int field3811;

    @ObfuscatedName("kl.m")
    public int field3812 = -1;

    @ObfuscatedName("kl.a")
    public int field3819 = -1;

    @ObfuscatedName("kl.h")
    public float field3797;

    @ObfuscatedName("kl.z")
    public float field3815;

    @ObfuscatedName("kl.j")
    public int field3808 = -1;

    @ObfuscatedName("kl.am")
    public int field3817 = -1;

    @ObfuscatedName("kl.ac")
    public int field3818 = 3;

    @ObfuscatedName("kl.ax")
    public int field3801 = 50;

    @ObfuscatedName("kl.at")
    public boolean field3827 = false;

    @ObfuscatedName("kl.ag")
    public HashSet field3799 = null;

    @ObfuscatedName("kl.ar")
    public int field3833 = -1;

    @ObfuscatedName("kl.ae")
    public int field3821 = -1;

    @ObfuscatedName("kl.ai")
    public int field3824 = -1;

    @ObfuscatedName("kl.au")
    public int field3825 = -1;

    @ObfuscatedName("kl.ad")
    public HashSet field3826 = new HashSet();

    @ObfuscatedName("kl.ah")
    public HashSet field3809 = new HashSet();

    @ObfuscatedName("kl.ao")
    public HashSet field3828 = new HashSet();

    @ObfuscatedName("kl.av")
    public HashSet field3829 = new HashSet();

    @ObfuscatedName("kl.az")
    public boolean field3830 = false;

    @ObfuscatedName("kl.aq")
    public int field3813 = 0;

    @ObfuscatedName("kl.an")
    public final int[] field3832 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kl.af")
    public List field3810;

    @ObfuscatedName("kl.aa")
    public Iterator field3834;

    @ObfuscatedName("kl.ak")
    public HashSet field3835 = new HashSet();

    @ObfuscatedName("kl.d(Lim;Ljt;Ljava/util/HashMap;[Ljw;I)V")
    public void method4796(class236 arg0, class264 arg1, HashMap arg2, class285[] arg3) {
        this.field3803 = arg3;
        this.field3816 = arg0;
        this.field3831 = arg1;
        this.field3802 = new HashMap();
        this.field3802.put(class25.field339, arg2.get(field3798));
        this.field3802.put(class25.field337, arg2.get(field3796));
        this.field3802.put(class25.field338, arg2.get(field3800));
        this.field3793 = new class288(arg0);
        int var5 = this.field3816.method3766(class41.field516.field511);
        int[] var6 = this.field3816.method3760(var5);
        this.field3804 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class174 var8 = new class174(this.field3816.method3750(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method284(var8, var6[var7]);
            this.field3804.put(var9.method248(), var9);
            if (var9.method316()) {
                this.field3805 = var9;
            }
        }
        this.method4808(this.field3805);
        this.field3807 = null;
    }

    @ObfuscatedName("kl.q(I)I")
    public int method4844() {
        return this.field3816.method3772(this.field3805.method248(), class41.field513.field511) ? 100 : this.field3816.method3773(this.field3805.method248());
    }

    @ObfuscatedName("kl.x(IIZIIIII)V")
    public void method4798(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3793.method4785()) {
            return;
        }
        this.method4859();
        this.method4801();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3797));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3797));
        List var10 = this.field3823.method503(this.field3792 - var8 / 2 - 1, this.field3811 - var9 / 2 - 1, var8 / 2 + this.field3792 + 1, var9 / 2 + this.field3811 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class70 var14 = new class70();
            class48 var15 = new class48(var13.field506, var13.field501, var13.field505);
            var14.method1000(new Object[] { var15, arg0, arg1 });
            if (this.field3835.contains(var13)) {
                var14.method1001(class220.field2774);
            } else {
                var14.method1001(class220.field2772);
            }
            class84.method1011(var14);
        }
        Iterator var16 = this.field3835.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class70 var18 = new class70();
                class48 var19 = new class48(var17.field506, var17.field501, var17.field505);
                var18.method1000(new Object[] { var19, arg0, arg1 });
                var18.method1001(class220.field2779);
                class84.method1011(var18);
            }
        }
        this.field3835 = var11;
    }

    @ObfuscatedName("kl.y(IIZI)V")
    public void method4799(int arg0, int arg1, boolean arg2) {
        if (this.field3824 == -1) {
            this.field3824 = arg0;
        }
        if (this.field3825 == -1) {
            this.field3825 = arg1;
        }
        int var4 = arg0 - this.field3824;
        int var5 = arg1 - this.field3825;
        this.field3824 = arg0;
        this.field3825 = arg1;
        if (arg2 && !this.method4858()) {
            this.field3792 -= (int) ((float) var4 / this.field3815);
            this.field3811 += (int) ((float) var5 / this.field3815);
        }
    }

    @ObfuscatedName("kl.e(B)V")
    public void method4859() {
        if (this.field3797 < this.field3815) {
            this.field3797 = Math.min(this.field3815, this.field3797 / 30.0F + this.field3797);
        }
        if (this.field3797 > this.field3815) {
            this.field3797 = Math.max(this.field3815, this.field3797 - this.field3797 / 30.0F);
        }
    }

    @ObfuscatedName("kl.f(I)V")
    public void method4801() {
        if (!this.method4858()) {
            return;
        }
        int var1 = this.field3812 - this.field3792;
        int var2 = this.field3819 - this.field3811;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3792 += var1;
        this.field3811 += var2;
        if (this.field3812 == this.field3792 && this.field3819 == this.field3811) {
            this.field3812 = -1;
            this.field3819 = -1;
        }
    }

    @ObfuscatedName("kl.v(I)Z")
    public boolean method4858() {
        return this.field3812 != -1 && this.field3819 != -1;
    }

    @ObfuscatedName("kl.t(IIII)Lae;")
    public class33 method4866(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3804.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method241(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kl.i(IIIZI)V")
    public void method4804(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4866(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3805;
        }
        boolean var6 = false;
        if (this.field3807 != var5 || arg3) {
            this.field3807 = var5;
            this.method4808(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4811(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kl.r(II)V")
    public void method4805(int arg0) {
        class33 var2 = this.method4820(arg0);
        if (var2 != null) {
            this.method4808(var2);
        }
    }

    @ObfuscatedName("kl.g(B)I")
    public int method4806() {
        return this.field3806 == null ? -1 : this.field3806.method238();
    }

    @ObfuscatedName("kl.s(I)Lae;")
    public class33 method4944() {
        return this.field3806;
    }

    @ObfuscatedName("kl.o(Lae;I)V")
    public void method4808(class33 arg0) {
        if (this.field3806 == null || this.field3806 != arg0) {
            this.method4887(arg0);
            this.method4811(-1, -1, -1);
        }
    }

    @ObfuscatedName("kl.p(Lae;I)V")
    public void method4887(class33 arg0) {
        this.field3806 = arg0;
        this.field3823 = new class42(this.field3803, this.field3802);
        this.field3793.method4786(this.field3806.method248());
    }

    @ObfuscatedName("kl.u(Lae;Lhy;Lhy;ZI)V")
    public void method4855(class33 arg0, class213 arg1, class213 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3806 == null || this.field3806 != arg0) {
            this.method4887(arg0);
        }
        if (!arg3 && this.field3806.method241(arg1.field2591, arg1.field2592, arg1.field2593)) {
            this.method4811(arg1.field2591, arg1.field2592, arg1.field2593);
        } else {
            this.method4811(arg2.field2591, arg2.field2592, arg2.field2593);
        }
    }

    @ObfuscatedName("kl.b(IIIS)V")
    public void method4811(int arg0, int arg1, int arg2) {
        if (this.field3806 == null) {
            return;
        }
        int[] var4 = this.field3806.method243(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3806.method243(this.field3806.method259(), this.field3806.method255(), this.field3806.method257());
        }
        this.field3792 = var4[0] - this.field3806.method252() * 64;
        this.field3811 = var4[1] - this.field3806.method282() * 64;
        this.field3812 = -1;
        this.field3819 = -1;
        this.field3797 = this.method4816(this.field3806.method251());
        this.field3815 = this.field3797;
        this.field3810 = null;
        this.field3834 = null;
        this.field3823.method498();
    }

    @ObfuscatedName("kl.w(IIIIII)V")
    public void method4812(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class282.method4605(var6);
        class282.method4560(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class282.method4551(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3793.method4792();
        if (var7 < 100) {
            this.method4815(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3823.method505()) {
            this.field3823.method512(this.field3816, this.field3806.method248(), client.field892);
            if (!this.field3823.method505()) {
                return;
            }
        }
        if (this.field3799 != null) {
            this.field3821++;
            if (this.field3821 % this.field3801 == 0) {
                this.field3821 = 0;
                this.field3833++;
            }
            if (this.field3833 >= this.field3818 && !this.field3827) {
                this.field3799 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3797));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3797));
        this.field3823.method502(this.field3792 - var8 / 2, this.field3811 - var9 / 2, var8 / 2 + this.field3792, var9 / 2 + this.field3811, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3830) {
            boolean var10 = false;
            if (arg4 - this.field3813 > 100) {
                this.field3813 = arg4;
                var10 = true;
            }
            this.field3823.method500(this.field3792 - var8 / 2, this.field3811 - var9 / 2, var8 / 2 + this.field3792, var9 / 2 + this.field3811, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3829, this.field3799, this.field3821, this.field3801, var10);
        }
        this.field3808 = var8;
        this.field3817 = var9;
        class282.method4578(var6);
    }

    @ObfuscatedName("kl.k(IIIII)V")
    public void method4813(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3793.method4785()) {
            return;
        }
        if (!this.field3823.method505()) {
            this.field3823.method512(this.field3816, this.field3806.method248(), client.field892);
            if (!this.field3823.method505()) {
                return;
            }
        }
        this.field3823.method516(arg0, arg1, arg2, arg3, this.field3799, this.field3821, this.field3801);
    }

    @ObfuscatedName("kl.c(II)V")
    public void method4814(int arg0) {
        this.field3815 = this.method4816(arg0);
    }

    @ObfuscatedName("kl.h(IIIIIB)V")
    public void method4815(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class282.method4551(arg0, arg1, arg2, arg3, -16777216);
        class282.method4545(var7 - 152, var8, 304, 34, -65536);
        class282.method4551(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3831.method4363(class226.field3114, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kl.z(IB)F")
    public float method4816(int arg0) {
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

    @ObfuscatedName("kl.j(I)I")
    public int method4817() {
        if ((double) this.field3815 == 1.0D) {
            return 25;
        } else if ((double) this.field3815 == 1.5D) {
            return 37;
        } else if ((double) this.field3815 == 2.0D) {
            return 50;
        } else if ((double) this.field3815 == 3.0D) {
            return 75;
        } else if ((double) this.field3815 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kl.am(I)V")
    public void method4818() {
        this.field3793.method4784();
    }

    @ObfuscatedName("kl.ac(I)Z")
    public boolean method4795() {
        return this.field3793.method4785();
    }

    @ObfuscatedName("kl.ax(IB)Lae;")
    public class33 method4820(int arg0) {
        Iterator var2 = this.field3804.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method238() != arg0);
        return var3;
    }

    @ObfuscatedName("kl.at(III)V")
    public void method4821(int arg0, int arg1) {
        if (this.field3806 != null && this.field3806.method242(arg0, arg1)) {
            this.field3812 = arg0 - this.field3806.method252() * 64;
            this.field3819 = arg1 - this.field3806.method282() * 64;
        }
    }

    @ObfuscatedName("kl.ag(IIS)V")
    public void method4822(int arg0, int arg1) {
        if (this.field3806 != null) {
            this.field3792 = arg0 - this.field3806.method252() * 64;
            this.field3811 = arg1 - this.field3806.method282() * 64;
            this.field3812 = -1;
            this.field3819 = -1;
        }
    }

    @ObfuscatedName("kl.ar(IIII)V")
    public void method4823(int arg0, int arg1, int arg2) {
        if (this.field3806 != null) {
            int[] var4 = this.field3806.method243(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4821(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kl.ae(IIII)V")
    public void method4824(int arg0, int arg1, int arg2) {
        if (this.field3806 != null) {
            int[] var4 = this.field3806.method243(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4822(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kl.ai(B)I")
    public int method4825() {
        return this.field3806 == null ? -1 : this.field3792 + this.field3806.method252() * 64;
    }

    @ObfuscatedName("kl.au(B)I")
    public int method4949() {
        return this.field3806 == null ? -1 : this.field3811 + this.field3806.method282() * 64;
    }

    @ObfuscatedName("kl.ad(I)Lhy;")
    public class213 method4884() {
        return this.field3806 == null ? null : this.field3806.method244(this.method4825(), this.method4949());
    }

    @ObfuscatedName("kl.ah(I)I")
    public int method4828() {
        return this.field3808;
    }

    @ObfuscatedName("kl.ao(I)I")
    public int method4829() {
        return this.field3817;
    }

    @ObfuscatedName("kl.av(IB)V")
    public void method4830(int arg0) {
        if (arg0 >= 1) {
            this.field3818 = arg0;
        }
    }

    @ObfuscatedName("kl.az(I)V")
    public void method4937() {
        this.field3818 = 3;
    }

    @ObfuscatedName("kl.aq(II)V")
    public void method4800(int arg0) {
        if (arg0 >= 1) {
            this.field3801 = arg0;
        }
    }

    @ObfuscatedName("kl.ay(I)V")
    public void method4882() {
        this.field3801 = 50;
    }

    @ObfuscatedName("kl.an(ZI)V")
    public void method4834(boolean arg0) {
        this.field3827 = arg0;
    }

    @ObfuscatedName("kl.af(II)V")
    public void method4972(int arg0) {
        this.field3799 = new HashSet();
        this.field3799.add(arg0);
        this.field3833 = 0;
        this.field3821 = 0;
    }

    @ObfuscatedName("kl.aa(IS)V")
    public void method4836(int arg0) {
        this.field3799 = new HashSet();
        this.field3833 = 0;
        this.field3821 = 0;
        for (int var2 = 0; var2 < Statics.field3287.length; var2++) {
            if (Statics.field3287[var2] != null && Statics.field3287[var2].field3296 == arg0) {
                this.field3799.add(Statics.field3287[var2].field3279);
            }
        }
    }

    @ObfuscatedName("kl.ak(I)V")
    public void method4837() {
        this.field3799 = null;
    }

    @ObfuscatedName("kl.as(ZB)V")
    public void method4843(boolean arg0) {
        this.field3830 = !arg0;
    }

    @ObfuscatedName("kl.ap(IZI)V")
    public void method4839(int arg0, boolean arg1) {
        if (arg1) {
            this.field3826.remove(arg0);
        } else {
            this.field3826.add(arg0);
        }
        this.method4881();
    }

    @ObfuscatedName("kl.aw(IZB)V")
    public void method4840(int arg0, boolean arg1) {
        if (arg1) {
            this.field3809.remove(arg0);
        } else {
            this.field3809.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3287.length; var3++) {
            if (Statics.field3287[var3] != null && Statics.field3287[var3].field3296 == arg0) {
                int var4 = Statics.field3287[var3].field3279;
                if (arg1) {
                    this.field3828.remove(var4);
                } else {
                    this.field3828.add(var4);
                }
            }
        }
        this.method4881();
    }

    @ObfuscatedName("kl.al(B)Z")
    public boolean method4841() {
        return !this.field3830;
    }

    @ObfuscatedName("kl.ab(IB)Z")
    public boolean method4929(int arg0) {
        return !this.field3826.contains(arg0);
    }

    @ObfuscatedName("kl.aj(II)Z")
    public boolean method4810(int arg0) {
        return !this.field3809.contains(arg0);
    }

    @ObfuscatedName("kl.bz(B)V")
    public void method4881() {
        this.field3829.clear();
        this.field3829.addAll(this.field3826);
        this.field3829.addAll(this.field3828);
    }

    @ObfuscatedName("kl.bi(IIIIIII)V")
    public void method4861(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3793.method4785()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3797));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3797));
        List var9 = this.field3823.method503(this.field3792 - var7 / 2 - 1, this.field3811 - var8 / 2 - 1, var7 / 2 + this.field3792 + 1, var8 / 2 + this.field3811 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class40 var11 = (class40) var10.next();
            class243 var12 = Statics.field3287[var11.field506];
            var13 = false;
            for (int var14 = this.field3832.length - 1; var14 >= 0; var14--) {
                if (var12.field3285[var14] != null) {
                    client.method2830(var12.field3285[var14], var12.field3286, this.field3832[var14], var11.field506, var11.field501.method3598(), var11.field505.method3598());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kl.bu(ILhy;I)Lhy;")
    public class213 method4846(int arg0, class213 arg1) {
        if (!this.field3793.method4785()) {
            return null;
        } else if (!this.field3823.method505()) {
            return null;
        } else if (this.field3806.method242(arg1.field2592, arg1.field2593)) {
            HashMap var3 = this.field3823.method506();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class40 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class40 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field505;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field505.field2592 - arg1.field2592;
                    int var10 = var8.field505.field2593 - arg1.field2593;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field505;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kl.bq(IILhy;Lhy;I)V")
    public void method4803(int arg0, int arg1, class213 arg2, class213 arg3) {
        class70 var5 = new class70();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1000(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1001(class220.field2771);
                break;
            case 1009:
                var5.method1001(class220.field2775);
                break;
            case 1010:
                var5.method1001(class220.field2776);
                break;
            case 1011:
                var5.method1001(class220.field2770);
                break;
            case 1012:
                var5.method1001(class220.field2769);
        }
        class84.method1011(var5);
    }

    @ObfuscatedName("kl.bs(I)Laz;")
    public class40 method4807() {
        if (!this.field3793.method4785()) {
            return null;
        } else if (this.field3823.method505()) {
            HashMap var1 = this.field3823.method506();
            this.field3810 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3810.addAll(var3);
            }
            this.field3834 = this.field3810.iterator();
            return this.method4849();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kl.bv(I)Laz;")
    public class40 method4849() {
        if (this.field3834 == null) {
            return null;
        } else if (this.field3834.hasNext()) {
            return (class40) this.field3834.next();
        } else {
            return null;
        }
    }
}
