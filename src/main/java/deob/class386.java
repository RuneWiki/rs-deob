package deob;

@ObfuscatedName("nx")
public class class386 {

    @ObfuscatedName("nx.c")
    public float field4384;

    @ObfuscatedName("nx.v")
    public float field4383;

    @ObfuscatedName("nx.q")
    public float field4385;

    static {
        new class386(0.0F, 0.0F, 0.0F);
        new class386(1.0F, 1.0F, 1.0F);
        new class386(1.0F, 0.0F, 0.0F);
        new class386(0.0F, 1.0F, 0.0F);
        new class386(0.0F, 0.0F, 1.0F);
    }

    public class386(float arg0, float arg1, float arg2) {
        this.field4384 = arg0;
        this.field4383 = arg1;
        this.field4385 = arg2;
    }

    @ObfuscatedName("nx.c(B)F")
    public final float method6301() {
        return (float) Math.sqrt((double) (this.field4385 * this.field4385 + this.field4384 * this.field4384 + this.field4383 * this.field4383));
    }

    public String toString() {
        return this.field4384 + ", " + this.field4383 + ", " + this.field4385;
    }
}
