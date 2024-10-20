package deob;

@ObfuscatedName("gx")
public class class207 {

    @ObfuscatedName("gx.z")
    public static int field2435 = 0;

    public class207() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dr.f(Liw;Liw;Liw;Lgv;I)Z")
    public static boolean method2644(class245 arg0, class245 arg1, class245 arg2, class208 arg3) {
        Statics.field2431 = arg0;
        Statics.field2430 = arg1;
        Statics.field2432 = arg2;
        Statics.field54 = arg3;
        return true;
    }

    @ObfuscatedName("bj.b(Liw;IIIZB)V")
    public static void method793(class245 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2435 = 1;
        Statics.field126 = arg0;
        Statics.field1272 = arg1;
        Statics.field2433 = arg2;
        Statics.field2434 = arg3;
        Statics.field2366 = arg4;
        Statics.field2512 = 10000;
    }

    @ObfuscatedName("ko.l(II)V")
    public static void method5008(int arg0) {
        if (field2435 == 0) {
            Statics.field54.method3517(arg0);
        } else {
            Statics.field2434 = arg0;
        }
    }

    @ObfuscatedName("fk.m(I)V")
    public static void method3250() {
        Statics.field54.method3523();
        field2435 = 1;
        Statics.field126 = null;
    }

    @ObfuscatedName("ep.z(II)V")
    public static void method2868(int arg0) {
        field2435 = 1;
        Statics.field126 = null;
        Statics.field1272 = -1;
        Statics.field2433 = -1;
        Statics.field2434 = 0;
        Statics.field2366 = false;
        Statics.field2512 = arg0;
    }

    @ObfuscatedName("bl.q(I)Z")
    public static boolean method798() {
        return field2435 == 0 ? Statics.field54.method3524() : true;
    }

    @ObfuscatedName("s.k(B)Z")
    public static boolean method142() {
        try {
            if (field2435 == 2) {
                if (Statics.field598 == null) {
                    Statics.field598 = class213.method3694(Statics.field126, Statics.field1272, Statics.field2433);
                    if (Statics.field598 == null) {
                        return false;
                    }
                }
                if (Statics.field4063 == null) {
                    Statics.field4063 = new class118(Statics.field2432, Statics.field2430);
                }
                if (Statics.field54.method3531(Statics.field598, Statics.field2431, Statics.field4063, 22050)) {
                    Statics.field54.method3520();
                    Statics.field54.method3517(Statics.field2434);
                    Statics.field54.method3550(Statics.field598, Statics.field2366);
                    field2435 = 0;
                    Statics.field598 = null;
                    Statics.field4063 = null;
                    Statics.field126 = null;
                    return true;
                }
            }
        } catch (Exception var1) {
            var1.printStackTrace();
            Statics.field54.method3523();
            field2435 = 0;
            Statics.field598 = null;
            Statics.field4063 = null;
            Statics.field126 = null;
        }
        return false;
    }
}
