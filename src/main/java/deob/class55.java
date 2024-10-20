package deob;

@ObfuscatedName("bq")
public class class55 implements Runnable {

    @ObfuscatedName("bq.v")
    public volatile class53[] field463 = new class53[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class53 var2 = this.field463[var1];
                if (var2 != null) {
                    var2.method633();
                }
            }
        } catch (Exception var4) {
            class406.method4407((String) null, var4);
        }
    }
}
