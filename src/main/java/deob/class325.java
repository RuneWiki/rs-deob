package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lk")
public class class325 {

    @ObfuscatedName("lk.t")
    public class250 field3889;

    @ObfuscatedName("lk.p")
    public static final class298 field3899 = class298.field3701;

    @ObfuscatedName("lk.l")
    public static final class298 field3857 = class298.field3702;

    @ObfuscatedName("lk.b")
    public static final class298 field3858 = class298.field3703;

    @ObfuscatedName("lk.c")
    public class301 field3898;

    @ObfuscatedName("lk.d")
    public HashMap field3894;

    @ObfuscatedName("lk.w")
    public class321[] field3861;

    @ObfuscatedName("lk.a")
    public HashMap field3866;

    @ObfuscatedName("lk.z")
    public class21 field3872;

    @ObfuscatedName("lk.e")
    public class21 field3888;

    @ObfuscatedName("lk.q")
    public class21 field3883;

    @ObfuscatedName("lk.j")
    public class31 field3863;

    @ObfuscatedName("lk.y")
    public class324 field3867;

    @ObfuscatedName("lk.m")
    public int field3868;

    @ObfuscatedName("lk.h")
    public int field3864;

    @ObfuscatedName("lk.x")
    public int field3870 = -1;

    @ObfuscatedName("lk.f")
    public int field3871 = -1;

    @ObfuscatedName("lk.r")
    public float field3865;

    @ObfuscatedName("lk.n")
    public float field3903;

    @ObfuscatedName("lk.g")
    public int field3874 = -1;

    @ObfuscatedName("lk.ac")
    public int field3875 = -1;

    @ObfuscatedName("lk.ab")
    public int field3876 = -1;

    @ObfuscatedName("lk.ao")
    public int field3869 = -1;

    @ObfuscatedName("lk.an")
    public int field3855 = 3;

    @ObfuscatedName("lk.ay")
    public int field3879 = 50;

    @ObfuscatedName("lk.av")
    public boolean field3880 = false;

    @ObfuscatedName("lk.af")
    public HashSet field3881 = null;

    @ObfuscatedName("lk.ar")
    public int field3882 = -1;

    @ObfuscatedName("lk.am")
    public int field3856 = -1;

    @ObfuscatedName("lk.aj")
    public int field3884 = -1;

    @ObfuscatedName("lk.aq")
    public int field3885 = -1;

    @ObfuscatedName("lk.ak")
    public int field3886 = -1;

    @ObfuscatedName("lk.ax")
    public int field3887 = -1;

    @ObfuscatedName("lk.aw")
    public long field3905;

    @ObfuscatedName("lk.au")
    public int field3852;

    @ObfuscatedName("lk.ad")
    public int field3890;

    @ObfuscatedName("lk.ah")
    public boolean field3891 = true;

    @ObfuscatedName("lk.at")
    public HashSet field3892 = new HashSet();

    @ObfuscatedName("lk.ae")
    public HashSet field3893 = new HashSet();

    @ObfuscatedName("lk.ap")
    public HashSet field3877 = new HashSet();

    @ObfuscatedName("lk.ai")
    public HashSet field3895 = new HashSet();

    @ObfuscatedName("lk.aa")
    public boolean field3896 = false;

    @ObfuscatedName("lk.az")
    public int field3900 = 0;

    @ObfuscatedName("lk.be")
    public final int[] field3897 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lk.br")
    public List field3873;

    @ObfuscatedName("lk.bi")
    public Iterator field3859;

    @ObfuscatedName("lk.bg")
    public HashSet field3901 = new HashSet();

    @ObfuscatedName("lk.ba")
    public class229 field3902 = null;

    @ObfuscatedName("lk.bw")
    public boolean field3862 = false;

    @ObfuscatedName("lk.bx")
    public class322 field3904;

    @ObfuscatedName("lk.bh")
    public int field3860;

    @ObfuscatedName("lk.bk")
    public int field3906 = -1;

    @ObfuscatedName("lk.bp")
    public int field3907 = -1;

    @ObfuscatedName("lk.bf")
    public int field3908 = -1;

    @ObfuscatedName("lk.v(Lis;Lkw;Ljava/util/HashMap;[Lld;I)V")
    public void method5689(class250 arg0, class301 arg1, HashMap arg2, class321[] arg3) {
        this.field3861 = arg3;
        this.field3889 = arg0;
        this.field3898 = arg1;
        this.field3894 = new HashMap();
        this.field3894.put(class13.field88, arg2.get(field3899));
        this.field3894.put(class13.field85, arg2.get(field3857));
        this.field3894.put(class13.field89, arg2.get(field3858));
        this.field3867 = new class324(arg0);
        int var5 = this.field3889.method4288(class30.field272.field265);
        int[] var6 = this.field3889.method4282(var5);
        this.field3866 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3889.method4270(var5, var6[var7]));
            class21 var9 = new class21();
            var9.method258(var8, var6[var7]);
            this.field3866.put(var9.method232(), var9);
            if (var9.method231()) {
                this.field3872 = var9;
            }
        }
        this.method5673(this.field3872);
        this.field3883 = null;
    }

    @ObfuscatedName("lk.s(I)I")
    public int method5658() {
        return this.field3889.method4344(this.field3872.method232(), class30.field271.field265) ? 100 : this.field3889.method4334(this.field3872.method232());
    }

    @ObfuscatedName("lk.o(I)V")
    public void method5851() {
        class24.method1450();
    }

    @ObfuscatedName("lk.k(IIZIIIII)V")
    public void method5660(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3867.method5645()) {
            return;
        }
        this.method5667();
        this.method5818();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3865));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3865));
        List var10 = this.field3863.method495(this.field3868 - var8 / 2 - 1, this.field3864 - var9 / 2 - 1, var8 / 2 + this.field3868 + 1, var9 / 2 + this.field3864 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class29 var13 = (class29) var12.next();
            var11.add(var13);
            class58 var14 = new class58();
            class37 var15 = new class37(var13.field251, var13.field246, var13.field247);
            var14.method978(new Object[] { var15, arg0, arg1 });
            if (this.field3901.contains(var13)) {
                var14.method979(17);
            } else {
                var14.method979(15);
            }
            class71.method952(var14);
        }
        Iterator var16 = this.field3901.iterator();
        while (var16.hasNext()) {
            class29 var17 = (class29) var16.next();
            if (!var11.contains(var17)) {
                class58 var18 = new class58();
                class37 var19 = new class37(var17.field251, var17.field246, var17.field247);
                var18.method978(new Object[] { var19, arg0, arg1 });
                var18.method979(16);
                class71.method952(var18);
            }
        }
        this.field3901 = var11;
    }

    @ObfuscatedName("lk.u(IIZZI)V")
    public void method5661(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class187.method3154();
        this.method5855(arg0, arg1, arg3, var5);
        if (!this.method5833() && arg3 || arg2) {
            if (arg3) {
                this.field3886 = arg0;
                this.field3887 = arg1;
                this.field3884 = this.field3868;
                this.field3885 = this.field3864;
            }
            if (this.field3884 != -1) {
                int var7 = arg0 - this.field3886;
                int var8 = arg1 - this.field3887;
                this.method5665(this.field3884 - (int) ((float) var7 / this.field3903), this.field3885 + (int) ((float) var8 / this.field3903), false);
            }
        } else {
            this.method5844();
        }
        if (arg3) {
            this.field3905 = var5;
            this.field3852 = arg0;
            this.field3890 = arg1;
        }
    }

    @ObfuscatedName("lk.i(IIZJ)V")
    public void method5855(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3888 == null) {
            this.field3902 = null;
            return;
        }
        int var6 = (int) ((float) this.field3868 + ((float) (arg0 - this.field3876) - (float) this.method5732() * this.field3865 / 2.0F) / this.field3865);
        int var7 = (int) ((float) this.field3864 - ((float) (arg1 - this.field3869) - (float) this.method5857() * this.field3865 / 2.0F) / this.field3865);
        this.field3902 = this.field3888.method241(var6 + this.field3888.method236() * 64, var7 + this.field3888.method238() * 64);
        if (this.field3902 == null || !arg2) {
            return;
        }
        boolean var8 = client.field686 >= 2;
        if (var8 && class40.field362[82] && class40.field362[81]) {
            client.method894(this.field3902.field2603, this.field3902.field2605, this.field3902.field2606, false);
            return;
        }
        boolean var9 = true;
        if (this.field3891) {
            int var10 = arg0 - this.field3852;
            int var11 = arg1 - this.field3890;
            if (arg3 - this.field3905 > 500L || var10 < -25 || var10 > 25 || var11 < -25 || var11 > 25) {
                var9 = false;
            }
        }
        if (var9) {
            class175 var12 = class175.method107(class172.field2239, client.field830.field1266);
            var12.field2311.method3318(this.field3902.method4123());
            client.field830.method1875(var12);
            this.field3905 = 0L;
        }
    }

    @ObfuscatedName("lk.t(B)V")
    public void method5667() {
        if (Statics.field196 != null) {
            this.field3865 = this.field3903;
            return;
        }
        if (this.field3865 < this.field3903) {
            this.field3865 = Math.min(this.field3903, this.field3865 / 30.0F + this.field3865);
        }
        if (this.field3865 > this.field3903) {
            this.field3865 = Math.max(this.field3903, this.field3865 - this.field3865 / 30.0F);
        }
    }

    @ObfuscatedName("lk.c(I)V")
    public void method5818() {
        if (!this.method5833()) {
            return;
        }
        int var1 = this.field3870 - this.field3868;
        int var2 = this.field3871 - this.field3864;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5665(this.field3868 + var1, this.field3864 + var2, true);
        if (this.field3870 == this.field3868 && this.field3871 == this.field3864) {
            this.field3870 = -1;
            this.field3871 = -1;
        }
    }

    @ObfuscatedName("lk.w(IIZI)V")
    public final void method5665(int arg0, int arg1, boolean arg2) {
        this.field3868 = arg0;
        this.field3864 = arg1;
        class187.method3154();
        if (arg2) {
            this.method5844();
        }
    }

    @ObfuscatedName("lk.a(I)V")
    public final void method5844() {
        this.field3887 = -1;
        this.field3886 = -1;
        this.field3885 = -1;
        this.field3884 = -1;
    }

    @ObfuscatedName("lk.z(I)Z")
    public boolean method5833() {
        return this.field3870 != -1 && this.field3871 != -1;
    }

    @ObfuscatedName("lk.e(IIIS)Lh;")
    public class21 method5862(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3866.values().iterator();
        class21 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class21) var4.next();
        } while (!var5.method257(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lk.q(IIIZB)V")
    public void method5720(int arg0, int arg1, int arg2, boolean arg3) {
        class21 var5 = this.method5862(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3872;
        }
        boolean var6 = false;
        if (this.field3883 != var5 || arg3) {
            this.field3883 = var5;
            this.method5673(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5676(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lk.j(IB)V")
    public void method5670(int arg0) {
        class21 var2 = this.method5686(arg0);
        if (var2 != null) {
            this.method5673(var2);
        }
    }

    @ObfuscatedName("lk.y(I)I")
    public int method5778() {
        return this.field3888 == null ? -1 : this.field3888.method293();
    }

    @ObfuscatedName("lk.m(I)Lh;")
    public class21 method5672() {
        return this.field3888;
    }

    @ObfuscatedName("lk.h(Lh;I)V")
    public void method5673(class21 arg0) {
        if (this.field3888 == null || this.field3888 != arg0) {
            this.method5705(arg0);
            this.method5676(-1, -1, -1);
        }
    }

    @ObfuscatedName("lk.x(Lh;I)V")
    public void method5705(class21 arg0) {
        this.field3888 = arg0;
        this.field3863 = new class31(this.field3861, this.field3894);
        this.field3867.method5646(this.field3888.method232());
    }

    @ObfuscatedName("lk.f(Lh;Lhv;Lhv;ZI)V")
    public void method5675(class21 arg0, class229 arg1, class229 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3888 == null || this.field3888 != arg0) {
            this.method5705(arg0);
        }
        if (!arg3 && this.field3888.method257(arg1.field2606, arg1.field2603, arg1.field2605)) {
            this.method5676(arg1.field2606, arg1.field2603, arg1.field2605);
        } else {
            this.method5676(arg2.field2606, arg2.field2603, arg2.field2605);
        }
    }

    @ObfuscatedName("lk.r(IIIB)V")
    public void method5676(int arg0, int arg1, int arg2) {
        if (this.field3888 == null) {
            return;
        }
        int[] var4 = this.field3888.method225(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3888.method225(this.field3888.method223(), this.field3888.method240(), this.field3888.method242());
        }
        this.method5665(var4[0] - this.field3888.method236() * 64, var4[1] - this.field3888.method238() * 64, true);
        this.field3870 = -1;
        this.field3871 = -1;
        this.field3865 = this.method5789(this.field3888.method273());
        this.field3903 = this.field3865;
        this.field3873 = null;
        this.field3859 = null;
        this.field3863.method490();
    }

    @ObfuscatedName("lk.n(IIIIIB)V")
    public void method5823(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class318.method5370(var6);
        class318.method5394(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class318.method5408(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3867.method5652();
        if (var7 < 100) {
            this.method5757(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3863.method497()) {
            this.field3863.method489(this.field3889, this.field3888.method232(), client.field818);
            if (!this.field3863.method497()) {
                return;
            }
        }
        if (this.field3881 != null) {
            this.field3856++;
            if (this.field3856 % this.field3879 == 0) {
                this.field3856 = 0;
                this.field3882++;
            }
            if (this.field3882 >= this.field3855 && !this.field3880) {
                this.field3881 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3865));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3865));
        this.field3863.method493(this.field3868 - var8 / 2, this.field3864 - var9 / 2, var8 / 2 + this.field3868, var9 / 2 + this.field3864, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3896) {
            boolean var10 = false;
            if (arg4 - this.field3900 > 100) {
                this.field3900 = arg4;
                var10 = true;
            }
            this.field3863.method492(this.field3868 - var8 / 2, this.field3864 - var9 / 2, var8 / 2 + this.field3868, var9 / 2 + this.field3864, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3895, this.field3881, this.field3856, this.field3879, var10);
        }
        this.method5679(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field686 >= 2;
        if (var11 && this.field3862 && this.field3902 != null) {
            this.field3898.method5159("Coord: " + this.field3902, class318.field3803 + 10, class318.field3801 + 20, 16776960, -1);
        }
        this.field3874 = var8;
        this.field3875 = var9;
        this.field3876 = arg0;
        this.field3869 = arg1;
        class318.method5371(var6);
    }

    @ObfuscatedName("lk.g(IIIIIIB)Z")
    public boolean method5678(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3904 == null) {
            return true;
        } else if (this.field3904.field3823 != arg0 || this.field3904.field3825 != arg1) {
            return true;
        } else if (this.field3863.field284 != this.field3860) {
            return true;
        } else if (client.field885 != this.field3908) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lk.ab(IIIIIII)V")
    public void method5679(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field196 == null) {
            return;
        }
        int var7 = 512 / (this.field3863.field284 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5691() - arg4 / 2 - var7;
        int var14 = this.method5692() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3863.field284 * (var7 + var13 - this.field3906);
        int var16 = arg1 - this.field3863.field284 * (var7 - (var14 - this.field3907));
        if (this.method5678(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3904 != null && this.field3904.field3823 == var11 && this.field3904.field3825 == var12) {
                Arrays.fill(this.field3904.field3826, 0);
            } else {
                this.field3904 = new class322(var11, var12);
            }
            this.field3906 = this.method5691() - arg4 / 2 - var7;
            this.field3907 = this.method5692() - arg5 / 2 - var7;
            this.field3860 = this.field3863.field284;
            Statics.field196.method4443(this.field3906, this.field3907, this.field3904, (float) this.field3860 / var10);
            this.field3908 = client.field885;
            var15 = arg0 - this.field3863.field284 * (var7 + var13 - this.field3906);
            var16 = arg1 - this.field3863.field284 * (var7 - (var14 - this.field3907));
        }
        class318.method5375(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3904.method5512(var15, var16, 192);
        } else {
            this.field3904.method5515(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lk.ao(IIIIB)V")
    public void method5680(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3867.method5645()) {
            return;
        }
        if (!this.field3863.method497()) {
            this.field3863.method489(this.field3889, this.field3888.method232(), client.field818);
            if (!this.field3863.method497()) {
                return;
            }
        }
        this.field3863.method511(arg0, arg1, arg2, arg3, this.field3881, this.field3856, this.field3879);
    }

    @ObfuscatedName("lk.an(II)V")
    public void method5681(int arg0) {
        this.field3903 = this.method5789(arg0);
    }

    @ObfuscatedName("lk.ay(IIIIII)V")
    public void method5757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class318.method5408(arg0, arg1, arg2, arg3, -16777216);
        class318.method5412(var7 - 152, var8, 304, 34, -65536);
        class318.method5408(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3898.method5162(class240.field3113, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lk.av(II)F")
    public float method5789(int arg0) {
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

    @ObfuscatedName("lk.af(B)I")
    public int method5683() {
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

    @ObfuscatedName("lk.ar(I)V")
    public void method5737() {
        this.field3867.method5642();
    }

    @ObfuscatedName("lk.am(I)Z")
    public boolean method5685() {
        return this.field3867.method5645();
    }

    @ObfuscatedName("lk.aj(II)Lh;")
    public class21 method5686(int arg0) {
        Iterator var2 = this.field3866.values().iterator();
        class21 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class21) var2.next();
        } while (var3.method293() != arg0);
        return var3;
    }

    @ObfuscatedName("lk.aq(III)V")
    public void method5745(int arg0, int arg1) {
        if (this.field3888 != null && this.field3888.method260(arg0, arg1)) {
            this.field3870 = arg0 - this.field3888.method236() * 64;
            this.field3871 = arg1 - this.field3888.method238() * 64;
        }
    }

    @ObfuscatedName("lk.ak(IIB)V")
    public void method5688(int arg0, int arg1) {
        if (this.field3888 != null) {
            this.method5665(arg0 - this.field3888.method236() * 64, arg1 - this.field3888.method238() * 64, true);
            this.field3870 = -1;
            this.field3871 = -1;
        }
    }

    @ObfuscatedName("lk.ax(IIII)V")
    public void method5801(int arg0, int arg1, int arg2) {
        if (this.field3888 != null) {
            int[] var4 = this.field3888.method225(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5745(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lk.aw(IIIS)V")
    public void method5690(int arg0, int arg1, int arg2) {
        if (this.field3888 != null) {
            int[] var4 = this.field3888.method225(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5688(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lk.au(I)I")
    public int method5691() {
        return this.field3888 == null ? -1 : this.field3868 + this.field3888.method236() * 64;
    }

    @ObfuscatedName("lk.ad(B)I")
    public int method5692() {
        return this.field3888 == null ? -1 : this.field3864 + this.field3888.method238() * 64;
    }

    @ObfuscatedName("lk.ah(I)Lhv;")
    public class229 method5693() {
        return this.field3888 == null ? null : this.field3888.method241(this.method5691(), this.method5692());
    }

    @ObfuscatedName("lk.as(I)I")
    public int method5732() {
        return this.field3874;
    }

    @ObfuscatedName("lk.ag(I)I")
    public int method5857() {
        return this.field3875;
    }

    @ObfuscatedName("lk.at(IB)V")
    public void method5716(int arg0) {
        if (arg0 >= 1) {
            this.field3855 = arg0;
        }
    }

    @ObfuscatedName("lk.ae(I)V")
    public void method5697() {
        this.field3855 = 3;
    }

    @ObfuscatedName("lk.ap(II)V")
    public void method5698(int arg0) {
        if (arg0 >= 1) {
            this.field3879 = arg0;
        }
    }

    @ObfuscatedName("lk.ai(B)V")
    public void method5699() {
        this.field3879 = 50;
    }

    @ObfuscatedName("lk.aa(ZI)V")
    public void method5817(boolean arg0) {
        this.field3880 = arg0;
    }

    @ObfuscatedName("lk.az(II)V")
    public void method5701(int arg0) {
        this.field3881 = new HashSet();
        this.field3881.add(arg0);
        this.field3882 = 0;
        this.field3856 = 0;
    }

    @ObfuscatedName("lk.al(II)V")
    public void method5702(int arg0) {
        this.field3881 = new HashSet();
        this.field3882 = 0;
        this.field3856 = 0;
        for (int var2 = 0; var2 < Statics.field2412.length; var2++) {
            if (Statics.field2412[var2] != null && Statics.field2412[var2].field3283 == arg0) {
                this.field3881.add(Statics.field2412[var2].field3266);
            }
        }
    }

    @ObfuscatedName("lk.be(I)V")
    public void method5830() {
        this.field3881 = null;
    }

    @ObfuscatedName("lk.br(ZI)V")
    public void method5704(boolean arg0) {
        this.field3896 = !arg0;
    }

    @ObfuscatedName("lk.bi(IZI)V")
    public void method5700(int arg0, boolean arg1) {
        if (arg1) {
            this.field3892.remove(arg0);
        } else {
            this.field3892.add(arg0);
        }
        this.method5710();
    }

    @ObfuscatedName("lk.bg(IZI)V")
    public void method5706(int arg0, boolean arg1) {
        if (arg1) {
            this.field3893.remove(arg0);
        } else {
            this.field3893.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field2412.length; var3++) {
            if (Statics.field2412[var3] != null && Statics.field2412[var3].field3283 == arg0) {
                int var4 = Statics.field2412[var3].field3266;
                if (arg1) {
                    this.field3877.remove(var4);
                } else {
                    this.field3877.add(var4);
                }
            }
        }
        this.method5710();
    }

    @ObfuscatedName("lk.ba(B)Z")
    public boolean method5707() {
        return !this.field3896;
    }

    @ObfuscatedName("lk.bw(II)Z")
    public boolean method5708(int arg0) {
        return !this.field3892.contains(arg0);
    }

    @ObfuscatedName("lk.bx(II)Z")
    public boolean method5709(int arg0) {
        return !this.field3893.contains(arg0);
    }

    @ObfuscatedName("lk.bh(B)V")
    public void method5710() {
        this.field3895.clear();
        this.field3895.addAll(this.field3892);
        this.field3895.addAll(this.field3877);
    }

    @ObfuscatedName("lk.bk(IIIIIII)V")
    public void method5711(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3867.method5645()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3865));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3865));
        List var9 = this.field3863.method495(this.field3868 - var7 / 2 - 1, this.field3864 - var8 / 2 - 1, var7 / 2 + this.field3868 + 1, var8 / 2 + this.field3864 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class29 var11 = (class29) var10.next();
            class258 var12 = Statics.field2412[var11.field251];
            var13 = false;
            for (int var14 = this.field3897.length - 1; var14 >= 0; var14--) {
                if (var12.field3272[var14] != null) {
                    client.method180(var12.field3272[var14], var12.field3269, this.field3897[var14], var11.field251, var11.field246.method4123(), var11.field247.method4123());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lk.bp(ILhv;I)Lhv;")
    public class229 method5712(int arg0, class229 arg1) {
        if (!this.field3867.method5645()) {
            return null;
        } else if (!this.field3863.method497()) {
            return null;
        } else if (this.field3888.method260(arg1.field2603, arg1.field2605)) {
            HashMap var3 = this.field3863.method498();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class29 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class29 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field247;
                    }
                    var8 = (class29) var7.next();
                    int var9 = var8.field247.field2603 - arg1.field2603;
                    int var10 = var8.field247.field2605 - arg1.field2605;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field247;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lk.bf(IILhv;Lhv;I)V")
    public void method5713(int arg0, int arg1, class229 arg2, class229 arg3) {
        class58 var5 = new class58();
        class37 var6 = new class37(arg1, arg2, arg3);
        var5.method978(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method979(10);
                break;
            case 1009:
                var5.method979(11);
                break;
            case 1010:
                var5.method979(12);
                break;
            case 1011:
                var5.method979(13);
                break;
            case 1012:
                var5.method979(14);
        }
        class71.method952(var5);
    }

    @ObfuscatedName("lk.bb(I)Lao;")
    public class29 method5714() {
        if (!this.field3867.method5645()) {
            return null;
        } else if (this.field3863.method497()) {
            HashMap var1 = this.field3863.method498();
            this.field3873 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3873.addAll(var3);
            }
            this.field3859 = this.field3873.iterator();
            return this.method5715();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lk.bj(I)Lao;")
    public class29 method5715() {
        if (this.field3859 == null) {
            return null;
        } else if (this.field3859.hasNext()) {
            return (class29) this.field3859.next();
        } else {
            return null;
        }
    }
}
