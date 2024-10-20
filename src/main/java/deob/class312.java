package deob;

@ObfuscatedName("lm")
public final class class312 {

    @ObfuscatedName("lm.ak")
    public class500 field3264 = new class500();

    @ObfuscatedName("lm.al")
    public int field3262;

    @ObfuscatedName("lm.aj")
    public int field3265;

    @ObfuscatedName("lm.az")
    public class519 field3263;

    @ObfuscatedName("lm.af")
    public class411 field3261 = new class411();

    public class312(int arg0) {
        this.field3262 = arg0;
        this.field3265 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3263 = new class519(var2);
    }

    @ObfuscatedName("lm.ak(J)Ltm;")
    public class500 method5570(long arg0) {
        class500 var3 = (class500) this.field3263.method8506(arg0);
        if (var3 != null) {
            this.field3261.method6984(var3);
        }
        return var3;
    }

    @ObfuscatedName("lm.al(J)V")
    public void method5556(long arg0) {
        class500 var3 = (class500) this.field3263.method8506(arg0);
        if (var3 != null) {
            var3.method8189();
            var3.method8183();
            this.field3265++;
        }
    }

    @ObfuscatedName("lm.aj(Ltm;J)V")
    public void method5564(class500 arg0, long arg1) {
        if (this.field3265 == 0) {
            class500 var4 = this.field3261.method6996();
            var4.method8189();
            var4.method8183();
            if (this.field3264 == var4) {
                class500 var5 = this.field3261.method6996();
                var5.method8189();
                var5.method8183();
            }
        } else {
            this.field3265--;
        }
        this.field3263.method8513(arg0, arg1);
        this.field3261.method6984(arg0);
    }

    @ObfuscatedName("lm.az()V")
    public void method5572() {
        this.field3261.method6983();
        this.field3263.method8508();
        this.field3264 = new class500();
        this.field3265 = this.field3262;
    }
}
