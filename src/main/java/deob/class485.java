package deob;

import java.util.Iterator;

@ObfuscatedName("sc")
public class class485 {

    public class485() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ib.ap(ILdy;I)Ldn;")
    public static class104 method4344(int arg0, class98 arg1) {
        Iterator var2 = arg1.iterator();
        class104 var3;
        do {
            if (!var2.hasNext()) {
                return arg1.method2576();
            }
            var3 = (class104) var2.next();
        } while (var3.field1357[arg0] == null || var3.field1354 == -1);
        return var3;
    }

    @ObfuscatedName("qk.aw(ILdy;I)Ldn;")
    public static class104 method7424(int arg0, class98 arg1) {
        Iterator var2 = arg1.iterator();
        class104 var3;
        do {
            if (!var2.hasNext()) {
                return arg1.method2576();
            }
            var3 = (class104) var2.next();
        } while (var3.field1353[arg0] == null);
        return var3;
    }
}
