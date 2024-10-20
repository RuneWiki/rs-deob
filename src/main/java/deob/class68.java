package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bg")
public class class68 implements Runnable {

    @ObfuscatedName("bg.n")
    public class128 field1284;

    @ObfuscatedName("bg.d")
    public volatile class52[] field1283 = new class52[2];

    @ObfuscatedName("bg.z")
    public volatile boolean field1282 = false;

    @ObfuscatedName("bg.y")
    public volatile boolean field1285 = false;

    public void run() {
        this.field1285 = true;
        try {
            while (!this.field1282) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1283[var1];
                    if (var2 != null) {
                        var2.method1070();
                    }
                }
                class119.method3147(10L);
                class128 var3 = this.field1284;
                Object var4 = null;
                if (var3.field2006 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2006.peekEvent() != null; var5++) {
                        class119.method3147(1L);
                    }
                    if (var4 != null) {
                        var3.field2006.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class140.method1864((String) null, var10);
        } finally {
            this.field1285 = false;
        }
    }
}
