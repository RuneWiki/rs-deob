package deob;

@ObfuscatedName("bp")
public class class77 {

    @ObfuscatedName("bp.q")
    public final class288 field1004;

    @ObfuscatedName("bp.f")
    public final int field999;

    @ObfuscatedName("bp.j")
    public int field1001 = 0;

    public class77(class288 arg0, String arg1) {
        this.field1004 = arg0;
        this.field999 = arg0.method4794();
    }

    @ObfuscatedName("bp.l(I)Z")
    public boolean method1947() {
        this.field1001 = 0;
        for (int var1 = 0; var1 < this.field999; var1++) {
            if (!this.field1004.method4717(var1) || this.field1004.method4716(var1)) {
                this.field1001++;
            }
        }
        return this.field1001 >= this.field999;
    }
}
