package deob;

@ObfuscatedName("fn")
public class class166 extends class364 {

    @ObfuscatedName("fn.c")
    public static class236 field1787 = new class236(64);

    @ObfuscatedName("fn.m")
    public char field1786;

    @ObfuscatedName("fn.k")
    public int field1791;

    @ObfuscatedName("fn.o")
    public String field1789;

    @ObfuscatedName("fn.g")
    public boolean field1790 = true;

    @ObfuscatedName("fh.n(IS)Lfn;")
    public static class166 method3159(int arg0) {
        class166 var1 = (class166) field1787.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1556.method4710(11, arg0);
        class166 var3 = new class166();
        if (var2 != null) {
            var3.method2803(new class400(var2));
        }
        var3.method2815();
        field1787.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fn.c(I)V")
    public void method2815() {
    }

    @ObfuscatedName("fn.m(Lot;S)V")
    public void method2803(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2800(arg0, var2);
        }
    }

    @ObfuscatedName("fn.k(Lot;II)V")
    public void method2800(class400 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method6218();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class317.field3853[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field1786 = var6;
        } else if (arg1 == 2) {
            this.field1791 = arg0.method6222();
        } else if (arg1 == 4) {
            this.field1790 = false;
        } else if (arg1 == 5) {
            this.field1789 = arg0.method6226();
        }
    }

    @ObfuscatedName("fn.o(I)Z")
    public boolean method2801() {
        return this.field1786 == 's';
    }
}
