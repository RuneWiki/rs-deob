package deob;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lj")
public class class333 {

    @ObfuscatedName("lj.c")
    public class254 field3970;

    @ObfuscatedName("lj.z")
    public class254 field3955;

    @ObfuscatedName("lj.j")
    public class254 field3949;

    @ObfuscatedName("lj.d")
    public static final class301 field3980 = class301.field3733;

    @ObfuscatedName("lj.t")
    public static final class301 field3976 = class301.field3738;

    @ObfuscatedName("lj.f")
    public static final class301 field3957 = class301.field3736;

    @ObfuscatedName("lj.i")
    public class304 field3953;

    @ObfuscatedName("lj.m")
    public HashMap field3954;

    @ObfuscatedName("lj.v")
    public class326[] field3948;

    @ObfuscatedName("lj.r")
    public HashMap field3968;

    @ObfuscatedName("lj.x")
    public class27 field3983;

    @ObfuscatedName("lj.y")
    public class27 field3993;

    @ObfuscatedName("lj.p")
    public class27 field3959;

    @ObfuscatedName("lj.k")
    public class37 field3960;

    @ObfuscatedName("lj.o")
    public class332 field3961;

    @ObfuscatedName("lj.s")
    public int field3962;

    @ObfuscatedName("lj.u")
    public int field3963;

    @ObfuscatedName("lj.e")
    public int field3981 = -1;

    @ObfuscatedName("lj.w")
    public int field3965 = -1;

    @ObfuscatedName("lj.q")
    public float field3966;

    @ObfuscatedName("lj.aa")
    public float field3967;

    @ObfuscatedName("lj.ai")
    public int field3947 = -1;

    @ObfuscatedName("lj.ag")
    public int field3969 = -1;

    @ObfuscatedName("lj.at")
    public int field3964 = -1;

    @ObfuscatedName("lj.ad")
    public int field3971 = -1;

    @ObfuscatedName("lj.as")
    public int field3995 = 3;

    @ObfuscatedName("lj.ac")
    public int field3973 = 50;

    @ObfuscatedName("lj.an")
    public boolean field3974 = false;

    @ObfuscatedName("lj.ak")
    public HashSet field3975 = null;

    @ObfuscatedName("lj.ah")
    public int field3958 = -1;

    @ObfuscatedName("lj.al")
    public int field3977 = -1;

    @ObfuscatedName("lj.am")
    public int field3978 = -1;

    @ObfuscatedName("lj.ao")
    public int field3979 = -1;

    @ObfuscatedName("lj.aq")
    public int field3996 = -1;

    @ObfuscatedName("lj.aw")
    public int field3950 = -1;

    @ObfuscatedName("lj.ab")
    public long field3982;

    @ObfuscatedName("lj.ae")
    public int field3951;

    @ObfuscatedName("lj.au")
    public int field3984;

    @ObfuscatedName("lj.ay")
    public boolean field3985 = true;

    @ObfuscatedName("lj.ar")
    public HashSet field3956 = new HashSet();

    @ObfuscatedName("lj.ax")
    public HashSet field3987 = new HashSet();

    @ObfuscatedName("lj.ap")
    public HashSet field3988 = new HashSet();

    @ObfuscatedName("lj.av")
    public HashSet field3989 = new HashSet();

    @ObfuscatedName("lj.af")
    public boolean field3990 = false;

    @ObfuscatedName("lj.bf")
    public int field3991 = 0;

    @ObfuscatedName("lj.bx")
    public final int[] field3992 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("lj.bu")
    public List field3972;

    @ObfuscatedName("lj.bq")
    public Iterator field3994;

    @ObfuscatedName("lj.be")
    public HashSet field3986 = new HashSet();

    @ObfuscatedName("lj.bj")
    public class234 field3952 = null;

    @ObfuscatedName("lj.bm")
    public boolean field3997 = false;

    @ObfuscatedName("lj.bv")
    public class327 field3998;

    @ObfuscatedName("lj.bc")
    public int field3999;

    @ObfuscatedName("lj.bh")
    public int field4000 = -1;

    @ObfuscatedName("lj.bo")
    public int field4001 = -1;

    @ObfuscatedName("lj.bk")
    public int field4002 = -1;

    @ObfuscatedName("lj.n(Lij;Lij;Lij;Lkf;Ljava/util/HashMap;[Lll;I)V")
    public void method5844(class254 arg0, class254 arg1, class254 arg2, class304 arg3, HashMap arg4, class326[] arg5) {
        this.field3948 = arg5;
        this.field3970 = arg0;
        this.field3955 = arg1;
        this.field3949 = arg2;
        this.field3953 = arg3;
        this.field3954 = new HashMap();
        this.field3954.put(class18.field117, arg4.get(field3980));
        this.field3954.put(class18.field111, arg4.get(field3976));
        this.field3954.put(class18.field112, arg4.get(field3957));
        this.field3961 = new class332(arg0);
        int var7 = this.field3970.method4472(class36.field294.field297);
        int[] var8 = this.field3970.method4465(var7);
        this.field3968 = new HashMap(var8.length);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class190 var10 = new class190(this.field3970.method4494(var7, var8[var9]));
            class27 var11 = new class27();
            var11.method317(var10, var8[var9]);
            this.field3968.put(var11.method295(), var11);
            if (var11.method351()) {
                this.field3983 = var11;
            }
        }
        this.method5859(this.field3983);
        this.field3959 = null;
    }

    @ObfuscatedName("lj.h(I)V")
    public void method5845() {
        class30.field232.method3915(5);
    }

    @ObfuscatedName("lj.l(IIZIIIII)V")
    public void method5908(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3961.method5835()) {
            return;
        }
        this.method5849();
        this.method5921();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3966));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3966));
        List var10 = this.field3960.method525(this.field3962 - var8 / 2 - 1, this.field3963 - var9 / 2 - 1, var8 / 2 + this.field3962 + 1, var9 / 2 + this.field3963 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class35 var13 = (class35) var12.next();
            var11.add(var13);
            class63 var14 = new class63();
            class42 var15 = new class42(var13.method185(), var13.field288, var13.field289);
            var14.method1040(new Object[] { var15, arg0, arg1 });
            if (this.field3986.contains(var13)) {
                var14.method1041(17);
            } else {
                var14.method1041(15);
            }
            class76.method990(var14);
        }
        Iterator var16 = this.field3986.iterator();
        while (var16.hasNext()) {
            class35 var17 = (class35) var16.next();
            if (!var11.contains(var17)) {
                class63 var18 = new class63();
                class42 var19 = new class42(var17.method185(), var17.field288, var17.field289);
                var18.method1040(new Object[] { var19, arg0, arg1 });
                var18.method1041(16);
                class76.method990(var18);
            }
        }
        this.field3986 = var11;
    }

    @ObfuscatedName("lj.g(IIZZI)V")
    public void method5847(int arg0, int arg1, boolean arg2, boolean arg3) {
        long var5 = class192.method81();
        this.method5848(arg0, arg1, arg3, var5);
        if (!this.method6014() && arg3 || arg2) {
            if (arg3) {
                this.field3996 = arg0;
                this.field3950 = arg1;
                this.field3978 = this.field3962;
                this.field3979 = this.field3963;
            }
            if (this.field3978 != -1) {
                int var7 = arg0 - this.field3996;
                int var8 = arg1 - this.field3950;
                this.method6011(this.field3978 - (int) ((float) var7 / this.field3967), this.field3979 + (int) ((float) var8 / this.field3967), false);
            }
        } else {
            this.method5967();
        }
        if (arg3) {
            this.field3982 = var5;
            this.field3951 = arg0;
            this.field3984 = arg1;
        }
    }

    @ObfuscatedName("lj.b(IIZJ)V")
    public void method5848(int arg0, int arg1, boolean arg2, long arg3) {
        if (this.field3993 == null) {
            this.field3952 = null;
            return;
        }
        int var6 = (int) ((float) this.field3962 + ((float) (arg0 - this.field3964) - (float) this.method5880() * this.field3966 / 2.0F) / this.field3966);
        int var7 = (int) ((float) this.field3963 - ((float) (arg1 - this.field3971) - (float) this.method5881() * this.field3966 / 2.0F) / this.field3966);
        this.field3952 = this.field3993.method291(var6 + this.field3993.method334() * 64, var7 + this.field3993.method321() * 64);
        if (this.field3952 == null || !arg2) {
            return;
        }
        if (client.method364() && class45.field382[82] && class45.field382[81]) {
            int var8 = this.field3952.field2637;
            int var9 = this.field3952.field2638;
            int var10 = this.field3952.field2639;
            class180 var11 = class180.method1090(class177.field2280, client.field886.field1271);
            var11.field2345.method3634(0);
            var11.field2345.method3546(var9);
            var11.field2345.method3538(var10);
            var11.field2345.method3508(var8);
            client.field886.method2059(var11);
            return;
        }
        boolean var12 = true;
        if (this.field3985) {
            int var13 = arg0 - this.field3951;
            int var14 = arg1 - this.field3984;
            if (arg3 - this.field3982 > 500L || var13 < -25 || var13 > 25 || var14 < -25 || var14 > 25) {
                var12 = false;
            }
        }
        if (var12) {
            class180 var15 = class180.method1090(class177.field2264, client.field886.field1271);
            var15.field2345.method3634(this.field3952.method4313());
            client.field886.method2059(var15);
            this.field3982 = 0L;
        }
    }

    @ObfuscatedName("lj.a(I)V")
    public void method5849() {
        if (Statics.field1065 != null) {
            this.field3966 = this.field3967;
            return;
        }
        if (this.field3966 < this.field3967) {
            this.field3966 = Math.min(this.field3967, this.field3966 / 30.0F + this.field3966);
        }
        if (this.field3966 > this.field3967) {
            this.field3966 = Math.max(this.field3967, this.field3966 - this.field3966 / 30.0F);
        }
    }

    @ObfuscatedName("lj.c(I)V")
    public void method5921() {
        if (!this.method6014()) {
            return;
        }
        int var1 = this.field3981 - this.field3962;
        int var2 = this.field3965 - this.field3963;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.method6011(this.field3962 + var1, this.field3963 + var2, true);
        if (this.field3981 == this.field3962 && this.field3965 == this.field3963) {
            this.field3981 = -1;
            this.field3965 = -1;
        }
    }

    @ObfuscatedName("lj.z(IIZI)V")
    public final void method6011(int arg0, int arg1, boolean arg2) {
        this.field3962 = arg0;
        this.field3963 = arg1;
        class192.method81();
        if (arg2) {
            this.method5967();
        }
    }

    @ObfuscatedName("lj.j(I)V")
    public final void method5967() {
        this.field3950 = -1;
        this.field3996 = -1;
        this.field3979 = -1;
        this.field3978 = -1;
    }

    @ObfuscatedName("lj.d(I)Z")
    public boolean method6014() {
        return this.field3981 != -1 && this.field3965 != -1;
    }

    @ObfuscatedName("lj.i(IIIB)Laa;")
    public class27 method5854(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3968.values().iterator();
        class27 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class27) var4.next();
        } while (!var5.method342(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("lj.m(IIIZS)V")
    public void method5932(int arg0, int arg1, int arg2, boolean arg3) {
        class27 var5 = this.method5854(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3983;
        }
        boolean var6 = false;
        if (this.field3959 != var5 || arg3) {
            this.field3959 = var5;
            this.method5859(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5976(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("lj.v(II)V")
    public void method5922(int arg0) {
        class27 var2 = this.method5873(arg0);
        if (var2 != null) {
            this.method5859(var2);
        }
    }

    @ObfuscatedName("lj.r(I)I")
    public int method6004() {
        return this.field3993 == null ? -1 : this.field3993.method293();
    }

    @ObfuscatedName("lj.x(I)Laa;")
    public class27 method6013() {
        return this.field3993;
    }

    @ObfuscatedName("lj.y(Laa;I)V")
    public void method5859(class27 arg0) {
        if (this.field3993 == null || this.field3993 != arg0) {
            this.method5860(arg0);
            this.method5976(-1, -1, -1);
        }
    }

    @ObfuscatedName("lj.p(Laa;B)V")
    public void method5860(class27 arg0) {
        this.field3993 = arg0;
        this.field3960 = new class37(this.field3948, this.field3954, this.field3955, this.field3949);
        this.field3961.method5832(this.field3993.method295());
    }

    @ObfuscatedName("lj.k(Laa;Lho;Lho;ZI)V")
    public void method5861(class27 arg0, class234 arg1, class234 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3993 == null || this.field3993 != arg0) {
            this.method5860(arg0);
        }
        if (!arg3 && this.field3993.method342(arg1.field2639, arg1.field2637, arg1.field2638)) {
            this.method5976(arg1.field2639, arg1.field2637, arg1.field2638);
        } else {
            this.method5976(arg2.field2639, arg2.field2637, arg2.field2638);
        }
    }

    @ObfuscatedName("lj.o(IIII)V")
    public void method5976(int arg0, int arg1, int arg2) {
        if (this.field3993 == null) {
            return;
        }
        int[] var4 = this.field3993.method290(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3993.method290(this.field3993.method333(), this.field3993.method303(), this.field3993.method305());
        }
        this.method6011(var4[0] - this.field3993.method334() * 64, var4[1] - this.field3993.method321() * 64, true);
        this.field3981 = -1;
        this.field3965 = -1;
        this.field3966 = this.method5996(this.field3993.method301());
        this.field3967 = this.field3966;
        this.field3972 = null;
        this.field3994 = null;
        this.field3960.method544();
    }

    @ObfuscatedName("lj.s(IIIIII)V")
    public void method5885(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class323.method5594(var6);
        class323.method5632(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class323.method5630(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3961.method5837();
        if (var7 < 100) {
            this.method5928(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3960.method526()) {
            this.field3960.method520(this.field3970, this.field3993.method295(), client.field851);
            if (!this.field3960.method526()) {
                return;
            }
        }
        if (this.field3975 != null) {
            this.field3977++;
            if (this.field3977 % this.field3973 == 0) {
                this.field3977 = 0;
                this.field3958++;
            }
            if (this.field3958 >= this.field3995 && !this.field3974) {
                this.field3975 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3966));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3966));
        this.field3960.method522(this.field3962 - var8 / 2, this.field3963 - var9 / 2, var8 / 2 + this.field3962, var9 / 2 + this.field3963, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3990) {
            boolean var10 = false;
            if (arg4 - this.field3991 > 100) {
                this.field3991 = arg4;
                var10 = true;
            }
            this.field3960.method523(this.field3962 - var8 / 2, this.field3963 - var9 / 2, var8 / 2 + this.field3962, var9 / 2 + this.field3963, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3989, this.field3975, this.field3977, this.field3973, var10);
        }
        this.method5865(arg0, arg1, arg2, arg3, var8, var9);
        if (client.method364() && this.field3997 && this.field3952 != null) {
            this.field3953.method5337("Coord: " + this.field3952, class323.field3859 + 10, class323.field3857 + 20, 16776960, -1);
        }
        this.field3947 = var8;
        this.field3969 = var9;
        this.field3964 = arg0;
        this.field3971 = arg1;
        class323.method5595(var6);
    }

    @ObfuscatedName("lj.u(IIIIIIB)Z")
    public boolean method5864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field3998 == null) {
            return true;
        } else if (this.field3998.field3878 != arg0 || this.field3998.field3880 != arg1) {
            return true;
        } else if (this.field3960.field316 != this.field3999) {
            return true;
        } else if (client.field900 != this.field4002) {
            return true;
        } else if (arg2 <= 0 && arg3 <= 0) {
            return arg0 + arg2 < arg4 || arg1 + arg3 < arg5;
        } else {
            return true;
        }
    }

    @ObfuscatedName("lj.aa(IIIIIIS)V")
    public void method5865(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (Statics.field1065 == null) {
            return;
        }
        int var7 = 512 / (this.field3960.field316 * 2);
        int var8 = arg2 + 512;
        int var9 = arg3 + 512;
        float var10 = 1.0F;
        int var11 = (int) ((float) var8 / var10);
        int var12 = (int) ((float) var9 / var10);
        int var13 = this.method5926() - arg4 / 2 - var7;
        int var14 = this.method5851() - arg5 / 2 - var7;
        int var15 = arg0 - this.field3960.field316 * (var7 + var13 - this.field4000);
        int var16 = arg1 - this.field3960.field316 * (var7 - (var14 - this.field4001));
        if (this.method5864(var11, var12, var15, var16, arg2, arg3)) {
            if (this.field3998 != null && this.field3998.field3878 == var11 && this.field3998.field3880 == var12) {
                Arrays.fill(this.field3998.field3883, 0);
            } else {
                this.field3998 = new class327(var11, var12);
            }
            this.field4000 = this.method5926() - arg4 / 2 - var7;
            this.field4001 = this.method5851() - arg5 / 2 - var7;
            this.field3999 = this.field3960.field316;
            Statics.field1065.method4614(this.field4000, this.field4001, this.field3998, (float) this.field3999 / var10);
            this.field4002 = client.field900;
            var15 = arg0 - this.field3960.field316 * (var7 + var13 - this.field4000);
            var16 = arg1 - this.field3960.field316 * (var7 - (var14 - this.field4001));
        }
        class323.method5589(arg0, arg1, arg2, arg3, 0, 128);
        if (var10 == 1.0F) {
            this.field3998.method5763(var15, var16, 192);
        } else {
            this.field3998.method5723(var15, var16, (int) ((float) var11 * var10), (int) ((float) var12 * var10), 192);
        }
    }

    @ObfuscatedName("lj.ai(IIIII)V")
    public void method5866(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3961.method5835()) {
            return;
        }
        if (!this.field3960.method526()) {
            this.field3960.method520(this.field3970, this.field3993.method295(), client.field851);
            if (!this.field3960.method526()) {
                return;
            }
        }
        this.field3960.method524(arg0, arg1, arg2, arg3, this.field3975, this.field3977, this.field3973);
    }

    @ObfuscatedName("lj.ag(II)V")
    public void method5951(int arg0) {
        this.field3967 = this.method5996(arg0);
    }

    @ObfuscatedName("lj.at(IIIIIB)V")
    public void method5928(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class323.method5630(arg0, arg1, arg2, arg3, -16777216);
        class323.method5604(var7 - 152, var8, 304, 34, -65536);
        class323.method5630(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3953.method5340(class245.field3098, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("lj.ad(IB)F")
    public float method5996(int arg0) {
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

    @ObfuscatedName("lj.as(I)I")
    public int method5870() {
        if ((double) this.field3967 == 1.0D) {
            return 25;
        } else if ((double) this.field3967 == 1.5D) {
            return 37;
        } else if ((double) this.field3967 == 2.0D) {
            return 50;
        } else if ((double) this.field3967 == 3.0D) {
            return 75;
        } else if ((double) this.field3967 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("lj.ac(I)V")
    public void method5871() {
        this.field3961.method5830();
    }

    @ObfuscatedName("lj.an(B)Z")
    public boolean method5843() {
        return this.field3961.method5835();
    }

    @ObfuscatedName("lj.ak(II)Laa;")
    public class27 method5873(int arg0) {
        Iterator var2 = this.field3968.values().iterator();
        class27 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class27) var2.next();
        } while (var3.method293() != arg0);
        return var3;
    }

    @ObfuscatedName("lj.ah(III)V")
    public void method5874(int arg0, int arg1) {
        if (this.field3993 != null && this.field3993.method289(arg0, arg1)) {
            this.field3981 = arg0 - this.field3993.method334() * 64;
            this.field3965 = arg1 - this.field3993.method321() * 64;
        }
    }

    @ObfuscatedName("lj.al(III)V")
    public void method5878(int arg0, int arg1) {
        if (this.field3993 != null) {
            this.method6011(arg0 - this.field3993.method334() * 64, arg1 - this.field3993.method321() * 64, true);
            this.field3981 = -1;
            this.field3965 = -1;
        }
    }

    @ObfuscatedName("lj.am(IIIB)V")
    public void method5876(int arg0, int arg1, int arg2) {
        if (this.field3993 != null) {
            int[] var4 = this.field3993.method290(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5874(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lj.ao(IIIB)V")
    public void method5945(int arg0, int arg1, int arg2) {
        if (this.field3993 != null) {
            int[] var4 = this.field3993.method290(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5878(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("lj.aq(I)I")
    public int method5926() {
        return this.field3993 == null ? -1 : this.field3962 + this.field3993.method334() * 64;
    }

    @ObfuscatedName("lj.aw(I)I")
    public int method5851() {
        return this.field3993 == null ? -1 : this.field3963 + this.field3993.method321() * 64;
    }

    @ObfuscatedName("lj.ab(I)Lho;")
    public class234 method5879() {
        return this.field3993 == null ? null : this.field3993.method291(this.method5926(), this.method5851());
    }

    @ObfuscatedName("lj.ae(I)I")
    public int method5880() {
        return this.field3947;
    }

    @ObfuscatedName("lj.au(I)I")
    public int method5881() {
        return this.field3969;
    }

    @ObfuscatedName("lj.ay(II)V")
    public void method5882(int arg0) {
        if (arg0 >= 1) {
            this.field3995 = arg0;
        }
    }

    @ObfuscatedName("lj.az(I)V")
    public void method5883() {
        this.field3995 = 3;
    }

    @ObfuscatedName("lj.aj(II)V")
    public void method5872(int arg0) {
        if (arg0 >= 1) {
            this.field3973 = arg0;
        }
    }

    @ObfuscatedName("lj.ar(I)V")
    public void method5947() {
        this.field3973 = 50;
    }

    @ObfuscatedName("lj.ax(ZI)V")
    public void method5900(boolean arg0) {
        this.field3974 = arg0;
    }

    @ObfuscatedName("lj.ap(II)V")
    public void method5887(int arg0) {
        this.field3975 = new HashSet();
        this.field3975.add(arg0);
        this.field3958 = 0;
        this.field3977 = 0;
    }

    @ObfuscatedName("lj.av(II)V")
    public void method5888(int arg0) {
        this.field3975 = new HashSet();
        this.field3958 = 0;
        this.field3977 = 0;
        for (int var2 = 0; var2 < Statics.field3310; var2++) {
            if (class262.method106(var2) != null && class262.method106(var2).field3329 == arg0) {
                this.field3975.add(class262.method106(var2).field3312);
            }
        }
    }

    @ObfuscatedName("lj.af(I)V")
    public void method5920() {
        this.field3975 = null;
    }

    @ObfuscatedName("lj.bf(ZI)V")
    public void method5890(boolean arg0) {
        this.field3990 = !arg0;
    }

    @ObfuscatedName("lj.bi(IZI)V")
    public void method5891(int arg0, boolean arg1) {
        if (arg1) {
            this.field3956.remove(arg0);
        } else {
            this.field3956.add(arg0);
        }
        this.method5896();
    }

    @ObfuscatedName("lj.bx(IZI)V")
    public void method5892(int arg0, boolean arg1) {
        if (arg1) {
            this.field3987.remove(arg0);
        } else {
            this.field3987.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field3310; var3++) {
            if (class262.method106(var3) != null && class262.method106(var3).field3329 == arg0) {
                int var4 = class262.method106(var3).field3312;
                if (arg1) {
                    this.field3988.remove(var4);
                } else {
                    this.field3988.add(var4);
                }
            }
        }
        this.method5896();
    }

    @ObfuscatedName("lj.bu(I)Z")
    public boolean method5893() {
        return !this.field3990;
    }

    @ObfuscatedName("lj.bq(II)Z")
    public boolean method5894(int arg0) {
        return !this.field3956.contains(arg0);
    }

    @ObfuscatedName("lj.be(II)Z")
    public boolean method5895(int arg0) {
        return !this.field3987.contains(arg0);
    }

    @ObfuscatedName("lj.bj(I)V")
    public void method5896() {
        this.field3989.clear();
        this.field3989.addAll(this.field3956);
        this.field3989.addAll(this.field3988);
    }

    @ObfuscatedName("lj.bm(IIIIIIB)V")
    public void method5999(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3961.method5835()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3966));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3966));
        List var9 = this.field3960.method525(this.field3962 - var7 / 2 - 1, this.field3963 - var8 / 2 - 1, var7 / 2 + this.field3962 + 1, var8 / 2 + this.field3963 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class262 var12 = class262.method106(var11.method185());
            var13 = false;
            for (int var14 = this.field3992.length - 1; var14 >= 0; var14--) {
                if (var12.field3330[var14] != null) {
                    client.method175(var12.field3330[var14], var12.field3319, this.field3992[var14], var11.method185(), var11.field288.method4313(), var11.field289.method4313());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("lj.bv(ILho;I)Lho;")
    public class234 method5850(int arg0, class234 arg1) {
        if (!this.field3961.method5835()) {
            return null;
        } else if (!this.field3960.method526()) {
            return null;
        } else if (this.field3993.method289(arg1.field2637, arg1.field2638)) {
            HashMap var3 = this.field3960.method539();
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
                        return var5.field289;
                    }
                    var8 = (class35) var7.next();
                    int var9 = var8.field289.field2637 - arg1.field2637;
                    int var10 = var8.field289.field2638 - arg1.field2638;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field289;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("lj.bc(IILho;Lho;I)V")
    public void method5853(int arg0, int arg1, class234 arg2, class234 arg3) {
        class63 var5 = new class63();
        class42 var6 = new class42(arg1, arg2, arg3);
        var5.method1040(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1041(10);
                break;
            case 1009:
                var5.method1041(11);
                break;
            case 1010:
                var5.method1041(12);
                break;
            case 1011:
                var5.method1041(13);
                break;
            case 1012:
                var5.method1041(14);
        }
        class76.method990(var5);
    }

    @ObfuscatedName("lj.bh(S)Lak;")
    public class35 method5907() {
        if (!this.field3961.method5835()) {
            return null;
        } else if (this.field3960.method526()) {
            HashMap var1 = this.field3960.method539();
            this.field3972 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3972.addAll(var3);
            }
            this.field3994 = this.field3972.iterator();
            return this.method5901();
        } else {
            return null;
        }
    }

    @ObfuscatedName("lj.bo(I)Lak;")
    public class35 method5901() {
        if (this.field3994 == null) {
            return null;
        }
        class35 var1;
        do {
            if (!this.field3994.hasNext()) {
                return null;
            }
            var1 = (class35) this.field3994.next();
        } while (var1.method185() == -1);
        return var1;
    }
}
