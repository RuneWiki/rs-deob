package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("be")
public class class76 implements Runnable {

    @ObfuscatedName("be.f")
    public class140 field1400;

    @ObfuscatedName("be.e")
    public volatile class60[] field1395 = new class60[2];

    @ObfuscatedName("be.n")
    public volatile boolean field1397 = false;

    @ObfuscatedName("be.t")
    public volatile boolean field1398 = false;

    public void run() {
        this.field1398 = true;
        try {
            while (!this.field1397) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class60 var2 = this.field1395[var1];
                    if (var2 != null) {
                        var2.method1202();
                    }
                }
                class131.method2276(10L);
                class140 var3 = this.field1400;
                Object var4 = null;
                if (var3.field2142 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2142.peekEvent() != null; var5++) {
                        class131.method2276(1L);
                    }
                    if (var4 != null) {
                        var3.field2142.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class152.method2194((String) null, var10);
        } finally {
            this.field1398 = false;
        }
    }
}
