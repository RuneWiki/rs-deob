package deob;

@ObfuscatedName("ev")
public class class137 {

    @ObfuscatedName("ev.d")
    public static final class137 field2325 = new class137(0);

    @ObfuscatedName("ev.g")
    public static final class137 field2335 = new class137(1);

    @ObfuscatedName("ev.a")
    public static final class137 field2326 = new class137(2);

    @ObfuscatedName("ev.t")
    public final int field2332;

    public class137(int arg0) {
        this.field2332 = arg0;
    }

    @ObfuscatedName("m.d(II)Lev;")
    public static class137 method105(int arg0) {
        class137[] var1 = new class137[] { field2335, field2326, field2325 };
        class137[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class137 var4 = var2[var3];
            if (var4.field2332 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
