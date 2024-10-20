package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("z")
public class class20 implements Runnable {

    @ObfuscatedName("z.t")
    public class34 field288;

    @ObfuscatedName("z.n")
    public volatile class18[] field290 = new class18[2];

    @ObfuscatedName("z.q")
    public volatile boolean field287 = false;

    @ObfuscatedName("z.h")
    public volatile boolean field289 = false;

    public void run() {
        this.field289 = true;
        try {
            while (!this.field287) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class18 var2 = this.field290[var1];
                    if (var2 != null) {
                        var2.method212();
                    }
                }
                Statics.method101(10L);
                class34 var3 = this.field288;
                Object var4 = null;
                if (var3.field377 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field377.peekEvent() != null; var5++) {
                        Statics.method101(1L);
                    }
                    if (var4 != null) {
                        var3.field377.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class169.method255((String) null, var10);
        } finally {
            this.field289 = false;
        }
    }
}
