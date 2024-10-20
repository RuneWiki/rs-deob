package deob;

@ObfuscatedName("br")
public class class65 {

    @ObfuscatedName("br.g")
    public final class264 field747;

    @ObfuscatedName("br.e")
    public final int field749;

    @ObfuscatedName("br.b")
    public int field748 = 0;

    public class65(class264 arg0, String arg1) {
        this.field747 = arg0;
        this.field749 = arg0.method4280();
    }

    @ObfuscatedName("br.g(B)Z")
    public boolean method1039() {
        this.field748 = 0;
        for (int var1 = 0; var1 < this.field749; var1++) {
            if (!this.field747.method4398(var1) || this.field747.method4390(var1)) {
                this.field748++;
            }
        }
        return this.field748 >= this.field749;
    }
}
