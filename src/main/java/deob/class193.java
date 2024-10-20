package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gd")
public class class193 implements class195 {

    @ObfuscatedName("gd.q")
    public static final class193 field2376 = new class193("", 0, new class192[] { class192.field2365 });

    @ObfuscatedName("gd.w")
    public static final class193 field2368 = new class193("", 1, new class192[] { class192.field2363, class192.field2365 });

    @ObfuscatedName("gd.e")
    public static final class193 field2369 = new class193("", 2, new class192[] { class192.field2363, class192.field2366, class192.field2365 });

    @ObfuscatedName("gd.p")
    public static final class193 field2382 = new class193("", 3, new class192[] { class192.field2363 });

    @ObfuscatedName("gd.k")
    public static final class193 field2371 = new class193("", 4);

    @ObfuscatedName("gd.l")
    public static final class193 field2374 = new class193("", 5, new class192[] { class192.field2363, class192.field2365 });

    @ObfuscatedName("gd.b")
    public static final class193 field2373 = new class193("", 6, new class192[] { class192.field2365 });

    @ObfuscatedName("gd.i")
    public static final class193 field2377 = new class193("", 8, new class192[] { class192.field2363, class192.field2365 });

    @ObfuscatedName("gd.c")
    public static final class193 field2375 = new class193("", 9, new class192[] { class192.field2363, class192.field2366 });

    @ObfuscatedName("gd.f")
    public static final class193 field2370 = new class193("", 10, new class192[] { class192.field2363 });

    @ObfuscatedName("gd.m")
    public static final class193 field2372 = new class193("", 11, new class192[] { class192.field2363 });

    @ObfuscatedName("gd.u")
    public static final class193 field2378 = new class193("", 12, new class192[] { class192.field2363, class192.field2365 });

    @ObfuscatedName("gd.x")
    public static final class193 field2379 = new class193("", 13, new class192[] { class192.field2363 });

    @ObfuscatedName("gd.r")
    public final int field2380;

    @ObfuscatedName("gd.v")
    public final Set field2381 = new HashSet();

    static {
        method3349();
    }

    @ObfuscatedName("gd.q(I)[Lgd;")
    public static class193[] method3349() {
        return new class193[] { field2378, field2375, field2370, field2379, field2373, field2374, field2382, field2368, field2372, field2371, field2377, field2369, field2376 };
    }

    public class193(String arg0, int arg1) {
        this.field2380 = arg1;
    }

    public class193(String arg0, int arg1, class192[] arg2) {
        this.field2380 = arg1;
        class192[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class192 var6 = var4[var5];
            this.field2381.add(var6);
        }
    }

    @ObfuscatedName("gd.e(I)I")
    public int method30() {
        return this.field2380;
    }
}
