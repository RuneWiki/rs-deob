package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mi")
public class class317 {

    @ObfuscatedName("mi.ao")
    public static ArrayList field3416 = null;

    @ObfuscatedName("mi.ab")
    public static LinkedList field3417 = new LinkedList();

    @ObfuscatedName("mi.au")
    public static ArrayList field3423 = new ArrayList(3);

    @ObfuscatedName("mi.aa")
    public static ArrayList field3425 = new ArrayList(3);

    @ObfuscatedName("mi.ac")
    public static ArrayList field3414 = new ArrayList();

    @ObfuscatedName("mi.al")
    public static final List field3421 = new ArrayList();

    @ObfuscatedName("mi.az")
    public static int field3422 = 0;

    @ObfuscatedName("mi.ap")
    public static int field3419 = 0;

    @ObfuscatedName("mi.av")
    public static int field3420 = 0;

    @ObfuscatedName("mi.ax")
    public static int field3418 = 0;

    public class317() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.at(Lmf;I)V")
    public static void method2237(class323 arg0) {
        field3421.remove(arg0);
    }

    @ObfuscatedName("dp.ah(Ljava/util/ArrayList;IIIIZI)V")
    public static void method2334(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3417.clear();
        field3414.clear();
        method5317(arg5);
        method457(arg0, arg5);
        if (field3417.isEmpty()) {
            return;
        }
        method3367(arg1, arg2, arg3, arg4);
        field3414.add(new class412((class419) null));
        field3414.add(new class421((class419) null, Statics.field3424, Statics.field3415, Statics.field1790));
        ArrayList var6 = new ArrayList();
        var6.add(new class416(new class418((class419) null, 0, true, field3418)));
        if (field3423.isEmpty()) {
            field3414.add(new class415((class419) null, field3420));
            field3414.add(new class420((class419) null, var6));
            return;
        }
        ArrayList var7 = new ArrayList();
        var7.add(new class415(new class420((class419) null, var6), field3420));
        ArrayList var8 = new ArrayList();
        Iterator var9 = field3423.iterator();
        while (var9.hasNext()) {
            class329 var10 = (class329) var9.next();
            var8.add(var10);
        }
        var7.add(new class415(new class417(new class414((class419) null, var8), 0, false, field3419), field3422));
        field3414.add(new class420((class419) null, var7));
    }

    @ObfuscatedName("jd.ar(II)V")
    public static void method4478(int arg0) {
        if (field3423.isEmpty()) {
            return;
        }
        Iterator var1 = field3423.iterator();
        while (var1.hasNext()) {
            class329 var2 = (class329) var1.next();
            if (var2 != null) {
                var2.field3526 = arg0;
            }
        }
        class329 var3 = (class329) field3423.get(0);
        if (var3 != null && var3.field3523 != null && var3.field3523.method5487() && !var3.field3531) {
            var3.field3523.method5406(arg0);
            var3.field3529 = (float) arg0;
        }
    }

    @ObfuscatedName("jf.ao(III)V")
    public static void method4392(int arg0, int arg1) {
        method3367(arg0, arg1, 0, 0);
        field3425.clear();
        field3414.clear();
        if (field3423.isEmpty() || arg0 == 0 && arg1 == 0) {
            method2210();
            return;
        }
        field3414.add(new class415((class419) null, field3422));
        field3414.add(new class417((class419) null, 0, false, field3419));
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3423.iterator();
        while (var3.hasNext()) {
            class329 var4 = (class329) var3.next();
            var2.add(var4);
        }
        field3414.add(new class414((class419) null, var2));
    }

    @ObfuscatedName("eg.ab(I)Z")
    public static boolean method2855() {
        if (field3414.isEmpty()) {
            return field3423.isEmpty() || field3423.get(0) == null || ((class329) field3423.get(0)).field3523 == null ? false : ((class329) field3423.get(0)).field3523.method5487();
        } else {
            return true;
        }
    }

    @ObfuscatedName("hk.au(IIIII)V")
    public static void method3443(int arg0, int arg1, int arg2, int arg3) {
        if (field3423.size() <= 1 || field3423.get(0) == null || !((class329) field3423.get(0)).field3523.method5487() || field3423.get(1) == null || !((class329) field3423.get(1)).field3523.method5487()) {
            return;
        }
        method3367(arg0, arg1, arg2, arg3);
        field3414.add(new class413((class419) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class415(new class418((class419) null, 1, false, field3418), field3420));
        var4.add(new class415(new class417((class419) null, 0, false, field3419), field3422));
        field3414.add(new class420((class419) null, var4));
        if (field3425.get(0) != null && field3425.get(1) != null) {
            class329 var5 = (class329) field3425.get(0);
            field3425.set(0, field3423.get(1));
            field3425.set(1, var5);
        }
    }

    @ObfuscatedName("si.aa(I)V")
    public static void method7786() {
        field3425.clear();
    }

    @ObfuscatedName("ch.ac(Lol;IS)V")
    public static void method2031(class371 arg0, int arg1) {
        if (field3425.isEmpty()) {
            return;
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3425.iterator();
        while (var3.hasNext()) {
            class329 var4 = (class329) var3.next();
            var4.field3525 = false;
            var4.field3537 = false;
            var4.field3531 = false;
            var4.field3527 = false;
            var4.field3536 = arg0;
            var4.field3526 = arg1;
            var4.field3529 = 0.0F;
            var2.add(var4);
        }
        method2334(var2, field3422, field3419, field3420, field3418, false);
    }

    @ObfuscatedName("tj.al(S)Z")
    public static boolean method8297() {
        boolean var0 = false;
        boolean var1 = false;
        if (!field3414.isEmpty()) {
            class419 var2 = (class419) field3414.get(0);
            if (var2 == null) {
                field3414.remove(0);
            } else if (var2.method7116()) {
                if (var2.method7135()) {
                    System.out.println("Error in midimanager.service: " + var2.method7128());
                    var0 = true;
                } else {
                    if (var2.method7132() != null) {
                        field3414.add(1, var2.method7132());
                    }
                    var1 = var2.method7130();
                }
                field3414.remove(0);
            } else {
                var1 = var2.method7130();
            }
        }
        if (var0) {
            field3414.clear();
            method2210();
        }
        return var1;
    }

    @ObfuscatedName("bv.az(Ljava/util/ArrayList;ZI)V")
    public static void method457(ArrayList arg0, boolean arg1) {
        if (!arg1) {
            field3425.clear();
        }
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class329 var3 = (class329) var2.next();
            if (var3.field3524 != -1 && var3.field3532 != -1) {
                if (!arg1) {
                    field3425.add(var3);
                }
                field3417.add(var3);
            }
        }
    }

    @ObfuscatedName("hp.ap(IIIII)V")
    public static void method3367(int arg0, int arg1, int arg2, int arg3) {
        field3422 = arg0;
        field3419 = arg1;
        field3420 = arg2;
        field3418 = arg3;
    }

    @ObfuscatedName("dx.av(I)V")
    public static void method2210() {
        Iterator var0 = field3423.iterator();
        while (true) {
            class329 var1;
            do {
                if (!var0.hasNext()) {
                    field3423.clear();
                    return;
                }
                var1 = (class329) var0.next();
            } while (var1 == null);
            var1.field3523.method5413();
            var1.field3523.method5411();
            var1.field3523.method5406(0);
            var1.field3523.field3456 = 0;
            int var2 = var1.field3524;
            int var3 = var1.field3532;
            Iterator var4 = field3421.iterator();
            while (var4.hasNext()) {
                class323 var5 = (class323) var4.next();
                var5.method1322(var2, var3);
            }
        }
    }

    @ObfuscatedName("ld.ax(ZI)V")
    public static void method5317(boolean arg0) {
        if (arg0) {
            method2210();
            return;
        }
        for (int var1 = 0; var1 < field3423.size(); var1++) {
            class329 var2 = (class329) field3423.get(var1);
            if (var2 == null) {
                field3423.remove(var1);
                var1--;
            } else if (var2.field3527) {
                if (var2.field3523.field3456 > 0) {
                    var2.field3523.field3456--;
                }
                var2.field3523.method5413();
                var2.field3523.method5411();
                var2.field3523.method5406(0);
                field3423.remove(var1);
                var1--;
            } else {
                var2.field3527 = true;
            }
        }
    }
}
