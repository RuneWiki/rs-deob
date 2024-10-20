package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ke")
public class class289 {

    @ObfuscatedName("ke.l")
    public class236 field3811;

    @ObfuscatedName("ke.s")
    public static final class262 field3812 = class262.field3625;

    @ObfuscatedName("ke.w")
    public static final class262 field3813 = class262.field3626;

    @ObfuscatedName("ke.p")
    public static final class262 field3814 = class262.field3627;

    @ObfuscatedName("ke.m")
    public class264 field3808;

    @ObfuscatedName("ke.u")
    public HashMap field3816;

    @ObfuscatedName("ke.g")
    public class285[] field3817;

    @ObfuscatedName("ke.k")
    public HashMap field3818;

    @ObfuscatedName("ke.t")
    public class33 field3819;

    @ObfuscatedName("ke.c")
    public class33 field3820;

    @ObfuscatedName("ke.o")
    public class33 field3821;

    @ObfuscatedName("ke.x")
    public class42 field3839;

    @ObfuscatedName("ke.f")
    public class288 field3807;

    @ObfuscatedName("ke.h")
    public int field3815;

    @ObfuscatedName("ke.z")
    public int field3825;

    @ObfuscatedName("ke.i")
    public int field3826 = -1;

    @ObfuscatedName("ke.d")
    public int field3827 = -1;

    @ObfuscatedName("ke.b")
    public float field3828;

    @ObfuscatedName("ke.q")
    public float field3831;

    @ObfuscatedName("ke.y")
    public int field3830 = -1;

    @ObfuscatedName("ke.ai")
    public int field3824 = -1;

    @ObfuscatedName("ke.ae")
    public int field3832 = 3;

    @ObfuscatedName("ke.au")
    public int field3833 = 50;

    @ObfuscatedName("ke.ak")
    public boolean field3836 = false;

    @ObfuscatedName("ke.ap")
    public HashSet field3835 = null;

    @ObfuscatedName("ke.ar")
    public int field3848 = -1;

    @ObfuscatedName("ke.am")
    public int field3834 = -1;

    @ObfuscatedName("ke.aw")
    public int field3838 = -1;

    @ObfuscatedName("ke.aq")
    public int field3849 = -1;

    @ObfuscatedName("ke.aa")
    public HashSet field3840 = new HashSet();

    @ObfuscatedName("ke.ag")
    public HashSet field3837 = new HashSet();

    @ObfuscatedName("ke.aj")
    public HashSet field3822 = new HashSet();

    @ObfuscatedName("ke.ax")
    public HashSet field3843 = new HashSet();

    @ObfuscatedName("ke.ad")
    public boolean field3823 = false;

    @ObfuscatedName("ke.az")
    public int field3845 = 0;

    @ObfuscatedName("ke.av")
    public final int[] field3846 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ke.ab")
    public List field3847;

    @ObfuscatedName("ke.at")
    public Iterator field3841;

    @ObfuscatedName("ke.al")
    public HashSet field3842 = new HashSet();

    @ObfuscatedName("ke.a(Lif;Ljc;Ljava/util/HashMap;[Ljf;B)V")
    public void method4811(class236 arg0, class264 arg1, HashMap arg2, class285[] arg3) {
        this.field3817 = arg3;
        this.field3811 = arg0;
        this.field3808 = arg1;
        this.field3816 = new HashMap();
        this.field3816.put(class25.field356, arg2.get(field3812));
        this.field3816.put(class25.field359, arg2.get(field3813));
        this.field3816.put(class25.field355, arg2.get(field3814));
        this.field3807 = new class288(arg0);
        int var5 = this.field3811.method3777(class41.field536.field533);
        int[] var6 = this.field3811.method3772(var5);
        this.field3818 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class174 var8 = new class174(this.field3811.method3787(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method242(var8, var6[var7]);
            this.field3818.put(var9.method251(), var9);
            if (var9.method250()) {
                this.field3819 = var9;
            }
        }
        this.method4770(this.field3819);
        this.field3821 = null;
    }

    @ObfuscatedName("ke.j(I)I")
    public int method4759() {
        return this.field3811.method3781(this.field3819.method251(), class41.field534.field533) ? 100 : this.field3811.method3792(this.field3819.method251());
    }

    @ObfuscatedName("ke.n(IIZIIIIB)V")
    public void method4835(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3807.method4754()) {
            return;
        }
        this.method4890();
        this.method4898();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3828));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3828));
        List var10 = this.field3839.method500(this.field3815 - var8 / 2 - 1, this.field3825 - var9 / 2 - 1, var8 / 2 + this.field3815 + 1, var9 / 2 + this.field3825 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class70 var14 = new class70();
            class48 var15 = new class48(var13.field524, var13.field523, var13.field517);
            var14.method975(new Object[] { var15, arg0, arg1 });
            if (this.field3842.contains(var13)) {
                var14.method981(class220.field2806);
            } else {
                var14.method981(class220.field2797);
            }
            class84.method1537(var14);
        }
        Iterator var16 = this.field3842.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class70 var18 = new class70();
                class48 var19 = new class48(var17.field524, var17.field523, var17.field517);
                var18.method975(new Object[] { var19, arg0, arg1 });
                var18.method981(class220.field2798);
                class84.method1537(var18);
            }
        }
        this.field3842 = var11;
    }

    @ObfuscatedName("ke.r(IIZI)V")
    public void method4922(int arg0, int arg1, boolean arg2) {
        if (this.field3838 == -1) {
            this.field3838 = arg0;
        }
        if (this.field3849 == -1) {
            this.field3849 = arg1;
        }
        int var4 = arg0 - this.field3838;
        int var5 = arg1 - this.field3849;
        this.field3838 = arg0;
        this.field3849 = arg1;
        if (arg2 && !this.method4764()) {
            this.field3815 -= (int) ((float) var4 / this.field3831);
            this.field3825 += (int) ((float) var5 / this.field3831);
        }
    }

    @ObfuscatedName("ke.v(B)V")
    public void method4890() {
        if (this.field3828 < this.field3831) {
            this.field3828 = Math.min(this.field3831, this.field3828 / 30.0F + this.field3828);
        }
        if (this.field3828 > this.field3831) {
            this.field3828 = Math.max(this.field3831, this.field3828 - this.field3828 / 30.0F);
        }
    }

    @ObfuscatedName("ke.e(I)V")
    public void method4898() {
        if (!this.method4764()) {
            return;
        }
        int var1 = this.field3826 - this.field3815;
        int var2 = this.field3827 - this.field3825;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3815 += var1;
        this.field3825 += var2;
        if (this.field3826 == this.field3815 && this.field3827 == this.field3825) {
            this.field3826 = -1;
            this.field3827 = -1;
        }
    }

    @ObfuscatedName("ke.l(I)Z")
    public boolean method4764() {
        return this.field3826 != -1 && this.field3827 != -1;
    }

    @ObfuscatedName("ke.s(IIIB)Lam;")
    public class33 method4765(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3818.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method244(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ke.w(IIIZB)V")
    public void method4766(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4765(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3819;
        }
        boolean var6 = false;
        if (this.field3821 != var5 || arg3) {
            this.field3821 = var5;
            this.method4770(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4773(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ke.p(IB)V")
    public void method4767(int arg0) {
        class33 var2 = this.method4758(arg0);
        if (var2 != null) {
            this.method4770(var2);
        }
    }

    @ObfuscatedName("ke.m(B)I")
    public int method4768() {
        return this.field3820 == null ? -1 : this.field3820.method260();
    }

    @ObfuscatedName("ke.u(I)Lam;")
    public class33 method4901() {
        return this.field3820;
    }

    @ObfuscatedName("ke.g(Lam;I)V")
    public void method4770(class33 arg0) {
        if (this.field3820 == null || this.field3820 != arg0) {
            this.method4771(arg0);
            this.method4773(-1, -1, -1);
        }
    }

    @ObfuscatedName("ke.k(Lam;I)V")
    public void method4771(class33 arg0) {
        this.field3820 = arg0;
        this.field3839 = new class42(this.field3817, this.field3816);
        this.field3807.method4752(this.field3820.method251());
    }

    @ObfuscatedName("ke.c(Lam;Lhd;Lhd;ZI)V")
    public void method4878(class33 arg0, class213 arg1, class213 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3820 == null || this.field3820 != arg0) {
            this.method4771(arg0);
        }
        if (!arg3 && this.field3820.method244(arg1.field2616, arg1.field2615, arg1.field2618)) {
            this.method4773(arg1.field2616, arg1.field2615, arg1.field2618);
        } else {
            this.method4773(arg2.field2616, arg2.field2615, arg2.field2618);
        }
    }

    @ObfuscatedName("ke.o(IIIB)V")
    public void method4773(int arg0, int arg1, int arg2) {
        if (this.field3820 == null) {
            return;
        }
        int[] var4 = this.field3820.method295(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3820.method295(this.field3820.method306(), this.field3820.method259(), this.field3820.method261());
        }
        this.field3815 = var4[0] - this.field3820.method255() * 64;
        this.field3825 = var4[1] - this.field3820.method256() * 64;
        this.field3826 = -1;
        this.field3827 = -1;
        this.field3828 = this.method4763(this.field3820.method246());
        this.field3831 = this.field3828;
        this.field3847 = null;
        this.field3841 = null;
        this.field3839.method507();
    }

    @ObfuscatedName("ke.x(IIIIII)V")
    public void method4774(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class282.method4509(var6);
        class282.method4507(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class282.method4582(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3807.method4748();
        if (var7 < 100) {
            this.method4777(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3839.method499()) {
            this.field3839.method502(this.field3811, this.field3820.method251(), client.field1039);
            if (!this.field3839.method499()) {
                return;
            }
        }
        if (this.field3835 != null) {
            this.field3834++;
            if (this.field3834 % this.field3833 == 0) {
                this.field3834 = 0;
                this.field3848++;
            }
            if (this.field3848 >= this.field3832 && !this.field3836) {
                this.field3835 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3828));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3828));
        this.field3839.method493(this.field3815 - var8 / 2, this.field3825 - var9 / 2, var8 / 2 + this.field3815, var9 / 2 + this.field3825, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3823) {
            boolean var10 = false;
            if (arg4 - this.field3845 > 100) {
                this.field3845 = arg4;
                var10 = true;
            }
            this.field3839.method518(this.field3815 - var8 / 2, this.field3825 - var9 / 2, var8 / 2 + this.field3815, var9 / 2 + this.field3825, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3843, this.field3835, this.field3834, this.field3833, var10);
        }
        this.field3830 = var8;
        this.field3824 = var9;
        class282.method4510(var6);
    }

    @ObfuscatedName("ke.h(IIIIB)V")
    public void method4775(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3807.method4754()) {
            return;
        }
        if (!this.field3839.method499()) {
            this.field3839.method502(this.field3811, this.field3820.method251(), client.field1039);
            if (!this.field3839.method499()) {
                return;
            }
        }
        this.field3839.method528(arg0, arg1, arg2, arg3, this.field3835, this.field3834, this.field3833);
    }

    @ObfuscatedName("ke.z(IB)V")
    public void method4776(int arg0) {
        this.field3831 = this.method4763(arg0);
    }

    @ObfuscatedName("ke.i(IIIIII)V")
    public void method4777(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class282.method4582(arg0, arg1, arg2, arg3, -16777216);
        class282.method4563(var7 - 152, var8, 304, 34, -65536);
        class282.method4582(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3808.method4396(class226.field2977, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ke.d(IB)F")
    public float method4763(int arg0) {
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

    @ObfuscatedName("ke.ai(B)I")
    public int method4779() {
        if ((double) this.field3831 == 1.0D) {
            return 25;
        } else if ((double) this.field3831 == 1.5D) {
            return 37;
        } else if ((double) this.field3831 == 2.0D) {
            return 50;
        } else if ((double) this.field3831 == 3.0D) {
            return 75;
        } else if ((double) this.field3831 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ke.ae(B)V")
    public void method4817() {
        this.field3807.method4747();
    }

    @ObfuscatedName("ke.au(I)Z")
    public boolean method4806() {
        return this.field3807.method4754();
    }

    @ObfuscatedName("ke.ak(II)Lam;")
    public class33 method4758(int arg0) {
        Iterator var2 = this.field3818.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method260() != arg0);
        return var3;
    }

    @ObfuscatedName("ke.ap(III)V")
    public void method4833(int arg0, int arg1) {
        if (this.field3820 != null && this.field3820.method245(arg0, arg1)) {
            this.field3826 = arg0 - this.field3820.method255() * 64;
            this.field3827 = arg1 - this.field3820.method256() * 64;
        }
    }

    @ObfuscatedName("ke.ar(III)V")
    public void method4875(int arg0, int arg1) {
        if (this.field3820 != null) {
            this.field3815 = arg0 - this.field3820.method255() * 64;
            this.field3825 = arg1 - this.field3820.method256() * 64;
            this.field3826 = -1;
            this.field3827 = -1;
        }
    }

    @ObfuscatedName("ke.am(IIIB)V")
    public void method4785(int arg0, int arg1, int arg2) {
        if (this.field3820 != null) {
            int[] var4 = this.field3820.method295(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4833(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ke.aw(IIII)V")
    public void method4786(int arg0, int arg1, int arg2) {
        if (this.field3820 != null) {
            int[] var4 = this.field3820.method295(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4875(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ke.aq(B)I")
    public int method4787() {
        return this.field3820 == null ? -1 : this.field3815 + this.field3820.method255() * 64;
    }

    @ObfuscatedName("ke.aa(I)I")
    public int method4788() {
        return this.field3820 == null ? -1 : this.field3825 + this.field3820.method256() * 64;
    }

    @ObfuscatedName("ke.ag(I)Lhd;")
    public class213 method4789() {
        return this.field3820 == null ? null : this.field3820.method247(this.method4787(), this.method4788());
    }

    @ObfuscatedName("ke.aj(I)I")
    public int method4832() {
        return this.field3830;
    }

    @ObfuscatedName("ke.ax(I)I")
    public int method4791() {
        return this.field3824;
    }

    @ObfuscatedName("ke.ad(II)V")
    public void method4792(int arg0) {
        if (arg0 >= 1) {
            this.field3832 = arg0;
        }
    }

    @ObfuscatedName("ke.az(B)V")
    public void method4828() {
        this.field3832 = 3;
    }

    @ObfuscatedName("ke.as(II)V")
    public void method4757(int arg0) {
        if (arg0 >= 1) {
            this.field3833 = arg0;
        }
    }

    @ObfuscatedName("ke.av(B)V")
    public void method4894() {
        this.field3833 = 50;
    }

    @ObfuscatedName("ke.ab(ZI)V")
    public void method4796(boolean arg0) {
        this.field3836 = arg0;
    }

    @ObfuscatedName("ke.at(IB)V")
    public void method4857(int arg0) {
        this.field3835 = new HashSet();
        this.field3835.add(arg0);
        this.field3848 = 0;
        this.field3834 = 0;
    }

    @ObfuscatedName("ke.al(IB)V")
    public void method4907(int arg0) {
        this.field3835 = new HashSet();
        this.field3848 = 0;
        this.field3834 = 0;
        for (int var2 = 0; var2 < Statics.field663.length; var2++) {
            if (Statics.field663[var2] != null && Statics.field663[var2].field3308 == arg0) {
                this.field3835.add(Statics.field663[var2].field3291);
            }
        }
    }

    @ObfuscatedName("ke.ah(I)V")
    public void method4799() {
        this.field3835 = null;
    }

    @ObfuscatedName("ke.an(ZB)V")
    public void method4794(boolean arg0) {
        this.field3823 = !arg0;
    }

    @ObfuscatedName("ke.ay(IZI)V")
    public void method4800(int arg0, boolean arg1) {
        if (arg1) {
            this.field3840.remove(arg0);
        } else {
            this.field3840.add(arg0);
        }
        this.method4805();
    }

    @ObfuscatedName("ke.ao(IZI)V")
    public void method4801(int arg0, boolean arg1) {
        if (arg1) {
            this.field3837.remove(arg0);
        } else {
            this.field3837.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field663.length; var3++) {
            if (Statics.field663[var3] != null && Statics.field663[var3].field3308 == arg0) {
                int var4 = Statics.field663[var3].field3291;
                if (arg1) {
                    this.field3822.remove(var4);
                } else {
                    this.field3822.add(var4);
                }
            }
        }
        this.method4805();
    }

    @ObfuscatedName("ke.ac(I)Z")
    public boolean method4802() {
        return !this.field3823;
    }

    @ObfuscatedName("ke.af(IB)Z")
    public boolean method4859(int arg0) {
        return !this.field3840.contains(arg0);
    }

    @ObfuscatedName("ke.bp(II)Z")
    public boolean method4804(int arg0) {
        return !this.field3837.contains(arg0);
    }

    @ObfuscatedName("ke.bi(I)V")
    public void method4805() {
        this.field3843.clear();
        this.field3843.addAll(this.field3840);
        this.field3843.addAll(this.field3822);
    }

    @ObfuscatedName("ke.ba(IIIIIII)V")
    public void method4899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3807.method4754()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3828));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3828));
        List var9 = this.field3839.method500(this.field3815 - var7 / 2 - 1, this.field3825 - var8 / 2 - 1, var7 / 2 + this.field3815 + 1, var8 / 2 + this.field3825 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class243 var12 = Statics.field663[var11.field524];
            var13 = false;
            for (int var14 = this.field3846.length - 1; var14 >= 0; var14--) {
                if (var12.field3297[var14] != null) {
                    client.method463(var12.field3297[var14], var12.field3296, this.field3846[var14], var11.field524, var11.field523.method3605(), var11.field517.method3605());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ke.bd(ILhd;B)Lhd;")
    public class213 method4807(int arg0, class213 arg1) {
        if (!this.field3807.method4754()) {
            return null;
        } else if (!this.field3839.method499()) {
            return null;
        } else if (this.field3820.method245(arg1.field2615, arg1.field2618)) {
            HashMap var3 = this.field3839.method516();
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
                        return var5.field517;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field517.field2615 - arg1.field2615;
                    int var10 = var8.field517.field2618 - arg1.field2618;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field517;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ke.bl(IILhd;Lhd;I)V")
    public void method4908(int arg0, int arg1, class213 arg2, class213 arg3) {
        class70 var5 = new class70();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method975(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method981(class220.field2799);
                break;
            case 1009:
                var5.method981(class220.field2803);
                break;
            case 1010:
                var5.method981(class220.field2794);
                break;
            case 1011:
                var5.method981(class220.field2795);
                break;
            case 1012:
                var5.method981(class220.field2796);
        }
        class84.method1537(var5);
    }

    @ObfuscatedName("ke.bc(B)Lad;")
    public class40 method4852() {
        if (!this.field3807.method4754()) {
            return null;
        } else if (this.field3839.method499()) {
            HashMap var1 = this.field3839.method516();
            this.field3847 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3847.addAll(var3);
            }
            this.field3841 = this.field3847.iterator();
            return this.method4921();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ke.bb(I)Lad;")
    public class40 method4921() {
        if (this.field3841 == null) {
            return null;
        } else if (this.field3841.hasNext()) {
            return (class40) this.field3841.next();
        } else {
            return null;
        }
    }
}
