package deob;

@ObfuscatedName("c")
public class class25 {

    @ObfuscatedName("c.i")
    public static final class25 field368 = new class25("SMALL", 0, 0, 4);

    @ObfuscatedName("c.h")
    public static final class25 field358 = new class25("MEDIUM", 2, 1, 2);

    @ObfuscatedName("c.u")
    public static final class25 field359 = new class25("LARGE", 1, 2, 0);

    @ObfuscatedName("c.q")
    public final String field360;

    @ObfuscatedName("c.g")
    public final int field361;

    @ObfuscatedName("c.v")
    public final int field362;

    @ObfuscatedName("c.t")
    public final int field369;

    @ObfuscatedName("c.i(I)[Lc;")
    public static class25[] method159() {
        return new class25[] { field359, field358, field368 };
    }

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field360 = arg0;
        this.field361 = arg1;
        this.field362 = arg2;
        this.field369 = arg3;
    }

    @ObfuscatedName("c.h(FI)Z")
    public boolean method161(float arg0) {
        return arg0 >= (float) this.field369;
    }
}
