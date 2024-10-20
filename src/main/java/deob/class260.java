package deob;

@ObfuscatedName("in")
public class class260 extends class209 {

    @ObfuscatedName("in.q")
    public static class203 field3299 = new class203(64);

    @ObfuscatedName("in.m")
    public boolean field3300 = false;

    @ObfuscatedName("ik.c(II)Lin;")
    public static class260 method4195(int arg0) {
        class260 var1 = (class260) field3299.method3654((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3301.method4210(15, arg0);
        class260 var3 = new class260();
        if (var2 != null) {
            var3.method4467(new class185(var2));
        }
        field3299.method3646(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("in.q(Lgg;B)V")
    public void method4467(class185 arg0) {
        while (true) {
            int var2 = arg0.method3243();
            if (var2 == 0) {
                return;
            }
            this.method4466(arg0, var2);
        }
    }

    @ObfuscatedName("in.m(Lgg;IB)V")
    public void method4466(class185 arg0, int arg1) {
        if (arg1 == 2) {
            this.field3300 = true;
        }
    }
}
