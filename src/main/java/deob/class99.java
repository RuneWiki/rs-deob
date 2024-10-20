package deob;

import java.util.HashMap;

@ObfuscatedName("cw")
public class class99 {

    static {
        new HashMap();
    }

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.k([Lcq;II)Lcq;")
    public static class101 method1850(class101[] arg0, int arg1) {
        class101[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class101 var4 = var2[var3];
            if (arg1 == var4.method444()) {
                return var4;
            }
        }
        return null;
    }
}
