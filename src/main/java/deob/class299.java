package deob;

@ObfuscatedName("ko")
public class class299 {

    @ObfuscatedName("ko.s")
    public class348 field3726 = new class348();

    @ObfuscatedName("ko.t")
    public class348 field3725;

    public class299() {
        this.field3726.field3957 = this.field3726;
        this.field3726.field3956 = this.field3726;
    }

    @ObfuscatedName("ko.s(Lmf;)V")
    public void method4828(class348 arg0) {
        if (arg0.field3956 != null) {
            arg0.method5442();
        }
        arg0.field3956 = this.field3726.field3956;
        arg0.field3957 = this.field3726;
        arg0.field3956.field3957 = arg0;
        arg0.field3957.field3956 = arg0;
    }

    @ObfuscatedName("ko.t()Lmf;")
    public class348 method4830() {
        class348 var1 = this.field3726.field3957;
        if (this.field3726 == var1) {
            this.field3725 = null;
            return null;
        } else {
            this.field3725 = var1.field3957;
            return var1;
        }
    }

    @ObfuscatedName("ko.v()Lmf;")
    public class348 method4831() {
        class348 var1 = this.field3725;
        if (this.field3726 == var1) {
            this.field3725 = null;
            return null;
        } else {
            this.field3725 = var1.field3957;
            return var1;
        }
    }
}
