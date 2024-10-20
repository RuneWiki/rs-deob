package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bz")
public class class66 implements Runnable {

    @ObfuscatedName("bz.t")
    public class123 field1239;

    @ObfuscatedName("bz.s")
    public volatile class50[] field1235 = new class50[2];

    @ObfuscatedName("bz.f")
    public volatile boolean field1237 = false;

    @ObfuscatedName("bz.e")
    public volatile boolean field1236 = false;

    public void run() {
        this.field1236 = true;
        try {
            while (!this.field1237) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1235[var1];
                    if (var2 != null) {
                        var2.method974();
                    }
                }
                class114.method2031(10L);
                class123 var3 = this.field1239;
                Object var4 = null;
                if (var3.field1938 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1938.peekEvent() != null; var5++) {
                        class114.method2031(1L);
                    }
                    if (var4 != null) {
                        var3.field1938.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            Statics.method96((String) null, var10);
        } finally {
            this.field1236 = false;
        }
    }
}
