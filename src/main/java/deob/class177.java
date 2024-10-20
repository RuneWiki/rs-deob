package deob;

@ObfuscatedName("fl")
public class class177 extends class387 {

    @ObfuscatedName("fl.l")
    public static class249 field1933 = new class249(64);

    @ObfuscatedName("fl.s")
    public char field1932;

    @ObfuscatedName("fl.e")
    public int field1935;

    @ObfuscatedName("fl.r")
    public String field1937;

    @ObfuscatedName("fl.o")
    public boolean field1934 = true;

    @ObfuscatedName("cd.c(II)Lfl;")
    public static class177 method2070(int arg0) {
        class177 var1 = (class177) field1933.method4472((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1936.method5066(11, arg0);
        class177 var3 = new class177();
        if (var2 != null) {
            var3.method3049(new class421(var2));
        }
        var3.method3048();
        field1933.method4482(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fl.l(B)V")
    public void method3048() {
    }

    @ObfuscatedName("fl.s(Lpi;I)V")
    public void method3049(class421 arg0) {
        while (true) {
            int var2 = arg0.method6686();
            if (var2 == 0) {
                return;
            }
            this.method3050(arg0, var2);
        }
    }

    @ObfuscatedName("fl.e(Lpi;II)V")
    public void method3050(class421 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method6664();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class334.field4049[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field1932 = var6;
        } else if (arg1 == 2) {
            this.field1935 = arg0.method6669();
        } else if (arg1 == 4) {
            this.field1934 = false;
        } else if (arg1 == 5) {
            this.field1937 = arg0.method6674();
        }
    }

    @ObfuscatedName("fl.r(I)Z")
    public boolean method3051() {
        return this.field1932 == 's';
    }

    @ObfuscatedName("fs.o(B)V")
    public static void method2936() {
        field1933.method4475();
    }
}
