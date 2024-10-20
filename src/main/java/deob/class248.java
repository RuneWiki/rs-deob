package deob;

@ObfuscatedName("iw")
public class class248 {

    public class248() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.z(Lkl;Llb;I)Llb;")
    public static final class316 method3085(class300 arg0, class316 arg1) {
        int var2 = arg0.method4990();
        if (arg1 == null) {
            int var3 = class189.method4527(var2);
            arg1 = new class316(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method4990() == 1;
            int var6 = arg0.method4994();
            class181 var7;
            if (var5) {
                var7 = new class177(arg0.method4999());
            } else {
                var7 = new class180(arg0.method5085());
            }
            arg1.method5363(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("cw.v(Llb;ILjava/lang/String;I)Ljava/lang/String;")
    public static String method2060(class316 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class177 var3 = (class177) arg0.method5362((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2088;
        }
    }
}
