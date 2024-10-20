package deob;

import java.util.Iterator;

@ObfuscatedName("hb")
public class class216 implements Iterable {

    @ObfuscatedName("hb.g")
    public class217 field2657 = new class217();

    @ObfuscatedName("hb.e")
    public class217 field2656;

    public class216() {
        this.field2657.field2659 = this.field2657;
        this.field2657.field2658 = this.field2657;
    }

    @ObfuscatedName("hb.g()V")
    public void method3758() {
        while (this.field2657.field2659 != this.field2657) {
            this.field2657.field2659.method3796();
        }
    }

    @ObfuscatedName("hb.e(Lht;)V")
    public void method3757(class217 arg0) {
        if (arg0.field2658 != null) {
            arg0.method3796();
        }
        arg0.field2658 = this.field2657.field2658;
        arg0.field2659 = this.field2657;
        arg0.field2658.field2659 = arg0;
        arg0.field2659.field2658 = arg0;
    }

    @ObfuscatedName("hb.b(Lht;)V")
    public void method3760(class217 arg0) {
        if (arg0.field2658 != null) {
            arg0.method3796();
        }
        arg0.field2658 = this.field2657;
        arg0.field2659 = this.field2657.field2659;
        arg0.field2658.field2659 = arg0;
        arg0.field2659.field2658 = arg0;
    }

    @ObfuscatedName("hb.z(Lht;Lht;)V")
    public static void method3762(class217 arg0, class217 arg1) {
        if (arg0.field2658 != null) {
            arg0.method3796();
        }
        arg0.field2658 = arg1;
        arg0.field2659 = arg1.field2659;
        arg0.field2658.field2659 = arg0;
        arg0.field2659.field2658 = arg0;
    }

    @ObfuscatedName("hb.n()Lht;")
    public class217 method3776() {
        class217 var1 = this.field2657.field2659;
        if (this.field2657 == var1) {
            return null;
        } else {
            var1.method3796();
            return var1;
        }
    }

    @ObfuscatedName("hb.l()Lht;")
    public class217 method3767() {
        return this.method3764((class217) null);
    }

    @ObfuscatedName("hb.s(Lht;)Lht;")
    public class217 method3764(class217 arg0) {
        class217 var2;
        if (arg0 == null) {
            var2 = this.field2657.field2659;
        } else {
            var2 = arg0;
        }
        if (this.field2657 == var2) {
            this.field2656 = null;
            return null;
        } else {
            this.field2656 = var2.field2659;
            return var2;
        }
    }

    @ObfuscatedName("hb.y()Lht;")
    public class217 method3765() {
        class217 var1 = this.field2656;
        if (this.field2657 == var1) {
            this.field2656 = null;
            return null;
        } else {
            this.field2656 = var1.field2659;
            return var1;
        }
    }

    @ObfuscatedName("hb.c()Z")
    public boolean method3778() {
        return this.field2657.field2659 == this.field2657;
    }

    public Iterator iterator() {
        return new class212(this);
    }
}
