package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bh")
public class class66 implements Runnable {

    @ObfuscatedName("bh.e")
    public class123 field1242;

    @ObfuscatedName("bh.v")
    public volatile class50[] field1249 = new class50[2];

    @ObfuscatedName("bh.i")
    public volatile boolean field1243 = false;

    @ObfuscatedName("bh.g")
    public volatile boolean field1241 = false;

    public void run() {
        this.field1241 = true;
        try {
            while (!this.field1243) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1249[var1];
                    if (var2 != null) {
                        var2.method997();
                    }
                }
                class114.method2357(10L);
                class123 var3 = this.field1242;
                Object var4 = null;
                if (var3.field1942 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1942.peekEvent() != null; var5++) {
                        class114.method2357(1L);
                    }
                    if (var4 != null) {
                        var3.field1942.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class135.method457((String) null, var10);
        } finally {
            this.field1241 = false;
        }
    }
}
