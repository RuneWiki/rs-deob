package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bq")
public class class68 implements Runnable {

    @ObfuscatedName("bq.n")
    public class128 field1297;

    @ObfuscatedName("bq.o")
    public volatile class52[] field1298 = new class52[2];

    @ObfuscatedName("bq.a")
    public volatile boolean field1299 = false;

    @ObfuscatedName("bq.w")
    public volatile boolean field1304 = false;

    public void run() {
        this.field1304 = true;
        try {
            while (!this.field1299) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1298[var1];
                    if (var2 != null) {
                        var2.method1072();
                    }
                }
                class119.method2156(10L);
                class128 var3 = this.field1297;
                Object var4 = null;
                if (var3.field2001 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field2001.peekEvent() != null; var5++) {
                        class119.method2156(1L);
                    }
                    if (var4 != null) {
                        var3.field2001.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class140.method2571((String) null, var10);
        } finally {
            this.field1304 = false;
        }
    }
}
