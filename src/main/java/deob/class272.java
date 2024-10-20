package deob;

@ObfuscatedName("jq")
public class class272 extends class214 {

    @ObfuscatedName("jq.s")
    public static class208 field3416 = new class208(64);

    @ObfuscatedName("jq.g")
    public class205 field3417;

    @ObfuscatedName("i.a(IB)Ljq;")
    public static class272 method279(int arg0) {
        class272 var1 = (class272) field3416.method3885((long) arg0);
        if (var1 != null) {
            return var1;
        }
        byte[] var2 = Statics.field3415.method4422(34, arg0);
        class272 var3 = new class272();
        if (var2 != null) {
            var3.method4775(new class190(var2));
        }
        var3.method4787();
        field3416.method3878(var3, (long) arg0);
        return var3;
    }

    @ObfuscatedName("jq.s(I)V")
    public void method4787() {
    }

    @ObfuscatedName("jq.g(Lgx;B)V")
    public void method4775(class190 arg0) {
        while (true) {
            int var2 = arg0.method3443();
            if (var2 == 0) {
                return;
            }
            this.method4770(arg0, var2);
        }
    }

    @ObfuscatedName("jq.x(Lgx;II)V")
    public void method4770(class190 arg0, int arg1) {
        if (arg1 == 249) {
            this.field3417 = class269.method5420(arg0, this.field3417);
        }
    }

    @ObfuscatedName("jq.h(III)I")
    public int method4768(int arg0, int arg1) {
        class205 var3 = this.field3417;
        int var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class219 var5 = (class219) var3.method3851((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = var5.field2527;
            }
        }
        return var4;
    }

    @ObfuscatedName("jq.f(ILjava/lang/String;S)Ljava/lang/String;")
    public String method4772(int arg0, String arg1) {
        class205 var3 = this.field3417;
        String var4;
        if (var3 == null) {
            var4 = arg1;
        } else {
            class203 var5 = (class203) var3.method3851((long) arg0);
            if (var5 == null) {
                var4 = arg1;
            } else {
                var4 = (String) var5.field2483;
            }
        }
        return var4;
    }
}
