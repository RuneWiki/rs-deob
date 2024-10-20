package deob;

@ObfuscatedName("br")
public class class45 implements Runnable {

    @ObfuscatedName("br.ac")
    public volatile class43[] field298 = new class43[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class43 var2 = this.field298[var1];
                if (var2 != null) {
                    var2.method783();
                }
            }
        } catch (Exception var4) {
            class577.method3409((String) null, var4);
        }
    }
}
