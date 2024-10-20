package deob;

@ObfuscatedName("ag")
public class class42 implements Runnable {

    @ObfuscatedName("ag.c")
    public volatile class40[] field311 = new class40[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class40 var2 = this.field311[var1];
                if (var2 != null) {
                    var2.method661();
                }
            }
        } catch (Exception var4) {
            class467.method4655((String) null, var4);
        }
    }
}
