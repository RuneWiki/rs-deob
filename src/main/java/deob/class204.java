package deob;

import java.util.Iterator;

@ObfuscatedName("gy")
public class class204 implements Iterable {

    @ObfuscatedName("gy.z")
    public class205 field2420 = new class205();

    @ObfuscatedName("gy.w")
    public class205 field2421;

    public class204() {
        this.field2420.field2423 = this.field2420;
        this.field2420.field2424 = this.field2420;
    }

    @ObfuscatedName("gy.z()V")
    public void method3722() {
        while (this.field2420.field2423 != this.field2420) {
            this.field2420.field2423.method3756();
        }
    }

    @ObfuscatedName("gy.w(Lga;)V")
    public void method3723(class205 arg0) {
        if (arg0.field2424 != null) {
            arg0.method3756();
        }
        arg0.field2424 = this.field2420.field2424;
        arg0.field2423 = this.field2420;
        arg0.field2424.field2423 = arg0;
        arg0.field2423.field2424 = arg0;
    }

    @ObfuscatedName("gy.s(Lga;)V")
    public void method3730(class205 arg0) {
        if (arg0.field2424 != null) {
            arg0.method3756();
        }
        arg0.field2424 = this.field2420;
        arg0.field2423 = this.field2420.field2423;
        arg0.field2424.field2423 = arg0;
        arg0.field2423.field2424 = arg0;
    }

    @ObfuscatedName("gy.l(Lga;Lga;)V")
    public static void method3728(class205 arg0, class205 arg1) {
        if (arg0.field2424 != null) {
            arg0.method3756();
        }
        arg0.field2424 = arg1;
        arg0.field2423 = arg1.field2423;
        arg0.field2424.field2423 = arg0;
        arg0.field2423.field2424 = arg0;
    }

    @ObfuscatedName("gy.u()Lga;")
    public class205 method3740() {
        return this.method3726((class205) null);
    }

    @ObfuscatedName("gy.q(Lga;)Lga;")
    public class205 method3726(class205 arg0) {
        class205 var2;
        if (arg0 == null) {
            var2 = this.field2420.field2423;
        } else {
            var2 = arg0;
        }
        if (this.field2420 == var2) {
            this.field2421 = null;
            return null;
        } else {
            this.field2421 = var2.field2423;
            return var2;
        }
    }

    @ObfuscatedName("gy.i()Lga;")
    public class205 method3725() {
        class205 var1 = this.field2421;
        if (this.field2420 == var1) {
            this.field2421 = null;
            return null;
        } else {
            this.field2421 = var1.field2423;
            return var1;
        }
    }

    @ObfuscatedName("gy.x()Z")
    public boolean method3735() {
        return this.field2420.field2423 == this.field2420;
    }

    public Iterator iterator() {
        return new class200(this);
    }
}
