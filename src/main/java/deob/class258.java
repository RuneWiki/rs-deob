package deob;

@ObfuscatedName("jf")
public class class258 extends class502 {

    @ObfuscatedName("jf.ay")
    public static class315 field2699 = new class315(64);

    @ObfuscatedName("jf.an")
    public class521 field2700;

    @ObfuscatedName("ka.ab(II)Ljf;")
    public static class258 method4996(int arg0) {
        class258 var1 = (class258) field2699.method5586((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field4544.method6670(34, arg0);
        class258 var3 = new class258();
        if (var2 != null) {
            var3.method4661(new class549(var2));
        }
        var3.method4651();
        field2699.method5589(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jf.ay(I)V")
    public void method4651() {
    }

    @ObfuscatedName("jf.an(Lvg;I)V")
    public void method4661(class549 arg0) {
        while (true) {
            int var2 = arg0.method9025();
            if (var2 == 0) {
                return;
            }
            this.method4652(arg0, var2);
        }
    }

    @ObfuscatedName("jf.au(Lvg;IB)V")
    public void method4652(class549 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2700 = class239.method3156(arg0, this.field2700);
        }
    }

    @ObfuscatedName("jf.ax(III)I")
    public int method4653(int arg0, int arg1) {
        class521 var3 = this.field2700;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class505 var5 = (class505) var3.method8512((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field5073;
            }
        }
        return var4;
    }

    @ObfuscatedName("jf.ao(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4657(int arg0, String arg1) {
        return class239.method6634(this.field2700, arg0, arg1);
    }
}
