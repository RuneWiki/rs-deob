package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lq")
public class class307 {

    @ObfuscatedName("lq.am")
    public static ArrayList field3396 = null;

    @ObfuscatedName("lq.as")
    public static LinkedList field3397 = new LinkedList();

    @ObfuscatedName("lq.aj")
    public static ArrayList field3395 = new ArrayList(3);

    @ObfuscatedName("lq.ag")
    public static ArrayList field3399 = new ArrayList(3);

    @ObfuscatedName("lq.az")
    public static ArrayList field3400 = new ArrayList();

    @ObfuscatedName("lq.av")
    public static final List field3401 = new ArrayList();

    @ObfuscatedName("lq.ap")
    public static int field3393 = 0;

    @ObfuscatedName("lq.aq")
    public static int field3403 = 0;

    @ObfuscatedName("lq.at")
    public static int field3404 = 0;

    @ObfuscatedName("lq.ah")
    public static int field3408 = 0;

    public class307() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kp.aw(Lnd;Lnd;Lnd;Ljava/util/ArrayList;B)Z")
    public static boolean method5055(class360 arg0, class360 arg1, class360 arg2, ArrayList arg3) {
        Statics.field3394 = arg0;
        Statics.field3398 = arg1;
        Statics.field3402 = arg2;
        field3396 = arg3;
        return true;
    }

    @ObfuscatedName("db.ay(Lmn;I)V")
    public static void method2540(class313 arg0) {
        if (!field3401.contains(arg0)) {
            field3401.add(arg0);
        }
    }

    @ObfuscatedName("ia.ar(III)V")
    public static void method3726(int arg0, int arg1) {
        Iterator var2 = field3401.iterator();
        while (var2.hasNext()) {
            class313 var3 = (class313) var2.next();
            var3.method1532(arg0, arg1);
        }
    }

    @ObfuscatedName("en.am(Ljava/util/ArrayList;IIIIZB)V")
    public static void method2728(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5 || !field3397.isEmpty() && !arg0.isEmpty()) {
            field3397.clear();
            field3400.clear();
        }
        if (arg0.isEmpty()) {
            return;
        }
        method2966(arg0, arg5);
        if (field3397.isEmpty()) {
            return;
        }
        method2164(arg1, arg2, arg3, arg4);
        field3400.add(new class401((class408) null));
        field3400.add(new class410((class408) null, Statics.field3394, Statics.field3398, Statics.field3402));
        if (field3395.isEmpty()) {
            field3400.add(new class404((class408) null, field3404));
            field3400.add(new class405((class408) null));
            field3400.add(new class407((class408) null, 0, true, field3408));
            return;
        }
        ArrayList var6 = new ArrayList();
        var6.add(new class404(new class405(new class407((class408) null, 0, true, field3408)), field3404));
        ArrayList var7 = method3083();
        var6.add(new class404(new class406(new class403((class408) null, var7), 0, false, field3403), field3393));
        field3400.add(new class409((class408) null, var6));
    }

    @ObfuscatedName("az.as(II)V")
    public static void method58(int arg0) {
        if (field3395.isEmpty()) {
            return;
        }
        Iterator var1 = field3395.iterator();
        while (var1.hasNext()) {
            class319 var2 = (class319) var1.next();
            if (var2 != null) {
                var2.field3511 = arg0;
            }
        }
        class319 var3 = (class319) field3395.get(0);
        if (var3 != null && var3.field3517 != null && var3.field3517.method5264() && !var3.field3516) {
            var3.field3517.method5256(arg0);
            var3.field3512 = (float) arg0;
        }
    }

    @ObfuscatedName("in.aj(IIS)V")
    public static void method3865(int arg0, int arg1) {
        method2164(arg0, arg1, 0, 0);
        field3399.clear();
        if (!field3395.isEmpty() && (arg0 != 0 || arg1 != 0)) {
            field3400.add(new class404((class408) null, field3393));
            field3400.add(new class406((class408) null, 0, false, field3403));
        }
        ArrayList var2 = method3083();
        field3400.add(new class403((class408) null, var2));
    }

    @ObfuscatedName("do.ag(B)Z")
    public static boolean method2178() {
        if (field3400.isEmpty()) {
            return field3395.isEmpty() || field3395.get(0) == null || ((class319) field3395.get(0)).field3517 == null ? false : ((class319) field3395.get(0)).field3517.method5264();
        } else {
            return true;
        }
    }

    @ObfuscatedName("rv.az(IIIIS)V")
    public static void method7564(int arg0, int arg1, int arg2, int arg3) {
        if (field3395.size() <= 1 || field3395.get(0) == null || !((class319) field3395.get(0)).field3517.method5264() || field3395.get(1) == null || !((class319) field3395.get(1)).field3517.method5264()) {
            return;
        }
        method2164(arg0, arg1, arg2, arg3);
        field3400.add(new class402((class408) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class404(new class407((class408) null, 1, false, field3408), field3404));
        var4.add(new class404(new class406((class408) null, 0, false, field3403), field3393));
        field3400.add(new class409((class408) null, var4));
        if (field3399.get(0) != null && field3399.get(1) != null) {
            class319 var5 = (class319) field3399.get(0);
            field3399.set(0, field3395.get(1));
            field3399.set(1, var5);
        }
    }

    @ObfuscatedName("hz.av(I)Z")
    public static boolean method3372() {
        return !field3399.isEmpty();
    }

    @ObfuscatedName("dn.ap(II)Z")
    public static boolean method2181(int arg0) {
        boolean var1 = false;
        boolean var2 = false;
        if (!field3400.isEmpty()) {
            class408 var3 = (class408) field3400.get(0);
            if (var3 == null) {
                field3400.remove(0);
            } else if (var3.method6944(arg0)) {
                if (var3.method6973()) {
                    System.out.println("Error in midimanager.service: " + var3.method6957());
                    var1 = true;
                } else {
                    if (var3.method6958() != null) {
                        field3400.add(1, var3.method6958());
                    }
                    var2 = var3.method6956();
                }
                field3400.remove(0);
            } else {
                var2 = var3.method6956();
            }
        }
        if (var1) {
            field3400.clear();
            ArrayList var4 = method3083();
            field3400.add(new class403((class408) null, var4));
        }
        return var2;
    }

    @ObfuscatedName("fu.aq(Ljava/util/ArrayList;ZI)V")
    public static void method2966(ArrayList arg0, boolean arg1) {
        if (!arg1) {
            field3399.clear();
        }
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class319 var3 = (class319) var2.next();
            if (var3.field3508 != -1 && var3.field3510 != -1) {
                if (!arg1) {
                    field3399.add(var3);
                }
                field3397.add(var3);
            }
        }
    }

    @ObfuscatedName("dr.at(IIIII)V")
    public static void method2164(int arg0, int arg1, int arg2, int arg3) {
        field3393 = arg0;
        field3403 = arg1;
        field3404 = arg2;
        field3408 = arg3;
    }

    @ObfuscatedName("go.ah(B)Ljava/util/ArrayList;")
    public static ArrayList method3083() {
        ArrayList var0 = new ArrayList();
        Iterator var1 = field3395.iterator();
        while (var1.hasNext()) {
            class319 var2 = (class319) var1.next();
            var0.add(var2);
        }
        return var0;
    }
}
