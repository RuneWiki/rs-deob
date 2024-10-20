package deob;

@ObfuscatedName("dp")
public class class82 {

    @ObfuscatedName("dp.al")
    public final class338 field1016;

    @ObfuscatedName("dp.ac")
    public final int field1017;

    @ObfuscatedName("dp.ab")
    public int field1019 = 0;

    public class82(class338 arg0, String arg1) {
        this.field1016 = arg0;
        this.field1017 = arg0.method5870();
    }

    @ObfuscatedName("dp.aj(I)Z")
    public boolean method2131() {
        this.field1019 = 0;
        for (int var1 = 0; var1 < this.field1017; var1++) {
            if (!this.field1016.method5820(var1) || this.field1016.method5849(var1)) {
                this.field1019++;
            }
        }
        return this.field1019 >= this.field1017;
    }
}
