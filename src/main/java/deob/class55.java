package deob;

@ObfuscatedName("bi")
public class class55 implements Runnable {

    @ObfuscatedName("bi.f")
    public volatile class53[] field437 = new class53[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class53 var2 = this.field437[var1];
                if (var2 != null) {
                    var2.method684();
                }
            }
        } catch (Exception var4) {
            class407.method5131((String) null, var4);
        }
    }
}
