package deob;

@ObfuscatedName("et")
public class class154 extends class349 {

    @ObfuscatedName("et.t")
    public static class223 field1704 = new class223(64);

    @ObfuscatedName("et.v")
    public class363 field1705;

    @ObfuscatedName("cx.s(IB)Let;")
    public static class154 method2113(int arg0) {
        class154 var1 = (class154) field1704.method3927((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1703.method4459(34, arg0);
        class154 var3 = new class154();
        if (var2 != null) {
            var3.method2613(new class385(var2));
        }
        var3.method2612();
        field1704.method3929(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("et.t(I)V")
    public void method2612() {
    }

    @ObfuscatedName("et.v(Lnv;B)V")
    public void method2613(class385 arg0) {
        while (true) {
            int var2 = arg0.method5958();
            if (var2 == 0) {
                return;
            }
            this.method2614(arg0, var2);
        }
    }

    @ObfuscatedName("et.j(Lnv;IB)V")
    public void method2614(class385 arg0, int arg1) {
        if (arg1 == 249) {
            this.field1705 = class145.method1414(arg0, this.field1705);
        }
    }

    @ObfuscatedName("et.l(III)I")
    public int method2615(int arg0, int arg1) {
        class363 var3 = this.field1705;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class353 var5 = (class353) var3.method5726((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field3964;
            }
        }
        return var4;
    }

    @ObfuscatedName("et.n(ILjava/lang/String;B)Ljava/lang/String;")
    public String method2616(int arg0, String arg1) {
        class363 var3 = this.field1705;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class350 var5 = (class350) var3.method5726((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field3961;
            }
        }
        return var4;
    }

    @ObfuscatedName("ev.w(B)V")
    public static void method2369() {
        field1704.method3930();
    }
}
