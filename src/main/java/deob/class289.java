package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ko")
public class class289 {

    @ObfuscatedName("ko.j")
    public class236 field3810;

    @ObfuscatedName("ko.i")
    public static final class262 field3811 = class262.field3626;

    @ObfuscatedName("ko.f")
    public static final class262 field3812 = class262.field3624;

    @ObfuscatedName("ko.c")
    public static final class262 field3813 = class262.field3623;

    @ObfuscatedName("ko.o")
    public class264 field3848;

    @ObfuscatedName("ko.q")
    public HashMap field3814;

    @ObfuscatedName("ko.n")
    public class285[] field3816;

    @ObfuscatedName("ko.a")
    public HashMap field3817;

    @ObfuscatedName("ko.g")
    public class33 field3809;

    @ObfuscatedName("ko.v")
    public class33 field3819;

    @ObfuscatedName("ko.s")
    public class33 field3820;

    @ObfuscatedName("ko.k")
    public class42 field3821;

    @ObfuscatedName("ko.r")
    public class288 field3808;

    @ObfuscatedName("ko.l")
    public int field3823;

    @ObfuscatedName("ko.h")
    public int field3841;

    @ObfuscatedName("ko.d")
    public int field3838 = -1;

    @ObfuscatedName("ko.x")
    public int field3826 = -1;

    @ObfuscatedName("ko.b")
    public float field3827;

    @ObfuscatedName("ko.y")
    public float field3822;

    @ObfuscatedName("ko.u")
    public int field3829 = -1;

    @ObfuscatedName("ko.av")
    public int field3830 = -1;

    @ObfuscatedName("ko.ax")
    public int field3831 = 3;

    @ObfuscatedName("ko.af")
    public int field3832 = 50;

    @ObfuscatedName("ko.ae")
    public boolean field3833 = false;

    @ObfuscatedName("ko.ap")
    public HashSet field3834 = null;

    @ObfuscatedName("ko.ak")
    public int field3835 = -1;

    @ObfuscatedName("ko.al")
    public int field3836 = -1;

    @ObfuscatedName("ko.ab")
    public int field3824 = -1;

    @ObfuscatedName("ko.am")
    public int field3807 = -1;

    @ObfuscatedName("ko.ar")
    public HashSet field3839 = new HashSet();

    @ObfuscatedName("ko.ao")
    public HashSet field3840 = new HashSet();

    @ObfuscatedName("ko.ac")
    public HashSet field3828 = new HashSet();

    @ObfuscatedName("ko.aa")
    public HashSet field3842 = new HashSet();

    @ObfuscatedName("ko.ay")
    public boolean field3843 = false;

    @ObfuscatedName("ko.aj")
    public int field3844 = 0;

    @ObfuscatedName("ko.aq")
    public final int[] field3845 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ko.as")
    public List field3846;

    @ObfuscatedName("ko.an")
    public Iterator field3847;

    @ObfuscatedName("ko.az")
    public HashSet field3818 = new HashSet();

    @ObfuscatedName("ko.p(Lil;Ljb;Ljava/util/HashMap;[Ljg;B)V")
    public void method4739(class236 arg0, class264 arg1, HashMap arg2, class285[] arg3) {
        this.field3816 = arg3;
        this.field3810 = arg0;
        this.field3848 = arg1;
        this.field3814 = new HashMap();
        this.field3814.put(class25.field382, arg2.get(field3811));
        this.field3814.put(class25.field374, arg2.get(field3812));
        this.field3814.put(class25.field375, arg2.get(field3813));
        this.field3808 = new class288(arg0);
        int var5 = this.field3810.method3764(class41.field557.field549);
        int[] var6 = this.field3810.method3714(var5);
        this.field3817 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class174 var8 = new class174(this.field3810.method3720(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method253(var8, var6[var7]);
            this.field3817.put(var9.method288(), var9);
            if (var9.method261()) {
                this.field3809 = var9;
            }
        }
        this.method4870(this.field3809);
        this.field3820 = null;
    }

    @ObfuscatedName("ko.m(S)I")
    public int method4888() {
        return this.field3810.method3735(this.field3809.method288(), class41.field552.field549) ? 100 : this.field3810.method3727(this.field3809.method288());
    }

    @ObfuscatedName("ko.e(IIZIIIII)V")
    public void method4717(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3808.method4705()) {
            return;
        }
        this.method4719();
        this.method4720();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3827));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3827));
        List var10 = this.field3821.method520(this.field3823 - var8 / 2 - 1, this.field3841 - var9 / 2 - 1, var8 / 2 + this.field3823 + 1, var9 / 2 + this.field3841 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class70 var14 = new class70();
            class48 var15 = new class48(var13.field542, var13.field546, var13.field539);
            var14.method972(new Object[] { var15, arg0, arg1 });
            if (this.field3818.contains(var13)) {
                var14.method967(class220.field2807);
            } else {
                var14.method967(class220.field2804);
            }
            class84.method1349(var14);
        }
        Iterator var16 = this.field3818.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class70 var18 = new class70();
                class48 var19 = new class48(var17.field542, var17.field546, var17.field539);
                var18.method972(new Object[] { var19, arg0, arg1 });
                var18.method967(class220.field2803);
                class84.method1349(var18);
            }
        }
        this.field3818 = var11;
    }

    @ObfuscatedName("ko.t(IIZI)V")
    public void method4718(int arg0, int arg1, boolean arg2) {
        if (this.field3824 == -1) {
            this.field3824 = arg0;
        }
        if (this.field3807 == -1) {
            this.field3807 = arg1;
        }
        int var4 = arg0 - this.field3824;
        int var5 = arg1 - this.field3807;
        this.field3824 = arg0;
        this.field3807 = arg1;
        if (arg2 && !this.method4803()) {
            this.field3823 -= (int) ((float) var4 / this.field3822);
            this.field3841 += (int) ((float) var5 / this.field3822);
        }
    }

    @ObfuscatedName("ko.w(B)V")
    public void method4719() {
        if (this.field3827 < this.field3822) {
            this.field3827 = Math.min(this.field3822, this.field3827 / 30.0F + this.field3827);
        }
        if (this.field3827 > this.field3822) {
            this.field3827 = Math.max(this.field3822, this.field3827 - this.field3827 / 30.0F);
        }
    }

    @ObfuscatedName("ko.z(B)V")
    public void method4720() {
        if (!this.method4803()) {
            return;
        }
        int var1 = this.field3838 - this.field3823;
        int var2 = this.field3826 - this.field3841;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3823 += var1;
        this.field3841 += var2;
        if (this.field3838 == this.field3823 && this.field3841 == this.field3826) {
            this.field3838 = -1;
            this.field3826 = -1;
        }
    }

    @ObfuscatedName("ko.j(I)Z")
    public boolean method4803() {
        return this.field3838 != -1 && this.field3826 != -1;
    }

    @ObfuscatedName("ko.c(IIII)Lal;")
    public class33 method4722(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3817.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method255(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ko.o(IIIZI)V")
    public void method4839(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4722(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3809;
        }
        boolean var6 = false;
        if (this.field3820 != var5 || arg3) {
            this.field3820 = var5;
            this.method4870(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4730(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ko.q(II)V")
    public void method4724(int arg0) {
        class33 var2 = this.method4822(arg0);
        if (var2 != null) {
            this.method4870(var2);
        }
    }

    @ObfuscatedName("ko.n(I)I")
    public int method4747() {
        return this.field3819 == null ? -1 : this.field3819.method260();
    }

    @ObfuscatedName("ko.a(B)Lal;")
    public class33 method4726() {
        return this.field3819;
    }

    @ObfuscatedName("ko.g(Lal;I)V")
    public void method4870(class33 arg0) {
        if (this.field3819 == null || this.field3819 != arg0) {
            this.method4728(arg0);
            this.method4730(-1, -1, -1);
        }
    }

    @ObfuscatedName("ko.v(Lal;B)V")
    public void method4728(class33 arg0) {
        this.field3819 = arg0;
        this.field3821 = new class42(this.field3816, this.field3814);
        this.field3808.method4703(this.field3819.method288());
    }

    @ObfuscatedName("ko.s(Lal;Lhg;Lhg;ZI)V")
    public void method4878(class33 arg0, class213 arg1, class213 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3819 == null || this.field3819 != arg0) {
            this.method4728(arg0);
        }
        if (!arg3 && this.field3819.method255(arg1.field2620, arg1.field2619, arg1.field2622)) {
            this.method4730(arg1.field2620, arg1.field2619, arg1.field2622);
        } else {
            this.method4730(arg2.field2620, arg2.field2619, arg2.field2622);
        }
    }

    @ObfuscatedName("ko.k(IIIB)V")
    public void method4730(int arg0, int arg1, int arg2) {
        if (this.field3819 == null) {
            return;
        }
        int[] var4 = this.field3819.method319(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3819.method319(this.field3819.method271(), this.field3819.method270(), this.field3819.method259());
        }
        this.field3823 = var4[0] - this.field3819.method266() * 64;
        this.field3841 = var4[1] - this.field3819.method278() * 64;
        this.field3838 = -1;
        this.field3826 = -1;
        this.field3827 = this.method4735(this.field3819.method287());
        this.field3822 = this.field3827;
        this.field3846 = null;
        this.field3847 = null;
        this.field3821.method486();
    }

    @ObfuscatedName("ko.r(IIIIII)V")
    public void method4731(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class282.method4568(var6);
        class282.method4517(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class282.method4510(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3808.method4706();
        if (var7 < 100) {
            this.method4734(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3821.method511()) {
            this.field3821.method485(this.field3810, this.field3819.method288(), client.field906);
            if (!this.field3821.method511()) {
                return;
            }
        }
        if (this.field3834 != null) {
            this.field3836++;
            if (this.field3836 % this.field3832 == 0) {
                this.field3836 = 0;
                this.field3835++;
            }
            if (this.field3835 >= this.field3831 && !this.field3833) {
                this.field3834 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3827));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3827));
        this.field3821.method487(this.field3823 - var8 / 2, this.field3841 - var9 / 2, var8 / 2 + this.field3823, var9 / 2 + this.field3841, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3843) {
            boolean var10 = false;
            if (arg4 - this.field3844 > 100) {
                this.field3844 = arg4;
                var10 = true;
            }
            this.field3821.method488(this.field3823 - var8 / 2, this.field3841 - var9 / 2, var8 / 2 + this.field3823, var9 / 2 + this.field3841, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3842, this.field3834, this.field3836, this.field3832, var10);
        }
        this.field3829 = var8;
        this.field3830 = var9;
        class282.method4505(var6);
    }

    @ObfuscatedName("ko.l(IIIIB)V")
    public void method4732(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3808.method4705()) {
            return;
        }
        if (!this.field3821.method511()) {
            this.field3821.method485(this.field3810, this.field3819.method288(), client.field906);
            if (!this.field3821.method511()) {
                return;
            }
        }
        this.field3821.method490(arg0, arg1, arg2, arg3, this.field3834, this.field3836, this.field3832);
    }

    @ObfuscatedName("ko.d(IB)V")
    public void method4733(int arg0) {
        this.field3822 = this.method4735(arg0);
    }

    @ObfuscatedName("ko.x(IIIIII)V")
    public void method4734(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class282.method4510(arg0, arg1, arg2, arg3, -16777216);
        class282.method4572(var7 - 152, var8, 304, 34, -65536);
        class282.method4510(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3848.method4327(class226.field3140, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ko.b(II)F")
    public float method4735(int arg0) {
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

    @ObfuscatedName("ko.y(I)I")
    public int method4736() {
        if ((double) this.field3822 == 1.0D) {
            return 25;
        } else if ((double) this.field3822 == 1.5D) {
            return 37;
        } else if ((double) this.field3822 == 2.0D) {
            return 50;
        } else if ((double) this.field3822 == 3.0D) {
            return 75;
        } else if ((double) this.field3822 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ko.u(I)V")
    public void method4737() {
        this.field3808.method4704();
    }

    @ObfuscatedName("ko.av(B)Z")
    public boolean method4738() {
        return this.field3808.method4705();
    }

    @ObfuscatedName("ko.ax(IB)Lal;")
    public class33 method4822(int arg0) {
        Iterator var2 = this.field3817.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method260() != arg0);
        return var3;
    }

    @ObfuscatedName("ko.af(IIB)V")
    public void method4740(int arg0, int arg1) {
        if (this.field3819 != null && this.field3819.method256(arg0, arg1)) {
            this.field3838 = arg0 - this.field3819.method266() * 64;
            this.field3826 = arg1 - this.field3819.method278() * 64;
        }
    }

    @ObfuscatedName("ko.ae(IIB)V")
    public void method4884(int arg0, int arg1) {
        if (this.field3819 != null) {
            this.field3823 = arg0 - this.field3819.method266() * 64;
            this.field3841 = arg1 - this.field3819.method278() * 64;
            this.field3838 = -1;
            this.field3826 = -1;
        }
    }

    @ObfuscatedName("ko.ap(IIII)V")
    public void method4853(int arg0, int arg1, int arg2) {
        if (this.field3819 != null) {
            int[] var4 = this.field3819.method319(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4740(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ko.ak(IIII)V")
    public void method4743(int arg0, int arg1, int arg2) {
        if (this.field3819 != null) {
            int[] var4 = this.field3819.method319(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4884(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ko.al(I)I")
    public int method4744() {
        return this.field3819 == null ? -1 : this.field3823 + this.field3819.method266() * 64;
    }

    @ObfuscatedName("ko.ab(I)I")
    public int method4745() {
        return this.field3819 == null ? -1 : this.field3841 + this.field3819.method278() * 64;
    }

    @ObfuscatedName("ko.am(I)Lhg;")
    public class213 method4746() {
        return this.field3819 == null ? null : this.field3819.method290(this.method4744(), this.method4745());
    }

    @ObfuscatedName("ko.ar(B)I")
    public int method4778() {
        return this.field3829;
    }

    @ObfuscatedName("ko.ao(I)I")
    public int method4815() {
        return this.field3830;
    }

    @ObfuscatedName("ko.ac(II)V")
    public void method4749(int arg0) {
        if (arg0 >= 1) {
            this.field3831 = arg0;
        }
    }

    @ObfuscatedName("ko.aa(I)V")
    public void method4751() {
        this.field3831 = 3;
    }

    @ObfuscatedName("ko.ay(II)V")
    public void method4818(int arg0) {
        if (arg0 >= 1) {
            this.field3832 = arg0;
        }
    }

    @ObfuscatedName("ko.aj(I)V")
    public void method4752() {
        this.field3832 = 50;
    }

    @ObfuscatedName("ko.ag(ZI)V")
    public void method4753(boolean arg0) {
        this.field3833 = arg0;
    }

    @ObfuscatedName("ko.aq(II)V")
    public void method4754(int arg0) {
        this.field3834 = new HashSet();
        this.field3834.add(arg0);
        this.field3835 = 0;
        this.field3836 = 0;
    }

    @ObfuscatedName("ko.as(II)V")
    public void method4755(int arg0) {
        this.field3834 = new HashSet();
        this.field3835 = 0;
        this.field3836 = 0;
        for (int var2 = 0; var2 < Statics.field3305.length; var2++) {
            if (Statics.field3305[var2] != null && Statics.field3305[var2].field3307 == arg0) {
                this.field3834.add(Statics.field3305[var2].field3302);
            }
        }
    }

    @ObfuscatedName("ko.an(B)V")
    public void method4756() {
        this.field3834 = null;
    }

    @ObfuscatedName("ko.az(ZB)V")
    public void method4757(boolean arg0) {
        this.field3843 = !arg0;
    }

    @ObfuscatedName("ko.ai(IZI)V")
    public void method4758(int arg0, boolean arg1) {
        if (arg1) {
            this.field3839.remove(arg0);
        } else {
            this.field3839.add(arg0);
        }
        this.method4763();
    }

    @ObfuscatedName("ko.aw(IZI)V")
    public void method4759(int arg0, boolean arg1) {
        if (arg1) {
            this.field3840.remove(arg0);
        } else {
            this.field3840.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3305.length; var3++) {
            if (Statics.field3305[var3] != null && Statics.field3305[var3].field3307 == arg0) {
                int var4 = Statics.field3305[var3].field3302;
                if (arg1) {
                    this.field3828.remove(var4);
                } else {
                    this.field3828.add(var4);
                }
            }
        }
        this.method4763();
    }

    @ObfuscatedName("ko.au(B)Z")
    public boolean method4760() {
        return !this.field3843;
    }

    @ObfuscatedName("ko.ah(II)Z")
    public boolean method4784(int arg0) {
        return !this.field3839.contains(arg0);
    }

    @ObfuscatedName("ko.ad(IS)Z")
    public boolean method4762(int arg0) {
        return !this.field3840.contains(arg0);
    }

    @ObfuscatedName("ko.at(I)V")
    public void method4763() {
        this.field3842.clear();
        this.field3842.addAll(this.field3839);
        this.field3842.addAll(this.field3828);
    }

    @ObfuscatedName("ko.bg(IIIIIIB)V")
    public void method4764(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3808.method4705()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3827));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3827));
        List var9 = this.field3821.method520(this.field3823 - var7 / 2 - 1, this.field3841 - var8 / 2 - 1, var7 / 2 + this.field3823 + 1, var8 / 2 + this.field3841 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class243 var12 = Statics.field3305[var11.field542];
            var13 = false;
            for (int var14 = this.field3845.length - 1; var14 >= 0; var14--) {
                if (var12.field3308[var14] != null) {
                    client.method551(var12.field3308[var14], var12.field3309, this.field3845[var14], var11.field542, var11.field546.method3554(), var11.field539.method3554());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ko.bf(ILhg;I)Lhg;")
    public class213 method4765(int arg0, class213 arg1) {
        if (!this.field3808.method4705()) {
            return null;
        } else if (!this.field3821.method511()) {
            return null;
        } else if (this.field3819.method256(arg1.field2619, arg1.field2622)) {
            HashMap var3 = this.field3821.method494();
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
                        return var5.field539;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field539.field2619 - arg1.field2619;
                    int var10 = var8.field539.field2622 - arg1.field2622;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field539;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ko.bi(IILhg;Lhg;I)V")
    public void method4801(int arg0, int arg1, class213 arg2, class213 arg3) {
        class70 var5 = new class70();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method972(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method967(class220.field2797);
                break;
            case 1009:
                var5.method967(class220.field2798);
                break;
            case 1010:
                var5.method967(class220.field2799);
                break;
            case 1011:
                var5.method967(class220.field2800);
                break;
            case 1012:
                var5.method967(class220.field2801);
        }
        class84.method1349(var5);
    }

    @ObfuscatedName("ko.bv(I)Lay;")
    public class40 method4785() {
        if (!this.field3808.method4705()) {
            return null;
        } else if (this.field3821.method511()) {
            HashMap var1 = this.field3821.method494();
            this.field3846 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3846.addAll(var3);
            }
            this.field3847 = this.field3846.iterator();
            return this.method4723();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ko.bz(I)Lay;")
    public class40 method4723() {
        if (this.field3847 == null) {
            return null;
        } else if (this.field3847.hasNext()) {
            return (class40) this.field3847.next();
        } else {
            return null;
        }
    }
}
