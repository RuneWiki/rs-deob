package deob;

import java.util.Iterator;

@ObfuscatedName("go")
public class class193 implements Iterable {

    @ObfuscatedName("go.j")
    public class194 field2466 = new class194();

    @ObfuscatedName("go.h")
    public class194 field2467;

    public class193() {
        this.field2466.field2470 = this.field2466;
        this.field2466.field2468 = this.field2466;
    }

    @ObfuscatedName("go.j(Lga;)V")
    public void method3286(class194 arg0) {
        if (arg0.field2468 != null) {
            arg0.method3314();
        }
        arg0.field2468 = this.field2466.field2468;
        arg0.field2470 = this.field2466;
        arg0.field2468.field2470 = arg0;
        arg0.field2470.field2468 = arg0;
    }

    @ObfuscatedName("go.h(Lga;)V")
    public void method3287(class194 arg0) {
        if (arg0.field2468 != null) {
            arg0.method3314();
        }
        arg0.field2468 = this.field2466;
        arg0.field2470 = this.field2466.field2470;
        arg0.field2468.field2470 = arg0;
        arg0.field2470.field2468 = arg0;
    }

    @ObfuscatedName("go.f(Lga;Lga;)V")
    public static void method3297(class194 arg0, class194 arg1) {
        if (arg0.field2468 != null) {
            arg0.method3314();
        }
        arg0.field2468 = arg1;
        arg0.field2470 = arg1.field2470;
        arg0.field2468.field2470 = arg0;
        arg0.field2470.field2468 = arg0;
    }

    @ObfuscatedName("go.p()Lga;")
    public class194 method3289() {
        class194 var1 = this.field2466.field2470;
        if (this.field2466 == var1) {
            return null;
        } else {
            var1.method3314();
            return var1;
        }
    }

    @ObfuscatedName("go.x()Lga;")
    public class194 method3290() {
        return this.method3295((class194) null);
    }

    @ObfuscatedName("go.g(Lga;)Lga;")
    public class194 method3295(class194 arg0) {
        class194 var2;
        if (arg0 == null) {
            var2 = this.field2466.field2470;
        } else {
            var2 = arg0;
        }
        if (this.field2466 == var2) {
            this.field2467 = null;
            return null;
        } else {
            this.field2467 = var2.field2470;
            return var2;
        }
    }

    @ObfuscatedName("go.c()Lga;")
    public class194 method3307() {
        class194 var1 = this.field2467;
        if (this.field2466 == var1) {
            this.field2467 = null;
            return null;
        } else {
            this.field2467 = var1.field2470;
            return var1;
        }
    }

    @ObfuscatedName("go.l()Z")
    public boolean method3285() {
        return this.field2466.field2470 == this.field2466;
    }

    public Iterator iterator() {
        return new class190(this);
    }
}
