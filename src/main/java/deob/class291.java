package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("kl")
public class class291 implements class288 {

    @ObfuscatedName("kl.v")
    public static final class291 field3687 = new class291("", 0, new class287[] { class287.field3668 });

    @ObfuscatedName("kl.n")
    public static final class291 field3703 = new class291("", 1, new class287[] { class287.field3669, class287.field3668 });

    @ObfuscatedName("kl.f")
    public static final class291 field3700 = new class291("", 2, new class287[] { class287.field3669, class287.field3672, class287.field3668 });

    @ObfuscatedName("kl.y")
    public static final class291 field3699 = new class291("", 3, new class287[] { class287.field3669 });

    @ObfuscatedName("kl.p")
    public static final class291 field3691 = new class291("", 4);

    @ObfuscatedName("kl.j")
    public static final class291 field3688 = new class291("", 5, new class287[] { class287.field3669, class287.field3668 });

    @ObfuscatedName("kl.r")
    public static final class291 field3693 = new class291("", 6, new class287[] { class287.field3668 });

    @ObfuscatedName("kl.b")
    public static final class291 field3694 = new class291("", 8, new class287[] { class287.field3669, class287.field3668 });

    @ObfuscatedName("kl.d")
    public static final class291 field3695 = new class291("", 9, new class287[] { class287.field3669, class287.field3672 });

    @ObfuscatedName("kl.s")
    public static final class291 field3696 = new class291("", 10, new class287[] { class287.field3669 });

    @ObfuscatedName("kl.u")
    public static final class291 field3697 = new class291("", 11, new class287[] { class287.field3669 });

    @ObfuscatedName("kl.l")
    public static final class291 field3698 = new class291("", 12, new class287[] { class287.field3669, class287.field3668 });

    @ObfuscatedName("kl.o")
    public static final class291 field3690 = new class291("", 13, new class287[] { class287.field3669 });

    @ObfuscatedName("kl.c")
    public final int field3692;

    @ObfuscatedName("kl.e")
    public final Set field3701 = new HashSet();

    static {
        method4697();
    }

    @ObfuscatedName("kl.y(I)[Lkl;")
    public static class291[] method4697() {
        return new class291[] { field3703, field3696, field3698, field3687, field3700, field3697, field3693, field3688, field3699, field3695, field3691, field3694, field3690 };
    }

    public class291(String arg0, int arg1) {
        this.field3692 = arg1;
    }

    public class291(String arg0, int arg1, class287[] arg2) {
        this.field3692 = arg1;
        class287[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class287 var6 = var4[var5];
            this.field3701.add(var6);
        }
    }

    @ObfuscatedName("kl.v(I)I")
    public int method227() {
        return this.field3692;
    }
}
