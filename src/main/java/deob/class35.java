package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ad")
public class class35 {

    @ObfuscatedName("ad.q")
    public int field476;

    @ObfuscatedName("ad.g")
    public int field477;

    @ObfuscatedName("ad.v")
    public class23 field478;

    @ObfuscatedName("ad.t")
    public LinkedList field479;

    @ObfuscatedName("ad.p")
    public int field473;

    @ObfuscatedName("ad.l")
    public int field489;

    @ObfuscatedName("ad.a")
    public int[][] field481;

    @ObfuscatedName("ad.k")
    public class286 field480;

    @ObfuscatedName("ad.r")
    public List field484;

    @ObfuscatedName("ad.b")
    public HashMap field485;

    @ObfuscatedName("ad.x")
    public final HashMap field482;

    @ObfuscatedName("ad.o")
    public static final class213 field487 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field476 = arg0;
        this.field477 = arg1;
        this.field479 = new LinkedList();
        this.field484 = new LinkedList();
        this.field485 = new HashMap();
        this.field473 = arg2 | 0xFF000000;
        this.field482 = arg3;
    }

    @ObfuscatedName("ad.i(IIII)V")
    public void method325(int arg0, int arg1, int arg2) {
        if (this.field480 == null) {
            return;
        }
        if (this.field489 * 64 == arg2) {
            this.field480.method4754(arg0, arg1);
        } else {
            this.field480.method4771(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ad.h(Lw;Ljava/util/List;I)V")
    public void method366(class23 arg0, List arg1) {
        this.field485.clear();
        this.field478 = arg0;
        this.method381(0, 0, 64, 64, this.field478);
        this.method434(arg1);
    }

    @ObfuscatedName("ad.u(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method327(HashSet arg0, List arg1) {
        this.field485.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method209() == this.field476 && var4.method210() == this.field477) {
                this.field479.add(var4);
                this.method381(var4.method585() * 8, var4.method586() * 8, 8, 8, var4);
            }
        }
        this.method434(arg1);
    }

    @ObfuscatedName("ad.q(IIIILaz;I)V")
    public void method381(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field409; var9++) {
                    class32[] var10 = arg4.field414[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method382(var13.field446);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field476 * 64 + var6, this.field477 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field478 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field411 + var9, var18.field410 * 64 + var6 + var18.method583() * 8, var18.field405 * 64 + var7 + var18.method584() * 8);
                                } else {
                                    var17 = new class213(this.field478.field411 + var9, this.field478.field410 * 64 + var6, this.field478.field405 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3280, var17, var15, this.method359(var14));
                                this.field485.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.g(Ljava/util/List;B)V")
    public void method434(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field372.field2601 >> 6 == this.field476 && var3.field372.field2602 >> 6 == this.field477) {
                class40 var4 = new class40(var3.field376, var3.field372, var3.field372, this.method358(var3.field376));
                this.field484.add(var4);
            }
        }
    }

    @ObfuscatedName("ad.v(ILal;[Lad;[Ljp;I)Z")
    public boolean method405(int arg0, class47 arg1, class35[] arg2, class285[] arg3) {
        if (!this.method435(arg0)) {
            return false;
        } else if (this.field478 == null && this.field479.isEmpty()) {
            return false;
        } else {
            this.method340(arg2);
            this.field480.method4823();
            if (this.field478 == null) {
                this.method335(arg1, arg3);
            } else {
                this.method334(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ad.t(IIILjava/util/HashSet;I)V")
    public void method331(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method347(arg0, arg1, arg3, arg2);
        this.method367(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ad.p(Ljava/util/HashSet;III)V")
    public void method391(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field485.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field527)) {
                class243 var6 = Statics.field3277[var5.field527];
                this.method448(var6, var5.field522, var5.field529, arg1, arg2);
            }
        }
        this.method348(arg0, arg1, arg2);
    }

    @ObfuscatedName("ad.l(IB)Z")
    public boolean method435(int arg0) {
        if (this.field480 != null && this.field489 == arg0) {
            return false;
        } else {
            this.field489 = arg0;
            this.field480 = new class286(this.field489 * 64, this.field489 * 64);
            return true;
        }
    }

    @ObfuscatedName("ad.a(Lal;[Lad;[Ljp;I)V")
    public void method334(class47 arg0, class35[] arg1, class285[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method337(var4, var5, this.field478, arg0);
                this.method338(var4, var5, this.field478, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method336(var6, var7, this.field478, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ad.k(Lal;[Ljp;I)V")
    public void method335(class47 arg0, class285[] arg1) {
        Iterator var3 = this.field479.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method585() * 8; var5 < var4.method585() * 8 + 8; var5++) {
                for (int var6 = var4.method586() * 8; var6 < var4.method586() * 8 + 8; var6++) {
                    this.method337(var5, var6, var4, arg0);
                    this.method338(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field479.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method585() * 8; var9 < var8.method585() * 8 + 8; var9++) {
                for (int var10 = var8.method586() * 8; var10 < var8.method586() * 8 + 8; var10++) {
                    this.method336(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ad.b(IILaz;Lal;[Ljp;I)V")
    public void method336(int arg0, int arg1, class29 arg2, class47 arg3, class285[] arg4) {
        this.method418(arg0, arg1, arg2);
        this.method345(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ad.x(IILaz;Lal;I)V")
    public void method337(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field406[0][arg0][arg1] - 1;
        int var6 = arg2.field404[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class282.method4676(this.field489 * arg0, this.field489 * (63 - arg1), this.field489, this.field489, this.field473);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method2763(var6, this.field473);
        }
        if (var6 > -1 && arg2.field412[0][arg0][arg1] == 0) {
            class282.method4676(this.field489 * arg0, this.field489 * (63 - arg1), this.field489, this.field489, var7);
            return;
        }
        int var8 = this.method344(arg0, arg1, arg2);
        if (var6 == -1) {
            class282.method4676(this.field489 * arg0, this.field489 * (63 - arg1), this.field489, this.field489, var8);
        } else {
            arg3.method615(this.field489 * arg0, this.field489 * (63 - arg1), var8, var7, this.field489, this.field489, arg2.field412[0][arg0][arg1], arg2.field413[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ad.o(IILaz;Lal;I)V")
    public void method338(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field409; var5++) {
            int var6 = arg2.field404[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method2763(var6, this.field473);
                if (arg2.field412[var5][arg0][arg1] == 0) {
                    class282.method4676(this.field489 * arg0, this.field489 * (63 - arg1), this.field489, this.field489, var7);
                } else {
                    arg3.method615(this.field489 * arg0, this.field489 * (63 - arg1), 0, var7, this.field489, this.field489, arg2.field412[var5][arg0][arg1], arg2.field413[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ad.j([Lad;I)Z")
    public boolean method340(class35[] arg0) {
        if (this.field481 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field478 == null) {
            Iterator var3 = this.field479.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method342(var4.method585() * 8, var4.method586() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method342(0, 0, 64, 64, this.field478, var2);
        }
        this.method341(arg0, var2);
        this.method371(var2);
        return true;
    }

    @ObfuscatedName("ad.m(Lap;B)V")
    public void method371(class44 arg0) {
        this.field481 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field481[var2][var3] = arg0.method557(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ad.s([Lad;Lap;S)V")
    public void method341(class35[] arg0, class44 arg1) {
        class229[] var3 = new class229[] { class229.field3146, class229.field3140, class229.field3142, class229.field3143, class229.field3141, class229.field3139, class229.field3144, class229.field3138 };
        class229[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class229 var7 = var5[var6];
            if (arg0[var7.method7()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3145) {
                    case 0:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 1:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 3:
                        var12 = 59;
                        var10 = 5;
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
                this.method343(var12, var13, var8, var9, var10, var11, arg0[var7.method7()], arg1);
            }
        }
    }

    @ObfuscatedName("ad.n(IIIILaz;Lap;I)V")
    public void method342(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field406[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method3983(var9);
                    arg5.method556(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ad.y(IIIIIILad;Lap;I)V")
    public void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method339(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method3983(var11);
                    arg7.method556(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ad.w(IILaz;I)I")
    public int method344(int arg0, int arg1, class29 arg2) {
        return arg2.field406[0][arg0][arg1] == 0 ? this.field473 : this.field481[arg0][arg1];
    }

    @ObfuscatedName("ad.f(IILaz;[Ljp;I)V")
    public void method345(int arg0, int arg1, class29 arg2, class285[] arg3) {
        for (int var5 = 0; var5 < arg2.field409; var5++) {
            class32[] var6 = arg2.field414[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (class222.method2742(var9.field441) || class222.method979(var9.field441)) {
                        class256 var10 = Statics.method564(var9.field446);
                        if (var10.field3459 != -1) {
                            if (var10.field3459 == 46 || var10.field3459 == 52) {
                                arg3[var10.field3459].method4727(this.field489 * arg0, this.field489 * (63 - arg1), this.field489 * 2 + 1, this.field489 * 2 + 1);
                            } else {
                                arg3[var10.field3459].method4727(this.field489 * arg0, this.field489 * (63 - arg1), this.field489 * 2, this.field489 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.c(IILaz;I)V")
    public void method418(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field409; var4++) {
            class32[] var5 = arg2.field414[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field441;
                    boolean var10 = var9 >= class222.field2809.field2827 && var9 <= class222.field2814.field2827 || class222.field2804.field2827 == var9;
                    if (var10) {
                        class256 var11 = Statics.method564(var8.field446);
                        int var12 = var11.field3457 == 0 ? -3355444 : -3407872;
                        if (class222.field2809.field2827 == var8.field441) {
                            this.method422(arg0, arg1, var8.field442, var12);
                        }
                        if (class222.field2806.field2827 == var8.field441) {
                            this.method422(arg0, arg1, var8.field442, -3355444);
                            this.method422(arg0, arg1, var8.field442 + 1, var12);
                        }
                        if (class222.field2814.field2827 == var8.field441) {
                            if (var8.field442 == 0) {
                                class282.method4648(this.field489 * arg0, this.field489 * (63 - arg1), 1, var12);
                            }
                            if (var8.field442 == 1) {
                                class282.method4648(this.field489 * arg0 + this.field489 - 1, this.field489 * (63 - arg1), 1, var12);
                            }
                            if (var8.field442 == 2) {
                                class282.method4648(this.field489 * arg0 + this.field489 - 1, this.field489 * (63 - arg1) + this.field489 - 1, 1, var12);
                            }
                            if (var8.field442 == 3) {
                                class282.method4648(this.field489 * arg0, this.field489 * (63 - arg1) + this.field489 - 1, 1, var12);
                            }
                        }
                        if (class222.field2804.field2827 == var8.field441) {
                            int var13 = var8.field442 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field489; var14++) {
                                    class282.method4648(this.field489 * arg0 + var14, this.field489 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field489; var15++) {
                                    class282.method4648(this.field489 * arg0 + var15, this.field489 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ad.z(IILjava/util/HashSet;II)V")
    public void method347(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field485.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2601 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2602 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field522 = var10;
                var12.field529 = var11;
                class243 var13 = Statics.field3277[var12.field527];
                if (!arg2.contains(var13.method4018())) {
                    this.method350(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ad.ay(Ljava/util/HashSet;III)V")
    public void method348(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field484.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field3277[var5.field527];
            if (var6 != null && arg0.contains(var6.method4018())) {
                this.method448(var6, var5.field522, var5.field529, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ad.ah(Lib;IIIII)V")
    public void method448(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var6 = arg0.method4014(false);
        if (var6 == null) {
            return;
        }
        var6.method4831(arg1 - var6.field3777 / 2, arg2 - var6.field3774 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class282.method4638(arg1, arg2, 15, 16776960, 128);
            class282.method4638(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ad.az(Lat;IIFI)V")
    public void method350(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field3277[arg0.field527];
        this.method351(var5, arg1, arg2);
        this.method409(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ad.ac(Lib;III)V")
    public void method351(class243 arg0, int arg1, int arg2) {
        class286 var4 = arg0.method4014(false);
        if (var4 != null) {
            int var5 = this.method459(var4, arg0.field3293);
            int var6 = this.method356(var4, arg0.field3288);
            var4.method4831(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ad.aq(Lat;Lib;IIFB)V")
    public void method409(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field523 != null && arg0.field523.field468.method161(arg4)) {
            class264 var6 = (class264) this.field482.get(arg0.field523.field468);
            var6.method4457(arg0.field523.field469, arg2 - arg0.field523.field466 / 2, arg3, arg0.field523.field466, arg0.field523.field465, 0xFF000000 | arg1.field3276, 0, 1, 0, var6.field3639 / 2);
        }
    }

    @ObfuscatedName("ad.af(IILjava/util/HashSet;II)V")
    public void method367(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field484.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field528.field2601 % 64;
            int var9 = var7.field528.field2602 % 64;
            var7.field522 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field529 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field527)) {
                this.method350(var7, var7.field522, var7.field529, var5);
            }
        }
    }

    @ObfuscatedName("ad.aj(I)V")
    public void method353() {
        if (this.field478 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method354(var1, var2, this.field478);
                }
            }
            return;
        }
        Iterator var3 = this.field479.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method585() * 8; var5 < var4.method585() * 8 + 8; var5++) {
                for (int var6 = var4.method586() * 8; var6 < var4.method586() * 8 + 8; var6++) {
                    this.method354(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ad.ax(IILaz;I)V")
    public void method354(int arg0, int arg1, class29 arg2) {
        field487.method3674(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field409; var4++) {
            class32[] var5 = arg2.field414[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method382(var8.field446);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field485.get(field487);
                        if (var10 != null) {
                            if (var9.field3280 != var10.field527) {
                                class40 var11 = new class40(var9.field3280, var10.field524, var10.field528, this.method359(var9));
                                this.field485.put(new class213(field487), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field524.field2604 - var10.field528.field2604;
                            var10.field528.field2604 = var4;
                            var10.field524.field2604 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field476 * 64 + arg0, this.field477 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field478 == null) {
                            Iterator var15 = this.field479.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method602(arg0, arg1)) {
                                    var14 = new class213(var16.field411 + var4, var16.field410 * 64 + arg0 + var16.method583() * 8, var16.field405 * 64 + arg1 + var16.method584() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field478.field411 + var4, this.field478.field410 * 64 + arg0, this.field478.field405 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3280, var14, var13, this.method359(var9));
                            this.field485.put(new class213(field487), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field485.remove(field487);
    }

    @ObfuscatedName("ad.ad(Ljk;Lii;B)I")
    public int method459(class286 arg0, class258 arg1) {
        switch(arg1.field3540) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3777 / 2;
            default:
                return -arg0.field3777;
        }
    }

    @ObfuscatedName("ad.av(Ljk;Lic;B)I")
    public int method356(class286 arg0, class240 arg1) {
        switch(arg1.field3264) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3774 / 2;
            default:
                return -arg0.field3774;
        }
    }

    @ObfuscatedName("ad.ae(II)Lib;")
    public class243 method382(int arg0) {
        class256 var2 = Statics.method564(arg0);
        if (var2.field3471 != null) {
            var2 = var2.method4253();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3458 == -1 ? null : Statics.field3277[var2.field3458];
    }

    @ObfuscatedName("ad.ar(II)Lax;")
    public class34 method358(int arg0) {
        class243 var2 = Statics.field3277[arg0];
        return this.method359(var2);
    }

    @ObfuscatedName("ad.ag(Lib;B)Lax;")
    public class34 method359(class243 arg0) {
        if (arg0.field3283 == null || this.field482 == null || this.field482.get(class25.field368) == null) {
            return null;
        }
        int var2 = arg0.field3285;
        class25[] var3 = class25.method159();
        int var4 = 0;
        class25 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class25 var5 = var3[var4];
            if (var5.field362 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class264 var8 = (class264) this.field482.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method4478(arg0.field3283, 1000000);
        String[] var10 = new String[var9];
        var8.method4521(arg0.field3283, (int[]) null, var10);
        int var11 = var10.length * var8.field3639 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4448(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class34(arg0.field3283, var12, var11, var6);
    }

    @ObfuscatedName("ad.at(IIIIIB)Ljava/util/List;")
    public List method355(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field485.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method499(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field484.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method499(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ad.ai(I)Ljava/util/List;")
    public List method361() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field484);
        var1.addAll(this.field485.values());
        return var1;
    }

    @ObfuscatedName("ad.ao(IIIIB)V")
    public void method422(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class282.method4710(this.field489 * arg0, this.field489 * (63 - arg1), this.field489, arg3);
        }
        if (var5 == 1) {
            class282.method4648(this.field489 * arg0, this.field489 * (63 - arg1), this.field489, arg3);
        }
        if (var5 == 2) {
            class282.method4710(this.field489 * arg0 + this.field489 - 1, this.field489 * (63 - arg1), this.field489, arg3);
        }
        if (var5 == 3) {
            class282.method4648(this.field489 * arg0, this.field489 * (63 - arg1) + this.field489 - 1, this.field489, arg3);
        }
    }

    @ObfuscatedName("ad.am(IIB)I")
    public int method339(int arg0, int arg1) {
        if (this.field478 != null) {
            return this.field478.method211(arg0, arg1);
        }
        if (!this.field479.isEmpty()) {
            Iterator var3 = this.field479.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method602(arg0, arg1)) {
                    return var4.method211(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
