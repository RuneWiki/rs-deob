package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ko")
public class class298 {

    @ObfuscatedName("ko.b")
    public class243 field3866;

    @ObfuscatedName("ko.t")
    public static final class269 field3903 = class269.field3686;

    @ObfuscatedName("ko.p")
    public static final class269 field3897 = class269.field3687;

    @ObfuscatedName("ko.r")
    public static final class269 field3869 = class269.field3685;

    @ObfuscatedName("ko.l")
    public class271 field3867;

    @ObfuscatedName("ko.u")
    public HashMap field3891;

    @ObfuscatedName("ko.n")
    public class294[] field3888;

    @ObfuscatedName("ko.c")
    public HashMap field3873;

    @ObfuscatedName("ko.y")
    public class33 field3904;

    @ObfuscatedName("ko.j")
    public class33 field3875;

    @ObfuscatedName("ko.f")
    public class33 field3876;

    @ObfuscatedName("ko.s")
    public class42 field3877;

    @ObfuscatedName("ko.e")
    public class297 field3878;

    @ObfuscatedName("ko.q")
    public int field3879;

    @ObfuscatedName("ko.h")
    public int field3880;

    @ObfuscatedName("ko.i")
    public int field3881 = -1;

    @ObfuscatedName("ko.o")
    public int field3882 = -1;

    @ObfuscatedName("ko.w")
    public float field3907;

    @ObfuscatedName("ko.g")
    public float field3884;

    @ObfuscatedName("ko.a")
    public int field3885 = -1;

    @ObfuscatedName("ko.ah")
    public int field3886 = -1;

    @ObfuscatedName("ko.ak")
    public int field3887 = -1;

    @ObfuscatedName("ko.aa")
    public int field3901 = -1;

    @ObfuscatedName("ko.ax")
    public int field3889 = 3;

    @ObfuscatedName("ko.aq")
    public int field3890 = 50;

    @ObfuscatedName("ko.au")
    public boolean field3874 = false;

    @ObfuscatedName("ko.al")
    public HashSet field3892 = null;

    @ObfuscatedName("ko.ae")
    public int field3893 = -1;

    @ObfuscatedName("ko.aj")
    public int field3894 = -1;

    @ObfuscatedName("ko.as")
    public int field3895 = -1;

    @ObfuscatedName("ko.am")
    public int field3896 = -1;

    @ObfuscatedName("ko.ag")
    public HashSet field3871 = new HashSet();

    @ObfuscatedName("ko.aw")
    public HashSet field3872 = new HashSet();

    @ObfuscatedName("ko.ap")
    public HashSet field3899 = new HashSet();

    @ObfuscatedName("ko.ad")
    public HashSet field3900 = new HashSet();

    @ObfuscatedName("ko.an")
    public boolean field3883 = false;

    @ObfuscatedName("ko.ai")
    public int field3902 = 0;

    @ObfuscatedName("ko.ar")
    public final int[] field3898 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ko.ac")
    public List field3868;

    @ObfuscatedName("ko.af")
    public Iterator field3905;

    @ObfuscatedName("ko.ao")
    public HashSet field3906 = new HashSet();

    @ObfuscatedName("ko.av")
    public class220 field3870 = null;

    @ObfuscatedName("ko.d(Lid;Ljp;Ljava/util/HashMap;[Lkl;B)V")
    public void method5135(class243 arg0, class271 arg1, HashMap arg2, class294[] arg3) {
        this.field3888 = arg3;
        this.field3866 = arg0;
        this.field3867 = arg1;
        this.field3891 = new HashMap();
        this.field3891.put(class25.field344, arg2.get(field3903));
        this.field3891.put(class25.field342, arg2.get(field3897));
        this.field3891.put(class25.field343, arg2.get(field3869));
        this.field3878 = new class297(arg0);
        int var5 = this.field3866.method3951(class41.field515.field518);
        int[] var6 = this.field3866.method3945(var5);
        this.field3873 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class181 var8 = new class181(this.field3866.method3935(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method241(var8, var6[var7]);
            this.field3873.put(var9.method250(), var9);
            if (var9.method270()) {
                this.field3904 = var9;
            }
        }
        this.method5041(this.field3904);
        this.field3876 = null;
    }

    @ObfuscatedName("ko.x(I)I")
    public int method5029() {
        return this.field3866.method3955(this.field3904.method250(), class41.field520.field518) ? 100 : this.field3866.method3966(this.field3904.method250());
    }

    @ObfuscatedName("ko.k(IIZIIIII)V")
    public void method5030(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3878.method5015()) {
            return;
        }
        this.method5033();
        this.method5034();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3907));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3907));
        List var10 = this.field3877.method511(this.field3879 - var8 / 2 - 1, this.field3880 - var9 / 2 - 1, var8 / 2 + this.field3879 + 1, var9 / 2 + this.field3880 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class48 var15 = new class48(var13.field514, var13.field508, var13.field507);
            var14.method1029(new Object[] { var15, arg0, arg1 });
            if (this.field3906.contains(var13)) {
                var14.method1024(class227.field2870);
            } else {
                var14.method1024(class227.field2868);
            }
            class83.method86(var14);
        }
        Iterator var16 = this.field3906.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class48 var19 = new class48(var17.field514, var17.field508, var17.field507);
                var18.method1029(new Object[] { var19, arg0, arg1 });
                var18.method1024(class227.field2871);
                class83.method86(var18);
            }
        }
        this.field3906 = var11;
    }

    @ObfuscatedName("ko.z(IIZZB)V")
    public void method5132(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method5106(arg0, arg1, arg3);
        if (this.field3895 == -1) {
            this.field3895 = arg0;
        }
        if (this.field3896 == -1) {
            this.field3896 = arg1;
        }
        int var5 = arg0 - this.field3895;
        int var6 = arg1 - this.field3896;
        this.field3895 = arg0;
        this.field3896 = arg1;
        if (arg2 && !this.method5087()) {
            this.field3879 -= (int) ((float) var5 / this.field3884);
            this.field3880 += (int) ((float) var6 / this.field3884);
        }
    }

    @ObfuscatedName("ko.v(IIZI)V")
    public void method5106(int arg0, int arg1, boolean arg2) {
        boolean var4 = client.field1026 >= 2;
        if (!var4) {
            return;
        }
        if (this.field3875 == null) {
            this.field3870 = null;
            return;
        }
        int var5 = (int) ((float) this.field3879 + ((float) (arg0 - this.field3887) - (float) this.method5061() * this.field3907 / 2.0F) / this.field3907);
        int var6 = (int) ((float) this.field3880 - ((float) (arg1 - this.field3901) - (float) this.method5062() * this.field3907 / 2.0F) / this.field3907);
        this.field3870 = this.field3875.method258(var5 + this.field3875.method254() * 64, var6 + this.field3875.method256() * 64);
        if (this.field3870 == null || !arg2 || !class51.field607[82] || !class51.field607[81] || !arg2) {
            return;
        }
        int var7 = this.field3870.field2691;
        int var8 = this.field3870.field2692;
        int var9 = this.field3870.field2690;
        class171 var10 = class171.method3795(class168.field2376, client.field917.field1471);
        var10.field2423.method3083(var9);
        var10.field2423.method3040(var7);
        var10.field2423.method3072(var8);
        client.field917.method1777(var10);
    }

    @ObfuscatedName("ko.m(I)V")
    public void method5033() {
        if (this.field3907 < this.field3884) {
            this.field3907 = Math.min(this.field3884, this.field3907 / 30.0F + this.field3907);
        }
        if (this.field3907 > this.field3884) {
            this.field3907 = Math.max(this.field3884, this.field3907 - this.field3907 / 30.0F);
        }
    }

    @ObfuscatedName("ko.b(I)V")
    public void method5034() {
        if (!this.method5087()) {
            return;
        }
        int var1 = this.field3881 - this.field3879;
        int var2 = this.field3882 - this.field3880;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3879 += var1;
        this.field3880 += var2;
        if (this.field3881 == this.field3879 && this.field3882 == this.field3880) {
            this.field3881 = -1;
            this.field3882 = -1;
        }
    }

    @ObfuscatedName("ko.t(I)Z")
    public boolean method5087() {
        return this.field3881 != -1 && this.field3882 != -1;
    }

    @ObfuscatedName("ko.p(IIII)Lal;")
    public class33 method5036(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3873.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method243(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ko.r(IIIZI)V")
    public void method5037(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5036(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3904;
        }
        boolean var6 = false;
        if (this.field3876 != var5 || arg3) {
            this.field3876 = var5;
            this.method5041(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5044(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ko.l(IB)V")
    public void method5038(int arg0) {
        class33 var2 = this.method5053(arg0);
        if (var2 != null) {
            this.method5041(var2);
        }
    }

    @ObfuscatedName("ko.u(I)I")
    public int method5190() {
        return this.field3875 == null ? -1 : this.field3875.method248();
    }

    @ObfuscatedName("ko.c(B)Lal;")
    public class33 method5121() {
        return this.field3875;
    }

    @ObfuscatedName("ko.j(Lal;I)V")
    public void method5041(class33 arg0) {
        if (this.field3875 == null || this.field3875 != arg0) {
            this.method5042(arg0);
            this.method5044(-1, -1, -1);
        }
    }

    @ObfuscatedName("ko.f(Lal;B)V")
    public void method5042(class33 arg0) {
        this.field3875 = arg0;
        this.field3877 = new class42(this.field3888, this.field3891);
        this.field3878.method5026(this.field3875.method250());
    }

    @ObfuscatedName("ko.s(Lal;Lhp;Lhp;ZI)V")
    public void method5208(class33 arg0, class220 arg1, class220 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3875 == null || this.field3875 != arg0) {
            this.method5042(arg0);
        }
        if (!arg3 && this.field3875.method243(arg1.field2690, arg1.field2691, arg1.field2692)) {
            this.method5044(arg1.field2690, arg1.field2691, arg1.field2692);
        } else {
            this.method5044(arg2.field2690, arg2.field2691, arg2.field2692);
        }
    }

    @ObfuscatedName("ko.e(IIIB)V")
    public void method5044(int arg0, int arg1, int arg2) {
        if (this.field3875 == null) {
            return;
        }
        int[] var4 = this.field3875.method245(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3875.method245(this.field3875.method259(), this.field3875.method295(), this.field3875.method260());
        }
        this.field3879 = var4[0] - this.field3875.method254() * 64;
        this.field3880 = var4[1] - this.field3875.method256() * 64;
        this.field3881 = -1;
        this.field3882 = -1;
        this.field3907 = this.method5049(this.field3875.method253());
        this.field3884 = this.field3907;
        this.field3868 = null;
        this.field3905 = null;
        this.field3877.method518();
    }

    @ObfuscatedName("ko.q(IIIIII)V")
    public void method5045(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class291.method4809(var6);
        class291.method4800(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class291.method4819(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3878.method5016();
        if (var7 < 100) {
            this.method5048(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3877.method529()) {
            this.field3877.method505(this.field3866, this.field3875.method250(), client.field973);
            if (!this.field3877.method529()) {
                return;
            }
        }
        if (this.field3892 != null) {
            this.field3894++;
            if (this.field3894 % this.field3890 == 0) {
                this.field3894 = 0;
                this.field3893++;
            }
            if (this.field3893 >= this.field3889 && !this.field3874) {
                this.field3892 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3907));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3907));
        this.field3877.method507(this.field3879 - var8 / 2, this.field3880 - var9 / 2, var8 / 2 + this.field3879, var9 / 2 + this.field3880, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3883) {
            boolean var10 = false;
            if (arg4 - this.field3902 > 100) {
                this.field3902 = arg4;
                var10 = true;
            }
            this.field3877.method508(this.field3879 - var8 / 2, this.field3880 - var9 / 2, var8 / 2 + this.field3879, var9 / 2 + this.field3880, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3900, this.field3892, this.field3894, this.field3890, var10);
        }
        boolean var11 = client.field1026 >= 2;
        if (var11 && this.field3870 != null) {
            this.field3867.method4584("Coord: " + this.field3870, class291.field3813 + 10, class291.field3811 + 20, 16776960, -1);
        }
        this.field3885 = var8;
        this.field3886 = var9;
        this.field3887 = arg0;
        this.field3901 = arg1;
        class291.method4786(var6);
    }

    @ObfuscatedName("ko.h(IIIIB)V")
    public void method5115(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3878.method5015()) {
            return;
        }
        if (!this.field3877.method529()) {
            this.field3877.method505(this.field3866, this.field3875.method250(), client.field973);
            if (!this.field3877.method529()) {
                return;
            }
        }
        this.field3877.method510(arg0, arg1, arg2, arg3, this.field3892, this.field3894, this.field3890);
    }

    @ObfuscatedName("ko.i(II)V")
    public void method5154(int arg0) {
        this.field3884 = this.method5049(arg0);
    }

    @ObfuscatedName("ko.o(IIIIII)V")
    public void method5048(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class291.method4819(arg0, arg1, arg2, arg3, -16777216);
        class291.method4797(var7 - 152, var8, 304, 34, -65536);
        class291.method4819(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3867.method4608(class233.field3207, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ko.w(II)F")
    public float method5049(int arg0) {
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

    @ObfuscatedName("ko.ah(I)I")
    public int method5050() {
        if ((double) this.field3884 == 1.0D) {
            return 25;
        } else if ((double) this.field3884 == 1.5D) {
            return 37;
        } else if ((double) this.field3884 == 2.0D) {
            return 50;
        } else if ((double) this.field3884 == 3.0D) {
            return 75;
        } else if ((double) this.field3884 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ko.ak(I)V")
    public void method5051() {
        this.field3878.method5019();
    }

    @ObfuscatedName("ko.aa(I)Z")
    public boolean method5052() {
        return this.field3878.method5015();
    }

    @ObfuscatedName("ko.ax(II)Lal;")
    public class33 method5053(int arg0) {
        Iterator var2 = this.field3873.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method248() != arg0);
        return var3;
    }

    @ObfuscatedName("ko.aq(III)V")
    public void method5054(int arg0, int arg1) {
        if (this.field3875 != null && this.field3875.method244(arg0, arg1)) {
            this.field3881 = arg0 - this.field3875.method254() * 64;
            this.field3882 = arg1 - this.field3875.method256() * 64;
        }
    }

    @ObfuscatedName("ko.au(III)V")
    public void method5055(int arg0, int arg1) {
        if (this.field3875 != null) {
            this.field3879 = arg0 - this.field3875.method254() * 64;
            this.field3880 = arg1 - this.field3875.method256() * 64;
            this.field3881 = -1;
            this.field3882 = -1;
        }
    }

    @ObfuscatedName("ko.al(IIIB)V")
    public void method5178(int arg0, int arg1, int arg2) {
        if (this.field3875 != null) {
            int[] var4 = this.field3875.method245(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5054(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ko.ae(IIII)V")
    public void method5057(int arg0, int arg1, int arg2) {
        if (this.field3875 != null) {
            int[] var4 = this.field3875.method245(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5055(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ko.aj(B)I")
    public int method5105() {
        return this.field3875 == null ? -1 : this.field3879 + this.field3875.method254() * 64;
    }

    @ObfuscatedName("ko.as(I)I")
    public int method5059() {
        return this.field3875 == null ? -1 : this.field3880 + this.field3875.method256() * 64;
    }

    @ObfuscatedName("ko.am(I)Lhp;")
    public class220 method5060() {
        return this.field3875 == null ? null : this.field3875.method258(this.method5105(), this.method5059());
    }

    @ObfuscatedName("ko.ag(I)I")
    public int method5061() {
        return this.field3885;
    }

    @ObfuscatedName("ko.aw(B)I")
    public int method5062() {
        return this.field3886;
    }

    @ObfuscatedName("ko.ap(IB)V")
    public void method5063(int arg0) {
        if (arg0 >= 1) {
            this.field3889 = arg0;
        }
    }

    @ObfuscatedName("ko.ad(I)V")
    public void method5064() {
        this.field3889 = 3;
    }

    @ObfuscatedName("ko.an(II)V")
    public void method5070(int arg0) {
        if (arg0 >= 1) {
            this.field3890 = arg0;
        }
    }

    @ObfuscatedName("ko.ai(I)V")
    public void method5066() {
        this.field3890 = 50;
    }

    @ObfuscatedName("ko.ay(ZI)V")
    public void method5217(boolean arg0) {
        this.field3874 = arg0;
    }

    @ObfuscatedName("ko.ar(II)V")
    public void method5197(int arg0) {
        this.field3892 = new HashSet();
        this.field3892.add(arg0);
        this.field3893 = 0;
        this.field3894 = 0;
    }

    @ObfuscatedName("ko.ac(II)V")
    public void method5193(int arg0) {
        this.field3892 = new HashSet();
        this.field3893 = 0;
        this.field3894 = 0;
        for (int var2 = 0; var2 < Statics.field3365.length; var2++) {
            if (Statics.field3365[var2] != null && Statics.field3365[var2].field3385 == arg0) {
                this.field3892.add(Statics.field3365[var2].field3367);
            }
        }
    }

    @ObfuscatedName("ko.af(I)V")
    public void method5185() {
        this.field3892 = null;
    }

    @ObfuscatedName("ko.ao(ZB)V")
    public void method5100(boolean arg0) {
        this.field3883 = !arg0;
    }

    @ObfuscatedName("ko.av(IZB)V")
    public void method5072(int arg0, boolean arg1) {
        if (arg1) {
            this.field3871.remove(arg0);
        } else {
            this.field3871.add(arg0);
        }
        this.method5077();
    }

    @ObfuscatedName("ko.ab(IZI)V")
    public void method5073(int arg0, boolean arg1) {
        if (arg1) {
            this.field3872.remove(arg0);
        } else {
            this.field3872.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3365.length; var3++) {
            if (Statics.field3365[var3] != null && Statics.field3365[var3].field3385 == arg0) {
                int var4 = Statics.field3365[var3].field3367;
                if (arg1) {
                    this.field3899.remove(var4);
                } else {
                    this.field3899.add(var4);
                }
            }
        }
        this.method5077();
    }

    @ObfuscatedName("ko.az(B)Z")
    public boolean method5074() {
        return !this.field3883;
    }

    @ObfuscatedName("ko.at(II)Z")
    public boolean method5153(int arg0) {
        return !this.field3871.contains(arg0);
    }

    @ObfuscatedName("ko.bj(IB)Z")
    public boolean method5109(int arg0) {
        return !this.field3872.contains(arg0);
    }

    @ObfuscatedName("ko.bq(I)V")
    public void method5077() {
        this.field3900.clear();
        this.field3900.addAll(this.field3871);
        this.field3900.addAll(this.field3899);
    }

    @ObfuscatedName("ko.bo(IIIIIII)V")
    public void method5076(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3878.method5015()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3907));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3907));
        List var9 = this.field3877.method511(this.field3879 - var7 / 2 - 1, this.field3880 - var8 / 2 - 1, var7 / 2 + this.field3879 + 1, var8 / 2 + this.field3880 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class250 var12 = Statics.field3365[var11.field514];
            var13 = false;
            for (int var14 = this.field3898.length - 1; var14 >= 0; var14--) {
                if (var12.field3378[var14] != null) {
                    client.method696(var12.field3378[var14], var12.field3375, this.field3898[var14], var11.field514, var11.field508.method3799(), var11.field507.method3799());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ko.bk(ILhp;S)Lhp;")
    public class220 method5079(int arg0, class220 arg1) {
        if (!this.field3878.method5015()) {
            return null;
        } else if (!this.field3877.method529()) {
            return null;
        } else if (this.field3875.method244(arg1.field2691, arg1.field2692)) {
            HashMap var3 = this.field3877.method547();
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
                        return var5.field507;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field507.field2691 - arg1.field2691;
                    int var10 = var8.field507.field2692 - arg1.field2692;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field507;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ko.bv(IILhp;Lhp;I)V")
    public void method5080(int arg0, int arg1, class220 arg2, class220 arg3) {
        class69 var5 = new class69();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1029(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1024(class227.field2872);
                break;
            case 1009:
                var5.method1024(class227.field2866);
                break;
            case 1010:
                var5.method1024(class227.field2873);
                break;
            case 1011:
                var5.method1024(class227.field2865);
                break;
            case 1012:
                var5.method1024(class227.field2869);
        }
        class83.method86(var5);
    }

    @ObfuscatedName("ko.ba(I)Lap;")
    public class40 method5130() {
        if (!this.field3878.method5015()) {
            return null;
        } else if (this.field3877.method529()) {
            HashMap var1 = this.field3877.method547();
            this.field3868 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3868.addAll(var3);
            }
            this.field3905 = this.field3868.iterator();
            return this.method5082();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ko.bs(B)Lap;")
    public class40 method5082() {
        if (this.field3905 == null) {
            return null;
        } else if (this.field3905.hasNext()) {
            return (class40) this.field3905.next();
        } else {
            return null;
        }
    }
}
