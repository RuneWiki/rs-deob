package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("aq")
public class class35 {

    @ObfuscatedName("aq.o")
    public int field488;

    @ObfuscatedName("aq.g")
    public int field489;

    @ObfuscatedName("aq.v")
    public class23 field505;

    @ObfuscatedName("aq.p")
    public LinkedList field491;

    @ObfuscatedName("aq.e")
    public int field492;

    @ObfuscatedName("aq.d")
    public int field485;

    @ObfuscatedName("aq.x")
    public int[][] field494;

    @ObfuscatedName("aq.z")
    public class287 field495;

    @ObfuscatedName("aq.n")
    public List field501;

    @ObfuscatedName("aq.u")
    public HashMap field504;

    @ObfuscatedName("aq.t")
    public final HashMap field493;

    @ObfuscatedName("aq.a")
    public static final class213 field496 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field488 = arg0;
        this.field489 = arg1;
        this.field491 = new LinkedList();
        this.field501 = new LinkedList();
        this.field504 = new HashMap();
        this.field492 = arg2 | 0xFF000000;
        this.field493 = arg3;
    }

    @ObfuscatedName("aq.w(IIII)V")
    public void method318(int arg0, int arg1, int arg2) {
        if (this.field495 == null) {
            return;
        }
        if (this.field485 * 64 == arg2) {
            this.field495.method4820(arg0, arg1);
        } else {
            this.field495.method4836(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("aq.s(Lr;Ljava/util/List;I)V")
    public void method319(class23 arg0, List arg1) {
        this.field504.clear();
        this.field505 = arg0;
        this.method321(0, 0, 64, 64, this.field505);
        this.method352(arg1);
    }

    @ObfuscatedName("aq.q(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method320(HashSet arg0, List arg1) {
        this.field504.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method211() == this.field488 && var4.method214() == this.field489) {
                this.field491.add(var4);
                this.method321(var4.method580() * 8, var4.method562() * 8, 8, 8, var4);
            }
        }
        this.method352(arg1);
    }

    @ObfuscatedName("aq.o(IIIILaa;I)V")
    public void method321(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field416; var9++) {
                    class32[] var10 = arg4.field426[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method351(var13.field460);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field488 * 64 + var6, this.field489 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field505 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field420 + var9, var18.field424 * 64 + var6 + var18.method559() * 8, var18.field417 * 64 + var7 + var18.method555() * 8);
                                } else {
                                    var17 = new class213(this.field505.field420 + var9, this.field505.field424 * 64 + var6, this.field505.field417 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3288, var17, var15, this.method374(var14));
                                this.field504.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.g(Ljava/util/List;B)V")
    public void method352(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field384.field2602 >> 6 == this.field488 && var3.field384.field2603 >> 6 == this.field489) {
                class40 var4 = new class40(var3.field381, var3.field384, var3.field384, this.method413(var3.field381));
                this.field501.add(var4);
            }
        }
    }

    @ObfuscatedName("aq.v(ILar;[Laq;[Ljo;I)Z")
    public boolean method436(int arg0, class47 arg1, class35[] arg2, class286[] arg3) {
        if (!this.method326(arg0)) {
            return false;
        } else if (this.field505 == null && this.field491.isEmpty()) {
            return false;
        } else {
            this.method332(arg2);
            this.field495.method4813();
            if (this.field505 == null) {
                this.method379(arg1, arg3);
            } else {
                this.method327(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("aq.p(IIILjava/util/HashSet;B)V")
    public void method324(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method340(arg0, arg1, arg3, arg2);
        this.method425(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("aq.e(Ljava/util/HashSet;IIB)V")
    public void method325(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field504.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field557)) {
                class243 var6 = Statics.field3286[var5.field557];
                this.method317(var6, var5.field553, var5.field550, arg1, arg2);
            }
        }
        this.method341(arg0, arg1, arg2);
    }

    @ObfuscatedName("aq.d(IB)Z")
    public boolean method326(int arg0) {
        if (this.field495 != null && this.field485 == arg0) {
            return false;
        } else {
            this.field485 = arg0;
            this.field495 = new class287(this.field485 * 64, this.field485 * 64);
            return true;
        }
    }

    @ObfuscatedName("aq.x(Lar;[Laq;[Ljo;B)V")
    public void method327(class47 arg0, class35[] arg1, class286[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method342(var4, var5, this.field505, arg0);
                this.method390(var4, var5, this.field505, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method329(var6, var7, this.field505, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("aq.u(Lar;[Ljo;I)V")
    public void method379(class47 arg0, class286[] arg1) {
        Iterator var3 = this.field491.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method580() * 8; var5 < var4.method580() * 8 + 8; var5++) {
                for (int var6 = var4.method562() * 8; var6 < var4.method562() * 8 + 8; var6++) {
                    this.method342(var5, var6, var4, arg0);
                    this.method390(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field491.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method580() * 8; var9 < var8.method580() * 8 + 8; var9++) {
                for (int var10 = var8.method562() * 8; var10 < var8.method562() * 8 + 8; var10++) {
                    this.method329(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("aq.i(IILaa;Lar;[Ljo;I)V")
    public void method329(int arg0, int arg1, class29 arg2, class47 arg3, class286[] arg4) {
        this.method339(arg0, arg1, arg2);
        this.method338(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("aq.h(IILaa;Lar;I)V")
    public void method342(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field422[0][arg0][arg1] - 1;
        int var6 = arg2.field418[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class283.method4704(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, this.field485, this.field492);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = Statics.method49(var6, this.field492);
        }
        if (var6 > -1 && arg2.field423[0][arg0][arg1] == 0) {
            class283.method4704(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, this.field485, var7);
            return;
        }
        int var8 = this.method412(arg0, arg1, arg2);
        if (var6 == -1) {
            class283.method4704(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, this.field485, var8);
        } else {
            arg3.method586(this.field485 * arg0, this.field485 * (63 - arg1), var8, var7, this.field485, this.field485, arg2.field423[0][arg0][arg1], arg2.field425[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("aq.b(IILaa;Lar;I)V")
    public void method390(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field416; var5++) {
            int var6 = arg2.field418[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = Statics.method49(var6, this.field492);
                if (arg2.field423[var5][arg0][arg1] == 0) {
                    class283.method4704(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, this.field485, var7);
                } else {
                    arg3.method586(this.field485 * arg0, this.field485 * (63 - arg1), 0, var7, this.field485, this.field485, arg2.field423[var5][arg0][arg1], arg2.field425[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("aq.j([Laq;I)Z")
    public boolean method332(class35[] arg0) {
        if (this.field494 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field505 == null) {
            Iterator var3 = this.field491.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method392(var4.method580() * 8, var4.method562() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method392(0, 0, 64, 64, this.field505, var2);
        }
        this.method334(arg0, var2);
        this.method333(var2);
        return true;
    }

    @ObfuscatedName("aq.y(Lam;I)V")
    public void method333(class44 arg0) {
        this.field494 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field494[var2][var3] = arg0.method539(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("aq.c([Laq;Lam;I)V")
    public void method334(class35[] arg0, class44 arg1) {
        class229[] var3 = new class229[] { class229.field3156, class229.field3164, class229.field3151, class229.field3152, class229.field3158, class229.field3155, class229.field3153, class229.field3154 };
        class229[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class229 var7 = var5[var6];
            if (arg0[var7.method13()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3157) {
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
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 6:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                }
                this.method336(var12, var13, var8, var9, var10, var11, arg0[var7.method13()], arg1);
            }
        }
    }

    @ObfuscatedName("aq.r(IIIILaa;Lam;B)V")
    public void method392(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field422[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method3859(var9);
                    arg5.method544(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("aq.m(IIIIIILaq;Lam;I)V")
    public void method336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method357(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method3859(var11);
                    arg7.method544(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("aq.l(IILaa;S)I")
    public int method412(int arg0, int arg1, class29 arg2) {
        return arg2.field422[0][arg0][arg1] == 0 ? this.field492 : this.field494[arg0][arg1];
    }

    @ObfuscatedName("aq.f(IILaa;[Ljo;B)V")
    public void method338(int arg0, int arg1, class29 arg2, class286[] arg3) {
        for (int var5 = 0; var5 < arg2.field416; var5++) {
            class32[] var6 = arg2.field426[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (Statics.method207(var9.field461) || class222.method692(var9.field461)) {
                        class256 var10 = class256.method2861(var9.field460);
                        if (var10.field3465 != -1) {
                            if (var10.field3465 == 46 || var10.field3465 == 52) {
                                arg3[var10.field3465].method4809(this.field485 * arg0, this.field485 * (63 - arg1), this.field485 * 2 + 1, this.field485 * 2 + 1);
                            } else {
                                arg3[var10.field3465].method4809(this.field485 * arg0, this.field485 * (63 - arg1), this.field485 * 2, this.field485 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.ap(IILaa;I)V")
    public void method339(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field416; var4++) {
            class32[] var5 = arg2.field426[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field461;
                    boolean var10 = var9 >= class222.field2816.field2826 && var9 <= class222.field2813.field2826 || class222.field2807.field2826 == var9;
                    if (var10) {
                        class256 var11 = class256.method2861(var8.field460);
                        int var12 = var11.field3455 == 0 ? -3355444 : -3407872;
                        if (class222.field2816.field2826 == var8.field461) {
                            this.method331(arg0, arg1, var8.field457, var12);
                        }
                        if (class222.field2805.field2826 == var8.field461) {
                            this.method331(arg0, arg1, var8.field457, -3355444);
                            this.method331(arg0, arg1, var8.field457 + 1, var12);
                        }
                        if (class222.field2813.field2826 == var8.field461) {
                            if (var8.field457 == 0) {
                                class283.method4712(this.field485 * arg0, this.field485 * (63 - arg1), 1, var12);
                            }
                            if (var8.field457 == 1) {
                                class283.method4712(this.field485 * arg0 + this.field485 - 1, this.field485 * (63 - arg1), 1, var12);
                            }
                            if (var8.field457 == 2) {
                                class283.method4712(this.field485 * arg0 + this.field485 - 1, this.field485 * (63 - arg1) + this.field485 - 1, 1, var12);
                            }
                            if (var8.field457 == 3) {
                                class283.method4712(this.field485 * arg0, this.field485 * (63 - arg1) + this.field485 - 1, 1, var12);
                            }
                        }
                        if (class222.field2807.field2826 == var8.field461) {
                            int var13 = var8.field457 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field485; var14++) {
                                    class283.method4712(this.field485 * arg0 + var14, this.field485 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field485; var15++) {
                                    class283.method4712(this.field485 * arg0 + var15, this.field485 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.af(IILjava/util/HashSet;II)V")
    public void method340(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field504.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2602 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2603 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field553 = var10;
                var12.field550 = var11;
                class243 var13 = Statics.field3286[var12.field557];
                if (!arg2.contains(var13.method4051())) {
                    this.method343(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("aq.aa(Ljava/util/HashSet;IIB)V")
    public void method341(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field501.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field3286[var5.field557];
            if (var6 != null && arg0.contains(var6.method4051())) {
                this.method317(var6, var5.field553, var5.field550, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("aq.ay(Lid;IIIIB)V")
    public void method317(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class287 var6 = arg0.method4038(false);
        if (var6 == null) {
            return;
        }
        var6.method4822(arg1 - var6.field3795 / 2, arg2 - var6.field3796 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class283.method4698(arg1, arg2, 15, 16776960, 128);
            class283.method4698(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("aq.aw(Lab;IIFI)V")
    public void method343(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field3286[arg0.field557];
        this.method344(var5, arg1, arg2);
        this.method398(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("aq.az(Lid;III)V")
    public void method344(class243 arg0, int arg1, int arg2) {
        class287 var4 = arg0.method4038(false);
        if (var4 != null) {
            int var5 = this.method349(var4, arg0.field3295);
            int var6 = this.method350(var4, arg0.field3302);
            var4.method4822(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("aq.at(Lab;Lid;IIFB)V")
    public void method398(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field552 != null && arg0.field552.field478.method174(arg4)) {
            class264 var6 = (class264) this.field493.get(arg0.field552.field478);
            var6.method4574(arg0.field552.field483, arg2 - arg0.field552.field480 / 2, arg3, arg0.field552.field480, arg0.field552.field479, 0xFF000000 | arg1.field3293, 0, 1, 0, var6.field3646 / 2);
        }
    }

    @ObfuscatedName("aq.ao(IILjava/util/HashSet;II)V")
    public void method425(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field501.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field549.field2602 % 64;
            int var9 = var7.field549.field2603 % 64;
            var7.field553 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field550 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field557)) {
                this.method343(var7, var7.field553, var7.field550, var5);
            }
        }
    }

    @ObfuscatedName("aq.aq(I)V")
    public void method347() {
        if (this.field505 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method348(var1, var2, this.field505);
                }
            }
            return;
        }
        Iterator var3 = this.field491.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method580() * 8; var5 < var4.method580() * 8 + 8; var5++) {
                for (int var6 = var4.method562() * 8; var6 < var4.method562() * 8 + 8; var6++) {
                    this.method348(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("aq.ax(IILaa;B)V")
    public void method348(int arg0, int arg1, class29 arg2) {
        field496.method3719(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field416; var4++) {
            class32[] var5 = arg2.field426[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method351(var8.field460);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field504.get(field496);
                        if (var10 != null) {
                            if (var9.field3288 != var10.field557) {
                                class40 var11 = new class40(var9.field3288, var10.field560, var10.field549, this.method374(var9));
                                this.field504.put(new class213(field496), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field560.field2601 - var10.field549.field2601;
                            var10.field549.field2601 = var4;
                            var10.field560.field2601 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field488 * 64 + arg0, this.field489 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field505 == null) {
                            Iterator var15 = this.field491.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method564(arg0, arg1)) {
                                    var14 = new class213(var16.field420 + var4, var16.field424 * 64 + arg0 + var16.method559() * 8, var16.field417 * 64 + arg1 + var16.method555() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field505.field420 + var4, this.field505.field424 * 64 + arg0, this.field505.field417 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3288, var14, var13, this.method374(var9));
                            this.field504.put(new class213(field496), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field504.remove(field496);
    }

    @ObfuscatedName("aq.av(Lky;Lim;I)I")
    public int method349(class287 arg0, class258 arg1) {
        switch(arg1.field3548) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3795 / 2;
            default:
                return -arg0.field3795;
        }
    }

    @ObfuscatedName("aq.al(Lky;Lij;I)I")
    public int method350(class287 arg0, class240 arg1) {
        switch(arg1.field3267) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3796 / 2;
            default:
                return -arg0.field3796;
        }
    }

    @ObfuscatedName("aq.ae(IS)Lid;")
    public class243 method351(int arg0) {
        class256 var2 = class256.method2861(arg0);
        if (var2.field3477 != null) {
            var2 = var2.method4279();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3464 == -1 ? null : Statics.field3286[var2.field3464];
    }

    @ObfuscatedName("aq.ab(IB)Lao;")
    public class34 method413(int arg0) {
        class243 var2 = Statics.field3286[arg0];
        return this.method374(var2);
    }

    @ObfuscatedName("aq.aj(Lid;B)Lao;")
    public class34 method374(class243 arg0) {
        if (arg0.field3291 == null || this.field493 == null || this.field493.get(class25.field379) == null) {
            return null;
        }
        int var2 = arg0.field3285;
        class25[] var3 = class25.method168();
        int var4 = 0;
        class25 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class25 var5 = var3[var4];
            if (var5.field374 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class264 var8 = (class264) this.field493.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method4506(arg0.field3291, 1000000);
        String[] var10 = new String[var9];
        var8.method4504(arg0.field3291, (int[]) null, var10);
        int var11 = var10.length * var8.field3646 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4514(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class34(arg0.field3291, var12, var11, var6);
    }

    @ObfuscatedName("aq.ac(IIIIII)Ljava/util/List;")
    public List method354(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field504.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method472(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field501.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method472(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("aq.ad(I)Ljava/util/List;")
    public List method382() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field501);
        var1.addAll(this.field504.values());
        return var1;
    }

    @ObfuscatedName("aq.am(IIIII)V")
    public void method331(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class283.method4714(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, arg3);
        }
        if (var5 == 1) {
            class283.method4712(this.field485 * arg0, this.field485 * (63 - arg1), this.field485, arg3);
        }
        if (var5 == 2) {
            class283.method4714(this.field485 * arg0 + this.field485 - 1, this.field485 * (63 - arg1), this.field485, arg3);
        }
        if (var5 == 3) {
            class283.method4712(this.field485 * arg0, this.field485 * (63 - arg1) + this.field485 - 1, this.field485, arg3);
        }
    }

    @ObfuscatedName("aq.ah(IIB)I")
    public int method357(int arg0, int arg1) {
        if (this.field505 != null) {
            return this.field505.method212(arg0, arg1);
        }
        if (!this.field491.isEmpty()) {
            Iterator var3 = this.field491.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method564(arg0, arg1)) {
                    return var4.method212(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
