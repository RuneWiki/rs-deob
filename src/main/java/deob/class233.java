package deob;

import java.util.Arrays;

@ObfuscatedName("im")
public class class233 {

    @ObfuscatedName("im.ak")
    public static final class233 field2496 = new class233(0, 8, 8);

    @ObfuscatedName("im.al")
    public static final class233 field2501 = new class233(5, 16, 16);

    @ObfuscatedName("im.aj")
    public static final class233 field2497 = new class233(4, 32, 32);

    @ObfuscatedName("im.az")
    public static final class233 field2498 = new class233(3, 48, 48);

    @ObfuscatedName("im.af")
    public static final class233 field2499 = new class233(6, 64, 64);

    @ObfuscatedName("im.aa")
    public static final class233 field2495 = new class233(1, 96, 96);

    @ObfuscatedName("im.at")
    public static final class233 field2506 = new class233(2, 128, 128);

    @ObfuscatedName("im.ab")
    public final int field2502;

    @ObfuscatedName("im.ac")
    public final int field2500;

    @ObfuscatedName("im.ao")
    public final int field2504;

    @ObfuscatedName("im.ah")
    public static final class233[] field2505;

    static {
        class233[] var0 = new class233[] { field2496, field2495, field2506, field2498, field2497, field2501, field2499 };
        field2505 = var0;
        Arrays.sort(field2505, new class241());
    }

    public class233(int arg0, int arg1, int arg2) {
        this.field2502 = arg0;
        this.field2500 = arg1;
        this.field2504 = arg2;
    }

    @ObfuscatedName("im.ak(B)I")
    public int method4144() {
        return this.field2504 * this.field2500;
    }
}
