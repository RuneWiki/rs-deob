package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mj")
public class class322 {

    @ObfuscatedName("mj.at")
    public static ArrayList field3492 = null;

    @ObfuscatedName("mj.an")
    public static LinkedList field3501 = new LinkedList();

    @ObfuscatedName("mj.ao")
    public static ArrayList field3496 = new ArrayList(3);

    @ObfuscatedName("mj.ab")
    public static ArrayList field3497 = new ArrayList(3);

    @ObfuscatedName("mj.aw")
    public static ArrayList field3499 = new ArrayList();

    @ObfuscatedName("mj.ad")
    public static final List field3500 = new ArrayList();

    @ObfuscatedName("mj.al")
    public static int field3493 = 0;

    @ObfuscatedName("mj.as")
    public static int field3502 = 0;

    @ObfuscatedName("mj.ag")
    public static int field3503 = 0;

    @ObfuscatedName("mj.ai")
    public static int field3504 = 0;

    public class322() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.az(Loc;Loc;Loc;Ljava/util/ArrayList;I)Z")
    public static boolean method105(class379 arg0, class379 arg1, class379 arg2, ArrayList arg3) {
        Statics.field3494 = arg0;
        Statics.field3495 = arg1;
        Statics.field3498 = arg2;
        field3492 = arg3;
        return true;
    }

    @ObfuscatedName("jd.ah(Ljava/util/ArrayList;IIIIZI)V")
    public static void method4517(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3501.clear();
        field3499.clear();
        method7179(arg5);
        method2972(arg0, arg5);
        if (field3501.isEmpty()) {
            return;
        }
        method4881(arg1, arg2, arg3, arg4);
        field3499.add(new class420((class427) null));
        field3499.add(new class429((class427) null, Statics.field3494, Statics.field3495, Statics.field3498));
        ArrayList var6 = new ArrayList();
        var6.add(new class424(new class426((class427) null, 0, true, field3504)));
        if (field3496.isEmpty()) {
            field3499.add(new class423((class427) null, field3503));
            field3499.add(new class428((class427) null, var6));
            return;
        }
        ArrayList var7 = new ArrayList();
        var7.add(new class423(new class428((class427) null, var6), field3503));
        ArrayList var8 = new ArrayList();
        Iterator var9 = field3496.iterator();
        while (var9.hasNext()) {
            class334 var10 = (class334) var9.next();
            var8.add(var10);
        }
        var7.add(new class423(new class425(new class422((class427) null, var8), 0, false, field3502), field3493));
        field3499.add(new class428((class427) null, var7));
    }

    @ObfuscatedName("ag.af(IIB)V")
    public static void method104(int arg0, int arg1) {
        method4881(arg0, arg1, 0, 0);
        field3497.clear();
        field3499.clear();
        if (field3496.isEmpty() || arg0 == 0 && arg1 == 0) {
            method5293();
            return;
        }
        field3499.add(new class423((class427) null, field3493));
        field3499.add(new class425((class427) null, 0, false, field3502));
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3496.iterator();
        while (var3.hasNext()) {
            class334 var4 = (class334) var3.next();
            var2.add(var4);
        }
        field3499.add(new class422((class427) null, var2));
    }

    @ObfuscatedName("ex.an(B)V")
    public static void method2763() {
        field3497.clear();
    }

    @ObfuscatedName("hc.ao(Loc;II)V")
    public static void method3389(class379 arg0, int arg1) {
        if (field3497.isEmpty()) {
            return;
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3497.iterator();
        while (var3.hasNext()) {
            class334 var4 = (class334) var3.next();
            var4.field3618 = false;
            var4.field3611 = false;
            var4.field3605 = false;
            var4.field3613 = false;
            var4.field3615 = arg0;
            var4.field3608 = arg1;
            var4.field3609 = 0.0F;
            var2.add(var4);
        }
        method4517(var2, field3493, field3502, field3503, field3504, false);
    }

    @ObfuscatedName("fn.ab(Ljava/util/ArrayList;ZI)V")
    public static void method2972(ArrayList arg0, boolean arg1) {
        if (!arg1) {
            field3497.clear();
        }
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class334 var3 = (class334) var2.next();
            if (var3.field3606 != -1 && var3.field3607 != -1) {
                if (!arg1) {
                    field3497.add(var3);
                }
                field3501.add(var3);
            }
        }
    }

    @ObfuscatedName("ky.aw(IIIII)V")
    public static void method4881(int arg0, int arg1, int arg2, int arg3) {
        field3493 = arg0;
        field3502 = arg1;
        field3503 = arg2;
        field3504 = arg3;
    }

    @ObfuscatedName("dd.ad(Ljava/util/ArrayList;IIIII)V")
    public static void method2460(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        field3497.clear();
        field3497.addAll(arg0);
        method4881(arg1, arg2, arg3, arg4);
    }

    @ObfuscatedName("la.al(I)V")
    public static void method5293() {
        Iterator var0 = field3496.iterator();
        while (true) {
            class334 var1;
            do {
                if (!var0.hasNext()) {
                    field3496.clear();
                    return;
                }
                var1 = (class334) var0.next();
            } while (var1 == null);
            var1.field3614.method5447();
            var1.field3614.method5445();
            var1.field3614.method5440(0);
            var1.field3614.field3535 = 0;
            int var2 = var1.field3606;
            int var3 = var1.field3607;
            Iterator var4 = field3500.iterator();
            while (var4.hasNext()) {
                class328 var5 = (class328) var4.next();
                var5.method1157(var2, var3);
            }
        }
    }

    @ObfuscatedName("qc.as(ZI)V")
    public static void method7179(boolean arg0) {
        if (!arg0) {
            for (int var7 = 0; var7 < field3496.size(); var7++) {
                class334 var8 = (class334) field3496.get(var7);
                if (var8 == null) {
                    field3496.remove(var7);
                    var7--;
                } else if (var8.field3613) {
                    if (var8.field3614.field3535 > 0) {
                        var8.field3614.field3535--;
                    }
                    var8.field3614.method5447();
                    var8.field3614.method5445();
                    var8.field3614.method5440(0);
                    field3496.remove(var7);
                    var7--;
                } else {
                    var8.field3613 = true;
                }
            }
            return;
        }
        Iterator var1 = field3496.iterator();
        while (true) {
            class334 var2;
            do {
                if (!var1.hasNext()) {
                    field3496.clear();
                    return;
                }
                var2 = (class334) var1.next();
            } while (var2 == null);
            var2.field3614.method5447();
            var2.field3614.method5445();
            var2.field3614.method5440(0);
            var2.field3614.field3535 = 0;
            int var3 = var2.field3606;
            int var4 = var2.field3607;
            Iterator var5 = field3500.iterator();
            while (var5.hasNext()) {
                class328 var6 = (class328) var5.next();
                var6.method1157(var3, var4);
            }
        }
    }
}
