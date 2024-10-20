package deob;

@ObfuscatedName("bo")
public class class54 {

    @ObfuscatedName("bo.f")
    public final class252 field521;

    @ObfuscatedName("bo.l")
    public final int field523;

    @ObfuscatedName("bo.w")
    public int field518 = 0;

    public class54(class252 arg0, String arg1) {
        this.field521 = arg0;
        this.field523 = arg0.method4302();
    }

    @ObfuscatedName("bo.f(I)Z")
    public boolean method955() {
        this.field518 = 0;
        for (int var1 = 0; var1 < this.field523; var1++) {
            if (!this.field521.method4402(var1) || this.field521.method4401(var1)) {
                this.field518++;
            }
        }
        return this.field518 >= this.field523;
    }
}
