package deob;

@ObfuscatedName("pq")
public final class class397 {

    @ObfuscatedName("pq.az")
    public class489 field4539 = new class489();

    public class397() {
        this.field4539.field4945 = this.field4539;
        this.field4539.field4946 = this.field4539;
    }

    @ObfuscatedName("pq.az(Lst;)V")
    public void method6570(class489 arg0) {
        if (arg0.field4946 != null) {
            arg0.method7853();
        }
        arg0.field4946 = this.field4539.field4946;
        arg0.field4945 = this.field4539;
        arg0.field4946.field4945 = arg0;
        arg0.field4945.field4946 = arg0;
    }

    @ObfuscatedName("pq.ah(Lst;)V")
    public void method6573(class489 arg0) {
        if (arg0.field4946 != null) {
            arg0.method7853();
        }
        arg0.field4946 = this.field4539;
        arg0.field4945 = this.field4539.field4945;
        arg0.field4946.field4945 = arg0;
        arg0.field4945.field4946 = arg0;
    }

    @ObfuscatedName("pq.af()Lst;")
    public class489 method6571() {
        class489 var1 = this.field4539.field4945;
        return this.field4539 == var1 ? null : var1;
    }
}
