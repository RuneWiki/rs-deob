package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bb")
public class class66 implements Runnable {

    @ObfuscatedName("bb.e")
    public class123 field1257;

    @ObfuscatedName("bb.o")
    public volatile class50[] field1256 = new class50[2];

    @ObfuscatedName("bb.y")
    public volatile boolean field1254 = false;

    @ObfuscatedName("bb.b")
    public volatile boolean field1252 = false;

    public void run() {
        this.field1252 = true;
        try {
            while (!this.field1254) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1256[var1];
                    if (var2 != null) {
                        var2.method975();
                    }
                }
                class114.method134(10L);
                class123 var3 = this.field1257;
                Object var4 = null;
                if (var3.field1945 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1945.peekEvent() != null; var5++) {
                        class114.method134(1L);
                    }
                    if (var4 != null) {
                        var3.field1945.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class135.method1996((String) null, var10);
        } finally {
            this.field1252 = false;
        }
    }
}
