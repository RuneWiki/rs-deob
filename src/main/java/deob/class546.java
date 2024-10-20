package deob;

@ObfuscatedName("un")
public class class546 {

    @ObfuscatedName("un.at")
    public static final class546 field5279 = new class546(0);

    @ObfuscatedName("un.ah")
    public static final class546 field5281 = new class546(1);

    @ObfuscatedName("un.ar")
    public static final class546 field5278 = new class546(2);

    @ObfuscatedName("un.ao")
    public final int field5280;

    @ObfuscatedName("dx.at(B)[Lun;")
    public static class546[] method2203() {
        return new class546[] { field5278, field5279, field5281 };
    }

    public class546(int arg0) {
        this.field5280 = arg0;
    }

    @ObfuscatedName("jv.ah(II)Lun;")
    public static class546 method4203(int arg0) {
        class546[] var1 = method2203();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class546 var3 = var1[var2];
            if (var3.field5280 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
