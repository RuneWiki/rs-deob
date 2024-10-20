package deob;

@ObfuscatedName("bt")
public class class65 {

    @ObfuscatedName("bt.c")
    public final class264 field746;

    @ObfuscatedName("bt.i")
    public final int field748;

    @ObfuscatedName("bt.o")
    public int field745 = 0;

    public class65(class264 arg0, String arg1) {
        this.field746 = arg0;
        this.field748 = arg0.method4204();
    }

    @ObfuscatedName("bt.c(B)Z")
    public boolean method984() {
        this.field745 = 0;
        for (int var1 = 0; var1 < this.field748; var1++) {
            if (!this.field746.method4320(var1) || this.field746.method4307(var1)) {
                this.field745++;
            }
        }
        return this.field745 >= this.field748;
    }
}
