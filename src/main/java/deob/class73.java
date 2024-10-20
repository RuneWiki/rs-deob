package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bv")
public class class73 implements Runnable {

    @ObfuscatedName("bv.w")
    public class137 field1357;

    @ObfuscatedName("bv.x")
    public volatile class57[] field1355 = new class57[2];

    @ObfuscatedName("bv.t")
    public volatile boolean field1356 = false;

    @ObfuscatedName("bv.p")
    public volatile boolean field1363 = false;

    public void run() {
        this.field1363 = true;
        try {
            while (!this.field1356) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1355[var1];
                    if (var2 != null) {
                        var2.method1198();
                    }
                }
                class128.method2158(10L);
                class137 var3 = this.field1357;
                Object var4 = null;
                if (var3.field2110 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2110.peekEvent() != null; var5++) {
                        class128.method2158(1L);
                    }
                    if (var4 != null) {
                        var3.field2110.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class149.method1((String) null, var10);
        } finally {
            this.field1363 = false;
        }
    }
}
