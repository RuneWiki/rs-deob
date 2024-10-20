package deob;

import java.util.Arrays;

@ObfuscatedName("iv")
public class class229 {

    @ObfuscatedName("iv.am")
    public static final class229 field2435 = new class229(6, 8, 8);

    @ObfuscatedName("iv.ap")
    public static final class229 field2438 = new class229(1, 16, 16);

    @ObfuscatedName("iv.af")
    public static final class229 field2429 = new class229(2, 32, 32);

    @ObfuscatedName("iv.aj")
    public static final class229 field2431 = new class229(4, 48, 48);

    @ObfuscatedName("iv.aq")
    public static final class229 field2427 = new class229(3, 64, 64);

    @ObfuscatedName("iv.ar")
    public static final class229 field2432 = new class229(0, 96, 96);

    @ObfuscatedName("iv.ag")
    public static final class229 field2433 = new class229(5, 128, 128);

    @ObfuscatedName("iv.ao")
    public final int field2434;

    @ObfuscatedName("iv.ae")
    public final int field2430;

    @ObfuscatedName("iv.aa")
    public final int field2436;

    @ObfuscatedName("iv.au")
    public static final class229[] field2437 = method4009();

    static {
        Arrays.sort(field2437, new class234());
    }

    @ObfuscatedName("ik.am(B)[Liv;")
    public static class229[] method4009() {
        return new class229[] { field2432, field2438, field2429, field2427, field2431, field2433, field2435 };
    }

    public class229(int arg0, int arg1, int arg2) {
        this.field2434 = arg0;
        this.field2430 = arg1;
        this.field2436 = arg2;
    }

    @ObfuscatedName("iv.ap(B)I")
    public int method4116() {
        return this.field2436 * this.field2430;
    }
}
