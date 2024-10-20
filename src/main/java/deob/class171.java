package deob;

@ObfuscatedName("fo")
public class class171 {

    @ObfuscatedName("fo.j")
    public class176 field2744 = new class176();

    @ObfuscatedName("fo.y")
    public class176 field2745;

    public class171() {
        this.field2744.field2756 = this.field2744;
        this.field2744.field2757 = this.field2744;
    }

    @ObfuscatedName("fo.j(Lfu;)V")
    public void method3208(class176 arg0) {
        if (arg0.field2757 != null) {
            arg0.method3286();
        }
        arg0.field2757 = this.field2744.field2757;
        arg0.field2756 = this.field2744;
        arg0.field2757.field2756 = arg0;
        arg0.field2756.field2757 = arg0;
    }

    @ObfuscatedName("fo.y()Lfu;")
    public class176 method3209() {
        class176 var1 = this.field2744.field2756;
        if (this.field2744 == var1) {
            this.field2745 = null;
            return null;
        } else {
            this.field2745 = var1.field2756;
            return var1;
        }
    }

    @ObfuscatedName("fo.x()Lfu;")
    public class176 method3210() {
        class176 var1 = this.field2745;
        if (this.field2744 == var1) {
            this.field2745 = null;
            return null;
        } else {
            this.field2745 = var1.field2756;
            return var1;
        }
    }
}
