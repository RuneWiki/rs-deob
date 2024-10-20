package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mp")
public class class334 {

    @ObfuscatedName("mp.aj")
    public static ArrayList field3627 = null;

    @ObfuscatedName("mp.ai")
    public static LinkedList field3626 = new LinkedList();

    @ObfuscatedName("mp.ay")
    public static ArrayList field3630 = new ArrayList(3);

    @ObfuscatedName("mp.as")
    public static ArrayList field3629 = new ArrayList(3);

    @ObfuscatedName("mp.ae")
    public static ArrayList field3624 = new ArrayList();

    @ObfuscatedName("mp.am")
    public static final List field3628 = new ArrayList();

    @ObfuscatedName("mp.at")
    public static int field3631 = 0;

    @ObfuscatedName("mp.au")
    public static int field3632 = 0;

    @ObfuscatedName("mp.an")
    public static int field3633 = 0;

    @ObfuscatedName("mp.ao")
    public static int field3634 = 0;

    public class334() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fe.ap(Lpe;Lpe;Lpe;Ljava/util/ArrayList;I)Z")
    public static boolean method3399(class392 arg0, class392 arg1, class392 arg2, ArrayList arg3) {
        Statics.field3625 = arg0;
        Statics.field3304 = arg1;
        Statics.field3623 = arg2;
        field3627 = arg3;
        return true;
    }

    @ObfuscatedName("hh.aw(Ljava/util/ArrayList;IIIIZI)V")
    public static void method3888(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3626.clear();
        field3624.clear();
        if (arg5) {
            method2631();
        } else {
            for (int var6 = 0; var6 < field3630.size(); var6++) {
                class346 var7 = (class346) field3630.get(var6);
                if (var7 == null) {
                    field3630.remove(var6);
                    var6--;
                } else if (var7.field3753) {
                    if (var7.field3748.field3648 > 0) {
                        var7.field3748.field3648--;
                    }
                    var7.field3748.method6137();
                    var7.field3748.method6043();
                    var7.field3748.method6093(0);
                    field3630.remove(var6);
                    var6--;
                } else {
                    var7.field3753 = true;
                }
            }
        }
        if (!arg5) {
            field3629.clear();
        }
        Iterator var8 = arg0.iterator();
        while (var8.hasNext()) {
            class346 var9 = (class346) var8.next();
            if (var9.field3745 != -1 && var9.field3746 != -1) {
                if (!arg5) {
                    field3629.add(var9);
                }
                field3626.add(var9);
            }
        }
        if (field3626.isEmpty()) {
            return;
        }
        field3631 = arg1;
        field3632 = arg2;
        field3633 = arg3;
        field3634 = arg4;
        field3624.add(new class442((class449) null));
        field3624.add(new class451((class449) null, Statics.field3625, Statics.field3304, Statics.field3623));
        ArrayList var10 = new ArrayList();
        var10.add(new class446(new class448((class449) null, 0, true, field3634)));
        if (field3630.isEmpty()) {
            field3624.add(new class445((class449) null, field3633));
            field3624.add(new class450((class449) null, var10));
            return;
        }
        ArrayList var11 = new ArrayList();
        var11.add(new class445(new class450((class449) null, var10), field3633));
        ArrayList var12 = new ArrayList();
        Iterator var13 = field3630.iterator();
        while (var13.hasNext()) {
            class346 var14 = (class346) var13.next();
            var12.add(var14);
        }
        var11.add(new class445(new class447(new class444((class449) null, var12), 0, false, field3632), field3631));
        field3624.add(new class450((class449) null, var11));
    }

    @ObfuscatedName("az.ak(II)V")
    public static void method200(int arg0) {
        if (field3630.isEmpty()) {
            return;
        }
        Iterator var1 = field3630.iterator();
        while (var1.hasNext()) {
            class346 var2 = (class346) var1.next();
            if (var2 != null) {
                var2.field3747 = arg0;
            }
        }
        class346 var3 = (class346) field3630.get(0);
        if (var3 != null && var3.field3748 != null && var3.field3748.method6046() && !var3.field3752) {
            var3.field3748.method6093(arg0);
            var3.field3750 = (float) arg0;
        }
    }

    @ObfuscatedName("gg.aj(III)V")
    public static void method3533(int arg0, int arg1) {
        field3631 = arg0;
        field3632 = arg1;
        field3633 = 0;
        field3634 = 0;
        field3629.clear();
        field3624.clear();
        if (field3630.isEmpty() || arg0 == 0 && arg1 == 0) {
            method2631();
            return;
        }
        field3624.add(new class445((class449) null, field3631));
        field3624.add(new class447((class449) null, 0, false, field3632));
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3630.iterator();
        while (var3.hasNext()) {
            class346 var4 = (class346) var3.next();
            var2.add(var4);
        }
        field3624.add(new class444((class449) null, var2));
    }

    @ObfuscatedName("ku.ai(B)Z")
    public static boolean method5222() {
        if (field3624.isEmpty()) {
            return field3630.isEmpty() || field3630.get(0) == null || ((class346) field3630.get(0)).field3748 == null ? false : ((class346) field3630.get(0)).field3748.method6046();
        } else {
            return true;
        }
    }

    @ObfuscatedName("lp.ay(IIIIB)V")
    public static void method5803(int arg0, int arg1, int arg2, int arg3) {
        if (field3630.size() <= 1 || field3630.get(0) == null || !((class346) field3630.get(0)).field3748.method6046() || field3630.get(1) == null || !((class346) field3630.get(1)).field3748.method6046()) {
            return;
        }
        field3631 = arg0;
        field3632 = arg1;
        field3633 = arg2;
        field3634 = arg3;
        field3624.add(new class443((class449) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class445(new class448((class449) null, 1, false, field3634), field3633));
        var4.add(new class445(new class447((class449) null, 0, false, field3632), field3631));
        field3624.add(new class450((class449) null, var4));
        if (field3629.get(0) != null && field3629.get(1) != null) {
            class346 var5 = (class346) field3629.get(0);
            field3629.set(0, field3630.get(1));
            field3629.set(1, var5);
        }
    }

    @ObfuscatedName("ja.as(II)Z")
    public static boolean method4946(int arg0) {
        if (field3629.isEmpty()) {
            return false;
        } else {
            class346 var1 = (class346) field3629.get(0);
            return var1 != null && var1.field3745 == arg0;
        }
    }

    @ObfuscatedName("hr.ae(I)V")
    public static void method3610() {
        field3629.clear();
    }

    @ObfuscatedName("jf.am(Lpe;II)V")
    public static void method4940(class392 arg0, int arg1) {
        if (field3629.isEmpty()) {
            return;
        }
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3629.iterator();
        while (var3.hasNext()) {
            class346 var4 = (class346) var3.next();
            var4.field3751 = false;
            var4.field3758 = false;
            var4.field3752 = false;
            var4.field3753 = false;
            var4.field3744 = arg0;
            var4.field3747 = arg1;
            var4.field3750 = 0.0F;
            var2.add(var4);
        }
        method3888(var2, field3631, field3632, field3633, field3634, false);
    }

    @ObfuscatedName("is.at(I)Z")
    public static boolean method4375() {
        boolean var0 = false;
        boolean var1 = false;
        if (!field3624.isEmpty()) {
            class449 var2 = (class449) field3624.get(0);
            if (var2 == null) {
                field3624.remove(0);
            } else if (var2.method8051()) {
                if (var2.method8063()) {
                    System.out.println("Error in midimanager.service: " + var2.method8065());
                    var0 = true;
                } else {
                    if (var2.method8066() != null) {
                        field3624.add(1, var2.method8066());
                    }
                    var1 = var2.method8072();
                }
                field3624.remove(0);
            } else {
                var1 = var2.method8072();
            }
        }
        if (var0) {
            field3624.clear();
            method2631();
        }
        return var1;
    }

    @ObfuscatedName("jn.au(Ljava/util/ArrayList;IIIIS)V")
    public static void method4984(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        field3629.clear();
        field3629.addAll(arg0);
        field3631 = arg1;
        field3632 = arg2;
        field3633 = arg3;
        field3634 = arg4;
    }

    @ObfuscatedName("dw.an(I)V")
    public static void method2631() {
        Iterator var0 = field3630.iterator();
        while (true) {
            class346 var1;
            do {
                if (!var0.hasNext()) {
                    field3630.clear();
                    return;
                }
                var1 = (class346) var0.next();
            } while (var1 == null);
            var1.field3748.method6137();
            var1.field3748.method6043();
            var1.field3748.method6093(0);
            var1.field3748.field3648 = 0;
            int var2 = var1.field3745;
            int var3 = var1.field3746;
            Iterator var4 = field3628.iterator();
            while (var4.hasNext()) {
                class340 var5 = (class340) var4.next();
                var5.method1254(var2, var3);
            }
        }
    }
}
