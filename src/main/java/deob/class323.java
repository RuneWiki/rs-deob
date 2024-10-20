package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("ll")
public class class323 implements class320 {

    @ObfuscatedName("ll.c")
    public static final class323 field3996 = new class323("", 0, new class319[] { class319.field3976 });

    @ObfuscatedName("ll.l")
    public static final class323 field3993 = new class323("", 1, new class319[] { class319.field3974, class319.field3976 });

    @ObfuscatedName("ll.s")
    public static final class323 field3994 = new class323("", 2, new class319[] { class319.field3974, class319.field3975, class319.field3976 });

    @ObfuscatedName("ll.e")
    public static final class323 field3995 = new class323("", 3, new class319[] { class319.field3974 });

    @ObfuscatedName("ll.r")
    public static final class323 field3992 = new class323("", 4);

    @ObfuscatedName("ll.o")
    public static final class323 field4008 = new class323("", 5, new class319[] { class319.field3974, class319.field3976 });

    @ObfuscatedName("ll.i")
    public static final class323 field3998 = new class323("", 6, new class319[] { class319.field3976 });

    @ObfuscatedName("ll.w")
    public static final class323 field3999 = new class323("", 8, new class319[] { class319.field3974, class319.field3976 });

    @ObfuscatedName("ll.v")
    public static final class323 field4002 = new class323("", 9, new class319[] { class319.field3974, class319.field3975 });

    @ObfuscatedName("ll.a")
    public static final class323 field4001 = new class323("", 10, new class319[] { class319.field3974 });

    @ObfuscatedName("ll.y")
    public static final class323 field3997 = new class323("", 11, new class319[] { class319.field3974 });

    @ObfuscatedName("ll.u")
    public static final class323 field4003 = new class323("", 12, new class319[] { class319.field3974, class319.field3976 });

    @ObfuscatedName("ll.h")
    public static final class323 field4000 = new class323("", 13, new class319[] { class319.field3974 });

    @ObfuscatedName("ll.q")
    public final int field4005;

    @ObfuscatedName("ll.x")
    public final Set field4006 = new HashSet();

    public class323(String arg0, int arg1) {
        this.field4005 = arg1;
    }

    public class323(String arg0, int arg1, class319[] arg2) {
        this.field4005 = arg1;
        class319[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class319 var6 = var4[var5];
            this.field4006.add(var6);
        }
    }

    @ObfuscatedName("ll.c(I)I")
    public int method38() {
        return this.field4005;
    }
}
