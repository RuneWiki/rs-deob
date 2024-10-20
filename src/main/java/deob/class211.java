package deob;

import java.util.Iterator;

@ObfuscatedName("hj")
public class class211 implements Iterable {

    @ObfuscatedName("hj.a")
    public class212 field2508 = new class212();

    @ObfuscatedName("hj.s")
    public class212 field2509;

    public class211() {
        this.field2508.field2511 = this.field2508;
        this.field2508.field2510 = this.field2508;
    }

    @ObfuscatedName("hj.a()V")
    public void method3931() {
        while (this.field2508.field2511 != this.field2508) {
            this.field2508.field2511.method3960();
        }
    }

    @ObfuscatedName("hj.s(Lhy;)V")
    public void method3932(class212 arg0) {
        if (arg0.field2510 != null) {
            arg0.method3960();
        }
        arg0.field2510 = this.field2508.field2510;
        arg0.field2511 = this.field2508;
        arg0.field2510.field2511 = arg0;
        arg0.field2511.field2510 = arg0;
    }

    @ObfuscatedName("hj.g(Lhy;)V")
    public void method3930(class212 arg0) {
        if (arg0.field2510 != null) {
            arg0.method3960();
        }
        arg0.field2510 = this.field2508;
        arg0.field2511 = this.field2508.field2511;
        arg0.field2510.field2511 = arg0;
        arg0.field2511.field2510 = arg0;
    }

    @ObfuscatedName("hj.x(Lhy;Lhy;)V")
    public static void method3934(class212 arg0, class212 arg1) {
        if (arg0.field2510 != null) {
            arg0.method3960();
        }
        arg0.field2510 = arg1;
        arg0.field2511 = arg1.field2511;
        arg0.field2510.field2511 = arg0;
        arg0.field2511.field2510 = arg0;
    }

    @ObfuscatedName("hj.h()Lhy;")
    public class212 method3936() {
        return this.method3959((class212) null);
    }

    @ObfuscatedName("hj.f(Lhy;)Lhy;")
    public class212 method3959(class212 arg0) {
        class212 var2;
        if (arg0 == null) {
            var2 = this.field2508.field2511;
        } else {
            var2 = arg0;
        }
        if (this.field2508 == var2) {
            this.field2509 = null;
            return null;
        } else {
            this.field2509 = var2.field2511;
            return var2;
        }
    }

    @ObfuscatedName("hj.p()Lhy;")
    public class212 method3937() {
        class212 var1 = this.field2509;
        if (this.field2508 == var1) {
            this.field2509 = null;
            return null;
        } else {
            this.field2509 = var1.field2511;
            return var1;
        }
    }

    @ObfuscatedName("hj.m()Z")
    public boolean method3938() {
        return this.field2508.field2511 == this.field2508;
    }

    public Iterator iterator() {
        return new class207(this);
    }
}
