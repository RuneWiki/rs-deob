package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("pc")
public class class407 implements class404 {

    @ObfuscatedName("pc.ac")
    public static final class407 field4662 = new class407("", 0, new class403[] { class403.field4639, class403.field4635 });

    @ObfuscatedName("pc.ae")
    public static final class407 field4661 = new class407("", 1, new class403[] { class403.field4637, class403.field4639, class403.field4635 });

    @ObfuscatedName("pc.ag")
    public static final class407 field4666 = new class407("", 2, new class403[] { class403.field4637, class403.field4636, class403.field4639 });

    @ObfuscatedName("pc.am")
    public static final class407 field4659 = new class407("", 3, new class403[] { class403.field4637 });

    @ObfuscatedName("pc.ax")
    public static final class407 field4663 = new class407("", 4);

    @ObfuscatedName("pc.aq")
    public static final class407 field4664 = new class407("", 5, new class403[] { class403.field4637, class403.field4639 });

    @ObfuscatedName("pc.af")
    public static final class407 field4665 = new class407("", 6, new class403[] { class403.field4639 });

    @ObfuscatedName("pc.at")
    public static final class407 field4660 = new class407("", 8, new class403[] { class403.field4637, class403.field4639 });

    @ObfuscatedName("pc.au")
    public static final class407 field4667 = new class407("", 9, new class403[] { class403.field4637, class403.field4636 });

    @ObfuscatedName("pc.ar")
    public static final class407 field4668 = new class407("", 10, new class403[] { class403.field4637 });

    @ObfuscatedName("pc.al")
    public static final class407 field4669 = new class407("", 11, new class403[] { class403.field4637 });

    @ObfuscatedName("pc.ad")
    public static final class407 field4670 = new class407("", 12, new class403[] { class403.field4637, class403.field4639 });

    @ObfuscatedName("pc.ah")
    public static final class407 field4671 = new class407("", 13, new class403[] { class403.field4637 });

    @ObfuscatedName("pc.ap")
    public final int field4672;

    @ObfuscatedName("pc.ab")
    public final Set field4673 = new HashSet();

    public class407(String arg0, int arg1) {
        this.field4672 = arg1;
    }

    public class407(String arg0, int arg1, class403[] arg2) {
        this.field4672 = arg1;
        class403[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class403 var6 = var4[var5];
            this.field4673.add(var6);
        }
    }

    @ObfuscatedName("pc.ac(I)I")
    public int method32() {
        return this.field4672;
    }
}
