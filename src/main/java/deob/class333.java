package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("lu")
public class class333 implements class330 {

    @ObfuscatedName("lu.c")
    public static final class333 field4159 = new class333("", 0, new class329[] { class329.field4128 });

    @ObfuscatedName("lu.p")
    public static final class333 field4165 = new class333("", 1, new class329[] { class329.field4130, class329.field4128 });

    @ObfuscatedName("lu.f")
    public static final class333 field4152 = new class333("", 2, new class329[] { class329.field4130, class329.field4131, class329.field4128 });

    @ObfuscatedName("lu.n")
    public static final class333 field4153 = new class333("", 3, new class329[] { class329.field4130 });

    @ObfuscatedName("lu.k")
    public static final class333 field4154 = new class333("", 4);

    @ObfuscatedName("lu.w")
    public static final class333 field4151 = new class333("", 5, new class329[] { class329.field4130, class329.field4128 });

    @ObfuscatedName("lu.s")
    public static final class333 field4164 = new class333("", 6, new class329[] { class329.field4128 });

    @ObfuscatedName("lu.q")
    public static final class333 field4150 = new class333("", 8, new class329[] { class329.field4130, class329.field4128 });

    @ObfuscatedName("lu.m")
    public static final class333 field4158 = new class333("", 9, new class329[] { class329.field4130, class329.field4131 });

    @ObfuscatedName("lu.x")
    public static final class333 field4155 = new class333("", 10, new class329[] { class329.field4130 });

    @ObfuscatedName("lu.j")
    public static final class333 field4160 = new class333("", 11, new class329[] { class329.field4130 });

    @ObfuscatedName("lu.v")
    public static final class333 field4161 = new class333("", 12, new class329[] { class329.field4130, class329.field4128 });

    @ObfuscatedName("lu.h")
    public static final class333 field4162 = new class333("", 13, new class329[] { class329.field4130 });

    @ObfuscatedName("lu.t")
    public final int field4163;

    @ObfuscatedName("lu.u")
    public final Set field4156 = new HashSet();

    public class333(String arg0, int arg1) {
        this.field4163 = arg1;
    }

    public class333(String arg0, int arg1, class329[] arg2) {
        this.field4163 = arg1;
        class329[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class329 var6 = var4[var5];
            this.field4156.add(var6);
        }
    }

    @ObfuscatedName("lu.p(B)I")
    public int method42() {
        return this.field4163;
    }
}
