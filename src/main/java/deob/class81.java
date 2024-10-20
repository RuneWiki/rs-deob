package deob;

@ObfuscatedName("cq")
public class class81 {

    @ObfuscatedName("cq.e")
    public final class331 field1049;

    @ObfuscatedName("cq.v")
    public final int field1050;

    @ObfuscatedName("cq.x")
    public int field1048 = 0;

    public class81(class331 arg0, String arg1) {
        this.field1049 = arg0;
        this.field1050 = arg0.method5856();
    }

    @ObfuscatedName("cq.h(B)Z")
    public boolean method2111() {
        this.field1048 = 0;
        for (int var1 = 0; var1 < this.field1050; var1++) {
            if (!this.field1049.method5834(var1) || this.field1049.method5810(var1)) {
                this.field1048++;
            }
        }
        return this.field1048 >= this.field1050;
    }
}
