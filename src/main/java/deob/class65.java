package deob;

@ObfuscatedName("bu")
public class class65 extends class354 {

    @ObfuscatedName("bu.s")
    public static class364 field935 = new class364(32);

    @ObfuscatedName("bu.t")
    public int[] field931 = new int[] { -1 };

    @ObfuscatedName("bu.v")
    public int[] field932 = new int[] { 0 };

    @ObfuscatedName("ha.s(III)I")
    public static int method3888(int arg0, int arg1) {
        class65 var2 = (class65) field935.method5756((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field931.length) {
            return var2.field931[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("ip.v(III)I")
    public static int method4365(int arg0, int arg1) {
        class65 var2 = (class65) field935.method5756((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field932.length; var4++) {
                if (var2.field931[var4] == arg1) {
                    var3 += var2.field932[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("dk.l(IB)V")
    public static void method2117(int arg0) {
        class65 var1 = (class65) field935.method5756((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field931.length; var2++) {
                var1.field931[var2] = -1;
                var1.field932[var2] = 0;
            }
        }
    }
}
