package deob;

@ObfuscatedName("mv")
public class class326 implements class321 {

    @ObfuscatedName("mv.ab")
    public static final class326 field3523 = new class326(14, 0);

    @ObfuscatedName("mv.ay")
    public static final class326 field3531 = new class326(15, 20);

    @ObfuscatedName("mv.an")
    public static final class326 field3522 = new class326(16, -2);

    @ObfuscatedName("mv.au")
    public static final class326 field3524 = new class326(18, -2);

    @ObfuscatedName("mv.ax")
    public static final class326 field3521 = new class326(19, -2);

    @ObfuscatedName("mv.ao")
    public static final class326 field3525 = new class326(20, 58);

    @ObfuscatedName("mv.am")
    public static final class326 field3520 = new class326(21, 37);

    @ObfuscatedName("mv.ac")
    public static final class326 field3527 = new class326(27, 0);

    @ObfuscatedName("mv.ae")
    public final int field3526;

    @ObfuscatedName("mv.ad")
    public final int field3529;

    @ObfuscatedName("mv.aq")
    public static final class326[] field3530 = new class326[32];

    static {
        class326[] var0 = method673();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3530[var0[var1].field3526] = var0[var1];
        }
    }

    @ObfuscatedName("bp.ab(B)[Lmv;")
    public static class326[] method673() {
        return new class326[] { field3521, field3527, field3524, field3531, field3520, field3525, field3523, field3522 };
    }

    public class326(int arg0, int arg1) {
        this.field3526 = arg0;
        this.field3529 = arg1;
    }
}
