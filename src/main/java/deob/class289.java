package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kr")
public class class289 {

    @ObfuscatedName("kr.v")
    public class236 field3815;

    @ObfuscatedName("kr.y")
    public static final class262 field3816 = class262.field3636;

    @ObfuscatedName("kr.j")
    public static final class262 field3817 = class262.field3629;

    @ObfuscatedName("kr.k")
    public static final class262 field3838 = class262.field3630;

    @ObfuscatedName("kr.e")
    public class264 field3819;

    @ObfuscatedName("kr.o")
    public HashMap field3820;

    @ObfuscatedName("kr.z")
    public class285[] field3821;

    @ObfuscatedName("kr.l")
    public HashMap field3825;

    @ObfuscatedName("kr.c")
    public class33 field3812;

    @ObfuscatedName("kr.m")
    public class33 field3853;

    @ObfuscatedName("kr.b")
    public class33 field3830;

    @ObfuscatedName("kr.f")
    public class42 field3826;

    @ObfuscatedName("kr.n")
    public class288 field3824;

    @ObfuscatedName("kr.u")
    public int field3828;

    @ObfuscatedName("kr.p")
    public int field3829;

    @ObfuscatedName("kr.q")
    public int field3837 = -1;

    @ObfuscatedName("kr.d")
    public int field3831 = -1;

    @ObfuscatedName("kr.h")
    public float field3832;

    @ObfuscatedName("kr.g")
    public float field3823;

    @ObfuscatedName("kr.x")
    public int field3834 = -1;

    @ObfuscatedName("kr.ah")
    public int field3835 = -1;

    @ObfuscatedName("kr.ab")
    public int field3845 = 3;

    @ObfuscatedName("kr.aw")
    public int field3827 = 50;

    @ObfuscatedName("kr.ai")
    public boolean field3836 = false;

    @ObfuscatedName("kr.an")
    public HashSet field3833 = null;

    @ObfuscatedName("kr.au")
    public int field3840 = -1;

    @ObfuscatedName("kr.ar")
    public int field3839 = -1;

    @ObfuscatedName("kr.ay")
    public int field3842 = -1;

    @ObfuscatedName("kr.ao")
    public int field3843 = -1;

    @ObfuscatedName("kr.as")
    public HashSet field3844 = new HashSet();

    @ObfuscatedName("kr.ak")
    public HashSet field3822 = new HashSet();

    @ObfuscatedName("kr.aq")
    public HashSet field3846 = new HashSet();

    @ObfuscatedName("kr.ax")
    public HashSet field3847 = new HashSet();

    @ObfuscatedName("kr.ac")
    public boolean field3848 = false;

    @ObfuscatedName("kr.at")
    public int field3849 = 0;

    @ObfuscatedName("kr.aa")
    public final int[] field3818 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kr.am")
    public List field3851;

    @ObfuscatedName("kr.az")
    public Iterator field3852;

    @ObfuscatedName("kr.al")
    public HashSet field3813 = new HashSet();

    @ObfuscatedName("kr.i(Liq;Ljf;Ljava/util/HashMap;[Ljz;I)V")
    public void method4915(class236 arg0, class264 arg1, HashMap arg2, class285[] arg3) {
        this.field3821 = arg3;
        this.field3815 = arg0;
        this.field3819 = arg1;
        this.field3820 = new HashMap();
        this.field3820.put(class25.field365, arg2.get(field3816));
        this.field3820.put(class25.field359, arg2.get(field3817));
        this.field3820.put(class25.field360, arg2.get(field3838));
        this.field3824 = new class288(arg0);
        int var5 = this.field3815.method3800(class41.field565.field567);
        int[] var6 = this.field3815.method3775(var5);
        this.field3825 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class174 var8 = new class174(this.field3815.method3768(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method278(var8, var6[var7]);
            this.field3825.put(var9.method245(), var9);
            if (var9.method244()) {
                this.field3812 = var9;
            }
        }
        this.method4808(this.field3812);
        this.field3830 = null;
    }

    @ObfuscatedName("kr.w(I)I")
    public int method4797() {
        return this.field3815.method3788(this.field3812.method245(), class41.field562.field567) ? 100 : this.field3815.method3772(this.field3812.method245());
    }

    @ObfuscatedName("kr.a(IIZIIIII)V")
    public void method4857(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3824.method4780()) {
            return;
        }
        this.method4815();
        this.method4953();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3832));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3832));
        List var10 = this.field3826.method511(this.field3828 - var8 / 2 - 1, this.field3829 - var9 / 2 - 1, var8 / 2 + this.field3828 + 1, var9 / 2 + this.field3829 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class70 var14 = new class70();
            class48 var15 = new class48(var13.field549, var13.field548, var13.field551);
            var14.method1024(new Object[] { var15, arg0, arg1 });
            if (this.field3813.contains(var13)) {
                var14.method1019(class220.field2795);
            } else {
                var14.method1019(class220.field2800);
            }
            class84.method68(var14);
        }
        Iterator var16 = this.field3813.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class70 var18 = new class70();
                class48 var19 = new class48(var17.field549, var17.field548, var17.field551);
                var18.method1024(new Object[] { var19, arg0, arg1 });
                var18.method1019(class220.field2801);
                class84.method68(var18);
            }
        }
        this.field3813 = var11;
    }

    @ObfuscatedName("kr.t(IIZI)V")
    public void method4799(int arg0, int arg1, boolean arg2) {
        if (this.field3842 == -1) {
            this.field3842 = arg0;
        }
        if (this.field3843 == -1) {
            this.field3843 = arg1;
        }
        int var4 = arg0 - this.field3842;
        int var5 = arg1 - this.field3843;
        this.field3842 = arg0;
        this.field3843 = arg1;
        if (arg2 && !this.method4937()) {
            this.field3828 -= (int) ((float) var4 / this.field3823);
            this.field3829 += (int) ((float) var5 / this.field3823);
        }
    }

    @ObfuscatedName("kr.s(I)V")
    public void method4815() {
        if (this.field3832 < this.field3823) {
            this.field3832 = Math.min(this.field3823, this.field3832 / 30.0F + this.field3832);
        }
        if (this.field3832 > this.field3823) {
            this.field3832 = Math.max(this.field3823, this.field3832 - this.field3832 / 30.0F);
        }
    }

    @ObfuscatedName("kr.r(B)V")
    public void method4953() {
        if (!this.method4937()) {
            return;
        }
        int var1 = this.field3837 - this.field3828;
        int var2 = this.field3831 - this.field3829;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3828 += var1;
        this.field3829 += var2;
        if (this.field3837 == this.field3828 && this.field3831 == this.field3829) {
            this.field3837 = -1;
            this.field3831 = -1;
        }
    }

    @ObfuscatedName("kr.v(I)Z")
    public boolean method4937() {
        return this.field3837 != -1 && this.field3831 != -1;
    }

    @ObfuscatedName("kr.y(IIII)Lar;")
    public class33 method4831(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3825.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method238(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kr.j(IIIZI)V")
    public void method4804(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4831(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3812;
        }
        boolean var6 = false;
        if (this.field3830 != var5 || arg3) {
            this.field3830 = var5;
            this.method4808(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4811(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kr.k(IB)V")
    public void method4805(int arg0) {
        class33 var2 = this.method4796(arg0);
        if (var2 != null) {
            this.method4808(var2);
        }
    }

    @ObfuscatedName("kr.e(I)I")
    public int method4806() {
        return this.field3853 == null ? -1 : this.field3853.method243();
    }

    @ObfuscatedName("kr.o(I)Lar;")
    public class33 method4877() {
        return this.field3853;
    }

    @ObfuscatedName("kr.z(Lar;B)V")
    public void method4808(class33 arg0) {
        if (this.field3853 == null || this.field3853 != arg0) {
            this.method4809(arg0);
            this.method4811(-1, -1, -1);
        }
    }

    @ObfuscatedName("kr.l(Lar;I)V")
    public void method4809(class33 arg0) {
        this.field3853 = arg0;
        this.field3826 = new class42(this.field3821, this.field3820);
        this.field3824.method4793(this.field3853.method245());
    }

    @ObfuscatedName("kr.c(Lar;Lhb;Lhb;ZI)V")
    public void method4810(class33 arg0, class213 arg1, class213 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3853 == null || this.field3853 != arg0) {
            this.method4809(arg0);
        }
        if (!arg3 && this.field3853.method238(arg1.field2617, arg1.field2616, arg1.field2618)) {
            this.method4811(arg1.field2617, arg1.field2616, arg1.field2618);
        } else {
            this.method4811(arg2.field2617, arg2.field2616, arg2.field2618);
        }
    }

    @ObfuscatedName("kr.b(IIIB)V")
    public void method4811(int arg0, int arg1, int arg2) {
        if (this.field3853 == null) {
            return;
        }
        int[] var4 = this.field3853.method280(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3853.method280(this.field3853.method296(), this.field3853.method299(), this.field3853.method255());
        }
        this.field3828 = var4[0] - this.field3853.method268() * 64;
        this.field3829 = var4[1] - this.field3853.method251() * 64;
        this.field3837 = -1;
        this.field3831 = -1;
        this.field3832 = this.method4816(this.field3853.method248());
        this.field3823 = this.field3832;
        this.field3851 = null;
        this.field3852 = null;
        this.field3826.method506();
    }

    @ObfuscatedName("kr.f(IIIIII)V")
    public void method4812(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class282.method4555(var6);
        class282.method4630(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class282.method4614(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3824.method4781();
        if (var7 < 100) {
            this.method4820(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3826.method547()) {
            this.field3826.method505(this.field3815, this.field3853.method245(), client.field930);
            if (!this.field3826.method547()) {
                return;
            }
        }
        if (this.field3833 != null) {
            this.field3839++;
            if (this.field3839 % this.field3827 == 0) {
                this.field3839 = 0;
                this.field3840++;
            }
            if (this.field3840 >= this.field3845 && !this.field3836) {
                this.field3833 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3832));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3832));
        this.field3826.method507(this.field3828 - var8 / 2, this.field3829 - var9 / 2, var8 / 2 + this.field3828, var9 / 2 + this.field3829, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3848) {
            boolean var10 = false;
            if (arg4 - this.field3849 > 100) {
                this.field3849 = arg4;
                var10 = true;
            }
            this.field3826.method539(this.field3828 - var8 / 2, this.field3829 - var9 / 2, var8 / 2 + this.field3828, var9 / 2 + this.field3829, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3847, this.field3833, this.field3839, this.field3827, var10);
        }
        this.field3834 = var8;
        this.field3835 = var9;
        class282.method4552(var6);
    }

    @ObfuscatedName("kr.n(IIIII)V")
    public void method4833(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3824.method4780()) {
            return;
        }
        if (!this.field3826.method547()) {
            this.field3826.method505(this.field3815, this.field3853.method245(), client.field930);
            if (!this.field3826.method547()) {
                return;
            }
        }
        this.field3826.method510(arg0, arg1, arg2, arg3, this.field3833, this.field3839, this.field3827);
    }

    @ObfuscatedName("kr.u(II)V")
    public void method4867(int arg0) {
        this.field3823 = this.method4816(arg0);
    }

    @ObfuscatedName("kr.p(IIIIII)V")
    public void method4820(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class282.method4614(arg0, arg1, arg2, arg3, -16777216);
        class282.method4589(var7 - 152, var8, 304, 34, -65536);
        class282.method4614(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3819.method4393(class226.field3140, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kr.q(II)F")
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

    @ObfuscatedName("kr.d(I)I")
    public int method4942() {
        if ((double) this.field3823 == 1.0D) {
            return 25;
        } else if ((double) this.field3823 == 1.5D) {
            return 37;
        } else if ((double) this.field3823 == 2.0D) {
            return 50;
        } else if ((double) this.field3823 == 3.0D) {
            return 75;
        } else if ((double) this.field3823 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kr.h(B)V")
    public void method4818() {
        this.field3824.method4787();
    }

    @ObfuscatedName("kr.g(I)Z")
    public boolean method4819() {
        return this.field3824.method4780();
    }

    @ObfuscatedName("kr.x(IB)Lar;")
    public class33 method4796(int arg0) {
        Iterator var2 = this.field3825.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method243() != arg0);
        return var3;
    }

    @ObfuscatedName("kr.ai(III)V")
    public void method4821(int arg0, int arg1) {
        if (this.field3853 != null && this.field3853.method270(arg0, arg1)) {
            this.field3837 = arg0 - this.field3853.method268() * 64;
            this.field3831 = arg1 - this.field3853.method251() * 64;
        }
    }

    @ObfuscatedName("kr.an(III)V")
    public void method4822(int arg0, int arg1) {
        if (this.field3853 != null) {
            this.field3828 = arg0 - this.field3853.method268() * 64;
            this.field3829 = arg1 - this.field3853.method251() * 64;
            this.field3837 = -1;
            this.field3831 = -1;
        }
    }

    @ObfuscatedName("kr.au(IIII)V")
    public void method4823(int arg0, int arg1, int arg2) {
        if (this.field3853 != null) {
            int[] var4 = this.field3853.method280(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4821(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kr.ar(IIII)V")
    public void method4829(int arg0, int arg1, int arg2) {
        if (this.field3853 != null) {
            int[] var4 = this.field3853.method280(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4822(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kr.ay(I)I")
    public int method4916() {
        return this.field3853 == null ? -1 : this.field3828 + this.field3853.method268() * 64;
    }

    @ObfuscatedName("kr.ao(I)I")
    public int method4826() {
        return this.field3853 == null ? -1 : this.field3829 + this.field3853.method251() * 64;
    }

    @ObfuscatedName("kr.as(I)Lhb;")
    public class213 method4827() {
        return this.field3853 == null ? null : this.field3853.method241(this.method4916(), this.method4826());
    }

    @ObfuscatedName("kr.ak(I)I")
    public int method4901() {
        return this.field3834;
    }

    @ObfuscatedName("kr.aq(I)I")
    public int method4950() {
        return this.field3835;
    }

    @ObfuscatedName("kr.ax(II)V")
    public void method4871(int arg0) {
        if (arg0 >= 1) {
            this.field3845 = arg0;
        }
    }

    @ObfuscatedName("kr.ac(S)V")
    public void method4798() {
        this.field3845 = 3;
    }

    @ObfuscatedName("kr.at(II)V")
    public void method4936(int arg0) {
        if (arg0 >= 1) {
            this.field3827 = arg0;
        }
    }

    @ObfuscatedName("kr.av(B)V")
    public void method4900() {
        this.field3827 = 50;
    }

    @ObfuscatedName("kr.aa(ZI)V")
    public void method4834(boolean arg0) {
        this.field3836 = arg0;
    }

    @ObfuscatedName("kr.am(II)V")
    public void method4956(int arg0) {
        this.field3833 = new HashSet();
        this.field3833.add(arg0);
        this.field3840 = 0;
        this.field3839 = 0;
    }

    @ObfuscatedName("kr.az(II)V")
    public void method4836(int arg0) {
        this.field3833 = new HashSet();
        this.field3840 = 0;
        this.field3839 = 0;
        for (int var2 = 0; var2 < Statics.field3304.length; var2++) {
            if (Statics.field3304[var2] != null && Statics.field3304[var2].field3308 == arg0) {
                this.field3833.add(Statics.field3304[var2].field3298);
            }
        }
    }

    @ObfuscatedName("kr.al(B)V")
    public void method4837() {
        this.field3833 = null;
    }

    @ObfuscatedName("kr.ad(ZI)V")
    public void method4982(boolean arg0) {
        this.field3848 = !arg0;
    }

    @ObfuscatedName("kr.ae(IZI)V")
    public void method4839(int arg0, boolean arg1) {
        if (arg1) {
            this.field3844.remove(arg0);
        } else {
            this.field3844.add(arg0);
        }
        this.method4838();
    }

    @ObfuscatedName("kr.ag(IZI)V")
    public void method4840(int arg0, boolean arg1) {
        if (arg1) {
            this.field3822.remove(arg0);
        } else {
            this.field3822.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3304.length; var3++) {
            if (Statics.field3304[var3] != null && Statics.field3304[var3].field3308 == arg0) {
                int var4 = Statics.field3304[var3].field3298;
                if (arg1) {
                    this.field3846.remove(var4);
                } else {
                    this.field3846.add(var4);
                }
            }
        }
        this.method4838();
    }

    @ObfuscatedName("kr.ap(I)Z")
    public boolean method4841() {
        return !this.field3848;
    }

    @ObfuscatedName("kr.af(IB)Z")
    public boolean method4842(int arg0) {
        return !this.field3844.contains(arg0);
    }

    @ObfuscatedName("kr.aj(II)Z")
    public boolean method4843(int arg0) {
        return !this.field3822.contains(arg0);
    }

    @ObfuscatedName("kr.bb(I)V")
    public void method4838() {
        this.field3847.clear();
        this.field3847.addAll(this.field3844);
        this.field3847.addAll(this.field3846);
    }

    @ObfuscatedName("kr.bc(IIIIIII)V")
    public void method4845(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3824.method4780()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3832));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3832));
        List var9 = this.field3826.method511(this.field3828 - var7 / 2 - 1, this.field3829 - var8 / 2 - 1, var7 / 2 + this.field3828 + 1, var8 / 2 + this.field3829 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class243 var12 = Statics.field3304[var11.field549];
            var13 = false;
            for (int var14 = this.field3818.length - 1; var14 >= 0; var14--) {
                if (var12.field3305[var14] != null) {
                    Statics.method3079(var12.field3305[var14], var12.field3306, this.field3818[var14], var11.field549, var11.field548.method3592(), var11.field551.method3592());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kr.be(ILhb;I)Lhb;")
    public class213 method4938(int arg0, class213 arg1) {
        if (!this.field3824.method4780()) {
            return null;
        } else if (!this.field3826.method547()) {
            return null;
        } else if (this.field3853.method270(arg1.field2616, arg1.field2618)) {
            HashMap var3 = this.field3826.method540();
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
                        return var5.field551;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field551.field2616 - arg1.field2616;
                    int var10 = var8.field551.field2618 - arg1.field2618;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field551;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kr.bv(IILhb;Lhb;B)V")
    public void method4847(int arg0, int arg1, class213 arg2, class213 arg3) {
        class70 var5 = new class70();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1024(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1019(class220.field2802);
                break;
            case 1009:
                var5.method1019(class220.field2796);
                break;
            case 1010:
                var5.method1019(class220.field2797);
                break;
            case 1011:
                var5.method1019(class220.field2798);
                break;
            case 1012:
                var5.method1019(class220.field2799);
        }
        class84.method68(var5);
    }

    @ObfuscatedName("kr.bt(I)Lac;")
    public class40 method4848() {
        if (!this.field3824.method4780()) {
            return null;
        } else if (this.field3826.method547()) {
            HashMap var1 = this.field3826.method540();
            this.field3851 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3851.addAll(var3);
            }
            this.field3852 = this.field3851.iterator();
            return this.method4849();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kr.bl(I)Lac;")
    public class40 method4849() {
        if (this.field3852 == null) {
            return null;
        } else if (this.field3852.hasNext()) {
            return (class40) this.field3852.next();
        } else {
            return null;
        }
    }
}
