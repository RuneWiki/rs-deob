package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("pm")
public class class395 implements class392 {

    @ObfuscatedName("pm.az")
    public static final class395 field4532 = new class395("", 0, new class391[] { class391.field4506, class391.field4505 });

    @ObfuscatedName("pm.ah")
    public static final class395 field4522 = new class395("", 1, new class391[] { class391.field4507, class391.field4506, class391.field4505 });

    @ObfuscatedName("pm.af")
    public static final class395 field4524 = new class395("", 2, new class391[] { class391.field4507, class391.field4504, class391.field4506 });

    @ObfuscatedName("pm.at")
    public static final class395 field4523 = new class395("", 3, new class391[] { class391.field4507 });

    @ObfuscatedName("pm.an")
    public static final class395 field4525 = new class395("", 4);

    @ObfuscatedName("pm.ao")
    public static final class395 field4526 = new class395("", 5, new class391[] { class391.field4507, class391.field4506 });

    @ObfuscatedName("pm.ab")
    public static final class395 field4531 = new class395("", 6, new class391[] { class391.field4506 });

    @ObfuscatedName("pm.aw")
    public static final class395 field4528 = new class395("", 8, new class391[] { class391.field4507, class391.field4506 });

    @ObfuscatedName("pm.ad")
    public static final class395 field4534 = new class395("", 9, new class391[] { class391.field4507, class391.field4504 });

    @ObfuscatedName("pm.al")
    public static final class395 field4530 = new class395("", 10, new class391[] { class391.field4507 });

    @ObfuscatedName("pm.as")
    public static final class395 field4535 = new class395("", 11, new class391[] { class391.field4507 });

    @ObfuscatedName("pm.ag")
    public static final class395 field4521 = new class395("", 12, new class391[] { class391.field4507, class391.field4506 });

    @ObfuscatedName("pm.ai")
    public static final class395 field4533 = new class395("", 13, new class391[] { class391.field4507 });

    @ObfuscatedName("pm.ax")
    public final int field4527;

    @ObfuscatedName("pm.ar")
    public final Set field4529 = new HashSet();

    static {
        method6563();
    }

    @ObfuscatedName("pm.at(I)[Lpm;")
    public static class395[] method6563() {
        return new class395[] { field4523, field4526, field4522, field4528, field4534, field4530, field4521, field4524, field4525, field4533, field4535, field4531, field4532 };
    }

    public class395(String arg0, int arg1) {
        this.field4527 = arg1;
    }

    public class395(String arg0, int arg1, class391[] arg2) {
        this.field4527 = arg1;
        class391[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class391 var6 = var4[var5];
            this.field4529.add(var6);
        }
    }

    @ObfuscatedName("pm.az(I)I")
    public int method38() {
        return this.field4527;
    }
}
