package deob;

@ObfuscatedName("bn")
public class class59 {

    @ObfuscatedName("bn.w")
    public final class236 field548;

    @ObfuscatedName("bn.e")
    public final int field540;

    @ObfuscatedName("bn.p")
    public int field543 = 0;

    public class59(class236 arg0, String arg1) {
        this.field548 = arg0;
        this.field540 = arg0.method3863();
    }

    @ObfuscatedName("bn.q(B)Z")
    public boolean method957() {
        this.field543 = 0;
        for (int var1 = 0; var1 < this.field540; var1++) {
            if (!this.field548.method3896(var1) || this.field548.method3895(var1)) {
                this.field543++;
            }
        }
        return this.field543 >= this.field540;
    }
}
