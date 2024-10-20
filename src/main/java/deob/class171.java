package deob;

@ObfuscatedName("gy")
public class class171 extends class485 {

    @ObfuscatedName("gy.ap")
    public static class302 field1805 = new class302(64);

    @ObfuscatedName("gy.af")
    public int field1804 = 0;

    @ObfuscatedName("ri.am(Low;B)V")
    public static void method7677(class375 arg0) {
        Statics.field1806 = arg0;
    }

    @ObfuscatedName("bw.ap(IS)Lgy;")
    public static class171 method846(int arg0) {
        class171 var1 = (class171) field1805.method5400((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1806.method6396(5, arg0);
        class171 var3 = new class171();
        if (var2 != null) {
            var3.method3237(new class531(var2));
        }
        field1805.method5402(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.af(Luk;I)V")
    public void method3237(class531 arg0) {
        while (true) {
            int var2 = arg0.method8561();
            if (var2 == 0) {
                return;
            }
            this.method3238(arg0, var2);
        }
    }

    @ObfuscatedName("gy.aj(Luk;II)V")
    public void method3238(class531 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1804 = arg0.method8775();
        }
    }

    @ObfuscatedName("bn.aq(I)V")
    public static void method490() {
        field1805.method5403();
    }
}
