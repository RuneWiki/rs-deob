package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gp")
public class class193 implements class195 {

    @ObfuscatedName("gp.c")
    public static final class193 field2381 = new class193("", 0, new class192[] { class192.field2374 });

    @ObfuscatedName("gp.t")
    public static final class193 field2376 = new class193("", 1, new class192[] { class192.field2369, class192.field2374 });

    @ObfuscatedName("gp.o")
    public static final class193 field2377 = new class193("", 2, new class192[] { class192.field2369, class192.field2371, class192.field2374 });

    @ObfuscatedName("gp.e")
    public static final class193 field2383 = new class193("", 3, new class192[] { class192.field2369 });

    @ObfuscatedName("gp.i")
    public static final class193 field2379 = new class193("", 4);

    @ObfuscatedName("gp.g")
    public static final class193 field2380 = new class193("", 5, new class192[] { class192.field2369, class192.field2374 });

    @ObfuscatedName("gp.d")
    public static final class193 field2378 = new class193("", 6, new class192[] { class192.field2374 });

    @ObfuscatedName("gp.l")
    public static final class193 field2391 = new class193("", 8, new class192[] { class192.field2369, class192.field2374 });

    @ObfuscatedName("gp.j")
    public static final class193 field2385 = new class193("", 9, new class192[] { class192.field2369, class192.field2371 });

    @ObfuscatedName("gp.m")
    public static final class193 field2384 = new class193("", 10, new class192[] { class192.field2369 });

    @ObfuscatedName("gp.p")
    public static final class193 field2396 = new class193("", 11, new class192[] { class192.field2369 });

    @ObfuscatedName("gp.h")
    public static final class193 field2386 = new class193("", 12, new class192[] { class192.field2369, class192.field2374 });

    @ObfuscatedName("gp.v")
    public static final class193 field2375 = new class193("", 13, new class192[] { class192.field2369 });

    @ObfuscatedName("gp.n")
    public final int field2388;

    @ObfuscatedName("gp.x")
    public final Set field2389 = new HashSet();

    static {
        method3407();
    }

    @ObfuscatedName("gp.c(B)[Lgp;")
    public static class193[] method3407() {
        return new class193[] { field2377, field2391, field2379, field2396, field2383, field2384, field2378, field2376, field2386, field2381, field2380, field2385, field2375 };
    }

    public class193(String arg0, int arg1) {
        this.field2388 = arg1;
    }

    public class193(String arg0, int arg1, class192[] arg2) {
        this.field2388 = arg1;
        class192[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class192 var6 = var4[var5];
            this.field2389.add(var6);
        }
    }

    @ObfuscatedName("gp.e(B)I")
    public int method33() {
        return this.field2388;
    }
}
