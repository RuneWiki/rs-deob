package deob;

@ObfuscatedName("er")
public class class138 {

    @ObfuscatedName("er.b")
    public static final class138 field2343 = new class138(0);

    @ObfuscatedName("er.e")
    public static final class138 field2342 = new class138(1);

    @ObfuscatedName("er.g")
    public static final class138 field2341 = new class138(2);

    @ObfuscatedName("er.o")
    public final int field2344;

    public class138(int arg0) {
        this.field2344 = arg0;
    }

    @ObfuscatedName("be.b(II)Ler;")
    public static class138 method1345(int arg0) {
        class138[] var1 = new class138[] { field2342, field2343, field2341 };
        class138[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class138 var4 = var2[var3];
            if (var4.field2344 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
