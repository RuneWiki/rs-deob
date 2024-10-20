package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("bx")
public class class64 implements Runnable {

    @ObfuscatedName("bx.p")
    public class104 field1094;

    @ObfuscatedName("bx.g")
    public volatile class58[] field1093 = new class58[2];

    @ObfuscatedName("bx.x")
    public volatile boolean field1095 = false;

    @ObfuscatedName("bx.q")
    public volatile boolean field1096 = false;

    public void run() {
        this.field1096 = true;
        try {
            while (!this.field1095) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1093[var1];
                    if (var2 != null) {
                        var2.method1031();
                    }
                }
                class162.method1858(10L);
                class104 var3 = this.field1094;
                Object var4 = null;
                if (var3.field1675 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1675.peekEvent() != null; var5++) {
                        class162.method1858(1L);
                    }
                    if (var4 != null) {
                        var3.field1675.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class102.method1103((String) null, var10);
        } finally {
            this.field1096 = false;
        }
    }
}
