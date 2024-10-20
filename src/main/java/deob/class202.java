package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("ge")
public class class202 implements class204 {

    @ObfuscatedName("ge.m")
    public static final class202 field2413 = new class202("", 0, new class201[] { class201.field2400 });

    @ObfuscatedName("ge.o")
    public static final class202 field2415 = new class202("", 1, new class201[] { class201.field2399, class201.field2400 });

    @ObfuscatedName("ge.q")
    public static final class202 field2405 = new class202("", 2, new class201[] { class201.field2399, class201.field2401, class201.field2400 });

    @ObfuscatedName("ge.j")
    public static final class202 field2406 = new class202("", 3, new class201[] { class201.field2399 });

    @ObfuscatedName("ge.p")
    public static final class202 field2404 = new class202("", 4);

    @ObfuscatedName("ge.g")
    public static final class202 field2407 = new class202("", 5, new class201[] { class201.field2399, class201.field2400 });

    @ObfuscatedName("ge.n")
    public static final class202 field2409 = new class202("", 6, new class201[] { class201.field2400 });

    @ObfuscatedName("ge.u")
    public static final class202 field2410 = new class202("", 8, new class201[] { class201.field2399, class201.field2400 });

    @ObfuscatedName("ge.a")
    public static final class202 field2403 = new class202("", 9, new class201[] { class201.field2399, class201.field2401 });

    @ObfuscatedName("ge.z")
    public static final class202 field2412 = new class202("", 10, new class201[] { class201.field2399 });

    @ObfuscatedName("ge.w")
    public static final class202 field2411 = new class202("", 11, new class201[] { class201.field2399 });

    @ObfuscatedName("ge.y")
    public static final class202 field2414 = new class202("", 12, new class201[] { class201.field2399, class201.field2400 });

    @ObfuscatedName("ge.c")
    public static final class202 field2419 = new class202("", 13, new class201[] { class201.field2399 });

    @ObfuscatedName("ge.h")
    public final int field2416;

    @ObfuscatedName("ge.k")
    public final Set field2417 = new HashSet();

    public class202(String arg0, int arg1) {
        this.field2416 = arg1;
    }

    public class202(String arg0, int arg1, class201[] arg2) {
        this.field2416 = arg1;
        class201[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class201 var6 = var4[var5];
            this.field2417.add(var6);
        }
    }

    @ObfuscatedName("ge.m(I)I")
    public int method21() {
        return this.field2416;
    }
}
