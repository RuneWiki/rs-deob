package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("lv")
public class class332 implements class329 {

    @ObfuscatedName("lv.v")
    public static final class332 field4070 = new class332("", 0, new class328[] { class328.field4043 });

    @ObfuscatedName("lv.c")
    public static final class332 field4063 = new class332("", 1, new class328[] { class328.field4044, class328.field4043 });

    @ObfuscatedName("lv.i")
    public static final class332 field4072 = new class332("", 2, new class328[] { class328.field4044, class328.field4045, class328.field4043 });

    @ObfuscatedName("lv.f")
    public static final class332 field4066 = new class332("", 3, new class328[] { class328.field4044 });

    @ObfuscatedName("lv.b")
    public static final class332 field4065 = new class332("", 4);

    @ObfuscatedName("lv.n")
    public static final class332 field4067 = new class332("", 5, new class328[] { class328.field4044, class328.field4043 });

    @ObfuscatedName("lv.s")
    public static final class332 field4080 = new class332("", 6, new class328[] { class328.field4043 });

    @ObfuscatedName("lv.l")
    public static final class332 field4068 = new class332("", 8, new class328[] { class328.field4044, class328.field4043 });

    @ObfuscatedName("lv.q")
    public static final class332 field4069 = new class332("", 9, new class328[] { class328.field4044, class328.field4045 });

    @ObfuscatedName("lv.o")
    public static final class332 field4062 = new class332("", 10, new class328[] { class328.field4044 });

    @ObfuscatedName("lv.r")
    public static final class332 field4071 = new class332("", 11, new class328[] { class328.field4044 });

    @ObfuscatedName("lv.p")
    public static final class332 field4078 = new class332("", 12, new class328[] { class328.field4044, class328.field4043 });

    @ObfuscatedName("lv.w")
    public static final class332 field4073 = new class332("", 13, new class328[] { class328.field4044 });

    @ObfuscatedName("lv.k")
    public final int field4064;

    @ObfuscatedName("lv.d")
    public final Set field4075 = new HashSet();

    static {
        method5510();
    }

    @ObfuscatedName("lv.f(I)[Llv;")
    public static class332[] method5510() {
        return new class332[] { field4080, field4069, field4071, field4062, field4065, field4070, field4073, field4067, field4066, field4068, field4078, field4072, field4063 };
    }

    public class332(String arg0, int arg1) {
        this.field4064 = arg1;
    }

    public class332(String arg0, int arg1, class328[] arg2) {
        this.field4064 = arg1;
        class328[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class328 var6 = var4[var5];
            this.field4075.add(var6);
        }
    }

    @ObfuscatedName("lv.v(B)I")
    public int method38() {
        return this.field4064;
    }
}
