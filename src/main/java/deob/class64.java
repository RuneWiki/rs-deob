package deob;

@ObfuscatedName("bb")
public class class64 implements Runnable {

    @ObfuscatedName("bb.q")
    public class104 field1105;

    @ObfuscatedName("bb.d")
    public volatile class58[] field1108 = new class58[2];

    @ObfuscatedName("bb.h")
    public volatile boolean field1107 = false;

    @ObfuscatedName("bb.p")
    public volatile boolean field1111 = false;

    public void run() {
        this.field1111 = true;
        try {
            while (!this.field1107) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1108[var1];
                    if (var2 != null) {
                        var2.method1094();
                    }
                }
                class162.method2156(10L);
                class109.method930(this.field1105, (Object) null);
            }
        } catch (Exception var7) {
            class102.method811((String) null, var7);
        } finally {
            this.field1111 = false;
        }
    }
}
