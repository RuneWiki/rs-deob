package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gw")
public class class202 implements class204 {

    @ObfuscatedName("gw.n")
    public static final class202 field2421 = new class202("", 0, new class201[] { class201.field2398 });

    @ObfuscatedName("gw.v")
    public static final class202 field2403 = new class202("", 1, new class201[] { class201.field2399, class201.field2398 });

    @ObfuscatedName("gw.d")
    public static final class202 field2405 = new class202("", 2, new class201[] { class201.field2399, class201.field2402, class201.field2398 });

    @ObfuscatedName("gw.c")
    public static final class202 field2406 = new class202("", 3, new class201[] { class201.field2399 });

    @ObfuscatedName("gw.y")
    public static final class202 field2404 = new class202("", 4);

    @ObfuscatedName("gw.h")
    public static final class202 field2408 = new class202("", 5, new class201[] { class201.field2399, class201.field2398 });

    @ObfuscatedName("gw.z")
    public static final class202 field2409 = new class202("", 6, new class201[] { class201.field2398 });

    @ObfuscatedName("gw.e")
    public static final class202 field2416 = new class202("", 8, new class201[] { class201.field2399, class201.field2398 });

    @ObfuscatedName("gw.q")
    public static final class202 field2411 = new class202("", 9, new class201[] { class201.field2399, class201.field2402 });

    @ObfuscatedName("gw.l")
    public static final class202 field2412 = new class202("", 10, new class201[] { class201.field2399 });

    @ObfuscatedName("gw.s")
    public static final class202 field2413 = new class202("", 11, new class201[] { class201.field2399 });

    @ObfuscatedName("gw.b")
    public static final class202 field2414 = new class202("", 12, new class201[] { class201.field2399, class201.field2398 });

    @ObfuscatedName("gw.a")
    public static final class202 field2415 = new class202("", 13, new class201[] { class201.field2399 });

    @ObfuscatedName("gw.w")
    public final int field2407;

    @ObfuscatedName("gw.k")
    public final Set field2417 = new HashSet();

    static {
        method3547();
    }

    @ObfuscatedName("gw.n(S)[Lgw;")
    public static class202[] method3547() {
        return new class202[] { field2403, field2406, field2408, field2416, field2421, field2411, field2415, field2413, field2414, field2405, field2409, field2404, field2412 };
    }

    public class202(String arg0, int arg1) {
        this.field2407 = arg1;
    }

    public class202(String arg0, int arg1, class201[] arg2) {
        this.field2407 = arg1;
        class201[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class201 var6 = var4[var5];
            this.field2417.add(var6);
        }
    }

    @ObfuscatedName("gw.v(B)I")
    public int method30() {
        return this.field2407;
    }
}
