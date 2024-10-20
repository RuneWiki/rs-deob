package deob;

@ObfuscatedName("ly")
public class class298 {

    @ObfuscatedName("ly.au")
    public static int field3389 = 0;

    public class298() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ho.af(Lnm;Lnm;Lnm;Lln;I)Z")
    public static boolean method3582(class344 arg0, class344 arg1, class344 arg2, class299 arg3) {
        Statics.field3385 = arg0;
        Statics.field3386 = arg1;
        Statics.field3387 = arg2;
        Statics.field4942 = arg3;
        return true;
    }

    @ObfuscatedName("cq.aw(Lnm;IIIZI)V")
    public static void method1130(class344 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3389 = 1;
        Statics.field3388 = arg0;
        Statics.field4411 = arg1;
        Statics.field1913 = arg2;
        Statics.field1324 = arg3;
        Statics.field1459 = arg4;
        Statics.field1789 = 10000;
    }

    @ObfuscatedName("ii.ac(II)V")
    public static void method4161(int arg0) {
        if (field3389 == 0) {
            Statics.field4942.method5212(arg0);
        } else {
            Statics.field1324 = arg0;
        }
    }

    @ObfuscatedName("hr.au(I)V")
    public static void method3547() {
        Statics.field4942.method5218();
        field3389 = 1;
        Statics.field3388 = null;
    }

    @ObfuscatedName("ks.ab(ILnm;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method5132(int arg0, class344 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        if (arg1.method6088(arg2, arg3)) {
            int var6 = arg1.method6086(arg2);
            int var7 = arg1.method6075(var6, arg3);
            method2277(arg0, arg1, var6, var7, arg4, arg5);
        }
    }

    @ObfuscatedName("de.aq(ILnm;IIIZI)V")
    public static void method2277(int arg0, class344 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3389 = 1;
        Statics.field3388 = arg1;
        Statics.field4411 = arg2;
        Statics.field1913 = arg3;
        Statics.field1324 = arg4;
        Statics.field1459 = arg5;
        Statics.field1789 = arg0;
    }
}
