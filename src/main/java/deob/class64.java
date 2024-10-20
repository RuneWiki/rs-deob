package deob;

@ObfuscatedName("bj")
public class class64 implements Runnable {

    @ObfuscatedName("bj.s")
    public class104 field1091;

    @ObfuscatedName("bj.c")
    public volatile class58[] field1094 = new class58[2];

    @ObfuscatedName("bj.f")
    public volatile boolean field1092 = false;

    @ObfuscatedName("bj.h")
    public volatile boolean field1090 = false;

    public void run() {
        this.field1090 = true;
        try {
            while (!this.field1092) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1094[var1];
                    if (var2 != null) {
                        var2.method1013();
                    }
                }
                class162.method746(10L);
                class109.method758(this.field1091, (Object) null);
            }
        } catch (Exception var7) {
            class102.method690((String) null, var7);
        } finally {
            this.field1090 = false;
        }
    }
}
