package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("or")
public class class390 implements class387 {

    @ObfuscatedName("or.ac")
    public static final class390 field4447 = new class390("", 0, new class386[] { class386.field4423, class386.field4418 });

    @ObfuscatedName("or.al")
    public static final class390 field4454 = new class390("", 1, new class386[] { class386.field4420, class386.field4423, class386.field4418 });

    @ObfuscatedName("or.ak")
    public static final class390 field4441 = new class390("", 2, new class386[] { class386.field4420, class386.field4419, class386.field4423 });

    @ObfuscatedName("or.ax")
    public static final class390 field4442 = new class390("", 3, new class386[] { class386.field4420 });

    @ObfuscatedName("or.ao")
    public static final class390 field4445 = new class390("", 4);

    @ObfuscatedName("or.ah")
    public static final class390 field4443 = new class390("", 5, new class386[] { class386.field4420, class386.field4423 });

    @ObfuscatedName("or.ar")
    public static final class390 field4449 = new class390("", 6, new class386[] { class386.field4423 });

    @ObfuscatedName("or.ab")
    public static final class390 field4446 = new class390("", 8, new class386[] { class386.field4420, class386.field4423 });

    @ObfuscatedName("or.am")
    public static final class390 field4450 = new class390("", 9, new class386[] { class386.field4420, class386.field4419 });

    @ObfuscatedName("or.av")
    public static final class390 field4448 = new class390("", 10, new class386[] { class386.field4420 });

    @ObfuscatedName("or.ag")
    public static final class390 field4444 = new class390("", 11, new class386[] { class386.field4420 });

    @ObfuscatedName("or.aa")
    public static final class390 field4439 = new class390("", 12, new class386[] { class386.field4420, class386.field4423 });

    @ObfuscatedName("or.ap")
    public static final class390 field4451 = new class390("", 13, new class386[] { class386.field4420 });

    @ObfuscatedName("or.ay")
    public final int field4452;

    @ObfuscatedName("or.as")
    public final Set field4453 = new HashSet();

    static {
        method6510();
    }

    @ObfuscatedName("or.ar(B)[Lor;")
    public static class390[] method6510() {
        return new class390[] { field4439, field4446, field4454, field4445, field4441, field4450, field4442, field4444, field4448, field4449, field4451, field4447, field4443 };
    }

    public class390(String arg0, int arg1) {
        this.field4452 = arg1;
    }

    public class390(String arg0, int arg1, class386[] arg2) {
        this.field4452 = arg1;
        class386[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class386 var6 = var4[var5];
            this.field4453.add(var6);
        }
    }

    @ObfuscatedName("or.ac(I)I")
    public int method38() {
        return this.field4452;
    }
}
