package deob;

@ObfuscatedName("bh")
public class class54 {

    @ObfuscatedName("bh.f")
    public final class252 field491;

    @ObfuscatedName("bh.h")
    public final int field493;

    @ObfuscatedName("bh.e")
    public int field492 = 0;

    public class54(class252 arg0, String arg1) {
        this.field491 = arg0;
        this.field493 = arg0.method4280();
    }

    @ObfuscatedName("bh.f(I)Z")
    public boolean method940() {
        this.field492 = 0;
        for (int var1 = 0; var1 < this.field493; var1++) {
            if (!this.field491.method4388(var1) || this.field491.method4373(var1)) {
                this.field492++;
            }
        }
        return this.field492 >= this.field493;
    }
}
