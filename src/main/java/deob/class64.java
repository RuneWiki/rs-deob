package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bp")
public class class64 implements Runnable {

    @ObfuscatedName("bp.k")
    public class104 field1099;

    @ObfuscatedName("bp.y")
    public volatile class58[] field1096 = new class58[2];

    @ObfuscatedName("bp.o")
    public volatile boolean field1092 = false;

    @ObfuscatedName("bp.r")
    public volatile boolean field1093 = false;

    public void run() {
        this.field1093 = true;
        try {
            while (!this.field1092) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1096[var1];
                    if (var2 != null) {
                        var2.method1067();
                    }
                }
                class169.method3344(10L);
                class104 var3 = this.field1099;
                Object var4 = null;
                if (var3.field1682 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1682.peekEvent() != null; var5++) {
                        class169.method3344(1L);
                    }
                    if (var4 != null) {
                        var3.field1682.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class102.method706((String) null, var10);
        } finally {
            this.field1093 = false;
        }
    }
}
