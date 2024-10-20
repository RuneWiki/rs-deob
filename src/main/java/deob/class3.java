package deob;

@ObfuscatedName("f")
public class class3 {

    @ObfuscatedName("f.v")
    public long field22;

    @ObfuscatedName("f.n")
    public int field14 = -1;

    @ObfuscatedName("f.f")
    public class296 field15 = new class296();

    public class3(class383 arg0) {
        this.method15(arg0);
    }

    @ObfuscatedName("f.v(Lnd;I)V")
    public void method15(class383 arg0) {
        this.field22 = arg0.method5971();
        this.field14 = arg0.method5970();
        for (int var2 = arg0.method5965(); var2 != 0; var2 = arg0.method5965()) {
            class15 var3;
            if (var2 == 3) {
                var3 = new class14(this);
            } else if (var2 == 1) {
                var3 = new class9(this);
            } else if (var2 == 13) {
                var3 = new class27(this);
            } else if (var2 == 4) {
                var3 = new class18(this);
            } else if (var2 == 6) {
                var3 = new class11(this);
            } else if (var2 == 5) {
                var3 = new class23(this);
            } else if (var2 == 2) {
                var3 = new class24(this);
            } else if (var2 == 7) {
                var3 = new class22(this);
            } else if (var2 == 14) {
                var3 = new class19(this);
            } else if (var2 == 8) {
                var3 = new class7(this);
            } else if (var2 == 9) {
                var3 = new class1(this);
            } else if (var2 == 10) {
                var3 = new class5(this);
            } else if (var2 == 11) {
                var3 = new class2(this);
            } else if (var2 == 12) {
                var3 = new class16(this);
            } else if (var2 == 15) {
                var3 = new class28(this);
            } else {
                throw new RuntimeException("");
            }
            var3.method2(arg0);
            this.field15.method4764(var3);
        }
    }

    @ObfuscatedName("f.n(Ll;I)V")
    public void method12(class12 arg0) {
        if (this.field22 != arg0.field110 || this.field14 != arg0.field95) {
            throw new RuntimeException("");
        }
        for (class15 var2 = (class15) this.field15.method4767(); var2 != null; var2 = (class15) this.field15.method4769()) {
            var2.method1(arg0);
        }
        arg0.field95++;
    }
}
