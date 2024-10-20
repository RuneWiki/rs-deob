package deob;

import java.util.Arrays;

@ObfuscatedName("ic")
public class class229 {

    @ObfuscatedName("ic.ac")
    public static final class229 field2403 = new class229(5, 8, 8);

    @ObfuscatedName("ic.al")
    public static final class229 field2401 = new class229(0, 16, 16);

    @ObfuscatedName("ic.ak")
    public static final class229 field2410 = new class229(1, 32, 32);

    @ObfuscatedName("ic.ax")
    public static final class229 field2400 = new class229(6, 48, 48);

    @ObfuscatedName("ic.ao")
    public static final class229 field2404 = new class229(4, 64, 64);

    @ObfuscatedName("ic.ah")
    public static final class229 field2405 = new class229(2, 96, 96);

    @ObfuscatedName("ic.ar")
    public static final class229 field2406 = new class229(3, 128, 128);

    @ObfuscatedName("ic.ab")
    public final int field2407;

    @ObfuscatedName("ic.am")
    public final int field2408;

    @ObfuscatedName("ic.av")
    public final int field2402;

    @ObfuscatedName("ic.ag")
    public static final class229[] field2409;

    static {
        class229[] var0 = new class229[] { field2401, field2410, field2405, field2406, field2404, field2403, field2400 };
        field2409 = var0;
        Arrays.sort(field2409, new class234());
    }

    public class229(int arg0, int arg1, int arg2) {
        this.field2407 = arg0;
        this.field2408 = arg1;
        this.field2402 = arg2;
    }

    @ObfuscatedName("ic.ac(B)I")
    public int method3979() {
        return this.field2408 * this.field2402;
    }
}
