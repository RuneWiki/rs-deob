package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gs")
public class class193 implements class195 {

    @ObfuscatedName("gs.z")
    public static final class193 field2363 = new class193("", 0, new class192[] { class192.field2347 });

    @ObfuscatedName("gs.n")
    public static final class193 field2352 = new class193("", 1, new class192[] { class192.field2346, class192.field2347 });

    @ObfuscatedName("gs.v")
    public static final class193 field2353 = new class193("", 2, new class192[] { class192.field2346, class192.field2345, class192.field2347 });

    @ObfuscatedName("gs.u")
    public static final class193 field2354 = new class193("", 3, new class192[] { class192.field2346 });

    @ObfuscatedName("gs.r")
    public static final class193 field2355 = new class193("", 4);

    @ObfuscatedName("gs.p")
    public static final class193 field2362 = new class193("", 5, new class192[] { class192.field2346, class192.field2347 });

    @ObfuscatedName("gs.q")
    public static final class193 field2357 = new class193("", 6, new class192[] { class192.field2347 });

    @ObfuscatedName("gs.m")
    public static final class193 field2358 = new class193("", 8, new class192[] { class192.field2346, class192.field2347 });

    @ObfuscatedName("gs.y")
    public static final class193 field2351 = new class193("", 9, new class192[] { class192.field2346, class192.field2345 });

    @ObfuscatedName("gs.i")
    public static final class193 field2360 = new class193("", 10, new class192[] { class192.field2346 });

    @ObfuscatedName("gs.c")
    public static final class193 field2361 = new class193("", 11, new class192[] { class192.field2346 });

    @ObfuscatedName("gs.b")
    public static final class193 field2356 = new class193("", 12, new class192[] { class192.field2346, class192.field2347 });

    @ObfuscatedName("gs.o")
    public static final class193 field2359 = new class193("", 13, new class192[] { class192.field2346 });

    @ObfuscatedName("gs.a")
    public final int field2364;

    @ObfuscatedName("gs.e")
    public final Set field2365 = new HashSet();

    public class193(String arg0, int arg1) {
        this.field2364 = arg1;
    }

    public class193(String arg0, int arg1, class192[] arg2) {
        this.field2364 = arg1;
        class192[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class192 var6 = var4[var5];
            this.field2365.add(var6);
        }
    }

    @ObfuscatedName("gs.v(S)I")
    public int method25() {
        return this.field2364;
    }
}
