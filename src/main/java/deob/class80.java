package deob;

@ObfuscatedName("cr")
public class class80 {

    @ObfuscatedName("cr.w")
    public final class335 field1031;

    @ObfuscatedName("cr.v")
    public final int field1030;

    @ObfuscatedName("cr.s")
    public int field1028 = 0;

    public class80(class335 arg0, String arg1) {
        this.field1031 = arg0;
        this.field1030 = arg0.method6055();
    }

    @ObfuscatedName("cr.f(B)Z")
    public boolean method2182() {
        this.field1028 = 0;
        for (int var1 = 0; var1 < this.field1030; var1++) {
            if (!this.field1031.method5937(var1) || this.field1031.method5936(var1)) {
                this.field1028++;
            }
        }
        return this.field1028 >= this.field1030;
    }
}
