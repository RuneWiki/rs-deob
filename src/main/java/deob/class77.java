package deob;

@ObfuscatedName("bu")
public class class77 {

    @ObfuscatedName("bu.p")
    public final class315 field1019;

    @ObfuscatedName("bu.f")
    public final int field1017;

    @ObfuscatedName("bu.n")
    public int field1018 = 0;

    public class77(class315 arg0, String arg1) {
        this.field1019 = arg0;
        this.field1017 = arg0.method5426();
    }

    @ObfuscatedName("bu.c(B)Z")
    public boolean method2114() {
        this.field1018 = 0;
        for (int var1 = 0; var1 < this.field1017; var1++) {
            if (!this.field1019.method5379(var1) || this.field1019.method5378(var1)) {
                this.field1018++;
            }
        }
        return this.field1018 >= this.field1017;
    }
}
