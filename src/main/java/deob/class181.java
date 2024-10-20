package deob;

@ObfuscatedName("gl")
public class class181 extends class444 {

    @ObfuscatedName("gl.an")
    public static class280 field1906 = new class280(64);

    @ObfuscatedName("gl.aw")
    public int field1905 = 0;

    @ObfuscatedName("df.af(Lnm;B)V")
    public static void method2497(class344 arg0) {
        Statics.field1904 = arg0;
    }

    @ObfuscatedName("cm.an(II)Lgl;")
    public static class181 method1140(int arg0) {
        class181 var1 = (class181) field1906.method5119((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1904.method6090(5, arg0);
        class181 var3 = new class181();
        if (var2 != null) {
            var3.method3329(new class489(var2));
        }
        field1906.method5121(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("gl.aw(Lsg;B)V")
    public void method3329(class489 arg0) {
        while (true) {
            int var2 = arg0.method8248();
            if (var2 == 0) {
                return;
            }
            this.method3326(arg0, var2);
        }
    }

    @ObfuscatedName("gl.ac(Lsg;II)V")
    public void method3326(class489 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1905 = arg0.method8250();
        }
    }
}
