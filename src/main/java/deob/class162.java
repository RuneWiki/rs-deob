package deob;

@ObfuscatedName("fq")
public class class162 {

    @ObfuscatedName("fq.n")
    public static int field2720 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dg.p(Ler;Ler;Ler;Lfj;I)Z")
    public static boolean method2468(class147 arg0, class147 arg1, class147 arg2, class163 arg3) {
        Statics.field2718 = arg0;
        Statics.field1888 = arg1;
        Statics.field2719 = arg2;
        Statics.field697 = arg3;
        return true;
    }

    @ObfuscatedName("j.g(Ler;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method512(class147 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method2801(arg1);
        int var6 = arg0.method2802(var5, arg2);
        method2893(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("ex.x(Ler;IIIZI)V")
    public static void method2893(class147 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2720 = 1;
        Statics.field1897 = arg0;
        Statics.field1890 = arg1;
        Statics.field2413 = arg2;
        Statics.field74 = arg3;
        Statics.field1873 = arg4;
        Statics.field1432 = 10000;
    }

    @ObfuscatedName("n.c(IB)V")
    public static void method46(int arg0) {
        if (field2720 == 0) {
            Statics.field697.method3104(arg0);
        } else {
            Statics.field74 = arg0;
        }
    }

    @ObfuscatedName("et.n(ILer;IIIZI)V")
    public static void method2769(int arg0, class147 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2720 = 1;
        Statics.field1897 = arg1;
        Statics.field1890 = arg2;
        Statics.field2413 = arg3;
        Statics.field74 = arg4;
        Statics.field1873 = arg5;
        Statics.field1432 = arg0;
    }

    @ObfuscatedName("ds.s(B)Z")
    public static boolean method2517() {
        return field2720 == 0 ? Statics.field697.method3110() : true;
    }
}
