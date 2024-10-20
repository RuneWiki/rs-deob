package deob;

import java.util.Iterator;

@ObfuscatedName("mq")
public class class354 implements Iterable {

    @ObfuscatedName("mq.a")
    public class425 field4287 = new class425();

    @ObfuscatedName("mq.f")
    public class425 field4288;

    public class354() {
        this.field4287.field4629 = this.field4287;
        this.field4287.field4630 = this.field4287;
    }

    @ObfuscatedName("mq.a()V")
    public void method6178() {
        while (this.field4287.field4629 != this.field4287) {
            this.field4287.field4629.method7169();
        }
    }

    @ObfuscatedName("mq.f(Lpu;)V")
    public void method6180(class425 arg0) {
        if (arg0.field4630 != null) {
            arg0.method7169();
        }
        arg0.field4630 = this.field4287.field4630;
        arg0.field4629 = this.field4287;
        arg0.field4630.field4629 = arg0;
        arg0.field4629.field4630 = arg0;
    }

    @ObfuscatedName("mq.c(Lpu;Lpu;)V")
    public static void method6168(class425 arg0, class425 arg1) {
        if (arg0.field4630 != null) {
            arg0.method7169();
        }
        arg0.field4630 = arg1;
        arg0.field4629 = arg1.field4629;
        arg0.field4630.field4629 = arg0;
        arg0.field4629.field4630 = arg0;
    }

    @ObfuscatedName("mq.x()Lpu;")
    public class425 method6169() {
        class425 var1 = this.field4287.field4629;
        if (this.field4287 == var1) {
            return null;
        } else {
            var1.method7169();
            return var1;
        }
    }

    @ObfuscatedName("mq.h()Lpu;")
    public class425 method6170() {
        return this.method6173((class425) null);
    }

    @ObfuscatedName("mq.j(Lpu;)Lpu;")
    public class425 method6173(class425 arg0) {
        class425 var2;
        if (arg0 == null) {
            var2 = this.field4287.field4629;
        } else {
            var2 = arg0;
        }
        if (this.field4287 == var2) {
            this.field4288 = null;
            return null;
        } else {
            this.field4288 = var2.field4629;
            return var2;
        }
    }

    @ObfuscatedName("mq.y()Lpu;")
    public class425 method6172() {
        class425 var1 = this.field4288;
        if (this.field4287 == var1) {
            this.field4288 = null;
            return null;
        } else {
            this.field4288 = var1.field4629;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class353(this);
    }
}
