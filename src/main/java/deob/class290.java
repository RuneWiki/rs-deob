package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ke")
public class class290 {

    @ObfuscatedName("ke.r")
    public class236 field3826;

    @ObfuscatedName("ke.g")
    public static final class262 field3827 = class262.field3627;

    @ObfuscatedName("ke.v")
    public static final class262 field3861 = class262.field3628;

    @ObfuscatedName("ke.t")
    public static final class262 field3829 = class262.field3635;

    @ObfuscatedName("ke.y")
    public class264 field3830;

    @ObfuscatedName("ke.o")
    public HashMap field3831;

    @ObfuscatedName("ke.i")
    public class286[] field3832;

    @ObfuscatedName("ke.u")
    public HashMap field3828;

    @ObfuscatedName("ke.b")
    public class33 field3824;

    @ObfuscatedName("ke.f")
    public class33 field3835;

    @ObfuscatedName("ke.j")
    public class33 field3836;

    @ObfuscatedName("ke.x")
    public class42 field3837;

    @ObfuscatedName("ke.c")
    public class289 field3838;

    @ObfuscatedName("ke.h")
    public int field3833;

    @ObfuscatedName("ke.a")
    public int field3858;

    @ObfuscatedName("ke.z")
    public int field3841 = -1;

    @ObfuscatedName("ke.l")
    public int field3842 = -1;

    @ObfuscatedName("ke.w")
    public float field3840;

    @ObfuscatedName("ke.n")
    public float field3839;

    @ObfuscatedName("ke.m")
    public int field3845 = -1;

    @ObfuscatedName("ke.ae")
    public int field3834 = -1;

    @ObfuscatedName("ke.ai")
    public int field3847 = -1;

    @ObfuscatedName("ke.ah")
    public int field3821 = -1;

    @ObfuscatedName("ke.ab")
    public int field3846 = 3;

    @ObfuscatedName("ke.ad")
    public int field3850 = 50;

    @ObfuscatedName("ke.ag")
    public boolean field3854 = false;

    @ObfuscatedName("ke.as")
    public HashSet field3866 = null;

    @ObfuscatedName("ke.af")
    public int field3865 = -1;

    @ObfuscatedName("ke.aq")
    public int field3844 = -1;

    @ObfuscatedName("ke.am")
    public int field3855 = -1;

    @ObfuscatedName("ke.az")
    public int field3856 = -1;

    @ObfuscatedName("ke.av")
    public HashSet field3857 = new HashSet();

    @ObfuscatedName("ke.an")
    public HashSet field3849 = new HashSet();

    @ObfuscatedName("ke.ar")
    public HashSet field3859 = new HashSet();

    @ObfuscatedName("ke.aa")
    public HashSet field3853 = new HashSet();

    @ObfuscatedName("ke.aj")
    public boolean field3852 = false;

    @ObfuscatedName("ke.ap")
    public int field3860 = 0;

    @ObfuscatedName("ke.at")
    public final int[] field3863 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ke.aw")
    public List field3864;

    @ObfuscatedName("ke.ax")
    public Iterator field3862;

    @ObfuscatedName("ke.ac")
    public HashSet field3851 = new HashSet();

    @ObfuscatedName("ke.au")
    public class213 field3867 = null;

    @ObfuscatedName("ke.d(Lit;Lju;Ljava/util/HashMap;[Ljz;I)V")
    public void method4939(class236 arg0, class264 arg1, HashMap arg2, class286[] arg3) {
        this.field3832 = arg3;
        this.field3826 = arg0;
        this.field3830 = arg1;
        this.field3831 = new HashMap();
        this.field3831.put(class25.field365, arg2.get(field3827));
        this.field3831.put(class25.field363, arg2.get(field3861));
        this.field3831.put(class25.field367, arg2.get(field3829));
        this.field3838 = new class289(arg0);
        int var5 = this.field3826.method3896(class41.field562.field560);
        int[] var6 = this.field3826.method3885(var5);
        this.field3828 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class174 var8 = new class174(this.field3826.method3875(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method238(var8, var6[var7]);
            this.field3828.put(var9.method247(), var9);
            if (var9.method246()) {
                this.field3824 = var9;
            }
        }
        this.method4952(this.field3824);
        this.field3836 = null;
    }

    @ObfuscatedName("ke.k(I)I")
    public int method4940() {
        return this.field3826.method3895(this.field3824.method247(), class41.field563.field560) ? 100 : this.field3826.method3898(this.field3824.method247());
    }

    @ObfuscatedName("ke.e(IIZIIIII)V")
    public void method5044(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3838.method4927()) {
            return;
        }
        this.method4944();
        this.method4972();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3840));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3840));
        List var10 = this.field3837.method491(this.field3833 - var8 / 2 - 1, this.field3858 - var9 / 2 - 1, var8 / 2 + this.field3833 + 1, var9 / 2 + this.field3858 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class48 var15 = new class48(var13.field553, var13.field549, var13.field548);
            var14.method1044(new Object[] { var15, arg0, arg1 });
            if (this.field3851.contains(var13)) {
                var14.method1042(class220.field2804);
            } else {
                var14.method1042(class220.field2805);
            }
            class82.method2853(var14);
        }
        Iterator var16 = this.field3851.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class48 var19 = new class48(var17.field553, var17.field549, var17.field548);
                var18.method1044(new Object[] { var19, arg0, arg1 });
                var18.method1042(class220.field2803);
                class82.method2853(var18);
            }
        }
        this.field3851 = var11;
    }

    @ObfuscatedName("ke.p(IIZZI)V")
    public void method4991(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method4943(arg0, arg1, arg3);
        if (this.field3855 == -1) {
            this.field3855 = arg0;
        }
        if (this.field3856 == -1) {
            this.field3856 = arg1;
        }
        int var5 = arg0 - this.field3855;
        int var6 = arg1 - this.field3856;
        this.field3855 = arg0;
        this.field3856 = arg1;
        if (arg2 && !this.method4946()) {
            this.field3833 -= (int) ((float) var5 / this.field3839);
            this.field3858 += (int) ((float) var6 / this.field3839);
        }
    }

    @ObfuscatedName("ke.q(IIZI)V")
    public void method4943(int arg0, int arg1, boolean arg2) {
        boolean var4 = client.field1081 >= 2;
        if (!var4) {
            return;
        }
        if (this.field3835 == null) {
            this.field3867 = null;
            return;
        }
        int var5 = (int) ((float) this.field3833 + ((float) (arg0 - this.field3847) - (float) this.method4971() * this.field3840 / 2.0F) / this.field3840);
        int var6 = (int) ((float) this.field3858 - ((float) (arg1 - this.field3821) - (float) this.method5061() * this.field3840 / 2.0F) / this.field3840);
        this.field3867 = this.field3835.method243(var5 + this.field3835.method284() * 64, var6 + this.field3835.method301() * 64);
        if (this.field3867 == null || !arg2 || !class51.field656[82] || !class51.field656[81] || !arg2) {
            return;
        }
        int var7 = this.field3867.field2628;
        int var8 = this.field3867.field2625;
        int var9 = this.field3867.field2626;
        client.field965.method3210(201);
        client.field965.method3084(var8);
        client.field965.method2989(var7);
        client.field965.method2982(var9);
    }

    @ObfuscatedName("ke.s(I)V")
    public void method4944() {
        if (this.field3840 < this.field3839) {
            this.field3840 = Math.min(this.field3839, this.field3840 / 30.0F + this.field3840);
        }
        if (this.field3840 > this.field3839) {
            this.field3840 = Math.max(this.field3839, this.field3840 - this.field3840 / 30.0F);
        }
    }

    @ObfuscatedName("ke.r(I)V")
    public void method4972() {
        if (!this.method4946()) {
            return;
        }
        int var1 = this.field3841 - this.field3833;
        int var2 = this.field3842 - this.field3858;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3833 += var1;
        this.field3858 += var2;
        if (this.field3841 == this.field3833 && this.field3858 == this.field3842) {
            this.field3841 = -1;
            this.field3842 = -1;
        }
    }

    @ObfuscatedName("ke.g(B)Z")
    public boolean method4946() {
        return this.field3841 != -1 && this.field3842 != -1;
    }

    @ObfuscatedName("ke.v(IIII)Las;")
    public class33 method4947(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3828.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method240(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ke.t(IIIZI)V")
    public void method4948(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4947(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3824;
        }
        boolean var6 = false;
        if (this.field3836 != var5 || arg3) {
            this.field3836 = var5;
            this.method4952(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4949(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ke.y(IB)V")
    public void method5034(int arg0) {
        class33 var2 = this.method5041(arg0);
        if (var2 != null) {
            this.method4952(var2);
        }
    }

    @ObfuscatedName("ke.o(B)I")
    public int method4950() {
        return this.field3835 == null ? -1 : this.field3835.method281();
    }

    @ObfuscatedName("ke.i(I)Las;")
    public class33 method4951() {
        return this.field3835;
    }

    @ObfuscatedName("ke.u(Las;B)V")
    public void method4952(class33 arg0) {
        if (this.field3835 == null || this.field3835 != arg0) {
            this.method5080(arg0);
            this.method4949(-1, -1, -1);
        }
    }

    @ObfuscatedName("ke.x(Las;B)V")
    public void method5080(class33 arg0) {
        this.field3835 = arg0;
        this.field3837 = new class42(this.field3832, this.field3831);
        this.field3838.method4925(this.field3835.method247());
    }

    @ObfuscatedName("ke.c(Las;Lhl;Lhl;ZB)V")
    public void method5056(class33 arg0, class213 arg1, class213 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3835 == null || this.field3835 != arg0) {
            this.method5080(arg0);
        }
        if (!arg3 && this.field3835.method240(arg1.field2626, arg1.field2628, arg1.field2625)) {
            this.method4949(arg1.field2626, arg1.field2628, arg1.field2625);
        } else {
            this.method4949(arg2.field2626, arg2.field2628, arg2.field2625);
        }
    }

    @ObfuscatedName("ke.h(IIII)V")
    public void method4949(int arg0, int arg1, int arg2) {
        if (this.field3835 == null) {
            return;
        }
        int[] var4 = this.field3835.method253(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3835.method253(this.field3835.method256(), this.field3835.method255(), this.field3835.method257());
        }
        this.field3833 = var4[0] - this.field3835.method284() * 64;
        this.field3858 = var4[1] - this.field3835.method301() * 64;
        this.field3841 = -1;
        this.field3842 = -1;
        this.field3840 = this.method5040(this.field3835.method260());
        this.field3839 = this.field3840;
        this.field3864 = null;
        this.field3862 = null;
        this.field3837.method492();
    }

    @ObfuscatedName("ke.a(IIIIIB)V")
    public void method4955(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class283.method4681(var6);
        class283.method4679(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class283.method4762(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3838.method4928();
        if (var7 < 100) {
            this.method4958(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3837.method530()) {
            this.field3837.method486(this.field3826, this.field3835.method247(), client.field925);
            if (!this.field3837.method530()) {
                return;
            }
        }
        if (this.field3866 != null) {
            this.field3844++;
            if (this.field3844 % this.field3850 == 0) {
                this.field3844 = 0;
                this.field3865++;
            }
            if (this.field3865 >= this.field3846 && !this.field3854) {
                this.field3866 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3840));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3840));
        this.field3837.method488(this.field3833 - var8 / 2, this.field3858 - var9 / 2, var8 / 2 + this.field3833, var9 / 2 + this.field3858, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3852) {
            boolean var10 = false;
            if (arg4 - this.field3860 > 100) {
                this.field3860 = arg4;
                var10 = true;
            }
            this.field3837.method485(this.field3833 - var8 / 2, this.field3858 - var9 / 2, var8 / 2 + this.field3833, var9 / 2 + this.field3858, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3853, this.field3866, this.field3844, this.field3850, var10);
        }
        boolean var11 = client.field1081 >= 2;
        if (var11 && this.field3867 != null) {
            this.field3830.method4480("Coord: " + this.field3867, class283.field3773 + 10, class283.field3768 + 20, 16776960, -1);
        }
        this.field3845 = var8;
        this.field3834 = var9;
        this.field3847 = arg0;
        this.field3821 = arg1;
        class283.method4682(var6);
    }

    @ObfuscatedName("ke.w(IIIII)V")
    public void method5065(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3838.method4927()) {
            return;
        }
        if (!this.field3837.method530()) {
            this.field3837.method486(this.field3826, this.field3835.method247(), client.field925);
            if (!this.field3837.method530()) {
                return;
            }
        }
        this.field3837.method525(arg0, arg1, arg2, arg3, this.field3866, this.field3844, this.field3850);
    }

    @ObfuscatedName("ke.n(II)V")
    public void method4957(int arg0) {
        this.field3839 = this.method5040(arg0);
    }

    @ObfuscatedName("ke.m(IIIIII)V")
    public void method4958(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class283.method4762(arg0, arg1, arg2, arg3, -16777216);
        class283.method4698(var7 - 152, var8, 304, 34, -65536);
        class283.method4762(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3830.method4483(class226.field3139, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ke.ae(IB)F")
    public float method5040(int arg0) {
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

    @ObfuscatedName("ke.ai(I)I")
    public int method4960() {
        if ((double) this.field3839 == 1.0D) {
            return 25;
        } else if ((double) this.field3839 == 1.5D) {
            return 37;
        } else if ((double) this.field3839 == 2.0D) {
            return 50;
        } else if ((double) this.field3839 == 3.0D) {
            return 75;
        } else if ((double) this.field3839 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ke.ah(I)V")
    public void method4995() {
        this.field3838.method4926();
    }

    @ObfuscatedName("ke.ab(I)Z")
    public boolean method5098() {
        return this.field3838.method4927();
    }

    @ObfuscatedName("ke.ad(II)Las;")
    public class33 method5041(int arg0) {
        Iterator var2 = this.field3828.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method281() != arg0);
        return var3;
    }

    @ObfuscatedName("ke.ag(III)V")
    public void method4964(int arg0, int arg1) {
        if (this.field3835 != null && this.field3835.method241(arg0, arg1)) {
            this.field3841 = arg0 - this.field3835.method284() * 64;
            this.field3842 = arg1 - this.field3835.method301() * 64;
        }
    }

    @ObfuscatedName("ke.as(III)V")
    public void method5003(int arg0, int arg1) {
        if (this.field3835 != null) {
            this.field3833 = arg0 - this.field3835.method284() * 64;
            this.field3858 = arg1 - this.field3835.method301() * 64;
            this.field3841 = -1;
            this.field3842 = -1;
        }
    }

    @ObfuscatedName("ke.af(IIIB)V")
    public void method5096(int arg0, int arg1, int arg2) {
        if (this.field3835 != null) {
            int[] var4 = this.field3835.method253(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4964(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ke.aq(IIII)V")
    public void method4967(int arg0, int arg1, int arg2) {
        if (this.field3835 != null) {
            int[] var4 = this.field3835.method253(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5003(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ke.am(I)I")
    public int method5064() {
        return this.field3835 == null ? -1 : this.field3833 + this.field3835.method284() * 64;
    }

    @ObfuscatedName("ke.az(I)I")
    public int method4969() {
        return this.field3835 == null ? -1 : this.field3858 + this.field3835.method301() * 64;
    }

    @ObfuscatedName("ke.av(B)Lhl;")
    public class213 method4970() {
        return this.field3835 == null ? null : this.field3835.method243(this.method5064(), this.method4969());
    }

    @ObfuscatedName("ke.an(I)I")
    public int method4971() {
        return this.field3845;
    }

    @ObfuscatedName("ke.ar(I)I")
    public int method5061() {
        return this.field3834;
    }

    @ObfuscatedName("ke.aa(IB)V")
    public void method5067(int arg0) {
        if (arg0 >= 1) {
            this.field3846 = arg0;
        }
    }

    @ObfuscatedName("ke.aj(I)V")
    public void method4974() {
        this.field3846 = 3;
    }

    @ObfuscatedName("ke.ap(II)V")
    public void method5114(int arg0) {
        if (arg0 >= 1) {
            this.field3850 = arg0;
        }
    }

    @ObfuscatedName("ke.ao(I)V")
    public void method4976() {
        this.field3850 = 50;
    }

    @ObfuscatedName("ke.at(ZI)V")
    public void method4977(boolean arg0) {
        this.field3854 = arg0;
    }

    @ObfuscatedName("ke.aw(II)V")
    public void method4978(int arg0) {
        this.field3866 = new HashSet();
        this.field3866.add(arg0);
        this.field3865 = 0;
        this.field3844 = 0;
    }

    @ObfuscatedName("ke.ax(IB)V")
    public void method4979(int arg0) {
        this.field3866 = new HashSet();
        this.field3865 = 0;
        this.field3844 = 0;
        for (int var2 = 0; var2 < Statics.field25.length; var2++) {
            if (Statics.field25[var2] != null && Statics.field25[var2].field3310 == arg0) {
                this.field3866.add(Statics.field25[var2].field3293);
            }
        }
    }

    @ObfuscatedName("ke.ac(I)V")
    public void method4980() {
        this.field3866 = null;
    }

    @ObfuscatedName("ke.au(ZI)V")
    public void method5010(boolean arg0) {
        this.field3852 = !arg0;
    }

    @ObfuscatedName("ke.al(IZI)V")
    public void method5005(int arg0, boolean arg1) {
        if (arg1) {
            this.field3857.remove(arg0);
        } else {
            this.field3857.add(arg0);
        }
        this.method4987();
    }

    @ObfuscatedName("ke.ay(IZB)V")
    public void method4983(int arg0, boolean arg1) {
        if (arg1) {
            this.field3849.remove(arg0);
        } else {
            this.field3849.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field25.length; var3++) {
            if (Statics.field25[var3] != null && Statics.field25[var3].field3310 == arg0) {
                int var4 = Statics.field25[var3].field3293;
                if (arg1) {
                    this.field3859.remove(var4);
                } else {
                    this.field3859.add(var4);
                }
            }
        }
        this.method4987();
    }

    @ObfuscatedName("ke.ak(B)Z")
    public boolean method4984() {
        return !this.field3852;
    }

    @ObfuscatedName("ke.bj(II)Z")
    public boolean method4985(int arg0) {
        return !this.field3857.contains(arg0);
    }

    @ObfuscatedName("ke.bf(II)Z")
    public boolean method4986(int arg0) {
        return !this.field3849.contains(arg0);
    }

    @ObfuscatedName("ke.bq(I)V")
    public void method4987() {
        this.field3853.clear();
        this.field3853.addAll(this.field3857);
        this.field3853.addAll(this.field3859);
    }

    @ObfuscatedName("ke.bc(IIIIIII)V")
    public void method4988(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3838.method4927()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3840));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3840));
        List var9 = this.field3837.method491(this.field3833 - var7 / 2 - 1, this.field3858 - var8 / 2 - 1, var7 / 2 + this.field3833 + 1, var8 / 2 + this.field3858 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class243 var12 = Statics.field25[var11.field553];
            var13 = false;
            for (int var14 = this.field3863.length - 1; var14 >= 0; var14--) {
                if (var12.field3295[var14] != null) {
                    client.method52(var12.field3295[var14], var12.field3300, this.field3863[var14], var11.field553, var11.field549.method3725(), var11.field548.method3725());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ke.by(ILhl;I)Lhl;")
    public class213 method4989(int arg0, class213 arg1) {
        if (!this.field3838.method4927()) {
            return null;
        } else if (!this.field3837.method530()) {
            return null;
        } else if (this.field3835.method241(arg1.field2628, arg1.field2625)) {
            HashMap var3 = this.field3837.method494();
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
                        return var5.field548;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field548.field2628 - arg1.field2628;
                    int var10 = var8.field548.field2625 - arg1.field2625;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field548;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ke.bb(IILhl;Lhl;I)V")
    public void method4945(int arg0, int arg1, class213 arg2, class213 arg3) {
        class69 var5 = new class69();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1044(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1042(class220.field2807);
                break;
            case 1009:
                var5.method1042(class220.field2798);
                break;
            case 1010:
                var5.method1042(class220.field2799);
                break;
            case 1011:
                var5.method1042(class220.field2800);
                break;
            case 1012:
                var5.method1042(class220.field2801);
        }
        class82.method2853(var5);
    }

    @ObfuscatedName("ke.bn(I)Lar;")
    public class40 method4942() {
        if (!this.field3838.method4927()) {
            return null;
        } else if (this.field3837.method530()) {
            HashMap var1 = this.field3837.method494();
            this.field3864 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3864.addAll(var3);
            }
            this.field3862 = this.field3864.iterator();
            return this.method4992();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ke.bd(B)Lar;")
    public class40 method4992() {
        if (this.field3862 == null) {
            return null;
        } else if (this.field3862.hasNext()) {
            return (class40) this.field3862.next();
        } else {
            return null;
        }
    }
}
