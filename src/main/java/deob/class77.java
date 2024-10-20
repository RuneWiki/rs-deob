package deob;

@ObfuscatedName("bz")
public class class77 {

    @ObfuscatedName("bz.c")
    public final class314 field1007;

    @ObfuscatedName("bz.i")
    public final int field1006;

    @ObfuscatedName("bz.f")
    public int field1008 = 0;

    public class77(class314 arg0, String arg1) {
        this.field1007 = arg0;
        this.field1006 = arg0.method5319();
    }

    @ObfuscatedName("bz.v(B)Z")
    public boolean method1963() {
        this.field1008 = 0;
        for (int var1 = 0; var1 < this.field1006; var1++) {
            if (!this.field1007.method5259(var1) || this.field1007.method5249(var1)) {
                this.field1008++;
            }
        }
        return this.field1008 >= this.field1006;
    }
}
