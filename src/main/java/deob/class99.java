package deob;

import java.util.HashMap;

@ObfuscatedName("cd")
public class class99 {

    static {
        new HashMap();
    }

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.t([Lce;II)Lce;")
    public static class101 method801(class101[] arg0, int arg1) {
        class101[] var2 = arg0;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class101 var4 = var2[var3];
            if (arg1 == var4.method451()) {
                return var4;
            }
        }
        return null;
    }
}
