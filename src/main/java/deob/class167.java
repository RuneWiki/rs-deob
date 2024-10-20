package deob;

@ObfuscatedName("fz")
public class class167 extends class364 {

    @ObfuscatedName("fz.c")
    public static class236 field1793 = new class236(64);

    @ObfuscatedName("fz.m")
    public class378 field1792;

    @ObfuscatedName("do.n(Lkk;B)V")
    public static void method2341(class290 arg0) {
        Statics.field1794 = arg0;
    }

    @ObfuscatedName("fs.c(II)Lfz;")
    public static class167 method2710(int arg0) {
        class167 var1 = (class167) field1793.method4167((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1794.method4710(34, arg0);
        class167 var3 = new class167();
        if (var2 != null) {
            var3.method2825(new class400(var2));
        }
        var3.method2820();
        field1793.method4169(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("fz.m(I)V")
    public void method2820() {
    }

    @ObfuscatedName("fz.k(Lot;B)V")
    public void method2825(class400 arg0) {
        while (true) {
            int var2 = arg0.method6217();
            if (var2 == 0) {
                return;
            }
            this.method2822(arg0, var2);
        }
    }

    @ObfuscatedName("fz.o(Lot;II)V")
    public void method2822(class400 arg0, int arg1) {
        if (arg1 == 249) {
            this.field1792 = class158.method2378(arg0, this.field1792);
        }
    }

    @ObfuscatedName("fz.g(III)I")
    public int method2823(int arg0, int arg1) {
        class378 var3 = this.field1792;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class368 var5 = (class368) var3.method5996((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4054;
            }
        }
        return var4;
    }

    @ObfuscatedName("fz.z(ILjava/lang/String;I)Ljava/lang/String;")
    public String method2824(int arg0, String arg1) {
        return class158.method2382(this.field1792, arg0, arg1);
    }
}
