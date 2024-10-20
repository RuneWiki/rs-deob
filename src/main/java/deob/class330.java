package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mt")
public class class330 {

    @ObfuscatedName("mt.az")
    public static ArrayList field3578 = null;

    @ObfuscatedName("mt.af")
    public static LinkedList field3577 = new LinkedList();

    @ObfuscatedName("mt.aa")
    public static ArrayList field3579 = new ArrayList(3);

    @ObfuscatedName("mt.at")
    public static ArrayList field3580 = new ArrayList(3);

    @ObfuscatedName("mt.ab")
    public static ArrayList field3582 = new ArrayList();

    @ObfuscatedName("mt.ac")
    public static final List field3583 = new ArrayList();

    @ObfuscatedName("mt.ao")
    public static int field3584 = 0;

    @ObfuscatedName("mt.ah")
    public static int field3585 = 0;

    @ObfuscatedName("mt.av")
    public static int field3586 = 0;

    @ObfuscatedName("mt.aq")
    public static int field3581 = 0;

    public class330() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hq.ak(Lmr;I)V")
    public static void method3488(class336 arg0) {
        if (!field3583.contains(arg0)) {
            field3583.add(arg0);
        }
    }

    @ObfuscatedName("jx.al(IIB)V")
    public static void method4153(int arg0, int arg1) {
        Iterator var2 = field3583.iterator();
        while (var2.hasNext()) {
            class336 var3 = (class336) var2.next();
            var3.method1169(arg0, arg1);
        }
    }

    @ObfuscatedName("cr.aj(Ljava/util/ArrayList;IIIIZB)V")
    public static void method1099(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3577.clear();
        field3582.clear();
        method3067(arg5);
        if (!arg5) {
            field3580.clear();
        }
        Iterator var6 = arg0.iterator();
        while (var6.hasNext()) {
            class342 var7 = (class342) var6.next();
            if (var7.field3691 != -1 && var7.field3687 != -1) {
                if (!arg5) {
                    field3580.add(var7);
                }
                field3577.add(var7);
            }
        }
        if (field3577.isEmpty()) {
            return;
        }
        method3062(arg1, arg2, arg3, arg4);
        field3582.add(new class437((class444) null));
        field3582.add(new class446((class444) null, Statics.field4661, Statics.field3587, Statics.field1683));
        ArrayList var8 = new ArrayList();
        var8.add(new class441(new class443((class444) null, 0, true, field3581)));
        if (field3579.isEmpty()) {
            field3582.add(new class440((class444) null, field3586));
            field3582.add(new class445((class444) null, var8));
            return;
        }
        ArrayList var9 = new ArrayList();
        var9.add(new class440(new class445((class444) null, var8), field3586));
        ArrayList var10 = new ArrayList();
        Iterator var11 = field3579.iterator();
        while (var11.hasNext()) {
            class342 var12 = (class342) var11.next();
            var10.add(var12);
        }
        var9.add(new class440(new class442(new class439((class444) null, var10), 0, false, field3585), field3584));
        field3582.add(new class445((class444) null, var9));
    }

    @ObfuscatedName("op.az(III)V")
    public static void method6481(int arg0, int arg1) {
        method3062(arg0, arg1, 0, 0);
        field3580.clear();
        field3582.clear();
        if (field3579.isEmpty() || arg0 == 0 && arg1 == 0) {
            method2353();
            return;
        }
        field3582.add(new class440((class444) null, field3584));
        field3582.add(new class442((class444) null, 0, false, field3585));
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3579.iterator();
        while (var3.hasNext()) {
            class342 var4 = (class342) var3.next();
            var2.add(var4);
        }
        field3582.add(new class439((class444) null, var2));
    }

    @ObfuscatedName("ia.af(IIIII)V")
    public static void method3759(int arg0, int arg1, int arg2, int arg3) {
        if (field3579.size() <= 1 || field3579.get(0) == null || !((class342) field3579.get(0)).field3694.method5673() || field3579.get(1) == null || !((class342) field3579.get(1)).field3694.method5673()) {
            return;
        }
        method3062(arg0, arg1, arg2, arg3);
        field3582.add(new class438((class444) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class440(new class443((class444) null, 1, false, field3581), field3586));
        var4.add(new class440(new class442((class444) null, 0, false, field3585), field3584));
        field3582.add(new class445((class444) null, var4));
        if (field3580.get(0) != null && field3580.get(1) != null) {
            class342 var5 = (class342) field3580.get(0);
            field3580.set(0, field3579.get(1));
            field3580.set(1, var5);
        }
    }

    @ObfuscatedName("bm.aa(I)V")
    public static void method821() {
        field3580.clear();
    }

    @ObfuscatedName("lh.at(Lor;II)V")
    public static void method5428(class387 arg0, int arg1) {
        if (field3580.isEmpty()) {
            return;
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3580.iterator();
        while (var3.hasNext()) {
            class342 var4 = (class342) var3.next();
            var4.field3695 = false;
            var4.field3688 = false;
            var4.field3697 = false;
            var4.field3693 = false;
            var4.field3692 = arg0;
            var4.field3685 = arg1;
            var4.field3689 = 0.0F;
            var2.add(var4);
        }
        method1099(var2, field3584, field3585, field3586, field3581, false);
    }

    @ObfuscatedName("fn.ab(IIIII)V")
    public static void method3062(int arg0, int arg1, int arg2, int arg3) {
        field3584 = arg0;
        field3585 = arg1;
        field3586 = arg2;
        field3581 = arg3;
    }

    @ObfuscatedName("di.ac(B)V")
    public static void method2353() {
        Iterator var0 = field3579.iterator();
        while (var0.hasNext()) {
            class342 var1 = (class342) var0.next();
            if (var1 != null) {
                var1.field3694.method5672();
                var1.field3694.method5666();
                var1.field3694.method5736(0);
                var1.field3694.field3621 = 0;
                method4153(var1.field3691, var1.field3687);
            }
        }
        field3579.clear();
    }

    @ObfuscatedName("fl.ao(ZB)V")
    public static void method3067(boolean arg0) {
        if (arg0) {
            method2353();
            return;
        }
        for (int var1 = 0; var1 < field3579.size(); var1++) {
            class342 var2 = (class342) field3579.get(var1);
            if (var2 == null) {
                field3579.remove(var1);
                var1--;
            } else if (var2.field3693) {
                if (var2.field3694.field3621 > 0) {
                    var2.field3694.field3621--;
                }
                var2.field3694.method5672();
                var2.field3694.method5666();
                var2.field3694.method5736(0);
                field3579.remove(var1);
                var1--;
            } else {
                var2.field3693 = true;
            }
        }
    }
}
