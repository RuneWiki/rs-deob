package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("be")
public class class64 implements Runnable {

    @ObfuscatedName("be.b")
    public class104 field1080;

    @ObfuscatedName("be.l")
    public volatile class58[] field1075 = new class58[2];

    @ObfuscatedName("be.i")
    public volatile boolean field1076 = false;

    @ObfuscatedName("be.t")
    public volatile boolean field1077 = false;

    public void run() {
        this.field1077 = true;
        try {
            while (!this.field1076) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1075[var1];
                    if (var2 != null) {
                        var2.method1083();
                    }
                }
                class162.method2157(10L);
                class104 var3 = this.field1080;
                Object var4 = null;
                if (var3.field1667 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1667.peekEvent() != null; var5++) {
                        class162.method2157(1L);
                    }
                    if (var4 != null) {
                        var3.field1667.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class102.method1864((String) null, var10);
        } finally {
            this.field1077 = false;
        }
    }
}
