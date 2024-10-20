package deob;

@ObfuscatedName("aj")
public class class42 implements Runnable {

    @ObfuscatedName("aj.c")
    public volatile class40[] field322 = new class40[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class40 var2 = this.field322[var1];
                if (var2 != null) {
                    var2.method727();
                }
            }
        } catch (Exception var4) {
            Statics.method3146((String) null, var4);
        }
    }
}
