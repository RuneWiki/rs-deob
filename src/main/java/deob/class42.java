package deob;

@ObfuscatedName("ad")
public class class42 implements Runnable {

    @ObfuscatedName("ad.c")
    public volatile class40[] field322 = new class40[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class40 var2 = this.field322[var1];
                if (var2 != null) {
                    var2.method705();
                }
            }
        } catch (Exception var4) {
            class445.method3452((String) null, var4);
        }
    }
}
