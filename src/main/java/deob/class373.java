package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("oo")
public class class373 implements class370 {

    @ObfuscatedName("oo.at")
    public static final class373 field4357 = new class373("", 0, new class369[] { class369.field4335, class369.field4338 });

    @ObfuscatedName("oo.an")
    public static final class373 field4355 = new class373("", 1, new class369[] { class369.field4337, class369.field4335, class369.field4338 });

    @ObfuscatedName("oo.av")
    public static final class373 field4356 = new class373("", 2, new class369[] { class369.field4337, class369.field4336, class369.field4335 });

    @ObfuscatedName("oo.as")
    public static final class373 field4373 = new class373("", 3, new class369[] { class369.field4337 });

    @ObfuscatedName("oo.ax")
    public static final class373 field4360 = new class373("", 4);

    @ObfuscatedName("oo.ap")
    public static final class373 field4372 = new class373("", 5, new class369[] { class369.field4337, class369.field4335 });

    @ObfuscatedName("oo.ab")
    public static final class373 field4362 = new class373("", 6, new class369[] { class369.field4335 });

    @ObfuscatedName("oo.ak")
    public static final class373 field4361 = new class373("", 8, new class369[] { class369.field4337, class369.field4335 });

    @ObfuscatedName("oo.ae")
    public static final class373 field4354 = new class373("", 9, new class369[] { class369.field4337, class369.field4336 });

    @ObfuscatedName("oo.af")
    public static final class373 field4363 = new class373("", 10, new class369[] { class369.field4337 });

    @ObfuscatedName("oo.ao")
    public static final class373 field4364 = new class373("", 11, new class369[] { class369.field4337 });

    @ObfuscatedName("oo.aa")
    public static final class373 field4365 = new class373("", 12, new class369[] { class369.field4337, class369.field4335 });

    @ObfuscatedName("oo.aj")
    public static final class373 field4359 = new class373("", 13, new class369[] { class369.field4337 });

    @ObfuscatedName("oo.ad")
    public final int field4367;

    @ObfuscatedName("oo.ac")
    public final Set field4368 = new HashSet();

    static {
        method6279();
    }

    @ObfuscatedName("oo.ab(B)[Loo;")
    public static class373[] method6279() {
        return new class373[] { field4354, field4355, field4365, field4373, field4359, field4362, field4357, field4356, field4363, field4361, field4360, field4364, field4372 };
    }

    public class373(String arg0, int arg1) {
        this.field4367 = arg1;
    }

    public class373(String arg0, int arg1, class369[] arg2) {
        this.field4367 = arg1;
        class369[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class369 var6 = var4[var5];
            this.field4368.add(var6);
        }
    }

    @ObfuscatedName("oo.at(B)I")
    public int method33() {
        return this.field4367;
    }
}
