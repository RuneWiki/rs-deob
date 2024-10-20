package deob;

@ObfuscatedName("ev")
public class class155 implements class113 {

    @ObfuscatedName("ev.a")
    public static final class155 field2286 = new class155("runescape", "RuneScape", 0);

    @ObfuscatedName("ev.w")
    public static final class155 field2285 = new class155("stellardawn", "Stellar Dawn", 1);

    @ObfuscatedName("ev.d")
    public static final class155 field2282 = new class155("game3", "Game 3", 2);

    @ObfuscatedName("ev.c")
    public static final class155 field2283 = new class155("game4", "Game 4", 3);

    @ObfuscatedName("ev.y")
    public static final class155 field2284 = new class155("game5", "Game 5", 4);

    @ObfuscatedName("ev.k")
    public static final class155 field2287 = new class155("oldscape", "RuneScape 2007", 5);

    @ObfuscatedName("ev.r")
    public final String field2281;

    @ObfuscatedName("ev.p")
    public final int field2280;

    @ObfuscatedName("client.a(I)[Lev;")
    public static class155[] method626() {
        return new class155[] { field2286, field2285, field2284, field2287, field2283, field2282 };
    }

    public class155(String arg0, String arg1, int arg2) {
        this.field2281 = arg0;
        this.field2280 = arg2;
    }

    @ObfuscatedName("ev.w(I)I")
    public int method628() {
        return this.field2280;
    }
}
