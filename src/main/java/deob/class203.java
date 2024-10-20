package deob;

@ObfuscatedName("hr")
public class class203 extends class457 {

    @ObfuscatedName("hr.an")
    public static class287 field2116 = new class287(64);

    @ObfuscatedName("hr.av")
    public class476 field2118;

    @ObfuscatedName("hr.av(B)V")
    public void method3513() {
    }

    @ObfuscatedName("hr.as(Ltz;B)V")
    public void method3521(class501 arg0) {
        while (true) {
            int var2 = arg0.method8129();
            if (var2 == 0) {
                return;
            }
            this.method3515(arg0, var2);
        }
    }

    @ObfuscatedName("hr.ax(Ltz;IB)V")
    public void method3515(class501 arg0, int arg1) {
        if (arg1 == 249) {
            this.field2118 = class191.method661(arg0, this.field2118);
        }
    }

    @ObfuscatedName("hr.ap(III)I")
    public int method3516(int arg0, int arg1) {
        class476 var3 = this.field2118;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class460 var5 = (class460) var3.method7848((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field4754;
            }
        }
        return var4;
    }

    @ObfuscatedName("hr.ab(ILjava/lang/String;I)Ljava/lang/String;")
    public String method3517(int arg0, String arg1) {
        return class191.method3094(this.field2118, arg0, arg1);
    }

    @ObfuscatedName("gg.ak(I)V")
    public static void method3109() {
        field2116.method5124();
    }
}
