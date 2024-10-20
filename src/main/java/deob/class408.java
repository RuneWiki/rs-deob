package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("pa")
public class class408 implements class405 {

    @ObfuscatedName("pa.ap")
    public static final class408 field4722 = new class408("", 0, new class404[] { class404.field4687, class404.field4690 });

    @ObfuscatedName("pa.aw")
    public static final class408 field4706 = new class408("", 1, new class404[] { class404.field4689, class404.field4687, class404.field4690 });

    @ObfuscatedName("pa.ak")
    public static final class408 field4715 = new class408("", 2, new class404[] { class404.field4689, class404.field4688, class404.field4687 });

    @ObfuscatedName("pa.aj")
    public static final class408 field4708 = new class408("", 3, new class404[] { class404.field4689 });

    @ObfuscatedName("pa.ai")
    public static final class408 field4711 = new class408("", 4);

    @ObfuscatedName("pa.ay")
    public static final class408 field4710 = new class408("", 5, new class404[] { class404.field4689, class404.field4687 });

    @ObfuscatedName("pa.as")
    public static final class408 field4709 = new class408("", 6, new class404[] { class404.field4687 });

    @ObfuscatedName("pa.ae")
    public static final class408 field4712 = new class408("", 8, new class404[] { class404.field4689, class404.field4687 });

    @ObfuscatedName("pa.am")
    public static final class408 field4713 = new class408("", 9, new class404[] { class404.field4689, class404.field4688 });

    @ObfuscatedName("pa.at")
    public static final class408 field4714 = new class408("", 10, new class404[] { class404.field4689 });

    @ObfuscatedName("pa.au")
    public static final class408 field4705 = new class408("", 11, new class404[] { class404.field4689 });

    @ObfuscatedName("pa.an")
    public static final class408 field4716 = new class408("", 12, new class404[] { class404.field4689, class404.field4687 });

    @ObfuscatedName("pa.ao")
    public static final class408 field4717 = new class408("", 13, new class404[] { class404.field4689 });

    @ObfuscatedName("pa.af")
    public final int field4718;

    @ObfuscatedName("pa.ar")
    public final Set field4707 = new HashSet();

    static {
        method7229();
    }

    @ObfuscatedName("pa.ap(I)[Lpa;")
    public static class408[] method7229() {
        return new class408[] { field4710, field4711, field4714, field4712, field4717, field4716, field4709, field4706, field4722, field4705, field4715, field4708, field4713 };
    }

    public class408(String arg0, int arg1) {
        this.field4718 = arg1;
    }

    public class408(String arg0, int arg1, class404[] arg2) {
        this.field4718 = arg1;
        class404[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class404 var6 = var4[var5];
            this.field4707.add(var6);
        }
    }

    @ObfuscatedName("pa.aw(I)I")
    public int method37() {
        return this.field4718;
    }
}
