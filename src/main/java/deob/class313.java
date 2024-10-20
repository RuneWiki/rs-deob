package deob;

@ObfuscatedName("mi")
public class class313 implements class308 {

    @ObfuscatedName("mi.ac")
    public static final class313 field3388 = new class313(14, 0);

    @ObfuscatedName("mi.al")
    public static final class313 field3386 = new class313(15, 4);

    @ObfuscatedName("mi.ak")
    public static final class313 field3387 = new class313(16, -2);

    @ObfuscatedName("mi.ax")
    public static final class313 field3392 = new class313(18, -2);

    @ObfuscatedName("mi.ao")
    public static final class313 field3389 = new class313(19, -2);

    @ObfuscatedName("mi.ah")
    public static final class313 field3390 = new class313(27, 0);

    @ObfuscatedName("mi.ar")
    public final int field3391;

    @ObfuscatedName("mi.ab")
    public static final class313[] field3394 = new class313[32];

    static {
        class313[] var0 = method3830();
        for (int var1 = 0; var1 < var0.length; var1++) {
            field3394[var0[var1].field3391] = var0[var1];
        }
    }

    @ObfuscatedName("io.ac(I)[Lmi;")
    public static class313[] method3830() {
        return new class313[] { field3390, field3387, field3388, field3386, field3392, field3389 };
    }

    public class313(int arg0, int arg1) {
        this.field3391 = arg0;
    }
}
