package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("pl")
public class class404 implements class401 {

    @ObfuscatedName("pl.aq")
    public static final class404 field4634 = new class404("", 0, new class400[] { class400.field4615, class400.field4617 });

    @ObfuscatedName("pl.ad")
    public static final class404 field4637 = new class404("", 1, new class400[] { class400.field4616, class400.field4615, class400.field4617 });

    @ObfuscatedName("pl.ag")
    public static final class404 field4635 = new class404("", 2, new class400[] { class400.field4616, class400.field4614, class400.field4615 });

    @ObfuscatedName("pl.ak")
    public static final class404 field4636 = new class404("", 3, new class400[] { class400.field4616 });

    @ObfuscatedName("pl.ap")
    public static final class404 field4633 = new class404("", 4);

    @ObfuscatedName("pl.an")
    public static final class404 field4638 = new class404("", 5, new class400[] { class400.field4616, class400.field4615 });

    @ObfuscatedName("pl.aj")
    public static final class404 field4649 = new class404("", 6, new class400[] { class400.field4615 });

    @ObfuscatedName("pl.av")
    public static final class404 field4648 = new class404("", 8, new class400[] { class400.field4616, class400.field4615 });

    @ObfuscatedName("pl.ab")
    public static final class404 field4640 = new class404("", 9, new class400[] { class400.field4616, class400.field4614 });

    @ObfuscatedName("pl.ai")
    public static final class404 field4642 = new class404("", 10, new class400[] { class400.field4616 });

    @ObfuscatedName("pl.ae")
    public static final class404 field4643 = new class404("", 11, new class400[] { class400.field4616 });

    @ObfuscatedName("pl.au")
    public static final class404 field4644 = new class404("", 12, new class400[] { class400.field4616, class400.field4615 });

    @ObfuscatedName("pl.ah")
    public static final class404 field4645 = new class404("", 13, new class400[] { class400.field4616 });

    @ObfuscatedName("pl.az")
    public final int field4646;

    @ObfuscatedName("pl.ax")
    public final Set field4647 = new HashSet();

    static {
        method6774();
    }

    @ObfuscatedName("pl.ag(B)[Lpl;")
    public static class404[] method6774() {
        return new class404[] { field4642, field4649, field4640, field4648, field4643, field4634, field4637, field4636, field4638, field4635, field4645, field4633, field4644 };
    }

    public class404(String arg0, int arg1) {
        this.field4646 = arg1;
    }

    public class404(String arg0, int arg1, class400[] arg2) {
        this.field4646 = arg1;
        class400[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class400 var6 = var4[var5];
            this.field4647.add(var6);
        }
    }

    @ObfuscatedName("pl.aq(I)I")
    public int method32() {
        return this.field4646;
    }
}
