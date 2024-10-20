package deob;

@ObfuscatedName("bo")
public class class68 {

    @ObfuscatedName("bo.v")
    public final class247 field533;

    @ObfuscatedName("bo.x")
    public final int field535;

    @ObfuscatedName("bo.w")
    public int field538 = 0;

    public class68(class247 arg0, String arg1) {
        this.field533 = arg0;
        this.field535 = arg0.method3847();
    }

    @ObfuscatedName("bo.h(I)Z")
    public boolean method1107() {
        this.field538 = 0;
        for (int var1 = 0; var1 < this.field535; var1++) {
            if (!this.field533.method3944(var1) || this.field533.method3954(var1)) {
                this.field538++;
            }
        }
        return this.field538 >= this.field535;
    }
}
