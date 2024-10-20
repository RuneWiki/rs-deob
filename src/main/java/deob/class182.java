package deob;

@ObfuscatedName("gz")
public class class182 extends class444 {

    @ObfuscatedName("gz.aw")
    public static class280 field1911 = new class280(64);

    @ObfuscatedName("gz.ac")
    public int field1912 = 0;

    @ObfuscatedName("qw.af(II)Lgz;")
    public static class182 method7368(int arg0) {
        class182 var1 = (class182) field1911.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1910.method6090(16, arg0);
        class182 var3 = new class182();
        if (var2 != null) {
            var3.method3337(new class489(var2));
        }
        field1911.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gz.an(Lsg;I)V")
    public void method3337(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3340(arg0, var2);
        }
    }

    @ObfuscatedName("gz.aw(Lsg;II)V")
    public void method3340(class489 arg0, int arg1) {
        if (arg1 == 5) {
            this.field1912 = arg0.method8250();
        }
    }
}
