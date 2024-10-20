package deob;

@ObfuscatedName("em")
public class class154 {

    @ObfuscatedName("em.e")
    public static int[] field2649 = new int[32];

    @ObfuscatedName("em.o")
    public static int[] field2648;

    @ObfuscatedName("em.y")
    public static int[] field2647;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field2649[var1] = var0 - 1;
            var0 += var0;
        }
        field2648 = new int[2000];
        field2647 = new int[2000];
    }

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.e(II)I")
    public static int method597(int arg0) {
        class42 var1 = class42.method74(arg0);
        int var2 = var1.field988;
        int var3 = var1.field991;
        int var4 = var1.field990;
        int var5 = field2649[var4 - var3];
        return field2647[var2] >> var3 & var5;
    }
}
