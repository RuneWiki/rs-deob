package deob;

@ObfuscatedName("tf")
public class class508 {

    @ObfuscatedName("tf.af")
    public static final class508 field5131 = new class508(0);

    @ObfuscatedName("tf.an")
    public static final class508 field5129 = new class508(1);

    @ObfuscatedName("tf.aw")
    public static final class508 field5130 = new class508(2);

    @ObfuscatedName("tf.ac")
    public final int field5132;

    public class508(int arg0) {
        this.field5132 = arg0;
    }

    @ObfuscatedName("pj.af(II)Ltf;")
    public static class508 method7082(int arg0) {
        class508[] var1 = new class508[] { field5131, field5130, field5129 };
        class508[] var2 = var1;
        for (int var3 = 0; var3 < var2.length; var3++) {
            class508 var4 = var2[var3];
            if (var4.field5132 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
