package deob;

import java.util.Arrays;

@ObfuscatedName("ir")
public class class226 {

    @ObfuscatedName("ir.at")
    public static final class226 field2382 = new class226(0, 8, 8);

    @ObfuscatedName("ir.ah")
    public static final class226 field2383 = new class226(1, 16, 16);

    @ObfuscatedName("ir.ar")
    public static final class226 field2384 = new class226(3, 32, 32);

    @ObfuscatedName("ir.ao")
    public static final class226 field2385 = new class226(5, 48, 48);

    @ObfuscatedName("ir.ab")
    public static final class226 field2386 = new class226(6, 64, 64);

    @ObfuscatedName("ir.au")
    public static final class226 field2387 = new class226(4, 96, 96);

    @ObfuscatedName("ir.aa")
    public static final class226 field2388 = new class226(2, 128, 128);

    @ObfuscatedName("ir.ac")
    public final int field2389;

    @ObfuscatedName("ir.al")
    public final int field2391;

    @ObfuscatedName("ir.az")
    public final int field2392;

    @ObfuscatedName("ir.ap")
    public static final class226[] field2390 = method4019();

    static {
        Arrays.sort(field2390, new class231());
    }

    @ObfuscatedName("it.at(I)[Lir;")
    public static class226[] method4019() {
        return new class226[] { field2382, field2383, field2388, field2384, field2387, field2385, field2386 };
    }

    public class226(int arg0, int arg1, int arg2) {
        this.field2389 = arg0;
        this.field2391 = arg1;
        this.field2392 = arg2;
    }

    @ObfuscatedName("ir.ah(I)I")
    public int method4015() {
        return this.field2392 * this.field2391;
    }
}
