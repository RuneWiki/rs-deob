package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bk")
public class class73 implements Runnable {

    @ObfuscatedName("bk.e")
    public class137 field1326;

    @ObfuscatedName("bk.w")
    public volatile class57[] field1322 = new class57[2];

    @ObfuscatedName("bk.f")
    public volatile boolean field1321 = false;

    @ObfuscatedName("bk.s")
    public volatile boolean field1323 = false;

    public void run() {
        this.field1323 = true;
        try {
            while (!this.field1321) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1322[var1];
                    if (var2 != null) {
                        var2.method1149();
                    }
                }
                class128.method2645(10L);
                class137 var3 = this.field1326;
                Object var4 = null;
                if (var3.field2088 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2088.peekEvent() != null; var5++) {
                        class128.method2645(1L);
                    }
                    if (var4 != null) {
                        var3.field2088.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class149.method17((String) null, var10);
        } finally {
            this.field1323 = false;
        }
    }
}
