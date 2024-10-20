package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("gy")
public class class202 implements class204 {

    @ObfuscatedName("gy.z")
    public static final class202 field2414 = new class202("", 0, new class201[] { class201.field2402 });

    @ObfuscatedName("gy.k")
    public static final class202 field2406 = new class202("", 1, new class201[] { class201.field2400, class201.field2402 });

    @ObfuscatedName("gy.s")
    public static final class202 field2407 = new class202("", 2, new class201[] { class201.field2400, class201.field2403, class201.field2402 });

    @ObfuscatedName("gy.t")
    public static final class202 field2408 = new class202("", 3, new class201[] { class201.field2400 });

    @ObfuscatedName("gy.i")
    public static final class202 field2410 = new class202("", 4);

    @ObfuscatedName("gy.o")
    public static final class202 field2417 = new class202("", 5, new class201[] { class201.field2400, class201.field2402 });

    @ObfuscatedName("gy.x")
    public static final class202 field2411 = new class202("", 6, new class201[] { class201.field2402 });

    @ObfuscatedName("gy.w")
    public static final class202 field2412 = new class202("", 8, new class201[] { class201.field2400, class201.field2402 });

    @ObfuscatedName("gy.g")
    public static final class202 field2409 = new class202("", 9, new class201[] { class201.field2400, class201.field2403 });

    @ObfuscatedName("gy.m")
    public static final class202 field2405 = new class202("", 10, new class201[] { class201.field2400 });

    @ObfuscatedName("gy.n")
    public static final class202 field2415 = new class202("", 11, new class201[] { class201.field2400 });

    @ObfuscatedName("gy.d")
    public static final class202 field2416 = new class202("", 12, new class201[] { class201.field2400, class201.field2402 });

    @ObfuscatedName("gy.h")
    public static final class202 field2413 = new class202("", 13, new class201[] { class201.field2400 });

    @ObfuscatedName("gy.a")
    public final int field2418;

    @ObfuscatedName("gy.q")
    public final Set field2419 = new HashSet();

    static {
        method3465();
    }

    @ObfuscatedName("gy.z(I)[Lgy;")
    public static class202[] method3465() {
        return new class202[] { field2412, field2408, field2405, field2409, field2410, field2415, field2413, field2416, field2407, field2414, field2411, field2406, field2417 };
    }

    public class202(String arg0, int arg1) {
        this.field2418 = arg1;
    }

    public class202(String arg0, int arg1, class201[] arg2) {
        this.field2418 = arg1;
        class201[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class201 var6 = var4[var5];
            this.field2419.add(var6);
        }
    }

    @ObfuscatedName("gy.s(I)I")
    public int method28() {
        return this.field2418;
    }
}
