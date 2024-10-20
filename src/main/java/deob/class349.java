package deob;

@ObfuscatedName("me")
public class class349 {

    @ObfuscatedName("me.a")
    public class430 field4276 = new class430();

    @ObfuscatedName("me.f")
    public class430 field4275;

    public class349() {
        this.field4276.field4636 = this.field4276;
        this.field4276.field4637 = this.field4276;
    }

    @ObfuscatedName("me.a()V")
    public void method6030() {
        while (true) {
            class430 var1 = this.field4276.field4636;
            if (this.field4276 == var1) {
                this.field4275 = null;
                return;
            }
            var1.method7170();
        }
    }

    @ObfuscatedName("me.f(Lpk;)V")
    public void method6031(class430 arg0) {
        if (arg0.field4637 != null) {
            arg0.method7170();
        }
        arg0.field4637 = this.field4276.field4637;
        arg0.field4636 = this.field4276;
        arg0.field4637.field4636 = arg0;
        arg0.field4636.field4637 = arg0;
    }

    @ObfuscatedName("me.c(Lpk;)V")
    public void method6029(class430 arg0) {
        if (arg0.field4637 != null) {
            arg0.method7170();
        }
        arg0.field4637 = this.field4276;
        arg0.field4636 = this.field4276.field4636;
        arg0.field4637.field4636 = arg0;
        arg0.field4636.field4637 = arg0;
    }

    @ObfuscatedName("me.x(Lpk;Lpk;)V")
    public static void method6037(class430 arg0, class430 arg1) {
        if (arg0.field4637 != null) {
            arg0.method7170();
        }
        arg0.field4637 = arg1.field4637;
        arg0.field4636 = arg1;
        arg0.field4637.field4636 = arg0;
        arg0.field4636.field4637 = arg0;
    }

    @ObfuscatedName("me.h()Lpk;")
    public class430 method6051() {
        class430 var1 = this.field4276.field4636;
        if (this.field4276 == var1) {
            return null;
        } else {
            var1.method7170();
            return var1;
        }
    }

    @ObfuscatedName("me.j()Lpk;")
    public class430 method6035() {
        class430 var1 = this.field4276.field4637;
        if (this.field4276 == var1) {
            return null;
        } else {
            var1.method7170();
            return var1;
        }
    }

    @ObfuscatedName("me.y()Lpk;")
    public class430 method6040() {
        class430 var1 = this.field4276.field4636;
        if (this.field4276 == var1) {
            this.field4275 = null;
            return null;
        } else {
            this.field4275 = var1.field4636;
            return var1;
        }
    }

    @ObfuscatedName("me.d()Lpk;")
    public class430 method6039() {
        class430 var1 = this.field4276.field4637;
        if (this.field4276 == var1) {
            this.field4275 = null;
            return null;
        } else {
            this.field4275 = var1.field4637;
            return var1;
        }
    }

    @ObfuscatedName("me.n()Lpk;")
    public class430 method6034() {
        class430 var1 = this.field4275;
        if (this.field4276 == var1) {
            this.field4275 = null;
            return null;
        } else {
            this.field4275 = var1.field4636;
            return var1;
        }
    }

    @ObfuscatedName("me.r()Lpk;")
    public class430 method6054() {
        class430 var1 = this.field4275;
        if (this.field4276 == var1) {
            this.field4275 = null;
            return null;
        } else {
            this.field4275 = var1.field4637;
            return var1;
        }
    }
}
