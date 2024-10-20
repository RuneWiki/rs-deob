package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("at")
public class class35 {

    @ObfuscatedName("at.r")
    public int field486;

    @ObfuscatedName("at.o")
    public int field501;

    @ObfuscatedName("at.n")
    public class23 field488;

    @ObfuscatedName("at.q")
    public LinkedList field489;

    @ObfuscatedName("at.b")
    public int field490;

    @ObfuscatedName("at.k")
    public int field491;

    @ObfuscatedName("at.s")
    public int[][] field492;

    @ObfuscatedName("at.d")
    public class287 field493;

    @ObfuscatedName("at.l")
    public List field494;

    @ObfuscatedName("at.t")
    public HashMap field495;

    @ObfuscatedName("at.y")
    public final HashMap field496;

    @ObfuscatedName("at.v")
    public static final class214 field497 = new class214();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field486 = arg0;
        this.field501 = arg1;
        this.field489 = new LinkedList();
        this.field494 = new LinkedList();
        this.field495 = new HashMap();
        this.field490 = arg2 | 0xFF000000;
        this.field496 = arg3;
    }

    @ObfuscatedName("at.i(IIII)V")
    public void method374(int arg0, int arg1, int arg2) {
        if (this.field493 == null) {
            return;
        }
        if (this.field491 * 64 == arg2) {
            this.field493.method4671(arg0, arg1);
        } else {
            this.field493.method4683(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("at.j(Lh;Ljava/util/List;I)V")
    public void method345(class23 arg0, List arg1) {
        this.field495.clear();
        this.field488 = arg0;
        this.method347(0, 0, 64, 64, this.field488);
        this.method409(arg1);
    }

    @ObfuscatedName("at.a(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method371(HashSet arg0, List arg1) {
        this.field495.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method233() == this.field486 && var4.method239() == this.field501) {
                this.field489.add(var4);
                this.method347(var4.method591() * 8, var4.method588() * 8, 8, 8, var4);
            }
        }
        this.method409(arg1);
    }

    @ObfuscatedName("at.r(IIIILal;S)V")
    public void method347(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class214 var8 = new class214(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field420; var9++) {
                    class32[] var10 = arg4.field425[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class244 var14 = this.method349(var13.field451);
                            if (var14 != null) {
                                class214 var15 = new class214(var9, this.field486 * 64 + var6, this.field501 * 64 + var7);
                                Object var16 = null;
                                class214 var17;
                                if (this.field488 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class214(var18.field423 + var9, var18.field416 * 64 + var6 + var18.method585() * 8, var18.field417 * 64 + var7 + var18.method597() * 8);
                                } else {
                                    var17 = new class214(this.field488.field423 + var9, this.field488.field416 * 64 + var6, this.field488.field417 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3297, var17, var15, this.method419(var14));
                                this.field495.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.o(Ljava/util/List;B)V")
    public void method409(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field379.field2617 >> 6 == this.field486 && var3.field379.field2619 >> 6 == this.field501) {
                class40 var4 = new class40(var3.field382, var3.field379, var3.field379, this.method386(var3.field382));
                this.field494.add(var4);
            }
        }
    }

    @ObfuscatedName("at.n(ILak;[Lat;[Ljx;I)Z")
    public boolean method413(int arg0, class47 arg1, class35[] arg2, class286[] arg3) {
        if (!this.method352(arg0)) {
            return false;
        } else if (this.field488 == null && this.field489.isEmpty()) {
            return false;
        } else {
            this.method431(arg2);
            this.field493.method4664();
            if (this.field488 == null) {
                this.method354(arg1, arg3);
            } else {
                this.method353(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("at.q(IIILjava/util/HashSet;I)V")
    public void method350(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method366(arg0, arg1, arg3, arg2);
        this.method372(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("at.b(Ljava/util/HashSet;III)V")
    public void method398(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field495.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field544)) {
                class244 var6 = Statics.field3295[var5.field544];
                this.method368(var6, var5.field542, var5.field549, arg1, arg2);
            }
        }
        this.method384(arg0, arg1, arg2);
    }

    @ObfuscatedName("at.k(II)Z")
    public boolean method352(int arg0) {
        if (this.field493 != null && this.field491 == arg0) {
            return false;
        } else {
            this.field491 = arg0;
            this.field493 = new class287(this.field491 * 64, this.field491 * 64);
            return true;
        }
    }

    @ObfuscatedName("at.s(Lak;[Lat;[Ljx;I)V")
    public void method353(class47 arg0, class35[] arg1, class286[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method447(var4, var5, this.field488, arg0);
                this.method416(var4, var5, this.field488, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method387(var6, var7, this.field488, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("at.d(Lak;[Ljx;I)V")
    public void method354(class47 arg0, class286[] arg1) {
        Iterator var3 = this.field489.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method591() * 8; var5 < var4.method591() * 8 + 8; var5++) {
                for (int var6 = var4.method588() * 8; var6 < var4.method588() * 8 + 8; var6++) {
                    this.method447(var5, var6, var4, arg0);
                    this.method416(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field489.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method591() * 8; var9 < var8.method591() * 8 + 8; var9++) {
                for (int var10 = var8.method588() * 8; var10 < var8.method588() * 8 + 8; var10++) {
                    this.method387(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("at.l(IILal;Lak;[Ljx;B)V")
    public void method387(int arg0, int arg1, class29 arg2, class47 arg3, class286[] arg4) {
        this.method474(arg0, arg1, arg2);
        this.method399(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("at.c(IILal;Lak;I)V")
    public void method447(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field421[0][arg0][arg1] - 1;
        int var6 = arg2.field419[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class283.method4557(this.field491 * arg0, this.field491 * (63 - arg1), this.field491, this.field491, this.field490);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method262(var6, this.field490);
        }
        if (var6 > -1 && arg2.field422[0][arg0][arg1] == 0) {
            class283.method4557(this.field491 * arg0, this.field491 * (63 - arg1), this.field491, this.field491, var7);
            return;
        }
        int var8 = this.method363(arg0, arg1, arg2);
        if (var6 == -1) {
            class283.method4557(this.field491 * arg0, this.field491 * (63 - arg1), this.field491, this.field491, var8);
        } else {
            arg3.method610(this.field491 * arg0, this.field491 * (63 - arg1), var8, var7, this.field491, this.field491, arg2.field422[0][arg0][arg1], arg2.field424[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("at.u(IILal;Lak;I)V")
    public void method416(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field420; var5++) {
            int var6 = arg2.field419[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method262(var6, this.field490);
                if (arg2.field422[var5][arg0][arg1] == 0) {
                    class283.method4557(this.field491 * arg0, this.field491 * (63 - arg1), this.field491, this.field491, var7);
                } else {
                    arg3.method610(this.field491 * arg0, this.field491 * (63 - arg1), 0, var7, this.field491, this.field491, arg2.field422[var5][arg0][arg1], arg2.field424[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("at.e([Lat;I)Z")
    public boolean method431(class35[] arg0) {
        if (this.field492 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field488 == null) {
            Iterator var3 = this.field489.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method361(var4.method591() * 8, var4.method588() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method361(0, 0, 64, 64, this.field488, var2);
        }
        this.method343(arg0, var2);
        this.method359(var2);
        return true;
    }

    @ObfuscatedName("at.p(Lah;I)V")
    public void method359(class44 arg0) {
        this.field492 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field492[var2][var3] = arg0.method556(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("at.m([Lat;Lah;I)V")
    public void method343(class35[] arg0, class44 arg1) {
        class230[] var3 = new class230[] { class230.field3155, class230.field3159, class230.field3154, class230.field3160, class230.field3156, class230.field3161, class230.field3163, class230.field3157 };
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
                switch(var7.field3162) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 2:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 4:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 6:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                }
                this.method362(var12, var13, var8, var9, var10, var11, arg0[var7.method6()], arg1);
            }
        }
    }

    @ObfuscatedName("at.x(IIIILal;Lah;I)V")
    public void method361(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field421[0][var7][var8] - 1;
                if (var9 != -1) {
                    class248 var10 = class248.method1638(var9);
                    arg5.method565(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("at.g(IIIIIILat;Lah;I)V")
    public void method362(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method383(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class248 var12 = class248.method1638(var11);
                    arg7.method565(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("at.w(IILal;S)I")
    public int method363(int arg0, int arg1, class29 arg2) {
        return arg2.field421[0][arg0][arg1] == 0 ? this.field490 : this.field492[arg0][arg1];
    }

    @ObfuscatedName("at.ar(IILal;[Ljx;I)V")
    public void method399(int arg0, int arg1, class29 arg2, class286[] arg3) {
        for (int var5 = 0; var5 < arg2.field420; var5++) {
            class32[] var6 = arg2.field425[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class223.method182(var9.field449)) {
                        int var10 = var9.field449;
                        boolean var11 = class223.field2842.field2843 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class257 var12 = class257.method2716(var9.field451);
                    if (var12.field3477 != -1) {
                        if (var12.field3477 == 46 || var12.field3477 == 52) {
                            arg3[var12.field3477].method4651(this.field491 * arg0, this.field491 * (63 - arg1), this.field491 * 2 + 1, this.field491 * 2 + 1);
                        } else {
                            arg3[var12.field3477].method4651(this.field491 * arg0, this.field491 * (63 - arg1), this.field491 * 2, this.field491 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.ax(IILal;I)V")
    public void method474(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field420; var4++) {
            class32[] var5 = arg2.field425[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class223.method2830(var8.field449)) {
                        class257 var9 = class257.method2716(var8.field451);
                        int var10 = var9.field3455 == 0 ? -3355444 : -3407872;
                        if (class223.field2820.field2843 == var8.field449) {
                            this.method382(arg0, arg1, var8.field450, var10);
                        }
                        if (class223.field2822.field2843 == var8.field449) {
                            this.method382(arg0, arg1, var8.field450, -3355444);
                            this.method382(arg0, arg1, var8.field450 + 1, var10);
                        }
                        if (class223.field2831.field2843 == var8.field449) {
                            if (var8.field450 == 0) {
                                class283.method4551(this.field491 * arg0, this.field491 * (63 - arg1), 1, var10);
                            }
                            if (var8.field450 == 1) {
                                class283.method4551(this.field491 * arg0 + this.field491 - 1, this.field491 * (63 - arg1), 1, var10);
                            }
                            if (var8.field450 == 2) {
                                class283.method4551(this.field491 * arg0 + this.field491 - 1, this.field491 * (63 - arg1) + this.field491 - 1, 1, var10);
                            }
                            if (var8.field450 == 3) {
                                class283.method4551(this.field491 * arg0, this.field491 * (63 - arg1) + this.field491 - 1, 1, var10);
                            }
                        }
                        if (class223.field2838.field2843 == var8.field449) {
                            int var11 = var8.field450 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field491; var12++) {
                                    class283.method4551(this.field491 * arg0 + var12, this.field491 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field491; var13++) {
                                    class283.method4551(this.field491 * arg0 + var13, this.field491 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("at.al(IILjava/util/HashSet;IB)V")
    public void method366(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field495.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class214 var9 = (class214) var8.getKey();
            int var10 = (int) ((float) var9.field2617 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2619 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field542 = var10;
                var12.field549 = var11;
                class244 var13 = Statics.field3295[var12.field544];
                if (!arg2.contains(var13.method3973())) {
                    this.method472(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("at.ag(Ljava/util/HashSet;III)V")
    public void method384(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field494.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class244 var6 = Statics.field3295[var5.field544];
            if (var6 != null && arg0.contains(var6.method3973())) {
                this.method368(var6, var5.field542, var5.field549, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("at.ad(Lig;IIIIB)V")
    public void method368(class244 arg0, int arg1, int arg2, int arg3, int arg4) {
        class287 var6 = arg0.method3980(false);
        if (var6 == null) {
            return;
        }
        var6.method4673(arg1 - var6.field3785 / 2, arg2 - var6.field3790 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class283.method4555(arg1, arg2, 15, 16776960, 128);
            class283.method4555(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("at.ab(Lay;IIFB)V")
    public void method472(class40 arg0, int arg1, int arg2, float arg3) {
        class244 var5 = Statics.field3295[arg0.field544];
        this.method370(var5, arg1, arg2);
        this.method424(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("at.am(Lig;III)V")
    public void method370(class244 arg0, int arg1, int arg2) {
        class287 var4 = arg0.method3980(false);
        if (var4 != null) {
            int var5 = this.method375(var4, arg0.field3310);
            int var6 = this.method376(var4, arg0.field3313);
            var4.method4673(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("at.aq(Lay;Lig;IIFB)V")
    public void method424(class40 arg0, class244 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field547 != null && arg0.field547.field475.method185(arg4)) {
            class265 var6 = (class265) this.field496.get(arg0.field547.field475);
            var6.method4456(arg0.field547.field476, arg2 - arg0.field547.field479 / 2, arg3, arg0.field547.field479, arg0.field547.field477, 0xFF000000 | arg1.field3301, 0, 1, 0, var6.field3637 / 2);
        }
    }

    @ObfuscatedName("at.at(IILjava/util/HashSet;II)V")
    public void method372(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field494.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field553.field2617 % 64;
            int var9 = var7.field553.field2619 % 64;
            var7.field542 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field549 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field544)) {
                this.method472(var7, var7.field542, var7.field549, var5);
            }
        }
    }

    @ObfuscatedName("at.az(I)V")
    public void method373() {
        if (this.field488 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method466(var1, var2, this.field488);
                }
            }
            return;
        }
        Iterator var3 = this.field489.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method591() * 8; var5 < var4.method591() * 8 + 8; var5++) {
                for (int var6 = var4.method588() * 8; var6 < var4.method588() * 8 + 8; var6++) {
                    this.method466(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("at.ac(IILal;I)V")
    public void method466(int arg0, int arg1, class29 arg2) {
        field497.method3681(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field420; var4++) {
            class32[] var5 = arg2.field425[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class244 var9 = this.method349(var8.field451);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field495.get(field497);
                        if (var10 != null) {
                            if (var9.field3297 != var10.field544) {
                                class40 var11 = new class40(var9.field3297, var10.field543, var10.field553, this.method419(var9));
                                this.field495.put(new class214(field497), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field543.field2618 - var10.field553.field2618;
                            var10.field553.field2618 = var4;
                            var10.field543.field2618 = var4 + var12;
                            return;
                        }
                        class214 var13 = new class214(var4, this.field486 * 64 + arg0, this.field501 * 64 + arg1);
                        class214 var14 = null;
                        if (this.field488 == null) {
                            Iterator var15 = this.field489.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method583(arg0, arg1)) {
                                    var14 = new class214(var16.field423 + var4, var16.field416 * 64 + arg0 + var16.method585() * 8, var16.field417 * 64 + arg1 + var16.method597() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class214(this.field488.field423 + var4, this.field488.field416 * 64 + arg0, this.field488.field417 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3297, var14, var13, this.method419(var9));
                            this.field495.put(new class214(field497), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field495.remove(field497);
    }

    @ObfuscatedName("at.aa(Lkd;Lia;S)I")
    public int method375(class287 arg0, class259 arg1) {
        switch(arg1.field3543) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3785 / 2;
            default:
                return -arg0.field3785;
        }
    }

    @ObfuscatedName("at.aj(Lkd;Lio;I)I")
    public int method376(class287 arg0, class241 arg1) {
        switch(arg1.field3277) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3790 / 2;
            default:
                return -arg0.field3790;
        }
    }

    @ObfuscatedName("at.ay(II)Lig;")
    public class244 method349(int arg0) {
        class257 var2 = class257.method2716(arg0);
        if (var2.field3476 != null) {
            var2 = var2.method4204();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3464 == -1 ? null : Statics.field3295[var2.field3464];
    }

    @ObfuscatedName("at.av(II)Laq;")
    public class34 method386(int arg0) {
        class244 var2 = Statics.field3295[arg0];
        return this.method419(var2);
    }

    @ObfuscatedName("at.ao(Lig;I)Laq;")
    public class34 method419(class244 arg0) {
        if (arg0.field3300 == null || this.field496 == null || this.field496.get(class25.field371) == null) {
            return null;
        }
        int var2 = arg0.field3302;
        class25[] var3 = class25.method190();
        int var4 = 0;
        class25 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class25 var5 = var3[var4];
            if (var5.field369 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class265 var8 = (class265) this.field496.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method4461(arg0.field3300, 1000000);
        String[] var10 = new String[var9];
        var8.method4436(arg0.field3300, (int[]) null, var10);
        int var11 = var10.length * var8.field3637 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4442(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class34(arg0.field3300, var12, var11, var6);
    }

    @ObfuscatedName("at.aw(IIIIIB)Ljava/util/List;")
    public List method380(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field495.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method494(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field494.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method494(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("at.ah(I)Ljava/util/List;")
    public List method381() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field494);
        var1.addAll(this.field495.values());
        return var1;
    }

    @ObfuscatedName("at.an(IIIII)V")
    public void method382(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class283.method4571(this.field491 * arg0, this.field491 * (63 - arg1), this.field491, arg3);
        }
        if (var5 == 1) {
            class283.method4551(this.field491 * arg0, this.field491 * (63 - arg1), this.field491, arg3);
        }
        if (var5 == 2) {
            class283.method4571(this.field491 * arg0 + this.field491 - 1, this.field491 * (63 - arg1), this.field491, arg3);
        }
        if (var5 == 3) {
            class283.method4551(this.field491 * arg0, this.field491 * (63 - arg1) + this.field491 - 1, this.field491, arg3);
        }
    }

    @ObfuscatedName("at.af(III)I")
    public int method383(int arg0, int arg1) {
        if (this.field488 != null) {
            return this.field488.method237(arg0, arg1);
        }
        if (!this.field489.isEmpty()) {
            Iterator var3 = this.field489.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method583(arg0, arg1)) {
                    return var4.method237(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
