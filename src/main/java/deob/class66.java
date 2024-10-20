package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bv")
public class class66 implements Runnable {

    @ObfuscatedName("bv.k")
    public class123 field1228;

    @ObfuscatedName("bv.y")
    public volatile class50[] field1230 = new class50[2];

    @ObfuscatedName("bv.s")
    public volatile boolean field1226 = false;

    @ObfuscatedName("bv.g")
    public volatile boolean field1229 = false;

    public void run() {
        this.field1229 = true;
        try {
            while (!this.field1226) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1230[var1];
                    if (var2 != null) {
                        var2.method1017();
                    }
                }
                class114.method1888(10L);
                class123 var3 = this.field1228;
                Object var4 = null;
                if (var3.field1942 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1942.peekEvent() != null; var5++) {
                        class114.method1888(1L);
                    }
                    if (var4 != null) {
                        var3.field1942.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class135.method2083((String) null, var10);
        } finally {
            this.field1229 = false;
        }
    }
}
