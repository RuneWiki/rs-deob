package deob;

@ObfuscatedName("ai")
public class class42 implements Runnable {

    @ObfuscatedName("ai.s")
    public volatile class40[] field316 = new class40[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class40 var2 = this.field316[var1];
                if (var2 != null) {
                    var2.method698();
                }
            }
        } catch (Exception var4) {
            class468.method566((String) null, var4);
        }
    }
}
