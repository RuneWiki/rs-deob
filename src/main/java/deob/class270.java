package deob;

@ObfuscatedName("jf")
public class class270 {

    public class270() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ds.b(Lgn;Lgv;I)Lgv;")
    public static final class207 method2485(class194 arg0, class207 arg1) {
        int var2 = arg0.method3247();
        if (arg1 == null) {
            int var3 = class198.method2924(var2);
            arg1 = new class207(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method3247() == 1;
            int var6 = arg0.method3251();
            class213 var7;
            if (var5) {
                var7 = new class206(arg0.method3256());
            } else {
                var7 = new class219(arg0.method3261());
            }
            arg1.method3636(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("br.q(Lgv;ILjava/lang/String;S)Ljava/lang/String;")
    public static String method941(class207 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class206 var3 = (class206) arg0.method3632((long) arg1);
            return var3 == null ? arg2 : (String) var3.field2589;
        }
    }
}
