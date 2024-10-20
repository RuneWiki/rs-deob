package deob;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfuscatedName("am")
public class class39 {

    @ObfuscatedName("am.t")
    public static class159 field274 = new class159(37748736, 256);

    @ObfuscatedName("am.j")
    public int field266;

    @ObfuscatedName("am.n")
    public int field267;

    @ObfuscatedName("am.p")
    public class25 field268;

    @ObfuscatedName("am.l")
    public LinkedList field269;

    @ObfuscatedName("am.z")
    public int field270;

    @ObfuscatedName("am.u")
    public int field271;

    @ObfuscatedName("am.e")
    public List field277;

    @ObfuscatedName("am.m")
    public HashMap field273;

    @ObfuscatedName("am.c")
    public final HashMap field262;

    @ObfuscatedName("in.h(IIII)Llm;")
    public static class336 method3816(int arg0, int arg1, int arg2) {
        class159 var3 = field274;
        long var4 = (long) (arg2 << 16 | arg0 << 8 | arg1);
        return (class336) var3.method3184(var4);
    }

    public class39(int arg0, int arg1, int arg2, HashMap arg3) {
        this.field266 = arg0;
        this.field267 = arg1;
        this.field269 = new LinkedList();
        this.field277 = new LinkedList();
        this.field273 = new HashMap();
        this.field270 = arg2 | 0xFF000000;
        this.field262 = arg3;
    }

    @ObfuscatedName("am.x(IIII)V")
    public void method476(int arg0, int arg1, int arg2) {
        class336 var4 = method3816(this.field266, this.field267, this.field271);
        if (var4 == null) {
            return;
        }
        if (this.field271 * 64 == arg2) {
            var4.method5691(arg0, arg1);
        } else {
            var4.method5702(arg0, arg1, arg2, arg2);
        }
    }

    @ObfuscatedName("am.w(Lk;Ljava/util/List;B)V")
    public void method414(class25 arg0, List arg1) {
        this.field273.clear();
        this.field268 = arg0;
        this.method419(arg1);
    }

    @ObfuscatedName("am.t(Ljava/util/HashSet;Ljava/util/List;I)V")
    public void method448(HashSet arg0, List arg1) {
        this.field273.clear();
        Iterator var3 = arg0.iterator();
        while (var3.hasNext()) {
            class49 var4 = (class49) var3.next();
            if (var4.method282() == this.field266 && var4.method283() == this.field267) {
                this.field269.add(var4);
            }
        }
        this.method419(arg1);
    }

    @ObfuscatedName("am.j(IIIILau;I)V")
    public void method510(int arg0, int arg1, int arg2, int arg3, class31 arg4) {
        for (int var6 = arg0; var6 < arg0 + arg2; var6++) {
            label67: for (int var7 = arg1; var7 < arg1 + arg3; var7++) {
                for (int var8 = 0; var8 < arg4.field190; var8++) {
                    class35[] var9 = arg4.field180[var8][var6][var7];
                    if (var9 != null && var9.length != 0) {
                        class35[] var10 = var9;
                        for (int var11 = 0; var11 < var10.length; var11++) {
                            class265 var13;
                            boolean var18;
                            label58: {
                                class35 var12 = var10[var11];
                                var13 = class265.method325(var12.field228);
                                if (var13.field3422 != null) {
                                    int[] var14 = var13.field3422;
                                    for (int var15 = 0; var15 < var14.length; var15++) {
                                        int var16 = var14[var15];
                                        class265 var17 = class265.method325(var16);
                                        if (var17.field3415 != -1) {
                                            var18 = true;
                                            break label58;
                                        }
                                    }
                                } else if (var13.field3415 != -1) {
                                    var18 = true;
                                    break label58;
                                }
                                var18 = false;
                            }
                            if (var18) {
                                this.method417(var13, var8, var6, var7, arg4);
                                continue label67;
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.n(Ljm;IIILau;I)V")
    public void method417(class265 arg0, int arg1, int arg2, int arg3, class31 arg4) {
        class223 var6 = new class223(arg1, this.field266 * 64 + arg2, this.field267 * 64 + arg3);
        Object var7 = null;
        class223 var8;
        if (this.field268 == null) {
            class49 var9 = (class49) arg4;
            var8 = new class223(var9.field182 + arg1, var9.field188 * 64 + arg2 + var9.method636() * 8, var9.field183 * 64 + arg3 + var9.method637() * 8);
        } else {
            var8 = new class223(this.field268.field182 + arg1, this.field268.field188 * 64 + arg2, this.field268.field183 * 64 + arg3);
        }
        class44 var10;
        if (arg0.field3422 == null) {
            class253 var11 = class253.method3211(arg0.field3415);
            var10 = new class28(var8, var6, var11.field3249, this.method442(var11));
        } else {
            var10 = new class33(var8, var6, arg0.field3388, this);
        }
        class253 var12 = class253.method3211(var10.method244());
        if (var12.field3251) {
            this.field273.put(new class223(0, arg2, arg3), var10);
        }
    }

    @ObfuscatedName("am.p(I)V")
    public void method418() {
        Iterator var1 = this.field273.values().iterator();
        while (var1.hasNext()) {
            class44 var2 = (class44) var1.next();
            if (var2 instanceof class33) {
                ((class33) var2).method310();
            }
        }
    }

    @ObfuscatedName("am.l(Ljava/util/List;I)V")
    public void method419(List arg0) {
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class28 var3 = (class28) var2.next();
            if (class253.method3211(var3.field150).field3251 && var3.field322.field2547 >> 6 == this.field266 && var3.field322.field2548 >> 6 == this.field267) {
                class28 var4 = new class28(var3.field322, var3.field322, var3.field150, this.method416(var3.field150));
                this.field277.add(var4);
            }
        }
    }

    @ObfuscatedName("am.z(S)V")
    public void method472() {
        if (this.field268 != null) {
            this.field268.method278();
            return;
        }
        Iterator var1 = this.field269.iterator();
        while (var1.hasNext()) {
            class49 var2 = (class49) var1.next();
            var2.method278();
        }
    }

    @ObfuscatedName("am.u(Lib;I)Z")
    public boolean method528(class245 arg0) {
        this.field273.clear();
        if (this.field268 == null) {
            boolean var2 = true;
            Iterator var3 = this.field269.iterator();
            while (var3.hasNext()) {
                class49 var4 = (class49) var3.next();
                var4.method290(arg0);
                var2 &= var4.method281();
            }
            if (var2) {
                Iterator var5 = this.field269.iterator();
                while (var5.hasNext()) {
                    class49 var6 = (class49) var5.next();
                    this.method510(var6.method638() * 8, var6.method639() * 8, 8, 8, var6);
                }
            }
            return var2;
        } else {
            this.field268.method290(arg0);
            if (this.field268.method281()) {
                this.method510(0, 0, 64, 64, this.field268);
                return true;
            } else {
                return false;
            }
        }
    }

    @ObfuscatedName("am.e(ILar;[Llo;Lib;Lib;B)V")
    public void method422(int arg0, class50 arg1, class335[] arg2, class245 arg3, class245 arg4) {
        this.field271 = arg0;
        if (this.field268 == null && this.field269.isEmpty() || method3816(this.field266, this.field267, arg0) != null) {
            return;
        }
        boolean var6 = true;
        boolean var7 = var6 & this.method528(arg3);
        int var8;
        if (this.field268 == null) {
            var8 = ((class31) this.field269.getFirst()).field184;
        } else {
            var8 = this.field268.field184;
        }
        boolean var9 = var7 & arg4.method3838(var8);
        if (!var9) {
            return;
        }
        byte[] var10 = arg4.method3841(var8);
        class37 var11 = class37.method2135(var10);
        class336 var12 = new class336(this.field271 * 64, this.field271 * 64);
        var12.method5684();
        if (this.field268 == null) {
            this.method426(arg1, arg2, var11);
        } else {
            this.method413(arg1, arg2, var11);
        }
        int var13 = this.field266;
        int var14 = this.field267;
        int var15 = this.field271;
        class159 var16 = field274;
        long var18 = (long) (var15 << 16 | var13 << 8 | var14);
        var16.method3168(var12, var18, var12.field3918.length * 4);
        this.method472();
    }

    @ObfuscatedName("am.m(IIILjava/util/HashSet;I)V")
    public void method423(int arg0, int arg1, int arg2, HashSet arg3) {
        if (arg3 == null) {
            arg3 = new HashSet();
        }
        this.method485(arg0, arg1, arg3, arg2);
        this.method438(arg0, arg1, arg3, arg2);
    }

    @ObfuscatedName("am.c(Ljava/util/HashSet;III)V")
    public void method428(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field273.values().iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method559()) {
                int var6 = var5.method244();
                if (arg0.contains(var6)) {
                    class253 var7 = class253.method3211(var6);
                    this.method425(var7, var5.field321, var5.field324, arg1, arg2);
                }
            }
        }
        this.method433(arg0, arg1, arg2);
    }

    @ObfuscatedName("am.i(Lar;[Llo;Laq;I)V")
    public void method413(class50 arg0, class335[] arg1, class37 arg2) {
        for (int var4 = 0; var4 < 64; var4++) {
            for (int var5 = 0; var5 < 64; var5++) {
                this.method523(var4, var5, this.field268, arg0, arg2);
                this.method429(var4, var5, this.field268, arg0);
            }
        }
        for (int var6 = 0; var6 < 64; var6++) {
            for (int var7 = 0; var7 < 64; var7++) {
                this.method427(var6, var7, this.field268, arg0, arg1);
            }
        }
    }

    @ObfuscatedName("am.f(Lar;[Llo;Laq;I)V")
    public void method426(class50 arg0, class335[] arg1, class37 arg2) {
        Iterator var4 = this.field269.iterator();
        while (var4.hasNext()) {
            class49 var5 = (class49) var4.next();
            for (int var6 = var5.method638() * 8; var6 < var5.method638() * 8 + 8; var6++) {
                for (int var7 = var5.method639() * 8; var7 < var5.method639() * 8 + 8; var7++) {
                    this.method523(var6, var7, var5, arg0, arg2);
                    this.method429(var6, var7, var5, arg0);
                }
            }
        }
        Iterator var8 = this.field269.iterator();
        while (var8.hasNext()) {
            class49 var9 = (class49) var8.next();
            for (int var10 = var9.method638() * 8; var10 < var9.method638() * 8 + 8; var10++) {
                for (int var11 = var9.method639() * 8; var11 < var9.method639() * 8 + 8; var11++) {
                    this.method427(var10, var11, var9, arg0, arg1);
                }
            }
        }
    }

    @ObfuscatedName("am.y(IILau;Lar;[Llo;B)V")
    public void method427(int arg0, int arg1, class31 arg2, class50 arg3, class335[] arg4) {
        this.method490(arg0, arg1, arg2);
        this.method494(arg0, arg1, arg2, arg4);
    }

    @ObfuscatedName("am.r(IILau;Lar;Laq;I)V")
    public void method523(int arg0, int arg1, class31 arg2, class50 arg3, class37 arg4) {
        int var6 = arg2.field186[0][arg0][arg1] - 1;
        int var7 = arg2.field187[0][arg0][arg1] - 1;
        if (var6 == -1 && var7 == -1) {
            class332.method5581(this.field271 * arg0, this.field271 * (63 - arg1), this.field271, this.field271, this.field270);
        }
        int var8 = 16711935;
        if (var7 != -1) {
            var8 = class42.method164(var7, this.field270);
        }
        if (var7 > -1 && arg2.field179[0][arg0][arg1] == 0) {
            class332.method5581(this.field271 * arg0, this.field271 * (63 - arg1), this.field271, this.field271, var8);
            return;
        }
        int var9 = this.method430(arg0, arg1, arg2, arg4);
        if (var7 == -1) {
            class332.method5581(this.field271 * arg0, this.field271 * (63 - arg1), this.field271, this.field271, var9);
        } else {
            arg3.method674(this.field271 * arg0, this.field271 * (63 - arg1), var9, var8, this.field271, this.field271, arg2.field179[0][arg0][arg1], arg2.field178[0][arg0][arg1]);
        }
    }

    @ObfuscatedName("am.q(IILau;Lar;I)V")
    public void method429(int arg0, int arg1, class31 arg2, class50 arg3) {
        for (int var5 = 1; var5 < arg2.field190; var5++) {
            int var6 = arg2.field187[var5][arg0][arg1] - 1;
            if (var6 > -1) {
                int var7 = class42.method164(var6, this.field270);
                if (arg2.field179[var5][arg0][arg1] == 0) {
                    class332.method5581(this.field271 * arg0, this.field271 * (63 - arg1), this.field271, this.field271, var7);
                } else {
                    arg3.method674(this.field271 * arg0, this.field271 * (63 - arg1), 0, var7, this.field271, this.field271, arg2.field179[var5][arg0][arg1], arg2.field178[var5][arg0][arg1]);
                }
            }
        }
    }

    @ObfuscatedName("am.g(IILau;Laq;I)I")
    public int method430(int arg0, int arg1, class31 arg2, class37 arg3) {
        return arg2.field186[0][arg0][arg1] == 0 ? this.field270 : arg3.method404(arg0, arg1);
    }

    @ObfuscatedName("am.o(IILau;[Llo;B)V")
    public void method494(int arg0, int arg1, class31 arg2, class335[] arg3) {
        for (int var5 = 0; var5 < arg2.field190; var5++) {
            class35[] var6 = arg2.field180[var5][arg0][arg1];
            if (var6 != null && var6.length != 0) {
                class35[] var7 = var6;
                for (int var8 = 0; var8 < var7.length; var8++) {
                    class35 var9 = var7[var8];
                    int var10 = var9.field223;
                    boolean var11 = var10 >= class230.field2765.field2768 && var10 <= class230.field2756.field2768;
                    if (var11 || class230.method3104(var9.field223)) {
                        class265 var12 = class265.method325(var9.field228);
                        if (var12.field3383 != -1) {
                            if (var12.field3383 == 46 || var12.field3383 == 52) {
                                arg3[var12.field3383].method5663(this.field271 * arg0, this.field271 * (63 - arg1), this.field271 * 2 + 1, this.field271 * 2 + 1);
                            } else {
                                arg3[var12.field3383].method5663(this.field271 * arg0, this.field271 * (63 - arg1), this.field271 * 2, this.field271 * 2);
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.an(IILau;I)V")
    public void method490(int arg0, int arg1, class31 arg2) {
        for (int var4 = 0; var4 < arg2.field190; var4++) {
            class35[] var5 = arg2.field180[var4][arg0][arg1];
            if (var5 != null && var5.length != 0) {
                class35[] var6 = var5;
                for (int var7 = 0; var7 < var6.length; var7++) {
                    class35 var8 = var6[var7];
                    if (class230.method4871(var8.field223)) {
                        class265 var9 = class265.method325(var8.field228);
                        int var10 = var9.field3424 == 0 ? -3355444 : -3407872;
                        if (class230.field2762.field2768 == var8.field223) {
                            this.method445(arg0, arg1, var8.field224, var10);
                        }
                        if (class230.field2747.field2768 == var8.field223) {
                            this.method445(arg0, arg1, var8.field224, -3355444);
                            this.method445(arg0, arg1, var8.field224 + 1, var10);
                        }
                        if (class230.field2748.field2768 == var8.field223) {
                            if (var8.field224 == 0) {
                                class332.method5629(this.field271 * arg0, this.field271 * (63 - arg1), 1, var10);
                            }
                            if (var8.field224 == 1) {
                                class332.method5629(this.field271 * arg0 + this.field271 - 1, this.field271 * (63 - arg1), 1, var10);
                            }
                            if (var8.field224 == 2) {
                                class332.method5629(this.field271 * arg0 + this.field271 - 1, this.field271 * (63 - arg1) + this.field271 - 1, 1, var10);
                            }
                            if (var8.field224 == 3) {
                                class332.method5629(this.field271 * arg0, this.field271 * (63 - arg1) + this.field271 - 1, 1, var10);
                            }
                        }
                        if (class230.field2749.field2768 == var8.field223) {
                            int var11 = var8.field224 % 2;
                            if (var11 == 0) {
                                for (int var12 = 0; var12 < this.field271; var12++) {
                                    class332.method5629(this.field271 * arg0 + var12, this.field271 * (64 - arg1) - 1 - var12, 1, var10);
                                }
                            } else {
                                for (int var13 = 0; var13 < this.field271; var13++) {
                                    class332.method5629(this.field271 * arg0 + var13, this.field271 * (63 - arg1) + var13, 1, var10);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @ObfuscatedName("am.aj(IILjava/util/HashSet;II)V")
    public void method485(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        float var6 = var5 / 2.0F;
        Iterator var7 = this.field273.entrySet().iterator();
        while (var7.hasNext()) {
            Entry var8 = (Entry) var7.next();
            class223 var9 = (class223) var8.getKey();
            int var10 = (int) ((float) var9.field2547 * var5 + (float) arg0 - var6);
            int var11 = (int) ((float) (arg1 + arg3) - (float) var9.field2548 * var5 - var6);
            class44 var12 = (class44) var8.getValue();
            if (var12 != null && var12.method559()) {
                var12.field321 = var10;
                var12.field324 = var11;
                class253 var13 = class253.method3211(var12.method244());
                if (!arg2.contains(var13.method4025())) {
                    this.method435(var12, var10, var11, var5);
                }
            }
        }
    }

    @ObfuscatedName("am.ax(Ljava/util/HashSet;III)V")
    public void method433(HashSet arg0, int arg1, int arg2) {
        Iterator var4 = this.field277.iterator();
        while (var4.hasNext()) {
            class44 var5 = (class44) var4.next();
            if (var5.method559()) {
                class253 var6 = class253.method3211(var5.method244());
                if (var6 != null && arg0.contains(var6.method4025())) {
                    this.method425(var6, var5.field321, var5.field324, arg1, arg2);
                }
            }
        }
    }

    @ObfuscatedName("am.ag(Liy;IIIII)V")
    public void method425(class253 arg0, int arg1, int arg2, int arg3, int arg4) {
        class336 var6 = arg0.method4038(false);
        if (var6 == null) {
            return;
        }
        var6.method5688(arg1 - var6.field3914 / 2, arg2 - var6.field3912 / 2);
        if (arg3 % arg4 < arg4 / 2) {
            class332.method5621(arg1, arg2, 15, 16776960, 128);
            class332.method5621(arg1, arg2, 7, 16777215, 256);
        }
    }

    @ObfuscatedName("am.au(Lap;IIFI)V")
    public void method435(class44 arg0, int arg1, int arg2, float arg3) {
        class253 var5 = class253.method3211(arg0.method244());
        this.method436(var5, arg1, arg2);
        this.method522(arg0, var5, arg1, arg2, arg3);
    }

    @ObfuscatedName("am.as(Liy;IIB)V")
    public void method436(class253 arg0, int arg1, int arg2) {
        class336 var4 = arg0.method4038(false);
        if (var4 != null) {
            int var5 = this.method439(var4, arg0.field3260);
            int var6 = this.method440(var4, arg0.field3261);
            var4.method5688(arg1 + var5, arg2 + var6);
        }
    }

    @ObfuscatedName("am.ae(Lap;Liy;IIFB)V")
    public void method522(class44 arg0, class253 arg1, int arg2, int arg3, float arg4) {
        class38 var6 = arg0.method236();
        if (var6 != null && var6.field255.method232(arg4)) {
            class306 var7 = (class306) this.field262.get(var6.field255);
            var7.method4970(var6.field258, arg2 - var6.field256 / 2, arg3, var6.field256, var6.field257, 0xFF000000 | arg1.field3252, 0, 1, 0, var7.field3728 / 2);
        }
    }

    @ObfuscatedName("am.ac(IILjava/util/HashSet;II)V")
    public void method438(int arg0, int arg1, HashSet arg2, int arg3) {
        float var5 = (float) arg3 / 64.0F;
        Iterator var6 = this.field277.iterator();
        while (var6.hasNext()) {
            class44 var7 = (class44) var6.next();
            if (var7.method559()) {
                int var8 = var7.field322.field2547 % 64;
                int var9 = var7.field322.field2548 % 64;
                var7.field321 = (int) ((float) var8 * var5 + (float) arg0);
                var7.field324 = (int) ((float) (63 - var9) * var5 + (float) arg1);
                if (!arg2.contains(var7.method244())) {
                    this.method435(var7, var7.field321, var7.field324, var5);
                }
            }
        }
    }

    @ObfuscatedName("am.ak(Llm;Ljt;I)I")
    public int method439(class336 arg0, class267 arg1) {
        switch(arg1.field3493) {
            case 1:
                return -arg0.field3914 / 2;
            case 2:
                return 0;
            default:
                return -arg0.field3914;
        }
    }

    @ObfuscatedName("am.av(Llm;Lit;S)I")
    public int method440(class336 arg0, class250 arg1) {
        switch(arg1.field3228) {
            case 1:
                return 0;
            case 2:
                return -arg0.field3912 / 2;
            default:
                return -arg0.field3912;
        }
    }

    @ObfuscatedName("am.aq(II)Lah;")
    public class38 method416(int arg0) {
        class253 var2 = class253.method3211(arg0);
        return this.method442(var2);
    }

    @ObfuscatedName("am.ah(Liy;I)Lah;")
    public class38 method442(class253 arg0) {
        if (arg0.field3248 == null || this.field262 == null || this.field262.get(class27.field132) == null) {
            return null;
        }
        int var2 = arg0.field3250;
        class27[] var3 = new class27[] { class27.field135, class27.field131, class27.field132 };
        class27[] var4 = var3;
        int var5 = 0;
        class27 var7;
        while (true) {
            if (var5 >= var4.length) {
                var7 = null;
                break;
            }
            class27 var6 = var4[var5];
            if (var6.field134 == var2) {
                var7 = var6;
                break;
            }
            var5++;
        }
        if (var7 == null) {
            return null;
        }
        class306 var9 = (class306) this.field262.get(var7);
        if (var9 == null) {
            return null;
        }
        int var10 = var9.method5011(arg0.field3248, 1000000);
        String[] var11 = new String[var10];
        var9.method4962(arg0.field3248, (int[]) null, var11);
        int var12 = var11.length * var9.field3728 / 2;
        int var13 = 0;
        String[] var14 = var11;
        for (int var15 = 0; var15 < var14.length; var15++) {
            String var16 = var14[var15];
            int var17 = var9.method4961(var16);
            if (var17 > var13) {
                var13 = var17;
            }
        }
        return new class38(arg0.field3248, var13, var12, var7);
    }

    @ObfuscatedName("am.am(IIIIII)Ljava/util/List;")
    public List method443(int arg0, int arg1, int arg2, int arg3, int arg4) {
        LinkedList var6 = new LinkedList();
        if (arg3 < arg0 || arg4 < arg1) {
            return var6;
        } else if (arg3 < arg0 + arg2 && arg4 < arg1 + arg2) {
            Iterator var7 = this.field273.values().iterator();
            while (var7.hasNext()) {
                class44 var8 = (class44) var7.next();
                if (var8.method559() && var8.method564(arg3, arg4)) {
                    var6.add(var8);
                }
            }
            Iterator var9 = this.field277.iterator();
            while (var9.hasNext()) {
                class44 var10 = (class44) var9.next();
                if (var10.method559() && var10.method564(arg3, arg4)) {
                    var6.add(var10);
                }
            }
            return var6;
        } else {
            return var6;
        }
    }

    @ObfuscatedName("am.aa(I)Ljava/util/List;")
    public List method444() {
        LinkedList var1 = new LinkedList();
        var1.addAll(this.field277);
        var1.addAll(this.field273.values());
        return var1;
    }

    @ObfuscatedName("am.ao(IIIII)V")
    public void method445(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 % 4;
        if (var5 == 0) {
            class332.method5600(this.field271 * arg0, this.field271 * (63 - arg1), this.field271, arg3);
        }
        if (var5 == 1) {
            class332.method5629(this.field271 * arg0, this.field271 * (63 - arg1), this.field271, arg3);
        }
        if (var5 == 2) {
            class332.method5600(this.field271 * arg0 + this.field271 - 1, this.field271 * (63 - arg1), this.field271, arg3);
        }
        if (var5 == 3) {
            class332.method5629(this.field271 * arg0, this.field271 * (63 - arg1) + this.field271 - 1, this.field271, arg3);
        }
    }
}
