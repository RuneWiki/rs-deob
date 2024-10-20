package deob;

@ObfuscatedName("bc")
public class class53 {

    @ObfuscatedName("bc.w")
    public final class250 field475;

    @ObfuscatedName("bc.m")
    public final int field474;

    @ObfuscatedName("bc.q")
    public int field476 = 0;

    public class53(class250 arg0, String arg1) {
        this.field475 = arg0;
        this.field474 = arg0.method4269();
    }

    @ObfuscatedName("bc.w(B)Z")
    public boolean method974() {
        this.field476 = 0;
        for (int var1 = 0; var1 < this.field474; var1++) {
            if (!this.field475.method4367(var1) || this.field475.method4366(var1)) {
                this.field476++;
            }
        }
        return this.field476 >= this.field474;
    }
}
