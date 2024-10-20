package deob;

@ObfuscatedName("mf")
public class class315 implements class310 {

    @ObfuscatedName("mf.aq")
    public static final class315 field3436 = new class315(14, 0);

    @ObfuscatedName("mf.aw")
    public static final class315 field3426 = new class315(15, 4);

    @ObfuscatedName("mf.al")
    public static final class315 field3425 = new class315(16, -2);

    @ObfuscatedName("mf.ai")
    public static final class315 field3427 = new class315(18, -2);

    @ObfuscatedName("mf.ar")
    public static final class315 field3434 = new class315(19, -2);

    @ObfuscatedName("mf.as")
    public static final class315 field3430 = new class315(20, 58);

    @ObfuscatedName("mf.aa")
    public static final class315 field3431 = new class315(21, 37);

    @ObfuscatedName("mf.az")
    public static final class315 field3428 = new class315(27, 0);

    @ObfuscatedName("mf.ao")
    public final int field3433;

    @ObfuscatedName("mf.au")
    public final int field3432;

    @ObfuscatedName("mf.ak")
    public static final class315[] field3435 = new class315[32];

    static {
        class315[] var0 = method3217();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3435[var0[var1].field3433] = var0[var1];
        }
    }

    @ObfuscatedName("gs.aq(I)[Lmf;")
    public static class315[] method3217() {
        return new class315[] { field3436, field3425, field3430, field3431, field3428, field3426, field3434, field3427 };
    }

    public class315(int arg0, int arg1) {
        this.field3433 = arg0;
        this.field3432 = arg1;
    }
}
