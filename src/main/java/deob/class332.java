package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("li")
public class class332 implements class329 {

    @ObfuscatedName("li.s")
    public static final class332 field4122 = new class332("", 0, new class328[] { class328.field4087 });

    @ObfuscatedName("li.h")
    public static final class332 field4109 = new class332("", 1, new class328[] { class328.field4089, class328.field4087 });

    @ObfuscatedName("li.w")
    public static final class332 field4110 = new class332("", 2, new class328[] { class328.field4089, class328.field4088, class328.field4087 });

    @ObfuscatedName("li.v")
    public static final class332 field4111 = new class332("", 3, new class328[] { class328.field4089 });

    @ObfuscatedName("li.c")
    public static final class332 field4112 = new class332("", 4);

    @ObfuscatedName("li.q")
    public static final class332 field4108 = new class332("", 5, new class328[] { class328.field4089, class328.field4087 });

    @ObfuscatedName("li.i")
    public static final class332 field4114 = new class332("", 6, new class328[] { class328.field4087 });

    @ObfuscatedName("li.k")
    public static final class332 field4115 = new class332("", 8, new class328[] { class328.field4089, class328.field4087 });

    @ObfuscatedName("li.o")
    public static final class332 field4116 = new class332("", 9, new class328[] { class328.field4089, class328.field4088 });

    @ObfuscatedName("li.n")
    public static final class332 field4117 = new class332("", 10, new class328[] { class328.field4089 });

    @ObfuscatedName("li.d")
    public static final class332 field4113 = new class332("", 11, new class328[] { class328.field4089 });

    @ObfuscatedName("li.a")
    public static final class332 field4119 = new class332("", 12, new class328[] { class328.field4089, class328.field4087 });

    @ObfuscatedName("li.m")
    public static final class332 field4118 = new class332("", 13, new class328[] { class328.field4089 });

    @ObfuscatedName("li.u")
    public final int field4121;

    @ObfuscatedName("li.l")
    public final Set field4120 = new HashSet();

    static {
        method5409();
    }

    @ObfuscatedName("li.s(I)[Lli;")
    public static class332[] method5409() {
        return new class332[] { field4115, field4113, field4119, field4118, field4109, field4114, field4111, field4112, field4122, field4116, field4108, field4110, field4117 };
    }

    public class332(String arg0, int arg1) {
        this.field4121 = arg1;
    }

    public class332(String arg0, int arg1, class328[] arg2) {
        this.field4121 = arg1;
        class328[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class328 var6 = var4[var5];
            this.field4120.add(var6);
        }
    }

    @ObfuscatedName("li.h(B)I")
    public int method39() {
        return this.field4121;
    }
}
