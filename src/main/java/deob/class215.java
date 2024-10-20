package deob;

import java.util.Arrays;

@ObfuscatedName("io")
public class class215 {

    @ObfuscatedName("io.au")
    public static final class215 field2383 = new class215(6, 8, 8);

    @ObfuscatedName("io.ae")
    public static final class215 field2381 = new class215(3, 16, 16);

    @ObfuscatedName("io.ao")
    public static final class215 field2382 = new class215(0, 32, 32);

    @ObfuscatedName("io.at")
    public static final class215 field2380 = new class215(2, 48, 48);

    @ObfuscatedName("io.ac")
    public static final class215 field2387 = new class215(4, 64, 64);

    @ObfuscatedName("io.ai")
    public static final class215 field2385 = new class215(5, 96, 96);

    @ObfuscatedName("io.az")
    public static final class215 field2386 = new class215(1, 128, 128);

    @ObfuscatedName("io.ap")
    public final int field2391;

    @ObfuscatedName("io.aa")
    public final int field2384;

    @ObfuscatedName("io.af")
    public final int field2389;

    @ObfuscatedName("io.ad")
    public static final class215[] field2388 = method5056();

    static {
        Arrays.sort(field2388, new class220());
    }

    @ObfuscatedName("kf.au(I)[Lio;")
    public static class215[] method5056() {
        return new class215[] { field2382, field2386, field2380, field2381, field2387, field2385, field2383 };
    }

    public class215(int arg0, int arg1, int arg2) {
        this.field2391 = arg0;
        this.field2384 = arg1;
        this.field2389 = arg2;
    }

    @ObfuscatedName("io.ae(S)I")
    public int method3863() {
        return this.field2389 * this.field2384;
    }
}
