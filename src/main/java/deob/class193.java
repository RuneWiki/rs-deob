package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gb")
public class class193 implements class195 {

    @ObfuscatedName("gb.f")
    public static final class193 field2370 = new class193("", 0, new class192[] { class192.field2353 });

    @ObfuscatedName("gb.i")
    public static final class193 field2359 = new class193("", 1, new class192[] { class192.field2351, class192.field2353 });

    @ObfuscatedName("gb.y")
    public static final class193 field2360 = new class193("", 2, new class192[] { class192.field2351, class192.field2355, class192.field2353 });

    @ObfuscatedName("gb.w")
    public static final class193 field2361 = new class193("", 3, new class192[] { class192.field2351 });

    @ObfuscatedName("gb.p")
    public static final class193 field2369 = new class193("", 4);

    @ObfuscatedName("gb.b")
    public static final class193 field2363 = new class193("", 5, new class192[] { class192.field2351, class192.field2353 });

    @ObfuscatedName("gb.e")
    public static final class193 field2364 = new class193("", 6, new class192[] { class192.field2353 });

    @ObfuscatedName("gb.x")
    public static final class193 field2374 = new class193("", 8, new class192[] { class192.field2351, class192.field2353 });

    @ObfuscatedName("gb.a")
    public static final class193 field2366 = new class193("", 9, new class192[] { class192.field2351, class192.field2355 });

    @ObfuscatedName("gb.d")
    public static final class193 field2371 = new class193("", 10, new class192[] { class192.field2351 });

    @ObfuscatedName("gb.c")
    public static final class193 field2368 = new class193("", 11, new class192[] { class192.field2351 });

    @ObfuscatedName("gb.o")
    public static final class193 field2362 = new class193("", 12, new class192[] { class192.field2351, class192.field2353 });

    @ObfuscatedName("gb.v")
    public static final class193 field2365 = new class193("", 13, new class192[] { class192.field2351 });

    @ObfuscatedName("gb.k")
    public final int field2358;

    @ObfuscatedName("gb.s")
    public final Set field2372 = new HashSet();

    static {
        method3332();
    }

    @ObfuscatedName("gb.f(I)[Lgb;")
    public static class193[] method3332() {
        return new class193[] { field2370, field2366, field2361, field2360, field2365, field2364, field2371, field2359, field2362, field2374, field2369, field2368, field2363 };
    }

    public class193(String arg0, int arg1) {
        this.field2358 = arg1;
    }

    public class193(String arg0, int arg1, class192[] arg2) {
        this.field2358 = arg1;
        class192[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class192 var6 = var4[var5];
            this.field2372.add(var6);
        }
    }

    @ObfuscatedName("gb.i(B)I")
    public int method28() {
        return this.field2358;
    }
}
