package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bi")
public class class66 implements Runnable {

    @ObfuscatedName("bi.p")
    public class123 field1249;

    @ObfuscatedName("bi.g")
    public volatile class50[] field1239 = new class50[2];

    @ObfuscatedName("bi.x")
    public volatile boolean field1240 = false;

    @ObfuscatedName("bi.c")
    public volatile boolean field1241 = false;

    public void run() {
        this.field1241 = true;
        try {
            while (!this.field1240) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1239[var1];
                    if (var2 != null) {
                        var2.method1045();
                    }
                }
                class114.method1917(10L);
                class123 var3 = this.field1249;
                Object var4 = null;
                if (var3.field1938 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1938.peekEvent() != null; var5++) {
                        class114.method1917(1L);
                    }
                    if (var4 != null) {
                        var3.field1938.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class135.method2121((String) null, var10);
        } finally {
            this.field1241 = false;
        }
    }
}
