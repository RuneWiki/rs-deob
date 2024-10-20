package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bo")
public class class73 implements Runnable {

    @ObfuscatedName("bo.i")
    public class136 field1345;

    @ObfuscatedName("bo.v")
    public volatile class57[] field1343 = new class57[2];

    @ObfuscatedName("bo.f")
    public volatile boolean field1346 = false;

    @ObfuscatedName("bo.h")
    public volatile boolean field1344 = false;

    public void run() {
        this.field1344 = true;
        try {
            while (!this.field1346) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1343[var1];
                    if (var2 != null) {
                        var2.method1119();
                    }
                }
                class127.method848(10L);
                class136 var3 = this.field1345;
                Object var4 = null;
                if (var3.field2091 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2091.peekEvent() != null; var5++) {
                        class127.method848(1L);
                    }
                    if (var4 != null) {
                        var3.field2091.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            Statics.method929((String) null, var10);
        } finally {
            this.field1344 = false;
        }
    }
}
