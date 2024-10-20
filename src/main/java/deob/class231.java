package deob;

import java.util.Arrays;

@ObfuscatedName("ir")
public class class231 {

    @ObfuscatedName("ir.az")
    public static final class231 field2466 = new class231(1, 8, 8);

    @ObfuscatedName("ir.ah")
    public static final class231 field2459 = new class231(0, 16, 16);

    @ObfuscatedName("ir.af")
    public static final class231 field2461 = new class231(2, 32, 32);

    @ObfuscatedName("ir.at")
    public static final class231 field2462 = new class231(5, 48, 48);

    @ObfuscatedName("ir.an")
    public static final class231 field2463 = new class231(3, 64, 64);

    @ObfuscatedName("ir.ao")
    public static final class231 field2464 = new class231(4, 96, 96);

    @ObfuscatedName("ir.ab")
    public static final class231 field2460 = new class231(6, 128, 128);

    @ObfuscatedName("ir.aw")
    public final int field2465;

    @ObfuscatedName("ir.ad")
    public final int field2467;

    @ObfuscatedName("ir.al")
    public final int field2468;

    @ObfuscatedName("ir.as")
    public static final class231[] field2469;

    static {
        class231[] var0 = new class231[] { field2459, field2466, field2461, field2463, field2464, field2462, field2460 };
        field2469 = var0;
        Arrays.sort(field2469, new class236());
    }

    public class231(int arg0, int arg1, int arg2) {
        this.field2465 = arg0;
        this.field2467 = arg1;
        this.field2468 = arg2;
    }

    @ObfuscatedName("ir.az(B)I")
    public int method4034() {
        return this.field2468 * this.field2467;
    }
}
