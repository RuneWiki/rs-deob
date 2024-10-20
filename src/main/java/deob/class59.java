package deob;

@ObfuscatedName("bp")
public class class59 {

    @ObfuscatedName("bp.a")
    public final class257 field545;

    @ObfuscatedName("bp.s")
    public final int field539;

    @ObfuscatedName("bp.g")
    public int field540 = 0;

    public class59(class257 arg0, String arg1) {
        this.field545 = arg0;
        this.field539 = arg0.method4434();
    }

    @ObfuscatedName("bp.a(I)Z")
    public boolean method1027() {
        this.field540 = 0;
        for (int var1 = 0; var1 < this.field539; var1++) {
            if (!this.field545.method4531(var1) || this.field545.method4530(var1)) {
                this.field540++;
            }
        }
        return this.field540 >= this.field539;
    }
}
