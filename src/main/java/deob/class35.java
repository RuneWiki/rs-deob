package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("al")
public class class35 {

    @ObfuscatedName("al.v")
    public int field480;

    @ObfuscatedName("al.b")
    public int field482;

    @ObfuscatedName("al.y")
    public class23 field485;

    @ObfuscatedName("al.h")
    public LinkedList field493;

    @ObfuscatedName("al.x")
    public int field487;

    @ObfuscatedName("al.f")
    public int field488;

    @ObfuscatedName("al.n")
    public int[][] field489;

    @ObfuscatedName("al.a")
    public class286 field484;

    @ObfuscatedName("al.o")
    public List field491;

    @ObfuscatedName("al.z")
    public HashMap field492;

    @ObfuscatedName("al.q")
    public final HashMap field481;

    @ObfuscatedName("al.j")
    public static final class213 field494 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field480 = arg0;
        this.field482 = arg1;
        this.field493 = new LinkedList();
        this.field491 = new LinkedList();
        this.field492 = new HashMap();
        this.field487 = arg2 | 0xFF000000;
        this.field481 = arg3;
    }

    @ObfuscatedName("al.i(IIII)V")
    public void method394(int arg0, int arg1, int arg2) {
        if (this.field484 == null) {
            return;
        }
        if (this.field488 * 64 == arg2) {
            this.field484.method4674(arg0, arg1);
        } else {
            this.field484.method4693(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("al.c(Lp;Ljava/util/List;I)V")
    public void method309(class23 arg0, List arg1) {
        this.field492.clear();
        this.field485 = arg0;
        this.method401(0, 0, 64, 64, this.field485);
        this.method342(arg1);
    }

    @ObfuscatedName("al.e(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method310(HashSet arg0, List arg1) {
        this.field492.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method200() == this.field480 && var4.method201() == this.field482) {
                this.field493.add(var4);
                this.method401(var4.method534() * 8, var4.method535() * 8, 8, 8, var4);
            }
        }
        this.method342(arg1);
    }

    @ObfuscatedName("al.v(IIIILan;B)V")
    public void method401(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field412; var9++) {
                    class32[] var10 = arg4.field417[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method340(var13.field446);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field480 * 64 + var6, this.field482 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field485 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field411 + var9, var18.field410 * 64 + var6 + var18.method555() * 8, var18.field418 * 64 + var7 + var18.method533() * 8);
                                } else {
                                    var17 = new class213(this.field485.field411 + var9, this.field485.field410 * 64 + var6, this.field485.field418 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3290, var17, var15, this.method435(var14));
                                this.field492.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.b(Ljava/util/List;I)V")
    public void method342(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field364.field2617 >> 6 == this.field480 && var3.field364.field2615 >> 6 == this.field482) {
                class40 var4 = new class40(var3.field365, var3.field364, var3.field364, this.method341(var3.field365));
                this.field491.add(var4);
            }
        }
    }

    @ObfuscatedName("al.y(ILaj;[Lal;[Ljd;B)Z")
    public boolean method322(int arg0, class47 arg1, class35[] arg2, class285[] arg3) {
        if (!this.method434(arg0)) {
            return false;
        } else if (this.field485 == null && this.field493.isEmpty()) {
            return false;
        } else {
            this.method319(arg2);
            this.field484.method4725();
            if (this.field485 == null) {
                this.method318(arg1, arg3);
            } else {
                this.method317(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("al.h(IIILjava/util/HashSet;I)V")
    public void method314(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method368(arg0, arg1, arg3, arg2);
        this.method327(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("al.x(Ljava/util/HashSet;III)V")
    public void method315(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field492.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field537)) {
                class243 var6 = Statics.field2840[var5.field537];
                this.method331(var6, var5.field531, var5.field532, arg1, arg2);
            }
        }
        this.method337(arg0, arg1, arg2);
    }

    @ObfuscatedName("al.f(II)Z")
    public boolean method434(int arg0) {
        if (this.field484 != null && this.field488 == arg0) {
            return false;
        } else {
            this.field488 = arg0;
            this.field484 = new class286(this.field488 * 64, this.field488 * 64);
            return true;
        }
    }

    @ObfuscatedName("al.n(Laj;[Lal;[Ljd;S)V")
    public void method317(class47 arg0, class35[] arg1, class285[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method320(var4, var5, this.field485, arg0);
                this.method321(var4, var5, this.field485, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method371(var6, var7, this.field485, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("al.a(Laj;[Ljd;I)V")
    public void method318(class47 arg0, class285[] arg1) {
        Iterator var3 = this.field493.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method534() * 8; var5 < var4.method534() * 8 + 8; var5++) {
                for (int var6 = var4.method535() * 8; var6 < var4.method535() * 8 + 8; var6++) {
                    this.method320(var5, var6, var4, arg0);
                    this.method321(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field493.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method534() * 8; var9 < var8.method534() * 8 + 8; var9++) {
                for (int var10 = var8.method535() * 8; var10 < var8.method535() * 8 + 8; var10++) {
                    this.method371(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("al.o(IILan;Laj;[Ljd;I)V")
    public void method371(int arg0, int arg1, class29 arg2, class47 arg3, class285[] arg4) {
        this.method329(arg0, arg1, arg2);
        this.method427(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("al.z(IILan;Laj;I)V")
    public void method320(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field413[0][arg0][arg1] - 1;
        int var6 = arg2.field414[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class282.method4561(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, this.field488, this.field487);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method1029(var6, this.field487);
        }
        if (var6 > -1 && arg2.field408[0][arg0][arg1] == 0) {
            class282.method4561(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, this.field488, var7);
            return;
        }
        int var8 = this.method390(arg0, arg1, arg2);
        if (var6 == -1) {
            class282.method4561(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, this.field488, var8);
        } else {
            arg3.method561(this.field488 * arg0, this.field488 * (63 - arg1), var8, var7, this.field488, this.field488, arg2.field408[0][arg0][arg1], arg2.field407[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("al.q(IILan;Laj;B)V")
    public void method321(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field412; var5++) {
            int var6 = arg2.field414[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method1029(var6, this.field487);
                if (arg2.field408[var5][arg0][arg1] == 0) {
                    class282.method4561(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, this.field488, var7);
                } else {
                    arg3.method561(this.field488 * arg0, this.field488 * (63 - arg1), 0, var7, this.field488, this.field488, arg2.field408[var5][arg0][arg1], arg2.field407[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("al.j([Lal;I)Z")
    public boolean method319(class35[] arg0) {
        if (this.field489 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field485 == null) {
            Iterator var3 = this.field493.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method325(var4.method534() * 8, var4.method535() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method325(0, 0, 64, 64, this.field485, var2);
        }
        this.method324(arg0, var2);
        this.method330(var2);
        return true;
    }

    @ObfuscatedName("al.l(Lac;S)V")
    public void method330(class44 arg0) {
        this.field489 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field489[var2][var3] = arg0.method519(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("al.u([Lal;Lac;B)V")
    public void method324(class35[] arg0, class44 arg1) {
        class229[] var3 = new class229[] { class229.field3154, class229.field3150, class229.field3147, class229.field3148, class229.field3151, class229.field3156, class229.field3149, class229.field3152 };
        class229[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class229 var7 = var5[var6];
            if (arg0[var7.method6()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3155) {
                    case 0:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                }
                this.method323(var12, var13, var8, var9, var10, var11, arg0[var7.method6()], arg1);
            }
        }
    }

    @ObfuscatedName("al.t(IIIILan;Lac;I)V")
    public void method325(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field413[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method454(var9);
                    arg5.method515(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("al.ad(IIIIIILal;Lac;I)V")
    public void method323(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method346(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method454(var11);
                    arg7.method515(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("al.ar(IILan;I)I")
    public int method390(int arg0, int arg1, class29 arg2) {
        return arg2.field413[0][arg0][arg1] == 0 ? this.field487 : this.field489[arg0][arg1];
    }

    @ObfuscatedName("al.an(IILan;[Ljd;I)V")
    public void method427(int arg0, int arg1, class29 arg2, class285[] arg3) {
        for (int var5 = 0; var5 < arg2.field412; var5++) {
            class32[] var6 = arg2.field417[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field447;
                    boolean var11 = var10 >= class222.field2824.field2833 && var10 <= class222.field2810.field2833;
                    if (var11 || class222.method2174(var9.field447)) {
                        class256 var12 = Statics.method3743(var9.field446);
                        if (var12.field3462 != -1) {
                            if (var12.field3462 == 46 || var12.field3462 == 52) {
                                arg3[var12.field3462].method4648(this.field488 * arg0, this.field488 * (63 - arg1), this.field488 * 2 + 1, this.field488 * 2 + 1);
                            } else {
                                arg3[var12.field3462].method4648(this.field488 * arg0, this.field488 * (63 - arg1), this.field488 * 2, this.field488 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.af(IILan;I)V")
    public void method329(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field412; var4++) {
            class32[] var5 = arg2.field417[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class222.method3483(var8.field447)) {
                        class256 var9 = Statics.method3743(var8.field446);
                        int var10 = var9.field3452 == 0 ? -3355444 : -3407872;
                        if (class222.field2828.field2833 == var8.field447) {
                            this.method418(arg0, arg1, var8.field448, var10);
                        }
                        if (class222.field2812.field2833 == var8.field447) {
                            this.method418(arg0, arg1, var8.field448, -3355444);
                            this.method418(arg0, arg1, var8.field448 + 1, var10);
                        }
                        if (class222.field2813.field2833 == var8.field447) {
                            if (var8.field448 == 0) {
                                class282.method4620(this.field488 * arg0, this.field488 * (63 - arg1), 1, var10);
                            }
                            if (var8.field448 == 1) {
                                class282.method4620(this.field488 * arg0 + this.field488 - 1, this.field488 * (63 - arg1), 1, var10);
                            }
                            if (var8.field448 == 2) {
                                class282.method4620(this.field488 * arg0 + this.field488 - 1, this.field488 * (63 - arg1) + this.field488 - 1, 1, var10);
                            }
                            if (var8.field448 == 3) {
                                class282.method4620(this.field488 * arg0, this.field488 * (63 - arg1) + this.field488 - 1, 1, var10);
                            }
                        }
                        if (class222.field2814.field2833 == var8.field447) {
                            int var11 = var8.field448 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field488; var12++) {
                                    class282.method4620(this.field488 * arg0 + var12, this.field488 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field488; var13++) {
                                    class282.method4620(this.field488 * arg0 + var13, this.field488 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.at(IILjava/util/HashSet;II)V")
    public void method368(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field492.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2617 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2615 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field531 = var10;
                var12.field532 = var11;
                class243 var13 = Statics.field2840[var12.field537];
                if (!arg2.contains(var13.method3949())) {
                    this.method332(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("al.ah(Ljava/util/HashSet;III)V")
    public void method337(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field491.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field2840[var5.field537];
            if (var6 != null && arg0.contains(var6.method3949())) {
                this.method331(var6, var5.field531, var5.field532, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("al.ai(Lie;IIIII)V")
    public void method331(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var6 = arg0.method3962(false);
        if (var6 == null) {
            return;
        }
        var6.method4676(arg1 - var6.field3786 / 2, arg2 - var6.field3789 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class282.method4559(arg1, arg2, 15, 16776960, 128);
            class282.method4559(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("al.aw(Las;IIFI)V")
    public void method332(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field2840[arg0.field537];
        this.method333(var5, arg1, arg2);
        this.method369(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("al.al(Lie;III)V")
    public void method333(class243 arg0, int arg1, int arg2) {
        class286 var4 = arg0.method3962(false);
        if (var4 != null) {
            int var5 = this.method338(var4, arg0.field3300);
            int var6 = this.method339(var4, arg0.field3307);
            var4.method4676(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("al.ab(Las;Lie;IIFI)V")
    public void method369(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field530 != null && arg0.field530.field472.method159(arg4)) {
            class264 var6 = (class264) this.field481.get(arg0.field530.field472);
            var6.method4390(arg0.field530.field471, arg2 - arg0.field530.field470 / 2, arg3, arg0.field530.field470, arg0.field530.field469, 0xFF000000 | arg1.field3297, 0, 1, 0, var6.field3653 / 2);
        }
    }

    @ObfuscatedName("al.aa(IILjava/util/HashSet;II)V")
    public void method327(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field491.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field526.field2617 % 64;
            int var9 = var7.field526.field2615 % 64;
            var7.field531 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field532 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field537)) {
                this.method332(var7, var7.field531, var7.field532, var5);
            }
        }
    }

    @ObfuscatedName("al.ap(I)V")
    public void method336() {
        if (this.field485 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method307(var1, var2, this.field485);
                }
            }
            return;
        }
        Iterator var3 = this.field493.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method534() * 8; var5 < var4.method534() * 8 + 8; var5++) {
                for (int var6 = var4.method535() * 8; var6 < var4.method535() * 8 + 8; var6++) {
                    this.method307(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("al.ae(IILan;I)V")
    public void method307(int arg0, int arg1, class29 arg2) {
        field494.method3585(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field412; var4++) {
            class32[] var5 = arg2.field417[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method340(var8.field446);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field492.get(field494);
                        if (var10 != null) {
                            if (var9.field3290 != var10.field537) {
                                class40 var11 = new class40(var9.field3290, var10.field527, var10.field526, this.method435(var9));
                                this.field492.put(new class213(field494), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field527.field2616 - var10.field526.field2616;
                            var10.field526.field2616 = var4;
                            var10.field527.field2616 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field480 * 64 + arg0, this.field482 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field485 == null) {
                            Iterator var15 = this.field493.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method544(arg0, arg1)) {
                                    var14 = new class213(var16.field411 + var4, var16.field410 * 64 + arg0 + var16.method555() * 8, var16.field418 * 64 + arg1 + var16.method533() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field485.field411 + var4, this.field485.field410 * 64 + arg0, this.field485.field418 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3290, var14, var13, this.method435(var9));
                            this.field492.put(new class213(field494), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field492.remove(field494);
    }

    @ObfuscatedName("al.as(Ljs;Lio;I)I")
    public int method338(class286 arg0, class258 arg1) {
        switch(arg1.field3542) {
            case 0:
                return -arg0.field3786 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3786;
        }
    }

    @ObfuscatedName("al.av(Ljs;Lik;I)I")
    public int method339(class286 arg0, class240 arg1) {
        switch(arg1.field3275) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3789 / 2;
            default:
                return -arg0.field3789;
        }
    }

    @ObfuscatedName("al.ag(II)Lie;")
    public class243 method340(int arg0) {
        class256 var2 = Statics.method3743(arg0);
        if (var2.field3474 != null) {
            var2 = var2.method4204();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3455 == -1 ? null : Statics.field2840[var2.field3455];
    }

    @ObfuscatedName("al.az(II)Law;")
    public class34 method341(int arg0) {
        class243 var2 = Statics.field2840[arg0];
        return this.method435(var2);
    }

    @ObfuscatedName("al.ac(Lie;I)Law;")
    public class34 method435(class243 arg0) {
        if (arg0.field3296 == null || this.field481 == null || this.field481.get(class25.field358) == null) {
            return null;
        }
        int var2 = arg0.field3311;
        class25[] var3 = class25.method157();
        int var4 = 0;
        class25 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class25 var5 = var3[var4];
            if (var5.field356 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class264 var8 = (class264) this.field481.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method4404(arg0.field3296, 1000000);
        String[] var10 = new String[var9];
        var8.method4375(arg0.field3296, (int[]) null, var10);
        int var11 = var10.length * var8.field3653 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4374(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class34(arg0.field3296, var12, var11, var6);
    }

    @ObfuscatedName("al.ax(IIIIIB)Ljava/util/List;")
    public List method343(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field492.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method463(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field491.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method463(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("al.au(I)Ljava/util/List;")
    public List method344() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field491);
        var1.addAll(this.field492.values());
        return var1;
    }

    @ObfuscatedName("al.aj(IIIII)V")
    public void method418(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class282.method4582(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, arg3);
        }
        if (var5 == 1) {
            class282.method4620(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, arg3);
        }
        if (var5 == 2) {
            class282.method4582(this.field488 * arg0 + this.field488 - 1, this.field488 * (63 - arg1), this.field488, arg3);
        }
        if (var5 == 3) {
            class282.method4620(this.field488 * arg0, this.field488 * (63 - arg1) + this.field488 - 1, this.field488, arg3);
        }
    }

    @ObfuscatedName("al.aq(III)I")
    public int method346(int arg0, int arg1) {
        if (this.field485 != null) {
            return this.field485.method199(arg0, arg1);
        }
        if (!this.field493.isEmpty()) {
            Iterator var3 = this.field493.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method544(arg0, arg1)) {
                    return var4.method199(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
