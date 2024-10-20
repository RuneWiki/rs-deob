package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kk")
public class class290 {

    @ObfuscatedName("kk.p")
    public class236 field3830;

    @ObfuscatedName("kk.e")
    public static final class262 field3825 = class262.field3629;

    @ObfuscatedName("kk.d")
    public static final class262 field3842 = class262.field3623;

    @ObfuscatedName("kk.x")
    public static final class262 field3827 = class262.field3628;

    @ObfuscatedName("kk.z")
    public class264 field3836;

    @ObfuscatedName("kk.n")
    public HashMap field3843;

    @ObfuscatedName("kk.u")
    public class286[] field3848;

    @ObfuscatedName("kk.t")
    public HashMap field3831;

    @ObfuscatedName("kk.a")
    public class33 field3832;

    @ObfuscatedName("kk.i")
    public class33 field3833;

    @ObfuscatedName("kk.h")
    public class33 field3834;

    @ObfuscatedName("kk.b")
    public class42 field3835;

    @ObfuscatedName("kk.j")
    public class289 field3862;

    @ObfuscatedName("kk.y")
    public int field3837;

    @ObfuscatedName("kk.k")
    public int field3828;

    @ObfuscatedName("kk.c")
    public int field3839 = -1;

    @ObfuscatedName("kk.r")
    public int field3823 = -1;

    @ObfuscatedName("kk.m")
    public float field3841;

    @ObfuscatedName("kk.l")
    public float field3852;

    @ObfuscatedName("kk.f")
    public int field3840 = -1;

    @ObfuscatedName("kk.ap")
    public int field3844 = -1;

    @ObfuscatedName("kk.af")
    public int field3859 = -1;

    @ObfuscatedName("kk.aa")
    public int field3846 = -1;

    @ObfuscatedName("kk.ay")
    public int field3847 = 3;

    @ObfuscatedName("kk.aw")
    public int field3863 = 50;

    @ObfuscatedName("kk.az")
    public boolean field3849 = false;

    @ObfuscatedName("kk.at")
    public HashSet field3850 = null;

    @ObfuscatedName("kk.ao")
    public int field3851 = -1;

    @ObfuscatedName("kk.aq")
    public int field3860 = -1;

    @ObfuscatedName("kk.ax")
    public int field3854 = -1;

    @ObfuscatedName("kk.av")
    public int field3824 = -1;

    @ObfuscatedName("kk.al")
    public HashSet field3855 = new HashSet();

    @ObfuscatedName("kk.ae")
    public HashSet field3856 = new HashSet();

    @ObfuscatedName("kk.ab")
    public HashSet field3838 = new HashSet();

    @ObfuscatedName("kk.aj")
    public HashSet field3858 = new HashSet();

    @ObfuscatedName("kk.ac")
    public boolean field3857 = false;

    @ObfuscatedName("kk.ad")
    public int field3829 = 0;

    @ObfuscatedName("kk.ah")
    public final int[] field3845 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kk.ak")
    public List field3819;

    @ObfuscatedName("kk.ar")
    public Iterator field3853;

    @ObfuscatedName("kk.ag")
    public HashSet field3864 = new HashSet();

    @ObfuscatedName("kk.ai")
    public class213 field3865 = null;

    @ObfuscatedName("kk.w(Lip;Ljh;Ljava/util/HashMap;[Ljo;I)V")
    public void method4942(class236 arg0, class264 arg1, HashMap arg2, class286[] arg3) {
        this.field3848 = arg3;
        this.field3830 = arg0;
        this.field3836 = arg1;
        this.field3843 = new HashMap();
        this.field3843.put(class25.field379, arg2.get(field3825));
        this.field3843.put(class25.field370, arg2.get(field3842));
        this.field3843.put(class25.field371, arg2.get(field3827));
        this.field3862 = new class289(arg0);
        int var5 = this.field3830.method3955(class41.field568.field564);
        int[] var6 = this.field3830.method3886(var5);
        this.field3831 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class174 var8 = new class174(this.field3830.method3876(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method245(var8, var6[var7]);
            this.field3831.put(var9.method244(), var9);
            if (var9.method253()) {
                this.field3832 = var9;
            }
        }
        this.method5047(this.field3832);
        this.field3834 = null;
    }

    @ObfuscatedName("kk.s(B)I")
    public int method4943() {
        return this.field3830.method3896(this.field3832.method244(), class41.field567.field564) ? 100 : this.field3830.method3899(this.field3832.method244());
    }

    @ObfuscatedName("kk.q(IIZIIIII)V")
    public void method5131(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3862.method4937()) {
            return;
        }
        this.method4947();
        this.method4948();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3841));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3841));
        List var10 = this.field3835.method528(this.field3837 - var8 / 2 - 1, this.field3828 - var9 / 2 - 1, var8 / 2 + this.field3837 + 1, var9 / 2 + this.field3828 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class48 var15 = new class48(var13.field557, var13.field560, var13.field549);
            var14.method1011(new Object[] { var15, arg0, arg1 });
            if (this.field3864.contains(var13)) {
                var14.method1009(class220.field2784);
            } else {
                var14.method1009(class220.field2786);
            }
            class82.method730(var14);
        }
        Iterator var16 = this.field3864.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class48 var19 = new class48(var17.field557, var17.field560, var17.field549);
                var18.method1011(new Object[] { var19, arg0, arg1 });
                var18.method1009(class220.field2785);
                class82.method730(var18);
            }
        }
        this.field3864 = var11;
    }

    @ObfuscatedName("kk.o(IIZZI)V")
    public void method4945(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method5057(arg0, arg1, arg3);
        if (this.field3854 == -1) {
            this.field3854 = arg0;
        }
        if (this.field3824 == -1) {
            this.field3824 = arg1;
        }
        int var5 = arg0 - this.field3854;
        int var6 = arg1 - this.field3824;
        this.field3854 = arg0;
        this.field3824 = arg1;
        if (arg2 && !this.method5115()) {
            this.field3837 -= (int) ((float) var5 / this.field3852);
            this.field3828 += (int) ((float) var6 / this.field3852);
        }
    }

    @ObfuscatedName("kk.g(IIZB)V")
    public void method5057(int arg0, int arg1, boolean arg2) {
        boolean var4 = client.field1082 >= 2;
        if (!var4) {
            return;
        }
        if (this.field3833 == null) {
            this.field3865 = null;
            return;
        }
        int var5 = (int) ((float) this.field3837 + ((float) (arg0 - this.field3859) - (float) this.method5006() * this.field3841 / 2.0F) / this.field3841);
        int var6 = (int) ((float) this.field3828 - ((float) (arg1 - this.field3846) - (float) this.method5059() * this.field3841 / 2.0F) / this.field3841);
        this.field3865 = this.field3833.method250(var5 + this.field3833.method258() * 64, var6 + this.field3833.method260() * 64);
        if (this.field3865 == null || !arg2 || !class51.field660[82] || !class51.field660[81] || !arg2) {
            return;
        }
        int var7 = this.field3865.field2602;
        int var8 = this.field3865.field2603;
        int var9 = this.field3865.field2601;
        client.field968.method3236(30);
        client.field968.method3093(var8);
        client.field968.method3093(var7);
        client.field968.method2996(var9);
    }

    @ObfuscatedName("kk.v(B)V")
    public void method4947() {
        if (this.field3841 < this.field3852) {
            this.field3841 = Math.min(this.field3852, this.field3841 / 30.0F + this.field3841);
        }
        if (this.field3841 > this.field3852) {
            this.field3841 = Math.max(this.field3852, this.field3841 - this.field3841 / 30.0F);
        }
    }

    @ObfuscatedName("kk.p(I)V")
    public void method4948() {
        if (!this.method5115()) {
            return;
        }
        int var1 = this.field3839 - this.field3837;
        int var2 = this.field3823 - this.field3828;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3837 += var1;
        this.field3828 += var2;
        if (this.field3839 == this.field3837 && this.field3828 == this.field3823) {
            this.field3839 = -1;
            this.field3823 = -1;
        }
    }

    @ObfuscatedName("kk.e(I)Z")
    public boolean method5115() {
        return this.field3839 != -1 && this.field3823 != -1;
    }

    @ObfuscatedName("kk.d(IIII)Lat;")
    public class33 method5130(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3831.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method247(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kk.x(IIIZI)V")
    public void method5014(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5130(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3832;
        }
        boolean var6 = false;
        if (this.field3834 != var5 || arg3) {
            this.field3834 = var5;
            this.method5047(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4958(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kk.u(II)V")
    public void method4952(int arg0) {
        class33 var2 = this.method4967(arg0);
        if (var2 != null) {
            this.method5047(var2);
        }
    }

    @ObfuscatedName("kk.i(S)I")
    public int method4953() {
        return this.field3833 == null ? -1 : this.field3833.method252();
    }

    @ObfuscatedName("kk.h(I)Lat;")
    public class33 method4954() {
        return this.field3833;
    }

    @ObfuscatedName("kk.b(Lat;I)V")
    public void method5047(class33 arg0) {
        if (this.field3833 == null || this.field3833 != arg0) {
            this.method4956(arg0);
            this.method4958(-1, -1, -1);
        }
    }

    @ObfuscatedName("kk.j(Lat;I)V")
    public void method4956(class33 arg0) {
        this.field3833 = arg0;
        this.field3835 = new class42(this.field3848, this.field3843);
        this.field3862.method4927(this.field3833.method244());
    }

    @ObfuscatedName("kk.y(Lat;Lhg;Lhg;ZI)V")
    public void method4957(class33 arg0, class213 arg1, class213 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3833 == null || this.field3833 != arg0) {
            this.method4956(arg0);
        }
        if (!arg3 && this.field3833.method247(arg1.field2601, arg1.field2602, arg1.field2603)) {
            this.method4958(arg1.field2601, arg1.field2602, arg1.field2603);
        } else {
            this.method4958(arg2.field2601, arg2.field2602, arg2.field2603);
        }
    }

    @ObfuscatedName("kk.c(IIII)V")
    public void method4958(int arg0, int arg1, int arg2) {
        if (this.field3833 == null) {
            return;
        }
        int[] var4 = this.field3833.method291(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3833.method291(this.field3833.method313(), this.field3833.method262(), this.field3833.method246());
        }
        this.field3837 = var4[0] - this.field3833.method258() * 64;
        this.field3828 = var4[1] - this.field3833.method260() * 64;
        this.field3839 = -1;
        this.field3823 = -1;
        this.field3841 = this.method4963(this.field3833.method270());
        this.field3852 = this.field3841;
        this.field3819 = null;
        this.field3853 = null;
        this.field3835.method516();
    }

    @ObfuscatedName("kk.r(IIIIII)V")
    public void method4959(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class283.method4749(var6);
        class283.method4723(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class283.method4704(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3862.method4930();
        if (var7 < 100) {
            this.method4962(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3835.method498()) {
            this.field3835.method490(this.field3830, this.field3833.method244(), client.field1105);
            if (!this.field3835.method498()) {
                return;
            }
        }
        if (this.field3850 != null) {
            this.field3860++;
            if (this.field3860 % this.field3863 == 0) {
                this.field3860 = 0;
                this.field3851++;
            }
            if (this.field3851 >= this.field3847 && !this.field3849) {
                this.field3850 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3841));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3841));
        this.field3835.method533(this.field3837 - var8 / 2, this.field3828 - var9 / 2, var8 / 2 + this.field3837, var9 / 2 + this.field3828, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3857) {
            boolean var10 = false;
            if (arg4 - this.field3829 > 100) {
                this.field3829 = arg4;
                var10 = true;
            }
            this.field3835.method493(this.field3837 - var8 / 2, this.field3828 - var9 / 2, var8 / 2 + this.field3837, var9 / 2 + this.field3828, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3858, this.field3850, this.field3860, this.field3863, var10);
        }
        boolean var11 = client.field1082 >= 2;
        if (var11 && this.field3865 != null) {
            this.field3836.method4508("Coord: " + this.field3865, class283.field3768 + 10, class283.field3771 + 20, 16776960, -1);
        }
        this.field3840 = var8;
        this.field3844 = var9;
        this.field3859 = arg0;
        this.field3846 = arg1;
        class283.method4699(var6);
    }

    @ObfuscatedName("kk.m(IIIII)V")
    public void method4960(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3862.method4937()) {
            return;
        }
        if (!this.field3835.method498()) {
            this.field3835.method490(this.field3830, this.field3833.method244(), client.field1105);
            if (!this.field3835.method498()) {
                return;
            }
        }
        this.field3835.method495(arg0, arg1, arg2, arg3, this.field3850, this.field3860, this.field3863);
    }

    @ObfuscatedName("kk.l(II)V")
    public void method4961(int arg0) {
        this.field3852 = this.method4963(arg0);
    }

    @ObfuscatedName("kk.f(IIIIII)V")
    public void method4962(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class283.method4704(arg0, arg1, arg2, arg3, -16777216);
        class283.method4741(var7 - 152, var8, 304, 34, -65536);
        class283.method4704(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3836.method4511(class226.field3133, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kk.ap(II)F")
    public float method4963(int arg0) {
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

    @ObfuscatedName("kk.af(I)I")
    public int method4946() {
        if ((double) this.field3852 == 1.0D) {
            return 25;
        } else if ((double) this.field3852 == 1.5D) {
            return 37;
        } else if ((double) this.field3852 == 2.0D) {
            return 50;
        } else if ((double) this.field3852 == 3.0D) {
            return 75;
        } else if ((double) this.field3852 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kk.aa(I)V")
    public void method5015() {
        this.field3862.method4938();
    }

    @ObfuscatedName("kk.ay(I)Z")
    public boolean method5086() {
        return this.field3862.method4937();
    }

    @ObfuscatedName("kk.aw(II)Lat;")
    public class33 method4967(int arg0) {
        Iterator var2 = this.field3831.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method252() != arg0);
        return var3;
    }

    @ObfuscatedName("kk.az(IIB)V")
    public void method4968(int arg0, int arg1) {
        if (this.field3833 != null && this.field3833.method267(arg0, arg1)) {
            this.field3839 = arg0 - this.field3833.method258() * 64;
            this.field3823 = arg1 - this.field3833.method260() * 64;
        }
    }

    @ObfuscatedName("kk.at(IIB)V")
    public void method4969(int arg0, int arg1) {
        if (this.field3833 != null) {
            this.field3837 = arg0 - this.field3833.method258() * 64;
            this.field3828 = arg1 - this.field3833.method260() * 64;
            this.field3839 = -1;
            this.field3823 = -1;
        }
    }

    @ObfuscatedName("kk.ao(IIIB)V")
    public void method5118(int arg0, int arg1, int arg2) {
        if (this.field3833 != null) {
            int[] var4 = this.field3833.method291(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4968(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kk.aq(IIII)V")
    public void method4971(int arg0, int arg1, int arg2) {
        if (this.field3833 != null) {
            int[] var4 = this.field3833.method291(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4969(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kk.ax(I)I")
    public int method4972() {
        return this.field3833 == null ? -1 : this.field3837 + this.field3833.method258() * 64;
    }

    @ObfuscatedName("kk.av(I)I")
    public int method4973() {
        return this.field3833 == null ? -1 : this.field3828 + this.field3833.method260() * 64;
    }

    @ObfuscatedName("kk.al(I)Lhg;")
    public class213 method4941() {
        return this.field3833 == null ? null : this.field3833.method250(this.method4972(), this.method4973());
    }

    @ObfuscatedName("kk.ae(I)I")
    public int method5006() {
        return this.field3840;
    }

    @ObfuscatedName("kk.ab(B)I")
    public int method5059() {
        return this.field3844;
    }

    @ObfuscatedName("kk.aj(II)V")
    public void method4977(int arg0) {
        if (arg0 >= 1) {
            this.field3847 = arg0;
        }
    }

    @ObfuscatedName("kk.ac(I)V")
    public void method4978() {
        this.field3847 = 3;
    }

    @ObfuscatedName("kk.ad(II)V")
    public void method4979(int arg0) {
        if (arg0 >= 1) {
            this.field3863 = arg0;
        }
    }

    @ObfuscatedName("kk.am(I)V")
    public void method4980() {
        this.field3863 = 50;
    }

    @ObfuscatedName("kk.ah(ZI)V")
    public void method4981(boolean arg0) {
        this.field3849 = arg0;
    }

    @ObfuscatedName("kk.ak(IB)V")
    public void method5017(int arg0) {
        this.field3850 = new HashSet();
        this.field3850.add(arg0);
        this.field3851 = 0;
        this.field3860 = 0;
    }

    @ObfuscatedName("kk.ar(II)V")
    public void method4983(int arg0) {
        this.field3850 = new HashSet();
        this.field3851 = 0;
        this.field3860 = 0;
        for (int var2 = 0; var2 < Statics.field3286.length; var2++) {
            if (Statics.field3286[var2] != null && Statics.field3286[var2].field3305 == arg0) {
                this.field3850.add(Statics.field3286[var2].field3288);
            }
        }
    }

    @ObfuscatedName("kk.ag(B)V")
    public void method5053() {
        this.field3850 = null;
    }

    @ObfuscatedName("kk.ai(ZI)V")
    public void method5008(boolean arg0) {
        this.field3857 = !arg0;
    }

    @ObfuscatedName("kk.au(IZI)V")
    public void method4986(int arg0, boolean arg1) {
        if (arg1) {
            this.field3855.remove(arg0);
        } else {
            this.field3855.add(arg0);
        }
        this.method4991();
    }

    @ObfuscatedName("kk.an(IZI)V")
    public void method5099(int arg0, boolean arg1) {
        if (arg1) {
            this.field3856.remove(arg0);
        } else {
            this.field3856.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3286.length; var3++) {
            if (Statics.field3286[var3] != null && Statics.field3286[var3].field3305 == arg0) {
                int var4 = Statics.field3286[var3].field3288;
                if (arg1) {
                    this.field3838.remove(var4);
                } else {
                    this.field3838.add(var4);
                }
            }
        }
        this.method4991();
    }

    @ObfuscatedName("kk.as(I)Z")
    public boolean method4988() {
        return !this.field3857;
    }

    @ObfuscatedName("kk.br(II)Z")
    public boolean method4989(int arg0) {
        return !this.field3855.contains(arg0);
    }

    @ObfuscatedName("kk.bj(IB)Z")
    public boolean method4990(int arg0) {
        return !this.field3856.contains(arg0);
    }

    @ObfuscatedName("kk.bf(B)V")
    public void method4991() {
        this.field3858.clear();
        this.field3858.addAll(this.field3855);
        this.field3858.addAll(this.field3838);
    }

    @ObfuscatedName("kk.bw(IIIIIII)V")
    public void method5090(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3862.method4937()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3841));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3841));
        List var9 = this.field3835.method528(this.field3837 - var7 / 2 - 1, this.field3828 - var8 / 2 - 1, var7 / 2 + this.field3837 + 1, var8 / 2 + this.field3828 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class243 var12 = Statics.field3286[var11.field557];
            var13 = false;
            for (int var14 = this.field3845.length - 1; var14 >= 0; var14--) {
                if (var12.field3294[var14] != null) {
                    client.method3771(var12.field3294[var14], var12.field3292, this.field3845[var14], var11.field557, var11.field560.method3720(), var11.field549.method3720());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kk.bs(ILhg;I)Lhg;")
    public class213 method4985(int arg0, class213 arg1) {
        if (!this.field3862.method4937()) {
            return null;
        } else if (!this.field3835.method498()) {
            return null;
        } else if (this.field3833.method267(arg1.field2602, arg1.field2603)) {
            HashMap var3 = this.field3835.method499();
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
                        return var5.field549;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field549.field2602 - arg1.field2602;
                    int var10 = var8.field549.field2603 - arg1.field2603;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field549;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kk.bp(IILhg;Lhg;B)V")
    public void method4994(int arg0, int arg1, class213 arg2, class213 arg3) {
        class69 var5 = new class69();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1011(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1009(class220.field2780);
                break;
            case 1009:
                var5.method1009(class220.field2779);
                break;
            case 1010:
                var5.method1009(class220.field2781);
                break;
            case 1011:
                var5.method1009(class220.field2782);
                break;
            case 1012:
                var5.method1009(class220.field2783);
        }
        class82.method730(var5);
    }

    @ObfuscatedName("kk.bv(I)Lab;")
    public class40 method4944() {
        if (!this.field3862.method4937()) {
            return null;
        } else if (this.field3835.method498()) {
            HashMap var1 = this.field3835.method499();
            this.field3819 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3819.addAll(var3);
            }
            this.field3853 = this.field3819.iterator();
            return this.method4996();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kk.bi(S)Lab;")
    public class40 method4996() {
        if (this.field3853 == null) {
            return null;
        } else if (this.field3853.hasNext()) {
            return (class40) this.field3853.next();
        } else {
            return null;
        }
    }
}
