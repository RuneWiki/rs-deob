package deob;

@ObfuscatedName("jf")
public class class247 extends class267 {

    @ObfuscatedName("jf.af")
    public final int field2874;

    @ObfuscatedName("jf.an")
    public final class250 field2871;

    @ObfuscatedName("jf.aw")
    public int field2872;

    @ObfuscatedName("jf.ac")
    public class262 field2870;

    @ObfuscatedName("jf.au")
    public int field2876;

    @ObfuscatedName("jf.ab")
    public int field2875;

    public class247(class308 arg0, class308 arg1, int arg2, class250 arg3) {
        super(arg0, arg1);
        this.field2874 = arg2;
        this.field2871 = arg3;
        this.method4649();
    }

    @ObfuscatedName("jf.af(I)V")
    public void method4649() {
        this.field2872 = Statics.method3057(this.field2874).method3669().field2182;
        this.field2870 = this.field2871.method4788(class183.method6285(this.field2872));
        class183 var1 = class183.method6285(this.method4662());
        class503 var2 = var1.method3350(false);
        if (var2 == null) {
            this.field2876 = 0;
            this.field2875 = 0;
        } else {
            this.field2876 = var2.field5088;
            this.field2875 = var2.field5093;
        }
    }

    @ObfuscatedName("jf.an(I)I")
    public int method4662() {
        return this.field2872;
    }

    @ObfuscatedName("jf.aw(I)Lku;")
    public class262 method4651() {
        return this.field2870;
    }

    @ObfuscatedName("jf.ac(I)I")
    public int method4654() {
        return this.field2876;
    }

    @ObfuscatedName("jf.au(I)I")
    public int method4650() {
        return this.field2875;
    }
}
