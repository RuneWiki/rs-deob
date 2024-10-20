package deob;

@ObfuscatedName("fh")
public class class134 implements class401 {

    @ObfuscatedName("fh.aq")
    public static final class134 field1566 = new class134(0, 0);

    @ObfuscatedName("fh.ad")
    public static final class134 field1562 = new class134(1, 1);

    @ObfuscatedName("fh.ag")
    public static final class134 field1563 = new class134(2, 2);

    @ObfuscatedName("fh.ak")
    public static final class134 field1564 = new class134(3, 3);

    @ObfuscatedName("fh.ap")
    public static final class134 field1565 = new class134(4, 4);

    @ObfuscatedName("fh.an")
    public final int field1569;

    @ObfuscatedName("fh.aj")
    public final int field1567;

    @ObfuscatedName("hi.ag(I)[Lfh;")
    public static class134[] method3506() {
        return new class134[] { field1566, field1562, field1563, field1564, field1565 };
    }

    public class134(int arg0, int arg1) {
        this.field1569 = arg0;
        this.field1567 = arg1;
    }

    @ObfuscatedName("fh.aq(I)I")
    public int method32() {
        return this.field1567;
    }

    @ObfuscatedName("bh.ak(II)Lfh;")
    public static class134 method857(int arg0) {
        class134 var1 = (class134) class402.method3799(method3506(), arg0);
        if (var1 == null) {
            var1 = field1566;
        }
        return var1;
    }
}
