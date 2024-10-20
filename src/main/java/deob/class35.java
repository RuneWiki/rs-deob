package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ao")
public class class35 {

    @ObfuscatedName("ao.t")
    public int field486;

    @ObfuscatedName("ao.s")
    public int field487;

    @ObfuscatedName("ao.r")
    public class23 field488;

    @ObfuscatedName("ao.v")
    public LinkedList field489;

    @ObfuscatedName("ao.y")
    public int field490;

    @ObfuscatedName("ao.j")
    public int field494;

    @ObfuscatedName("ao.k")
    public int[][] field492;

    @ObfuscatedName("ao.e")
    public class286 field491;

    @ObfuscatedName("ao.o")
    public List field493;

    @ObfuscatedName("ao.z")
    public HashMap field499;

    @ObfuscatedName("ao.l")
    public final HashMap field495;

    @ObfuscatedName("ao.c")
    public static final class213 field497 = new class213();

    public class35(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field486 = arg0;
        this.field487 = arg1;
        this.field489 = new LinkedList();
        this.field493 = new LinkedList();
        this.field499 = new HashMap();
        this.field490 = arg2 | 0xFF000000;
        this.field495 = arg3;
    }

    @ObfuscatedName("ao.i(IIII)V")
    public void method344(int arg0, int arg1, int arg2) {
        if (this.field491 == null) {
            return;
        }
        if (this.field494 * 64 == arg2) {
            this.field491.method4691(arg0, arg1);
        } else {
            this.field491.method4683(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ao.w(Ld;Ljava/util/List;I)V")
    public void method466(class23 arg0, List arg1) {
        this.field499.clear();
        this.field488 = arg0;
        this.method316(0, 0, 64, 64, this.field488);
        this.method317(arg1);
    }

    @ObfuscatedName("ao.a(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method315(HashSet arg0, List arg1) {
        this.field499.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            if (var4.method201() == this.field486 && var4.method202() == this.field487) {
                this.field489.add(var4);
                this.method316(var4.method573() * 8, var4.method574() * 8, 8, 8, var4);
            }
        }
        this.method317(arg1);
    }

    @ObfuscatedName("ao.t(IIIILaw;I)V")
    public void method316(int arg0, int arg1, int arg2, int arg3, class29 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label50: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                class213 var8 = new class213(0, var6, var7);
                for (int var9 = 0; var9 < arg4.field414; var9++) {
                    class32[] var10 = arg4.field419[var9][var6][var7];
                    if (var10 != null && var10.length != 0) {
                        class32[] var11 = var10;
                        for (int var12 = 0; var12 < var11.length; var12++) {
                            class32 var13 = var11[var12];
                            class243 var14 = this.method346(var13.field455);
                            if (var14 != null) {
                                class213 var15 = new class213(var9, this.field486 * 64 + var6, this.field487 * 64 + var7);
                                Object var16 = null;
                                class213 var17;
                                if (this.field488 == null) {
                                    class46 var18 = (class46) arg4;
                                    var17 = new class213(var18.field413 + var9, var18.field421 * 64 + var6 + var18.method571() * 8, var18.field410 * 64 + var7 + var18.method572() * 8);
                                } else {
                                    var17 = new class213(this.field488.field413 + var9, this.field488.field421 * 64 + var6, this.field488.field410 * 64 + var7);
                                }
                                class40 var19 = new class40(var14.field3298, var17, var15, this.method358(var14));
                                this.field499.put(var8, var19);
                                continue label50;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.s(Ljava/util/List;S)V")
    public void method317(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class26 var3 = (class26) var2.next();
            if (var3.field372.field2616 >> 6 == this.field486 && var3.field372.field2618 >> 6 == this.field487) {
                class40 var4 = new class40(var3.field371, var3.field372, var3.field372, this.method347(var3.field371));
                this.field493.add(var4);
            }
        }
    }

    @ObfuscatedName("ao.r(ILad;[Lao;[Ljz;B)Z")
    public boolean method320(int arg0, class47 arg1, class35[] arg2, class285[] arg3) {
        if (!this.method321(arg0)) {
            return false;
        } else if (this.field488 == null && this.field489.isEmpty()) {
            return false;
        } else {
            this.method327(arg2);
            this.field491.method4676();
            if (this.field488 == null) {
                this.method323(arg1, arg3);
            } else {
                this.method322(arg1, arg2, arg3);
            }
            return true;
        }
    }

    @ObfuscatedName("ao.v(IIILjava/util/HashSet;I)V")
    public void method325(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method351(arg0, arg1, arg3, arg2);
        this.method390(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ao.y(Ljava/util/HashSet;III)V")
    public void method426(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field499.values().iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            if (arg0.contains(var5.field549)) {
                class243 var6 = Statics.field3304[var5.field549];
                this.method337(var6, var5.field550, var5.field561, arg1, arg2);
            }
        }
        this.method329(arg0, arg1, arg2);
    }

    @ObfuscatedName("ao.j(II)Z")
    public boolean method321(int arg0) {
        if (this.field491 != null && this.field494 == arg0) {
            return false;
        } else {
            this.field494 = arg0;
            this.field491 = new class286(this.field494 * 64, this.field494 * 64);
            return true;
        }
    }

    @ObfuscatedName("ao.k(Lad;[Lao;[Ljz;I)V")
    public void method322(class47 arg0, class35[] arg1, class285[] arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method382(var4, var5, this.field488, arg0);
                this.method391(var4, var5, this.field488, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method324(var6, var7, this.field488, arg0, arg2);
            }
        }
    }

    @ObfuscatedName("ao.e(Lad;[Ljz;I)V")
    public void method323(class47 arg0, class285[] arg1) {
        Iterator var3 = this.field489.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method573() * 8; var5 < var4.method573() * 8 + 8; var5++) {
                for (int var6 = var4.method574() * 8; var6 < var4.method574() * 8 + 8; var6++) {
                    this.method382(var5, var6, var4, arg0);
                    this.method391(var5, var6, var4, arg0);
                }
            }
        }
        Iterator var7 = this.field489.iterator();
        while (var7.hasNext()) {
            class46 var8 = (class46) var7.next();
            for (int var9 = var8.method573() * 8; var9 < var8.method573() * 8 + 8; var9++) {
                for (int var10 = var8.method574() * 8; var10 < var8.method574() * 8 + 8; var10++) {
                    this.method324(var9, var10, var8, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ao.o(IILaw;Lad;[Ljz;I)V")
    public void method324(int arg0, int arg1, class29 arg2, class47 arg3, class285[] arg4) {
        this.method460(arg0, arg1, arg2);
        this.method427(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ao.z(IILaw;Lad;I)V")
    public void method382(int arg0, int arg1, class29 arg2, class47 arg3) {
        int var5 = arg2.field415[0][arg0][arg1] - 1;
        int var6 = arg2.field422[0][arg0][arg1] - 1;
        if (var5 == -1 && var6 == -1) {
            class282.method4614(this.field494 * arg0, this.field494 * (63 - arg1), this.field494, this.field494, this.field490);
        }
        int var7 = 16711935;
        if (var6 != -1) {
            int var8 = this.field490;
            class260 var9 = class260.method1563(var6);
            int var10;
            if (var9 == null) {
                var10 = var8;
            } else if (var9.field3602 >= 0) {
                var10 = var9.field3602 | 0xFF000000;
            } else if (var9.field3598 >= 0) {
                int var11 = class38.method1720(Statics.field2029.method2162(var9.field3598), 96);
                var10 = class137.field2042[var11] | 0xFF000000;
            } else if (var9.field3604 == 16711935) {
                var10 = var8;
            } else {
                int var12 = var9.field3599;
                int var13 = var9.field3600;
                int var14 = var9.field3601;
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
                int var18 = class38.method1720(var15, 96);
                var10 = class137.field2042[var18] | 0xFF000000;
            }
            var7 = var10;
        }
        if (var6 > -1 && arg2.field409[0][arg0][arg1] == 0) {
            class282.method4614(this.field494 * arg0, this.field494 * (63 - arg1), this.field494, this.field494, var7);
            return;
        }
        int var19 = this.method332(arg0, arg1, arg2);
        if (var6 == -1) {
            class282.method4614(this.field494 * arg0, this.field494 * (63 - arg1), this.field494, this.field494, var19);
        } else {
            arg3.method600(this.field494 * arg0, this.field494 * (63 - arg1), var19, var7, this.field494, this.field494, arg2.field409[0][arg0][arg1], arg2.field420[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ao.l(IILaw;Lad;I)V")
    public void method391(int arg0, int arg1, class29 arg2, class47 arg3) {
        for (int var5 = 1; var5 < arg2.field414; var5++) {
            int var6 = arg2.field422[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = this.field490;
                class260 var8 = class260.method1563(var6);
                int var9;
                if (var8 == null) {
                    var9 = var7;
                } else if (var8.field3602 >= 0) {
                    var9 = var8.field3602 | 0xFF000000;
                } else if (var8.field3598 >= 0) {
                    int var10 = class38.method1720(Statics.field2029.method2162(var8.field3598), 96);
                    var9 = class137.field2042[var10] | 0xFF000000;
                } else if (var8.field3604 == 16711935) {
                    var9 = var7;
                } else {
                    int var11 = var8.field3599;
                    int var12 = var8.field3600;
                    int var13 = var8.field3601;
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
                    int var17 = class38.method1720(var14, 96);
                    var9 = class137.field2042[var17] | 0xFF000000;
                }
                if (arg2.field409[var5][arg0][arg1] == 0) {
                    class282.method4614(this.field494 * arg0, this.field494 * (63 - arg1), this.field494, this.field494, var9);
                } else {
                    arg3.method600(this.field494 * arg0, this.field494 * (63 - arg1), 0, var9, this.field494, this.field494, arg2.field409[var5][arg0][arg1], arg2.field420[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ao.c([Lao;I)Z")
    public boolean method327(class35[] arg0) {
        if (this.field492 != null) {
            return false;
        }
        class44 var2 = new class44(64, 64);
        if (this.field488 == null) {
            Iterator var3 = this.field489.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                this.method330(var4.method573() * 8, var4.method574() * 8, 8, 8, var4, var2);
            }
        } else {
            this.method330(0, 0, 64, 64, this.field488, var2);
        }
        this.method355(arg0, var2);
        this.method328(var2);
        return true;
    }

    @ObfuscatedName("ao.b(Lam;I)V")
    public void method328(class44 arg0) {
        this.field492 = new int[64][64];
        for (int var2 = 0; var2 < 64; var2++) {
            for (int var3 = 0; var3 < 64; var3++) {
                this.field492[var2][var3] = arg0.method551(var2, var3) | 0xFF000000;
            }
        }
    }

    @ObfuscatedName("ao.f([Lao;Lam;B)V")
    public void method355(class35[] arg0, class44 arg1) {
        class229[] var3 = class229.method3150();
        class229[] var4 = var3;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class229 var6 = var4[var5];
            if (arg0[var6.method17()] != null) {
                byte var7 = 0;
                byte var8 = 0;
                byte var9 = 64;
                byte var10 = 64;
                byte var11 = 0;
                byte var12 = 0;
                switch(var6.field3168) {
                    case 0:
                        var8 = 59;
                        var10 = 5;
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 1:
                        var12 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 2:
                        var11 = 59;
                        var9 = 5;
                        break;
                    case 3:
                        var12 = 59;
                        var10 = 5;
                        break;
                    case 4:
                        var8 = 59;
                        var10 = 5;
                        break;
                    case 5:
                        var11 = 59;
                        var12 = 59;
                        var9 = 5;
                        var10 = 5;
                        break;
                    case 6:
                        var7 = 59;
                        var9 = 5;
                        break;
                    case 7:
                        var8 = 59;
                        var10 = 5;
                        var7 = 59;
                        var9 = 5;
                }
                this.method331(var11, var12, var7, var8, var9, var10, arg0[var6.method17()], arg1);
            }
        }
    }

    @ObfuscatedName("ao.n(IIIILaw;Lam;I)V")
    public void method330(int arg0, int arg1, int arg2, int arg3, class29 arg4, class44 arg5) {
        for (int var7 = arg0; var7 < arg0 + arg2; var7++) {
            for (int var8 = arg1; var8 < arg1 + arg3; var8++) {
                int var9 = arg4.field415[0][var7][var8] - 1;
                if (var9 != -1) {
                    class247 var10 = class247.method3728(var9);
                    arg5.method550(var7, var8, 5, var10);
                }
            }
        }
    }

    @ObfuscatedName("ao.u(IIIIIILao;Lam;I)V")
    public void method331(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class35 arg6, class44 arg7) {
        for (int var9 = 0; var9 < arg4; var9++) {
            for (int var10 = 0; var10 < arg5; var10++) {
                int var11 = arg6.method352(arg0 + var9, arg1 + var10);
                if (var11 != -1) {
                    class247 var12 = class247.method3728(var11);
                    arg7.method550(arg2 + var9, arg3 + var10, 5, var12);
                }
            }
        }
    }

    @ObfuscatedName("ao.p(IILaw;I)I")
    public int method332(int arg0, int arg1, class29 arg2) {
        return arg2.field415[0][arg0][arg1] == 0 ? this.field490 : this.field492[arg0][arg1];
    }

    @ObfuscatedName("ao.q(IILaw;[Ljz;I)V")
    public void method427(int arg0, int arg1, class29 arg2, class285[] arg3) {
        for (int var5 = 0; var5 < arg2.field414; var5++) {
            class32[] var6 = arg2.field419[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class32[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class32 var9 = var7[var8];
                    if (class222.method3384(var9.field454) || class222.method3445(var9.field454)) {
                        class256 var10 = class256.method4092(var9.field455);
                        if (var10.field3476 != -1) {
                            if (var10.field3476 == 46 || var10.field3476 == 52) {
                                arg3[var10.field3476].method4645(this.field494 * arg0, this.field494 * (63 - arg1), this.field494 * 2 + 1, this.field494 * 2 + 1);
                            } else {
                                arg3[var10.field3476].method4645(this.field494 * arg0, this.field494 * (63 - arg1), this.field494 * 2, this.field494 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.d(IILaw;I)V")
    public void method460(int arg0, int arg1, class29 arg2) {
        for (int var4 = 0; var4 < arg2.field414; var4++) {
            class32[] var5 = arg2.field419[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    if (class222.method231(var8.field454)) {
                        class256 var9 = class256.method4092(var8.field455);
                        int var10 = var9.field3489 == 0 ? -3355444 : -3407872;
                        if (class222.field2829.field2843 == var8.field454) {
                            this.method333(arg0, arg1, var8.field456, var10);
                        }
                        if (class222.field2822.field2843 == var8.field454) {
                            this.method333(arg0, arg1, var8.field456, -3355444);
                            this.method333(arg0, arg1, var8.field456 + 1, var10);
                        }
                        if (class222.field2823.field2843 == var8.field454) {
                            if (var8.field456 == 0) {
                                class282.method4572(this.field494 * arg0, this.field494 * (63 - arg1), 1, var10);
                            }
                            if (var8.field456 == 1) {
                                class282.method4572(this.field494 * arg0 + this.field494 - 1, this.field494 * (63 - arg1), 1, var10);
                            }
                            if (var8.field456 == 2) {
                                class282.method4572(this.field494 * arg0 + this.field494 - 1, this.field494 * (63 - arg1) + this.field494 - 1, 1, var10);
                            }
                            if (var8.field456 == 3) {
                                class282.method4572(this.field494 * arg0, this.field494 * (63 - arg1) + this.field494 - 1, 1, var10);
                            }
                        }
                        if (class222.field2824.field2843 == var8.field454) {
                            int var11 = var8.field456 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field494; var12++) {
                                    class282.method4572(this.field494 * arg0 + var12, this.field494 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field494; var13++) {
                                    class282.method4572(this.field494 * arg0 + var13, this.field494 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.h(IILjava/util/HashSet;II)V")
    public void method351(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field499.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class213 var9 = (class213) var8.getKey();
            int var10 = (int) ((float) var9.field2616 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2618 * var5 - var6);
            class40 var12 = (class40) var8.getValue();
            if (var12 != null) {
                var12.field550 = var10;
                var12.field561 = var11;
                class243 var13 = Statics.field3304[var12.field549];
                if (!arg2.contains(var13.method3930())) {
                    this.method338(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ao.g(Ljava/util/HashSet;IIB)V")
    public void method329(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field493.iterator();
        while (var4.hasNext()) {
            class40 var5 = (class40) var4.next();
            class243 var6 = Statics.field3304[var5.field549];
            if (var6 != null && arg0.contains(var6.method3930())) {
                this.method337(var6, var5.field550, var5.field561, arg1, arg2);
            }
        }
    }

    @ObfuscatedName("ao.x(Lij;IIIII)V")
    public void method337(class243 arg0, int arg1, int arg2, int arg3, int arg4) {
        class286 var6 = arg0.method3932(false);
        if (var6 == null) {
            return;
        }
        var6.method4659(arg1 - var6.field3786 / 2, arg2 - var6.field3788 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class282.method4561(arg1, arg2, 15, 16776960, 128);
            class282.method4561(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ao.ai(Lac;IIFI)V")
    public void method338(class40 arg0, int arg1, int arg2, float arg3) {
        class243 var5 = Statics.field3304[arg0.field549];
        this.method339(var5, arg1, arg2);
        this.method340(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ao.an(Lij;IIB)V")
    public void method339(class243 arg0, int arg1, int arg2) {
        class286 var4 = arg0.method3932(false);
        if (var4 != null) {
            int var5 = this.method463(var4, arg0.field3312);
            int var6 = this.method345(var4, arg0.field3310);
            var4.method4659(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ao.au(Lac;Lij;IIFB)V")
    public void method340(class40 arg0, class243 arg1, int arg2, int arg3, float arg4) {
        if (arg0.field554 != null && arg0.field554.field479.method153(arg4)) {
            class264 var6 = (class264) this.field495.get(arg0.field554.field479);
            var6.method4420(arg0.field554.field477, arg2 - arg0.field554.field476 / 2, arg3, arg0.field554.field476, arg0.field554.field478, 0xFF000000 | arg1.field3302, 0, 1, 0, var6.field3650 / 2);
        }
    }

    @ObfuscatedName("ao.ar(IILjava/util/HashSet;II)V")
    public void method390(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field493.iterator();
        while (var6.hasNext()) {
            class40 var7 = (class40) var6.next();
            int var8 = var7.field551.field2616 % 64;
            int var9 = var7.field551.field2618 % 64;
            var7.field550 = (int) ((float) var8 * var5 + (float) arg0);
            var7.field561 = (int) ((float) (63 - var9) * var5 + (float) arg1);
            if (!arg2.contains(var7.field549)) {
                this.method338(var7, var7.field550, var7.field561, var5);
            }
        }
    }

    @ObfuscatedName("ao.ay(I)V")
    public void method342() {
        if (this.field488 != null) {
            for (int var1 = 0; var1 < 64; var1++) {
                for (int var2 = 0; var2 < 64; var2++) {
                    this.method450(var1, var2, this.field488);
                }
            }
            return;
        }
        Iterator var3 = this.field489.iterator();
        while (var3.hasNext()) {
            class46 var4 = (class46) var3.next();
            for (int var5 = var4.method573() * 8; var5 < var4.method573() * 8 + 8; var5++) {
                for (int var6 = var4.method574() * 8; var6 < var4.method574() * 8 + 8; var6++) {
                    this.method450(var5, var6, var4);
                }
            }
        }
    }

    @ObfuscatedName("ao.ao(IILaw;I)V")
    public void method450(int arg0, int arg1, class29 arg2) {
        field497.method3591(0, arg0, arg1);
        for (int var4 = 0; var4 < arg2.field414; var4++) {
            class32[] var5 = arg2.field419[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class32[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class32 var8 = var6[var7];
                    class243 var9 = this.method346(var8.field455);
                    if (var9 != null) {
                        class40 var10 = (class40) this.field499.get(field497);
                        if (var10 != null) {
                            if (var9.field3298 != var10.field549) {
                                class40 var11 = new class40(var9.field3298, var10.field548, var10.field551, this.method358(var9));
                                this.field499.put(new class213(field497), var11);
                                var10 = var11;
                            }
                            int var12 = var10.field548.field2617 - var10.field551.field2617;
                            var10.field551.field2617 = var4;
                            var10.field548.field2617 = var4 + var12;
                            return;
                        }
                        class213 var13 = new class213(var4, this.field486 * 64 + arg0, this.field487 * 64 + arg1);
                        class213 var14 = null;
                        if (this.field488 == null) {
                            Iterator var15 = this.field489.iterator();
                            while (var15.hasNext()) {
                                class46 var16 = (class46) var15.next();
                                if (var16.method582(arg0, arg1)) {
                                    var14 = new class213(var16.field413 + var4, var16.field421 * 64 + arg0 + var16.method571() * 8, var16.field410 * 64 + arg1 + var16.method572() * 8);
                                    break;
                                }
                            }
                        } else {
                            var14 = new class213(this.field488.field413 + var4, this.field488.field421 * 64 + arg0, this.field488.field410 * 64 + arg1);
                        }
                        if (var14 != null) {
                            class40 var17 = new class40(var9.field3298, var14, var13, this.method358(var9));
                            this.field499.put(new class213(field497), var17);
                            return;
                        }
                    }
                }
            }
        }
        this.field499.remove(field497);
    }

    @ObfuscatedName("ao.as(Ljk;Lis;B)I")
    public int method463(class286 arg0, class258 arg1) {
        switch(arg1.field3551) {
            case 1:
                return -arg0.field3786 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3786;
        }
    }

    @ObfuscatedName("ao.ak(Ljk;Lim;I)I")
    public int method345(class286 arg0, class240 arg1) {
        switch(arg1.field3283) {
            case 0:
                return -arg0.field3788 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field3788;
        }
    }

    @ObfuscatedName("ao.aq(II)Lij;")
    public class243 method346(int arg0) {
        class256 var2 = class256.method4092(arg0);
        if (var2.field3473 != null) {
            var2 = var2.method4199();
            if (var2 == null) {
                return null;
            }
        }
        return var2.field3455 == -1 ? null : Statics.field3304[var2.field3455];
    }

    @ObfuscatedName("ao.ax(II)Lay;")
    public class34 method347(int arg0) {
        class243 var2 = Statics.field3304[arg0];
        return this.method358(var2);
    }

    @ObfuscatedName("ao.ac(Lij;B)Lay;")
    public class34 method358(class243 arg0) {
        if (arg0.field3301 == null || this.field495 == null || this.field495.get(class25.field365) == null) {
            return null;
        }
        int var2 = arg0.field3303;
        class25[] var3 = new class25[] { class25.field365, class25.field359, class25.field360 };
        class25[] var4 = var3;
        int var5 = 0;
        class25 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class25 var6 = var4[var5];
            if (var6.field368 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class264 var9 = (class264) this.field495.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method4388(arg0.field3301, 1000000);
        String[] var11 = new String[var10];
        var9.method4386(arg0.field3301, (int[]) null, var11);
        int var12 = var11.length * var9.field3650 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4408(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class34(arg0.field3301, var13, var12, var7);
    }

    @ObfuscatedName("ao.at(IIIIII)Ljava/util/List;")
    public List method349(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field499.values().iterator();
            while (var7.hasNext()) {
                class40 var8 = (class40) var7.next();
                if (var8.method490(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field493.iterator();
            while (var9.hasNext()) {
                class40 var10 = (class40) var9.next();
                if (var10.method490(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ao.av(I)Ljava/util/List;")
    public List method350() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field493);
        var1.addAll(this.field499.values());
        return var1;
    }

    @ObfuscatedName("ao.aa(IIIII)V")
    public void method333(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class282.method4574(this.field494 * arg0, this.field494 * (63 - arg1), this.field494, arg3);
        }
        if (var5 == 1) {
            class282.method4572(this.field494 * arg0, this.field494 * (63 - arg1), this.field494, arg3);
        }
        if (var5 == 2) {
            class282.method4574(this.field494 * arg0 + this.field494 - 1, this.field494 * (63 - arg1), this.field494, arg3);
        }
        if (var5 == 3) {
            class282.method4572(this.field494 * arg0, this.field494 * (63 - arg1) + this.field494 - 1, this.field494, arg3);
        }
    }

    @ObfuscatedName("ao.am(III)I")
    public int method352(int arg0, int arg1) {
        if (this.field488 != null) {
            return this.field488.method200(arg0, arg1);
        }
        if (!this.field489.isEmpty()) {
            Iterator var3 = this.field489.iterator();
            while (var3.hasNext()) {
                class46 var4 = (class46) var3.next();
                if (var4.method582(arg0, arg1)) {
                    return var4.method200(arg0, arg1);
                }
            }
        }
        return -1;
    }
}
