package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ak")
public class class35 {

    @ObfuscatedName("ak.h")
    public int field463;

    @ObfuscatedName("ak.i")
    public int field469;

    @ObfuscatedName("ak.w")
    public class23 field452;

    @ObfuscatedName("ak.t")
    public LinkedList field458;

    @ObfuscatedName("ak.d")
    public int field459;

    @ObfuscatedName("ak.z")
    public int field460;

    @ObfuscatedName("ak.k")
    public int[][] field461;

    @ObfuscatedName("ak.c")
    public class310 field462;

    @ObfuscatedName("ak.o")
    public List field456;

    @ObfuscatedName("ak.l")
    public HashMap field457;

    @ObfuscatedName("ak.f")
    public final HashMap field464;

    @ObfuscatedName("ak.q")
    public static final class224 field466 = new class224();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field463 = arg0;
        this.field469 = arg1;
        this.field458 = new LinkedList();
        this.field456 = new LinkedList();
        this.field457 = new HashMap();
        this.field459 = arg2 | 0xFF000000;
        this.field464 = arg3;
    }

    @ObfuscatedName("ak.s(IIIB)V")
    public void method366(int arg0, int arg1, int arg2) {
        if (this.field462 == null) {
            return;
        }
        if (this.field460 * 64 == arg2) {
            this.field462.method5300(arg0, arg1);
        } else {
            this.field462.method5317(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ak.g(Lj;Ljava/util/List;I)V")
    public void method316(class23 arg0, List arg1) {
        this.field457.clear();
        this.field452 = arg0;
        this.method318(0, 0, 64, 64, this.field452);
        this.method343(arg1);
    }

    @ObfuscatedName("ak.m(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method317(HashSet arg0, List arg1) {
        this.field457.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method211() == this.field463 && var4.method212() == this.field469) {
                this.field458.add(var4);
                this.method318(var4.method540() * 8, var4.method545() * 8, 8, 8, var4);
            }
        }
        this.method343(arg1);
    }

    @ObfuscatedName("ak.h(IIIILaq;I)V")
    public void method318(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class224 var8 = new class224(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field394; var9++) {
                    class32[] var10 = arg4.field393[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class254 var14 = this.method347(var13.field420);
                            if (var14 != null) {
                                class224 var15 = new class224(var9, this.field463 * 64 + var6, this.field469 * 64 + var7);
                                Object var16 = null;
                                class224 var17;
                                if (this.field452 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class224(var18.field392 + var9, var18.field399 * 64 + var6 + var18.method560() * 8, var18.field390 * 64 + var7 + var18.method563() * 8);
                                } else {
                                    var17 = new class224(this.field452.field392 + var9, this.field452.field399 * 64 + var6, this.field452.field390 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3380, var17, var15, this.method349(var14));
                                this.field457.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.i(Ljava/util/List;I)V")
    public void method343(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field354.field2718 >> 6 == this.field463 && var3.field354.field2716 >> 6 == this.field469) {
                class40 var4 = new class40(var3.field356, var3.field354, var3.field354, this.method348(var3.field356));
                this.field456.add(var4);
            }
        }
    }

    @ObfuscatedName("ak.w(ILap;[Lak;[Lkh;I)Z")
    public boolean method390(int arg0, class47 arg1, class35[] arg2, class309[] arg3) {
        if (!this.method323(arg0)) {
            return false;
        } else if (this.field452 == null && this.field458.isEmpty()) {
            return false;
        } else {
            this.method383(arg2);
            this.field462.method5295();
            if (this.field452 == null) {
                this.method325(arg1, arg3);
            } else {
                this.method328(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ak.t(IIILjava/util/HashSet;I)V")
    public void method315(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method336(arg0, arg1, arg3, arg2);
        this.method342(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ak.d(Ljava/util/HashSet;III)V")
    public void method409(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field457.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field515)) {
                class254 var6 = Statics.field3378[var5.field515];
                this.method338(var6, var5.field507, var5.field508, arg1, arg2);
            }
        }
        this.method417(arg0, arg1, arg2);
    }

    @ObfuscatedName("ak.z(IB)Z")
    public boolean method323(int arg0) {
        if (this.field462 != null && this.field460 == arg0) {
            return false;
        } else {
            this.field460 = arg0;
            this.field462 = new class310(this.field460 * 64, this.field460 * 64);
            return true;
        }
    }

    @ObfuscatedName("ak.k(Lap;[Lak;[Lkh;S)V")
    public void method328(class47 arg0, class35[] arg1, class309[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method410(var4, var5, this.field452, arg0);
                this.method344(var4, var5, this.field452, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method322(var6, var7, this.field452, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ak.c(Lap;[Lkh;I)V")
    public void method325(class47 arg0, class309[] arg1) {
        Iterator var3 = this.field458.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method540() * 8; var5 < var4.method540() * 8 + 8; var5++) {
                for (int var6 = var4.method545() * 8; var6 < var4.method545() * 8 + 8; var6++) {
                    this.method410(var5, var6, var4, arg0);
                    this.method344(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field458.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method540() * 8; var9 < var8.method540() * 8 + 8; var9++) {
                for (int var10 = var8.method545() * 8; var10 < var8.method545() * 8 + 8; var10++) {
                    this.method322(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ak.o(IILaq;Lap;[Lkh;I)V")
    public void method322(int arg0, int arg1, class29 arg2, class47 arg3, class309[] arg4) {
        this.method335(arg0, arg1, arg2);
        this.method441(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ak.l(IILaq;Lap;B)V")
    public void method410(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field389[0][arg0][arg1] - 1;
        int var6 = arg2.field396[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class306.method5225(this.field460 * arg0, this.field460 * (63 - arg1), this.field460, this.field460, this.field459);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method4(var6, this.field459);
        }
        if (var6 > -1 && arg2.field397[0][arg0][arg1] == 0) {
            class306.method5225(this.field460 * arg0, this.field460 * (63 - arg1), this.field460, this.field460, var7);
            return;
        }
        int var8 = this.method333(arg0, arg1, arg2);
        if (var6 == -1) {
            class306.method5225(this.field460 * arg0, this.field460 * (63 - arg1), this.field460, this.field460, var8);
        } else {
            arg3.method566(this.field460 * arg0, this.field460 * (63 - arg1), var8, var7, this.field460, this.field460, arg2.field397[0][arg0][arg1], arg2.field398[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ak.f(IILaq;Lap;I)V")
    public void method344(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field394; var5++) {
            int var6 = arg2.field396[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method4(var6, this.field459);
                if (arg2.field397[var5][arg0][arg1] == 0) {
                    class306.method5225(this.field460 * arg0, this.field460 * (63 - arg1), this.field460, this.field460, var7);
                } else {
                    arg3.method566(this.field460 * arg0, this.field460 * (63 - arg1), 0, var7, this.field460, this.field460, arg2.field397[var5][arg0][arg1], arg2.field398[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ak.q([Lak;I)Z")
    public boolean method383(class35[] arg0) {
        if (this.field461 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field452 == null) {
            Iterator var3 = this.field458.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method345(var4.method540() * 8, var4.method545() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method345(0, 0, 64, 64, this.field452, var2);
        }
        this.method330(arg0, var2);
        this.method329(var2);
        return true;
    }

    @ObfuscatedName("ak.r(Lao;I)V")
    public void method329(class44 arg0) {
        this.field461 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field461[var2][var3] = arg0.method524(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ak.x([Lak;Lao;I)V")
    public void method330(class35[] arg0, class44 arg1) {
        class240[] var3 = class240.method1905();
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
                switch(var6.field3253) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 2:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 4:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 5:
                        var12 = 59;
                        var10 = 5;
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
                        var11 = 59;
                        var9 = 5;
                }
                this.method319(var11, var12, var7, var8, var9, var10, arg0[var6.method10()], arg1);
            }
        }
    }

    @ObfuscatedName("ak.u(IIIILaq;Lao;I)V")
    public void method345(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field389[0][var7][var8] - 1;
                if (var9 != -1) {
                    class258 var10 = class258.method1084(var9);
                    arg5.method523(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ak.a(IIIIIILak;Lao;S)V")
    public void method319(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method353(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class258 var12 = class258.method1084(var11);
                    arg7.method523(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ak.ad(IILaq;I)I")
    public int method333(int arg0, int arg1, class29 arg2) {
        return arg2.field389[0][arg0][arg1] == 0 ? this.field459 : this.field461[arg0][arg1];
    }

    @ObfuscatedName("ak.al(IILaq;[Lkh;I)V")
    public void method441(int arg0, int arg1, class29 arg2, class309[] arg3) {
        for (int var5 = 0; var5 < arg2.field394; var5++) {
            class32[] var6 = arg2.field393[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class233.method1025(var9.field424)) {
                        int var10 = var9.field424;
                        boolean var11 = class233.field2923.field2939 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class267 var12 = class267.method4025(var9.field420);
                    if (var12.field3538 != -1) {
                        if (var12.field3538 == 46 || var12.field3538 == 52) {
                            arg3[var12.field3538].method5273(this.field460 * arg0, this.field460 * (63 - arg1), this.field460 * 2 + 1, this.field460 * 2 + 1);
                        } else {
                            arg3[var12.field3538].method5273(this.field460 * arg0, this.field460 * (63 - arg1), this.field460 * 2, this.field460 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.aq(IILaq;I)V")
    public void method335(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field394; var4++) {
            class32[] var5 = arg2.field393[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class233.method528(var8.field424)) {
                        class267 var9 = class267.method4025(var8.field420);
                        int var10 = var9.field3548 == 0 ? -3355444 : -3407872;
                        if (class233.field2938.field2939 == var8.field424) {
                            this.method352(arg0, arg1, var8.field422, var10);
                        }
                        if (class233.field2931.field2939 == var8.field424) {
                            this.method352(arg0, arg1, var8.field422, -3355444);
                            this.method352(arg0, arg1, var8.field422 + 1, var10);
                        }
                        if (class233.field2919.field2939 == var8.field424) {
                            if (var8.field422 == 0) {
                                class306.method5198(this.field460 * arg0, this.field460 * (63 - arg1), 1, var10);
                            }
                            if (var8.field422 == 1) {
                                class306.method5198(this.field460 * arg0 + this.field460 - 1, this.field460 * (63 - arg1), 1, var10);
                            }
                            if (var8.field422 == 2) {
                                class306.method5198(this.field460 * arg0 + this.field460 - 1, this.field460 * (63 - arg1) + this.field460 - 1, 1, var10);
                            }
                            if (var8.field422 == 3) {
                                class306.method5198(this.field460 * arg0, this.field460 * (63 - arg1) + this.field460 - 1, 1, var10);
                            }
                        }
                        if (class233.field2920.field2939 == var8.field424) {
                            int var11 = var8.field422 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field460; var12++) {
                                    class306.method5198(this.field460 * arg0 + var12, this.field460 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field460; var13++) {
                                    class306.method5198(this.field460 * arg0 + var13, this.field460 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ak.ar(IILjava/util/HashSet;II)V")
    public void method336(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field457.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class224 var9 = (class224) var8.getKey();
            int var10 = (int) ((float) var9.field2718 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2716 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field507 = var10;
                var12.field508 = var11;
                class254 var13 = Statics.field3378[var12.field515];
                if (!arg2.contains(var13.method4356())) {
                    this.method339(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ak.an(Ljava/util/HashSet;III)V")
    public void method417(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field456.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class254 var6 = Statics.field3378[var5.field515];
            if (var6 != null && arg0.contains(var6.method4356())) {
                this.method338(var6, var5.field507, var5.field508, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ak.af(Lip;IIIII)V")
    public void method338(class254 arg0, int arg1, int arg2, int arg3, int arg4) {
        class310 var6 = arg0.method4354(false);
        if (var6 == null) {
            return;
        }
        var6.method5302(arg1 - var6.field3900 / 2, arg2 - var6.field3899 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class306.method5187(arg1, arg2, 15, 16776960, 128);
            class306.method5187(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ak.as(Lah;IIFI)V")
    public void method339(class40 arg0, int arg1, int arg2, float arg3) {
        class254 var5 = Statics.field3378[arg0.field515];
        this.method340(var5, arg1, arg2);
        this.method341(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ak.ax(Lip;IIB)V")
    public void method340(class254 arg0, int arg1, int arg2) {
        class310 var4 = arg0.method4354(false);
        if (var4 != null) {
            int var5 = this.method429(var4, arg0.field3385);
            int var6 = this.method346(var4, arg0.field3376);
            var4.method5302(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ak.ak(Lah;Lip;IIFI)V")
    public void method341(class40 arg0, class254 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field512 != null && arg0.field512.field445.method171(arg4)) {
            class287 var6 = (class287) this.field464.get(arg0.field512.field445);
            var6.method5007(arg0.field512.field448, arg2 - arg0.field512.field443 / 2, arg3, arg0.field512.field443, arg0.field512.field444, 0xFF000000 | arg1.field3384, 0, 1, 0, var6.field3782 / 2);
        }
    }

    @ObfuscatedName("ak.aw(IILjava/util/HashSet;II)V")
    public void method342(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field456.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field510.field2718 % 64;
            int var9 = var7.field510.field2716 % 64;
            var7.field507 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field508 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field515)) {
                this.method339(var7, var7.field507, var7.field508, var5);
            }
        }
    }

    @ObfuscatedName("ak.ai(I)V")
    public void method337() {
        if (this.field452 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method395(var1, var2, this.field452);
                }
            }
            return;
        }
        Iterator var3 = this.field458.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method540() * 8; var5 < var4.method540() * 8 + 8; var5++) {
                for (int var6 = var4.method545() * 8; var6 < var4.method545() * 8 + 8; var6++) {
                    this.method395(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ak.ab(IILaq;I)V")
    public void method395(int arg0, int arg1, class29 arg2) {
        field466.method4064(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field394; var4++) {
            class32[] var5 = arg2.field393[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class254 var9 = this.method347(var8.field420);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field457.get(field466);
                        if (var10 != null) {
                            if (var9.field3380 != var10.field515) {
                                class40 var11 = new class40(var9.field3380, var10.field505, var10.field510, this.method349(var9));
                                this.field457.put(new class224(field466), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field505.field2717 - var10.field510.field2717;
                            var10.field510.field2717 = var4;
                            var10.field505.field2717 = var4 + var12;
                            return;
                        }
                        class224 var13 = new class224(var4, this.field463 * 64 + arg0, this.field469 * 64 + arg1);
                        class224 var14 = null;
                        if (this.field452 == null) {
                            Iterator var15 = this.field458.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method541(arg0, arg1)) {
                                    var14 = new class224(var16.field392 + var4, var16.field399 * 64 + arg0 + var16.method560() * 8, var16.field390 * 64 + arg1 + var16.method563() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class224(this.field452.field392 + var4, this.field452.field399 * 64 + arg0, this.field452.field390 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3380, var14, var13, this.method349(var9));
                            this.field457.put(new class224(field466), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field457.remove(field466);
    }

    @ObfuscatedName("ak.am(Lki;Ljo;I)I")
    public int method429(class310 arg0, class269 arg1) {
        switch(arg1.field3622) {
            case 0:
                return -arg0.field3900 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3900;
        }
    }

    @ObfuscatedName("ak.ah(Lki;Lif;S)I")
    public int method346(class310 arg0, class251 arg1) {
        switch(arg1.field3363) {
            case 0:
                return -arg0.field3899 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3899;
        }
    }

    @ObfuscatedName("ak.ag(II)Lip;")
    public class254 method347(int arg0) {
        class267 var2 = class267.method4025(arg0);
        if (var2.field3559 != null) {
            var2 = var2.method4596();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3546 == -1 ? null : Statics.field3378[var2.field3546];
    }

    @ObfuscatedName("ak.az(II)Lax;")
    public class34 method348(int arg0) {
        class254 var2 = Statics.field3378[arg0];
        return this.method349(var2);
    }

    @ObfuscatedName("ak.ae(Lip;B)Lax;")
    public class34 method349(class254 arg0) {
        if (arg0.field3383 == null || this.field464 == null || this.field464.get(class25.field346) == null) {
            return null;
        }
        class25 var2 = class25.method172(arg0.field3379);
        if (var2 == null) {
            return null;
        }
        class287 var3 = (class287) this.field464.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5001(arg0.field3383, 1000000);
        String[] var5 = new String[var4];
        var3.method4999(arg0.field3383, (int[]) null, var5);
        int var6 = var5.length * var3.field3782 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4998(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class34(arg0.field3383, var7, var6, var2);
    }

    @ObfuscatedName("ak.ao(IIIIII)Ljava/util/List;")
    public List method350(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field457.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method470(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field456.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method470(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ak.av(B)Ljava/util/List;")
    public List method351() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field456);
        var1.addAll(this.field457.values());
        return var1;
    }

    @ObfuscatedName("ak.aj(IIIII)V")
    public void method352(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class306.method5200(this.field460 * arg0, this.field460 * (63 - arg1), this.field460, arg3);
        }
        if (var5 == 1) {
            class306.method5198(this.field460 * arg0, this.field460 * (63 - arg1), this.field460, arg3);
        }
        if (var5 == 2) {
            class306.method5200(this.field460 * arg0 + this.field460 - 1, this.field460 * (63 - arg1), this.field460, arg3);
        }
        if (var5 == 3) {
            class306.method5198(this.field460 * arg0, this.field460 * (63 - arg1) + this.field460 - 1, this.field460, arg3);
        }
    }

    @ObfuscatedName("ak.ap(IIB)I")
    public int method353(int arg0, int arg1) {
        if (this.field452 != null) {
            return this.field452.method210(arg0, arg1);
        }
        if (!this.field458.isEmpty()) {
            Iterator var3 = this.field458.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method541(arg0, arg1)) {
                    return var4.method210(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
