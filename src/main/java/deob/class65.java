package deob;

@ObfuscatedName("be")
public class class65 {

    @ObfuscatedName("be.d")
    public final class264 field763;

    @ObfuscatedName("be.z")
    public final int field764;

    @ObfuscatedName("be.n")
    public int field765 = 0;

    public class65(class264 arg0, String arg1) {
        this.field763 = arg0;
        this.field764 = arg0.method4311();
    }

    @ObfuscatedName("be.d(B)Z")
    public boolean method960() {
        this.field765 = 0;
        for (int var1 = 0; var1 < this.field764; var1++) {
            if (!this.field763.method4384(var1) || this.field763.method4383(var1)) {
                this.field765++;
            }
        }
        return this.field765 >= this.field764;
    }
}
