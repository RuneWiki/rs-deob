package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bb")
public class class64 implements Runnable {

    @ObfuscatedName("bb.x")
    public class104 field1108;

    @ObfuscatedName("bb.n")
    public volatile class58[] field1102 = new class58[2];

    @ObfuscatedName("bb.g")
    public volatile boolean field1103 = false;

    @ObfuscatedName("bb.v")
    public volatile boolean field1104 = false;

    public void run() {
        this.field1104 = true;
        try {
            while (!this.field1103) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1102[var1];
                    if (var2 != null) {
                        var2.method1101();
                    }
                }
                class162.method951(10L);
                class104 var3 = this.field1108;
                Object var4 = null;
                if (var3.field1680 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1680.peekEvent() != null; var5++) {
                        class162.method951(1L);
                    }
                    if (var4 != null) {
                        var3.field1680.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class102.method1916((String) null, var10);
        } finally {
            this.field1104 = false;
        }
    }
}
