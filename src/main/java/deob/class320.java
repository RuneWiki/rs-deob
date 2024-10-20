package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mr")
public class class320 {

    @ObfuscatedName("mr.ax")
    public static ArrayList field3432 = null;

    @ObfuscatedName("mr.ao")
    public static LinkedList field3429 = new LinkedList();

    @ObfuscatedName("mr.ah")
    public static ArrayList field3434 = new ArrayList(3);

    @ObfuscatedName("mr.ar")
    public static ArrayList field3441 = new ArrayList(3);

    @ObfuscatedName("mr.ab")
    public static ArrayList field3436 = new ArrayList();

    @ObfuscatedName("mr.am")
    public static final List field3435 = new ArrayList();

    @ObfuscatedName("mr.av")
    public static int field3438 = 0;

    @ObfuscatedName("mr.ag")
    public static int field3439 = 0;

    @ObfuscatedName("mr.aa")
    public static int field3437 = 0;

    @ObfuscatedName("mr.ap")
    public static int field3431 = 0;

    public class320() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("al.ac(Lom;Lom;Lom;Ljava/util/ArrayList;B)Z")
    public static boolean method10(class374 arg0, class374 arg1, class374 arg2, ArrayList arg3) {
        Statics.field3440 = arg0;
        Statics.field3430 = arg1;
        Statics.field3433 = arg2;
        field3432 = arg3;
        return true;
    }

    @ObfuscatedName("kb.al(Lmh;I)V")
    public static void method4821(class326 arg0) {
        if (!field3435.contains(arg0)) {
            field3435.add(arg0);
        }
    }

    @ObfuscatedName("nl.ak(IIB)V")
    public static void method6172(int arg0, int arg1) {
        Iterator var2 = field3435.iterator();
        while (var2.hasNext()) {
            class326 var3 = (class326) var2.next();
            var3.method1187(arg0, arg1);
        }
    }

    @ObfuscatedName("ff.ax(Ljava/util/ArrayList;IIIIZB)V")
    public static void method2981(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3429.clear();
        field3436.clear();
        method2118(arg5);
        method6405(arg0, arg5);
        if (field3429.isEmpty()) {
            return;
        }
        method673(arg1, arg2, arg3, arg4);
        field3436.add(new class415((class422) null));
        field3436.add(new class424((class422) null, Statics.field3440, Statics.field3430, Statics.field3433));
        ArrayList var6 = new ArrayList();
        var6.add(new class419(new class421((class422) null, 0, true, field3431)));
        if (field3434.isEmpty()) {
            field3436.add(new class418((class422) null, field3437));
            field3436.add(new class423((class422) null, var6));
            return;
        }
        ArrayList var7 = new ArrayList();
        var7.add(new class418(new class423((class422) null, var6), field3437));
        ArrayList var8 = new ArrayList();
        Iterator var9 = field3434.iterator();
        while (var9.hasNext()) {
            class332 var10 = (class332) var9.next();
            var8.add(var10);
        }
        var7.add(new class418(new class420(new class417((class422) null, var8), 0, false, field3439), field3438));
        field3436.add(new class423((class422) null, var7));
    }

    @ObfuscatedName("iy.ao(III)V")
    public static void method3819(int arg0, int arg1) {
        method673(arg0, arg1, 0, 0);
        field3441.clear();
        field3436.clear();
        if (field3434.isEmpty() || arg0 == 0 && arg1 == 0) {
            method2018();
            return;
        }
        field3436.add(new class418((class422) null, field3438));
        field3436.add(new class420((class422) null, 0, false, field3439));
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3434.iterator();
        while (var3.hasNext()) {
            class332 var4 = (class332) var3.next();
            var2.add(var4);
        }
        field3436.add(new class417((class422) null, var2));
    }

    @ObfuscatedName("oq.ah(I)Z")
    public static boolean method6192() {
        if (field3436.isEmpty()) {
            return field3434.isEmpty() || field3434.get(0) == null || ((class332) field3434.get(0)).field3539 == null ? false : ((class332) field3434.get(0)).field3539.method5418();
        } else {
            return true;
        }
    }

    @ObfuscatedName("ho.ar(IIIII)V")
    public static void method3526(int arg0, int arg1, int arg2, int arg3) {
        if (field3434.size() <= 1 || field3434.get(0) == null || !((class332) field3434.get(0)).field3539.method5418() || field3434.get(1) == null || !((class332) field3434.get(1)).field3539.method5418()) {
            return;
        }
        method673(arg0, arg1, arg2, arg3);
        field3436.add(new class416((class422) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class418(new class421((class422) null, 1, false, field3431), field3437));
        var4.add(new class418(new class420((class422) null, 0, false, field3439), field3438));
        field3436.add(new class423((class422) null, var4));
        if (field3441.get(0) != null && field3441.get(1) != null) {
            class332 var5 = (class332) field3441.get(0);
            field3441.set(0, field3434.get(1));
            field3441.set(1, var5);
        }
    }

    @ObfuscatedName("cn.ab(I)Z")
    public static boolean method1121() {
        return !field3441.isEmpty();
    }

    @ObfuscatedName("sm.am(I)V")
    public static void method7699() {
        field3441.clear();
    }

    @ObfuscatedName("hg.av(Lom;II)V")
    public static void method3372(class374 arg0, int arg1) {
        if (field3441.isEmpty()) {
            return;
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3441.iterator();
        while (var3.hasNext()) {
            class332 var4 = (class332) var3.next();
            var4.field3546 = false;
            var4.field3548 = false;
            var4.field3547 = false;
            var4.field3551 = false;
            var4.field3545 = arg0;
            var4.field3542 = arg1;
            var4.field3543 = 0.0F;
            var2.add(var4);
        }
        method2981(var2, field3438, field3439, field3437, field3431, false);
    }

    @ObfuscatedName("oz.aa(Ljava/util/ArrayList;ZI)V")
    public static void method6405(ArrayList arg0, boolean arg1) {
        if (!arg1) {
            field3441.clear();
        }
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class332 var3 = (class332) var2.next();
            if (var3.field3540 != -1 && var3.field3541 != -1) {
                if (!arg1) {
                    field3441.add(var3);
                }
                field3429.add(var3);
            }
        }
    }

    @ObfuscatedName("bo.ap(IIIIB)V")
    public static void method673(int arg0, int arg1, int arg2, int arg3) {
        field3438 = arg0;
        field3439 = arg1;
        field3437 = arg2;
        field3431 = arg3;
    }

    @ObfuscatedName("kp.ay(Ljava/util/ArrayList;IIIII)V")
    public static void method5120(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        field3441.clear();
        field3441.addAll(arg0);
        method673(arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("ct.as(I)V")
    public static void method2018() {
        Iterator var0 = field3434.iterator();
        while (var0.hasNext()) {
            class332 var1 = (class332) var0.next();
            if (var1 != null) {
                var1.field3539.method5417();
                var1.field3539.method5470();
                var1.field3539.method5411(0);
                var1.field3539.field3451 = 0;
                method6172(var1.field3540, var1.field3541);
            }
        }
        field3434.clear();
    }

    @ObfuscatedName("ds.aj(ZI)V")
    public static void method2118(boolean arg0) {
        if (arg0) {
            method2018();
            return;
        }
        for (int var1 = 0; var1 < field3434.size(); var1++) {
            class332 var2 = (class332) field3434.get(var1);
            if (var2 == null) {
                field3434.remove(var1);
                var1--;
            } else if (var2.field3551) {
                if (var2.field3539.field3451 > 0) {
                    var2.field3539.field3451--;
                }
                var2.field3539.method5417();
                var2.field3539.method5470();
                var2.field3539.method5411(0);
                field3434.remove(var1);
                var1--;
            } else {
                var2.field3551 = true;
            }
        }
    }
}
