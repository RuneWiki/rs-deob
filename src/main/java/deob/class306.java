package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@ObfuscatedName("lz")
public class class306 {

    @ObfuscatedName("lz.at")
    public static ArrayList field3403 = null;

    @ObfuscatedName("lz.ac")
    public static LinkedList field3412 = new LinkedList();

    @ObfuscatedName("lz.ai")
    public static ArrayList field3405 = new ArrayList(3);

    @ObfuscatedName("lz.az")
    public static ArrayList field3406 = new ArrayList(3);

    @ObfuscatedName("lz.ap")
    public static ArrayList field3407 = new ArrayList();

    @ObfuscatedName("lz.aa")
    public static final List field3408 = new ArrayList();

    @ObfuscatedName("lz.af")
    public static int field3409 = 0;

    @ObfuscatedName("lz.ad")
    public static int field3410 = 0;

    @ObfuscatedName("lz.aq")
    public static int field3411 = 0;

    @ObfuscatedName("lz.al")
    public static int field3402 = 0;

    public class306() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("he.au(Llb;I)V")
    public static void method3396(class312 arg0) {
        field3408.remove(arg0);
    }

    @ObfuscatedName("cf.ae(Ljava/util/ArrayList;IIIIZI)V")
    public static void method1037(ArrayList arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg0.isEmpty()) {
            return;
        }
        field3412.clear();
        field3407.clear();
        method3497(arg5);
        Statics.method5053(arg0, arg5);
        if (field3412.isEmpty()) {
            return;
        }
        method5052(arg1, arg2, arg3, arg4);
        field3407.add(new class400((class407) null));
        field3407.add(new class409((class407) null, Statics.field3400, Statics.field3401, Statics.field3404));
        ArrayList var6 = new ArrayList();
        var6.add(new class404(new class406((class407) null, 0, true, field3402)));
        if (field3405.isEmpty()) {
            field3407.add(new class403((class407) null, field3411));
            field3407.add(new class408((class407) null, var6));
            return;
        }
        ArrayList var7 = new ArrayList();
        var7.add(new class403(new class408((class407) null, var6), field3411));
        ArrayList var8 = new ArrayList();
        Iterator var9 = field3405.iterator();
        while (var9.hasNext()) {
            class318 var10 = (class318) var9.next();
            var8.add(var10);
        }
        var7.add(new class403(new class405(new class402((class407) null, var8), 0, false, field3410), field3409));
        field3407.add(new class408((class407) null, var7));
    }

    @ObfuscatedName("lc.ao(IB)V")
    public static void method5212(int arg0) {
        if (field3405.isEmpty()) {
            return;
        }
        Iterator var1 = field3405.iterator();
        while (var1.hasNext()) {
            class318 var2 = (class318) var1.next();
            if (var2 != null) {
                var2.field3514 = arg0;
            }
        }
        class318 var3 = (class318) field3405.get(0);
        if (var3 != null && var3.field3518 != null && var3.field3518.method5334() && !var3.field3525) {
            var3.field3518.method5272(arg0);
            var3.field3511 = (float) arg0;
        }
    }

    @ObfuscatedName("dh.at(IIB)V")
    public static void method2092(int arg0, int arg1) {
        method5052(arg0, arg1, 0, 0);
        field3406.clear();
        field3407.clear();
        if (field3405.isEmpty() || arg0 == 0 && arg1 == 0) {
            method7050();
            return;
        }
        field3407.add(new class403((class407) null, field3409));
        field3407.add(new class405((class407) null, 0, false, field3410));
        ArrayList var2 = new ArrayList();
        Iterator var3 = field3405.iterator();
        while (var3.hasNext()) {
            class318 var4 = (class318) var3.next();
            var2.add(var4);
        }
        field3407.add(new class402((class407) null, var2));
    }

    @ObfuscatedName("er.ac(IIIIB)V")
    public static void method2684(int arg0, int arg1, int arg2, int arg3) {
        if (field3405.size() <= 1 || field3405.get(0) == null || !((class318) field3405.get(0)).field3518.method5334() || field3405.get(1) == null || !((class318) field3405.get(1)).field3518.method5334()) {
            return;
        }
        method5052(arg0, arg1, arg2, arg3);
        field3407.add(new class401((class407) null));
        ArrayList var4 = new ArrayList();
        var4.add(new class403(new class406((class407) null, 1, false, field3402), field3411));
        var4.add(new class403(new class405((class407) null, 0, false, field3410), field3409));
        field3407.add(new class408((class407) null, var4));
        if (field3406.get(0) != null && field3406.get(1) != null) {
            class318 var5 = (class318) field3406.get(0);
            field3406.set(0, field3405.get(1));
            field3406.set(1, var5);
        }
    }

    @ObfuscatedName("gy.ai(II)Z")
    public static boolean method3217(int arg0) {
        if (field3406.isEmpty()) {
            return false;
        } else {
            class318 var1 = (class318) field3406.get(0);
            return var1 != null && var1.field3512 == arg0;
        }
    }

    @ObfuscatedName("jf.ap(B)Z")
    public static boolean method4783() {
        boolean var0 = false;
        boolean var1 = false;
        if (!field3407.isEmpty()) {
            class407 var2 = (class407) field3407.get(0);
            if (var2 == null) {
                field3407.remove(0);
            } else if (var2.method6976()) {
                if (var2.method6984()) {
                    System.out.println("Error in midimanager.service: " + var2.method6983());
                    var0 = true;
                } else {
                    if (var2.method6985() != null) {
                        field3407.add(1, var2.method6985());
                    }
                    var1 = var2.method6988();
                }
                field3407.remove(0);
            } else {
                var1 = var2.method6988();
            }
        }
        if (var0) {
            field3407.clear();
            method7050();
        }
        return var1;
    }

    @ObfuscatedName("ka.af(IIIII)V")
    public static void method5052(int arg0, int arg1, int arg2, int arg3) {
        field3409 = arg0;
        field3410 = arg1;
        field3411 = arg2;
        field3402 = arg3;
    }

    @ObfuscatedName("pb.ad(B)V")
    public static void method7050() {
        Iterator var0 = field3405.iterator();
        while (true) {
            class318 var1;
            do {
                if (!var0.hasNext()) {
                    field3405.clear();
                    return;
                }
                var1 = (class318) var0.next();
            } while (var1 == null);
            var1.field3518.method5374();
            var1.field3518.method5355();
            var1.field3518.method5272(0);
            var1.field3518.field3444 = 0;
            int var2 = var1.field3512;
            int var3 = var1.field3513;
            Iterator var4 = field3408.iterator();
            while (var4.hasNext()) {
                class312 var5 = (class312) var4.next();
                var5.method1684(var2, var3);
            }
        }
    }

    @ObfuscatedName("hf.aq(ZB)V")
    public static void method3497(boolean arg0) {
        if (arg0) {
            method7050();
            return;
        }
        for (int var1 = 0; var1 < field3405.size(); var1++) {
            class318 var2 = (class318) field3405.get(var1);
            if (var2 == null) {
                field3405.remove(var1);
                var1--;
            } else if (var2.field3520) {
                if (var2.field3518.field3444 > 0) {
                    var2.field3518.field3444--;
                }
                var2.field3518.method5374();
                var2.field3518.method5355();
                var2.field3518.method5272(0);
                field3405.remove(var1);
                var1--;
            } else {
                var2.field3520 = true;
            }
        }
    }
}
