package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mz")
public class class333 {

    @ObfuscatedName("mz.au")
    public static ArrayList field3563 = null;

    @ObfuscatedName("mz.ax")
    public static LinkedList field3564 = new LinkedList();

    @ObfuscatedName("mz.ao")
    public static ArrayList field3565 = new ArrayList(3);

    @ObfuscatedName("mz.am")
    public static ArrayList field3566 = new ArrayList(3);

    @ObfuscatedName("mz.ac")
    public static ArrayList field3567 = new ArrayList();

    @ObfuscatedName("mz.ae")
    public static final List field3570 = new ArrayList();

    @ObfuscatedName("mz.ad")
    public static int field3572 = 0;

    @ObfuscatedName("mz.aq")
    public static int field3569 = 0;

    @ObfuscatedName("mz.al")
    public static int field3571 = 0;

    @ObfuscatedName("mz.aj")
    public static int field3568 = 0;

    public class333() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cs.ab(Lnc;I)V")
    public static void method1936(class339 arg0) {
        if (!field3570.contains(arg0)) {
            field3570.add(arg0);
        }
    }

    @ObfuscatedName("cu.ay(Ljava/util/ArrayList;IIIIZB)V")
    public static void method996(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3564.clear();
        field3567.clear();
        method6566(arg5);
        if (!arg5) {
            field3566.clear();
        }
        Iterator var6 = arg0.iterator();
        while (var6.hasNext()) {
            class345 var7 = (class345) var6.next();
            if (var7.field3675 != -1 && var7.field3673 != -1) {
                if (!arg5) {
                    field3566.add(var7);
                }
                field3564.add(var7);
            }
        }
        if (field3564.isEmpty()) {
            return;
        }
        method2965(arg1, arg2, arg3, arg4);
        field3567.add(new class439((class446) null));
        field3567.add(new class448((class446) null, Statics.field3120, Statics.field2461, Statics.field3573));
        ArrayList var8 = new ArrayList();
        var8.add(new class443(new class445((class446) null, 0, true, field3568)));
        if (field3565.isEmpty()) {
            field3567.add(new class442((class446) null, field3571));
            field3567.add(new class447((class446) null, var8));
            return;
        }
        ArrayList var9 = new ArrayList();
        var9.add(new class442(new class447((class446) null, var8), field3571));
        ArrayList var10 = method8563();
        var9.add(new class442(new class444(new class441((class446) null, var10), 0, false, field3569), field3572));
        field3567.add(new class447((class446) null, var9));
    }

    @ObfuscatedName("jl.an(IB)V")
    public static void method4513(int arg0) {
        if (field3565.isEmpty()) {
            return;
        }
        Iterator var1 = field3565.iterator();
        while (var1.hasNext()) {
            class345 var2 = (class345) var1.next();
            if (var2 != null) {
                var2.field3676 = arg0;
            }
        }
        class345 var3 = (class345) field3565.get(0);
        if (var3 != null && var3.field3683 != null && var3.field3683.method5700() && !var3.field3681) {
            var3.field3683.method5691(arg0);
            var3.field3677 = (float) arg0;
        }
    }

    @ObfuscatedName("id.ax(B)Z")
    public static boolean method4358() {
        if (field3567.isEmpty()) {
            return field3565.isEmpty() || field3565.get(0) == null || ((class345) field3565.get(0)).field3683 == null ? false : ((class345) field3565.get(0)).field3683.method5700();
        } else {
            return true;
        }
    }

    @ObfuscatedName("lf.ao(IIIIB)V")
    public static void method5557(int arg0, int arg1, int arg2, int arg3) {
        if (field3565.size() <= 1 || field3565.get(0) == null || !((class345) field3565.get(0)).field3683.method5700() || field3565.get(1) == null || !((class345) field3565.get(1)).field3683.method5700()) {
            return;
        }
        method2965(arg0, arg1, arg2, arg3);
        field3567.add(new class440((class446) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class442(new class445((class446) null, 1, false, field3568), field3571));
        var4.add(new class442(new class444((class446) null, 0, false, field3569), field3572));
        field3567.add(new class447((class446) null, var4));
        if (field3566.get(0) != null && field3566.get(1) != null) {
            class345 var5 = (class345) field3566.get(0);
            field3566.set(0, field3565.get(1));
            field3566.set(1, var5);
        }
    }

    @ObfuscatedName("fd.am(I)V")
    public static void method3178() {
        field3566.clear();
    }

    @ObfuscatedName("ej.ac(Lob;IB)V")
    public static void method2917(class389 arg0, int arg1) {
        if (field3566.isEmpty()) {
            return;
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3566.iterator();
        while (var3.hasNext()) {
            class345 var4 = (class345) var3.next();
            var4.field3680 = false;
            var4.field3679 = false;
            var4.field3681 = false;
            var4.field3682 = false;
            var4.field3686 = arg0;
            var4.field3676 = arg1;
            var4.field3677 = 0.0F;
            var2.add(var4);
        }
        method996(var2, field3572, field3569, field3571, field3568, false);
    }

    @ObfuscatedName("ea.ae(IIIIB)V")
    public static void method2965(int arg0, int arg1, int arg2, int arg3) {
        field3572 = arg0;
        field3569 = arg1;
        field3571 = arg2;
        field3568 = arg3;
    }

    @ObfuscatedName("ui.ad(I)Ljava/util/ArrayList;")
    public static ArrayList method8563() {
        ArrayList var0 = new ArrayList();
        Iterator var1 = field3565.iterator();
        while (var1.hasNext()) {
            class345 var2 = (class345) var1.next();
            var0.add(var2);
        }
        return var0;
    }

    @ObfuscatedName("iw.aq(Ljava/util/ArrayList;IIIIB)V")
    public static void method4346(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        field3566.clear();
        field3566.addAll(arg0);
        method2965(arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("kc.al(I)V")
    public static void method5097() {
        Iterator var0 = field3565.iterator();
        while (true) {
            class345 var1;
            do {
                if (!var0.hasNext()) {
                    field3565.clear();
                    return;
                }
                var1 = (class345) var0.next();
            } while (var1 == null);
            var1.field3683.method5699();
            var1.field3683.method5697();
            var1.field3683.method5691(0);
            var1.field3683.field3605 = 0;
            int var2 = var1.field3675;
            int var3 = var1.field3673;
            Iterator var4 = field3570.iterator();
            while (var4.hasNext()) {
                class339 var5 = (class339) var4.next();
                var5.method1175(var2, var3);
            }
        }
    }

    @ObfuscatedName("oi.aj(ZI)V")
    public static void method6566(boolean arg0) {
        if (arg0) {
            method5097();
            return;
        }
        for (int var1 = 0; var1 < field3565.size(); var1++) {
            class345 var2 = (class345) field3565.get(var1);
            if (var2 == null) {
                field3565.remove(var1);
                var1--;
            } else if (var2.field3682) {
                if (var2.field3683.field3605 > 0) {
                    var2.field3683.field3605--;
                }
                var2.field3683.method5699();
                var2.field3683.method5697();
                var2.field3683.method5691(0);
                field3565.remove(var1);
                var1--;
            } else {
                var2.field3682 = true;
            }
        }
    }
}
