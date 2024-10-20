package deob;

@ObfuscatedName("ac")
public class class40 implements Runnable {

    @ObfuscatedName("ac.l")
    public volatile class38[] field305 = new class38[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class38 var2 = this.field305[var1];
                if (var2 != null) {
                    var2.method704();
                }
            }
        } catch (Exception var4) {
            class425.method5430((String) null, var4);
        }
    }
}
