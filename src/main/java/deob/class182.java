package deob;

@ObfuscatedName("gy")
public class class182 extends class504 {

    @ObfuscatedName("gy.ag")
    public static class317 field1891 = new class317(64);

    @ObfuscatedName("gy.am")
    public int field1888 = 0;

    @ObfuscatedName("eq.ae(II)Lgy;")
    public static class182 method3054(int arg0) {
        class182 var1 = (class182) field1891.method5733((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1890.method6782(16, arg0);
        class182 var3 = new class182();
        if (var2 != null) {
            var3.method3451(new class551(var2));
        }
        field1891.method5735(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gy.ag(Lvf;I)V")
    public void method3451(class551 arg0) {
        while (true) {
            int var2 = arg0.method8955();
            if (var2 == 0) {
                return;
            }
            this.method3450(arg0, var2);
        }
    }

    @ObfuscatedName("gy.am(Lvf;II)V")
    public void method3450(class551 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1888 = arg0.method9119();
        }
    }

    @ObfuscatedName("hn.ax(B)V")
    public static void method3613() {
        field1891.method5736();
    }
}
