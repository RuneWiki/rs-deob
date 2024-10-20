package deob;

@ObfuscatedName("ht")
public class class217 {

    @ObfuscatedName("ht.cd")
    public long field2660;

    @ObfuscatedName("ht.co")
    public class217 field2659;

    @ObfuscatedName("ht.cb")
    public class217 field2658;

    @ObfuscatedName("ht.jn()V")
    public void method3796() {
        if (this.field2658 != null) {
            this.field2658.field2659 = this.field2659;
            this.field2659.field2658 = this.field2658;
            this.field2659 = null;
            this.field2658 = null;
        }
    }

    @ObfuscatedName("ht.jv()Z")
    public boolean method3801() {
        return this.field2658 != null;
    }
}
