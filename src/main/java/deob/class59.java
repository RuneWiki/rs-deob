package deob;

@ObfuscatedName("bj")
public class class59 {

    @ObfuscatedName("bj.n")
    public final class256 field527;

    @ObfuscatedName("bj.h")
    public final int field525;

    @ObfuscatedName("bj.l")
    public int field526 = 0;

    public class59(class256 arg0, String arg1) {
        this.field527 = arg0;
        this.field525 = arg0.method4467();
    }

    @ObfuscatedName("bj.n(B)Z")
    public boolean method1001() {
        this.field526 = 0;
        for (int var1 = 0; var1 < this.field525; var1++) {
            if (!this.field527.method4567(var1) || this.field527.method4591(var1)) {
                this.field526++;
            }
        }
        return this.field526 >= this.field525;
    }
}
