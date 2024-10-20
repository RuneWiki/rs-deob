package deob;

@ObfuscatedName("d")
public class class25 {

    @ObfuscatedName("d.n")
    public static final class25 field367 = new class25("SMALL", 0, 0, 4);

    @ObfuscatedName("d.p")
    public static final class25 field366 = new class25("MEDIUM", 1, 1, 2);

    @ObfuscatedName("d.i")
    public static final class25 field373 = new class25("LARGE", 2, 2, 0);

    @ObfuscatedName("d.j")
    public final String field368;

    @ObfuscatedName("d.f")
    public final int field369;

    @ObfuscatedName("d.m")
    public final int field365;

    @ObfuscatedName("d.c")
    public final int field371;

    @ObfuscatedName("d.n(I)[Ld;")
    public static class25[] method188() {
        return new class25[] { field373, field366, field367 };
    }

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field368 = arg0;
        this.field369 = arg1;
        this.field365 = arg2;
        this.field371 = arg3;
    }

    @ObfuscatedName("d.p(FI)Z")
    public boolean method185(float arg0) {
        return arg0 >= (float) this.field371;
    }
}
