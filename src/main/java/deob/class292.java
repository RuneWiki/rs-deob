package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kn")
public class class292 {

    @ObfuscatedName("kn.p")
    public class239 field3834;

    @ObfuscatedName("kn.d")
    public static final class265 field3841 = class265.field3638;

    @ObfuscatedName("kn.n")
    public static final class265 field3820 = class265.field3640;

    @ObfuscatedName("kn.z")
    public static final class265 field3826 = class265.field3637;

    @ObfuscatedName("kn.o")
    public class267 field3822;

    @ObfuscatedName("kn.q")
    public HashMap field3823;

    @ObfuscatedName("kn.u")
    public class288[] field3824;

    @ObfuscatedName("kn.k")
    public HashMap field3825;

    @ObfuscatedName("kn.e")
    public class33 field3857;

    @ObfuscatedName("kn.r")
    public class33 field3835;

    @ObfuscatedName("kn.l")
    public class33 field3828;

    @ObfuscatedName("kn.y")
    public class42 field3837;

    @ObfuscatedName("kn.w")
    public class291 field3830;

    @ObfuscatedName("kn.i")
    public int field3831;

    @ObfuscatedName("kn.g")
    public int field3832;

    @ObfuscatedName("kn.a")
    public int field3833 = -1;

    @ObfuscatedName("kn.x")
    public int field3819 = -1;

    @ObfuscatedName("kn.b")
    public float field3816;

    @ObfuscatedName("kn.j")
    public float field3836;

    @ObfuscatedName("kn.v")
    public int field3815 = -1;

    @ObfuscatedName("kn.ap")
    public int field3838 = -1;

    @ObfuscatedName("kn.ar")
    public int field3852 = 3;

    @ObfuscatedName("kn.am")
    public int field3840 = 50;

    @ObfuscatedName("kn.ab")
    public boolean field3848 = false;

    @ObfuscatedName("kn.af")
    public HashSet field3842 = null;

    @ObfuscatedName("kn.aa")
    public int field3843 = -1;

    @ObfuscatedName("kn.aq")
    public int field3844 = -1;

    @ObfuscatedName("kn.aj")
    public int field3827 = -1;

    @ObfuscatedName("kn.as")
    public int field3821 = -1;

    @ObfuscatedName("kn.av")
    public HashSet field3847 = new HashSet();

    @ObfuscatedName("kn.ao")
    public HashSet field3846 = new HashSet();

    @ObfuscatedName("kn.ag")
    public HashSet field3849 = new HashSet();

    @ObfuscatedName("kn.ay")
    public HashSet field3850 = new HashSet();

    @ObfuscatedName("kn.ax")
    public boolean field3851 = false;

    @ObfuscatedName("kn.ad")
    public int field3845 = 0;

    @ObfuscatedName("kn.ac")
    public final int[] field3853 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kn.az")
    public List field3854;

    @ObfuscatedName("kn.ah")
    public Iterator field3855;

    @ObfuscatedName("kn.at")
    public HashSet field3856 = new HashSet();

    @ObfuscatedName("kn.s(Liw;Ljb;Ljava/util/HashMap;[Lkc;I)V")
    public void method5013(class239 arg0, class267 arg1, HashMap arg2, class288[] arg3) {
        this.field3824 = arg3;
        this.field3834 = arg0;
        this.field3822 = arg1;
        this.field3823 = new HashMap();
        this.field3823.put(class25.field373, arg2.get(field3841));
        this.field3823.put(class25.field365, arg2.get(field3820));
        this.field3823.put(class25.field367, arg2.get(field3826));
        this.field3830 = new class291(arg0);
        int var5 = this.field3834.method3855(class41.field537.field542);
        int[] var6 = this.field3834.method3872(var5);
        this.field3825 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class177 var8 = new class177(this.field3834.method3840(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method251(var8, var6[var7]);
            this.field3825.put(var9.method260(), var9);
            if (var9.method259()) {
                this.field3857 = var9;
            }
        }
        this.method4911(this.field3857);
        this.field3828 = null;
    }

    @ObfuscatedName("kn.c(B)I")
    public int method4983() {
        return this.field3834.method3869(this.field3857.method260(), class41.field545.field542) ? 100 : this.field3834.method3923(this.field3857.method260());
    }

    @ObfuscatedName("kn.f(IIZIIIII)V")
    public void method4901(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3830.method4887()) {
            return;
        }
        this.method4903();
        this.method4904();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3816));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3816));
        List var10 = this.field3837.method505(this.field3831 - var8 / 2 - 1, this.field3832 - var9 / 2 - 1, var8 / 2 + this.field3831 + 1, var9 / 2 + this.field3832 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class70 var14 = new class70();
            class48 var15 = new class48(var13.field534, var13.field525, var13.field524);
            var14.method977(new Object[] { var15, arg0, arg1 });
            if (this.field3856.contains(var13)) {
                var14.method978(class223.field2810);
            } else {
                var14.method978(class223.field2812);
            }
            class84.method152(var14);
        }
        Iterator var16 = this.field3856.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class70 var18 = new class70();
                class48 var19 = new class48(var17.field534, var17.field525, var17.field524);
                var18.method977(new Object[] { var19, arg0, arg1 });
                var18.method978(class223.field2814);
                class84.method152(var18);
            }
        }
        this.field3856 = var11;
    }

    @ObfuscatedName("kn.m(IIZB)V")
    public void method4902(int arg0, int arg1, boolean arg2) {
        if (this.field3827 == -1) {
            this.field3827 = arg0;
        }
        if (this.field3821 == -1) {
            this.field3821 = arg1;
        }
        int var4 = arg0 - this.field3827;
        int var5 = arg1 - this.field3821;
        this.field3827 = arg0;
        this.field3821 = arg1;
        if (arg2 && !this.method4905()) {
            this.field3831 -= (int) ((float) var4 / this.field3836);
            this.field3832 += (int) ((float) var5 / this.field3836);
        }
    }

    @ObfuscatedName("kn.h(B)V")
    public void method4903() {
        if (this.field3816 < this.field3836) {
            this.field3816 = Math.min(this.field3836, this.field3816 / 30.0F + this.field3816);
        }
        if (this.field3816 > this.field3836) {
            this.field3816 = Math.max(this.field3836, this.field3816 - this.field3816 / 30.0F);
        }
    }

    @ObfuscatedName("kn.t(I)V")
    public void method4904() {
        if (!this.method4905()) {
            return;
        }
        int var1 = this.field3833 - this.field3831;
        int var2 = this.field3819 - this.field3832;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3831 += var1;
        this.field3832 += var2;
        if (this.field3833 == this.field3831 && this.field3832 == this.field3819) {
            this.field3833 = -1;
            this.field3819 = -1;
        }
    }

    @ObfuscatedName("kn.p(I)Z")
    public boolean method4905() {
        return this.field3833 != -1 && this.field3819 != -1;
    }

    @ObfuscatedName("kn.d(IIII)Laq;")
    public class33 method4941(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3825.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method271(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kn.n(IIIZI)V")
    public void method4907(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4941(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3857;
        }
        boolean var6 = false;
        if (this.field3828 != var5 || arg3) {
            this.field3828 = var5;
            this.method4911(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4969(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kn.z(II)V")
    public void method4914(int arg0) {
        class33 var2 = this.method5001(arg0);
        if (var2 != null) {
            this.method4911(var2);
        }
    }

    @ObfuscatedName("kn.o(B)I")
    public int method5055() {
        return this.field3835 == null ? -1 : this.field3835.method258();
    }

    @ObfuscatedName("kn.u(I)Laq;")
    public class33 method4910() {
        return this.field3835;
    }

    @ObfuscatedName("kn.r(Laq;B)V")
    public void method4911(class33 arg0) {
        if (this.field3835 == null || this.field3835 != arg0) {
            this.method4912(arg0);
            this.method4969(-1, -1, -1);
        }
    }

    @ObfuscatedName("kn.l(Laq;B)V")
    public void method4912(class33 arg0) {
        this.field3835 = arg0;
        this.field3837 = new class42(this.field3824, this.field3823);
        this.field3830.method4885(this.field3835.method260());
    }

    @ObfuscatedName("kn.y(Laq;Lhp;Lhp;ZI)V")
    public void method4913(class33 arg0, class216 arg1, class216 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3835 == null || this.field3835 != arg0) {
            this.method4912(arg0);
        }
        if (!arg3 && this.field3835.method271(arg1.field2631, arg1.field2626, arg1.field2632)) {
            this.method4969(arg1.field2631, arg1.field2626, arg1.field2632);
        } else {
            this.method4969(arg2.field2631, arg2.field2626, arg2.field2632);
        }
    }

    @ObfuscatedName("kn.w(IIII)V")
    public void method4969(int arg0, int arg1, int arg2) {
        if (this.field3835 == null) {
            return;
        }
        int[] var4 = this.field3835.method250(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3835.method250(this.field3835.method262(), this.field3835.method298(), this.field3835.method270());
        }
        this.field3831 = var4[0] - this.field3835.method307() * 64;
        this.field3832 = var4[1] - this.field3835.method263() * 64;
        this.field3833 = -1;
        this.field3819 = -1;
        this.field3816 = this.method4919(this.field3835.method275());
        this.field3836 = this.field3816;
        this.field3854 = null;
        this.field3855 = null;
        this.field3837.method500();
    }

    @ObfuscatedName("kn.i(IIIIIB)V")
    public void method4915(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class285.method4657(var6);
        class285.method4655(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class285.method4701(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3830.method4895();
        if (var7 < 100) {
            this.method4918(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3837.method507()) {
            this.field3837.method499(this.field3834, this.field3835.method260(), client.field1136);
            if (!this.field3837.method507()) {
                return;
            }
        }
        if (this.field3842 != null) {
            this.field3844++;
            if (this.field3844 % this.field3840 == 0) {
                this.field3844 = 0;
                this.field3843++;
            }
            if (this.field3843 >= this.field3852 && !this.field3848) {
                this.field3842 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3816));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3816));
        this.field3837.method501(this.field3831 - var8 / 2, this.field3832 - var9 / 2, var8 / 2 + this.field3831, var9 / 2 + this.field3832, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3851) {
            boolean var10 = false;
            if (arg4 - this.field3845 > 100) {
                this.field3845 = arg4;
                var10 = true;
            }
            this.field3837.method529(this.field3831 - var8 / 2, this.field3832 - var9 / 2, var8 / 2 + this.field3831, var9 / 2 + this.field3832, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3850, this.field3842, this.field3844, this.field3840, var10);
        }
        this.field3815 = var8;
        this.field3838 = var9;
        class285.method4661(var6);
    }

    @ObfuscatedName("kn.g(IIIIB)V")
    public void method4916(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3830.method4887()) {
            return;
        }
        if (!this.field3837.method507()) {
            this.field3837.method499(this.field3834, this.field3835.method260(), client.field1136);
            if (!this.field3837.method507()) {
                return;
            }
        }
        this.field3837.method504(arg0, arg1, arg2, arg3, this.field3842, this.field3844, this.field3840);
    }

    @ObfuscatedName("kn.a(II)V")
    public void method4917(int arg0) {
        this.field3836 = this.method4919(arg0);
    }

    @ObfuscatedName("kn.x(IIIIIS)V")
    public void method4918(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class285.method4701(arg0, arg1, arg2, arg3, -16777216);
        class285.method4734(var7 - 152, var8, 304, 34, -65536);
        class285.method4701(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3822.method4490(class229.field3151, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kn.j(II)F")
    public float method4919(int arg0) {
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

    @ObfuscatedName("kn.v(I)I")
    public int method4920() {
        if ((double) this.field3836 == 1.0D) {
            return 25;
        } else if ((double) this.field3836 == 1.5D) {
            return 37;
        } else if ((double) this.field3836 == 2.0D) {
            return 50;
        } else if ((double) this.field3836 == 3.0D) {
            return 75;
        } else if ((double) this.field3836 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kn.ap(I)V")
    public void method5064() {
        this.field3830.method4886();
    }

    @ObfuscatedName("kn.ar(B)Z")
    public boolean method4958() {
        return this.field3830.method4887();
    }

    @ObfuscatedName("kn.am(IB)Laq;")
    public class33 method5001(int arg0) {
        Iterator var2 = this.field3825.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method258() != arg0);
        return var3;
    }

    @ObfuscatedName("kn.ab(III)V")
    public void method4966(int arg0, int arg1) {
        if (this.field3835 != null && this.field3835.method254(arg0, arg1)) {
            this.field3833 = arg0 - this.field3835.method307() * 64;
            this.field3819 = arg1 - this.field3835.method263() * 64;
        }
    }

    @ObfuscatedName("kn.af(III)V")
    public void method4924(int arg0, int arg1) {
        if (this.field3835 != null) {
            this.field3831 = arg0 - this.field3835.method307() * 64;
            this.field3832 = arg1 - this.field3835.method263() * 64;
            this.field3833 = -1;
            this.field3819 = -1;
        }
    }

    @ObfuscatedName("kn.aa(IIIB)V")
    public void method4925(int arg0, int arg1, int arg2) {
        if (this.field3835 != null) {
            int[] var4 = this.field3835.method250(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4966(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kn.aq(IIIB)V")
    public void method4926(int arg0, int arg1, int arg2) {
        if (this.field3835 != null) {
            int[] var4 = this.field3835.method250(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4924(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kn.aj(I)I")
    public int method4927() {
        return this.field3835 == null ? -1 : this.field3831 + this.field3835.method307() * 64;
    }

    @ObfuscatedName("kn.as(S)I")
    public int method4928() {
        return this.field3835 == null ? -1 : this.field3832 + this.field3835.method263() * 64;
    }

    @ObfuscatedName("kn.av(B)Lhp;")
    public class216 method4929() {
        return this.field3835 == null ? null : this.field3835.method256(this.method4927(), this.method4928());
    }

    @ObfuscatedName("kn.ao(I)I")
    public int method4906() {
        return this.field3815;
    }

    @ObfuscatedName("kn.ag(I)I")
    public int method4931() {
        return this.field3838;
    }

    @ObfuscatedName("kn.ay(II)V")
    public void method4932(int arg0) {
        if (arg0 >= 1) {
            this.field3852 = arg0;
        }
    }

    @ObfuscatedName("kn.ax(S)V")
    public void method4933() {
        this.field3852 = 3;
    }

    @ObfuscatedName("kn.ad(II)V")
    public void method4934(int arg0) {
        if (arg0 >= 1) {
            this.field3840 = arg0;
        }
    }

    @ObfuscatedName("kn.ae(I)V")
    public void method4935() {
        this.field3840 = 50;
    }

    @ObfuscatedName("kn.ac(ZI)V")
    public void method4936(boolean arg0) {
        this.field3848 = arg0;
    }

    @ObfuscatedName("kn.az(II)V")
    public void method4982(int arg0) {
        this.field3842 = new HashSet();
        this.field3842.add(arg0);
        this.field3843 = 0;
        this.field3844 = 0;
    }

    @ObfuscatedName("kn.ah(IS)V")
    public void method4938(int arg0) {
        this.field3842 = new HashSet();
        this.field3843 = 0;
        this.field3844 = 0;
        for (int var2 = 0; var2 < Statics.field3305.length; var2++) {
            if (Statics.field3305[var2] != null && Statics.field3305[var2].field3325 == arg0) {
                this.field3842.add(Statics.field3305[var2].field3319);
            }
        }
    }

    @ObfuscatedName("kn.at(I)V")
    public void method4939() {
        this.field3842 = null;
    }

    @ObfuscatedName("kn.al(ZI)V")
    public void method4940(boolean arg0) {
        this.field3851 = !arg0;
    }

    @ObfuscatedName("kn.au(IZB)V")
    public void method5043(int arg0, boolean arg1) {
        if (arg1) {
            this.field3847.remove(arg0);
        } else {
            this.field3847.add(arg0);
        }
        this.method4921();
    }

    @ObfuscatedName("kn.ak(IZI)V")
    public void method4942(int arg0, boolean arg1) {
        if (arg1) {
            this.field3846.remove(arg0);
        } else {
            this.field3846.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3305.length; var3++) {
            if (Statics.field3305[var3] != null && Statics.field3305[var3].field3325 == arg0) {
                int var4 = Statics.field3305[var3].field3319;
                if (arg1) {
                    this.field3849.remove(var4);
                } else {
                    this.field3849.add(var4);
                }
            }
        }
        this.method4921();
    }

    @ObfuscatedName("kn.aw(B)Z")
    public boolean method5000() {
        return !this.field3851;
    }

    @ObfuscatedName("kn.an(IB)Z")
    public boolean method4944(int arg0) {
        return !this.field3847.contains(arg0);
    }

    @ObfuscatedName("kn.ai(II)Z")
    public boolean method4965(int arg0) {
        return !this.field3846.contains(arg0);
    }

    @ObfuscatedName("kn.bk(I)V")
    public void method4921() {
        this.field3850.clear();
        this.field3850.addAll(this.field3847);
        this.field3850.addAll(this.field3849);
    }

    @ObfuscatedName("kn.bh(IIIIIIB)V")
    public void method5026(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3830.method4887()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3816));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3816));
        List var9 = this.field3837.method505(this.field3831 - var7 / 2 - 1, this.field3832 - var8 / 2 - 1, var7 / 2 + this.field3831 + 1, var8 / 2 + this.field3832 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class246 var12 = Statics.field3305[var11.field534];
            var13 = false;
            for (int var14 = this.field3853.length - 1; var14 >= 0; var14--) {
                if (var12.field3314[var14] != null) {
                    client.method51(var12.field3314[var14], var12.field3315, this.field3853[var14], var11.field534, var11.field525.method3682(), var11.field524.method3682());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kn.bv(ILhp;I)Lhp;")
    public class216 method4948(int arg0, class216 arg1) {
        if (!this.field3830.method4887()) {
            return null;
        } else if (!this.field3837.method507()) {
            return null;
        } else if (this.field3835.method254(arg1.field2626, arg1.field2632)) {
            HashMap var3 = this.field3837.method508();
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
                        return var5.field524;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field524.field2626 - arg1.field2626;
                    int var10 = var8.field524.field2632 - arg1.field2632;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field524;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kn.bf(IILhp;Lhp;B)V")
    public void method4949(int arg0, int arg1, class216 arg2, class216 arg3) {
        class70 var5 = new class70();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method977(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method978(class223.field2811);
                break;
            case 1009:
                var5.method978(class223.field2813);
                break;
            case 1010:
                var5.method978(class223.field2808);
                break;
            case 1011:
                var5.method978(class223.field2809);
                break;
            case 1012:
                var5.method978(class223.field2807);
        }
        class84.method152(var5);
    }

    @ObfuscatedName("kn.bl(I)Lax;")
    public class40 method4950() {
        if (!this.field3830.method4887()) {
            return null;
        } else if (this.field3837.method507()) {
            HashMap var1 = this.field3837.method508();
            this.field3854 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3854.addAll(var3);
            }
            this.field3855 = this.field3854.iterator();
            return this.method4951();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kn.bp(B)Lax;")
    public class40 method4951() {
        if (this.field3855 == null) {
            return null;
        } else if (this.field3855.hasNext()) {
            return (class40) this.field3855.next();
        } else {
            return null;
        }
    }
}
