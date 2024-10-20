package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("lz")
public class class332 implements class329 {

    @ObfuscatedName("lz.o")
    public static final class332 field4126 = new class332("", 0, new class328[] { class328.field4110 });

    @ObfuscatedName("lz.q")
    public static final class332 field4127 = new class332("", 1, new class328[] { class328.field4109, class328.field4110 });

    @ObfuscatedName("lz.l")
    public static final class332 field4128 = new class332("", 2, new class328[] { class328.field4109, class328.field4111, class328.field4110 });

    @ObfuscatedName("lz.k")
    public static final class332 field4131 = new class332("", 3, new class328[] { class328.field4109 });

    @ObfuscatedName("lz.a")
    public static final class332 field4130 = new class332("", 4);

    @ObfuscatedName("lz.m")
    public static final class332 field4139 = new class332("", 5, new class328[] { class328.field4109, class328.field4110 });

    @ObfuscatedName("lz.p")
    public static final class332 field4132 = new class332("", 6, new class328[] { class328.field4110 });

    @ObfuscatedName("lz.s")
    public static final class332 field4133 = new class332("", 8, new class328[] { class328.field4109, class328.field4110 });

    @ObfuscatedName("lz.r")
    public static final class332 field4129 = new class332("", 9, new class328[] { class328.field4109, class328.field4111 });

    @ObfuscatedName("lz.v")
    public static final class332 field4135 = new class332("", 10, new class328[] { class328.field4109 });

    @ObfuscatedName("lz.y")
    public static final class332 field4136 = new class332("", 11, new class328[] { class328.field4109 });

    @ObfuscatedName("lz.c")
    public static final class332 field4137 = new class332("", 12, new class328[] { class328.field4109, class328.field4110 });

    @ObfuscatedName("lz.w")
    public static final class332 field4134 = new class332("", 13, new class328[] { class328.field4109 });

    @ObfuscatedName("lz.b")
    public final int field4140;

    @ObfuscatedName("lz.t")
    public final Set field4138 = new HashSet();

    static {
        method5403();
    }

    @ObfuscatedName("lz.k(I)[Llz;")
    public static class332[] method5403() {
        return new class332[] { field4127, field4139, field4128, field4131, field4130, field4137, field4134, field4133, field4129, field4136, field4135, field4132, field4126 };
    }

    public class332(String arg0, int arg1) {
        this.field4140 = arg1;
    }

    public class332(String arg0, int arg1, class328[] arg2) {
        this.field4140 = arg1;
        class328[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class328 var6 = var4[var5];
            this.field4138.add(var6);
        }
    }

    @ObfuscatedName("lz.o(B)I")
    public int method40() {
        return this.field4140;
    }
}
