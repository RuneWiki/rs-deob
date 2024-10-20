package deob;

import java.util.Arrays;

@ObfuscatedName("ik")
public class class214 {

    @ObfuscatedName("ik.at")
    public static final class214 field2378 = new class214(5, 8, 8);

    @ObfuscatedName("ik.an")
    public static final class214 field2377 = new class214(1, 16, 16);

    @ObfuscatedName("ik.av")
    public static final class214 field2368 = new class214(6, 32, 32);

    @ObfuscatedName("ik.as")
    public static final class214 field2371 = new class214(0, 48, 48);

    @ObfuscatedName("ik.ax")
    public static final class214 field2372 = new class214(4, 64, 64);

    @ObfuscatedName("ik.ap")
    public static final class214 field2373 = new class214(3, 96, 96);

    @ObfuscatedName("ik.ab")
    public static final class214 field2374 = new class214(2, 128, 128);

    @ObfuscatedName("ik.ak")
    public final int field2375;

    @ObfuscatedName("ik.ae")
    public final int field2376;

    @ObfuscatedName("ik.af")
    public final int field2370;

    @ObfuscatedName("ik.ao")
    public static final class214[] field2369 = method2812();

    static {
        Arrays.sort(field2369, new class219());
    }

    @ObfuscatedName("ej.at(I)[Lik;")
    public static class214[] method2812() {
        return new class214[] { field2371, field2377, field2374, field2373, field2372, field2378, field2368 };
    }

    public class214(int arg0, int arg1, int arg2) {
        this.field2375 = arg0;
        this.field2376 = arg1;
        this.field2370 = arg2;
    }

    @ObfuscatedName("ik.an(I)I")
    public int method3858() {
        return this.field2376 * this.field2370;
    }
}
