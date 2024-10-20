package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("kl")
public class class302 {

    @ObfuscatedName("kl.s")
    public class247 field3926;

    @ObfuscatedName("kl.b")
    public static final class273 field3886 = class273.field3705;

    @ObfuscatedName("kl.e")
    public static final class273 field3905 = class273.field3707;

    @ObfuscatedName("kl.f")
    public static final class273 field3888 = class273.field3708;

    @ObfuscatedName("kl.z")
    public class275 field3889;

    @ObfuscatedName("kl.u")
    public HashMap field3890;

    @ObfuscatedName("kl.p")
    public class298[] field3891;

    @ObfuscatedName("kl.w")
    public HashMap field3919;

    @ObfuscatedName("kl.t")
    public class33 field3893;

    @ObfuscatedName("kl.o")
    public class33 field3894;

    @ObfuscatedName("kl.a")
    public class33 field3895;

    @ObfuscatedName("kl.i")
    public class42 field3896;

    @ObfuscatedName("kl.m")
    public class301 field3908;

    @ObfuscatedName("kl.x")
    public int field3898;

    @ObfuscatedName("kl.l")
    public int field3917;

    @ObfuscatedName("kl.j")
    public int field3885 = -1;

    @ObfuscatedName("kl.g")
    public int field3914 = -1;

    @ObfuscatedName("kl.c")
    public float field3892;

    @ObfuscatedName("kl.k")
    public float field3903;

    @ObfuscatedName("kl.q")
    public int field3904 = -1;

    @ObfuscatedName("kl.ac")
    public int field3887 = -1;

    @ObfuscatedName("kl.aw")
    public int field3906 = -1;

    @ObfuscatedName("kl.at")
    public int field3907 = -1;

    @ObfuscatedName("kl.ag")
    public int field3901 = 3;

    @ObfuscatedName("kl.ad")
    public int field3883 = 50;

    @ObfuscatedName("kl.af")
    public boolean field3910 = false;

    @ObfuscatedName("kl.az")
    public HashSet field3911 = null;

    @ObfuscatedName("kl.ae")
    public int field3912 = -1;

    @ObfuscatedName("kl.av")
    public int field3913 = -1;

    @ObfuscatedName("kl.am")
    public int field3925 = -1;

    @ObfuscatedName("kl.ax")
    public int field3915 = -1;

    @ObfuscatedName("kl.ah")
    public HashSet field3916 = new HashSet();

    @ObfuscatedName("kl.ab")
    public HashSet field3900 = new HashSet();

    @ObfuscatedName("kl.aj")
    public HashSet field3909 = new HashSet();

    @ObfuscatedName("kl.aa")
    public HashSet field3897 = new HashSet();

    @ObfuscatedName("kl.ao")
    public boolean field3920 = false;

    @ObfuscatedName("kl.al")
    public int field3921 = 0;

    @ObfuscatedName("kl.aq")
    public final int[] field3922 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("kl.ak")
    public List field3923;

    @ObfuscatedName("kl.as")
    public Iterator field3924;

    @ObfuscatedName("kl.au")
    public HashSet field3902 = new HashSet();

    @ObfuscatedName("kl.an")
    public class224 field3918 = null;

    @ObfuscatedName("kl.n(Lil;Ljz;Ljava/util/HashMap;[Lkm;I)V")
    public void method5001(class247 arg0, class275 arg1, HashMap arg2, class298[] arg3) {
        this.field3891 = arg3;
        this.field3926 = arg0;
        this.field3889 = arg1;
        this.field3890 = new HashMap();
        this.field3890.put(class25.field352, arg2.get(field3886));
        this.field3890.put(class25.field349, arg2.get(field3905));
        this.field3890.put(class25.field350, arg2.get(field3888));
        this.field3908 = new class301(arg0);
        int var5 = this.field3926.method4007(class41.field523.field518);
        int[] var6 = this.field3926.method3976(var5);
        this.field3919 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3926.method3931(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method304(var8, var6[var7]);
            this.field3919.put(var9.method247(), var9);
            if (var9.method302()) {
                this.field3893 = var9;
            }
        }
        this.method5022(this.field3893);
        this.field3895 = null;
    }

    @ObfuscatedName("kl.v(I)I")
    public int method5002() {
        return this.field3926.method3937(this.field3893.method247(), class41.field522.field518) ? 100 : this.field3926.method3940(this.field3893.method247());
    }

    @ObfuscatedName("kl.y(IIZIIIII)V")
    public void method5003(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3908.method4991()) {
            return;
        }
        this.method5006();
        this.method5007();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3892));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3892));
        List var10 = this.field3896.method518(this.field3898 - var8 / 2 - 1, this.field3917 - var9 / 2 - 1, var8 / 2 + this.field3898 + 1, var9 / 2 + this.field3917 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class69 var14 = new class69();
            class48 var15 = new class48(var13.field513, var13.field510, var13.field515);
            var14.method1010(new Object[] { var15, arg0, arg1 });
            if (this.field3902.contains(var13)) {
                var14.method1009(class231.field2907);
            } else {
                var14.method1009(class231.field2900);
            }
            class83.method1505(var14);
        }
        Iterator var16 = this.field3902.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class69 var18 = new class69();
                class48 var19 = new class48(var17.field513, var17.field510, var17.field515);
                var18.method1010(new Object[] { var19, arg0, arg1 });
                var18.method1009(class231.field2906);
                class83.method1505(var18);
            }
        }
        this.field3902 = var11;
    }

    @ObfuscatedName("kl.r(IIZZB)V")
    public void method5152(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method5005(arg0, arg1, arg3);
        if (this.field3925 == -1) {
            this.field3925 = arg0;
        }
        if (this.field3915 == -1) {
            this.field3915 = arg1;
        }
        int var5 = arg0 - this.field3925;
        int var6 = arg1 - this.field3915;
        this.field3925 = arg0;
        this.field3915 = arg1;
        if (arg2 && !this.method5101()) {
            this.field3898 -= (int) ((float) var5 / this.field3903);
            this.field3917 += (int) ((float) var6 / this.field3903);
        }
    }

    @ObfuscatedName("kl.h(IIZB)V")
    public void method5005(int arg0, int arg1, boolean arg2) {
        boolean var4 = client.field1023 >= 2;
        if (!var4) {
            return;
        }
        if (this.field3894 == null) {
            this.field3918 = null;
            return;
        }
        int var5 = (int) ((float) this.field3898 + ((float) (arg0 - this.field3906) - (float) this.method5034() * this.field3892 / 2.0F) / this.field3892);
        int var6 = (int) ((float) this.field3917 - ((float) (arg1 - this.field3907) - (float) this.method5035() * this.field3892 / 2.0F) / this.field3892);
        this.field3918 = this.field3894.method248(var5 + this.field3894.method266() * 64, var6 + this.field3894.method258() * 64);
        if (this.field3918 != null && arg2 && class51.field609[82] && class51.field609[81] && arg2) {
            client.method13(this.field3918.field2730, this.field3918.field2731, this.field3918.field2729);
        }
    }

    @ObfuscatedName("kl.d(I)V")
    public void method5006() {
        if (this.field3892 < this.field3903) {
            this.field3892 = Math.min(this.field3903, this.field3892 / 30.0F + this.field3892);
        }
        if (this.field3892 > this.field3903) {
            this.field3892 = Math.max(this.field3903, this.field3892 - this.field3892 / 30.0F);
        }
    }

    @ObfuscatedName("kl.s(B)V")
    public void method5007() {
        if (!this.method5101()) {
            return;
        }
        int var1 = this.field3885 - this.field3898;
        int var2 = this.field3914 - this.field3917;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3898 += var1;
        this.field3917 += var2;
        if (this.field3898 == this.field3885 && this.field3917 == this.field3914) {
            this.field3885 = -1;
            this.field3914 = -1;
        }
    }

    @ObfuscatedName("kl.b(B)Z")
    public boolean method5101() {
        return this.field3885 != -1 && this.field3914 != -1;
    }

    @ObfuscatedName("kl.e(IIII)Laz;")
    public class33 method5009(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3919.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method245(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("kl.f(IIIZS)V")
    public void method5174(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5009(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3893;
        }
        boolean var6 = false;
        if (this.field3895 != var5 || arg3) {
            this.field3895 = var5;
            this.method5022(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5017(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("kl.u(II)V")
    public void method5011(int arg0) {
        class33 var2 = this.method5026(arg0);
        if (var2 != null) {
            this.method5022(var2);
        }
    }

    @ObfuscatedName("kl.t(I)I")
    public int method5131() {
        return this.field3894 == null ? -1 : this.field3894.method250();
    }

    @ObfuscatedName("kl.o(B)Laz;")
    public class33 method5013() {
        return this.field3894;
    }

    @ObfuscatedName("kl.a(Laz;B)V")
    public void method5022(class33 arg0) {
        if (this.field3894 == null || this.field3894 != arg0) {
            this.method5015(arg0);
            this.method5017(-1, -1, -1);
        }
    }

    @ObfuscatedName("kl.i(Laz;I)V")
    public void method5015(class33 arg0) {
        this.field3894 = arg0;
        this.field3896 = new class42(this.field3891, this.field3890);
        this.field3908.method4989(this.field3894.method247());
    }

    @ObfuscatedName("kl.m(Laz;Lht;Lht;ZI)V")
    public void method5016(class33 arg0, class224 arg1, class224 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3894 == null || this.field3894 != arg0) {
            this.method5015(arg0);
        }
        if (!arg3 && this.field3894.method245(arg1.field2729, arg1.field2730, arg1.field2731)) {
            this.method5017(arg1.field2729, arg1.field2730, arg1.field2731);
        } else {
            this.method5017(arg2.field2729, arg2.field2730, arg2.field2731);
        }
    }

    @ObfuscatedName("kl.x(IIII)V")
    public void method5017(int arg0, int arg1, int arg2) {
        if (this.field3894 == null) {
            return;
        }
        int[] var4 = this.field3894.method291(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3894.method291(this.field3894.method261(), this.field3894.method243(), this.field3894.method262());
        }
        this.field3898 = var4[0] - this.field3894.method266() * 64;
        this.field3917 = var4[1] - this.field3894.method258() * 64;
        this.field3885 = -1;
        this.field3914 = -1;
        this.field3892 = this.method5008(this.field3894.method257());
        this.field3903 = this.field3892;
        this.field3923 = null;
        this.field3924 = null;
        this.field3896.method525();
    }

    @ObfuscatedName("kl.j(IIIIIB)V")
    public void method5124(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class295.method4740(var6);
        class295.method4810(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class295.method4752(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3908.method4992();
        if (var7 < 100) {
            this.method5021(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3896.method497()) {
            this.field3896.method516(this.field3926, this.field3894.method247(), client.field875);
            if (!this.field3896.method497()) {
                return;
            }
        }
        if (this.field3911 != null) {
            this.field3913++;
            if (this.field3913 % this.field3883 == 0) {
                this.field3913 = 0;
                this.field3912++;
            }
            if (this.field3912 >= this.field3901 && !this.field3910) {
                this.field3911 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3892));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3892));
        this.field3896.method491(this.field3898 - var8 / 2, this.field3917 - var9 / 2, var8 / 2 + this.field3898, var9 / 2 + this.field3917, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3920) {
            boolean var10 = false;
            if (arg4 - this.field3921 > 100) {
                this.field3921 = arg4;
                var10 = true;
            }
            this.field3896.method489(this.field3898 - var8 / 2, this.field3917 - var9 / 2, var8 / 2 + this.field3898, var9 / 2 + this.field3917, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3897, this.field3911, this.field3913, this.field3883, var10);
        }
        boolean var11 = client.field1023 >= 2;
        if (var11 && this.field3918 != null) {
            this.field3889.method4546("Coord: " + this.field3918, class295.field3836 + 10, class295.field3834 + 20, 16776960, -1);
        }
        this.field3904 = var8;
        this.field3887 = var9;
        this.field3906 = arg0;
        this.field3907 = arg1;
        class295.method4741(var6);
    }

    @ObfuscatedName("kl.g(IIIIB)V")
    public void method5076(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3908.method4991()) {
            return;
        }
        if (!this.field3896.method497()) {
            this.field3896.method516(this.field3926, this.field3894.method247(), client.field875);
            if (!this.field3896.method497()) {
                return;
            }
        }
        this.field3896.method494(arg0, arg1, arg2, arg3, this.field3911, this.field3913, this.field3883);
    }

    @ObfuscatedName("kl.c(IS)V")
    public void method5036(int arg0) {
        this.field3903 = this.method5008(arg0);
    }

    @ObfuscatedName("kl.k(IIIIII)V")
    public void method5021(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class295.method4752(arg0, arg1, arg2, arg3, -16777216);
        class295.method4769(var7 - 152, var8, 304, 34, -65536);
        class295.method4752(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3889.method4549(class237.field3244, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("kl.q(II)F")
    public float method5008(int arg0) {
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

    @ObfuscatedName("kl.ac(B)I")
    public int method5023() {
        if ((double) this.field3903 == 1.0D) {
            return 25;
        } else if ((double) this.field3903 == 1.5D) {
            return 37;
        } else if ((double) this.field3903 == 2.0D) {
            return 50;
        } else if ((double) this.field3903 == 3.0D) {
            return 75;
        } else if ((double) this.field3903 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("kl.aw(I)V")
    public void method5024() {
        this.field3908.method4990();
    }

    @ObfuscatedName("kl.at(I)Z")
    public boolean method5025() {
        return this.field3908.method4991();
    }

    @ObfuscatedName("kl.ag(II)Laz;")
    public class33 method5026(int arg0) {
        Iterator var2 = this.field3919.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method250() != arg0);
        return var3;
    }

    @ObfuscatedName("kl.ad(III)V")
    public void method5027(int arg0, int arg1) {
        if (this.field3894 != null && this.field3894.method265(arg0, arg1)) {
            this.field3885 = arg0 - this.field3894.method266() * 64;
            this.field3914 = arg1 - this.field3894.method258() * 64;
        }
    }

    @ObfuscatedName("kl.af(IIB)V")
    public void method5054(int arg0, int arg1) {
        if (this.field3894 != null) {
            this.field3898 = arg0 - this.field3894.method266() * 64;
            this.field3917 = arg1 - this.field3894.method258() * 64;
            this.field3885 = -1;
            this.field3914 = -1;
        }
    }

    @ObfuscatedName("kl.az(IIII)V")
    public void method5018(int arg0, int arg1, int arg2) {
        if (this.field3894 != null) {
            int[] var4 = this.field3894.method291(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5027(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kl.ae(IIII)V")
    public void method5158(int arg0, int arg1, int arg2) {
        if (this.field3894 != null) {
            int[] var4 = this.field3894.method291(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5054(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("kl.av(I)I")
    public int method5031() {
        return this.field3894 == null ? -1 : this.field3898 + this.field3894.method266() * 64;
    }

    @ObfuscatedName("kl.am(I)I")
    public int method5032() {
        return this.field3894 == null ? -1 : this.field3917 + this.field3894.method258() * 64;
    }

    @ObfuscatedName("kl.ax(I)Lht;")
    public class224 method5014() {
        return this.field3894 == null ? null : this.field3894.method248(this.method5031(), this.method5032());
    }

    @ObfuscatedName("kl.ah(I)I")
    public int method5034() {
        return this.field3904;
    }

    @ObfuscatedName("kl.ab(I)I")
    public int method5035() {
        return this.field3887;
    }

    @ObfuscatedName("kl.aj(II)V")
    public void method5020(int arg0) {
        if (arg0 >= 1) {
            this.field3901 = arg0;
        }
    }

    @ObfuscatedName("kl.aa(B)V")
    public void method5037() {
        this.field3901 = 3;
    }

    @ObfuscatedName("kl.ao(IB)V")
    public void method5178(int arg0) {
        if (arg0 >= 1) {
            this.field3883 = arg0;
        }
    }

    @ObfuscatedName("kl.al(I)V")
    public void method5039() {
        this.field3883 = 50;
    }

    @ObfuscatedName("kl.ay(ZI)V")
    public void method5040(boolean arg0) {
        this.field3910 = arg0;
    }

    @ObfuscatedName("kl.aq(II)V")
    public void method5030(int arg0) {
        this.field3911 = new HashSet();
        this.field3911.add(arg0);
        this.field3912 = 0;
        this.field3913 = 0;
    }

    @ObfuscatedName("kl.ak(IB)V")
    public void method5042(int arg0) {
        this.field3911 = new HashSet();
        this.field3912 = 0;
        this.field3913 = 0;
        for (int var2 = 0; var2 < Statics.field3384.length; var2++) {
            if (Statics.field3384[var2] != null && Statics.field3384[var2].field3402 == arg0) {
                this.field3911.add(Statics.field3384[var2].field3385);
            }
        }
    }

    @ObfuscatedName("kl.as(I)V")
    public void method5043() {
        this.field3911 = null;
    }

    @ObfuscatedName("kl.au(ZB)V")
    public void method5044(boolean arg0) {
        this.field3920 = !arg0;
    }

    @ObfuscatedName("kl.an(IZI)V")
    public void method5155(int arg0, boolean arg1) {
        if (arg1) {
            this.field3916.remove(arg0);
        } else {
            this.field3916.add(arg0);
        }
        this.method5050();
    }

    @ObfuscatedName("kl.ai(IZI)V")
    public void method5134(int arg0, boolean arg1) {
        if (arg1) {
            this.field3900.remove(arg0);
        } else {
            this.field3900.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3384.length; var3++) {
            if (Statics.field3384[var3] != null && Statics.field3384[var3].field3402 == arg0) {
                int var4 = Statics.field3384[var3].field3385;
                if (arg1) {
                    this.field3909.remove(var4);
                } else {
                    this.field3909.add(var4);
                }
            }
        }
        this.method5050();
    }

    @ObfuscatedName("kl.ap(I)Z")
    public boolean method5047() {
        return !this.field3920;
    }

    @ObfuscatedName("kl.ar(II)Z")
    public boolean method5048(int arg0) {
        return !this.field3916.contains(arg0);
    }

    @ObfuscatedName("kl.bg(IB)Z")
    public boolean method5010(int arg0) {
        return !this.field3900.contains(arg0);
    }

    @ObfuscatedName("kl.bq(I)V")
    public void method5050() {
        this.field3897.clear();
        this.field3897.addAll(this.field3916);
        this.field3897.addAll(this.field3909);
    }

    @ObfuscatedName("kl.bk(IIIIIIB)V")
    public void method5083(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3908.method4991()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3892));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3892));
        List var9 = this.field3896.method518(this.field3898 - var7 / 2 - 1, this.field3917 - var8 / 2 - 1, var7 / 2 + this.field3898 + 1, var8 / 2 + this.field3917 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class254 var12 = Statics.field3384[var11.field513];
            var13 = false;
            for (int var14 = this.field3922.length - 1; var14 >= 0; var14--) {
                if (var12.field3399[var14] != null) {
                    client.method2714(var12.field3399[var14], var12.field3394, this.field3922[var14], var11.field513, var11.field510.method3786(), var11.field515.method3786());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("kl.by(ILht;I)Lht;")
    public class224 method5052(int arg0, class224 arg1) {
        if (!this.field3908.method4991()) {
            return null;
        } else if (!this.field3896.method497()) {
            return null;
        } else if (this.field3894.method265(arg1.field2730, arg1.field2731)) {
            HashMap var3 = this.field3896.method498();
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
                        return var5.field515;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field515.field2730 - arg1.field2730;
                    int var10 = var8.field515.field2731 - arg1.field2731;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field515;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("kl.bz(IILht;Lht;I)V")
    public void method5053(int arg0, int arg1, class224 arg2, class224 arg3) {
        class69 var5 = new class69();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1010(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1009(class231.field2905);
                break;
            case 1009:
                var5.method1009(class231.field2901);
                break;
            case 1010:
                var5.method1009(class231.field2902);
                break;
            case 1011:
                var5.method1009(class231.field2910);
                break;
            case 1012:
                var5.method1009(class231.field2904);
        }
        class83.method1505(var5);
    }

    @ObfuscatedName("kl.bj(I)Laj;")
    public class40 method5055() {
        if (!this.field3908.method4991()) {
            return null;
        } else if (this.field3896.method497()) {
            HashMap var1 = this.field3896.method498();
            this.field3923 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3923.addAll(var3);
            }
            this.field3924 = this.field3923.iterator();
            return this.method5173();
        } else {
            return null;
        }
    }

    @ObfuscatedName("kl.bd(I)Laj;")
    public class40 method5173() {
        if (this.field3924 == null) {
            return null;
        } else if (this.field3924.hasNext()) {
            return (class40) this.field3924.next();
        } else {
            return null;
        }
    }
}
