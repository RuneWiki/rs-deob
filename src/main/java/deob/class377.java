package deob;

@ObfuscatedName("oj")
public class class377 {

    @ObfuscatedName("oj.ac")
    public static final class377 field4088 = new class377("LIVE", 0);

    @ObfuscatedName("oj.ae")
    public static final class377 field4087 = new class377("BUILDLIVE", 3);

    @ObfuscatedName("oj.ag")
    public static final class377 field4089 = new class377("RC", 1);

    @ObfuscatedName("oj.am")
    public static final class377 field4090 = new class377("WIP", 2);

    @ObfuscatedName("oj.ax")
    public final String field4091;

    @ObfuscatedName("oj.aq")
    public final int field4092;

    public class377(String arg0, int arg1) {
        this.field4091 = arg0;
        this.field4092 = arg1;
    }

    @ObfuscatedName("ei.ac(II)Loj;")
    public static class377 method2875(int arg0) {
        class377[] var1 = new class377[] { field4089, field4090, field4088, field4087 };
        class377[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class377 var4 = var2[var3];
            if (var4.field4092 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
