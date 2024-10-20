package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("ok")
public class class387 implements class384 {

    @ObfuscatedName("ok.at")
    public static final class387 field4418 = new class387("", 0, new class383[] { class383.field4394, class383.field4393 });

    @ObfuscatedName("ok.ah")
    public static final class387 field4415 = new class387("", 1, new class383[] { class383.field4391, class383.field4394, class383.field4393 });

    @ObfuscatedName("ok.ar")
    public static final class387 field4416 = new class387("", 2, new class383[] { class383.field4391, class383.field4392, class383.field4394 });

    @ObfuscatedName("ok.ao")
    public static final class387 field4417 = new class387("", 3, new class383[] { class383.field4391 });

    @ObfuscatedName("ok.ab")
    public static final class387 field4420 = new class387("", 4);

    @ObfuscatedName("ok.au")
    public static final class387 field4425 = new class387("", 5, new class383[] { class383.field4391, class383.field4394 });

    @ObfuscatedName("ok.aa")
    public static final class387 field4432 = new class387("", 6, new class383[] { class383.field4394 });

    @ObfuscatedName("ok.ac")
    public static final class387 field4421 = new class387("", 8, new class383[] { class383.field4391, class383.field4394 });

    @ObfuscatedName("ok.al")
    public static final class387 field4422 = new class387("", 9, new class383[] { class383.field4391, class383.field4392 });

    @ObfuscatedName("ok.az")
    public static final class387 field4423 = new class387("", 10, new class383[] { class383.field4391 });

    @ObfuscatedName("ok.ap")
    public static final class387 field4424 = new class387("", 11, new class383[] { class383.field4391 });

    @ObfuscatedName("ok.av")
    public static final class387 field4429 = new class387("", 12, new class383[] { class383.field4391, class383.field4394 });

    @ObfuscatedName("ok.ax")
    public static final class387 field4414 = new class387("", 13, new class383[] { class383.field4391 });

    @ObfuscatedName("ok.as")
    public final int field4419;

    @ObfuscatedName("ok.ay")
    public final Set field4428 = new HashSet();

    static {
        method6526();
    }

    @ObfuscatedName("ok.at(I)[Lok;")
    public static class387[] method6526() {
        return new class387[] { field4422, field4414, field4429, field4421, field4420, field4416, field4418, field4424, field4425, field4415, field4432, field4423, field4417 };
    }

    public class387(String arg0, int arg1) {
        this.field4419 = arg1;
    }

    public class387(String arg0, int arg1, class383[] arg2) {
        this.field4419 = arg1;
        class383[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class383 var6 = var4[var5];
            this.field4428.add(var6);
        }
    }

    @ObfuscatedName("ok.ah(B)I")
    public int method41() {
        return this.field4419;
    }
}
