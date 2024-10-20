package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gc")
public class class202 implements class204 {

    @ObfuscatedName("gc.f")
    public static final class202 field2401 = new class202("", 0, new class201[] { class201.field2393 });

    @ObfuscatedName("gc.b")
    public static final class202 field2397 = new class202("", 1, new class201[] { class201.field2391, class201.field2393 });

    @ObfuscatedName("gc.l")
    public static final class202 field2396 = new class202("", 2, new class201[] { class201.field2391, class201.field2392, class201.field2393 });

    @ObfuscatedName("gc.m")
    public static final class202 field2399 = new class202("", 3, new class201[] { class201.field2391 });

    @ObfuscatedName("gc.z")
    public static final class202 field2398 = new class202("", 4);

    @ObfuscatedName("gc.q")
    public static final class202 field2406 = new class202("", 5, new class201[] { class201.field2391, class201.field2393 });

    @ObfuscatedName("gc.k")
    public static final class202 field2403 = new class202("", 6, new class201[] { class201.field2393 });

    @ObfuscatedName("gc.c")
    public static final class202 field2402 = new class202("", 8, new class201[] { class201.field2391, class201.field2393 });

    @ObfuscatedName("gc.u")
    public static final class202 field2404 = new class202("", 9, new class201[] { class201.field2391, class201.field2392 });

    @ObfuscatedName("gc.t")
    public static final class202 field2405 = new class202("", 10, new class201[] { class201.field2391 });

    @ObfuscatedName("gc.e")
    public static final class202 field2410 = new class202("", 11, new class201[] { class201.field2391 });

    @ObfuscatedName("gc.o")
    public static final class202 field2407 = new class202("", 12, new class201[] { class201.field2391, class201.field2393 });

    @ObfuscatedName("gc.n")
    public static final class202 field2408 = new class202("", 13, new class201[] { class201.field2391 });

    @ObfuscatedName("gc.x")
    public final int field2409;

    @ObfuscatedName("gc.p")
    public final Set field2400 = new HashSet();

    static {
        method3480();
    }

    @ObfuscatedName("gc.f(B)[Lgc;")
    public static class202[] method3480() {
        return new class202[] { field2405, field2410, field2397, field2404, field2402, field2407, field2396, field2401, field2403, field2398, field2406, field2399, field2408 };
    }

    public class202(String arg0, int arg1) {
        this.field2409 = arg1;
    }

    public class202(String arg0, int arg1, class201[] arg2) {
        this.field2409 = arg1;
        class201[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class201 var6 = var4[var5];
            this.field2400.add(var6);
        }
    }

    @ObfuscatedName("gc.m(B)I")
    public int method31() {
        return this.field2409;
    }
}
