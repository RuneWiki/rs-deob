package deob;

@ObfuscatedName("fe")
public class class165 extends class185 {

    @ObfuscatedName("fe.f")
    public final int field1954;

    @ObfuscatedName("fe.e")
    public final class168 field1951;

    @ObfuscatedName("fe.v")
    public int field1952;

    @ObfuscatedName("fe.y")
    public class180 field1953;

    @ObfuscatedName("fe.j")
    public int field1955;

    @ObfuscatedName("fe.o")
    public int field1950;

    public class165(class244 arg0, class244 arg1, int arg2, class168 arg3) {
        super(arg0, arg1);
        this.field1954 = arg2;
        this.field1951 = arg3;
        this.method2966();
    }

    @ObfuscatedName("fe.f(I)V")
    public void method2966() {
        this.field1952 = class155.method1864(this.field1954).method2712().field1788;
        this.field1953 = this.field1951.method3128(class140.method4496(this.field1952));
        class140 var1 = class140.method4496(this.method2967());
        class397 var2 = var1.method2433(false);
        if (var2 == null) {
            this.field1955 = 0;
            this.field1950 = 0;
        } else {
            this.field1955 = var2.field4262;
            this.field1950 = var2.field4254;
        }
    }

    @ObfuscatedName("fe.e(I)I")
    public int method2967() {
        return this.field1952;
    }

    @ObfuscatedName("fe.v(I)Lfd;")
    public class180 method2978() {
        return this.field1953;
    }

    @ObfuscatedName("fe.y(B)I")
    public int method2969() {
        return this.field1955;
    }

    @ObfuscatedName("fe.j(I)I")
    public int method2972() {
        return this.field1950;
    }
}
