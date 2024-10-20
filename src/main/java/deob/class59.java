package deob;

@ObfuscatedName("bj")
public class class59 {

    @ObfuscatedName("bj.f")
    public final class236 field532;

    @ObfuscatedName("bj.b")
    public final int field530;

    @ObfuscatedName("bj.g")
    public int field531 = 0;

    public class59(class236 arg0, String arg1) {
        this.field532 = arg0;
        this.field530 = arg0.method3856();
    }

    @ObfuscatedName("bj.u(I)Z")
    public boolean method1023() {
        this.field531 = 0;
        for (int var1 = 0; var1 < this.field530; var1++) {
            if (!this.field532.method3963(var1) || this.field532.method3962(var1)) {
                this.field531++;
            }
        }
        return this.field531 >= this.field530;
    }
}
