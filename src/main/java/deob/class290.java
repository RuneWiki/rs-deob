package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kg")
public class class290 {

    @ObfuscatedName("kg.c")
    public class237 field3812;

    @ObfuscatedName("kg.l")
    public static final class263 field3799 = class263.field3612;

    @ObfuscatedName("kg.w")
    public static final class263 field3795 = class263.field3615;

    @ObfuscatedName("kg.b")
    public static final class263 field3801 = class263.field3614;

    @ObfuscatedName("kg.o")
    public class265 field3808;

    @ObfuscatedName("kg.m")
    public HashMap field3810;

    @ObfuscatedName("kg.i")
    public class286[] field3804;

    @ObfuscatedName("kg.s")
    public HashMap field3805;

    @ObfuscatedName("kg.r")
    public class33 field3806;

    @ObfuscatedName("kg.e")
    public class33 field3807;

    @ObfuscatedName("kg.a")
    public class33 field3796;

    @ObfuscatedName("kg.v")
    public class42 field3809;

    @ObfuscatedName("kg.t")
    public class289 field3830;

    @ObfuscatedName("kg.y")
    public int field3811;

    @ObfuscatedName("kg.z")
    public int field3836;

    @ObfuscatedName("kg.u")
    public int field3813 = -1;

    @ObfuscatedName("kg.k")
    public int field3814 = -1;

    @ObfuscatedName("kg.q")
    public float field3819;

    @ObfuscatedName("kg.n")
    public float field3816;

    @ObfuscatedName("kg.d")
    public int field3817 = -1;

    @ObfuscatedName("kg.ax")
    public int field3818 = -1;

    @ObfuscatedName("kg.ao")
    public int field3798 = 3;

    @ObfuscatedName("kg.an")
    public int field3803 = 50;

    @ObfuscatedName("kg.ar")
    public boolean field3833 = false;

    @ObfuscatedName("kg.ag")
    public HashSet field3822 = null;

    @ObfuscatedName("kg.av")
    public int field3826 = -1;

    @ObfuscatedName("kg.ab")
    public int field3824 = -1;

    @ObfuscatedName("kg.aj")
    public int field3825 = -1;

    @ObfuscatedName("kg.ae")
    public int field3815 = -1;

    @ObfuscatedName("kg.at")
    public HashSet field3827 = new HashSet();

    @ObfuscatedName("kg.as")
    public HashSet field3828 = new HashSet();

    @ObfuscatedName("kg.af")
    public HashSet field3829 = new HashSet();

    @ObfuscatedName("kg.au")
    public HashSet field3821 = new HashSet();

    @ObfuscatedName("kg.az")
    public boolean field3800 = false;

    @ObfuscatedName("kg.al")
    public int field3832 = 0;

    @ObfuscatedName("kg.ah")
    public final int[] field3823 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kg.ap")
    public List field3834;

    @ObfuscatedName("kg.ad")
    public Iterator field3835;

    @ObfuscatedName("kg.aa")
    public HashSet field3831 = new HashSet();

    @ObfuscatedName("kg.j(Lia;Ljh;Ljava/util/HashMap;[Ljr;S)V")
    public void method4903(class237 arg0, class265 arg1, HashMap arg2, class286[] arg3) {
        this.field3804 = arg3;
        this.field3812 = arg0;
        this.field3808 = arg1;
        this.field3810 = new HashMap();
        this.field3810.put(class25.field370, arg2.get(field3799));
        this.field3810.put(class25.field367, arg2.get(field3795));
        this.field3810.put(class25.field368, arg2.get(field3801));
        this.field3830 = new class289(arg0);
        int var5 = this.field3812.method3789(class41.field560.field552);
        int[] var6 = this.field3812.method3783(var5);
        this.field3805 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class175 var8 = new class175(this.field3812.method3773(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method258(var8, var6[var7]);
            this.field3805.put(var9.method267(), var9);
            if (var9.method266()) {
                this.field3806 = var9;
            }
        }
        this.method4862(this.field3806);
        this.field3796 = null;
    }

    @ObfuscatedName("kg.h(I)I")
    public int method4851() {
        return this.field3812.method3793(this.field3806.method267(), class41.field553.field552) ? 100 : this.field3812.method3796(this.field3806.method267());
    }

    @ObfuscatedName("kg.f(IIZIIIII)V")
    public void method4908(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3830.method4846()) {
            return;
        }
        this.method4952();
        this.method4855();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3819));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3819));
        List var10 = this.field3809.method512(this.field3811 - var8 / 2 - 1, this.field3836 - var9 / 2 - 1, var8 / 2 + this.field3811 + 1, var9 / 2 + this.field3836 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class71 var14 = new class71();
            class48 var15 = new class48(var13.field545, var13.field538, var13.field543);
            var14.method1050(new Object[] { var15, arg0, arg1 });
            if (this.field3831.contains(var13)) {
                var14.method1051(class221.field2796);
            } else {
                var14.method1051(class221.field2794);
            }
            class85.method3622(var14);
        }
        Iterator var16 = this.field3831.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class71 var18 = new class71();
                class48 var19 = new class48(var17.field545, var17.field538, var17.field543);
                var18.method1050(new Object[] { var19, arg0, arg1 });
                var18.method1051(class221.field2795);
                class85.method3622(var18);
            }
        }
        this.field3831 = var11;
    }

    @ObfuscatedName("kg.p(IIZI)V")
    public void method4853(int arg0, int arg1, boolean arg2) {
        if (this.field3825 == -1) {
            this.field3825 = arg0;
        }
        if (this.field3815 == -1) {
            this.field3815 = arg1;
        }
        int var4 = arg0 - this.field3825;
        int var5 = arg1 - this.field3815;
        this.field3825 = arg0;
        this.field3815 = arg1;
        if (arg2 && !this.method4856()) {
            this.field3811 -= (int) ((float) var4 / this.field3816);
            this.field3836 += (int) ((float) var5 / this.field3816);
        }
    }

    @ObfuscatedName("kg.x(I)V")
    public void method4952() {
        if (this.field3819 < this.field3816) {
            this.field3819 = Math.min(this.field3816, this.field3819 / 30.0F + this.field3819);
        }
        if (this.field3819 > this.field3816) {
            this.field3819 = Math.max(this.field3816, this.field3819 - this.field3819 / 30.0F);
        }
    }

    @ObfuscatedName("kg.g(S)V")
    public void method4855() {
        if (!this.method4856()) {
            return;
        }
        int var1 = this.field3813 - this.field3811;
        int var2 = this.field3814 - this.field3836;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3811 += var1;
        this.field3836 += var2;
        if (this.field3813 == this.field3811 && this.field3836 == this.field3814) {
            this.field3813 = -1;
            this.field3814 = -1;
        }
    }

    @ObfuscatedName("kg.c(I)Z")
    public boolean method4856() {
        return this.field3813 != -1 && this.field3814 != -1;
    }

    @ObfuscatedName("kg.l(IIII)Lab;")
    public class33 method4894(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3805.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method260(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kg.w(IIIZI)V")
    public void method4852(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4894(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3806;
        }
        boolean var6 = false;
        if (this.field3796 != var5 || arg3) {
            this.field3796 = var5;
            this.method4862(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4886(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kg.b(II)V")
    public void method4859(int arg0) {
        class33 var2 = this.method4874(arg0);
        if (var2 != null) {
            this.method4862(var2);
        }
    }

    @ObfuscatedName("kg.o(I)I")
    public int method4860() {
        return this.field3807 == null ? -1 : this.field3807.method272();
    }

    @ObfuscatedName("kg.m(I)Lab;")
    public class33 method4965() {
        return this.field3807;
    }

    @ObfuscatedName("kg.e(Lab;I)V")
    public void method4862(class33 arg0) {
        if (this.field3807 == null || this.field3807 != arg0) {
            this.method4904(arg0);
            this.method4886(-1, -1, -1);
        }
    }

    @ObfuscatedName("kg.a(Lab;I)V")
    public void method4904(class33 arg0) {
        this.field3807 = arg0;
        this.field3809 = new class42(this.field3804, this.field3810);
        this.field3830.method4837(this.field3807.method267());
    }

    @ObfuscatedName("kg.v(Lab;Lhh;Lhh;ZI)V")
    public void method4854(class33 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3807 == null || this.field3807 != arg0) {
            this.method4904(arg0);
        }
        if (!arg3 && this.field3807.method260(arg1.field2610, arg1.field2609, arg1.field2611)) {
            this.method4886(arg1.field2610, arg1.field2609, arg1.field2611);
        } else {
            this.method4886(arg2.field2610, arg2.field2609, arg2.field2611);
        }
    }

    @ObfuscatedName("kg.t(IIII)V")
    public void method4886(int arg0, int arg1, int arg2) {
        if (this.field3807 == null) {
            return;
        }
        int[] var4 = this.field3807.method329(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3807.method329(this.field3807.method276(), this.field3807.method286(), this.field3807.method277());
        }
        this.field3811 = var4[0] - this.field3807.method271() * 64;
        this.field3836 = var4[1] - this.field3807.method288() * 64;
        this.field3813 = -1;
        this.field3814 = -1;
        this.field3819 = this.method4870(this.field3807.method270());
        this.field3816 = this.field3819;
        this.field3834 = null;
        this.field3835 = null;
        this.field3809.method540();
    }

    @ObfuscatedName("kg.y(IIIIII)V")
    public void method4866(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class283.method4595(var6);
        class283.method4628(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class283.method4601(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3830.method4838();
        if (var7 < 100) {
            this.method4938(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3809.method514()) {
            this.field3809.method516(this.field3812, this.field3807.method267(), client.field1104);
            if (!this.field3809.method514()) {
                return;
            }
        }
        if (this.field3822 != null) {
            this.field3824++;
            if (this.field3824 % this.field3803 == 0) {
                this.field3824 = 0;
                this.field3826++;
            }
            if (this.field3826 >= this.field3798 && !this.field3833) {
                this.field3822 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3819));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3819));
        this.field3809.method528(this.field3811 - var8 / 2, this.field3836 - var9 / 2, var8 / 2 + this.field3811, var9 / 2 + this.field3836, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3800) {
            boolean var10 = false;
            if (arg4 - this.field3832 > 100) {
                this.field3832 = arg4;
                var10 = true;
            }
            this.field3809.method509(this.field3811 - var8 / 2, this.field3836 - var9 / 2, var8 / 2 + this.field3811, var9 / 2 + this.field3836, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3821, this.field3822, this.field3824, this.field3803, var10);
        }
        this.field3817 = var8;
        this.field3818 = var9;
        class283.method4596(var6);
    }

    @ObfuscatedName("kg.u(IIIII)V")
    public void method4867(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3830.method4846()) {
            return;
        }
        if (!this.field3809.method514()) {
            this.field3809.method516(this.field3812, this.field3807.method267(), client.field1104);
            if (!this.field3809.method514()) {
                return;
            }
        }
        this.field3809.method511(arg0, arg1, arg2, arg3, this.field3822, this.field3824, this.field3803);
    }

    @ObfuscatedName("kg.n(II)V")
    public void method5033(int arg0) {
        this.field3816 = this.method4870(arg0);
    }

    @ObfuscatedName("kg.d(IIIIIS)V")
    public void method4938(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class283.method4601(arg0, arg1, arg2, arg3, -16777216);
        class283.method4608(var7 - 152, var8, 304, 34, -65536);
        class283.method4601(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3808.method4476(class227.field2985, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kg.ax(IB)F")
    public float method4870(int arg0) {
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

    @ObfuscatedName("kg.ao(I)I")
    public int method5007() {
        if ((double) this.field3816 == 1.0D) {
            return 25;
        } else if ((double) this.field3816 == 1.5D) {
            return 37;
        } else if ((double) this.field3816 == 2.0D) {
            return 50;
        } else if ((double) this.field3816 == 3.0D) {
            return 75;
        } else if ((double) this.field3816 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kg.an(I)V")
    public void method4872() {
        this.field3830.method4836();
    }

    @ObfuscatedName("kg.ar(I)Z")
    public boolean method4873() {
        return this.field3830.method4846();
    }

    @ObfuscatedName("kg.ag(II)Lab;")
    public class33 method4874(int arg0) {
        Iterator var2 = this.field3805.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method272() != arg0);
        return var3;
    }

    @ObfuscatedName("kg.av(III)V")
    public void method4875(int arg0, int arg1) {
        if (this.field3807 != null && this.field3807.method261(arg0, arg1)) {
            this.field3813 = arg0 - this.field3807.method271() * 64;
            this.field3814 = arg1 - this.field3807.method288() * 64;
        }
    }

    @ObfuscatedName("kg.ab(III)V")
    public void method4876(int arg0, int arg1) {
        if (this.field3807 != null) {
            this.field3811 = arg0 - this.field3807.method271() * 64;
            this.field3836 = arg1 - this.field3807.method288() * 64;
            this.field3813 = -1;
            this.field3814 = -1;
        }
    }

    @ObfuscatedName("kg.aj(IIII)V")
    public void method4877(int arg0, int arg1, int arg2) {
        if (this.field3807 != null) {
            int[] var4 = this.field3807.method329(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4875(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kg.ae(IIII)V")
    public void method4878(int arg0, int arg1, int arg2) {
        if (this.field3807 != null) {
            int[] var4 = this.field3807.method329(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4876(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kg.at(I)I")
    public int method4879() {
        return this.field3807 == null ? -1 : this.field3811 + this.field3807.method271() * 64;
    }

    @ObfuscatedName("kg.as(B)I")
    public int method4935() {
        return this.field3807 == null ? -1 : this.field3836 + this.field3807.method288() * 64;
    }

    @ObfuscatedName("kg.af(I)Lhh;")
    public class214 method4881() {
        return this.field3807 == null ? null : this.field3807.method263(this.method4879(), this.method4935());
    }

    @ObfuscatedName("kg.au(B)I")
    public int method4964() {
        return this.field3817;
    }

    @ObfuscatedName("kg.az(B)I")
    public int method4861() {
        return this.field3818;
    }

    @ObfuscatedName("kg.al(II)V")
    public void method4884(int arg0) {
        if (arg0 >= 1) {
            this.field3798 = arg0;
        }
    }

    @ObfuscatedName("kg.am(B)V")
    public void method4974() {
        this.field3798 = 3;
    }

    @ObfuscatedName("kg.ah(IB)V")
    public void method5005(int arg0) {
        if (arg0 >= 1) {
            this.field3803 = arg0;
        }
    }

    @ObfuscatedName("kg.ap(I)V")
    public void method4887() {
        this.field3803 = 50;
    }

    @ObfuscatedName("kg.ad(ZI)V")
    public void method4888(boolean arg0) {
        this.field3833 = arg0;
    }

    @ObfuscatedName("kg.aa(II)V")
    public void method4928(int arg0) {
        this.field3822 = new HashSet();
        this.field3822.add(arg0);
        this.field3826 = 0;
        this.field3824 = 0;
    }

    @ObfuscatedName("kg.aw(II)V")
    public void method4890(int arg0) {
        this.field3822 = new HashSet();
        this.field3826 = 0;
        this.field3824 = 0;
        for (int var2 = 0; var2 < Statics.field3285.length; var2++) {
            if (Statics.field3285[var2] != null && Statics.field3285[var2].field3297 == arg0) {
                this.field3822.add(Statics.field3285[var2].field3288);
            }
        }
    }

    @ObfuscatedName("kg.aq(B)V")
    public void method4969() {
        this.field3822 = null;
    }

    @ObfuscatedName("kg.ai(ZB)V")
    public void method4892(boolean arg0) {
        this.field3800 = !arg0;
    }

    @ObfuscatedName("kg.ak(IZI)V")
    public void method4922(int arg0, boolean arg1) {
        if (arg1) {
            this.field3827.remove(arg0);
        } else {
            this.field3827.add(arg0);
        }
        this.method4897();
    }

    @ObfuscatedName("kg.ac(IZI)V")
    public void method4889(int arg0, boolean arg1) {
        if (arg1) {
            this.field3828.remove(arg0);
        } else {
            this.field3828.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3285.length; var3++) {
            if (Statics.field3285[var3] != null && Statics.field3285[var3].field3297 == arg0) {
                int var4 = Statics.field3285[var3].field3288;
                if (arg1) {
                    this.field3829.remove(var4);
                } else {
                    this.field3829.add(var4);
                }
            }
        }
        this.method4897();
    }

    @ObfuscatedName("kg.ay(I)Z")
    public boolean method4960() {
        return !this.field3800;
    }

    @ObfuscatedName("kg.bk(II)Z")
    public boolean method4995(int arg0) {
        return !this.field3827.contains(arg0);
    }

    @ObfuscatedName("kg.bi(II)Z")
    public boolean method4882(int arg0) {
        return !this.field3828.contains(arg0);
    }

    @ObfuscatedName("kg.ba(B)V")
    public void method4897() {
        this.field3821.clear();
        this.field3821.addAll(this.field3827);
        this.field3821.addAll(this.field3829);
    }

    @ObfuscatedName("kg.bn(IIIIIII)V")
    public void method4898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3830.method4846()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3819));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3819));
        List var9 = this.field3809.method512(this.field3811 - var7 / 2 - 1, this.field3836 - var8 / 2 - 1, var7 / 2 + this.field3811 + 1, var8 / 2 + this.field3836 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class244 var12 = Statics.field3285[var11.field545];
            var13 = false;
            for (int var14 = this.field3823.length - 1; var14 >= 0; var14--) {
                if (var12.field3286[var14] != null) {
                    client.method1723(var12.field3286[var14], var12.field3287, this.field3823[var14], var11.field545, var11.field538.method3621(), var11.field543.method3621());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kg.by(ILhh;B)Lhh;")
    public class214 method5022(int arg0, class214 arg1) {
        if (!this.field3830.method4846()) {
            return null;
        } else if (!this.field3809.method514()) {
            return null;
        } else if (this.field3807.method261(arg1.field2609, arg1.field2611)) {
            HashMap var3 = this.field3809.method515();
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
                        return var5.field543;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field543.field2609 - arg1.field2609;
                    int var10 = var8.field543.field2611 - arg1.field2611;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field543;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kg.bc(IILhh;Lhh;I)V")
    public void method4900(int arg0, int arg1, class214 arg2, class214 arg3) {
        class71 var5 = new class71();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1050(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1051(class221.field2799);
                break;
            case 1009:
                var5.method1051(class221.field2793);
                break;
            case 1010:
                var5.method1051(class221.field2791);
                break;
            case 1011:
                var5.method1051(class221.field2792);
                break;
            case 1012:
                var5.method1051(class221.field2790);
        }
        class85.method3622(var5);
    }

    @ObfuscatedName("kg.bh(I)Laz;")
    public class40 method4901() {
        if (!this.field3830.method4846()) {
            return null;
        } else if (this.field3809.method514()) {
            HashMap var1 = this.field3809.method515();
            this.field3834 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3834.addAll(var3);
            }
            this.field3835 = this.field3834.iterator();
            return this.method4902();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kg.bw(B)Laz;")
    public class40 method4902() {
        if (this.field3835 == null) {
            return null;
        } else if (this.field3835.hasNext()) {
            return (class40) this.field3835.next();
        } else {
            return null;
        }
    }
}
