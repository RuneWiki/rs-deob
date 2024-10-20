package deob;

@ObfuscatedName("fl")
public class class135 implements class357 {

    @ObfuscatedName("fl.af")
    public static final class135 field1604 = new class135(0, 0);

    @ObfuscatedName("fl.an")
    public static final class135 field1611 = new class135(1, 1);

    @ObfuscatedName("fl.aw")
    public static final class135 field1603 = new class135(2, 2);

    @ObfuscatedName("fl.ac")
    public static final class135 field1606 = new class135(3, 3);

    @ObfuscatedName("fl.au")
    public static final class135 field1600 = new class135(4, 4);

    @ObfuscatedName("fl.ab")
    public static final class135 field1605 = new class135(5, 5);

    @ObfuscatedName("fl.aq")
    public static final class135 field1601 = new class135(6, 6);

    @ObfuscatedName("fl.al")
    public static final class135 field1607 = new class135(7, 7);

    @ObfuscatedName("fl.at")
    public static final class135 field1608 = new class135(8, 8);

    @ObfuscatedName("fl.aa")
    public final int field1609;

    @ObfuscatedName("fl.ay")
    public final int field1610;

    @ObfuscatedName("qj.au(I)[Lfl;")
    public static class135[] method7526() {
        return new class135[] { field1604, field1611, field1603, field1606, field1600, field1605, field1601, field1607, field1608 };
    }

    public class135(int arg0, int arg1) {
        this.field1609 = arg0;
        this.field1610 = arg1;
    }

    @ObfuscatedName("fl.af(I)I")
    public int method39() {
        return this.field1610;
    }

    @ObfuscatedName("gg.ab(IS)Lfl;")
    public static class135 method3179(int arg0) {
        class135 var1 = (class135) Statics.method3600(method7526(), arg0);
        if (var1 == null) {
            var1 = field1608;
        }
        return var1;
    }
}
