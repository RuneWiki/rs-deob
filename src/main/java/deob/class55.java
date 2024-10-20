package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bb")
public class class55 implements Runnable {

    @ObfuscatedName("bb.l")
    public class74 field1168;

    @ObfuscatedName("bb.b")
    public volatile class52[] field1169 = new class52[2];

    @ObfuscatedName("bb.o")
    public volatile boolean field1170 = false;

    @ObfuscatedName("bb.w")
    public volatile boolean field1171 = false;

    public void run() {
        this.field1171 = true;
        try {
            while (!this.field1170) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1169[var1];
                    if (var2 != null) {
                        var2.method1154();
                    }
                }
                class126.method46(10L);
                class74 var3 = this.field1168;
                Object var4 = null;
                if (var3.field1325 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1325.peekEvent() != null; var5++) {
                        class126.method46(1L);
                    }
                    if (var4 != null) {
                        var3.field1325.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            Statics.method1393((String) null, var10);
        } finally {
            this.field1171 = false;
        }
    }
}
