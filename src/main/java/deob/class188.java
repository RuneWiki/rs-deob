package deob;

@ObfuscatedName("hi")
public class class188 {

    public class188() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gu.ac(Lvf;Lui;I)Lui;")
    public static final class523 method3374(class551 arg0, class523 arg1) {
        int var2 = arg0.method8955();
        if (arg1 == null) {
            int var3 = class333.method44(var2);
            arg1 = new class523(var3);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            boolean var5 = arg0.method8955() == 1;
            int var6 = arg0.method8978();
            class508 var7;
            if (var5) {
                var7 = new class505(arg0.method9166());
            } else {
                var7 = new class507(arg0.method9110());
            }
            arg1.method8663(var7, (long) var6);
        }
        return arg1;
    }

    @ObfuscatedName("bh.ae(Lui;III)I")
    public static int method414(class523 arg0, int arg1, int arg2) {
        if (arg0 == null) {
            return arg2;
        } else {
            class507 var3 = (class507) arg0.method8666((long) arg1);
            return var3 == null ? arg2 : var3.field5120;
        }
    }
}
