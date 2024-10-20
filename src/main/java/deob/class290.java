package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kv")
public class class290 {

    @ObfuscatedName("kv.v")
    public class237 field3802;

    @ObfuscatedName("kv.z")
    public static final class263 field3809 = class263.field3616;

    @ObfuscatedName("kv.r")
    public static final class263 field3819 = class263.field3622;

    @ObfuscatedName("kv.u")
    public static final class263 field3813 = class263.field3617;

    @ObfuscatedName("kv.d")
    public class265 field3792;

    @ObfuscatedName("kv.o")
    public HashMap field3811;

    @ObfuscatedName("kv.l")
    public class286[] field3803;

    @ObfuscatedName("kv.h")
    public HashMap field3804;

    @ObfuscatedName("kv.s")
    public class33 field3805;

    @ObfuscatedName("kv.c")
    public class33 field3828;

    @ObfuscatedName("kv.m")
    public class33 field3807;

    @ObfuscatedName("kv.a")
    public class42 field3808;

    @ObfuscatedName("kv.t")
    public class289 field3797;

    @ObfuscatedName("kv.p")
    public int field3831;

    @ObfuscatedName("kv.f")
    public int field3825;

    @ObfuscatedName("kv.b")
    public int field3835 = -1;

    @ObfuscatedName("kv.x")
    public int field3817 = -1;

    @ObfuscatedName("kv.i")
    public float field3814;

    @ObfuscatedName("kv.j")
    public float field3815;

    @ObfuscatedName("kv.q")
    public int field3816 = -1;

    @ObfuscatedName("kv.ag")
    public int field3830 = -1;

    @ObfuscatedName("kv.ay")
    public int field3818 = 3;

    @ObfuscatedName("kv.au")
    public int field3806 = 50;

    @ObfuscatedName("kv.ah")
    public boolean field3820 = false;

    @ObfuscatedName("kv.ao")
    public HashSet field3821 = null;

    @ObfuscatedName("kv.al")
    public int field3822 = -1;

    @ObfuscatedName("kv.ae")
    public int field3823 = -1;

    @ObfuscatedName("kv.ax")
    public int field3824 = -1;

    @ObfuscatedName("kv.az")
    public int field3826 = -1;

    @ObfuscatedName("kv.aw")
    public HashSet field3801 = new HashSet();

    @ObfuscatedName("kv.av")
    public HashSet field3827 = new HashSet();

    @ObfuscatedName("kv.ac")
    public HashSet field3800 = new HashSet();

    @ObfuscatedName("kv.ak")
    public HashSet field3829 = new HashSet();

    @ObfuscatedName("kv.ad")
    public boolean field3812 = false;

    @ObfuscatedName("kv.at")
    public int field3799 = 0;

    @ObfuscatedName("kv.am")
    public final int[] field3832 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kv.aq")
    public List field3833;

    @ObfuscatedName("kv.as")
    public Iterator field3834;

    @ObfuscatedName("kv.ab")
    public HashSet field3796 = new HashSet();

    @ObfuscatedName("kv.e(Lit;Ljk;Ljava/util/HashMap;[Ljp;I)V")
    public void method4891(class237 arg0, class265 arg1, HashMap arg2, class286[] arg3) {
        this.field3803 = arg3;
        this.field3802 = arg0;
        this.field3792 = arg1;
        this.field3811 = new HashMap();
        this.field3811.put(class25.field359, arg2.get(field3809));
        this.field3811.put(class25.field362, arg2.get(field3819));
        this.field3811.put(class25.field360, arg2.get(field3813));
        this.field3797 = new class289(arg0);
        int var5 = this.field3802.method3829(class41.field543.field541);
        int[] var6 = this.field3802.method3827(var5);
        this.field3804 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class175 var8 = new class175(this.field3802.method3817(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method286(var8, var6[var7]);
            this.field3804.put(var9.method320(), var9);
            if (var9.method262()) {
                this.field3805 = var9;
            }
        }
        this.method5059(this.field3805);
        this.field3807 = null;
    }

    @ObfuscatedName("kv.n(I)I")
    public int method4892() {
        return this.field3802.method3837(this.field3805.method320(), class41.field539.field541) ? 100 : this.field3802.method3840(this.field3805.method320());
    }

    @ObfuscatedName("kv.g(IIZIIIII)V")
    public void method4893(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3797.method4878()) {
            return;
        }
        this.method4895();
        this.method5065();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3814));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3814));
        List var10 = this.field3808.method497(this.field3831 - var8 / 2 - 1, this.field3825 - var9 / 2 - 1, var8 / 2 + this.field3831 + 1, var9 / 2 + this.field3825 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class71 var14 = new class71();
            class48 var15 = new class48(var13.field535, var13.field529, var13.field531);
            var14.method1020(new Object[] { var15, arg0, arg1 });
            if (this.field3796.contains(var13)) {
                var14.method1014(class221.field2769);
            } else {
                var14.method1014(class221.field2763);
            }
            class85.method1409(var14);
        }
        Iterator var16 = this.field3796.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class71 var18 = new class71();
                class48 var19 = new class48(var17.field535, var17.field529, var17.field531);
                var18.method1020(new Object[] { var19, arg0, arg1 });
                var18.method1014(class221.field2768);
                class85.method1409(var18);
            }
        }
        this.field3796 = var11;
    }

    @ObfuscatedName("kv.y(IIZI)V")
    public void method4894(int arg0, int arg1, boolean arg2) {
        if (this.field3824 == -1) {
            this.field3824 = arg0;
        }
        if (this.field3826 == -1) {
            this.field3826 = arg1;
        }
        int var4 = arg0 - this.field3824;
        int var5 = arg1 - this.field3826;
        this.field3824 = arg0;
        this.field3826 = arg1;
        if (arg2 && !this.method4976()) {
            this.field3831 -= (int) ((float) var4 / this.field3815);
            this.field3825 += (int) ((float) var5 / this.field3815);
        }
    }

    @ObfuscatedName("kv.w(I)V")
    public void method4895() {
        if (this.field3814 < this.field3815) {
            this.field3814 = Math.min(this.field3815, this.field3814 / 30.0F + this.field3814);
        }
        if (this.field3814 > this.field3815) {
            this.field3814 = Math.max(this.field3815, this.field3814 - this.field3814 / 30.0F);
        }
    }

    @ObfuscatedName("kv.k(I)V")
    public void method5065() {
        if (!this.method4976()) {
            return;
        }
        int var1 = this.field3835 - this.field3831;
        int var2 = this.field3817 - this.field3825;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3831 += var1;
        this.field3825 += var2;
        if (this.field3835 == this.field3831 && this.field3825 == this.field3817) {
            this.field3835 = -1;
            this.field3817 = -1;
        }
    }

    @ObfuscatedName("kv.v(I)Z")
    public boolean method4976() {
        return this.field3835 != -1 && this.field3817 != -1;
    }

    @ObfuscatedName("kv.z(IIII)Lae;")
    public class33 method4898(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3804.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method256(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kv.r(IIIZI)V")
    public void method4954(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4898(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3805;
        }
        boolean var6 = false;
        if (this.field3807 != var5 || arg3) {
            this.field3807 = var5;
            this.method5059(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4974(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kv.u(II)V")
    public void method4900(int arg0) {
        class33 var2 = this.method4915(arg0);
        if (var2 != null) {
            this.method5059(var2);
        }
    }

    @ObfuscatedName("kv.d(I)I")
    public int method4899() {
        return this.field3828 == null ? -1 : this.field3828.method318();
    }

    @ObfuscatedName("kv.o(I)Lae;")
    public class33 method4902() {
        return this.field3828;
    }

    @ObfuscatedName("kv.s(Lae;B)V")
    public void method5059(class33 arg0) {
        if (this.field3828 == null || this.field3828 != arg0) {
            this.method4904(arg0);
            this.method4974(-1, -1, -1);
        }
    }

    @ObfuscatedName("kv.c(Lae;I)V")
    public void method4904(class33 arg0) {
        this.field3828 = arg0;
        this.field3808 = new class42(this.field3803, this.field3811);
        this.field3797.method4876(this.field3828.method320());
    }

    @ObfuscatedName("kv.m(Lae;Lhq;Lhq;ZI)V")
    public void method4905(class33 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3828 == null || this.field3828 != arg0) {
            this.method4904(arg0);
        }
        if (!arg3 && this.field3828.method256(arg1.field2589, arg1.field2588, arg1.field2591)) {
            this.method4974(arg1.field2589, arg1.field2588, arg1.field2591);
        } else {
            this.method4974(arg2.field2589, arg2.field2588, arg2.field2591);
        }
    }

    @ObfuscatedName("kv.a(IIII)V")
    public void method4974(int arg0, int arg1, int arg2) {
        if (this.field3828 == null) {
            return;
        }
        int[] var4 = this.field3828.method258(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3828.method258(this.field3828.method272(), this.field3828.method271(), this.field3828.method316());
        }
        this.field3831 = var4[0] - this.field3828.method267() * 64;
        this.field3825 = var4[1] - this.field3828.method269() * 64;
        this.field3835 = -1;
        this.field3817 = -1;
        this.field3814 = this.method5079(this.field3828.method266());
        this.field3815 = this.field3814;
        this.field3833 = null;
        this.field3834 = null;
        this.field3808.method511();
    }

    @ObfuscatedName("kv.t(IIIIIS)V")
    public void method4901(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class283.method4643(var6);
        class283.method4641(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class283.method4649(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3797.method4879();
        if (var7 < 100) {
            this.method4910(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3808.method499()) {
            this.field3808.method505(this.field3802, this.field3828.method320(), client.field920);
            if (!this.field3808.method499()) {
                return;
            }
        }
        if (this.field3821 != null) {
            this.field3823++;
            if (this.field3823 % this.field3806 == 0) {
                this.field3823 = 0;
                this.field3822++;
            }
            if (this.field3822 >= this.field3818 && !this.field3820) {
                this.field3821 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3814));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3814));
        this.field3808.method521(this.field3831 - var8 / 2, this.field3825 - var9 / 2, var8 / 2 + this.field3831, var9 / 2 + this.field3825, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3812) {
            boolean var10 = false;
            if (arg4 - this.field3799 > 100) {
                this.field3799 = arg4;
                var10 = true;
            }
            this.field3808.method494(this.field3831 - var8 / 2, this.field3825 - var9 / 2, var8 / 2 + this.field3831, var9 / 2 + this.field3825, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3829, this.field3821, this.field3823, this.field3806, var10);
        }
        this.field3816 = var8;
        this.field3830 = var9;
        class283.method4718(var6);
    }

    @ObfuscatedName("kv.p(IIIIB)V")
    public void method4908(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3797.method4878()) {
            return;
        }
        if (!this.field3808.method499()) {
            this.field3808.method505(this.field3802, this.field3828.method320(), client.field920);
            if (!this.field3808.method499()) {
                return;
            }
        }
        this.field3808.method496(arg0, arg1, arg2, arg3, this.field3821, this.field3823, this.field3806);
    }

    @ObfuscatedName("kv.f(II)V")
    public void method4909(int arg0) {
        this.field3815 = this.method5079(arg0);
    }

    @ObfuscatedName("kv.x(IIIIII)V")
    public void method4910(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class283.method4649(arg0, arg1, arg2, arg3, -16777216);
        class283.method4656(var7 - 152, var8, 304, 34, -65536);
        class283.method4649(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3792.method4462(class227.field3106, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kv.q(II)F")
    public float method5079(int arg0) {
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

    @ObfuscatedName("kv.ag(I)I")
    public int method5063() {
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

    @ObfuscatedName("kv.ay(I)V")
    public void method4913() {
        this.field3797.method4888();
    }

    @ObfuscatedName("kv.au(S)Z")
    public boolean method4952() {
        return this.field3797.method4878();
    }

    @ObfuscatedName("kv.ah(II)Lae;")
    public class33 method4915(int arg0) {
        Iterator var2 = this.field3804.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method318() != arg0);
        return var3;
    }

    @ObfuscatedName("kv.ao(III)V")
    public void method4922(int arg0, int arg1) {
        if (this.field3828 != null && this.field3828.method253(arg0, arg1)) {
            this.field3835 = arg0 - this.field3828.method267() * 64;
            this.field3817 = arg1 - this.field3828.method269() * 64;
        }
    }

    @ObfuscatedName("kv.al(III)V")
    public void method4917(int arg0, int arg1) {
        if (this.field3828 != null) {
            this.field3831 = arg0 - this.field3828.method267() * 64;
            this.field3825 = arg1 - this.field3828.method269() * 64;
            this.field3835 = -1;
            this.field3817 = -1;
        }
    }

    @ObfuscatedName("kv.ae(IIII)V")
    public void method4940(int arg0, int arg1, int arg2) {
        if (this.field3828 != null) {
            int[] var4 = this.field3828.method258(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4922(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kv.ax(IIII)V")
    public void method4919(int arg0, int arg1, int arg2) {
        if (this.field3828 != null) {
            int[] var4 = this.field3828.method258(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4917(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kv.az(B)I")
    public int method5014() {
        return this.field3828 == null ? -1 : this.field3831 + this.field3828.method267() * 64;
    }

    @ObfuscatedName("kv.aw(B)I")
    public int method4963() {
        return this.field3828 == null ? -1 : this.field3825 + this.field3828.method269() * 64;
    }

    @ObfuscatedName("kv.av(I)Lhq;")
    public class214 method4920() {
        return this.field3828 == null ? null : this.field3828.method259(this.method5014(), this.method4963());
    }

    @ObfuscatedName("kv.ac(I)I")
    public int method4923() {
        return this.field3816;
    }

    @ObfuscatedName("kv.ak(B)I")
    public int method4924() {
        return this.field3830;
    }

    @ObfuscatedName("kv.ad(II)V")
    public void method4925(int arg0) {
        if (arg0 >= 1) {
            this.field3818 = arg0;
        }
    }

    @ObfuscatedName("kv.at(I)V")
    public void method4926() {
        this.field3818 = 3;
    }

    @ObfuscatedName("kv.af(II)V")
    public void method4927(int arg0) {
        if (arg0 >= 1) {
            this.field3806 = arg0;
        }
    }

    @ObfuscatedName("kv.am(B)V")
    public void method4928() {
        this.field3806 = 50;
    }

    @ObfuscatedName("kv.aq(ZB)V")
    public void method4929(boolean arg0) {
        this.field3820 = arg0;
    }

    @ObfuscatedName("kv.as(II)V")
    public void method4930(int arg0) {
        this.field3821 = new HashSet();
        this.field3821.add(arg0);
        this.field3822 = 0;
        this.field3823 = 0;
    }

    @ObfuscatedName("kv.ab(II)V")
    public void method4931(int arg0) {
        this.field3821 = new HashSet();
        this.field3822 = 0;
        this.field3823 = 0;
        for (int var2 = 0; var2 < Statics.field3277.length; var2++) {
            if (Statics.field3277[var2] != null && Statics.field3277[var2].field3297 == arg0) {
                this.field3821.add(Statics.field3277[var2].field3298);
            }
        }
    }

    @ObfuscatedName("kv.ap(S)V")
    public void method4932() {
        this.field3821 = null;
    }

    @ObfuscatedName("kv.ai(ZI)V")
    public void method4933(boolean arg0) {
        this.field3812 = !arg0;
    }

    @ObfuscatedName("kv.an(IZI)V")
    public void method4890(int arg0, boolean arg1) {
        if (arg1) {
            this.field3801.remove(arg0);
        } else {
            this.field3801.add(arg0);
        }
        this.method4973();
    }

    @ObfuscatedName("kv.ar(IZI)V")
    public void method4935(int arg0, boolean arg1) {
        if (arg1) {
            this.field3827.remove(arg0);
        } else {
            this.field3827.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3277.length; var3++) {
            if (Statics.field3277[var3] != null && Statics.field3277[var3].field3297 == arg0) {
                int var4 = Statics.field3277[var3].field3298;
                if (arg1) {
                    this.field3800.remove(var4);
                } else {
                    this.field3800.add(var4);
                }
            }
        }
        this.method4973();
    }

    @ObfuscatedName("kv.aj(I)Z")
    public boolean method5044() {
        return !this.field3812;
    }

    @ObfuscatedName("kv.aa(II)Z")
    public boolean method4937(int arg0) {
        return !this.field3801.contains(arg0);
    }

    @ObfuscatedName("kv.bn(IB)Z")
    public boolean method5042(int arg0) {
        return !this.field3827.contains(arg0);
    }

    @ObfuscatedName("kv.bo(I)V")
    public void method4973() {
        this.field3829.clear();
        this.field3829.addAll(this.field3801);
        this.field3829.addAll(this.field3800);
    }

    @ObfuscatedName("kv.bq(IIIIIII)V")
    public void method4896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3797.method4878()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3814));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3814));
        List var9 = this.field3808.method497(this.field3831 - var7 / 2 - 1, this.field3825 - var8 / 2 - 1, var7 / 2 + this.field3831 + 1, var8 / 2 + this.field3825 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class244 var12 = Statics.field3277[var11.field535];
            var13 = false;
            for (int var14 = this.field3832.length - 1; var14 >= 0; var14--) {
                if (var12.field3286[var14] != null) {
                    client.method2862(var12.field3286[var14], var12.field3276, this.field3832[var14], var11.field535, var11.field529.method3653(), var11.field531.method3653());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kv.ba(ILhq;B)Lhq;")
    public class214 method4949(int arg0, class214 arg1) {
        if (!this.field3797.method4878()) {
            return null;
        } else if (!this.field3808.method499()) {
            return null;
        } else if (this.field3828.method253(arg1.field2588, arg1.field2591)) {
            HashMap var3 = this.field3808.method500();
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
                        return var5.field531;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field531.field2588 - arg1.field2588;
                    int var10 = var8.field531.field2591 - arg1.field2591;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field531;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kv.bg(IILhq;Lhq;B)V")
    public void method4942(int arg0, int arg1, class214 arg2, class214 arg3) {
        class71 var5 = new class71();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1020(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1014(class221.field2773);
                break;
            case 1009:
                var5.method1014(class221.field2764);
                break;
            case 1010:
                var5.method1014(class221.field2765);
                break;
            case 1011:
                var5.method1014(class221.field2766);
                break;
            case 1012:
                var5.method1014(class221.field2767);
        }
        class85.method1409(var5);
    }

    @ObfuscatedName("kv.bd(I)Lad;")
    public class40 method5037() {
        if (!this.field3797.method4878()) {
            return null;
        } else if (this.field3808.method499()) {
            HashMap var1 = this.field3808.method500();
            this.field3833 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3833.addAll(var3);
            }
            this.field3834 = this.field3833.iterator();
            return this.method4936();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kv.bp(B)Lad;")
    public class40 method4936() {
        if (this.field3834 == null) {
            return null;
        } else if (this.field3834.hasNext()) {
            return (class40) this.field3834.next();
        } else {
            return null;
        }
    }
}
