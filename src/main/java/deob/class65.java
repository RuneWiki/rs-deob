package deob;

@ObfuscatedName("be")
public class class65 {

    @ObfuscatedName("be.o")
    public final class264 field765;

    @ObfuscatedName("be.k")
    public final int field767;

    @ObfuscatedName("be.t")
    public int field764 = 0;

    public class65(class264 arg0, String arg1) {
        this.field765 = arg0;
        this.field767 = arg0.method4191();
    }

    @ObfuscatedName("be.o(I)Z")
    public boolean method1004() {
        this.field764 = 0;
        for (int var1 = 0; var1 < this.field767; var1++) {
            if (!this.field765.method4267(var1) || this.field765.method4262(var1)) {
                this.field764++;
            }
        }
        return this.field764 >= this.field767;
    }
}
