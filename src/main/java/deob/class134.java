package deob;

@ObfuscatedName("fs")
public class class134 implements class387 {

    @ObfuscatedName("fs.ac")
    public static final class134 field1572 = new class134(0, 0, (String) null, 0);

    @ObfuscatedName("fs.al")
    public static final class134 field1570 = new class134(1, 1, (String) null, 9);

    @ObfuscatedName("fs.ak")
    public static final class134 field1564 = new class134(2, 2, (String) null, 3);

    @ObfuscatedName("fs.ax")
    public static final class134 field1565 = new class134(3, 3, (String) null, 6);

    @ObfuscatedName("fs.ao")
    public static final class134 field1566 = new class134(4, 4, (String) null, 1);

    @ObfuscatedName("fs.ah")
    public static final class134 field1567 = new class134(5, 5, (String) null, 3);

    @ObfuscatedName("fs.ar")
    public final int field1568;

    @ObfuscatedName("fs.ab")
    public final int field1563;

    @ObfuscatedName("fs.am")
    public final int field1562;

    public class134(int arg0, int arg1, String arg2, int arg3) {
        this.field1568 = arg0;
        this.field1563 = arg1;
        this.field1562 = arg3;
    }

    @ObfuscatedName("pm.ar(II)Lfs;")
    public static class134 method6753(int arg0) {
        class134[] var1 = new class134[] { field1572, field1570, field1564, field1565, field1566, field1567 };
        class134 var2 = (class134) class388.method3894(var1, arg0);
        if (var2 == null) {
            var2 = field1572;
        }
        return var2;
    }

    @ObfuscatedName("fs.ab(I)I")
    public int method2907() {
        return this.field1562;
    }

    @ObfuscatedName("fs.ac(I)I")
    public int method38() {
        return this.field1563;
    }
}
