package deob;

@ObfuscatedName("fu")
public class class176 {

    public class176() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ak.c(Lqq;Lpq;I)Lpq;")
    public static final class421 method643(class445 arg0, class421 arg1) {
        int var2 = arg0.method7196();
        if (arg1 == null) {
            int var3 = class273.method2989(var2);
            arg1 = new class421(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method7196() == 1;
            int var6 = arg0.method7340();
            class412 var7;
            if (var5) {
                var7 = new class408(arg0.method7206());
            } else {
                var7 = new class411(arg0.method7201());
            }
            arg1.method6918(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("fi.p(Lpq;IIB)I")
    public static int method3147(class421 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class411 var3 = (class411) arg0.method6917((long) arg1);
            return var3 == null ? arg2 : var3.field4503;
        }
    }
}
