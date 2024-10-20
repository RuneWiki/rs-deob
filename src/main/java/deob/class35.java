package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ai")
public class class35 {

    @ObfuscatedName("ai.s")
    public int field446;

    @ObfuscatedName("ai.j")
    public int field447;

    @ObfuscatedName("ai.a")
    public class23 field448;

    @ObfuscatedName("ai.t")
    public LinkedList field449;

    @ObfuscatedName("ai.r")
    public int field451;

    @ObfuscatedName("ai.m")
    public int field458;

    @ObfuscatedName("ai.h")
    public int[][] field455;

    @ObfuscatedName("ai.o")
    public class310 field453;

    @ObfuscatedName("ai.x")
    public List field454;

    @ObfuscatedName("ai.q")
    public HashMap field444;

    @ObfuscatedName("ai.v")
    public final HashMap field456;

    @ObfuscatedName("ai.n")
    public static final class224 field457 = new class224();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field446 = arg0;
        this.field447 = arg1;
        this.field449 = new LinkedList();
        this.field454 = new LinkedList();
        this.field444 = new HashMap();
        this.field451 = arg2 | 0xFF000000;
        this.field456 = arg3;
    }

    @ObfuscatedName("ai.p(IIII)V")
    public void method335(int arg0, int arg1, int arg2) {
        if (this.field453 == null) {
            return;
        }
        if (this.field458 * 64 == arg2) {
            this.field453.method5121(arg0, arg1);
        } else {
            this.field453.method5138(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ai.i(Lg;Ljava/util/List;S)V")
    public void method336(class23 arg0, List arg1) {
        this.field444.clear();
        this.field448 = arg0;
        this.method338(0, 0, 64, 64, this.field448);
        this.method339(arg1);
    }

    @ObfuscatedName("ai.w(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method337(HashSet arg0, List arg1) {
        this.field444.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method226() == this.field446 && var4.method222() == this.field447) {
                this.field449.add(var4);
                this.method338(var4.method576() * 8, var4.method583() * 8, 8, 8, var4);
            }
        }
        this.method339(arg1);
    }

    @ObfuscatedName("ai.s(IIIILao;I)V")
    public void method338(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class224 var8 = new class224(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field382; var9++) {
                    class32[] var10 = arg4.field386[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class254 var14 = this.method430(var13.field413);
                            if (var14 != null) {
                                class224 var15 = new class224(var9, this.field446 * 64 + var6, this.field447 * 64 + var7);
                                Object var16 = null;
                                class224 var17;
                                if (this.field448 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class224(var18.field380 + var9, var18.field385 * 64 + var6 + var18.method558() * 8, var18.field377 * 64 + var7 + var18.method562() * 8);
                                } else {
                                    var17 = new class224(this.field448.field380 + var9, this.field448.field385 * 64 + var6, this.field448.field377 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3361, var17, var15, this.method369(var14));
                                this.field444.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.j(Ljava/util/List;I)V")
    public void method339(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field347.field2697 >> 6 == this.field446 && var3.field347.field2698 >> 6 == this.field447) {
                class40 var4 = new class40(var3.field348, var3.field347, var3.field347, this.method459(var3.field348));
                this.field454.add(var4);
            }
        }
    }

    @ObfuscatedName("ai.a(ILak;[Lai;[Lkh;I)Z")
    public boolean method340(int arg0, class47 arg1, class35[] arg2, class309[] arg3) {
        if (!this.method433(arg0)) {
            return false;
        } else if (this.field448 == null && this.field449.isEmpty()) {
            return false;
        } else {
            this.method349(arg2);
            this.field453.method5114();
            if (this.field448 == null) {
                this.method405(arg1, arg3);
            } else {
                this.method344(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ai.t(IIILjava/util/HashSet;I)V")
    public void method341(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method357(arg0, arg1, arg3, arg2);
        this.method363(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ai.r(Ljava/util/HashSet;IIB)V")
    public void method342(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field444.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field496)) {
                class254 var6 = Statics.field3354[var5.field496];
                this.method423(var6, var5.field500, var5.field495, arg1, arg2);
            }
        }
        this.method358(arg0, arg1, arg2);
    }

    @ObfuscatedName("ai.m(II)Z")
    public boolean method433(int arg0) {
        if (this.field453 != null && this.field458 == arg0) {
            return false;
        } else {
            this.field458 = arg0;
            this.field453 = new class310(this.field458 * 64, this.field458 * 64);
            return true;
        }
    }

    @ObfuscatedName("ai.h(Lak;[Lai;[Lkh;I)V")
    public void method344(class47 arg0, class35[] arg1, class309[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method347(var4, var5, this.field448, arg0);
                this.method348(var4, var5, this.field448, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method364(var6, var7, this.field448, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ai.o(Lak;[Lkh;I)V")
    public void method405(class47 arg0, class309[] arg1) {
        Iterator var3 = this.field449.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method576() * 8; var5 < var4.method576() * 8 + 8; var5++) {
                for (int var6 = var4.method583() * 8; var6 < var4.method583() * 8 + 8; var6++) {
                    this.method347(var5, var6, var4, arg0);
                    this.method348(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field449.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method576() * 8; var9 < var8.method576() * 8 + 8; var9++) {
                for (int var10 = var8.method583() * 8; var10 < var8.method583() * 8 + 8; var10++) {
                    this.method364(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ai.x(IILao;Lak;[Lkh;B)V")
    public void method364(int arg0, int arg1, class29 arg2, class47 arg3, class309[] arg4) {
        this.method356(arg0, arg1, arg2);
        this.method355(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ai.q(IILao;Lak;B)V")
    public void method347(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field381[0][arg0][arg1] - 1;
        int var6 = arg2.field383[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class306.method5002(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, this.field458, this.field451);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            int var8 = this.field451;
            class271 var9 = class271.method4297(var6);
            int var10;
            if (var9 == null) {
                var10 = var8;
            } else if (var9.field3648 >= 0) {
                var10 = var9.field3648 | 0xFF000000;
            } else if (var9.field3646 >= 0) {
                int var11 = class38.method4666(Statics.field1895.method2340(var9.field3646), 96);
                var10 = class134.field1906[var11] | 0xFF000000;
            } else if (var9.field3645 == 16711935) {
                var10 = var8;
            } else {
                int var12 = var9.field3651;
                int var13 = var9.field3650;
                int var14 = var9.field3652;
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
                int var18 = class38.method4666(var15, 96);
                var10 = class134.field1906[var18] | 0xFF000000;
            }
            var7 = var10;
        }
        if (var6 > -1 && arg2.field387[0][arg0][arg1] == 0) {
            class306.method5002(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, this.field458, var7);
            return;
        }
        int var19 = this.method354(arg0, arg1, arg2);
        if (var6 == -1) {
            class306.method5002(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, this.field458, var19);
        } else {
            arg3.method587(this.field458 * arg0, this.field458 * (63 - arg1), var19, var7, this.field458, this.field458, arg2.field387[0][arg0][arg1], arg2.field384[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ai.d(IILao;Lak;I)V")
    public void method348(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field382; var5++) {
            int var6 = arg2.field383[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field451;
                class271 var8 = class271.method4297(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3648 >= 0) {
                    var9 = var8.field3648 | 0xFF000000;
                } else if (var8.field3646 >= 0) {
                    int var10 = class38.method4666(Statics.field1895.method2340(var8.field3646), 96);
                    var9 = class134.field1906[var10] | 0xFF000000;
                } else if (var8.field3645 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = var8.field3651;
                    int var12 = var8.field3650;
                    int var13 = var8.field3652;
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
                    int var17 = class38.method4666(var14, 96);
                    var9 = class134.field1906[var17] | 0xFF000000;
                }
                if (arg2.field387[var5][arg0][arg1] == 0) {
                    class306.method5002(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, this.field458, var9);
                } else {
                    arg3.method587(this.field458 * arg0, this.field458 * (63 - arg1), 0, var9, this.field458, this.field458, arg2.field387[var5][arg0][arg1], arg2.field384[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ai.l([Lai;I)Z")
    public boolean method349(class35[] arg0) {
        if (this.field455 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field448 == null) {
            Iterator var3 = this.field449.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method352(var4.method576() * 8, var4.method583() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method352(0, 0, 64, 64, this.field448, var2);
        }
        this.method351(arg0, var2);
        this.method350(var2);
        return true;
    }

    @ObfuscatedName("ai.f(Lab;B)V")
    public void method350(class44 arg0) {
        this.field455 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field455[var2][var3] = arg0.method542(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ai.k([Lai;Lab;I)V")
    public void method351(class35[] arg0, class44 arg1) {
        class240[] var3 = class240.method1521();
        class240[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class240 var6 = var4[var5];
            if (arg0[var6.method13()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3231) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 2:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 3:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
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
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 6:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var10 = 5;
                }
                this.method346(var11, var12, var7, var8, var9, var10, arg0[var6.method13()], arg1);
            }
        }
    }

    @ObfuscatedName("ai.e(IIIILao;Lab;I)V")
    public void method352(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field381[0][var7][var8] - 1;
                if (var9 != -1) {
                    class258 var10 = class258.method21(var9);
                    arg5.method545(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ai.u(IIIIIILai;Lab;I)V")
    public void method346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method373(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class258 var12 = class258.method21(var11);
                    arg7.method545(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ai.z(IILao;I)I")
    public int method354(int arg0, int arg1, class29 arg2) {
        return arg2.field381[0][arg0][arg1] == 0 ? this.field451 : this.field455[arg0][arg1];
    }

    @ObfuscatedName("ai.b(IILao;[Lkh;S)V")
    public void method355(int arg0, int arg1, class29 arg2, class309[] arg3) {
        for (int var5 = 0; var5 < arg2.field382; var5++) {
            class32[] var6 = arg2.field386[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (!class233.method3058(var9.field415)) {
                        int var10 = var9.field415;
                        boolean var11 = class233.field2915.field2904 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class267 var12 = class267.method2363(var9.field413);
                    if (var12.field3525 != -1) {
                        if (var12.field3525 == 46 || var12.field3525 == 52) {
                            arg3[var12.field3525].method5095(this.field458 * arg0, this.field458 * (63 - arg1), this.field458 * 2 + 1, this.field458 * 2 + 1);
                        } else {
                            arg3[var12.field3525].method5095(this.field458 * arg0, this.field458 * (63 - arg1), this.field458 * 2, this.field458 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.c(IILao;I)V")
    public void method356(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field382; var4++) {
            class32[] var5 = arg2.field386[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    int var9 = var8.field415;
                    boolean var10 = var9 >= class233.field2910.field2904 && var9 <= class233.field2896.field2904 || class233.field2897.field2904 == var9;
                    if (var10) {
                        class267 var11 = class267.method2363(var8.field413);
                        int var12 = var11.field3515 == 0 ? -3355444 : -3407872;
                        if (class233.field2910.field2904 == var8.field415) {
                            this.method372(arg0, arg1, var8.field412, var12);
                        }
                        if (class233.field2893.field2904 == var8.field415) {
                            this.method372(arg0, arg1, var8.field412, -3355444);
                            this.method372(arg0, arg1, var8.field412 + 1, var12);
                        }
                        if (class233.field2896.field2904 == var8.field415) {
                            if (var8.field412 == 0) {
                                class306.method5011(this.field458 * arg0, this.field458 * (63 - arg1), 1, var12);
                            }
                            if (var8.field412 == 1) {
                                class306.method5011(this.field458 * arg0 + this.field458 - 1, this.field458 * (63 - arg1), 1, var12);
                            }
                            if (var8.field412 == 2) {
                                class306.method5011(this.field458 * arg0 + this.field458 - 1, this.field458 * (63 - arg1) + this.field458 - 1, 1, var12);
                            }
                            if (var8.field412 == 3) {
                                class306.method5011(this.field458 * arg0, this.field458 * (63 - arg1) + this.field458 - 1, 1, var12);
                            }
                        }
                        if (class233.field2897.field2904 == var8.field415) {
                            int var13 = var8.field412 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field458; var14++) {
                                    class306.method5011(this.field458 * arg0 + var14, this.field458 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field458; var15++) {
                                    class306.method5011(this.field458 * arg0 + var15, this.field458 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ai.aa(IILjava/util/HashSet;II)V")
    public void method357(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field444.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class224 var9 = (class224) var8.getKey();
            int var10 = (int) ((float) var9.field2697 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2698 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field500 = var10;
                var12.field495 = var11;
                class254 var13 = Statics.field3354[var12.field496];
                if (!arg2.contains(var13.method4202())) {
                    this.method359(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ai.ap(Ljava/util/HashSet;IIB)V")
    public void method358(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field454.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class254 var6 = Statics.field3354[var5.field496];
            if (var6 != null && arg0.contains(var6.method4202())) {
                this.method423(var6, var5.field500, var5.field495, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ai.ao(Liw;IIIII)V")
    public void method423(class254 arg0, int arg1, int arg2, int arg3, int arg4) {
        class310 var6 = arg0.method4201(false);
        if (var6 == null) {
            return;
        }
        var6.method5123(arg1 - var6.field3885 / 2, arg2 - var6.field3882 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class306.method5000(arg1, arg2, 15, 16776960, 128);
            class306.method5000(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ai.ar(Lag;IIFI)V")
    public void method359(class40 arg0, int arg1, int arg2, float arg3) {
        class254 var5 = Statics.field3354[arg0.field496];
        this.method361(var5, arg1, arg2);
        this.method362(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ai.ay(Liw;III)V")
    public void method361(class254 arg0, int arg1, int arg2) {
        class310 var4 = arg0.method4201(false);
        if (var4 != null) {
            int var5 = this.method456(var4, arg0.field3357);
            int var6 = this.method460(var4, arg0.field3371);
            var4.method5123(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ai.ax(Lag;Liw;IIFI)V")
    public void method362(class40 arg0, class254 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field499 != null && arg0.field499.field439.method174(arg4)) {
            class287 var6 = (class287) this.field456.get(arg0.field499.field439);
            var6.method4822(arg0.field499.field440, arg2 - arg0.field499.field436 / 2, arg3, arg0.field499.field436, arg0.field499.field438, 0xFF000000 | arg1.field3362, 0, 1, 0, var6.field3746 / 2);
        }
    }

    @ObfuscatedName("ai.ae(IILjava/util/HashSet;II)V")
    public void method363(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field454.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field497.field2697 % 64;
            int var9 = var7.field497.field2698 % 64;
            var7.field500 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field495 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field496)) {
                this.method359(var7, var7.field500, var7.field495, var5);
            }
        }
    }

    @ObfuscatedName("ai.ah(I)V")
    public void method387() {
        if (this.field448 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method440(var1, var2, this.field448);
                }
            }
            return;
        }
        Iterator var3 = this.field449.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method576() * 8; var5 < var4.method576() * 8 + 8; var5++) {
                for (int var6 = var4.method583() * 8; var6 < var4.method583() * 8 + 8; var6++) {
                    this.method440(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ai.ai(IILao;B)V")
    public void method440(int arg0, int arg1, class29 arg2) {
        field457.method3868(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field382; var4++) {
            class32[] var5 = arg2.field386[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class254 var9 = this.method430(var8.field413);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field444.get(field457);
                        if (var10 != null) {
                            if (var9.field3361 != var10.field496) {
                                class40 var11 = new class40(var9.field3361, var10.field501, var10.field497, this.method369(var9));
                                this.field444.put(new class224(field457), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field501.field2700 - var10.field497.field2700;
                            var10.field497.field2700 = var4;
                            var10.field501.field2700 = var4 + var12;
                            return;
                        }
                        class224 var13 = new class224(var4, this.field446 * 64 + arg0, this.field447 * 64 + arg1);
                        class224 var14 = null;
                        if (this.field448 == null) {
                            Iterator var15 = this.field449.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method560(arg0, arg1)) {
                                    var14 = new class224(var16.field380 + var4, var16.field385 * 64 + arg0 + var16.method558() * 8, var16.field377 * 64 + arg1 + var16.method562() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class224(this.field448.field380 + var4, this.field448.field385 * 64 + arg0, this.field448.field377 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3361, var14, var13, this.method369(var9));
                            this.field444.put(new class224(field457), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field444.remove(field457);
    }

    @ObfuscatedName("ai.au(Lko;Ljl;I)I")
    public int method456(class310 arg0, class269 arg1) {
        switch(arg1.field3602) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3885 / 2;
            default:
                return -arg0.field3885;
        }
    }

    @ObfuscatedName("ai.am(Lko;Lih;I)I")
    public int method460(class310 arg0, class251 arg1) {
        switch(arg1.field3342) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3882 / 2;
            default:
                return -arg0.field3882;
        }
    }

    @ObfuscatedName("ai.af(II)Liw;")
    public class254 method430(int arg0) {
        class267 var2 = class267.method2363(arg0);
        if (var2.field3529 != null) {
            var2 = var2.method4438();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3543 == -1 ? null : Statics.field3354[var2.field3543];
    }

    @ObfuscatedName("ai.an(II)Lah;")
    public class34 method459(int arg0) {
        class254 var2 = Statics.field3354[arg0];
        return this.method369(var2);
    }

    @ObfuscatedName("ai.ag(Liw;B)Lah;")
    public class34 method369(class254 arg0) {
        if (arg0.field3360 == null || this.field456 == null || this.field456.get(class25.field344) == null) {
            return null;
        }
        int var2 = arg0.field3353;
        class25[] var3 = class25.method175();
        int var4 = 0;
        class25 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class25 var5 = var3[var4];
            if (var5.field343 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class287 var8 = (class287) this.field456.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method4813(arg0.field3360, 1000000);
        String[] var10 = new String[var9];
        var8.method4814(arg0.field3360, (int[]) null, var10);
        int var11 = var10.length * var8.field3746 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4848(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class34(arg0.field3360, var12, var11, var6);
    }

    @ObfuscatedName("ai.av(IIIIIB)Ljava/util/List;")
    public List method370(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field444.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method485(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field454.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method485(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ai.aw(I)Ljava/util/List;")
    public List method453() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field454);
        var1.addAll(this.field444.values());
        return var1;
    }

    @ObfuscatedName("ai.ad(IIIIB)V")
    public void method372(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class306.method5065(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, arg3);
        }
        if (var5 == 1) {
            class306.method5011(this.field458 * arg0, this.field458 * (63 - arg1), this.field458, arg3);
        }
        if (var5 == 2) {
            class306.method5065(this.field458 * arg0 + this.field458 - 1, this.field458 * (63 - arg1), this.field458, arg3);
        }
        if (var5 == 3) {
            class306.method5011(this.field458 * arg0, this.field458 * (63 - arg1) + this.field458 - 1, this.field458, arg3);
        }
    }

    @ObfuscatedName("ai.ab(III)I")
    public int method373(int arg0, int arg1) {
        if (this.field448 != null) {
            return this.field448.method225(arg0, arg1);
        }
        if (!this.field449.isEmpty()) {
            Iterator var3 = this.field449.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method560(arg0, arg1)) {
                    return var4.method225(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
