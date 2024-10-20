package deob;

import java.util.Arrays;

@ObfuscatedName("kl")
public class class272 {

    @ObfuscatedName("kl.ap")
    public static final class272 field3027 = new class272(1, 8, 8);

    @ObfuscatedName("kl.aw")
    public static final class272 field3026 = new class272(4, 16, 16);

    @ObfuscatedName("kl.ak")
    public static final class272 field3018 = new class272(2, 32, 32);

    @ObfuscatedName("kl.aj")
    public static final class272 field3016 = new class272(0, 48, 48);

    @ObfuscatedName("kl.ai")
    public static final class272 field3017 = new class272(5, 64, 64);

    @ObfuscatedName("kl.ay")
    public static final class272 field3021 = new class272(3, 96, 96);

    @ObfuscatedName("kl.as")
    public static final class272 field3020 = new class272(6, 128, 128);

    @ObfuscatedName("kl.ae")
    public final int field3023;

    @ObfuscatedName("kl.am")
    public final int field3024;

    @ObfuscatedName("kl.at")
    public final int field3025;

    @ObfuscatedName("kl.au")
    public static final class272[] field3022;

    static {
        class272[] var0 = new class272[] { field3016, field3027, field3018, field3021, field3026, field3017, field3020 };
        field3022 = var0;
        Arrays.sort(field3022, new class279());
    }

    public class272(int arg0, int arg1, int arg2) {
        this.field3023 = arg0;
        this.field3024 = arg1;
        this.field3025 = arg2;
    }

    @ObfuscatedName("kl.ap(B)I")
    public int method5303() {
        return this.field3025 * this.field3024;
    }
}
