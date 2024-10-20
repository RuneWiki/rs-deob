package deob;

@ObfuscatedName("bd")
public class class59 {

    @ObfuscatedName("bd.f")
    public final class247 field506;

    @ObfuscatedName("bd.q")
    public final int field508;

    @ObfuscatedName("bd.w")
    public int field512 = 0;

    public class59(class247 arg0, String arg1) {
        this.field506 = arg0;
        this.field508 = arg0.method4205();
    }

    @ObfuscatedName("bd.m(I)Z")
    public boolean method1011() {
        this.field512 = 0;
        for (int var1 = 0; var1 < this.field508; var1++) {
            if (!this.field506.method4272(var1) || this.field506.method4271(var1)) {
                this.field512++;
            }
        }
        return this.field512 >= this.field508;
    }
}
