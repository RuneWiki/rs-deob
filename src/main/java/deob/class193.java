package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("go")
public class class193 implements class195 {

    @ObfuscatedName("go.u")
    public static final class193 field2382 = new class193("", 0, new class192[] { class192.field2376 });

    @ObfuscatedName("go.f")
    public static final class193 field2379 = new class193("", 1, new class192[] { class192.field2373, class192.field2376 });

    @ObfuscatedName("go.b")
    public static final class193 field2380 = new class193("", 2, new class192[] { class192.field2373, class192.field2377, class192.field2376 });

    @ObfuscatedName("go.g")
    public static final class193 field2393 = new class193("", 3, new class192[] { class192.field2373 });

    @ObfuscatedName("go.z")
    public static final class193 field2391 = new class193("", 4);

    @ObfuscatedName("go.p")
    public static final class193 field2385 = new class193("", 5, new class192[] { class192.field2373, class192.field2376 });

    @ObfuscatedName("go.h")
    public static final class193 field2384 = new class193("", 6, new class192[] { class192.field2376 });

    @ObfuscatedName("go.y")
    public static final class193 field2386 = new class193("", 8, new class192[] { class192.field2373, class192.field2376 });

    @ObfuscatedName("go.w")
    public static final class193 field2390 = new class193("", 9, new class192[] { class192.field2373, class192.field2377 });

    @ObfuscatedName("go.i")
    public static final class193 field2387 = new class193("", 10, new class192[] { class192.field2373 });

    @ObfuscatedName("go.k")
    public static final class193 field2388 = new class193("", 11, new class192[] { class192.field2373 });

    @ObfuscatedName("go.x")
    public static final class193 field2389 = new class193("", 12, new class192[] { class192.field2373, class192.field2376 });

    @ObfuscatedName("go.o")
    public static final class193 field2383 = new class193("", 13, new class192[] { class192.field2373 });

    @ObfuscatedName("go.e")
    public final int field2381;

    @ObfuscatedName("go.n")
    public final Set field2392 = new HashSet();

    static {
        method3399();
    }

    @ObfuscatedName("go.u(I)[Lgo;")
    public static class193[] method3399() {
        return new class193[] { field2384, field2380, field2393, field2389, field2388, field2385, field2386, field2379, field2387, field2391, field2390, field2383, field2382 };
    }

    public class193(String arg0, int arg1) {
        this.field2381 = arg1;
    }

    public class193(String arg0, int arg1, class192[] arg2) {
        this.field2381 = arg1;
        class192[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class192 var6 = var4[var5];
            this.field2392.add(var6);
        }
    }

    @ObfuscatedName("go.g(B)I")
    public int method26() {
        return this.field2381;
    }
}
