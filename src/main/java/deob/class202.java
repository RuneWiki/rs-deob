package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("ge")
public class class202 implements class204 {

    @ObfuscatedName("ge.h")
    public static final class202 field2403 = new class202("", 0, new class201[] { class201.field2390 });

    @ObfuscatedName("ge.v")
    public static final class202 field2393 = new class202("", 1, new class201[] { class201.field2389, class201.field2390 });

    @ObfuscatedName("ge.x")
    public static final class202 field2392 = new class202("", 2, new class201[] { class201.field2389, class201.field2388, class201.field2390 });

    @ObfuscatedName("ge.w")
    public static final class202 field2398 = new class202("", 3, new class201[] { class201.field2389 });

    @ObfuscatedName("ge.t")
    public static final class202 field2396 = new class202("", 4);

    @ObfuscatedName("ge.j")
    public static final class202 field2397 = new class202("", 5, new class201[] { class201.field2389, class201.field2390 });

    @ObfuscatedName("ge.n")
    public static final class202 field2407 = new class202("", 6, new class201[] { class201.field2390 });

    @ObfuscatedName("ge.p")
    public static final class202 field2399 = new class202("", 8, new class201[] { class201.field2389, class201.field2390 });

    @ObfuscatedName("ge.l")
    public static final class202 field2400 = new class202("", 9, new class201[] { class201.field2389, class201.field2388 });

    @ObfuscatedName("ge.z")
    public static final class202 field2401 = new class202("", 10, new class201[] { class201.field2389 });

    @ObfuscatedName("ge.u")
    public static final class202 field2402 = new class202("", 11, new class201[] { class201.field2389 });

    @ObfuscatedName("ge.e")
    public static final class202 field2394 = new class202("", 12, new class201[] { class201.field2389, class201.field2390 });

    @ObfuscatedName("ge.m")
    public static final class202 field2404 = new class202("", 13, new class201[] { class201.field2389 });

    @ObfuscatedName("ge.c")
    public final int field2395;

    @ObfuscatedName("ge.i")
    public final Set field2405 = new HashSet();

    public class202(String arg0, int arg1) {
        this.field2395 = arg1;
    }

    public class202(String arg0, int arg1, class201[] arg2) {
        this.field2395 = arg1;
        class201[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class201 var6 = var4[var5];
            this.field2405.add(var6);
        }
    }

    @ObfuscatedName("ge.x(I)I")
    public int method18() {
        return this.field2395;
    }
}
