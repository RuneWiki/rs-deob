package deob;

@ObfuscatedName("fy")
public final class class182 {

    public class182() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ap.i(Ljava/lang/CharSequence;I)I")
    public static int method651(CharSequence arg0) {
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
