package deob;

import java.util.Iterator;

@ObfuscatedName("gj")
public class class206 implements Iterable {

    @ObfuscatedName("gj.f")
    public class207 field2484 = new class207();

    @ObfuscatedName("gj.h")
    public class207 field2483;

    public class206() {
        this.field2484.field2487 = this.field2484;
        this.field2484.field2485 = this.field2484;
    }

    @ObfuscatedName("gj.f()V")
    public void method3784() {
        while (this.field2484.field2487 != this.field2484) {
            this.field2484.field2487.method3812();
        }
    }

    @ObfuscatedName("gj.h(Lgf;)V")
    public void method3795(class207 arg0) {
        if (arg0.field2485 != null) {
            arg0.method3812();
        }
        arg0.field2485 = this.field2484.field2485;
        arg0.field2487 = this.field2484;
        arg0.field2485.field2487 = arg0;
        arg0.field2487.field2485 = arg0;
    }

    @ObfuscatedName("gj.e(Lgf;)V")
    public void method3777(class207 arg0) {
        if (arg0.field2485 != null) {
            arg0.method3812();
        }
        arg0.field2485 = this.field2484;
        arg0.field2487 = this.field2484.field2487;
        arg0.field2485.field2487 = arg0;
        arg0.field2487.field2485 = arg0;
    }

    @ObfuscatedName("gj.b(Lgf;Lgf;)V")
    public static void method3790(class207 arg0, class207 arg1) {
        if (arg0.field2485 != null) {
            arg0.method3812();
        }
        arg0.field2485 = arg1;
        arg0.field2487 = arg1.field2487;
        arg0.field2485.field2487 = arg0;
        arg0.field2487.field2485 = arg0;
    }

    @ObfuscatedName("gj.l()Lgf;")
    public class207 method3779() {
        return this.method3787((class207) null);
    }

    @ObfuscatedName("gj.w(Lgf;)Lgf;")
    public class207 method3787(class207 arg0) {
        class207 var2;
        if (arg0 == null) {
            var2 = this.field2484.field2487;
        } else {
            var2 = arg0;
        }
        if (this.field2484 == var2) {
            this.field2483 = null;
            return null;
        } else {
            this.field2483 = var2.field2487;
            return var2;
        }
    }

    @ObfuscatedName("gj.d()Lgf;")
    public class207 method3780() {
        class207 var1 = this.field2483;
        if (this.field2484 == var1) {
            this.field2483 = null;
            return null;
        } else {
            this.field2483 = var1.field2487;
            return var1;
        }
    }

    @ObfuscatedName("gj.n()Z")
    public boolean method3781() {
        return this.field2484.field2487 == this.field2484;
    }

    public Iterator iterator() {
        return new class202(this);
    }
}
