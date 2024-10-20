package deob;

@ObfuscatedName("ad")
public class class42 implements Runnable {

    @ObfuscatedName("ad.o")
    public volatile class40[] field317 = new class40[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class40 var2 = this.field317[var1];
                if (var2 != null) {
                    var2.method687();
                }
            }
        } catch (Exception var4) {
            class464.method5148((String) null, var4);
        }
    }
}
