package deob;

@ObfuscatedName("ef")
public final class class146 {

    @ObfuscatedName("ef.u")
    public class176 field1950 = new class176();

    @ObfuscatedName("ef.f")
    public int field1951;

    @ObfuscatedName("ef.b")
    public int field1952;

    @ObfuscatedName("ef.g")
    public class316 field1953;

    @ObfuscatedName("ef.z")
    public class266 field1954 = new class266();

    public class146(int arg0) {
        this.field1951 = arg0;
        this.field1952 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1953 = new class316(var2);
    }

    @ObfuscatedName("ef.u(J)Lfn;")
    public class176 method3076(long arg0) {
        class176 var3 = (class176) this.field1953.method5521(arg0);
        if (var3 != null) {
            this.field1954.method4631(var3);
        }
        return var3;
    }

    @ObfuscatedName("ef.f(J)V")
    public void method3085(long arg0) {
        class176 var3 = (class176) this.field1953.method5521(arg0);
        if (var3 != null) {
            var3.method3332();
            var3.method3319();
            this.field1952++;
        }
    }

    @ObfuscatedName("ef.b(Lfn;J)V")
    public void method3078(class176 arg0, long arg1) {
        if (this.field1952 == 0) {
            class176 var4 = this.field1954.method4640();
            var4.method3332();
            var4.method3319();
            if (this.field1950 == var4) {
                class176 var5 = this.field1954.method4640();
                var5.method3332();
                var5.method3319();
            }
        } else {
            this.field1952--;
        }
        this.field1953.method5531(arg0, arg1);
        this.field1954.method4631(arg0);
    }

    @ObfuscatedName("ef.g()V")
    public void method3075() {
        this.field1954.method4632();
        this.field1953.method5525();
        this.field1950 = new class176();
        this.field1952 = this.field1951;
    }
}
