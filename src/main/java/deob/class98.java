package deob;

@ObfuscatedName("ch")
public class class98 implements Runnable {

    @ObfuscatedName("ch.w")
    public volatile class96[] field1356 = new class96[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class96 var2 = this.field1356[var1];
                if (var2 != null) {
                    var2.method2041();
                }
            }
        } catch (Exception var4) {
            class153.method695((String) null, var4);
        }
    }
}
