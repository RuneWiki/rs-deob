package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gd")
public class class202 implements class204 {

    @ObfuscatedName("gd.x")
    public static final class202 field2376 = new class202("", 0, new class201[] { class201.field2371 });

    @ObfuscatedName("gd.m")
    public static final class202 field2383 = new class202("", 1, new class201[] { class201.field2372, class201.field2371 });

    @ObfuscatedName("gd.k")
    public static final class202 field2375 = new class202("", 2, new class201[] { class201.field2372, class201.field2370, class201.field2371 });

    @ObfuscatedName("gd.d")
    public static final class202 field2377 = new class202("", 3, new class201[] { class201.field2372 });

    @ObfuscatedName("gd.w")
    public static final class202 field2379 = new class202("", 4);

    @ObfuscatedName("gd.v")
    public static final class202 field2380 = new class202("", 5, new class201[] { class201.field2372, class201.field2371 });

    @ObfuscatedName("gd.q")
    public static final class202 field2381 = new class202("", 6, new class201[] { class201.field2371 });

    @ObfuscatedName("gd.z")
    public static final class202 field2382 = new class202("", 8, new class201[] { class201.field2372, class201.field2371 });

    @ObfuscatedName("gd.t")
    public static final class202 field2378 = new class202("", 9, new class201[] { class201.field2372, class201.field2370 });

    @ObfuscatedName("gd.e")
    public static final class202 field2384 = new class202("", 10, new class201[] { class201.field2372 });

    @ObfuscatedName("gd.s")
    public static final class202 field2385 = new class202("", 11, new class201[] { class201.field2372 });

    @ObfuscatedName("gd.p")
    public static final class202 field2386 = new class202("", 12, new class201[] { class201.field2372, class201.field2371 });

    @ObfuscatedName("gd.n")
    public static final class202 field2387 = new class202("", 13, new class201[] { class201.field2372 });

    @ObfuscatedName("gd.u")
    public final int field2388;

    @ObfuscatedName("gd.h")
    public final Set field2389 = new HashSet();

    static {
        method3429();
    }

    @ObfuscatedName("gd.x(I)[Lgd;")
    public static class202[] method3429() {
        return new class202[] { field2380, field2386, field2387, field2377, field2385, field2381, field2382, field2378, field2379, field2375, field2376, field2383, field2384 };
    }

    public class202(String arg0, int arg1) {
        this.field2388 = arg1;
    }

    public class202(String arg0, int arg1, class201[] arg2) {
        this.field2388 = arg1;
        class201[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class201 var6 = var4[var5];
            this.field2389.add(var6);
        }
    }

    @ObfuscatedName("gd.d(B)I")
    public int method26() {
        return this.field2388;
    }
}
