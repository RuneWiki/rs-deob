package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bg")
public class class73 implements Runnable {

    @ObfuscatedName("bg.l")
    public class136 field1338;

    @ObfuscatedName("bg.e")
    public volatile class57[] field1334 = new class57[2];

    @ObfuscatedName("bg.q")
    public volatile boolean field1335 = false;

    @ObfuscatedName("bg.o")
    public volatile boolean field1336 = false;

    public void run() {
        this.field1336 = true;
        try {
            while (!this.field1335) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1334[var1];
                    if (var2 != null) {
                        var2.method1193();
                    }
                }
                class127.method2667(10L);
                class136 var3 = this.field1338;
                Object var4 = null;
                if (var3.field2094 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2094.peekEvent() != null; var5++) {
                        class127.method2667(1L);
                    }
                    if (var4 != null) {
                        var3.field2094.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class148.method2819((String) null, var10);
        } finally {
            this.field1336 = false;
        }
    }
}
