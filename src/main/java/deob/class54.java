package deob;

@ObfuscatedName("bz")
public class class54 {

    @ObfuscatedName("bz.g")
    public final class252 field529;

    @ObfuscatedName("bz.r")
    public final int field530;

    @ObfuscatedName("bz.e")
    public int field531 = 0;

    public class54(class252 arg0, String arg1) {
        this.field529 = arg0;
        this.field530 = arg0.method4448();
    }

    @ObfuscatedName("bz.g(I)Z")
    public boolean method996() {
        this.field531 = 0;
        for (int var1 = 0; var1 < this.field530; var1++) {
            if (!this.field529.method4559(var1) || this.field529.method4535(var1)) {
                this.field531++;
            }
        }
        return this.field531 >= this.field530;
    }
}
