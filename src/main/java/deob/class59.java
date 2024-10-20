package deob;

@ObfuscatedName("bs")
public class class59 {

    @ObfuscatedName("bs.n")
    public final class236 field522;

    @ObfuscatedName("bs.v")
    public final int field519;

    @ObfuscatedName("bs.u")
    public int field520 = 0;

    public class59(class236 arg0, String arg1) {
        this.field522 = arg0;
        this.field519 = arg0.method3739();
    }

    @ObfuscatedName("bs.z(I)Z")
    public boolean method1012() {
        this.field520 = 0;
        for (int var1 = 0; var1 < this.field519; var1++) {
            if (!this.field522.method3850(var1) || this.field522.method3849(var1)) {
                this.field520++;
            }
        }
        return this.field520 >= this.field519;
    }
}
