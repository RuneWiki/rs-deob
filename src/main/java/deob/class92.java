package deob;

@ObfuscatedName("ce")
public class class92 {

    @ObfuscatedName("ce.e")
    public final class274 field1118;

    @ObfuscatedName("ce.v")
    public final int field1120;

    @ObfuscatedName("ce.y")
    public int field1119 = 0;

    public class92(class274 arg0, String arg1) {
        this.field1118 = arg0;
        this.field1120 = arg0.method4515();
    }

    @ObfuscatedName("ce.f(I)Z")
    public boolean method1902() {
        this.field1119 = 0;
        for (int var1 = 0; var1 < this.field1120; var1++) {
            if (!this.field1118.method4468(var1) || this.field1118.method4467(var1)) {
                this.field1119++;
            }
        }
        return this.field1119 >= this.field1120;
    }
}
