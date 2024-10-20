package deob;

import java.util.Iterator;

@ObfuscatedName("gp")
public class class192 implements Iterable {

    @ObfuscatedName("gp.d")
    public class193 field2484 = new class193();

    @ObfuscatedName("gp.k")
    public class193 field2483;

    public class192() {
        this.field2484.field2485 = this.field2484;
        this.field2484.field2487 = this.field2484;
    }

    @ObfuscatedName("gp.d(Lgs;)V")
    public void method3369(class193 arg0) {
        if (arg0.field2487 != null) {
            arg0.method3407();
        }
        arg0.field2487 = this.field2484.field2487;
        arg0.field2485 = this.field2484;
        arg0.field2487.field2485 = arg0;
        arg0.field2485.field2487 = arg0;
    }

    @ObfuscatedName("gp.k(Lgs;)V")
    public void method3370(class193 arg0) {
        if (arg0.field2487 != null) {
            arg0.method3407();
        }
        arg0.field2487 = this.field2484;
        arg0.field2485 = this.field2484.field2485;
        arg0.field2487.field2485 = arg0;
        arg0.field2485.field2487 = arg0;
    }

    @ObfuscatedName("gp.e(Lgs;Lgs;)V")
    public static void method3371(class193 arg0, class193 arg1) {
        if (arg0.field2487 != null) {
            arg0.method3407();
        }
        arg0.field2487 = arg1;
        arg0.field2485 = arg1.field2485;
        arg0.field2487.field2485 = arg0;
        arg0.field2485.field2487 = arg0;
    }

    @ObfuscatedName("gp.p()Lgs;")
    public class193 method3372() {
        class193 var1 = this.field2484.field2485;
        if (this.field2484 == var1) {
            return null;
        } else {
            var1.method3407();
            return var1;
        }
    }

    @ObfuscatedName("gp.q()Lgs;")
    public class193 method3373() {
        return this.method3387((class193) null);
    }

    @ObfuscatedName("gp.s(Lgs;)Lgs;")
    public class193 method3387(class193 arg0) {
        class193 var2;
        if (arg0 == null) {
            var2 = this.field2484.field2485;
        } else {
            var2 = arg0;
        }
        if (this.field2484 == var2) {
            this.field2483 = null;
            return null;
        } else {
            this.field2483 = var2.field2485;
            return var2;
        }
    }

    @ObfuscatedName("gp.r()Lgs;")
    public class193 method3374() {
        class193 var1 = this.field2483;
        if (this.field2484 == var1) {
            this.field2483 = null;
            return null;
        } else {
            this.field2483 = var1.field2485;
            return var1;
        }
    }

    @ObfuscatedName("gp.g()Z")
    public boolean method3376() {
        return this.field2484.field2485 == this.field2484;
    }

    public Iterator iterator() {
        return new class189(this);
    }
}
