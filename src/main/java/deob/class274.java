package deob;

@ObfuscatedName("jj")
public class class274 {

    @ObfuscatedName("jj.b")
    public static int field3169 = 0;

    public class274() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hz.v(Lln;Lln;Lln;Lji;I)Z")
    public static boolean method3927(class316 arg0, class316 arg1, class316 arg2, class275 arg3) {
        Statics.field3173 = arg0;
        Statics.field3176 = arg1;
        Statics.field3170 = arg2;
        Statics.field3172 = arg3;
        return true;
    }

    @ObfuscatedName("ji.c(Lln;Ljava/lang/String;Ljava/lang/String;IZI)V")
    public static void method4841(class316 arg0, String arg1, String arg2, int arg3, boolean arg4) {
        int var5 = arg0.method5293(arg1);
        int var6 = arg0.method5312(var5, arg2);
        method261(arg0, var5, var6, arg3, arg4);
    }

    @ObfuscatedName("g.i(Lln;IIIZB)V")
    public static void method261(class316 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3169 = 1;
        Statics.field3174 = arg0;
        Statics.field4568 = arg1;
        Statics.field3175 = arg2;
        Statics.field3171 = arg3;
        Statics.field87 = arg4;
        Statics.field3177 = 10000;
    }

    @ObfuscatedName("ft.f(ILln;IIIZB)V")
    public static void method3196(int arg0, class316 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3169 = 1;
        Statics.field3174 = arg1;
        Statics.field4568 = arg2;
        Statics.field3175 = arg3;
        Statics.field3171 = arg4;
        Statics.field87 = arg5;
        Statics.field3177 = arg0;
    }

    @ObfuscatedName("kh.n(I)Z")
    public static boolean method5230() {
        return field3169 == 0 ? Statics.field3172.method4735() : true;
    }
}
