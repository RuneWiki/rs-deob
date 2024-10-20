package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("ne")
public class class360 implements class357 {

    @ObfuscatedName("ne.af")
    public static final class360 field4352 = new class360("", 0, new class356[] { class356.field4308 });

    @ObfuscatedName("ne.an")
    public static final class360 field4334 = new class360("", 1, new class356[] { class356.field4309, class356.field4308 });

    @ObfuscatedName("ne.aw")
    public static final class360 field4335 = new class360("", 2, new class356[] { class356.field4309, class356.field4310, class356.field4308 });

    @ObfuscatedName("ne.ac")
    public static final class360 field4344 = new class360("", 3, new class356[] { class356.field4309 });

    @ObfuscatedName("ne.au")
    public static final class360 field4337 = new class360("", 4);

    @ObfuscatedName("ne.ab")
    public static final class360 field4340 = new class360("", 5, new class356[] { class356.field4309, class356.field4308 });

    @ObfuscatedName("ne.aq")
    public static final class360 field4333 = new class360("", 6, new class356[] { class356.field4308 });

    @ObfuscatedName("ne.al")
    public static final class360 field4336 = new class360("", 8, new class356[] { class356.field4309, class356.field4308 });

    @ObfuscatedName("ne.at")
    public static final class360 field4341 = new class360("", 9, new class356[] { class356.field4309, class356.field4310 });

    @ObfuscatedName("ne.aa")
    public static final class360 field4342 = new class360("", 10, new class356[] { class356.field4309 });

    @ObfuscatedName("ne.ay")
    public static final class360 field4343 = new class360("", 11, new class356[] { class356.field4309 });

    @ObfuscatedName("ne.ao")
    public static final class360 field4350 = new class360("", 12, new class356[] { class356.field4309, class356.field4308 });

    @ObfuscatedName("ne.ax")
    public static final class360 field4338 = new class360("", 13, new class356[] { class356.field4309 });

    @ObfuscatedName("ne.ai")
    public final int field4346;

    @ObfuscatedName("ne.ag")
    public final Set field4347 = new HashSet();

    static {
        method6306();
    }

    @ObfuscatedName("ne.au(B)[Lne;")
    public static class360[] method6306() {
        return new class360[] { field4333, field4341, field4340, field4352, field4344, field4343, field4334, field4350, field4336, field4335, field4337, field4338, field4342 };
    }

    public class360(String arg0, int arg1) {
        this.field4346 = arg1;
    }

    public class360(String arg0, int arg1, class356[] arg2) {
        this.field4346 = arg1;
        class356[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class356 var6 = var4[var5];
            this.field4347.add(var6);
        }
    }

    @ObfuscatedName("ne.af(I)I")
    public int method39() {
        return this.field4346;
    }
}
