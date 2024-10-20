package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("pr")
public class class391 implements class388 {

    @ObfuscatedName("pr.am")
    public static final class391 field4472 = new class391("", 0, new class387[] { class387.field4442, class387.field4441 });

    @ObfuscatedName("pr.ap")
    public static final class391 field4460 = new class391("", 1, new class387[] { class387.field4439, class387.field4442, class387.field4441 });

    @ObfuscatedName("pr.af")
    public static final class391 field4461 = new class391("", 2, new class387[] { class387.field4439, class387.field4440, class387.field4442 });

    @ObfuscatedName("pr.aj")
    public static final class391 field4462 = new class391("", 3, new class387[] { class387.field4439 });

    @ObfuscatedName("pr.aq")
    public static final class391 field4469 = new class391("", 4);

    @ObfuscatedName("pr.ar")
    public static final class391 field4464 = new class391("", 5, new class387[] { class387.field4439, class387.field4442 });

    @ObfuscatedName("pr.ag")
    public static final class391 field4466 = new class391("", 6, new class387[] { class387.field4442 });

    @ObfuscatedName("pr.ao")
    public static final class391 field4463 = new class391("", 8, new class387[] { class387.field4439, class387.field4442 });

    @ObfuscatedName("pr.ae")
    public static final class391 field4467 = new class391("", 9, new class387[] { class387.field4439, class387.field4440 });

    @ObfuscatedName("pr.aa")
    public static final class391 field4459 = new class391("", 10, new class387[] { class387.field4439 });

    @ObfuscatedName("pr.au")
    public static final class391 field4465 = new class391("", 11, new class387[] { class387.field4439 });

    @ObfuscatedName("pr.an")
    public static final class391 field4470 = new class391("", 12, new class387[] { class387.field4439, class387.field4442 });

    @ObfuscatedName("pr.ad")
    public static final class391 field4471 = new class391("", 13, new class387[] { class387.field4439 });

    @ObfuscatedName("pr.ax")
    public final int field4468;

    @ObfuscatedName("pr.aw")
    public final Set field4473 = new HashSet();

    static {
        method6648();
    }

    @ObfuscatedName("pr.am(I)[Lpr;")
    public static class391[] method6648() {
        return new class391[] { field4464, field4466, field4460, field4467, field4461, field4471, field4469, field4470, field4472, field4459, field4463, field4465, field4462 };
    }

    public class391(String arg0, int arg1) {
        this.field4468 = arg1;
    }

    public class391(String arg0, int arg1, class387[] arg2) {
        this.field4468 = arg1;
        class387[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class387 var6 = var4[var5];
            this.field4473.add(var6);
        }
    }

    @ObfuscatedName("pr.ap(I)I")
    public int method34() {
        return this.field4468;
    }
}
