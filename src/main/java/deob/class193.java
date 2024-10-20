package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gm")
public class class193 implements class195 {

    @ObfuscatedName("gm.s")
    public static final class193 field2361 = new class193("", 0, new class192[] { class192.field2347 });

    @ObfuscatedName("gm.j")
    public static final class193 field2351 = new class193("", 1, new class192[] { class192.field2346, class192.field2347 });

    @ObfuscatedName("gm.i")
    public static final class193 field2364 = new class193("", 2, new class192[] { class192.field2346, class192.field2348, class192.field2347 });

    @ObfuscatedName("gm.k")
    public static final class193 field2362 = new class193("", 3, new class192[] { class192.field2346 });

    @ObfuscatedName("gm.u")
    public static final class193 field2368 = new class193("", 4);

    @ObfuscatedName("gm.n")
    public static final class193 field2352 = new class193("", 5, new class192[] { class192.field2346, class192.field2347 });

    @ObfuscatedName("gm.t")
    public static final class193 field2356 = new class193("", 6, new class192[] { class192.field2347 });

    @ObfuscatedName("gm.q")
    public static final class193 field2357 = new class193("", 8, new class192[] { class192.field2346, class192.field2347 });

    @ObfuscatedName("gm.x")
    public static final class193 field2358 = new class193("", 9, new class192[] { class192.field2346, class192.field2348 });

    @ObfuscatedName("gm.d")
    public static final class193 field2359 = new class193("", 10, new class192[] { class192.field2346 });

    @ObfuscatedName("gm.f")
    public static final class193 field2360 = new class193("", 11, new class192[] { class192.field2346 });

    @ObfuscatedName("gm.c")
    public static final class193 field2355 = new class193("", 12, new class192[] { class192.field2346, class192.field2347 });

    @ObfuscatedName("gm.r")
    public static final class193 field2367 = new class193("", 13, new class192[] { class192.field2346 });

    @ObfuscatedName("gm.y")
    public final int field2363;

    @ObfuscatedName("gm.p")
    public final Set field2353 = new HashSet();

    public class193(String arg0, int arg1) {
        this.field2363 = arg1;
    }

    public class193(String arg0, int arg1, class192[] arg2) {
        this.field2363 = arg1;
        class192[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class192 var6 = var4[var5];
            this.field2353.add(var6);
        }
    }

    @ObfuscatedName("gm.j(B)I")
    public int method34() {
        return this.field2363;
    }
}
