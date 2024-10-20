package deob;

@ObfuscatedName("bx")
public class class59 {

    @ObfuscatedName("bx.i")
    public final class236 field518;

    @ObfuscatedName("bx.y")
    public final int field515;

    @ObfuscatedName("bx.w")
    public int field516 = 0;

    public class59(class236 arg0, String arg1) {
        this.field518 = arg0;
        this.field515 = arg0.method3765();
    }

    @ObfuscatedName("bx.f(I)Z")
    public boolean method1013() {
        this.field516 = 0;
        for (int var1 = 0; var1 < this.field515; var1++) {
            if (!this.field518.method3893(var1) || this.field518.method3886(var1)) {
                this.field516++;
            }
        }
        return this.field516 >= this.field515;
    }
}
