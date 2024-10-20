package deob;

@ObfuscatedName("bd")
public class class68 {

    @ObfuscatedName("bd.k")
    public final class246 field545;

    @ObfuscatedName("bd.s")
    public final int field547;

    @ObfuscatedName("bd.t")
    public int field548 = 0;

    public class68(class246 arg0, String arg1) {
        this.field545 = arg0;
        this.field547 = arg0.method3885();
    }

    @ObfuscatedName("bd.z(I)Z")
    public boolean method1062() {
        this.field548 = 0;
        for (int var1 = 0; var1 < this.field547; var1++) {
            if (!this.field545.method3982(var1) || this.field545.method3981(var1)) {
                this.field548++;
            }
        }
        return this.field548 >= this.field547;
    }
}
