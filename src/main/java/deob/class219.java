package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("hw")
public class class219 {

    @ObfuscatedName("hw.t")
    public static class247 field2621 = new class247(37748736, 256);

    @ObfuscatedName("hw.s")
    public int field2624;

    @ObfuscatedName("hw.j")
    public int field2623;

    @ObfuscatedName("hw.w")
    public class213 field2630;

    @ObfuscatedName("hw.n")
    public LinkedList field2625;

    @ObfuscatedName("hw.r")
    public int field2626;

    @ObfuscatedName("hw.o")
    public int field2627;

    @ObfuscatedName("hw.v")
    public List field2628;

    @ObfuscatedName("hw.d")
    public HashMap field2629;

    @ObfuscatedName("hw.h")
    public final HashMap field2617;

    @ObfuscatedName("km.c(Lpl;IIIB)V")
    public static void method4987(class432 arg0, int arg1, int arg2, int arg3) {
        class247 var4 = field2621;
        long var6 = (long) (arg3 << 16 | arg1 << 8 | arg2);
        var4.method4491(arg0, var6, arg0.field4571.length * 4);
    }

    @ObfuscatedName("di.b(I)V")
    public static void method2603() {
        field2621.method4490();
    }

    public class219(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field2624 = arg0;
        this.field2623 = arg1;
        this.field2625 = new LinkedList();
        this.field2628 = new LinkedList();
        this.field2629 = new HashMap();
        this.field2626 = arg2 | 0xFF000000;
        this.field2617 = arg3;
    }

    @ObfuscatedName("hw.p(IIIB)V")
    public void method4150(int arg0, int arg1, int arg2) {
        int var4 = this.field2624;
        int var5 = this.field2623;
        int var6 = this.field2627;
        class247 var7 = field2621;
        long var8 = (long) (var6 << 16 | var4 << 8 | var5);
        class432 var10 = (class432) var7.method4487(var8);
        if (var10 == null) {
            return;
        }
        if (this.field2627 * 64 == arg2) {
            var10.method7049(arg0, arg1);
        } else {
            var10.method7104(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("hw.m(Lhn;Ljava/util/List;I)V")
    public void method4151(class213 arg0, List arg1) {
        this.field2629.clear();
        this.field2630 = arg0;
        this.method4156(arg1);
    }

    @ObfuscatedName("hw.t(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method4216(HashSet arg0, List arg1) {
        this.field2629.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class221 var4 = (class221) var3.next();
            if (var4.method4360() == this.field2624 && var4.method4372() == this.field2623) {
                this.field2625.add(var4);
            }
        }
        this.method4156(arg1);
    }

    @ObfuscatedName("hw.s(IIIILhz;I)V")
    public void method4153(int arg0, int arg1, int arg2, int arg3, class227 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field2704; var8++) {
                    class229[] var9 = arg4.field2706[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class229[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class180 var13;
                            boolean var18;
                            label58: {
                                class229 var12 = var10[var11];
                                var13 = class180.method2760(var12.field2724);
                                if (var13.field1981 != null) {
                                    int[] var14 = var13.field1981;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class180 var17 = class180.method2760(var16);
                                        if (var17.field1980 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field1980 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method4154(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hw.j(Lfm;IIILhz;I)V")
    public void method4154(class180 arg0, int arg1, int arg2, int arg3, class227 arg4) {
        class277 var6 = new class277(arg1, this.field2624 * 64 + arg2, this.field2623 * 64 + arg3);
        Object var7 = null;
        class277 var8;
        if (this.field2630 == null) {
            class221 var9 = (class221) arg4;
            var8 = new class277(var9.field2711 + arg1, var9.field2708 * 64 + arg2 + var9.method4322() * 8, var9.field2709 * 64 + arg3 + var9.method4313() * 8);
        } else {
            var8 = new class277(this.field2630.field2711 + arg1, this.field2630.field2708 * 64 + arg2, this.field2630.field2709 * 64 + arg3);
        }
        class236 var10;
        if (arg0.field1981 == null) {
            class164 var11 = class164.method2044(arg0.field1980);
            var10 = new class224(var8, var6, var11.field1753, this.method4179(var11));
        } else {
            var10 = new class216(var8, var6, arg0.field1951, this);
        }
        class164 var12 = class164.method2044(var10.method4040());
        if (var12.field1759) {
            this.field2629.put(new class277(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("hw.w(I)V")
    public void method4185() {
        Iterator var1 = this.field2629.values().iterator();
        while (var1.hasNext()) {
            class236 var2 = (class236) var1.next();
            if (var2 instanceof class216) {
                ((class216) var2).method4033();
            }
        }
    }

    @ObfuscatedName("hw.n(Ljava/util/List;I)V")
    public void method4156(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class224 var3 = (class224) var2.next();
            if (class164.method2044(var3.field2669).field1759 && var3.field2760.field3188 >> 6 == this.field2624 && var3.field2760.field3189 >> 6 == this.field2623) {
                class224 var4 = new class224(var3.field2760, var3.field2760, var3.field2669, this.method4209(var3.field2669));
                this.field2628.add(var4);
            }
        }
    }

    @ObfuscatedName("hw.r(I)V")
    public void method4157() {
        if (this.field2630 != null) {
            this.field2630.method4355();
            return;
        }
        Iterator var1 = this.field2625.iterator();
        while (var1.hasNext()) {
            class221 var2 = (class221) var1.next();
            var2.method4355();
        }
    }

    @ObfuscatedName("hw.o(Lku;S)Z")
    public boolean method4158(class302 arg0) {
        this.field2629.clear();
        if (this.field2630 == null) {
            boolean var2 = true;
            Iterator var3 = this.field2625.iterator();
            while (var3.hasNext()) {
                class221 var4 = (class221) var3.next();
                var4.method4364(arg0);
                var2 &= var4.method4354();
            }
            if (var2) {
                Iterator var5 = this.field2625.iterator();
                while (var5.hasNext()) {
                    class221 var6 = (class221) var5.next();
                    this.method4153(var6.method4314() * 8, var6.method4315() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field2630.method4364(arg0);
            if (this.field2630.method4354()) {
                this.method4153(0, 0, 64, 64, this.field2630);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("hw.v(ILig;[Lpa;Lku;Lku;I)V")
    public void method4239(int arg0, class240 arg1, class431[] arg2, class302 arg3, class302 arg4) {
        this.field2627 = arg0;
        if (this.field2630 == null && this.field2625.isEmpty()) {
            return;
        }
        int var6 = this.field2624;
        int var7 = this.field2623;
        class247 var8 = field2621;
        long var9 = (long) (arg0 << 16 | var6 << 8 | var7);
        class432 var11 = (class432) var8.method4487(var9);
        if (var11 != null) {
            return;
        }
        boolean var12 = true;
        boolean var13 = var12 & this.method4158(arg3);
        int var14;
        if (this.field2630 == null) {
            var14 = ((class227) this.field2625.getFirst()).field2702;
        } else {
            var14 = this.field2630.field2702;
        }
        boolean var15 = var13 & arg4.method5057(var14);
        if (!var15) {
            return;
        }
        byte[] var16 = arg4.method5059(var14);
        class230 var17;
        if (var16 == null) {
            var17 = new class230();
        } else {
            var17 = new class230(class29.method2064(var16).field4571);
        }
        class432 var19 = new class432(this.field2627 * 64, this.field2627 * 64);
        var19.method7042();
        if (this.field2630 == null) {
            this.method4224(arg1, arg2, var17);
        } else {
            this.method4219(arg1, arg2, var17);
        }
        method4987(var19, this.field2624, this.field2623, this.field2627);
        this.method4157();
    }

    @ObfuscatedName("hw.d(IIILjava/util/HashSet;B)V")
    public void method4246(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method4169(arg0, arg1, arg3, arg2);
        this.method4175(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("hw.h(Ljava/util/HashSet;III)V")
    public void method4195(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2629.values().iterator();
        while (var4.hasNext()) {
            class236 var5 = (class236) var4.next();
            if (var5.method4410()) {
                int var6 = var5.method4040();
                if (arg0.contains(var6)) {
                    class164 var7 = class164.method2044(var6);
                    this.method4171(var7, var5.field2758, var5.field2761, arg1, arg2);
                }
            }
        }
        this.method4170(arg0, arg1, arg2);
    }

    @ObfuscatedName("hw.g(Lig;[Lpa;Lhq;I)V")
    public void method4219(class240 arg0, class431[] arg1, class230 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method4149(var4, var5, this.field2630, arg0, arg2);
                this.method4165(var4, var5, this.field2630, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method4163(var6, var7, this.field2630, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("hw.e(Lig;[Lpa;Lhq;I)V")
    public void method4224(class240 arg0, class431[] arg1, class230 arg2) {
        Iterator var4 = this.field2625.iterator();
        while (var4.hasNext()) {
            class221 var5 = (class221) var4.next();
            for (int var6 = var5.method4314() * 8; var6 < var5.method4314() * 8 + 8; var6++) {
                for (int var7 = var5.method4315() * 8; var7 < var5.method4315() * 8 + 8; var7++) {
                    this.method4149(var6, var7, var5, arg0, arg2);
                    this.method4165(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field2625.iterator();
        while (var8.hasNext()) {
            class221 var9 = (class221) var8.next();
            for (int var10 = var9.method4314() * 8; var10 < var9.method4314() * 8 + 8; var10++) {
                for (int var11 = var9.method4315() * 8; var11 < var9.method4315() * 8 + 8; var11++) {
                    this.method4163(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("hw.a(IILhz;Lig;[Lpa;I)V")
    public void method4163(int arg0, int arg1, class227 arg2, class240 arg3, class431[] arg4) {
        this.method4168(arg0, arg1, arg2);
        this.method4167(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("hw.u(IILhz;Lig;Lhq;I)V")
    public void method4149(int arg0, int arg1, class227 arg2, class240 arg3, class230 arg4) {
        int var6 = arg2.field2696[0][arg0][arg1] - 1;
        int var7 = arg2.field2705[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class428.method6943(this.field2627 * arg0, this.field2627 * (63 - arg1), this.field2627, this.field2627, this.field2626);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class234.method2131(var7, this.field2626);
        }
        if (var7 > -1 && arg2.field2700[0][arg0][arg1] == 0) {
            class428.method6943(this.field2627 * arg0, this.field2627 * (63 - arg1), this.field2627, this.field2627, var8);
            return;
        }
        int var9 = this.method4166(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class428.method6943(this.field2627 * arg0, this.field2627 * (63 - arg1), this.field2627, this.field2627, var9);
        } else {
            arg3.method4446(this.field2627 * arg0, this.field2627 * (63 - arg1), var9, var8, this.field2627, this.field2627, arg2.field2700[0][arg0][arg1], arg2.field2707[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("hw.k(IILhz;Lig;I)V")
    public void method4165(int arg0, int arg1, class227 arg2, class240 arg3) {
        for (int var5 = 1; var5 < arg2.field2704; var5++) {
            int var6 = arg2.field2705[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class234.method2131(var6, this.field2626);
                if (arg2.field2700[var5][arg0][arg1] == 0) {
                    class428.method6943(this.field2627 * arg0, this.field2627 * (63 - arg1), this.field2627, this.field2627, var7);
                } else {
                    arg3.method4446(this.field2627 * arg0, this.field2627 * (63 - arg1), 0, var7, this.field2627, this.field2627, arg2.field2700[var5][arg0][arg1], arg2.field2707[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("hw.f(IILhz;Lhq;I)I")
    public int method4166(int arg0, int arg1, class227 arg2, class230 arg3) {
        return arg2.field2696[0][arg0][arg1] == 0 ? this.field2626 : arg3.method4391(arg0, arg1);
    }

    @ObfuscatedName("hw.l(IILhz;[Lpa;I)V")
    public void method4167(int arg0, int arg1, class227 arg2, class431[] arg3) {
        for (int var5 = 0; var5 < arg2.field2704; var5++) {
            class229[] var6 = arg2.field2706[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class229[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class229 var9 = var7[var8];
                    int var10 = var9.field2720;
                    boolean var11 = var10 >= class284.field3403.field3406 && var10 <= class284.field3404.field3406;
                    if (!var11) {
                        int var12 = var9.field2720;
                        boolean var13 = class284.field3390.field3406 == var12;
                        if (!var13) {
                            continue;
                        }
                    }
                    class180 var14 = class180.method2760(var9.field2724);
                    if (var14.field1992 != -1) {
                        if (var14.field1992 == 46 || var14.field1992 == 52) {
                            arg3[var14.field1992].method7020(this.field2627 * arg0, this.field2627 * (63 - arg1), this.field2627 * 2 + 1, this.field2627 * 2 + 1);
                        } else {
                            arg3[var14.field1992].method7020(this.field2627 * arg0, this.field2627 * (63 - arg1), this.field2627 * 2, this.field2627 * 2);
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hw.q(IILhz;I)V")
    public void method4168(int arg0, int arg1, class227 arg2) {
        for (int var4 = 0; var4 < arg2.field2704; var4++) {
            class229[] var5 = arg2.field2706[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class229[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class229 var8 = var6[var7];
                    if (class284.method4423(var8.field2720)) {
                        class180 var9 = class180.method2760(var8.field2724);
                        int var10 = var9.field1956 == 0 ? -3355444 : -3407872;
                        if (class284.field3392.field3406 == var8.field2720) {
                            this.method4159(arg0, arg1, var8.field2721, var10);
                        }
                        if (class284.field3385.field3406 == var8.field2720) {
                            this.method4159(arg0, arg1, var8.field2721, -3355444);
                            this.method4159(arg0, arg1, var8.field2721 + 1, var10);
                        }
                        if (class284.field3386.field3406 == var8.field2720) {
                            if (var8.field2721 == 0) {
                                class428.method6949(this.field2627 * arg0, this.field2627 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2721 == 1) {
                                class428.method6949(this.field2627 * arg0 + this.field2627 - 1, this.field2627 * (63 - arg1), 1, var10);
                            }
                            if (var8.field2721 == 2) {
                                class428.method6949(this.field2627 * arg0 + this.field2627 - 1, this.field2627 * (63 - arg1) + this.field2627 - 1, 1, var10);
                            }
                            if (var8.field2721 == 3) {
                                class428.method6949(this.field2627 * arg0, this.field2627 * (63 - arg1) + this.field2627 - 1, 1, var10);
                            }
                        }
                        if (class284.field3407.field3406 == var8.field2720) {
                            int var11 = var8.field2721 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field2627; var12++) {
                                    class428.method6949(this.field2627 * arg0 + var12, this.field2627 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field2627; var13++) {
                                    class428.method6949(this.field2627 * arg0 + var13, this.field2627 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("hw.x(IILjava/util/HashSet;II)V")
    public void method4169(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field2629.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class277 var9 = (class277) var8.getKey();
            int var10 = (int) ((float) var9.field3188 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field3189 * var5 - var6);
            class236 var12 = (class236) var8.getValue();
            if (var12 != null && var12.method4410()) {
                var12.field2758 = var10;
                var12.field2761 = var11;
                class164 var13 = class164.method2044(var12.method4040());
                if (!arg2.contains(var13.method2875())) {
                    this.method4227(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("hw.z(Ljava/util/HashSet;III)V")
    public void method4170(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field2628.iterator();
        while (var4.hasNext()) {
            class236 var5 = (class236) var4.next();
            if (var5.method4410()) {
                class164 var6 = class164.method2044(var5.method4040());
                if (var6 != null && arg0.contains(var6.method2875())) {
                    this.method4171(var6, var5.field2758, var5.field2761, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("hw.i(Lfj;IIIII)V")
    public void method4171(class164 arg0, int arg1, int arg2, int arg3, int arg4) {
        class432 var6 = arg0.method2886(false);
        if (var6 == null) {
            return;
        }
        var6.method7120(arg1 - var6.field4566 / 2, arg2 - var6.field4567 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class428.method6941(arg1, arg2, 15, 16776960, 128);
            class428.method6941(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("hw.y(Lij;IIFB)V")
    public void method4227(class236 arg0, int arg1, int arg2, float arg3) {
        class164 var5 = class164.method2044(arg0.method4040());
        this.method4173(var5, arg1, arg2);
        this.method4174(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("hw.ah(Lfj;III)V")
    public void method4173(class164 arg0, int arg1, int arg2) {
        class432 var4 = arg0.method2886(false);
        if (var4 != null) {
            int var5 = this.method4176(var4, arg0.field1768);
            int var6 = this.method4177(var4, arg0.field1769);
            var4.method7120(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("hw.ao(Lij;Lfj;IIFB)V")
    public void method4174(class236 arg0, class164 arg1, int arg2, int arg3, float arg4) {
        class231 var6 = arg0.method4034();
        if (var6 != null && var6.field2729.method4028(arg4)) {
            class327 var7 = (class327) this.field2617.get(var6.field2729);
            var7.method5466(var6.field2732, arg2 - var6.field2730 / 2, arg3, var6.field2730, var6.field2731, 0xFF000000 | arg1.field1757, 0, 1, 0, var7.field3989 / 2);
        }
    }

    @ObfuscatedName("hw.ab(IILjava/util/HashSet;II)V")
    public void method4175(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field2628.iterator();
        while (var6.hasNext()) {
            class236 var7 = (class236) var6.next();
            if (var7.method4410()) {
                int var8 = var7.field2760.field3188 % 64;
                int var9 = var7.field2760.field3189 % 64;
                var7.field2758 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field2761 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method4040())) {
                    this.method4227(var7, var7.field2758, var7.field2761, var5);
                }
            }
        }
    }

    @ObfuscatedName("hw.an(Lpl;Lfc;I)I")
    public int method4176(class432 arg0, class170 arg1) {
        switch(arg1.field1831) {
            case 0:
                return 0;
            case 2:
                return -arg0.field4566 / 2;
            default:
                return -arg0.field4566;
        }
    }

    @ObfuscatedName("hw.ax(Lpl;Lfs;B)I")
    public int method4177(class432 arg0, class172 arg1) {
        switch(arg1.field1873) {
            case 1:
                return -arg0.field4567 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field4567;
        }
    }

    @ObfuscatedName("hw.am(II)Lhm;")
    public class231 method4209(int arg0) {
        class164 var2 = class164.method2044(arg0);
        return this.method4179(var2);
    }

    @ObfuscatedName("hw.az(Lfj;B)Lhm;")
    public class231 method4179(class164 arg0) {
        if (arg0.field1756 == null || this.field2617 == null || this.field2617.get(class215.field2578) == null) {
            return null;
        }
        class215 var2 = class215.method4020(arg0.field1761);
        if (var2 == null) {
            return null;
        }
        class327 var3 = (class327) this.field2617.get(var2);
        if (var3 == null) {
            return null;
        }
        int var4 = var3.method5482(arg0.field1756, 1000000);
        String[] var5 = new String[var4];
        var3.method5470(arg0.field1756, (int[]) null, var5);
        int var6 = var5.length * var3.field3989 / 2;
        int var7 = 0;
        String[] var8 = var5;
        for (int var9 = 0; var9 < var8.length; var9++) {
            String var10 = var8[var9];
            int var11 = var3.method5487(var10);
            if (var11 > var7) {
                var7 = var11;
            }
        }
        return new class231(arg0.field1756, var7, var6, var2);
    }

    @ObfuscatedName("hw.au(IIIIIB)Ljava/util/List;")
    public List method4180(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field2629.values().iterator();
            while (var7.hasNext()) {
                class236 var8 = (class236) var7.next();
                if (var8.method4410() && var8.method4417(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field2628.iterator();
            while (var9.hasNext()) {
                class236 var10 = (class236) var9.next();
                if (var10.method4410() && var10.method4417(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("hw.av(I)Ljava/util/List;")
    public List method4181() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field2628);
        var1.addAll(this.field2629.values());
        return var1;
    }

    @ObfuscatedName("hw.ap(IIIIB)V")
    public void method4159(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class428.method7009(this.field2627 * arg0, this.field2627 * (63 - arg1), this.field2627, arg3);
        }
        if (var5 == 1) {
            class428.method6949(this.field2627 * arg0, this.field2627 * (63 - arg1), this.field2627, arg3);
        }
        if (var5 == 2) {
            class428.method7009(this.field2627 * arg0 + this.field2627 - 1, this.field2627 * (63 - arg1), this.field2627, arg3);
        }
        if (var5 == 3) {
            class428.method6949(this.field2627 * arg0, this.field2627 * (63 - arg1) + this.field2627 - 1, this.field2627, arg3);
        }
    }
}
