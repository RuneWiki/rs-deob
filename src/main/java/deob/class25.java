package deob;

@ObfuscatedName("l")
public class class25 {

    @ObfuscatedName("l.w")
    public static final class25 field379 = new class25("SMALL", 2, 0, 4);

    @ObfuscatedName("l.s")
    public static final class25 field370 = new class25("MEDIUM", 0, 1, 2);

    @ObfuscatedName("l.q")
    public static final class25 field371 = new class25("LARGE", 1, 2, 0);

    @ObfuscatedName("l.o")
    public final String field372;

    @ObfuscatedName("l.g")
    public final int field375;

    @ObfuscatedName("l.v")
    public final int field374;

    @ObfuscatedName("l.p")
    public final int field369;

    @ObfuscatedName("l.w(B)[Ll;")
    public static class25[] method168() {
        return new class25[] { field370, field379, field371 };
    }

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field372 = arg0;
        this.field375 = arg1;
        this.field374 = arg2;
        this.field369 = arg3;
    }

    @ObfuscatedName("l.s(FI)Z")
    public boolean method174(float arg0) {
        return arg0 >= (float) this.field369;
    }
}
