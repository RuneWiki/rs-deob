package deob;

@ObfuscatedName("gr")
public class class207 extends class219 {

    @ObfuscatedName("gr.v")
    public final int field2302;

    @ObfuscatedName("gr.c")
    public final class214 field2303;

    @ObfuscatedName("gr.i")
    public final int field2305;

    @ObfuscatedName("gr.f")
    public final int field2304;

    public class207(class290 arg0, class290 arg1, int arg2, class214 arg3) {
        super(arg0, arg1);
        this.field2302 = arg2;
        this.field2303 = arg3;
        class172 var5 = class172.method2469(this.method3567());
        class451 var6 = var5.method3051(false);
        if (var6 == null) {
            this.field2305 = 0;
            this.field2304 = 0;
        } else {
            this.field2305 = var6.field4719;
            this.field2304 = var6.field4710;
        }
    }

    @ObfuscatedName("gr.c(I)I")
    public int method3567() {
        return this.field2302;
    }

    @ObfuscatedName("gr.i(B)Lho;")
    public class214 method3585() {
        return this.field2303;
    }

    @ObfuscatedName("gr.f(I)I")
    public int method3565() {
        return this.field2305;
    }

    @ObfuscatedName("gr.b(I)I")
    public int method3569() {
        return this.field2304;
    }
}
