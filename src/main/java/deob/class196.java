package deob;

@ObfuscatedName("hg")
public class class196 extends class484 {

    @ObfuscatedName("hg.al")
    public static class302 field1957 = new class302(64);

    @ObfuscatedName("hg.ak")
    public boolean field1959 = false;

    @ObfuscatedName("fe.ac(Lom;I)V")
    public static void method2922(class374 arg0) {
        Statics.field1962 = arg0;
    }

    @ObfuscatedName("client.al(II)Lhg;")
    public static class196 method1733(int arg0) {
        class196 var1 = (class196) field1957.method5286((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field1962.method6342(19, arg0);
        class196 var3 = new class196();
        if (var2 != null) {
            var3.method3366(new class530(var2));
        }
        field1957.method5289(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("hg.ak(Lul;I)V")
    public void method3366(class530 arg0) {
        while (true) {
            int var2 = arg0.method8365();
            if (var2 == 0) {
                return;
            }
            this.method3375(arg0, var2);
        }
    }

    @ObfuscatedName("hg.ax(Lul;IB)V")
    public void method3375(class530 arg0, int arg1) {
        if (arg1 == 2) {
            this.field1959 = true;
        }
    }

    @ObfuscatedName("fu.ao(S)V")
    public static void method3013() {
        field1957.method5288();
    }
}
