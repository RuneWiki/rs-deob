package deob;

@ObfuscatedName("bp")
public class class59 {

    @ObfuscatedName("bp.t")
    public final class237 field543;

    @ObfuscatedName("bp.o")
    public final int field538;

    @ObfuscatedName("bp.e")
    public int field537 = 0;

    public class59(class237 arg0, String arg1) {
        this.field543 = arg0;
        this.field538 = arg0.method3849();
    }

    @ObfuscatedName("bp.c(I)Z")
    public boolean method1024() {
        this.field537 = 0;
        for (int var1 = 0; var1 < this.field538; var1++) {
            if (!this.field543.method3962(var1) || this.field543.method3961(var1)) {
                this.field537++;
            }
        }
        return this.field537 >= this.field538;
    }
}
