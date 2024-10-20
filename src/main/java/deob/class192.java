package deob;

import java.util.Iterator;

@ObfuscatedName("gg")
public class class192 implements Iterable {

    @ObfuscatedName("gg.c")
    public class193 field2436 = new class193();

    @ObfuscatedName("gg.o")
    public class193 field2435;

    public class192() {
        this.field2436.field2438 = this.field2436;
        this.field2436.field2439 = this.field2436;
    }

    @ObfuscatedName("gg.c(Lgh;)V")
    public void method3258(class193 arg0) {
        if (arg0.field2439 != null) {
            arg0.method3287();
        }
        arg0.field2439 = this.field2436.field2439;
        arg0.field2438 = this.field2436;
        arg0.field2439.field2438 = arg0;
        arg0.field2438.field2439 = arg0;
    }

    @ObfuscatedName("gg.o(Lgh;)V")
    public void method3272(class193 arg0) {
        if (arg0.field2439 != null) {
            arg0.method3287();
        }
        arg0.field2439 = this.field2436;
        arg0.field2438 = this.field2436.field2438;
        arg0.field2439.field2438 = arg0;
        arg0.field2438.field2439 = arg0;
    }

    @ObfuscatedName("gg.i(Lgh;Lgh;)V")
    public static void method3260(class193 arg0, class193 arg1) {
        if (arg0.field2439 != null) {
            arg0.method3287();
        }
        arg0.field2439 = arg1;
        arg0.field2438 = arg1.field2438;
        arg0.field2439.field2438 = arg0;
        arg0.field2438.field2439 = arg0;
    }

    @ObfuscatedName("gg.u()Lgh;")
    public class193 method3261() {
        class193 var1 = this.field2436.field2438;
        if (this.field2436 == var1) {
            return null;
        } else {
            var1.method3287();
            return var1;
        }
    }

    @ObfuscatedName("gg.g()Lgh;")
    public class193 method3262() {
        return this.method3263((class193) null);
    }

    @ObfuscatedName("gg.m(Lgh;)Lgh;")
    public class193 method3263(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2436.field2438;
        } else {
            var2 = arg0;
        }
        if (this.field2436 == var2) {
            this.field2435 = null;
            return null;
        } else {
            this.field2435 = var2.field2438;
            return var2;
        }
    }

    @ObfuscatedName("gg.s()Lgh;")
    public class193 method3276() {
        class193 var1 = this.field2435;
        if (this.field2436 == var1) {
            this.field2435 = null;
            return null;
        } else {
            this.field2435 = var1.field2438;
            return var1;
        }
    }

    @ObfuscatedName("gg.x()Z")
    public boolean method3265() {
        return this.field2436.field2438 == this.field2436;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
