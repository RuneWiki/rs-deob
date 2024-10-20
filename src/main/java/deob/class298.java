package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kw")
public class class298 {

    @ObfuscatedName("kw.u")
    public class243 field3897;

    @ObfuscatedName("kw.t")
    public static final class269 field3895 = class269.field3672;

    @ObfuscatedName("kw.k")
    public static final class269 field3879 = class269.field3670;

    @ObfuscatedName("kw.n")
    public static final class269 field3870 = class269.field3674;

    @ObfuscatedName("kw.d")
    public class271 field3875;

    @ObfuscatedName("kw.o")
    public HashMap field3872;

    @ObfuscatedName("kw.a")
    public class294[] field3873;

    @ObfuscatedName("kw.q")
    public HashMap field3874;

    @ObfuscatedName("kw.j")
    public class33 field3882;

    @ObfuscatedName("kw.m")
    public class33 field3864;

    @ObfuscatedName("kw.h")
    public class33 field3877;

    @ObfuscatedName("kw.c")
    public class42 field3878;

    @ObfuscatedName("kw.y")
    public class297 field3892;

    @ObfuscatedName("kw.p")
    public int field3868;

    @ObfuscatedName("kw.i")
    public int field3881;

    @ObfuscatedName("kw.l")
    public int field3901 = -1;

    @ObfuscatedName("kw.z")
    public int field3883 = -1;

    @ObfuscatedName("kw.e")
    public float field3907;

    @ObfuscatedName("kw.v")
    public float field3885;

    @ObfuscatedName("kw.w")
    public int field3886 = -1;

    @ObfuscatedName("kw.av")
    public int field3887 = -1;

    @ObfuscatedName("kw.au")
    public int field3888 = -1;

    @ObfuscatedName("kw.ae")
    public int field3898 = -1;

    @ObfuscatedName("kw.ak")
    public int field3890 = 3;

    @ObfuscatedName("kw.aq")
    public int field3871 = 50;

    @ObfuscatedName("kw.an")
    public boolean field3880 = false;

    @ObfuscatedName("kw.am")
    public HashSet field3893 = null;

    @ObfuscatedName("kw.ar")
    public int field3899 = -1;

    @ObfuscatedName("kw.ao")
    public int field3891 = -1;

    @ObfuscatedName("kw.at")
    public int field3896 = -1;

    @ObfuscatedName("kw.ac")
    public int field3869 = -1;

    @ObfuscatedName("kw.as")
    public HashSet field3903 = new HashSet();

    @ObfuscatedName("kw.ah")
    public HashSet field3863 = new HashSet();

    @ObfuscatedName("kw.aw")
    public HashSet field3900 = new HashSet();

    @ObfuscatedName("kw.al")
    public HashSet field3884 = new HashSet();

    @ObfuscatedName("kw.aj")
    public boolean field3876 = false;

    @ObfuscatedName("kw.ap")
    public int field3867 = 0;

    @ObfuscatedName("kw.af")
    public final int[] field3904 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kw.ay")
    public List field3905;

    @ObfuscatedName("kw.ab")
    public Iterator field3906;

    @ObfuscatedName("kw.ax")
    public HashSet field3889 = new HashSet();

    @ObfuscatedName("kw.ai")
    public class220 field3908 = null;

    @ObfuscatedName("kw.b(Lij;Ljn;Ljava/util/HashMap;[Lks;I)V")
    public void method4919(class243 arg0, class271 arg1, HashMap arg2, class294[] arg3) {
        this.field3873 = arg3;
        this.field3897 = arg0;
        this.field3875 = arg1;
        this.field3872 = new HashMap();
        this.field3872.put(class25.field336, arg2.get(field3895));
        this.field3872.put(class25.field330, arg2.get(field3879));
        this.field3872.put(class25.field331, arg2.get(field3870));
        this.field3892 = new class297(arg0);
        int var5 = this.field3897.method3832(class41.field508.field505);
        int[] var6 = this.field3897.method3827(var5);
        this.field3874 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class181 var8 = new class181(this.field3897.method3887(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method242(var8, var6[var7]);
            this.field3874.put(var9.method229(), var9);
            if (var9.method228()) {
                this.field3882 = var9;
            }
        }
        this.method4931(this.field3882);
        this.field3877 = null;
    }

    @ObfuscatedName("kw.s(I)I")
    public int method4920() {
        return this.field3897.method3836(this.field3882.method229(), class41.field503.field505) ? 100 : this.field3897.method3837(this.field3882.method229());
    }

    @ObfuscatedName("kw.r(IIZIIIIB)V")
    public void method4921(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3892.method4907()) {
            return;
        }
        this.method5068();
        this.method4924();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3907));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3907));
        List var10 = this.field3878.method479(this.field3868 - var8 / 2 - 1, this.field3881 - var9 / 2 - 1, var8 / 2 + this.field3868 + 1, var9 / 2 + this.field3881 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class48 var15 = new class48(var13.field499, var13.field492, var13.field493);
            var14.method949(new Object[] { var15, arg0, arg1 });
            if (this.field3889.contains(var13)) {
                var14.method950(class227.field2856);
            } else {
                var14.method950(class227.field2858);
            }
            class83.method12(var14);
        }
        Iterator var16 = this.field3889.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class48 var19 = new class48(var17.field499, var17.field492, var17.field493);
                var18.method949(new Object[] { var19, arg0, arg1 });
                var18.method950(class227.field2859);
                class83.method12(var18);
            }
        }
        this.field3889 = var11;
    }

    @ObfuscatedName("kw.g(IIZZI)V")
    public void method4922(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method4923(arg0, arg1, arg3);
        if (this.field3896 == -1) {
            this.field3896 = arg0;
        }
        if (this.field3869 == -1) {
            this.field3869 = arg1;
        }
        int var5 = arg0 - this.field3896;
        int var6 = arg1 - this.field3869;
        this.field3896 = arg0;
        this.field3869 = arg1;
        if (arg2 && !this.method4925()) {
            this.field3868 -= (int) ((float) var5 / this.field3885);
            this.field3881 += (int) ((float) var6 / this.field3885);
        }
    }

    @ObfuscatedName("kw.x(IIZB)V")
    public void method4923(int arg0, int arg1, boolean arg2) {
        boolean var4 = client.field1015 >= 2;
        if (!var4) {
            return;
        }
        if (this.field3864 == null) {
            this.field3908 = null;
            return;
        }
        int var5 = (int) ((float) this.field3868 + ((float) (arg0 - this.field3888) - (float) this.method4951() * this.field3907 / 2.0F) / this.field3907);
        int var6 = (int) ((float) this.field3881 - ((float) (arg1 - this.field3898) - (float) this.method5011() * this.field3907 / 2.0F) / this.field3907);
        this.field3908 = this.field3864.method225(var5 + this.field3864.method226() * 64, var6 + this.field3864.method235() * 64);
        if (this.field3908 != null && arg2 && class51.field579[82] && class51.field579[81] && arg2) {
            client.method63(this.field3908.field2683, this.field3908.field2684, this.field3908.field2682);
        }
    }

    @ObfuscatedName("kw.f(I)V")
    public void method5068() {
        if (this.field3907 < this.field3885) {
            this.field3907 = Math.min(this.field3885, this.field3907 / 30.0F + this.field3907);
        }
        if (this.field3907 > this.field3885) {
            this.field3907 = Math.max(this.field3885, this.field3907 - this.field3907 / 30.0F);
        }
    }

    @ObfuscatedName("kw.u(S)V")
    public void method4924() {
        if (!this.method4925()) {
            return;
        }
        int var1 = this.field3901 - this.field3868;
        int var2 = this.field3883 - this.field3881;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3868 += var1;
        this.field3881 += var2;
        if (this.field3901 == this.field3868 && this.field3883 == this.field3881) {
            this.field3901 = -1;
            this.field3883 = -1;
        }
    }

    @ObfuscatedName("kw.t(B)Z")
    public boolean method4925() {
        return this.field3901 != -1 && this.field3883 != -1;
    }

    @ObfuscatedName("kw.k(IIII)Lam;")
    public class33 method4926(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3874.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method245(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kw.n(IIIZI)V")
    public void method4927(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method4926(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3882;
        }
        boolean var6 = false;
        if (this.field3877 != var5 || arg3) {
            this.field3877 = var5;
            this.method4931(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method4973(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kw.d(IB)V")
    public void method4957(int arg0) {
        class33 var2 = this.method4943(arg0);
        if (var2 != null) {
            this.method4931(var2);
        }
    }

    @ObfuscatedName("kw.o(B)I")
    public int method4929() {
        return this.field3864 == null ? -1 : this.field3864.method227();
    }

    @ObfuscatedName("kw.a(I)Lam;")
    public class33 method4930() {
        return this.field3864;
    }

    @ObfuscatedName("kw.q(Lam;B)V")
    public void method4931(class33 arg0) {
        if (this.field3864 == null || this.field3864 != arg0) {
            this.method4928(arg0);
            this.method4973(-1, -1, -1);
        }
    }

    @ObfuscatedName("kw.j(Lam;I)V")
    public void method4928(class33 arg0) {
        this.field3864 = arg0;
        this.field3878 = new class42(this.field3873, this.field3872);
        this.field3892.method4905(this.field3864.method229());
    }

    @ObfuscatedName("kw.c(Lam;Lhk;Lhk;ZB)V")
    public void method4933(class33 arg0, class220 arg1, class220 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3864 == null || this.field3864 != arg0) {
            this.method4928(arg0);
        }
        if (!arg3 && this.field3864.method245(arg1.field2682, arg1.field2683, arg1.field2684)) {
            this.method4973(arg1.field2682, arg1.field2683, arg1.field2684);
        } else {
            this.method4973(arg2.field2682, arg2.field2683, arg2.field2684);
        }
    }

    @ObfuscatedName("kw.i(IIII)V")
    public void method4973(int arg0, int arg1, int arg2) {
        if (this.field3864 == null) {
            return;
        }
        int[] var4 = this.field3864.method224(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3864.method224(this.field3864.method238(), this.field3864.method248(), this.field3864.method239());
        }
        this.field3868 = var4[0] - this.field3864.method226() * 64;
        this.field3881 = var4[1] - this.field3864.method235() * 64;
        this.field3901 = -1;
        this.field3883 = -1;
        this.field3907 = this.method5031(this.field3864.method234());
        this.field3885 = this.field3907;
        this.field3905 = null;
        this.field3906 = null;
        this.field3878.method487();
    }

    @ObfuscatedName("kw.l(IIIIIB)V")
    public void method4939(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class291.method4665(var6);
        class291.method4712(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class291.method4671(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3892.method4911();
        if (var7 < 100) {
            this.method4938(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3878.method481()) {
            this.field3878.method473(this.field3897, this.field3864.method229(), client.field1058);
            if (!this.field3878.method481()) {
                return;
            }
        }
        if (this.field3893 != null) {
            this.field3891++;
            if (this.field3891 % this.field3871 == 0) {
                this.field3891 = 0;
                this.field3899++;
            }
            if (this.field3899 >= this.field3890 && !this.field3880) {
                this.field3893 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3907));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3907));
        this.field3878.method496(this.field3868 - var8 / 2, this.field3881 - var9 / 2, var8 / 2 + this.field3868, var9 / 2 + this.field3881, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3876) {
            boolean var10 = false;
            if (arg4 - this.field3867 > 100) {
                this.field3867 = arg4;
                var10 = true;
            }
            this.field3878.method477(this.field3868 - var8 / 2, this.field3881 - var9 / 2, var8 / 2 + this.field3868, var9 / 2 + this.field3881, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3884, this.field3893, this.field3891, this.field3871, var10);
        }
        boolean var11 = client.field1015 >= 2;
        if (var11 && this.field3908 != null) {
            this.field3875.method4464("Coord: " + this.field3908, class291.field3808 + 10, class291.field3809 + 20, 16776960, -1);
        }
        this.field3886 = var8;
        this.field3887 = var9;
        this.field3888 = arg0;
        this.field3898 = arg1;
        class291.method4679(var6);
    }

    @ObfuscatedName("kw.z(IIIIB)V")
    public void method5063(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3892.method4907()) {
            return;
        }
        if (!this.field3878.method481()) {
            this.field3878.method473(this.field3897, this.field3864.method229(), client.field1058);
            if (!this.field3878.method481()) {
                return;
            }
        }
        this.field3878.method478(arg0, arg1, arg2, arg3, this.field3893, this.field3891, this.field3871);
    }

    @ObfuscatedName("kw.e(II)V")
    public void method4937(int arg0) {
        this.field3885 = this.method5031(arg0);
    }

    @ObfuscatedName("kw.v(IIIIII)V")
    public void method4938(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class291.method4671(arg0, arg1, arg2, arg3, -16777216);
        class291.method4678(var7 - 152, var8, 304, 34, -65536);
        class291.method4671(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3875.method4467(class233.field3199, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kw.w(IB)F")
    public float method5031(int arg0) {
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

    @ObfuscatedName("kw.av(I)I")
    public int method4961() {
        if ((double) this.field3885 == 1.0D) {
            return 25;
        } else if ((double) this.field3885 == 1.5D) {
            return 37;
        } else if ((double) this.field3885 == 2.0D) {
            return 50;
        } else if ((double) this.field3885 == 3.0D) {
            return 75;
        } else if ((double) this.field3885 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kw.au(S)V")
    public void method4941() {
        this.field3892.method4916();
    }

    @ObfuscatedName("kw.ae(S)Z")
    public boolean method5100() {
        return this.field3892.method4907();
    }

    @ObfuscatedName("kw.ak(II)Lam;")
    public class33 method4943(int arg0) {
        Iterator var2 = this.field3874.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method227() != arg0);
        return var3;
    }

    @ObfuscatedName("kw.aq(IIB)V")
    public void method4944(int arg0, int arg1) {
        if (this.field3864 != null && this.field3864.method223(arg0, arg1)) {
            this.field3901 = arg0 - this.field3864.method226() * 64;
            this.field3883 = arg1 - this.field3864.method235() * 64;
        }
    }

    @ObfuscatedName("kw.an(IIS)V")
    public void method4945(int arg0, int arg1) {
        if (this.field3864 != null) {
            this.field3868 = arg0 - this.field3864.method226() * 64;
            this.field3881 = arg1 - this.field3864.method235() * 64;
            this.field3901 = -1;
            this.field3883 = -1;
        }
    }

    @ObfuscatedName("kw.am(IIIB)V")
    public void method5076(int arg0, int arg1, int arg2) {
        if (this.field3864 != null) {
            int[] var4 = this.field3864.method224(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4944(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kw.ar(IIIB)V")
    public void method4947(int arg0, int arg1, int arg2) {
        if (this.field3864 != null) {
            int[] var4 = this.field3864.method224(arg0, arg1, arg2);
            if (var4 != null) {
                this.method4945(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kw.ao(I)I")
    public int method5096() {
        return this.field3864 == null ? -1 : this.field3868 + this.field3864.method226() * 64;
    }

    @ObfuscatedName("kw.at(I)I")
    public int method4949() {
        return this.field3864 == null ? -1 : this.field3881 + this.field3864.method235() * 64;
    }

    @ObfuscatedName("kw.ac(I)Lhk;")
    public class220 method4950() {
        return this.field3864 == null ? null : this.field3864.method225(this.method5096(), this.method4949());
    }

    @ObfuscatedName("kw.as(I)I")
    public int method4951() {
        return this.field3886;
    }

    @ObfuscatedName("kw.ah(B)I")
    public int method5011() {
        return this.field3887;
    }

    @ObfuscatedName("kw.aw(II)V")
    public void method4953(int arg0) {
        if (arg0 >= 1) {
            this.field3890 = arg0;
        }
    }

    @ObfuscatedName("kw.al(B)V")
    public void method5098() {
        this.field3890 = 3;
    }

    @ObfuscatedName("kw.aj(IB)V")
    public void method4936(int arg0) {
        if (arg0 >= 1) {
            this.field3871 = arg0;
        }
    }

    @ObfuscatedName("kw.ap(I)V")
    public void method4956() {
        this.field3871 = 50;
    }

    @ObfuscatedName("kw.ag(ZI)V")
    public void method5008(boolean arg0) {
        this.field3880 = arg0;
    }

    @ObfuscatedName("kw.af(IS)V")
    public void method4998(int arg0) {
        this.field3893 = new HashSet();
        this.field3893.add(arg0);
        this.field3899 = 0;
        this.field3891 = 0;
    }

    @ObfuscatedName("kw.ay(II)V")
    public void method4959(int arg0) {
        this.field3893 = new HashSet();
        this.field3899 = 0;
        this.field3891 = 0;
        for (int var2 = 0; var2 < Statics.field3346.length; var2++) {
            if (Statics.field3346[var2] != null && Statics.field3346[var2].field3366 == arg0) {
                this.field3893.add(Statics.field3346[var2].field3349);
            }
        }
    }

    @ObfuscatedName("kw.ab(I)V")
    public void method5007() {
        this.field3893 = null;
    }

    @ObfuscatedName("kw.ax(ZI)V")
    public void method4918(boolean arg0) {
        this.field3876 = !arg0;
    }

    @ObfuscatedName("kw.ai(IZI)V")
    public void method4962(int arg0, boolean arg1) {
        if (arg1) {
            this.field3903.remove(arg0);
        } else {
            this.field3903.add(arg0);
        }
        this.method4967();
    }

    @ObfuscatedName("kw.az(IZB)V")
    public void method5012(int arg0, boolean arg1) {
        if (arg1) {
            this.field3863.remove(arg0);
        } else {
            this.field3863.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3346.length; var3++) {
            if (Statics.field3346[var3] != null && Statics.field3346[var3].field3366 == arg0) {
                int var4 = Statics.field3346[var3].field3349;
                if (arg1) {
                    this.field3900.remove(var4);
                } else {
                    this.field3900.add(var4);
                }
            }
        }
        this.method4967();
    }

    @ObfuscatedName("kw.aa(B)Z")
    public boolean method5077() {
        return !this.field3876;
    }

    @ObfuscatedName("kw.ad(II)Z")
    public boolean method4965(int arg0) {
        return !this.field3903.contains(arg0);
    }

    @ObfuscatedName("kw.ba(II)Z")
    public boolean method5051(int arg0) {
        return !this.field3863.contains(arg0);
    }

    @ObfuscatedName("kw.bi(S)V")
    public void method4967() {
        this.field3884.clear();
        this.field3884.addAll(this.field3903);
        this.field3884.addAll(this.field3900);
    }

    @ObfuscatedName("kw.bq(IIIIIII)V")
    public void method4968(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3892.method4907()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3907));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3907));
        List var9 = this.field3878.method479(this.field3868 - var7 / 2 - 1, this.field3881 - var8 / 2 - 1, var7 / 2 + this.field3868 + 1, var8 / 2 + this.field3881 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class250 var12 = Statics.field3346[var11.field499];
            var13 = false;
            for (int var14 = this.field3904.length - 1; var14 >= 0; var14--) {
                if (var12.field3350[var14] != null) {
                    client.method289(var12.field3350[var14], var12.field3354, this.field3904[var14], var11.field499, var11.field492.method3685(), var11.field493.method3685());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kw.bc(ILhk;I)Lhk;")
    public class220 method5054(int arg0, class220 arg1) {
        if (!this.field3892.method4907()) {
            return null;
        } else if (!this.field3878.method481()) {
            return null;
        } else if (this.field3864.method223(arg1.field2683, arg1.field2684)) {
            HashMap var3 = this.field3878.method482();
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
                        return var5.field493;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field493.field2683 - arg1.field2683;
                    int var10 = var8.field493.field2684 - arg1.field2684;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field493;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kw.bb(IILhk;Lhk;I)V")
    public void method4970(int arg0, int arg1, class220 arg2, class220 arg3) {
        class69 var5 = new class69();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method949(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method950(class227.field2853);
                break;
            case 1009:
                var5.method950(class227.field2854);
                break;
            case 1010:
                var5.method950(class227.field2855);
                break;
            case 1011:
                var5.method950(class227.field2860);
                break;
            case 1012:
                var5.method950(class227.field2857);
        }
        class83.method12(var5);
    }

    @ObfuscatedName("kw.bl(B)Law;")
    public class40 method5013() {
        if (!this.field3892.method4907()) {
            return null;
        } else if (this.field3878.method481()) {
            HashMap var1 = this.field3878.method482();
            this.field3905 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3905.addAll(var3);
            }
            this.field3906 = this.field3905.iterator();
            return this.method5064();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kw.bt(I)Law;")
    public class40 method5064() {
        if (this.field3906 == null) {
            return null;
        } else if (this.field3906.hasNext()) {
            return (class40) this.field3906.next();
        } else {
            return null;
        }
    }
}
