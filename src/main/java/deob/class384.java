package deob;

import java.util.Iterator;

@ObfuscatedName("oz")
public class class384 implements Iterable {

    @ObfuscatedName("oz.aw")
    public class470 field4426 = new class470();

    @ObfuscatedName("oz.ay")
    public class470 field4425;

    public class384() {
        this.field4426.field4813 = this.field4426;
        this.field4426.field4812 = this.field4426;
    }

    @ObfuscatedName("oz.aw()V")
    public void method6511() {
        while (this.field4426.field4813 != this.field4426) {
            this.field4426.field4813.method7660();
        }
    }

    @ObfuscatedName("oz.ay(Lsh;)V")
    public void method6512(class470 arg0) {
        if (arg0.field4812 != null) {
            arg0.method7660();
        }
        arg0.field4812 = this.field4426.field4812;
        arg0.field4813 = this.field4426;
        arg0.field4812.field4813 = arg0;
        arg0.field4813.field4812 = arg0;
    }

    @ObfuscatedName("oz.ar(Lsh;Lsh;)V")
    public static void method6519(class470 arg0, class470 arg1) {
        if (arg0.field4812 != null) {
            arg0.method7660();
        }
        arg0.field4812 = arg1;
        arg0.field4813 = arg1.field4813;
        arg0.field4812.field4813 = arg0;
        arg0.field4813.field4812 = arg0;
    }

    @ObfuscatedName("oz.am()Lsh;")
    public class470 method6521() {
        class470 var1 = this.field4426.field4813;
        if (this.field4426 == var1) {
            return null;
        } else {
            var1.method7660();
            return var1;
        }
    }

    @ObfuscatedName("oz.as()Lsh;")
    public class470 method6514() {
        return this.method6515((class470) null);
    }

    @ObfuscatedName("oz.aj(Lsh;)Lsh;")
    public class470 method6515(class470 arg0) {
        class470 var2;
        if (arg0 == null) {
            var2 = this.field4426.field4813;
        } else {
            var2 = arg0;
        }
        if (this.field4426 == var2) {
            this.field4425 = null;
            return null;
        } else {
            this.field4425 = var2.field4813;
            return var2;
        }
    }

    @ObfuscatedName("oz.ag()Lsh;")
    public class470 method6516() {
        class470 var1 = this.field4425;
        if (this.field4426 == var1) {
            this.field4425 = null;
            return null;
        } else {
            this.field4425 = var1.field4813;
            return var1;
        }
    }

    public Iterator iterator() {
        return new class383(this);
    }
}
