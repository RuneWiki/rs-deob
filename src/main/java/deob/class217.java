package deob;

@ObfuscatedName("hw")
public class class217 {

    @ObfuscatedName("hw.q")
    public static final class217 field3181 = new class217(0);

    @ObfuscatedName("hw.d")
    public static final class217 field3180 = new class217(1);

    @ObfuscatedName("hw.h")
    public static final class217 field3183 = new class217(2);

    @ObfuscatedName("hw.p")
    public final int field3182;

    public class217(int arg0) {
        this.field3182 = arg0;
    }

    @ObfuscatedName("da.q(II)Lhw;")
    public static class217 method2128(int arg0) {
        class217[] var1 = new class217[] { field3183, field3180, field3181 };
        class217[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class217 var4 = var2[var3];
            if (var4.field3182 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
