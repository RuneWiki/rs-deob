package deob;

import java.awt.event.ActionEvent;

@ObfuscatedName("ba")
public class class64 implements Runnable {

    @ObfuscatedName("ba.n")
    public class104 field1082;

    @ObfuscatedName("ba.d")
    public volatile class58[] field1081 = new class58[2];

    @ObfuscatedName("ba.m")
    public volatile boolean field1085 = false;

    @ObfuscatedName("ba.h")
    public volatile boolean field1083 = false;

    public void run() {
        this.field1083 = true;
        try {
            while (!this.field1085) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class58 var2 = this.field1081[var1];
                    if (var2 != null) {
                        var2.method1013();
                    }
                }
                Statics.method13(10L);
                class104 var3 = this.field1082;
                Object var4 = null;
                if (var3.field1671 != null) {
                    for (int var5 = 0; var5 < 50 && var3.field1671.peekEvent() != null; var5++) {
                        Statics.method13(1L);
                    }
                    if (var4 != null) {
                        var3.field1671.postEvent(new ActionEvent(var4, 1001, "dummy"));
                    }
                }
            }
        } catch (Exception var10) {
            class102.method755((String) null, var10);
        } finally {
            this.field1083 = false;
        }
    }
}
