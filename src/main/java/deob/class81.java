package deob;

@ObfuscatedName("cs")
public class class81 {

    @ObfuscatedName("cs.f")
    public final class328 field1012;

    @ObfuscatedName("cs.c")
    public final int field1014;

    @ObfuscatedName("cs.x")
    public int field1013 = 0;

    public class81(class328 arg0, String arg1) {
        this.field1012 = arg0;
        this.field1014 = arg0.method5794();
    }

    @ObfuscatedName("cs.a(I)Z")
    public boolean method2115() {
        this.field1013 = 0;
        for (int var1 = 0; var1 < this.field1014; var1++) {
            if (!this.field1012.method5735(var1) || this.field1012.method5741(var1)) {
                this.field1013++;
            }
        }
        return this.field1013 >= this.field1014;
    }
}
