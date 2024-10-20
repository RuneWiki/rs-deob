package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bz")
public class class66 implements Runnable {

    @ObfuscatedName("bz.t")
    public class123 field1251;

    @ObfuscatedName("bz.o")
    public volatile class50[] field1252 = new class50[2];

    @ObfuscatedName("bz.i")
    public volatile boolean field1258 = false;

    @ObfuscatedName("bz.p")
    public volatile boolean field1250 = false;

    public void run() {
        this.field1250 = true;
        try {
            while (!this.field1258) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class50 var2 = this.field1252[var1];
                    if (var2 != null) {
                        var2.method972();
                    }
                }
                class114.method1854(10L);
                class123 var3 = this.field1251;
                Object var4 = null;
                if (var3.field1930 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1930.peekEvent() != null; var5++) {
                        class114.method1854(1L);
                    }
                    if (var4 != null) {
                        var3.field1930.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class135.method1362((String) null, var10);
        } finally {
            this.field1250 = false;
        }
    }
}
