package deob;

@ObfuscatedName("u")
public class class25 {

    @ObfuscatedName("u.i")
    public static final class25 field358 = new class25("SMALL", 0, 0, 4);

    @ObfuscatedName("u.c")
    public static final class25 field351 = new class25("MEDIUM", 2, 1, 2);

    @ObfuscatedName("u.e")
    public static final class25 field353 = new class25("LARGE", 1, 2, 0);

    @ObfuscatedName("u.v")
    public final String field352;

    @ObfuscatedName("u.b")
    public final int field355;

    @ObfuscatedName("u.y")
    public final int field356;

    @ObfuscatedName("u.h")
    public final int field357;

    @ObfuscatedName("u.i(I)[Lu;")
    public static class25[] method157() {
        return new class25[] { field351, field353, field358 };
    }

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field352 = arg0;
        this.field355 = arg1;
        this.field356 = arg2;
        this.field357 = arg3;
    }

    @ObfuscatedName("u.c(FB)Z")
    public boolean method159(float arg0) {
        return arg0 >= (float) this.field357;
    }
}
