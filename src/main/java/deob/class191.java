package deob;

@ObfuscatedName("hc")
public class class191 {

    public class191() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bx.at(Ltz;Lsv;I)Lsv;")
    public static final class476 method661(class501 arg0, class476 arg1) {
        int var2 = arg0.method8129();
        if (arg1 == null) {
            int var3 = class303.method2820(var2);
            arg1 = new class476(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8129() == 1;
            int var6 = arg0.method8133();
            class461 var7;
            if (var5) {
                var7 = new class458(arg0.method8253());
            } else {
                var7 = new class460(arg0.method8134());
            }
            arg1.method7857(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("gt.an(Lsv;ILjava/lang/String;B)Ljava/lang/String;")
    public static String method3094(class476 arg0, int arg1, String arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class458 var3 = (class458) arg0.method7848((long) arg1);
            return var3 == null ? arg2 : (String) var3.field4752;
        }
    }
}
