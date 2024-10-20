package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lq")
public class class334 {

    @ObfuscatedName("lq.p")
    public class255 field3954;

    @ObfuscatedName("lq.m")
    public class255 field3955;

    @ObfuscatedName("lq.q")
    public class255 field3956;

    @ObfuscatedName("lq.b")
    public static final class302 field3973 = class302.field3748;

    @ObfuscatedName("lq.n")
    public static final class302 field3958 = class302.field3746;

    @ObfuscatedName("lq.e")
    public static final class302 field3961 = class302.field3756;

    @ObfuscatedName("lq.r")
    public class305 field4004;

    @ObfuscatedName("lq.t")
    public HashMap field3953;

    @ObfuscatedName("lq.l")
    public class327[] field3962;

    @ObfuscatedName("lq.o")
    public HashMap field3979;

    @ObfuscatedName("lq.u")
    public class27 field3964;

    @ObfuscatedName("lq.y")
    public class27 field4006;

    @ObfuscatedName("lq.k")
    public class27 field3995;

    @ObfuscatedName("lq.v")
    public class37 field3966;

    @ObfuscatedName("lq.d")
    public class333 field3965;

    @ObfuscatedName("lq.w")
    public int field3969;

    @ObfuscatedName("lq.i")
    public int field3970;

    @ObfuscatedName("lq.c")
    public int field3971 = -1;

    @ObfuscatedName("lq.j")
    public int field3972 = -1;

    @ObfuscatedName("lq.z")
    public float field4000;

    @ObfuscatedName("lq.ag")
    public float field3974;

    @ObfuscatedName("lq.af")
    public int field3975 = -1;

    @ObfuscatedName("lq.ay")
    public int field4007 = -1;

    @ObfuscatedName("lq.aa")
    public int field3977 = -1;

    @ObfuscatedName("lq.ab")
    public int field3978 = -1;

    @ObfuscatedName("lq.ah")
    public int field3967 = 3;

    @ObfuscatedName("lq.aw")
    public int field3960 = 50;

    @ObfuscatedName("lq.an")
    public boolean field4005 = false;

    @ObfuscatedName("lq.at")
    public HashSet field3982 = null;

    @ObfuscatedName("lq.ae")
    public int field3983 = -1;

    @ObfuscatedName("lq.av")
    public int field3984 = -1;

    @ObfuscatedName("lq.au")
    public int field3985 = -1;

    @ObfuscatedName("lq.aj")
    public int field3986 = -1;

    @ObfuscatedName("lq.as")
    public int field3987 = -1;

    @ObfuscatedName("lq.ar")
    public int field3988 = -1;

    @ObfuscatedName("lq.ai")
    public long field3989;

    @ObfuscatedName("lq.aq")
    public int field3990;

    @ObfuscatedName("lq.al")
    public int field3991;

    @ObfuscatedName("lq.az")
    public boolean field3992 = true;

    @ObfuscatedName("lq.ad")
    public HashSet field3993 = new HashSet();

    @ObfuscatedName("lq.ax")
    public HashSet field3994 = new HashSet();

    @ObfuscatedName("lq.ap")
    public HashSet field3951 = new HashSet();

    @ObfuscatedName("lq.ak")
    public HashSet field3996 = new HashSet();

    @ObfuscatedName("lq.am")
    public boolean field3997 = false;

    @ObfuscatedName("lq.bf")
    public int field3998 = 0;

    @ObfuscatedName("lq.be")
    public final int[] field3999 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lq.bd")
    public List field3957;

    @ObfuscatedName("lq.bz")
    public Iterator field4001;

    @ObfuscatedName("lq.bi")
    public HashSet field4002 = new HashSet();

    @ObfuscatedName("lq.bp")
    public class235 field4003 = null;

    @ObfuscatedName("lq.bv")
    public boolean field3968 = false;

    @ObfuscatedName("lq.bg")
    public class328 field3949;

    @ObfuscatedName("lq.bk")
    public int field3959;

    @ObfuscatedName("lq.br")
    public int field3963 = -1;

    @ObfuscatedName("lq.bn")
    public int field4008 = -1;

    @ObfuscatedName("lq.bl")
    public int field4009 = -1;

    @ObfuscatedName("lq.a(Liz;Liz;Liz;Lkt;Ljava/util/HashMap;[Llv;B)V")
    public void method5816(class255 arg0, class255 arg1, class255 arg2, class305 arg3, HashMap arg4, class327[] arg5) {
        this.field3962 = arg5;
        this.field3954 = arg0;
        this.field3955 = arg1;
        this.field3956 = arg2;
        this.field4004 = arg3;
        this.field3953 = new HashMap();
        this.field3953.put(class18.field124, arg4.get(field3973));
        this.field3953.put(class18.field127, arg4.get(field3958));
        this.field3953.put(class18.field121, arg4.get(field3961));
        this.field3965 = new class333(arg0);
        int var7 = this.field3954.method4439(class36.field310.field308);
        int[] var8 = this.field3954.method4433(var7);
        this.field3979 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class190 var10 = new class190(this.field3954.method4422(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method348(var10, var8[var9]);
            this.field3979.put(var11.method303(), var11);
            if (var11.method330()) {
                this.field3964 = var11;
            }
        }
        this.method5882(this.field3964);
        this.field3995 = null;
    }

    @ObfuscatedName("lq.s(I)V")
    public void method5954() {
        class30.method1989();
    }

    @ObfuscatedName("lq.g(IIZIIIII)V")
    public void method5818(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3965.method5812()) {
            return;
        }
        this.method5821();
        this.method5822();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field4000));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field4000));
        List var10 = this.field3966.method550(this.field3969 - var8 / 2 - 1, this.field3970 - var9 / 2 - 1, var8 / 2 + this.field3969 + 1, var9 / 2 + this.field3970 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method201(), var13.field299, var13.field298);
            var14.method1062(new Object[] { var15, arg0, arg1 });
            if (this.field4002.contains(var13)) {
                var14.method1056(17);
            } else {
                var14.method1056(15);
            }
            class76.method3778(var14);
        }
        Iterator var16 = this.field4002.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method201(), var17.field299, var17.field298);
                var18.method1062(new Object[] { var19, arg0, arg1 });
                var18.method1056(16);
                class76.method3778(var18);
            }
        }
        this.field4002 = var11;
    }

    @ObfuscatedName("lq.x(IIZZI)V")
    public void method5819(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class192.method183();
        this.method5890(arg0, arg1, arg3, var5);
        if (!this.method5825() && arg3 || arg2) {
            if (arg3) {
                this.field3987 = arg0;
                this.field3988 = arg1;
                this.field3985 = this.field3969;
                this.field3986 = this.field3970;
            }
            if (this.field3985 != -1) {
                int var7 = arg0 - this.field3987;
                int var8 = arg1 - this.field3988;
                this.method5823(this.field3985 - (int) ((float) var7 / this.field3974), this.field3986 + (int) ((float) var8 / this.field3974), false);
            }
        } else {
            this.method5830();
        }
        if (arg3) {
            this.field3989 = var5;
            this.field3990 = arg0;
            this.field3991 = arg1;
        }
    }

    @ObfuscatedName("lq.h(IIZJ)V")
    public void method5890(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field4006 == null) {
            this.field4003 = null;
            return;
        }
        int var6 = (int) ((float) this.field3969 + ((float) (arg0 - this.field3977) - (float) this.method5927() * this.field4000 / 2.0F) / this.field4000);
        int var7 = (int) ((float) this.field3970 - ((float) (arg1 - this.field3978) - (float) this.method5956() * this.field4000 / 2.0F) / this.field4000);
        this.field4003 = this.field4006.method347(var6 + this.field4006.method339() * 64, var7 + this.field4006.method309() * 64);
        if (this.field4003 == null || !arg2) {
            return;
        }
        if (client.method158() && class45.field391[82] && class45.field391[81]) {
            int var8 = this.field4003.field2650;
            int var9 = this.field4003.field2649;
            int var10 = this.field4003.field2652;
            class180 var11 = class180.method625(class177.field2281, client.field695.field1308);
            var11.field2350.method3500(0);
            var11.field2350.method3490(var9);
            var11.field2350.method3601(var10);
            var11.field2350.method3440(var8);
            client.field695.method2097(var11);
            return;
        }
        boolean var12 = true;
        if (this.field3992) {
            int var13 = arg0 - this.field3990;
            int var14 = arg1 - this.field3991;
            if (arg3 - this.field3989 > 500L || var13 < -25 || var13 > 25 || var14 < -25 || var14 > 25) {
                var12 = false;
            }
        }
        if (var12) {
            class180 var15 = class180.method625(class177.field2291, client.field695.field1308);
            var15.field2350.method3500(this.field4003.method4268());
            client.field695.method2097(var15);
            this.field3989 = 0L;
        }
    }

    @ObfuscatedName("lq.f(I)V")
    public void method5821() {
        if (Statics.field217 != null) {
            this.field4000 = this.field3974;
            return;
        }
        if (this.field4000 < this.field3974) {
            this.field4000 = Math.min(this.field3974, this.field4000 / 30.0F + this.field4000);
        }
        if (this.field4000 > this.field3974) {
            this.field4000 = Math.max(this.field3974, this.field4000 - this.field4000 / 30.0F);
        }
    }

    @ObfuscatedName("lq.p(I)V")
    public void method5822() {
        if (!this.method5825()) {
            return;
        }
        int var1 = this.field3971 - this.field3969;
        int var2 = this.field3972 - this.field3970;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method5823(this.field3969 + var1, this.field3970 + var2, true);
        if (this.field3971 == this.field3969 && this.field3972 == this.field3970) {
            this.field3971 = -1;
            this.field3972 = -1;
        }
    }

    @ObfuscatedName("lq.m(IIZI)V")
    public final void method5823(int arg0, int arg1, boolean arg2) {
        this.field3969 = arg0;
        this.field3970 = arg1;
        class192.method183();
        if (arg2) {
            this.method5830();
        }
    }

    @ObfuscatedName("lq.q(I)V")
    public final void method5830() {
        this.field3988 = -1;
        this.field3987 = -1;
        this.field3986 = -1;
        this.field3985 = -1;
    }

    @ObfuscatedName("lq.b(I)Z")
    public boolean method5825() {
        return this.field3971 != -1 && this.field3972 != -1;
    }

    @ObfuscatedName("lq.n(IIIB)Lag;")
    public class27 method5826(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3979.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method313(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lq.e(IIIZB)V")
    public void method5827(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5826(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3964;
        }
        boolean var6 = false;
        if (this.field3995 != var5 || arg3) {
            this.field3995 = var5;
            this.method5882(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5834(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lq.r(II)V")
    public void method5888(int arg0) {
        class27 var2 = this.method5993(arg0);
        if (var2 != null) {
            this.method5882(var2);
        }
    }

    @ObfuscatedName("lq.t(I)I")
    public int method5829() {
        return this.field4006 == null ? -1 : this.field4006.method332();
    }

    @ObfuscatedName("lq.l(I)Lag;")
    public class27 method5981() {
        return this.field4006;
    }

    @ObfuscatedName("lq.o(Lag;B)V")
    public void method5882(class27 arg0) {
        if (this.field4006 == null || this.field4006 != arg0) {
            this.method5915(arg0);
            this.method5834(-1, -1, -1);
        }
    }

    @ObfuscatedName("lq.u(Lag;I)V")
    public void method5915(class27 arg0) {
        this.field4006 = arg0;
        this.field3966 = new class37(this.field3962, this.field3953, this.field3955, this.field3956);
        this.field3965.method5802(this.field4006.method303());
    }

    @ObfuscatedName("lq.y(Lag;Lif;Lif;ZI)V")
    public void method5833(class27 arg0, class235 arg1, class235 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field4006 == null || this.field4006 != arg0) {
            this.method5915(arg0);
        }
        if (!arg3 && this.field4006.method313(arg1.field2652, arg1.field2650, arg1.field2649)) {
            this.method5834(arg1.field2652, arg1.field2650, arg1.field2649);
        } else {
            this.method5834(arg2.field2652, arg2.field2650, arg2.field2649);
        }
    }

    @ObfuscatedName("lq.k(IIIB)V")
    public void method5834(int arg0, int arg1, int arg2) {
        if (this.field4006 == null) {
            return;
        }
        int[] var4 = this.field4006.method298(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field4006.method298(this.field4006.method312(), this.field4006.method311(), this.field4006.method304());
        }
        this.method5823(var4[0] - this.field4006.method339() * 64, var4[1] - this.field4006.method309() * 64, true);
        this.field3971 = -1;
        this.field3972 = -1;
        this.field4000 = this.method5841(this.field4006.method306());
        this.field3974 = this.field4000;
        this.field3957 = null;
        this.field4001 = null;
        this.field3966.method569();
    }

    @ObfuscatedName("lq.v(IIIIII)V")
    public void method5835(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class324.method5545(var6);
        class324.method5543(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class324.method5551(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3965.method5805();
        if (var7 < 100) {
            this.method5840(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3966.method552()) {
            this.field3966.method545(this.field3954, this.field4006.method303(), client.field653);
            if (!this.field3966.method552()) {
                return;
            }
        }
        if (this.field3982 != null) {
            this.field3984++;
            if (this.field3984 % this.field3960 == 0) {
                this.field3984 = 0;
                this.field3983++;
            }
            if (this.field3983 >= this.field3967 && !this.field4005) {
                this.field3982 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field4000));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field4000));
        this.field3966.method555(this.field3969 - var8 / 2, this.field3970 - var9 / 2, var8 / 2 + this.field3969, var9 / 2 + this.field3970, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3997) {
            boolean var10 = false;
            if (arg4 - this.field3998 > 100) {
                this.field3998 = arg4;
                var10 = true;
            }
            this.field3966.method548(this.field3969 - var8 / 2, this.field3970 - var9 / 2, var8 / 2 + this.field3969, var9 / 2 + this.field3970, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3996, this.field3982, this.field3984, this.field3960, var10);
        }
        this.method5837(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method158() && this.field3968 && this.field4003 != null) {
            this.field4004.method5319("Coord: " + this.field4003, class324.field3866 + 10, class324.field3861 + 20, 16776960, -1);
        }
        this.field3975 = var8;
        this.field4007 = var9;
        this.field3977 = arg0;
        this.field3978 = arg1;
        class324.method5546(var6);
    }

    @ObfuscatedName("lq.c(IIIIIII)Z")
    public boolean method5836(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3949 == null) {
            return true;
        } else if (this.field3949.field3899 != arg0 || this.field3949.field3890 != arg1) {
            return true;
        } else if (this.field3966.field327 != this.field3959) {
            return true;
        } else if (client.field798 != this.field4009) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lq.aa(IIIIIII)V")
    public void method5837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field217 == null) {
            return;
        }
        int var7 = 512 / (this.field3966.field327 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5850() - arg4 / 2 - var7;
        int var14 = this.method5851() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3966.field327 * (var7 + var13 - this.field3963);
        int var16 = arg1 - this.field3966.field327 * (var7 - (var14 - this.field4008));
        if (this.method5836(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3949 != null && this.field3949.field3899 == var11 && this.field3949.field3890 == var12) {
                Arrays.fill(this.field3949.field3895, 0);
            } else {
                this.field3949 = new class328(var11, var12);
            }
            this.field3963 = this.method5850() - arg4 / 2 - var7;
            this.field4008 = this.method5851() - arg5 / 2 - var7;
            this.field3959 = this.field3966.field327;
            Statics.field217.method4563(this.field3963, this.field4008, this.field3949, (float) this.field3959 / var10);
            this.field4009 = client.field798;
            var15 = arg0 - this.field3966.field327 * (var7 + var13 - this.field3963);
            var16 = arg1 - this.field3966.field327 * (var7 - (var14 - this.field4008));
        }
        class324.method5550(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3949.method5678(var15, var16, 192);
        } else {
            this.field3949.method5681(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lq.ab(IIIIB)V")
    public void method5838(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3965.method5812()) {
            return;
        }
        if (!this.field3966.method552()) {
            this.field3966.method545(this.field3954, this.field4006.method303(), client.field653);
            if (!this.field3966.method552()) {
                return;
            }
        }
        this.field3966.method549(arg0, arg1, arg2, arg3, this.field3982, this.field3984, this.field3960);
    }

    @ObfuscatedName("lq.ah(IB)V")
    public void method5839(int arg0) {
        this.field3974 = this.method5841(arg0);
    }

    @ObfuscatedName("lq.aw(IIIIII)V")
    public void method5840(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class324.method5551(arg0, arg1, arg2, arg3, -16777216);
        class324.method5555(var7 - 152, var8, 304, 34, -65536);
        class324.method5551(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field4004.method5373(class246.field3171, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lq.an(IB)F")
    public float method5841(int arg0) {
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

    @ObfuscatedName("lq.at(I)I")
    public int method5940() {
        if ((double) this.field3974 == 1.0D) {
            return 25;
        } else if ((double) this.field3974 == 1.5D) {
            return 37;
        } else if ((double) this.field3974 == 2.0D) {
            return 50;
        } else if ((double) this.field3974 == 3.0D) {
            return 75;
        } else if ((double) this.field3974 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lq.ae(I)V")
    public void method5918() {
        this.field3965.method5813();
    }

    @ObfuscatedName("lq.av(I)Z")
    public boolean method5844() {
        return this.field3965.method5812();
    }

    @ObfuscatedName("lq.au(II)Lag;")
    public class27 method5993(int arg0) {
        Iterator var2 = this.field3979.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method332() != arg0);
        return var3;
    }

    @ObfuscatedName("lq.aj(III)V")
    public void method5846(int arg0, int arg1) {
        if (this.field4006 != null && this.field4006.method355(arg0, arg1)) {
            this.field3971 = arg0 - this.field4006.method339() * 64;
            this.field3972 = arg1 - this.field4006.method309() * 64;
        }
    }

    @ObfuscatedName("lq.as(III)V")
    public void method5978(int arg0, int arg1) {
        if (this.field4006 != null) {
            this.method5823(arg0 - this.field4006.method339() * 64, arg1 - this.field4006.method309() * 64, true);
            this.field3971 = -1;
            this.field3972 = -1;
        }
    }

    @ObfuscatedName("lq.ar(IIII)V")
    public void method5848(int arg0, int arg1, int arg2) {
        if (this.field4006 != null) {
            int[] var4 = this.field4006.method298(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5846(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lq.ai(IIIB)V")
    public void method5892(int arg0, int arg1, int arg2) {
        if (this.field4006 != null) {
            int[] var4 = this.field4006.method298(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5978(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lq.aq(I)I")
    public int method5850() {
        return this.field4006 == null ? -1 : this.field3969 + this.field4006.method339() * 64;
    }

    @ObfuscatedName("lq.al(I)I")
    public int method5851() {
        return this.field4006 == null ? -1 : this.field3970 + this.field4006.method309() * 64;
    }

    @ObfuscatedName("lq.az(B)Lif;")
    public class235 method5852() {
        return this.field4006 == null ? null : this.field4006.method347(this.method5850(), this.method5851());
    }

    @ObfuscatedName("lq.ac(I)I")
    public int method5927() {
        return this.field3975;
    }

    @ObfuscatedName("lq.ao(I)I")
    public int method5956() {
        return this.field4007;
    }

    @ObfuscatedName("lq.ad(IB)V")
    public void method5855(int arg0) {
        if (arg0 >= 1) {
            this.field3967 = arg0;
        }
    }

    @ObfuscatedName("lq.ax(I)V")
    public void method5962() {
        this.field3967 = 3;
    }

    @ObfuscatedName("lq.ap(II)V")
    public void method5878(int arg0) {
        if (arg0 >= 1) {
            this.field3960 = arg0;
        }
    }

    @ObfuscatedName("lq.ak(B)V")
    public void method5858() {
        this.field3960 = 50;
    }

    @ObfuscatedName("lq.am(ZI)V")
    public void method5859(boolean arg0) {
        this.field4005 = arg0;
    }

    @ObfuscatedName("lq.bf(II)V")
    public void method5820(int arg0) {
        this.field3982 = new HashSet();
        this.field3982.add(arg0);
        this.field3983 = 0;
        this.field3984 = 0;
    }

    @ObfuscatedName("lq.bo(II)V")
    public void method5951(int arg0) {
        this.field3982 = new HashSet();
        this.field3983 = 0;
        this.field3984 = 0;
        for (int var2 = 0; var2 < Statics.field3323; var2++) {
            if (class263.method379(var2) != null && class263.method379(var2).field3343 == arg0) {
                this.field3982.add(class263.method379(var2).field3325);
            }
        }
    }

    @ObfuscatedName("lq.be(B)V")
    public void method5862() {
        this.field3982 = null;
    }

    @ObfuscatedName("lq.bd(ZI)V")
    public void method5912(boolean arg0) {
        this.field3997 = !arg0;
    }

    @ObfuscatedName("lq.bz(IZI)V")
    public void method5849(int arg0, boolean arg1) {
        if (arg1) {
            this.field3993.remove(arg0);
        } else {
            this.field3993.add(arg0);
        }
        this.method5843();
    }

    @ObfuscatedName("lq.bi(IZI)V")
    public void method5899(int arg0, boolean arg1) {
        if (arg1) {
            this.field3994.remove(arg0);
        } else {
            this.field3994.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3323; var3++) {
            if (class263.method379(var3) != null && class263.method379(var3).field3343 == arg0) {
                int var4 = class263.method379(var3).field3325;
                if (arg1) {
                    this.field3951.remove(var4);
                } else {
                    this.field3951.add(var4);
                }
            }
        }
        this.method5843();
    }

    @ObfuscatedName("lq.bp(I)Z")
    public boolean method5866() {
        return !this.field3997;
    }

    @ObfuscatedName("lq.bv(II)Z")
    public boolean method5867(int arg0) {
        return !this.field3993.contains(arg0);
    }

    @ObfuscatedName("lq.bg(II)Z")
    public boolean method5868(int arg0) {
        return !this.field3994.contains(arg0);
    }

    @ObfuscatedName("lq.bk(B)V")
    public void method5843() {
        this.field3996.clear();
        this.field3996.addAll(this.field3993);
        this.field3996.addAll(this.field3951);
    }

    @ObfuscatedName("lq.br(IIIIIII)V")
    public void method5870(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3965.method5812()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field4000));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field4000));
        List var9 = this.field3966.method550(this.field3969 - var7 / 2 - 1, this.field3970 - var8 / 2 - 1, var7 / 2 + this.field3969 + 1, var8 / 2 + this.field3970 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class263 var12 = class263.method379(var11.method201());
            var13 = false;
            for (int var14 = this.field3999.length - 1; var14 >= 0; var14--) {
                if (var12.field3332[var14] != null) {
                    client.method1926(var12.field3332[var14], var12.field3338, this.field3999[var14], var11.method201(), var11.field299.method4268(), var11.field298.method4268());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lq.bn(ILif;S)Lif;")
    public class235 method5871(int arg0, class235 arg1) {
        if (!this.field3965.method5812()) {
            return null;
        } else if (!this.field3966.method552()) {
            return null;
        } else if (this.field4006.method355(arg1.field2650, arg1.field2649)) {
            HashMap var3 = this.field3966.method553();
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
                        return var5.field298;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field298.field2650 - arg1.field2650;
                    int var10 = var8.field298.field2649 - arg1.field2649;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field298;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lq.bl(IILif;Lif;I)V")
    public void method5872(int arg0, int arg1, class235 arg2, class235 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1062(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1056(10);
                break;
            case 1009:
                var5.method1056(11);
                break;
            case 1010:
                var5.method1056(12);
                break;
            case 1011:
                var5.method1056(13);
                break;
            case 1012:
                var5.method1056(14);
        }
        class76.method3778(var5);
    }

    @ObfuscatedName("lq.bb(S)Lat;")
    public class35 method5873() {
        if (!this.field3965.method5812()) {
            return null;
        } else if (this.field3966.method552()) {
            HashMap var1 = this.field3966.method553();
            this.field3957 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3957.addAll(var3);
            }
            this.field4001 = this.field3957.iterator();
            return this.method5874();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lq.bw(B)Lat;")
    public class35 method5874() {
        if (this.field4001 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field4001.hasNext()) {
                return null;
            }
            var1 = (class35) this.field4001.next();
        } while (var1.method201() == -1);
        return var1;
    }
}
