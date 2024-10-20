package deob;

@ObfuscatedName("jy")
public class class251 extends class263 {

    @ObfuscatedName("jy.aj")
    public final int field2912;

    @ObfuscatedName("jy.al")
    public final class258 field2909;

    @ObfuscatedName("jy.ac")
    public final int field2910;

    @ObfuscatedName("jy.ab")
    public final int field2911;

    public class251(class304 arg0, class304 arg1, int arg2, class258 arg3) {
        super(arg0, arg1);
        this.field2912 = arg2;
        this.field2909 = arg3;
        class185 var5 = class185.method2778(this.method4426());
        class492 var6 = var5.method3251(false);
        if (var6 == null) {
            this.field2910 = 0;
            this.field2911 = 0;
        } else {
            this.field2910 = var6.field5006;
            this.field2911 = var6.field4996;
        }
    }

    @ObfuscatedName("jy.al(B)I")
    public int method4426() {
        return this.field2912;
    }

    @ObfuscatedName("jy.ac(I)Ljb;")
    public class258 method4427() {
        return this.field2909;
    }

    @ObfuscatedName("jy.ab(I)I")
    public int method4428() {
        return this.field2910;
    }

    @ObfuscatedName("jy.an(B)I")
    public int method4429() {
        return this.field2911;
    }
}
