package deob;

import java.util.Arrays;

@ObfuscatedName("ka")
public class class270 {

    @ObfuscatedName("ka.ab")
    public static final class270 field2956 = new class270(5, 8, 8);

    @ObfuscatedName("ka.ay")
    public static final class270 field2951 = new class270(4, 16, 16);

    @ObfuscatedName("ka.an")
    public static final class270 field2952 = new class270(2, 32, 32);

    @ObfuscatedName("ka.au")
    public static final class270 field2953 = new class270(6, 48, 48);

    @ObfuscatedName("ka.ax")
    public static final class270 field2962 = new class270(1, 64, 64);

    @ObfuscatedName("ka.ao")
    public static final class270 field2955 = new class270(0, 96, 96);

    @ObfuscatedName("ka.am")
    public static final class270 field2954 = new class270(3, 128, 128);

    @ObfuscatedName("ka.ac")
    public final int field2957;

    @ObfuscatedName("ka.ae")
    public final int field2958;

    @ObfuscatedName("ka.ad")
    public final int field2959;

    @ObfuscatedName("ka.aq")
    public static final class270[] field2960;

    static {
        class270[] var0 = new class270[] { field2955, field2962, field2952, field2954, field2951, field2956, field2953 };
        field2960 = var0;
        Arrays.sort(field2960, new class278());
    }

    public class270(int arg0, int arg1, int arg2) {
        this.field2957 = arg0;
        this.field2958 = arg1;
        this.field2959 = arg2;
    }

    @ObfuscatedName("ka.ab(B)I")
    public int method4992() {
        return this.field2959 * this.field2958;
    }
}
