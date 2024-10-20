package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ld")
public class class333 {

    @ObfuscatedName("ld.e")
    public class234 field3948;

    @ObfuscatedName("ld.x")
    public class234 field3988;

    @ObfuscatedName("ld.a")
    public class234 field3950;

    @ObfuscatedName("ld.d")
    public static final class292 field4000 = class292.field3642;

    @ObfuscatedName("ld.c")
    public static final class292 field3951 = class292.field3643;

    @ObfuscatedName("ld.o")
    public static final class292 field3989 = class292.field3640;

    @ObfuscatedName("ld.v")
    public class294 field3994;

    @ObfuscatedName("ld.k")
    public HashMap field3952;

    @ObfuscatedName("ld.s")
    public class324[] field3984;

    @ObfuscatedName("ld.l")
    public HashMap field3957;

    @ObfuscatedName("ld.t")
    public class27 field3958;

    @ObfuscatedName("ld.j")
    public class27 field3959;

    @ObfuscatedName("ld.n")
    public class27 field3960;

    @ObfuscatedName("ld.u")
    public class37 field3961;

    @ObfuscatedName("ld.z")
    public class332 field3967;

    @ObfuscatedName("ld.h")
    public int field3963;

    @ObfuscatedName("ld.m")
    public int field3964;

    @ObfuscatedName("ld.g")
    public int field3965 = -1;

    @ObfuscatedName("ld.r")
    public int field3944 = -1;

    @ObfuscatedName("ld.q")
    public float field3986;

    @ObfuscatedName("ld.aa")
    public float field3968;

    @ObfuscatedName("ld.av")
    public int field3969 = -1;

    @ObfuscatedName("ld.aw")
    public int field3970 = -1;

    @ObfuscatedName("ld.as")
    public int field3971 = -1;

    @ObfuscatedName("ld.ak")
    public int field3972 = -1;

    @ObfuscatedName("ld.au")
    public int field3949 = 3;

    @ObfuscatedName("ld.ah")
    public int field3974 = 50;

    @ObfuscatedName("ld.aq")
    public boolean field3975 = false;

    @ObfuscatedName("ld.ao")
    public HashSet field3976 = null;

    @ObfuscatedName("ld.an")
    public int field3977 = -1;

    @ObfuscatedName("ld.ar")
    public int field3978 = -1;

    @ObfuscatedName("ld.az")
    public int field3979 = -1;

    @ObfuscatedName("ld.ay")
    public int field3980 = -1;

    @ObfuscatedName("ld.ag")
    public int field3981 = -1;

    @ObfuscatedName("ld.ac")
    public int field3993 = -1;

    @ObfuscatedName("ld.al")
    public long field3953;

    @ObfuscatedName("ld.ae")
    public int field3983;

    @ObfuscatedName("ld.ad")
    public int field3985;

    @ObfuscatedName("ld.aj")
    public boolean field3982 = true;

    @ObfuscatedName("ld.af")
    public HashSet field3987 = new HashSet();

    @ObfuscatedName("ld.ap")
    public HashSet field3954 = new HashSet();

    @ObfuscatedName("ld.ai")
    public HashSet field3973 = new HashSet();

    @ObfuscatedName("ld.am")
    public HashSet field3990 = new HashSet();

    @ObfuscatedName("ld.ab")
    public boolean field3991 = false;

    @ObfuscatedName("ld.bj")
    public int field3992 = 0;

    @ObfuscatedName("ld.bw")
    public final int[] field3998 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ld.bk")
    public List field3947;

    @ObfuscatedName("ld.bl")
    public Iterator field3995;

    @ObfuscatedName("ld.bq")
    public HashSet field3996 = new HashSet();

    @ObfuscatedName("ld.bx")
    public class214 field3997 = null;

    @ObfuscatedName("ld.bc")
    public boolean field3955 = false;

    @ObfuscatedName("ld.by")
    public class325 field3999;

    @ObfuscatedName("ld.bz")
    public int field3956;

    @ObfuscatedName("ld.bm")
    public int field4001 = -1;

    @ObfuscatedName("ld.bo")
    public int field4002 = -1;

    @ObfuscatedName("ld.bs")
    public int field4003 = -1;

    @ObfuscatedName("ld.f(Lhz;Lhz;Lhz;Lko;Ljava/util/HashMap;[Lli;I)V")
    public void method5853(class234 arg0, class234 arg1, class234 arg2, class294 arg3, HashMap arg4, class324[] arg5) {
        this.field3984 = arg5;
        this.field3948 = arg0;
        this.field3988 = arg1;
        this.field3950 = arg2;
        this.field3994 = arg3;
        this.field3952 = new HashMap();
        this.field3952.put(class18.field107, arg4.get(field4000));
        this.field3952.put(class18.field108, arg4.get(field3951));
        this.field3952.put(class18.field109, arg4.get(field3989));
        this.field3967 = new class332(arg0);
        int var7 = this.field3948.method3847(class36.field292.field286);
        int[] var8 = this.field3948.method3808(var7);
        this.field3957 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class300 var10 = new class300(this.field3948.method3752(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method340(var10, var8[var9]);
            this.field3957.put(var11.method315(), var11);
            if (var11.method274()) {
                this.field3958 = var11;
            }
        }
        this.method5896(this.field3958);
        this.field3960 = null;
    }

    @ObfuscatedName("ld.i(I)V")
    public void method5854() {
        class30.field234.method3126(5);
    }

    @ObfuscatedName("ld.y(IIZIIIII)V")
    public void method5855(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3967.method5838()) {
            return;
        }
        this.method5869();
        this.method5866();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3986));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3986));
        List var10 = this.field3961.method549(this.field3963 - var8 / 2 - 1, this.field3964 - var9 / 2 - 1, var8 / 2 + this.field3963 + 1, var9 / 2 + this.field3964 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method183(), var13.field278, var13.field277);
            var14.method1033(new Object[] { var15, arg0, arg1 });
            if (this.field3996.contains(var13)) {
                var14.method1034(17);
            } else {
                var14.method1034(15);
            }
            class77.method1570(var14);
        }
        Iterator var16 = this.field3996.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method183(), var17.field278, var17.field277);
                var18.method1033(new Object[] { var19, arg0, arg1 });
                var18.method1034(16);
                class77.method1570(var18);
            }
        }
        this.field3996 = var11;
    }

    @ObfuscatedName("ld.w(IIZZB)V")
    public void method5856(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class297.method481();
        this.method5920(arg0, arg1, arg3, var5);
        if (!this.method5862() && arg3 || arg2) {
            if (arg3) {
                this.field3981 = arg0;
                this.field3993 = arg1;
                this.field3979 = this.field3963;
                this.field3980 = this.field3964;
            }
            if (this.field3979 != -1) {
                int var7 = arg0 - this.field3981;
                int var8 = arg1 - this.field3993;
                this.method5908(this.field3979 - (int) ((float) var7 / this.field3968), this.field3980 + (int) ((float) var8 / this.field3968), false);
            }
        } else {
            this.method6029();
        }
        if (arg3) {
            this.field3953 = var5;
            this.field3983 = arg0;
            this.field3985 = arg1;
        }
    }

    @ObfuscatedName("ld.p(IIZJ)V")
    public void method5920(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3959 == null) {
            this.field3997 = null;
            return;
        }
        int var6 = (int) ((float) this.field3963 + ((float) (arg0 - this.field3971) - (float) this.method5890() * this.field3986 / 2.0F) / this.field3986);
        int var7 = (int) ((float) this.field3964 - ((float) (arg1 - this.field3972) - (float) this.method5946() * this.field3986 / 2.0F) / this.field3986);
        this.field3997 = this.field3959.method271(var6 + this.field3959.method339() * 64, var7 + this.field3959.method281() * 64);
        if (this.field3997 == null || !arg2) {
            return;
        }
        boolean var8 = client.field798 >= 2;
        if (var8 && class45.field367[82] && class45.field367[81]) {
            int var9 = this.field3997.field2516;
            int var10 = this.field3997.field2518;
            int var11 = this.field3997.field2517;
            class182 var12 = class182.method19(class178.field2252, client.field668.field1294);
            var12.field2303.method5145(var9);
            var12.field2303.method5155(0);
            var12.field2303.method5145(var10);
            var12.field2303.method5136(var11);
            client.field668.method2084(var12);
            return;
        }
        boolean var13 = true;
        if (this.field3982) {
            int var14 = arg0 - this.field3983;
            int var15 = arg1 - this.field3985;
            if (arg3 - this.field3953 > 500L || var14 < -25 || var14 > 25 || var15 < -25 || var15 > 25) {
                var13 = false;
            }
        }
        if (var13) {
            class182 var16 = class182.method19(class178.field2211, client.field668.field1294);
            var16.field2303.method5155(this.field3997.method3597());
            client.field668.method2084(var16);
            this.field3953 = 0L;
        }
    }

    @ObfuscatedName("ld.b(I)V")
    public void method5869() {
        if (Statics.field2535 != null) {
            this.field3986 = this.field3968;
            return;
        }
        if (this.field3986 < this.field3968) {
            this.field3986 = Math.min(this.field3968, this.field3986 / 30.0F + this.field3986);
        }
        if (this.field3986 > this.field3968) {
            this.field3986 = Math.max(this.field3968, this.field3986 - this.field3986 / 30.0F);
        }
    }

    @ObfuscatedName("ld.e(I)V")
    public void method5866() {
        if (!this.method5862()) {
            return;
        }
        int var1 = this.field3965 - this.field3963;
        int var2 = this.field3944 - this.field3964;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5908(this.field3963 + var1, this.field3964 + var2, true);
        if (this.field3965 == this.field3963 && this.field3964 == this.field3944) {
            this.field3965 = -1;
            this.field3944 = -1;
        }
    }

    @ObfuscatedName("ld.x(IIZI)V")
    public final void method5908(int arg0, int arg1, boolean arg2) {
        this.field3963 = arg0;
        this.field3964 = arg1;
        class297.method481();
        if (arg2) {
            this.method6029();
        }
    }

    @ObfuscatedName("ld.a(I)V")
    public final void method6029() {
        this.field3993 = -1;
        this.field3981 = -1;
        this.field3980 = -1;
        this.field3979 = -1;
    }

    @ObfuscatedName("ld.d(I)Z")
    public boolean method5862() {
        return this.field3965 != -1 && this.field3944 != -1;
    }

    @ObfuscatedName("ld.c(IIII)Laa;")
    public class27 method5877(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3957.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method268(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ld.o(IIIZI)V")
    public void method5864(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5877(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3958;
        }
        boolean var6 = false;
        if (this.field3960 != var5 || arg3) {
            this.field3960 = var5;
            this.method5896(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5938(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ld.l(IB)V")
    public void method5951(int arg0) {
        class27 var2 = this.method5922(arg0);
        if (var2 != null) {
            this.method5896(var2);
        }
    }

    @ObfuscatedName("ld.t(I)I")
    public int method5998() {
        return this.field3959 == null ? -1 : this.field3959.method273();
    }

    @ObfuscatedName("ld.j(I)Laa;")
    public class27 method5867() {
        return this.field3959;
    }

    @ObfuscatedName("ld.n(Laa;B)V")
    public void method5896(class27 arg0) {
        if (this.field3959 == null || this.field3959 != arg0) {
            this.method5945(arg0);
            this.method5938(-1, -1, -1);
        }
    }

    @ObfuscatedName("ld.u(Laa;I)V")
    public void method5945(class27 arg0) {
        this.field3959 = arg0;
        this.field3961 = new class37(this.field3984, this.field3952, this.field3988, this.field3950);
        this.field3967.method5836(this.field3959.method315());
    }

    @ObfuscatedName("ld.z(Laa;Lht;Lht;ZI)V")
    public void method5870(class27 arg0, class214 arg1, class214 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3959 == null || this.field3959 != arg0) {
            this.method5945(arg0);
        }
        if (!arg3 && this.field3959.method268(arg1.field2517, arg1.field2516, arg1.field2518)) {
            this.method5938(arg1.field2517, arg1.field2516, arg1.field2518);
        } else {
            this.method5938(arg2.field2517, arg2.field2516, arg2.field2518);
        }
    }

    @ObfuscatedName("ld.h(IIII)V")
    public void method5938(int arg0, int arg1, int arg2) {
        if (this.field3959 == null) {
            return;
        }
        int[] var4 = this.field3959.method270(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3959.method270(this.field3959.method284(), this.field3959.method283(), this.field3959.method285());
        }
        this.method5908(var4[0] - this.field3959.method339() * 64, var4[1] - this.field3959.method281() * 64, true);
        this.field3965 = -1;
        this.field3944 = -1;
        this.field3986 = this.method5878(this.field3959.method289());
        this.field3968 = this.field3986;
        this.field3947 = null;
        this.field3995 = null;
        this.field3961.method560();
    }

    @ObfuscatedName("ld.m(IIIIII)V")
    public void method5872(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class321.method5593(var6);
        class321.method5541(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class321.method5589(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3967.method5839();
        if (var7 < 100) {
            this.method5949(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3961.method531()) {
            this.field3961.method524(this.field3948, this.field3959.method315(), client.field634);
            if (!this.field3961.method531()) {
                return;
            }
        }
        if (this.field3976 != null) {
            this.field3978++;
            if (this.field3978 % this.field3974 == 0) {
                this.field3978 = 0;
                this.field3977++;
            }
            if (this.field3977 >= this.field3949 && !this.field3975) {
                this.field3976 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3986));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3986));
        this.field3961.method526(this.field3963 - var8 / 2, this.field3964 - var9 / 2, var8 / 2 + this.field3963, var9 / 2 + this.field3964, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3991) {
            boolean var10 = false;
            if (arg4 - this.field3992 > 100) {
                this.field3992 = arg4;
                var10 = true;
            }
            this.field3961.method565(this.field3963 - var8 / 2, this.field3964 - var9 / 2, var8 / 2 + this.field3963, var9 / 2 + this.field3964, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3990, this.field3976, this.field3978, this.field3974, var10);
        }
        this.method5874(arg0, arg1, arg2, arg3, var8, var9);
        boolean var11 = client.field798 >= 2;
        if (var11 && this.field3955 && this.field3997 != null) {
            this.field3994.method4966("Coord: " + this.field3997, class321.field3840 + 10, class321.field3845 + 20, 16776960, -1);
        }
        this.field3969 = var8;
        this.field3970 = var9;
        this.field3971 = arg0;
        this.field3972 = arg1;
        class321.method5544(var6);
    }

    @ObfuscatedName("ld.aa(IIIIIII)Z")
    public boolean method6011(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3999 == null) {
            return true;
        } else if (this.field3999.field3875 != arg0 || this.field3999.field3865 != arg1) {
            return true;
        } else if (this.field3961.field312 != this.field3956) {
            return true;
        } else if (client.field750 != this.field4003) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("ld.av(IIIIIIB)V")
    public void method5874(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field2535 == null) {
            return;
        }
        int var7 = 512 / (this.field3961.field312 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5887() - arg4 / 2 - var7;
        int var14 = this.method5921() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3961.field312 * (var7 + var13 - this.field4001);
        int var16 = arg1 - this.field3961.field312 * (var7 - (var14 - this.field4002));
        if (this.method6011(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3999 != null && this.field3999.field3875 == var11 && this.field3999.field3865 == var12) {
                Arrays.fill(this.field3999.field3873, 0);
            } else {
                this.field3999 = new class325(var11, var12);
            }
            this.field4001 = this.method5887() - arg4 / 2 - var7;
            this.field4002 = this.method5921() - arg5 / 2 - var7;
            this.field3956 = this.field3961.field312;
            Statics.field2535.method3936(this.field4001, this.field4002, this.field3999, (float) this.field3956 / var10);
            this.field4003 = client.field750;
            var15 = arg0 - this.field3961.field312 * (var7 + var13 - this.field4001);
            var16 = arg1 - this.field3961.field312 * (var7 - (var14 - this.field4002));
        }
        class321.method5547(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3999.method5661(var15, var16, 192);
        } else {
            this.field3999.method5664(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("ld.aw(IIIII)V")
    public void method5875(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3967.method5838()) {
            return;
        }
        if (!this.field3961.method531()) {
            this.field3961.method524(this.field3948, this.field3959.method315(), client.field634);
            if (!this.field3961.method531()) {
                return;
            }
        }
        this.field3961.method528(arg0, arg1, arg2, arg3, this.field3976, this.field3978, this.field3974);
    }

    @ObfuscatedName("ld.as(IB)V")
    public void method5879(int arg0) {
        this.field3968 = this.method5878(arg0);
    }

    @ObfuscatedName("ld.ak(IIIIIB)V")
    public void method5949(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class321.method5589(arg0, arg1, arg2, arg3, -16777216);
        class321.method5553(var7 - 152, var8, 304, 34, -65536);
        class321.method5589(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3994.method4988(class225.field3045, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ld.au(II)F")
    public float method5878(int arg0) {
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

    @ObfuscatedName("ld.ah(B)I")
    public int method5889() {
        if ((double) this.field3968 == 1.0D) {
            return 25;
        } else if ((double) this.field3968 == 1.5D) {
            return 37;
        } else if ((double) this.field3968 == 2.0D) {
            return 50;
        } else if ((double) this.field3968 == 3.0D) {
            return 75;
        } else if ((double) this.field3968 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ld.aq(I)V")
    public void method5880() {
        this.field3967.method5837();
    }

    @ObfuscatedName("ld.ao(B)Z")
    public boolean method5985() {
        return this.field3967.method5838();
    }

    @ObfuscatedName("ld.an(II)Laa;")
    public class27 method5922(int arg0) {
        Iterator var2 = this.field3957.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method273() != arg0);
        return var3;
    }

    @ObfuscatedName("ld.ar(III)V")
    public void method5863(int arg0, int arg1) {
        if (this.field3959 != null && this.field3959.method269(arg0, arg1)) {
            this.field3965 = arg0 - this.field3959.method339() * 64;
            this.field3944 = arg1 - this.field3959.method281() * 64;
        }
    }

    @ObfuscatedName("ld.az(III)V")
    public void method5884(int arg0, int arg1) {
        if (this.field3959 != null) {
            this.method5908(arg0 - this.field3959.method339() * 64, arg1 - this.field3959.method281() * 64, true);
            this.field3965 = -1;
            this.field3944 = -1;
        }
    }

    @ObfuscatedName("ld.ay(IIIB)V")
    public void method6012(int arg0, int arg1, int arg2) {
        if (this.field3959 != null) {
            int[] var4 = this.field3959.method270(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5863(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ld.ag(IIII)V")
    public void method5886(int arg0, int arg1, int arg2) {
        if (this.field3959 != null) {
            int[] var4 = this.field3959.method270(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5884(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ld.ac(I)I")
    public int method5887() {
        return this.field3959 == null ? -1 : this.field3963 + this.field3959.method339() * 64;
    }

    @ObfuscatedName("ld.al(I)I")
    public int method5921() {
        return this.field3959 == null ? -1 : this.field3964 + this.field3959.method281() * 64;
    }

    @ObfuscatedName("ld.ae(I)Lht;")
    public class214 method5857() {
        return this.field3959 == null ? null : this.field3959.method271(this.method5887(), this.method5921());
    }

    @ObfuscatedName("ld.ad(I)I")
    public int method5890() {
        return this.field3969;
    }

    @ObfuscatedName("ld.aj(I)I")
    public int method5946() {
        return this.field3970;
    }

    @ObfuscatedName("ld.ax(II)V")
    public void method6027(int arg0) {
        if (arg0 >= 1) {
            this.field3949 = arg0;
        }
    }

    @ObfuscatedName("ld.at(I)V")
    public void method5893() {
        this.field3949 = 3;
    }

    @ObfuscatedName("ld.af(IB)V")
    public void method5894(int arg0) {
        if (arg0 >= 1) {
            this.field3974 = arg0;
        }
    }

    @ObfuscatedName("ld.ap(I)V")
    public void method5861() {
        this.field3974 = 50;
    }

    @ObfuscatedName("ld.ai(ZB)V")
    public void method5971(boolean arg0) {
        this.field3975 = arg0;
    }

    @ObfuscatedName("ld.am(II)V")
    public void method5919(int arg0) {
        this.field3976 = new HashSet();
        this.field3976.add(arg0);
        this.field3977 = 0;
        this.field3978 = 0;
    }

    @ObfuscatedName("ld.ab(IB)V")
    public void method5898(int arg0) {
        this.field3976 = new HashSet();
        this.field3977 = 0;
        this.field3978 = 0;
        for (int var2 = 0; var2 < Statics.field2301; var2++) {
            if (class242.method103(var2) != null && class242.method103(var2).field3202 == arg0) {
                this.field3976.add(class242.method103(var2).field3183);
            }
        }
    }

    @ObfuscatedName("ld.bj(B)V")
    public void method5930() {
        this.field3976 = null;
    }

    @ObfuscatedName("ld.bg(ZI)V")
    public void method5900(boolean arg0) {
        this.field3991 = !arg0;
    }

    @ObfuscatedName("ld.bw(IZI)V")
    public void method5901(int arg0, boolean arg1) {
        if (arg1) {
            this.field3987.remove(arg0);
        } else {
            this.field3987.add(arg0);
        }
        this.method5906();
    }

    @ObfuscatedName("ld.bk(IZI)V")
    public void method5902(int arg0, boolean arg1) {
        if (arg1) {
            this.field3954.remove(arg0);
        } else {
            this.field3954.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field2301; var3++) {
            if (class242.method103(var3) != null && class242.method103(var3).field3202 == arg0) {
                int var4 = class242.method103(var3).field3183;
                if (arg1) {
                    this.field3973.remove(var4);
                } else {
                    this.field3973.add(var4);
                }
            }
        }
        this.method5906();
    }

    @ObfuscatedName("ld.bl(I)Z")
    public boolean method5903() {
        return !this.field3991;
    }

    @ObfuscatedName("ld.bq(II)Z")
    public boolean method5904(int arg0) {
        return !this.field3987.contains(arg0);
    }

    @ObfuscatedName("ld.bx(II)Z")
    public boolean method5955(int arg0) {
        return !this.field3954.contains(arg0);
    }

    @ObfuscatedName("ld.bc(I)V")
    public void method5906() {
        this.field3990.clear();
        this.field3990.addAll(this.field3987);
        this.field3990.addAll(this.field3973);
    }

    @ObfuscatedName("ld.by(IIIIIII)V")
    public void method5907(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3967.method5838()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3986));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3986));
        List var9 = this.field3961.method549(this.field3963 - var7 / 2 - 1, this.field3964 - var8 / 2 - 1, var7 / 2 + this.field3963 + 1, var8 / 2 + this.field3964 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
        if (var9.isEmpty()) {
            return;
        }
        Iterator var10 = var9.iterator();
        boolean var13;
        do {
            if (!var10.hasNext()) {
                return;
            }
            class35 var11 = (class35) var10.next();
            class242 var12 = class242.method103(var11.method183());
            var13 = false;
            for (int var14 = this.field3998.length - 1; var14 >= 0; var14--) {
                if (var12.field3191[var14] != null) {
                    Statics.method10(var12.field3191[var14], var12.field3193, this.field3998[var14], var11.method183(), var11.field278.method3597(), var11.field277.method3597());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ld.bz(ILht;I)Lht;")
    public class214 method5913(int arg0, class214 arg1) {
        if (!this.field3967.method5838()) {
            return null;
        } else if (!this.field3961.method531()) {
            return null;
        } else if (this.field3959.method269(arg1.field2516, arg1.field2518)) {
            HashMap var3 = this.field3961.method538();
            List var4 = (List) var3.get(arg0);
            if (var4 == null || var4.isEmpty()) {
                return null;
            }
            class35 var5 = null;
            int var6 = -1;
            Iterator var7 = var4.iterator();
            while (true) {
                class35 var8;
                int var11;
                do {
                    if (!var7.hasNext()) {
                        return var5.field277;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field277.field2516 - arg1.field2516;
                    int var10 = var8.field277.field2518 - arg1.field2518;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field277;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ld.bm(IILht;Lht;I)V")
    public void method6008(int arg0, int arg1, class214 arg2, class214 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1033(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1034(10);
                break;
            case 1009:
                var5.method1034(11);
                break;
            case 1010:
                var5.method1034(12);
                break;
            case 1011:
                var5.method1034(13);
                break;
            case 1012:
                var5.method1034(14);
        }
        class77.method1570(var5);
    }

    @ObfuscatedName("ld.bo(S)Lao;")
    public class35 method5910() {
        if (!this.field3967.method5838()) {
            return null;
        } else if (this.field3961.method531()) {
            HashMap var1 = this.field3961.method538();
            this.field3947 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3947.addAll(var3);
            }
            this.field3995 = this.field3947.iterator();
            return this.method5911();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ld.bs(B)Lao;")
    public class35 method5911() {
        if (this.field3995 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field3995.hasNext()) {
                return null;
            }
            var1 = (class35) this.field3995.next();
        } while (var1.method183() == -1);
        return var1;
    }
}
