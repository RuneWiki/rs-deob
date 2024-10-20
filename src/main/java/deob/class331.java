package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("mk")
public class class331 {

    @ObfuscatedName("mk.ak")
    public static ArrayList field3583 = null;

    @ObfuscatedName("mk.ap")
    public static LinkedList field3588 = new LinkedList();

    @ObfuscatedName("mk.an")
    public static ArrayList field3585 = new ArrayList(3);

    @ObfuscatedName("mk.aj")
    public static ArrayList field3586 = new ArrayList(3);

    @ObfuscatedName("mk.av")
    public static ArrayList field3582 = new ArrayList();

    @ObfuscatedName("mk.ab")
    public static final List field3589 = new ArrayList();

    @ObfuscatedName("mk.ai")
    public static int field3581 = 0;

    @ObfuscatedName("mk.ae")
    public static int field3590 = 0;

    @ObfuscatedName("mk.au")
    public static int field3591 = 0;

    @ObfuscatedName("mk.ah")
    public static int field3587 = 0;

    public class331() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ou.aq(Lok;Lok;Lok;Ljava/util/ArrayList;B)Z")
    public static boolean method6481(class388 arg0, class388 arg1, class388 arg2, ArrayList arg3) {
        Statics.field3584 = arg0;
        Statics.field3580 = arg1;
        Statics.field3592 = arg2;
        field3583 = arg3;
        return true;
    }

    @ObfuscatedName("dt.ad(Lmu;I)V")
    public static void method2285(class337 arg0) {
        if (!field3589.contains(arg0)) {
            field3589.add(arg0);
        }
    }

    @ObfuscatedName("ty.ag(Ljava/util/ArrayList;IIIIZI)V")
    public static void method8420(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3588.clear();
        field3582.clear();
        if (arg5) {
            Iterator var6 = field3585.iterator();
            label59: while (true) {
                class343 var7;
                do {
                    if (!var6.hasNext()) {
                        field3585.clear();
                        break label59;
                    }
                    var7 = (class343) var6.next();
                } while (var7 == null);
                var7.field3714.method5642();
                var7.field3714.method5613();
                var7.field3714.method5609(0);
                var7.field3714.field3628 = 0;
                int var8 = var7.field3717;
                int var9 = var7.field3706;
                Iterator var10 = field3589.iterator();
                while (var10.hasNext()) {
                    class337 var11 = (class337) var10.next();
                    var11.method1181(var8, var9);
                }
            }
        } else {
            for (int var12 = 0; var12 < field3585.size(); var12++) {
                class343 var13 = (class343) field3585.get(var12);
                if (var13 == null) {
                    field3585.remove(var12);
                    var12--;
                } else if (var13.field3713) {
                    if (var13.field3714.field3628 > 0) {
                        var13.field3714.field3628--;
                    }
                    var13.field3714.method5642();
                    var13.field3714.method5613();
                    var13.field3714.method5609(0);
                    field3585.remove(var12);
                    var12--;
                } else {
                    var13.field3713 = true;
                }
            }
        }
        method2916(arg0, arg5);
        if (field3588.isEmpty()) {
            return;
        }
        method472(arg1, arg2, arg3, arg4);
        field3582.add(new class438((class445) null));
        field3582.add(new class447((class445) null, Statics.field3584, Statics.field3580, Statics.field3592));
        ArrayList var14 = new ArrayList();
        var14.add(new class442(new class444((class445) null, 0, true, field3587)));
        if (field3585.isEmpty()) {
            field3582.add(new class441((class445) null, field3591));
            field3582.add(new class446((class445) null, var14));
            return;
        }
        ArrayList var15 = new ArrayList();
        var15.add(new class441(new class446((class445) null, var14), field3591));
        ArrayList var16 = method2435();
        var15.add(new class441(new class443(new class440((class445) null, var16), 0, false, field3590), field3581));
        field3582.add(new class446((class445) null, var15));
    }

    @ObfuscatedName("as.ak(II)V")
    public static void method296(int arg0) {
        if (field3585.isEmpty()) {
            return;
        }
        Iterator var1 = field3585.iterator();
        while (var1.hasNext()) {
            class343 var2 = (class343) var1.next();
            if (var2 != null) {
                var2.field3707 = arg0;
            }
        }
        class343 var3 = (class343) field3585.get(0);
        if (var3 != null && var3.field3714 != null && var3.field3714.method5615() && !var3.field3716) {
            var3.field3714.method5609(arg0);
            var3.field3705 = (float) arg0;
        }
    }

    @ObfuscatedName("fb.ap(III)V")
    public static void method3026(int arg0, int arg1) {
        method472(arg0, arg1, 0, 0);
        field3586.clear();
        field3582.clear();
        if (!field3585.isEmpty() && (arg0 != 0 || arg1 != 0)) {
            field3582.add(new class441((class445) null, field3581));
            field3582.add(new class443((class445) null, 0, false, field3590));
            ArrayList var2 = new ArrayList();
            Iterator var3 = field3585.iterator();
            while (var3.hasNext()) {
                class343 var4 = (class343) var3.next();
                var2.add(var4);
            }
            field3582.add(new class440((class445) null, var2));
            return;
        }
        Iterator var7 = field3585.iterator();
        while (true) {
            class343 var8;
            do {
                if (!var7.hasNext()) {
                    field3585.clear();
                    return;
                }
                var8 = (class343) var7.next();
            } while (var8 == null);
            var8.field3714.method5642();
            var8.field3714.method5613();
            var8.field3714.method5609(0);
            var8.field3714.field3628 = 0;
            int var9 = var8.field3717;
            int var10 = var8.field3706;
            Iterator var11 = field3589.iterator();
            while (var11.hasNext()) {
                class337 var12 = (class337) var11.next();
                var12.method1181(var9, var10);
            }
        }
    }

    @ObfuscatedName("gj.an(B)Z")
    public static boolean method3228() {
        if (field3582.isEmpty()) {
            return field3585.isEmpty() || field3585.get(0) == null || ((class343) field3585.get(0)).field3714 == null ? false : ((class343) field3585.get(0)).field3714.method5615();
        } else {
            return true;
        }
    }

    @ObfuscatedName("ex.aj(IIIII)V")
    public static void method2667(int arg0, int arg1, int arg2, int arg3) {
        if (field3585.size() <= 1 || field3585.get(0) == null || !((class343) field3585.get(0)).field3714.method5615() || field3585.get(1) == null || !((class343) field3585.get(1)).field3714.method5615()) {
            return;
        }
        method472(arg0, arg1, arg2, arg3);
        field3582.add(new class439((class445) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class441(new class444((class445) null, 1, false, field3587), field3591));
        var4.add(new class441(new class443((class445) null, 0, false, field3590), field3581));
        field3582.add(new class446((class445) null, var4));
        if (field3586.get(0) != null && field3586.get(1) != null) {
            class343 var5 = (class343) field3586.get(0);
            field3586.set(0, field3585.get(1));
            field3586.set(1, var5);
        }
    }

    @ObfuscatedName("jf.av(II)Z")
    public static boolean method4111(int arg0) {
        if (field3586.isEmpty()) {
            return false;
        } else {
            class343 var1 = (class343) field3586.get(0);
            return var1 != null && var1.field3717 == arg0;
        }
    }

    @ObfuscatedName("jj.ab(I)Z")
    public static boolean method4203() {
        return !field3586.isEmpty();
    }

    @ObfuscatedName("jh.ai(I)V")
    public static void method4218() {
        field3586.clear();
    }

    @ObfuscatedName("fw.ae(Ljava/util/ArrayList;ZI)V")
    public static void method2916(ArrayList arg0, boolean arg1) {
        if (!arg1) {
            field3586.clear();
        }
        Iterator var2 = arg0.iterator();
        while (var2.hasNext()) {
            class343 var3 = (class343) var2.next();
            if (var3.field3717 != -1 && var3.field3706 != -1) {
                if (!arg1) {
                    field3586.add(var3);
                }
                field3588.add(var3);
            }
        }
    }

    @ObfuscatedName("bg.au(IIIIB)V")
    public static void method472(int arg0, int arg1, int arg2, int arg3) {
        field3581 = arg0;
        field3590 = arg1;
        field3591 = arg2;
        field3587 = arg3;
    }

    @ObfuscatedName("dj.ah(I)Ljava/util/ArrayList;")
    public static ArrayList method2435() {
        ArrayList var0 = new ArrayList();
        Iterator var1 = field3585.iterator();
        while (var1.hasNext()) {
            class343 var2 = (class343) var1.next();
            var0.add(var2);
        }
        return var0;
    }

    @ObfuscatedName("gq.az(Ljava/util/ArrayList;IIIIB)V")
    public static void method3114(ArrayList arg0, int arg1, int arg2, int arg3, int arg4) {
        field3586.clear();
        field3586.addAll(arg0);
        method472(arg1, arg2, arg3, arg4);
    }
}
