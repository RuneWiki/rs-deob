package deob;

import java.util.HashMap;

@ObfuscatedName("gc")
public class class205 {

    static {
        new HashMap();
    }

    public class205() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.n([Lgh;II)Lgh;")
    public static class204 method1123(class204[] arg0, int arg1) {
        class204[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class204 var4 = var2[var3];
            if (arg1 == var4.method30()) {
                return var4;
            }
        }
        return null;
    }
}
