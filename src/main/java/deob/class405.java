package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("ps")
public class class405 implements class402 {

    @ObfuscatedName("ps.ab")
    public static final class405 field4608 = new class405("", 0, new class401[] { class401.field4584, class401.field4586 });

    @ObfuscatedName("ps.ay")
    public static final class405 field4621 = new class405("", 1, new class401[] { class401.field4585, class401.field4584, class401.field4586 });

    @ObfuscatedName("ps.an")
    public static final class405 field4609 = new class405("", 2, new class401[] { class401.field4585, class401.field4587, class401.field4584 });

    @ObfuscatedName("ps.au")
    public static final class405 field4610 = new class405("", 3, new class401[] { class401.field4585 });

    @ObfuscatedName("ps.ax")
    public static final class405 field4611 = new class405("", 4);

    @ObfuscatedName("ps.ao")
    public static final class405 field4617 = new class405("", 5, new class401[] { class401.field4585, class401.field4584 });

    @ObfuscatedName("ps.am")
    public static final class405 field4607 = new class405("", 6, new class401[] { class401.field4584 });

    @ObfuscatedName("ps.ac")
    public static final class405 field4614 = new class405("", 8, new class401[] { class401.field4585, class401.field4584 });

    @ObfuscatedName("ps.ae")
    public static final class405 field4612 = new class405("", 9, new class401[] { class401.field4585, class401.field4587 });

    @ObfuscatedName("ps.ad")
    public static final class405 field4613 = new class405("", 10, new class401[] { class401.field4585 });

    @ObfuscatedName("ps.aq")
    public static final class405 field4616 = new class405("", 11, new class401[] { class401.field4585 });

    @ObfuscatedName("ps.al")
    public static final class405 field4618 = new class405("", 12, new class401[] { class401.field4585, class401.field4584 });

    @ObfuscatedName("ps.aj")
    public static final class405 field4619 = new class405("", 13, new class401[] { class401.field4585 });

    @ObfuscatedName("ps.as")
    public final int field4620;

    @ObfuscatedName("ps.aw")
    public final Set field4623 = new HashSet();

    public class405(String arg0, int arg1) {
        this.field4620 = arg1;
    }

    public class405(String arg0, int arg1, class401[] arg2) {
        this.field4620 = arg1;
        class401[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class401 var6 = var4[var5];
            this.field4623.add(var6);
        }
    }

    @ObfuscatedName("ps.ab(B)I")
    public int method33() {
        return this.field4620;
    }
}
