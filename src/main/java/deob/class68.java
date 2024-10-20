package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bn")
public class class68 implements Runnable {

    @ObfuscatedName("bn.b")
    public class128 field1286;

    @ObfuscatedName("bn.e")
    public volatile class52[] field1284 = new class52[2];

    @ObfuscatedName("bn.a")
    public volatile boolean field1285 = false;

    @ObfuscatedName("bn.k")
    public volatile boolean field1291 = false;

    public void run() {
        this.field1291 = true;
        try {
            while (!this.field1285) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1284[var1];
                    if (var2 != null) {
                        var2.method1028();
                    }
                }
                class119.method555(10L);
                class128 var3 = this.field1286;
                Object var4 = null;
                if (var3.field1999 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1999.peekEvent() != null; var5++) {
                        class119.method555(1L);
                    }
                    if (var4 != null) {
                        var3.field1999.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class140.method2489((String) null, var10);
        } finally {
            this.field1291 = false;
        }
    }
}
