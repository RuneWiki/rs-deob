package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("ll")
public class class326 {

    @ObfuscatedName("ll.l")
    public class256 field3931;

    @ObfuscatedName("ll.y")
    public static final class296 field3932 = class296.field3754;

    @ObfuscatedName("ll.g")
    public static final class296 field3952 = class296.field3758;

    @ObfuscatedName("ll.c")
    public static final class296 field3934 = class296.field3756;

    @ObfuscatedName("ll.u")
    public class298 field3960;

    @ObfuscatedName("ll.r")
    public HashMap field3936;

    @ObfuscatedName("ll.d")
    public class322[] field3937;

    @ObfuscatedName("ll.v")
    public HashMap field3939;

    @ObfuscatedName("ll.s")
    public class33 field3942;

    @ObfuscatedName("ll.t")
    public class33 field3940;

    @ObfuscatedName("ll.f")
    public class33 field3944;

    @ObfuscatedName("ll.m")
    public class42 field3964;

    @ObfuscatedName("ll.x")
    public class325 field3943;

    @ObfuscatedName("ll.w")
    public int field3928;

    @ObfuscatedName("ll.j")
    public int field3945;

    @ObfuscatedName("ll.z")
    public int field3961 = -1;

    @ObfuscatedName("ll.e")
    public int field3947 = -1;

    @ObfuscatedName("ll.k")
    public float field3948;

    @ObfuscatedName("ll.n")
    public float field3949;

    @ObfuscatedName("ll.i")
    public int field3950 = -1;

    @ObfuscatedName("ll.av")
    public int field3951 = -1;

    @ObfuscatedName("ll.ao")
    public int field3968 = -1;

    @ObfuscatedName("ll.am")
    public int field3953 = -1;

    @ObfuscatedName("ll.aj")
    public int field3971 = 3;

    @ObfuscatedName("ll.ah")
    public int field3955 = 50;

    @ObfuscatedName("ll.af")
    public boolean field3956 = false;

    @ObfuscatedName("ll.ai")
    public HashSet field3935 = null;

    @ObfuscatedName("ll.aq")
    public int field3958 = -1;

    @ObfuscatedName("ll.ak")
    public int field3959 = -1;

    @ObfuscatedName("ll.al")
    public int field3957 = -1;

    @ObfuscatedName("ll.as")
    public int field3933 = -1;

    @ObfuscatedName("ll.az")
    public HashSet field3965 = new HashSet();

    @ObfuscatedName("ll.ax")
    public HashSet field3963 = new HashSet();

    @ObfuscatedName("ll.ad")
    public HashSet field3941 = new HashSet();

    @ObfuscatedName("ll.ar")
    public HashSet field3929 = new HashSet();

    @ObfuscatedName("ll.ag")
    public boolean field3966 = false;

    @ObfuscatedName("ll.au")
    public int field3967 = 0;

    @ObfuscatedName("ll.ay")
    public final int[] field3938 = new int[] { 1008, 1009, 1010, 1011, 1012 };

    @ObfuscatedName("ll.at")
    public List field3969;

    @ObfuscatedName("ll.aa")
    public Iterator field3970;

    @ObfuscatedName("ll.aw")
    public HashSet field3946 = new HashSet();

    @ObfuscatedName("ll.ab")
    public class233 field3972 = null;

    @ObfuscatedName("ll.b(Lie;Lkt;Ljava/util/HashMap;[Llv;I)V")
    public void method5496(class256 arg0, class298 arg1, HashMap arg2, class322[] arg3) {
        this.field3937 = arg3;
        this.field3931 = arg0;
        this.field3960 = arg1;
        this.field3936 = new HashMap();
        this.field3936.put(class25.field337, arg2.get(field3932));
        this.field3936.put(class25.field326, arg2.get(field3952));
        this.field3936.put(class25.field327, arg2.get(field3934));
        this.field3943 = new class325(arg0);
        int var5 = this.field3931.method4177(class41.field498.field503);
        int[] var6 = this.field3931.method4222(var5);
        this.field3939 = new HashMap(var6.length);
        for (int var7 = 0; var7 < var6.length; var7++) {
            class194 var8 = new class194(this.field3931.method4158(var5, var6[var7]));
            class33 var9 = new class33();
            var9.method268(var8, var6[var7]);
            this.field3939.put(var9.method277(), var9);
            if (var9.method298()) {
                this.field3942 = var9;
            }
        }
        this.method5509(this.field3942);
        this.field3944 = null;
    }

    @ObfuscatedName("ll.q(S)I")
    public int method5497() {
        return this.field3931.method4181(this.field3942.method277(), class41.field501.field503) ? 100 : this.field3931.method4184(this.field3942.method277());
    }

    @ObfuscatedName("ll.o(IIZIIIIB)V")
    public void method5498(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (!this.field3943.method5491()) {
            return;
        }
        this.method5501();
        this.method5502();
        if (!arg2) {
            return;
        }
        int var8 = (int) Math.ceil((double) ((float) arg5 / this.field3948));
        int var9 = (int) Math.ceil((double) ((float) arg6 / this.field3948));
        List var10 = this.field3964.method526(this.field3928 - var8 / 2 - 1, this.field3945 - var9 / 2 - 1, var8 / 2 + this.field3928 + 1, var9 / 2 + this.field3945 + 1, arg3, arg4, arg5, arg6, arg0, arg1);
        HashSet var11 = new HashSet();
        Iterator var12 = var10.iterator();
        while (var12.hasNext()) {
            class40 var13 = (class40) var12.next();
            var11.add(var13);
            class68 var14 = new class68();
            class48 var15 = new class48(var13.field489, var13.field492, var13.field491);
            var14.method1037(new Object[] { var15, arg0, arg1 });
            if (this.field3946.contains(var13)) {
                var14.method1033(class240.field2923);
            } else {
                var14.method1033(class240.field2921);
            }
            class81.method3491(var14);
        }
        Iterator var16 = this.field3946.iterator();
        while (var16.hasNext()) {
            class40 var17 = (class40) var16.next();
            if (!var11.contains(var17)) {
                class68 var18 = new class68();
                class48 var19 = new class48(var17.field489, var17.field492, var17.field491);
                var18.method1037(new Object[] { var19, arg0, arg1 });
                var18.method1033(class240.field2922);
                class81.method3491(var18);
            }
        }
        this.field3946 = var11;
    }

    @ObfuscatedName("ll.p(IIZZI)V")
    public void method5674(int arg0, int arg1, boolean arg2, boolean arg3) {
        this.method5627(arg0, arg1, arg3);
        if (this.field3957 == -1) {
            this.field3957 = arg0;
        }
        if (this.field3933 == -1) {
            this.field3933 = arg1;
        }
        int var5 = arg0 - this.field3957;
        int var6 = arg1 - this.field3933;
        this.field3957 = arg0;
        this.field3933 = arg1;
        if (arg2 && !this.method5586()) {
            this.field3928 -= (int) ((float) var5 / this.field3949);
            this.field3945 += (int) ((float) var6 / this.field3949);
        }
    }

    @ObfuscatedName("ll.a(IIZB)V")
    public void method5627(int arg0, int arg1, boolean arg2) {
        boolean var4 = client.field907 >= 2;
        if (!var4) {
            return;
        }
        if (this.field3940 == null) {
            this.field3972 = null;
            return;
        }
        int var5 = (int) ((float) this.field3928 + ((float) (arg0 - this.field3968) - (float) this.method5529() * this.field3948 / 2.0F) / this.field3948);
        int var6 = (int) ((float) this.field3945 - ((float) (arg1 - this.field3953) - (float) this.method5514() * this.field3948 / 2.0F) / this.field3948);
        this.field3972 = this.field3940.method273(var5 + this.field3940.method281() * 64, var6 + this.field3940.method318() * 64);
        if (this.field3972 == null || !arg2 || !class51.field593[82] || !class51.field593[81] || !arg2) {
            return;
        }
        int var7 = this.field3972.field2742;
        int var8 = this.field3972.field2743;
        int var9 = this.field3972.field2741;
        class184 var10 = class184.method979(class181.field2380, client.field864.field1435);
        var10.field2468.method3281(var7);
        var10.field2468.method3232(var9);
        var10.field2468.method3341(var8);
        client.field864.method1893(var10);
    }

    @ObfuscatedName("ll.h(B)V")
    public void method5501() {
        if (this.field3948 < this.field3949) {
            this.field3948 = Math.min(this.field3949, this.field3948 / 30.0F + this.field3948);
        }
        if (this.field3948 > this.field3949) {
            this.field3948 = Math.max(this.field3949, this.field3948 - this.field3948 / 30.0F);
        }
    }

    @ObfuscatedName("ll.l(B)V")
    public void method5502() {
        if (!this.method5586()) {
            return;
        }
        int var1 = this.field3961 - this.field3928;
        int var2 = this.field3947 - this.field3945;
        if (var1 != 0) {
            var1 /= Math.min(8, Math.abs(var1));
        }
        if (var2 != 0) {
            var2 /= Math.min(8, Math.abs(var2));
        }
        this.field3928 += var1;
        this.field3945 += var2;
        if (this.field3961 == this.field3928 && this.field3947 == this.field3945) {
            this.field3961 = -1;
            this.field3947 = -1;
        }
    }

    @ObfuscatedName("ll.y(B)Z")
    public boolean method5586() {
        return this.field3961 != -1 && this.field3947 != -1;
    }

    @ObfuscatedName("ll.g(IIIB)Lai;")
    public class33 method5504(int arg0, int arg1, int arg2) {
        Iterator var4 = this.field3939.values().iterator();
        class33 var5;
        do {
            if (!var4.hasNext()) {
                return null;
            }
            var5 = (class33) var4.next();
        } while (!var5.method295(arg0, arg1, arg2));
        return var5;
    }

    @ObfuscatedName("ll.c(IIIZB)V")
    public void method5505(int arg0, int arg1, int arg2, boolean arg3) {
        class33 var5 = this.method5504(arg0, arg1, arg2);
        if (var5 == null) {
            if (!arg3) {
                return;
            }
            var5 = this.field3942;
        }
        boolean var6 = false;
        if (this.field3944 != var5 || arg3) {
            this.field3944 = var5;
            this.method5509(var5);
            var6 = true;
        }
        if (var6 || arg3) {
            this.method5512(arg0, arg1, arg2);
        }
    }

    @ObfuscatedName("ll.u(IB)V")
    public void method5510(int arg0) {
        class33 var2 = this.method5527(arg0);
        if (var2 != null) {
            this.method5509(var2);
        }
    }

    @ObfuscatedName("ll.t(B)I")
    public int method5507() {
        return this.field3940 == null ? -1 : this.field3940.method275();
    }

    @ObfuscatedName("ll.f(I)Lai;")
    public class33 method5566() {
        return this.field3940;
    }

    @ObfuscatedName("ll.m(Lai;I)V")
    public void method5509(class33 arg0) {
        if (this.field3940 == null || this.field3940 != arg0) {
            this.method5636(arg0);
            this.method5512(-1, -1, -1);
        }
    }

    @ObfuscatedName("ll.x(Lai;I)V")
    public void method5636(class33 arg0) {
        this.field3940 = arg0;
        this.field3964 = new class42(this.field3937, this.field3936);
        this.field3943.method5482(this.field3940.method277());
    }

    @ObfuscatedName("ll.w(Lai;Lhp;Lhp;ZI)V")
    public void method5511(class33 arg0, class233 arg1, class233 arg2, boolean arg3) {
        if (arg0 == null) {
            return;
        }
        if (this.field3940 == null || this.field3940 != arg0) {
            this.method5636(arg0);
        }
        if (!arg3 && this.field3940.method295(arg1.field2741, arg1.field2742, arg1.field2743)) {
            this.method5512(arg1.field2741, arg1.field2742, arg1.field2743);
        } else {
            this.method5512(arg2.field2741, arg2.field2742, arg2.field2743);
        }
    }

    @ObfuscatedName("ll.j(IIIB)V")
    public void method5512(int arg0, int arg1, int arg2) {
        if (this.field3940 == null) {
            return;
        }
        int[] var4 = this.field3940.method292(arg0, arg1, arg2);
        if (var4 == null) {
            var4 = this.field3940.method292(this.field3940.method286(), this.field3940.method285(), this.field3940.method331());
        }
        this.field3928 = var4[0] - this.field3940.method281() * 64;
        this.field3945 = var4[1] - this.field3940.method318() * 64;
        this.field3961 = -1;
        this.field3947 = -1;
        this.field3948 = this.method5517(this.field3940.method280());
        this.field3949 = this.field3948;
        this.field3969 = null;
        this.field3970 = null;
        this.field3964.method509();
    }

    @ObfuscatedName("ll.z(IIIIII)V")
    public void method5513(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int[] var6 = new int[4];
        class319.method5225(var6);
        class319.method5212(arg0, arg1, arg0 + arg2, arg1 + arg3);
        class319.method5232(arg0, arg1, arg2, arg3, -16777216);
        int var7 = this.field3943.method5485();
        if (var7 < 100) {
            this.method5622(arg0, arg1, arg2, arg3, var7);
            return;
        }
        if (!this.field3964.method515()) {
            this.field3964.method517(this.field3931, this.field3940.method277(), client.field825);
            if (!this.field3964.method515()) {
                return;
            }
        }
        if (this.field3935 != null) {
            this.field3959++;
            if (this.field3959 % this.field3955 == 0) {
                this.field3959 = 0;
                this.field3958++;
            }
            if (this.field3958 >= this.field3971 && !this.field3956) {
                this.field3935 = null;
            }
        }
        int var8 = (int) Math.ceil((double) ((float) arg2 / this.field3948));
        int var9 = (int) Math.ceil((double) ((float) arg3 / this.field3948));
        this.field3964.method507(this.field3928 - var8 / 2, this.field3945 - var9 / 2, var8 / 2 + this.field3928, var9 / 2 + this.field3945, arg0, arg1, arg0 + arg2, arg1 + arg3);
        if (!this.field3966) {
            boolean var10 = false;
            if (arg4 - this.field3967 > 100) {
                this.field3967 = arg4;
                var10 = true;
            }
            this.field3964.method508(this.field3928 - var8 / 2, this.field3945 - var9 / 2, var8 / 2 + this.field3928, var9 / 2 + this.field3945, arg0, arg1, arg0 + arg2, arg1 + arg3, this.field3929, this.field3935, this.field3959, this.field3955, var10);
        }
        boolean var11 = client.field907 >= 2;
        if (var11 && this.field3972 != null) {
            this.field3960.method5003("Coord: " + this.field3972, class319.field3875 + 10, class319.field3878 + 20, 16776960, -1);
        }
        this.field3950 = var8;
        this.field3951 = var9;
        this.field3968 = arg0;
        this.field3953 = arg1;
        class319.method5240(var6);
    }

    @ObfuscatedName("ll.e(IIIIB)V")
    public void method5660(int arg0, int arg1, int arg2, int arg3) {
        if (!this.field3943.method5491()) {
            return;
        }
        if (!this.field3964.method515()) {
            this.field3964.method517(this.field3931, this.field3940.method277(), client.field825);
            if (!this.field3964.method515()) {
                return;
            }
        }
        this.field3964.method531(arg0, arg1, arg2, arg3, this.field3935, this.field3959, this.field3955);
    }

    @ObfuscatedName("ll.k(IS)V")
    public void method5515(int arg0) {
        this.field3949 = this.method5517(arg0);
    }

    @ObfuscatedName("ll.ao(IIIIIS)V")
    public void method5622(int arg0, int arg1, int arg2, int arg3, int arg4) {
        byte var6 = 20;
        int var7 = arg2 / 2 + arg0;
        int var8 = arg3 / 2 + arg1 - 18 - var6;
        class319.method5232(arg0, arg1, arg2, arg3, -16777216);
        class319.method5227(var7 - 152, var8, 304, 34, -65536);
        class319.method5232(var7 - 150, var8 + 2, arg4 * 3, 30, -65536);
        this.field3960.method5006(class246.field3254, var7, var6 + var8, -1, -1);
    }

    @ObfuscatedName("ll.am(II)F")
    public float method5517(int arg0) {
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

    @ObfuscatedName("ll.aj(I)I")
    public int method5518() {
        if ((double) this.field3949 == 1.0D) {
            return 25;
        } else if ((double) this.field3949 == 1.5D) {
            return 37;
        } else if ((double) this.field3949 == 2.0D) {
            return 50;
        } else if ((double) this.field3949 == 3.0D) {
            return 75;
        } else if ((double) this.field3949 == 4.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @ObfuscatedName("ll.ah(B)V")
    public void method5519() {
        this.field3943.method5483();
    }

    @ObfuscatedName("ll.af(I)Z")
    public boolean method5520() {
        return this.field3943.method5491();
    }

    @ObfuscatedName("ll.ai(II)Lai;")
    public class33 method5527(int arg0) {
        Iterator var2 = this.field3939.values().iterator();
        class33 var3;
        do {
            if (!var2.hasNext()) {
                return null;
            }
            var3 = (class33) var2.next();
        } while (var3.method275() != arg0);
        return var3;
    }

    @ObfuscatedName("ll.aq(IIB)V")
    public void method5522(int arg0, int arg1) {
        if (this.field3940 != null && this.field3940.method291(arg0, arg1)) {
            this.field3961 = arg0 - this.field3940.method281() * 64;
            this.field3947 = arg1 - this.field3940.method318() * 64;
        }
    }

    @ObfuscatedName("ll.ak(III)V")
    public void method5556(int arg0, int arg1) {
        if (this.field3940 != null) {
            this.field3928 = arg0 - this.field3940.method281() * 64;
            this.field3945 = arg1 - this.field3940.method318() * 64;
            this.field3961 = -1;
            this.field3947 = -1;
        }
    }

    @ObfuscatedName("ll.al(IIII)V")
    public void method5524(int arg0, int arg1, int arg2) {
        if (this.field3940 != null) {
            int[] var4 = this.field3940.method292(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5522(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ll.as(IIII)V")
    public void method5525(int arg0, int arg1, int arg2) {
        if (this.field3940 != null) {
            int[] var4 = this.field3940.method292(arg0, arg1, arg2);
            if (var4 != null) {
                this.method5556(var4[0], var4[1]);
            }
        }
    }

    @ObfuscatedName("ll.az(I)I")
    public int method5526() {
        return this.field3940 == null ? -1 : this.field3928 + this.field3940.method281() * 64;
    }

    @ObfuscatedName("ll.ax(I)I")
    public int method5657() {
        return this.field3940 == null ? -1 : this.field3945 + this.field3940.method318() * 64;
    }

    @ObfuscatedName("ll.ad(B)Lhp;")
    public class233 method5528() {
        return this.field3940 == null ? null : this.field3940.method273(this.method5526(), this.method5657());
    }

    @ObfuscatedName("ll.ar(B)I")
    public int method5529() {
        return this.field3950;
    }

    @ObfuscatedName("ll.ag(I)I")
    public int method5514() {
        return this.field3951;
    }

    @ObfuscatedName("ll.au(IB)V")
    public void method5531(int arg0) {
        if (arg0 >= 1) {
            this.field3971 = arg0;
        }
    }

    @ObfuscatedName("ll.ac(B)V")
    public void method5607() {
        this.field3971 = 3;
    }

    @ObfuscatedName("ll.ay(II)V")
    public void method5679(int arg0) {
        if (arg0 >= 1) {
            this.field3955 = arg0;
        }
    }

    @ObfuscatedName("ll.at(I)V")
    public void method5534() {
        this.field3955 = 50;
    }

    @ObfuscatedName("ll.aa(ZB)V")
    public void method5614(boolean arg0) {
        this.field3956 = arg0;
    }

    @ObfuscatedName("ll.aw(II)V")
    public void method5536(int arg0) {
        this.field3935 = new HashSet();
        this.field3935.add(arg0);
        this.field3958 = 0;
        this.field3959 = 0;
    }

    @ObfuscatedName("ll.ab(IB)V")
    public void method5537(int arg0) {
        this.field3935 = new HashSet();
        this.field3958 = 0;
        this.field3959 = 0;
        for (int var2 = 0; var2 < Statics.field4025.length; var2++) {
            if (Statics.field4025[var2] != null && Statics.field4025[var2].field3398 == arg0) {
                this.field3935.add(Statics.field4025[var2].field3407);
            }
        }
    }

    @ObfuscatedName("ll.ap(I)V")
    public void method5538() {
        this.field3935 = null;
    }

    @ObfuscatedName("ll.ae(ZI)V")
    public void method5539(boolean arg0) {
        this.field3966 = !arg0;
    }

    @ObfuscatedName("ll.an(IZI)V")
    public void method5540(int arg0, boolean arg1) {
        if (arg1) {
            this.field3965.remove(arg0);
        } else {
            this.field3965.add(arg0);
        }
        this.method5584();
    }

    @ObfuscatedName("ll.bh(IZI)V")
    public void method5541(int arg0, boolean arg1) {
        if (arg1) {
            this.field3963.remove(arg0);
        } else {
            this.field3963.add(arg0);
        }
        for (int var3 = 0; var3 < Statics.field4025.length; var3++) {
            if (Statics.field4025[var3] != null && Statics.field4025[var3].field3398 == arg0) {
                int var4 = Statics.field4025[var3].field3407;
                if (arg1) {
                    this.field3941.remove(var4);
                } else {
                    this.field3941.add(var4);
                }
            }
        }
        this.method5584();
    }

    @ObfuscatedName("ll.bx(I)Z")
    public boolean method5555() {
        return !this.field3966;
    }

    @ObfuscatedName("ll.bb(II)Z")
    public boolean method5543(int arg0) {
        return !this.field3965.contains(arg0);
    }

    @ObfuscatedName("ll.bf(II)Z")
    public boolean method5544(int arg0) {
        return !this.field3963.contains(arg0);
    }

    @ObfuscatedName("ll.bp(S)V")
    public void method5584() {
        this.field3929.clear();
        this.field3929.addAll(this.field3965);
        this.field3929.addAll(this.field3941);
    }

    @ObfuscatedName("ll.bj(IIIIIII)V")
    public void method5546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!this.field3943.method5491()) {
            return;
        }
        int var7 = (int) Math.ceil((double) ((float) arg2 / this.field3948));
        int var8 = (int) Math.ceil((double) ((float) arg3 / this.field3948));
        List var9 = this.field3964.method526(this.field3928 - var7 / 2 - 1, this.field3945 - var8 / 2 - 1, var7 / 2 + this.field3928 + 1, var8 / 2 + this.field3945 + 1, arg0, arg1, arg2, arg3, arg4, arg5);
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
            class263 var12 = Statics.field4025[var11.field489];
            var13 = false;
            for (int var14 = this.field3938.length - 1; var14 >= 0; var14--) {
                if (var12.field3390[var14] != null) {
                    client.method158(var12.field3390[var14], var12.field3401, this.field3938[var14], var11.field489, var11.field492.method4027(), var11.field491.method4027());
                    var13 = true;
                }
            }
        } while (!var13);
    }

    @ObfuscatedName("ll.bi(ILhp;I)Lhp;")
    public class233 method5516(int arg0, class233 arg1) {
        if (!this.field3943.method5491()) {
            return null;
        } else if (!this.field3964.method515()) {
            return null;
        } else if (this.field3940.method291(arg1.field2742, arg1.field2743)) {
            HashMap var3 = this.field3964.method522();
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
                        return var5.field491;
                    }
                    var8 = (class40) var7.next();
                    int var9 = var8.field491.field2742 - arg1.field2742;
                    int var10 = var8.field491.field2743 - arg1.field2743;
                    var11 = var9 * var9 + var10 * var10;
                    if (var11 == 0) {
                        return var8.field491;
                    }
                } while (var11 >= var6 && var5 != null);
                var5 = var8;
                var6 = var11;
            }
        } else {
            return null;
        }
    }

    @ObfuscatedName("ll.br(IILhp;Lhp;B)V")
    public void method5548(int arg0, int arg1, class233 arg2, class233 arg3) {
        class68 var5 = new class68();
        class48 var6 = new class48(arg1, arg2, arg3);
        var5.method1037(new Object[] { var6 });
        switch(arg0) {
            case 1008:
                var5.method1033(class240.field2916);
                break;
            case 1009:
                var5.method1033(class240.field2917);
                break;
            case 1010:
                var5.method1033(class240.field2919);
                break;
            case 1011:
                var5.method1033(class240.field2925);
                break;
            case 1012:
                var5.method1033(class240.field2920);
        }
        class81.method3491(var5);
    }

    @ObfuscatedName("ll.be(I)Lad;")
    public class40 method5549() {
        if (!this.field3943.method5491()) {
            return null;
        } else if (this.field3964.method515()) {
            HashMap var1 = this.field3964.method522();
            this.field3969 = new LinkedList();
            Iterator var2 = var1.values().iterator();
            while (var2.hasNext()) {
                List var3 = (List) var2.next();
                this.field3969.addAll(var3);
            }
            this.field3970 = this.field3969.iterator();
            return this.method5560();
        } else {
            return null;
        }
    }

    @ObfuscatedName("ll.bk(I)Lad;")
    public class40 method5560() {
        if (this.field3970 == null) {
            return null;
        } else if (this.field3970.hasNext()) {
            return (class40) this.field3970.next();
        } else {
            return null;
        }
    }
}
