package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("f")
public class class20 implements Runnable {

    @ObfuscatedName("f.r")
    public class34 field290;

    @ObfuscatedName("f.d")
    public volatile class18[] field293 = new class18[2];

    @ObfuscatedName("f.l")
    public volatile boolean field292 = false;

    @ObfuscatedName("f.m")
    public volatile boolean field291 = false;

    public void run() {
        this.field291 = true;
        try {
            while (!this.field292) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class18 var2 = this.field293[var1];
                    if (var2 != null) {
                        var2.method235();
                    }
                }
                class67.method1020(10L);
                class34 var3 = this.field290;
                Object var4 = null;
                if (var3.field381 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field381.peekEvent() != null; var5++) {
                        class67.method1020(1L);
                    }
                    if (var4 != null) {
                        var3.field381.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class169.method1490((String) null, var10);
        } finally {
            this.field291 = false;
        }
    }
}
