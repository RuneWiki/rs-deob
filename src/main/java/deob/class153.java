package deob;

@ObfuscatedName("eh")
public class class153 extends class348 {

    @ObfuscatedName("eh.e")
    public static class222 field1726 = new class222(64);

    @ObfuscatedName("eh.v")
    public class362 field1727;

    @ObfuscatedName("dd.f(II)Leh;")
    public static class153 method2292(int arg0) {
        class153 var1 = (class153) field1726.method3987((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1728.method4504(34, arg0);
        class153 var3 = new class153();
        if (var2 != null) {
            var3.method2642(new class384(var2));
        }
        var3.method2641();
        field1726.method3988(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("eh.e(I)V")
    public void method2641() {
    }

    @ObfuscatedName("eh.v(Lnt;B)V")
    public void method2642(class384 arg0) {
        while (true) {
            int var2 = arg0.method5902();
            if (var2 == 0) {
                return;
            }
            this.method2643(arg0, var2);
        }
    }

    @ObfuscatedName("eh.y(Lnt;II)V")
    public void method2643(class384 arg0, int arg1) {
        if (arg1 == 249) {
            this.field1727 = class144.method181(arg0, this.field1727);
        }
    }

    @ObfuscatedName("eh.j(III)I")
    public int method2644(int arg0, int arg1) {
        class362 var3 = this.field1727;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class352 var5 = (class352) var3.method5668((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3934;
            }
        }
        return var4;
    }

    @ObfuscatedName("eh.o(ILjava/lang/String;B)Ljava/lang/String;")
    public String method2645(int arg0, String arg1) {
        return class144.method2439(this.field1727, arg0, arg1);
    }

    @ObfuscatedName("bi.m(B)V")
    public static void method732() {
        field1726.method3989();
    }
}
