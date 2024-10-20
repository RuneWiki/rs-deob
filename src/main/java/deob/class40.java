package deob;

@ObfuscatedName("ar")
public class class40 implements Runnable {

    @ObfuscatedName("ar.i")
    public volatile class38[] field286 = new class38[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class38 var2 = this.field286[var1];
                if (var2 != null) {
                    var2.method710();
                }
            }
        } catch (Exception var4) {
            class425.method2652((String) null, var4);
        }
    }
}
