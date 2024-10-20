package deob;

@ObfuscatedName("ae")
public class class27 implements Runnable {

    @ObfuscatedName("ae.s")
    public volatile class25[] field219 = new class25[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class25 var2 = this.field219[var1];
                if (var2 != null) {
                    var2.method447();
                }
            }
        } catch (Exception var4) {
            class409.method5337((String) null, var4);
        }
    }
}
