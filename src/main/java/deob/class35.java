package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("au")
public class class35 {

    @ObfuscatedName("au.j")
    public int field483;

    @ObfuscatedName("au.f")
    public int field496;

    @ObfuscatedName("au.m")
    public class23 field494;

    @ObfuscatedName("au.c")
    public LinkedList field481;

    @ObfuscatedName("au.z")
    public int field487;

    @ObfuscatedName("au.h")
    public int field488;

    @ObfuscatedName("au.g")
    public int[][] field489;

    @ObfuscatedName("au.e")
    public class286 field490;

    @ObfuscatedName("au.o")
    public List field491;

    @ObfuscatedName("au.x")
    public HashMap field493;

    @ObfuscatedName("au.a")
    public final HashMap field484;

    @ObfuscatedName("au.y")
    public static final class213 field486 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field483 = arg0;
        this.field496 = arg1;
        this.field481 = new LinkedList();
        this.field491 = new LinkedList();
        this.field493 = new HashMap();
        this.field487 = arg2 | 0xFF000000;
        this.field484 = arg3;
    }

    @ObfuscatedName("au.n(IIII)V")
    public void method325(int arg0, int arg1, int arg2) {
        if (this.field490 == null) {
            return;
        }
        if (this.field488 * 64 == arg2) {
            this.field490.method4837(arg0, arg1);
        } else {
            this.field490.method4785(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("au.p(Lq;Ljava/util/List;I)V")
    public void method370(class23 arg0, List arg1) {
        this.field493.clear();
        this.field494 = arg0;
        this.method393(0, 0, 64, 64, this.field494);
        this.method432(arg1);
    }

    @ObfuscatedName("au.i(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method327(HashSet arg0, List arg1) {
        this.field493.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method223() == this.field483 && var4.method226() == this.field496) {
                this.field481.add(var4);
                this.method393(var4.method555() * 8, var4.method556() * 8, 8, 8, var4);
            }
        }
        this.method432(arg1);
    }

    @ObfuscatedName("au.j(IIIILad;B)V")
    public void method393(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field415; var9++) {
                    class32[] var10 = arg4.field420[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method443(var13.field451);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field483 * 64 + var6, this.field496 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field494 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field414 + var9, var18.field412 * 64 + var6 + var18.method550() * 8, var18.field411 * 64 + var7 + var18.method554() * 8);
                                } else {
                                    var17 = new class213(this.field494.field414 + var9, this.field494.field412 * 64 + var6, this.field494.field411 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3308, var17, var15, this.method360(var14));
                                this.field493.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.f(Ljava/util/List;I)V")
    public void method432(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field380.field2621 >> 6 == this.field483 && var3.field380.field2618 >> 6 == this.field496) {
                class40 var4 = new class40(var3.field375, var3.field380, var3.field380, this.method359(var3.field375));
                this.field491.add(var4);
            }
        }
    }

    @ObfuscatedName("au.m(ILar;[Lau;[Lje;B)Z")
    public boolean method330(int arg0, class47 arg1, class35[] arg2, class285[] arg3) {
        if (!this.method333(arg0)) {
            return false;
        } else if (this.field494 == null && this.field481.isEmpty()) {
            return false;
        } else {
            this.method385(arg2);
            this.field490.method4762();
            if (this.field494 == null) {
                this.method335(arg1, arg3);
            } else {
                this.method334(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("au.c(IIILjava/util/HashSet;I)V")
    public void method417(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method347(arg0, arg1, arg3, arg2);
        this.method353(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("au.z(Ljava/util/HashSet;III)V")
    public void method332(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field493.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field539)) {
                class243 var6 = Statics.field1301[var5.field539];
                this.method349(var6, var5.field534, var5.field532, arg1, arg2);
            }
        }
        this.method444(arg0, arg1, arg2);
    }

    @ObfuscatedName("au.h(IB)Z")
    public boolean method333(int arg0) {
        if (this.field490 != null && this.field488 == arg0) {
            return false;
        } else {
            this.field488 = arg0;
            this.field490 = new class286(this.field488 * 64, this.field488 * 64);
            return true;
        }
    }

    @ObfuscatedName("au.g(Lar;[Lau;[Lje;I)V")
    public void method334(class47 arg0, class35[] arg1, class285[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method339(var4, var5, this.field494, arg0);
                this.method436(var4, var5, this.field494, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method336(var6, var7, this.field494, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("au.e(Lar;[Lje;B)V")
    public void method335(class47 arg0, class285[] arg1) {
        Iterator var3 = this.field481.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method555() * 8; var5 < var4.method555() * 8 + 8; var5++) {
                for (int var6 = var4.method556() * 8; var6 < var4.method556() * 8 + 8; var6++) {
                    this.method339(var5, var6, var4, arg0);
                    this.method436(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field481.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method555() * 8; var9 < var8.method555() * 8 + 8; var9++) {
                for (int var10 = var8.method556() * 8; var10 < var8.method556() * 8 + 8; var10++) {
                    this.method336(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("au.o(IILad;Lar;[Lje;I)V")
    public void method336(int arg0, int arg1, class29 arg2, class47 arg3, class285[] arg4) {
        this.method346(arg0, arg1, arg2);
        this.method345(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("au.x(IILad;Lar;I)V")
    public void method339(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field410[0][arg0][arg1] - 1;
        int var6 = arg2.field417[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class282.method4722(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, this.field488, this.field487);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method1380(var6, this.field487);
        }
        if (var6 > -1 && arg2.field418[0][arg0][arg1] == 0) {
            class282.method4722(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, this.field488, var7);
            return;
        }
        int var8 = this.method344(arg0, arg1, arg2);
        if (var6 == -1) {
            class282.method4722(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, this.field488, var8);
        } else {
            arg3.method602(this.field488 * arg0, this.field488 * (63 - arg1), var8, var7, this.field488, this.field488, arg2.field418[0][arg0][arg1], arg2.field421[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("au.a(IILad;Lar;I)V")
    public void method436(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field415; var5++) {
            int var6 = arg2.field417[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method1380(var6, this.field487);
                if (arg2.field418[var5][arg0][arg1] == 0) {
                    class282.method4722(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, this.field488, var7);
                } else {
                    arg3.method602(this.field488 * arg0, this.field488 * (63 - arg1), 0, var7, this.field488, this.field488, arg2.field418[var5][arg0][arg1], arg2.field421[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("au.y([Lau;I)Z")
    public boolean method385(class35[] arg0) {
        if (this.field489 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field494 == null) {
            Iterator var3 = this.field481.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method342(var4.method555() * 8, var4.method556() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method342(0, 0, 64, 64, this.field494, var2);
        }
        this.method341(arg0, var2);
        this.method340(var2);
        return true;
    }

    @ObfuscatedName("au.r(Laq;I)V")
    public void method340(class44 arg0) {
        this.field489 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field489[var2][var3] = arg0.method534(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("au.b([Lau;Laq;I)V")
    public void method341(class35[] arg0, class44 arg1) {
        class229[] var3 = new class229[] { class229.field3154, class229.field3157, class229.field3153, class229.field3161, class229.field3158, class229.field3156, class229.field3152, class229.field3155 };
        class229[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class229 var7 = var5[var6];
            if (arg0[var7.method14()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3159) {
                    case 0:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 1:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 2:
                        var9 = 59;
                        var11 = 5;
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 6:
                        var13 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                }
                this.method343(var12, var13, var8, var9, var10, var11, arg0[var7.method14()], arg1);
            }
        }
    }

    @ObfuscatedName("au.s(IIIILad;Laq;I)V")
    public void method342(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field410[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method2819(var9);
                    arg5.method533(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("au.v(IIIIIILau;Laq;I)V")
    public void method343(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method404(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method2819(var11);
                    arg7.method533(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("au.t(IILad;I)I")
    public int method344(int arg0, int arg1, class29 arg2) {
        return arg2.field410[0][arg0][arg1] == 0 ? this.field487 : this.field489[arg0][arg1];
    }

    @ObfuscatedName("au.w(IILad;[Lje;I)V")
    public void method345(int arg0, int arg1, class29 arg2, class285[] arg3) {
        for (int var5 = 0; var5 < arg2.field415; var5++) {
            class32[] var6 = arg2.field420[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field449;
                    boolean var11 = var10 >= class222.field2832.field2835 && var10 <= class222.field2826.field2835;
                    if (!var11) {
                        int var12 = var9.field449;
                        boolean var13 = class222.field2834.field2835 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class256 var14 = class256.method937(var9.field451);
                    if (var14.field3472 != -1) {
                        if (var14.field3472 == 46 || var14.field3472 == 52) {
                            arg3[var14.field3472].method4746(this.field488 * arg0, this.field488 * (63 - arg1), this.field488 * 2 + 1, this.field488 * 2 + 1);
                        } else {
                            arg3[var14.field3472].method4746(this.field488 * arg0, this.field488 * (63 - arg1), this.field488 * 2, this.field488 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.u(IILad;B)V")
    public void method346(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field415; var4++) {
            class32[] var5 = arg2.field420[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field449;
                    boolean var10 = var9 >= class222.field2817.field2835 && var9 <= class222.field2815.field2835 || class222.field2816.field2835 == var9;
                    if (var10) {
                        class256 var11 = class256.method937(var8.field451);
                        int var12 = var11.field3465 == 0 ? -3355444 : -3407872;
                        if (class222.field2817.field2835 == var8.field449) {
                            this.method363(arg0, arg1, var8.field448, var12);
                        }
                        if (class222.field2814.field2835 == var8.field449) {
                            this.method363(arg0, arg1, var8.field448, -3355444);
                            this.method363(arg0, arg1, var8.field448 + 1, var12);
                        }
                        if (class222.field2815.field2835 == var8.field449) {
                            if (var8.field448 == 0) {
                                class282.method4655(this.field488 * arg0, this.field488 * (63 - arg1), 1, var12);
                            }
                            if (var8.field448 == 1) {
                                class282.method4655(this.field488 * arg0 + this.field488 - 1, this.field488 * (63 - arg1), 1, var12);
                            }
                            if (var8.field448 == 2) {
                                class282.method4655(this.field488 * arg0 + this.field488 - 1, this.field488 * (63 - arg1) + this.field488 - 1, 1, var12);
                            }
                            if (var8.field448 == 3) {
                                class282.method4655(this.field488 * arg0, this.field488 * (63 - arg1) + this.field488 - 1, 1, var12);
                            }
                        }
                        if (class222.field2816.field2835 == var8.field449) {
                            int var13 = var8.field448 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field488; var14++) {
                                    class282.method4655(this.field488 * arg0 + var14, this.field488 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field488; var15++) {
                                    class282.method4655(this.field488 * arg0 + var15, this.field488 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("au.aa(IILjava/util/HashSet;II)V")
    public void method347(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field493.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2621 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2618 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field534 = var10;
                var12.field532 = var11;
                class243 var13 = Statics.field1301[var12.field539];
                if (!arg2.contains(var13.method4017())) {
                    this.method350(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("au.aw(Ljava/util/HashSet;III)V")
    public void method444(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field491.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field1301[var5.field539];
            if (var6 != null && arg0.contains(var6.method4017())) {
                this.method349(var6, var5.field534, var5.field532, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("au.an(Lin;IIIII)V")
    public void method349(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var6 = arg0.method4015(false);
        if (var6 == null) {
            return;
        }
        var6.method4770(arg1 - var6.field3779 / 2, arg2 - var6.field3785 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class282.method4649(arg1, arg2, 15, 16776960, 128);
            class282.method4649(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("au.al(Lam;IIFI)V")
    public void method350(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field1301[arg0.field539];
        this.method351(var5, arg1, arg2);
        this.method402(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("au.at(Lin;III)V")
    public void method351(class243 arg0, int arg1, int arg2) {
        class286 var4 = arg0.method4015(false);
        if (var4 != null) {
            int var5 = this.method415(var4, arg0.field3310);
            int var6 = this.method357(var4, arg0.field3311);
            var4.method4770(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("au.au(Lam;Lin;IIFI)V")
    public void method402(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field533 != null && arg0.field533.field476.method185(arg4)) {
            class264 var6 = (class264) this.field484.get(arg0.field533.field476);
            var6.method4478(arg0.field533.field478, arg2 - arg0.field533.field473 / 2, arg3, arg0.field533.field473, arg0.field533.field474, 0xFF000000 | arg1.field3301, 0, 1, 0, var6.field3653 / 2);
        }
    }

    @ObfuscatedName("au.ak(IILjava/util/HashSet;II)V")
    public void method353(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field491.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field528.field2621 % 64;
            int var9 = var7.field528.field2618 % 64;
            var7.field534 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field532 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field539)) {
                this.method350(var7, var7.field534, var7.field532, var5);
            }
        }
    }

    @ObfuscatedName("au.as(S)V")
    public void method354() {
        if (this.field494 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method355(var1, var2, this.field494);
                }
            }
            return;
        }
        Iterator var3 = this.field481.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method555() * 8; var5 < var4.method555() * 8 + 8; var5++) {
                for (int var6 = var4.method556() * 8; var6 < var4.method556() * 8 + 8; var6++) {
                    this.method355(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("au.ah(IILad;I)V")
    public void method355(int arg0, int arg1, class29 arg2) {
        field486.method3674(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field415; var4++) {
            class32[] var5 = arg2.field420[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method443(var8.field451);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field493.get(field486);
                        if (var10 != null) {
                            if (var9.field3308 != var10.field539) {
                                class40 var11 = new class40(var9.field3308, var10.field530, var10.field528, this.method360(var9));
                                this.field493.put(new class213(field486), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field530.field2619 - var10.field528.field2619;
                            var10.field528.field2619 = var4;
                            var10.field530.field2619 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field483 * 64 + arg0, this.field496 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field494 == null) {
                            Iterator var15 = this.field481.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method557(arg0, arg1)) {
                                    var14 = new class213(var16.field414 + var4, var16.field412 * 64 + arg0 + var16.method550() * 8, var16.field411 * 64 + arg1 + var16.method554() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field494.field414 + var4, this.field494.field412 * 64 + arg0, this.field494.field411 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3308, var14, var13, this.method360(var9));
                            this.field493.put(new class213(field486), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field493.remove(field486);
    }

    @ObfuscatedName("au.ab(Ljp;Lib;I)I")
    public int method415(class286 arg0, class258 arg1) {
        switch(arg1.field3555) {
            case 1:
                return -arg0.field3779 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3779;
        }
    }

    @ObfuscatedName("au.am(Ljp;Lil;I)I")
    public int method357(class286 arg0, class240 arg1) {
        switch(arg1.field3274) {
            case 1:
                return -arg0.field3785 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3785;
        }
    }

    @ObfuscatedName("au.ac(II)Lin;")
    public class243 method443(int arg0) {
        class256 var2 = class256.method937(arg0);
        if (var2.field3484 != null) {
            var2 = var2.method4238();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3471 == -1 ? null : Statics.field1301[var2.field3471];
    }

    @ObfuscatedName("au.ax(II)Lat;")
    public class34 method359(int arg0) {
        class243 var2 = Statics.field1301[arg0];
        return this.method360(var2);
    }

    @ObfuscatedName("au.av(Lin;I)Lat;")
    public class34 method360(class243 arg0) {
        if (arg0.field3295 == null || this.field484 == null || this.field484.get(class25.field367) == null) {
            return null;
        }
        int var2 = arg0.field3302;
        class25[] var3 = class25.method188();
        int var4 = 0;
        class25 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class25 var5 = var3[var4];
            if (var5.field365 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class264 var8 = (class264) this.field484.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method4470(arg0.field3295, 1000000);
        String[] var10 = new String[var9];
        var8.method4468(arg0.field3295, (int[]) null, var10);
        int var11 = var10.length * var8.field3653 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4467(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class34(arg0.field3295, var12, var11, var6);
    }

    @ObfuscatedName("au.aq(IIIIII)Ljava/util/List;")
    public List method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field493.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method489(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field491.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method489(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("au.af(B)Ljava/util/List;")
    public List method362() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field491);
        var1.addAll(this.field493.values());
        return var1;
    }

    @ObfuscatedName("au.ag(IIIII)V")
    public void method363(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class282.method4662(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, arg3);
        }
        if (var5 == 1) {
            class282.method4655(this.field488 * arg0, this.field488 * (63 - arg1), this.field488, arg3);
        }
        if (var5 == 2) {
            class282.method4662(this.field488 * arg0 + this.field488 - 1, this.field488 * (63 - arg1), this.field488, arg3);
        }
        if (var5 == 3) {
            class282.method4655(this.field488 * arg0, this.field488 * (63 - arg1) + this.field488 - 1, this.field488, arg3);
        }
    }

    @ObfuscatedName("au.ar(III)I")
    public int method404(int arg0, int arg1) {
        if (this.field494 != null) {
            return this.field494.method237(arg0, arg1);
        }
        if (!this.field481.isEmpty()) {
            Iterator var3 = this.field481.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method557(arg0, arg1)) {
                    return var4.method237(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
