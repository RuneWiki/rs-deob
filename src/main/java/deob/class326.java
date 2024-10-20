package deob;

import java.util.Iterator;

@ObfuscatedName("ls")
public class class326 implements Iterable {

    @ObfuscatedName("ls.c")
    public class382 field3975 = new class382();

    @ObfuscatedName("ls.b")
    public class382 field3974;

    public class326() {
        this.field3975.field4250 = this.field3975;
        this.field3975.field4251 = this.field3975;
    }

    @ObfuscatedName("ls.c()V")
    public void method5421() {
        while (this.field3975.field4250 != this.field3975) {
            this.field3975.field4250.method6159();
        }
    }

    @ObfuscatedName("ls.b(Lnc;)V")
    public void method5441(class382 arg0) {
        if (arg0.field4251 != null) {
            arg0.method6159();
        }
        arg0.field4251 = this.field3975.field4251;
        arg0.field4250 = this.field3975;
        arg0.field4251.field4250 = arg0;
        arg0.field4250.field4251 = arg0;
    }

    @ObfuscatedName("ls.p(Lnc;Lnc;)V")
    public static void method5423(class382 arg0, class382 arg1) {
        if (arg0.field4251 != null) {
            arg0.method6159();
        }
        arg0.field4251 = arg1;
        arg0.field4250 = arg1.field4250;
        arg0.field4251.field4250 = arg0;
        arg0.field4250.field4251 = arg0;
    }

    @ObfuscatedName("ls.m()Lnc;")
    public class382 method5424() {
        class382 var1 = this.field3975.field4250;
        if (this.field3975 == var1) {
            return null;
        } else {
            var1.method6159();
            return var1;
        }
    }

    @ObfuscatedName("ls.t()Lnc;")
    public class382 method5425() {
        return this.method5426((class382) null);
    }

    @ObfuscatedName("ls.s(Lnc;)Lnc;")
    public class382 method5426(class382 arg0) {
        class382 var2;
        if (arg0 == null) {
            var2 = this.field3975.field4250;
        } else {
            var2 = arg0;
        }
        if (this.field3975 == var2) {
            this.field3974 = null;
            return null;
        } else {
            this.field3974 = var2.field4250;
            return var2;
        }
    }

    @ObfuscatedName("ls.j()Lnc;")
    public class382 method5427() {
        class382 var1 = this.field3974;
        if (this.field3975 == var1) {
            this.field3974 = null;
            return null;
        } else {
            this.field3974 = var1.field4250;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class325(this);
    }
}
