package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("oe")
public class class375 implements class372 {

    @ObfuscatedName("oe.au")
    public static final class375 field4394 = new class375("", 0, new class371[] { class371.field4373, class371.field4371 });

    @ObfuscatedName("oe.ae")
    public static final class375 field4390 = new class375("", 1, new class371[] { class371.field4370, class371.field4373, class371.field4371 });

    @ObfuscatedName("oe.ao")
    public static final class375 field4391 = new class375("", 2, new class371[] { class371.field4370, class371.field4374, class371.field4373 });

    @ObfuscatedName("oe.at")
    public static final class375 field4407 = new class375("", 3, new class371[] { class371.field4370 });

    @ObfuscatedName("oe.ac")
    public static final class375 field4393 = new class375("", 4);

    @ObfuscatedName("oe.ai")
    public static final class375 field4395 = new class375("", 5, new class371[] { class371.field4370, class371.field4373 });

    @ObfuscatedName("oe.az")
    public static final class375 field4396 = new class375("", 6, new class371[] { class371.field4373 });

    @ObfuscatedName("oe.ap")
    public static final class375 field4400 = new class375("", 8, new class371[] { class371.field4370, class371.field4373 });

    @ObfuscatedName("oe.aa")
    public static final class375 field4398 = new class375("", 9, new class371[] { class371.field4370, class371.field4374 });

    @ObfuscatedName("oe.af")
    public static final class375 field4399 = new class375("", 10, new class371[] { class371.field4370 });

    @ObfuscatedName("oe.ad")
    public static final class375 field4392 = new class375("", 11, new class371[] { class371.field4370 });

    @ObfuscatedName("oe.aq")
    public static final class375 field4401 = new class375("", 12, new class371[] { class371.field4370, class371.field4373 });

    @ObfuscatedName("oe.al")
    public static final class375 field4402 = new class375("", 13, new class371[] { class371.field4370 });

    @ObfuscatedName("oe.an")
    public final int field4403;

    @ObfuscatedName("oe.ar")
    public final Set field4404 = new HashSet();

    static {
        method6377();
    }

    @ObfuscatedName("oe.au(I)[Loe;")
    public static class375[] method6377() {
        return new class375[] { field4392, field4402, field4393, field4398, field4400, field4407, field4399, field4401, field4395, field4390, field4396, field4391, field4394 };
    }

    public class375(String arg0, int arg1) {
        this.field4403 = arg1;
    }

    public class375(String arg0, int arg1, class371[] arg2) {
        this.field4403 = arg1;
        class371[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class371 var6 = var4[var5];
            this.field4404.add(var6);
        }
    }

    @ObfuscatedName("oe.ae(B)I")
    public int method30() {
        return this.field4403;
    }
}
