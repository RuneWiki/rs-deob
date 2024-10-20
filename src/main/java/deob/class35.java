package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ae")
public class class35 {

    @ObfuscatedName("ae.p")
    public int field501;

    @ObfuscatedName("ae.x")
    public int field487;

    @ObfuscatedName("ae.g")
    public class23 field489;

    @ObfuscatedName("ae.c")
    public LinkedList field492;

    @ObfuscatedName("ae.l")
    public int field491;

    @ObfuscatedName("ae.w")
    public int field485;

    @ObfuscatedName("ae.b")
    public int[][] field493;

    @ObfuscatedName("ae.o")
    public class287 field494;

    @ObfuscatedName("ae.m")
    public List field488;

    @ObfuscatedName("ae.i")
    public HashMap field496;

    @ObfuscatedName("ae.s")
    public final HashMap field497;

    @ObfuscatedName("ae.r")
    public static final class214 field498 = new class214();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field501 = arg0;
        this.field487 = arg1;
        this.field492 = new LinkedList();
        this.field488 = new LinkedList();
        this.field496 = new HashMap();
        this.field491 = arg2 | 0xFF000000;
        this.field497 = arg3;
    }

    @ObfuscatedName("ae.j(IIII)V")
    public void method338(int arg0, int arg1, int arg2) {
        if (this.field494 == null) {
            return;
        }
        if (this.field485 * 64 == arg2) {
            this.field494.method4730(arg0, arg1);
        } else {
            this.field494.method4713(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ae.h(Lk;Ljava/util/List;I)V")
    public void method339(class23 arg0, List arg1) {
        this.field496.clear();
        this.field489 = arg0;
        this.method341(0, 0, 64, 64, this.field489);
        this.method354(arg1);
    }

    @ObfuscatedName("ae.f(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method340(HashSet arg0, List arg1) {
        this.field496.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method221() == this.field501 && var4.method225() == this.field487) {
                this.field492.add(var4);
                this.method341(var4.method589() * 8, var4.method577() * 8, 8, 8, var4);
            }
        }
        this.method354(arg1);
    }

    @ObfuscatedName("ae.p(IIIILan;I)V")
    public void method341(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class214 var8 = new class214(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field416; var9++) {
                    class32[] var10 = arg4.field421[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class244 var14 = this.method459(var13.field455);
                            if (var14 != null) {
                                class214 var15 = new class214(var9, this.field501 * 64 + var6, this.field487 * 64 + var7);
                                Object var16 = null;
                                class214 var17;
                                if (this.field489 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class214(var18.field415 + var9, var18.field417 * 64 + var6 + var18.method580() * 8, var18.field412 * 64 + var7 + var18.method581() * 8);
                                } else {
                                    var17 = new class214(this.field489.field415 + var9, this.field489.field417 * 64 + var6, this.field489.field412 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3288, var17, var15, this.method386(var14));
                                this.field496.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.x(Ljava/util/List;B)V")
    public void method354(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field385.field2609 >> 6 == this.field501 && var3.field385.field2611 >> 6 == this.field487) {
                class40 var4 = new class40(var3.field383, var3.field385, var3.field385, this.method372(var3.field383));
                this.field488.add(var4);
            }
        }
    }

    @ObfuscatedName("ae.g(ILaw;[Lae;[Ljr;S)Z")
    public boolean method343(int arg0, class47 arg1, class35[] arg2, class286[] arg3) {
        if (!this.method346(arg0)) {
            return false;
        } else if (this.field489 == null && this.field492.isEmpty()) {
            return false;
        } else {
            this.method409(arg2);
            this.field494.method4715();
            if (this.field489 == null) {
                this.method401(arg1, arg3);
            } else {
                this.method347(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ae.c(IIILjava/util/HashSet;B)V")
    public void method425(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method360(arg0, arg1, arg3, arg2);
        this.method366(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ae.l(Ljava/util/HashSet;IIB)V")
    public void method345(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field496.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field545)) {
                class244 var6 = Statics.field3285[var5.field545];
                this.method344(var6, var5.field537, var5.field544, arg1, arg2);
            }
        }
        this.method361(arg0, arg1, arg2);
    }

    @ObfuscatedName("ae.w(IB)Z")
    public boolean method346(int arg0) {
        if (this.field494 != null && this.field485 == arg0) {
            return false;
        } else {
            this.field485 = arg0;
            this.field494 = new class287(this.field485 * 64, this.field485 * 64);
            return true;
        }
    }

    @ObfuscatedName("ae.b(Law;[Lae;[Ljr;B)V")
    public void method347(class47 arg0, class35[] arg1, class286[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method350(var4, var5, this.field489, arg0);
                this.method415(var4, var5, this.field489, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method432(var6, var7, this.field489, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ae.o(Law;[Ljr;B)V")
    public void method401(class47 arg0, class286[] arg1) {
        Iterator var3 = this.field492.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method589() * 8; var5 < var4.method589() * 8 + 8; var5++) {
                for (int var6 = var4.method577() * 8; var6 < var4.method577() * 8 + 8; var6++) {
                    this.method350(var5, var6, var4, arg0);
                    this.method415(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field492.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method589() * 8; var9 < var8.method589() * 8 + 8; var9++) {
                for (int var10 = var8.method577() * 8; var10 < var8.method577() * 8 + 8; var10++) {
                    this.method432(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ae.m(IILan;Law;[Ljr;I)V")
    public void method432(int arg0, int arg1, class29 arg2, class47 arg3, class286[] arg4) {
        this.method359(arg0, arg1, arg2);
        this.method358(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ae.e(IILan;Law;S)V")
    public void method350(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field420[0][arg0][arg1] - 1;
        int var6 = arg2.field418[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class283.method4601(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, this.field485, this.field491);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            int var8 = this.field491;
            class261 var9 = class261.method4305(var6);
            int var10;
            if (var9 == null) {
                var10 = var8;
            } else if (var9.field3581 >= 0) {
                var10 = var9.field3581 | 0xFF000000;
            } else if (var9.field3587 >= 0) {
                int var11 = class38.method1028(Statics.field2038.method2186(var9.field3587), 96);
                var10 = class138.field2036[var11] | 0xFF000000;
            } else if (var9.field3582 == 16711935) {
                var10 = var8;
            } else {
                int var12 = var9.field3577;
                int var13 = var9.field3583;
                int var14 = var9.field3584;
                if (var14 > 179) {
                    var13 /= 2;
                }
                if (var14 > 192) {
                    var13 /= 2;
                }
                if (var14 > 217) {
                    var13 /= 2;
                }
                if (var14 > 243) {
                    var13 /= 2;
                }
                int var15 = var14 / 2 + (var12 / 4 << 10) + (var13 / 32 << 7);
                int var18 = class38.method1028(var15, 96);
                var10 = class138.field2036[var18] | 0xFF000000;
            }
            var7 = var10;
        }
        if (var6 > -1 && arg2.field413[0][arg0][arg1] == 0) {
            class283.method4601(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, this.field485, var7);
            return;
        }
        int var19 = this.method416(arg0, arg1, arg2);
        if (var6 == -1) {
            class283.method4601(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, this.field485, var19);
        } else {
            arg3.method605(this.field485 * arg0, this.field485 * (63 - arg1), var19, var7, this.field485, this.field485, arg2.field413[0][arg0][arg1], arg2.field424[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ae.a(IILan;Law;B)V")
    public void method415(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field416; var5++) {
            int var6 = arg2.field418[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method1032(var6, this.field491);
                if (arg2.field413[var5][arg0][arg1] == 0) {
                    class283.method4601(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, this.field485, var7);
                } else {
                    arg3.method605(this.field485 * arg0, this.field485 * (63 - arg1), 0, var7, this.field485, this.field485, arg2.field413[var5][arg0][arg1], arg2.field424[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ae.v([Lae;B)Z")
    public boolean method409(class35[] arg0) {
        if (this.field493 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field489 == null) {
            Iterator var3 = this.field492.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method351(var4.method589() * 8, var4.method577() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method351(0, 0, 64, 64, this.field489, var2);
        }
        this.method400(arg0, var2);
        this.method353(var2);
        return true;
    }

    @ObfuscatedName("ae.t(Lap;I)V")
    public void method353(class44 arg0) {
        this.field493 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field493[var2][var3] = arg0.method556(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ae.y([Lae;Lap;I)V")
    public void method400(class35[] arg0, class44 arg1) {
        class230[] var3 = new class230[] { class230.field3154, class230.field3146, class230.field3144, class230.field3148, class230.field3149, class230.field3151, class230.field3147, class230.field3145 };
        class230[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class230 var7 = var5[var6];
            if (arg0[var7.method9()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3150) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 2:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 4:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                }
                this.method356(var12, var13, var8, var9, var10, var11, arg0[var7.method9()], arg1);
            }
        }
    }

    @ObfuscatedName("ae.u(IIIILan;Lap;I)V")
    public void method351(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field420[0][var7][var8] - 1;
                if (var9 != -1) {
                    class248 var10 = class248.method960(var9);
                    arg5.method559(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ae.n(IIIIIILae;Lap;I)V")
    public void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method464(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class248 var12 = class248.method960(var11);
                    arg7.method559(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ae.d(IILan;I)I")
    public int method416(int arg0, int arg1, class29 arg2) {
        return arg2.field420[0][arg0][arg1] == 0 ? this.field491 : this.field493[arg0][arg1];
    }

    @ObfuscatedName("ae.ax(IILan;[Ljr;I)V")
    public void method358(int arg0, int arg1, class29 arg2, class286[] arg3) {
        for (int var5 = 0; var5 < arg2.field416; var5++) {
            class32[] var6 = arg2.field421[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class223.method254(var9.field452)) {
                        int var10 = var9.field452;
                        boolean var11 = class223.field2831.field2811 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class257 var12 = class257.method483(var9.field455);
                    if (var12.field3456 != -1) {
                        if (var12.field3456 == 46 || var12.field3456 == 52) {
                            arg3[var12.field3456].method4683(this.field485 * arg0, this.field485 * (63 - arg1), this.field485 * 2 + 1, this.field485 * 2 + 1);
                        } else {
                            arg3[var12.field3456].method4683(this.field485 * arg0, this.field485 * (63 - arg1), this.field485 * 2, this.field485 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.ao(IILan;B)V")
    public void method359(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field416; var4++) {
            class32[] var5 = arg2.field421[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class223.method3581(var8.field452)) {
                        class257 var9 = class257.method483(var8.field455);
                        int var10 = var9.field3446 == 0 ? -3355444 : -3407872;
                        if (class223.field2809.field2811 == var8.field452) {
                            this.method437(arg0, arg1, var8.field453, var10);
                        }
                        if (class223.field2815.field2811 == var8.field452) {
                            this.method437(arg0, arg1, var8.field453, -3355444);
                            this.method437(arg0, arg1, var8.field453 + 1, var10);
                        }
                        if (class223.field2823.field2811 == var8.field452) {
                            if (var8.field453 == 0) {
                                class283.method4618(this.field485 * arg0, this.field485 * (63 - arg1), 1, var10);
                            }
                            if (var8.field453 == 1) {
                                class283.method4618(this.field485 * arg0 + this.field485 - 1, this.field485 * (63 - arg1), 1, var10);
                            }
                            if (var8.field453 == 2) {
                                class283.method4618(this.field485 * arg0 + this.field485 - 1, this.field485 * (63 - arg1) + this.field485 - 1, 1, var10);
                            }
                            if (var8.field453 == 3) {
                                class283.method4618(this.field485 * arg0, this.field485 * (63 - arg1) + this.field485 - 1, 1, var10);
                            }
                        }
                        if (class223.field2813.field2811 == var8.field452) {
                            int var11 = var8.field453 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field485; var12++) {
                                    class283.method4618(this.field485 * arg0 + var12, this.field485 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field485; var13++) {
                                    class283.method4618(this.field485 * arg0 + var13, this.field485 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ae.an(IILjava/util/HashSet;II)V")
    public void method360(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field496.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2609 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2611 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field537 = var10;
                var12.field544 = var11;
                class244 var13 = Statics.field3285[var12.field545];
                if (!arg2.contains(var13.method3975())) {
                    this.method363(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ae.ar(Ljava/util/HashSet;III)V")
    public void method361(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field488.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class244 var6 = Statics.field3285[var5.field545];
            if (var6 != null && arg0.contains(var6.method3975())) {
                this.method344(var6, var5.field537, var5.field544, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ae.ag(Lie;IIIII)V")
    public void method344(class244 arg0, int arg1, int arg2, int arg3, int arg4) {
        class287 var6 = arg0.method3953(false);
        if (var6 == null) {
            return;
        }
        var6.method4795(arg1 - var6.field3769 / 2, arg2 - var6.field3773 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class283.method4599(arg1, arg2, 15, 16776960, 128);
            class283.method4599(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ae.av(Laz;IIFI)V")
    public void method363(class40 arg0, int arg1, int arg2, float arg3) {
        class244 var5 = Statics.field3285[arg0.field545];
        this.method364(var5, arg1, arg2);
        this.method382(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ae.ab(Lie;III)V")
    public void method364(class244 arg0, int arg1, int arg2) {
        class287 var4 = arg0.method3953(false);
        if (var4 != null) {
            int var5 = this.method369(var4, arg0.field3294);
            int var6 = this.method370(var4, arg0.field3292);
            var4.method4795(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ae.aj(Laz;Lie;IIFI)V")
    public void method382(class40 arg0, class244 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field542 != null && arg0.field542.field481.method175(arg4)) {
            class265 var6 = (class265) this.field497.get(arg0.field542.field481);
            var6.method4424(arg0.field542.field484, arg2 - arg0.field542.field478 / 2, arg3, arg0.field542.field478, arg0.field542.field480, 0xFF000000 | arg1.field3284, 0, 1, 0, var6.field3632 / 2);
        }
    }

    @ObfuscatedName("ae.ae(IILjava/util/HashSet;IB)V")
    public void method366(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field488.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field543.field2609 % 64;
            int var9 = var7.field543.field2611 % 64;
            var7.field537 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field544 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field545)) {
                this.method363(var7, var7.field537, var7.field544, var5);
            }
        }
    }

    @ObfuscatedName("ae.at(S)V")
    public void method367() {
        if (this.field489 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method405(var1, var2, this.field489);
                }
            }
            return;
        }
        Iterator var3 = this.field492.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method589() * 8; var5 < var4.method589() * 8 + 8; var5++) {
                for (int var6 = var4.method577() * 8; var6 < var4.method577() * 8 + 8; var6++) {
                    this.method405(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ae.as(IILan;I)V")
    public void method405(int arg0, int arg1, class29 arg2) {
        field498.method3620(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field416; var4++) {
            class32[] var5 = arg2.field421[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class244 var9 = this.method459(var8.field455);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field496.get(field498);
                        if (var10 != null) {
                            if (var9.field3288 != var10.field545) {
                                class40 var11 = new class40(var9.field3288, var10.field538, var10.field543, this.method386(var9));
                                this.field496.put(new class214(field498), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field538.field2610 - var10.field543.field2610;
                            var10.field543.field2610 = var4;
                            var10.field538.field2610 = var4 + var12;
                            return;
                        }
                        class214 var13 = new class214(var4, this.field501 * 64 + arg0, this.field487 * 64 + arg1);
                        class214 var14 = null;
                        if (this.field489 == null) {
                            Iterator var15 = this.field492.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method579(arg0, arg1)) {
                                    var14 = new class214(var16.field415 + var4, var16.field417 * 64 + arg0 + var16.method580() * 8, var16.field412 * 64 + arg1 + var16.method581() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class214(this.field489.field415 + var4, this.field489.field417 * 64 + arg0, this.field489.field412 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3288, var14, var13, this.method386(var9));
                            this.field496.put(new class214(field498), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field496.remove(field498);
    }

    @ObfuscatedName("ae.af(Lkp;Liq;B)I")
    public int method369(class287 arg0, class259 arg1) {
        switch(arg1.field3533) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3769 / 2;
            default:
                return -arg0.field3769;
        }
    }

    @ObfuscatedName("ae.au(Lkp;Lis;I)I")
    public int method370(class287 arg0, class241 arg1) {
        switch(arg1.field3261) {
            case 0:
                return -arg0.field3773 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3773;
        }
    }

    @ObfuscatedName("ae.az(II)Lie;")
    public class244 method459(int arg0) {
        class257 var2 = class257.method483(arg0);
        if (var2.field3468 != null) {
            var2 = var2.method4210();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3455 == -1 ? null : Statics.field3285[var2.field3455];
    }

    @ObfuscatedName("ae.al(IB)Laj;")
    public class34 method372(int arg0) {
        class244 var2 = Statics.field3285[arg0];
        return this.method386(var2);
    }

    @ObfuscatedName("ae.am(Lie;I)Laj;")
    public class34 method386(class244 arg0) {
        if (arg0.field3280 == null || this.field497 == null || this.field497.get(class25.field370) == null) {
            return null;
        }
        class25 var2 = class25.method179(arg0.field3282);
        if (var2 == null) {
            return null;
        }
        class265 var3 = (class265) this.field497.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4418(arg0.field3280, 1000000);
        String[] var5 = new String[var4];
        var3.method4416(arg0.field3280, (int[]) null, var5);
        int var6 = var5.length * var3.field3632 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4415(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class34(arg0.field3280, var7, var6, var2);
    }

    @ObfuscatedName("ae.ah(IIIIIB)Ljava/util/List;")
    public List method374(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field496.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method503(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field488.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method503(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ae.ap(I)Ljava/util/List;")
    public List method375() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field488);
        var1.addAll(this.field496.values());
        return var1;
    }

    @ObfuscatedName("ae.ad(IIIII)V")
    public void method437(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class283.method4612(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, arg3);
        }
        if (var5 == 1) {
            class283.method4618(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, arg3);
        }
        if (var5 == 2) {
            class283.method4612(this.field485 * arg0 + this.field485 - 1, this.field485 * (63 - arg1), this.field485, arg3);
        }
        if (var5 == 3) {
            class283.method4618(this.field485 * arg0, this.field485 * (63 - arg1) + this.field485 - 1, this.field485, arg3);
        }
    }

    @ObfuscatedName("ae.aa(III)I")
    public int method464(int arg0, int arg1) {
        if (this.field489 != null) {
            return this.field489.method224(arg0, arg1);
        }
        if (!this.field492.isEmpty()) {
            Iterator var3 = this.field492.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method579(arg0, arg1)) {
                    return var4.method224(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
