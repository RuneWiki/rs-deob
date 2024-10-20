package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("al")
public class class35 {

    @ObfuscatedName("al.g")
    public int field478;

    @ObfuscatedName("al.d")
    public int field495;

    @ObfuscatedName("al.b")
    public class23 field496;

    @ObfuscatedName("al.k")
    public LinkedList field481;

    @ObfuscatedName("al.f")
    public int field494;

    @ObfuscatedName("al.j")
    public int field483;

    @ObfuscatedName("al.q")
    public int[][] field484;

    @ObfuscatedName("al.h")
    public class286 field485;

    @ObfuscatedName("al.i")
    public List field486;

    @ObfuscatedName("al.s")
    public HashMap field487;

    @ObfuscatedName("al.n")
    public final HashMap field488;

    @ObfuscatedName("al.c")
    public static final class213 field489 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field478 = arg0;
        this.field495 = arg1;
        this.field481 = new LinkedList();
        this.field486 = new LinkedList();
        this.field487 = new HashMap();
        this.field494 = arg2 | 0xFF000000;
        this.field488 = arg3;
    }

    @ObfuscatedName("al.e(IIII)V")
    public void method313(int arg0, int arg1, int arg2) {
        if (this.field485 == null) {
            return;
        }
        if (this.field483 * 64 == arg2) {
            this.field485.method4696(arg0, arg1);
        } else {
            this.field485.method4702(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("al.o(Lx;Ljava/util/List;I)V")
    public void method314(class23 arg0, List arg1) {
        this.field487.clear();
        this.field496 = arg0;
        this.method316(0, 0, 64, 64, this.field496);
        this.method324(arg1);
    }

    @ObfuscatedName("al.m(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method399(HashSet arg0, List arg1) {
        this.field487.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method201() == this.field478 && var4.method202() == this.field495) {
                this.field481.add(var4);
                this.method316(var4.method564() * 8, var4.method572() * 8, 8, 8, var4);
            }
        }
        this.method324(arg1);
    }

    @ObfuscatedName("al.g(IIIILam;B)V")
    public void method316(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field407; var9++) {
                    class32[] var10 = arg4.field412[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method402(var13.field445);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field478 * 64 + var6, this.field495 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field496 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field406 + var9, var18.field417 * 64 + var6 + var18.method563() * 8, var18.field403 * 64 + var7 + var18.method565() * 8);
                                } else {
                                    var17 = new class213(this.field496.field406 + var9, this.field496.field417 * 64 + var6, this.field496.field403 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3284, var17, var15, this.method401(var14));
                                this.field487.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.d(Ljava/util/List;I)V")
    public void method324(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field368.field2595 >> 6 == this.field478 && var3.field368.field2597 >> 6 == this.field495) {
                class40 var4 = new class40(var3.field369, var3.field368, var3.field368, this.method347(var3.field369));
                this.field486.add(var4);
            }
        }
    }

    @ObfuscatedName("al.b(ILau;[Lal;[Ljh;B)Z")
    public boolean method318(int arg0, class47 arg1, class35[] arg2, class285[] arg3) {
        if (!this.method321(arg0)) {
            return false;
        } else if (this.field496 == null && this.field481.isEmpty()) {
            return false;
        } else {
            this.method327(arg2);
            this.field485.method4769();
            if (this.field496 == null) {
                this.method322(arg1, arg3);
            } else {
                this.method312(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("al.k(IIILjava/util/HashSet;I)V")
    public void method319(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method335(arg0, arg1, arg3, arg2);
        this.method341(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("al.q(Ljava/util/HashSet;III)V")
    public void method437(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field487.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field535)) {
                class243 var6 = Statics.field477[var5.field535];
                this.method337(var6, var5.field536, var5.field537, arg1, arg2);
            }
        }
        this.method372(arg0, arg1, arg2);
    }

    @ObfuscatedName("al.h(II)Z")
    public boolean method321(int arg0) {
        if (this.field485 != null && this.field483 == arg0) {
            return false;
        } else {
            this.field483 = arg0;
            this.field485 = new class286(this.field483 * 64, this.field483 * 64);
            return true;
        }
    }

    @ObfuscatedName("al.i(Lau;[Lal;[Ljh;I)V")
    public void method312(class47 arg0, class35[] arg1, class285[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method325(var4, var5, this.field496, arg0);
                this.method326(var4, var5, this.field496, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method426(var6, var7, this.field496, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("al.s(Lau;[Ljh;I)V")
    public void method322(class47 arg0, class285[] arg1) {
        Iterator var3 = this.field481.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method564() * 8; var5 < var4.method564() * 8 + 8; var5++) {
                for (int var6 = var4.method572() * 8; var6 < var4.method572() * 8 + 8; var6++) {
                    this.method325(var5, var6, var4, arg0);
                    this.method326(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field481.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method564() * 8; var9 < var8.method564() * 8 + 8; var9++) {
                for (int var10 = var8.method572() * 8; var10 < var8.method572() * 8 + 8; var10++) {
                    this.method426(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("al.n(IILam;Lau;[Ljh;I)V")
    public void method426(int arg0, int arg1, class29 arg2, class47 arg3, class285[] arg4) {
        this.method343(arg0, arg1, arg2);
        this.method333(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("al.c(IILam;Lau;B)V")
    public void method325(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field408[0][arg0][arg1] - 1;
        int var6 = arg2.field405[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class282.method4607(this.field483 * arg0, this.field483 * (63 - arg1), this.field483, this.field483, this.field494);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            int var8 = this.field494;
            class260 var9 = class260.method3909(var6);
            int var10;
            if (var9 == null) {
                var10 = var8;
            } else if (var9.field3568 >= 0) {
                var10 = var9.field3568 | 0xFF000000;
            } else if (var9.field3570 >= 0) {
                int var11 = class38.method71(Statics.field2031.method2156(var9.field3570), 96);
                var10 = class137.field2030[var11] | 0xFF000000;
            } else if (var9.field3569 == 16711935) {
                var10 = var8;
            } else {
                int var12 = var9.field3573;
                int var13 = var9.field3574;
                int var14 = var9.field3572;
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
                int var18 = class38.method71(var15, 96);
                var10 = class137.field2030[var18] | 0xFF000000;
            }
            var7 = var10;
        }
        if (var6 > -1 && arg2.field410[0][arg0][arg1] == 0) {
            class282.method4607(this.field483 * arg0, this.field483 * (63 - arg1), this.field483, this.field483, var7);
            return;
        }
        int var19 = this.method320(arg0, arg1, arg2);
        if (var6 == -1) {
            class282.method4607(this.field483 * arg0, this.field483 * (63 - arg1), this.field483, this.field483, var19);
        } else {
            arg3.method580(this.field483 * arg0, this.field483 * (63 - arg1), var19, var7, this.field483, this.field483, arg2.field410[0][arg0][arg1], arg2.field411[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("al.v(IILam;Lau;I)V")
    public void method326(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field407; var5++) {
            int var6 = arg2.field405[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field494;
                class260 var8 = class260.method3909(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3568 >= 0) {
                    var9 = var8.field3568 | 0xFF000000;
                } else if (var8.field3570 >= 0) {
                    int var10 = class38.method71(Statics.field2031.method2156(var8.field3570), 96);
                    var9 = class137.field2030[var10] | 0xFF000000;
                } else if (var8.field3569 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = var8.field3573;
                    int var12 = var8.field3574;
                    int var13 = var8.field3572;
                    if (var13 > 179) {
                        var12 /= 2;
                    }
                    if (var13 > 192) {
                        var12 /= 2;
                    }
                    if (var13 > 217) {
                        var12 /= 2;
                    }
                    if (var13 > 243) {
                        var12 /= 2;
                    }
                    int var14 = var13 / 2 + (var11 / 4 << 10) + (var12 / 32 << 7);
                    int var17 = class38.method71(var14, 96);
                    var9 = class137.field2030[var17] | 0xFF000000;
                }
                if (arg2.field410[var5][arg0][arg1] == 0) {
                    class282.method4607(this.field483 * arg0, this.field483 * (63 - arg1), this.field483, this.field483, var9);
                } else {
                    arg3.method580(this.field483 * arg0, this.field483 * (63 - arg1), 0, var9, this.field483, this.field483, arg2.field410[var5][arg0][arg1], arg2.field411[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("al.u([Lal;B)Z")
    public boolean method327(class35[] arg0) {
        if (this.field484 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field496 == null) {
            Iterator var3 = this.field481.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method330(var4.method564() * 8, var4.method572() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method330(0, 0, 64, 64, this.field496, var2);
        }
        this.method457(arg0, var2);
        this.method328(var2);
        return true;
    }

    @ObfuscatedName("al.w(Lav;I)V")
    public void method328(class44 arg0) {
        this.field484 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field484[var2][var3] = arg0.method544(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("al.p([Lal;Lav;I)V")
    public void method457(class35[] arg0, class44 arg1) {
        class229[] var3 = class229.method4023();
        class229[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class229 var6 = var4[var5];
            if (arg0[var6.method8()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3134) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 2:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 3:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 5:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var8 = 59;
                        var10 = 5;
                }
                this.method331(var11, var12, var7, var8, var9, var10, arg0[var6.method8()], arg1);
            }
        }
    }

    @ObfuscatedName("al.l(IIIILam;Lav;I)V")
    public void method330(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field408[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method2800(var9);
                    arg5.method538(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("al.x(IIIIIILal;Lav;I)V")
    public void method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method352(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method2800(var11);
                    arg7.method538(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("al.r(IILam;I)I")
    public int method320(int arg0, int arg1, class29 arg2) {
        return arg2.field408[0][arg0][arg1] == 0 ? this.field494 : this.field484[arg0][arg1];
    }

    @ObfuscatedName("al.t(IILam;[Ljh;I)V")
    public void method333(int arg0, int arg1, class29 arg2, class285[] arg3) {
        for (int var5 = 0; var5 < arg2.field407; var5++) {
            class32[] var6 = arg2.field412[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class222.method976(var9.field449)) {
                        int var10 = var9.field449;
                        boolean var11 = class222.field2795.field2818 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class256 var12 = class256.method4379(var9.field445);
                    if (var12.field3444 != -1) {
                        if (var12.field3444 == 46 || var12.field3444 == 52) {
                            arg3[var12.field3444].method4683(this.field483 * arg0, this.field483 * (63 - arg1), this.field483 * 2 + 1, this.field483 * 2 + 1);
                        } else {
                            arg3[var12.field3444].method4683(this.field483 * arg0, this.field483 * (63 - arg1), this.field483 * 2, this.field483 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.a(IILam;I)V")
    public void method343(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field407; var4++) {
            class32[] var5 = arg2.field412[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class222.method2660(var8.field449)) {
                        class256 var9 = class256.method4379(var8.field445);
                        int var10 = var9.field3430 == 0 ? -3355444 : -3407872;
                        if (class222.field2811.field2818 == var8.field449) {
                            this.method351(arg0, arg1, var8.field446, var10);
                        }
                        if (class222.field2797.field2818 == var8.field449) {
                            this.method351(arg0, arg1, var8.field446, -3355444);
                            this.method351(arg0, arg1, var8.field446 + 1, var10);
                        }
                        if (class222.field2803.field2818 == var8.field449) {
                            if (var8.field446 == 0) {
                                class282.method4609(this.field483 * arg0, this.field483 * (63 - arg1), 1, var10);
                            }
                            if (var8.field446 == 1) {
                                class282.method4609(this.field483 * arg0 + this.field483 - 1, this.field483 * (63 - arg1), 1, var10);
                            }
                            if (var8.field446 == 2) {
                                class282.method4609(this.field483 * arg0 + this.field483 - 1, this.field483 * (63 - arg1) + this.field483 - 1, 1, var10);
                            }
                            if (var8.field446 == 3) {
                                class282.method4609(this.field483 * arg0, this.field483 * (63 - arg1) + this.field483 - 1, 1, var10);
                            }
                        }
                        if (class222.field2819.field2818 == var8.field449) {
                            int var11 = var8.field446 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field483; var12++) {
                                    class282.method4609(this.field483 * arg0 + var12, this.field483 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field483; var13++) {
                                    class282.method4609(this.field483 * arg0 + var13, this.field483 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("al.ad(IILjava/util/HashSet;II)V")
    public void method335(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field487.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2595 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2597 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field536 = var10;
                var12.field537 = var11;
                class243 var13 = Statics.field477[var12.field535];
                if (!arg2.contains(var13.method3925())) {
                    this.method323(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("al.ay(Ljava/util/HashSet;III)V")
    public void method372(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field486.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field477[var5.field535];
            if (var6 != null && arg0.contains(var6.method3925())) {
                this.method337(var6, var5.field536, var5.field537, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("al.am(Lij;IIIII)V")
    public void method337(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var6 = arg0.method3920(false);
        if (var6 == null) {
            return;
        }
        var6.method4698(arg1 - var6.field3774 / 2, arg2 - var6.field3775 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class282.method4596(arg1, arg2, 15, 16776960, 128);
            class282.method4596(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("al.ae(Lao;IIFI)V")
    public void method323(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field477[arg0.field535];
        this.method339(var5, arg1, arg2);
        this.method340(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("al.az(Lij;III)V")
    public void method339(class243 arg0, int arg1, int arg2) {
        class286 var4 = arg0.method3920(false);
        if (var4 != null) {
            int var5 = this.method344(var4, arg0.field3267);
            int var6 = this.method332(var4, arg0.field3281);
            var4.method4698(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("al.ar(Lao;Lij;IIFI)V")
    public void method340(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field538 != null && arg0.field538.field470.method144(arg4)) {
            class264 var6 = (class264) this.field488.get(arg0.field538.field470);
            var6.method4435(arg0.field538.field469, arg2 - arg0.field538.field467 / 2, arg3, arg0.field538.field467, arg0.field538.field468, 0xFF000000 | arg1.field3272, 0, 1, 0, var6.field3627 / 2);
        }
    }

    @ObfuscatedName("al.ai(IILjava/util/HashSet;II)V")
    public void method341(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field486.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field532.field2595 % 64;
            int var9 = var7.field532.field2597 % 64;
            var7.field536 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field537 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field535)) {
                this.method323(var7, var7.field536, var7.field537, var5);
            }
        }
    }

    @ObfuscatedName("al.ap(B)V")
    public void method449() {
        if (this.field496 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method371(var1, var2, this.field496);
                }
            }
            return;
        }
        Iterator var3 = this.field481.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method564() * 8; var5 < var4.method564() * 8 + 8; var5++) {
                for (int var6 = var4.method572() * 8; var6 < var4.method572() * 8 + 8; var6++) {
                    this.method371(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("al.al(IILam;B)V")
    public void method371(int arg0, int arg1, class29 arg2) {
        field489.method3599(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field407; var4++) {
            class32[] var5 = arg2.field412[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method402(var8.field445);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field487.get(field489);
                        if (var10 != null) {
                            if (var9.field3284 != var10.field535) {
                                class40 var11 = new class40(var9.field3284, var10.field542, var10.field532, this.method401(var9));
                                this.field487.put(new class213(field489), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field542.field2596 - var10.field532.field2596;
                            var10.field532.field2596 = var4;
                            var10.field542.field2596 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field478 * 64 + arg0, this.field495 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field496 == null) {
                            Iterator var15 = this.field481.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method559(arg0, arg1)) {
                                    var14 = new class213(var16.field406 + var4, var16.field417 * 64 + arg0 + var16.method563() * 8, var16.field403 * 64 + arg1 + var16.method565() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field496.field406 + var4, this.field496.field417 * 64 + arg0, this.field496.field403 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3284, var14, var13, this.method401(var9));
                            this.field487.put(new class213(field489), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field487.remove(field489);
    }

    @ObfuscatedName("al.aw(Lje;Liy;I)I")
    public int method344(class286 arg0, class258 arg1) {
        switch(arg1.field3521) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3774 / 2;
            default:
                return -arg0.field3774;
        }
    }

    @ObfuscatedName("al.ak(Lje;Lip;S)I")
    public int method332(class286 arg0, class240 arg1) {
        switch(arg1.field3249) {
            case 0:
                return 0;
            case 2:
                return -arg0.field3775 / 2;
            default:
                return -arg0.field3775;
        }
    }

    @ObfuscatedName("al.ax(II)Lij;")
    public class243 method402(int arg0) {
        class256 var2 = class256.method4379(arg0);
        if (var2.field3437 != null) {
            var2 = var2.method4154();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3458 == -1 ? null : Statics.field477[var2.field3458];
    }

    @ObfuscatedName("al.at(IB)Lap;")
    public class34 method347(int arg0) {
        class243 var2 = Statics.field477[arg0];
        return this.method401(var2);
    }

    @ObfuscatedName("al.ao(Lij;I)Lap;")
    public class34 method401(class243 arg0) {
        if (arg0.field3270 == null || this.field488 == null || this.field488.get(class25.field359) == null) {
            return null;
        }
        class25 var2 = class25.method145(arg0.field3269);
        if (var2 == null) {
            return null;
        }
        class264 var3 = (class264) this.field488.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4399(arg0.field3270, 1000000);
        String[] var5 = new String[var4];
        var3.method4419(arg0.field3270, (int[]) null, var5);
        int var6 = var5.length * var3.field3627 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4446(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class34(arg0.field3270, var7, var6, var2);
    }

    @ObfuscatedName("al.aq(IIIIII)Ljava/util/List;")
    public List method349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field487.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method479(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field486.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method479(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("al.ab(I)Ljava/util/List;")
    public List method350() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field486);
        var1.addAll(this.field487.values());
        return var1;
    }

    @ObfuscatedName("al.as(IIIII)V")
    public void method351(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class282.method4583(this.field483 * arg0, this.field483 * (63 - arg1), this.field483, arg3);
        }
        if (var5 == 1) {
            class282.method4609(this.field483 * arg0, this.field483 * (63 - arg1), this.field483, arg3);
        }
        if (var5 == 2) {
            class282.method4583(this.field483 * arg0 + this.field483 - 1, this.field483 * (63 - arg1), this.field483, arg3);
        }
        if (var5 == 3) {
            class282.method4609(this.field483 * arg0, this.field483 * (63 - arg1) + this.field483 - 1, this.field483, arg3);
        }
    }

    @ObfuscatedName("al.av(IIS)I")
    public int method352(int arg0, int arg1) {
        if (this.field496 != null) {
            return this.field496.method210(arg0, arg1);
        }
        if (!this.field481.isEmpty()) {
            Iterator var3 = this.field481.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method559(arg0, arg1)) {
                    return var4.method210(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
