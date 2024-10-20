package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("nm")
public class class356 implements class353 {

    @ObfuscatedName("nm.aj")
    public static final class356 field4307 = new class356("", 0, new class352[] { class352.field4282 });

    @ObfuscatedName("nm.al")
    public static final class356 field4303 = new class356("", 1, new class352[] { class352.field4281, class352.field4282 });

    @ObfuscatedName("nm.ac")
    public static final class356 field4302 = new class356("", 2, new class352[] { class352.field4281, class352.field4283, class352.field4282 });

    @ObfuscatedName("nm.ab")
    public static final class356 field4314 = new class356("", 3, new class352[] { class352.field4281 });

    @ObfuscatedName("nm.an")
    public static final class356 field4306 = new class356("", 4);

    @ObfuscatedName("nm.ao")
    public static final class356 field4304 = new class356("", 5, new class352[] { class352.field4281, class352.field4282 });

    @ObfuscatedName("nm.av")
    public static final class356 field4308 = new class356("", 6, new class352[] { class352.field4282 });

    @ObfuscatedName("nm.aq")
    public static final class356 field4313 = new class356("", 8, new class352[] { class352.field4281, class352.field4282 });

    @ObfuscatedName("nm.ap")
    public static final class356 field4310 = new class356("", 9, new class352[] { class352.field4281, class352.field4283 });

    @ObfuscatedName("nm.ar")
    public static final class356 field4311 = new class356("", 10, new class352[] { class352.field4281 });

    @ObfuscatedName("nm.ak")
    public static final class356 field4312 = new class356("", 11, new class352[] { class352.field4281 });

    @ObfuscatedName("nm.ax")
    public static final class356 field4315 = new class356("", 12, new class352[] { class352.field4281, class352.field4282 });

    @ObfuscatedName("nm.as")
    public static final class356 field4309 = new class356("", 13, new class352[] { class352.field4281 });

    @ObfuscatedName("nm.ay")
    public final int field4305;

    @ObfuscatedName("nm.am")
    public final Set field4316 = new HashSet();

    public class356(String arg0, int arg1) {
        this.field4305 = arg1;
    }

    public class356(String arg0, int arg1, class352[] arg2) {
        this.field4305 = arg1;
        class352[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class352 var6 = var4[var5];
            this.field4316.add(var6);
        }
    }

    @ObfuscatedName("nm.aj(I)I")
    public int method33() {
        return this.field4305;
    }
}
