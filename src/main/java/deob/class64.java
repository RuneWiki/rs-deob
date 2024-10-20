package deob;

@ObfuscatedName("ba")
public class class64 {

    @ObfuscatedName("ba.t")
    public final class275 field924;

    @ObfuscatedName("ba.v")
    public final int field925;

    @ObfuscatedName("ba.j")
    public int field927 = 0;

    public class64(class275 arg0, String arg1) {
        this.field924 = arg0;
        this.field925 = arg0.method4470();
    }

    @ObfuscatedName("ba.s(B)Z")
    public boolean method1685() {
        this.field927 = 0;
        for (int var1 = 0; var1 < this.field925; var1++) {
            if (!this.field924.method4418(var1) || this.field924.method4426(var1)) {
                this.field927++;
            }
        }
        return this.field927 >= this.field925;
    }
}
