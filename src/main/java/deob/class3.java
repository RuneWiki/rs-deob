package deob;

@ObfuscatedName("u")
public class class3 {

    @ObfuscatedName("u.f")
    public long field25;

    @ObfuscatedName("u.o")
    public int field18 = -1;

    @ObfuscatedName("u.u")
    public class274 field23 = new class274();

    public class3(class382 arg0) {
        this.method19(arg0);
    }

    @ObfuscatedName("u.f(Lnu;I)V")
    public void method19(class382 arg0) {
        this.field25 = arg0.method6069();
        this.field18 = arg0.method5861();
        for (int var2 = arg0.method5856(); var2 != 0; var2 = arg0.method5856()) {
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
            this.field23.method4209(var3);
        }
    }

    @ObfuscatedName("u.o(Lm;I)V")
    public void method20(class12 arg0) {
        if (this.field25 != arg0.field80 || this.field18 != arg0.field81) {
            throw new RuntimeException("");
        }
        for (class15 var2 = (class15) this.field23.method4212(); var2 != null; var2 = (class15) this.field23.method4213()) {
            var2.method10(arg0);
        }
        arg0.field81++;
    }
}
