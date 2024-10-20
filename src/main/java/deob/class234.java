package deob;

import java.util.Arrays;

@ObfuscatedName("iz")
public class class234 {

    @ObfuscatedName("iz.aq")
    public static final class234 field2478 = new class234(0, 8, 8);

    @ObfuscatedName("iz.ad")
    public static final class234 field2477 = new class234(5, 16, 16);

    @ObfuscatedName("iz.ag")
    public static final class234 field2479 = new class234(3, 32, 32);

    @ObfuscatedName("iz.ak")
    public static final class234 field2485 = new class234(2, 48, 48);

    @ObfuscatedName("iz.ap")
    public static final class234 field2480 = new class234(1, 64, 64);

    @ObfuscatedName("iz.an")
    public static final class234 field2481 = new class234(4, 96, 96);

    @ObfuscatedName("iz.aj")
    public static final class234 field2482 = new class234(6, 128, 128);

    @ObfuscatedName("iz.av")
    public final int field2483;

    @ObfuscatedName("iz.ab")
    public final int field2484;

    @ObfuscatedName("iz.ai")
    public final int field2476;

    @ObfuscatedName("iz.ae")
    public static final class234[] field2486 = method2364();

    static {
        Arrays.sort(field2486, new class242());
    }

    @ObfuscatedName("dw.aq(I)[Liz;")
    public static class234[] method2364() {
        return new class234[] { field2478, field2480, field2485, field2479, field2481, field2477, field2482 };
    }

    public class234(int arg0, int arg1, int arg2) {
        this.field2483 = arg0;
        this.field2484 = arg1;
        this.field2476 = arg2;
    }

    @ObfuscatedName("iz.ad(B)I")
    public int method4087() {
        return this.field2484 * this.field2476;
    }
}
