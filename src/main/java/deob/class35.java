package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("as")
public class class35 {

    @ObfuscatedName("as.m")
    public int field489;

    @ObfuscatedName("as.h")
    public int field478;

    @ObfuscatedName("as.t")
    public class23 field479;

    @ObfuscatedName("as.p")
    public LinkedList field483;

    @ObfuscatedName("as.d")
    public int field481;

    @ObfuscatedName("as.n")
    public int field482;

    @ObfuscatedName("as.z")
    public int[][] field475;

    @ObfuscatedName("as.o")
    public class289 field484;

    @ObfuscatedName("as.q")
    public List field485;

    @ObfuscatedName("as.u")
    public HashMap field486;

    @ObfuscatedName("as.k")
    public final HashMap field488;

    @ObfuscatedName("as.e")
    public static final class216 field492 = new class216();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field489 = arg0;
        this.field478 = arg1;
        this.field483 = new LinkedList();
        this.field485 = new LinkedList();
        this.field486 = new HashMap();
        this.field481 = arg2 | 0xFF000000;
        this.field488 = arg3;
    }

    @ObfuscatedName("as.s(IIII)V")
    public void method364(int arg0, int arg1, int arg2) {
        if (this.field484 == null) {
            return;
        }
        if (this.field482 * 64 == arg2) {
            this.field484.method4773(arg0, arg1);
        } else {
            this.field484.method4789(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("as.c(Lx;Ljava/util/List;I)V")
    public void method328(class23 arg0, List arg1) {
        this.field486.clear();
        this.field479 = arg0;
        this.method330(0, 0, 64, 64, this.field479);
        this.method329(arg1);
    }

    @ObfuscatedName("as.f(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method358(HashSet arg0, List arg1) {
        this.field486.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method226() == this.field489 && var4.method227() == this.field478) {
                this.field483.add(var4);
                this.method330(var4.method584() * 8, var4.method559() * 8, 8, 8, var4);
            }
        }
        this.method329(arg1);
    }

    @ObfuscatedName("as.m(IIIILam;I)V")
    public void method330(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class216 var8 = new class216(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field416; var9++) {
                    class32[] var10 = arg4.field419[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class246 var14 = this.method360(var13.field449);
                            if (var14 != null) {
                                class216 var15 = new class216(var9, this.field489 * 64 + var6, this.field478 * 64 + var7);
                                Object var16 = null;
                                class216 var17;
                                if (this.field479 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class216(var18.field413 + var9, var18.field409 * 64 + var6 + var18.method574() * 8, var18.field410 * 64 + var7 + var18.method557() * 8);
                                } else {
                                    var17 = new class216(this.field479.field413 + var9, this.field479.field409 * 64 + var6, this.field479.field410 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3319, var17, var15, this.method362(var14));
                                this.field486.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.h(Ljava/util/List;I)V")
    public void method329(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field375.field2626 >> 6 == this.field489 && var3.field375.field2632 >> 6 == this.field478) {
                class40 var4 = new class40(var3.field380, var3.field375, var3.field375, this.method361(var3.field380));
                this.field485.add(var4);
            }
        }
    }

    @ObfuscatedName("as.t(ILal;[Las;[Lkc;B)Z")
    public boolean method332(int arg0, class47 arg1, class35[] arg2, class288[] arg3) {
        if (!this.method335(arg0)) {
            return false;
        } else if (this.field479 == null && this.field483.isEmpty()) {
            return false;
        } else {
            this.method411(arg2);
            this.field484.method4766();
            if (this.field479 == null) {
                this.method337(arg1, arg3);
            } else {
                this.method336(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("as.p(IIILjava/util/HashSet;I)V")
    public void method427(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method349(arg0, arg1, arg3, arg2);
        this.method355(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("as.d(Ljava/util/HashSet;III)V")
    public void method334(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field486.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field534)) {
                class246 var6 = Statics.field3305[var5.field534];
                this.method351(var6, var5.field523, var5.field530, arg1, arg2);
            }
        }
        this.method390(arg0, arg1, arg2);
    }

    @ObfuscatedName("as.n(IB)Z")
    public boolean method335(int arg0) {
        if (this.field484 != null && this.field482 == arg0) {
            return false;
        } else {
            this.field482 = arg0;
            this.field484 = new class289(this.field482 * 64, this.field482 * 64);
            return true;
        }
    }

    @ObfuscatedName("as.z(Lal;[Las;[Lkc;I)V")
    public void method336(class47 arg0, class35[] arg1, class288[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method339(var4, var5, this.field479, arg0);
                this.method401(var4, var5, this.field479, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method338(var6, var7, this.field479, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("as.o(Lal;[Lkc;I)V")
    public void method337(class47 arg0, class288[] arg1) {
        Iterator var3 = this.field483.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method584() * 8; var5 < var4.method584() * 8 + 8; var5++) {
                for (int var6 = var4.method559() * 8; var6 < var4.method559() * 8 + 8; var6++) {
                    this.method339(var5, var6, var4, arg0);
                    this.method401(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field483.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method584() * 8; var9 < var8.method584() * 8 + 8; var9++) {
                for (int var10 = var8.method559() * 8; var10 < var8.method559() * 8 + 8; var10++) {
                    this.method338(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("as.u(IILam;Lal;[Lkc;I)V")
    public void method338(int arg0, int arg1, class29 arg2, class47 arg3, class288[] arg4) {
        this.method344(arg0, arg1, arg2);
        this.method347(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("as.r(IILam;Lal;S)V")
    public void method339(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field415[0][arg0][arg1] - 1;
        int var6 = arg2.field420[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class285.method4701(this.field482 * arg0, this.field482 * (63 - arg1), this.field482, this.field482, this.field481);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method45(var6, this.field481);
        }
        if (var6 > -1 && arg2.field417[0][arg0][arg1] == 0) {
            class285.method4701(this.field482 * arg0, this.field482 * (63 - arg1), this.field482, this.field482, var7);
            return;
        }
        int var8 = this.method346(arg0, arg1, arg2);
        if (var6 == -1) {
            class285.method4701(this.field482 * arg0, this.field482 * (63 - arg1), this.field482, this.field482, var8);
        } else {
            arg3.method588(this.field482 * arg0, this.field482 * (63 - arg1), var8, var7, this.field482, this.field482, arg2.field417[0][arg0][arg1], arg2.field414[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("as.l(IILam;Lal;I)V")
    public void method401(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field416; var5++) {
            int var6 = arg2.field420[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method45(var6, this.field481);
                if (arg2.field417[var5][arg0][arg1] == 0) {
                    class285.method4701(this.field482 * arg0, this.field482 * (63 - arg1), this.field482, this.field482, var7);
                } else {
                    arg3.method588(this.field482 * arg0, this.field482 * (63 - arg1), 0, var7, this.field482, this.field482, arg2.field417[var5][arg0][arg1], arg2.field414[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("as.y([Las;I)Z")
    public boolean method411(class35[] arg0) {
        if (this.field475 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field479 == null) {
            Iterator var3 = this.field483.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method333(var4.method584() * 8, var4.method559() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method333(0, 0, 64, 64, this.field479, var2);
        }
        this.method343(arg0, var2);
        this.method371(var2);
        return true;
    }

    @ObfuscatedName("as.w(Laz;B)V")
    public void method371(class44 arg0) {
        this.field475 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field475[var2][var3] = arg0.method534(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("as.i([Las;Laz;S)V")
    public void method343(class35[] arg0, class44 arg1) {
        class232[] var3 = class232.method1000();
        class232[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class232 var6 = var4[var5];
            if (arg0[var6.method16()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3177) {
                    case 0:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 2:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 3:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 4:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 5:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var7 = 59;
                        var9 = 5;
                }
                this.method345(var11, var12, var7, var8, var9, var10, arg0[var6.method16()], arg1);
            }
        }
    }

    @ObfuscatedName("as.g(IIIILam;Laz;I)V")
    public void method333(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field415[0][var7][var8] - 1;
                if (var9 != -1) {
                    class250 var10 = class250.method3832(var9);
                    arg5.method538(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("as.a(IIIIIILas;Laz;I)V")
    public void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method366(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class250 var12 = class250.method3832(var11);
                    arg7.method538(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("as.x(IILam;B)I")
    public int method346(int arg0, int arg1, class29 arg2) {
        return arg2.field415[0][arg0][arg1] == 0 ? this.field481 : this.field475[arg0][arg1];
    }

    @ObfuscatedName("as.j(IILam;[Lkc;I)V")
    public void method347(int arg0, int arg1, class29 arg2, class288[] arg3) {
        for (int var5 = 0; var5 < arg2.field416; var5++) {
            class32[] var6 = arg2.field419[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (class225.method2706(var9.field452) || class225.method681(var9.field452)) {
                        class259 var10 = class259.method653(var9.field449);
                        if (var10.field3447 != -1) {
                            if (var10.field3447 == 46 || var10.field3447 == 52) {
                                arg3[var10.field3447].method4746(this.field482 * arg0, this.field482 * (63 - arg1), this.field482 * 2 + 1, this.field482 * 2 + 1);
                            } else {
                                arg3[var10.field3447].method4746(this.field482 * arg0, this.field482 * (63 - arg1), this.field482 * 2, this.field482 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.v(IILam;B)V")
    public void method344(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field416; var4++) {
            class32[] var5 = arg2.field419[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field452;
                    boolean var10 = var9 >= class225.field2838.field2839 && var9 <= class225.field2831.field2839 || class225.field2832.field2839 == var9;
                    if (var10) {
                        class259 var11 = class259.method653(var8.field449);
                        int var12 = var11.field3466 == 0 ? -3355444 : -3407872;
                        if (class225.field2838.field2839 == var8.field452) {
                            this.method365(arg0, arg1, var8.field447, var12);
                        }
                        if (class225.field2830.field2839 == var8.field452) {
                            this.method365(arg0, arg1, var8.field447, -3355444);
                            this.method365(arg0, arg1, var8.field447 + 1, var12);
                        }
                        if (class225.field2831.field2839 == var8.field452) {
                            if (var8.field447 == 0) {
                                class285.method4672(this.field482 * arg0, this.field482 * (63 - arg1), 1, var12);
                            }
                            if (var8.field447 == 1) {
                                class285.method4672(this.field482 * arg0 + this.field482 - 1, this.field482 * (63 - arg1), 1, var12);
                            }
                            if (var8.field447 == 2) {
                                class285.method4672(this.field482 * arg0 + this.field482 - 1, this.field482 * (63 - arg1) + this.field482 - 1, 1, var12);
                            }
                            if (var8.field447 == 3) {
                                class285.method4672(this.field482 * arg0, this.field482 * (63 - arg1) + this.field482 - 1, 1, var12);
                            }
                        }
                        if (class225.field2832.field2839 == var8.field452) {
                            int var13 = var8.field447 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field482; var14++) {
                                    class285.method4672(this.field482 * arg0 + var14, this.field482 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field482; var15++) {
                                    class285.method4672(this.field482 * arg0 + var15, this.field482 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("as.ap(IILjava/util/HashSet;II)V")
    public void method349(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field486.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class216 var9 = (class216) var8.getKey();
            int var10 = (int) ((float) var9.field2626 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2632 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field523 = var10;
                var12.field530 = var11;
                class246 var13 = Statics.field3305[var12.field534];
                if (!arg2.contains(var13.method4009())) {
                    this.method352(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("as.ar(Ljava/util/HashSet;III)V")
    public void method390(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field485.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class246 var6 = Statics.field3305[var5.field534];
            if (var6 != null && arg0.contains(var6.method4009())) {
                this.method351(var6, var5.field523, var5.field530, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("as.am(Liq;IIIII)V")
    public void method351(class246 arg0, int arg1, int arg2, int arg3, int arg4) {
        class289 var6 = arg0.method4007(false);
        if (var6 == null) {
            return;
        }
        var6.method4795(arg1 - var6.field3791 / 2, arg2 - var6.field3792 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class285.method4680(arg1, arg2, 15, 16776960, 128);
            class285.method4680(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("as.ab(Lax;IIFB)V")
    public void method352(class40 arg0, int arg1, int arg2, float arg3) {
        class246 var5 = Statics.field3305[arg0.field534];
        this.method444(var5, arg1, arg2);
        this.method354(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("as.af(Liq;III)V")
    public void method444(class246 arg0, int arg1, int arg2) {
        class289 var4 = arg0.method4007(false);
        if (var4 != null) {
            int var5 = this.method379(var4, arg0.field3304);
            int var6 = this.method412(var4, arg0.field3306);
            var4.method4795(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("as.aa(Lax;Liq;IIFI)V")
    public void method354(class40 arg0, class246 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field528 != null && arg0.field528.field473.method170(arg4)) {
            class267 var6 = (class267) this.field488.get(arg0.field528.field473);
            var6.method4491(arg0.field528.field470, arg2 - arg0.field528.field474 / 2, arg3, arg0.field528.field474, arg0.field528.field472, 0xFF000000 | arg1.field3312, 0, 1, 0, var6.field3659 / 2);
        }
    }

    @ObfuscatedName("as.aq(IILjava/util/HashSet;II)V")
    public void method355(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field485.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field524.field2626 % 64;
            int var9 = var7.field524.field2632 % 64;
            var7.field523 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field530 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field534)) {
                this.method352(var7, var7.field523, var7.field530, var5);
            }
        }
    }

    @ObfuscatedName("as.aj(B)V")
    public void method356() {
        if (this.field479 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method445(var1, var2, this.field479);
                }
            }
            return;
        }
        Iterator var3 = this.field483.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method584() * 8; var5 < var4.method584() * 8 + 8; var5++) {
                for (int var6 = var4.method559() * 8; var6 < var4.method559() * 8 + 8; var6++) {
                    this.method445(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("as.as(IILam;I)V")
    public void method445(int arg0, int arg1, class29 arg2) {
        field492.method3689(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field416; var4++) {
            class32[] var5 = arg2.field419[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class246 var9 = this.method360(var8.field449);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field486.get(field492);
                        if (var10 != null) {
                            if (var9.field3319 != var10.field534) {
                                class40 var11 = new class40(var9.field3319, var10.field525, var10.field524, this.method362(var9));
                                this.field486.put(new class216(field492), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field525.field2631 - var10.field524.field2631;
                            var10.field524.field2631 = var4;
                            var10.field525.field2631 = var4 + var12;
                            return;
                        }
                        class216 var13 = new class216(var4, this.field489 * 64 + arg0, this.field478 * 64 + arg1);
                        class216 var14 = null;
                        if (this.field479 == null) {
                            Iterator var15 = this.field483.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method554(arg0, arg1)) {
                                    var14 = new class216(var16.field413 + var4, var16.field409 * 64 + arg0 + var16.method574() * 8, var16.field410 * 64 + arg1 + var16.method557() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class216(this.field479.field413 + var4, this.field479.field409 * 64 + arg0, this.field479.field410 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3319, var14, var13, this.method362(var9));
                            this.field486.put(new class216(field492), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field486.remove(field492);
    }

    @ObfuscatedName("as.av(Lkb;Ljd;B)I")
    public int method379(class289 arg0, class261 arg1) {
        switch(arg1.field3558) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3791 / 2;
            default:
                return -arg0.field3791;
        }
    }

    @ObfuscatedName("as.ao(Lkb;Lij;I)I")
    public int method412(class289 arg0, class243 arg1) {
        switch(arg1.field3292) {
            case 0:
                return -arg0.field3792 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3792;
        }
    }

    @ObfuscatedName("as.ag(IB)Liq;")
    public class246 method360(int arg0) {
        class259 var2 = class259.method653(arg0);
        if (var2.field3488 != null) {
            var2 = var2.method4246();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3475 == -1 ? null : Statics.field3305[var2.field3475];
    }

    @ObfuscatedName("as.ay(II)Laj;")
    public class34 method361(int arg0) {
        class246 var2 = Statics.field3305[arg0];
        return this.method362(var2);
    }

    @ObfuscatedName("as.ax(Liq;I)Laj;")
    public class34 method362(class246 arg0) {
        if (arg0.field3311 == null || this.field488 == null || this.field488.get(class25.field373) == null) {
            return null;
        }
        class25 var2 = class25.method173(arg0.field3313);
        if (var2 == null) {
            return null;
        }
        class267 var3 = (class267) this.field488.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4485(arg0.field3311, 1000000);
        String[] var5 = new String[var4];
        var3.method4545(arg0.field3311, (int[]) null, var5);
        int var6 = var5.length * var3.field3659 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4487(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class34(arg0.field3311, var7, var6, var2);
    }

    @ObfuscatedName("as.ad(IIIIII)Ljava/util/List;")
    public List method363(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field486.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method480(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field485.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method480(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("as.ae(I)Ljava/util/List;")
    public List method327() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field485);
        var1.addAll(this.field486.values());
        return var1;
    }

    @ObfuscatedName("as.ac(IIIIB)V")
    public void method365(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class285.method4674(this.field482 * arg0, this.field482 * (63 - arg1), this.field482, arg3);
        }
        if (var5 == 1) {
            class285.method4672(this.field482 * arg0, this.field482 * (63 - arg1), this.field482, arg3);
        }
        if (var5 == 2) {
            class285.method4674(this.field482 * arg0 + this.field482 - 1, this.field482 * (63 - arg1), this.field482, arg3);
        }
        if (var5 == 3) {
            class285.method4672(this.field482 * arg0, this.field482 * (63 - arg1) + this.field482 - 1, this.field482, arg3);
        }
    }

    @ObfuscatedName("as.az(III)I")
    public int method366(int arg0, int arg1) {
        if (this.field479 != null) {
            return this.field479.method225(arg0, arg1);
        }
        if (!this.field483.isEmpty()) {
            Iterator var3 = this.field483.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method554(arg0, arg1)) {
                    return var4.method225(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
