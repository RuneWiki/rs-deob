package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("ox")
public class class376 implements class373 {

    @ObfuscatedName("ox.aw")
    public static final class376 field4408 = new class376("", 0, new class372[] { class372.field4372, class372.field4370 });

    @ObfuscatedName("ox.ay")
    public static final class376 field4400 = new class376("", 1, new class372[] { class372.field4371, class372.field4372, class372.field4370 });

    @ObfuscatedName("ox.ar")
    public static final class376 field4396 = new class376("", 2, new class372[] { class372.field4371, class372.field4369, class372.field4372 });

    @ObfuscatedName("ox.am")
    public static final class376 field4395 = new class376("", 3, new class372[] { class372.field4371 });

    @ObfuscatedName("ox.as")
    public static final class376 field4392 = new class376("", 4);

    @ObfuscatedName("ox.aj")
    public static final class376 field4397 = new class376("", 5, new class372[] { class372.field4371, class372.field4372 });

    @ObfuscatedName("ox.ag")
    public static final class376 field4401 = new class376("", 6, new class372[] { class372.field4372 });

    @ObfuscatedName("ox.az")
    public static final class376 field4399 = new class376("", 8, new class372[] { class372.field4371, class372.field4372 });

    @ObfuscatedName("ox.av")
    public static final class376 field4394 = new class376("", 9, new class372[] { class372.field4371, class372.field4369 });

    @ObfuscatedName("ox.ap")
    public static final class376 field4398 = new class376("", 10, new class372[] { class372.field4371 });

    @ObfuscatedName("ox.aq")
    public static final class376 field4402 = new class376("", 11, new class372[] { class372.field4371 });

    @ObfuscatedName("ox.at")
    public static final class376 field4403 = new class376("", 12, new class372[] { class372.field4371, class372.field4372 });

    @ObfuscatedName("ox.ah")
    public static final class376 field4404 = new class376("", 13, new class372[] { class372.field4371 });

    @ObfuscatedName("ox.ax")
    public final int field4405;

    @ObfuscatedName("ox.aa")
    public final Set field4393 = new HashSet();

    public class376(String arg0, int arg1) {
        this.field4405 = arg1;
    }

    public class376(String arg0, int arg1, class372[] arg2) {
        this.field4405 = arg1;
        class372[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class372 var6 = var4[var5];
            this.field4393.add(var6);
        }
    }

    @ObfuscatedName("ox.ay(I)I")
    public int method36() {
        return this.field4405;
    }
}
