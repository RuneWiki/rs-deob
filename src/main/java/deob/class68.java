package deob;

@ObfuscatedName("bq")
public class class68 {

    @ObfuscatedName("bq.b")
    public final class247 field561;

    @ObfuscatedName("bq.l")
    public final int field563;

    @ObfuscatedName("bq.m")
    public int field565 = 0;

    public class68(class247 arg0, String arg1) {
        this.field561 = arg0;
        this.field563 = arg0.method3918();
    }

    @ObfuscatedName("bq.f(I)Z")
    public boolean method1080() {
        this.field565 = 0;
        for (int var1 = 0; var1 < this.field563; var1++) {
            if (!this.field561.method4018(var1) || this.field561.method4015(var1)) {
                this.field565++;
            }
        }
        return this.field565 >= this.field563;
    }
}
