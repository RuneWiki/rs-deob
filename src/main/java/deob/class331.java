package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("lz")
public class class331 implements class328 {

    @ObfuscatedName("lz.c")
    public static final class331 field4107 = new class331("", 0, new class327[] { class327.field4081 });

    @ObfuscatedName("lz.v")
    public static final class331 field4104 = new class331("", 1, new class327[] { class327.field4084, class327.field4081 });

    @ObfuscatedName("lz.q")
    public static final class331 field4105 = new class331("", 2, new class327[] { class327.field4084, class327.field4080, class327.field4081 });

    @ObfuscatedName("lz.f")
    public static final class331 field4106 = new class331("", 3, new class327[] { class327.field4084 });

    @ObfuscatedName("lz.j")
    public static final class331 field4116 = new class331("", 4);

    @ObfuscatedName("lz.e")
    public static final class331 field4118 = new class331("", 5, new class327[] { class327.field4084, class327.field4081 });

    @ObfuscatedName("lz.g")
    public static final class331 field4109 = new class331("", 6, new class327[] { class327.field4081 });

    @ObfuscatedName("lz.w")
    public static final class331 field4103 = new class331("", 8, new class327[] { class327.field4084, class327.field4081 });

    @ObfuscatedName("lz.y")
    public static final class331 field4108 = new class331("", 9, new class327[] { class327.field4084, class327.field4080 });

    @ObfuscatedName("lz.i")
    public static final class331 field4112 = new class331("", 10, new class327[] { class327.field4084 });

    @ObfuscatedName("lz.s")
    public static final class331 field4113 = new class331("", 11, new class327[] { class327.field4084 });

    @ObfuscatedName("lz.t")
    public static final class331 field4114 = new class331("", 12, new class327[] { class327.field4084, class327.field4081 });

    @ObfuscatedName("lz.z")
    public static final class331 field4111 = new class331("", 13, new class327[] { class327.field4084 });

    @ObfuscatedName("lz.r")
    public final int field4115;

    @ObfuscatedName("lz.u")
    public final Set field4117 = new HashSet();

    static {
        method5511();
    }

    @ObfuscatedName("lz.f(B)[Llz;")
    public static class331[] method5511() {
        return new class331[] { field4108, field4107, field4111, field4113, field4103, field4112, field4114, field4109, field4116, field4105, field4106, field4118, field4104 };
    }

    public class331(String arg0, int arg1) {
        this.field4115 = arg1;
    }

    public class331(String arg0, int arg1, class327[] arg2) {
        this.field4115 = arg1;
        class327[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class327 var6 = var4[var5];
            this.field4117.add(var6);
        }
    }

    @ObfuscatedName("lz.c(B)I")
    public int method33() {
        return this.field4115;
    }
}
