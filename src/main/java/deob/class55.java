package deob;

@ObfuscatedName("bn")
public class class55 implements Runnable {

    @ObfuscatedName("bn.f")
    public volatile class53[] field421 = new class53[2];

    public void run() {
        try {
            for (int var1 = 0; var1 < 2; var1++) {
                class53 var2 = this.field421[var1];
                if (var2 != null) {
                    var2.method630();
                }
            }
        } catch (Exception var4) {
            class405.method3718((String) null, var4);
        }
    }
}
