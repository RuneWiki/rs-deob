package deob;

@ObfuscatedName("fw")
public class class141 implements class384 {

    @ObfuscatedName("fw.at")
    public static final class141 field1618 = new class141(0, 0);

    @ObfuscatedName("fw.ah")
    public static final class141 field1609 = new class141(1, 1);

    @ObfuscatedName("fw.ar")
    public static final class141 field1619 = new class141(2, 2);

    @ObfuscatedName("fw.ao")
    public static final class141 field1611 = new class141(3, 3);

    @ObfuscatedName("fw.ab")
    public static final class141 field1612 = new class141(4, 4);

    @ObfuscatedName("fw.au")
    public static final class141 field1614 = new class141(5, 5);

    @ObfuscatedName("fw.aa")
    public static final class141 field1608 = new class141(6, 6);

    @ObfuscatedName("fw.ac")
    public static final class141 field1615 = new class141(7, 7);

    @ObfuscatedName("fw.al")
    public static final class141 field1616 = new class141(8, 8);

    @ObfuscatedName("fw.az")
    public final int field1617;

    @ObfuscatedName("fw.ap")
    public final int field1620;

    @ObfuscatedName("eh.at(S)[Lfw;")
    public static class141[] method2804() {
        return new class141[] { field1618, field1609, field1619, field1611, field1612, field1614, field1608, field1615, field1616 };
    }

    public class141(int arg0, int arg1) {
        this.field1617 = arg0;
        this.field1620 = arg1;
    }

    @ObfuscatedName("fw.ah(B)I")
    public int method41() {
        return this.field1620;
    }

    @ObfuscatedName("lt.ar(II)Lfw;")
    public static class141 method5339(int arg0) {
        class141 var1 = (class141) class385.method164(method2804(), arg0);
        if (var1 == null) {
            var1 = field1616;
        }
        return var1;
    }
}
