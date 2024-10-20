package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("kj")
public class class293 implements class290 {

    @ObfuscatedName("kj.s")
    public static final class293 field3716 = new class293("", 0, new class289[] { class289.field3674 });

    @ObfuscatedName("kj.t")
    public static final class293 field3697 = new class293("", 1, new class289[] { class289.field3675, class289.field3674 });

    @ObfuscatedName("kj.v")
    public static final class293 field3698 = new class293("", 2, new class289[] { class289.field3675, class289.field3673, class289.field3674 });

    @ObfuscatedName("kj.j")
    public static final class293 field3701 = new class293("", 3, new class289[] { class289.field3675 });

    @ObfuscatedName("kj.l")
    public static final class293 field3700 = new class293("", 4);

    @ObfuscatedName("kj.n")
    public static final class293 field3709 = new class293("", 5, new class289[] { class289.field3675, class289.field3674 });

    @ObfuscatedName("kj.w")
    public static final class293 field3715 = new class293("", 6, new class289[] { class289.field3674 });

    @ObfuscatedName("kj.f")
    public static final class293 field3703 = new class293("", 8, new class289[] { class289.field3675, class289.field3674 });

    @ObfuscatedName("kj.o")
    public static final class293 field3704 = new class293("", 9, new class289[] { class289.field3675, class289.field3673 });

    @ObfuscatedName("kj.x")
    public static final class293 field3705 = new class293("", 10, new class289[] { class289.field3675 });

    @ObfuscatedName("kj.r")
    public static final class293 field3706 = new class293("", 11, new class289[] { class289.field3675 });

    @ObfuscatedName("kj.p")
    public static final class293 field3707 = new class293("", 12, new class289[] { class289.field3675, class289.field3674 });

    @ObfuscatedName("kj.h")
    public static final class293 field3708 = new class293("", 13, new class289[] { class289.field3675 });

    @ObfuscatedName("kj.k")
    public final int field3702;

    @ObfuscatedName("kj.a")
    public final Set field3710 = new HashSet();

    static {
        method4682();
    }

    @ObfuscatedName("kj.n(B)[Lkj;")
    public static class293[] method4682() {
        return new class293[] { field3706, field3703, field3708, field3701, field3704, field3697, field3715, field3716, field3698, field3700, field3709, field3707, field3705 };
    }

    public class293(String arg0, int arg1) {
        this.field3702 = arg1;
    }

    public class293(String arg0, int arg1, class289[] arg2) {
        this.field3702 = arg1;
        class289[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class289 var6 = var4[var5];
            this.field3710.add(var6);
        }
    }

    @ObfuscatedName("kj.s(I)I")
    public int method35() {
        return this.field3702;
    }
}
