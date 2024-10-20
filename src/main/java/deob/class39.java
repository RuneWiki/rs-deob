package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ax")
public class class39 {

    @ObfuscatedName("ax.z")
    public static class159 field271 = new class159(37748736, 256);

    @ObfuscatedName("ax.q")
    public int field272;

    @ObfuscatedName("ax.k")
    public int field273;

    @ObfuscatedName("ax.c")
    public class25 field274;

    @ObfuscatedName("ax.u")
    public LinkedList field275;

    @ObfuscatedName("ax.t")
    public int field276;

    @ObfuscatedName("ax.e")
    public int field267;

    @ObfuscatedName("ax.o")
    public List field277;

    @ObfuscatedName("ax.n")
    public HashMap field279;

    @ObfuscatedName("ax.x")
    public final HashMap field278;

    @ObfuscatedName("u.f(IIII)J")
    public static long method89(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("kl.b(IIIB)Llc;")
    public static class336 method4893(int arg0, int arg1, int arg2) {
        return (class336) field271.method3200(method89(arg0, arg1, arg2));
    }

    @ObfuscatedName("gc.l(Llc;IIII)V")
    public static void method3481(class336 arg0, int arg1, int arg2, int arg3) {
        field271.method3198(arg0, method89(arg1, arg2, arg3), arg0.field3910.length * 4);
    }

    @ObfuscatedName("v.m(I)V")
    public static void method195() {
        field271.method3183();
    }

    public class39(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field272 = arg0;
        this.field273 = arg1;
        this.field275 = new LinkedList();
        this.field277 = new LinkedList();
        this.field279 = new HashMap();
        this.field276 = arg2 | 0xFF000000;
        this.field278 = arg3;
    }

    @ObfuscatedName("ax.z(IIIB)V")
    public void method445(int arg0, int arg1, int arg2) {
        class336 var4 = method4893(this.field272, this.field273, this.field267);
        if (var4 == null) {
            return;
        }
        if (this.field267 * 64 == arg2) {
            var4.method5800(arg0, arg1);
        } else {
            var4.method5779(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ax.q(Lh;Ljava/util/List;I)V")
    public void method446(class25 arg0, List arg1) {
        this.field279.clear();
        this.field274 = arg0;
        this.method451(arg1);
    }

    @ObfuscatedName("ax.k(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method447(HashSet arg0, List arg1) {
        this.field279.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class49 var4 = (class49) var3.next();
            if (var4.method307() == this.field272 && var4.method308() == this.field273) {
                this.field275.add(var4);
            }
        }
        this.method451(arg1);
    }

    @ObfuscatedName("ax.c(IIIILav;B)V")
    public void method448(int arg0, int arg1, int arg2, int arg3, class31 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field192; var8++) {
                    class35[] var9 = arg4.field198[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class35[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class35 var12 = var10[var11];
                            class265 var13 = class265.method1122(var12.field232);
                            if (method2371(var13)) {
                                this.method539(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.u(Lje;IIILav;B)V")
    public void method539(class265 arg0, int arg1, int arg2, int arg3, class31 arg4) {
        class223 var6 = new class223(arg1, this.field272 * 64 + arg2, this.field273 * 64 + arg3);
        Object var7 = null;
        class223 var8;
        if (this.field274 == null) {
            class49 var9 = (class49) arg4;
            var8 = new class223(var9.field191 + arg1, var9.field200 * 64 + arg2 + var9.method676() * 8, var9.field189 * 64 + arg3 + var9.method665() * 8);
        } else {
            var8 = new class223(this.field274.field191 + arg1, this.field274.field200 * 64 + arg2, this.field274.field189 * 64 + arg3);
        }
        class44 var10;
        if (arg0.field3414 == null) {
            class253 var11 = class253.method3431(arg0.field3420);
            var10 = new class28(var8, var6, var11.field3242, this.method475(var11));
        } else {
            var10 = new class33(var8, var6, arg0.field3411, this);
        }
        class253 var12 = class253.method3431(var10.method251());
        if (var12.field3259) {
            this.field279.put(new class223(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("ax.t(I)V")
    public void method450() {
        Iterator var1 = this.field279.values().iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            if (var2 instanceof class33) {
                ((class33) var2).method337();
            }
        }
    }

    @ObfuscatedName("ax.e(Ljava/util/List;B)V")
    public void method451(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class28 var3 = (class28) var2.next();
            if (class253.method3431(var3.field162).field3259 && var3.field317.field2557 >> 6 == this.field272 && var3.field317.field2554 >> 6 == this.field273) {
                class28 var4 = new class28(var3.field317, var3.field317, var3.field162, this.method474(var3.field162));
                this.field277.add(var4);
            }
        }
    }

    @ObfuscatedName("ax.o(I)V")
    public void method452() {
        if (this.field274 != null) {
            this.field274.method303();
            return;
        }
        Iterator var1 = this.field275.iterator();
        while (var1.hasNext()) {
            class49 var2 = (class49) var1.next();
            var2.method303();
        }
    }

    @ObfuscatedName("ax.n(Liw;I)Z")
    public boolean method470(class245 arg0) {
        this.field279.clear();
        if (this.field274 == null) {
            boolean var2 = true;
            Iterator var3 = this.field275.iterator();
            while (var3.hasNext()) {
                class49 var4 = (class49) var3.next();
                var4.method302(arg0);
                var2 &= var4.method301();
            }
            if (var2) {
                Iterator var5 = this.field275.iterator();
                while (var5.hasNext()) {
                    class49 var6 = (class49) var5.next();
                    this.method448(var6.method666() * 8, var6.method667() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field274.method302(arg0);
            if (this.field274.method301()) {
                this.method448(0, 0, 64, 64, this.field274);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ax.x(ILal;[Lle;Liw;Liw;I)V")
    public void method454(int arg0, class50 arg1, class335[] arg2, class245 arg3, class245 arg4) {
        this.field267 = arg0;
        if (this.field274 == null && this.field275.isEmpty() || method4893(this.field272, this.field273, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method470(arg3);
        int var8;
        if (this.field274 == null) {
            var8 = ((class31) this.field275.getFirst()).field193;
        } else {
            var8 = this.field274.field193;
        }
        boolean var9 = var7 & arg4.method3909(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method3912(var8);
        class37 var11 = class37.method2168(var10);
        class336 var12 = new class336(this.field267 * 64, this.field267 * 64);
        var12.method5843();
        if (this.field274 == null) {
            this.method458(arg1, arg2, var11);
        } else {
            this.method457(arg1, arg2, var11);
        }
        method3481(var12, this.field272, this.field273, this.field267);
        this.method452();
    }

    @ObfuscatedName("ax.p(IIILjava/util/HashSet;I)V")
    public void method509(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method465(arg0, arg1, arg3, arg2);
        this.method471(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ax.r(Ljava/util/HashSet;IIB)V")
    public void method456(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field279.values().iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method603()) {
                int var6 = var5.method251();
                if (arg0.contains(var6)) {
                    class253 var7 = class253.method3431(var6);
                    this.method467(var7, var5.field312, var5.field310, arg1, arg2);
                }
            }
        }
        this.method464(arg0, arg1, arg2);
    }

    @ObfuscatedName("ax.y(Lal;[Lle;Lau;B)V")
    public void method457(class50 arg0, class335[] arg1, class37 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method555(var4, var5, this.field274, arg0, arg2);
                this.method547(var4, var5, this.field274, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method459(var6, var7, this.field274, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ax.s(Lal;[Lle;Lau;I)V")
    public void method458(class50 arg0, class335[] arg1, class37 arg2) {
        Iterator var4 = this.field275.iterator();
        while (var4.hasNext()) {
            class49 var5 = (class49) var4.next();
            for (int var6 = var5.method666() * 8; var6 < var5.method666() * 8 + 8; var6++) {
                for (int var7 = var5.method667() * 8; var7 < var5.method667() * 8 + 8; var7++) {
                    this.method555(var6, var7, var5, arg0, arg2);
                    this.method547(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field275.iterator();
        while (var8.hasNext()) {
            class49 var9 = (class49) var8.next();
            for (int var10 = var9.method666() * 8; var10 < var9.method666() * 8 + 8; var10++) {
                for (int var11 = var9.method667() * 8; var11 < var9.method667() * 8 + 8; var11++) {
                    this.method459(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ax.j(IILav;Lal;[Lle;I)V")
    public void method459(int arg0, int arg1, class31 arg2, class50 arg3, class335[] arg4) {
        this.method554(arg0, arg1, arg2);
        this.method463(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ax.d(IILav;Lal;Lau;S)V")
    public void method555(int arg0, int arg1, class31 arg2, class50 arg3, class37 arg4) {
        int var6 = arg2.field195[0][arg0][arg1] - 1;
        int var7 = arg2.field196[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class332.method5652(this.field267 * arg0, this.field267 * (63 - arg1), this.field267, this.field267, this.field276);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            int var9 = this.field276;
            class269 var10 = class269.method1660(var7);
            int var11;
            if (var10 == null) {
                var11 = var9;
            } else if (var10.field3533 >= 0) {
                var11 = var10.field3533 | 0xFF000000;
            } else if (var10.field3525 >= 0) {
                int var12 = class42.method3262(Statics.field1802.method2620(var10.field3525), 96);
                var11 = class140.field1811[var12] | 0xFF000000;
            } else if (var10.field3528 == 16711935) {
                var11 = var9;
            } else {
                int var13 = var10.field3526;
                int var14 = var10.field3529;
                int var15 = var10.field3530;
                if (var15 > 179) {
                    var14 /= 2;
                }
                if (var15 > 192) {
                    var14 /= 2;
                }
                if (var15 > 217) {
                    var14 /= 2;
                }
                if (var15 > 243) {
                    var14 /= 2;
                }
                int var16 = var15 / 2 + (var13 / 4 << 10) + (var14 / 32 << 7);
                int var19 = class42.method3262(var16, 96);
                var11 = class140.field1811[var19] | 0xFF000000;
            }
            var8 = var11;
        }
        if (var7 > -1 && arg2.field197[0][arg0][arg1] == 0) {
            class332.method5652(this.field267 * arg0, this.field267 * (63 - arg1), this.field267, this.field267, var8);
            return;
        }
        int var20 = this.method462(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class332.method5652(this.field267 * arg0, this.field267 * (63 - arg1), this.field267, this.field267, var20);
        } else {
            arg3.method689(this.field267 * arg0, this.field267 * (63 - arg1), var20, var8, this.field267, this.field267, arg2.field197[0][arg0][arg1], arg2.field188[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ax.a(IILav;Lal;I)V")
    public void method547(int arg0, int arg1, class31 arg2, class50 arg3) {
        for (int var5 = 1; var5 < arg2.field192; var5++) {
            int var6 = arg2.field196[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field276;
                class269 var8 = class269.method1660(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3533 >= 0) {
                    var9 = var8.field3533 | 0xFF000000;
                } else if (var8.field3525 >= 0) {
                    int var10 = class42.method3262(Statics.field1802.method2620(var8.field3525), 96);
                    var9 = class140.field1811[var10] | 0xFF000000;
                } else if (var8.field3528 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = var8.field3526;
                    int var12 = var8.field3529;
                    int var13 = var8.field3530;
                    if (var13 > 179) {
                        var12 /= 2;
                    }
                    if (var13 > 192) {
                        var12 /= 2;
                    }
                    if (var13 > 217) {
                        var12 /= 2;
                    }
                    if (var13 > 243) {
                        var12 /= 2;
                    }
                    int var14 = var13 / 2 + (var11 / 4 << 10) + (var12 / 32 << 7);
                    int var17 = class42.method3262(var14, 96);
                    var9 = class140.field1811[var17] | 0xFF000000;
                }
                if (arg2.field197[var5][arg0][arg1] == 0) {
                    class332.method5652(this.field267 * arg0, this.field267 * (63 - arg1), this.field267, this.field267, var9);
                } else {
                    arg3.method689(this.field267 * arg0, this.field267 * (63 - arg1), 0, var9, this.field267, this.field267, arg2.field197[var5][arg0][arg1], arg2.field188[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ax.g(IILav;Lau;I)I")
    public int method462(int arg0, int arg1, class31 arg2, class37 arg3) {
        return arg2.field195[0][arg0][arg1] == 0 ? this.field276 : arg3.method438(arg0, arg1);
    }

    @ObfuscatedName("ax.h(IILav;[Lle;I)V")
    public void method463(int arg0, int arg1, class31 arg2, class335[] arg3) {
        for (int var5 = 0; var5 < arg2.field192; var5++) {
            class35[] var6 = arg2.field198[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class35[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class35 var9 = var7[var8];
                    if (class230.method3132(var9.field231) || class230.method83(var9.field231)) {
                        class265 var10 = class265.method1122(var9.field232);
                        if (var10.field3398 != -1) {
                            if (var10.field3398 == 46 || var10.field3398 == 52) {
                                arg3[var10.field3398].method5725(this.field267 * arg0, this.field267 * (63 - arg1), this.field267 * 2 + 1, this.field267 * 2 + 1);
                            } else {
                                arg3[var10.field3398].method5725(this.field267 * arg0, this.field267 * (63 - arg1), this.field267 * 2, this.field267 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.ab(IILav;I)V")
    public void method554(int arg0, int arg1, class31 arg2) {
        for (int var4 = 0; var4 < arg2.field192; var4++) {
            class35[] var5 = arg2.field198[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class35[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class35 var8 = var6[var7];
                    if (class230.method3428(var8.field231)) {
                        class265 var9 = class265.method1122(var8.field232);
                        int var10 = var9.field3401 == 0 ? -3355444 : -3407872;
                        if (class230.field2751.field2764 == var8.field231) {
                            this.method478(arg0, arg1, var8.field233, var10);
                        }
                        if (class230.field2749.field2764 == var8.field231) {
                            this.method478(arg0, arg1, var8.field233, -3355444);
                            this.method478(arg0, arg1, var8.field233 + 1, var10);
                        }
                        if (class230.field2755.field2764 == var8.field231) {
                            if (var8.field233 == 0) {
                                class332.method5709(this.field267 * arg0, this.field267 * (63 - arg1), 1, var10);
                            }
                            if (var8.field233 == 1) {
                                class332.method5709(this.field267 * arg0 + this.field267 - 1, this.field267 * (63 - arg1), 1, var10);
                            }
                            if (var8.field233 == 2) {
                                class332.method5709(this.field267 * arg0 + this.field267 - 1, this.field267 * (63 - arg1) + this.field267 - 1, 1, var10);
                            }
                            if (var8.field233 == 3) {
                                class332.method5709(this.field267 * arg0, this.field267 * (63 - arg1) + this.field267 - 1, 1, var10);
                            }
                        }
                        if (class230.field2752.field2764 == var8.field231) {
                            int var11 = var8.field233 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field267; var12++) {
                                    class332.method5709(this.field267 * arg0 + var12, this.field267 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field267; var13++) {
                                    class332.method5709(this.field267 * arg0 + var13, this.field267 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ax.ac(IILjava/util/HashSet;IB)V")
    public void method465(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field279.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class223 var9 = (class223) var8.getKey();
            int var10 = (int) ((float) var9.field2557 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2554 * var5 - var6);
            class44 var12 = (class44) var8.getValue();
            if (var12 != null && var12.method603()) {
                var12.field312 = var10;
                var12.field310 = var11;
                class253 var13 = class253.method3431(var12.method251());
                if (!arg2.contains(var13.method4111())) {
                    this.method468(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ax.ao(Ljava/util/HashSet;IIS)V")
    public void method464(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field277.iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method603()) {
                class253 var6 = class253.method3431(var5.method251());
                if (var6 != null && arg0.contains(var6.method4111())) {
                    this.method467(var6, var5.field312, var5.field310, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ax.af(Lij;IIIII)V")
    public void method467(class253 arg0, int arg1, int arg2, int arg3, int arg4) {
        class336 var6 = arg0.method4137(false);
        if (var6 == null) {
            return;
        }
        var6.method5773(arg1 - var6.field3909 / 2, arg2 - var6.field3915 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class332.method5714(arg1, arg2, 15, 16776960, 128);
            class332.method5714(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ax.av(Lam;IIFB)V")
    public void method468(class44 arg0, int arg1, int arg2, float arg3) {
        class253 var5 = class253.method3431(arg0.method251());
        this.method469(var5, arg1, arg2);
        this.method523(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ax.ar(Lij;III)V")
    public void method469(class253 arg0, int arg1, int arg2) {
        class336 var4 = arg0.method4137(false);
        if (var4 != null) {
            int var5 = this.method455(var4, arg0.field3257);
            int var6 = this.method473(var4, arg0.field3258);
            var4.method5773(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ax.ay(Lam;Lij;IIFI)V")
    public void method523(class44 arg0, class253 arg1, int arg2, int arg3, float arg4) {
        class38 var6 = arg0.method252();
        if (var6 != null && var6.field261.method245(arg4)) {
            class306 var7 = (class306) this.field278.get(var6.field261);
            var7.method5037(var6.field259, arg2 - var6.field260 / 2, arg3, var6.field260, var6.field262, 0xFF000000 | arg1.field3246, 0, 1, 0, var7.field3714 / 2);
        }
    }

    @ObfuscatedName("ax.ah(IILjava/util/HashSet;IB)V")
    public void method471(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field277.iterator();
        while (var6.hasNext()) {
            class44 var7 = (class44) var6.next();
            if (var7.method603()) {
                int var8 = var7.field317.field2557 % 64;
                int var9 = var7.field317.field2554 % 64;
                var7.field312 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field310 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method251())) {
                    this.method468(var7, var7.field312, var7.field310, var5);
                }
            }
        }
    }

    @ObfuscatedName("ax.az(Llc;Ljy;I)I")
    public int method455(class336 arg0, class267 arg1) {
        switch(arg1.field3483) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3909 / 2;
            default:
                return -arg0.field3909;
        }
    }

    @ObfuscatedName("ax.ak(Llc;Lir;B)I")
    public int method473(class336 arg0, class250 arg1) {
        switch(arg1.field3226) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3915 / 2;
            default:
                return -arg0.field3915;
        }
    }

    @ObfuscatedName("dh.au(Lje;I)Z")
    public static boolean method2371(class265 arg0) {
        if (arg0.field3414 != null) {
            int[] var1 = arg0.field3414;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class265 var4 = class265.method1122(var3);
                if (var4.field3420 != -1) {
                    return true;
                }
            }
        } else if (arg0.field3420 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("ax.ai(II)Lai;")
    public class38 method474(int arg0) {
        class253 var2 = class253.method3431(arg0);
        return this.method475(var2);
    }

    @ObfuscatedName("ax.ax(Lij;I)Lai;")
    public class38 method475(class253 arg0) {
        if (arg0.field3250 == null || this.field278 == null || this.field278.get(class27.field147) == null) {
            return null;
        }
        int var2 = arg0.field3247;
        class27[] var3 = class27.method241();
        int var4 = 0;
        class27 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class27 var5 = var3[var4];
            if (var5.field151 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class306 var8 = (class306) this.field278.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method5031(arg0.field3250, 1000000);
        String[] var10 = new String[var9];
        var8.method5029(arg0.field3250, (int[]) null, var10);
        int var11 = var10.length * var8.field3714 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method5028(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class38(arg0.field3250, var12, var11, var6);
    }

    @ObfuscatedName("ax.ag(IIIIIB)Ljava/util/List;")
    public List method533(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field279.values().iterator();
            while (var7.hasNext()) {
                class44 var8 = (class44) var7.next();
                if (var8.method603() && var8.method602(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field277.iterator();
            while (var9.hasNext()) {
                class44 var10 = (class44) var9.next();
                if (var10.method603() && var10.method602(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ax.aq(B)Ljava/util/List;")
    public List method460() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field277);
        var1.addAll(this.field279.values());
        return var1;
    }

    @ObfuscatedName("ax.aw(IIIII)V")
    public void method478(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class332.method5659(this.field267 * arg0, this.field267 * (63 - arg1), this.field267, arg3);
        }
        if (var5 == 1) {
            class332.method5709(this.field267 * arg0, this.field267 * (63 - arg1), this.field267, arg3);
        }
        if (var5 == 2) {
            class332.method5659(this.field267 * arg0 + this.field267 - 1, this.field267 * (63 - arg1), this.field267, arg3);
        }
        if (var5 == 3) {
            class332.method5709(this.field267 * arg0, this.field267 * (63 - arg1) + this.field267 - 1, this.field267, arg3);
        }
    }
}
