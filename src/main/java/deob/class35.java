package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("aq")
public class class35 {

    @ObfuscatedName("aq.p")
    public int field498;

    @ObfuscatedName("aq.q")
    public int field499;

    @ObfuscatedName("aq.s")
    public class23 field500;

    @ObfuscatedName("aq.r")
    public LinkedList field510;

    @ObfuscatedName("aq.g")
    public int field502;

    @ObfuscatedName("aq.v")
    public int field501;

    @ObfuscatedName("aq.t")
    public int[][] field504;

    @ObfuscatedName("aq.y")
    public class287 field496;

    @ObfuscatedName("aq.o")
    public List field506;

    @ObfuscatedName("aq.i")
    public HashMap field507;

    @ObfuscatedName("aq.u")
    public final HashMap field508;

    @ObfuscatedName("aq.b")
    public static final class213 field503 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field498 = arg0;
        this.field499 = arg1;
        this.field510 = new LinkedList();
        this.field506 = new LinkedList();
        this.field507 = new HashMap();
        this.field502 = arg2 | 0xFF000000;
        this.field508 = arg3;
    }

    @ObfuscatedName("aq.d(IIIB)V")
    public void method308(int arg0, int arg1, int arg2) {
        if (this.field496 == null) {
            return;
        }
        if (this.field501 * 64 == arg2) {
            this.field496.method4795(arg0, arg1);
        } else {
            this.field496.method4812(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("aq.k(Ll;Ljava/util/List;B)V")
    public void method309(class23 arg0, List arg1) {
        this.field507.clear();
        this.field500 = arg0;
        this.method430(0, 0, 64, 64, this.field500);
        this.method312(arg1);
    }

    @ObfuscatedName("aq.e(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method310(HashSet arg0, List arg1) {
        this.field507.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method206() == this.field498 && var4.method207() == this.field499) {
                this.field510.add(var4);
                this.method430(var4.method569() * 8, var4.method570() * 8, 8, 8, var4);
            }
        }
        this.method312(arg1);
    }

    @ObfuscatedName("aq.p(IIIILah;I)V")
    public void method430(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field420; var9++) {
                    class32[] var10 = arg4.field425[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method341(var13.field456);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field498 * 64 + var6, this.field499 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field500 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field426 + var9, var18.field419 * 64 + var6 + var18.method579() * 8, var18.field427 * 64 + var7 + var18.method566() * 8);
                                } else {
                                    var17 = new class213(this.field500.field426 + var9, this.field500.field419 * 64 + var6, this.field500.field427 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3293, var17, var15, this.method351(var14));
                                this.field507.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.q(Ljava/util/List;I)V")
    public void method312(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field378.field2628 >> 6 == this.field498 && var3.field378.field2625 >> 6 == this.field499) {
                class40 var4 = new class40(var3.field377, var3.field378, var3.field378, this.method342(var3.field377));
                this.field506.add(var4);
            }
        }
    }

    @ObfuscatedName("aq.s(ILax;[Laq;[Ljz;S)Z")
    public boolean method313(int arg0, class47 arg1, class35[] arg2, class286[] arg3) {
        if (!this.method370(arg0)) {
            return false;
        } else if (this.field500 == null && this.field510.isEmpty()) {
            return false;
        } else {
            this.method412(arg2);
            this.field496.method4788();
            if (this.field500 == null) {
                this.method318(arg1, arg3);
            } else {
                this.method322(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("aq.r(IIILjava/util/HashSet;I)V")
    public void method314(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method330(arg0, arg1, arg3, arg2);
        this.method336(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("aq.g(Ljava/util/HashSet;IIB)V")
    public void method378(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field507.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field553)) {
                class243 var6 = Statics.field25[var5.field553];
                this.method332(var6, var5.field556, var5.field554, arg1, arg2);
            }
        }
        this.method331(arg0, arg1, arg2);
    }

    @ObfuscatedName("aq.v(IS)Z")
    public boolean method370(int arg0) {
        if (this.field496 != null && this.field501 == arg0) {
            return false;
        } else {
            this.field501 = arg0;
            this.field496 = new class287(this.field501 * 64, this.field501 * 64);
            return true;
        }
    }

    @ObfuscatedName("aq.t(Lax;[Laq;[Ljz;I)V")
    public void method322(class47 arg0, class35[] arg1, class286[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method320(var4, var5, this.field500, arg0);
                this.method321(var4, var5, this.field500, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method362(var6, var7, this.field500, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("aq.y(Lax;[Ljz;I)V")
    public void method318(class47 arg0, class286[] arg1) {
        Iterator var3 = this.field510.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method569() * 8; var5 < var4.method569() * 8 + 8; var5++) {
                for (int var6 = var4.method570() * 8; var6 < var4.method570() * 8 + 8; var6++) {
                    this.method320(var5, var6, var4, arg0);
                    this.method321(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field510.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method569() * 8; var9 < var8.method569() * 8 + 8; var9++) {
                for (int var10 = var8.method570() * 8; var10 < var8.method570() * 8 + 8; var10++) {
                    this.method362(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("aq.o(IILah;Lax;[Ljz;I)V")
    public void method362(int arg0, int arg1, class29 arg2, class47 arg3, class286[] arg4) {
        this.method329(arg0, arg1, arg2);
        this.method408(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("aq.i(IILah;Lax;B)V")
    public void method320(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field421[0][arg0][arg1] - 1;
        int var6 = arg2.field422[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class283.method4762(this.field501 * arg0, this.field501 * (63 - arg1), this.field501, this.field501, this.field502);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method88(var6, this.field502);
        }
        if (var6 > -1 && arg2.field423[0][arg0][arg1] == 0) {
            class283.method4762(this.field501 * arg0, this.field501 * (63 - arg1), this.field501, this.field501, var7);
            return;
        }
        int var8 = this.method327(arg0, arg1, arg2);
        if (var6 == -1) {
            class283.method4762(this.field501 * arg0, this.field501 * (63 - arg1), this.field501, this.field501, var8);
        } else {
            arg3.method601(this.field501 * arg0, this.field501 * (63 - arg1), var8, var7, this.field501, this.field501, arg2.field423[0][arg0][arg1], arg2.field424[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("aq.u(IILah;Lax;I)V")
    public void method321(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field420; var5++) {
            int var6 = arg2.field422[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method88(var6, this.field502);
                if (arg2.field423[var5][arg0][arg1] == 0) {
                    class283.method4762(this.field501 * arg0, this.field501 * (63 - arg1), this.field501, this.field501, var7);
                } else {
                    arg3.method601(this.field501 * arg0, this.field501 * (63 - arg1), 0, var7, this.field501, this.field501, arg2.field423[var5][arg0][arg1], arg2.field424[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("aq.x([Laq;I)Z")
    public boolean method412(class35[] arg0) {
        if (this.field504 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field500 == null) {
            Iterator var3 = this.field510.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method325(var4.method569() * 8, var4.method570() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method325(0, 0, 64, 64, this.field500, var2);
        }
        this.method363(arg0, var2);
        this.method323(var2);
        return true;
    }

    @ObfuscatedName("aq.c(Lao;I)V")
    public void method323(class44 arg0) {
        this.field504 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field504[var2][var3] = arg0.method542(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("aq.h([Laq;Lao;B)V")
    public void method363(class35[] arg0, class44 arg1) {
        class229[] var3 = class229.method2445();
        class229[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class229 var6 = var4[var5];
            if (arg0[var6.method12()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3162) {
                    case 0:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 2:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 4:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 5:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 7:
                        var11 = 59;
                        var9 = 5;
                }
                this.method440(var11, var12, var7, var8, var9, var10, arg0[var6.method12()], arg1);
            }
        }
    }

    @ObfuscatedName("aq.a(IIIILah;Lao;I)V")
    public void method325(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field421[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = Statics.method1065(var9);
                    arg5.method541(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("aq.w(IIIIIILaq;Lao;B)V")
    public void method440(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method347(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = Statics.method1065(var11);
                    arg7.method541(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("aq.n(IILah;I)I")
    public int method327(int arg0, int arg1, class29 arg2) {
        return arg2.field421[0][arg0][arg1] == 0 ? this.field502 : this.field504[arg0][arg1];
    }

    @ObfuscatedName("aq.m(IILah;[Ljz;I)V")
    public void method408(int arg0, int arg1, class29 arg2, class286[] arg3) {
        for (int var5 = 0; var5 < arg2.field420; var5++) {
            class32[] var6 = arg2.field425[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (class222.method4006(var9.field455) || class222.method1787(var9.field455)) {
                        class256 var10 = class256.method2710(var9.field456);
                        if (var10.field3450 != -1) {
                            if (var10.field3450 == 46 || var10.field3450 == 52) {
                                arg3[var10.field3450].method4771(this.field501 * arg0, this.field501 * (63 - arg1), this.field501 * 2 + 1, this.field501 * 2 + 1);
                            } else {
                                arg3[var10.field3450].method4771(this.field501 * arg0, this.field501 * (63 - arg1), this.field501 * 2, this.field501 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.ae(IILah;I)V")
    public void method329(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field420; var4++) {
            class32[] var5 = arg2.field425[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field455;
                    boolean var10 = var9 >= class222.field2835.field2839 && var9 <= class222.field2819.field2839 || class222.field2820.field2839 == var9;
                    if (var10) {
                        class256 var11 = class256.method2710(var8.field456);
                        int var12 = var11.field3440 == 0 ? -3355444 : -3407872;
                        if (class222.field2835.field2839 == var8.field455) {
                            this.method346(arg0, arg1, var8.field462, var12);
                        }
                        if (class222.field2818.field2839 == var8.field455) {
                            this.method346(arg0, arg1, var8.field462, -3355444);
                            this.method346(arg0, arg1, var8.field462 + 1, var12);
                        }
                        if (class222.field2819.field2839 == var8.field455) {
                            if (var8.field462 == 0) {
                                class283.method4696(this.field501 * arg0, this.field501 * (63 - arg1), 1, var12);
                            }
                            if (var8.field462 == 1) {
                                class283.method4696(this.field501 * arg0 + this.field501 - 1, this.field501 * (63 - arg1), 1, var12);
                            }
                            if (var8.field462 == 2) {
                                class283.method4696(this.field501 * arg0 + this.field501 - 1, this.field501 * (63 - arg1) + this.field501 - 1, 1, var12);
                            }
                            if (var8.field462 == 3) {
                                class283.method4696(this.field501 * arg0, this.field501 * (63 - arg1) + this.field501 - 1, 1, var12);
                            }
                        }
                        if (class222.field2820.field2839 == var8.field455) {
                            int var13 = var8.field462 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field501; var14++) {
                                    class283.method4696(this.field501 * arg0 + var14, this.field501 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field501; var15++) {
                                    class283.method4696(this.field501 * arg0 + var15, this.field501 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.ai(IILjava/util/HashSet;II)V")
    public void method330(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field507.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2628 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2625 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field556 = var10;
                var12.field554 = var11;
                class243 var13 = Statics.field25[var12.field553];
                if (!arg2.contains(var13.method4039())) {
                    this.method343(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("aq.ah(Ljava/util/HashSet;III)V")
    public void method331(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field506.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field25[var5.field553];
            if (var6 != null && arg0.contains(var6.method4039())) {
                this.method332(var6, var5.field556, var5.field554, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("aq.ab(Lie;IIIII)V")
    public void method332(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class287 var6 = arg0.method4037(false);
        if (var6 == null) {
            return;
        }
        var6.method4794(arg1 - var6.field3798 / 2, arg2 - var6.field3801 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class283.method4687(arg1, arg2, 15, 16776960, 128);
            class283.method4687(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("aq.ad(Lar;IIFI)V")
    public void method343(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field25[arg0.field553];
        this.method448(var5, arg1, arg2);
        this.method335(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("aq.ag(Lie;III)V")
    public void method448(class243 arg0, int arg1, int arg2) {
        class287 var4 = arg0.method4037(false);
        if (var4 != null) {
            int var5 = this.method339(var4, arg0.field3290);
            int var6 = this.method340(var4, arg0.field3306);
            var4.method4794(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("aq.as(Lar;Lie;IIFB)V")
    public void method335(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field557 != null && arg0.field557.field486.method158(arg4)) {
            class264 var6 = (class264) this.field508.get(arg0.field557.field486);
            var6.method4484(arg0.field557.field487, arg2 - arg0.field557.field488 / 2, arg3, arg0.field557.field488, arg0.field557.field485, 0xFF000000 | arg1.field3297, 0, 1, 0, var6.field3642 / 2);
        }
    }

    @ObfuscatedName("aq.af(IILjava/util/HashSet;II)V")
    public void method336(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field506.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field548.field2628 % 64;
            int var9 = var7.field548.field2625 % 64;
            var7.field556 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field554 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field553)) {
                this.method343(var7, var7.field556, var7.field554, var5);
            }
        }
    }

    @ObfuscatedName("aq.aq(B)V")
    public void method334() {
        if (this.field500 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method428(var1, var2, this.field500);
                }
            }
            return;
        }
        Iterator var3 = this.field510.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method569() * 8; var5 < var4.method569() * 8 + 8; var5++) {
                for (int var6 = var4.method570() * 8; var6 < var4.method570() * 8 + 8; var6++) {
                    this.method428(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("aq.am(IILah;B)V")
    public void method428(int arg0, int arg1, class29 arg2) {
        field503.method3717(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field420; var4++) {
            class32[] var5 = arg2.field425[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method341(var8.field456);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field507.get(field503);
                        if (var10 != null) {
                            if (var9.field3293 != var10.field553) {
                                class40 var11 = new class40(var9.field3293, var10.field549, var10.field548, this.method351(var9));
                                this.field507.put(new class213(field503), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field549.field2626 - var10.field548.field2626;
                            var10.field548.field2626 = var4;
                            var10.field549.field2626 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field498 * 64 + arg0, this.field499 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field500 == null) {
                            Iterator var15 = this.field510.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method565(arg0, arg1)) {
                                    var14 = new class213(var16.field426 + var4, var16.field419 * 64 + arg0 + var16.method579() * 8, var16.field427 * 64 + arg1 + var16.method566() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field500.field426 + var4, this.field500.field419 * 64 + arg0, this.field500.field427 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3293, var14, var13, this.method351(var9));
                            this.field507.put(new class213(field503), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field507.remove(field503);
    }

    @ObfuscatedName("aq.az(Lkr;Liy;I)I")
    public int method339(class287 arg0, class258 arg1) {
        switch(arg1.field3548) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3798 / 2;
            default:
                return -arg0.field3798;
        }
    }

    @ObfuscatedName("aq.av(Lkr;Lir;I)I")
    public int method340(class287 arg0, class240 arg1) {
        switch(arg1.field3276) {
            case 0:
                return -arg0.field3801 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3801;
        }
    }

    @ObfuscatedName("aq.an(II)Lie;")
    public class243 method341(int arg0) {
        class256 var2 = class256.method2710(arg0);
        if (var2.field3486 != null) {
            var2 = var2.method4300();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3467 == -1 ? null : Statics.field25[var2.field3467];
    }

    @ObfuscatedName("aq.ar(IB)Laf;")
    public class34 method342(int arg0) {
        class243 var2 = Statics.field25[arg0];
        return this.method351(var2);
    }

    @ObfuscatedName("aq.aa(Lie;I)Laf;")
    public class34 method351(class243 arg0) {
        if (arg0.field3296 == null || this.field508 == null || this.field508.get(class25.field365) == null) {
            return null;
        }
        int var2 = arg0.field3299;
        class25[] var3 = new class25[] { class25.field365, class25.field367, class25.field363 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field362 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class264 var9 = (class264) this.field508.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4478(arg0.field3296, 1000000);
        String[] var11 = new String[var10];
        var9.method4476(arg0.field3296, (int[]) null, var11);
        int var12 = var11.length * var9.field3642 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4552(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class34(arg0.field3296, var13, var12, var7);
    }

    @ObfuscatedName("aq.aj(IIIIIB)Ljava/util/List;")
    public List method344(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field507.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method475(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field506.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method475(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("aq.ap(B)Ljava/util/List;")
    public List method345() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field506);
        var1.addAll(this.field507.values());
        return var1;
    }

    @ObfuscatedName("aq.ao(IIIIB)V")
    public void method346(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class283.method4761(this.field501 * arg0, this.field501 * (63 - arg1), this.field501, arg3);
        }
        if (var5 == 1) {
            class283.method4696(this.field501 * arg0, this.field501 * (63 - arg1), this.field501, arg3);
        }
        if (var5 == 2) {
            class283.method4761(this.field501 * arg0 + this.field501 - 1, this.field501 * (63 - arg1), this.field501, arg3);
        }
        if (var5 == 3) {
            class283.method4696(this.field501 * arg0, this.field501 * (63 - arg1) + this.field501 - 1, this.field501, arg3);
        }
    }

    @ObfuscatedName("aq.at(IIB)I")
    public int method347(int arg0, int arg1) {
        if (this.field500 != null) {
            return this.field500.method203(arg0, arg1);
        }
        if (!this.field510.isEmpty()) {
            Iterator var3 = this.field510.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method565(arg0, arg1)) {
                    return var4.method203(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
