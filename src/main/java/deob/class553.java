package deob;

@ObfuscatedName("vi")
public class class553 {

    @ObfuscatedName("vi.aq")
    public static final class553 field5341 = new class553(0);

    @ObfuscatedName("vi.aw")
    public static final class553 field5344 = new class553(1);

    @ObfuscatedName("vi.al")
    public static final class553 field5342 = new class553(2);

    @ObfuscatedName("vi.ai")
    public final int field5343;

    public class553(int arg0) {
        this.field5343 = arg0;
    }

    @ObfuscatedName("gi.aq(II)Lvi;")
    public static class553 method3237(int arg0) {
        class553[] var1 = new class553[] { field5342, field5344, field5341 };
        class553[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class553 var4 = var2[var3];
            if (var4.field5343 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
