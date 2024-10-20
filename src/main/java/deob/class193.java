package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gm")
public class class193 implements class195 {

    @ObfuscatedName("gm.a")
    public static final class193 field2346 = new class193("", 0, new class192[] { class192.field2336 });

    @ObfuscatedName("gm.t")
    public static final class193 field2339 = new class193("", 1, new class192[] { class192.field2337, class192.field2336 });

    @ObfuscatedName("gm.n")
    public static final class193 field2351 = new class193("", 2, new class192[] { class192.field2337, class192.field2334, class192.field2336 });

    @ObfuscatedName("gm.q")
    public static final class193 field2342 = new class193("", 3, new class192[] { class192.field2337 });

    @ObfuscatedName("gm.v")
    public static final class193 field2343 = new class193("", 4);

    @ObfuscatedName("gm.l")
    public static final class193 field2340 = new class193("", 5, new class192[] { class192.field2337, class192.field2336 });

    @ObfuscatedName("gm.c")
    public static final class193 field2345 = new class193("", 6, new class192[] { class192.field2336 });

    @ObfuscatedName("gm.o")
    public static final class193 field2341 = new class193("", 8, new class192[] { class192.field2337, class192.field2336 });

    @ObfuscatedName("gm.i")
    public static final class193 field2347 = new class193("", 9, new class192[] { class192.field2337, class192.field2334 });

    @ObfuscatedName("gm.d")
    public static final class193 field2348 = new class193("", 10, new class192[] { class192.field2337 });

    @ObfuscatedName("gm.m")
    public static final class193 field2349 = new class193("", 11, new class192[] { class192.field2337 });

    @ObfuscatedName("gm.p")
    public static final class193 field2350 = new class193("", 12, new class192[] { class192.field2337, class192.field2336 });

    @ObfuscatedName("gm.h")
    public static final class193 field2344 = new class193("", 13, new class192[] { class192.field2337 });

    @ObfuscatedName("gm.k")
    public final int field2352;

    @ObfuscatedName("gm.x")
    public final Set field2353 = new HashSet();

    static {
        method3447();
    }

    @ObfuscatedName("gm.a(B)[Lgm;")
    public static class193[] method3447() {
        return new class193[] { field2345, field2339, field2340, field2346, field2350, field2347, field2343, field2342, field2349, field2351, field2344, field2341, field2348 };
    }

    public class193(String arg0, int arg1) {
        this.field2352 = arg1;
    }

    public class193(String arg0, int arg1, class192[] arg2) {
        this.field2352 = arg1;
        class192[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class192 var6 = var4[var5];
            this.field2353.add(var6);
        }
    }

    @ObfuscatedName("gm.q(I)I")
    public int method33() {
        return this.field2352;
    }
}
