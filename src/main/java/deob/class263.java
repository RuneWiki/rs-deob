package deob;

@ObfuscatedName("jk")
public class class263 extends class206 {

    @ObfuscatedName("jk.w")
    public static class201 field3465 = new class201(64);

    @ObfuscatedName("jk.e")
    public char field3467;

    @ObfuscatedName("jk.k")
    public int field3470;

    @ObfuscatedName("jk.u")
    public String field3469;

    @ObfuscatedName("jk.z")
    public boolean field3466 = true;

    @ObfuscatedName("cq.a(Lib;B)V")
    public static void method1502(class247 arg0) {
        Statics.field3468 = arg0;
    }

    @ObfuscatedName("iv.w(II)Ljk;")
    public static class263 method4053(int arg0) {
        class263 var1 = (class263) field3465.method3373((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3468.method3897(11, arg0);
        class263 var3 = new class263();
        if (var2 != null) {
            var3.method4200(new class185(var2));
        }
        var3.method4199();
        field3465.method3375(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jk.e(B)V")
    public void method4199() {
    }

    @ObfuscatedName("jk.k(Lgh;B)V")
    public void method4200(class185 arg0) {
        while (true) {
            int var2 = arg0.method2962();
            if (var2 == 0) {
                return;
            }
            this.method4201(arg0, var2);
        }
    }

    @ObfuscatedName("jk.u(Lgh;II)V")
    public void method4201(class185 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method3015();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("");
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class278.field3730[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field3467 = var6;
        } else if (arg1 == 2) {
            this.field3470 = arg0.method2967();
        } else if (arg1 == 4) {
            this.field3466 = false;
        } else if (arg1 == 5) {
            this.field3469 = arg0.method3168();
        }
    }

    @ObfuscatedName("jk.z(I)Z")
    public boolean method4206() {
        return this.field3467 == 's';
    }
}
