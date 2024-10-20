package deob;

import java.util.Arrays;

@ObfuscatedName("ic")
public class class231 {

    @ObfuscatedName("ic.aq")
    public static final class231 field2451 = new class231(0, 8, 8);

    @ObfuscatedName("ic.aw")
    public static final class231 field2447 = new class231(6, 16, 16);

    @ObfuscatedName("ic.al")
    public static final class231 field2448 = new class231(3, 32, 32);

    @ObfuscatedName("ic.ai")
    public static final class231 field2449 = new class231(1, 48, 48);

    @ObfuscatedName("ic.ar")
    public static final class231 field2450 = new class231(2, 64, 64);

    @ObfuscatedName("ic.as")
    public static final class231 field2446 = new class231(4, 96, 96);

    @ObfuscatedName("ic.aa")
    public static final class231 field2452 = new class231(5, 128, 128);

    @ObfuscatedName("ic.az")
    public final int field2453;

    @ObfuscatedName("ic.ao")
    public final int field2454;

    @ObfuscatedName("ic.au")
    public final int field2455;

    @ObfuscatedName("ic.ak")
    public static final class231[] field2456 = method6302();

    static {
        Arrays.sort(field2456, new class236());
    }

    @ObfuscatedName("nh.aq(I)[Lic;")
    public static class231[] method6302() {
        return new class231[] { field2451, field2449, field2450, field2448, field2446, field2452, field2447 };
    }

    public class231(int arg0, int arg1, int arg2) {
        this.field2453 = arg0;
        this.field2454 = arg1;
        this.field2455 = arg2;
    }

    @ObfuscatedName("ic.aw(I)I")
    public int method4103() {
        return this.field2455 * this.field2454;
    }
}
