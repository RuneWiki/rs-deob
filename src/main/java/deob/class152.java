package deob;

@ObfuscatedName("ev")
public class class152 {

    @ObfuscatedName("ev.e")
    public static char[] field2492 = new char[64];

    @ObfuscatedName("ev.a")
    public static char[] field2489;

    @ObfuscatedName("ev.l")
    public static int[] field2490;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field2492[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field2492[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field2492[var2] = (char) (var2 + 48 - 52);
        }
        field2492[62] = '+';
        field2492[63] = '/';
        field2489 = new char[64];
        for (int var3 = 0; var3 < 26; var3++) {
            field2489[var3] = (char) (var3 + 65);
        }
        for (int var4 = 26; var4 < 52; var4++) {
            field2489[var4] = (char) (var4 + 97 - 26);
        }
        for (int var5 = 52; var5 < 62; var5++) {
            field2489[var5] = (char) (var5 + 48 - 52);
        }
        field2489[62] = '*';
        field2489[63] = '-';
        field2490 = new int[128];
        for (int var6 = 0; var6 < field2490.length; var6++) {
            field2490[var6] = -1;
        }
        for (int var7 = 65; var7 <= 90; var7++) {
            field2490[var7] = var7 - 65;
        }
        for (int var8 = 97; var8 <= 122; var8++) {
            field2490[var8] = var8 - 97 + 26;
        }
        for (int var9 = 48; var9 <= 57; var9++) {
            field2490[var9] = var9 - 48 + 52;
        }
        int[] var10 = field2490;
        field2490[43] = 62;
        var10[42] = 62;
        int[] var11 = field2490;
        field2490[47] = 63;
        var11[45] = 63;
    }

    public class152() throws Throwable {
        throw new Error();
    }
}
