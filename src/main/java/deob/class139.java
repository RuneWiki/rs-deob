package deob;

@ObfuscatedName("er")
public class class139 {

    @ObfuscatedName("er.w")
    public static int field1911 = 0;

    public class139() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ex.k(Lgh;Lgh;Lgh;Lex;I)Z")
    public static boolean method2430(class183 arg0, class183 arg1, class183 arg2, class140 arg3) {
        Statics.field1910 = arg0;
        Statics.field1912 = arg1;
        Statics.field1909 = arg2;
        Statics.field1907 = arg3;
        return true;
    }

    @ObfuscatedName("fy.y(Lgh;IIIZI)V")
    public static void method2715(class183 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1911 = 1;
        Statics.field11 = arg0;
        Statics.field1916 = arg1;
        Statics.field972 = arg2;
        Statics.field1632 = arg3;
        Statics.field1913 = arg4;
        Statics.field166 = 10000;
    }

    @ObfuscatedName("cn.o(I)V")
    public static void method1616() {
        Statics.field1907.method2314();
        field1911 = 1;
        Statics.field11 = null;
    }

    @ObfuscatedName("bt.r(ILgh;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method1329(int arg0, class183 arg1, String arg2, String arg3, int arg4, boolean arg5) {
        int var6 = arg1.method3076(arg2);
        int var7 = arg1.method3077(var6, arg3);
        method229(arg0, arg1, var6, var7, arg4, arg5);
    }

    @ObfuscatedName("m.w(ILgh;IIIZI)V")
    public static void method229(int arg0, class183 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1911 = 1;
        Statics.field11 = arg1;
        Statics.field1916 = arg2;
        Statics.field972 = arg3;
        Statics.field1632 = arg4;
        Statics.field1913 = arg5;
        Statics.field166 = arg0;
    }

    @ObfuscatedName("cb.j(II)V")
    public static void method1852(int arg0) {
        field1911 = 1;
        Statics.field11 = null;
        Statics.field1916 = -1;
        Statics.field972 = -1;
        Statics.field1632 = 0;
        Statics.field1913 = false;
        Statics.field166 = arg0;
    }
}
