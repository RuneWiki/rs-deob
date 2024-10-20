package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ao")
public class class39 {

    @ObfuscatedName("ao.w")
    public static class159 field290 = new class159(37748736, 256);

    @ObfuscatedName("ao.v")
    public int field284;

    @ObfuscatedName("ao.q")
    public int field285;

    @ObfuscatedName("ao.z")
    public class25 field280;

    @ObfuscatedName("ao.t")
    public LinkedList field287;

    @ObfuscatedName("ao.e")
    public int field288;

    @ObfuscatedName("ao.s")
    public int field289;

    @ObfuscatedName("ao.p")
    public List field283;

    @ObfuscatedName("ao.n")
    public HashMap field291;

    @ObfuscatedName("ao.u")
    public final HashMap field292;

    @ObfuscatedName("je.x(IIIB)J")
    public static long method4383(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("bw.m(B)V")
    public static void method1661() {
        field290.method3179();
    }

    public class39(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field284 = arg0;
        this.field285 = arg1;
        this.field287 = new LinkedList();
        this.field283 = new LinkedList();
        this.field291 = new HashMap();
        this.field288 = arg2 | 0xFF000000;
        this.field292 = arg3;
    }

    @ObfuscatedName("ao.k(IIII)V")
    public void method447(int arg0, int arg1, int arg2) {
        int var4 = this.field284;
        int var5 = this.field285;
        int var6 = this.field289;
        class335 var7 = (class335) field290.method3180(method4383(var4, var5, var6));
        if (var7 == null) {
            return;
        }
        if (this.field289 * 64 == arg2) {
            var7.method5729(arg0, arg1);
        } else {
            var7.method5831(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ao.d(Ly;Ljava/util/List;I)V")
    public void method448(class25 arg0, List arg1) {
        this.field291.clear();
        this.field280 = arg0;
        this.method525(arg1);
    }

    @ObfuscatedName("ao.w(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method489(HashSet arg0, List arg1) {
        this.field291.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class49 var4 = (class49) var3.next();
            if (var4.method322() == this.field284 && var4.method323() == this.field285) {
                this.field287.add(var4);
            }
        }
        this.method525(arg1);
    }

    @ObfuscatedName("ao.v(IIIILab;S)V")
    public void method450(int arg0, int arg1, int arg2, int arg3, class31 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field201; var8++) {
                    class35[] var9 = arg4.field208[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class35[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class35 var12 = var10[var11];
                            class264 var13 = class264.method363(var12.field250);
                            if (method1083(var13)) {
                                this.method492(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.q(Ljw;IIILab;I)V")
    public void method492(class264 arg0, int arg1, int arg2, int arg3, class31 arg4) {
        class223 var6 = new class223(arg1, this.field284 * 64 + arg2, this.field285 * 64 + arg3);
        Object var7 = null;
        class223 var8;
        if (this.field280 == null) {
            class49 var9 = (class49) arg4;
            var8 = new class223(var9.field200 + arg1, var9.field204 * 64 + arg2 + var9.method655() * 8, var9.field196 * 64 + arg3 + var9.method656() * 8);
        } else {
            var8 = new class223(this.field280.field200 + arg1, this.field280.field204 * 64 + arg2, this.field280.field196 * 64 + arg3);
        }
        class44 var10;
        if (arg0.field3386 == null) {
            class252 var11 = class252.method249(arg0.field3373);
            var10 = new class28(var8, var6, var11.field3213, this.method477(var11));
        } else {
            var10 = new class33(var8, var6, arg0.field3352, this);
        }
        this.field291.put(new class223(0, arg2, arg3), var10);
    }

    @ObfuscatedName("ao.z(S)V")
    public void method509() {
        Iterator var1 = this.field291.values().iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            if (var2 instanceof class33) {
                ((class33) var2).method353();
            }
        }
    }

    @ObfuscatedName("ao.t(Ljava/util/List;I)V")
    public void method525(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class28 var3 = (class28) var2.next();
            if (var3.field327.field2533 >> 6 == this.field284 && var3.field327.field2530 >> 6 == this.field285) {
                class28 var4 = new class28(var3.field327, var3.field327, var3.field170, this.method476(var3.field170));
                this.field283.add(var4);
            }
        }
    }

    @ObfuscatedName("ao.e(I)V")
    public void method454() {
        if (this.field280 != null) {
            this.field280.method324();
            return;
        }
        Iterator var1 = this.field287.iterator();
        while (var1.hasNext()) {
            class49 var2 = (class49) var1.next();
            var2.method324();
        }
    }

    @ObfuscatedName("ao.s(Liy;I)Z")
    public boolean method467(class244 arg0) {
        this.field291.clear();
        if (this.field280 == null) {
            boolean var2 = true;
            Iterator var3 = this.field287.iterator();
            while (var3.hasNext()) {
                class49 var4 = (class49) var3.next();
                var4.method317(arg0);
                var2 &= var4.method334();
            }
            if (var2) {
                Iterator var5 = this.field287.iterator();
                while (var5.hasNext()) {
                    class49 var6 = (class49) var5.next();
                    this.method450(var6.method653() * 8, var6.method658() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field280.method317(arg0);
            if (this.field280.method334()) {
                this.method450(0, 0, 64, 64, this.field280);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ao.p(ILah;[Lle;Liy;Liy;I)V")
    public void method456(int arg0, class50 arg1, class334[] arg2, class244 arg3, class244 arg4) {
        this.field289 = arg0;
        if (this.field280 == null && this.field287.isEmpty()) {
            return;
        }
        int var6 = this.field284;
        int var7 = this.field285;
        class335 var8 = (class335) field290.method3180(method4383(var6, var7, arg0));
        if (var8 != null) {
            return;
        }
        boolean var9 = true;
        boolean var10 = var9 & this.method467(arg3);
        int var11;
        if (this.field280 == null) {
            var11 = ((class31) this.field287.getFirst()).field202;
        } else {
            var11 = this.field280.field202;
        }
        boolean var12 = var10 & arg4.method3895(var11);
        if (!var12) {
            return;
        }
        byte[] var13 = arg4.method3876(var11);
        class37 var14;
        if (var13 == null) {
            var14 = new class37();
        } else {
            var14 = new class37(class59.method3428(var13).field3897);
        }
        class335 var16 = new class335(this.field289 * 64, this.field289 * 64);
        var16.method5723();
        if (this.field280 == null) {
            this.method460(arg1, arg2, var14);
        } else {
            this.method459(arg1, arg2, var14);
        }
        int var17 = this.field284;
        int var18 = this.field285;
        int var19 = this.field289;
        field290.method3167(var16, method4383(var17, var18, var19), var16.field3897.length * 4);
        this.method454();
    }

    @ObfuscatedName("ao.n(IIILjava/util/HashSet;B)V")
    public void method457(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method488(arg0, arg1, arg3, arg2);
        this.method513(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ao.u(Ljava/util/HashSet;IIB)V")
    public void method546(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field291.values().iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method590()) {
                int var6 = var5.method264();
                if (arg0.contains(var6)) {
                    class252 var7 = class252.method249(var6);
                    this.method469(var7, var5.field331, var5.field330, arg1, arg2);
                }
            }
        }
        this.method468(arg0, arg1, arg2);
    }

    @ObfuscatedName("ao.h(Lah;[Lle;Lam;I)V")
    public void method459(class50 arg0, class334[] arg1, class37 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method462(var4, var5, this.field280, arg0, arg2);
                this.method463(var4, var5, this.field280, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method461(var6, var7, this.field280, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ao.g(Lah;[Lle;Lam;B)V")
    public void method460(class50 arg0, class334[] arg1, class37 arg2) {
        Iterator var4 = this.field287.iterator();
        while (var4.hasNext()) {
            class49 var5 = (class49) var4.next();
            for (int var6 = var5.method653() * 8; var6 < var5.method653() * 8 + 8; var6++) {
                for (int var7 = var5.method658() * 8; var7 < var5.method658() * 8 + 8; var7++) {
                    this.method462(var6, var7, var5, arg0, arg2);
                    this.method463(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field287.iterator();
        while (var8.hasNext()) {
            class49 var9 = (class49) var8.next();
            for (int var10 = var9.method653() * 8; var10 < var9.method653() * 8 + 8; var10++) {
                for (int var11 = var9.method658() * 8; var11 < var9.method658() * 8 + 8; var11++) {
                    this.method461(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ao.i(IILab;Lah;[Lle;I)V")
    public void method461(int arg0, int arg1, class31 arg2, class50 arg3, class334[] arg4) {
        this.method455(arg0, arg1, arg2);
        this.method446(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ao.a(IILab;Lah;Lam;I)V")
    public void method462(int arg0, int arg1, class31 arg2, class50 arg3, class37 arg4) {
        int var6 = arg2.field205[0][arg0][arg1] - 1;
        int var7 = arg2.field197[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class331.method5606(this.field289 * arg0, this.field289 * (63 - arg1), this.field289, this.field289, this.field288);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class42.method3244(var7, this.field288);
        }
        if (var7 > -1 && arg2.field206[0][arg0][arg1] == 0) {
            class331.method5606(this.field289 * arg0, this.field289 * (63 - arg1), this.field289, this.field289, var8);
            return;
        }
        int var9 = this.method464(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class331.method5606(this.field289 * arg0, this.field289 * (63 - arg1), this.field289, this.field289, var9);
        } else {
            arg3.method685(this.field289 * arg0, this.field289 * (63 - arg1), var9, var8, this.field289, this.field289, arg2.field206[0][arg0][arg1], arg2.field207[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ao.o(IILab;Lah;B)V")
    public void method463(int arg0, int arg1, class31 arg2, class50 arg3) {
        for (int var5 = 1; var5 < arg2.field201; var5++) {
            int var6 = arg2.field197[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class42.method3244(var6, this.field288);
                if (arg2.field206[var5][arg0][arg1] == 0) {
                    class331.method5606(this.field289 * arg0, this.field289 * (63 - arg1), this.field289, this.field289, var7);
                } else {
                    arg3.method685(this.field289 * arg0, this.field289 * (63 - arg1), 0, var7, this.field289, this.field289, arg2.field206[var5][arg0][arg1], arg2.field207[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ao.c(IILab;Lam;I)I")
    public int method464(int arg0, int arg1, class31 arg2, class37 arg3) {
        return arg2.field205[0][arg0][arg1] == 0 ? this.field288 : arg3.method440(arg0, arg1);
    }

    @ObfuscatedName("ao.f(IILab;[Lle;I)V")
    public void method446(int arg0, int arg1, class31 arg2, class334[] arg3) {
        for (int var5 = 0; var5 < arg2.field201; var5++) {
            class35[] var6 = arg2.field208[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class35[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class35 var9 = var7[var8];
                    if (!class230.method3102(var9.field248)) {
                        int var10 = var9.field248;
                        boolean var11 = class230.field2741.field2742 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class264 var12 = class264.method363(var9.field250);
                    if (var12.field3392 != -1) {
                        if (var12.field3392 == 46 || var12.field3392 == 52) {
                            arg3[var12.field3392].method5718(this.field289 * arg0, this.field289 * (63 - arg1), this.field289 * 2 + 1, this.field289 * 2 + 1);
                        } else {
                            arg3[var12.field3392].method5718(this.field289 * arg0, this.field289 * (63 - arg1), this.field289 * 2, this.field289 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.ae(IILab;B)V")
    public void method455(int arg0, int arg1, class31 arg2) {
        for (int var4 = 0; var4 < arg2.field201; var4++) {
            class35[] var5 = arg2.field208[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class35[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class35 var8 = var6[var7];
                    int var9 = var8.field248;
                    boolean var10 = var9 >= class230.field2733.field2742 && var9 <= class230.field2743.field2742 || class230.field2723.field2742 == var9;
                    if (var10) {
                        class264 var11 = class264.method363(var8.field250);
                        int var12 = var11.field3364 == 0 ? -3355444 : -3407872;
                        if (class230.field2733.field2742 == var8.field248) {
                            this.method480(arg0, arg1, var8.field251, var12);
                        }
                        if (class230.field2729.field2742 == var8.field248) {
                            this.method480(arg0, arg1, var8.field251, -3355444);
                            this.method480(arg0, arg1, var8.field251 + 1, var12);
                        }
                        if (class230.field2743.field2742 == var8.field248) {
                            if (var8.field251 == 0) {
                                class331.method5611(this.field289 * arg0, this.field289 * (63 - arg1), 1, var12);
                            }
                            if (var8.field251 == 1) {
                                class331.method5611(this.field289 * arg0 + this.field289 - 1, this.field289 * (63 - arg1), 1, var12);
                            }
                            if (var8.field251 == 2) {
                                class331.method5611(this.field289 * arg0 + this.field289 - 1, this.field289 * (63 - arg1) + this.field289 - 1, 1, var12);
                            }
                            if (var8.field251 == 3) {
                                class331.method5611(this.field289 * arg0, this.field289 * (63 - arg1) + this.field289 - 1, 1, var12);
                            }
                        }
                        if (class230.field2723.field2742 == var8.field248) {
                            int var13 = var8.field251 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field289; var14++) {
                                    class331.method5611(this.field289 * arg0 + var14, this.field289 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field289; var15++) {
                                    class331.method5611(this.field289 * arg0 + var15, this.field289 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ao.an(IILjava/util/HashSet;II)V")
    public void method488(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field291.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class223 var9 = (class223) var8.getKey();
            int var10 = (int) ((float) var9.field2533 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2530 * var5 - var6);
            class44 var12 = (class44) var8.getValue();
            if (var12 != null && var12.method590()) {
                var12.field331 = var10;
                var12.field330 = var11;
                class252 var13 = class252.method249(var12.method264());
                if (!arg2.contains(var13.method4090())) {
                    this.method470(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ao.ai(Ljava/util/HashSet;III)V")
    public void method468(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field283.iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method590()) {
                class252 var6 = class252.method249(var5.method264());
                if (var6 != null && arg0.contains(var6.method4090())) {
                    this.method469(var6, var5.field331, var5.field330, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ao.ap(Lio;IIIIS)V")
    public void method469(class252 arg0, int arg1, int arg2, int arg3, int arg4) {
        class335 var6 = arg0.method4075(false);
        if (var6 == null) {
            return;
        }
        var6.method5731(arg1 - var6.field3890 / 2, arg2 - var6.field3900 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class331.method5664(arg1, arg2, 15, 16776960, 128);
            class331.method5664(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ao.ab(Lax;IIFI)V")
    public void method470(class44 arg0, int arg1, int arg2, float arg3) {
        class252 var5 = class252.method249(arg0.method264());
        this.method471(var5, arg1, arg2);
        this.method472(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ao.ar(Lio;IIB)V")
    public void method471(class252 arg0, int arg1, int arg2) {
        class335 var4 = arg0.method4075(false);
        if (var4 != null) {
            int var5 = this.method474(var4, arg0.field3229);
            int var6 = this.method475(var4, arg0.field3227);
            var4.method5731(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ao.af(Lax;Lio;IIFI)V")
    public void method472(class44 arg0, class252 arg1, int arg2, int arg3, float arg4) {
        class38 var6 = arg0.method275();
        if (var6 != null && var6.field275.method259(arg4)) {
            class305 var7 = (class305) this.field292.get(var6.field275);
            var7.method4995(var6.field273, arg2 - var6.field274 / 2, arg3, var6.field274, var6.field272, 0xFF000000 | arg1.field3217, 0, 1, 0, var7.field3683 / 2);
        }
    }

    @ObfuscatedName("ao.at(IILjava/util/HashSet;II)V")
    public void method513(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field283.iterator();
        while (var6.hasNext()) {
            class44 var7 = (class44) var6.next();
            if (var7.method590()) {
                int var8 = var7.field327.field2533 % 64;
                int var9 = var7.field327.field2530 % 64;
                var7.field331 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field330 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method264())) {
                    this.method470(var7, var7.field331, var7.field330, var5);
                }
            }
        }
    }

    @ObfuscatedName("ao.as(Lla;Lje;B)I")
    public int method474(class335 arg0, class266 arg1) {
        switch(arg1.field3455) {
            case 0:
                return -arg0.field3890 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3890;
        }
    }

    @ObfuscatedName("ao.am(Lla;Lie;B)I")
    public int method475(class335 arg0, class249 arg1) {
        switch(arg1.field3195) {
            case 0:
                return 0;
            case 1:
                return -arg0.field3900 / 2;
            default:
                return -arg0.field3900;
        }
    }

    @ObfuscatedName("ba.au(Ljw;I)Z")
    public static boolean method1083(class264 arg0) {
        if (arg0.field3386 != null) {
            int[] var1 = arg0.field3386;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class264 var4 = class264.method363(var3);
                if (var4.field3373 != -1) {
                    return true;
                }
            }
        } else if (arg0.field3373 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("ao.ao(II)Lau;")
    public class38 method476(int arg0) {
        class252 var2 = class252.method249(arg0);
        return this.method477(var2);
    }

    @ObfuscatedName("ao.aq(Lio;B)Lau;")
    public class38 method477(class252 arg0) {
        if (arg0.field3216 == null || this.field292 == null || this.field292.get(class27.field160) == null) {
            return null;
        }
        int var2 = arg0.field3218;
        class27[] var3 = class27.method254();
        int var4 = 0;
        class27 var6;
        while (true) {
            if (var4 >= var3.length) {
                var6 = null;
                break;
            }
            class27 var5 = var3[var4];
            if (var5.field156 == var2) {
                var6 = var5;
                break;
            }
            var4++;
        }
        if (var6 == null) {
            return null;
        }
        class305 var8 = (class305) this.field292.get(var6);
        if (var8 == null) {
            return null;
        }
        int var9 = var8.method5045(arg0.field3216, 1000000);
        String[] var10 = new String[var9];
        var8.method4983(arg0.field3216, (int[]) null, var10);
        int var11 = var10.length * var8.field3683 / 2;
        int var12 = 0;
        String[] var13 = var10;
        for (int var14 = 0; var14 < var13.length; var14++) {
            String var15 = var13[var14];
            int var16 = var8.method4982(var15);
            if (var16 > var12) {
                var12 = var16;
            }
        }
        return new class38(arg0.field3216, var12, var11, var6);
    }

    @ObfuscatedName("ao.av(IIIIII)Ljava/util/List;")
    public List method534(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field291.values().iterator();
            while (var7.hasNext()) {
                class44 var8 = (class44) var7.next();
                if (var8.method590() && var8.method604(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field283.iterator();
            while (var9.hasNext()) {
                class44 var10 = (class44) var9.next();
                if (var10.method590() && var10.method604(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ao.ak(I)Ljava/util/List;")
    public List method479() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field283);
        var1.addAll(this.field291.values());
        return var1;
    }

    @ObfuscatedName("ao.aa(IIIIB)V")
    public void method480(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class331.method5613(this.field289 * arg0, this.field289 * (63 - arg1), this.field289, arg3);
        }
        if (var5 == 1) {
            class331.method5611(this.field289 * arg0, this.field289 * (63 - arg1), this.field289, arg3);
        }
        if (var5 == 2) {
            class331.method5613(this.field289 * arg0 + this.field289 - 1, this.field289 * (63 - arg1), this.field289, arg3);
        }
        if (var5 == 3) {
            class331.method5611(this.field289 * arg0, this.field289 * (63 - arg1) + this.field289 - 1, this.field289, arg3);
        }
    }
}
