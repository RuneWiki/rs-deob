package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bg")
public class class68 implements Runnable {

    @ObfuscatedName("bg.q")
    public class128 field1251;

    @ObfuscatedName("bg.s")
    public volatile class52[] field1249 = new class52[2];

    @ObfuscatedName("bg.h")
    public volatile boolean field1255 = false;

    @ObfuscatedName("bg.e")
    public volatile boolean field1250 = false;

    public void run() {
        this.field1250 = true;
        try {
            while (!this.field1255) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1249[var1];
                    if (var2 != null) {
                        var2.method1009();
                    }
                }
                class119.method587(10L);
                class128 var3 = this.field1251;
                Object var4 = null;
                if (var3.field1952 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1952.peekEvent() != null; var5++) {
                        class119.method587(1L);
                    }
                    if (var4 != null) {
                        var3.field1952.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class140.method1379((String) null, var10);
        } finally {
            this.field1250 = false;
        }
    }
}
