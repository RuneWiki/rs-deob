package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bn")
public class class73 implements Runnable {

    @ObfuscatedName("bn.j")
    public class136 field1361;

    @ObfuscatedName("bn.l")
    public volatile class57[] field1360 = new class57[2];

    @ObfuscatedName("bn.a")
    public volatile boolean field1358 = false;

    @ObfuscatedName("bn.i")
    public volatile boolean field1359 = false;

    public void run() {
        this.field1359 = true;
        try {
            while (!this.field1358) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class57 var2 = this.field1360[var1];
                    if (var2 != null) {
                        var2.method1159();
                    }
                }
                class127.method2202(10L);
                class136 var3 = this.field1361;
                Object var4 = null;
                if (var3.field2098 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2098.peekEvent() != null; var5++) {
                        class127.method2202(1L);
                    }
                    if (var4 != null) {
                        var3.field2098.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class148.method181((String) null, var10);
        } finally {
            this.field1359 = false;
        }
    }
}
