package deob;

@ObfuscatedName("on")
public final class class394 {

    public class394() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ii.n(Ljava/lang/CharSequence;I)I")
    public static int method4438(CharSequence arg0) {
        int var1 = arg0.length();
        int var2 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            char var4 = arg0.charAt(var3);
            if (var4 <= 127) {
                var2++;
            } else if (var4 <= 2047) {
                var2 += 2;
            } else {
                var2 += 3;
            }
        }
        return var2;
    }
}
