package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kw")
public class class289 {

    @ObfuscatedName("kw.s")
    public class236 field3802;

    @ObfuscatedName("kw.x")
    public static final class262 field3803 = class262.field3603;

    @ObfuscatedName("kw.p")
    public static final class262 field3828 = class262.field3604;

    @ObfuscatedName("kw.k")
    public static final class262 field3835 = class262.field3605;

    @ObfuscatedName("kw.r")
    public class264 field3824;

    @ObfuscatedName("kw.w")
    public HashMap field3812;

    @ObfuscatedName("kw.v")
    public class285[] field3808;

    @ObfuscatedName("kw.h")
    public HashMap field3809;

    @ObfuscatedName("kw.t")
    public class33 field3825;

    @ObfuscatedName("kw.a")
    public class33 field3811;

    @ObfuscatedName("kw.e")
    public class33 field3838;

    @ObfuscatedName("kw.y")
    public class42 field3813;

    @ObfuscatedName("kw.l")
    public class288 field3814;

    @ObfuscatedName("kw.q")
    public int field3815;

    @ObfuscatedName("kw.f")
    public int field3816;

    @ObfuscatedName("kw.j")
    public int field3817 = -1;

    @ObfuscatedName("kw.n")
    public int field3818 = -1;

    @ObfuscatedName("kw.z")
    public float field3810;

    @ObfuscatedName("kw.b")
    public float field3820;

    @ObfuscatedName("kw.d")
    public int field3819 = -1;

    @ObfuscatedName("kw.ap")
    public int field3822 = -1;

    @ObfuscatedName("kw.aj")
    public int field3823 = 3;

    @ObfuscatedName("kw.am")
    public int field3805 = 50;

    @ObfuscatedName("kw.ag")
    public boolean field3830 = false;

    @ObfuscatedName("kw.av")
    public HashSet field3807 = null;

    @ObfuscatedName("kw.al")
    public int field3827 = -1;

    @ObfuscatedName("kw.ab")
    public int field3831 = -1;

    @ObfuscatedName("kw.af")
    public int field3829 = -1;

    @ObfuscatedName("kw.ak")
    public int field3826 = -1;

    @ObfuscatedName("kw.ar")
    public HashSet field3806 = new HashSet();

    @ObfuscatedName("kw.an")
    public HashSet field3832 = new HashSet();

    @ObfuscatedName("kw.at")
    public HashSet field3833 = new HashSet();

    @ObfuscatedName("kw.aw")
    public HashSet field3834 = new HashSet();

    @ObfuscatedName("kw.ad")
    public boolean field3804 = false;

    @ObfuscatedName("kw.ac")
    public int field3836 = 0;

    @ObfuscatedName("kw.ah")
    public final int[] field3821 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kw.ax")
    public List field3798;

    @ObfuscatedName("kw.ai")
    public Iterator field3839;

    @ObfuscatedName("kw.aa")
    public HashSet field3840 = new HashSet();

    @ObfuscatedName("kw.c(Lip;Ljt;Ljava/util/HashMap;[Ljx;I)V")
    public void method4761(class236 arg0, class264 arg1, HashMap arg2, class285[] arg3) {
        this.field3808 = arg3;
        this.field3802 = arg0;
        this.field3824 = arg1;
        this.field3812 = new HashMap();
        this.field3812.put(class25.field352, arg2.get(field3803));
        this.field3812.put(class25.field343, arg2.get(field3828));
        this.field3812.put(class25.field344, arg2.get(field3835));
        this.field3814 = new class288(arg0);
        int var5 = this.field3802.method3730(class41.field541.field550);
        int[] var6 = this.field3802.method3792(var5);
        this.field3809 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class174 var8 = new class174(this.field3802.method3741(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method284(var8, var6[var7]);
            this.field3809.put(var9.method304(), var9);
            if (var9.method250()) {
                this.field3825 = var9;
            }
        }
        this.method4929(this.field3825);
        this.field3838 = null;
    }

    @ObfuscatedName("kw.o(I)I")
    public int method4762() {
        return this.field3802.method3734(this.field3825.method304(), class41.field546.field550) ? 100 : this.field3802.method3737(this.field3825.method304());
    }

    @ObfuscatedName("kw.i(IIZIIIII)V")
    public void method4763(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3814.method4750()) {
            return;
        }
        this.method4844();
        this.method4819();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3810));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3810));
        List var10 = this.field3813.method486(this.field3815 - var8 / 2 - 1, this.field3816 - var9 / 2 - 1, var8 / 2 + this.field3815 + 1, var9 / 2 + this.field3816 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class70 var14 = new class70();
            class48 var15 = new class48(var13.field532, var13.field533, var13.field538);
            var14.method956(new Object[] { var15, arg0, arg1 });
            if (this.field3840.contains(var13)) {
                var14.method957(class220.field2774);
            } else {
                var14.method957(class220.field2771);
            }
            class84.method963(var14);
        }
        Iterator var16 = this.field3840.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class70 var18 = new class70();
                class48 var19 = new class48(var17.field532, var17.field533, var17.field538);
                var18.method956(new Object[] { var19, arg0, arg1 });
                var18.method957(class220.field2766);
                class84.method963(var18);
            }
        }
        this.field3840 = var11;
    }

    @ObfuscatedName("kw.u(IIZI)V")
    public void method4850(int arg0, int arg1, boolean arg2) {
        if (this.field3829 == -1) {
            this.field3829 = arg0;
        }
        if (this.field3826 == -1) {
            this.field3826 = arg1;
        }
        int var4 = arg0 - this.field3829;
        int var5 = arg1 - this.field3826;
        this.field3829 = arg0;
        this.field3826 = arg1;
        if (arg2 && !this.method4818()) {
            this.field3815 -= (int) ((float) var4 / this.field3820);
            this.field3816 += (int) ((float) var5 / this.field3820);
        }
    }

    @ObfuscatedName("kw.g(I)V")
    public void method4844() {
        if (this.field3810 < this.field3820) {
            this.field3810 = Math.min(this.field3820, this.field3810 / 30.0F + this.field3810);
        }
        if (this.field3810 > this.field3820) {
            this.field3810 = Math.max(this.field3820, this.field3810 - this.field3810 / 30.0F);
        }
    }

    @ObfuscatedName("kw.m(I)V")
    public void method4819() {
        if (!this.method4818()) {
            return;
        }
        int var1 = this.field3817 - this.field3815;
        int var2 = this.field3818 - this.field3816;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3815 += var1;
        this.field3816 += var2;
        if (this.field3817 == this.field3815 && this.field3818 == this.field3816) {
            this.field3817 = -1;
            this.field3818 = -1;
        }
    }

    @ObfuscatedName("kw.s(I)Z")
    public boolean method4818() {
        return this.field3817 != -1 && this.field3818 != -1;
    }

    @ObfuscatedName("kw.x(IIII)Lab;")
    public class33 method4827(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3809.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method273(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kw.p(IIIZI)V")
    public void method4913(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4827(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3825;
        }
        boolean var6 = false;
        if (this.field3838 != var5 || arg3) {
            this.field3838 = var5;
            this.method4929(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4776(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kw.k(II)V")
    public void method4770(int arg0) {
        class33 var2 = this.method4785(arg0);
        if (var2 != null) {
            this.method4929(var2);
        }
    }

    @ObfuscatedName("kw.r(B)I")
    public int method4771() {
        return this.field3811 == null ? -1 : this.field3811.method253();
    }

    @ObfuscatedName("kw.w(I)Lab;")
    public class33 method4772() {
        return this.field3811;
    }

    @ObfuscatedName("kw.v(Lab;B)V")
    public void method4929(class33 arg0) {
        if (this.field3811 == null || this.field3811 != arg0) {
            this.method4766(arg0);
            this.method4776(-1, -1, -1);
        }
    }

    @ObfuscatedName("kw.h(Lab;I)V")
    public void method4766(class33 arg0) {
        this.field3811 = arg0;
        this.field3813 = new class42(this.field3808, this.field3812);
        this.field3814.method4742(this.field3811.method304());
    }

    @ObfuscatedName("kw.t(Lab;Lhs;Lhs;ZB)V")
    public void method4775(class33 arg0, class213 arg1, class213 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3811 == null || this.field3811 != arg0) {
            this.method4766(arg0);
        }
        if (!arg3 && this.field3811.method273(arg1.field2580, arg1.field2579, arg1.field2578)) {
            this.method4776(arg1.field2580, arg1.field2579, arg1.field2578);
        } else {
            this.method4776(arg2.field2580, arg2.field2579, arg2.field2578);
        }
    }

    @ObfuscatedName("kw.l(IIIB)V")
    public void method4776(int arg0, int arg1, int arg2) {
        if (this.field3811 == null) {
            return;
        }
        int[] var4 = this.field3811.method246(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3811.method246(this.field3811.method260(), this.field3811.method259(), this.field3811.method242());
        }
        this.field3815 = var4[0] - this.field3811.method255() * 64;
        this.field3816 = var4[1] - this.field3811.method258() * 64;
        this.field3817 = -1;
        this.field3818 = -1;
        this.field3810 = this.method4781(this.field3811.method254());
        this.field3820 = this.field3810;
        this.field3798 = null;
        this.field3839 = null;
        this.field3813.method481();
    }

    @ObfuscatedName("kw.q(IIIIII)V")
    public void method4777(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class282.method4517(var6);
        class282.method4528(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class282.method4510(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3814.method4745();
        if (var7 < 100) {
            this.method4807(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3813.method488()) {
            this.field3813.method480(this.field3802, this.field3811.method304(), client.field996);
            if (!this.field3813.method488()) {
                return;
            }
        }
        if (this.field3807 != null) {
            this.field3831++;
            if (this.field3831 % this.field3805 == 0) {
                this.field3831 = 0;
                this.field3827++;
            }
            if (this.field3827 >= this.field3823 && !this.field3830) {
                this.field3807 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3810));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3810));
        this.field3813.method482(this.field3815 - var8 / 2, this.field3816 - var9 / 2, var8 / 2 + this.field3815, var9 / 2 + this.field3816, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3804) {
            boolean var10 = false;
            if (arg4 - this.field3836 > 100) {
                this.field3836 = arg4;
                var10 = true;
            }
            this.field3813.method503(this.field3815 - var8 / 2, this.field3816 - var9 / 2, var8 / 2 + this.field3815, var9 / 2 + this.field3816, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3834, this.field3807, this.field3831, this.field3805, var10);
        }
        this.field3819 = var8;
        this.field3822 = var9;
        class282.method4549(var6);
    }

    @ObfuscatedName("kw.f(IIIIB)V")
    public void method4778(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3814.method4750()) {
            return;
        }
        if (!this.field3813.method488()) {
            this.field3813.method480(this.field3802, this.field3811.method304(), client.field996);
            if (!this.field3813.method488()) {
                return;
            }
        }
        this.field3813.method506(arg0, arg1, arg2, arg3, this.field3807, this.field3831, this.field3805);
    }

    @ObfuscatedName("kw.j(IB)V")
    public void method4779(int arg0) {
        this.field3820 = this.method4781(arg0);
    }

    @ObfuscatedName("kw.n(IIIIII)V")
    public void method4807(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class282.method4510(arg0, arg1, arg2, arg3, -16777216);
        class282.method4523(var7 - 152, var8, 304, 34, -65536);
        class282.method4510(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3824.method4334(class226.field3091, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kw.z(IB)F")
    public float method4781(int arg0) {
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

    @ObfuscatedName("kw.ap(B)I")
    public int method4782() {
        if ((double) this.field3820 == 1.0D) {
            return 25;
        } else if ((double) this.field3820 == 1.5D) {
            return 37;
        } else if ((double) this.field3820 == 2.0D) {
            return 50;
        } else if ((double) this.field3820 == 3.0D) {
            return 75;
        } else if ((double) this.field3820 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kw.aj(I)V")
    public void method4809() {
        this.field3814.method4743();
    }

    @ObfuscatedName("kw.am(I)Z")
    public boolean method4780() {
        return this.field3814.method4750();
    }

    @ObfuscatedName("kw.ag(IB)Lab;")
    public class33 method4785(int arg0) {
        Iterator var2 = this.field3809.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method253() != arg0);
        return var3;
    }

    @ObfuscatedName("kw.av(III)V")
    public void method4786(int arg0, int arg1) {
        if (this.field3811 != null && this.field3811.method245(arg0, arg1)) {
            this.field3817 = arg0 - this.field3811.method255() * 64;
            this.field3818 = arg1 - this.field3811.method258() * 64;
        }
    }

    @ObfuscatedName("kw.al(IIB)V")
    public void method4881(int arg0, int arg1) {
        if (this.field3811 != null) {
            this.field3815 = arg0 - this.field3811.method255() * 64;
            this.field3816 = arg1 - this.field3811.method258() * 64;
            this.field3817 = -1;
            this.field3818 = -1;
        }
    }

    @ObfuscatedName("kw.ab(IIII)V")
    public void method4788(int arg0, int arg1, int arg2) {
        if (this.field3811 != null) {
            int[] var4 = this.field3811.method246(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4786(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kw.af(IIII)V")
    public void method4789(int arg0, int arg1, int arg2) {
        if (this.field3811 != null) {
            int[] var4 = this.field3811.method246(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4881(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kw.ak(I)I")
    public int method4790() {
        return this.field3811 == null ? -1 : this.field3815 + this.field3811.method255() * 64;
    }

    @ObfuscatedName("kw.ar(I)I")
    public int method4852() {
        return this.field3811 == null ? -1 : this.field3816 + this.field3811.method258() * 64;
    }

    @ObfuscatedName("kw.an(I)Lhs;")
    public class213 method4783() {
        return this.field3811 == null ? null : this.field3811.method247(this.method4790(), this.method4852());
    }

    @ObfuscatedName("kw.at(I)I")
    public int method4793() {
        return this.field3819;
    }

    @ObfuscatedName("kw.aw(B)I")
    public int method4794() {
        return this.field3822;
    }

    @ObfuscatedName("kw.ad(II)V")
    public void method4787(int arg0) {
        if (arg0 >= 1) {
            this.field3823 = arg0;
        }
    }

    @ObfuscatedName("kw.ac(I)V")
    public void method4894() {
        this.field3823 = 3;
    }

    @ObfuscatedName("kw.ae(II)V")
    public void method4797(int arg0) {
        if (arg0 >= 1) {
            this.field3805 = arg0;
        }
    }

    @ObfuscatedName("kw.ah(B)V")
    public void method4798() {
        this.field3805 = 50;
    }

    @ObfuscatedName("kw.ax(ZI)V")
    public void method4799(boolean arg0) {
        this.field3830 = arg0;
    }

    @ObfuscatedName("kw.ai(II)V")
    public void method4857(int arg0) {
        this.field3807 = new HashSet();
        this.field3807.add(arg0);
        this.field3827 = 0;
        this.field3831 = 0;
    }

    @ObfuscatedName("kw.aa(IB)V")
    public void method4801(int arg0) {
        this.field3807 = new HashSet();
        this.field3827 = 0;
        this.field3831 = 0;
        for (int var2 = 0; var2 < Statics.field3266.length; var2++) {
            if (Statics.field3266[var2] != null && Statics.field3266[var2].field3282 == arg0) {
                this.field3807.add(Statics.field3266[var2].field3276);
            }
        }
    }

    @ObfuscatedName("kw.aq(I)V")
    public void method4815() {
        this.field3807 = null;
    }

    @ObfuscatedName("kw.as(ZI)V")
    public void method4803(boolean arg0) {
        this.field3804 = !arg0;
    }

    @ObfuscatedName("kw.au(IZI)V")
    public void method4804(int arg0, boolean arg1) {
        if (arg1) {
            this.field3806.remove(arg0);
        } else {
            this.field3806.add(arg0);
        }
        this.method4925();
    }

    @ObfuscatedName("kw.az(IZB)V")
    public void method4805(int arg0, boolean arg1) {
        if (arg1) {
            this.field3832.remove(arg0);
        } else {
            this.field3832.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3266.length; var3++) {
            if (Statics.field3266[var3] != null && Statics.field3266[var3].field3282 == arg0) {
                int var4 = Statics.field3266[var3].field3276;
                if (arg1) {
                    this.field3833.remove(var4);
                } else {
                    this.field3833.add(var4);
                }
            }
        }
        this.method4925();
    }

    @ObfuscatedName("kw.ay(I)Z")
    public boolean method4768() {
        return !this.field3804;
    }

    @ObfuscatedName("kw.ao(II)Z")
    public boolean method4822(int arg0) {
        return !this.field3806.contains(arg0);
    }

    @ObfuscatedName("kw.bz(IB)Z")
    public boolean method4808(int arg0) {
        return !this.field3832.contains(arg0);
    }

    @ObfuscatedName("kw.bd(I)V")
    public void method4925() {
        this.field3834.clear();
        this.field3834.addAll(this.field3806);
        this.field3834.addAll(this.field3833);
    }

    @ObfuscatedName("kw.bu(IIIIIIB)V")
    public void method4810(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3814.method4750()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3810));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3810));
        List var9 = this.field3813.method486(this.field3815 - var7 / 2 - 1, this.field3816 - var8 / 2 - 1, var7 / 2 + this.field3815 + 1, var8 / 2 + this.field3816 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class243 var12 = Statics.field3266[var11.field532];
            var13 = false;
            for (int var14 = this.field3821.length - 1; var14 >= 0; var14--) {
                if (var12.field3271[var14] != null) {
                    client.method4305(var12.field3271[var14], var12.field3272, this.field3821[var14], var11.field532, var11.field533.method3587(), var11.field538.method3587());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kw.bh(ILhs;B)Lhs;")
    public class213 method4906(int arg0, class213 arg1) {
        if (!this.field3814.method4750()) {
            return null;
        } else if (!this.field3813.method488()) {
            return null;
        } else if (this.field3811.method245(arg1.field2579, arg1.field2578)) {
            HashMap var3 = this.field3813.method489();
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
                        return var5.field538;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field538.field2579 - arg1.field2579;
                    int var10 = var8.field538.field2578 - arg1.field2578;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field538;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kw.bg(IILhs;Lhs;I)V")
    public void method4812(int arg0, int arg1, class213 arg2, class213 arg3) {
        class70 var5 = new class70();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method956(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method957(class220.field2763);
                break;
            case 1009:
                var5.method957(class220.field2761);
                break;
            case 1010:
                var5.method957(class220.field2762);
                break;
            case 1011:
                var5.method957(class220.field2767);
                break;
            case 1012:
                var5.method957(class220.field2764);
        }
        class84.method963(var5);
    }

    @ObfuscatedName("kw.bl(I)Lad;")
    public class40 method4813() {
        if (!this.field3814.method4750()) {
            return null;
        } else if (this.field3813.method488()) {
            HashMap var1 = this.field3813.method489();
            this.field3798 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3798.addAll(var3);
            }
            this.field3839 = this.field3798.iterator();
            return this.method4814();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kw.bo(I)Lad;")
    public class40 method4814() {
        if (this.field3839 == null) {
            return null;
        } else if (this.field3839.hasNext()) {
            return (class40) this.field3839.next();
        } else {
            return null;
        }
    }
}
