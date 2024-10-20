package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("la")
public class class330 {

    @ObfuscatedName("la.c")
    public class250 field3942;

    @ObfuscatedName("la.p")
    public static final class298 field3951 = class298.field3734;

    @ObfuscatedName("la.r")
    public static final class298 field3944 = class298.field3735;

    @ObfuscatedName("la.m")
    public static final class298 field3956 = class298.field3736;

    @ObfuscatedName("la.d")
    public class301 field3946;

    @ObfuscatedName("la.z")
    public HashMap field3947;

    @ObfuscatedName("la.x")
    public class323[] field3958;

    @ObfuscatedName("la.v")
    public HashMap field3949;

    @ObfuscatedName("la.g")
    public class21 field3950;

    @ObfuscatedName("la.j")
    public class21 field3985;

    @ObfuscatedName("la.b")
    public class21 field3952;

    @ObfuscatedName("la.u")
    public class31 field3953;

    @ObfuscatedName("la.t")
    public class329 field3954;

    @ObfuscatedName("la.n")
    public int field3955;

    @ObfuscatedName("la.h")
    public int field3970;

    @ObfuscatedName("la.o")
    public int field3957 = -1;

    @ObfuscatedName("la.i")
    public int field3994 = -1;

    @ObfuscatedName("la.k")
    public float field3976;

    @ObfuscatedName("la.q")
    public float field3960;

    @ObfuscatedName("la.y")
    public int field3961 = -1;

    @ObfuscatedName("la.av")
    public int field3962 = -1;

    @ObfuscatedName("la.ag")
    public int field3959 = -1;

    @ObfuscatedName("la.af")
    public int field3964 = -1;

    @ObfuscatedName("la.az")
    public int field3965 = 3;

    @ObfuscatedName("la.at")
    public int field3966 = 50;

    @ObfuscatedName("la.ac")
    public boolean field3981 = false;

    @ObfuscatedName("la.am")
    public HashSet field3968 = null;

    @ObfuscatedName("la.aw")
    public int field3945 = -1;

    @ObfuscatedName("la.aa")
    public int field3939 = -1;

    @ObfuscatedName("la.as")
    public int field3986 = -1;

    @ObfuscatedName("la.al")
    public int field3972 = -1;

    @ObfuscatedName("la.ad")
    public int field3973 = -1;

    @ObfuscatedName("la.ax")
    public int field3974 = -1;

    @ObfuscatedName("la.ao")
    public long field3975;

    @ObfuscatedName("la.ae")
    public int field3979;

    @ObfuscatedName("la.ap")
    public int field3977;

    @ObfuscatedName("la.ar")
    public boolean field3978 = true;

    @ObfuscatedName("la.au")
    public HashSet field3983 = new HashSet();

    @ObfuscatedName("la.aj")
    public HashSet field3948 = new HashSet();

    @ObfuscatedName("la.ah")
    public HashSet field3987 = new HashSet();

    @ObfuscatedName("la.ai")
    public HashSet field3982 = new HashSet();

    @ObfuscatedName("la.an")
    public boolean field3971 = false;

    @ObfuscatedName("la.ay")
    public int field3984 = 0;

    @ObfuscatedName("la.be")
    public final int[] field3967 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("la.bo")
    public List field3969;

    @ObfuscatedName("la.bx")
    public Iterator field3989;

    @ObfuscatedName("la.bf")
    public HashSet field3988 = new HashSet();

    @ObfuscatedName("la.bl")
    public class229 field3938 = null;

    @ObfuscatedName("la.bs")
    public boolean field3990 = false;

    @ObfuscatedName("la.ba")
    public class324 field3991;

    @ObfuscatedName("la.bm")
    public int field3992;

    @ObfuscatedName("la.bg")
    public int field3993 = -1;

    @ObfuscatedName("la.bw")
    public int field3963 = -1;

    @ObfuscatedName("la.bq")
    public int field3995 = -1;

    @ObfuscatedName("la.f(Lik;Lkn;Ljava/util/HashMap;[Lle;B)V")
    public void method5725(class250 arg0, class301 arg1, HashMap arg2, class323[] arg3) {
        this.field3958 = arg3;
        this.field3942 = arg0;
        this.field3946 = arg1;
        this.field3947 = new HashMap();
        this.field3947.put(class13.field104, arg2.get(field3951));
        this.field3947.put(class13.field96, arg2.get(field3944));
        this.field3947.put(class13.field97, arg2.get(field3956));
        this.field3954 = new class329(arg0);
        int var5 = this.field3942.method4312(class30.field289.field290);
        int[] var6 = this.field3942.method4366(var5);
        this.field3949 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class185 var8 = new class185(this.field3942.method4289(var5, var6[var7]));
            class21 var9 = new class21();
            var9.method218(var8, var6[var7]);
            this.field3949.put(var9.method202(), var9);
            if (var9.method246()) {
                this.field3950 = var9;
            }
        }
        this.method5843(this.field3950);
        this.field3952 = null;
    }

    @ObfuscatedName("la.l(I)I")
    public int method5726() {
        return this.field3942.method4310(this.field3950.method202(), class30.field287.field290) ? 100 : this.field3942.method4304(this.field3950.method202());
    }

    @ObfuscatedName("la.w(B)V")
    public void method5727() {
        class24.field219.method3756(5);
        class24.field228.method3756(5);
    }

    @ObfuscatedName("la.s(IIZIIIII)V")
    public void method5728(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3954.method5715()) {
            return;
        }
        this.method5731();
        this.method5732();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3976));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3976));
        List var10 = this.field3953.method472(this.field3955 - var8 / 2 - 1, this.field3970 - var9 / 2 - 1, var8 / 2 + this.field3955 + 1, var9 / 2 + this.field3970 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class29 var13 = (class29) var12.next();
            var11.add(var13);
            class58 var14 = new class58();
            class37 var15 = new class37(var13.field282, var13.field272, var13.field283);
            var14.method980(new Object[] { var15, arg0, arg1 });
            if (this.field3988.contains(var13)) {
                var14.method981(17);
            } else {
                var14.method981(15);
            }
            class71.method5372(var14);
        }
        Iterator var16 = this.field3988.iterator();
        while (var16.hasNext()) {
            class29 var17 = (class29) var16.next();
            if (!var11.contains(var17)) {
                class58 var18 = new class58();
                class37 var19 = new class37(var17.field282, var17.field272, var17.field283);
                var18.method980(new Object[] { var19, arg0, arg1 });
                var18.method981(16);
                class71.method5372(var18);
            }
        }
        this.field3988 = var11;
    }

    @ObfuscatedName("la.e(IIZZI)V")
    public void method5821(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = Statics.method1926();
        this.method5730(arg0, arg1, arg3, var5);
        if (!this.method5735() && arg3 || arg2) {
            if (arg3) {
                this.field3973 = arg0;
                this.field3974 = arg1;
                this.field3986 = this.field3955;
                this.field3972 = this.field3970;
            }
            if (this.field3986 != -1) {
                int var7 = arg0 - this.field3973;
                int var8 = arg1 - this.field3974;
                this.method5733(this.field3986 - (int) ((float) var7 / this.field3960), this.field3972 + (int) ((float) var8 / this.field3960), false);
            }
        } else {
            this.method5734();
        }
        if (arg3) {
            this.field3975 = var5;
            this.field3979 = arg0;
            this.field3977 = arg1;
        }
    }

    @ObfuscatedName("la.c(IIZJ)V")
    public void method5730(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3985 == null) {
            this.field3938 = null;
            return;
        }
        int var6 = (int) ((float) this.field3955 + ((float) (arg0 - this.field3959) - (float) this.method5763() * this.field3976 / 2.0F) / this.field3976);
        int var7 = (int) ((float) this.field3970 - ((float) (arg1 - this.field3964) - (float) this.method5764() * this.field3976 / 2.0F) / this.field3976);
        this.field3938 = this.field3985.method217(var6 + this.field3985.method206() * 64, var7 + this.field3985.method239() * 64);
        if (this.field3938 == null || !arg2) {
            return;
        }
        if (client.method4426() && class40.field373[82] && class40.field373[81]) {
            int var8 = this.field3938.field2634;
            int var9 = this.field3938.field2632;
            int var10 = this.field3938.field2633;
            class175 var11 = class175.method85(class172.field2269, client.field861.field1287);
            var11.field2335.method3389(0);
            var11.field2335.method3343(var9);
            var11.field2335.method3371(var10);
            var11.field2335.method3330(var8);
            client.field861.method1944(var11);
            return;
        }
        boolean var12 = true;
        if (this.field3978) {
            int var13 = arg0 - this.field3979;
            int var14 = arg1 - this.field3977;
            if (arg3 - this.field3975 > 500L || var13 < -25 || var13 > 25 || var14 < -25 || var14 > 25) {
                var12 = false;
            }
        }
        if (var12) {
            class175 var15 = class175.method85(class172.field2246, client.field861.field1287);
            var15.field2335.method3389(this.field3938.method4133());
            client.field861.method1944(var15);
            this.field3975 = 0L;
        }
    }

    @ObfuscatedName("la.p(I)V")
    public void method5731() {
        if (Statics.field505 != null) {
            this.field3976 = this.field3960;
            return;
        }
        if (this.field3976 < this.field3960) {
            this.field3976 = Math.min(this.field3960, this.field3976 / 30.0F + this.field3976);
        }
        if (this.field3976 > this.field3960) {
            this.field3976 = Math.max(this.field3960, this.field3976 - this.field3976 / 30.0F);
        }
    }

    @ObfuscatedName("la.r(I)V")
    public void method5732() {
        if (!this.method5735()) {
            return;
        }
        int var1 = this.field3957 - this.field3955;
        int var2 = this.field3994 - this.field3970;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5733(this.field3955 + var1, this.field3970 + var2, true);
        if (this.field3957 == this.field3955 && this.field3994 == this.field3970) {
            this.field3957 = -1;
            this.field3994 = -1;
        }
    }

    @ObfuscatedName("la.m(IIZI)V")
    public final void method5733(int arg0, int arg1, boolean arg2) {
        this.field3955 = arg0;
        this.field3970 = arg1;
        Statics.method1926();
        if (arg2) {
            this.method5734();
        }
    }

    @ObfuscatedName("la.d(B)V")
    public final void method5734() {
        this.field3974 = -1;
        this.field3973 = -1;
        this.field3972 = -1;
        this.field3986 = -1;
    }

    @ObfuscatedName("la.z(B)Z")
    public boolean method5735() {
        return this.field3957 != -1 && this.field3994 != -1;
    }

    @ObfuscatedName("la.x(IIII)Lh;")
    public class21 method5779(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3949.values().iterator();
        class21 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class21) var4.next();
        } while (!var5.method195(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("la.v(IIIZI)V")
    public void method5737(int arg0, int arg1, int arg2, boolean arg3) {
        class21 var5 = this.method5779(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3950;
        }
        boolean var6 = false;
        if (this.field3952 != var5 || arg3) {
            this.field3952 = var5;
            this.method5843(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5794(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("la.g(II)V")
    public void method5741(int arg0) {
        class21 var2 = this.method5869(arg0);
        if (var2 != null) {
            this.method5843(var2);
        }
    }

    @ObfuscatedName("la.u(I)I")
    public int method5739() {
        return this.field3985 == null ? -1 : this.field3985.method231();
    }

    @ObfuscatedName("la.o(B)Lh;")
    public class21 method5740() {
        return this.field3985;
    }

    @ObfuscatedName("la.i(Lh;I)V")
    public void method5843(class21 arg0) {
        if (this.field3985 == null || this.field3985 != arg0) {
            this.method5854(arg0);
            this.method5794(-1, -1, -1);
        }
    }

    @ObfuscatedName("la.k(Lh;I)V")
    public void method5854(class21 arg0) {
        this.field3985 = arg0;
        this.field3953 = new class31(this.field3958, this.field3947);
        this.field3954.method5722(this.field3985.method202());
    }

    @ObfuscatedName("la.q(Lh;Lhx;Lhx;ZI)V")
    public void method5774(class21 arg0, class229 arg1, class229 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3985 == null || this.field3985 != arg0) {
            this.method5854(arg0);
        }
        if (!arg3 && this.field3985.method195(arg1.field2633, arg1.field2634, arg1.field2632)) {
            this.method5794(arg1.field2633, arg1.field2634, arg1.field2632);
        } else {
            this.method5794(arg2.field2633, arg2.field2634, arg2.field2632);
        }
    }

    @ObfuscatedName("la.y(IIII)V")
    public void method5794(int arg0, int arg1, int arg2) {
        if (this.field3985 == null) {
            return;
        }
        int[] var4 = this.field3985.method197(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3985.method197(this.field3985.method211(), this.field3985.method210(), this.field3985.method238());
        }
        this.method5733(var4[0] - this.field3985.method206() * 64, var4[1] - this.field3985.method239() * 64, true);
        this.field3957 = -1;
        this.field3994 = -1;
        this.field3976 = this.method5751(this.field3985.method230());
        this.field3960 = this.field3976;
        this.field3969 = null;
        this.field3989 = null;
        this.field3953.method475();
    }

    @ObfuscatedName("la.av(IIIIII)V")
    public void method5797(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class320.method5505(var6);
        class320.method5454(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class320.method5483(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3954.method5716();
        if (var7 < 100) {
            this.method5859(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3953.method489()) {
            this.field3953.method465(this.field3942, this.field3985.method202(), client.field633);
            if (!this.field3953.method489()) {
                return;
            }
        }
        if (this.field3968 != null) {
            this.field3939++;
            if (this.field3939 % this.field3966 == 0) {
                this.field3939 = 0;
                this.field3945++;
            }
            if (this.field3945 >= this.field3965 && !this.field3981) {
                this.field3968 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3976));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3976));
        this.field3953.method467(this.field3955 - var8 / 2, this.field3970 - var9 / 2, var8 / 2 + this.field3955, var9 / 2 + this.field3970, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3971) {
            boolean var10 = false;
            if (arg4 - this.field3984 > 100) {
                this.field3984 = arg4;
                var10 = true;
            }
            this.field3953.method468(this.field3955 - var8 / 2, this.field3970 - var9 / 2, var8 / 2 + this.field3955, var9 / 2 + this.field3970, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3982, this.field3968, this.field3939, this.field3966, var10);
        }
        this.method5848(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method4426() && this.field3990 && this.field3938 != null) {
            this.field3946.method5225("Coord: " + this.field3938, class320.field3853 + 10, class320.field3851 + 20, 16776960, -1);
        }
        this.field3961 = var8;
        this.field3962 = var9;
        this.field3959 = arg0;
        this.field3964 = arg1;
        class320.method5457(var6);
    }

    @ObfuscatedName("la.ag(IIIIIII)Z")
    public boolean method5836(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3991 == null) {
            return true;
        } else if (this.field3991.field3872 != arg0 || this.field3991.field3871 != arg1) {
            return true;
        } else if (this.field3953.field307 != this.field3992) {
            return true;
        } else if (client.field899 != this.field3995) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("la.af(IIIIIII)V")
    public void method5848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field505 == null) {
            return;
        }
        int var7 = 512 / (this.field3953.field307 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5760() - arg4 / 2 - var7;
        int var14 = this.method5761() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3953.field307 * (var7 + var13 - this.field3993);
        int var16 = arg1 - this.field3953.field307 * (var7 - (var14 - this.field3963));
        if (this.method5836(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3991 != null && this.field3991.field3872 == var11 && this.field3991.field3871 == var12) {
                Arrays.fill(this.field3991.field3873, 0);
            } else {
                this.field3991 = new class324(var11, var12);
            }
            this.field3993 = this.method5760() - arg4 / 2 - var7;
            this.field3963 = this.method5761() - arg5 / 2 - var7;
            this.field3992 = this.field3953.field307;
            Statics.field505.method4437(this.field3993, this.field3963, this.field3991, (float) this.field3992 / var10);
            this.field3995 = client.field899;
            var15 = arg0 - this.field3953.field307 * (var7 + var13 - this.field3993);
            var16 = arg1 - this.field3953.field307 * (var7 - (var14 - this.field3963));
        }
        class320.method5461(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3991.method5577(var15, var16, 192);
        } else {
            this.field3991.method5580(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("la.az(IIIIB)V")
    public void method5748(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3954.method5715()) {
            return;
        }
        if (!this.field3953.method489()) {
            this.field3953.method465(this.field3942, this.field3985.method202(), client.field633);
            if (!this.field3953.method489()) {
                return;
            }
        }
        this.field3953.method492(arg0, arg1, arg2, arg3, this.field3968, this.field3939, this.field3966);
    }

    @ObfuscatedName("la.at(II)V")
    public void method5749(int arg0) {
        this.field3960 = this.method5751(arg0);
    }

    @ObfuscatedName("la.ac(IIIIII)V")
    public void method5859(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class320.method5483(arg0, arg1, arg2, arg3, -16777216);
        class320.method5465(var7 - 152, var8, 304, 34, -65536);
        class320.method5483(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3946.method5267(class240.field3151, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("la.am(IB)F")
    public float method5751(int arg0) {
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

    @ObfuscatedName("la.aw(I)I")
    public int method5752() {
        if ((double) this.field3960 == 1.0D) {
            return 25;
        } else if ((double) this.field3960 == 1.5D) {
            return 37;
        } else if ((double) this.field3960 == 2.0D) {
            return 50;
        } else if ((double) this.field3960 == 3.0D) {
            return 75;
        } else if ((double) this.field3960 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("la.aa(I)V")
    public void method5770() {
        this.field3954.method5714();
    }

    @ObfuscatedName("la.as(B)Z")
    public boolean method5847() {
        return this.field3954.method5715();
    }

    @ObfuscatedName("la.al(II)Lh;")
    public class21 method5869(int arg0) {
        Iterator var2 = this.field3949.values().iterator();
        class21 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class21) var2.next();
        } while (var3.method231() != arg0);
        return var3;
    }

    @ObfuscatedName("la.ad(IIB)V")
    public void method5834(int arg0, int arg1) {
        if (this.field3985 != null && this.field3985.method196(arg0, arg1)) {
            this.field3957 = arg0 - this.field3985.method206() * 64;
            this.field3994 = arg1 - this.field3985.method239() * 64;
        }
    }

    @ObfuscatedName("la.ax(IIB)V")
    public void method5861(int arg0, int arg1) {
        if (this.field3985 != null) {
            this.method5733(arg0 - this.field3985.method206() * 64, arg1 - this.field3985.method239() * 64, true);
            this.field3957 = -1;
            this.field3994 = -1;
        }
    }

    @ObfuscatedName("la.ao(IIIB)V")
    public void method5758(int arg0, int arg1, int arg2) {
        if (this.field3985 != null) {
            int[] var4 = this.field3985.method197(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5834(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("la.ae(IIII)V")
    public void method5759(int arg0, int arg1, int arg2) {
        if (this.field3985 != null) {
            int[] var4 = this.field3985.method197(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5861(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("la.ap(B)I")
    public int method5760() {
        return this.field3985 == null ? -1 : this.field3955 + this.field3985.method206() * 64;
    }

    @ObfuscatedName("la.ar(B)I")
    public int method5761() {
        return this.field3985 == null ? -1 : this.field3970 + this.field3985.method239() * 64;
    }

    @ObfuscatedName("la.ab(B)Lhx;")
    public class229 method5762() {
        return this.field3985 == null ? null : this.field3985.method217(this.method5760(), this.method5761());
    }

    @ObfuscatedName("la.aq(I)I")
    public int method5763() {
        return this.field3961;
    }

    @ObfuscatedName("la.au(B)I")
    public int method5764() {
        return this.field3962;
    }

    @ObfuscatedName("la.aj(IB)V")
    public void method5765(int arg0) {
        if (arg0 >= 1) {
            this.field3965 = arg0;
        }
    }

    @ObfuscatedName("la.ah(I)V")
    public void method5766() {
        this.field3965 = 3;
    }

    @ObfuscatedName("la.ai(IB)V")
    public void method5767(int arg0) {
        if (arg0 >= 1) {
            this.field3966 = arg0;
        }
    }

    @ObfuscatedName("la.an(B)V")
    public void method5768() {
        this.field3966 = 50;
    }

    @ObfuscatedName("la.ay(ZI)V")
    public void method5769(boolean arg0) {
        this.field3981 = arg0;
    }

    @ObfuscatedName("la.ak(II)V")
    public void method5781(int arg0) {
        this.field3968 = new HashSet();
        this.field3968.add(arg0);
        this.field3945 = 0;
        this.field3939 = 0;
    }

    @ObfuscatedName("la.be(II)V")
    public void method5771(int arg0) {
        this.field3968 = new HashSet();
        this.field3945 = 0;
        this.field3939 = 0;
        for (int var2 = 0; var2 < Statics.field3301; var2++) {
            if (class258.method3139(var2) != null && class258.method3139(var2).field3322 == arg0) {
                this.field3968.add(class258.method3139(var2).field3320);
            }
        }
    }

    @ObfuscatedName("la.bo(I)V")
    public void method5753() {
        this.field3968 = null;
    }

    @ObfuscatedName("la.bx(ZI)V")
    public void method5773(boolean arg0) {
        this.field3971 = !arg0;
    }

    @ObfuscatedName("la.bf(IZB)V")
    public void method5893(int arg0, boolean arg1) {
        if (arg1) {
            this.field3983.remove(arg0);
        } else {
            this.field3983.add(arg0);
        }
        this.method5787();
    }

    @ObfuscatedName("la.bl(IZI)V")
    public void method5775(int arg0, boolean arg1) {
        if (arg1) {
            this.field3948.remove(arg0);
        } else {
            this.field3948.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3301; var3++) {
            if (class258.method3139(var3) != null && class258.method3139(var3).field3322 == arg0) {
                int var4 = class258.method3139(var3).field3320;
                if (arg1) {
                    this.field3987.remove(var4);
                } else {
                    this.field3987.add(var4);
                }
            }
        }
        this.method5787();
    }

    @ObfuscatedName("la.bs(I)Z")
    public boolean method5776() {
        return !this.field3971;
    }

    @ObfuscatedName("la.ba(IB)Z")
    public boolean method5736(int arg0) {
        return !this.field3983.contains(arg0);
    }

    @ObfuscatedName("la.bm(II)Z")
    public boolean method5778(int arg0) {
        return !this.field3948.contains(arg0);
    }

    @ObfuscatedName("la.bg(B)V")
    public void method5787() {
        this.field3982.clear();
        this.field3982.addAll(this.field3983);
        this.field3982.addAll(this.field3987);
    }

    @ObfuscatedName("la.bw(IIIIIII)V")
    public void method5890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3954.method5715()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3976));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3976));
        List var9 = this.field3953.method472(this.field3955 - var7 / 2 - 1, this.field3970 - var8 / 2 - 1, var7 / 2 + this.field3955 + 1, var8 / 2 + this.field3970 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class258 var12 = class258.method3139(var11.field282);
            var13 = false;
            for (int var14 = this.field3967.length - 1; var14 >= 0; var14--) {
                if (var12.field3319[var14] != null) {
                    client.method4938(var12.field3319[var14], var12.field3312, this.field3967[var14], var11.field282, var11.field272.method4133(), var11.field283.method4133());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("la.bq(ILhx;I)Lhx;")
    public class229 method5772(int arg0, class229 arg1) {
        if (!this.field3954.method5715()) {
            return null;
        } else if (!this.field3953.method489()) {
            return null;
        } else if (this.field3985.method196(arg1.field2634, arg1.field2632)) {
            HashMap var3 = this.field3953.method466();
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
                        return var5.field283;
                    }
                    var8 = (class29) var7.next();
                    int var9 = var8.field283.field2634 - arg1.field2634;
                    int var10 = var8.field283.field2632 - arg1.field2632;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field283;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("la.bi(IILhx;Lhx;I)V")
    public void method5901(int arg0, int arg1, class229 arg2, class229 arg3) {
        class58 var5 = new class58();
        class37 var6 = new class37(arg1, arg2, arg3);
        var5.method980(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method981(10);
                break;
            case 1009:
                var5.method981(11);
                break;
            case 1010:
                var5.method981(12);
                break;
            case 1011:
                var5.method981(13);
                break;
            case 1012:
                var5.method981(14);
        }
        class71.method5372(var5);
    }

    @ObfuscatedName("la.bn(I)Laf;")
    public class29 method5783() {
        if (!this.field3954.method5715()) {
            return null;
        } else if (this.field3953.method489()) {
            HashMap var1 = this.field3953.method466();
            this.field3969 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3969.addAll(var3);
            }
            this.field3989 = this.field3969.iterator();
            return this.method5864();
        } else {
            return null;
        }
    }

    @ObfuscatedName("la.bv(S)Laf;")
    public class29 method5864() {
        if (this.field3989 == null) {
            return null;
        } else if (this.field3989.hasNext()) {
            return (class29) this.field3989.next();
        } else {
            return null;
        }
    }
}
