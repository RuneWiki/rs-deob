package deob;

import java.util.Iterator;

@ObfuscatedName("pa")
public class class403 implements Iterable {

    @ObfuscatedName("pa.az")
    public class489 field4552 = new class489();

    @ObfuscatedName("pa.ah")
    public class489 field4553;

    public class403() {
        this.field4552.field4945 = this.field4552;
        this.field4552.field4946 = this.field4552;
    }

    @ObfuscatedName("pa.az()V")
    public void method6741() {
        while (this.field4552.field4945 != this.field4552) {
            this.field4552.field4945.method7853();
        }
    }

    @ObfuscatedName("pa.ah(Lst;)V")
    public void method6759(class489 arg0) {
        if (arg0.field4946 != null) {
            arg0.method7853();
        }
        arg0.field4946 = this.field4552.field4946;
        arg0.field4945 = this.field4552;
        arg0.field4946.field4945 = arg0;
        arg0.field4945.field4946 = arg0;
    }

    @ObfuscatedName("pa.af(Lst;Lst;)V")
    public static void method6740(class489 arg0, class489 arg1) {
        if (arg0.field4946 != null) {
            arg0.method7853();
        }
        arg0.field4946 = arg1;
        arg0.field4945 = arg1.field4945;
        arg0.field4946.field4945 = arg0;
        arg0.field4945.field4946 = arg0;
    }

    @ObfuscatedName("pa.at()Lst;")
    public class489 method6744() {
        class489 var1 = this.field4552.field4945;
        if (this.field4552 == var1) {
            return null;
        } else {
            var1.method7853();
            return var1;
        }
    }

    @ObfuscatedName("pa.an()Lst;")
    public class489 method6745() {
        return this.method6746((class489) null);
    }

    @ObfuscatedName("pa.ao(Lst;)Lst;")
    public class489 method6746(class489 arg0) {
        class489 var2;
        if (arg0 == null) {
            var2 = this.field4552.field4945;
        } else {
            var2 = arg0;
        }
        if (this.field4552 == var2) {
            this.field4553 = null;
            return null;
        } else {
            this.field4553 = var2.field4945;
            return var2;
        }
    }

    @ObfuscatedName("pa.ab()Lst;")
    public class489 method6752() {
        class489 var1 = this.field4553;
        if (this.field4552 == var1) {
            this.field4553 = null;
            return null;
        } else {
            this.field4553 = var1.field4945;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class402(this);
    }
}
