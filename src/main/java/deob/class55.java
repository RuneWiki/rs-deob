package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bp")
public class class55 implements Runnable {

    @ObfuscatedName("bp.j")
    public class74 field1171;

    @ObfuscatedName("bp.r")
    public volatile class52[] field1170 = new class52[2];

    @ObfuscatedName("bp.v")
    public volatile boolean field1176 = false;

    @ObfuscatedName("bp.p")
    public volatile boolean field1172 = false;

    public void run() {
        this.field1172 = true;
        try {
            while (!this.field1176) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1170[var1];
                    if (var2 != null) {
                        var2.method1154();
                    }
                }
                class126.method1316(10L);
                class74 var3 = this.field1171;
                Object var4 = null;
                if (var3.field1323 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1323.peekEvent() != null; var5++) {
                        class126.method1316(1L);
                    }
                    if (var4 != null) {
                        var3.field1323.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class80.method2830((String) null, var10);
        } finally {
            this.field1172 = false;
        }
    }
}
