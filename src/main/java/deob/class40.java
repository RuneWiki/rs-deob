package deob;

@ObfuscatedName("am")
public class class40 implements Runnable {

    @ObfuscatedName("am.n")
    public volatile class38[] field303 = new class38[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class38 var2 = this.field303[var1];
                if (var2 != null) {
                    var2.method702();
                }
            }
        } catch (Exception var4) {
            class424.method21((String) null, var4);
        }
    }
}
