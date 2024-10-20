package deob;

@ObfuscatedName("b")
public class class25 {

    @ObfuscatedName("b.c")
    public static final class25 field352 = new class25("SMALL", 2, 0, 4);

    @ObfuscatedName("b.o")
    public static final class25 field343 = new class25("MEDIUM", 0, 1, 2);

    @ObfuscatedName("b.i")
    public static final class25 field344 = new class25("LARGE", 1, 2, 0);

    @ObfuscatedName("b.u")
    public final String field345;

    @ObfuscatedName("b.g")
    public final int field350;

    @ObfuscatedName("b.m")
    public final int field346;

    @ObfuscatedName("b.s")
    public final int field348;

    @ObfuscatedName("b.c(B)[Lb;")
    public static class25[] method163() {
        return new class25[] { field352, field343, field344 };
    }

    public class25(String arg0, int arg1, int arg2, int arg3) {
        this.field345 = arg0;
        this.field350 = arg1;
        this.field346 = arg2;
        this.field348 = arg3;
    }

    @ObfuscatedName("b.o(FI)Z")
    public boolean method164(float arg0) {
        return arg0 >= (float) this.field348;
    }
}
