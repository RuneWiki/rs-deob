package deob;

import java.util.HashSet;
import java.util.Set;

@ObfuscatedName("pe")
public class class403 implements class400 {

    @ObfuscatedName("pe.ak")
    public static final class403 field4609 = new class403("", 0, new class399[] { class399.field4590, class399.field4591 });

    @ObfuscatedName("pe.al")
    public static final class403 field4626 = new class403("", 1, new class399[] { class399.field4587, class399.field4590, class399.field4591 });

    @ObfuscatedName("pe.aj")
    public static final class403 field4610 = new class403("", 2, new class399[] { class399.field4587, class399.field4588, class399.field4590 });

    @ObfuscatedName("pe.az")
    public static final class403 field4612 = new class403("", 3, new class399[] { class399.field4587 });

    @ObfuscatedName("pe.af")
    public static final class403 field4613 = new class403("", 4);

    @ObfuscatedName("pe.aa")
    public static final class403 field4614 = new class403("", 5, new class399[] { class399.field4587, class399.field4590 });

    @ObfuscatedName("pe.at")
    public static final class403 field4615 = new class403("", 6, new class399[] { class399.field4590 });

    @ObfuscatedName("pe.ab")
    public static final class403 field4616 = new class403("", 8, new class399[] { class399.field4587, class399.field4590 });

    @ObfuscatedName("pe.ac")
    public static final class403 field4617 = new class403("", 9, new class399[] { class399.field4587, class399.field4588 });

    @ObfuscatedName("pe.ao")
    public static final class403 field4618 = new class403("", 10, new class399[] { class399.field4587 });

    @ObfuscatedName("pe.ah")
    public static final class403 field4619 = new class403("", 11, new class399[] { class399.field4587 });

    @ObfuscatedName("pe.av")
    public static final class403 field4620 = new class403("", 12, new class399[] { class399.field4587, class399.field4590 });

    @ObfuscatedName("pe.aq")
    public static final class403 field4621 = new class403("", 13, new class399[] { class399.field4587 });

    @ObfuscatedName("pe.ap")
    public final int field4622;

    @ObfuscatedName("pe.ae")
    public final Set field4623 = new HashSet();

    static {
        method6813();
    }

    @ObfuscatedName("pe.az(B)[Lpe;")
    public static class403[] method6813() {
        return new class403[] { field4621, field4610, field4612, field4615, field4626, field4613, field4616, field4614, field4609, field4619, field4618, field4620, field4617 };
    }

    public class403(String arg0, int arg1) {
        this.field4622 = arg1;
    }

    public class403(String arg0, int arg1, class399[] arg2) {
        this.field4622 = arg1;
        class399[] var4 = arg2;
        for (int var5 = 0; var5 < var4.length; var5++) {
            class399 var6 = var4[var5];
            this.field4623.add(var6);
        }
    }

    @ObfuscatedName("pe.ak(I)I")
    public int method34() {
        return this.field4622;
    }
}
