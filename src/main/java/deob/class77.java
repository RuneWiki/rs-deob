package deob;

@ObfuscatedName("bp")
public class class77 {

    @ObfuscatedName("bp.q")
    public final class314 field1008;

    @ObfuscatedName("bp.l")
    public final int field1009;

    @ObfuscatedName("bp.k")
    public int field1015 = 0;

    public class77(class314 arg0, String arg1) {
        this.field1008 = arg0;
        this.field1009 = arg0.method5197();
    }

    @ObfuscatedName("bp.o(I)Z")
    public boolean method1934() {
        this.field1015 = 0;
        for (int var1 = 0; var1 < this.field1009; var1++) {
            if (!this.field1008.method5160(var1) || this.field1008.method5159(var1)) {
                this.field1015++;
            }
        }
        return this.field1015 >= this.field1009;
    }
}
