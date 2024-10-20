package deob;

@ObfuscatedName("kw")
public class class284 extends class304 {

    @ObfuscatedName("kw.ac")
    public final int field3086;

    @ObfuscatedName("kw.ae")
    public final class287 field3081;

    @ObfuscatedName("kw.ag")
    public int field3083;

    @ObfuscatedName("kw.am")
    public class299 field3084;

    @ObfuscatedName("kw.ax")
    public int field3082;

    @ObfuscatedName("kw.aq")
    public int field3085;

    public class284(class352 arg0, class352 arg1, int arg2, class287 arg3) {
        super(arg0, arg1);
        this.field3086 = arg2;
        this.field3081 = arg3;
        this.method5245();
    }

    @ObfuscatedName("kw.ac(I)V")
    public void method5245() {
        this.field3083 = class210.method5152(this.field3086).method3800().field2199;
        this.field3084 = this.field3081.method5394(class184.method3200(this.field3083));
        class184 var1 = class184.method3200(this.method5246());
        class565 var2 = var1.method3467(false);
        if (var2 == null) {
            this.field3082 = 0;
            this.field3085 = 0;
        } else {
            this.field3082 = var2.field5518;
            this.field3085 = var2.field5511;
        }
    }

    @ObfuscatedName("kw.ae(I)I")
    public int method5246() {
        return this.field3083;
    }

    @ObfuscatedName("kw.ag(B)Lls;")
    public class299 method5247() {
        return this.field3084;
    }

    @ObfuscatedName("kw.am(I)I")
    public int method5248() {
        return this.field3082;
    }

    @ObfuscatedName("kw.ax(I)I")
    public int method5249() {
        return this.field3085;
    }
}
