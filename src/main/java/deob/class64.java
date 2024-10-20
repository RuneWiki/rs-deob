package deob;

@ObfuscatedName("bp")
public class class64 {

    @ObfuscatedName("bp.s")
    public final class249 field743;

    @ObfuscatedName("bp.g")
    public final int field742;

    @ObfuscatedName("bp.m")
    public int field744 = 0;

    public class64(class249 arg0, String arg1) {
        this.field743 = arg0;
        this.field742 = arg0.method4197();
    }

    @ObfuscatedName("bp.s(I)Z")
    public boolean method943() {
        this.field744 = 0;
        for (int var1 = 0; var1 < this.field742; var1++) {
            if (!this.field743.method4286(var1) || this.field743.method4285(var1)) {
                this.field744++;
            }
        }
        return this.field744 >= this.field742;
    }
}
