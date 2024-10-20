package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kn")
public class class292 {

    @ObfuscatedName("kn.j")
    public class239 field3819;

    @ObfuscatedName("kn.m")
    public static final class265 field3840 = class265.field3638;

    @ObfuscatedName("kn.u")
    public static final class265 field3821 = class265.field3639;

    @ObfuscatedName("kn.r")
    public static final class265 field3822 = class265.field3640;

    @ObfuscatedName("kn.v")
    public class267 field3823;

    @ObfuscatedName("kn.h")
    public HashMap field3824;

    @ObfuscatedName("kn.a")
    public class288[] field3845;

    @ObfuscatedName("kn.p")
    public HashMap field3833;

    @ObfuscatedName("kn.q")
    public class33 field3827;

    @ObfuscatedName("kn.l")
    public class33 field3820;

    @ObfuscatedName("kn.c")
    public class33 field3841;

    @ObfuscatedName("kn.n")
    public class42 field3830;

    @ObfuscatedName("kn.z")
    public class291 field3831;

    @ObfuscatedName("kn.e")
    public int field3832;

    @ObfuscatedName("kn.g")
    public int field3839;

    @ObfuscatedName("kn.d")
    public int field3850 = -1;

    @ObfuscatedName("kn.y")
    public int field3835 = -1;

    @ObfuscatedName("kn.t")
    public float field3825;

    @ObfuscatedName("kn.b")
    public float field3837;

    @ObfuscatedName("kn.s")
    public int field3818 = -1;

    @ObfuscatedName("kn.ap")
    public int field3829 = -1;

    @ObfuscatedName("kn.ac")
    public int field3853 = 3;

    @ObfuscatedName("kn.af")
    public int field3834 = 50;

    @ObfuscatedName("kn.ai")
    public boolean field3842 = false;

    @ObfuscatedName("kn.ad")
    public HashSet field3843 = null;

    @ObfuscatedName("kn.ar")
    public int field3828 = -1;

    @ObfuscatedName("kn.aq")
    public int field3838 = -1;

    @ObfuscatedName("kn.ag")
    public int field3846 = -1;

    @ObfuscatedName("kn.ak")
    public int field3847 = -1;

    @ObfuscatedName("kn.ae")
    public HashSet field3848 = new HashSet();

    @ObfuscatedName("kn.am")
    public HashSet field3849 = new HashSet();

    @ObfuscatedName("kn.az")
    public HashSet field3836 = new HashSet();

    @ObfuscatedName("kn.ay")
    public HashSet field3851 = new HashSet();

    @ObfuscatedName("kn.as")
    public boolean field3852 = false;

    @ObfuscatedName("kn.aw")
    public int field3815 = 0;

    @ObfuscatedName("kn.aj")
    public final int[] field3854 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kn.ax")
    public List field3855;

    @ObfuscatedName("kn.an")
    public Iterator field3856;

    @ObfuscatedName("kn.ab")
    public HashSet field3857 = new HashSet();

    @ObfuscatedName("kn.w(Liq;Ljt;Ljava/util/HashMap;[Lki;I)V")
    public void method4840(class239 arg0, class267 arg1, HashMap arg2, class288[] arg3) {
        this.field3845 = arg3;
        this.field3819 = arg0;
        this.field3823 = arg1;
        this.field3824 = new HashMap();
        this.field3824.put(class25.field378, arg2.get(field3840));
        this.field3824.put(class25.field368, arg2.get(field3821));
        this.field3824.put(class25.field369, arg2.get(field3822));
        this.field3831 = new class291(arg0);
        int var5 = this.field3819.method3742(class41.field556.field555);
        int[] var6 = this.field3819.method3736(var5);
        this.field3833 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class177 var8 = new class177(this.field3819.method3754(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method319(var8, var6[var7]);
            this.field3833.put(var9.method259(), var9);
            if (var9.method258()) {
                this.field3827 = var9;
            }
        }
        this.method4894(this.field3827);
        this.field3841 = null;
    }

    @ObfuscatedName("kn.o(I)I")
    public int method4841() {
        return this.field3819.method3723(this.field3827.method259(), class41.field552.field555) ? 100 : this.field3819.method3734(this.field3827.method259());
    }

    @ObfuscatedName("kn.x(IIZIIIII)V")
    public void method4948(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3831.method4825()) {
            return;
        }
        this.method4898();
        this.method4928();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3825));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3825));
        List var10 = this.field3830.method501(this.field3832 - var8 / 2 - 1, this.field3839 - var9 / 2 - 1, var8 / 2 + this.field3832 + 1, var9 / 2 + this.field3839 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class70 var14 = new class70();
            class48 var15 = new class48(var13.field549, var13.field542, var13.field541);
            var14.method982(new Object[] { var15, arg0, arg1 });
            if (this.field3857.contains(var13)) {
                var14.method978(class223.field2803);
            } else {
                var14.method978(class223.field2801);
            }
            class84.method2625(var14);
        }
        Iterator var16 = this.field3857.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class70 var18 = new class70();
                class48 var19 = new class48(var17.field549, var17.field542, var17.field541);
                var18.method982(new Object[] { var19, arg0, arg1 });
                var18.method978(class223.field2802);
                class84.method2625(var18);
            }
        }
        this.field3857 = var11;
    }

    @ObfuscatedName("kn.k(IIZB)V")
    public void method4843(int arg0, int arg1, boolean arg2) {
        if (this.field3846 == -1) {
            this.field3846 = arg0;
        }
        if (this.field3847 == -1) {
            this.field3847 = arg1;
        }
        int var4 = arg0 - this.field3846;
        int var5 = arg1 - this.field3847;
        this.field3846 = arg0;
        this.field3847 = arg1;
        if (arg2 && !this.method4846()) {
            this.field3832 -= (int) ((float) var4 / this.field3837);
            this.field3839 += (int) ((float) var5 / this.field3837);
        }
    }

    @ObfuscatedName("kn.f(I)V")
    public void method4898() {
        if (this.field3825 < this.field3837) {
            this.field3825 = Math.min(this.field3837, this.field3825 / 30.0F + this.field3825);
        }
        if (this.field3825 > this.field3837) {
            this.field3825 = Math.max(this.field3837, this.field3825 - this.field3825 / 30.0F);
        }
    }

    @ObfuscatedName("kn.i(B)V")
    public void method4928() {
        if (!this.method4846()) {
            return;
        }
        int var1 = this.field3850 - this.field3832;
        int var2 = this.field3835 - this.field3839;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3832 += var1;
        this.field3839 += var2;
        if (this.field3850 == this.field3832 && this.field3839 == this.field3835) {
            this.field3850 = -1;
            this.field3835 = -1;
        }
    }

    @ObfuscatedName("kn.j(I)Z")
    public boolean method4846() {
        return this.field3850 != -1 && this.field3835 != -1;
    }

    @ObfuscatedName("kn.m(IIIB)Laq;")
    public class33 method4892(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3833.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method252(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kn.u(IIIZI)V")
    public void method4978(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4892(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3827;
        }
        boolean var6 = false;
        if (this.field3841 != var5 || arg3) {
            this.field3841 = var5;
            this.method4894(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4922(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kn.h(II)V")
    public void method4849(int arg0) {
        class33 var2 = this.method4864(arg0);
        if (var2 != null) {
            this.method4894(var2);
        }
    }

    @ObfuscatedName("kn.a(I)I")
    public int method4842() {
        return this.field3820 == null ? -1 : this.field3820.method257();
    }

    @ObfuscatedName("kn.p(I)Laq;")
    public class33 method4851() {
        return this.field3820;
    }

    @ObfuscatedName("kn.q(Laq;B)V")
    public void method4894(class33 arg0) {
        if (this.field3820 == null || this.field3820 != arg0) {
            this.method4923(arg0);
            this.method4922(-1, -1, -1);
        }
    }

    @ObfuscatedName("kn.l(Laq;B)V")
    public void method4923(class33 arg0) {
        this.field3820 = arg0;
        this.field3830 = new class42(this.field3845, this.field3824);
        this.field3831.method4828(this.field3820.method259());
    }

    @ObfuscatedName("kn.c(Laq;Lhp;Lhp;ZI)V")
    public void method4863(class33 arg0, class216 arg1, class216 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3820 == null || this.field3820 != arg0) {
            this.method4923(arg0);
        }
        if (!arg3 && this.field3820.method252(arg1.field2621, arg1.field2622, arg1.field2620)) {
            this.method4922(arg1.field2621, arg1.field2622, arg1.field2620);
        } else {
            this.method4922(arg2.field2621, arg2.field2622, arg2.field2620);
        }
    }

    @ObfuscatedName("kn.n(IIII)V")
    public void method4922(int arg0, int arg1, int arg2) {
        if (this.field3820 == null) {
            return;
        }
        int[] var4 = this.field3820.method302(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3820.method302(this.field3820.method267(), this.field3820.method266(), this.field3820.method249());
        }
        this.field3832 = var4[0] - this.field3820.method294() * 64;
        this.field3839 = var4[1] - this.field3820.method264() * 64;
        this.field3850 = -1;
        this.field3835 = -1;
        this.field3825 = this.method4860(this.field3820.method262());
        this.field3837 = this.field3825;
        this.field3855 = null;
        this.field3856 = null;
        this.field3830.method496();
    }

    @ObfuscatedName("kn.z(IIIIII)V")
    public void method4856(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class285.method4593(var6);
        class285.method4574(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class285.method4623(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3831.method4826();
        if (var7 < 100) {
            this.method4859(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3830.method523()) {
            this.field3830.method495(this.field3819, this.field3820.method259(), client.field1175);
            if (!this.field3830.method523()) {
                return;
            }
        }
        if (this.field3843 != null) {
            this.field3838++;
            if (this.field3838 % this.field3834 == 0) {
                this.field3838 = 0;
                this.field3828++;
            }
            if (this.field3828 >= this.field3853 && !this.field3842) {
                this.field3843 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3825));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3825));
        this.field3830.method515(this.field3832 - var8 / 2, this.field3839 - var9 / 2, var8 / 2 + this.field3832, var9 / 2 + this.field3839, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3852) {
            boolean var10 = false;
            if (arg4 - this.field3815 > 100) {
                this.field3815 = arg4;
                var10 = true;
            }
            this.field3830.method498(this.field3832 - var8 / 2, this.field3839 - var9 / 2, var8 / 2 + this.field3832, var9 / 2 + this.field3839, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3851, this.field3843, this.field3838, this.field3834, var10);
        }
        this.field3818 = var8;
        this.field3829 = var9;
        class285.method4577(var6);
    }

    @ObfuscatedName("kn.e(IIIII)V")
    public void method4945(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3831.method4825()) {
            return;
        }
        if (!this.field3830.method523()) {
            this.field3830.method495(this.field3819, this.field3820.method259(), client.field1175);
            if (!this.field3830.method523()) {
                return;
            }
        }
        this.field3830.method500(arg0, arg1, arg2, arg3, this.field3843, this.field3838, this.field3834);
    }

    @ObfuscatedName("kn.t(II)V")
    public void method4858(int arg0) {
        this.field3837 = this.method4860(arg0);
    }

    @ObfuscatedName("kn.b(IIIIIB)V")
    public void method4859(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class285.method4623(arg0, arg1, arg2, arg3, -16777216);
        class285.method4615(var7 - 152, var8, 304, 34, -65536);
        class285.method4623(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3823.method4410(class229.field3135, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kn.s(II)F")
    public float method4860(int arg0) {
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

    @ObfuscatedName("kn.ap(I)I")
    public int method4861() {
        if ((double) this.field3837 == 1.0D) {
            return 25;
        } else if ((double) this.field3837 == 1.5D) {
            return 37;
        } else if ((double) this.field3837 == 2.0D) {
            return 50;
        } else if ((double) this.field3837 == 3.0D) {
            return 75;
        } else if ((double) this.field3837 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kn.ac(I)V")
    public void method4862() {
        this.field3831.method4824();
    }

    @ObfuscatedName("kn.af(I)Z")
    public boolean method4886() {
        return this.field3831.method4825();
    }

    @ObfuscatedName("kn.ai(IB)Laq;")
    public class33 method4864(int arg0) {
        Iterator var2 = this.field3833.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method257() != arg0);
        return var3;
    }

    @ObfuscatedName("kn.ad(III)V")
    public void method4865(int arg0, int arg1) {
        if (this.field3820 != null && this.field3820.method253(arg0, arg1)) {
            this.field3850 = arg0 - this.field3820.method294() * 64;
            this.field3835 = arg1 - this.field3820.method264() * 64;
        }
    }

    @ObfuscatedName("kn.ar(III)V")
    public void method4866(int arg0, int arg1) {
        if (this.field3820 != null) {
            this.field3832 = arg0 - this.field3820.method294() * 64;
            this.field3839 = arg1 - this.field3820.method264() * 64;
            this.field3850 = -1;
            this.field3835 = -1;
        }
    }

    @ObfuscatedName("kn.aq(IIIB)V")
    public void method4867(int arg0, int arg1, int arg2) {
        if (this.field3820 != null) {
            int[] var4 = this.field3820.method302(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4865(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kn.ag(IIIB)V")
    public void method4942(int arg0, int arg1, int arg2) {
        if (this.field3820 != null) {
            int[] var4 = this.field3820.method302(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4866(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kn.ak(B)I")
    public int method4857() {
        return this.field3820 == null ? -1 : this.field3832 + this.field3820.method294() * 64;
    }

    @ObfuscatedName("kn.ae(I)I")
    public int method4908() {
        return this.field3820 == null ? -1 : this.field3839 + this.field3820.method264() * 64;
    }

    @ObfuscatedName("kn.am(I)Lhp;")
    public class216 method4958() {
        return this.field3820 == null ? null : this.field3820.method255(this.method4857(), this.method4908());
    }

    @ObfuscatedName("kn.az(I)I")
    public int method4944() {
        return this.field3818;
    }

    @ObfuscatedName("kn.ay(I)I")
    public int method4873() {
        return this.field3829;
    }

    @ObfuscatedName("kn.as(IB)V")
    public void method4874(int arg0) {
        if (arg0 >= 1) {
            this.field3853 = arg0;
        }
    }

    @ObfuscatedName("kn.aw(I)V")
    public void method4875() {
        this.field3853 = 3;
    }

    @ObfuscatedName("kn.at(II)V")
    public void method4910(int arg0) {
        if (arg0 >= 1) {
            this.field3834 = arg0;
        }
    }

    @ObfuscatedName("kn.aj(I)V")
    public void method4877() {
        this.field3834 = 50;
    }

    @ObfuscatedName("kn.ax(ZS)V")
    public void method4878(boolean arg0) {
        this.field3842 = arg0;
    }

    @ObfuscatedName("kn.an(IB)V")
    public void method4879(int arg0) {
        this.field3843 = new HashSet();
        this.field3843.add(arg0);
        this.field3828 = 0;
        this.field3838 = 0;
    }

    @ObfuscatedName("kn.ab(IB)V")
    public void method4839(int arg0) {
        this.field3843 = new HashSet();
        this.field3828 = 0;
        this.field3838 = 0;
        for (int var2 = 0; var2 < Statics.field3301.length; var2++) {
            if (Statics.field3301[var2] != null && Statics.field3301[var2].field3313 == arg0) {
                this.field3843.add(Statics.field3301[var2].field3296);
            }
        }
    }

    @ObfuscatedName("kn.av(I)V")
    public void method4881() {
        this.field3843 = null;
    }

    @ObfuscatedName("kn.al(ZI)V")
    public void method4882(boolean arg0) {
        this.field3852 = !arg0;
    }

    @ObfuscatedName("kn.ah(IZI)V")
    public void method4883(int arg0, boolean arg1) {
        if (arg1) {
            this.field3848.remove(arg0);
        } else {
            this.field3848.add(arg0);
        }
        this.method4888();
    }

    @ObfuscatedName("kn.au(IZI)V")
    public void method4884(int arg0, boolean arg1) {
        if (arg1) {
            this.field3849.remove(arg0);
        } else {
            this.field3849.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3301.length; var3++) {
            if (Statics.field3301[var3] != null && Statics.field3301[var3].field3313 == arg0) {
                int var4 = Statics.field3301[var3].field3296;
                if (arg1) {
                    this.field3836.remove(var4);
                } else {
                    this.field3836.add(var4);
                }
            }
        }
        this.method4888();
    }

    @ObfuscatedName("kn.aa(S)Z")
    public boolean method4885() {
        return !this.field3852;
    }

    @ObfuscatedName("kn.ao(II)Z")
    public boolean method4870(int arg0) {
        return !this.field3848.contains(arg0);
    }

    @ObfuscatedName("kn.bm(IS)Z")
    public boolean method4887(int arg0) {
        return !this.field3849.contains(arg0);
    }

    @ObfuscatedName("kn.bd(I)V")
    public void method4888() {
        this.field3851.clear();
        this.field3851.addAll(this.field3848);
        this.field3851.addAll(this.field3836);
    }

    @ObfuscatedName("kn.bn(IIIIIII)V")
    public void method4889(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3831.method4825()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3825));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3825));
        List var9 = this.field3830.method501(this.field3832 - var7 / 2 - 1, this.field3839 - var8 / 2 - 1, var7 / 2 + this.field3832 + 1, var8 / 2 + this.field3839 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class246 var12 = Statics.field3301[var11.field549];
            var13 = false;
            for (int var14 = this.field3854.length - 1; var14 >= 0; var14--) {
                if (var12.field3302[var14] != null) {
                    client.method1029(var12.field3302[var14], var12.field3303, this.field3854[var14], var11.field549, var11.field542.method3593(), var11.field541.method3593());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kn.by(ILhp;I)Lhp;")
    public class216 method4890(int arg0, class216 arg1) {
        if (!this.field3831.method4825()) {
            return null;
        } else if (!this.field3830.method523()) {
            return null;
        } else if (this.field3820.method253(arg1.field2622, arg1.field2620)) {
            HashMap var3 = this.field3830.method525();
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
                        return var5.field541;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field541.field2622 - arg1.field2622;
                    int var10 = var8.field541.field2620 - arg1.field2620;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field541;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kn.bo(IILhp;Lhp;B)V")
    public void method4891(int arg0, int arg1, class216 arg2, class216 arg3) {
        class70 var5 = new class70();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method982(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method978(class223.field2805);
                break;
            case 1009:
                var5.method978(class223.field2797);
                break;
            case 1010:
                var5.method978(class223.field2799);
                break;
            case 1011:
                var5.method978(class223.field2796);
                break;
            case 1012:
                var5.method978(class223.field2804);
        }
        class84.method2625(var5);
    }

    @ObfuscatedName("kn.ba(I)Las;")
    public class40 method4946() {
        if (!this.field3831.method4825()) {
            return null;
        } else if (this.field3830.method523()) {
            HashMap var1 = this.field3830.method525();
            this.field3855 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3855.addAll(var3);
            }
            this.field3856 = this.field3855.iterator();
            return this.method4893();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kn.bv(I)Las;")
    public class40 method4893() {
        if (this.field3856 == null) {
            return null;
        } else if (this.field3856.hasNext()) {
            return (class40) this.field3856.next();
        } else {
            return null;
        }
    }
}
