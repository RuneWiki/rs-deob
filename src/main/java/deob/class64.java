package deob;

@ObfuscatedName("bu")
public class class64 {

    @ObfuscatedName("bu.b")
    public final class258 field713;

    @ObfuscatedName("bu.q")
    public final int field712;

    @ObfuscatedName("bu.o")
    public int field711 = 0;

    public class64(class258 arg0, String arg1) {
        this.field713 = arg0;
        this.field712 = arg0.method4173();
    }

    @ObfuscatedName("bu.b(I)Z")
    public boolean method1009() {
        this.field711 = 0;
        for (int var1 = 0; var1 < this.field712; var1++) {
            if (!this.field713.method4275(var1) || this.field713.method4296(var1)) {
                this.field711++;
            }
        }
        return this.field711 >= this.field712;
    }
}
