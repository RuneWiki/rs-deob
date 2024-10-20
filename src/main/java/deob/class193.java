package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gh")
public class class193 implements class195 {

    @ObfuscatedName("gh.c")
    public static final class193 field2346 = new class193("", 0, new class192[] { class192.field2338 });

    @ObfuscatedName("gh.x")
    public static final class193 field2339 = new class193("", 1, new class192[] { class192.field2332, class192.field2338 });

    @ObfuscatedName("gh.t")
    public static final class193 field2344 = new class193("", 2, new class192[] { class192.field2332, class192.field2331, class192.field2338 });

    @ObfuscatedName("gh.g")
    public static final class193 field2341 = new class193("", 3, new class192[] { class192.field2332 });

    @ObfuscatedName("gh.l")
    public static final class193 field2340 = new class193("", 4);

    @ObfuscatedName("gh.u")
    public static final class193 field2342 = new class193("", 5, new class192[] { class192.field2332, class192.field2338 });

    @ObfuscatedName("gh.j")
    public static final class193 field2345 = new class193("", 6, new class192[] { class192.field2338 });

    @ObfuscatedName("gh.v")
    public static final class193 field2343 = new class193("", 8, new class192[] { class192.field2332, class192.field2338 });

    @ObfuscatedName("gh.d")
    public static final class193 field2347 = new class193("", 9, new class192[] { class192.field2332, class192.field2331 });

    @ObfuscatedName("gh.z")
    public static final class193 field2348 = new class193("", 10, new class192[] { class192.field2332 });

    @ObfuscatedName("gh.n")
    public static final class193 field2349 = new class193("", 11, new class192[] { class192.field2332 });

    @ObfuscatedName("gh.h")
    public static final class193 field2350 = new class193("", 12, new class192[] { class192.field2332, class192.field2338 });

    @ObfuscatedName("gh.f")
    public static final class193 field2351 = new class193("", 13, new class192[] { class192.field2332 });

    @ObfuscatedName("gh.s")
    public final int field2352;

    @ObfuscatedName("gh.p")
    public final Set field2353 = new HashSet();

    static {
        method3381();
    }

    @ObfuscatedName("gh.x(I)[Lgh;")
    public static class193[] method3381() {
        return new class193[] { field2344, field2339, field2345, field2343, field2349, field2348, field2350, field2346, field2340, field2351, field2342, field2347, field2341 };
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

    @ObfuscatedName("gh.c(I)I")
    public int method22() {
        return this.field2352;
    }
}
