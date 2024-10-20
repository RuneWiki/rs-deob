package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("by")
public class class73 implements Runnable {

    @ObfuscatedName("by.z")
    public class136 field1349;

    @ObfuscatedName("by.q")
    public volatile class57[] field1345 = new class57[2];

    @ObfuscatedName("by.k")
    public volatile boolean field1346 = false;

    @ObfuscatedName("by.f")
    public volatile boolean field1347 = false;

    public void run() {
        this.field1347 = true;
        try {
            while (!this.field1346) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1345[var1];
                    if (var2 != null) {
                        var2.method1135();
                    }
                }
                class127.method712(10L);
                class136 var3 = this.field1349;
                Object var4 = null;
                if (var3.field2091 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2091.peekEvent() != null; var5++) {
                        class127.method712(1L);
                    }
                    if (var4 != null) {
                        var3.field2091.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class148.method623((String) null, var10);
        } finally {
            this.field1347 = false;
        }
    }
}
