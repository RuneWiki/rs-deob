package deob;

@ObfuscatedName("ed")
public class class152 extends class348 {

    @ObfuscatedName("ed.e")
    public static class222 field1723 = new class222(64);

    @ObfuscatedName("ed.v")
    public char field1719;

    @ObfuscatedName("ed.y")
    public int field1720;

    @ObfuscatedName("ed.j")
    public String field1721;

    @ObfuscatedName("ed.o")
    public boolean field1722 = true;

    @ObfuscatedName("dd.f(II)Led;")
    public static class152 method2294(int arg0) {
        class152 var1 = (class152) field1723.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1717.method4504(11, arg0);
        class152 var3 = new class152();
        if (var2 != null) {
            var3.method2625(new class384(var2));
        }
        var3.method2624();
        field1723.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("ed.e(B)V")
    public void method2624() {
    }

    @ObfuscatedName("ed.v(Lnt;B)V")
    public void method2625(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2626(arg0, var2);
        }
    }

    @ObfuscatedName("ed.y(Lnt;IB)V")
    public void method2626(class384 arg0, int arg1) {
        if (arg1 == 1) {
            byte var3 = arg0.method5968();
            int var4 = var3 & 0xFF;
            if (var4 == 0) {
                throw new IllegalArgumentException("" + Integer.toString(var4, 16));
            }
            if (var4 >= 128 && var4 < 160) {
                char var5 = class303.field3745[var4 - 128];
                if (var5 == 0) {
                    var5 = '?';
                }
                var4 = var5;
            }
            char var6 = (char) var4;
            this.field1719 = var6;
        } else if (arg1 == 2) {
            this.field1720 = arg0.method5965();
        } else if (arg1 == 4) {
            this.field1722 = false;
        } else if (arg1 == 5) {
            this.field1721 = arg0.method5906();
        }
    }

    @ObfuscatedName("ed.j(I)Z")
    public boolean method2627() {
        return this.field1719 == 's';
    }

    @ObfuscatedName("ds.o(I)V")
    public static void method2124() {
        field1723.method3989();
    }
}
