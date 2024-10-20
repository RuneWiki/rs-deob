package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mw")
public class class320 {

    @ObfuscatedName("mw.aj")
    public static ArrayList field3458 = null;

    @ObfuscatedName("mw.aq")
    public static LinkedList field3462 = new LinkedList();

    @ObfuscatedName("mw.ar")
    public static ArrayList field3460 = new ArrayList(3);

    @ObfuscatedName("mw.ag")
    public static ArrayList field3467 = new ArrayList(3);

    @ObfuscatedName("mw.ao")
    public static ArrayList field3463 = new ArrayList();

    @ObfuscatedName("mw.ae")
    public static final List field3464 = new ArrayList();

    @ObfuscatedName("mw.aa")
    public static int field3461 = 0;

    @ObfuscatedName("mw.au")
    public static int field3465 = 0;

    @ObfuscatedName("mw.an")
    public static int field3466 = 0;

    @ObfuscatedName("mw.ad")
    public static int field3455 = 0;

    public class320() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ec.am(Lmb;I)V")
    public static void method2667(class326 arg0) {
        if (!field3464.contains(arg0)) {
            field3464.add(arg0);
        }
    }

    @ObfuscatedName("ek.ap(III)V")
    public static void method2948(int arg0, int arg1) {
        Iterator var2 = field3464.iterator();
        while (var2.hasNext()) {
            class326 var3 = (class326) var2.next();
            var3.method1251(arg0, arg1);
        }
    }

    @ObfuscatedName("dx.af(Ljava/util/ArrayList;IIIIZI)V")
    public static void method2427(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3462.clear();
        field3463.clear();
        if (arg5) {
            method3105();
        } else {
            for (int var6 = 0; var6 < field3460.size(); var6++) {
                class332 var7 = (class332) field3460.get(var6);
                if (var7 == null) {
                    field3460.remove(var6);
                    var6--;
                } else if (var7.field3582) {
                    if (var7.field3583.field3500 > 0) {
                        var7.field3583.field3500--;
                    }
                    var7.field3583.method5510();
                    var7.field3583.method5508();
                    var7.field3583.method5503(0);
                    field3460.remove(var6);
                    var6--;
                } else {
                    var7.field3582 = true;
                }
            }
        }
        method7338(arg0, arg5);
        if (field3462.isEmpty()) {
            return;
        }
        method4568(arg1, arg2, arg3, arg4);
        field3463.add(new class416((class423) null));
        field3463.add(new class425((class423) null, Statics.field3459, Statics.field3456, Statics.field3457));
        ArrayList var8 = new ArrayList();
        var8.add(new class420(new class422((class423) null, 0, true, field3455)));
        if (field3460.isEmpty()) {
            field3463.add(new class419((class423) null, field3466));
            field3463.add(new class424((class423) null, var8));
            return;
        }
        ArrayList var9 = new ArrayList();
        var9.add(new class419(new class424((class423) null, var8), field3466));
        ArrayList var10 = new ArrayList();
        Iterator var11 = field3460.iterator();
        while (var11.hasNext()) {
            class332 var12 = (class332) var11.next();
            var10.add(var12);
        }
        var9.add(new class419(new class421(new class418((class423) null, var10), 0, false, field3465), field3461));
        field3463.add(new class424((class423) null, var9));
    }

    @ObfuscatedName("df.aj(III)V")
    public static void method2387(int arg0, int arg1) {
        method4568(arg0, arg1, 0, 0);
        field3467.clear();
        field3463.clear();
        if (field3460.isEmpty() || arg0 == 0 && arg1 == 0) {
            method3105();
            return;
        }
        field3463.add(new class419((class423) null, field3461));
        field3463.add(new class421((class423) null, 0, false, field3465));
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3460.iterator();
        while (var3.hasNext()) {
            class332 var4 = (class332) var3.next();
            var2.add(var4);
        }
        field3463.add(new class418((class423) null, var2));
    }

    @ObfuscatedName("cr.aq(IIIII)V")
    public static void method1847(int arg0, int arg1, int arg2, int arg3) {
        if (field3460.size() <= 1 || field3460.get(0) == null || !((class332) field3460.get(0)).field3583.method5511() || field3460.get(1) == null || !((class332) field3460.get(1)).field3583.method5511()) {
            return;
        }
        method4568(arg0, arg1, arg2, arg3);
        field3463.add(new class417((class423) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class419(new class422((class423) null, 1, false, field3455), field3466));
        var4.add(new class419(new class421((class423) null, 0, false, field3465), field3461));
        field3463.add(new class424((class423) null, var4));
        if (field3467.get(0) != null && field3467.get(1) != null) {
            class332 var5 = (class332) field3467.get(0);
            field3467.set(0, field3460.get(1));
            field3467.set(1, var5);
        }
    }

    @ObfuscatedName("ti.ar(I)V")
    public static void method8258() {
        field3467.clear();
    }

    @ObfuscatedName("ix.ag(Low;II)V")
    public static void method4026(class375 arg0, int arg1) {
        if (field3467.isEmpty()) {
            return;
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3467.iterator();
        while (var3.hasNext()) {
            class332 var4 = (class332) var3.next();
            var4.field3580 = false;
            var4.field3576 = false;
            var4.field3581 = false;
            var4.field3582 = false;
            var4.field3573 = arg0;
            var4.field3578 = arg1;
            var4.field3577 = 0.0F;
            var2.add(var4);
        }
        method2427(var2, field3461, field3465, field3466, field3455, false);
    }

    @ObfuscatedName("qh.ao(Ljava/util/ArrayList;ZI)V")
    public static void method7338(ArrayList arg0, boolean arg1) {
        if (!arg1) {
            field3467.clear();
        }
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class332 var3 = (class332) var2.next();
            if (var3.field3574 != -1 && var3.field3575 != -1) {
                if (!arg1) {
                    field3467.add(var3);
                }
                field3462.add(var3);
            }
        }
    }

    @ObfuscatedName("je.ae(IIIIB)V")
    public static void method4568(int arg0, int arg1, int arg2, int arg3) {
        field3461 = arg0;
        field3465 = arg1;
        field3466 = arg2;
        field3455 = arg3;
    }

    @ObfuscatedName("fg.aa(I)V")
    public static void method3105() {
        Iterator var0 = field3460.iterator();
        while (var0.hasNext()) {
            class332 var1 = (class332) var0.next();
            if (var1 != null) {
                var1.field3583.method5510();
                var1.field3583.method5508();
                var1.field3583.method5503(0);
                var1.field3583.field3500 = 0;
                method2948(var1.field3574, var1.field3575);
            }
        }
        field3460.clear();
    }
}
