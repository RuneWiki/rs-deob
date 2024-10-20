package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("az")
public class class35 {

    @ObfuscatedName("az.y")
    public int field485;

    @ObfuscatedName("az.w")
    public int field493;

    @ObfuscatedName("az.k")
    public class23 field487;

    @ObfuscatedName("az.v")
    public LinkedList field488;

    @ObfuscatedName("az.z")
    public int field494;

    @ObfuscatedName("az.r")
    public int field490;

    @ObfuscatedName("az.u")
    public int[][] field491;

    @ObfuscatedName("az.d")
    public class287 field492;

    @ObfuscatedName("az.o")
    public List field482;

    @ObfuscatedName("az.l")
    public HashMap field486;

    @ObfuscatedName("az.h")
    public final HashMap field489;

    @ObfuscatedName("az.s")
    public static final class214 field483 = new class214();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field485 = arg0;
        this.field493 = arg1;
        this.field488 = new LinkedList();
        this.field482 = new LinkedList();
        this.field486 = new HashMap();
        this.field494 = arg2 | 0xFF000000;
        this.field489 = arg3;
    }

    @ObfuscatedName("az.e(IIII)V")
    public void method324(int arg0, int arg1, int arg2) {
        if (this.field492 == null) {
            return;
        }
        if (this.field490 * 64 == arg2) {
            this.field492.method4764(arg0, arg1);
        } else {
            this.field492.method4813(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("az.n(Lx;Ljava/util/List;I)V")
    public void method395(class23 arg0, List arg1) {
        this.field486.clear();
        this.field487 = arg0;
        this.method327(0, 0, 64, 64, this.field487);
        this.method328(arg1);
    }

    @ObfuscatedName("az.g(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method344(HashSet arg0, List arg1) {
        this.field486.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method228() == this.field485 && var4.method220() == this.field493) {
                this.field488.add(var4);
                this.method327(var4.method572() * 8, var4.method558() * 8, 8, 8, var4);
            }
        }
        this.method328(arg1);
    }

    @ObfuscatedName("az.y(IIIILau;I)V")
    public void method327(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class214 var8 = new class214(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field408; var9++) {
                    class32[] var10 = arg4.field413[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class244 var14 = this.method450(var13.field449);
                            if (var14 != null) {
                                class214 var15 = new class214(var9, this.field485 * 64 + var6, this.field493 * 64 + var7);
                                Object var16 = null;
                                class214 var17;
                                if (this.field487 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class214(var18.field403 + var9, var18.field412 * 64 + var6 + var18.method581() * 8, var18.field410 * 64 + var7 + var18.method556() * 8);
                                } else {
                                    var17 = new class214(this.field487.field403 + var9, this.field487.field412 * 64 + var6, this.field487.field410 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3298, var17, var15, this.method359(var14));
                                this.field486.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.w(Ljava/util/List;I)V")
    public void method328(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field370.field2588 >> 6 == this.field485 && var3.field370.field2591 >> 6 == this.field493) {
                class40 var4 = new class40(var3.field369, var3.field370, var3.field370, this.method352(var3.field369));
                this.field482.add(var4);
            }
        }
    }

    @ObfuscatedName("az.k(ILap;[Laz;[Ljp;B)Z")
    public boolean method329(int arg0, class47 arg1, class35[] arg2, class286[] arg3) {
        if (!this.method332(arg0)) {
            return false;
        } else if (this.field487 == null && this.field488.isEmpty()) {
            return false;
        } else {
            this.method338(arg2);
            this.field492.method4757();
            if (this.field487 == null) {
                this.method334(arg1, arg3);
            } else {
                this.method333(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("az.v(IIILjava/util/HashSet;I)V")
    public void method330(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method435(arg0, arg1, arg3, arg2);
        this.method367(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("az.z(Ljava/util/HashSet;IIB)V")
    public void method331(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field486.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field535)) {
                class244 var6 = Statics.field3277[var5.field535];
                this.method418(var6, var5.field533, var5.field534, arg1, arg2);
            }
        }
        this.method347(arg0, arg1, arg2);
    }

    @ObfuscatedName("az.r(IB)Z")
    public boolean method332(int arg0) {
        if (this.field492 != null && this.field490 == arg0) {
            return false;
        } else {
            this.field490 = arg0;
            this.field492 = new class287(this.field490 * 64, this.field490 * 64);
            return true;
        }
    }

    @ObfuscatedName("az.u(Lap;[Laz;[Ljp;I)V")
    public void method333(class47 arg0, class35[] arg1, class286[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method392(var4, var5, this.field487, arg0);
                this.method385(var4, var5, this.field487, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method335(var6, var7, this.field487, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("az.d(Lap;[Ljp;I)V")
    public void method334(class47 arg0, class286[] arg1) {
        Iterator var3 = this.field488.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method572() * 8; var5 < var4.method572() * 8 + 8; var5++) {
                for (int var6 = var4.method558() * 8; var6 < var4.method558() * 8 + 8; var6++) {
                    this.method392(var5, var6, var4, arg0);
                    this.method385(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field488.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method572() * 8; var9 < var8.method572() * 8 + 8; var9++) {
                for (int var10 = var8.method558() * 8; var10 < var8.method558() * 8 + 8; var10++) {
                    this.method335(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("az.o(IILau;Lap;[Ljp;B)V")
    public void method335(int arg0, int arg1, class29 arg2, class47 arg3, class286[] arg4) {
        this.method345(arg0, arg1, arg2);
        this.method326(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("az.s(IILau;Lap;I)V")
    public void method392(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field409[0][arg0][arg1] - 1;
        int var6 = arg2.field404[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class283.method4649(this.field490 * arg0, this.field490 * (63 - arg1), this.field490, this.field490, this.field494);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method4537(var6, this.field494);
        }
        if (var6 > -1 && arg2.field411[0][arg0][arg1] == 0) {
            class283.method4649(this.field490 * arg0, this.field490 * (63 - arg1), this.field490, this.field490, var7);
            return;
        }
        int var8 = this.method458(arg0, arg1, arg2);
        if (var6 == -1) {
            class283.method4649(this.field490 * arg0, this.field490 * (63 - arg1), this.field490, this.field490, var8);
        } else {
            arg3.method586(this.field490 * arg0, this.field490 * (63 - arg1), var8, var7, this.field490, this.field490, arg2.field411[0][arg0][arg1], arg2.field414[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("az.c(IILau;Lap;I)V")
    public void method385(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field408; var5++) {
            int var6 = arg2.field404[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method4537(var6, this.field494);
                if (arg2.field411[var5][arg0][arg1] == 0) {
                    class283.method4649(this.field490 * arg0, this.field490 * (63 - arg1), this.field490, this.field490, var7);
                } else {
                    arg3.method586(this.field490 * arg0, this.field490 * (63 - arg1), 0, var7, this.field490, this.field490, arg2.field411[var5][arg0][arg1], arg2.field414[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("az.m([Laz;I)Z")
    public boolean method338(class35[] arg0) {
        if (this.field491 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field487 == null) {
            Iterator var3 = this.field488.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method402(var4.method572() * 8, var4.method558() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method402(0, 0, 64, 64, this.field487, var2);
        }
        this.method340(arg0, var2);
        this.method339(var2);
        return true;
    }

    @ObfuscatedName("az.a(Laq;B)V")
    public void method339(class44 arg0) {
        this.field491 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field491[var2][var3] = arg0.method537(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("az.t([Laz;Laq;B)V")
    public void method340(class35[] arg0, class44 arg1) {
        class230[] var3 = new class230[] { class230.field3131, class230.field3133, class230.field3125, class230.field3127, class230.field3132, class230.field3126, class230.field3128, class230.field3130 };
        class230[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class230 var7 = var5[var6];
            if (arg0[var7.method6()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3129) {
                    case 0:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 2:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 4:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 6:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                }
                this.method342(var12, var13, var8, var9, var10, var11, arg0[var7.method6()], arg1);
            }
        }
    }

    @ObfuscatedName("az.p(IIIILau;Laq;S)V")
    public void method402(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field409[0][var7][var8] - 1;
                if (var9 != -1) {
                    class248 var10 = class248.method463(var9);
                    arg5.method539(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("az.f(IIIIIILaz;Laq;B)V")
    public void method342(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method363(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class248 var12 = class248.method463(var11);
                    arg7.method539(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("az.x(IILau;I)I")
    public int method458(int arg0, int arg1, class29 arg2) {
        return arg2.field409[0][arg0][arg1] == 0 ? this.field494 : this.field491[arg0][arg1];
    }

    @ObfuscatedName("az.q(IILau;[Ljp;I)V")
    public void method326(int arg0, int arg1, class29 arg2, class286[] arg3) {
        for (int var5 = 0; var5 < arg2.field408; var5++) {
            class32[] var6 = arg2.field413[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class223.method2709(var9.field446)) {
                        int var10 = var9.field446;
                        boolean var11 = class223.field2789.field2805 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class257 var12 = class257.method247(var9.field449);
                    if (var12.field3445 != -1) {
                        if (var12.field3445 == 46 || var12.field3445 == 52) {
                            arg3[var12.field3445].method4736(this.field490 * arg0, this.field490 * (63 - arg1), this.field490 * 2 + 1, this.field490 * 2 + 1);
                        } else {
                            arg3[var12.field3445].method4736(this.field490 * arg0, this.field490 * (63 - arg1), this.field490 * 2, this.field490 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.ag(IILau;S)V")
    public void method345(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field408; var4++) {
            class32[] var5 = arg2.field413[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class223.method1487(var8.field446)) {
                        class257 var9 = class257.method247(var8.field449);
                        int var10 = var9.field3436 == 0 ? -3355444 : -3407872;
                        if (class223.field2802.field2805 == var8.field446) {
                            this.method362(arg0, arg1, var8.field447, var10);
                        }
                        if (class223.field2784.field2805 == var8.field446) {
                            this.method362(arg0, arg1, var8.field447, -3355444);
                            this.method362(arg0, arg1, var8.field447 + 1, var10);
                        }
                        if (class223.field2793.field2805 == var8.field446) {
                            if (var8.field447 == 0) {
                                class283.method4658(this.field490 * arg0, this.field490 * (63 - arg1), 1, var10);
                            }
                            if (var8.field447 == 1) {
                                class283.method4658(this.field490 * arg0 + this.field490 - 1, this.field490 * (63 - arg1), 1, var10);
                            }
                            if (var8.field447 == 2) {
                                class283.method4658(this.field490 * arg0 + this.field490 - 1, this.field490 * (63 - arg1) + this.field490 - 1, 1, var10);
                            }
                            if (var8.field447 == 3) {
                                class283.method4658(this.field490 * arg0, this.field490 * (63 - arg1) + this.field490 - 1, 1, var10);
                            }
                        }
                        if (class223.field2786.field2805 == var8.field446) {
                            int var11 = var8.field447 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field490; var12++) {
                                    class283.method4658(this.field490 * arg0 + var12, this.field490 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field490; var13++) {
                                    class283.method4658(this.field490 * arg0 + var13, this.field490 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("az.ay(IILjava/util/HashSet;II)V")
    public void method435(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field486.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2588 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2591 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field533 = var10;
                var12.field534 = var11;
                class244 var13 = Statics.field3277[var12.field535];
                if (!arg2.contains(var13.method3980())) {
                    this.method349(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("az.au(Ljava/util/HashSet;III)V")
    public void method347(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field482.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class244 var6 = Statics.field3277[var5.field535];
            if (var6 != null && arg0.contains(var6.method3980())) {
                this.method418(var6, var5.field533, var5.field534, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("az.ah(Lio;IIIII)V")
    public void method418(class244 arg0, int arg1, int arg2, int arg3, int arg4) {
        class287 var6 = arg0.method3981(false);
        if (var6 == null) {
            return;
        }
        var6.method4809(arg1 - var6.field3765 / 2, arg2 - var6.field3770 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class283.method4647(arg1, arg2, 15, 16776960, 128);
            class283.method4647(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("az.ao(Lad;IIFI)V")
    public void method349(class40 arg0, int arg1, int arg2, float arg3) {
        class244 var5 = Statics.field3277[arg0.field535];
        this.method350(var5, arg1, arg2);
        this.method351(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("az.al(Lio;IIB)V")
    public void method350(class244 arg0, int arg1, int arg2) {
        class287 var4 = arg0.method3981(false);
        if (var4 != null) {
            int var5 = this.method355(var4, arg0.field3292);
            int var6 = this.method460(var4, arg0.field3294);
            var4.method4809(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("az.ae(Lad;Lio;IIFI)V")
    public void method351(class40 arg0, class244 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field532 != null && arg0.field532.field478.method174(arg4)) {
            class265 var6 = (class265) this.field489.get(arg0.field532.field478);
            var6.method4463(arg0.field532.field472, arg2 - arg0.field532.field471 / 2, arg3, arg0.field532.field471, arg0.field532.field479, 0xFF000000 | arg1.field3284, 0, 1, 0, var6.field3645 / 2);
        }
    }

    @ObfuscatedName("az.ax(IILjava/util/HashSet;IB)V")
    public void method367(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field482.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field531.field2588 % 64;
            int var9 = var7.field531.field2591 % 64;
            var7.field533 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field534 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field535)) {
                this.method349(var7, var7.field533, var7.field534, var5);
            }
        }
    }

    @ObfuscatedName("az.az(I)V")
    public void method353() {
        if (this.field487 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method354(var1, var2, this.field487);
                }
            }
            return;
        }
        Iterator var3 = this.field488.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method572() * 8; var5 < var4.method572() * 8 + 8; var5++) {
                for (int var6 = var4.method558() * 8; var6 < var4.method558() * 8 + 8; var6++) {
                    this.method354(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("az.aw(IILau;I)V")
    public void method354(int arg0, int arg1, class29 arg2) {
        field483.method3652(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field408; var4++) {
            class32[] var5 = arg2.field413[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class244 var9 = this.method450(var8.field449);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field486.get(field483);
                        if (var10 != null) {
                            if (var9.field3298 != var10.field535) {
                                class40 var11 = new class40(var9.field3298, var10.field529, var10.field531, this.method359(var9));
                                this.field486.put(new class214(field483), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field529.field2589 - var10.field531.field2589;
                            var10.field531.field2589 = var4;
                            var10.field529.field2589 = var4 + var12;
                            return;
                        }
                        class214 var13 = new class214(var4, this.field485 * 64 + arg0, this.field493 * 64 + arg1);
                        class214 var14 = null;
                        if (this.field487 == null) {
                            Iterator var15 = this.field488.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method554(arg0, arg1)) {
                                    var14 = new class214(var16.field403 + var4, var16.field412 * 64 + arg0 + var16.method581() * 8, var16.field410 * 64 + arg1 + var16.method556() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class214(this.field487.field403 + var4, this.field487.field412 * 64 + arg0, this.field487.field410 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3298, var14, var13, this.method359(var9));
                            this.field486.put(new class214(field483), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field486.remove(field483);
    }

    @ObfuscatedName("az.av(Lkn;Lij;I)I")
    public int method355(class287 arg0, class259 arg1) {
        switch(arg1.field3539) {
            case 1:
                return -arg0.field3765 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3765;
        }
    }

    @ObfuscatedName("az.ac(Lkn;Liy;I)I")
    public int method460(class287 arg0, class241 arg1) {
        switch(arg1.field3258) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3770 / 2;
            default:
                return -arg0.field3770;
        }
    }

    @ObfuscatedName("az.ak(II)Lio;")
    public class244 method450(int arg0) {
        class257 var2 = class257.method247(arg0);
        if (var2.field3468 != null) {
            var2 = var2.method4229();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3457 == -1 ? null : Statics.field3277[var2.field3457];
    }

    @ObfuscatedName("az.ad(II)Lax;")
    public class34 method352(int arg0) {
        class244 var2 = Statics.field3277[arg0];
        return this.method359(var2);
    }

    @ObfuscatedName("az.at(Lio;I)Lax;")
    public class34 method359(class244 arg0) {
        if (arg0.field3283 == null || this.field489 == null || this.field489.get(class25.field359) == null) {
            return null;
        }
        class25 var2 = class25.method171(arg0.field3285);
        if (var2 == null) {
            return null;
        }
        class265 var3 = (class265) this.field489.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4457(arg0.field3283, 1000000);
        String[] var5 = new String[var4];
        var3.method4460(arg0.field3283, (int[]) null, var5);
        int var6 = var5.length * var3.field3645 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4454(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class34(arg0.field3283, var7, var6, var2);
    }

    @ObfuscatedName("az.af(IIIIII)Ljava/util/List;")
    public List method360(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field486.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method478(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field482.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method478(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("az.am(I)Ljava/util/List;")
    public List method361() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field482);
        var1.addAll(this.field486.values());
        return var1;
    }

    @ObfuscatedName("az.aq(IIIII)V")
    public void method362(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class283.method4660(this.field490 * arg0, this.field490 * (63 - arg1), this.field490, arg3);
        }
        if (var5 == 1) {
            class283.method4658(this.field490 * arg0, this.field490 * (63 - arg1), this.field490, arg3);
        }
        if (var5 == 2) {
            class283.method4660(this.field490 * arg0 + this.field490 - 1, this.field490 * (63 - arg1), this.field490, arg3);
        }
        if (var5 == 3) {
            class283.method4658(this.field490 * arg0, this.field490 * (63 - arg1) + this.field490 - 1, this.field490, arg3);
        }
    }

    @ObfuscatedName("az.as(IIB)I")
    public int method363(int arg0, int arg1) {
        if (this.field487 != null) {
            return this.field487.method219(arg0, arg1);
        }
        if (!this.field488.isEmpty()) {
            Iterator var3 = this.field488.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method554(arg0, arg1)) {
                    return var4.method219(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
