package deob;

@ObfuscatedName("fk")
public class class133 implements class402 {

    @ObfuscatedName("fk.ab")
    public static final class133 field1541 = new class133(0, 0);

    @ObfuscatedName("fk.ay")
    public static final class133 field1546 = new class133(1, 1);

    @ObfuscatedName("fk.an")
    public static final class133 field1543 = new class133(2, 2);

    @ObfuscatedName("fk.au")
    public static final class133 field1544 = new class133(3, 3);

    @ObfuscatedName("fk.ax")
    public static final class133 field1545 = new class133(4, 4);

    @ObfuscatedName("fk.ao")
    public final int field1542;

    @ObfuscatedName("fk.am")
    public final int field1547;

    public class133(int arg0, int arg1) {
        this.field1542 = arg0;
        this.field1547 = arg1;
    }

    @ObfuscatedName("fk.ab(B)I")
    public int method33() {
        return this.field1547;
    }

    @ObfuscatedName("bz.au(II)Lfk;")
    public static class133 method392(int arg0) {
        class133[] var1 = new class133[] { field1541, field1546, field1543, field1544, field1545 };
        class133 var2 = (class133) class403.method3083(var1, arg0);
        if (var2 == null) {
            var2 = field1541;
        }
        return var2;
    }
}
