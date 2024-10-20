package deob;

@ObfuscatedName("cs")
public class class81 extends class440 {

    @ObfuscatedName("cs.f")
    public static class451 field1035 = new class451(32);

    @ObfuscatedName("cs.w")
    public int[] field1033 = new int[] { -1 };

    @ObfuscatedName("cs.v")
    public int[] field1032 = new int[] { 0 };

    @ObfuscatedName("i.f(III)I")
    public static int method44(int arg0, int arg1) {
        class81 var2 = (class81) field1035.method7706((long) arg0);
        if (var2 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var2.field1033.length) {
            return var2.field1033[arg1];
        } else {
            return -1;
        }
    }

    @ObfuscatedName("of.w(III)I")
    public static int method7213(int arg0, int arg1) {
        class81 var2 = (class81) field1035.method7706((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var2.field1032.length) {
            return var2.field1032[arg1];
        } else {
            return 0;
        }
    }

    @ObfuscatedName("js.v(III)I")
    public static int method5050(int arg0, int arg1) {
        class81 var2 = (class81) field1035.method7706((long) arg0);
        if (var2 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1032.length; var4++) {
                if (var2.field1033[var4] == arg1) {
                    var3 += var2.field1032[var4];
                }
            }
            return var3;
        }
    }

    @ObfuscatedName("mw.z(II)V")
    public static void method6101(int arg0) {
        class81 var1 = (class81) field1035.method7706((long) arg0);
        if (var1 != null) {
            for (int var2 = 0; var2 < var1.field1033.length; var2++) {
                var1.field1033[var2] = -1;
                var1.field1032[var2] = 0;
            }
        }
    }

    @ObfuscatedName("fp.j(II)V")
    public static void method3299(int arg0) {
        class81 var1 = (class81) field1035.method7706((long) arg0);
        if (var1 != null) {
            var1.method7431();
        }
    }

    @ObfuscatedName("lg.i(I)V")
    public static void method5888() {
        field1035 = new class451(32);
    }
}
