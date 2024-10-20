package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bv")
public class class66 implements Runnable {

    @ObfuscatedName("bv.g")
    public class123 field1253;

    @ObfuscatedName("bv.s")
    public volatile class50[] field1245 = new class50[2];

    @ObfuscatedName("bv.v")
    public volatile boolean field1246 = false;

    @ObfuscatedName("bv.o")
    public volatile boolean field1250 = false;

    public void run() {
        this.field1250 = true;
        try {
            while (!this.field1246) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1245[var1];
                    if (var2 != null) {
                        var2.method972();
                    }
                }
                class114.method26(10L);
                class123 var3 = this.field1253;
                Object var4 = null;
                if (var3.field1964 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1964.peekEvent() != null; var5++) {
                        class114.method26(1L);
                    }
                    if (var4 != null) {
                        var3.field1964.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class135.method1813((String) null, var10);
        } finally {
            this.field1250 = false;
        }
    }
}
