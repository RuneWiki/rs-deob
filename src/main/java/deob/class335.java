package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mm")
public class class335 {

    @ObfuscatedName("mm.am")
    public static ArrayList field3617 = null;

    @ObfuscatedName("mm.ax")
    public static LinkedList field3622 = new LinkedList();

    @ObfuscatedName("mm.aq")
    public static ArrayList field3627 = new ArrayList(3);

    @ObfuscatedName("mm.af")
    public static ArrayList field3620 = new ArrayList(3);

    @ObfuscatedName("mm.at")
    public static ArrayList field3621 = new ArrayList();

    @ObfuscatedName("mm.au")
    public static final List field3624 = new ArrayList();

    @ObfuscatedName("mm.ar")
    public static int field3623 = 0;

    @ObfuscatedName("mm.al")
    public static int field3615 = 0;

    @ObfuscatedName("mm.ad")
    public static int field3625 = 0;

    @ObfuscatedName("mm.ah")
    public static int field3626 = 0;

    public class335() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ow.ac(Lpo;Lpo;Lpo;Ljava/util/ArrayList;I)Z")
    public static boolean method6695(class391 arg0, class391 arg1, class391 arg2, ArrayList arg3) {
        Statics.field3619 = arg0;
        Statics.field3616 = arg1;
        Statics.field4892 = arg2;
        field3617 = arg3;
        return true;
    }

    @ObfuscatedName("mf.ae(Lne;I)V")
    public static void method5763(class341 arg0) {
        if (!field3624.contains(arg0)) {
            field3624.add(arg0);
        }
    }

    @ObfuscatedName("ok.ag(III)V")
    public static void method6710(int arg0, int arg1) {
        Iterator var2 = field3624.iterator();
        while (var2.hasNext()) {
            class341 var3 = (class341) var2.next();
            var3.method1227(arg0, arg1);
        }
    }

    @ObfuscatedName("gg.am(Ljava/util/ArrayList;IIIIZB)V")
    public static void method3443(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3622.clear();
        field3621.clear();
        method3269(arg5);
        method7(arg0, arg5);
        if (field3622.isEmpty()) {
            return;
        }
        method7501(arg1, arg2, arg3, arg4);
        field3621.add(new class441((class448) null));
        field3621.add(new class450((class448) null, Statics.field3619, Statics.field3616, Statics.field4892));
        ArrayList var6 = new ArrayList();
        var6.add(new class445(new class447((class448) null, 0, true, field3626)));
        if (field3627.isEmpty()) {
            field3621.add(new class444((class448) null, field3625));
            field3621.add(new class449((class448) null, var6));
            return;
        }
        ArrayList var7 = new ArrayList();
        var7.add(new class444(new class449((class448) null, var6), field3625));
        ArrayList var8 = new ArrayList();
        Iterator var9 = field3627.iterator();
        while (var9.hasNext()) {
            class347 var10 = (class347) var9.next();
            var8.add(var10);
        }
        var7.add(new class444(new class446(new class443((class448) null, var8), 0, false, field3615), field3623));
        field3621.add(new class449((class448) null, var7));
    }

    @ObfuscatedName("ly.ax(IIB)V")
    public static void method5635(int arg0, int arg1) {
        method7501(arg0, arg1, 0, 0);
        field3620.clear();
        field3621.clear();
        if (field3627.isEmpty() || arg0 == 0 && arg1 == 0) {
            method1119();
            return;
        }
        field3621.add(new class444((class448) null, field3623));
        field3621.add(new class446((class448) null, 0, false, field3615));
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3627.iterator();
        while (var3.hasNext()) {
            class347 var4 = (class347) var3.next();
            var2.add(var4);
        }
        field3621.add(new class443((class448) null, var2));
    }

    @ObfuscatedName("hs.aq(I)Z")
    public static boolean method3789() {
        if (field3621.isEmpty()) {
            return field3627.isEmpty() || field3627.get(0) == null || ((class347) field3627.get(0)).field3733 == null ? false : ((class347) field3627.get(0)).field3733.method5854();
        } else {
            return true;
        }
    }

    @ObfuscatedName("gf.af(IIIIB)V")
    public static void method3369(int arg0, int arg1, int arg2, int arg3) {
        if (field3627.size() <= 1 || field3627.get(0) == null || !((class347) field3627.get(0)).field3733.method5854() || field3627.get(1) == null || !((class347) field3627.get(1)).field3733.method5854()) {
            return;
        }
        method7501(arg0, arg1, arg2, arg3);
        field3621.add(new class442((class448) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class444(new class447((class448) null, 1, false, field3626), field3625));
        var4.add(new class444(new class446((class448) null, 0, false, field3615), field3623));
        field3621.add(new class449((class448) null, var4));
        if (field3620.get(0) != null && field3620.get(1) != null) {
            class347 var5 = (class347) field3620.get(0);
            field3620.set(0, field3627.get(1));
            field3620.set(1, var5);
        }
    }

    @ObfuscatedName("ht.at(IB)Z")
    public static boolean method3685(int arg0) {
        if (field3620.isEmpty()) {
            return false;
        } else {
            class347 var1 = (class347) field3620.get(0);
            return var1 != null && var1.field3727 == arg0;
        }
    }

    @ObfuscatedName("iv.au(B)Z")
    public static boolean method4123() {
        return !field3620.isEmpty();
    }

    @ObfuscatedName("bo.ar(B)V")
    public static void method863() {
        field3620.clear();
    }

    @ObfuscatedName("fe.al(Lpo;II)V")
    public static void method3078(class391 arg0, int arg1) {
        if (field3620.isEmpty()) {
            return;
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3620.iterator();
        while (var3.hasNext()) {
            class347 var4 = (class347) var3.next();
            var4.field3734 = false;
            var4.field3740 = false;
            var4.field3735 = false;
            var4.field3736 = false;
            var4.field3739 = arg0;
            var4.field3730 = arg1;
            var4.field3731 = 0.0F;
            var2.add(var4);
        }
        method3443(var2, field3623, field3615, field3625, field3626, false);
    }

    @ObfuscatedName("ae.ad(Ljava/util/ArrayList;ZI)V")
    public static void method7(ArrayList arg0, boolean arg1) {
        if (!arg1) {
            field3620.clear();
        }
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class347 var3 = (class347) var2.next();
            if (var3.field3727 != -1 && var3.field3729 != -1) {
                if (!arg1) {
                    field3620.add(var3);
                }
                field3622.add(var3);
            }
        }
    }

    @ObfuscatedName("qg.ah(IIIII)V")
    public static void method7501(int arg0, int arg1, int arg2, int arg3) {
        field3623 = arg0;
        field3615 = arg1;
        field3625 = arg2;
        field3626 = arg3;
    }

    @ObfuscatedName("kw.ap(Ljava/util/ArrayList;IIIIB)V")
    public static void method5264(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        field3620.clear();
        field3620.addAll(arg0);
        method7501(arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("cy.ab(I)V")
    public static void method1119() {
        Iterator var0 = field3627.iterator();
        while (var0.hasNext()) {
            class347 var1 = (class347) var0.next();
            if (var1 != null) {
                var1.field3733.method5924();
                var1.field3733.method5852();
                var1.field3733.method5847(0);
                var1.field3733.field3638 = 0;
                method6710(var1.field3727, var1.field3729);
            }
        }
        field3627.clear();
    }

    @ObfuscatedName("fx.az(ZI)V")
    public static void method3269(boolean arg0) {
        if (arg0) {
            method1119();
            return;
        }
        for (int var1 = 0; var1 < field3627.size(); var1++) {
            class347 var2 = (class347) field3627.get(var1);
            if (var2 == null) {
                field3627.remove(var1);
                var1--;
            } else if (var2.field3736) {
                if (var2.field3733.field3638 > 0) {
                    var2.field3733.field3638--;
                }
                var2.field3733.method5924();
                var2.field3733.method5852();
                var2.field3733.method5847(0);
                field3627.remove(var1);
                var1--;
            } else {
                var2.field3736 = true;
            }
        }
    }
}
