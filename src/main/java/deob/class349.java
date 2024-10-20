package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("mr")
public class class349 implements class346 {

    @ObfuscatedName("mr.h")
    public static final class349 field4328 = new class349("", 0, new class345[] { class345.field4290 });

    @ObfuscatedName("mr.e")
    public static final class349 field4310 = new class349("", 1, new class345[] { class345.field4288, class345.field4290 });

    @ObfuscatedName("mr.v")
    public static final class349 field4312 = new class349("", 2, new class345[] { class345.field4288, class345.field4289, class345.field4290 });

    @ObfuscatedName("mr.x")
    public static final class349 field4311 = new class349("", 3, new class345[] { class345.field4288 });

    @ObfuscatedName("mr.m")
    public static final class349 field4314 = new class349("", 4);

    @ObfuscatedName("mr.q")
    public static final class349 field4315 = new class349("", 5, new class345[] { class345.field4288, class345.field4290 });

    @ObfuscatedName("mr.f")
    public static final class349 field4325 = new class349("", 6, new class345[] { class345.field4290 });

    @ObfuscatedName("mr.r")
    public static final class349 field4317 = new class349("", 8, new class345[] { class345.field4288, class345.field4290 });

    @ObfuscatedName("mr.u")
    public static final class349 field4318 = new class349("", 9, new class345[] { class345.field4288, class345.field4289 });

    @ObfuscatedName("mr.b")
    public static final class349 field4319 = new class349("", 10, new class345[] { class345.field4288 });

    @ObfuscatedName("mr.j")
    public static final class349 field4320 = new class349("", 11, new class345[] { class345.field4288 });

    @ObfuscatedName("mr.g")
    public static final class349 field4327 = new class349("", 12, new class345[] { class345.field4288, class345.field4290 });

    @ObfuscatedName("mr.i")
    public static final class349 field4316 = new class349("", 13, new class345[] { class345.field4288 });

    @ObfuscatedName("mr.o")
    public final int field4323;

    @ObfuscatedName("mr.n")
    public final Set field4324 = new HashSet();

    public class349(String arg0, int arg1) {
        this.field4323 = arg1;
    }

    public class349(String arg0, int arg1, class345[] arg2) {
        this.field4323 = arg1;
        class345[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class345 var6 = var4[var5];
            this.field4324.add(var6);
        }
    }

    @ObfuscatedName("mr.e(B)I")
    public int method32() {
        return this.field4323;
    }
}
