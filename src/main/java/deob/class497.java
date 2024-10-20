package deob;

@ObfuscatedName("tg")
public class class497 {

    @ObfuscatedName("tg.aj")
    public static final class497 field5038 = new class497(0);

    @ObfuscatedName("tg.al")
    public static final class497 field5041 = new class497(1);

    @ObfuscatedName("tg.ac")
    public static final class497 field5040 = new class497(2);

    @ObfuscatedName("tg.ab")
    public final int field5039;

    public class497(int arg0) {
        this.field5039 = arg0;
    }

    @ObfuscatedName("gt.aj(II)Ltg;")
    public static class497 method3230(int arg0) {
        class497[] var1 = new class497[] { field5041, field5038, field5040 };
        class497[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class497 var4 = var2[var3];
            if (var4.field5039 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
