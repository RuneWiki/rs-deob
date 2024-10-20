package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("au")
public class class35 {

    @ObfuscatedName("au.y")
    public int field456;

    @ObfuscatedName("au.e")
    public int field466;

    @ObfuscatedName("au.f")
    public class23 field462;

    @ObfuscatedName("au.v")
    public LinkedList field454;

    @ObfuscatedName("au.t")
    public int field457;

    @ObfuscatedName("au.i")
    public int field458;

    @ObfuscatedName("au.r")
    public int[][] field459;

    @ObfuscatedName("au.g")
    public class286 field460;

    @ObfuscatedName("au.s")
    public List field465;

    @ObfuscatedName("au.o")
    public HashMap field461;

    @ObfuscatedName("au.p")
    public final HashMap field463;

    @ObfuscatedName("au.u")
    public static final class213 field464 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field456 = arg0;
        this.field466 = arg1;
        this.field454 = new LinkedList();
        this.field465 = new LinkedList();
        this.field461 = new HashMap();
        this.field457 = arg2 | 0xFF000000;
        this.field463 = arg3;
    }

    @ObfuscatedName("au.d(IIII)V")
    public void method321(int arg0, int arg1, int arg2) {
        if (this.field460 == null) {
            return;
        }
        if (this.field458 * 64 == arg2) {
            this.field460.method4669(arg0, arg1);
        } else {
            this.field460.method4686(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("au.q(La;Ljava/util/List;I)V")
    public void method322(class23 arg0, List arg1) {
        this.field461.clear();
        this.field462 = arg0;
        this.method324(0, 0, 64, 64, this.field462);
        this.method325(arg1);
    }

    @ObfuscatedName("au.x(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method384(HashSet arg0, List arg1) {
        this.field461.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method205() == this.field456 && var4.method215() == this.field466) {
                this.field454.add(var4);
                this.method324(var4.method561() * 8, var4.method554() * 8, 8, 8, var4);
            }
        }
        this.method325(arg1);
    }

    @ObfuscatedName("au.y(IIIILax;I)V")
    public void method324(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field383; var9++) {
                    class32[] var10 = arg4.field390[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method354(var13.field423);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field456 * 64 + var6, this.field466 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field462 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field384 + var9, var18.field385 * 64 + var6 + var18.method559() * 8, var18.field381 * 64 + var7 + var18.method560() * 8);
                                } else {
                                    var17 = new class213(this.field462.field384 + var9, this.field462.field385 * 64 + var6, this.field462.field381 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3279, var17, var15, this.method342(var14));
                                this.field461.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.e(Ljava/util/List;B)V")
    public void method325(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field349.field2592 >> 6 == this.field456 && var3.field349.field2593 >> 6 == this.field466) {
                class40 var4 = new class40(var3.field347, var3.field349, var3.field349, this.method374(var3.field347));
                this.field465.add(var4);
            }
        }
    }

    @ObfuscatedName("au.f(ILas;[Lau;[Ljw;B)Z")
    public boolean method396(int arg0, class47 arg1, class35[] arg2, class285[] arg3) {
        if (!this.method430(arg0)) {
            return false;
        } else if (this.field462 == null && this.field454.isEmpty()) {
            return false;
        } else {
            this.method402(arg2);
            this.field460.method4662();
            if (this.field462 == null) {
                this.method331(arg1, arg3);
            } else {
                this.method340(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("au.v(IIILjava/util/HashSet;I)V")
    public void method327(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method343(arg0, arg1, arg3, arg2);
        this.method349(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("au.t(Ljava/util/HashSet;III)V")
    public void method328(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field461.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field506)) {
                class243 var6 = Statics.field3287[var5.field506];
                this.method345(var6, var5.field499, var5.field500, arg1, arg2);
            }
        }
        this.method348(arg0, arg1, arg2);
    }

    @ObfuscatedName("au.i(IB)Z")
    public boolean method430(int arg0) {
        if (this.field460 != null && this.field458 == arg0) {
            return false;
        } else {
            this.field458 = arg0;
            this.field460 = new class286(this.field458 * 64, this.field458 * 64);
            return true;
        }
    }

    @ObfuscatedName("au.r(Las;[Lau;[Ljw;I)V")
    public void method340(class47 arg0, class35[] arg1, class285[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method333(var4, var5, this.field462, arg0);
                this.method334(var4, var5, this.field462, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method456(var6, var7, this.field462, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("au.g(Las;[Ljw;B)V")
    public void method331(class47 arg0, class285[] arg1) {
        Iterator var3 = this.field454.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method561() * 8; var5 < var4.method561() * 8 + 8; var5++) {
                for (int var6 = var4.method554() * 8; var6 < var4.method554() * 8 + 8; var6++) {
                    this.method333(var5, var6, var4, arg0);
                    this.method334(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field454.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method561() * 8; var9 < var8.method561() * 8 + 8; var9++) {
                for (int var10 = var8.method554() * 8; var10 < var8.method554() * 8 + 8; var10++) {
                    this.method456(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("au.s(IILax;Las;[Ljw;B)V")
    public void method456(int arg0, int arg1, class29 arg2, class47 arg3, class285[] arg4) {
        this.method379(arg0, arg1, arg2);
        this.method341(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("au.o(IILax;Las;I)V")
    public void method333(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field386[0][arg0][arg1] - 1;
        int var6 = arg2.field387[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class282.method4551(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, this.field458, this.field457);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method2652(var6, this.field457);
        }
        if (var6 > -1 && arg2.field389[0][arg0][arg1] == 0) {
            class282.method4551(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, this.field458, var7);
            return;
        }
        int var8 = this.method454(arg0, arg1, arg2);
        if (var6 == -1) {
            class282.method4551(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, this.field458, var8);
        } else {
            arg3.method577(this.field458 * arg0, this.field458 * (63 - arg1), var8, var7, this.field458, this.field458, arg2.field389[0][arg0][arg1], arg2.field388[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("au.p(IILax;Las;I)V")
    public void method334(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field383; var5++) {
            int var6 = arg2.field387[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method2652(var6, this.field457);
                if (arg2.field389[var5][arg0][arg1] == 0) {
                    class282.method4551(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, this.field458, var7);
                } else {
                    arg3.method577(this.field458 * arg0, this.field458 * (63 - arg1), 0, var7, this.field458, this.field458, arg2.field389[var5][arg0][arg1], arg2.field388[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("au.u([Lau;I)Z")
    public boolean method402(class35[] arg0) {
        if (this.field459 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field462 == null) {
            Iterator var3 = this.field454.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method338(var4.method561() * 8, var4.method554() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method338(0, 0, 64, 64, this.field462, var2);
        }
        this.method337(arg0, var2);
        this.method336(var2);
        return true;
    }

    @ObfuscatedName("au.b(Laf;B)V")
    public void method336(class44 arg0) {
        this.field459 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field459[var2][var3] = arg0.method537(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("au.w([Lau;Laf;I)V")
    public void method337(class35[] arg0, class44 arg1) {
        class229[] var3 = new class229[] { class229.field3135, class229.field3134, class229.field3133, class229.field3140, class229.field3132, class229.field3138, class229.field3129, class229.field3131 };
        class229[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class229 var7 = var5[var6];
            if (arg0[var7.method8()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3136) {
                    case 0:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 3:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 4:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 6:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var8 = 59;
                        var10 = 5;
                }
                this.method339(var12, var13, var8, var9, var10, var11, arg0[var7.method8()], arg1);
            }
        }
    }

    @ObfuscatedName("au.k(IIIILax;Laf;I)V")
    public void method338(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field386[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method2881(var9);
                    arg5.method546(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("au.c(IIIIIILau;Laf;I)V")
    public void method339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method360(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method2881(var11);
                    arg7.method546(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("au.h(IILax;I)I")
    public int method454(int arg0, int arg1, class29 arg2) {
        return arg2.field386[0][arg0][arg1] == 0 ? this.field457 : this.field459[arg0][arg1];
    }

    @ObfuscatedName("au.z(IILax;[Ljw;S)V")
    public void method341(int arg0, int arg1, class29 arg2, class285[] arg3) {
        for (int var5 = 0; var5 < arg2.field383; var5++) {
            class32[] var6 = arg2.field390[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field418;
                    boolean var11 = var10 >= class222.field2810.field2814 && var10 <= class222.field2811.field2814;
                    if (var11 || class222.method933(var9.field418)) {
                        class256 var12 = class256.method997(var9.field423);
                        if (var12.field3445 != -1) {
                            if (var12.field3445 == 46 || var12.field3445 == 52) {
                                arg3[var12.field3445].method4658(this.field458 * arg0, this.field458 * (63 - arg1), this.field458 * 2 + 1, this.field458 * 2 + 1);
                            } else {
                                arg3[var12.field3445].method4658(this.field458 * arg0, this.field458 * (63 - arg1), this.field458 * 2, this.field458 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.j(IILax;B)V")
    public void method379(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field383; var4++) {
            class32[] var5 = arg2.field390[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field418;
                    boolean var10 = var9 >= class222.field2812.field2814 && var9 <= class222.field2793.field2814 || class222.field2805.field2814 == var9;
                    if (var10) {
                        class256 var11 = class256.method997(var8.field423);
                        int var12 = var11.field3464 == 0 ? -3355444 : -3407872;
                        if (class222.field2812.field2814 == var8.field418) {
                            this.method359(arg0, arg1, var8.field417, var12);
                        }
                        if (class222.field2806.field2814 == var8.field418) {
                            this.method359(arg0, arg1, var8.field417, -3355444);
                            this.method359(arg0, arg1, var8.field417 + 1, var12);
                        }
                        if (class222.field2793.field2814 == var8.field418) {
                            if (var8.field417 == 0) {
                                class282.method4617(this.field458 * arg0, this.field458 * (63 - arg1), 1, var12);
                            }
                            if (var8.field417 == 1) {
                                class282.method4617(this.field458 * arg0 + this.field458 - 1, this.field458 * (63 - arg1), 1, var12);
                            }
                            if (var8.field417 == 2) {
                                class282.method4617(this.field458 * arg0 + this.field458 - 1, this.field458 * (63 - arg1) + this.field458 - 1, 1, var12);
                            }
                            if (var8.field417 == 3) {
                                class282.method4617(this.field458 * arg0, this.field458 * (63 - arg1) + this.field458 - 1, 1, var12);
                            }
                        }
                        if (class222.field2805.field2814 == var8.field418) {
                            int var13 = var8.field417 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field458; var14++) {
                                    class282.method4617(this.field458 * arg0 + var14, this.field458 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field458; var15++) {
                                    class282.method4617(this.field458 * arg0 + var15, this.field458 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.am(IILjava/util/HashSet;II)V")
    public void method343(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field461.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2592 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2593 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field499 = var10;
                var12.field500 = var11;
                class243 var13 = Statics.field3287[var12.field506];
                if (!arg2.contains(var13.method3898())) {
                    this.method332(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("au.ac(Ljava/util/HashSet;III)V")
    public void method348(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field465.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field3287[var5.field506];
            if (var6 != null && arg0.contains(var6.method3898())) {
                this.method345(var6, var5.field499, var5.field500, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("au.ax(Lij;IIIIB)V")
    public void method345(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var6 = arg0.method3896(false);
        if (var6 == null) {
            return;
        }
        var6.method4671(arg1 - var6.field3766 / 2, arg2 - var6.field3768 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class282.method4549(arg1, arg2, 15, 16776960, 128);
            class282.method4549(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("au.at(Laz;IIFI)V")
    public void method332(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field3287[arg0.field506];
        this.method347(var5, arg1, arg2);
        this.method435(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("au.ag(Lij;III)V")
    public void method347(class243 arg0, int arg1, int arg2) {
        class286 var4 = arg0.method3896(false);
        if (var4 != null) {
            int var5 = this.method352(var4, arg0.field3292);
            int var6 = this.method353(var4, arg0.field3294);
            var4.method4671(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("au.ar(Laz;Lij;IIFI)V")
    public void method435(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field508 != null && arg0.field508.field444.method159(arg4)) {
            class264 var6 = (class264) this.field463.get(arg0.field508.field444);
            var6.method4447(arg0.field508.field445, arg2 - arg0.field508.field442 / 2, arg3, arg0.field508.field442, arg0.field508.field443, 0xFF000000 | arg1.field3283, 0, 1, 0, var6.field3623 / 2);
        }
    }

    @ObfuscatedName("au.ae(IILjava/util/HashSet;II)V")
    public void method349(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field465.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field505.field2592 % 64;
            int var9 = var7.field505.field2593 % 64;
            var7.field499 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field500 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field506)) {
                this.method332(var7, var7.field499, var7.field500, var5);
            }
        }
    }

    @ObfuscatedName("au.ai(B)V")
    public void method408() {
        if (this.field462 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method409(var1, var2, this.field462);
                }
            }
            return;
        }
        Iterator var3 = this.field454.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method561() * 8; var5 < var4.method561() * 8 + 8; var5++) {
                for (int var6 = var4.method554() * 8; var6 < var4.method554() * 8 + 8; var6++) {
                    this.method409(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("au.au(IILax;I)V")
    public void method409(int arg0, int arg1, class29 arg2) {
        field464.method3597(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field383; var4++) {
            class32[] var5 = arg2.field390[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method354(var8.field423);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field461.get(field464);
                        if (var10 != null) {
                            if (var9.field3279 != var10.field506) {
                                class40 var11 = new class40(var9.field3279, var10.field501, var10.field505, this.method342(var9));
                                this.field461.put(new class213(field464), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field501.field2591 - var10.field505.field2591;
                            var10.field505.field2591 = var4;
                            var10.field501.field2591 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field456 * 64 + arg0, this.field466 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field462 == null) {
                            Iterator var15 = this.field454.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method556(arg0, arg1)) {
                                    var14 = new class213(var16.field384 + var4, var16.field385 * 64 + arg0 + var16.method559() * 8, var16.field381 * 64 + arg1 + var16.method560() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field462.field384 + var4, this.field462.field385 * 64 + arg0, this.field462.field381 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3279, var14, var13, this.method342(var9));
                            this.field461.put(new class213(field464), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field461.remove(field464);
    }

    @ObfuscatedName("au.ad(Lji;Lid;I)I")
    public int method352(class286 arg0, class258 arg1) {
        switch(arg1.field3525) {
            case 1:
                return -arg0.field3766 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3766;
        }
    }

    @ObfuscatedName("au.ah(Lji;Lis;B)I")
    public int method353(class286 arg0, class240 arg1) {
        switch(arg1.field3257) {
            case 0:
                return -arg0.field3768 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3768;
        }
    }

    @ObfuscatedName("au.ao(II)Lij;")
    public class243 method354(int arg0) {
        class256 var2 = class256.method997(arg0);
        if (var2.field3457 != null) {
            var2 = var2.method4127();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3444 == -1 ? null : Statics.field3287[var2.field3444];
    }

    @ObfuscatedName("au.av(II)Lai;")
    public class34 method374(int arg0) {
        class243 var2 = Statics.field3287[arg0];
        return this.method342(var2);
    }

    @ObfuscatedName("au.az(Lij;I)Lai;")
    public class34 method342(class243 arg0) {
        if (arg0.field3282 == null || this.field463 == null || this.field463.get(class25.field339) == null) {
            return null;
        }
        int var2 = arg0.field3284;
        class25[] var3 = new class25[] { class25.field339, class25.field337, class25.field338 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field336 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class264 var9 = (class264) this.field463.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4405(arg0.field3282, 1000000);
        String[] var11 = new String[var10];
        var9.method4441(arg0.field3282, (int[]) null, var11);
        int var12 = var11.length * var9.field3623 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4434(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class34(arg0.field3282, var13, var12, var7);
    }

    @ObfuscatedName("au.aq(IIIIIB)Ljava/util/List;")
    public List method357(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field461.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method482(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field465.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method482(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("au.ay(I)Ljava/util/List;")
    public List method358() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field465);
        var1.addAll(this.field461.values());
        return var1;
    }

    @ObfuscatedName("au.an(IIIIB)V")
    public void method359(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class282.method4562(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, arg3);
        }
        if (var5 == 1) {
            class282.method4617(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, arg3);
        }
        if (var5 == 2) {
            class282.method4562(this.field458 * arg0 + this.field458 - 1, this.field458 * (63 - arg1), this.field458, arg3);
        }
        if (var5 == 3) {
            class282.method4617(this.field458 * arg0, this.field458 * (63 - arg1) + this.field458 - 1, this.field458, arg3);
        }
    }

    @ObfuscatedName("au.af(III)I")
    public int method360(int arg0, int arg1) {
        if (this.field462 != null) {
            return this.field462.method204(arg0, arg1);
        }
        if (!this.field454.isEmpty()) {
            Iterator var3 = this.field454.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method556(arg0, arg1)) {
                    return var4.method204(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
