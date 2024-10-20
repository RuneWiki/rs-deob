package deob;

@ObfuscatedName("fj")
public class class171 {

    @ObfuscatedName("fj.c")
    public class176 field2744 = new class176();

    @ObfuscatedName("fj.j")
    public class176 field2745;

    public class171() {
        this.field2744.field2757 = this.field2744;
        this.field2744.field2756 = this.field2744;
    }

    @ObfuscatedName("fj.c(Lfg;)V")
    public void method3118(class176 arg0) {
        if (arg0.field2756 != null) {
            arg0.method3178();
        }
        arg0.field2756 = this.field2744.field2756;
        arg0.field2757 = this.field2744;
        arg0.field2756.field2757 = arg0;
        arg0.field2757.field2756 = arg0;
    }

    @ObfuscatedName("fj.j()Lfg;")
    public class176 method3119() {
        class176 var1 = this.field2744.field2757;
        if (this.field2744 == var1) {
            this.field2745 = null;
            return null;
        } else {
            this.field2745 = var1.field2757;
            return var1;
        }
    }

    @ObfuscatedName("fj.f()Lfg;")
    public class176 method3120() {
        class176 var1 = this.field2745;
        if (this.field2744 == var1) {
            this.field2745 = null;
            return null;
        } else {
            this.field2745 = var1.field2757;
            return var1;
        }
    }
}
