package deob;

import java.util.Arrays;

@ObfuscatedName("ir")
public class class216 {

    @ObfuscatedName("ir.aw")
    public static final class216 field2356 = new class216(2, 8, 8);

    @ObfuscatedName("ir.ay")
    public static final class216 field2351 = new class216(4, 16, 16);

    @ObfuscatedName("ir.ar")
    public static final class216 field2350 = new class216(1, 32, 32);

    @ObfuscatedName("ir.am")
    public static final class216 field2353 = new class216(0, 48, 48);

    @ObfuscatedName("ir.as")
    public static final class216 field2354 = new class216(6, 64, 64);

    @ObfuscatedName("ir.aj")
    public static final class216 field2355 = new class216(5, 96, 96);

    @ObfuscatedName("ir.ag")
    public static final class216 field2352 = new class216(3, 128, 128);

    @ObfuscatedName("ir.az")
    public final int field2357;

    @ObfuscatedName("ir.av")
    public final int field2358;

    @ObfuscatedName("ir.ap")
    public final int field2359;

    @ObfuscatedName("ir.aq")
    public static final class216[] field2360 = method2766();

    static {
        Arrays.sort(field2360, new class221());
    }

    @ObfuscatedName("ey.aw(I)[Lir;")
    public static class216[] method2766() {
        return new class216[] { field2353, field2350, field2356, field2352, field2351, field2355, field2354 };
    }

    public class216(int arg0, int arg1, int arg2) {
        this.field2357 = arg0;
        this.field2358 = arg1;
        this.field2359 = arg2;
    }

    @ObfuscatedName("ir.ay(I)I")
    public int method3861() {
        return this.field2359 * this.field2358;
    }
}
