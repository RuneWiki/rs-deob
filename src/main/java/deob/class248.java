package deob;

@ObfuscatedName("ig")
public class class248 extends class260 {

    @ObfuscatedName("ig.f")
    public final int field2916;

    @ObfuscatedName("ig.w")
    public final class255 field2913;

    @ObfuscatedName("ig.v")
    public final int field2914;

    @ObfuscatedName("ig.s")
    public final int field2915;

    public class248(class301 arg0, class301 arg1, int arg2, class255 arg3) {
        super(arg0, arg1);
        this.field2916 = arg2;
        this.field2913 = arg3;
        class183 var5 = class183.method18(this.method4535());
        class488 var6 = var5.method3318(false);
        if (var6 == null) {
            this.field2914 = 0;
            this.field2915 = 0;
        } else {
            this.field2914 = var6.field5034;
            this.field2915 = var6.field5032;
        }
    }

    @ObfuscatedName("ig.w(I)I")
    public int method4535() {
        return this.field2916;
    }

    @ObfuscatedName("ig.v(I)Lil;")
    public class255 method4528() {
        return this.field2913;
    }

    @ObfuscatedName("ig.s(B)I")
    public int method4527() {
        return this.field2914;
    }

    @ObfuscatedName("ig.z(I)I")
    public int method4530() {
        return this.field2915;
    }
}
