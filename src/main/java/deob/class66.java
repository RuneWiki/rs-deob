package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bb")
public class class66 implements Runnable {

    @ObfuscatedName("bb.k")
    public class123 field1252;

    @ObfuscatedName("bb.r")
    public volatile class50[] field1247 = new class50[2];

    @ObfuscatedName("bb.y")
    public volatile boolean field1248 = false;

    @ObfuscatedName("bb.w")
    public volatile boolean field1246 = false;

    public void run() {
        this.field1246 = true;
        try {
            while (!this.field1248) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1247[var1];
                    if (var2 != null) {
                        var2.method1006();
                    }
                }
                class114.method2808(10L);
                class123 var3 = this.field1252;
                Object var4 = null;
                if (var3.field1959 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1959.peekEvent() != null; var5++) {
                        class114.method2808(1L);
                    }
                    if (var4 != null) {
                        var3.field1959.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class135.method1963((String) null, var10);
        } finally {
            this.field1246 = false;
        }
    }
}
