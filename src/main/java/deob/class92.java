package deob;

@ObfuscatedName("ck")
public class class92 {

    @ObfuscatedName("ck.n")
    public final class273 field1140;

    @ObfuscatedName("ck.f")
    public final int field1141;

    @ObfuscatedName("ck.y")
    public int field1142 = 0;

    public class92(class273 arg0, String arg1) {
        this.field1140 = arg0;
        this.field1141 = arg0.method4536();
    }

    @ObfuscatedName("ck.v(B)Z")
    public boolean method1869() {
        this.field1142 = 0;
        for (int var1 = 0; var1 < this.field1141; var1++) {
            if (!this.field1140.method4439(var1) || this.field1140.method4436(var1)) {
                this.field1142++;
            }
        }
        return this.field1142 >= this.field1141;
    }
}
