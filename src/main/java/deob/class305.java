package deob;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

@ObfuscatedName("ly")
public class class305 {

    @ObfuscatedName("ly.ax")
    public static int field3390 = 0;

    @ObfuscatedName("ly.ad")
    public static AtomicBoolean field3393 = null;

    @ObfuscatedName("ly.ac")
    public static ThreadPoolExecutor field3394 = null;

    @ObfuscatedName("ly.ag")
    public static int field3386 = -1;

    @ObfuscatedName("ly.ar")
    public static int field3396 = -1;

    @ObfuscatedName("ly.ah")
    public static final List field3389 = new ArrayList();

    public class305() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hx.at(Lmr;S)V")
    public static void method3620(class313 arg0) {
        field3389.remove(arg0);
    }

    @ObfuscatedName("po.an(IIB)V")
    public static void method7032(int arg0, int arg1) {
        Iterator var2 = field3389.iterator();
        while (var2.hasNext()) {
            class313 var3 = (class313) var2.next();
            var3.method1143(arg0, arg1);
        }
    }

    @ObfuscatedName("lp.as(ILnq;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method5149(int arg0, class357 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        if (!arg1.method6099(arg2, arg3)) {
            return;
        }
        int var6 = arg1.method6097(arg2);
        int var7 = arg1.method6098(var6, arg3);
        field3390 = 1;
        Statics.field1437 = arg1;
        Statics.field2103 = var6;
        Statics.field3395 = var7;
        Statics.field3385 = arg4;
        Statics.field1566 = arg5;
        Statics.field1735 = arg0;
    }

    @ObfuscatedName("ju.ax(I)Z")
    public static boolean method4692() {
        try {
            if (field3390 == 2) {
                if (Statics.field2683 == null) {
                    Statics.field2683 = class315.method5372(Statics.field1437, Statics.field2103, Statics.field3395);
                    if (Statics.field2683 == null) {
                        return false;
                    }
                }
                if (Statics.field3392 == null) {
                    Statics.field3392 = new class46(Statics.field3387, Statics.field3391);
                }
                if (Statics.field3388.method5258(Statics.field2683, Statics.field3397, Statics.field3392)) {
                    Statics.field3388.method5209();
                    Statics.field3388.method5206(Statics.field3385);
                    Statics.field3388.method5211(Statics.field2683, Statics.field1566);
                    PriorityQueue var0 = Statics.field3388.field3420;
                    if (var0 != null) {
                        if (field3393 != null) {
                            field3393.set(true);
                        }
                        field3393 = new AtomicBoolean(false);
                        AtomicBoolean var1 = field3393;
                        if (field3394 == null) {
                            int var2 = Runtime.getRuntime().availableProcessors();
                            field3394 = new ThreadPoolExecutor(0, var2, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new class306());
                        }
                        field3394.submit(new class310(var0, var1));
                    }
                    field3386 = Statics.field2103;
                    field3396 = Statics.field3395;
                    field3390 = 0;
                    Statics.field2683 = null;
                    Statics.field3392 = null;
                    Statics.field1437 = null;
                    return true;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            Statics.field3388.method5212();
            field3390 = 0;
            Statics.field2683 = null;
            Statics.field3392 = null;
            Statics.field1437 = null;
        }
        return false;
    }
}
