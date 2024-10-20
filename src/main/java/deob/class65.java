package deob;

@ObfuscatedName("bn")
public class class65 {

    @ObfuscatedName("bn.t")
    public final class264 field733;

    @ObfuscatedName("bn.q")
    public final int field742;

    @ObfuscatedName("bn.i")
    public int field735 = 0;

    public class65(class264 arg0, String arg1) {
        this.field733 = arg0;
        this.field742 = arg0.method4205();
    }

    @ObfuscatedName("bn.t(I)Z")
    public boolean method1018() {
        this.field735 = 0;
        for (int var1 = 0; var1 < this.field742; var1++) {
            if (!this.field733.method4330(var1) || this.field733.method4310(var1)) {
                this.field735++;
            }
        }
        return this.field735 >= this.field742;
    }
}
