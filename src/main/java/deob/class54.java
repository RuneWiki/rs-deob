package deob;

@ObfuscatedName("bd")
public class class54 {

    @ObfuscatedName("bd.y")
    public final class252 field520;

    @ObfuscatedName("bd.c")
    public final int field518;

    @ObfuscatedName("bd.n")
    public int field519 = 0;

    public class54(class252 arg0, String arg1) {
        this.field520 = arg0;
        this.field518 = arg0.method4269();
    }

    @ObfuscatedName("bd.y(B)Z")
    public boolean method971() {
        this.field519 = 0;
        for (int var1 = 0; var1 < this.field518; var1++) {
            if (!this.field520.method4361(var1) || this.field520.method4360(var1)) {
                this.field519++;
            }
        }
        return this.field519 >= this.field518;
    }
}
