package deob;

@ObfuscatedName("kh")
public class class291 {

    @ObfuscatedName("kh.c")
    public static char[] field3647 = new char[64];

    @ObfuscatedName("kh.t")
    public static char[] field3649;

    @ObfuscatedName("kh.o")
    public static char[] field3648;

    @ObfuscatedName("kh.e")
    public static int[] field3646;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3647[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3647[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3647[var2] = (char) (var2 + 48 - 52);
        }
        field3647[62] = '+';
        field3647[63] = '/';
        field3649 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field3649[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field3649[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field3649[var5] = (char) (var5 + 48 - 52);
        }
        field3649[62] = '*';
        field3649[63] = '-';
        field3648 = new char[64];
        for (int var6 = 0; var6 < 26; var6++) {
            field3648[var6] = (char) (var6 + 65);
        }
        for (int var7 = 26; var7 < 52; var7++) {
            field3648[var7] = (char) (var7 + 97 - 26);
        }
        for (int var8 = 52; var8 < 62; var8++) {
            field3648[var8] = (char) (var8 + 48 - 52);
        }
        field3648[62] = '-';
        field3648[63] = '_';
        field3646 = new int[128];
        for (int var9 = 0; var9 < field3646.length; var9++) {
            field3646[var9] = -1;
        }
        for (int var10 = 65; var10 <= 90; var10++) {
            field3646[var10] = var10 - 65;
        }
        for (int var11 = 97; var11 <= 122; var11++) {
            field3646[var11] = var11 - 97 + 26;
        }
        for (int var12 = 48; var12 <= 57; var12++) {
            field3646[var12] = var12 - 48 + 52;
        }
        int[] var13 = field3646;
        field3646[43] = 62;
        var13[42] = 62;
        int[] var14 = field3646;
        field3646[47] = 63;
        var14[45] = 63;
    }

    public class291() throws Throwable {
        throw new Error();
    }
}
