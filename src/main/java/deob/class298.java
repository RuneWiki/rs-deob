package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kz")
public class class298 {

    @ObfuscatedName("kz.e")
    public class243 field3874;

    @ObfuscatedName("kz.l")
    public static final class269 field3893 = class269.field3677;

    @ObfuscatedName("kz.b")
    public static final class269 field3877 = class269.field3688;

    @ObfuscatedName("kz.n")
    public static final class269 field3871 = class269.field3675;

    @ObfuscatedName("kz.c")
    public class271 field3873;

    @ObfuscatedName("kz.a")
    public HashMap field3896;

    @ObfuscatedName("kz.y")
    public class294[] field3872;

    @ObfuscatedName("kz.w")
    public HashMap field3876;

    @ObfuscatedName("kz.k")
    public class33 field3909;

    @ObfuscatedName("kz.t")
    public class33 field3878;

    @ObfuscatedName("kz.h")
    public class33 field3879;

    @ObfuscatedName("kz.u")
    public class42 field3880;

    @ObfuscatedName("kz.r")
    public class297 field3881;

    @ObfuscatedName("kz.g")
    public int field3910;

    @ObfuscatedName("kz.z")
    public int field3883;

    @ObfuscatedName("kz.o")
    public int field3884 = -1;

    @ObfuscatedName("kz.d")
    public int field3885 = -1;

    @ObfuscatedName("kz.s")
    public float field3886;

    @ObfuscatedName("kz.f")
    public float field3887;

    @ObfuscatedName("kz.q")
    public int field3888 = -1;

    @ObfuscatedName("kz.al")
    public int field3889 = -1;

    @ObfuscatedName("kz.ao")
    public int field3890 = -1;

    @ObfuscatedName("kz.aq")
    public int field3891 = -1;

    @ObfuscatedName("kz.ab")
    public int field3892 = 3;

    @ObfuscatedName("kz.as")
    public int field3902 = 50;

    @ObfuscatedName("kz.ag")
    public boolean field3894 = false;

    @ObfuscatedName("kz.ap")
    public HashSet field3869 = null;

    @ObfuscatedName("kz.av")
    public int field3870 = -1;

    @ObfuscatedName("kz.ak")
    public int field3897 = -1;

    @ObfuscatedName("kz.at")
    public int field3898 = -1;

    @ObfuscatedName("kz.an")
    public int field3899 = -1;

    @ObfuscatedName("kz.ah")
    public HashSet field3882 = new HashSet();

    @ObfuscatedName("kz.am")
    public HashSet field3901 = new HashSet();

    @ObfuscatedName("kz.ay")
    public HashSet field3895 = new HashSet();

    @ObfuscatedName("kz.az")
    public HashSet field3903 = new HashSet();

    @ObfuscatedName("kz.aw")
    public boolean field3904 = false;

    @ObfuscatedName("kz.au")
    public int field3905 = 0;

    @ObfuscatedName("kz.ai")
    public final int[] field3875 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kz.ax")
    public List field3906;

    @ObfuscatedName("kz.af")
    public Iterator field3908;

    @ObfuscatedName("kz.aa")
    public HashSet field3907 = new HashSet();

    @ObfuscatedName("kz.ad")
    public class220 field3865 = null;

    @ObfuscatedName("kz.m(Lik;Ljt;Ljava/util/HashMap;[Lko;B)V")
    public void method5027(class243 arg0, class271 arg1, HashMap arg2, class294[] arg3) {
        this.field3872 = arg3;
        this.field3874 = arg0;
        this.field3873 = arg1;
        this.field3896 = new HashMap();
        this.field3896.put(class25.field357, arg2.get(field3893));
        this.field3896.put(class25.field349, arg2.get(field3877));
        this.field3896.put(class25.field350, arg2.get(field3871));
        this.field3881 = new class297(arg0);
        int var5 = this.field3874.method3985(class41.field515.field513);
        int[] var6 = this.field3874.method3936(var5);
        this.field3876 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class181 var8 = new class181(this.field3874.method3930(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method331(var8, var6[var7]);
            this.field3876.put(var9.method278(), var9);
            if (var9.method275()) {
                this.field3909 = var9;
            }
        }
        this.method5185(this.field3909);
        this.field3879 = null;
    }

    @ObfuscatedName("kz.p(B)I")
    public int method5088() {
        return this.field3874.method3946(this.field3909.method278(), class41.field516.field513) ? 100 : this.field3874.method3974(this.field3909.method278());
    }

    @ObfuscatedName("kz.i(IIZIIIII)V")
    public void method5029(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3881.method5014()) {
            return;
        }
        this.method5032();
        this.method5033();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3886));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3886));
        List var10 = this.field3880.method534(this.field3910 - var8 / 2 - 1, this.field3883 - var9 / 2 - 1, var8 / 2 + this.field3910 + 1, var9 / 2 + this.field3883 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class48 var15 = new class48(var13.field509, var13.field499, var13.field500);
            var14.method1040(new Object[] { var15, arg0, arg1 });
            if (this.field3907.contains(var13)) {
                var14.method1041(class227.field2869);
            } else {
                var14.method1041(class227.field2867);
            }
            class83.method1986(var14);
        }
        Iterator var16 = this.field3907.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class48 var19 = new class48(var17.field509, var17.field499, var17.field500);
                var18.method1040(new Object[] { var19, arg0, arg1 });
                var18.method1041(class227.field2864);
                class83.method1986(var18);
            }
        }
        this.field3907 = var11;
    }

    @ObfuscatedName("kz.j(IIZZI)V")
    public void method5168(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method5031(arg0, arg1, arg3);
        if (this.field3898 == -1) {
            this.field3898 = arg0;
        }
        if (this.field3899 == -1) {
            this.field3899 = arg1;
        }
        int var5 = arg0 - this.field3898;
        int var6 = arg1 - this.field3899;
        this.field3898 = arg0;
        this.field3899 = arg1;
        if (arg2 && !this.method5034()) {
            this.field3910 -= (int) ((float) var5 / this.field3887);
            this.field3883 += (int) ((float) var6 / this.field3887);
        }
    }

    @ObfuscatedName("kz.v(IIZI)V")
    public void method5031(int arg0, int arg1, boolean arg2) {
        if (!client.method594()) {
            return;
        }
        if (this.field3878 == null) {
            this.field3865 = null;
            return;
        }
        int var4 = (int) ((float) this.field3910 + ((float) (arg0 - this.field3890) - (float) this.method5060() * this.field3886 / 2.0F) / this.field3886);
        int var5 = (int) ((float) this.field3883 - ((float) (arg1 - this.field3891) - (float) this.method5063() * this.field3886 / 2.0F) / this.field3886);
        this.field3865 = this.field3878.method286(var4 + this.field3878.method282() * 64, var5 + this.field3878.method284() * 64);
        if (this.field3865 == null || !arg2 || !class51.field619[82] || !class51.field619[81] || !arg2) {
            return;
        }
        int var6 = this.field3865.field2692;
        int var7 = this.field3865.field2691;
        int var8 = this.field3865.field2695;
        class171 var9 = class171.method1482(class168.field2387, client.field953.field1479);
        var9.field2424.method2997(var7);
        var9.field2424.method3067(var6);
        var9.field2424.method2996(var8);
        client.field953.method1783(var9);
    }

    @ObfuscatedName("kz.x(B)V")
    public void method5032() {
        if (this.field3886 < this.field3887) {
            this.field3886 = Math.min(this.field3887, this.field3886 / 30.0F + this.field3886);
        }
        if (this.field3886 > this.field3887) {
            this.field3886 = Math.max(this.field3887, this.field3886 - this.field3886 / 30.0F);
        }
    }

    @ObfuscatedName("kz.e(I)V")
    public void method5033() {
        if (!this.method5034()) {
            return;
        }
        int var1 = this.field3884 - this.field3910;
        int var2 = this.field3885 - this.field3883;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3910 += var1;
        this.field3883 += var2;
        if (this.field3910 == this.field3884 && this.field3885 == this.field3883) {
            this.field3884 = -1;
            this.field3885 = -1;
        }
    }

    @ObfuscatedName("kz.l(I)Z")
    public boolean method5034() {
        return this.field3884 != -1 && this.field3885 != -1;
    }

    @ObfuscatedName("kz.b(IIII)Lap;")
    public class33 method5035(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3876.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method303(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kz.n(IIIZI)V")
    public void method5110(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5035(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3909;
        }
        boolean var6 = false;
        if (this.field3879 != var5 || arg3) {
            this.field3879 = var5;
            this.method5185(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5053(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kz.c(II)V")
    public void method5037(int arg0) {
        class33 var2 = this.method5052(arg0);
        if (var2 != null) {
            this.method5185(var2);
        }
    }

    @ObfuscatedName("kz.a(I)I")
    public int method5038() {
        return this.field3878 == null ? -1 : this.field3878.method351();
    }

    @ObfuscatedName("kz.y(I)Lap;")
    public class33 method5039() {
        return this.field3878;
    }

    @ObfuscatedName("kz.w(Lap;I)V")
    public void method5185(class33 arg0) {
        if (this.field3878 == null || this.field3878 != arg0) {
            this.method5041(arg0);
            this.method5053(-1, -1, -1);
        }
    }

    @ObfuscatedName("kz.k(Lap;I)V")
    public void method5041(class33 arg0) {
        this.field3878 = arg0;
        this.field3880 = new class42(this.field3872, this.field3896);
        this.field3881.method5012(this.field3878.method278());
    }

    @ObfuscatedName("kz.t(Lap;Lhq;Lhq;ZB)V")
    public void method5042(class33 arg0, class220 arg1, class220 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3878 == null || this.field3878 != arg0) {
            this.method5041(arg0);
        }
        if (!arg3 && this.field3878.method303(arg1.field2695, arg1.field2692, arg1.field2691)) {
            this.method5053(arg1.field2695, arg1.field2692, arg1.field2691);
        } else {
            this.method5053(arg2.field2695, arg2.field2692, arg2.field2691);
        }
    }

    @ObfuscatedName("kz.h(IIII)V")
    public void method5053(int arg0, int arg1, int arg2) {
        if (this.field3878 == null) {
            return;
        }
        int[] var4 = this.field3878.method273(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3878.method273(this.field3878.method276(), this.field3878.method287(), this.field3878.method288());
        }
        this.field3910 = var4[0] - this.field3878.method282() * 64;
        this.field3883 = var4[1] - this.field3878.method284() * 64;
        this.field3884 = -1;
        this.field3885 = -1;
        this.field3886 = this.method5048(this.field3878.method281());
        this.field3887 = this.field3886;
        this.field3906 = null;
        this.field3908 = null;
        this.field3880.method533();
    }

    @ObfuscatedName("kz.u(IIIIII)V")
    public void method5044(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class291.method4766(var6);
        class291.method4833(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class291.method4776(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3881.method5013();
        if (var7 < 100) {
            this.method5047(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3880.method540()) {
            this.field3880.method537(this.field3874, this.field3878.method278(), client.field874);
            if (!this.field3880.method540()) {
                return;
            }
        }
        if (this.field3869 != null) {
            this.field3897++;
            if (this.field3897 % this.field3902 == 0) {
                this.field3897 = 0;
                this.field3870++;
            }
            if (this.field3870 >= this.field3892 && !this.field3894) {
                this.field3869 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3886));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3886));
        this.field3880.method535(this.field3910 - var8 / 2, this.field3883 - var9 / 2, var8 / 2 + this.field3910, var9 / 2 + this.field3883, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3904) {
            boolean var10 = false;
            if (arg4 - this.field3905 > 100) {
                this.field3905 = arg4;
                var10 = true;
            }
            this.field3880.method531(this.field3910 - var8 / 2, this.field3883 - var9 / 2, var8 / 2 + this.field3910, var9 / 2 + this.field3883, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3903, this.field3869, this.field3897, this.field3902, var10);
        }
        if (client.method594() && this.field3865 != null) {
            this.field3873.method4560("Coord: " + this.field3865, class291.field3815 + 10, class291.field3816 + 20, 16776960, -1);
        }
        this.field3888 = var8;
        this.field3889 = var9;
        this.field3890 = arg0;
        this.field3891 = arg1;
        class291.method4791(var6);
    }

    @ObfuscatedName("kz.r(IIIIB)V")
    public void method5045(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3881.method5014()) {
            return;
        }
        if (!this.field3880.method540()) {
            this.field3880.method537(this.field3874, this.field3878.method278(), client.field874);
            if (!this.field3880.method540()) {
                return;
            }
        }
        this.field3880.method577(arg0, arg1, arg2, arg3, this.field3869, this.field3897, this.field3902);
    }

    @ObfuscatedName("kz.o(II)V")
    public void method5046(int arg0) {
        this.field3887 = this.method5048(arg0);
    }

    @ObfuscatedName("kz.q(IIIIIB)V")
    public void method5047(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class291.method4776(arg0, arg1, arg2, arg3, -16777216);
        class291.method4782(var7 - 152, var8, 304, 34, -65536);
        class291.method4776(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3873.method4563(class233.field3205, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kz.al(IB)F")
    public float method5048(int arg0) {
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

    @ObfuscatedName("kz.ao(I)I")
    public int method5061() {
        if ((double) this.field3887 == 1.0D) {
            return 25;
        } else if ((double) this.field3887 == 1.5D) {
            return 37;
        } else if ((double) this.field3887 == 2.0D) {
            return 50;
        } else if ((double) this.field3887 == 3.0D) {
            return 75;
        } else if ((double) this.field3887 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kz.aq(I)V")
    public void method5130() {
        this.field3881.method5023();
    }

    @ObfuscatedName("kz.ab(I)Z")
    public boolean method5051() {
        return this.field3881.method5014();
    }

    @ObfuscatedName("kz.as(II)Lap;")
    public class33 method5052(int arg0) {
        Iterator var2 = this.field3876.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method351() != arg0);
        return var3;
    }

    @ObfuscatedName("kz.ag(III)V")
    public void method5140(int arg0, int arg1) {
        if (this.field3878 != null && this.field3878.method272(arg0, arg1)) {
            this.field3884 = arg0 - this.field3878.method282() * 64;
            this.field3885 = arg1 - this.field3878.method284() * 64;
        }
    }

    @ObfuscatedName("kz.ap(III)V")
    public void method5054(int arg0, int arg1) {
        if (this.field3878 != null) {
            this.field3910 = arg0 - this.field3878.method282() * 64;
            this.field3883 = arg1 - this.field3878.method284() * 64;
            this.field3884 = -1;
            this.field3885 = -1;
        }
    }

    @ObfuscatedName("kz.av(IIII)V")
    public void method5055(int arg0, int arg1, int arg2) {
        if (this.field3878 != null) {
            int[] var4 = this.field3878.method273(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5140(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kz.ak(IIII)V")
    public void method5056(int arg0, int arg1, int arg2) {
        if (this.field3878 != null) {
            int[] var4 = this.field3878.method273(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5054(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kz.at(B)I")
    public int method5117() {
        return this.field3878 == null ? -1 : this.field3910 + this.field3878.method282() * 64;
    }

    @ObfuscatedName("kz.an(I)I")
    public int method5058() {
        return this.field3878 == null ? -1 : this.field3883 + this.field3878.method284() * 64;
    }

    @ObfuscatedName("kz.ah(I)Lhq;")
    public class220 method5172() {
        return this.field3878 == null ? null : this.field3878.method286(this.method5117(), this.method5058());
    }

    @ObfuscatedName("kz.am(B)I")
    public int method5060() {
        return this.field3888;
    }

    @ObfuscatedName("kz.ay(I)I")
    public int method5063() {
        return this.field3889;
    }

    @ObfuscatedName("kz.az(II)V")
    public void method5163(int arg0) {
        if (arg0 >= 1) {
            this.field3892 = arg0;
        }
    }

    @ObfuscatedName("kz.aw(I)V")
    public void method5206() {
        this.field3892 = 3;
    }

    @ObfuscatedName("kz.au(II)V")
    public void method5064(int arg0) {
        if (arg0 >= 1) {
            this.field3902 = arg0;
        }
    }

    @ObfuscatedName("kz.ac(I)V")
    public void method5169() {
        this.field3902 = 50;
    }

    @ObfuscatedName("kz.ai(ZI)V")
    public void method5066(boolean arg0) {
        this.field3894 = arg0;
    }

    @ObfuscatedName("kz.ax(II)V")
    public void method5067(int arg0) {
        this.field3869 = new HashSet();
        this.field3869.add(arg0);
        this.field3870 = 0;
        this.field3897 = 0;
    }

    @ObfuscatedName("kz.af(II)V")
    public void method5085(int arg0) {
        this.field3869 = new HashSet();
        this.field3870 = 0;
        this.field3897 = 0;
        for (int var2 = 0; var2 < Statics.field3359.length; var2++) {
            if (Statics.field3359[var2] != null && Statics.field3359[var2].field3370 == arg0) {
                this.field3869.add(Statics.field3359[var2].field3353);
            }
        }
    }

    @ObfuscatedName("kz.aa(I)V")
    public void method5069() {
        this.field3869 = null;
    }

    @ObfuscatedName("kz.ad(ZS)V")
    public void method5147(boolean arg0) {
        this.field3904 = !arg0;
    }

    @ObfuscatedName("kz.aj(IZI)V")
    public void method5118(int arg0, boolean arg1) {
        if (arg1) {
            this.field3882.remove(arg0);
        } else {
            this.field3882.add(arg0);
        }
        this.method5030();
    }

    @ObfuscatedName("kz.ae(IZB)V")
    public void method5072(int arg0, boolean arg1) {
        if (arg1) {
            this.field3901.remove(arg0);
        } else {
            this.field3901.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3359.length; var3++) {
            if (Statics.field3359[var3] != null && Statics.field3359[var3].field3370 == arg0) {
                int var4 = Statics.field3359[var3].field3353;
                if (arg1) {
                    this.field3895.remove(var4);
                } else {
                    this.field3895.add(var4);
                }
            }
        }
        this.method5030();
    }

    @ObfuscatedName("kz.ar(I)Z")
    public boolean method5073() {
        return !this.field3904;
    }

    @ObfuscatedName("kz.bu(II)Z")
    public boolean method5074(int arg0) {
        return !this.field3882.contains(arg0);
    }

    @ObfuscatedName("kz.bk(IB)Z")
    public boolean method5075(int arg0) {
        return !this.field3901.contains(arg0);
    }

    @ObfuscatedName("kz.bo(B)V")
    public void method5030() {
        this.field3903.clear();
        this.field3903.addAll(this.field3882);
        this.field3903.addAll(this.field3895);
    }

    @ObfuscatedName("kz.bl(IIIIIIB)V")
    public void method5028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3881.method5014()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3886));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3886));
        List var9 = this.field3880.method534(this.field3910 - var7 / 2 - 1, this.field3883 - var8 / 2 - 1, var7 / 2 + this.field3910 + 1, var8 / 2 + this.field3883 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class250 var12 = Statics.field3359[var11.field509];
            var13 = false;
            for (int var14 = this.field3875.length - 1; var14 >= 0; var14--) {
                if (var12.field3360[var14] != null) {
                    client.method968(var12.field3360[var14], var12.field3364, this.field3875[var14], var11.field509, var11.field499.method3769(), var11.field500.method3769());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kz.bw(ILhq;I)Lhq;")
    public class220 method5131(int arg0, class220 arg1) {
        if (!this.field3881.method5014()) {
            return null;
        } else if (!this.field3880.method540()) {
            return null;
        } else if (this.field3878.method272(arg1.field2692, arg1.field2691)) {
            HashMap var3 = this.field3880.method541();
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
                        return var5.field500;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field500.field2692 - arg1.field2692;
                    int var10 = var8.field500.field2691 - arg1.field2691;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field500;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kz.bj(IILhq;Lhq;S)V")
    public void method5078(int arg0, int arg1, class220 arg2, class220 arg3) {
        class69 var5 = new class69();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1040(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1041(class227.field2871);
                break;
            case 1009:
                var5.method1041(class227.field2863);
                break;
            case 1010:
                var5.method1041(class227.field2866);
                break;
            case 1011:
                var5.method1041(class227.field2862);
                break;
            case 1012:
                var5.method1041(class227.field2868);
        }
        class83.method1986(var5);
    }

    @ObfuscatedName("kz.bn(I)Lay;")
    public class40 method5079() {
        if (!this.field3881.method5014()) {
            return null;
        } else if (this.field3880.method540()) {
            HashMap var1 = this.field3880.method541();
            this.field3906 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3906.addAll(var3);
            }
            this.field3908 = this.field3906.iterator();
            return this.method5080();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kz.bt(B)Lay;")
    public class40 method5080() {
        if (this.field3908 == null) {
            return null;
        } else if (this.field3908.hasNext()) {
            return (class40) this.field3908.next();
        } else {
            return null;
        }
    }
}
