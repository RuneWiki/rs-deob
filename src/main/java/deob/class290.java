package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kr")
public class class290 {

    @ObfuscatedName("kr.q")
    public class237 field3814;

    @ObfuscatedName("kr.b")
    public static final class263 field3835 = class263.field3620;

    @ObfuscatedName("kr.k")
    public static final class263 field3816 = class263.field3621;

    @ObfuscatedName("kr.s")
    public static final class263 field3817 = class263.field3622;

    @ObfuscatedName("kr.d")
    public class265 field3818;

    @ObfuscatedName("kr.l")
    public HashMap field3832;

    @ObfuscatedName("kr.t")
    public class286[] field3820;

    @ObfuscatedName("kr.y")
    public HashMap field3821;

    @ObfuscatedName("kr.v")
    public class33 field3822;

    @ObfuscatedName("kr.c")
    public class33 field3819;

    @ObfuscatedName("kr.z")
    public class33 field3824;

    @ObfuscatedName("kr.u")
    public class42 field3825;

    @ObfuscatedName("kr.e")
    public class289 field3826;

    @ObfuscatedName("kr.p")
    public int field3827;

    @ObfuscatedName("kr.m")
    public int field3812;

    @ObfuscatedName("kr.x")
    public int field3829 = -1;

    @ObfuscatedName("kr.h")
    public int field3811 = -1;

    @ObfuscatedName("kr.f")
    public float field3830;

    @ObfuscatedName("kr.g")
    public float field3850;

    @ObfuscatedName("kr.w")
    public int field3833 = -1;

    @ObfuscatedName("kr.ar")
    public int field3823 = -1;

    @ObfuscatedName("kr.ax")
    public int field3838 = 3;

    @ObfuscatedName("kr.al")
    public int field3836 = 50;

    @ObfuscatedName("kr.ag")
    public boolean field3837 = false;

    @ObfuscatedName("kr.ad")
    public HashSet field3844 = null;

    @ObfuscatedName("kr.ab")
    public int field3839 = -1;

    @ObfuscatedName("kr.am")
    public int field3840 = -1;

    @ObfuscatedName("kr.aq")
    public int field3845 = -1;

    @ObfuscatedName("kr.at")
    public int field3834 = -1;

    @ObfuscatedName("kr.az")
    public HashSet field3843 = new HashSet();

    @ObfuscatedName("kr.ac")
    public HashSet field3841 = new HashSet();

    @ObfuscatedName("kr.aa")
    public HashSet field3831 = new HashSet();

    @ObfuscatedName("kr.aj")
    public HashSet field3846 = new HashSet();

    @ObfuscatedName("kr.ay")
    public boolean field3847 = false;

    @ObfuscatedName("kr.av")
    public int field3848 = 0;

    @ObfuscatedName("kr.aw")
    public final int[] field3849 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kr.ah")
    public List field3851;

    @ObfuscatedName("kr.an")
    public Iterator field3828;

    @ObfuscatedName("kr.af")
    public HashSet field3852 = new HashSet();

    @ObfuscatedName("kr.i(Lii;Ljm;Ljava/util/HashMap;[Ljx;I)V")
    public void method4811(class237 arg0, class265 arg1, HashMap arg2, class286[] arg3) {
        this.field3820 = arg3;
        this.field3814 = arg0;
        this.field3818 = arg1;
        this.field3832 = new HashMap();
        this.field3832.put(class25.field371, arg2.get(field3835));
        this.field3832.put(class25.field370, arg2.get(field3816));
        this.field3832.put(class25.field374, arg2.get(field3817));
        this.field3826 = new class289(arg0);
        int var5 = this.field3814.method3840(class41.field561.field557);
        int[] var6 = this.field3814.method3890(var5);
        this.field3821 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class175 var8 = new class175(this.field3814.method3824(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method276(var8, var6[var7]);
            this.field3821.put(var9.method299(), var9);
            if (var9.method273()) {
                this.field3822 = var9;
            }
        }
        this.method4823(this.field3822);
        this.field3824 = null;
    }

    @ObfuscatedName("kr.j(I)I")
    public int method4812() {
        return this.field3814.method3844(this.field3822.method299(), class41.field559.field557) ? 100 : this.field3814.method3847(this.field3822.method299());
    }

    @ObfuscatedName("kr.a(IIZIIIIB)V")
    public void method4813(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3826.method4800()) {
            return;
        }
        this.method4815();
        this.method4923();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3830));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3830));
        List var10 = this.field3825.method518(this.field3827 - var8 / 2 - 1, this.field3812 - var9 / 2 - 1, var8 / 2 + this.field3827 + 1, var9 / 2 + this.field3812 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class70 var14 = new class70();
            class48 var15 = new class48(var13.field544, var13.field543, var13.field553);
            var14.method1010(new Object[] { var15, arg0, arg1 });
            if (this.field3852.contains(var13)) {
                var14.method1019(class221.field2798);
            } else {
                var14.method1019(class221.field2802);
            }
            class83.method2765(var14);
        }
        Iterator var16 = this.field3852.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class70 var18 = new class70();
                class48 var19 = new class48(var17.field544, var17.field543, var17.field553);
                var18.method1010(new Object[] { var19, arg0, arg1 });
                var18.method1019(class221.field2804);
                class83.method2765(var18);
            }
        }
        this.field3852 = var11;
    }

    @ObfuscatedName("kr.r(IIZI)V")
    public void method4814(int arg0, int arg1, boolean arg2) {
        if (this.field3845 == -1) {
            this.field3845 = arg0;
        }
        if (this.field3834 == -1) {
            this.field3834 = arg1;
        }
        int var4 = arg0 - this.field3845;
        int var5 = arg1 - this.field3834;
        this.field3845 = arg0;
        this.field3834 = arg1;
        if (arg2 && !this.method4865()) {
            this.field3827 -= (int) ((float) var4 / this.field3850);
            this.field3812 += (int) ((float) var5 / this.field3850);
        }
    }

    @ObfuscatedName("kr.o(I)V")
    public void method4815() {
        if (this.field3830 < this.field3850) {
            this.field3830 = Math.min(this.field3850, this.field3830 / 30.0F + this.field3830);
        }
        if (this.field3830 > this.field3850) {
            this.field3830 = Math.max(this.field3850, this.field3830 - this.field3830 / 30.0F);
        }
    }

    @ObfuscatedName("kr.n(B)V")
    public void method4923() {
        if (!this.method4865()) {
            return;
        }
        int var1 = this.field3829 - this.field3827;
        int var2 = this.field3811 - this.field3812;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3827 += var1;
        this.field3812 += var2;
        if (this.field3829 == this.field3827 && this.field3812 == this.field3811) {
            this.field3829 = -1;
            this.field3811 = -1;
        }
    }

    @ObfuscatedName("kr.q(I)Z")
    public boolean method4865() {
        return this.field3829 != -1 && this.field3811 != -1;
    }

    @ObfuscatedName("kr.b(IIIS)Lam;")
    public class33 method4816(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3821.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method267(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kr.k(IIIZI)V")
    public void method4829(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4816(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3822;
        }
        boolean var6 = false;
        if (this.field3824 != var5 || arg3) {
            this.field3824 = var5;
            this.method4823(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4890(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kr.s(II)V")
    public void method4820(int arg0) {
        class33 var2 = this.method4838(arg0);
        if (var2 != null) {
            this.method4823(var2);
        }
    }

    @ObfuscatedName("kr.d(I)I")
    public int method4935() {
        return this.field3819 == null ? -1 : this.field3819.method272();
    }

    @ObfuscatedName("kr.l(B)Lam;")
    public class33 method4822() {
        return this.field3819;
    }

    @ObfuscatedName("kr.c(Lam;I)V")
    public void method4823(class33 arg0) {
        if (this.field3819 == null || this.field3819 != arg0) {
            this.method4824(arg0);
            this.method4890(-1, -1, -1);
        }
    }

    @ObfuscatedName("kr.u(Lam;I)V")
    public void method4824(class33 arg0) {
        this.field3819 = arg0;
        this.field3825 = new class42(this.field3820, this.field3832);
        this.field3826.method4797(this.field3819.method299());
    }

    @ObfuscatedName("kr.e(Lam;Lhs;Lhs;ZB)V")
    public void method4841(class33 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3819 == null || this.field3819 != arg0) {
            this.method4824(arg0);
        }
        if (!arg3 && this.field3819.method267(arg1.field2618, arg1.field2617, arg1.field2619)) {
            this.method4890(arg1.field2618, arg1.field2617, arg1.field2619);
        } else {
            this.method4890(arg2.field2618, arg2.field2617, arg2.field2619);
        }
    }

    @ObfuscatedName("kr.p(IIII)V")
    public void method4890(int arg0, int arg1, int arg2) {
        if (this.field3819 == null) {
            return;
        }
        int[] var4 = this.field3819.method269(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3819.method269(this.field3819.method283(), this.field3819.method333(), this.field3819.method284());
        }
        this.field3827 = var4[0] - this.field3819.method319() * 64;
        this.field3812 = var4[1] - this.field3819.method332() * 64;
        this.field3829 = -1;
        this.field3811 = -1;
        this.field3830 = this.method4831(this.field3819.method277());
        this.field3850 = this.field3830;
        this.field3851 = null;
        this.field3828 = null;
        this.field3825.method514();
    }

    @ObfuscatedName("kr.m(IIIIII)V")
    public void method4827(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class283.method4566(var6);
        class283.method4549(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class283.method4557(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3826.method4801();
        if (var7 < 100) {
            this.method4830(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3825.method539()) {
            this.field3825.method513(this.field3814, this.field3819.method299(), client.field945);
            if (!this.field3825.method539()) {
                return;
            }
        }
        if (this.field3844 != null) {
            this.field3840++;
            if (this.field3840 % this.field3836 == 0) {
                this.field3840 = 0;
                this.field3839++;
            }
            if (this.field3839 >= this.field3838 && !this.field3837) {
                this.field3844 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3830));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3830));
        this.field3825.method541(this.field3827 - var8 / 2, this.field3812 - var9 / 2, var8 / 2 + this.field3827, var9 / 2 + this.field3812, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3847) {
            boolean var10 = false;
            if (arg4 - this.field3848 > 100) {
                this.field3848 = arg4;
                var10 = true;
            }
            this.field3825.method515(this.field3827 - var8 / 2, this.field3812 - var9 / 2, var8 / 2 + this.field3827, var9 / 2 + this.field3812, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3846, this.field3844, this.field3840, this.field3836, var10);
        }
        this.field3833 = var8;
        this.field3823 = var9;
        class283.method4584(var6);
    }

    @ObfuscatedName("kr.x(IIIII)V")
    public void method4982(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3826.method4800()) {
            return;
        }
        if (!this.field3825.method539()) {
            this.field3825.method513(this.field3814, this.field3819.method299(), client.field945);
            if (!this.field3825.method539()) {
                return;
            }
        }
        this.field3825.method517(arg0, arg1, arg2, arg3, this.field3844, this.field3840, this.field3836);
    }

    @ObfuscatedName("kr.g(II)V")
    public void method4846(int arg0) {
        this.field3850 = this.method4831(arg0);
    }

    @ObfuscatedName("kr.w(IIIIII)V")
    public void method4830(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class283.method4557(arg0, arg1, arg2, arg3, -16777216);
        class283.method4588(var7 - 152, var8, 304, 34, -65536);
        class283.method4557(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3818.method4423(class227.field2882, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kr.ar(II)F")
    public float method4831(int arg0) {
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

    @ObfuscatedName("kr.ax(I)I")
    public int method4832() {
        if ((double) this.field3850 == 1.0D) {
            return 25;
        } else if ((double) this.field3850 == 1.5D) {
            return 37;
        } else if ((double) this.field3850 == 2.0D) {
            return 50;
        } else if ((double) this.field3850 == 3.0D) {
            return 75;
        } else if ((double) this.field3850 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kr.al(B)V")
    public void method4828() {
        this.field3826.method4799();
    }

    @ObfuscatedName("kr.ag(I)Z")
    public boolean method4945() {
        return this.field3826.method4800();
    }

    @ObfuscatedName("kr.ad(IB)Lam;")
    public class33 method4838(int arg0) {
        Iterator var2 = this.field3821.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method272() != arg0);
        return var3;
    }

    @ObfuscatedName("kr.ab(III)V")
    public void method4836(int arg0, int arg1) {
        if (this.field3819 != null && this.field3819.method268(arg0, arg1)) {
            this.field3829 = arg0 - this.field3819.method319() * 64;
            this.field3811 = arg1 - this.field3819.method332() * 64;
        }
    }

    @ObfuscatedName("kr.am(III)V")
    public void method4837(int arg0, int arg1) {
        if (this.field3819 != null) {
            this.field3827 = arg0 - this.field3819.method319() * 64;
            this.field3812 = arg1 - this.field3819.method332() * 64;
            this.field3829 = -1;
            this.field3811 = -1;
        }
    }

    @ObfuscatedName("kr.aq(IIIB)V")
    public void method4833(int arg0, int arg1, int arg2) {
        if (this.field3819 != null) {
            int[] var4 = this.field3819.method269(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4836(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kr.at(IIII)V")
    public void method4961(int arg0, int arg1, int arg2) {
        if (this.field3819 != null) {
            int[] var4 = this.field3819.method269(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4837(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kr.az(I)I")
    public int method4897() {
        return this.field3819 == null ? -1 : this.field3827 + this.field3819.method319() * 64;
    }

    @ObfuscatedName("kr.ac(I)I")
    public int method4866() {
        return this.field3819 == null ? -1 : this.field3812 + this.field3819.method332() * 64;
    }

    @ObfuscatedName("kr.aa(I)Lhs;")
    public class214 method4818() {
        return this.field3819 == null ? null : this.field3819.method270(this.method4897(), this.method4866());
    }

    @ObfuscatedName("kr.aj(I)I")
    public int method4843() {
        return this.field3833;
    }

    @ObfuscatedName("kr.ay(I)I")
    public int method4844() {
        return this.field3823;
    }

    @ObfuscatedName("kr.av(II)V")
    public void method4845(int arg0) {
        if (arg0 >= 1) {
            this.field3838 = arg0;
        }
    }

    @ObfuscatedName("kr.ao(I)V")
    public void method4951() {
        this.field3838 = 3;
    }

    @ObfuscatedName("kr.aw(IB)V")
    public void method4847(int arg0) {
        if (arg0 >= 1) {
            this.field3836 = arg0;
        }
    }

    @ObfuscatedName("kr.ah(I)V")
    public void method4848() {
        this.field3836 = 50;
    }

    @ObfuscatedName("kr.an(ZB)V")
    public void method4849(boolean arg0) {
        this.field3837 = arg0;
    }

    @ObfuscatedName("kr.af(II)V")
    public void method4904(int arg0) {
        this.field3844 = new HashSet();
        this.field3844.add(arg0);
        this.field3839 = 0;
        this.field3840 = 0;
    }

    @ObfuscatedName("kr.ak(IB)V")
    public void method4957(int arg0) {
        this.field3844 = new HashSet();
        this.field3839 = 0;
        this.field3840 = 0;
        for (int var2 = 0; var2 < Statics.field3295.length; var2++) {
            if (Statics.field3295[var2] != null && Statics.field3295[var2].field3314 == arg0) {
                this.field3844.add(Statics.field3295[var2].field3297);
            }
        }
    }

    @ObfuscatedName("kr.as(B)V")
    public void method4852() {
        this.field3844 = null;
    }

    @ObfuscatedName("kr.ap(ZI)V")
    public void method4853(boolean arg0) {
        this.field3847 = !arg0;
    }

    @ObfuscatedName("kr.ae(IZB)V")
    public void method4976(int arg0, boolean arg1) {
        if (arg1) {
            this.field3843.remove(arg0);
        } else {
            this.field3843.add(arg0);
        }
        this.method4992();
    }

    @ObfuscatedName("kr.ai(IZI)V")
    public void method4855(int arg0, boolean arg1) {
        if (arg1) {
            this.field3841.remove(arg0);
        } else {
            this.field3841.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3295.length; var3++) {
            if (Statics.field3295[var3] != null && Statics.field3295[var3].field3314 == arg0) {
                int var4 = Statics.field3295[var3].field3297;
                if (arg1) {
                    this.field3831.remove(var4);
                } else {
                    this.field3831.add(var4);
                }
            }
        }
        this.method4992();
    }

    @ObfuscatedName("kr.au(S)Z")
    public boolean method4856() {
        return !this.field3847;
    }

    @ObfuscatedName("kr.bp(IS)Z")
    public boolean method4857(int arg0) {
        return !this.field3843.contains(arg0);
    }

    @ObfuscatedName("kr.bd(II)Z")
    public boolean method4858(int arg0) {
        return !this.field3841.contains(arg0);
    }

    @ObfuscatedName("kr.bs(I)V")
    public void method4992() {
        this.field3846.clear();
        this.field3846.addAll(this.field3843);
        this.field3846.addAll(this.field3831);
    }

    @ObfuscatedName("kr.bc(IIIIIII)V")
    public void method4870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3826.method4800()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3830));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3830));
        List var9 = this.field3825.method518(this.field3827 - var7 / 2 - 1, this.field3812 - var8 / 2 - 1, var7 / 2 + this.field3827 + 1, var8 / 2 + this.field3812 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class244 var12 = Statics.field3295[var11.field544];
            var13 = false;
            for (int var14 = this.field3849.length - 1; var14 >= 0; var14--) {
                if (var12.field3303[var14] != null) {
                    client.method478(var12.field3303[var14], var12.field3304, this.field3849[var14], var11.field544, var11.field543.method3679(), var11.field553.method3679());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kr.bv(ILhs;I)Lhs;")
    public class214 method4861(int arg0, class214 arg1) {
        if (!this.field3826.method4800()) {
            return null;
        } else if (!this.field3825.method539()) {
            return null;
        } else if (this.field3819.method268(arg1.field2617, arg1.field2619)) {
            HashMap var3 = this.field3825.method521();
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
                        return var5.field553;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field553.field2617 - arg1.field2617;
                    int var10 = var8.field553.field2619 - arg1.field2619;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field553;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kr.bw(IILhs;Lhs;I)V")
    public void method4834(int arg0, int arg1, class214 arg2, class214 arg3) {
        class70 var5 = new class70();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1010(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1019(class221.field2797);
                break;
            case 1009:
                var5.method1019(class221.field2800);
                break;
            case 1010:
                var5.method1019(class221.field2799);
                break;
            case 1011:
                var5.method1019(class221.field2810);
                break;
            case 1012:
                var5.method1019(class221.field2801);
        }
        class83.method2765(var5);
    }

    @ObfuscatedName("kr.bx(I)Lay;")
    public class40 method4863() {
        if (!this.field3826.method4800()) {
            return null;
        } else if (this.field3825.method539()) {
            HashMap var1 = this.field3825.method521();
            this.field3851 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3851.addAll(var3);
            }
            this.field3828 = this.field3851.iterator();
            return this.method4911();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kr.br(B)Lay;")
    public class40 method4911() {
        if (this.field3828 == null) {
            return null;
        } else if (this.field3828.hasNext()) {
            return (class40) this.field3828.next();
        } else {
            return null;
        }
    }
}
