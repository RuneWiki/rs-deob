package deob;

@ObfuscatedName("fd")
public class class133 implements class392 {

    @ObfuscatedName("fd.az")
    public static final class133 field1591 = new class133(0, 0, (String) null, 0);

    @ObfuscatedName("fd.ah")
    public static final class133 field1584 = new class133(1, 1, (String) null, 9);

    @ObfuscatedName("fd.af")
    public static final class133 field1594 = new class133(2, 2, (String) null, 3);

    @ObfuscatedName("fd.at")
    public static final class133 field1586 = new class133(3, 3, (String) null, 6);

    @ObfuscatedName("fd.an")
    public static final class133 field1587 = new class133(4, 4, (String) null, 1);

    @ObfuscatedName("fd.ao")
    public static final class133 field1583 = new class133(5, 5, (String) null, 3);

    @ObfuscatedName("fd.ab")
    public final int field1589;

    @ObfuscatedName("fd.aw")
    public final int field1590;

    @ObfuscatedName("fd.ad")
    public final int field1592;

    public class133(int arg0, int arg1, String arg2, int arg3) {
        this.field1589 = arg0;
        this.field1590 = arg1;
        this.field1592 = arg3;
    }

    @ObfuscatedName("pv.at(II)Lfd;")
    public static class133 method6557(int arg0) {
        class133[] var1 = new class133[] { field1591, field1584, field1594, field1586, field1587, field1583 };
        class133 var2 = (class133) class393.method3484(var1, arg0);
        if (var2 == null) {
            var2 = field1591;
        }
        return var2;
    }

    @ObfuscatedName("fd.an(I)I")
    public int method2912() {
        return this.field1592;
    }

    @ObfuscatedName("fd.az(I)I")
    public int method38() {
        return this.field1590;
    }
}
