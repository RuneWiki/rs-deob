package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("mh")
public class class346 implements class343 {

    @ObfuscatedName("mh.a")
    public static final class346 field4263 = new class346("", 0, new class342[] { class342.field4233 });

    @ObfuscatedName("mh.f")
    public static final class346 field4255 = new class346("", 1, new class342[] { class342.field4230, class342.field4233 });

    @ObfuscatedName("mh.c")
    public static final class346 field4256 = new class346("", 2, new class342[] { class342.field4230, class342.field4232, class342.field4233 });

    @ObfuscatedName("mh.x")
    public static final class346 field4257 = new class346("", 3, new class342[] { class342.field4230 });

    @ObfuscatedName("mh.h")
    public static final class346 field4254 = new class346("", 4);

    @ObfuscatedName("mh.j")
    public static final class346 field4259 = new class346("", 5, new class342[] { class342.field4230, class342.field4233 });

    @ObfuscatedName("mh.y")
    public static final class346 field4260 = new class346("", 6, new class342[] { class342.field4233 });

    @ObfuscatedName("mh.d")
    public static final class346 field4261 = new class346("", 8, new class342[] { class342.field4230, class342.field4233 });

    @ObfuscatedName("mh.n")
    public static final class346 field4268 = new class346("", 9, new class342[] { class342.field4230, class342.field4232 });

    @ObfuscatedName("mh.r")
    public static final class346 field4270 = new class346("", 10, new class342[] { class342.field4230 });

    @ObfuscatedName("mh.l")
    public static final class346 field4265 = new class346("", 11, new class342[] { class342.field4230 });

    @ObfuscatedName("mh.s")
    public static final class346 field4262 = new class346("", 12, new class342[] { class342.field4230, class342.field4233 });

    @ObfuscatedName("mh.p")
    public static final class346 field4266 = new class346("", 13, new class342[] { class342.field4230 });

    @ObfuscatedName("mh.b")
    public final int field4267;

    @ObfuscatedName("mh.o")
    public final Set field4258 = new HashSet();

    static {
        method6013();
    }

    @ObfuscatedName("mh.c(I)[Lmh;")
    public static class346[] method6013() {
        return new class346[] { field4257, field4259, field4262, field4268, field4263, field4270, field4254, field4265, field4255, field4256, field4261, field4260, field4266 };
    }

    public class346(String arg0, int arg1) {
        this.field4267 = arg1;
    }

    public class346(String arg0, int arg1, class342[] arg2) {
        this.field4267 = arg1;
        class342[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class342 var6 = var4[var5];
            this.field4258.add(var6);
        }
    }

    @ObfuscatedName("mh.a(B)I")
    public int method24() {
        return this.field4267;
    }
}
