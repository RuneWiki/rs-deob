package deob;

@ObfuscatedName("b")
public class class25 {

    @ObfuscatedName("b.p")
    public static final class25 field344 = new class25("SMALL", 0, 0, 4);

    @ObfuscatedName("b.i")
    public static final class25 field337 = new class25("MEDIUM", 1, 1, 2);

    @ObfuscatedName("b.w")
    public static final class25 field341 = new class25("LARGE", 2, 2, 0);

    @ObfuscatedName("b.s")
    public final String field339;

    @ObfuscatedName("b.j")
    public final int field340;

    @ObfuscatedName("b.a")
    public final int field343;

    @ObfuscatedName("b.t")
    public final int field342;

    @ObfuscatedName("b.p(I)[Lb;")
    public static class25[] method175() {
        return new class25[] { field344, field341, field337 };
    }

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field339 = arg0;
        this.field340 = arg1;
        this.field343 = arg2;
        this.field342 = arg3;
    }

    @ObfuscatedName("b.i(FI)Z")
    public boolean method174(float arg0) {
        return arg0 >= (float) this.field342;
    }
}
