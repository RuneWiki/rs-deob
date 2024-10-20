package deob;

@ObfuscatedName("ba")
public class class56 implements Runnable {

    @ObfuscatedName("ba.i")
    public class75 field1190;

    @ObfuscatedName("ba.b")
    public volatile class53[] field1187 = new class53[2];

    @ObfuscatedName("ba.r")
    public volatile boolean field1188 = false;

    @ObfuscatedName("ba.l")
    public volatile boolean field1189 = false;

    public void run() {
        this.field1189 = true;
        try {
            while (!this.field1188) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class53 var2 = this.field1187[var1];
                    if (var2 != null) {
                        var2.method1153();
                    }
                }
                class127.method1642(10L);
                class70.method53(this.field1190, (Object) null);
            }
        } catch (Exception var7) {
            class81.method3159((String) null, var7);
        } finally {
            this.field1189 = false;
        }
    }
}
