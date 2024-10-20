package deob;

@ObfuscatedName("ub")
public class class534 {

    @ObfuscatedName("ub.au")
    public static final class534 field5249 = new class534(0);

    @ObfuscatedName("ub.ae")
    public static final class534 field5248 = new class534(1);

    @ObfuscatedName("ub.ao")
    public static final class534 field5246 = new class534(2);

    @ObfuscatedName("ub.at")
    public final int field5247;

    @ObfuscatedName("qy.au(B)[Lub;")
    public static class534[] method7392() {
        return new class534[] { field5249, field5246, field5248 };
    }

    public class534(int arg0) {
        this.field5247 = arg0;
    }

    @ObfuscatedName("aj.ae(II)Lub;")
    public static class534 method311(int arg0) {
        class534[] var1 = method7392();
        for (int var2 = 0; var2 < var1.length; var2++) {
            class534 var3 = var1[var2];
            if (var3.field5247 == arg0) {
                return var3;
            }
        }
        return null;
    }
}
