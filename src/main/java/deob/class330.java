package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lf")
public class class330 {

    @ObfuscatedName("lf.j")
    public class250 field3964;

    @ObfuscatedName("lf.p")
    public static final class298 field3916 = class298.field3715;

    @ObfuscatedName("lf.e")
    public static final class298 field3917 = class298.field3716;

    @ObfuscatedName("lf.s")
    public static final class298 field3939 = class298.field3712;

    @ObfuscatedName("lf.v")
    public class301 field3919;

    @ObfuscatedName("lf.k")
    public HashMap field3943;

    @ObfuscatedName("lf.o")
    public class323[] field3955;

    @ObfuscatedName("lf.q")
    public HashMap field3922;

    @ObfuscatedName("lf.l")
    public class21 field3923;

    @ObfuscatedName("lf.f")
    public class21 field3913;

    @ObfuscatedName("lf.z")
    public class21 field3940;

    @ObfuscatedName("lf.a")
    public class31 field3926;

    @ObfuscatedName("lf.x")
    public class329 field3927;

    @ObfuscatedName("lf.b")
    public int field3933;

    @ObfuscatedName("lf.w")
    public int field3928;

    @ObfuscatedName("lf.g")
    public int field3924 = -1;

    @ObfuscatedName("lf.d")
    public int field3931 = -1;

    @ObfuscatedName("lf.m")
    public float field3932;

    @ObfuscatedName("lf.t")
    public float field3935;

    @ObfuscatedName("lf.h")
    public int field3934 = -1;

    @ObfuscatedName("lf.an")
    public int field3915 = -1;

    @ObfuscatedName("lf.al")
    public int field3958 = -1;

    @ObfuscatedName("lf.ah")
    public int field3937 = -1;

    @ObfuscatedName("lf.ad")
    public int field3938 = 3;

    @ObfuscatedName("lf.aa")
    public int field3936 = 50;

    @ObfuscatedName("lf.ag")
    public boolean field3912 = false;

    @ObfuscatedName("lf.av")
    public HashSet field3918 = null;

    @ObfuscatedName("lf.am")
    public int field3942 = -1;

    @ObfuscatedName("lf.ap")
    public int field3925 = -1;

    @ObfuscatedName("lf.au")
    public int field3944 = -1;

    @ObfuscatedName("lf.ae")
    public int field3945 = -1;

    @ObfuscatedName("lf.ai")
    public int field3946 = -1;

    @ObfuscatedName("lf.ab")
    public int field3947 = -1;

    @ObfuscatedName("lf.aw")
    public long field3948;

    @ObfuscatedName("lf.ac")
    public int field3949;

    @ObfuscatedName("lf.aq")
    public int field3950;

    @ObfuscatedName("lf.az")
    public boolean field3951 = true;

    @ObfuscatedName("lf.ak")
    public HashSet field3952 = new HashSet();

    @ObfuscatedName("lf.af")
    public HashSet field3953 = new HashSet();

    @ObfuscatedName("lf.ax")
    public HashSet field3954 = new HashSet();

    @ObfuscatedName("lf.ar")
    public HashSet field3963 = new HashSet();

    @ObfuscatedName("lf.at")
    public boolean field3956 = false;

    @ObfuscatedName("lf.aj")
    public int field3957 = 0;

    @ObfuscatedName("lf.br")
    public final int[] field3959 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lf.bd")
    public List field3960;

    @ObfuscatedName("lf.bp")
    public Iterator field3961;

    @ObfuscatedName("lf.bk")
    public HashSet field3962 = new HashSet();

    @ObfuscatedName("lf.bm")
    public class229 field3968 = null;

    @ObfuscatedName("lf.bc")
    public boolean field3967 = false;

    @ObfuscatedName("lf.bi")
    public class324 field3965;

    @ObfuscatedName("lf.bo")
    public int field3966;

    @ObfuscatedName("lf.bh")
    public int field3920 = -1;

    @ObfuscatedName("lf.bg")
    public int field3941 = -1;

    @ObfuscatedName("lf.bx")
    public int field3969 = -1;

    @ObfuscatedName("lf.y(Liu;Lkt;Ljava/util/HashMap;[Llb;B)V")
    public void method5754(class250 arg0, class301 arg1, HashMap arg2, class323[] arg3) {
        this.field3955 = arg3;
        this.field3964 = arg0;
        this.field3919 = arg1;
        this.field3943 = new HashMap();
        this.field3943.put(class13.field92, arg2.get(field3916));
        this.field3943.put(class13.field87, arg2.get(field3917));
        this.field3943.put(class13.field90, arg2.get(field3939));
        this.field3927 = new class329(arg0);
        int var5 = this.field3964.method4274(class30.field285.field277);
        int[] var6 = this.field3964.method4267(var5);
        this.field3922 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3964.method4263(var5, var6[var7]));
            class21 var9 = new class21();
            var9.method233(var8, var6[var7]);
            this.field3922.put(var9.method200(), var9);
            if (var9.method199()) {
                this.field3923 = var9;
            }
        }
        this.method5652(this.field3923);
        this.field3940 = null;
    }

    @ObfuscatedName("lf.c(I)I")
    public int method5759() {
        return this.field3964.method4337(this.field3923.method200(), class30.field279.field277) ? 100 : this.field3964.method4281(this.field3923.method200());
    }

    @ObfuscatedName("lf.n(I)V")
    public void method5639() {
        class24.method4444();
    }

    @ObfuscatedName("lf.u(IIZIIIIB)V")
    public void method5640(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3927.method5626()) {
            return;
        }
        this.method5692();
        this.method5643();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3932));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3932));
        List var10 = this.field3926.method468(this.field3933 - var8 / 2 - 1, this.field3928 - var9 / 2 - 1, var8 / 2 + this.field3933 + 1, var9 / 2 + this.field3928 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class29 var13 = (class29) var12.next();
            var11.add(var13);
            class58 var14 = new class58();
            class37 var15 = new class37(var13.field269, var13.field275, var13.field267);
            var14.method1007(new Object[] { var15, arg0, arg1 });
            if (this.field3962.contains(var13)) {
                var14.method1000(17);
            } else {
                var14.method1000(15);
            }
            class71.method109(var14);
        }
        Iterator var16 = this.field3962.iterator();
        while (var16.hasNext()) {
            class29 var17 = (class29) var16.next();
            if (!var11.contains(var17)) {
                class58 var18 = new class58();
                class37 var19 = new class37(var17.field269, var17.field275, var17.field267);
                var18.method1007(new Object[] { var19, arg0, arg1 });
                var18.method1000(16);
                class71.method109(var18);
            }
        }
        this.field3962 = var11;
    }

    @ObfuscatedName("lf.i(IIZZI)V")
    public void method5641(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class187.method1700();
        this.method5698(arg0, arg1, arg3, var5);
        if (!this.method5646() && arg3 || arg2) {
            if (arg3) {
                this.field3946 = arg0;
                this.field3947 = arg1;
                this.field3944 = this.field3933;
                this.field3945 = this.field3928;
            }
            if (this.field3944 != -1) {
                int var7 = arg0 - this.field3946;
                int var8 = arg1 - this.field3947;
                this.method5644(this.field3944 - (int) ((float) var7 / this.field3935), this.field3945 + (int) ((float) var8 / this.field3935), false);
            }
        } else {
            this.method5645();
        }
        if (arg3) {
            this.field3948 = var5;
            this.field3949 = arg0;
            this.field3950 = arg1;
        }
    }

    @ObfuscatedName("lf.p(IIZJ)V")
    public void method5698(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3913 == null) {
            this.field3968 = null;
            return;
        }
        int var6 = (int) ((float) this.field3933 + ((float) (arg0 - this.field3958) - (float) this.method5674() * this.field3932 / 2.0F) / this.field3932);
        int var7 = (int) ((float) this.field3928 - ((float) (arg1 - this.field3937) - (float) this.method5675() * this.field3932 / 2.0F) / this.field3932);
        this.field3968 = this.field3913.method196(var6 + this.field3913.method204() * 64, var7 + this.field3913.method206() * 64);
        if (this.field3968 == null || !arg2) {
            return;
        }
        if (client.method911() && class40.field377[82] && class40.field377[81]) {
            client.method1660(this.field3968.field2605, this.field3968.field2606, this.field3968.field2610, false);
            return;
        }
        boolean var8 = true;
        if (this.field3951) {
            int var9 = arg0 - this.field3949;
            int var10 = arg1 - this.field3950;
            if (arg3 - this.field3948 > 500L || var9 < -25 || var9 > 25 || var10 < -25 || var10 > 25) {
                var8 = false;
            }
        }
        if (var8) {
            class175 var11 = class175.method3207(class172.field2260, client.field672.field1273);
            var11.field2299.method3313(this.field3968.method4088());
            client.field672.method1901(var11);
            this.field3948 = 0L;
        }
    }

    @ObfuscatedName("lf.e(B)V")
    public void method5692() {
        if (Statics.field2325 != null) {
            this.field3932 = this.field3935;
            return;
        }
        if (this.field3932 < this.field3935) {
            this.field3932 = Math.min(this.field3935, this.field3932 / 30.0F + this.field3932);
        }
        if (this.field3932 > this.field3935) {
            this.field3932 = Math.max(this.field3935, this.field3932 - this.field3932 / 30.0F);
        }
    }

    @ObfuscatedName("lf.s(I)V")
    public void method5643() {
        if (!this.method5646()) {
            return;
        }
        int var1 = this.field3924 - this.field3933;
        int var2 = this.field3931 - this.field3928;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5644(this.field3933 + var1, this.field3928 + var2, true);
        if (this.field3933 == this.field3924 && this.field3931 == this.field3928) {
            this.field3924 = -1;
            this.field3931 = -1;
        }
    }

    @ObfuscatedName("lf.v(IIZB)V")
    public final void method5644(int arg0, int arg1, boolean arg2) {
        this.field3933 = arg0;
        this.field3928 = arg1;
        class187.method1700();
        if (arg2) {
            this.method5645();
        }
    }

    @ObfuscatedName("lf.k(I)V")
    public final void method5645() {
        this.field3947 = -1;
        this.field3946 = -1;
        this.field3945 = -1;
        this.field3944 = -1;
    }

    @ObfuscatedName("lf.o(I)Z")
    public boolean method5646() {
        return this.field3924 != -1 && this.field3931 != -1;
    }

    @ObfuscatedName("lf.q(IIII)Lw;")
    public class21 method5647(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3922.values().iterator();
        class21 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class21) var4.next();
        } while (!var5.method255(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lf.l(IIIZI)V")
    public void method5648(int arg0, int arg1, int arg2, boolean arg3) {
        class21 var5 = this.method5647(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3923;
        }
        boolean var6 = false;
        if (this.field3940 != var5 || arg3) {
            this.field3940 = var5;
            this.method5652(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5642(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lf.f(II)V")
    public void method5649(int arg0) {
        class21 var2 = this.method5778(arg0);
        if (var2 != null) {
            this.method5652(var2);
        }
    }

    @ObfuscatedName("lf.z(B)I")
    public int method5650() {
        return this.field3913 == null ? -1 : this.field3913.method198();
    }

    @ObfuscatedName("lf.a(I)Lw;")
    public class21 method5651() {
        return this.field3913;
    }

    @ObfuscatedName("lf.x(Lw;B)V")
    public void method5652(class21 arg0) {
        if (this.field3913 == null || this.field3913 != arg0) {
            this.method5653(arg0);
            this.method5642(-1, -1, -1);
        }
    }

    @ObfuscatedName("lf.b(Lw;I)V")
    public void method5653(class21 arg0) {
        this.field3913 = arg0;
        this.field3926 = new class31(this.field3955, this.field3943);
        this.field3927.method5620(this.field3913.method200());
    }

    @ObfuscatedName("lf.w(Lw;Lhm;Lhm;ZI)V")
    public void method5750(class21 arg0, class229 arg1, class229 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3913 == null || this.field3913 != arg0) {
            this.method5653(arg0);
        }
        if (!arg3 && this.field3913.method255(arg1.field2610, arg1.field2605, arg1.field2606)) {
            this.method5642(arg1.field2610, arg1.field2605, arg1.field2606);
        } else {
            this.method5642(arg2.field2610, arg2.field2605, arg2.field2606);
        }
    }

    @ObfuscatedName("lf.g(IIII)V")
    public void method5642(int arg0, int arg1, int arg2) {
        if (this.field3913 == null) {
            return;
        }
        int[] var4 = this.field3913.method213(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3913.method213(this.field3913.method248(), this.field3913.method208(), this.field3913.method210());
        }
        this.method5644(var4[0] - this.field3913.method204() * 64, var4[1] - this.field3913.method206() * 64, true);
        this.field3924 = -1;
        this.field3931 = -1;
        this.field3932 = this.method5780(this.field3913.method203());
        this.field3935 = this.field3932;
        this.field3960 = null;
        this.field3961 = null;
        this.field3926.method463();
    }

    @ObfuscatedName("lf.d(IIIIIB)V")
    public void method5743(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class320.method5366(var6);
        class320.method5364(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class320.method5372(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3927.method5623();
        if (var7 < 100) {
            this.method5777(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3926.method470()) {
            this.field3926.method462(this.field3964, this.field3913.method200(), client.field871);
            if (!this.field3926.method470()) {
                return;
            }
        }
        if (this.field3918 != null) {
            this.field3925++;
            if (this.field3925 % this.field3936 == 0) {
                this.field3925 = 0;
                this.field3942++;
            }
            if (this.field3942 >= this.field3938 && !this.field3912) {
                this.field3918 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3932));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3932));
        this.field3926.method464(this.field3933 - var8 / 2, this.field3928 - var9 / 2, var8 / 2 + this.field3933, var9 / 2 + this.field3928, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3956) {
            boolean var10 = false;
            if (arg4 - this.field3957 > 100) {
                this.field3957 = arg4;
                var10 = true;
            }
            this.field3926.method465(this.field3933 - var8 / 2, this.field3928 - var9 / 2, var8 / 2 + this.field3933, var9 / 2 + this.field3928, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3963, this.field3918, this.field3925, this.field3936, var10);
        }
        this.method5658(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method911() && this.field3967 && this.field3968 != null) {
            this.field3919.method5144("Coord: " + this.field3968, class320.field3825 + 10, class320.field3823 + 20, 16776960, -1);
        }
        this.field3934 = var8;
        this.field3915 = var9;
        this.field3958 = arg0;
        this.field3937 = arg1;
        class320.method5367(var6);
    }

    @ObfuscatedName("lf.m(IIIIIII)Z")
    public boolean method5657(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3965 == null) {
            return true;
        } else if (this.field3965.field3845 != arg0 || this.field3965.field3847 != arg1) {
            return true;
        } else if (this.field3926.field297 != this.field3966) {
            return true;
        } else if (client.field892 != this.field3969) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lf.t(IIIIIII)V")
    public void method5658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field2325 == null) {
            return;
        }
        int var7 = 512 / (this.field3926.field297 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5699() - arg4 / 2 - var7;
        int var14 = this.method5672() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3926.field297 * (var7 + var13 - this.field3920);
        int var16 = arg1 - this.field3926.field297 * (var7 - (var14 - this.field3941));
        if (this.method5657(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3965 != null && this.field3965.field3845 == var11 && this.field3965.field3847 == var12) {
                Arrays.fill(this.field3965.field3851, 0);
            } else {
                this.field3965 = new class324(var11, var12);
            }
            this.field3920 = this.method5699() - arg4 / 2 - var7;
            this.field3941 = this.method5672() - arg5 / 2 - var7;
            this.field3966 = this.field3926.field297;
            Statics.field2325.method4411(this.field3920, this.field3941, this.field3965, (float) this.field3966 / var10);
            this.field3969 = client.field892;
            var15 = arg0 - this.field3926.field297 * (var7 + var13 - this.field3920);
            var16 = arg1 - this.field3926.field297 * (var7 - (var14 - this.field3941));
        }
        class320.method5412(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3965.method5471(var15, var16, 192);
        } else {
            this.field3965.method5570(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lf.h(IIIII)V")
    public void method5664(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3927.method5626()) {
            return;
        }
        if (!this.field3926.method470()) {
            this.field3926.method462(this.field3964, this.field3913.method200(), client.field871);
            if (!this.field3926.method470()) {
                return;
            }
        }
        this.field3926.method467(arg0, arg1, arg2, arg3, this.field3918, this.field3925, this.field3936);
    }

    @ObfuscatedName("lf.ah(II)V")
    public void method5660(int arg0) {
        this.field3935 = this.method5780(arg0);
    }

    @ObfuscatedName("lf.ad(IIIIII)V")
    public void method5777(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class320.method5372(arg0, arg1, arg2, arg3, -16777216);
        class320.method5428(var7 - 152, var8, 304, 34, -65536);
        class320.method5372(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3919.method5147(class240.field3053, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lf.aa(II)F")
    public float method5780(int arg0) {
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

    @ObfuscatedName("lf.ag(B)I")
    public int method5637() {
        if ((double) this.field3935 == 1.0D) {
            return 25;
        } else if ((double) this.field3935 == 1.5D) {
            return 37;
        } else if ((double) this.field3935 == 2.0D) {
            return 50;
        } else if ((double) this.field3935 == 3.0D) {
            return 75;
        } else if ((double) this.field3935 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lf.av(I)V")
    public void method5779() {
        this.field3927.method5621();
    }

    @ObfuscatedName("lf.am(B)Z")
    public boolean method5665() {
        return this.field3927.method5626();
    }

    @ObfuscatedName("lf.ap(II)Lw;")
    public class21 method5778(int arg0) {
        Iterator var2 = this.field3922.values().iterator();
        class21 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class21) var2.next();
        } while (var3.method198() != arg0);
        return var3;
    }

    @ObfuscatedName("lf.au(III)V")
    public void method5667(int arg0, int arg1) {
        if (this.field3913 != null && this.field3913.method226(arg0, arg1)) {
            this.field3924 = arg0 - this.field3913.method204() * 64;
            this.field3931 = arg1 - this.field3913.method206() * 64;
        }
    }

    @ObfuscatedName("lf.ae(III)V")
    public void method5668(int arg0, int arg1) {
        if (this.field3913 != null) {
            this.method5644(arg0 - this.field3913.method204() * 64, arg1 - this.field3913.method206() * 64, true);
            this.field3924 = -1;
            this.field3931 = -1;
        }
    }

    @ObfuscatedName("lf.ai(IIIB)V")
    public void method5669(int arg0, int arg1, int arg2) {
        if (this.field3913 != null) {
            int[] var4 = this.field3913.method213(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5667(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lf.ab(IIII)V")
    public void method5819(int arg0, int arg1, int arg2) {
        if (this.field3913 != null) {
            int[] var4 = this.field3913.method213(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5668(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lf.aw(I)I")
    public int method5699() {
        return this.field3913 == null ? -1 : this.field3933 + this.field3913.method204() * 64;
    }

    @ObfuscatedName("lf.ac(B)I")
    public int method5672() {
        return this.field3913 == null ? -1 : this.field3928 + this.field3913.method206() * 64;
    }

    @ObfuscatedName("lf.aq(I)Lhm;")
    public class229 method5673() {
        return this.field3913 == null ? null : this.field3913.method196(this.method5699(), this.method5672());
    }

    @ObfuscatedName("lf.az(B)I")
    public int method5674() {
        return this.field3934;
    }

    @ObfuscatedName("lf.ay(I)I")
    public int method5675() {
        return this.field3915;
    }

    @ObfuscatedName("lf.ao(IB)V")
    public void method5676(int arg0) {
        if (arg0 >= 1) {
            this.field3938 = arg0;
        }
    }

    @ObfuscatedName("lf.ak(I)V")
    public void method5677() {
        this.field3938 = 3;
    }

    @ObfuscatedName("lf.af(IB)V")
    public void method5693(int arg0) {
        if (arg0 >= 1) {
            this.field3936 = arg0;
        }
    }

    @ObfuscatedName("lf.ax(I)V")
    public void method5679() {
        this.field3936 = 50;
    }

    @ObfuscatedName("lf.ar(ZI)V")
    public void method5705(boolean arg0) {
        this.field3912 = arg0;
    }

    @ObfuscatedName("lf.at(II)V")
    public void method5656(int arg0) {
        this.field3918 = new HashSet();
        this.field3918.add(arg0);
        this.field3942 = 0;
        this.field3925 = 0;
    }

    @ObfuscatedName("lf.aj(IB)V")
    public void method5817(int arg0) {
        this.field3918 = new HashSet();
        this.field3942 = 0;
        this.field3925 = 0;
        for (int var2 = 0; var2 < Statics.field3287; var2++) {
            if (class258.method4467(var2) != null && class258.method4467(var2).field3285 == arg0) {
                this.field3918.add(class258.method4467(var2).field3289);
            }
        }
    }

    @ObfuscatedName("lf.as(B)V")
    public void method5683() {
        this.field3918 = null;
    }

    @ObfuscatedName("lf.br(ZB)V")
    public void method5718(boolean arg0) {
        this.field3956 = !arg0;
    }

    @ObfuscatedName("lf.bd(IZI)V")
    public void method5732(int arg0, boolean arg1) {
        if (arg1) {
            this.field3952.remove(arg0);
        } else {
            this.field3952.add(arg0);
        }
        this.method5690();
    }

    @ObfuscatedName("lf.bp(IZS)V")
    public void method5810(int arg0, boolean arg1) {
        if (arg1) {
            this.field3953.remove(arg0);
        } else {
            this.field3953.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3287; var3++) {
            if (class258.method4467(var3) != null && class258.method4467(var3).field3285 == arg0) {
                int var4 = class258.method4467(var3).field3289;
                if (arg1) {
                    this.field3954.remove(var4);
                } else {
                    this.field3954.add(var4);
                }
            }
        }
        this.method5690();
    }

    @ObfuscatedName("lf.bk(B)Z")
    public boolean method5687() {
        return !this.field3956;
    }

    @ObfuscatedName("lf.bm(II)Z")
    public boolean method5688(int arg0) {
        return !this.field3952.contains(arg0);
    }

    @ObfuscatedName("lf.bc(IB)Z")
    public boolean method5742(int arg0) {
        return !this.field3953.contains(arg0);
    }

    @ObfuscatedName("lf.bi(I)V")
    public void method5690() {
        this.field3963.clear();
        this.field3963.addAll(this.field3952);
        this.field3963.addAll(this.field3954);
    }

    @ObfuscatedName("lf.bo(IIIIIIB)V")
    public void method5816(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3927.method5626()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3932));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3932));
        List var9 = this.field3926.method468(this.field3933 - var7 / 2 - 1, this.field3928 - var8 / 2 - 1, var7 / 2 + this.field3933 + 1, var8 / 2 + this.field3928 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class258 var12 = class258.method4467(var11.field269);
            var13 = false;
            for (int var14 = this.field3959.length - 1; var14 >= 0; var14--) {
                if (var12.field3295[var14] != null) {
                    client.method3594(var12.field3295[var14], var12.field3294, this.field3959[var14], var11.field269, var11.field275.method4088(), var11.field267.method4088());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lf.bh(ILhm;I)Lhm;")
    public class229 method5685(int arg0, class229 arg1) {
        if (!this.field3927.method5626()) {
            return null;
        } else if (!this.field3926.method470()) {
            return null;
        } else if (this.field3913.method226(arg1.field2605, arg1.field2606)) {
            HashMap var3 = this.field3926.method471();
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
                        return var5.field267;
                    }
                    var8 = (class29) var7.next();
                    int var9 = var8.field267.field2605 - arg1.field2605;
                    int var10 = var8.field267.field2606 - arg1.field2606;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field267;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lf.bg(IILhm;Lhm;B)V")
    public void method5786(int arg0, int arg1, class229 arg2, class229 arg3) {
        class58 var5 = new class58();
        class37 var6 = new class37(arg1, arg2, arg3);
        var5.method1007(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1000(10);
                break;
            case 1009:
                var5.method1000(11);
                break;
            case 1010:
                var5.method1000(12);
                break;
            case 1011:
                var5.method1000(13);
                break;
            case 1012:
                var5.method1000(14);
        }
        class71.method109(var5);
    }

    @ObfuscatedName("lf.bx(I)Lah;")
    public class29 method5694() {
        if (!this.field3927.method5626()) {
            return null;
        } else if (this.field3926.method470()) {
            HashMap var1 = this.field3926.method471();
            this.field3960 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3960.addAll(var3);
            }
            this.field3961 = this.field3960.iterator();
            return this.method5695();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lf.bn(B)Lah;")
    public class29 method5695() {
        if (this.field3961 == null) {
            return null;
        } else if (this.field3961.hasNext()) {
            return (class29) this.field3961.next();
        } else {
            return null;
        }
    }
}
