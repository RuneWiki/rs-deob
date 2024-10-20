package deob;

@ObfuscatedName("en")
public class class137 {

    @ObfuscatedName("en.t")
    public static final class137 field2349 = new class137(0);

    @ObfuscatedName("en.l")
    public static final class137 field2347 = new class137(1);

    @ObfuscatedName("en.c")
    public static final class137 field2351 = new class137(2);

    @ObfuscatedName("en.d")
    public final int field2348;

    public class137(int arg0) {
        this.field2348 = arg0;
    }

    @ObfuscatedName("ac.l(II)Len;")
    public static class137 method842(int arg0) {
        class137[] var1 = Statics.method7();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class137 var3 = var1[var2];
            if (var3.field2348 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
