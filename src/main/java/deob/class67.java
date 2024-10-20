package deob;

@ObfuscatedName("fa")
public final class class67 {

    @ObfuscatedName("fa.o")
    public int field626;

    @ObfuscatedName("fa.j")
    public class77 field628 = new class77();

    @ObfuscatedName("fa.h")
    public class1 field624 = new class1();

    @ObfuscatedName("fa.t")
    public class2 field627;

    @ObfuscatedName("fa.p")
    public int field625;

    @ObfuscatedName("fa.o(Lfc;J)V")
    public void method907(class77 arg0, long arg1) {
        if (this.field626 == 0) {
            class77 var4 = this.field624.method17();
            var4.method44();
            var4.method1049();
            if (this.field628 == var4) {
                class77 var5 = this.field624.method17();
                var5.method44();
                var5.method1049();
            }
        } else {
            this.field626--;
        }
        this.field627.method22(arg0, arg1);
        this.field624.method9(arg0);
    }

    @ObfuscatedName("fa.j(J)Lfc;")
    public class77 method908(long arg0) {
        class77 var3 = (class77) this.field627.method20(arg0);
        if (var3 != null) {
            this.field624.method9(var3);
        }
        return var3;
    }

    @ObfuscatedName("fa.p(J)V")
    public void method909(long arg0) {
        class77 var3 = (class77) this.field627.method20(arg0);
        if (var3 != null) {
            var3.method44();
            var3.method1049();
            this.field626++;
        }
    }

    @ObfuscatedName("fa.t()V")
    public void method910() {
        this.field624.method5();
        this.field627.method21();
        this.field628 = new class77();
        this.field626 = this.field625;
    }

    public class67(int arg0) {
        this.field625 = arg0;
        this.field626 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field627 = new class2(var2);
    }
}
