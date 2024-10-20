package deob;

@ObfuscatedName("br")
public class class54 {

    @ObfuscatedName("br.v")
    public final class252 field511;

    @ObfuscatedName("br.s")
    public final int field512;

    @ObfuscatedName("br.o")
    public int field515 = 0;

    public class54(class252 arg0, String arg1) {
        this.field511 = arg0;
        this.field512 = arg0.method4280();
    }

    @ObfuscatedName("br.v(B)Z")
    public boolean method946() {
        this.field515 = 0;
        for (int var1 = 0; var1 < this.field512; var1++) {
            if (!this.field511.method4380(var1) || this.field511.method4378(var1)) {
                this.field515++;
            }
        }
        return this.field515 >= this.field512;
    }
}
