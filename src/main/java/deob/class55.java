package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bj")
public class class55 implements Runnable {

    @ObfuscatedName("bj.b")
    public class74 field1167;

    @ObfuscatedName("bj.e")
    public volatile class52[] field1165 = new class52[2];

    @ObfuscatedName("bj.g")
    public volatile boolean field1166 = false;

    @ObfuscatedName("bj.o")
    public volatile boolean field1171 = false;

    public void run() {
        this.field1171 = true;
        try {
            while (!this.field1166) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1165[var1];
                    if (var2 != null) {
                        var2.method1133();
                    }
                }
                class127.method686(10L);
                class74 var3 = this.field1167;
                Object var4 = null;
                if (var3.field1331 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1331.peekEvent() != null; var5++) {
                        class127.method686(1L);
                    }
                    if (var4 != null) {
                        var3.field1331.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method1557((String) null, var10);
        } finally {
            this.field1171 = false;
        }
    }
}
