package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mt")
public class class322 {

    @ObfuscatedName("mt.ai")
    public static ArrayList field3480 = null;

    @ObfuscatedName("mt.ar")
    public static LinkedList field3479 = new LinkedList();

    @ObfuscatedName("mt.as")
    public static ArrayList field3475 = new ArrayList(3);

    @ObfuscatedName("mt.aa")
    public static ArrayList field3485 = new ArrayList(3);

    @ObfuscatedName("mt.az")
    public static ArrayList field3482 = new ArrayList();

    @ObfuscatedName("mt.ao")
    public static final List field3483 = new ArrayList();

    @ObfuscatedName("mt.au")
    public static int field3484 = 0;

    @ObfuscatedName("mt.ak")
    public static int field3477 = 0;

    @ObfuscatedName("mt.ah")
    public static int field3486 = 0;

    @ObfuscatedName("mt.aj")
    public static int field3487 = 0;

    public class322() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ku.aq(Lmx;B)V")
    public static void method4886(class328 arg0) {
        if (!field3483.contains(arg0)) {
            field3483.add(arg0);
        }
    }

    @ObfuscatedName("ek.aw(Ljava/util/ArrayList;IIIIZI)V")
    public static void method2753(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3479.clear();
        field3482.clear();
        method2344(arg5);
        method5503(arg0, arg5);
        if (field3479.isEmpty()) {
            return;
        }
        method1088(arg1, arg2, arg3, arg4);
        field3482.add(new class419((class426) null));
        field3482.add(new class428((class426) null, Statics.field3481, Statics.field3476, Statics.field3478));
        ArrayList var6 = new ArrayList();
        var6.add(new class423(new class425((class426) null, 0, true, field3487)));
        if (field3475.isEmpty()) {
            field3482.add(new class422((class426) null, field3486));
            field3482.add(new class427((class426) null, var6));
            return;
        }
        ArrayList var7 = new ArrayList();
        var7.add(new class422(new class427((class426) null, var6), field3486));
        ArrayList var8 = method4216();
        var7.add(new class422(new class424(new class421((class426) null, var8), 0, false, field3477), field3484));
        field3482.add(new class427((class426) null, var7));
    }

    @ObfuscatedName("gr.al(III)V")
    public static void method3196(int arg0, int arg1) {
        method1088(arg0, arg1, 0, 0);
        field3485.clear();
        field3482.clear();
        if (!field3475.isEmpty() && (arg0 != 0 || arg1 != 0)) {
            field3482.add(new class422((class426) null, field3484));
            field3482.add(new class424((class426) null, 0, false, field3477));
            ArrayList var2 = new ArrayList();
            Iterator var3 = field3475.iterator();
            while (var3.hasNext()) {
                class334 var4 = (class334) var3.next();
                var2.add(var4);
            }
            field3482.add(new class421((class426) null, var2));
            return;
        }
        Iterator var7 = field3475.iterator();
        while (true) {
            class334 var8;
            do {
                if (!var7.hasNext()) {
                    field3475.clear();
                    return;
                }
                var8 = (class334) var7.next();
            } while (var8 == null);
            var8.field3595.method5550();
            var8.field3595.method5582();
            var8.field3595.method5622(0);
            var8.field3595.field3519 = 0;
            int var9 = var8.field3591;
            int var10 = var8.field3592;
            Iterator var11 = field3483.iterator();
            while (var11.hasNext()) {
                class328 var12 = (class328) var11.next();
                var12.method1275(var9, var10);
            }
        }
    }

    @ObfuscatedName("cq.ai(IIIII)V")
    public static void method2027(int arg0, int arg1, int arg2, int arg3) {
        if (field3475.size() <= 1 || field3475.get(0) == null || !((class334) field3475.get(0)).field3595.method5551() || field3475.get(1) == null || !((class334) field3475.get(1)).field3595.method5551()) {
            return;
        }
        method1088(arg0, arg1, arg2, arg3);
        field3482.add(new class420((class426) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class422(new class425((class426) null, 1, false, field3487), field3486));
        var4.add(new class422(new class424((class426) null, 0, false, field3477), field3484));
        field3482.add(new class427((class426) null, var4));
        if (field3485.get(0) != null && field3485.get(1) != null) {
            class334 var5 = (class334) field3485.get(0);
            field3485.set(0, field3475.get(1));
            field3485.set(1, var5);
        }
    }

    @ObfuscatedName("jn.ar(II)Z")
    public static boolean method4483(int arg0) {
        if (field3485.isEmpty()) {
            return false;
        } else {
            class334 var1 = (class334) field3485.get(0);
            return var1 != null && var1.field3591 == arg0;
        }
    }

    @ObfuscatedName("hc.as(I)Z")
    public static boolean method3498() {
        return !field3485.isEmpty();
    }

    @ObfuscatedName("ce.aa(I)V")
    public static void method1122() {
        field3485.clear();
    }

    @ObfuscatedName("ca.az(Lof;IS)V")
    public static void method1962(class378 arg0, int arg1) {
        if (field3485.isEmpty()) {
            return;
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3485.iterator();
        while (var3.hasNext()) {
            class334 var4 = (class334) var3.next();
            var4.field3597 = false;
            var4.field3590 = false;
            var4.field3598 = false;
            var4.field3596 = false;
            var4.field3600 = arg0;
            var4.field3593 = arg1;
            var4.field3603 = 0.0F;
            var2.add(var4);
        }
        method2753(var2, field3484, field3477, field3486, field3487, false);
    }

    @ObfuscatedName("mh.ao(Ljava/util/ArrayList;ZI)V")
    public static void method5503(ArrayList arg0, boolean arg1) {
        if (!arg1) {
            field3485.clear();
        }
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class334 var3 = (class334) var2.next();
            if (var3.field3591 != -1 && var3.field3592 != -1) {
                if (!arg1) {
                    field3485.add(var3);
                }
                field3479.add(var3);
            }
        }
    }

    @ObfuscatedName("cw.au(IIIII)V")
    public static void method1088(int arg0, int arg1, int arg2, int arg3) {
        field3484 = arg0;
        field3477 = arg1;
        field3486 = arg2;
        field3487 = arg3;
    }

    @ObfuscatedName("jh.ak(B)Ljava/util/ArrayList;")
    public static ArrayList method4216() {
        ArrayList var0 = new ArrayList();
        Iterator var1 = field3475.iterator();
        while (var1.hasNext()) {
            class334 var2 = (class334) var1.next();
            var0.add(var2);
        }
        return var0;
    }

    @ObfuscatedName("fv.ah(Ljava/util/ArrayList;IIIIB)V")
    public static void method2969(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        field3485.clear();
        field3485.addAll(arg0);
        method1088(arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("dy.aj(ZB)V")
    public static void method2344(boolean arg0) {
        if (!arg0) {
            for (int var7 = 0; var7 < field3475.size(); var7++) {
                class334 var8 = (class334) field3475.get(var7);
                if (var8 == null) {
                    field3475.remove(var7);
                    var7--;
                } else if (var8.field3596) {
                    if (var8.field3595.field3519 > 0) {
                        var8.field3595.field3519--;
                    }
                    var8.field3595.method5550();
                    var8.field3595.method5582();
                    var8.field3595.method5622(0);
                    field3475.remove(var7);
                    var7--;
                } else {
                    var8.field3596 = true;
                }
            }
            return;
        }
        Iterator var1 = field3475.iterator();
        while (true) {
            class334 var2;
            do {
                if (!var1.hasNext()) {
                    field3475.clear();
                    return;
                }
                var2 = (class334) var1.next();
            } while (var2 == null);
            var2.field3595.method5550();
            var2.field3595.method5582();
            var2.field3595.method5622(0);
            var2.field3595.field3519 = 0;
            int var3 = var2.field3591;
            int var4 = var2.field3592;
            Iterator var5 = field3483.iterator();
            while (var5.hasNext()) {
                class328 var6 = (class328) var5.next();
                var6.method1275(var3, var4);
            }
        }
    }
}
