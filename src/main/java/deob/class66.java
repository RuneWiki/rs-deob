package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bc")
public class class66 implements Runnable {

    @ObfuscatedName("bc.z")
    public class123 field1221;

    @ObfuscatedName("bc.j")
    public volatile class50[] field1217 = new class50[2];

    @ObfuscatedName("bc.a")
    public volatile boolean field1218 = false;

    @ObfuscatedName("bc.y")
    public volatile boolean field1219 = false;

    public void run() {
        this.field1219 = true;
        try {
            while (!this.field1218) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1217[var1];
                    if (var2 != null) {
                        var2.method969();
                    }
                }
                class114.method1960(10L);
                class123 var3 = this.field1221;
                Object var4 = null;
                if (var3.field1926 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1926.peekEvent() != null; var5++) {
                        class114.method1960(1L);
                    }
                    if (var4 != null) {
                        var3.field1926.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class135.method2452((String) null, var10);
        } finally {
            this.field1219 = false;
        }
    }
}
