package deob;

@ObfuscatedName("ci")
public class class98 implements Runnable {

    @ObfuscatedName("ci.z")
    public volatile class96[] field1328 = new class96[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class96 var2 = this.field1328[var1];
                if (var2 != null) {
                    var2.method2009();
                }
            }
        } catch (Exception var4) {
            class153.method66((String) null, var4);
        }
    }
}
