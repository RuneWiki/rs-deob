package deob;

@ObfuscatedName("ah")
public class class40 implements Runnable {

    @ObfuscatedName("ah.v")
    public volatile class38[] field311 = new class38[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class38 var2 = this.field311[var1];
                if (var2 != null) {
                    var2.method684();
                }
            }
        } catch (Exception var4) {
            class462.method5173((String) null, var4);
        }
    }
}
