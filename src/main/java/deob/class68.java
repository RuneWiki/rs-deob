package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bh")
public class class68 implements Runnable {

    @ObfuscatedName("bh.t")
    public class128 field1265;

    @ObfuscatedName("bh.b")
    public volatile class52[] field1259 = new class52[2];

    @ObfuscatedName("bh.p")
    public volatile boolean field1260 = false;

    @ObfuscatedName("bh.e")
    public volatile boolean field1261 = false;

    public void run() {
        this.field1261 = true;
        try {
            while (!this.field1260) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class52 var2 = this.field1259[var1];
                    if (var2 != null) {
                        var2.method1082();
                    }
                }
                class119.method172(10L);
                class128 var3 = this.field1265;
                Object var4 = null;
                if (var3.field1970 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1970.peekEvent() != null; var5++) {
                        class119.method172(1L);
                    }
                    if (var4 != null) {
                        var3.field1970.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class140.method2756((String) null, var10);
        } finally {
            this.field1261 = false;
        }
    }
}
