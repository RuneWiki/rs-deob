package deob;

@ObfuscatedName("er")
public class class137 {

    @ObfuscatedName("er.x")
    public static int field2312 = 0;

    public class137() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.c(Lew;IIIZB)V")
    public static void method2564(class150 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2312 = 1;
        Statics.field2318 = arg0;
        Statics.field2426 = arg1;
        Statics.field253 = arg2;
        Statics.field2320 = arg3;
        Statics.field2315 = arg4;
        Statics.field1242 = 10000;
    }

    @ObfuscatedName("ao.j(ILew;IIIZB)V")
    public static void method549(int arg0, class150 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2312 = 1;
        Statics.field2318 = arg1;
        Statics.field2426 = arg2;
        Statics.field253 = arg3;
        Statics.field2320 = arg4;
        Statics.field2315 = arg5;
        Statics.field1242 = arg0;
    }

    @ObfuscatedName("bt.f(I)Z")
    public static boolean method1190() {
        return field2312 == 0 ? Statics.field2012.method2611() : true;
    }
}
