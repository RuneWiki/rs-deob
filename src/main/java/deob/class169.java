package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("fb")
public class class169 {

    @ObfuscatedName("fb.l")
    public static class221 field1962 = new class221(37748736, 256);

    @ObfuscatedName("fb.n")
    public int field1969;

    @ObfuscatedName("fb.w")
    public int field1963;

    @ObfuscatedName("fb.f")
    public class163 field1965;

    @ObfuscatedName("fb.o")
    public LinkedList field1966;

    @ObfuscatedName("fb.x")
    public int field1967;

    @ObfuscatedName("fb.r")
    public int field1968;

    @ObfuscatedName("fb.p")
    public List field1958;

    @ObfuscatedName("fb.h")
    public HashMap field1970;

    @ObfuscatedName("fb.k")
    public final HashMap field1971;

    @ObfuscatedName("es.s(IIII)J")
    public static long method2669(int arg0, int arg1, int arg2) {
        return (long) (arg2 << 16 | arg0 << 8 | arg1);
    }

    @ObfuscatedName("jr.t(IIIB)Lom;")
    public static class398 method4386(int arg0, int arg1, int arg2) {
        return (class398) field1962.method3896(method2669(arg0, arg1, arg2));
    }

    @ObfuscatedName("eg.v(I)V")
    public static void method2404() {
        field1962.method3902();
    }

    public class169(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field1969 = arg0;
        this.field1963 = arg1;
        this.field1966 = new LinkedList();
        this.field1958 = new LinkedList();
        this.field1970 = new HashMap();
        this.field1967 = arg2 | 0xFF000000;
        this.field1971 = arg3;
    }

    @ObfuscatedName("fb.j(IIIB)V")
    public void method3039(int arg0, int arg1, int arg2) {
        class398 var4 = method4386(this.field1969, this.field1963, this.field1968);
        if (var4 == null) {
            return;
        }
        if (this.field1968 * 64 == arg2) {
            var4.method6445(arg0, arg1);
        } else {
            var4.method6414(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("fb.l(Lfj;Ljava/util/List;B)V")
    public void method3040(class163 arg0, List arg1) {
        this.field1970.clear();
        this.field1965 = arg0;
        this.method3045(arg1);
    }

    @ObfuscatedName("fb.n(Ljava/util/HashSet;Ljava/util/List;B)V")
    public void method3041(HashSet arg0, List arg1) {
        this.field1970.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class171 var4 = (class171) var3.next();
            if (var4.method3236() == this.field1969 && var4.method3235() == this.field1963) {
                this.field1966.add(var4);
            }
        }
        this.method3045(arg1);
    }

    @ObfuscatedName("fb.w(IIIILfk;I)V")
    public void method3145(int arg0, int arg1, int arg2, int arg3, class177 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label45: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2052; var8++) {
                    class179[] var9 = arg4.field2059[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class179[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class179 var12 = var10[var11];
                            class156 var13 = class156.method2267(var12.field2071);
                            if (Statics.method1894(var13)) {
                                this.method3043(var13, var8, var6, var7, arg4);
                                continue label45;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fb.f(Lem;IIILfk;I)V")
    public void method3043(class156 arg0, int arg1, int arg2, int arg3, class177 arg4) {
        class245 var6 = new class245(arg1, this.field1969 * 64 + arg2, this.field1963 * 64 + arg3);
        Object var7 = null;
        class245 var8;
        if (this.field1965 == null) {
            class171 var9 = (class171) arg4;
            var8 = new class245(var9.field2061 + arg1, var9.field2051 * 64 + arg2 + var9.method3200() * 8, var9.field2048 * 64 + arg3 + var9.method3196() * 8);
        } else {
            var8 = new class245(this.field1965.field2061 + arg1, this.field1965.field2051 * 64 + arg2, this.field1965.field2048 * 64 + arg3);
        }
        class186 var10;
        if (arg0.field1762 == null) {
            class141 var11 = class141.method1794(arg0.field1763);
            var10 = new class174(var8, var6, var11.field1534, this.method3069(var11));
        } else {
            var10 = new class166(var8, var6, arg0.field1753, this);
        }
        class141 var12 = class141.method1794(var10.method2921());
        if (var12.field1530) {
            this.field1970.put(new class245(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("fb.o(I)V")
    public void method3044() {
        Iterator var1 = this.field1970.values().iterator();
        while (var1.hasNext()) {
            class186 var2 = (class186) var1.next();
            if (var2 instanceof class166) {
                ((class166) var2).method2920();
            }
        }
    }

    @ObfuscatedName("fb.x(Ljava/util/List;I)V")
    public void method3045(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class174 var3 = (class174) var2.next();
            if (class141.method1794(var3.field2017).field1530 && var3.field2110.field2920 >> 6 == this.field1969 && var3.field2110.field2922 >> 6 == this.field1963) {
                class174 var4 = new class174(var3.field2110, var3.field2110, var3.field2017, this.method3068(var3.field2017));
                this.field1958.add(var4);
            }
        }
    }

    @ObfuscatedName("fb.r(I)V")
    public void method3046() {
        if (this.field1965 != null) {
            this.field1965.method3229();
            return;
        }
        Iterator var1 = this.field1966.iterator();
        while (var1.hasNext()) {
            class171 var2 = (class171) var1.next();
            var2.method3229();
        }
    }

    @ObfuscatedName("fb.p(Ljy;I)Z")
    public boolean method3047(class277 arg0) {
        this.field1970.clear();
        if (this.field1965 == null) {
            boolean var2 = true;
            Iterator var3 = this.field1966.iterator();
            while (var3.hasNext()) {
                class171 var4 = (class171) var3.next();
                var4.method3231(arg0);
                var2 &= var4.method3238();
            }
            if (var2) {
                Iterator var5 = this.field1966.iterator();
                while (var5.hasNext()) {
                    class171 var6 = (class171) var5.next();
                    this.method3145(var6.method3207() * 8, var6.method3197() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field1965.method3231(arg0);
            if (this.field1965.method3238()) {
                this.method3145(0, 0, 64, 64, this.field1965);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("fb.h(ILgb;[Lof;Ljy;Ljy;B)V")
    public void method3048(int arg0, class190 arg1, class397[] arg2, class277 arg3, class277 arg4) {
        this.field1968 = arg0;
        if (this.field1965 == null && this.field1966.isEmpty() || method4386(this.field1969, this.field1963, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method3047(arg3);
        int var8;
        if (this.field1965 == null) {
            var8 = ((class177) this.field1966.getFirst()).field2047;
        } else {
            var8 = this.field1965.field2047;
        }
        boolean var9 = var7 & arg4.method4463(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method4466(var8);
        class180 var11;
        if (var10 == null) {
            var11 = new class180();
        } else {
            var11 = new class180(class16.method1834(var10).field4280);
        }
        class398 var13 = new class398(this.field1968 * 64, this.field1968 * 64);
        var13.method6399();
        if (this.field1965 == null) {
            this.method3052(arg1, arg2, var11);
        } else {
            this.method3051(arg1, arg2, var11);
        }
        int var14 = this.field1969;
        int var15 = this.field1963;
        int var16 = this.field1968;
        field1962.method3900(var13, method2669(var14, var15, var16), var13.field4280.length * 4);
        this.method3046();
    }

    @ObfuscatedName("fb.k(IIILjava/util/HashSet;I)V")
    public void method3049(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method3059(arg0, arg1, arg3, arg2);
        this.method3065(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("fb.a(Ljava/util/HashSet;III)V")
    public void method3063(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field1970.values().iterator();
        while (var4.hasNext()) {
            class186 var5 = (class186) var4.next();
            if (var5.method3284()) {
                int var6 = var5.method2921();
                if (arg0.contains(var6)) {
                    class141 var7 = class141.method1794(var6);
                    this.method3061(var7, var5.field2112, var5.field2109, arg1, arg2);
                }
            }
        }
        this.method3060(arg0, arg1, arg2);
    }

    @ObfuscatedName("fb.q(Lgb;[Lof;Lfn;B)V")
    public void method3051(class190 arg0, class397[] arg1, class180 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method3134(var4, var5, this.field1965, arg0, arg2);
                this.method3085(var4, var5, this.field1965, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method3050(var6, var7, this.field1965, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("fb.u(Lgb;[Lof;Lfn;I)V")
    public void method3052(class190 arg0, class397[] arg1, class180 arg2) {
        Iterator var4 = this.field1966.iterator();
        while (var4.hasNext()) {
            class171 var5 = (class171) var4.next();
            for (int var6 = var5.method3207() * 8; var6 < var5.method3207() * 8 + 8; var6++) {
                for (int var7 = var5.method3197() * 8; var7 < var5.method3197() * 8 + 8; var7++) {
                    this.method3134(var6, var7, var5, arg0, arg2);
                    this.method3085(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field1966.iterator();
        while (var8.hasNext()) {
            class171 var9 = (class171) var8.next();
            for (int var10 = var9.method3207() * 8; var10 < var9.method3207() * 8 + 8; var10++) {
                for (int var11 = var9.method3197() * 8; var11 < var9.method3197() * 8 + 8; var11++) {
                    this.method3050(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("fb.e(IILfk;Lgb;[Lof;B)V")
    public void method3050(int arg0, int arg1, class177 arg2, class190 arg3, class397[] arg4) {
        this.method3054(arg0, arg1, arg2);
        this.method3057(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("fb.c(IILfk;Lgb;Lfn;B)V")
    public void method3134(int arg0, int arg1, class177 arg2, class190 arg3, class180 arg4) {
        int var6 = arg2.field2055[0][arg0][arg1] - 1;
        int var7 = arg2.field2062[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class394.method6272(this.field1968 * arg0, this.field1968 * (63 - arg1), this.field1968, this.field1968, this.field1967);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class184.method2119(var7, this.field1967);
        }
        if (var7 > -1 && arg2.field2057[0][arg0][arg1] == 0) {
            class394.method6272(this.field1968 * arg0, this.field1968 * (63 - arg1), this.field1968, this.field1968, var8);
            return;
        }
        int var9 = this.method3056(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class394.method6272(this.field1968 * arg0, this.field1968 * (63 - arg1), this.field1968, this.field1968, var9);
        } else {
            arg3.method3321(this.field1968 * arg0, this.field1968 * (63 - arg1), var9, var8, this.field1968, this.field1968, arg2.field2057[0][arg0][arg1], arg2.field2058[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("fb.i(IILfk;Lgb;I)V")
    public void method3085(int arg0, int arg1, class177 arg2, class190 arg3) {
        for (int var5 = 1; var5 < arg2.field2052; var5++) {
            int var6 = arg2.field2062[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class184.method2119(var6, this.field1967);
                if (arg2.field2057[var5][arg0][arg1] == 0) {
                    class394.method6272(this.field1968 * arg0, this.field1968 * (63 - arg1), this.field1968, this.field1968, var7);
                } else {
                    arg3.method3321(this.field1968 * arg0, this.field1968 * (63 - arg1), 0, var7, this.field1968, this.field1968, arg2.field2057[var5][arg0][arg1], arg2.field2058[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("fb.m(IILfk;Lfn;B)I")
    public int method3056(int arg0, int arg1, class177 arg2, class180 arg3) {
        return arg2.field2055[0][arg0][arg1] == 0 ? this.field1967 : arg3.method3262(arg0, arg1);
    }

    @ObfuscatedName("fb.b(IILfk;[Lof;I)V")
    public void method3057(int arg0, int arg1, class177 arg2, class397[] arg3) {
        for (int var5 = 0; var5 < arg2.field2052; var5++) {
            class179[] var6 = arg2.field2059[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class179[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class179 var9 = var7[var8];
                    if (!class258.method1704(var9.field2069)) {
                        int var10 = var9.field2069;
                        boolean var11 = class258.field3162.field3163 == var10;
                        if (!var11) {
                            continue;
                        }
                    }
                    class156 var12 = class156.method2267(var9.field2071);
                    if (var12.field1764 != -1) {
                        if (var12.field1764 == 46 || var12.field1764 == 52) {
                            arg3[var12.field1764].method6346(this.field1968 * arg0, this.field1968 * (63 - arg1), this.field1968 * 2 + 1, this.field1968 * 2 + 1);
                        } else {
                            arg3[var12.field1764].method6346(this.field1968 * arg0, this.field1968 * (63 - arg1), this.field1968 * 2, this.field1968 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fb.z(IILfk;I)V")
    public void method3054(int arg0, int arg1, class177 arg2) {
        for (int var4 = 0; var4 < arg2.field2052; var4++) {
            class179[] var5 = arg2.field2059[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class179[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class179 var8 = var6[var7];
                    if (class258.method2215(var8.field2069)) {
                        class156 var9 = class156.method2267(var8.field2071);
                        int var10 = var9.field1754 == 0 ? -3355444 : -3407872;
                        if (class258.field3149.field3163 == var8.field2069) {
                            this.method3072(arg0, arg1, var8.field2068, var10);
                        }
                        if (class258.field3140.field3163 == var8.field2069) {
                            this.method3072(arg0, arg1, var8.field2068, -3355444);
                            this.method3072(arg0, arg1, var8.field2068 + 1, var10);
                        }
                        if (class258.field3143.field3163 == var8.field2069) {
                            if (var8.field2068 == 0) {
                                class394.method6278(this.field1968 * arg0, this.field1968 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2068 == 1) {
                                class394.method6278(this.field1968 * arg0 + this.field1968 - 1, this.field1968 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2068 == 2) {
                                class394.method6278(this.field1968 * arg0 + this.field1968 - 1, this.field1968 * (63 - arg1) + this.field1968 - 1, 1, var10);
                            }
                            if (var8.field2068 == 3) {
                                class394.method6278(this.field1968 * arg0, this.field1968 * (63 - arg1) + this.field1968 - 1, 1, var10);
                            }
                        }
                        if (class258.field3160.field3163 == var8.field2069) {
                            int var11 = var8.field2068 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field1968; var12++) {
                                    class394.method6278(this.field1968 * arg0 + var12, this.field1968 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field1968; var13++) {
                                    class394.method6278(this.field1968 * arg0 + var13, this.field1968 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("fb.d(IILjava/util/HashSet;II)V")
    public void method3059(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field1970.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class245 var9 = (class245) var8.getKey();
            int var10 = (int) ((float) var9.field2920 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2922 * var5 - var6);
            class186 var12 = (class186) var8.getValue();
            if (var12 != null && var12.method3284()) {
                var12.field2112 = var10;
                var12.field2109 = var11;
                class141 var13 = class141.method1794(var12.method2921());
                if (!arg2.contains(var13.method2424())) {
                    this.method3062(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("fb.y(Ljava/util/HashSet;III)V")
    public void method3060(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field1958.iterator();
        while (var4.hasNext()) {
            class186 var5 = (class186) var4.next();
            if (var5.method3284()) {
                class141 var6 = class141.method1794(var5.method2921());
                if (var6 != null && arg0.contains(var6.method2424())) {
                    this.method3061(var6, var5.field2112, var5.field2109, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("fb.g(Lei;IIIII)V")
    public void method3061(class141 arg0, int arg1, int arg2, int arg3, int arg4) {
        class398 var6 = arg0.method2411(false);
        if (var6 == null) {
            return;
        }
        var6.method6403(arg1 - var6.field4270 / 2, arg2 - var6.field4271 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class394.method6270(arg1, arg2, 15, 16776960, 128);
            class394.method6270(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("fb.ae(Lgr;IIFS)V")
    public void method3062(class186 arg0, int arg1, int arg2, float arg3) {
        class141 var5 = class141.method1794(arg0.method2921());
        this.method3112(var5, arg1, arg2);
        this.method3064(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("fb.an(Lei;III)V")
    public void method3112(class141 arg0, int arg1, int arg2) {
        class398 var4 = arg0.method2411(false);
        if (var4 != null) {
            int var5 = this.method3142(var4, arg0.field1540);
            int var6 = this.method3067(var4, arg0.field1550);
            var4.method6403(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("fb.am(Lgr;Lei;IIFI)V")
    public void method3064(class186 arg0, class141 arg1, int arg2, int arg3, float arg4) {
        class181 var6 = arg0.method2922();
        if (var6 != null && var6.field2082.method2910(arg4)) {
            class302 var7 = (class302) this.field1971.get(var6.field2082);
            var7.method4895(var6.field2081, arg2 - var6.field2079 / 2, arg3, var6.field2079, var6.field2085, 0xFF000000 | arg1.field1548, 0, 1, 0, var7.field3738 / 2);
        }
    }

    @ObfuscatedName("fb.al(IILjava/util/HashSet;IS)V")
    public void method3065(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field1958.iterator();
        while (var6.hasNext()) {
            class186 var7 = (class186) var6.next();
            if (var7.method3284()) {
                int var8 = var7.field2110.field2920 % 64;
                int var9 = var7.field2110.field2922 % 64;
                var7.field2112 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2109 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method2921())) {
                    this.method3062(var7, var7.field2112, var7.field2109, var5);
                }
            }
        }
    }

    @ObfuscatedName("fb.aq(Lom;Leh;I)I")
    public int method3142(class398 arg0, class147 arg1) {
        switch(arg1.field1611) {
            case 0:
                return -arg0.field4270 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4270;
        }
    }

    @ObfuscatedName("fb.aa(Lom;Ley;I)I")
    public int method3067(class398 arg0, class149 arg1) {
        switch(arg1.field1658) {
            case 0:
                return -arg0.field4271 / 2;
            case 1:
                return 0;
            default:
                return -arg0.field4271;
        }
    }

    @ObfuscatedName("fb.ax(IS)Lff;")
    public class181 method3068(int arg0) {
        class141 var2 = class141.method1794(arg0);
        return this.method3069(var2);
    }

    @ObfuscatedName("fb.au(Lei;I)Lff;")
    public class181 method3069(class141 arg0) {
        if (arg0.field1537 == null || this.field1971 == null || this.field1971.get(class165.field1917) == null) {
            return null;
        }
        class165 var2 = class165.method2911(arg0.field1539);
        if (var2 == null) {
            return null;
        }
        class302 var3 = (class302) this.field1971.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method4915(arg0.field1537, 1000000);
        String[] var5 = new String[var4];
        var3.method4905(arg0.field1537, (int[]) null, var5);
        int var6 = var5.length * var3.field3738 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method4887(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class181(arg0.field1537, var7, var6, var2);
    }

    @ObfuscatedName("fb.av(IIIIII)Ljava/util/List;")
    public List method3070(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field1970.values().iterator();
            while (var7.hasNext()) {
                class186 var8 = (class186) var7.next();
                if (var8.method3284() && var8.method3282(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field1958.iterator();
            while (var9.hasNext()) {
                class186 var10 = (class186) var9.next();
                if (var10.method3284() && var10.method3282(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("fb.as(I)Ljava/util/List;")
    public List method3071() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field1958);
        var1.addAll(this.field1970.values());
        return var1;
    }

    @ObfuscatedName("fb.ao(IIIII)V")
    public void method3072(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class394.method6324(this.field1968 * arg0, this.field1968 * (63 - arg1), this.field1968, arg3);
        }
        if (var5 == 1) {
            class394.method6278(this.field1968 * arg0, this.field1968 * (63 - arg1), this.field1968, arg3);
        }
        if (var5 == 2) {
            class394.method6324(this.field1968 * arg0 + this.field1968 - 1, this.field1968 * (63 - arg1), this.field1968, arg3);
        }
        if (var5 == 3) {
            class394.method6278(this.field1968 * arg0, this.field1968 * (63 - arg1) + this.field1968 - 1, this.field1968, arg3);
        }
    }
}
