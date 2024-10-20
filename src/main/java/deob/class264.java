package deob;

@ObfuscatedName("jq")
public class class264 extends class206 {

    @ObfuscatedName("jq.v")
    public static class201 field3486 = new class201(64);

    @ObfuscatedName("jq.y")
    public class198 field3483;

    @ObfuscatedName("jc.n(IB)Ljq;")
    public static class264 method4204(int arg0) {
        class264 var1 = (class264) field3486.method3407((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field724.method3931(34, arg0);
        class264 var3 = new class264();
        if (var2 != null) {
            var3.method4252(new class185(var2));
        }
        var3.method4233();
        field3486.method3408(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.v(B)V")
    public void method4233() {
    }

    @ObfuscatedName("jq.y(Lgv;B)V")
    public void method4252(class185 arg0) {
        while (true) {
            int var2 = arg0.method3021();
            if (var2 == 0) {
                return;
            }
            this.method4235(arg0, var2);
        }
    }

    @ObfuscatedName("jq.r(Lgv;II)V")
    public void method4235(class185 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3483 = class261.method121(arg0, this.field3483);
        }
    }

    @ObfuscatedName("jq.h(IIB)I")
    public int method4236(int arg0, int arg1) {
        return class261.method107(this.field3483, arg0, arg1);
    }

    @ObfuscatedName("jq.d(ILjava/lang/String;I)Ljava/lang/String;")
    public String method4237(int arg0, String arg1) {
        return class261.method3896(this.field3483, arg0, arg1);
    }
}
