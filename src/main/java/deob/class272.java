package deob;

import java.util.Arrays;

@ObfuscatedName("kx")
public class class272 {

    @ObfuscatedName("kx.ac")
    public static final class272 field3011 = new class272(1, 8, 8);

    @ObfuscatedName("kx.ae")
    public static final class272 field3007 = new class272(6, 16, 16);

    @ObfuscatedName("kx.ag")
    public static final class272 field3008 = new class272(2, 32, 32);

    @ObfuscatedName("kx.am")
    public static final class272 field3006 = new class272(0, 48, 48);

    @ObfuscatedName("kx.ax")
    public static final class272 field3010 = new class272(4, 64, 64);

    @ObfuscatedName("kx.aq")
    public static final class272 field3012 = new class272(3, 96, 96);

    @ObfuscatedName("kx.af")
    public static final class272 field3009 = new class272(5, 128, 128);

    @ObfuscatedName("kx.at")
    public final int field3013;

    @ObfuscatedName("kx.au")
    public final int field3014;

    @ObfuscatedName("kx.ar")
    public final int field3015;

    @ObfuscatedName("kx.al")
    public static final class272[] field3016 = method869();

    static {
        Arrays.sort(field3016, new class280());
    }

    @ObfuscatedName("bt.ac(I)[Lkx;")
    public static class272[] method869() {
        return new class272[] { field3006, field3011, field3008, field3012, field3010, field3009, field3007 };
    }

    public class272(int arg0, int arg1, int arg2) {
        this.field3013 = arg0;
        this.field3014 = arg1;
        this.field3015 = arg2;
    }

    @ObfuscatedName("kx.ae(B)I")
    public int method5132() {
        return this.field3015 * this.field3014;
    }
}
