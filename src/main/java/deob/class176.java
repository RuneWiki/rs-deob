package deob;

@ObfuscatedName("gv")
public class class176 extends class481 {

    @ObfuscatedName("gv.ar")
    public static class299 field1820 = new class299(64);

    @ObfuscatedName("gv.ao")
    public int field1818 = 0;

    @ObfuscatedName("kb.at(Lol;I)V")
    public static void method5160(class371 arg0) {
        Statics.field1819 = arg0;
        Statics.field1816 = Statics.field1819.method6294(16);
    }

    @ObfuscatedName("hd.ah(II)Lgv;")
    public static class176 method3722(int arg0) {
        class176 var1 = (class176) field1820.method5289((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1819.method6284(16, arg0);
        class176 var3 = new class176();
        if (var2 != null) {
            var3.method3244(new class527(var2));
        }
        field1820.method5303(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gv.ar(Luj;B)V")
    public void method3244(class527 arg0) {
        while (true) {
            int var2 = arg0.method8410();
            if (var2 == 0) {
                return;
            }
            this.method3232(arg0, var2);
        }
    }

    @ObfuscatedName("gv.ao(Luj;II)V")
    public void method3232(class527 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1818 = arg0.method8412();
        }
    }

    @ObfuscatedName("lo.ab(I)V")
    public static void method5336() {
        field1820.method5292();
    }
}
