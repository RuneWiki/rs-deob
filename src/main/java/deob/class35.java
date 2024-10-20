package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ap")
public class class35 {

    @ObfuscatedName("ap.k")
    public int field443;

    @ObfuscatedName("ap.u")
    public int field446;

    @ObfuscatedName("ap.z")
    public class23 field447;

    @ObfuscatedName("ap.t")
    public LinkedList field448;

    @ObfuscatedName("ap.f")
    public int field449;

    @ObfuscatedName("ap.g")
    public int field450;

    @ObfuscatedName("ap.j")
    public int[][] field451;

    @ObfuscatedName("ap.x")
    public class299 field452;

    @ObfuscatedName("ap.c")
    public List field453;

    @ObfuscatedName("ap.s")
    public HashMap field454;

    @ObfuscatedName("ap.n")
    public final HashMap field461;

    @ObfuscatedName("ap.y")
    public static final class224 field445 = new class224();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field443 = arg0;
        this.field446 = arg1;
        this.field448 = new LinkedList();
        this.field453 = new LinkedList();
        this.field454 = new HashMap();
        this.field449 = arg2 | 0xFF000000;
        this.field461 = arg3;
    }

    @ObfuscatedName("ap.a(IIII)V")
    public void method341(int arg0, int arg1, int arg2) {
        if (this.field452 == null) {
            return;
        }
        if (this.field450 * 64 == arg2) {
            this.field452.method4810(arg0, arg1);
        } else {
            this.field452.method4827(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ap.w(Lh;Ljava/util/List;I)V")
    public void method312(class23 arg0, List arg1) {
        this.field454.clear();
        this.field447 = arg0;
        this.method383(0, 0, 64, 64, this.field447);
        this.method315(arg1);
    }

    @ObfuscatedName("ap.e(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method327(HashSet arg0, List arg1) {
        this.field454.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method212() == this.field443 && var4.method213() == this.field446) {
                this.field448.add(var4);
                this.method383(var4.method556() * 8, var4.method557() * 8, 8, 8, var4);
            }
        }
        this.method315(arg1);
    }

    @ObfuscatedName("ap.k(IIIILag;I)V")
    public void method383(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class224 var8 = new class224(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field379; var9++) {
                    class32[] var10 = arg4.field385[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class254 var14 = this.method343(var13.field416);
                            if (var14 != null) {
                                class224 var15 = new class224(var9, this.field443 * 64 + var6, this.field446 * 64 + var7);
                                Object var16 = null;
                                class224 var17;
                                if (this.field447 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class224(var18.field378 + var9, var18.field384 * 64 + var6 + var18.method551() * 8, var18.field375 * 64 + var7 + var18.method575() * 8);
                                } else {
                                    var17 = new class224(this.field447.field378 + var9, this.field447.field384 * 64 + var6, this.field447.field375 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3396, var17, var15, this.method362(var14));
                                this.field454.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.u(Ljava/util/List;I)V")
    public void method315(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field346.field2725 >> 6 == this.field443 && var3.field346.field2726 >> 6 == this.field446) {
                class40 var4 = new class40(var3.field347, var3.field346, var3.field346, this.method344(var3.field347));
                this.field453.add(var4);
            }
        }
    }

    @ObfuscatedName("ap.z(ILam;[Lap;[Lkg;I)Z")
    public boolean method316(int arg0, class47 arg1, class35[] arg2, class298[] arg3) {
        if (!this.method319(arg0)) {
            return false;
        } else if (this.field447 == null && this.field448.isEmpty()) {
            return false;
        } else {
            this.method325(arg2);
            this.field452.method4803();
            if (this.field447 == null) {
                this.method435(arg1, arg3);
            } else {
                this.method320(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ap.t(IIILjava/util/HashSet;I)V")
    public void method440(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method333(arg0, arg1, arg3, arg2);
        this.method388(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ap.f(Ljava/util/HashSet;III)V")
    public void method318(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field454.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field500)) {
                class254 var6 = Statics.field3379[var5.field500];
                this.method335(var6, var5.field504, var5.field498, arg1, arg2);
            }
        }
        this.method405(arg0, arg1, arg2);
    }

    @ObfuscatedName("ap.g(IB)Z")
    public boolean method319(int arg0) {
        if (this.field452 != null && this.field450 == arg0) {
            return false;
        } else {
            this.field450 = arg0;
            this.field452 = new class299(this.field450 * 64, this.field450 * 64);
            return true;
        }
    }

    @ObfuscatedName("ap.x(Lam;[Lap;[Lkg;I)V")
    public void method320(class47 arg0, class35[] arg1, class298[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method323(var4, var5, this.field447, arg0);
                this.method324(var4, var5, this.field447, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method322(var6, var7, this.field447, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ap.c(Lam;[Lkg;B)V")
    public void method435(class47 arg0, class298[] arg1) {
        Iterator var3 = this.field448.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method556() * 8; var5 < var4.method556() * 8 + 8; var5++) {
                for (int var6 = var4.method557() * 8; var6 < var4.method557() * 8 + 8; var6++) {
                    this.method323(var5, var6, var4, arg0);
                    this.method324(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field448.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method556() * 8; var9 < var8.method556() * 8 + 8; var9++) {
                for (int var10 = var8.method557() * 8; var10 < var8.method557() * 8 + 8; var10++) {
                    this.method322(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ap.n(IILag;Lam;[Lkg;I)V")
    public void method322(int arg0, int arg1, class29 arg2, class47 arg3, class298[] arg4) {
        this.method436(arg0, arg1, arg2);
        this.method331(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ap.y(IILag;Lam;I)V")
    public void method323(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field380[0][arg0][arg1] - 1;
        int var6 = arg2.field376[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class295.method4707(this.field450 * arg0, this.field450 * (63 - arg1), this.field450, this.field450, this.field449);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method5(var6, this.field449);
        }
        if (var6 > -1 && arg2.field382[0][arg0][arg1] == 0) {
            class295.method4707(this.field450 * arg0, this.field450 * (63 - arg1), this.field450, this.field450, var7);
            return;
        }
        int var8 = this.method330(arg0, arg1, arg2);
        if (var6 == -1) {
            class295.method4707(this.field450 * arg0, this.field450 * (63 - arg1), this.field450, this.field450, var8);
        } else {
            arg3.method582(this.field450 * arg0, this.field450 * (63 - arg1), var8, var7, this.field450, this.field450, arg2.field382[0][arg0][arg1], arg2.field383[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ap.o(IILag;Lam;I)V")
    public void method324(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field379; var5++) {
            int var6 = arg2.field376[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method5(var6, this.field449);
                if (arg2.field382[var5][arg0][arg1] == 0) {
                    class295.method4707(this.field450 * arg0, this.field450 * (63 - arg1), this.field450, this.field450, var7);
                } else {
                    arg3.method582(this.field450 * arg0, this.field450 * (63 - arg1), 0, var7, this.field450, this.field450, arg2.field382[var5][arg0][arg1], arg2.field383[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ap.r([Lap;B)Z")
    public boolean method325(class35[] arg0) {
        if (this.field451 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field447 == null) {
            Iterator var3 = this.field448.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method328(var4.method556() * 8, var4.method557() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method328(0, 0, 64, 64, this.field447, var2);
        }
        this.method445(arg0, var2);
        this.method367(var2);
        return true;
    }

    @ObfuscatedName("ap.i(Laz;I)V")
    public void method367(class44 arg0) {
        this.field451 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field451[var2][var3] = arg0.method534(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ap.q([Lap;Laz;I)V")
    public void method445(class35[] arg0, class44 arg1) {
        class240[] var3 = class240.method2721();
        class240[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class240 var6 = var4[var5];
            if (arg0[var6.method10()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3256) {
                    case 0:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
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
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 4:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                }
                this.method438(var11, var12, var7, var8, var9, var10, arg0[var6.method10()], arg1);
            }
        }
    }

    @ObfuscatedName("ap.b(IIIILag;Laz;B)V")
    public void method328(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field380[0][var7][var8] - 1;
                if (var9 != -1) {
                    class258 var10 = class258.method3796(var9);
                    arg5.method532(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ap.h(IIIIIILap;Laz;B)V")
    public void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method349(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class258 var12 = class258.method3796(var11);
                    arg7.method532(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ap.d(IILag;I)I")
    public int method330(int arg0, int arg1, class29 arg2) {
        return arg2.field380[0][arg0][arg1] == 0 ? this.field449 : this.field451[arg0][arg1];
    }

    @ObfuscatedName("ap.v(IILag;[Lkg;B)V")
    public void method331(int arg0, int arg1, class29 arg2, class298[] arg3) {
        for (int var5 = 0; var5 < arg2.field379; var5++) {
            class32[] var6 = arg2.field385[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field413;
                    boolean var11 = var10 >= class233.field2939.field2942 && var10 <= class233.field2940.field2942;
                    if (var11 || class233.method58(var9.field413)) {
                        class267 var12 = class267.method2129(var9.field416);
                        if (var12.field3557 != -1) {
                            if (var12.field3557 == 46 || var12.field3557 == 52) {
                                arg3[var12.field3557].method4796(this.field450 * arg0, this.field450 * (63 - arg1), this.field450 * 2 + 1, this.field450 * 2 + 1);
                            } else {
                                arg3[var12.field3557].method4796(this.field450 * arg0, this.field450 * (63 - arg1), this.field450 * 2, this.field450 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.p(IILag;I)V")
    public void method436(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field379; var4++) {
            class32[] var5 = arg2.field385[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field413;
                    boolean var10 = var9 >= class233.field2924.field2942 && var9 <= class233.field2919.field2942 || class233.field2930.field2942 == var9;
                    if (var10) {
                        class267 var11 = class267.method2129(var8.field416);
                        int var12 = var11.field3529 == 0 ? -3355444 : -3407872;
                        if (class233.field2924.field2942 == var8.field413) {
                            this.method314(arg0, arg1, var8.field415, var12);
                        }
                        if (class233.field2921.field2942 == var8.field413) {
                            this.method314(arg0, arg1, var8.field415, -3355444);
                            this.method314(arg0, arg1, var8.field415 + 1, var12);
                        }
                        if (class233.field2919.field2942 == var8.field413) {
                            if (var8.field415 == 0) {
                                class295.method4716(this.field450 * arg0, this.field450 * (63 - arg1), 1, var12);
                            }
                            if (var8.field415 == 1) {
                                class295.method4716(this.field450 * arg0 + this.field450 - 1, this.field450 * (63 - arg1), 1, var12);
                            }
                            if (var8.field415 == 2) {
                                class295.method4716(this.field450 * arg0 + this.field450 - 1, this.field450 * (63 - arg1) + this.field450 - 1, 1, var12);
                            }
                            if (var8.field415 == 3) {
                                class295.method4716(this.field450 * arg0, this.field450 * (63 - arg1) + this.field450 - 1, 1, var12);
                            }
                        }
                        if (class233.field2930.field2942 == var8.field413) {
                            int var13 = var8.field415 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field450; var14++) {
                                    class295.method4716(this.field450 * arg0 + var14, this.field450 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field450; var15++) {
                                    class295.method4716(this.field450 * arg0 + var15, this.field450 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.ab(IILjava/util/HashSet;II)V")
    public void method333(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field454.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class224 var9 = (class224) var8.getKey();
            int var10 = (int) ((float) var9.field2725 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2726 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field504 = var10;
                var12.field498 = var11;
                class254 var13 = Statics.field3379[var12.field500];
                if (!arg2.contains(var13.method4070())) {
                    this.method336(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ap.ad(Ljava/util/HashSet;IIB)V")
    public void method405(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field453.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class254 var6 = Statics.field3379[var5.field500];
            if (var6 != null && arg0.contains(var6.method4070())) {
                this.method335(var6, var5.field504, var5.field498, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ap.ag(Lif;IIIII)V")
    public void method335(class254 arg0, int arg1, int arg2, int arg3, int arg4) {
        class299 var6 = arg0.method4077(false);
        if (var6 == null) {
            return;
        }
        var6.method4812(arg1 - var6.field3853 / 2, arg2 - var6.field3855 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class295.method4705(arg1, arg2, 15, 16776960, 128);
            class295.method4705(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ap.ak(Lay;IIFI)V")
    public void method336(class40 arg0, int arg1, int arg2, float arg3) {
        class254 var5 = Statics.field3379[arg0.field500];
        this.method337(var5, arg1, arg2);
        this.method338(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ap.as(Lif;III)V")
    public void method337(class254 arg0, int arg1, int arg2) {
        class299 var4 = arg0.method4077(false);
        if (var4 != null) {
            int var5 = this.method409(var4, arg0.field3395);
            int var6 = this.method346(var4, arg0.field3389);
            var4.method4812(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ap.aq(Lay;Lif;IIFB)V")
    public void method338(class40 arg0, class254 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field503 != null && arg0.field503.field434.method166(arg4)) {
            class275 var6 = (class275) this.field461.get(arg0.field503.field434);
            var6.method4518(arg0.field503.field433, arg2 - arg0.field503.field437 / 2, arg3, arg0.field503.field437, arg0.field503.field435, 0xFF000000 | arg1.field3386, 0, 1, 0, var6.field3711 / 2);
        }
    }

    @ObfuscatedName("ap.ax(IILjava/util/HashSet;II)V")
    public void method388(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field453.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field499.field2725 % 64;
            int var9 = var7.field499.field2726 % 64;
            var7.field504 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field498 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field500)) {
                this.method336(var7, var7.field504, var7.field498, var5);
            }
        }
    }

    @ObfuscatedName("ap.at(I)V")
    public void method380() {
        if (this.field447 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method340(var1, var2, this.field447);
                }
            }
            return;
        }
        Iterator var3 = this.field448.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method556() * 8; var5 < var4.method556() * 8 + 8; var5++) {
                for (int var6 = var4.method557() * 8; var6 < var4.method557() * 8 + 8; var6++) {
                    this.method340(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ap.ap(IILag;I)V")
    public void method340(int arg0, int arg1, class29 arg2) {
        field445.method3741(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field379; var4++) {
            class32[] var5 = arg2.field385[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class254 var9 = this.method343(var8.field416);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field454.get(field445);
                        if (var10 != null) {
                            if (var9.field3396 != var10.field500) {
                                class40 var11 = new class40(var9.field3396, var10.field505, var10.field499, this.method362(var9));
                                this.field454.put(new class224(field445), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field505.field2728 - var10.field499.field2728;
                            var10.field499.field2728 = var4;
                            var10.field505.field2728 = var4 + var12;
                            return;
                        }
                        class224 var13 = new class224(var4, this.field443 * 64 + arg0, this.field446 * 64 + arg1);
                        class224 var14 = null;
                        if (this.field447 == null) {
                            Iterator var15 = this.field448.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method553(arg0, arg1)) {
                                    var14 = new class224(var16.field378 + var4, var16.field384 * 64 + arg0 + var16.method551() * 8, var16.field375 * 64 + arg1 + var16.method575() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class224(this.field447.field378 + var4, this.field447.field384 * 64 + arg0, this.field447.field375 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3396, var14, var13, this.method362(var9));
                            this.field454.put(new class224(field445), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field454.remove(field445);
    }

    @ObfuscatedName("ap.an(Lks;Ljr;I)I")
    public int method409(class299 arg0, class269 arg1) {
        switch(arg1.field3617) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3853 / 2;
            default:
                return -arg0.field3853;
        }
    }

    @ObfuscatedName("ap.ac(Lks;Lik;I)I")
    public int method346(class299 arg0, class251 arg1) {
        switch(arg1.field3366) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3855 / 2;
            default:
                return -arg0.field3855;
        }
    }

    @ObfuscatedName("ap.aw(II)Lif;")
    public class254 method343(int arg0) {
        class267 var2 = class267.method2129(arg0);
        if (var2.field3551 != null) {
            var2 = var2.method4325();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3538 == -1 ? null : Statics.field3379[var2.field3538];
    }

    @ObfuscatedName("ap.al(II)Lat;")
    public class34 method344(int arg0) {
        class254 var2 = Statics.field3379[arg0];
        return this.method362(var2);
    }

    @ObfuscatedName("ap.ay(Lif;I)Lat;")
    public class34 method362(class254 arg0) {
        if (arg0.field3385 == null || this.field461 == null || this.field461.get(class25.field336) == null) {
            return null;
        }
        int var2 = arg0.field3387;
        class25[] var3 = new class25[] { class25.field335, class25.field334, class25.field336 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field338 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class275 var9 = (class275) this.field461.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4512(arg0.field3385, 1000000);
        String[] var11 = new String[var10];
        var9.method4583(arg0.field3385, (int[]) null, var11);
        int var12 = var11.length * var9.field3711 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4509(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class34(arg0.field3385, var13, var12, var7);
    }

    @ObfuscatedName("ap.ai(IIIIII)Ljava/util/List;")
    public List method310(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field454.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method481(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field453.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method481(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ap.af(I)Ljava/util/List;")
    public List method347() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field453);
        var1.addAll(this.field454.values());
        return var1;
    }

    @ObfuscatedName("ap.ah(IIIII)V")
    public void method314(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class295.method4718(this.field450 * arg0, this.field450 * (63 - arg1), this.field450, arg3);
        }
        if (var5 == 1) {
            class295.method4716(this.field450 * arg0, this.field450 * (63 - arg1), this.field450, arg3);
        }
        if (var5 == 2) {
            class295.method4718(this.field450 * arg0 + this.field450 - 1, this.field450 * (63 - arg1), this.field450, arg3);
        }
        if (var5 == 3) {
            class295.method4716(this.field450 * arg0, this.field450 * (63 - arg1) + this.field450 - 1, this.field450, arg3);
        }
    }

    @ObfuscatedName("ap.az(III)I")
    public int method349(int arg0, int arg1) {
        if (this.field447 != null) {
            return this.field447.method207(arg0, arg1);
        }
        if (!this.field448.isEmpty()) {
            Iterator var3 = this.field448.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method553(arg0, arg1)) {
                    return var4.method207(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
