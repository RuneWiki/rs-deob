package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("aq")
public class class35 {

    @ObfuscatedName("aq.r")
    public int field471;

    @ObfuscatedName("aq.v")
    public int field467;

    @ObfuscatedName("aq.e")
    public class23 field468;

    @ObfuscatedName("aq.l")
    public LinkedList field469;

    @ObfuscatedName("aq.s")
    public int field470;

    @ObfuscatedName("aq.w")
    public int field472;

    @ObfuscatedName("aq.p")
    public int[][] field464;

    @ObfuscatedName("aq.m")
    public class286 field473;

    @ObfuscatedName("aq.u")
    public List field474;

    @ObfuscatedName("aq.g")
    public HashMap field466;

    @ObfuscatedName("aq.k")
    public final HashMap field475;

    @ObfuscatedName("aq.t")
    public static final class213 field477 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field471 = arg0;
        this.field467 = arg1;
        this.field469 = new LinkedList();
        this.field474 = new LinkedList();
        this.field466 = new HashMap();
        this.field470 = arg2 | 0xFF000000;
        this.field475 = arg3;
    }

    @ObfuscatedName("aq.a(IIII)V")
    public void method422(int arg0, int arg1, int arg2) {
        if (this.field473 == null) {
            return;
        }
        if (this.field472 * 64 == arg2) {
            this.field473.method4632(arg0, arg1);
        } else {
            this.field473.method4648(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("aq.j(Ld;Ljava/util/List;I)V")
    public void method321(class23 arg0, List arg1) {
        this.field466.clear();
        this.field468 = arg0;
        this.method366(0, 0, 64, 64, this.field468);
        this.method434(arg1);
    }

    @ObfuscatedName("aq.n(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method395(HashSet arg0, List arg1) {
        this.field466.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method214() == this.field471 && var4.method225() == this.field467) {
                this.field469.add(var4);
                this.method366(var4.method557() * 8, var4.method574() * 8, 8, 8, var4);
            }
        }
        this.method434(arg1);
    }

    @ObfuscatedName("aq.r(IIIILau;I)V")
    public void method366(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field405; var9++) {
                    class32[] var10 = arg4.field410[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method352(var13.field437);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field471 * 64 + var6, this.field467 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field468 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field408 + var9, var18.field404 * 64 + var6 + var18.method555() * 8, var18.field401 * 64 + var7 + var18.method558() * 8);
                                } else {
                                    var17 = new class213(this.field468.field408 + var9, this.field468.field404 * 64 + var6, this.field468.field401 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3291, var17, var15, this.method354(var14));
                                this.field466.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.v(Ljava/util/List;I)V")
    public void method434(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field367.field2615 >> 6 == this.field471 && var3.field367.field2618 >> 6 == this.field467) {
                class40 var4 = new class40(var3.field373, var3.field367, var3.field367, this.method353(var3.field373));
                this.field474.add(var4);
            }
        }
    }

    @ObfuscatedName("aq.e(ILah;[Laq;[Ljf;B)Z")
    public boolean method325(int arg0, class47 arg1, class35[] arg2, class285[] arg3) {
        if (!this.method355(arg0)) {
            return false;
        } else if (this.field468 == null && this.field469.isEmpty()) {
            return false;
        } else {
            this.method334(arg2);
            this.field473.method4625();
            if (this.field468 == null) {
                this.method330(arg1, arg3);
            } else {
                this.method329(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("aq.l(IIILjava/util/HashSet;B)V")
    public void method326(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method341(arg0, arg1, arg3, arg2);
        this.method347(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("aq.s(Ljava/util/HashSet;IIB)V")
    public void method327(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field466.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field524)) {
                class243 var6 = Statics.field663[var5.field524];
                this.method343(var6, var5.field522, var5.field516, arg1, arg2);
            }
        }
        this.method359(arg0, arg1, arg2);
    }

    @ObfuscatedName("aq.w(II)Z")
    public boolean method355(int arg0) {
        if (this.field473 != null && this.field472 == arg0) {
            return false;
        } else {
            this.field472 = arg0;
            this.field473 = new class286(this.field472 * 64, this.field472 * 64);
            return true;
        }
    }

    @ObfuscatedName("aq.p(Lah;[Laq;[Ljf;B)V")
    public void method329(class47 arg0, class35[] arg1, class285[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method332(var4, var5, this.field468, arg0);
                this.method333(var4, var5, this.field468, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method331(var6, var7, this.field468, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("aq.m(Lah;[Ljf;I)V")
    public void method330(class47 arg0, class285[] arg1) {
        Iterator var3 = this.field469.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method557() * 8; var5 < var4.method557() * 8 + 8; var5++) {
                for (int var6 = var4.method574() * 8; var6 < var4.method574() * 8 + 8; var6++) {
                    this.method332(var5, var6, var4, arg0);
                    this.method333(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field469.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method557() * 8; var9 < var8.method557() * 8 + 8; var9++) {
                for (int var10 = var8.method574() * 8; var10 < var8.method574() * 8 + 8; var10++) {
                    this.method331(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("aq.u(IILau;Lah;[Ljf;B)V")
    public void method331(int arg0, int arg1, class29 arg2, class47 arg3, class285[] arg4) {
        this.method340(arg0, arg1, arg2);
        this.method335(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("aq.g(IILau;Lah;I)V")
    public void method332(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field406[0][arg0][arg1] - 1;
        int var6 = arg2.field411[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class282.method4582(this.field472 * arg0, this.field472 * (63 - arg1), this.field472, this.field472, this.field470);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            var7 = class38.method311(var6, this.field470);
        }
        if (var6 > -1 && arg2.field407[0][arg0][arg1] == 0) {
            class282.method4582(this.field472 * arg0, this.field472 * (63 - arg1), this.field472, this.field472, var7);
            return;
        }
        int var8 = this.method338(arg0, arg1, arg2);
        if (var6 == -1) {
            class282.method4582(this.field472 * arg0, this.field472 * (63 - arg1), this.field472, this.field472, var8);
        } else {
            arg3.method580(this.field472 * arg0, this.field472 * (63 - arg1), var8, var7, this.field472, this.field472, arg2.field407[0][arg0][arg1], arg2.field409[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("aq.k(IILau;Lah;I)V")
    public void method333(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field405; var5++) {
            int var6 = arg2.field411[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class38.method311(var6, this.field470);
                if (arg2.field407[var5][arg0][arg1] == 0) {
                    class282.method4582(this.field472 * arg0, this.field472 * (63 - arg1), this.field472, this.field472, var7);
                } else {
                    arg3.method580(this.field472 * arg0, this.field472 * (63 - arg1), 0, var7, this.field472, this.field472, arg2.field407[var5][arg0][arg1], arg2.field409[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("aq.c([Laq;B)Z")
    public boolean method334(class35[] arg0) {
        if (this.field464 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field468 == null) {
            Iterator var3 = this.field469.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method336(var4.method557() * 8, var4.method574() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method336(0, 0, 64, 64, this.field468, var2);
        }
        this.method435(arg0, var2);
        this.method420(var2);
        return true;
    }

    @ObfuscatedName("aq.o(Lab;B)V")
    public void method420(class44 arg0) {
        this.field464 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field464[var2][var3] = arg0.method539(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("aq.x([Laq;Lab;I)V")
    public void method435(class35[] arg0, class44 arg1) {
        class229[] var3 = new class229[] { class229.field3162, class229.field3158, class229.field3157, class229.field3156, class229.field3154, class229.field3160, class229.field3155, class229.field3159 };
        class229[] var5 = var3;
        for (int var6 = 0; var6 < var5.length; var6++) {
            class229 var7 = var5[var6];
            if (arg0[var7.method12()] != null) {
                byte var8 = 0;
                byte var9 = 0;
                byte var10 = 64;
                byte var11 = 64;
                byte var12 = 0;
                byte var13 = 0;
                switch(var7.field3153) {
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
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 3:
                        var12 = 59;
                        var13 = 59;
                        var10 = 5;
                        var11 = 5;
                        break;
                    case 4:
                        var13 = 59;
                        var11 = 5;
                        break;
                    case 5:
                        var9 = 59;
                        var11 = 5;
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 6:
                        var9 = 59;
                        var11 = 5;
                        break;
                    case 7:
                        var12 = 59;
                        var10 = 5;
                }
                this.method337(var12, var13, var8, var9, var10, var11, arg0[var7.method12()], arg1);
            }
        }
    }

    @ObfuscatedName("aq.h(IIIILau;Lab;I)V")
    public void method336(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field406[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method1919(var9);
                    arg5.method533(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("aq.z(IIIIIILaq;Lab;I)V")
    public void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method358(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method1919(var11);
                    arg7.method533(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("aq.i(IILau;I)I")
    public int method338(int arg0, int arg1, class29 arg2) {
        return arg2.field406[0][arg0][arg1] == 0 ? this.field470 : this.field464[arg0][arg1];
    }

    @ObfuscatedName("aq.d(IILau;[Ljf;B)V")
    public void method335(int arg0, int arg1, class29 arg2, class285[] arg3) {
        for (int var5 = 0; var5 < arg2.field405; var5++) {
            class32[] var6 = arg2.field410[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    int var10 = var9.field434;
                    boolean var11 = var10 >= class222.field2832.field2817 && var10 <= class222.field2827.field2817;
                    if (var11 || class222.method2269(var9.field434)) {
                        class256 var12 = class256.method3652(var9.field437);
                        if (var12.field3445 != -1) {
                            if (var12.field3445 == 46 || var12.field3445 == 52) {
                                arg3[var12.field3445].method4598(this.field472 * arg0, this.field472 * (63 - arg1), this.field472 * 2 + 1, this.field472 * 2 + 1);
                            } else {
                                arg3[var12.field3445].method4598(this.field472 * arg0, this.field472 * (63 - arg1), this.field472 * 2, this.field472 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.ai(IILau;B)V")
    public void method340(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field405; var4++) {
            class32[] var5 = arg2.field410[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class222.method1023(var8.field434)) {
                        class256 var9 = class256.method3652(var8.field437);
                        int var10 = var9.field3454 == 0 ? -3355444 : -3407872;
                        if (class222.field2825.field2817 == var8.field434) {
                            this.method357(arg0, arg1, var8.field435, var10);
                        }
                        if (class222.field2813.field2817 == var8.field434) {
                            this.method357(arg0, arg1, var8.field435, -3355444);
                            this.method357(arg0, arg1, var8.field435 + 1, var10);
                        }
                        if (class222.field2816.field2817 == var8.field434) {
                            if (var8.field435 == 0) {
                                class282.method4588(this.field472 * arg0, this.field472 * (63 - arg1), 1, var10);
                            }
                            if (var8.field435 == 1) {
                                class282.method4588(this.field472 * arg0 + this.field472 - 1, this.field472 * (63 - arg1), 1, var10);
                            }
                            if (var8.field435 == 2) {
                                class282.method4588(this.field472 * arg0 + this.field472 - 1, this.field472 * (63 - arg1) + this.field472 - 1, 1, var10);
                            }
                            if (var8.field435 == 3) {
                                class282.method4588(this.field472 * arg0, this.field472 * (63 - arg1) + this.field472 - 1, 1, var10);
                            }
                        }
                        if (class222.field2831.field2817 == var8.field434) {
                            int var11 = var8.field435 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field472; var12++) {
                                    class282.method4588(this.field472 * arg0 + var12, this.field472 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field472; var13++) {
                                    class282.method4588(this.field472 * arg0 + var13, this.field472 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("aq.ae(IILjava/util/HashSet;II)V")
    public void method341(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field466.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2615 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2618 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field522 = var10;
                var12.field516 = var11;
                class243 var13 = Statics.field663[var12.field524];
                if (!arg2.contains(var13.method3924())) {
                    this.method344(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("aq.au(Ljava/util/HashSet;IIB)V")
    public void method359(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field474.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field663[var5.field524];
            if (var6 != null && arg0.contains(var6.method3924())) {
                this.method343(var6, var5.field522, var5.field516, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("aq.ak(Lie;IIIIB)V")
    public void method343(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var6 = arg0.method3920(false);
        if (var6 == null) {
            return;
        }
        var6.method4683(arg1 - var6.field3782 / 2, arg2 - var6.field3783 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class282.method4513(arg1, arg2, 15, 16776960, 128);
            class282.method4513(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("aq.ap(Lad;IIFI)V")
    public void method344(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field663[arg0.field524];
        this.method388(var5, arg1, arg2);
        this.method346(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("aq.ar(Lie;IIB)V")
    public void method388(class243 arg0, int arg1, int arg2) {
        class286 var4 = arg0.method3920(false);
        if (var4 != null) {
            int var5 = this.method350(var4, arg0.field3304);
            int var6 = this.method403(var4, arg0.field3305);
            var4.method4683(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("aq.am(Lad;Lie;IIFI)V")
    public void method346(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field521 != null && arg0.field521.field458.method163(arg4)) {
            class264 var6 = (class264) this.field475.get(arg0.field521.field458);
            var6.method4349(arg0.field521.field463, arg2 - arg0.field521.field456 / 2, arg3, arg0.field521.field456, arg0.field521.field457, 0xFF000000 | arg1.field3306, 0, 1, 0, var6.field3638 / 2);
        }
    }

    @ObfuscatedName("aq.aw(IILjava/util/HashSet;II)V")
    public void method347(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field474.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field517.field2615 % 64;
            int var9 = var7.field517.field2618 % 64;
            var7.field522 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field516 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field524)) {
                this.method344(var7, var7.field522, var7.field516, var5);
            }
        }
    }

    @ObfuscatedName("aq.aq(I)V")
    public void method348() {
        if (this.field468 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method428(var1, var2, this.field468);
                }
            }
            return;
        }
        Iterator var3 = this.field469.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method557() * 8; var5 < var4.method557() * 8 + 8; var5++) {
                for (int var6 = var4.method574() * 8; var6 < var4.method574() * 8 + 8; var6++) {
                    this.method428(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("aq.aa(IILau;S)V")
    public void method428(int arg0, int arg1, class29 arg2) {
        field477.method3618(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field405; var4++) {
            class32[] var5 = arg2.field410[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method352(var8.field437);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field466.get(field477);
                        if (var10 != null) {
                            if (var9.field3291 != var10.field524) {
                                class40 var11 = new class40(var9.field3291, var10.field523, var10.field517, this.method354(var9));
                                this.field466.put(new class213(field477), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field523.field2616 - var10.field517.field2616;
                            var10.field517.field2616 = var4;
                            var10.field523.field2616 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field471 * 64 + arg0, this.field467 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field468 == null) {
                            Iterator var15 = this.field469.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method554(arg0, arg1)) {
                                    var14 = new class213(var16.field408 + var4, var16.field404 * 64 + arg0 + var16.method555() * 8, var16.field401 * 64 + arg1 + var16.method558() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field468.field408 + var4, this.field468.field404 * 64 + arg0, this.field468.field401 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3291, var14, var13, this.method354(var9));
                            this.field466.put(new class213(field477), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field466.remove(field477);
    }

    @ObfuscatedName("aq.ag(Ljt;Lib;I)I")
    public int method350(class286 arg0, class258 arg1) {
        switch(arg1.field3552) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3782 / 2;
            default:
                return -arg0.field3782;
        }
    }

    @ObfuscatedName("aq.aj(Ljt;Liu;I)I")
    public int method403(class286 arg0, class240 arg1) {
        switch(arg1.field3277) {
            case 1:
                return -arg0.field3783 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3783;
        }
    }

    @ObfuscatedName("aq.ax(II)Lie;")
    public class243 method352(int arg0) {
        class256 var2 = class256.method3652(arg0);
        if (var2.field3476 != null) {
            var2 = var2.method4144();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3463 == -1 ? null : Statics.field663[var2.field3463];
    }

    @ObfuscatedName("aq.ad(IB)Law;")
    public class34 method353(int arg0) {
        class243 var2 = Statics.field663[arg0];
        return this.method354(var2);
    }

    @ObfuscatedName("aq.az(Lie;I)Law;")
    public class34 method354(class243 arg0) {
        if (arg0.field3289 == null || this.field475 == null || this.field475.get(class25.field356) == null) {
            return null;
        }
        int var2 = arg0.field3301;
        class25[] var3 = new class25[] { class25.field356, class25.field359, class25.field355 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field361 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class264 var9 = (class264) this.field475.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4343(arg0.field3289, 1000000);
        String[] var11 = new String[var10];
        var9.method4341(arg0.field3289, (int[]) null, var11);
        int var12 = var11.length * var9.field3638 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4383(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class34(arg0.field3289, var13, var12, var7);
    }

    @ObfuscatedName("aq.as(IIIIII)Ljava/util/List;")
    public List method421(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field466.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method483(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field474.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method483(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("aq.av(B)Ljava/util/List;")
    public List method360() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field474);
        var1.addAll(this.field466.values());
        return var1;
    }

    @ObfuscatedName("aq.ab(IIIII)V")
    public void method357(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class282.method4526(this.field472 * arg0, this.field472 * (63 - arg1), this.field472, arg3);
        }
        if (var5 == 1) {
            class282.method4588(this.field472 * arg0, this.field472 * (63 - arg1), this.field472, arg3);
        }
        if (var5 == 2) {
            class282.method4526(this.field472 * arg0 + this.field472 - 1, this.field472 * (63 - arg1), this.field472, arg3);
        }
        if (var5 == 3) {
            class282.method4588(this.field472 * arg0, this.field472 * (63 - arg1) + this.field472 - 1, this.field472, arg3);
        }
    }

    @ObfuscatedName("aq.at(III)I")
    public int method358(int arg0, int arg1) {
        if (this.field468 != null) {
            return this.field468.method213(arg0, arg1);
        }
        if (!this.field469.isEmpty()) {
            Iterator var3 = this.field469.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method554(arg0, arg1)) {
                    return var4.method213(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
