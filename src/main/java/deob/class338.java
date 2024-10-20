package deob;

import java.util.Arrays;

@ObfuscatedName("mp")
public class class338 {

    @ObfuscatedName("mp.aq")
    public static int[] field3617 = new int[32];

    @ObfuscatedName("mp.al")
    public static int[] field3618;

    @ObfuscatedName("mp.ai")
    public static int[] field3620;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3617[var1] = var0 - 1;
            var0 += var0;
        }
        field3618 = new int[5000];
        field3620 = new int[5000];
    }

    public class338() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("mv.aq(II)I")
    public static int method5735(int arg0) {
        class198 var1 = (class198) class198.field2067.method5414((long) arg0);
        class198 var2;
        if (var1 == null) {
            byte[] var3 = Statics.field2063.method6489(14, arg0);
            class198 var4 = new class198();
            if (var3 != null) {
                var4.method3485(new class534(var3));
            }
            class198.field2067.method5421(var4, (long) arg0);
            var2 = var4;
        } else {
            var2 = var1;
        }
        int var6 = var2.field2060;
        int var7 = var2.field2061;
        int var8 = var2.field2064;
        int var9 = field3617[var8 - var7];
        return field3620[var6] >> var7 & var9;
    }

    @ObfuscatedName("ig.al(I)V")
    public static void method3871() {
        Arrays.fill(field3618, 0);
        Arrays.fill(field3620, 0);
    }
}
