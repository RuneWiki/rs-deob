package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("pl")
public class class394 implements class391 {

    @ObfuscatedName("pl.aq")
    public static final class394 field4506 = new class394("", 0, new class390[] { class390.field4477, class390.field4481 });

    @ObfuscatedName("pl.aw")
    public static final class394 field4500 = new class394("", 1, new class390[] { class390.field4479, class390.field4477, class390.field4481 });

    @ObfuscatedName("pl.al")
    public static final class394 field4501 = new class394("", 2, new class390[] { class390.field4479, class390.field4478, class390.field4477 });

    @ObfuscatedName("pl.ai")
    public static final class394 field4499 = new class394("", 3, new class390[] { class390.field4479 });

    @ObfuscatedName("pl.ar")
    public static final class394 field4514 = new class394("", 4);

    @ObfuscatedName("pl.as")
    public static final class394 field4504 = new class394("", 5, new class390[] { class390.field4479, class390.field4477 });

    @ObfuscatedName("pl.aa")
    public static final class394 field4511 = new class394("", 6, new class390[] { class390.field4477 });

    @ObfuscatedName("pl.az")
    public static final class394 field4505 = new class394("", 8, new class390[] { class390.field4479, class390.field4477 });

    @ObfuscatedName("pl.ao")
    public static final class394 field4507 = new class394("", 9, new class390[] { class390.field4479, class390.field4478 });

    @ObfuscatedName("pl.au")
    public static final class394 field4508 = new class394("", 10, new class390[] { class390.field4479 });

    @ObfuscatedName("pl.ak")
    public static final class394 field4509 = new class394("", 11, new class390[] { class390.field4479 });

    @ObfuscatedName("pl.ah")
    public static final class394 field4510 = new class394("", 12, new class390[] { class390.field4479, class390.field4477 });

    @ObfuscatedName("pl.aj")
    public static final class394 field4513 = new class394("", 13, new class390[] { class390.field4479 });

    @ObfuscatedName("pl.af")
    public final int field4512;

    @ObfuscatedName("pl.ax")
    public final Set field4503 = new HashSet();

    static {
        method6665();
    }

    @ObfuscatedName("pl.ar(B)[Lpl;")
    public static class394[] method6665() {
        return new class394[] { field4506, field4511, field4510, field4509, field4504, field4514, field4507, field4501, field4500, field4508, field4513, field4499, field4505 };
    }

    public class394(String arg0, int arg1) {
        this.field4512 = arg1;
    }

    public class394(String arg0, int arg1, class390[] arg2) {
        this.field4512 = arg1;
        class390[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class390 var6 = var4[var5];
            this.field4503.add(var6);
        }
    }

    @ObfuscatedName("pl.aq(I)I")
    public int method35() {
        return this.field4512;
    }
}
