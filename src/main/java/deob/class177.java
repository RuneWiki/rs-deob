package deob;

@ObfuscatedName("fr")
public class class177 {

    @ObfuscatedName("fr.t")
    public class186 field2848 = new class186();

    @ObfuscatedName("fr.o")
    public class186 field2849;

    public class177() {
        this.field2848.field2864 = this.field2848;
        this.field2848.field2865 = this.field2848;
    }

    @ObfuscatedName("fr.t()V")
    public void method3174() {
        while (true) {
            class186 var1 = this.field2848.field2864;
            if (this.field2848 == var1) {
                this.field2849 = null;
                return;
            }
            var1.method3261();
        }
    }

    @ObfuscatedName("fr.o(Lgh;)V")
    public void method3166(class186 arg0) {
        if (arg0.field2865 != null) {
            arg0.method3261();
        }
        arg0.field2865 = this.field2848.field2865;
        arg0.field2864 = this.field2848;
        arg0.field2865.field2864 = arg0;
        arg0.field2864.field2865 = arg0;
    }

    @ObfuscatedName("fr.i(Lgh;)V")
    public void method3167(class186 arg0) {
        if (arg0.field2865 != null) {
            arg0.method3261();
        }
        arg0.field2865 = this.field2848;
        arg0.field2864 = this.field2848.field2864;
        arg0.field2865.field2864 = arg0;
        arg0.field2864.field2865 = arg0;
    }

    @ObfuscatedName("fr.p(Lgh;Lgh;)V")
    public static void method3168(class186 arg0, class186 arg1) {
        if (arg0.field2865 != null) {
            arg0.method3261();
        }
        arg0.field2865 = arg1.field2865;
        arg0.field2864 = arg1;
        arg0.field2865.field2864 = arg0;
        arg0.field2864.field2865 = arg0;
    }

    @ObfuscatedName("fr.c()Lgh;")
    public class186 method3173() {
        class186 var1 = this.field2848.field2864;
        if (this.field2848 == var1) {
            return null;
        } else {
            var1.method3261();
            return var1;
        }
    }

    @ObfuscatedName("fr.y()Lgh;")
    public class186 method3169() {
        class186 var1 = this.field2848.field2865;
        if (this.field2848 == var1) {
            return null;
        } else {
            var1.method3261();
            return var1;
        }
    }

    @ObfuscatedName("fr.g()Lgh;")
    public class186 method3170() {
        class186 var1 = this.field2848.field2864;
        if (this.field2848 == var1) {
            this.field2849 = null;
            return null;
        } else {
            this.field2849 = var1.field2864;
            return var1;
        }
    }

    @ObfuscatedName("fr.l()Lgh;")
    public class186 method3171() {
        class186 var1 = this.field2848.field2865;
        if (this.field2848 == var1) {
            this.field2849 = null;
            return null;
        } else {
            this.field2849 = var1.field2865;
            return var1;
        }
    }

    @ObfuscatedName("fr.h()Lgh;")
    public class186 method3172() {
        class186 var1 = this.field2849;
        if (this.field2848 == var1) {
            this.field2849 = null;
            return null;
        } else {
            this.field2849 = var1.field2864;
            return var1;
        }
    }

    @ObfuscatedName("fr.n()Lgh;")
    public class186 method3177() {
        class186 var1 = this.field2849;
        if (this.field2848 == var1) {
            this.field2849 = null;
            return null;
        } else {
            this.field2849 = var1.field2865;
            return var1;
        }
    }
}
