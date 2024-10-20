package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("ap")
public class class39 {

    @ObfuscatedName("ap.p")
    public static class159 field289 = new class159(37748736, 256);

    @ObfuscatedName("ap.g")
    public int field283;

    @ObfuscatedName("ap.n")
    public int field278;

    @ObfuscatedName("ap.u")
    public class25 field284;

    @ObfuscatedName("ap.a")
    public LinkedList field285;

    @ObfuscatedName("ap.z")
    public int field280;

    @ObfuscatedName("ap.w")
    public int field287;

    @ObfuscatedName("ap.y")
    public List field288;

    @ObfuscatedName("ap.c")
    public HashMap field282;

    @ObfuscatedName("ap.h")
    public final HashMap field290;

    @ObfuscatedName("bz.m(IIIB)Llz;")
    public static class335 method1065(int arg0, int arg1, int arg2) {
        class159 var3 = field289;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class335) var3.method3151(var4);
    }

    @ObfuscatedName("ci.o(Llz;IIII)V")
    public static void method1959(class335 arg0, int arg1, int arg2, int arg3) {
        class159 var4 = field289;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method3154(arg0, var6, arg0.field3896.length * 4);
    }

    @ObfuscatedName("cd.q(I)V")
    public static void method2052() {
        field289.method3172(5);
    }

    public class39(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field283 = arg0;
        this.field278 = arg1;
        this.field285 = new LinkedList();
        this.field288 = new LinkedList();
        this.field282 = new HashMap();
        this.field280 = arg2 | 0xFF000000;
        this.field290 = arg3;
    }

    @ObfuscatedName("ap.j(IIII)V")
    public void method413(int arg0, int arg1, int arg2) {
        class335 var4 = method1065(this.field283, this.field278, this.field287);
        if (var4 == null) {
            return;
        }
        if (this.field287 * 64 == arg2) {
            var4.method5799(arg0, arg1);
        } else {
            var4.method5789(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("ap.p(Li;Ljava/util/List;I)V")
    public void method414(class25 arg0, List arg1) {
        this.field282.clear();
        this.field284 = arg0;
        this.method491(arg1);
    }

    @ObfuscatedName("ap.g(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method415(HashSet arg0, List arg1) {
        this.field282.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class49 var4 = (class49) var3.next();
            if (var4.method288() == this.field283 && var4.method289() == this.field278) {
                this.field285.add(var4);
            }
        }
        this.method491(arg1);
    }

    @ObfuscatedName("ap.n(IIIILax;I)V")
    public void method433(int arg0, int arg1, int arg2, int arg3, class31 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field187; var8++) {
                    class35[] var9 = arg4.field188[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class35[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class35 var12 = var10[var11];
                            class264 var13 = class264.method752(var12.field229);
                            if (method173(var13)) {
                                this.method533(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.u(Ljg;IIILax;I)V")
    public void method533(class264 arg0, int arg1, int arg2, int arg3, class31 arg4) {
        class223 var6 = new class223(arg1, this.field283 * 64 + arg2, this.field278 * 64 + arg3);
        Object var7 = null;
        class223 var8;
        if (this.field284 == null) {
            class49 var9 = (class49) arg4;
            var8 = new class223(var9.field192 + arg1, var9.field181 * 64 + arg2 + var9.method635() * 8, var9.field190 * 64 + arg3 + var9.method630() * 8);
        } else {
            var8 = new class223(this.field284.field192 + arg1, this.field284.field181 * 64 + arg2, this.field284.field190 * 64 + arg3);
        }
        class44 var10;
        if (arg0.field3422 == null) {
            class252 var11 = class252.method1412(arg0.field3394);
            var10 = new class28(var8, var6, var11.field3245, this.method442(var11));
        } else {
            var10 = new class33(var8, var6, arg0.field3385, this);
        }
        this.field282.put(new class223(0, arg2, arg3), var10);
    }

    @ObfuscatedName("ap.a(I)V")
    public void method418() {
        Iterator var1 = this.field282.values().iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            if (var2 instanceof class33) {
                ((class33) var2).method313();
            }
        }
    }

    @ObfuscatedName("ap.z(Ljava/util/List;I)V")
    public void method491(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class28 var3 = (class28) var2.next();
            if (var3.field321.field2566 >> 6 == this.field283 && var3.field321.field2565 >> 6 == this.field278) {
                class28 var4 = new class28(var3.field321, var3.field321, var3.field141, this.method441(var3.field141));
                this.field288.add(var4);
            }
        }
    }

    @ObfuscatedName("ap.w(I)V")
    public void method503() {
        if (this.field284 != null) {
            this.field284.method280();
            return;
        }
        Iterator var1 = this.field285.iterator();
        while (var1.hasNext()) {
            class49 var2 = (class49) var1.next();
            var2.method280();
        }
    }

    @ObfuscatedName("ap.y(Lic;I)Z")
    public boolean method421(class244 arg0) {
        this.field282.clear();
        if (this.field284 == null) {
            boolean var2 = true;
            Iterator var3 = this.field285.iterator();
            while (var3.hasNext()) {
                class49 var4 = (class49) var3.next();
                var4.method282(arg0);
                var2 &= var4.method281();
            }
            if (var2) {
                Iterator var5 = this.field285.iterator();
                while (var5.hasNext()) {
                    class49 var6 = (class49) var5.next();
                    this.method433(var6.method631() * 8, var6.method627() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field284.method282(arg0);
            if (this.field284.method281()) {
                this.method433(0, 0, 64, 64, this.field284);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("ap.c(ILay;[Llh;Lic;Lic;I)V")
    public void method422(int arg0, class50 arg1, class334[] arg2, class244 arg3, class244 arg4) {
        this.field287 = arg0;
        if (this.field284 == null && this.field285.isEmpty() || method1065(this.field283, this.field278, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method421(arg3);
        int var8;
        if (this.field284 == null) {
            var8 = ((class31) this.field285.getFirst()).field177;
        } else {
            var8 = this.field284.field177;
        }
        boolean var9 = var7 & arg4.method3895(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method3955(var8);
        class37 var11;
        if (var10 == null) {
            var11 = new class37();
        } else {
            var11 = new class37(class59.method4183(var10).field3896);
        }
        class335 var13 = new class335(this.field287 * 64, this.field287 * 64);
        var13.method5792();
        if (this.field284 == null) {
            this.method425(arg1, arg2, var11);
        } else {
            this.method424(arg1, arg2, var11);
        }
        method1959(var13, this.field283, this.field278, this.field287);
        this.method503();
    }

    @ObfuscatedName("ap.h(IIILjava/util/HashSet;I)V")
    public void method437(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method432(arg0, arg1, arg3, arg2);
        this.method438(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("ap.k(Ljava/util/HashSet;III)V")
    public void method518(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field282.values().iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method559()) {
                int var6 = var5.method224();
                if (arg0.contains(var6)) {
                    class252 var7 = class252.method1412(var6);
                    this.method535(var7, var5.field319, var5.field320, arg1, arg2);
                }
            }
        }
        this.method420(arg0, arg1, arg2);
    }

    @ObfuscatedName("ap.r(Lay;[Llh;Las;B)V")
    public void method424(class50 arg0, class334[] arg1, class37 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method427(var4, var5, this.field284, arg0, arg2);
                this.method434(var4, var5, this.field284, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method426(var6, var7, this.field284, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("ap.d(Lay;[Llh;Las;B)V")
    public void method425(class50 arg0, class334[] arg1, class37 arg2) {
        Iterator var4 = this.field285.iterator();
        while (var4.hasNext()) {
            class49 var5 = (class49) var4.next();
            for (int var6 = var5.method631() * 8; var6 < var5.method631() * 8 + 8; var6++) {
                for (int var7 = var5.method627() * 8; var7 < var5.method627() * 8 + 8; var7++) {
                    this.method427(var6, var7, var5, arg0, arg2);
                    this.method434(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field285.iterator();
        while (var8.hasNext()) {
            class49 var9 = (class49) var8.next();
            for (int var10 = var9.method631() * 8; var10 < var9.method631() * 8 + 8; var10++) {
                for (int var11 = var9.method627() * 8; var11 < var9.method627() * 8 + 8; var11++) {
                    this.method426(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("ap.e(IILax;Lay;[Llh;I)V")
    public void method426(int arg0, int arg1, class31 arg2, class50 arg3, class334[] arg4) {
        this.method450(arg0, arg1, arg2);
        this.method430(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("ap.l(IILax;Lay;Las;I)V")
    public void method427(int arg0, int arg1, class31 arg2, class50 arg3, class37 arg4) {
        int var6 = arg2.field184[0][arg0][arg1] - 1;
        int var7 = arg2.field185[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class331.method5686(this.field287 * arg0, this.field287 * (63 - arg1), this.field287, this.field287, this.field280);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class42.method4912(var7, this.field280);
        }
        if (var7 > -1 && arg2.field186[0][arg0][arg1] == 0) {
            class331.method5686(this.field287 * arg0, this.field287 * (63 - arg1), this.field287, this.field287, var8);
            return;
        }
        int var9 = this.method429(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class331.method5686(this.field287 * arg0, this.field287 * (63 - arg1), this.field287, this.field287, var9);
        } else {
            arg3.method654(this.field287 * arg0, this.field287 * (63 - arg1), var9, var8, this.field287, this.field287, arg2.field186[0][arg0][arg1], arg2.field176[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("ap.t(IILax;Lay;I)V")
    public void method434(int arg0, int arg1, class31 arg2, class50 arg3) {
        for (int var5 = 1; var5 < arg2.field187; var5++) {
            int var6 = arg2.field185[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class42.method4912(var6, this.field280);
                if (arg2.field186[var5][arg0][arg1] == 0) {
                    class331.method5686(this.field287 * arg0, this.field287 * (63 - arg1), this.field287, this.field287, var7);
                } else {
                    arg3.method654(this.field287 * arg0, this.field287 * (63 - arg1), 0, var7, this.field287, this.field287, arg2.field186[var5][arg0][arg1], arg2.field176[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("ap.x(IILax;Las;B)I")
    public int method429(int arg0, int arg1, class31 arg2, class37 arg3) {
        return arg2.field184[0][arg0][arg1] == 0 ? this.field280 : arg3.method397(arg0, arg1);
    }

    @ObfuscatedName("ap.ah(IILax;[Llh;I)V")
    public void method430(int arg0, int arg1, class31 arg2, class334[] arg3) {
        for (int var5 = 0; var5 < arg2.field187; var5++) {
            class35[] var6 = arg2.field188[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class35[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class35 var9 = var7[var8];
                    if (!class230.method640(var9.field228)) {
                        int var10 = var9.field228;
                        boolean var11 = class230.field2778.field2774 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class264 var12 = class264.method752(var9.field229);
                    if (var12.field3410 != -1) {
                        if (var12.field3410 == 46 || var12.field3410 == 52) {
                            arg3[var12.field3410].method5773(this.field287 * arg0, this.field287 * (63 - arg1), this.field287 * 2 + 1, this.field287 * 2 + 1);
                        } else {
                            arg3[var12.field3410].method5773(this.field287 * arg0, this.field287 * (63 - arg1), this.field287 * 2, this.field287 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.ai(IILax;B)V")
    public void method450(int arg0, int arg1, class31 arg2) {
        for (int var4 = 0; var4 < arg2.field187; var4++) {
            class35[] var5 = arg2.field188[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class35[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class35 var8 = var6[var7];
                    int var9 = var8.field228;
                    boolean var10 = var9 >= class230.field2757.field2774 && var9 <= class230.field2759.field2774 || class230.field2760.field2774 == var9;
                    if (var10) {
                        class264 var11 = class264.method752(var8.field229);
                        int var12 = var11.field3400 == 0 ? -3355444 : -3407872;
                        if (class230.field2757.field2774 == var8.field228) {
                            this.method445(arg0, arg1, var8.field234, var12);
                        }
                        if (class230.field2756.field2774 == var8.field228) {
                            this.method445(arg0, arg1, var8.field234, -3355444);
                            this.method445(arg0, arg1, var8.field234 + 1, var12);
                        }
                        if (class230.field2759.field2774 == var8.field228) {
                            if (var8.field234 == 0) {
                                class331.method5724(this.field287 * arg0, this.field287 * (63 - arg1), 1, var12);
                            }
                            if (var8.field234 == 1) {
                                class331.method5724(this.field287 * arg0 + this.field287 - 1, this.field287 * (63 - arg1), 1, var12);
                            }
                            if (var8.field234 == 2) {
                                class331.method5724(this.field287 * arg0 + this.field287 - 1, this.field287 * (63 - arg1) + this.field287 - 1, 1, var12);
                            }
                            if (var8.field234 == 3) {
                                class331.method5724(this.field287 * arg0, this.field287 * (63 - arg1) + this.field287 - 1, 1, var12);
                            }
                        }
                        if (class230.field2760.field2774 == var8.field228) {
                            int var13 = var8.field234 % 2;
                            if (var13 == 0) {
                                for (int var14 = 0; var14 < this.field287; var14++) {
                                    class331.method5724(this.field287 * arg0 + var14, this.field287 * (64 - arg1) - 1 - var14, 1, var12);
                                }
                            } else {
                                for (int var15 = 0; var15 < this.field287; var15++) {
                                    class331.method5724(this.field287 * arg0 + var15, this.field287 * (63 - arg1) + var15, 1, var12);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("ap.ao(IILjava/util/HashSet;II)V")
    public void method432(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field282.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class223 var9 = (class223) var8.getKey();
            int var10 = (int) ((float) var9.field2566 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2565 * var5 - var6);
            class44 var12 = (class44) var8.getValue();
            if (var12 != null && var12.method559()) {
                var12.field319 = var10;
                var12.field320 = var11;
                class252 var13 = class252.method1412(var12.method224());
                if (!arg2.contains(var13.method4120())) {
                    this.method435(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("ap.ae(Ljava/util/HashSet;III)V")
    public void method420(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field288.iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method559()) {
                class252 var6 = class252.method1412(var5.method224());
                if (var6 != null && arg0.contains(var6.method4120())) {
                    this.method535(var6, var5.field319, var5.field320, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("ap.ax(Lih;IIIII)V")
    public void method535(class252 arg0, int arg1, int arg2, int arg3, int arg4) {
        class335 var6 = arg0.method4132(false);
        if (var6 == null) {
            return;
        }
        var6.method5855(arg1 - var6.field3897 / 2, arg2 - var6.field3895 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class331.method5684(arg1, arg2, 15, 16776960, 128);
            class331.method5684(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("ap.ag(Laf;IIFI)V")
    public void method435(class44 arg0, int arg1, int arg2, float arg3) {
        class252 var5 = class252.method1412(arg0.method224());
        this.method417(var5, arg1, arg2);
        this.method527(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("ap.ab(Lih;IIB)V")
    public void method417(class252 arg0, int arg1, int arg2) {
        class335 var4 = arg0.method4132(false);
        if (var4 != null) {
            int var5 = this.method439(var4, arg0.field3257);
            int var6 = this.method440(var4, arg0.field3241);
            var4.method5855(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("ap.am(Laf;Lih;IIFB)V")
    public void method527(class44 arg0, class252 arg1, int arg2, int arg3, float arg4) {
        class38 var6 = arg0.method225();
        if (var6 != null && var6.field269.method217(arg4)) {
            class305 var7 = (class305) this.field290.get(var6.field269);
            var7.method5074(var6.field272, arg2 - var6.field267 / 2, arg3, var6.field267, var6.field268, 0xFF000000 | arg1.field3252, 0, 1, 0, var7.field3720 / 2);
        }
    }

    @ObfuscatedName("ap.ak(IILjava/util/HashSet;II)V")
    public void method438(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field288.iterator();
        while (var6.hasNext()) {
            class44 var7 = (class44) var6.next();
            if (var7.method559()) {
                int var8 = var7.field321.field2566 % 64;
                int var9 = var7.field321.field2565 % 64;
                var7.field319 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field320 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method224())) {
                    this.method435(var7, var7.field319, var7.field320, var5);
                }
            }
        }
    }

    @ObfuscatedName("ap.ad(Llz;Ljc;I)I")
    public int method439(class335 arg0, class266 arg1) {
        switch(arg1.field3491) {
            case 1:
                return -arg0.field3897 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3897;
        }
    }

    @ObfuscatedName("ap.as(Llz;Lif;I)I")
    public int method440(class335 arg0, class249 arg1) {
        switch(arg1.field3228) {
            case 1:
                return -arg0.field3895 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3895;
        }
    }

    @ObfuscatedName("e.ar(Ljg;S)Z")
    public static boolean method173(class264 arg0) {
        if (arg0.field3422 != null) {
            int[] var1 = arg0.field3422;
            for (int var2 = 0; var2 < var1.length; var2++) {
                int var3 = var1[var2];
                class264 var4 = class264.method752(var3);
                if (var4.field3394 != -1) {
                    return true;
                }
            }
        } else if (arg0.field3394 != -1) {
            return true;
        }
        return false;
    }

    @ObfuscatedName("ap.ap(IB)Lar;")
    public class38 method441(int arg0) {
        class252 var2 = class252.method1412(arg0);
        return this.method442(var2);
    }

    @ObfuscatedName("ap.al(Lih;I)Lar;")
    public class38 method442(class252 arg0) {
        if (arg0.field3247 == null || this.field290 == null || this.field290.get(class27.field132) == null) {
            return null;
        }
        int var2 = arg0.field3249;
        class27[] var3 = new class27[] { class27.field129, class27.field137, class27.field132 };
        class27[] var4 = var3;
        int var5 = 0;
        class27 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class27 var6 = var4[var5];
            if (var6.field133 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class305 var9 = (class305) this.field290.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5087(arg0.field3247, 1000000);
        String[] var11 = new String[var10];
        var9.method5066(arg0.field3247, (int[]) null, var11);
        int var12 = var11.length * var9.field3720 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method5065(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class38(arg0.field3247, var13, var12, var7);
    }

    @ObfuscatedName("ap.an(IIIIII)Ljava/util/List;")
    public List method467(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field282.values().iterator();
            while (var7.hasNext()) {
                class44 var8 = (class44) var7.next();
                if (var8.method559() && var8.method557(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field288.iterator();
            while (var9.hasNext()) {
                class44 var10 = (class44) var9.next();
                if (var10.method559() && var10.method557(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("ap.ac(I)Ljava/util/List;")
    public List method444() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field288);
        var1.addAll(this.field282.values());
        return var1;
    }

    @ObfuscatedName("ap.av(IIIII)V")
    public void method445(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class331.method5694(this.field287 * arg0, this.field287 * (63 - arg1), this.field287, arg3);
        }
        if (var5 == 1) {
            class331.method5724(this.field287 * arg0, this.field287 * (63 - arg1), this.field287, arg3);
        }
        if (var5 == 2) {
            class331.method5694(this.field287 * arg0 + this.field287 - 1, this.field287 * (63 - arg1), this.field287, arg3);
        }
        if (var5 == 3) {
            class331.method5724(this.field287 * arg0, this.field287 * (63 - arg1) + this.field287 - 1, this.field287, arg3);
        }
    }
}
