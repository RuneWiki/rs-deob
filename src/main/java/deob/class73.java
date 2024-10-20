package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bv")
public class class73 implements Runnable {

    @ObfuscatedName("bv.n")
    public class136 field1339;

    @ObfuscatedName("bv.d")
    public volatile class57[] field1335 = new class57[2];

    @ObfuscatedName("bv.s")
    public volatile boolean field1336 = false;

    @ObfuscatedName("bv.q")
    public volatile boolean field1337 = false;

    public void run() {
        this.field1337 = true;
        try {
            while (!this.field1336) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1335[var1];
                    if (var2 != null) {
                        var2.method1155();
                    }
                }
                class127.method1160(10L);
                class136 var3 = this.field1339;
                Object var4 = null;
                if (var3.field2080 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2080.peekEvent() != null; var5++) {
                        class127.method1160(1L);
                    }
                    if (var4 != null) {
                        var3.field2080.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            Statics.method2798((String) null, var10);
        } finally {
            this.field1337 = false;
        }
    }
}
